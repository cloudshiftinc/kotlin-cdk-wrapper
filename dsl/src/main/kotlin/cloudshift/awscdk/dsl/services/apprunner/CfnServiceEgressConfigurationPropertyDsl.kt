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

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apprunner.CfnService
import kotlin.String

@CdkDslMarker
public class CfnServiceEgressConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.EgressConfigurationProperty.Builder =
        CfnService.EgressConfigurationProperty.builder()

    public fun egressType(egressType: String) {
        cdkBuilder.egressType(egressType)
    }

    public fun vpcConnectorArn(vpcConnectorArn: String) {
        cdkBuilder.vpcConnectorArn(vpcConnectorArn)
    }

    public fun build(): CfnService.EgressConfigurationProperty = cdkBuilder.build()
}
