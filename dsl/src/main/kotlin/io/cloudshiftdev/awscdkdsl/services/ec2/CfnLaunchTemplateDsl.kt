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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import software.constructs.Construct

/**
 * Specifies the properties for creating a launch template.
 *
 * The minimum required properties for specifying a launch template are as follows:
 * * You must specify at least one property for the launch template data.
 * * You do not need to specify a name for the launch template. If you do not specify a name, AWS
 *   CloudFormation creates the name for you.
 *
 * A launch template can contain some or all of the configuration information to launch an instance.
 * When you launch an instance using a launch template, instance properties that are not specified
 * in the launch template use default values, except the `ImageId` property, which has no default
 * value. If you do not specify an AMI ID for the launch template `ImageId` property, you must
 * specify an AMI ID for the instance `ImageId` property.
 *
 * For more information, see
 * [Launch an instance from a launch template](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html)
 * in the *Amazon EC2 User Guide* .
 *
 * Example:
 * ```
 * Cluster cluster;
 * String userData = "MIME-Version: 1.0\nContent-Type: multipart/mixed;
 * boundary=\"==MYBOUNDARY==\"\n\n--==MYBOUNDARY==\nContent-Type: text/x-shellscript;
 * charset=\"us-ascii\"\n\n#!/bin/bash\necho \"Running custom user data
 * script\"\n\n--==MYBOUNDARY==--\\\n";
 * CfnLaunchTemplate lt = CfnLaunchTemplate.Builder.create(this, "LaunchTemplate")
 * .launchTemplateData(LaunchTemplateDataProperty.builder()
 * .instanceType("t3.small")
 * .userData(Fn.base64(userData))
 * .build())
 * .build();
 * cluster.addNodegroupCapacity("extra-ng", NodegroupOptions.builder()
 * .launchTemplateSpec(LaunchTemplateSpec.builder()
 * .id(lt.getRef())
 * .version(lt.getAttrLatestVersionNumber())
 * .build())
 * .build());
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLaunchTemplate.Builder = CfnLaunchTemplate.Builder.create(scope, id)

    private val _tagSpecifications: MutableList<Any> = mutableListOf()

    /**
     * The information for the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatedata)
     *
     * @param launchTemplateData The information for the launch template.
     */
    public fun launchTemplateData(launchTemplateData: IResolvable) {
        cdkBuilder.launchTemplateData(launchTemplateData)
    }

    /**
     * The information for the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatedata)
     *
     * @param launchTemplateData The information for the launch template.
     */
    public fun launchTemplateData(
        launchTemplateData: CfnLaunchTemplate.LaunchTemplateDataProperty
    ) {
        cdkBuilder.launchTemplateData(launchTemplateData)
    }

    /**
     * A name for the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-launchtemplatename)
     *
     * @param launchTemplateName A name for the launch template.
     */
    public fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
    }

    /**
     * The tags to apply to the launch template on creation.
     *
     * To tag the launch template, the resource type must be `launch-template` .
     *
     * To specify the tags for the resources that are created when an instance is launched, you must
     * use the `TagSpecifications` parameter in the
     * [launch template data](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestLaunchTemplateData.html)
     * structure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
     *
     * @param tagSpecifications The tags to apply to the launch template on creation.
     */
    public fun tagSpecifications(vararg tagSpecifications: Any) {
        _tagSpecifications.addAll(listOf(*tagSpecifications))
    }

    /**
     * The tags to apply to the launch template on creation.
     *
     * To tag the launch template, the resource type must be `launch-template` .
     *
     * To specify the tags for the resources that are created when an instance is launched, you must
     * use the `TagSpecifications` parameter in the
     * [launch template data](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestLaunchTemplateData.html)
     * structure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
     *
     * @param tagSpecifications The tags to apply to the launch template on creation.
     */
    public fun tagSpecifications(tagSpecifications: Collection<Any>) {
        _tagSpecifications.addAll(tagSpecifications)
    }

    /**
     * The tags to apply to the launch template on creation.
     *
     * To tag the launch template, the resource type must be `launch-template` .
     *
     * To specify the tags for the resources that are created when an instance is launched, you must
     * use the `TagSpecifications` parameter in the
     * [launch template data](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestLaunchTemplateData.html)
     * structure.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-tagspecifications)
     *
     * @param tagSpecifications The tags to apply to the launch template on creation.
     */
    public fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications)
    }

    /**
     * A description for the first version of the launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html#cfn-ec2-launchtemplate-versiondescription)
     *
     * @param versionDescription A description for the first version of the launch template.
     */
    public fun versionDescription(versionDescription: String) {
        cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): CfnLaunchTemplate {
        if (_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
        return cdkBuilder.build()
    }
}
