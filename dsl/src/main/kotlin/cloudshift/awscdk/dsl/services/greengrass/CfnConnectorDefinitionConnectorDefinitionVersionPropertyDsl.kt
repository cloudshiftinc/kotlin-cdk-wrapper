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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinition

/**
 * A connector definition version contains a list of connectors.
 *
 * After you create a connector definition version that contains the connectors you want to deploy,
 * you must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 * In an AWS CloudFormation template, `ConnectorDefinitionVersion` is the property type of the
 * `InitialVersion` property in the
 * [`AWS::Greengrass::ConnectorDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object parameters;
 * ConnectorDefinitionVersionProperty connectorDefinitionVersionProperty =
 * ConnectorDefinitionVersionProperty.builder()
 * .connectors(List.of(ConnectorProperty.builder()
 * .connectorArn("connectorArn")
 * .id("id")
 * // the properties below are optional
 * .parameters(parameters)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connectordefinitionversion.html)
 */
@CdkDslMarker
public class CfnConnectorDefinitionConnectorDefinitionVersionPropertyDsl {
    private val cdkBuilder: CfnConnectorDefinition.ConnectorDefinitionVersionProperty.Builder =
        CfnConnectorDefinition.ConnectorDefinitionVersionProperty.builder()

    private val _connectors: MutableList<Any> = mutableListOf()

    /**
     * @param connectors The connectors in this version. Only one instance of a given connector can
     *   be added to a connector definition version at a time.
     */
    public fun connectors(vararg connectors: Any) {
        _connectors.addAll(listOf(*connectors))
    }

    /**
     * @param connectors The connectors in this version. Only one instance of a given connector can
     *   be added to a connector definition version at a time.
     */
    public fun connectors(connectors: Collection<Any>) {
        _connectors.addAll(connectors)
    }

    /**
     * @param connectors The connectors in this version. Only one instance of a given connector can
     *   be added to a connector definition version at a time.
     */
    public fun connectors(connectors: IResolvable) {
        cdkBuilder.connectors(connectors)
    }

    public fun build(): CfnConnectorDefinition.ConnectorDefinitionVersionProperty {
        if (_connectors.isNotEmpty()) cdkBuilder.connectors(_connectors)
        return cdkBuilder.build()
    }
}
