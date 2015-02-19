LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"
DESCRIPTION = "Collection of scripts to easy the work with the flash memory"
COMPATIBLE_MACHINE = "(tibidabo)"
RDEPENDS_${PN} += " mtd-utils \
                    ubinfo-klibc \
                    ubiformat-klibc \
                    ubirmvol-klibc \
                    ubicrc32-klibc \
                    ubimkvol-klibc \
                    ubiupdatevol-klibc \
                    ubiattach-klibc \
                    ubinize-klibc \
                    ubidetach-klibc \
                    ubirsvol-klibc \
                    ubirename-klibc"

SRC_URI = "file://tibidabo_fs2flash \
           file://tibidabo_mount_flash \
           file://tibidabo_umount_flash \
           file://COPYING "

S = "${WORKDIR}/"

do_install () {
    install -d ${D}${bindir}
    install -m 0755 tibidabo_fs2flash     ${D}${bindir}
    install -m 0755 tibidabo_mount_flash  ${D}${bindir}
    install -m 0755 tibidabo_umount_flash ${D}${bindir}
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
