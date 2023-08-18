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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersionProps

/**
 * Properties for defining a `CfnConnectorDefinitionVersion`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object parameters;
 * CfnConnectorDefinitionVersionProps cfnConnectorDefinitionVersionProps =
 * CfnConnectorDefinitionVersionProps.builder()
 * .connectorDefinitionId("connectorDefinitionId")
 * .connectors(List.of(ConnectorProperty.builder()
 * .connectorArn("connectorArn")
 * .id("id")
 * // the properties below are optional
 * .parameters(parameters)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
 */
@CdkDslMarker
public class CfnConnectorDefinitionVersionPropsDsl {
    private val cdkBuilder: CfnConnectorDefinitionVersionProps.Builder =
        CfnConnectorDefinitionVersionProps.builder()

    private val _connectors: MutableList<Any> = mutableListOf()

    /**
     * @param connectorDefinitionId The ID of the connector definition associated with this version.
     *   This value is a GUID.
     */
    public fun connectorDefinitionId(connectorDefinitionId: String) {
        cdkBuilder.connectorDefinitionId(connectorDefinitionId)
    }

    /**
     * @param connectors The connectors in this version. Only one instance of a given connector can
     *   be added to the connector definition version at a time.
     */
    public fun connectors(vararg connectors: Any) {
        _connectors.addAll(listOf(*connectors))
    }

    /**
     * @param connectors The connectors in this version. Only one instance of a given connector can
     *   be added to the connector definition version at a time.
     */
    public fun connectors(connectors: Collection<Any>) {
        _connectors.addAll(connectors)
    }

    /**
     * @param connectors The connectors in this version. Only one instance of a given connector can
     *   be added to the connector definition version at a time.
     */
    public fun connectors(connectors: IResolvable) {
        cdkBuilder.connectors(connectors)
    }

    public fun build(): CfnConnectorDefinitionVersionProps {
        if (_connectors.isNotEmpty()) cdkBuilder.connectors(_connectors)
        return cdkBuilder.build()
    }
}
