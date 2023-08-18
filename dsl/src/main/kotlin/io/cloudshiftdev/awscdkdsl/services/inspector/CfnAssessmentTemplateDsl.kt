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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspector.CfnAssessmentTemplate
import software.constructs.Construct

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
@CdkDslMarker
public class CfnAssessmentTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAssessmentTemplate.Builder =
        CfnAssessmentTemplate.Builder.create(scope, id)

    private val _rulesPackageArns: MutableList<String> = mutableListOf()

    private val _userAttributesForFindings: MutableList<Any> = mutableListOf()

    /**
     * The ARN of the assessment target to be included in the assessment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttargetarn)
     *
     * @param assessmentTargetArn The ARN of the assessment target to be included in the assessment
     *   template.
     */
    public fun assessmentTargetArn(assessmentTargetArn: String) {
        cdkBuilder.assessmentTargetArn(assessmentTargetArn)
    }

    /**
     * The user-defined name that identifies the assessment template that you want to create.
     *
     * You can create several assessment templates for the same assessment target. The names of the
     * assessment templates that correspond to a particular assessment target must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-assessmenttemplatename)
     *
     * @param assessmentTemplateName The user-defined name that identifies the assessment template
     *   that you want to create.
     */
    public fun assessmentTemplateName(assessmentTemplateName: String) {
        cdkBuilder.assessmentTemplateName(assessmentTemplateName)
    }

    /**
     * The duration of the assessment run in seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-durationinseconds)
     *
     * @param durationInSeconds The duration of the assessment run in seconds.
     */
    public fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
    }

    /**
     * The ARNs of the rules packages that you want to use in the assessment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-rulespackagearns)
     *
     * @param rulesPackageArns The ARNs of the rules packages that you want to use in the assessment
     *   template.
     */
    public fun rulesPackageArns(vararg rulesPackageArns: String) {
        _rulesPackageArns.addAll(listOf(*rulesPackageArns))
    }

    /**
     * The ARNs of the rules packages that you want to use in the assessment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-rulespackagearns)
     *
     * @param rulesPackageArns The ARNs of the rules packages that you want to use in the assessment
     *   template.
     */
    public fun rulesPackageArns(rulesPackageArns: Collection<String>) {
        _rulesPackageArns.addAll(rulesPackageArns)
    }

    /**
     * The user-defined attributes that are assigned to every finding that is generated by the
     * assessment run that uses this assessment template.
     *
     * Within an assessment template, each key must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-userattributesforfindings)
     *
     * @param userAttributesForFindings The user-defined attributes that are assigned to every
     *   finding that is generated by the assessment run that uses this assessment template.
     */
    public fun userAttributesForFindings(vararg userAttributesForFindings: Any) {
        _userAttributesForFindings.addAll(listOf(*userAttributesForFindings))
    }

    /**
     * The user-defined attributes that are assigned to every finding that is generated by the
     * assessment run that uses this assessment template.
     *
     * Within an assessment template, each key must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-userattributesforfindings)
     *
     * @param userAttributesForFindings The user-defined attributes that are assigned to every
     *   finding that is generated by the assessment run that uses this assessment template.
     */
    public fun userAttributesForFindings(userAttributesForFindings: Collection<Any>) {
        _userAttributesForFindings.addAll(userAttributesForFindings)
    }

    /**
     * The user-defined attributes that are assigned to every finding that is generated by the
     * assessment run that uses this assessment template.
     *
     * Within an assessment template, each key must be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-assessmenttemplate.html#cfn-inspector-assessmenttemplate-userattributesforfindings)
     *
     * @param userAttributesForFindings The user-defined attributes that are assigned to every
     *   finding that is generated by the assessment run that uses this assessment template.
     */
    public fun userAttributesForFindings(userAttributesForFindings: IResolvable) {
        cdkBuilder.userAttributesForFindings(userAttributesForFindings)
    }

    public fun build(): CfnAssessmentTemplate {
        if (_rulesPackageArns.isNotEmpty()) cdkBuilder.rulesPackageArns(_rulesPackageArns)
        if (_userAttributesForFindings.isNotEmpty())
            cdkBuilder.userAttributesForFindings(_userAttributesForFindings)
        return cdkBuilder.build()
    }
}
