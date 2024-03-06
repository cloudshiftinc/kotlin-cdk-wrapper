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
import software.constructs.Construct

/**
 * AWS IoT Greengrass seamlessly extends AWS to edge devices so they can act locally on the data
 * they generate, while still using the cloud for management, analytics, and durable storage.
 *
 * With AWS IoT Greengrass , connected devices can run AWS Lambda functions, execute predictions
 * based on machine learning models, keep device data in sync, and communicate with other devices
 * securely – even when not connected to the internet. For more information, see the
 * [Developer Guide](https://docs.aws.amazon.com/greengrass/v1/developerguide/what-is-gg.html) .
 *
 * For AWS Region support, see
 * [AWS CloudFormation Support for AWS IoT Greengrass](https://docs.aws.amazon.com/greengrass/v1/developerguide/cloudformation-support.html)
 * in the *Developer Guide* .
 *
 * The `AWS::Greengrass::Group` resource represents a group in AWS IoT Greengrass . In the AWS IoT
 * Greengrass API, groups are used to organize your group versions.
 *
 * Groups can reference multiple group versions. All group versions must be associated with a group.
 * A group version references a device definition version, subscription definition version, and
 * other version types that contain the components you want to deploy to a Greengrass core device.
 *
 * To deploy a group version, the group version must reference a core definition version that
 * contains one core. Other version types are optionally included, depending on your business need.
 *
 * When you create a group, you can optionally include an initial group version. To associate a
 * group version later, create a
 * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
 * resource and specify the ID of this group.
 *
 * To change group components (such as devices, subscriptions, or functions), you must create new
 * versions. This is because versions are immutable. For example, to add a function, you create a
 * function definition version that contains the new function (and all other functions that you want
 * to deploy). Then you create a group version that references the new function definition version
 * (and all other version types that you want to deploy).
 *
 * *Deploying a Group Version*
 *
 * After you create the group version in your AWS CloudFormation template, you can deploy it using
 * the
 * [`aws greengrass create-deployment`](https://docs.aws.amazon.com/greengrass/v1/apireference/createdeployment-post.html)
 * command in the AWS CLI or from the *Greengrass* node in the AWS IoT console. To deploy a group
 * version, you must have a Greengrass service role associated with your AWS account . For more
 * information, see
 * [AWS CloudFormation Support for AWS IoT Greengrass](https://docs.aws.amazon.com/greengrass/v1/developerguide/cloudformation-support.html)
 * in the *Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * Object tags;
 * CfnGroup cfnGroup = CfnGroup.Builder.create(this, "MyCfnGroup")
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
public class CfnGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGroup.Builder = CfnGroup.Builder.create(scope, id)

    /**
     * The group version to include when the group is created.
     *
     * A group version references the Amazon Resource Name (ARN) of a core definition version,
     * device definition version, subscription definition version, and other version types. The
     * group version must reference a core definition version that contains one core. Other version
     * types are optionally included, depending on your business need.
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-initialversion)
     *
     * @param initialVersion The group version to include when the group is created.
     */
    public fun initialVersion(initialVersion: IResolvable) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /**
     * The group version to include when the group is created.
     *
     * A group version references the Amazon Resource Name (ARN) of a core definition version,
     * device definition version, subscription definition version, and other version types. The
     * group version must reference a core definition version that contains one core. Other version
     * types are optionally included, depending on your business need.
     *
     * To associate a group version after the group is created, create an
     * [`AWS::Greengrass::GroupVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html)
     * resource and specify the ID of this group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-initialversion)
     *
     * @param initialVersion The group version to include when the group is created.
     */
    public fun initialVersion(initialVersion: CfnGroup.GroupVersionProperty) {
        cdkBuilder.initialVersion(initialVersion)
    }

    /**
     * The name of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-name)
     *
     * @param name The name of the group.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role attached to the group.
     *
     * This role contains the permissions that Lambda functions and connectors use to interact with
     * other AWS services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role attached to the group.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * Application-specific metadata to attach to the group.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see
     * [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-tags)
     *
     * @param tags Application-specific metadata to attach to the group.
     */
    public fun tags(tags: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(tags)
        cdkBuilder.tags(builder.map)
    }

    /**
     * Application-specific metadata to attach to the group.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see
     * [Tagging Your AWS IoT Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html#cfn-greengrass-group-tags)
     *
     * @param tags Application-specific metadata to attach to the group.
     */
    public fun tags(tags: Any) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnGroup = cdkBuilder.build()
}
