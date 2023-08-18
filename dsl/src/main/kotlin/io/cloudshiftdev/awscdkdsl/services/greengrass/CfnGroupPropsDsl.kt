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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnGroup
import software.amazon.awscdk.services.greengrass.CfnGroupProps

/**
 * Properties for defining a `CfnGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object tags;
 * CfnGroupProps cfnGroupProps = CfnGroupProps.builder()
 * .name("name")
 * // the properties below are optional
 * .initialVersion(GroupVersionProperty.builder()
 * .connectorDefinitionVersionArn("connectorDefinitionVersionArn")
 * .coreDefinitionVersionArn("coreDefinitionVersionArn")
 * .deviceDefinitionVersionArn("deviceDefinitionVersionArn")
 * .functionDefinitionVersionArn("functionDefinitionVersionArn")
 * .loggerDefinitionVersionArn("loggerDefinitionVersionArn")
 * .resourceDefinitionVersionArn("resourceDefinitionVersionArn")
 * .subscriptionDefinitionVersionArn("subscriptionDefinitionVersionArn")
 * .build())
 * .roleArn("roleArn")
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 */
@CdkDslMarker
public class CfnGroupPropsDsl {
    private val cdkBuilder: CfnGroupProps.Builder = CfnGroupProps.builder()

    /**
     * @param initialVersion The group version to include when the group is created. A group version
     *   references the Amazon Resource Name (ARN) of a core definition version, device definition
     *   version, subscription definition version, and other version types. The group version must
     *   reference a core definition version that contains one core. Other version types are
     *   optionally included, depending on your business need.
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     */
    public fun initialVersion(initialVersion: IResolvable) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /**
     * @param initialVersion The group version to include when the group is created. A group version
     *   references the Amazon Resource Name (ARN) of a core definition version, device definition
     *   version, subscription definition version, and other version types. The group version must
     *   reference a core definition version that contains one core. Other version types are
     *   optionally included, depending on your business need.
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     */
    public fun initialVersion(initialVersion: CfnGroup.GroupVersionProperty) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /** @param name The name of the group. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role attached to the group. This
     *   role contains the permissions that Lambda functions and connectors use to interact with
     *   other AWS services.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags Application-specific metadata to attach to the group. You can use tags in IAM
     *   policies to control access to AWS IoT Greengrass resources. You can also use tags to
     *   categorize your resources. For more information, see
     *   [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
     *   in the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * @param tags Application-specific metadata to attach to the group. You can use tags in IAM
     *   policies to control access to AWS IoT Greengrass resources. You can also use tags to
     *   categorize your resources. For more information, see
     *   [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/latest/developerguide/tagging.html)
     *   in the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnGroupProps = cdkBuilder.build()
}
