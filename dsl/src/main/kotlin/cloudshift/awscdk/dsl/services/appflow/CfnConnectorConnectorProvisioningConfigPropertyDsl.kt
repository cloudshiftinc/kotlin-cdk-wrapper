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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnector

@CdkDslMarker
public class CfnConnectorConnectorProvisioningConfigPropertyDsl {
    private val cdkBuilder: CfnConnector.ConnectorProvisioningConfigProperty.Builder =
        CfnConnector.ConnectorProvisioningConfigProperty.builder()

    public fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda)
    }

    public fun lambda(lambda: CfnConnector.LambdaConnectorProvisioningConfigProperty) {
        cdkBuilder.lambda(lambda)
    }

    public fun build(): CfnConnector.ConnectorProvisioningConfigProperty = cdkBuilder.build()
}
