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
import software.amazon.awscdk.services.appflow.CfnConnector
import kotlin.String

@CdkDslMarker
public class CfnConnectorLambdaConnectorProvisioningConfigPropertyDsl {
    private val cdkBuilder: CfnConnector.LambdaConnectorProvisioningConfigProperty.Builder =
        CfnConnector.LambdaConnectorProvisioningConfigProperty.builder()

    public fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
    }

    public fun build(): CfnConnector.LambdaConnectorProvisioningConfigProperty = cdkBuilder.build()
}
