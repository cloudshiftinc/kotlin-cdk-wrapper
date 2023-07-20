@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.CfnInstance
import kotlin.String

@CdkDslMarker
public class CfnInstanceLicenseSpecificationPropertyDsl {
    private val cdkBuilder: CfnInstance.LicenseSpecificationProperty.Builder =
        CfnInstance.LicenseSpecificationProperty.builder()

    public fun licenseConfigurationArn(licenseConfigurationArn: String) {
        cdkBuilder.licenseConfigurationArn(licenseConfigurationArn)
    }

    public fun build(): CfnInstance.LicenseSpecificationProperty = cdkBuilder.build()
}
