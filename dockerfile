FROM jenkins/jenkins

# Set user root to allow us to install the rest of what's needed
USER root

#==================
# Helper Tools
#==================

RUN apt-get update && apt-get install -y \ 
  apt-transport-https \
  ca-certificates \
  curl \ 
  gnupg2 \
  software-properties-common \
  wget \
  iputils-ping \ 
  net-tools \
  unzip

#==================
# Chromium BROWSER
#==================

RUN wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add -
RUN echo "deb http://dl.google.com/linux/chrome/deb/ stable main" > /etc/apt/sources.list.d/google.list
RUN apt-get update
RUN apt-get install chromium

#==================
# FIREFOX BROWSER
#==================

RUN apt-get install firefox-esr

#==================
# Chrome webdriver
#==================
ENV CHROME_DRIVER_VERSION="106.0.5249.21" \ 
    CHROME_DRIVER_BASE="chromedriver.storage.googleapis.com" \
    CPU_ARCH="64"
ENV CHROME_DRIVER_FILE="chromedriver_linux${CPU_ARCH}.zip"
ENV CHROME_DRIVER_URL="https://${CHROME_DRIVER_BASE}/${CHROME_DRIVER_VERSION}/${CHROME_DRIVER_FILE}"
RUN  wget -nv -O chromedriver_linux${CPU_ARCH}.zip ${CHROME_DRIVER_URL} \
  && unzip chromedriver_linux${CPU_ARCH}.zip \
  && rm chromedriver_linux${CPU_ARCH}.zip \
  && chmod +x chromedriver \
  && mv chromedriver /usr/local/bin/ \
  && chromedriver --version

#==================
# Gecko webdriver
#==================
 ENV geckodriver_ver=0.32.0
 RUN curl -fL -o /tmp/geckodriver.tar.gz \
         https://github.com/mozilla/geckodriver/releases/download/v${geckodriver_ver}/geckodriver-v${geckodriver_ver}-linux64.tar.gz \
 && tar -xzf /tmp/geckodriver.tar.gz -C /tmp/ \
 && chmod +x /tmp/geckodriver \
 && mv /tmp/geckodriver /usr/local/bin/ 

FROM jenkins



 