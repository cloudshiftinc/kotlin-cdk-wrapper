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
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinitionVersion
import software.constructs.Construct

/**
 * The `AWS::Greengrass::ConnectorDefinitionVersion` resource represents a connector definition
 * version for AWS IoT Greengrass .
 *
 * A connector definition version contains a list of connectors.
 *
 * To create a connector definition version, you must specify the ID of the connector definition
 * that you want to associate with the version. For information about creating a connector
 * definition, see
 * [`AWS::Greengrass::ConnectorDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html)
 * .
 *
 * After you create a connector definition version that contains the connectors you want to deploy,
 * you must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object parameters;
 * CfnConnectorDefinitionVersion cfnConnectorDefinitionVersion =
 * CfnConnectorDefinitionVersion.Builder.create(this, "MyCfnConnectorDefinitionVersion")
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
public class CfnConnectorDefinitionVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConnectorDefinitionVersion.Builder =
        CfnConnectorDefinitionVersion.Builder.create(scope, id)

    private val _connectors: MutableList<Any> = mutableListOf()

    /**
     * The ID of the connector definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectordefinitionid)
     *
     * @param connectorDefinitionId The ID of the connector definition associated with this version.
     */
    public fun connectorDefinitionId(connectorDefinitionId: String) {
        cdkBuilder.connectorDefinitionId(connectorDefinitionId)
    }

    /**
     * The connectors in this version.
     *
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors)
     *
     * @param connectors The connectors in this version.
     */
    public fun connectors(vararg connectors: Any) {
        _connectors.addAll(listOf(*connectors))
    }

    /**
     * The connectors in this version.
     *
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors)
     *
     * @param connectors The connectors in this version.
     */
    public fun connectors(connectors: Collection<Any>) {
        _connectors.addAll(connectors)
    }

    /**
     * The connectors in this version.
     *
     * Only one instance of a given connector can be added to the connector definition version at a
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html#cfn-greengrass-connectordefinitionversion-connectors)
     *
     * @param connectors The connectors in this version.
     */
    public fun connectors(connectors: IResolvable) {
        cdkBuilder.connectors(connectors)
    }

    public fun build(): CfnConnectorDefinitionVersion {
        if (_connectors.isNotEmpty()) cdkBuilder.connectors(_connectors)
        return cdkBuilder.build()
    }
}
