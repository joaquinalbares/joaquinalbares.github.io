---
title: "INSTALACIÓN DE RUBY EN UBUNTU"
date: 2024-10-14T09:34:30-04:00
categories:
  - UT02
tags:
  - ruby
  - ubuntu
---

El siguiente texto es un extracto en inglés de la [web oficial](https://gorails.com/setup/ubuntu/24.04)para la instalación de Ruby o rails.

En este caso vamos a instalar sólamente Ruby.

## Installing Ruby

The first step is to install dependencies for compiling Ruby. Open your Terminal and run the following commands to install them.

```
sudo apt-get update
sudo apt-get install git-core zlib1g-dev build-essential libssl-dev libreadline-dev libyaml-dev libsqlite3-dev sqlite3 libxml2-dev libxslt1-dev libcurl4-openssl-dev software-properties-common libffi-dev
```

Next we're going to be installing Ruby using a version manager called [ASDF](https://asdf-vm.com).

The reason we use ASDF over rbenv, rvm or others is that ASDF can manage other languages like Node.js too.

Installing `asdf` is a simple two step process. First you install `asdf`, and then add it to your shell:

```
cd
git clone https://github.com/excid3/asdf.git ~/.asdf
echo '. "$HOME/.asdf/asdf.sh"' >> ~/.bashrc
echo '. "$HOME/.asdf/completions/asdf.bash"' >> ~/.bashrc
echo 'legacy_version_file = yes' >> ~/.asdfrc
echo 'export EDITOR="code --wait"' >> ~/.bashrc
exec $SHELL
```

Then we can install ASDF plugins for each language we want to use. For Rails, we can install Ruby and Node.js for our frontend Javascript.

```
asdf plugin add ruby
asdf plugin add nodejs
```

**Choose the version of Ruby you want to install:**

To install Ruby and set the default version, we'll run the following commands:

```
asdf install ruby 3.3.5
asdf global ruby 3.3.5

# Update to the latest Rubygems version
gem update --system
```

Confirm the default Ruby version matches the version you just installed.

```
which ruby
#=> /home/username/.asdf/shims/ruby
ruby -v
#=> 3.3.5
```

Then we can install the latest Node.js for handling Javascript in our Rails apps:

```
asdf install nodejs 20.18.0
asdf global nodejs 20.18.0

which node
#=> /home/username/.asdf/shims/node
node -v
#=> 20.18.0

# Install yarn for Rails jsbundling/cssbundling or webpacker
npm install -g yarn
```
