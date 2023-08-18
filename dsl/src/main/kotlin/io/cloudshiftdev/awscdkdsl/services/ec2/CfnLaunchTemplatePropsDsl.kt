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
import software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps

/**
 * Properties for defining a `CfnLaunchTemplate`.
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
public class CfnLaunchTemplatePropsDsl {
    private val cdkBuilder: CfnLaunchTemplateProps.Builder = CfnLaunchTemplateProps.builder()

    private val _tagSpecifications: MutableList<Any> = mutableListOf()

    /** @param launchTemplateData The information for the launch template. */
    public fun launchTemplateData(launchTemplateData: IResolvable) {
        cdkBuilder.launchTemplateData(launchTemplateData)
    }

    /** @param launchTemplateData The information for the launch template. */
    public fun launchTemplateData(
        launchTemplateData: CfnLaunchTemplate.LaunchTemplateDataProperty
    ) {
        cdkBuilder.launchTemplateData(launchTemplateData)
    }

    /** @param launchTemplateName A name for the launch template. */
    public fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
    }

    /**
     * @param tagSpecifications The tags to apply to the launch template on creation. To tag the
     *   launch template, the resource type must be `launch-template` .
     *
     * To specify the tags for the resources that are created when an instance is launched, you must
     * use the `TagSpecifications` parameter in the
     * [launch template data](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestLaunchTemplateData.html)
     * structure.
     */
    public fun tagSpecifications(vararg tagSpecifications: Any) {
        _tagSpecifications.addAll(listOf(*tagSpecifications))
    }

    /**
     * @param tagSpecifications The tags to apply to the launch template on creation. To tag the
     *   launch template, the resource type must be `launch-template` .
     *
     * To specify the tags for the resources that are created when an instance is launched, you must
     * use the `TagSpecifications` parameter in the
     * [launch template data](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestLaunchTemplateData.html)
     * structure.
     */
    public fun tagSpecifications(tagSpecifications: Collection<Any>) {
        _tagSpecifications.addAll(tagSpecifications)
    }

    /**
     * @param tagSpecifications The tags to apply to the launch template on creation. To tag the
     *   launch template, the resource type must be `launch-template` .
     *
     * To specify the tags for the resources that are created when an instance is launched, you must
     * use the `TagSpecifications` parameter in the
     * [launch template data](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RequestLaunchTemplateData.html)
     * structure.
     */
    public fun tagSpecifications(tagSpecifications: IResolvable) {
        cdkBuilder.tagSpecifications(tagSpecifications)
    }

    /** @param versionDescription A description for the first version of the launch template. */
    public fun versionDescription(versionDescription: String) {
        cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): CfnLaunchTemplateProps {
        if (_tagSpecifications.isNotEmpty()) cdkBuilder.tagSpecifications(_tagSpecifications)
        return cdkBuilder.build()
    }
}
