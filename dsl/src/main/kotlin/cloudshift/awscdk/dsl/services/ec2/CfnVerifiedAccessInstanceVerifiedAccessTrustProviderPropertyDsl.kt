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
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance
import kotlin.String

@CdkDslMarker
public class CfnVerifiedAccessInstanceVerifiedAccessTrustProviderPropertyDsl {
    private val cdkBuilder: CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty.Builder =
        CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun deviceTrustProviderType(deviceTrustProviderType: String) {
        cdkBuilder.deviceTrustProviderType(deviceTrustProviderType)
    }

    public fun trustProviderType(trustProviderType: String) {
        cdkBuilder.trustProviderType(trustProviderType)
    }

    public fun userTrustProviderType(userTrustProviderType: String) {
        cdkBuilder.userTrustProviderType(userTrustProviderType)
    }

    public fun verifiedAccessTrustProviderId(verifiedAccessTrustProviderId: String) {
        cdkBuilder.verifiedAccessTrustProviderId(verifiedAccessTrustProviderId)
    }

    public fun build(): CfnVerifiedAccessInstance.VerifiedAccessTrustProviderProperty =
        cdkBuilder.build()
}
