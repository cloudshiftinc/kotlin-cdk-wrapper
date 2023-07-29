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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm
import software.constructs.Construct

/**
 * Creates an evaluation form for the specified Amazon Connect instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * EvaluationFormSectionProperty evaluationFormSectionProperty_;
 * CfnEvaluationForm cfnEvaluationForm = CfnEvaluationForm.Builder.create(this,
 * "MyCfnEvaluationForm")
 * .instanceArn("instanceArn")
 * .items(List.of(EvaluationFormBaseItemProperty.builder()
 * .section(EvaluationFormSectionProperty.builder()
 * .refId("refId")
 * .title("title")
 * // the properties below are optional
 * .instructions("instructions")
 * .items(List.of(EvaluationFormItemProperty.builder()
 * .question(EvaluationFormQuestionProperty.builder()
 * .questionType("questionType")
 * .refId("refId")
 * .title("title")
 * // the properties below are optional
 * .instructions("instructions")
 * .notApplicableEnabled(false)
 * .questionTypeProperties(EvaluationFormQuestionTypePropertiesProperty.builder()
 * .numeric(EvaluationFormNumericQuestionPropertiesProperty.builder()
 * .maxValue(123)
 * .minValue(123)
 * // the properties below are optional
 * .automation(EvaluationFormNumericQuestionAutomationProperty.builder()
 * .propertyValue(NumericQuestionPropertyValueAutomationProperty.builder()
 * .label("label")
 * .build())
 * .build())
 * .options(List.of(EvaluationFormNumericQuestionOptionProperty.builder()
 * .maxValue(123)
 * .minValue(123)
 * // the properties below are optional
 * .automaticFail(false)
 * .score(123)
 * .build()))
 * .build())
 * .singleSelect(EvaluationFormSingleSelectQuestionPropertiesProperty.builder()
 * .options(List.of(EvaluationFormSingleSelectQuestionOptionProperty.builder()
 * .refId("refId")
 * .text("text")
 * // the properties below are optional
 * .automaticFail(false)
 * .score(123)
 * .build()))
 * // the properties below are optional
 * .automation(EvaluationFormSingleSelectQuestionAutomationProperty.builder()
 * .options(List.of(EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()
 * .ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty.builder()
 * .category("category")
 * .condition("condition")
 * .optionRefId("optionRefId")
 * .build())
 * .build()))
 * // the properties below are optional
 * .defaultOptionRefId("defaultOptionRefId")
 * .build())
 * .displayAs("displayAs")
 * .build())
 * .build())
 * .weight(123)
 * .build())
 * .section(evaluationFormSectionProperty_)
 * .build()))
 * .weight(123)
 * .build())
 * .build()))
 * .status("status")
 * .title("title")
 * // the properties below are optional
 * .description("description")
 * .scoringStrategy(ScoringStrategyProperty.builder()
 * .mode("mode")
 * .status("status")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html)
 */
@CdkDslMarker
public class CfnEvaluationFormDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEvaluationForm.Builder = CfnEvaluationForm.Builder.create(scope, id)

    private val _items: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The description of the evaluation form.
     *
     * *Length Constraints* : Minimum length of 0. Maximum length of 1024.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-description)
     *
     * @param description The description of the evaluation form.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-instancearn)
     *
     * @param instanceArn The identifier of the Amazon Connect instance.
     */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * Items that are part of the evaluation form.
     *
     * The total number of sections and questions must not exceed 100 each. Questions must be
     * contained in a section.
     *
     * *Minimum size* : 1
     *
     * *Maximum size* : 100
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-items)
     *
     * @param items Items that are part of the evaluation form.
     */
    public fun items(vararg items: Any) {
        _items.addAll(listOf(*items))
    }

    /**
     * Items that are part of the evaluation form.
     *
     * The total number of sections and questions must not exceed 100 each. Questions must be
     * contained in a section.
     *
     * *Minimum size* : 1
     *
     * *Maximum size* : 100
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-items)
     *
     * @param items Items that are part of the evaluation form.
     */
    public fun items(items: Collection<Any>) {
        _items.addAll(items)
    }

    /**
     * Items that are part of the evaluation form.
     *
     * The total number of sections and questions must not exceed 100 each. Questions must be
     * contained in a section.
     *
     * *Minimum size* : 1
     *
     * *Maximum size* : 100
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-items)
     *
     * @param items Items that are part of the evaluation form.
     */
    public fun items(items: IResolvable) {
        cdkBuilder.items(items)
    }

    /**
     * A scoring strategy of the evaluation form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-scoringstrategy)
     *
     * @param scoringStrategy A scoring strategy of the evaluation form.
     */
    public fun scoringStrategy(scoringStrategy: IResolvable) {
        cdkBuilder.scoringStrategy(scoringStrategy)
    }

    /**
     * A scoring strategy of the evaluation form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-scoringstrategy)
     *
     * @param scoringStrategy A scoring strategy of the evaluation form.
     */
    public fun scoringStrategy(scoringStrategy: CfnEvaluationForm.ScoringStrategyProperty) {
        cdkBuilder.scoringStrategy(scoringStrategy)
    }

    /**
     * The status of the evaluation form.
     *
     * *Allowed values* : `DRAFT` | `ACTIVE`
     *
     * Default: - "DRAFT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-status)
     *
     * @param status The status of the evaluation form.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * A title of the evaluation form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-title)
     *
     * @param title A title of the evaluation form.
     */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun build(): CfnEvaluationForm {
        if (_items.isNotEmpty()) cdkBuilder.items(_items)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
