@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnEvaluationForm`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * EvaluationFormSectionProperty evaluationFormSectionProperty_;
 * CfnEvaluationFormProps cfnEvaluationFormProps = CfnEvaluationFormProps.builder()
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
public interface CfnEvaluationFormProps {
  /**
   * The description of the evaluation form.
   *
   * *Length Constraints* : Minimum length of 0. Maximum length of 1024.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The identifier of the Amazon Connect instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-instancearn)
   */
  public fun instanceArn(): String

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
   */
  public fun items(): Any

  /**
   * A scoring strategy of the evaluation form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-scoringstrategy)
   */
  public fun scoringStrategy(): Any? = unwrap(this).getScoringStrategy()

  /**
   * The status of the evaluation form.
   *
   * *Allowed values* : `DRAFT` | `ACTIVE`
   *
   * Default: - "DRAFT"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-status)
   */
  public fun status(): String

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A title of the evaluation form.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-title)
   */
  public fun title(): String

  /**
   * A builder for [CfnEvaluationFormProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the evaluation form.
     * *Length Constraints* : Minimum length of 0. Maximum length of 1024.
     */
    public fun description(description: String)

    /**
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param items Items that are part of the evaluation form. 
     * The total number of sections and questions must not exceed 100 each. Questions must be
     * contained in a section.
     *
     * *Minimum size* : 1
     *
     * *Maximum size* : 100
     */
    public fun items(items: IResolvable)

    /**
     * @param items Items that are part of the evaluation form. 
     * The total number of sections and questions must not exceed 100 each. Questions must be
     * contained in a section.
     *
     * *Minimum size* : 1
     *
     * *Maximum size* : 100
     */
    public fun items(items: List<Any>)

    /**
     * @param items Items that are part of the evaluation form. 
     * The total number of sections and questions must not exceed 100 each. Questions must be
     * contained in a section.
     *
     * *Minimum size* : 1
     *
     * *Maximum size* : 100
     */
    public fun items(vararg items: Any)

    /**
     * @param scoringStrategy A scoring strategy of the evaluation form.
     */
    public fun scoringStrategy(scoringStrategy: IResolvable)

    /**
     * @param scoringStrategy A scoring strategy of the evaluation form.
     */
    public fun scoringStrategy(scoringStrategy: CfnEvaluationForm.ScoringStrategyProperty)

    /**
     * @param scoringStrategy A scoring strategy of the evaluation form.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0472134355e2ed226a8c7cbd437aa008aca38dbb991bc49b5ec0a01280d7effb")
    public
        fun scoringStrategy(scoringStrategy: CfnEvaluationForm.ScoringStrategyProperty.Builder.() -> Unit)

    /**
     * @param status The status of the evaluation form. 
     * *Allowed values* : `DRAFT` | `ACTIVE`
     */
    public fun status(status: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param title A title of the evaluation form. 
     */
    public fun title(title: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnEvaluationFormProps.Builder =
        software.amazon.awscdk.services.connect.CfnEvaluationFormProps.builder()

    /**
     * @param description The description of the evaluation form.
     * *Length Constraints* : Minimum length of 0. Maximum length of 1024.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param items Items that are part of the evaluation form. 
     * The total number of sections and questions must not exceed 100 each. Questions must be
     * contained in a section.
     *
     * *Minimum size* : 1
     *
     * *Maximum size* : 100
     */
    override fun items(items: IResolvable) {
      cdkBuilder.items(items.let(IResolvable::unwrap))
    }

    /**
     * @param items Items that are part of the evaluation form. 
     * The total number of sections and questions must not exceed 100 each. Questions must be
     * contained in a section.
     *
     * *Minimum size* : 1
     *
     * *Maximum size* : 100
     */
    override fun items(items: List<Any>) {
      cdkBuilder.items(items)
    }

    /**
     * @param items Items that are part of the evaluation form. 
     * The total number of sections and questions must not exceed 100 each. Questions must be
     * contained in a section.
     *
     * *Minimum size* : 1
     *
     * *Maximum size* : 100
     */
    override fun items(vararg items: Any): Unit = items(items.toList())

    /**
     * @param scoringStrategy A scoring strategy of the evaluation form.
     */
    override fun scoringStrategy(scoringStrategy: IResolvable) {
      cdkBuilder.scoringStrategy(scoringStrategy.let(IResolvable::unwrap))
    }

    /**
     * @param scoringStrategy A scoring strategy of the evaluation form.
     */
    override fun scoringStrategy(scoringStrategy: CfnEvaluationForm.ScoringStrategyProperty) {
      cdkBuilder.scoringStrategy(scoringStrategy.let(CfnEvaluationForm.ScoringStrategyProperty::unwrap))
    }

    /**
     * @param scoringStrategy A scoring strategy of the evaluation form.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0472134355e2ed226a8c7cbd437aa008aca38dbb991bc49b5ec0a01280d7effb")
    override
        fun scoringStrategy(scoringStrategy: CfnEvaluationForm.ScoringStrategyProperty.Builder.() -> Unit):
        Unit = scoringStrategy(CfnEvaluationForm.ScoringStrategyProperty(scoringStrategy))

    /**
     * @param status The status of the evaluation form. 
     * *Allowed values* : `DRAFT` | `ACTIVE`
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param title A title of the evaluation form. 
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnEvaluationFormProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationFormProps,
  ) : CdkObject(cdkObject), CfnEvaluationFormProps {
    /**
     * The description of the evaluation form.
     *
     * *Length Constraints* : Minimum length of 0. Maximum length of 1024.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

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
     */
    override fun items(): Any = unwrap(this).getItems()

    /**
     * A scoring strategy of the evaluation form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-scoringstrategy)
     */
    override fun scoringStrategy(): Any? = unwrap(this).getScoringStrategy()

    /**
     * The status of the evaluation form.
     *
     * *Allowed values* : `DRAFT` | `ACTIVE`
     *
     * Default: - "DRAFT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-status)
     */
    override fun status(): String = unwrap(this).getStatus()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * A title of the evaluation form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-title)
     */
    override fun title(): String = unwrap(this).getTitle()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEvaluationFormProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationFormProps):
        CfnEvaluationFormProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEvaluationFormProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEvaluationFormProps):
        software.amazon.awscdk.services.connect.CfnEvaluationFormProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnEvaluationFormProps
  }
}
