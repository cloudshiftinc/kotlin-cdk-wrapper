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

package io.cloudshiftdev.awscdkdsl.services.inspector

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.inspector.CfnAssessmentTarget
import software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps
import software.amazon.awscdk.services.inspector.CfnAssessmentTemplate
import software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps
import software.amazon.awscdk.services.inspector.CfnResourceGroup
import software.amazon.awscdk.services.inspector.CfnResourceGroupProps
import software.constructs.Construct

public object inspector {
    /**
     * The `AWS::Inspector::AssessmentTarget` resource is used to create Amazon Inspector assessment
     * targets, which specify the Amazon EC2 instances that will be analyzed during an assessment
     * run.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.inspector.*;
     * CfnAssessmentTarget cfnAssessmentTarget = CfnAssessmentTarget.Builder.create(this,
     * "MyCfnAssessmentTarget")
     * .assessmentTargetName("assessmentTargetName")
     * .resourceGroupArn("resourceGroupArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html)
     */
    public inline fun cfnAssessmentTarget(
        scope: Construct,
        id: String,
        block: CfnAssessmentTargetDsl.() -> Unit = {},
    ): CfnAssessmentTarget {
        val builder = CfnAssessmentTargetDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAssessmentTarget`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.inspector.*;
     * CfnAssessmentTargetProps cfnAssessmentTargetProps = CfnAssessmentTargetProps.builder()
     * .assessmentTargetName("assessmentTargetName")
     * .resourceGroupArn("resourceGroupArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttarget.html)
     */
    public inline fun cfnAssessmentTargetProps(
        block: CfnAssessmentTargetPropsDsl.() -> Unit = {}
    ): CfnAssessmentTargetProps {
        val builder = CfnAssessmentTargetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Inspector::AssessmentTemplate` resource creates an Amazon Inspector assessment
     * template, which specifies the Inspector assessment targets that will be evaluated by an
     * assessment run and its related configurations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.inspector.*;
     * CfnAssessmentTemplate cfnAssessmentTemplate = CfnAssessmentTemplate.Builder.create(this,
     * "MyCfnAssessmentTemplate")
     * .assessmentTargetArn("assessmentTargetArn")
     * .durationInSeconds(123)
     * .rulesPackageArns(List.of("rulesPackageArns"))
     * // the properties below are optional
     * .assessmentTemplateName("assessmentTemplateName")
     * .userAttributesForFindings(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html)
     */
    public inline fun cfnAssessmentTemplate(
        scope: Construct,
        id: String,
        block: CfnAssessmentTemplateDsl.() -> Unit = {},
    ): CfnAssessmentTemplate {
        val builder = CfnAssessmentTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAssessmentTemplate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.inspector.*;
     * CfnAssessmentTemplateProps cfnAssessmentTemplateProps = CfnAssessmentTemplateProps.builder()
     * .assessmentTargetArn("assessmentTargetArn")
     * .durationInSeconds(123)
     * .rulesPackageArns(List.of("rulesPackageArns"))
     * // the properties below are optional
     * .assessmentTemplateName("assessmentTemplateName")
     * .userAttributesForFindings(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html)
     */
    public inline fun cfnAssessmentTemplateProps(
        block: CfnAssessmentTemplatePropsDsl.() -> Unit = {}
    ): CfnAssessmentTemplateProps {
        val builder = CfnAssessmentTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Inspector::ResourceGroup` resource is used to create Amazon Inspector resource
     * groups.
     *
     * A resource group defines a set of tags that, when queried, identify the AWS resources that
     * make up the assessment target.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.inspector.*;
     * CfnResourceGroup cfnResourceGroup = CfnResourceGroup.Builder.create(this, "MyCfnResourceGroup")
     * .resourceGroupTags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html)
     */
    public inline fun cfnResourceGroup(
        scope: Construct,
        id: String,
        block: CfnResourceGroupDsl.() -> Unit = {},
    ): CfnResourceGroup {
        val builder = CfnResourceGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourceGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.inspector.*;
     * CfnResourceGroupProps cfnResourceGroupProps = CfnResourceGroupProps.builder()
     * .resourceGroupTags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html)
     */
    public inline fun cfnResourceGroupProps(
        block: CfnResourceGroupPropsDsl.() -> Unit = {}
    ): CfnResourceGroupProps {
        val builder = CfnResourceGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
