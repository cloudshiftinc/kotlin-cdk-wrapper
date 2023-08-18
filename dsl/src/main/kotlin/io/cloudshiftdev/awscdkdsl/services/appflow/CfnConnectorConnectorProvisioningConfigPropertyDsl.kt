@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnector

/**
 * Contains information about the configuration of the connector being registered.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * ConnectorProvisioningConfigProperty connectorProvisioningConfigProperty =
 * ConnectorProvisioningConfigProperty.builder()
 * .lambda(LambdaConnectorProvisioningConfigProperty.builder()
 * .lambdaArn("lambdaArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-connector-connectorprovisioningconfig.html)
 */
@CdkDslMarker
public class CfnConnectorConnectorProvisioningConfigPropertyDsl {
    private val cdkBuilder: CfnConnector.ConnectorProvisioningConfigProperty.Builder =
        CfnConnector.ConnectorProvisioningConfigProperty.builder()

    /**
     * @param lambda Contains information about the configuration of the lambda which is being
     *   registered as the connector.
     */
    public fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda)
    }

    /**
     * @param lambda Contains information about the configuration of the lambda which is being
     *   registered as the connector.
     */
    public fun lambda(lambda: CfnConnector.LambdaConnectorProvisioningConfigProperty) {
        cdkBuilder.lambda(lambda)
    }

    public fun build(): CfnConnector.ConnectorProvisioningConfigProperty = cdkBuilder.build()
}
