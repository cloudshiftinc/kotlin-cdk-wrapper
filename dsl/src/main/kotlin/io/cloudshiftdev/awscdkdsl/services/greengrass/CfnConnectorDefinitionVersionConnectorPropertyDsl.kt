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

package io.cloudshiftdev.awscdkdsl.services.greengrass

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion

/**
 * Connectors are modules that provide built-in integration with local infrastructure, device
 * protocols, AWS , and other cloud services.
 *
 * For more information, see
 * [Integrate with Services and Protocols Using Greengrass Connectors](https://docs.aws.amazon.com/greengrass/latest/developerguide/connectors.html)
 * in the *Developer Guide* .
 *
 * In an AWS CloudFormation template, the `Connectors` property of the
 * [`AWS::Greengrass::ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
 * resource contains a list of `Connector` property types.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object parameters;
 * ConnectorProperty connectorProperty = ConnectorProperty.builder()
 * .connectorArn("connectorArn")
 * .id("id")
 * // the properties below are optional
 * .parameters(parameters)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinitionversion-connector.html)
 */
@CdkDslMarker
public class CfnConnectorDefinitionVersionConnectorPropertyDsl {
    private val cdkBuilder: CfnConnectorDefinitionVersion.ConnectorProperty.Builder =
        CfnConnectorDefinitionVersion.ConnectorProperty.builder()

    /**
     * @param connectorArn The Amazon Resource Name (ARN) of the connector. For more information
     *   about connectors provided by AWS , see
     *   [Greengrass Connectors Provided by AWS](https://docs.aws.amazon.com/greengrass/latest/developerguide/connectors-list.html)
     *   .
     */
    public fun connectorArn(connectorArn: String) {
        cdkBuilder.connectorArn(connectorArn)
    }

    /**
     * @param id A descriptive or arbitrary ID for the connector. This value must be unique within
     *   the connector definition version. Maximum length is 128 characters with pattern
     *   `[a-zA-Z0-9:_-]+` .
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * @param parameters The parameters or configuration that the connector uses. For more
     *   information about connectors provided by AWS , see
     *   [Greengrass Connectors Provided by AWS](https://docs.aws.amazon.com/greengrass/latest/developerguide/connectors-list.html)
     *   .
     */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /**
     * @param parameters The parameters or configuration that the connector uses. For more
     *   information about connectors provided by AWS , see
     *   [Greengrass Connectors Provided by AWS](https://docs.aws.amazon.com/greengrass/latest/developerguide/connectors-list.html)
     *   .
     */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    public fun build(): CfnConnectorDefinitionVersion.ConnectorProperty = cdkBuilder.build()
}
