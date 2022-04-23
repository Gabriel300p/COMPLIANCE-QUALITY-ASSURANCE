#!/bin/bash

# This is a workaround for Ubuntu/Unify where menus are not displayed in Eclipse based applications. 
# Refs: https://bugs.launchpad.net/ubuntu/+source/libdbusmenu/+bug/618587
#       https://bugs.launchpad.net/ubuntu/+source/unity-gtk-module/+bug/1208019
# Use this if this problem is experienced. 
# This is not known to make any difference for other desktops than Unify.
export UBUNTU_MENUPROXY=0

# As Wayland is not properly supported by GTK and Eclipse, X11 is used.
export GDK_BACKEND=x11

# Launch Archi with any command line options
dir=$(dirname $(readlink -m $0))
$dir/Archi $*
