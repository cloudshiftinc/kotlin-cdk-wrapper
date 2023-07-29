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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnConnector
import software.amazon.awscdk.services.appflow.CfnConnectorProps

/**
 * Properties for defining a `CfnConnector`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * CfnConnectorProps cfnConnectorProps = CfnConnectorProps.builder()
 * .connectorProvisioningConfig(ConnectorProvisioningConfigProperty.builder()
 * .lambda(LambdaConnectorProvisioningConfigProperty.builder()
 * .lambdaArn("lambdaArn")
 * .build())
 * .build())
 * .connectorProvisioningType("connectorProvisioningType")
 * // the properties below are optional
 * .connectorLabel("connectorLabel")
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appflow-connector.html)
 */
@CdkDslMarker
public class CfnConnectorPropsDsl {
    private val cdkBuilder: CfnConnectorProps.Builder = CfnConnectorProps.builder()

    /** @param connectorLabel The label used for registering the connector. */
    public fun connectorLabel(connectorLabel: String) {
        cdkBuilder.connectorLabel(connectorLabel)
    }

    /**
     * @param connectorProvisioningConfig The configuration required for registering the connector.
     */
    public fun connectorProvisioningConfig(connectorProvisioningConfig: IResolvable) {
        cdkBuilder.connectorProvisioningConfig(connectorProvisioningConfig)
    }

    /**
     * @param connectorProvisioningConfig The configuration required for registering the connector.
     */
    public fun connectorProvisioningConfig(
        connectorProvisioningConfig: CfnConnector.ConnectorProvisioningConfigProperty
    ) {
        cdkBuilder.connectorProvisioningConfig(connectorProvisioningConfig)
    }

    /** @param connectorProvisioningType The provisioning type used to register the connector. */
    public fun connectorProvisioningType(connectorProvisioningType: String) {
        cdkBuilder.connectorProvisioningType(connectorProvisioningType)
    }

    /** @param description A description about the connector runtime setting. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun build(): CfnConnectorProps = cdkBuilder.build()
}
