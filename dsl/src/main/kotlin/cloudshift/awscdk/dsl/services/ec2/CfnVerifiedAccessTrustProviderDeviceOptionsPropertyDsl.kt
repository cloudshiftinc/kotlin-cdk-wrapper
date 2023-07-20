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
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider
import kotlin.String

@CdkDslMarker
public class CfnVerifiedAccessTrustProviderDeviceOptionsPropertyDsl {
    private val cdkBuilder: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.Builder =
        CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.builder()

    public fun tenantId(tenantId: String) {
        cdkBuilder.tenantId(tenantId)
    }

    public fun build(): CfnVerifiedAccessTrustProvider.DeviceOptionsProperty = cdkBuilder.build()
}
