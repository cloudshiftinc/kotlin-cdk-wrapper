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
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinition
import software.constructs.Construct

/**
 * The `AWS::Greengrass::ConnectorDefinition` resource represents a connector definition for AWS IoT
 * Greengrass .
 *
 * Connector definitions are used to organize your connector definition versions.
 *
 * Connector definitions can reference multiple connector definition versions. All connector
 * definition versions must be associated with a connector definition. Each connector definition
 * version can contain one or more connectors.
 *
 * When you create a connector definition, you can optionally include an initial connector
 * definition version. To associate a connector definition version later, create an
 * [`AWS::Greengrass::ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
 * resource and specify the ID of this connector definition.
 *
 * After you create the connector definition version that contains the connectors you want to
 * deploy, you must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object parameters;
 * Object tags;
 * CfnConnectorDefinition cfnConnectorDefinition = CfnConnectorDefinition.Builder.create(this,
 * "MyCfnConnectorDefinition")
 * .name("name")
 * // the properties below are optional
 * .initialVersion(ConnectorDefinitionVersionProperty.builder()
 * .connectors(List.of(ConnectorProperty.builder()
 * .connectorArn("connectorArn")
 * .id("id")
 * // the properties below are optional
 * .parameters(parameters)
 * .build()))
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html)
 */
@CdkDslMarker
public class CfnConnectorDefinitionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConnectorDefinition.Builder =
        CfnConnectorDefinition.Builder.create(scope, id)

    /**
     * The connector definition version to include when the connector definition is created.
     *
     * A connector definition version contains a list of
     * [`connector`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html)
     * property types.
     *
     * To associate a connector definition version after the connector definition is created, create
     * an
     * [`AWS::Greengrass::ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
     * resource and specify the ID of this connector definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-initialversion)
     *
     * @param initialVersion The connector definition version to include when the connector
     *   definition is created.
     */
    public fun initialVersion(initialVersion: IResolvable) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /**
     * The connector definition version to include when the connector definition is created.
     *
     * A connector definition version contains a list of
     * [`connector`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-connectordefinition-connector.html)
     * property types.
     *
     * To associate a connector definition version after the connector definition is created, create
     * an
     * [`AWS::Greengrass::ConnectorDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinitionversion.html)
     * resource and specify the ID of this connector definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-initialversion)
     *
     * @param initialVersion The connector definition version to include when the connector
     *   definition is created.
     */
    public fun initialVersion(
        initialVersion: CfnConnectorDefinition.ConnectorDefinitionVersionProperty
    ) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /**
     * The name of the connector definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-name)
     *
     * @param name The name of the connector definition.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Application-specific metadata to attach to the connector definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see
     * [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
     * in the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-tags)
     *
     * @param tags Application-specific metadata to attach to the connector definition.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * Application-specific metadata to attach to the connector definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see
     * [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
     * in the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-connectordefinition.html#cfn-greengrass-connectordefinition-tags)
     *
     * @param tags Application-specific metadata to attach to the connector definition.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnConnectorDefinition = cdkBuilder.build()
}
