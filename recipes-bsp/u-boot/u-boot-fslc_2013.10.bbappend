FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

PRINC := "${@int(PRINC) + 1}"

SRC_URI_append = " file://0001-tibidabo.patch "
