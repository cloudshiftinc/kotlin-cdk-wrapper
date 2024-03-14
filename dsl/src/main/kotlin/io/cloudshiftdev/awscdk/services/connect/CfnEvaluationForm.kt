package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEvaluationForm internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the evaluation form.
   */
  public open fun attrEvaluationFormArn(): String = unwrap(this).getAttrEvaluationFormArn()

  /**
   * The description of the evaluation form.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the evaluation form.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The identifier of the Amazon Connect instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The identifier of the Amazon Connect instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * Items that are part of the evaluation form.
   */
  public open fun items(): Any = unwrap(this).getItems()

  /**
   * Items that are part of the evaluation form.
   */
  public open fun items(`value`: IResolvable) {
    unwrap(this).setItems(`value`.let(IResolvable::unwrap))
  }

  /**
   * Items that are part of the evaluation form.
   */
  public open fun items(__idx_ac66f0: List<Any>) {
    unwrap(this).setItems(__idx_ac66f0)
  }

  /**
   * Items that are part of the evaluation form.
   */
  public open fun items(vararg __idx_ac66f0: Any): Unit = items(__idx_ac66f0.toList())

  /**
   * A scoring strategy of the evaluation form.
   */
  public open fun scoringStrategy(): Any? = unwrap(this).getScoringStrategy()

  /**
   * A scoring strategy of the evaluation form.
   */
  public open fun scoringStrategy(`value`: IResolvable) {
    unwrap(this).setScoringStrategy(`value`.let(IResolvable::unwrap))
  }

  /**
   * A scoring strategy of the evaluation form.
   */
  public open fun scoringStrategy(`value`: ScoringStrategyProperty) {
    unwrap(this).setScoringStrategy(`value`.let(ScoringStrategyProperty::unwrap))
  }

  /**
   * A scoring strategy of the evaluation form.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db053b24097f5cded4f6164459b076ba38ecb1c25ec882b12efdfc556a16b8c9")
  public open fun scoringStrategy(`value`: ScoringStrategyProperty.Builder.() -> Unit): Unit =
      scoringStrategy(ScoringStrategyProperty(`value`))

  /**
   * The status of the evaluation form.
   */
  public open fun status(): String = unwrap(this).getStatus()

  /**
   * The status of the evaluation form.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A title of the evaluation form.
   */
  public open fun title(): String = unwrap(this).getTitle()

  /**
   * A title of the evaluation form.
   */
  public open fun title(`value`: String) {
    unwrap(this).setTitle(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnEvaluationForm].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the evaluation form.
     *
     * *Length Constraints* : Minimum length of 0. Maximum length of 1024.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-description)
     * @param description The description of the evaluation form. 
     */
    public fun description(description: String)

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-instancearn)
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    public fun instanceArn(instanceArn: String)

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
     * @param items Items that are part of the evaluation form. 
     */
    public fun items(items: IResolvable)

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
     * @param items Items that are part of the evaluation form. 
     */
    public fun items(items: List<Any>)

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
     * @param items Items that are part of the evaluation form. 
     */
    public fun items(vararg items: Any)

    /**
     * A scoring strategy of the evaluation form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-scoringstrategy)
     * @param scoringStrategy A scoring strategy of the evaluation form. 
     */
    public fun scoringStrategy(scoringStrategy: IResolvable)

    /**
     * A scoring strategy of the evaluation form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-scoringstrategy)
     * @param scoringStrategy A scoring strategy of the evaluation form. 
     */
    public fun scoringStrategy(scoringStrategy: ScoringStrategyProperty)

    /**
     * A scoring strategy of the evaluation form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-scoringstrategy)
     * @param scoringStrategy A scoring strategy of the evaluation form. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("efe2e93373ae65f145c25729292d629486d4800bb33842ff36705d4eb3a6cc13")
    public fun scoringStrategy(scoringStrategy: ScoringStrategyProperty.Builder.() -> Unit)

    /**
     * The status of the evaluation form.
     *
     * *Allowed values* : `DRAFT` | `ACTIVE`
     *
     * Default: - "DRAFT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-status)
     * @param status The status of the evaluation form. 
     */
    public fun status(status: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * A title of the evaluation form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-title)
     * @param title A title of the evaluation form. 
     */
    public fun title(title: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnEvaluationForm.Builder =
        software.amazon.awscdk.services.connect.CfnEvaluationForm.Builder.create(scope, id)

    /**
     * The description of the evaluation form.
     *
     * *Length Constraints* : Minimum length of 0. Maximum length of 1024.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-description)
     * @param description The description of the evaluation form. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-instancearn)
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    override fun instanceArn(instanceArn: String) {
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
     * @param items Items that are part of the evaluation form. 
     */
    override fun items(items: IResolvable) {
      cdkBuilder.items(items.let(IResolvable::unwrap))
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
     * @param items Items that are part of the evaluation form. 
     */
    override fun items(items: List<Any>) {
      cdkBuilder.items(items)
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
     * @param items Items that are part of the evaluation form. 
     */
    override fun items(vararg items: Any): Unit = items(items.toList())

    /**
     * A scoring strategy of the evaluation form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-scoringstrategy)
     * @param scoringStrategy A scoring strategy of the evaluation form. 
     */
    override fun scoringStrategy(scoringStrategy: IResolvable) {
      cdkBuilder.scoringStrategy(scoringStrategy.let(IResolvable::unwrap))
    }

    /**
     * A scoring strategy of the evaluation form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-scoringstrategy)
     * @param scoringStrategy A scoring strategy of the evaluation form. 
     */
    override fun scoringStrategy(scoringStrategy: ScoringStrategyProperty) {
      cdkBuilder.scoringStrategy(scoringStrategy.let(ScoringStrategyProperty::unwrap))
    }

    /**
     * A scoring strategy of the evaluation form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-scoringstrategy)
     * @param scoringStrategy A scoring strategy of the evaluation form. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("efe2e93373ae65f145c25729292d629486d4800bb33842ff36705d4eb3a6cc13")
    override fun scoringStrategy(scoringStrategy: ScoringStrategyProperty.Builder.() -> Unit): Unit
        = scoringStrategy(ScoringStrategyProperty(scoringStrategy))

    /**
     * The status of the evaluation form.
     *
     * *Allowed values* : `DRAFT` | `ACTIVE`
     *
     * Default: - "DRAFT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-status)
     * @param status The status of the evaluation form. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * A title of the evaluation form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-evaluationform.html#cfn-connect-evaluationform-title)
     * @param title A title of the evaluation form. 
     */
    override fun title(title: String) {
      cdkBuilder.title(title)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnEvaluationForm =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnEvaluationForm.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEvaluationForm {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEvaluationForm(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm):
        CfnEvaluationForm = CfnEvaluationForm(cdkObject)

    internal fun unwrap(wrapped: CfnEvaluationForm):
        software.amazon.awscdk.services.connect.CfnEvaluationForm = wrapped.cdkObject
  }

  public interface EvaluationFormQuestionProperty {
    /**
     * The instructions of the section.
     *
     * *Length Constraints* : Minimum length of 0. Maximum length of 1024.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html#cfn-connect-evaluationform-evaluationformquestion-instructions)
     */
    public fun instructions(): String? = unwrap(this).getInstructions()

    /**
     * The flag to enable not applicable answers to the question.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html#cfn-connect-evaluationform-evaluationformquestion-notapplicableenabled)
     */
    public fun notApplicableEnabled(): Any? = unwrap(this).getNotApplicableEnabled()

    /**
     * The type of the question.
     *
     * *Allowed values* : `NUMERIC` | `SINGLESELECT` | `TEXT`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html#cfn-connect-evaluationform-evaluationformquestion-questiontype)
     */
    public fun questionType(): String

    /**
     * The properties of the type of question.
     *
     * Text questions do not have to define question type properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html#cfn-connect-evaluationform-evaluationformquestion-questiontypeproperties)
     */
    public fun questionTypeProperties(): Any? = unwrap(this).getQuestionTypeProperties()

    /**
     * The identifier of the question. An identifier must be unique within the evaluation form.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 40.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html#cfn-connect-evaluationform-evaluationformquestion-refid)
     */
    public fun refId(): String

    /**
     * The title of the question.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 350.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html#cfn-connect-evaluationform-evaluationformquestion-title)
     */
    public fun title(): String

    /**
     * The scoring weight of the section.
     *
     * *Minimum* : 0
     *
     * *Maximum* : 100
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html#cfn-connect-evaluationform-evaluationformquestion-weight)
     */
    public fun weight(): Number? = unwrap(this).getWeight()

    /**
     * A builder for [EvaluationFormQuestionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instructions The instructions of the section.
       * *Length Constraints* : Minimum length of 0. Maximum length of 1024.
       */
      public fun instructions(instructions: String)

      /**
       * @param notApplicableEnabled The flag to enable not applicable answers to the question.
       */
      public fun notApplicableEnabled(notApplicableEnabled: Boolean)

      /**
       * @param notApplicableEnabled The flag to enable not applicable answers to the question.
       */
      public fun notApplicableEnabled(notApplicableEnabled: IResolvable)

      /**
       * @param questionType The type of the question. 
       * *Allowed values* : `NUMERIC` | `SINGLESELECT` | `TEXT`
       */
      public fun questionType(questionType: String)

      /**
       * @param questionTypeProperties The properties of the type of question.
       * Text questions do not have to define question type properties.
       */
      public fun questionTypeProperties(questionTypeProperties: IResolvable)

      /**
       * @param questionTypeProperties The properties of the type of question.
       * Text questions do not have to define question type properties.
       */
      public
          fun questionTypeProperties(questionTypeProperties: EvaluationFormQuestionTypePropertiesProperty)

      /**
       * @param questionTypeProperties The properties of the type of question.
       * Text questions do not have to define question type properties.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60e92d415a6763084f160d2a7bdb9e754997ad72b78e7b47b63ad5416ac3a029")
      public
          fun questionTypeProperties(questionTypeProperties: EvaluationFormQuestionTypePropertiesProperty.Builder.() -> Unit)

      /**
       * @param refId The identifier of the question. An identifier must be unique within the
       * evaluation form. 
       * *Length Constraints* : Minimum length of 1. Maximum length of 40.
       */
      public fun refId(refId: String)

      /**
       * @param title The title of the question. 
       * *Length Constraints* : Minimum length of 1. Maximum length of 350.
       */
      public fun title(title: String)

      /**
       * @param weight The scoring weight of the section.
       * *Minimum* : 0
       *
       * *Maximum* : 100
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionProperty.builder()

      /**
       * @param instructions The instructions of the section.
       * *Length Constraints* : Minimum length of 0. Maximum length of 1024.
       */
      override fun instructions(instructions: String) {
        cdkBuilder.instructions(instructions)
      }

      /**
       * @param notApplicableEnabled The flag to enable not applicable answers to the question.
       */
      override fun notApplicableEnabled(notApplicableEnabled: Boolean) {
        cdkBuilder.notApplicableEnabled(notApplicableEnabled)
      }

      /**
       * @param notApplicableEnabled The flag to enable not applicable answers to the question.
       */
      override fun notApplicableEnabled(notApplicableEnabled: IResolvable) {
        cdkBuilder.notApplicableEnabled(notApplicableEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param questionType The type of the question. 
       * *Allowed values* : `NUMERIC` | `SINGLESELECT` | `TEXT`
       */
      override fun questionType(questionType: String) {
        cdkBuilder.questionType(questionType)
      }

      /**
       * @param questionTypeProperties The properties of the type of question.
       * Text questions do not have to define question type properties.
       */
      override fun questionTypeProperties(questionTypeProperties: IResolvable) {
        cdkBuilder.questionTypeProperties(questionTypeProperties.let(IResolvable::unwrap))
      }

      /**
       * @param questionTypeProperties The properties of the type of question.
       * Text questions do not have to define question type properties.
       */
      override
          fun questionTypeProperties(questionTypeProperties: EvaluationFormQuestionTypePropertiesProperty) {
        cdkBuilder.questionTypeProperties(questionTypeProperties.let(EvaluationFormQuestionTypePropertiesProperty::unwrap))
      }

      /**
       * @param questionTypeProperties The properties of the type of question.
       * Text questions do not have to define question type properties.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60e92d415a6763084f160d2a7bdb9e754997ad72b78e7b47b63ad5416ac3a029")
      override
          fun questionTypeProperties(questionTypeProperties: EvaluationFormQuestionTypePropertiesProperty.Builder.() -> Unit):
          Unit =
          questionTypeProperties(EvaluationFormQuestionTypePropertiesProperty(questionTypeProperties))

      /**
       * @param refId The identifier of the question. An identifier must be unique within the
       * evaluation form. 
       * *Length Constraints* : Minimum length of 1. Maximum length of 40.
       */
      override fun refId(refId: String) {
        cdkBuilder.refId(refId)
      }

      /**
       * @param title The title of the question. 
       * *Length Constraints* : Minimum length of 1. Maximum length of 350.
       */
      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      /**
       * @param weight The scoring weight of the section.
       * *Minimum* : 0
       *
       * *Maximum* : 100
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionProperty,
    ) : CdkObject(cdkObject), EvaluationFormQuestionProperty {
      /**
       * The instructions of the section.
       *
       * *Length Constraints* : Minimum length of 0. Maximum length of 1024.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html#cfn-connect-evaluationform-evaluationformquestion-instructions)
       */
      override fun instructions(): String? = unwrap(this).getInstructions()

      /**
       * The flag to enable not applicable answers to the question.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html#cfn-connect-evaluationform-evaluationformquestion-notapplicableenabled)
       */
      override fun notApplicableEnabled(): Any? = unwrap(this).getNotApplicableEnabled()

      /**
       * The type of the question.
       *
       * *Allowed values* : `NUMERIC` | `SINGLESELECT` | `TEXT`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html#cfn-connect-evaluationform-evaluationformquestion-questiontype)
       */
      override fun questionType(): String = unwrap(this).getQuestionType()

      /**
       * The properties of the type of question.
       *
       * Text questions do not have to define question type properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html#cfn-connect-evaluationform-evaluationformquestion-questiontypeproperties)
       */
      override fun questionTypeProperties(): Any? = unwrap(this).getQuestionTypeProperties()

      /**
       * The identifier of the question. An identifier must be unique within the evaluation form.
       *
       * *Length Constraints* : Minimum length of 1. Maximum length of 40.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html#cfn-connect-evaluationform-evaluationformquestion-refid)
       */
      override fun refId(): String = unwrap(this).getRefId()

      /**
       * The title of the question.
       *
       * *Length Constraints* : Minimum length of 1. Maximum length of 350.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html#cfn-connect-evaluationform-evaluationformquestion-title)
       */
      override fun title(): String = unwrap(this).getTitle()

      /**
       * The scoring weight of the section.
       *
       * *Minimum* : 0
       *
       * *Maximum* : 100
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestion.html#cfn-connect-evaluationform-evaluationformquestion-weight)
       */
      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EvaluationFormQuestionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionProperty):
          EvaluationFormQuestionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormQuestionProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionProperty
    }
  }

  public interface EvaluationFormQuestionTypePropertiesProperty {
    /**
     * The properties of the numeric question.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestiontypeproperties.html#cfn-connect-evaluationform-evaluationformquestiontypeproperties-numeric)
     */
    public fun numeric(): Any? = unwrap(this).getNumeric()

    /**
     * The properties of the numeric question.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestiontypeproperties.html#cfn-connect-evaluationform-evaluationformquestiontypeproperties-singleselect)
     */
    public fun singleSelect(): Any? = unwrap(this).getSingleSelect()

    /**
     * A builder for [EvaluationFormQuestionTypePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param numeric The properties of the numeric question.
       */
      public fun numeric(numeric: IResolvable)

      /**
       * @param numeric The properties of the numeric question.
       */
      public fun numeric(numeric: EvaluationFormNumericQuestionPropertiesProperty)

      /**
       * @param numeric The properties of the numeric question.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f07d1e363c9b8df691d140e50a5f9b351fafd49a1adab6f4336e3b8339c48f95")
      public
          fun numeric(numeric: EvaluationFormNumericQuestionPropertiesProperty.Builder.() -> Unit)

      /**
       * @param singleSelect The properties of the numeric question.
       */
      public fun singleSelect(singleSelect: IResolvable)

      /**
       * @param singleSelect The properties of the numeric question.
       */
      public fun singleSelect(singleSelect: EvaluationFormSingleSelectQuestionPropertiesProperty)

      /**
       * @param singleSelect The properties of the numeric question.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ac30d99389af3124e39fc297e281cc6b48e711a4dbcb0a04077587c66eb38b1")
      public
          fun singleSelect(singleSelect: EvaluationFormSingleSelectQuestionPropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty.builder()

      /**
       * @param numeric The properties of the numeric question.
       */
      override fun numeric(numeric: IResolvable) {
        cdkBuilder.numeric(numeric.let(IResolvable::unwrap))
      }

      /**
       * @param numeric The properties of the numeric question.
       */
      override fun numeric(numeric: EvaluationFormNumericQuestionPropertiesProperty) {
        cdkBuilder.numeric(numeric.let(EvaluationFormNumericQuestionPropertiesProperty::unwrap))
      }

      /**
       * @param numeric The properties of the numeric question.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f07d1e363c9b8df691d140e50a5f9b351fafd49a1adab6f4336e3b8339c48f95")
      override
          fun numeric(numeric: EvaluationFormNumericQuestionPropertiesProperty.Builder.() -> Unit):
          Unit = numeric(EvaluationFormNumericQuestionPropertiesProperty(numeric))

      /**
       * @param singleSelect The properties of the numeric question.
       */
      override fun singleSelect(singleSelect: IResolvable) {
        cdkBuilder.singleSelect(singleSelect.let(IResolvable::unwrap))
      }

      /**
       * @param singleSelect The properties of the numeric question.
       */
      override
          fun singleSelect(singleSelect: EvaluationFormSingleSelectQuestionPropertiesProperty) {
        cdkBuilder.singleSelect(singleSelect.let(EvaluationFormSingleSelectQuestionPropertiesProperty::unwrap))
      }

      /**
       * @param singleSelect The properties of the numeric question.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4ac30d99389af3124e39fc297e281cc6b48e711a4dbcb0a04077587c66eb38b1")
      override
          fun singleSelect(singleSelect: EvaluationFormSingleSelectQuestionPropertiesProperty.Builder.() -> Unit):
          Unit = singleSelect(EvaluationFormSingleSelectQuestionPropertiesProperty(singleSelect))

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty,
    ) : CdkObject(cdkObject), EvaluationFormQuestionTypePropertiesProperty {
      /**
       * The properties of the numeric question.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestiontypeproperties.html#cfn-connect-evaluationform-evaluationformquestiontypeproperties-numeric)
       */
      override fun numeric(): Any? = unwrap(this).getNumeric()

      /**
       * The properties of the numeric question.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformquestiontypeproperties.html#cfn-connect-evaluationform-evaluationformquestiontypeproperties-singleselect)
       */
      override fun singleSelect(): Any? = unwrap(this).getSingleSelect()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormQuestionTypePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty):
          EvaluationFormQuestionTypePropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormQuestionTypePropertiesProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormQuestionTypePropertiesProperty
    }
  }

  public interface EvaluationFormItemProperty {
    /**
     * The information of the question.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformitem.html#cfn-connect-evaluationform-evaluationformitem-question)
     */
    public fun question(): Any? = unwrap(this).getQuestion()

    /**
     * The information of the section.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformitem.html#cfn-connect-evaluationform-evaluationformitem-section)
     */
    public fun section(): Any? = unwrap(this).getSection()

    /**
     * A builder for [EvaluationFormItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param question The information of the question.
       */
      public fun question(question: IResolvable)

      /**
       * @param question The information of the question.
       */
      public fun question(question: EvaluationFormQuestionProperty)

      /**
       * @param question The information of the question.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5318a14fa17ffb27f54d09ae3d4e6adfe1d0a87d6d836ba0e4d31e90e5d44fa")
      public fun question(question: EvaluationFormQuestionProperty.Builder.() -> Unit)

      /**
       * @param section The information of the section.
       */
      public fun section(section: IResolvable)

      /**
       * @param section The information of the section.
       */
      public fun section(section: EvaluationFormSectionProperty)

      /**
       * @param section The information of the section.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("515bf2263e1945779436dc77ef1a3a822c8481e6e43e0878bb8e3dc2b5a85496")
      public fun section(section: EvaluationFormSectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormItemProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormItemProperty.builder()

      /**
       * @param question The information of the question.
       */
      override fun question(question: IResolvable) {
        cdkBuilder.question(question.let(IResolvable::unwrap))
      }

      /**
       * @param question The information of the question.
       */
      override fun question(question: EvaluationFormQuestionProperty) {
        cdkBuilder.question(question.let(EvaluationFormQuestionProperty::unwrap))
      }

      /**
       * @param question The information of the question.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e5318a14fa17ffb27f54d09ae3d4e6adfe1d0a87d6d836ba0e4d31e90e5d44fa")
      override fun question(question: EvaluationFormQuestionProperty.Builder.() -> Unit): Unit =
          question(EvaluationFormQuestionProperty(question))

      /**
       * @param section The information of the section.
       */
      override fun section(section: IResolvable) {
        cdkBuilder.section(section.let(IResolvable::unwrap))
      }

      /**
       * @param section The information of the section.
       */
      override fun section(section: EvaluationFormSectionProperty) {
        cdkBuilder.section(section.let(EvaluationFormSectionProperty::unwrap))
      }

      /**
       * @param section The information of the section.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("515bf2263e1945779436dc77ef1a3a822c8481e6e43e0878bb8e3dc2b5a85496")
      override fun section(section: EvaluationFormSectionProperty.Builder.() -> Unit): Unit =
          section(EvaluationFormSectionProperty(section))

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormItemProperty,
    ) : CdkObject(cdkObject), EvaluationFormItemProperty {
      /**
       * The information of the question.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformitem.html#cfn-connect-evaluationform-evaluationformitem-question)
       */
      override fun question(): Any? = unwrap(this).getQuestion()

      /**
       * The information of the section.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformitem.html#cfn-connect-evaluationform-evaluationformitem-section)
       */
      override fun section(): Any? = unwrap(this).getSection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EvaluationFormItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormItemProperty):
          EvaluationFormItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormItemProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormItemProperty
    }
  }

  public interface EvaluationFormSingleSelectQuestionAutomationProperty {
    /**
     * The identifier of the default answer option, when none of the automation options match the
     * criteria.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 40.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionautomation.html#cfn-connect-evaluationform-evaluationformsingleselectquestionautomation-defaultoptionrefid)
     */
    public fun defaultOptionRefId(): String? = unwrap(this).getDefaultOptionRefId()

    /**
     * The automation options of the single select question.
     *
     * *Minimum* : 1
     *
     * *Maximum* : 20
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionautomation.html#cfn-connect-evaluationform-evaluationformsingleselectquestionautomation-options)
     */
    public fun options(): Any

    /**
     * A builder for [EvaluationFormSingleSelectQuestionAutomationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param defaultOptionRefId The identifier of the default answer option, when none of the
       * automation options match the criteria.
       * *Length Constraints* : Minimum length of 1. Maximum length of 40.
       */
      public fun defaultOptionRefId(defaultOptionRefId: String)

      /**
       * @param options The automation options of the single select question. 
       * *Minimum* : 1
       *
       * *Maximum* : 20
       */
      public fun options(options: IResolvable)

      /**
       * @param options The automation options of the single select question. 
       * *Minimum* : 1
       *
       * *Maximum* : 20
       */
      public fun options(options: List<Any>)

      /**
       * @param options The automation options of the single select question. 
       * *Minimum* : 1
       *
       * *Maximum* : 20
       */
      public fun options(vararg options: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty.builder()

      /**
       * @param defaultOptionRefId The identifier of the default answer option, when none of the
       * automation options match the criteria.
       * *Length Constraints* : Minimum length of 1. Maximum length of 40.
       */
      override fun defaultOptionRefId(defaultOptionRefId: String) {
        cdkBuilder.defaultOptionRefId(defaultOptionRefId)
      }

      /**
       * @param options The automation options of the single select question. 
       * *Minimum* : 1
       *
       * *Maximum* : 20
       */
      override fun options(options: IResolvable) {
        cdkBuilder.options(options.let(IResolvable::unwrap))
      }

      /**
       * @param options The automation options of the single select question. 
       * *Minimum* : 1
       *
       * *Maximum* : 20
       */
      override fun options(options: List<Any>) {
        cdkBuilder.options(options)
      }

      /**
       * @param options The automation options of the single select question. 
       * *Minimum* : 1
       *
       * *Maximum* : 20
       */
      override fun options(vararg options: Any): Unit = options(options.toList())

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty,
    ) : CdkObject(cdkObject), EvaluationFormSingleSelectQuestionAutomationProperty {
      /**
       * The identifier of the default answer option, when none of the automation options match the
       * criteria.
       *
       * *Length Constraints* : Minimum length of 1. Maximum length of 40.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionautomation.html#cfn-connect-evaluationform-evaluationformsingleselectquestionautomation-defaultoptionrefid)
       */
      override fun defaultOptionRefId(): String? = unwrap(this).getDefaultOptionRefId()

      /**
       * The automation options of the single select question.
       *
       * *Minimum* : 1
       *
       * *Maximum* : 20
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionautomation.html#cfn-connect-evaluationform-evaluationformsingleselectquestionautomation-options)
       */
      override fun options(): Any = unwrap(this).getOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormSingleSelectQuestionAutomationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty):
          EvaluationFormSingleSelectQuestionAutomationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormSingleSelectQuestionAutomationProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty
    }
  }

  public interface EvaluationFormNumericQuestionPropertiesProperty {
    /**
     * The automation properties of the numeric question.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionproperties.html#cfn-connect-evaluationform-evaluationformnumericquestionproperties-automation)
     */
    public fun automation(): Any? = unwrap(this).getAutomation()

    /**
     * The maximum answer value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionproperties.html#cfn-connect-evaluationform-evaluationformnumericquestionproperties-maxvalue)
     */
    public fun maxValue(): Number

    /**
     * The minimum answer value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionproperties.html#cfn-connect-evaluationform-evaluationformnumericquestionproperties-minvalue)
     */
    public fun minValue(): Number

    /**
     * The scoring options of the numeric question.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionproperties.html#cfn-connect-evaluationform-evaluationformnumericquestionproperties-options)
     */
    public fun options(): Any? = unwrap(this).getOptions()

    /**
     * A builder for [EvaluationFormNumericQuestionPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param automation The automation properties of the numeric question.
       */
      public fun automation(automation: IResolvable)

      /**
       * @param automation The automation properties of the numeric question.
       */
      public fun automation(automation: EvaluationFormNumericQuestionAutomationProperty)

      /**
       * @param automation The automation properties of the numeric question.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c698dd5314d7b0a87b42190cf4aeb546028b5d817bd9c0f9b274e1ca785890af")
      public
          fun automation(automation: EvaluationFormNumericQuestionAutomationProperty.Builder.() -> Unit)

      /**
       * @param maxValue The maximum answer value. 
       */
      public fun maxValue(maxValue: Number)

      /**
       * @param minValue The minimum answer value. 
       */
      public fun minValue(minValue: Number)

      /**
       * @param options The scoring options of the numeric question.
       */
      public fun options(options: IResolvable)

      /**
       * @param options The scoring options of the numeric question.
       */
      public fun options(options: List<Any>)

      /**
       * @param options The scoring options of the numeric question.
       */
      public fun options(vararg options: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty.builder()

      /**
       * @param automation The automation properties of the numeric question.
       */
      override fun automation(automation: IResolvable) {
        cdkBuilder.automation(automation.let(IResolvable::unwrap))
      }

      /**
       * @param automation The automation properties of the numeric question.
       */
      override fun automation(automation: EvaluationFormNumericQuestionAutomationProperty) {
        cdkBuilder.automation(automation.let(EvaluationFormNumericQuestionAutomationProperty::unwrap))
      }

      /**
       * @param automation The automation properties of the numeric question.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c698dd5314d7b0a87b42190cf4aeb546028b5d817bd9c0f9b274e1ca785890af")
      override
          fun automation(automation: EvaluationFormNumericQuestionAutomationProperty.Builder.() -> Unit):
          Unit = automation(EvaluationFormNumericQuestionAutomationProperty(automation))

      /**
       * @param maxValue The maximum answer value. 
       */
      override fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
      }

      /**
       * @param minValue The minimum answer value. 
       */
      override fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
      }

      /**
       * @param options The scoring options of the numeric question.
       */
      override fun options(options: IResolvable) {
        cdkBuilder.options(options.let(IResolvable::unwrap))
      }

      /**
       * @param options The scoring options of the numeric question.
       */
      override fun options(options: List<Any>) {
        cdkBuilder.options(options)
      }

      /**
       * @param options The scoring options of the numeric question.
       */
      override fun options(vararg options: Any): Unit = options(options.toList())

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty,
    ) : CdkObject(cdkObject), EvaluationFormNumericQuestionPropertiesProperty {
      /**
       * The automation properties of the numeric question.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionproperties.html#cfn-connect-evaluationform-evaluationformnumericquestionproperties-automation)
       */
      override fun automation(): Any? = unwrap(this).getAutomation()

      /**
       * The maximum answer value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionproperties.html#cfn-connect-evaluationform-evaluationformnumericquestionproperties-maxvalue)
       */
      override fun maxValue(): Number = unwrap(this).getMaxValue()

      /**
       * The minimum answer value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionproperties.html#cfn-connect-evaluationform-evaluationformnumericquestionproperties-minvalue)
       */
      override fun minValue(): Number = unwrap(this).getMinValue()

      /**
       * The scoring options of the numeric question.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionproperties.html#cfn-connect-evaluationform-evaluationformnumericquestionproperties-options)
       */
      override fun options(): Any? = unwrap(this).getOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormNumericQuestionPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty):
          EvaluationFormNumericQuestionPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormNumericQuestionPropertiesProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty
    }
  }

  public interface SingleSelectQuestionRuleCategoryAutomationProperty {
    /**
     * The category name, as defined in Rules.
     *
     * *Minimum* : 1
     *
     * *Maximum* : 50
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-singleselectquestionrulecategoryautomation.html#cfn-connect-evaluationform-singleselectquestionrulecategoryautomation-category)
     */
    public fun category(): String

    /**
     * The condition to apply for the automation option.
     *
     * If the condition is PRESENT, then the option is applied when the contact data includes the
     * category. Similarly, if the condition is NOT_PRESENT, then the option is applied when the
     * contact data does not include the category.
     *
     * *Allowed values* : `PRESENT` | `NOT_PRESENT`
     *
     * *Maximum* : 50
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-singleselectquestionrulecategoryautomation.html#cfn-connect-evaluationform-singleselectquestionrulecategoryautomation-condition)
     */
    public fun condition(): String

    /**
     * The identifier of the answer option. An identifier must be unique within the question.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 40.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-singleselectquestionrulecategoryautomation.html#cfn-connect-evaluationform-singleselectquestionrulecategoryautomation-optionrefid)
     */
    public fun optionRefId(): String

    /**
     * A builder for [SingleSelectQuestionRuleCategoryAutomationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param category The category name, as defined in Rules. 
       * *Minimum* : 1
       *
       * *Maximum* : 50
       */
      public fun category(category: String)

      /**
       * @param condition The condition to apply for the automation option. 
       * If the condition is PRESENT, then the option is applied when the contact data includes the
       * category. Similarly, if the condition is NOT_PRESENT, then the option is applied when the
       * contact data does not include the category.
       *
       * *Allowed values* : `PRESENT` | `NOT_PRESENT`
       *
       * *Maximum* : 50
       */
      public fun condition(condition: String)

      /**
       * @param optionRefId The identifier of the answer option. An identifier must be unique within
       * the question. 
       * *Length Constraints* : Minimum length of 1. Maximum length of 40.
       */
      public fun optionRefId(optionRefId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty.builder()

      /**
       * @param category The category name, as defined in Rules. 
       * *Minimum* : 1
       *
       * *Maximum* : 50
       */
      override fun category(category: String) {
        cdkBuilder.category(category)
      }

      /**
       * @param condition The condition to apply for the automation option. 
       * If the condition is PRESENT, then the option is applied when the contact data includes the
       * category. Similarly, if the condition is NOT_PRESENT, then the option is applied when the
       * contact data does not include the category.
       *
       * *Allowed values* : `PRESENT` | `NOT_PRESENT`
       *
       * *Maximum* : 50
       */
      override fun condition(condition: String) {
        cdkBuilder.condition(condition)
      }

      /**
       * @param optionRefId The identifier of the answer option. An identifier must be unique within
       * the question. 
       * *Length Constraints* : Minimum length of 1. Maximum length of 40.
       */
      override fun optionRefId(optionRefId: String) {
        cdkBuilder.optionRefId(optionRefId)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty,
    ) : CdkObject(cdkObject), SingleSelectQuestionRuleCategoryAutomationProperty {
      /**
       * The category name, as defined in Rules.
       *
       * *Minimum* : 1
       *
       * *Maximum* : 50
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-singleselectquestionrulecategoryautomation.html#cfn-connect-evaluationform-singleselectquestionrulecategoryautomation-category)
       */
      override fun category(): String = unwrap(this).getCategory()

      /**
       * The condition to apply for the automation option.
       *
       * If the condition is PRESENT, then the option is applied when the contact data includes the
       * category. Similarly, if the condition is NOT_PRESENT, then the option is applied when the
       * contact data does not include the category.
       *
       * *Allowed values* : `PRESENT` | `NOT_PRESENT`
       *
       * *Maximum* : 50
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-singleselectquestionrulecategoryautomation.html#cfn-connect-evaluationform-singleselectquestionrulecategoryautomation-condition)
       */
      override fun condition(): String = unwrap(this).getCondition()

      /**
       * The identifier of the answer option. An identifier must be unique within the question.
       *
       * *Length Constraints* : Minimum length of 1. Maximum length of 40.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-singleselectquestionrulecategoryautomation.html#cfn-connect-evaluationform-singleselectquestionrulecategoryautomation-optionrefid)
       */
      override fun optionRefId(): String = unwrap(this).getOptionRefId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SingleSelectQuestionRuleCategoryAutomationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty):
          SingleSelectQuestionRuleCategoryAutomationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleSelectQuestionRuleCategoryAutomationProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnEvaluationForm.SingleSelectQuestionRuleCategoryAutomationProperty
    }
  }

  public interface EvaluationFormSingleSelectQuestionPropertiesProperty {
    /**
     * The display mode of the single select question.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionproperties.html#cfn-connect-evaluationform-evaluationformsingleselectquestionproperties-automation)
     */
    public fun automation(): Any? = unwrap(this).getAutomation()

    /**
     * The display mode of the single select question.
     *
     * *Allowed values* : `DROPDOWN` | `RADIO`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionproperties.html#cfn-connect-evaluationform-evaluationformsingleselectquestionproperties-displayas)
     */
    public fun displayAs(): String? = unwrap(this).getDisplayAs()

    /**
     * The answer options of the single select question.
     *
     * *Minimum* : 2
     *
     * *Maximum* : 256
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionproperties.html#cfn-connect-evaluationform-evaluationformsingleselectquestionproperties-options)
     */
    public fun options(): Any

    /**
     * A builder for [EvaluationFormSingleSelectQuestionPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param automation The display mode of the single select question.
       */
      public fun automation(automation: IResolvable)

      /**
       * @param automation The display mode of the single select question.
       */
      public fun automation(automation: EvaluationFormSingleSelectQuestionAutomationProperty)

      /**
       * @param automation The display mode of the single select question.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9894990d64228a53c80be65a65f4e5421d5e66c52b694c5709d0bd3219bff93")
      public
          fun automation(automation: EvaluationFormSingleSelectQuestionAutomationProperty.Builder.() -> Unit)

      /**
       * @param displayAs The display mode of the single select question.
       * *Allowed values* : `DROPDOWN` | `RADIO`
       */
      public fun displayAs(displayAs: String)

      /**
       * @param options The answer options of the single select question. 
       * *Minimum* : 2
       *
       * *Maximum* : 256
       */
      public fun options(options: IResolvable)

      /**
       * @param options The answer options of the single select question. 
       * *Minimum* : 2
       *
       * *Maximum* : 256
       */
      public fun options(options: List<Any>)

      /**
       * @param options The answer options of the single select question. 
       * *Minimum* : 2
       *
       * *Maximum* : 256
       */
      public fun options(vararg options: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty.builder()

      /**
       * @param automation The display mode of the single select question.
       */
      override fun automation(automation: IResolvable) {
        cdkBuilder.automation(automation.let(IResolvable::unwrap))
      }

      /**
       * @param automation The display mode of the single select question.
       */
      override fun automation(automation: EvaluationFormSingleSelectQuestionAutomationProperty) {
        cdkBuilder.automation(automation.let(EvaluationFormSingleSelectQuestionAutomationProperty::unwrap))
      }

      /**
       * @param automation The display mode of the single select question.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9894990d64228a53c80be65a65f4e5421d5e66c52b694c5709d0bd3219bff93")
      override
          fun automation(automation: EvaluationFormSingleSelectQuestionAutomationProperty.Builder.() -> Unit):
          Unit = automation(EvaluationFormSingleSelectQuestionAutomationProperty(automation))

      /**
       * @param displayAs The display mode of the single select question.
       * *Allowed values* : `DROPDOWN` | `RADIO`
       */
      override fun displayAs(displayAs: String) {
        cdkBuilder.displayAs(displayAs)
      }

      /**
       * @param options The answer options of the single select question. 
       * *Minimum* : 2
       *
       * *Maximum* : 256
       */
      override fun options(options: IResolvable) {
        cdkBuilder.options(options.let(IResolvable::unwrap))
      }

      /**
       * @param options The answer options of the single select question. 
       * *Minimum* : 2
       *
       * *Maximum* : 256
       */
      override fun options(options: List<Any>) {
        cdkBuilder.options(options)
      }

      /**
       * @param options The answer options of the single select question. 
       * *Minimum* : 2
       *
       * *Maximum* : 256
       */
      override fun options(vararg options: Any): Unit = options(options.toList())

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty,
    ) : CdkObject(cdkObject), EvaluationFormSingleSelectQuestionPropertiesProperty {
      /**
       * The display mode of the single select question.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionproperties.html#cfn-connect-evaluationform-evaluationformsingleselectquestionproperties-automation)
       */
      override fun automation(): Any? = unwrap(this).getAutomation()

      /**
       * The display mode of the single select question.
       *
       * *Allowed values* : `DROPDOWN` | `RADIO`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionproperties.html#cfn-connect-evaluationform-evaluationformsingleselectquestionproperties-displayas)
       */
      override fun displayAs(): String? = unwrap(this).getDisplayAs()

      /**
       * The answer options of the single select question.
       *
       * *Minimum* : 2
       *
       * *Maximum* : 256
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionproperties.html#cfn-connect-evaluationform-evaluationformsingleselectquestionproperties-options)
       */
      override fun options(): Any = unwrap(this).getOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormSingleSelectQuestionPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty):
          EvaluationFormSingleSelectQuestionPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormSingleSelectQuestionPropertiesProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty
    }
  }

  public interface EvaluationFormSingleSelectQuestionOptionProperty {
    /**
     * The flag to mark the option as automatic fail.
     *
     * If an automatic fail answer is provided, the overall evaluation gets a score of 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionoption.html#cfn-connect-evaluationform-evaluationformsingleselectquestionoption-automaticfail)
     */
    public fun automaticFail(): Any? = unwrap(this).getAutomaticFail()

    /**
     * The identifier of the answer option. An identifier must be unique within the question.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 40.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionoption.html#cfn-connect-evaluationform-evaluationformsingleselectquestionoption-refid)
     */
    public fun refId(): String

    /**
     * The score assigned to the answer option.
     *
     * *Minimum* : 0
     *
     * *Maximum* : 10
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionoption.html#cfn-connect-evaluationform-evaluationformsingleselectquestionoption-score)
     */
    public fun score(): Number? = unwrap(this).getScore()

    /**
     * The title of the answer option.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionoption.html#cfn-connect-evaluationform-evaluationformsingleselectquestionoption-text)
     */
    public fun text(): String

    /**
     * A builder for [EvaluationFormSingleSelectQuestionOptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param automaticFail The flag to mark the option as automatic fail.
       * If an automatic fail answer is provided, the overall evaluation gets a score of 0.
       */
      public fun automaticFail(automaticFail: Boolean)

      /**
       * @param automaticFail The flag to mark the option as automatic fail.
       * If an automatic fail answer is provided, the overall evaluation gets a score of 0.
       */
      public fun automaticFail(automaticFail: IResolvable)

      /**
       * @param refId The identifier of the answer option. An identifier must be unique within the
       * question. 
       * *Length Constraints* : Minimum length of 1. Maximum length of 40.
       */
      public fun refId(refId: String)

      /**
       * @param score The score assigned to the answer option.
       * *Minimum* : 0
       *
       * *Maximum* : 10
       */
      public fun score(score: Number)

      /**
       * @param text The title of the answer option. 
       * *Length Constraints* : Minimum length of 1. Maximum length of 128.
       */
      public fun text(text: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty.builder()

      /**
       * @param automaticFail The flag to mark the option as automatic fail.
       * If an automatic fail answer is provided, the overall evaluation gets a score of 0.
       */
      override fun automaticFail(automaticFail: Boolean) {
        cdkBuilder.automaticFail(automaticFail)
      }

      /**
       * @param automaticFail The flag to mark the option as automatic fail.
       * If an automatic fail answer is provided, the overall evaluation gets a score of 0.
       */
      override fun automaticFail(automaticFail: IResolvable) {
        cdkBuilder.automaticFail(automaticFail.let(IResolvable::unwrap))
      }

      /**
       * @param refId The identifier of the answer option. An identifier must be unique within the
       * question. 
       * *Length Constraints* : Minimum length of 1. Maximum length of 40.
       */
      override fun refId(refId: String) {
        cdkBuilder.refId(refId)
      }

      /**
       * @param score The score assigned to the answer option.
       * *Minimum* : 0
       *
       * *Maximum* : 10
       */
      override fun score(score: Number) {
        cdkBuilder.score(score)
      }

      /**
       * @param text The title of the answer option. 
       * *Length Constraints* : Minimum length of 1. Maximum length of 128.
       */
      override fun text(text: String) {
        cdkBuilder.text(text)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty,
    ) : CdkObject(cdkObject), EvaluationFormSingleSelectQuestionOptionProperty {
      /**
       * The flag to mark the option as automatic fail.
       *
       * If an automatic fail answer is provided, the overall evaluation gets a score of 0.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionoption.html#cfn-connect-evaluationform-evaluationformsingleselectquestionoption-automaticfail)
       */
      override fun automaticFail(): Any? = unwrap(this).getAutomaticFail()

      /**
       * The identifier of the answer option. An identifier must be unique within the question.
       *
       * *Length Constraints* : Minimum length of 1. Maximum length of 40.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionoption.html#cfn-connect-evaluationform-evaluationformsingleselectquestionoption-refid)
       */
      override fun refId(): String = unwrap(this).getRefId()

      /**
       * The score assigned to the answer option.
       *
       * *Minimum* : 0
       *
       * *Maximum* : 10
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionoption.html#cfn-connect-evaluationform-evaluationformsingleselectquestionoption-score)
       */
      override fun score(): Number? = unwrap(this).getScore()

      /**
       * The title of the answer option.
       *
       * *Length Constraints* : Minimum length of 1. Maximum length of 128.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionoption.html#cfn-connect-evaluationform-evaluationformsingleselectquestionoption-text)
       */
      override fun text(): String = unwrap(this).getText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormSingleSelectQuestionOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty):
          EvaluationFormSingleSelectQuestionOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormSingleSelectQuestionOptionProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty
    }
  }

  public interface ScoringStrategyProperty {
    /**
     * The scoring mode of the evaluation form.
     *
     * *Allowed values* : `QUESTION_ONLY` | `SECTION_ONLY`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-scoringstrategy.html#cfn-connect-evaluationform-scoringstrategy-mode)
     */
    public fun mode(): String

    /**
     * The scoring status of the evaluation form.
     *
     * *Allowed values* : `ENABLED` | `DISABLED`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-scoringstrategy.html#cfn-connect-evaluationform-scoringstrategy-status)
     */
    public fun status(): String

    /**
     * A builder for [ScoringStrategyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mode The scoring mode of the evaluation form. 
       * *Allowed values* : `QUESTION_ONLY` | `SECTION_ONLY`
       */
      public fun mode(mode: String)

      /**
       * @param status The scoring status of the evaluation form. 
       * *Allowed values* : `ENABLED` | `DISABLED`
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.ScoringStrategyProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.ScoringStrategyProperty.builder()

      /**
       * @param mode The scoring mode of the evaluation form. 
       * *Allowed values* : `QUESTION_ONLY` | `SECTION_ONLY`
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      /**
       * @param status The scoring status of the evaluation form. 
       * *Allowed values* : `ENABLED` | `DISABLED`
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.ScoringStrategyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.ScoringStrategyProperty,
    ) : CdkObject(cdkObject), ScoringStrategyProperty {
      /**
       * The scoring mode of the evaluation form.
       *
       * *Allowed values* : `QUESTION_ONLY` | `SECTION_ONLY`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-scoringstrategy.html#cfn-connect-evaluationform-scoringstrategy-mode)
       */
      override fun mode(): String = unwrap(this).getMode()

      /**
       * The scoring status of the evaluation form.
       *
       * *Allowed values* : `ENABLED` | `DISABLED`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-scoringstrategy.html#cfn-connect-evaluationform-scoringstrategy-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScoringStrategyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.ScoringStrategyProperty):
          ScoringStrategyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScoringStrategyProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.ScoringStrategyProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnEvaluationForm.ScoringStrategyProperty
    }
  }

  public interface EvaluationFormBaseItemProperty {
    /**
     * A subsection or inner section of an item.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformbaseitem.html#cfn-connect-evaluationform-evaluationformbaseitem-section)
     */
    public fun section(): Any

    /**
     * A builder for [EvaluationFormBaseItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param section A subsection or inner section of an item. 
       */
      public fun section(section: IResolvable)

      /**
       * @param section A subsection or inner section of an item. 
       */
      public fun section(section: EvaluationFormSectionProperty)

      /**
       * @param section A subsection or inner section of an item. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("75f7b8dd462ca67cd3a8ed539fc8fad8338912c53c9442851afc351f9dc203fe")
      public fun section(section: EvaluationFormSectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormBaseItemProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormBaseItemProperty.builder()

      /**
       * @param section A subsection or inner section of an item. 
       */
      override fun section(section: IResolvable) {
        cdkBuilder.section(section.let(IResolvable::unwrap))
      }

      /**
       * @param section A subsection or inner section of an item. 
       */
      override fun section(section: EvaluationFormSectionProperty) {
        cdkBuilder.section(section.let(EvaluationFormSectionProperty::unwrap))
      }

      /**
       * @param section A subsection or inner section of an item. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("75f7b8dd462ca67cd3a8ed539fc8fad8338912c53c9442851afc351f9dc203fe")
      override fun section(section: EvaluationFormSectionProperty.Builder.() -> Unit): Unit =
          section(EvaluationFormSectionProperty(section))

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormBaseItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormBaseItemProperty,
    ) : CdkObject(cdkObject), EvaluationFormBaseItemProperty {
      /**
       * A subsection or inner section of an item.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformbaseitem.html#cfn-connect-evaluationform-evaluationformbaseitem-section)
       */
      override fun section(): Any = unwrap(this).getSection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EvaluationFormBaseItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormBaseItemProperty):
          EvaluationFormBaseItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormBaseItemProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormBaseItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormBaseItemProperty
    }
  }

  public interface EvaluationFormNumericQuestionOptionProperty {
    /**
     * The flag to mark the option as automatic fail.
     *
     * If an automatic fail answer is provided, the overall evaluation gets a score of 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionoption.html#cfn-connect-evaluationform-evaluationformnumericquestionoption-automaticfail)
     */
    public fun automaticFail(): Any? = unwrap(this).getAutomaticFail()

    /**
     * The maximum answer value of the range option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionoption.html#cfn-connect-evaluationform-evaluationformnumericquestionoption-maxvalue)
     */
    public fun maxValue(): Number

    /**
     * The minimum answer value of the range option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionoption.html#cfn-connect-evaluationform-evaluationformnumericquestionoption-minvalue)
     */
    public fun minValue(): Number

    /**
     * The score assigned to answer values within the range option.
     *
     * *Minimum* : 0
     *
     * *Maximum* : 10
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionoption.html#cfn-connect-evaluationform-evaluationformnumericquestionoption-score)
     */
    public fun score(): Number? = unwrap(this).getScore()

    /**
     * A builder for [EvaluationFormNumericQuestionOptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param automaticFail The flag to mark the option as automatic fail.
       * If an automatic fail answer is provided, the overall evaluation gets a score of 0.
       */
      public fun automaticFail(automaticFail: Boolean)

      /**
       * @param automaticFail The flag to mark the option as automatic fail.
       * If an automatic fail answer is provided, the overall evaluation gets a score of 0.
       */
      public fun automaticFail(automaticFail: IResolvable)

      /**
       * @param maxValue The maximum answer value of the range option. 
       */
      public fun maxValue(maxValue: Number)

      /**
       * @param minValue The minimum answer value of the range option. 
       */
      public fun minValue(minValue: Number)

      /**
       * @param score The score assigned to answer values within the range option.
       * *Minimum* : 0
       *
       * *Maximum* : 10
       */
      public fun score(score: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty.builder()

      /**
       * @param automaticFail The flag to mark the option as automatic fail.
       * If an automatic fail answer is provided, the overall evaluation gets a score of 0.
       */
      override fun automaticFail(automaticFail: Boolean) {
        cdkBuilder.automaticFail(automaticFail)
      }

      /**
       * @param automaticFail The flag to mark the option as automatic fail.
       * If an automatic fail answer is provided, the overall evaluation gets a score of 0.
       */
      override fun automaticFail(automaticFail: IResolvable) {
        cdkBuilder.automaticFail(automaticFail.let(IResolvable::unwrap))
      }

      /**
       * @param maxValue The maximum answer value of the range option. 
       */
      override fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
      }

      /**
       * @param minValue The minimum answer value of the range option. 
       */
      override fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
      }

      /**
       * @param score The score assigned to answer values within the range option.
       * *Minimum* : 0
       *
       * *Maximum* : 10
       */
      override fun score(score: Number) {
        cdkBuilder.score(score)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty,
    ) : CdkObject(cdkObject), EvaluationFormNumericQuestionOptionProperty {
      /**
       * The flag to mark the option as automatic fail.
       *
       * If an automatic fail answer is provided, the overall evaluation gets a score of 0.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionoption.html#cfn-connect-evaluationform-evaluationformnumericquestionoption-automaticfail)
       */
      override fun automaticFail(): Any? = unwrap(this).getAutomaticFail()

      /**
       * The maximum answer value of the range option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionoption.html#cfn-connect-evaluationform-evaluationformnumericquestionoption-maxvalue)
       */
      override fun maxValue(): Number = unwrap(this).getMaxValue()

      /**
       * The minimum answer value of the range option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionoption.html#cfn-connect-evaluationform-evaluationformnumericquestionoption-minvalue)
       */
      override fun minValue(): Number = unwrap(this).getMinValue()

      /**
       * The score assigned to answer values within the range option.
       *
       * *Minimum* : 0
       *
       * *Maximum* : 10
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionoption.html#cfn-connect-evaluationform-evaluationformnumericquestionoption-score)
       */
      override fun score(): Number? = unwrap(this).getScore()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormNumericQuestionOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty):
          EvaluationFormNumericQuestionOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormNumericQuestionOptionProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionOptionProperty
    }
  }

  public interface NumericQuestionPropertyValueAutomationProperty {
    /**
     * The property label of the automation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-numericquestionpropertyvalueautomation.html#cfn-connect-evaluationform-numericquestionpropertyvalueautomation-label)
     */
    public fun label(): String

    /**
     * A builder for [NumericQuestionPropertyValueAutomationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param label The property label of the automation. 
       */
      public fun label(label: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty.builder()

      /**
       * @param label The property label of the automation. 
       */
      override fun label(label: String) {
        cdkBuilder.label(label)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty,
    ) : CdkObject(cdkObject), NumericQuestionPropertyValueAutomationProperty {
      /**
       * The property label of the automation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-numericquestionpropertyvalueautomation.html#cfn-connect-evaluationform-numericquestionpropertyvalueautomation-label)
       */
      override fun label(): String = unwrap(this).getLabel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NumericQuestionPropertyValueAutomationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty):
          NumericQuestionPropertyValueAutomationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NumericQuestionPropertyValueAutomationProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty
    }
  }

  public interface EvaluationFormNumericQuestionAutomationProperty {
    /**
     * The property value of the automation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionautomation.html#cfn-connect-evaluationform-evaluationformnumericquestionautomation-propertyvalue)
     */
    public fun propertyValue(): Any

    /**
     * A builder for [EvaluationFormNumericQuestionAutomationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param propertyValue The property value of the automation. 
       */
      public fun propertyValue(propertyValue: IResolvable)

      /**
       * @param propertyValue The property value of the automation. 
       */
      public fun propertyValue(propertyValue: NumericQuestionPropertyValueAutomationProperty)

      /**
       * @param propertyValue The property value of the automation. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1b7fb14f46a5514785021373b865ef90fc264cc00a77fd4e30965d5c7f300a6")
      public
          fun propertyValue(propertyValue: NumericQuestionPropertyValueAutomationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty.builder()

      /**
       * @param propertyValue The property value of the automation. 
       */
      override fun propertyValue(propertyValue: IResolvable) {
        cdkBuilder.propertyValue(propertyValue.let(IResolvable::unwrap))
      }

      /**
       * @param propertyValue The property value of the automation. 
       */
      override fun propertyValue(propertyValue: NumericQuestionPropertyValueAutomationProperty) {
        cdkBuilder.propertyValue(propertyValue.let(NumericQuestionPropertyValueAutomationProperty::unwrap))
      }

      /**
       * @param propertyValue The property value of the automation. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1b7fb14f46a5514785021373b865ef90fc264cc00a77fd4e30965d5c7f300a6")
      override
          fun propertyValue(propertyValue: NumericQuestionPropertyValueAutomationProperty.Builder.() -> Unit):
          Unit = propertyValue(NumericQuestionPropertyValueAutomationProperty(propertyValue))

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty,
    ) : CdkObject(cdkObject), EvaluationFormNumericQuestionAutomationProperty {
      /**
       * The property value of the automation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformnumericquestionautomation.html#cfn-connect-evaluationform-evaluationformnumericquestionautomation-propertyvalue)
       */
      override fun propertyValue(): Any = unwrap(this).getPropertyValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormNumericQuestionAutomationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty):
          EvaluationFormNumericQuestionAutomationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormNumericQuestionAutomationProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty
    }
  }

  public interface EvaluationFormSingleSelectQuestionAutomationOptionProperty {
    /**
     * The automation option based on a rule category for the single select question.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionautomationoption.html#cfn-connect-evaluationform-evaluationformsingleselectquestionautomationoption-rulecategory)
     */
    public fun ruleCategory(): Any

    /**
     * A builder for [EvaluationFormSingleSelectQuestionAutomationOptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ruleCategory The automation option based on a rule category for the single select
       * question. 
       */
      public fun ruleCategory(ruleCategory: IResolvable)

      /**
       * @param ruleCategory The automation option based on a rule category for the single select
       * question. 
       */
      public fun ruleCategory(ruleCategory: SingleSelectQuestionRuleCategoryAutomationProperty)

      /**
       * @param ruleCategory The automation option based on a rule category for the single select
       * question. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5e2ff25c6d03de1cc3b1528c68ff95d0a888f949e0c19b008f08358a9feb587")
      public
          fun ruleCategory(ruleCategory: SingleSelectQuestionRuleCategoryAutomationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()

      /**
       * @param ruleCategory The automation option based on a rule category for the single select
       * question. 
       */
      override fun ruleCategory(ruleCategory: IResolvable) {
        cdkBuilder.ruleCategory(ruleCategory.let(IResolvable::unwrap))
      }

      /**
       * @param ruleCategory The automation option based on a rule category for the single select
       * question. 
       */
      override fun ruleCategory(ruleCategory: SingleSelectQuestionRuleCategoryAutomationProperty) {
        cdkBuilder.ruleCategory(ruleCategory.let(SingleSelectQuestionRuleCategoryAutomationProperty::unwrap))
      }

      /**
       * @param ruleCategory The automation option based on a rule category for the single select
       * question. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5e2ff25c6d03de1cc3b1528c68ff95d0a888f949e0c19b008f08358a9feb587")
      override
          fun ruleCategory(ruleCategory: SingleSelectQuestionRuleCategoryAutomationProperty.Builder.() -> Unit):
          Unit = ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty(ruleCategory))

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty,
    ) : CdkObject(cdkObject), EvaluationFormSingleSelectQuestionAutomationOptionProperty {
      /**
       * The automation option based on a rule category for the single select question.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionautomationoption.html#cfn-connect-evaluationform-evaluationformsingleselectquestionautomationoption-rulecategory)
       */
      override fun ruleCategory(): Any = unwrap(this).getRuleCategory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EvaluationFormSingleSelectQuestionAutomationOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty):
          EvaluationFormSingleSelectQuestionAutomationOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormSingleSelectQuestionAutomationOptionProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationOptionProperty
    }
  }

  public interface EvaluationFormSectionProperty {
    /**
     * The instructions of the section.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsection.html#cfn-connect-evaluationform-evaluationformsection-instructions)
     */
    public fun instructions(): String? = unwrap(this).getInstructions()

    /**
     * The items of the section.
     *
     * *Minimum* : 1
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsection.html#cfn-connect-evaluationform-evaluationformsection-items)
     */
    public fun items(): Any? = unwrap(this).getItems()

    /**
     * The identifier of the section. An identifier must be unique within the evaluation form.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 40.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsection.html#cfn-connect-evaluationform-evaluationformsection-refid)
     */
    public fun refId(): String

    /**
     * The title of the section.
     *
     * *Length Constraints* : Minimum length of 1. Maximum length of 128.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsection.html#cfn-connect-evaluationform-evaluationformsection-title)
     */
    public fun title(): String

    /**
     * The scoring weight of the section.
     *
     * *Minimum* : 0
     *
     * *Maximum* : 100
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsection.html#cfn-connect-evaluationform-evaluationformsection-weight)
     */
    public fun weight(): Number? = unwrap(this).getWeight()

    /**
     * A builder for [EvaluationFormSectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instructions The instructions of the section.
       */
      public fun instructions(instructions: String)

      /**
       * @param items The items of the section.
       * *Minimum* : 1
       */
      public fun items(items: IResolvable)

      /**
       * @param items The items of the section.
       * *Minimum* : 1
       */
      public fun items(items: List<Any>)

      /**
       * @param items The items of the section.
       * *Minimum* : 1
       */
      public fun items(vararg items: Any)

      /**
       * @param refId The identifier of the section. An identifier must be unique within the
       * evaluation form. 
       * *Length Constraints* : Minimum length of 1. Maximum length of 40.
       */
      public fun refId(refId: String)

      /**
       * @param title The title of the section. 
       * *Length Constraints* : Minimum length of 1. Maximum length of 128.
       */
      public fun title(title: String)

      /**
       * @param weight The scoring weight of the section.
       * *Minimum* : 0
       *
       * *Maximum* : 100
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSectionProperty.Builder
          =
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSectionProperty.builder()

      /**
       * @param instructions The instructions of the section.
       */
      override fun instructions(instructions: String) {
        cdkBuilder.instructions(instructions)
      }

      /**
       * @param items The items of the section.
       * *Minimum* : 1
       */
      override fun items(items: IResolvable) {
        cdkBuilder.items(items.let(IResolvable::unwrap))
      }

      /**
       * @param items The items of the section.
       * *Minimum* : 1
       */
      override fun items(items: List<Any>) {
        cdkBuilder.items(items)
      }

      /**
       * @param items The items of the section.
       * *Minimum* : 1
       */
      override fun items(vararg items: Any): Unit = items(items.toList())

      /**
       * @param refId The identifier of the section. An identifier must be unique within the
       * evaluation form. 
       * *Length Constraints* : Minimum length of 1. Maximum length of 40.
       */
      override fun refId(refId: String) {
        cdkBuilder.refId(refId)
      }

      /**
       * @param title The title of the section. 
       * *Length Constraints* : Minimum length of 1. Maximum length of 128.
       */
      override fun title(title: String) {
        cdkBuilder.title(title)
      }

      /**
       * @param weight The scoring weight of the section.
       * *Minimum* : 0
       *
       * *Maximum* : 100
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSectionProperty,
    ) : CdkObject(cdkObject), EvaluationFormSectionProperty {
      /**
       * The instructions of the section.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsection.html#cfn-connect-evaluationform-evaluationformsection-instructions)
       */
      override fun instructions(): String? = unwrap(this).getInstructions()

      /**
       * The items of the section.
       *
       * *Minimum* : 1
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsection.html#cfn-connect-evaluationform-evaluationformsection-items)
       */
      override fun items(): Any? = unwrap(this).getItems()

      /**
       * The identifier of the section. An identifier must be unique within the evaluation form.
       *
       * *Length Constraints* : Minimum length of 1. Maximum length of 40.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsection.html#cfn-connect-evaluationform-evaluationformsection-refid)
       */
      override fun refId(): String = unwrap(this).getRefId()

      /**
       * The title of the section.
       *
       * *Length Constraints* : Minimum length of 1. Maximum length of 128.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsection.html#cfn-connect-evaluationform-evaluationformsection-title)
       */
      override fun title(): String = unwrap(this).getTitle()

      /**
       * The scoring weight of the section.
       *
       * *Minimum* : 0
       *
       * *Maximum* : 100
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsection.html#cfn-connect-evaluationform-evaluationformsection-weight)
       */
      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EvaluationFormSectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSectionProperty):
          EvaluationFormSectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EvaluationFormSectionProperty):
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSectionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.connect.CfnEvaluationForm.EvaluationFormSectionProperty
    }
  }
}
