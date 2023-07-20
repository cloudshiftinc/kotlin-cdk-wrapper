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

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent
import kotlin.String

@CdkDslMarker
public class CfnStudioComponentLicenseServiceConfigurationPropertyDsl {
    private val cdkBuilder: CfnStudioComponent.LicenseServiceConfigurationProperty.Builder =
        CfnStudioComponent.LicenseServiceConfigurationProperty.builder()

    public fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
    }

    public fun build(): CfnStudioComponent.LicenseServiceConfigurationProperty = cdkBuilder.build()
}
