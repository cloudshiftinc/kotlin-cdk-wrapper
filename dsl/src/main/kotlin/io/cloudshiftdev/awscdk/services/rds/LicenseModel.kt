package io.cloudshiftdev.awscdk.services.rds

public enum class LicenseModel(
    private val cdkObject: software.amazon.awscdk.services.rds.LicenseModel,
) {
    LICENSE_INCLUDED(software.amazon.awscdk.services.rds.LicenseModel.LICENSE_INCLUDED),
    BRING_YOUR_OWN_LICENSE(software.amazon.awscdk.services.rds.LicenseModel.BRING_YOUR_OWN_LICENSE),
    GENERAL_PUBLIC_LICENSE(software.amazon.awscdk.services.rds.LicenseModel.GENERAL_PUBLIC_LICENSE),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.rds.LicenseModel
        ): LicenseModel =
            when (cdkObject) {
                software.amazon.awscdk.services.rds.LicenseModel.LICENSE_INCLUDED ->
                    LicenseModel.LICENSE_INCLUDED
                software.amazon.awscdk.services.rds.LicenseModel.BRING_YOUR_OWN_LICENSE ->
                    LicenseModel.BRING_YOUR_OWN_LICENSE
                software.amazon.awscdk.services.rds.LicenseModel.GENERAL_PUBLIC_LICENSE ->
                    LicenseModel.GENERAL_PUBLIC_LICENSE
            }

        internal fun unwrap(
            wrapped: LicenseModel
        ): software.amazon.awscdk.services.rds.LicenseModel = wrapped.cdkObject
    }
}
