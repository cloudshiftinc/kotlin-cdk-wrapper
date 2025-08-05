@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Resource to create a rule set for a Mail Manager ingress endpoint which contains a list of rules
 * that are evaluated sequentially for each email.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * Object drop;
 * CfnMailManagerRuleSet cfnMailManagerRuleSet = CfnMailManagerRuleSet.Builder.create(this,
 * "MyCfnMailManagerRuleSet")
 * .rules(List.of(RuleProperty.builder()
 * .actions(List.of(RuleActionProperty.builder()
 * .addHeader(AddHeaderActionProperty.builder()
 * .headerName("headerName")
 * .headerValue("headerValue")
 * .build())
 * .archive(ArchiveActionProperty.builder()
 * .targetArchive("targetArchive")
 * // the properties below are optional
 * .actionFailurePolicy("actionFailurePolicy")
 * .build())
 * .deliverToMailbox(DeliverToMailboxActionProperty.builder()
 * .mailboxArn("mailboxArn")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .actionFailurePolicy("actionFailurePolicy")
 * .build())
 * .deliverToQBusiness(DeliverToQBusinessActionProperty.builder()
 * .applicationId("applicationId")
 * .indexId("indexId")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .actionFailurePolicy("actionFailurePolicy")
 * .build())
 * .drop(drop)
 * .publishToSns(SnsActionProperty.builder()
 * .roleArn("roleArn")
 * .topicArn("topicArn")
 * // the properties below are optional
 * .actionFailurePolicy("actionFailurePolicy")
 * .encoding("encoding")
 * .payloadType("payloadType")
 * .build())
 * .relay(RelayActionProperty.builder()
 * .relay("relay")
 * // the properties below are optional
 * .actionFailurePolicy("actionFailurePolicy")
 * .mailFrom("mailFrom")
 * .build())
 * .replaceRecipient(ReplaceRecipientActionProperty.builder()
 * .replaceWith(List.of("replaceWith"))
 * .build())
 * .send(SendActionProperty.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .actionFailurePolicy("actionFailurePolicy")
 * .build())
 * .writeToS3(S3ActionProperty.builder()
 * .roleArn("roleArn")
 * .s3Bucket("s3Bucket")
 * // the properties below are optional
 * .actionFailurePolicy("actionFailurePolicy")
 * .s3Prefix("s3Prefix")
 * .s3SseKmsKeyId("s3SseKmsKeyId")
 * .build())
 * .build()))
 * // the properties below are optional
 * .conditions(List.of(RuleConditionProperty.builder()
 * .booleanExpression(RuleBooleanExpressionProperty.builder()
 * .evaluate(RuleBooleanToEvaluateProperty.builder()
 * .analysis(AnalysisProperty.builder()
 * .analyzer("analyzer")
 * .resultField("resultField")
 * .build())
 * .attribute("attribute")
 * .isInAddressList(RuleIsInAddressListProperty.builder()
 * .addressLists(List.of("addressLists"))
 * .attribute("attribute")
 * .build())
 * .build())
 * .operator("operator")
 * .build())
 * .dmarcExpression(RuleDmarcExpressionProperty.builder()
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .ipExpression(RuleIpExpressionProperty.builder()
 * .evaluate(RuleIpToEvaluateProperty.builder()
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .numberExpression(RuleNumberExpressionProperty.builder()
 * .evaluate(RuleNumberToEvaluateProperty.builder()
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .value(123)
 * .build())
 * .stringExpression(RuleStringExpressionProperty.builder()
 * .evaluate(RuleStringToEvaluateProperty.builder()
 * .analysis(AnalysisProperty.builder()
 * .analyzer("analyzer")
 * .resultField("resultField")
 * .build())
 * .attribute("attribute")
 * .mimeHeaderAttribute("mimeHeaderAttribute")
 * .build())
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .verdictExpression(RuleVerdictExpressionProperty.builder()
 * .evaluate(RuleVerdictToEvaluateProperty.builder()
 * .analysis(AnalysisProperty.builder()
 * .analyzer("analyzer")
 * .resultField("resultField")
 * .build())
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .build()))
 * .name("name")
 * .unless(List.of(RuleConditionProperty.builder()
 * .booleanExpression(RuleBooleanExpressionProperty.builder()
 * .evaluate(RuleBooleanToEvaluateProperty.builder()
 * .analysis(AnalysisProperty.builder()
 * .analyzer("analyzer")
 * .resultField("resultField")
 * .build())
 * .attribute("attribute")
 * .isInAddressList(RuleIsInAddressListProperty.builder()
 * .addressLists(List.of("addressLists"))
 * .attribute("attribute")
 * .build())
 * .build())
 * .operator("operator")
 * .build())
 * .dmarcExpression(RuleDmarcExpressionProperty.builder()
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .ipExpression(RuleIpExpressionProperty.builder()
 * .evaluate(RuleIpToEvaluateProperty.builder()
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .numberExpression(RuleNumberExpressionProperty.builder()
 * .evaluate(RuleNumberToEvaluateProperty.builder()
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .value(123)
 * .build())
 * .stringExpression(RuleStringExpressionProperty.builder()
 * .evaluate(RuleStringToEvaluateProperty.builder()
 * .analysis(AnalysisProperty.builder()
 * .analyzer("analyzer")
 * .resultField("resultField")
 * .build())
 * .attribute("attribute")
 * .mimeHeaderAttribute("mimeHeaderAttribute")
 * .build())
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .verdictExpression(RuleVerdictExpressionProperty.builder()
 * .evaluate(RuleVerdictToEvaluateProperty.builder()
 * .analysis(AnalysisProperty.builder()
 * .analyzer("analyzer")
 * .resultField("resultField")
 * .build())
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .build()))
 * .build()))
 * // the properties below are optional
 * .ruleSetName("ruleSetName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html)
 */
public open class CfnMailManagerRuleSet(
  cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMailManagerRuleSetProps,
  ) :
      this(software.amazon.awscdk.services.ses.CfnMailManagerRuleSet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMailManagerRuleSetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMailManagerRuleSetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMailManagerRuleSetProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the rule set resource.
   */
  public open fun attrRuleSetArn(): String = unwrap(this).getAttrRuleSetArn()

  /**
   * The identifier of the rule set.
   */
  public open fun attrRuleSetId(): String = unwrap(this).getAttrRuleSetId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A user-friendly name for the rule set.
   */
  public open fun ruleSetName(): String? = unwrap(this).getRuleSetName()

  /**
   * A user-friendly name for the rule set.
   */
  public open fun ruleSetName(`value`: String) {
    unwrap(this).setRuleSetName(`value`)
  }

  /**
   * Conditional rules that are evaluated for determining actions on email.
   */
  public open fun rules(): Any = unwrap(this).getRules()

  /**
   * Conditional rules that are evaluated for determining actions on email.
   */
  public open fun rules(`value`: IResolvable) {
    unwrap(this).setRules(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Conditional rules that are evaluated for determining actions on email.
   */
  public open fun rules(`value`: List<Any>) {
    unwrap(this).setRules(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Conditional rules that are evaluated for determining actions on email.
   */
  public open fun rules(vararg `value`: Any): Unit = rules(`value`.toList())

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnMailManagerRuleSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A user-friendly name for the rule set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-rulesetname)
     * @param ruleSetName A user-friendly name for the rule set. 
     */
    public fun ruleSetName(ruleSetName: String)

    /**
     * Conditional rules that are evaluated for determining actions on email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-rules)
     * @param rules Conditional rules that are evaluated for determining actions on email. 
     */
    public fun rules(rules: IResolvable)

    /**
     * Conditional rules that are evaluated for determining actions on email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-rules)
     * @param rules Conditional rules that are evaluated for determining actions on email. 
     */
    public fun rules(rules: List<Any>)

    /**
     * Conditional rules that are evaluated for determining actions on email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-rules)
     * @param rules Conditional rules that are evaluated for determining actions on email. 
     */
    public fun rules(vararg rules: Any)

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.Builder =
        software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.Builder.create(scope, id)

    /**
     * A user-friendly name for the rule set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-rulesetname)
     * @param ruleSetName A user-friendly name for the rule set. 
     */
    override fun ruleSetName(ruleSetName: String) {
      cdkBuilder.ruleSetName(ruleSetName)
    }

    /**
     * Conditional rules that are evaluated for determining actions on email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-rules)
     * @param rules Conditional rules that are evaluated for determining actions on email. 
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable.Companion::unwrap))
    }

    /**
     * Conditional rules that are evaluated for determining actions on email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-rules)
     * @param rules Conditional rules that are evaluated for determining actions on email. 
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Conditional rules that are evaluated for determining actions on email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-rules)
     * @param rules Conditional rules that are evaluated for determining actions on email. 
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagerruleset.html#cfn-ses-mailmanagerruleset-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerRuleSet =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMailManagerRuleSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMailManagerRuleSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet):
        CfnMailManagerRuleSet = CfnMailManagerRuleSet(cdkObject)

    internal fun unwrap(wrapped: CfnMailManagerRuleSet):
        software.amazon.awscdk.services.ses.CfnMailManagerRuleSet = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.CfnMailManagerRuleSet
  }

  /**
   * The action to add a header to a message.
   *
   * When executed, this action will add the given header to the message.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * AddHeaderActionProperty addHeaderActionProperty = AddHeaderActionProperty.builder()
   * .headerName("headerName")
   * .headerValue("headerValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-addheaderaction.html)
   */
  public interface AddHeaderActionProperty {
    /**
     * The name of the header to add to an email.
     *
     * The header must be prefixed with "X-". Headers are added regardless of whether the header
     * name pre-existed in the email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-addheaderaction.html#cfn-ses-mailmanagerruleset-addheaderaction-headername)
     */
    public fun headerName(): String

    /**
     * The value of the header to add to the email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-addheaderaction.html#cfn-ses-mailmanagerruleset-addheaderaction-headervalue)
     */
    public fun headerValue(): String

    /**
     * A builder for [AddHeaderActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param headerName The name of the header to add to an email. 
       * The header must be prefixed with "X-". Headers are added regardless of whether the header
       * name pre-existed in the email.
       */
      public fun headerName(headerName: String)

      /**
       * @param headerValue The value of the header to add to the email. 
       */
      public fun headerValue(headerValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.AddHeaderActionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.AddHeaderActionProperty.builder()

      /**
       * @param headerName The name of the header to add to an email. 
       * The header must be prefixed with "X-". Headers are added regardless of whether the header
       * name pre-existed in the email.
       */
      override fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
      }

      /**
       * @param headerValue The value of the header to add to the email. 
       */
      override fun headerValue(headerValue: String) {
        cdkBuilder.headerValue(headerValue)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.AddHeaderActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.AddHeaderActionProperty,
    ) : CdkObject(cdkObject),
        AddHeaderActionProperty {
      /**
       * The name of the header to add to an email.
       *
       * The header must be prefixed with "X-". Headers are added regardless of whether the header
       * name pre-existed in the email.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-addheaderaction.html#cfn-ses-mailmanagerruleset-addheaderaction-headername)
       */
      override fun headerName(): String = unwrap(this).getHeaderName()

      /**
       * The value of the header to add to the email.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-addheaderaction.html#cfn-ses-mailmanagerruleset-addheaderaction-headervalue)
       */
      override fun headerValue(): String = unwrap(this).getHeaderValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AddHeaderActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.AddHeaderActionProperty):
          AddHeaderActionProperty = CdkObjectWrappers.wrap(cdkObject) as? AddHeaderActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddHeaderActionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.AddHeaderActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.AddHeaderActionProperty
    }
  }

  /**
   * The result of an analysis can be used in conditions to trigger actions.
   *
   * Analyses can inspect the email content and report a certain aspect of the email.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * AnalysisProperty analysisProperty = AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-analysis.html)
   */
  public interface AnalysisProperty {
    /**
     * The Amazon Resource Name (ARN) of an Add On.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-analysis.html#cfn-ses-mailmanagerruleset-analysis-analyzer)
     */
    public fun analyzer(): String

    /**
     * The returned value from an Add On.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-analysis.html#cfn-ses-mailmanagerruleset-analysis-resultfield)
     */
    public fun resultField(): String

    /**
     * A builder for [AnalysisProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param analyzer The Amazon Resource Name (ARN) of an Add On. 
       */
      public fun analyzer(analyzer: String)

      /**
       * @param resultField The returned value from an Add On. 
       */
      public fun resultField(resultField: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.AnalysisProperty.Builder =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.AnalysisProperty.builder()

      /**
       * @param analyzer The Amazon Resource Name (ARN) of an Add On. 
       */
      override fun analyzer(analyzer: String) {
        cdkBuilder.analyzer(analyzer)
      }

      /**
       * @param resultField The returned value from an Add On. 
       */
      override fun resultField(resultField: String) {
        cdkBuilder.resultField(resultField)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.AnalysisProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.AnalysisProperty,
    ) : CdkObject(cdkObject),
        AnalysisProperty {
      /**
       * The Amazon Resource Name (ARN) of an Add On.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-analysis.html#cfn-ses-mailmanagerruleset-analysis-analyzer)
       */
      override fun analyzer(): String = unwrap(this).getAnalyzer()

      /**
       * The returned value from an Add On.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-analysis.html#cfn-ses-mailmanagerruleset-analysis-resultfield)
       */
      override fun resultField(): String = unwrap(this).getResultField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AnalysisProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.AnalysisProperty):
          AnalysisProperty = CdkObjectWrappers.wrap(cdkObject) as? AnalysisProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AnalysisProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.AnalysisProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.AnalysisProperty
    }
  }

  /**
   * The action to archive the email by delivering the email to an Amazon SES archive.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * ArchiveActionProperty archiveActionProperty = ArchiveActionProperty.builder()
   * .targetArchive("targetArchive")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-archiveaction.html)
   */
  public interface ArchiveActionProperty {
    /**
     * A policy that states what to do in the case of failure.
     *
     * The action will fail if there are configuration errors. For example, the specified archive
     * has been deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-archiveaction.html#cfn-ses-mailmanagerruleset-archiveaction-actionfailurepolicy)
     */
    public fun actionFailurePolicy(): String? = unwrap(this).getActionFailurePolicy()

    /**
     * The identifier of the archive to send the email to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-archiveaction.html#cfn-ses-mailmanagerruleset-archiveaction-targetarchive)
     */
    public fun targetArchive(): String

    /**
     * A builder for [ArchiveActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionFailurePolicy A policy that states what to do in the case of failure.
       * The action will fail if there are configuration errors. For example, the specified archive
       * has been deleted.
       */
      public fun actionFailurePolicy(actionFailurePolicy: String)

      /**
       * @param targetArchive The identifier of the archive to send the email to. 
       */
      public fun targetArchive(targetArchive: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.ArchiveActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.ArchiveActionProperty.builder()

      /**
       * @param actionFailurePolicy A policy that states what to do in the case of failure.
       * The action will fail if there are configuration errors. For example, the specified archive
       * has been deleted.
       */
      override fun actionFailurePolicy(actionFailurePolicy: String) {
        cdkBuilder.actionFailurePolicy(actionFailurePolicy)
      }

      /**
       * @param targetArchive The identifier of the archive to send the email to. 
       */
      override fun targetArchive(targetArchive: String) {
        cdkBuilder.targetArchive(targetArchive)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.ArchiveActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.ArchiveActionProperty,
    ) : CdkObject(cdkObject),
        ArchiveActionProperty {
      /**
       * A policy that states what to do in the case of failure.
       *
       * The action will fail if there are configuration errors. For example, the specified archive
       * has been deleted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-archiveaction.html#cfn-ses-mailmanagerruleset-archiveaction-actionfailurepolicy)
       */
      override fun actionFailurePolicy(): String? = unwrap(this).getActionFailurePolicy()

      /**
       * The identifier of the archive to send the email to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-archiveaction.html#cfn-ses-mailmanagerruleset-archiveaction-targetarchive)
       */
      override fun targetArchive(): String = unwrap(this).getTargetArchive()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.ArchiveActionProperty):
          ArchiveActionProperty = CdkObjectWrappers.wrap(cdkObject) as? ArchiveActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveActionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.ArchiveActionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.ArchiveActionProperty
    }
  }

  /**
   * This action to delivers an email to a mailbox.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * DeliverToMailboxActionProperty deliverToMailboxActionProperty =
   * DeliverToMailboxActionProperty.builder()
   * .mailboxArn("mailboxArn")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertomailboxaction.html)
   */
  public interface DeliverToMailboxActionProperty {
    /**
     * A policy that states what to do in the case of failure.
     *
     * The action will fail if there are configuration errors. For example, the mailbox ARN is no
     * longer valid.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertomailboxaction.html#cfn-ses-mailmanagerruleset-delivertomailboxaction-actionfailurepolicy)
     */
    public fun actionFailurePolicy(): String? = unwrap(this).getActionFailurePolicy()

    /**
     * The Amazon Resource Name (ARN) of a WorkMail organization to deliver the email to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertomailboxaction.html#cfn-ses-mailmanagerruleset-delivertomailboxaction-mailboxarn)
     */
    public fun mailboxArn(): String

    /**
     * The Amazon Resource Name (ARN) of an IAM role to use to execute this action.
     *
     * The role must have access to the workmail:DeliverToMailbox API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertomailboxaction.html#cfn-ses-mailmanagerruleset-delivertomailboxaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [DeliverToMailboxActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionFailurePolicy A policy that states what to do in the case of failure.
       * The action will fail if there are configuration errors. For example, the mailbox ARN is no
       * longer valid.
       */
      public fun actionFailurePolicy(actionFailurePolicy: String)

      /**
       * @param mailboxArn The Amazon Resource Name (ARN) of a WorkMail organization to deliver the
       * email to. 
       */
      public fun mailboxArn(mailboxArn: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of an IAM role to use to execute this action.
       * 
       * The role must have access to the workmail:DeliverToMailbox API.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.DeliverToMailboxActionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.DeliverToMailboxActionProperty.builder()

      /**
       * @param actionFailurePolicy A policy that states what to do in the case of failure.
       * The action will fail if there are configuration errors. For example, the mailbox ARN is no
       * longer valid.
       */
      override fun actionFailurePolicy(actionFailurePolicy: String) {
        cdkBuilder.actionFailurePolicy(actionFailurePolicy)
      }

      /**
       * @param mailboxArn The Amazon Resource Name (ARN) of a WorkMail organization to deliver the
       * email to. 
       */
      override fun mailboxArn(mailboxArn: String) {
        cdkBuilder.mailboxArn(mailboxArn)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of an IAM role to use to execute this action.
       * 
       * The role must have access to the workmail:DeliverToMailbox API.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.DeliverToMailboxActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.DeliverToMailboxActionProperty,
    ) : CdkObject(cdkObject),
        DeliverToMailboxActionProperty {
      /**
       * A policy that states what to do in the case of failure.
       *
       * The action will fail if there are configuration errors. For example, the mailbox ARN is no
       * longer valid.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertomailboxaction.html#cfn-ses-mailmanagerruleset-delivertomailboxaction-actionfailurepolicy)
       */
      override fun actionFailurePolicy(): String? = unwrap(this).getActionFailurePolicy()

      /**
       * The Amazon Resource Name (ARN) of a WorkMail organization to deliver the email to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertomailboxaction.html#cfn-ses-mailmanagerruleset-delivertomailboxaction-mailboxarn)
       */
      override fun mailboxArn(): String = unwrap(this).getMailboxArn()

      /**
       * The Amazon Resource Name (ARN) of an IAM role to use to execute this action.
       *
       * The role must have access to the workmail:DeliverToMailbox API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertomailboxaction.html#cfn-ses-mailmanagerruleset-delivertomailboxaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeliverToMailboxActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.DeliverToMailboxActionProperty):
          DeliverToMailboxActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeliverToMailboxActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeliverToMailboxActionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.DeliverToMailboxActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.DeliverToMailboxActionProperty
    }
  }

  /**
   * The action to deliver incoming emails to an Amazon Q Business application for indexing.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * DeliverToQBusinessActionProperty deliverToQBusinessActionProperty =
   * DeliverToQBusinessActionProperty.builder()
   * .applicationId("applicationId")
   * .indexId("indexId")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertoqbusinessaction.html)
   */
  public interface DeliverToQBusinessActionProperty {
    /**
     * A policy that states what to do in the case of failure.
     *
     * The action will fail if there are configuration errors. For example, the specified
     * application has been deleted or the role lacks necessary permissions to call the
     * `qbusiness:BatchPutDocument` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertoqbusinessaction.html#cfn-ses-mailmanagerruleset-delivertoqbusinessaction-actionfailurepolicy)
     */
    public fun actionFailurePolicy(): String? = unwrap(this).getActionFailurePolicy()

    /**
     * The unique identifier of the Amazon Q Business application instance where the email content
     * will be delivered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertoqbusinessaction.html#cfn-ses-mailmanagerruleset-delivertoqbusinessaction-applicationid)
     */
    public fun applicationId(): String

    /**
     * The identifier of the knowledge base index within the Amazon Q Business application where the
     * email content will be stored and indexed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertoqbusinessaction.html#cfn-ses-mailmanagerruleset-delivertoqbusinessaction-indexid)
     */
    public fun indexId(): String

    /**
     * The Amazon Resource Name (ARN) of the IAM Role to use while delivering to Amazon Q Business.
     *
     * This role must have access to the `qbusiness:BatchPutDocument` API for the given application
     * and index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertoqbusinessaction.html#cfn-ses-mailmanagerruleset-delivertoqbusinessaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [DeliverToQBusinessActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionFailurePolicy A policy that states what to do in the case of failure.
       * The action will fail if there are configuration errors. For example, the specified
       * application has been deleted or the role lacks necessary permissions to call the
       * `qbusiness:BatchPutDocument` API.
       */
      public fun actionFailurePolicy(actionFailurePolicy: String)

      /**
       * @param applicationId The unique identifier of the Amazon Q Business application instance
       * where the email content will be delivered. 
       */
      public fun applicationId(applicationId: String)

      /**
       * @param indexId The identifier of the knowledge base index within the Amazon Q Business
       * application where the email content will be stored and indexed. 
       */
      public fun indexId(indexId: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM Role to use while delivering to
       * Amazon Q Business. 
       * This role must have access to the `qbusiness:BatchPutDocument` API for the given
       * application and index.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.DeliverToQBusinessActionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.DeliverToQBusinessActionProperty.builder()

      /**
       * @param actionFailurePolicy A policy that states what to do in the case of failure.
       * The action will fail if there are configuration errors. For example, the specified
       * application has been deleted or the role lacks necessary permissions to call the
       * `qbusiness:BatchPutDocument` API.
       */
      override fun actionFailurePolicy(actionFailurePolicy: String) {
        cdkBuilder.actionFailurePolicy(actionFailurePolicy)
      }

      /**
       * @param applicationId The unique identifier of the Amazon Q Business application instance
       * where the email content will be delivered. 
       */
      override fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
      }

      /**
       * @param indexId The identifier of the knowledge base index within the Amazon Q Business
       * application where the email content will be stored and indexed. 
       */
      override fun indexId(indexId: String) {
        cdkBuilder.indexId(indexId)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM Role to use while delivering to
       * Amazon Q Business. 
       * This role must have access to the `qbusiness:BatchPutDocument` API for the given
       * application and index.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.DeliverToQBusinessActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.DeliverToQBusinessActionProperty,
    ) : CdkObject(cdkObject),
        DeliverToQBusinessActionProperty {
      /**
       * A policy that states what to do in the case of failure.
       *
       * The action will fail if there are configuration errors. For example, the specified
       * application has been deleted or the role lacks necessary permissions to call the
       * `qbusiness:BatchPutDocument` API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertoqbusinessaction.html#cfn-ses-mailmanagerruleset-delivertoqbusinessaction-actionfailurepolicy)
       */
      override fun actionFailurePolicy(): String? = unwrap(this).getActionFailurePolicy()

      /**
       * The unique identifier of the Amazon Q Business application instance where the email content
       * will be delivered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertoqbusinessaction.html#cfn-ses-mailmanagerruleset-delivertoqbusinessaction-applicationid)
       */
      override fun applicationId(): String = unwrap(this).getApplicationId()

      /**
       * The identifier of the knowledge base index within the Amazon Q Business application where
       * the email content will be stored and indexed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertoqbusinessaction.html#cfn-ses-mailmanagerruleset-delivertoqbusinessaction-indexid)
       */
      override fun indexId(): String = unwrap(this).getIndexId()

      /**
       * The Amazon Resource Name (ARN) of the IAM Role to use while delivering to Amazon Q
       * Business.
       *
       * This role must have access to the `qbusiness:BatchPutDocument` API for the given
       * application and index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-delivertoqbusinessaction.html#cfn-ses-mailmanagerruleset-delivertoqbusinessaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeliverToQBusinessActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.DeliverToQBusinessActionProperty):
          DeliverToQBusinessActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeliverToQBusinessActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeliverToQBusinessActionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.DeliverToQBusinessActionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.DeliverToQBusinessActionProperty
    }
  }

  /**
   * The action relays the email via SMTP to another specific SMTP server.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * RelayActionProperty relayActionProperty = RelayActionProperty.builder()
   * .relay("relay")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .mailFrom("mailFrom")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-relayaction.html)
   */
  public interface RelayActionProperty {
    /**
     * A policy that states what to do in the case of failure.
     *
     * The action will fail if there are configuration errors. For example, the specified relay has
     * been deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-relayaction.html#cfn-ses-mailmanagerruleset-relayaction-actionfailurepolicy)
     */
    public fun actionFailurePolicy(): String? = unwrap(this).getActionFailurePolicy()

    /**
     * This action specifies whether to preserve or replace original mail from address while
     * relaying received emails to a destination server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-relayaction.html#cfn-ses-mailmanagerruleset-relayaction-mailfrom)
     */
    public fun mailFrom(): String? = unwrap(this).getMailFrom()

    /**
     * The identifier of the relay resource to be used when relaying an email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-relayaction.html#cfn-ses-mailmanagerruleset-relayaction-relay)
     */
    public fun relay(): String

    /**
     * A builder for [RelayActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionFailurePolicy A policy that states what to do in the case of failure.
       * The action will fail if there are configuration errors. For example, the specified relay
       * has been deleted.
       */
      public fun actionFailurePolicy(actionFailurePolicy: String)

      /**
       * @param mailFrom This action specifies whether to preserve or replace original mail from
       * address while relaying received emails to a destination server.
       */
      public fun mailFrom(mailFrom: String)

      /**
       * @param relay The identifier of the relay resource to be used when relaying an email. 
       */
      public fun relay(relay: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RelayActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RelayActionProperty.builder()

      /**
       * @param actionFailurePolicy A policy that states what to do in the case of failure.
       * The action will fail if there are configuration errors. For example, the specified relay
       * has been deleted.
       */
      override fun actionFailurePolicy(actionFailurePolicy: String) {
        cdkBuilder.actionFailurePolicy(actionFailurePolicy)
      }

      /**
       * @param mailFrom This action specifies whether to preserve or replace original mail from
       * address while relaying received emails to a destination server.
       */
      override fun mailFrom(mailFrom: String) {
        cdkBuilder.mailFrom(mailFrom)
      }

      /**
       * @param relay The identifier of the relay resource to be used when relaying an email. 
       */
      override fun relay(relay: String) {
        cdkBuilder.relay(relay)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RelayActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RelayActionProperty,
    ) : CdkObject(cdkObject),
        RelayActionProperty {
      /**
       * A policy that states what to do in the case of failure.
       *
       * The action will fail if there are configuration errors. For example, the specified relay
       * has been deleted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-relayaction.html#cfn-ses-mailmanagerruleset-relayaction-actionfailurepolicy)
       */
      override fun actionFailurePolicy(): String? = unwrap(this).getActionFailurePolicy()

      /**
       * This action specifies whether to preserve or replace original mail from address while
       * relaying received emails to a destination server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-relayaction.html#cfn-ses-mailmanagerruleset-relayaction-mailfrom)
       */
      override fun mailFrom(): String? = unwrap(this).getMailFrom()

      /**
       * The identifier of the relay resource to be used when relaying an email.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-relayaction.html#cfn-ses-mailmanagerruleset-relayaction-relay)
       */
      override fun relay(): String = unwrap(this).getRelay()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RelayActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RelayActionProperty):
          RelayActionProperty = CdkObjectWrappers.wrap(cdkObject) as? RelayActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelayActionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RelayActionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RelayActionProperty
    }
  }

  /**
   * This action replaces the email envelope recipients with the given list of recipients.
   *
   * If the condition of this action applies only to a subset of recipients, only those recipients
   * are replaced with the recipients specified in the action. The message contents and headers are
   * unaffected by this action, only the envelope recipients are updated.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * ReplaceRecipientActionProperty replaceRecipientActionProperty =
   * ReplaceRecipientActionProperty.builder()
   * .replaceWith(List.of("replaceWith"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-replacerecipientaction.html)
   */
  public interface ReplaceRecipientActionProperty {
    /**
     * This action specifies the replacement recipient email addresses to insert.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-replacerecipientaction.html#cfn-ses-mailmanagerruleset-replacerecipientaction-replacewith)
     */
    public fun replaceWith(): List<String> = unwrap(this).getReplaceWith() ?: emptyList()

    /**
     * A builder for [ReplaceRecipientActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param replaceWith This action specifies the replacement recipient email addresses to
       * insert.
       */
      public fun replaceWith(replaceWith: List<String>)

      /**
       * @param replaceWith This action specifies the replacement recipient email addresses to
       * insert.
       */
      public fun replaceWith(vararg replaceWith: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.ReplaceRecipientActionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.ReplaceRecipientActionProperty.builder()

      /**
       * @param replaceWith This action specifies the replacement recipient email addresses to
       * insert.
       */
      override fun replaceWith(replaceWith: List<String>) {
        cdkBuilder.replaceWith(replaceWith)
      }

      /**
       * @param replaceWith This action specifies the replacement recipient email addresses to
       * insert.
       */
      override fun replaceWith(vararg replaceWith: String): Unit = replaceWith(replaceWith.toList())

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.ReplaceRecipientActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.ReplaceRecipientActionProperty,
    ) : CdkObject(cdkObject),
        ReplaceRecipientActionProperty {
      /**
       * This action specifies the replacement recipient email addresses to insert.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-replacerecipientaction.html#cfn-ses-mailmanagerruleset-replacerecipientaction-replacewith)
       */
      override fun replaceWith(): List<String> = unwrap(this).getReplaceWith() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReplaceRecipientActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.ReplaceRecipientActionProperty):
          ReplaceRecipientActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReplaceRecipientActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplaceRecipientActionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.ReplaceRecipientActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.ReplaceRecipientActionProperty
    }
  }

  /**
   * The action for a rule to take. Only one of the contained actions can be set.
   *
   *
   * This data type is a UNION, so only one of the following members can be specified when used or
   * returned.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * Object drop;
   * RuleActionProperty ruleActionProperty = RuleActionProperty.builder()
   * .addHeader(AddHeaderActionProperty.builder()
   * .headerName("headerName")
   * .headerValue("headerValue")
   * .build())
   * .archive(ArchiveActionProperty.builder()
   * .targetArchive("targetArchive")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .build())
   * .deliverToMailbox(DeliverToMailboxActionProperty.builder()
   * .mailboxArn("mailboxArn")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .build())
   * .deliverToQBusiness(DeliverToQBusinessActionProperty.builder()
   * .applicationId("applicationId")
   * .indexId("indexId")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .build())
   * .drop(drop)
   * .publishToSns(SnsActionProperty.builder()
   * .roleArn("roleArn")
   * .topicArn("topicArn")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .encoding("encoding")
   * .payloadType("payloadType")
   * .build())
   * .relay(RelayActionProperty.builder()
   * .relay("relay")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .mailFrom("mailFrom")
   * .build())
   * .replaceRecipient(ReplaceRecipientActionProperty.builder()
   * .replaceWith(List.of("replaceWith"))
   * .build())
   * .send(SendActionProperty.builder()
   * .roleArn("roleArn")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .build())
   * .writeToS3(S3ActionProperty.builder()
   * .roleArn("roleArn")
   * .s3Bucket("s3Bucket")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .s3Prefix("s3Prefix")
   * .s3SseKmsKeyId("s3SseKmsKeyId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html)
   */
  public interface RuleActionProperty {
    /**
     * This action adds a header.
     *
     * This can be used to add arbitrary email headers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-addheader)
     */
    public fun addHeader(): Any? = unwrap(this).getAddHeader()

    /**
     * This action archives the email.
     *
     * This can be used to deliver an email to an archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-archive)
     */
    public fun archive(): Any? = unwrap(this).getArchive()

    /**
     * This action delivers an email to a WorkMail mailbox.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-delivertomailbox)
     */
    public fun deliverToMailbox(): Any? = unwrap(this).getDeliverToMailbox()

    /**
     * This action delivers an email to an Amazon Q Business application for ingestion into its
     * knowledge base.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-delivertoqbusiness)
     */
    public fun deliverToQBusiness(): Any? = unwrap(this).getDeliverToQBusiness()

    /**
     * This action terminates the evaluation of rules in the rule set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-drop)
     */
    public fun drop(): Any? = unwrap(this).getDrop()

    /**
     * This action publishes the email content to an Amazon SNS topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-publishtosns)
     */
    public fun publishToSns(): Any? = unwrap(this).getPublishToSns()

    /**
     * This action relays the email to another SMTP server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-relay)
     */
    public fun relay(): Any? = unwrap(this).getRelay()

    /**
     * The action replaces certain or all recipients with a different set of recipients.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-replacerecipient)
     */
    public fun replaceRecipient(): Any? = unwrap(this).getReplaceRecipient()

    /**
     * This action sends the email to the internet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-send)
     */
    public fun send(): Any? = unwrap(this).getSend()

    /**
     * This action writes the MIME content of the email to an S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-writetos3)
     */
    public fun writeToS3(): Any? = unwrap(this).getWriteToS3()

    /**
     * A builder for [RuleActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addHeader This action adds a header.
       * This can be used to add arbitrary email headers.
       */
      public fun addHeader(addHeader: IResolvable)

      /**
       * @param addHeader This action adds a header.
       * This can be used to add arbitrary email headers.
       */
      public fun addHeader(addHeader: AddHeaderActionProperty)

      /**
       * @param addHeader This action adds a header.
       * This can be used to add arbitrary email headers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69e2e7696be8dbb92f0628d9f559cb0668482473ca6f7bdcf706e4a563e1cd00")
      public fun addHeader(addHeader: AddHeaderActionProperty.Builder.() -> Unit)

      /**
       * @param archive This action archives the email.
       * This can be used to deliver an email to an archive.
       */
      public fun archive(archive: IResolvable)

      /**
       * @param archive This action archives the email.
       * This can be used to deliver an email to an archive.
       */
      public fun archive(archive: ArchiveActionProperty)

      /**
       * @param archive This action archives the email.
       * This can be used to deliver an email to an archive.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c375685fe0a772822f50254ec10a5e50effccf178e9cec360dc7e87350407ed")
      public fun archive(archive: ArchiveActionProperty.Builder.() -> Unit)

      /**
       * @param deliverToMailbox This action delivers an email to a WorkMail mailbox.
       */
      public fun deliverToMailbox(deliverToMailbox: IResolvable)

      /**
       * @param deliverToMailbox This action delivers an email to a WorkMail mailbox.
       */
      public fun deliverToMailbox(deliverToMailbox: DeliverToMailboxActionProperty)

      /**
       * @param deliverToMailbox This action delivers an email to a WorkMail mailbox.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29b6509628baf80e23913fe2e9feb39816e64d5aa6aab608eef03d69aad8d241")
      public
          fun deliverToMailbox(deliverToMailbox: DeliverToMailboxActionProperty.Builder.() -> Unit)

      /**
       * @param deliverToQBusiness This action delivers an email to an Amazon Q Business application
       * for ingestion into its knowledge base.
       */
      public fun deliverToQBusiness(deliverToQBusiness: IResolvable)

      /**
       * @param deliverToQBusiness This action delivers an email to an Amazon Q Business application
       * for ingestion into its knowledge base.
       */
      public fun deliverToQBusiness(deliverToQBusiness: DeliverToQBusinessActionProperty)

      /**
       * @param deliverToQBusiness This action delivers an email to an Amazon Q Business application
       * for ingestion into its knowledge base.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92ea393512949e29f4e195f934c0c0fbe8012c7c2e59a0af9c90afc7286523f3")
      public
          fun deliverToQBusiness(deliverToQBusiness: DeliverToQBusinessActionProperty.Builder.() -> Unit)

      /**
       * @param drop This action terminates the evaluation of rules in the rule set.
       */
      public fun drop(drop: Any)

      /**
       * @param publishToSns This action publishes the email content to an Amazon SNS topic.
       */
      public fun publishToSns(publishToSns: IResolvable)

      /**
       * @param publishToSns This action publishes the email content to an Amazon SNS topic.
       */
      public fun publishToSns(publishToSns: SnsActionProperty)

      /**
       * @param publishToSns This action publishes the email content to an Amazon SNS topic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7770e794e3616e0ef690f4e4c4a2533c341cd2d1eea35cbd1886ba1762525419")
      public fun publishToSns(publishToSns: SnsActionProperty.Builder.() -> Unit)

      /**
       * @param relay This action relays the email to another SMTP server.
       */
      public fun relay(relay: IResolvable)

      /**
       * @param relay This action relays the email to another SMTP server.
       */
      public fun relay(relay: RelayActionProperty)

      /**
       * @param relay This action relays the email to another SMTP server.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a14c7a63d8e25b6bfa44e8be0fb3e40cc49f650de2a6c304480573524c5eca3")
      public fun relay(relay: RelayActionProperty.Builder.() -> Unit)

      /**
       * @param replaceRecipient The action replaces certain or all recipients with a different set
       * of recipients.
       */
      public fun replaceRecipient(replaceRecipient: IResolvable)

      /**
       * @param replaceRecipient The action replaces certain or all recipients with a different set
       * of recipients.
       */
      public fun replaceRecipient(replaceRecipient: ReplaceRecipientActionProperty)

      /**
       * @param replaceRecipient The action replaces certain or all recipients with a different set
       * of recipients.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7c10778be0ae3b29dcfca0f4a873fe1a837654fe5dead26ae32f0165e598d313")
      public
          fun replaceRecipient(replaceRecipient: ReplaceRecipientActionProperty.Builder.() -> Unit)

      /**
       * @param send This action sends the email to the internet.
       */
      public fun send(send: IResolvable)

      /**
       * @param send This action sends the email to the internet.
       */
      public fun send(send: SendActionProperty)

      /**
       * @param send This action sends the email to the internet.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00b2594cb45f14400e0627f5f16cfe6f8442569caf8769966472e20babab998d")
      public fun send(send: SendActionProperty.Builder.() -> Unit)

      /**
       * @param writeToS3 This action writes the MIME content of the email to an S3 bucket.
       */
      public fun writeToS3(writeToS3: IResolvable)

      /**
       * @param writeToS3 This action writes the MIME content of the email to an S3 bucket.
       */
      public fun writeToS3(writeToS3: S3ActionProperty)

      /**
       * @param writeToS3 This action writes the MIME content of the email to an S3 bucket.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64a6b101f9b5511f241ae04e58d088f027b61b93c7dce3e2a933ad7be9361156")
      public fun writeToS3(writeToS3: S3ActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleActionProperty.builder()

      /**
       * @param addHeader This action adds a header.
       * This can be used to add arbitrary email headers.
       */
      override fun addHeader(addHeader: IResolvable) {
        cdkBuilder.addHeader(addHeader.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param addHeader This action adds a header.
       * This can be used to add arbitrary email headers.
       */
      override fun addHeader(addHeader: AddHeaderActionProperty) {
        cdkBuilder.addHeader(addHeader.let(AddHeaderActionProperty.Companion::unwrap))
      }

      /**
       * @param addHeader This action adds a header.
       * This can be used to add arbitrary email headers.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69e2e7696be8dbb92f0628d9f559cb0668482473ca6f7bdcf706e4a563e1cd00")
      override fun addHeader(addHeader: AddHeaderActionProperty.Builder.() -> Unit): Unit =
          addHeader(AddHeaderActionProperty(addHeader))

      /**
       * @param archive This action archives the email.
       * This can be used to deliver an email to an archive.
       */
      override fun archive(archive: IResolvable) {
        cdkBuilder.archive(archive.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param archive This action archives the email.
       * This can be used to deliver an email to an archive.
       */
      override fun archive(archive: ArchiveActionProperty) {
        cdkBuilder.archive(archive.let(ArchiveActionProperty.Companion::unwrap))
      }

      /**
       * @param archive This action archives the email.
       * This can be used to deliver an email to an archive.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c375685fe0a772822f50254ec10a5e50effccf178e9cec360dc7e87350407ed")
      override fun archive(archive: ArchiveActionProperty.Builder.() -> Unit): Unit =
          archive(ArchiveActionProperty(archive))

      /**
       * @param deliverToMailbox This action delivers an email to a WorkMail mailbox.
       */
      override fun deliverToMailbox(deliverToMailbox: IResolvable) {
        cdkBuilder.deliverToMailbox(deliverToMailbox.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param deliverToMailbox This action delivers an email to a WorkMail mailbox.
       */
      override fun deliverToMailbox(deliverToMailbox: DeliverToMailboxActionProperty) {
        cdkBuilder.deliverToMailbox(deliverToMailbox.let(DeliverToMailboxActionProperty.Companion::unwrap))
      }

      /**
       * @param deliverToMailbox This action delivers an email to a WorkMail mailbox.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("29b6509628baf80e23913fe2e9feb39816e64d5aa6aab608eef03d69aad8d241")
      override
          fun deliverToMailbox(deliverToMailbox: DeliverToMailboxActionProperty.Builder.() -> Unit):
          Unit = deliverToMailbox(DeliverToMailboxActionProperty(deliverToMailbox))

      /**
       * @param deliverToQBusiness This action delivers an email to an Amazon Q Business application
       * for ingestion into its knowledge base.
       */
      override fun deliverToQBusiness(deliverToQBusiness: IResolvable) {
        cdkBuilder.deliverToQBusiness(deliverToQBusiness.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param deliverToQBusiness This action delivers an email to an Amazon Q Business application
       * for ingestion into its knowledge base.
       */
      override fun deliverToQBusiness(deliverToQBusiness: DeliverToQBusinessActionProperty) {
        cdkBuilder.deliverToQBusiness(deliverToQBusiness.let(DeliverToQBusinessActionProperty.Companion::unwrap))
      }

      /**
       * @param deliverToQBusiness This action delivers an email to an Amazon Q Business application
       * for ingestion into its knowledge base.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92ea393512949e29f4e195f934c0c0fbe8012c7c2e59a0af9c90afc7286523f3")
      override
          fun deliverToQBusiness(deliverToQBusiness: DeliverToQBusinessActionProperty.Builder.() -> Unit):
          Unit = deliverToQBusiness(DeliverToQBusinessActionProperty(deliverToQBusiness))

      /**
       * @param drop This action terminates the evaluation of rules in the rule set.
       */
      override fun drop(drop: Any) {
        cdkBuilder.drop(drop)
      }

      /**
       * @param publishToSns This action publishes the email content to an Amazon SNS topic.
       */
      override fun publishToSns(publishToSns: IResolvable) {
        cdkBuilder.publishToSns(publishToSns.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param publishToSns This action publishes the email content to an Amazon SNS topic.
       */
      override fun publishToSns(publishToSns: SnsActionProperty) {
        cdkBuilder.publishToSns(publishToSns.let(SnsActionProperty.Companion::unwrap))
      }

      /**
       * @param publishToSns This action publishes the email content to an Amazon SNS topic.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7770e794e3616e0ef690f4e4c4a2533c341cd2d1eea35cbd1886ba1762525419")
      override fun publishToSns(publishToSns: SnsActionProperty.Builder.() -> Unit): Unit =
          publishToSns(SnsActionProperty(publishToSns))

      /**
       * @param relay This action relays the email to another SMTP server.
       */
      override fun relay(relay: IResolvable) {
        cdkBuilder.relay(relay.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param relay This action relays the email to another SMTP server.
       */
      override fun relay(relay: RelayActionProperty) {
        cdkBuilder.relay(relay.let(RelayActionProperty.Companion::unwrap))
      }

      /**
       * @param relay This action relays the email to another SMTP server.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a14c7a63d8e25b6bfa44e8be0fb3e40cc49f650de2a6c304480573524c5eca3")
      override fun relay(relay: RelayActionProperty.Builder.() -> Unit): Unit =
          relay(RelayActionProperty(relay))

      /**
       * @param replaceRecipient The action replaces certain or all recipients with a different set
       * of recipients.
       */
      override fun replaceRecipient(replaceRecipient: IResolvable) {
        cdkBuilder.replaceRecipient(replaceRecipient.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param replaceRecipient The action replaces certain or all recipients with a different set
       * of recipients.
       */
      override fun replaceRecipient(replaceRecipient: ReplaceRecipientActionProperty) {
        cdkBuilder.replaceRecipient(replaceRecipient.let(ReplaceRecipientActionProperty.Companion::unwrap))
      }

      /**
       * @param replaceRecipient The action replaces certain or all recipients with a different set
       * of recipients.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7c10778be0ae3b29dcfca0f4a873fe1a837654fe5dead26ae32f0165e598d313")
      override
          fun replaceRecipient(replaceRecipient: ReplaceRecipientActionProperty.Builder.() -> Unit):
          Unit = replaceRecipient(ReplaceRecipientActionProperty(replaceRecipient))

      /**
       * @param send This action sends the email to the internet.
       */
      override fun send(send: IResolvable) {
        cdkBuilder.send(send.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param send This action sends the email to the internet.
       */
      override fun send(send: SendActionProperty) {
        cdkBuilder.send(send.let(SendActionProperty.Companion::unwrap))
      }

      /**
       * @param send This action sends the email to the internet.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00b2594cb45f14400e0627f5f16cfe6f8442569caf8769966472e20babab998d")
      override fun send(send: SendActionProperty.Builder.() -> Unit): Unit =
          send(SendActionProperty(send))

      /**
       * @param writeToS3 This action writes the MIME content of the email to an S3 bucket.
       */
      override fun writeToS3(writeToS3: IResolvable) {
        cdkBuilder.writeToS3(writeToS3.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param writeToS3 This action writes the MIME content of the email to an S3 bucket.
       */
      override fun writeToS3(writeToS3: S3ActionProperty) {
        cdkBuilder.writeToS3(writeToS3.let(S3ActionProperty.Companion::unwrap))
      }

      /**
       * @param writeToS3 This action writes the MIME content of the email to an S3 bucket.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64a6b101f9b5511f241ae04e58d088f027b61b93c7dce3e2a933ad7be9361156")
      override fun writeToS3(writeToS3: S3ActionProperty.Builder.() -> Unit): Unit =
          writeToS3(S3ActionProperty(writeToS3))

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleActionProperty,
    ) : CdkObject(cdkObject),
        RuleActionProperty {
      /**
       * This action adds a header.
       *
       * This can be used to add arbitrary email headers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-addheader)
       */
      override fun addHeader(): Any? = unwrap(this).getAddHeader()

      /**
       * This action archives the email.
       *
       * This can be used to deliver an email to an archive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-archive)
       */
      override fun archive(): Any? = unwrap(this).getArchive()

      /**
       * This action delivers an email to a WorkMail mailbox.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-delivertomailbox)
       */
      override fun deliverToMailbox(): Any? = unwrap(this).getDeliverToMailbox()

      /**
       * This action delivers an email to an Amazon Q Business application for ingestion into its
       * knowledge base.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-delivertoqbusiness)
       */
      override fun deliverToQBusiness(): Any? = unwrap(this).getDeliverToQBusiness()

      /**
       * This action terminates the evaluation of rules in the rule set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-drop)
       */
      override fun drop(): Any? = unwrap(this).getDrop()

      /**
       * This action publishes the email content to an Amazon SNS topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-publishtosns)
       */
      override fun publishToSns(): Any? = unwrap(this).getPublishToSns()

      /**
       * This action relays the email to another SMTP server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-relay)
       */
      override fun relay(): Any? = unwrap(this).getRelay()

      /**
       * The action replaces certain or all recipients with a different set of recipients.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-replacerecipient)
       */
      override fun replaceRecipient(): Any? = unwrap(this).getReplaceRecipient()

      /**
       * This action sends the email to the internet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-send)
       */
      override fun send(): Any? = unwrap(this).getSend()

      /**
       * This action writes the MIME content of the email to an S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleaction.html#cfn-ses-mailmanagerruleset-ruleaction-writetos3)
       */
      override fun writeToS3(): Any? = unwrap(this).getWriteToS3()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleActionProperty):
          RuleActionProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleActionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleActionProperty
    }
  }

  /**
   * A boolean expression to be used in a rule condition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * RuleBooleanExpressionProperty ruleBooleanExpressionProperty =
   * RuleBooleanExpressionProperty.builder()
   * .evaluate(RuleBooleanToEvaluateProperty.builder()
   * .analysis(AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .isInAddressList(RuleIsInAddressListProperty.builder()
   * .addressLists(List.of("addressLists"))
   * .attribute("attribute")
   * .build())
   * .build())
   * .operator("operator")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulebooleanexpression.html)
   */
  public interface RuleBooleanExpressionProperty {
    /**
     * The operand on which to perform a boolean condition operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulebooleanexpression.html#cfn-ses-mailmanagerruleset-rulebooleanexpression-evaluate)
     */
    public fun evaluate(): Any

    /**
     * The matching operator for a boolean condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulebooleanexpression.html#cfn-ses-mailmanagerruleset-rulebooleanexpression-operator)
     */
    public fun `operator`(): String

    /**
     * A builder for [RuleBooleanExpressionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param evaluate The operand on which to perform a boolean condition operation. 
       */
      public fun evaluate(evaluate: IResolvable)

      /**
       * @param evaluate The operand on which to perform a boolean condition operation. 
       */
      public fun evaluate(evaluate: RuleBooleanToEvaluateProperty)

      /**
       * @param evaluate The operand on which to perform a boolean condition operation. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf6eea8d58f00606241e89cfc54e39f1a33267875f67926e5825e8c978d0ed32")
      public fun evaluate(evaluate: RuleBooleanToEvaluateProperty.Builder.() -> Unit)

      /**
       * @param operator The matching operator for a boolean condition expression. 
       */
      public fun `operator`(`operator`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleBooleanExpressionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleBooleanExpressionProperty.builder()

      /**
       * @param evaluate The operand on which to perform a boolean condition operation. 
       */
      override fun evaluate(evaluate: IResolvable) {
        cdkBuilder.evaluate(evaluate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param evaluate The operand on which to perform a boolean condition operation. 
       */
      override fun evaluate(evaluate: RuleBooleanToEvaluateProperty) {
        cdkBuilder.evaluate(evaluate.let(RuleBooleanToEvaluateProperty.Companion::unwrap))
      }

      /**
       * @param evaluate The operand on which to perform a boolean condition operation. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cf6eea8d58f00606241e89cfc54e39f1a33267875f67926e5825e8c978d0ed32")
      override fun evaluate(evaluate: RuleBooleanToEvaluateProperty.Builder.() -> Unit): Unit =
          evaluate(RuleBooleanToEvaluateProperty(evaluate))

      /**
       * @param operator The matching operator for a boolean condition expression. 
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleBooleanExpressionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleBooleanExpressionProperty,
    ) : CdkObject(cdkObject),
        RuleBooleanExpressionProperty {
      /**
       * The operand on which to perform a boolean condition operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulebooleanexpression.html#cfn-ses-mailmanagerruleset-rulebooleanexpression-evaluate)
       */
      override fun evaluate(): Any = unwrap(this).getEvaluate()

      /**
       * The matching operator for a boolean condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulebooleanexpression.html#cfn-ses-mailmanagerruleset-rulebooleanexpression-operator)
       */
      override fun `operator`(): String = unwrap(this).getOperator()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleBooleanExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleBooleanExpressionProperty):
          RuleBooleanExpressionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuleBooleanExpressionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleBooleanExpressionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleBooleanExpressionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleBooleanExpressionProperty
    }
  }

  /**
   * The union type representing the allowed types of operands for a boolean condition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * RuleBooleanToEvaluateProperty ruleBooleanToEvaluateProperty =
   * RuleBooleanToEvaluateProperty.builder()
   * .analysis(AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .isInAddressList(RuleIsInAddressListProperty.builder()
   * .addressLists(List.of("addressLists"))
   * .attribute("attribute")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulebooleantoevaluate.html)
   */
  public interface RuleBooleanToEvaluateProperty {
    /**
     * The Add On ARN and its returned value to evaluate in a boolean condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulebooleantoevaluate.html#cfn-ses-mailmanagerruleset-rulebooleantoevaluate-analysis)
     */
    public fun analysis(): Any? = unwrap(this).getAnalysis()

    /**
     * The boolean type representing the allowed attribute types for an email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulebooleantoevaluate.html#cfn-ses-mailmanagerruleset-rulebooleantoevaluate-attribute)
     */
    public fun attribute(): String? = unwrap(this).getAttribute()

    /**
     * The structure representing the address lists and address list attribute that will be used in
     * evaluation of boolean expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulebooleantoevaluate.html#cfn-ses-mailmanagerruleset-rulebooleantoevaluate-isinaddresslist)
     */
    public fun isInAddressList(): Any? = unwrap(this).getIsInAddressList()

    /**
     * A builder for [RuleBooleanToEvaluateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a boolean condition
       * expression.
       */
      public fun analysis(analysis: IResolvable)

      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a boolean condition
       * expression.
       */
      public fun analysis(analysis: AnalysisProperty)

      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a boolean condition
       * expression.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1e3e6036e73edde2a60739cc6e5f30cb4679a82f115fc71275fb979bdd15919")
      public fun analysis(analysis: AnalysisProperty.Builder.() -> Unit)

      /**
       * @param attribute The boolean type representing the allowed attribute types for an email.
       */
      public fun attribute(attribute: String)

      /**
       * @param isInAddressList The structure representing the address lists and address list
       * attribute that will be used in evaluation of boolean expression.
       */
      public fun isInAddressList(isInAddressList: IResolvable)

      /**
       * @param isInAddressList The structure representing the address lists and address list
       * attribute that will be used in evaluation of boolean expression.
       */
      public fun isInAddressList(isInAddressList: RuleIsInAddressListProperty)

      /**
       * @param isInAddressList The structure representing the address lists and address list
       * attribute that will be used in evaluation of boolean expression.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22ccbeab5094f0c8e372b642fda680a263a0584e98292b7958c8b23e22480cf5")
      public fun isInAddressList(isInAddressList: RuleIsInAddressListProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleBooleanToEvaluateProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleBooleanToEvaluateProperty.builder()

      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a boolean condition
       * expression.
       */
      override fun analysis(analysis: IResolvable) {
        cdkBuilder.analysis(analysis.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a boolean condition
       * expression.
       */
      override fun analysis(analysis: AnalysisProperty) {
        cdkBuilder.analysis(analysis.let(AnalysisProperty.Companion::unwrap))
      }

      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a boolean condition
       * expression.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a1e3e6036e73edde2a60739cc6e5f30cb4679a82f115fc71275fb979bdd15919")
      override fun analysis(analysis: AnalysisProperty.Builder.() -> Unit): Unit =
          analysis(AnalysisProperty(analysis))

      /**
       * @param attribute The boolean type representing the allowed attribute types for an email.
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      /**
       * @param isInAddressList The structure representing the address lists and address list
       * attribute that will be used in evaluation of boolean expression.
       */
      override fun isInAddressList(isInAddressList: IResolvable) {
        cdkBuilder.isInAddressList(isInAddressList.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param isInAddressList The structure representing the address lists and address list
       * attribute that will be used in evaluation of boolean expression.
       */
      override fun isInAddressList(isInAddressList: RuleIsInAddressListProperty) {
        cdkBuilder.isInAddressList(isInAddressList.let(RuleIsInAddressListProperty.Companion::unwrap))
      }

      /**
       * @param isInAddressList The structure representing the address lists and address list
       * attribute that will be used in evaluation of boolean expression.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22ccbeab5094f0c8e372b642fda680a263a0584e98292b7958c8b23e22480cf5")
      override fun isInAddressList(isInAddressList: RuleIsInAddressListProperty.Builder.() -> Unit):
          Unit = isInAddressList(RuleIsInAddressListProperty(isInAddressList))

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleBooleanToEvaluateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleBooleanToEvaluateProperty,
    ) : CdkObject(cdkObject),
        RuleBooleanToEvaluateProperty {
      /**
       * The Add On ARN and its returned value to evaluate in a boolean condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulebooleantoevaluate.html#cfn-ses-mailmanagerruleset-rulebooleantoevaluate-analysis)
       */
      override fun analysis(): Any? = unwrap(this).getAnalysis()

      /**
       * The boolean type representing the allowed attribute types for an email.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulebooleantoevaluate.html#cfn-ses-mailmanagerruleset-rulebooleantoevaluate-attribute)
       */
      override fun attribute(): String? = unwrap(this).getAttribute()

      /**
       * The structure representing the address lists and address list attribute that will be used
       * in evaluation of boolean expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulebooleantoevaluate.html#cfn-ses-mailmanagerruleset-rulebooleantoevaluate-isinaddresslist)
       */
      override fun isInAddressList(): Any? = unwrap(this).getIsInAddressList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleBooleanToEvaluateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleBooleanToEvaluateProperty):
          RuleBooleanToEvaluateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuleBooleanToEvaluateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleBooleanToEvaluateProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleBooleanToEvaluateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleBooleanToEvaluateProperty
    }
  }

  /**
   * The conditional expression used to evaluate an email for determining if a rule action should be
   * taken.
   *
   *
   * This data type is a UNION, so only one of the following members can be specified when used or
   * returned.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * RuleConditionProperty ruleConditionProperty = RuleConditionProperty.builder()
   * .booleanExpression(RuleBooleanExpressionProperty.builder()
   * .evaluate(RuleBooleanToEvaluateProperty.builder()
   * .analysis(AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .isInAddressList(RuleIsInAddressListProperty.builder()
   * .addressLists(List.of("addressLists"))
   * .attribute("attribute")
   * .build())
   * .build())
   * .operator("operator")
   * .build())
   * .dmarcExpression(RuleDmarcExpressionProperty.builder()
   * .operator("operator")
   * .values(List.of("values"))
   * .build())
   * .ipExpression(RuleIpExpressionProperty.builder()
   * .evaluate(RuleIpToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build())
   * .numberExpression(RuleNumberExpressionProperty.builder()
   * .evaluate(RuleNumberToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .value(123)
   * .build())
   * .stringExpression(RuleStringExpressionProperty.builder()
   * .evaluate(RuleStringToEvaluateProperty.builder()
   * .analysis(AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .mimeHeaderAttribute("mimeHeaderAttribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build())
   * .verdictExpression(RuleVerdictExpressionProperty.builder()
   * .evaluate(RuleVerdictToEvaluateProperty.builder()
   * .analysis(AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulecondition.html)
   */
  public interface RuleConditionProperty {
    /**
     * The condition applies to a boolean expression passed in this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulecondition.html#cfn-ses-mailmanagerruleset-rulecondition-booleanexpression)
     */
    public fun booleanExpression(): Any? = unwrap(this).getBooleanExpression()

    /**
     * The condition applies to a DMARC policy expression passed in this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulecondition.html#cfn-ses-mailmanagerruleset-rulecondition-dmarcexpression)
     */
    public fun dmarcExpression(): Any? = unwrap(this).getDmarcExpression()

    /**
     * The condition applies to an IP address expression passed in this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulecondition.html#cfn-ses-mailmanagerruleset-rulecondition-ipexpression)
     */
    public fun ipExpression(): Any? = unwrap(this).getIpExpression()

    /**
     * The condition applies to a number expression passed in this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulecondition.html#cfn-ses-mailmanagerruleset-rulecondition-numberexpression)
     */
    public fun numberExpression(): Any? = unwrap(this).getNumberExpression()

    /**
     * The condition applies to a string expression passed in this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulecondition.html#cfn-ses-mailmanagerruleset-rulecondition-stringexpression)
     */
    public fun stringExpression(): Any? = unwrap(this).getStringExpression()

    /**
     * The condition applies to a verdict expression passed in this field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulecondition.html#cfn-ses-mailmanagerruleset-rulecondition-verdictexpression)
     */
    public fun verdictExpression(): Any? = unwrap(this).getVerdictExpression()

    /**
     * A builder for [RuleConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param booleanExpression The condition applies to a boolean expression passed in this
       * field.
       */
      public fun booleanExpression(booleanExpression: IResolvable)

      /**
       * @param booleanExpression The condition applies to a boolean expression passed in this
       * field.
       */
      public fun booleanExpression(booleanExpression: RuleBooleanExpressionProperty)

      /**
       * @param booleanExpression The condition applies to a boolean expression passed in this
       * field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b01dc7b51aa5a857711c4db2886524099a713e0f7b5a4f7ac1b13432a95f23e")
      public
          fun booleanExpression(booleanExpression: RuleBooleanExpressionProperty.Builder.() -> Unit)

      /**
       * @param dmarcExpression The condition applies to a DMARC policy expression passed in this
       * field.
       */
      public fun dmarcExpression(dmarcExpression: IResolvable)

      /**
       * @param dmarcExpression The condition applies to a DMARC policy expression passed in this
       * field.
       */
      public fun dmarcExpression(dmarcExpression: RuleDmarcExpressionProperty)

      /**
       * @param dmarcExpression The condition applies to a DMARC policy expression passed in this
       * field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9dbb78c5d5e5de599cb2b4aa4621f5e7b5896f0c563ecdc19ebd2ee51076f01a")
      public fun dmarcExpression(dmarcExpression: RuleDmarcExpressionProperty.Builder.() -> Unit)

      /**
       * @param ipExpression The condition applies to an IP address expression passed in this field.
       */
      public fun ipExpression(ipExpression: IResolvable)

      /**
       * @param ipExpression The condition applies to an IP address expression passed in this field.
       */
      public fun ipExpression(ipExpression: RuleIpExpressionProperty)

      /**
       * @param ipExpression The condition applies to an IP address expression passed in this field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84d55695ef22ec1d2181a767d45c313df3791143b0a3efec64eeb3c0876d4860")
      public fun ipExpression(ipExpression: RuleIpExpressionProperty.Builder.() -> Unit)

      /**
       * @param numberExpression The condition applies to a number expression passed in this field.
       */
      public fun numberExpression(numberExpression: IResolvable)

      /**
       * @param numberExpression The condition applies to a number expression passed in this field.
       */
      public fun numberExpression(numberExpression: RuleNumberExpressionProperty)

      /**
       * @param numberExpression The condition applies to a number expression passed in this field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da1d5560abd8484e74573fbfffb169aa150c2c795525d4ecb799ff017aef4c9e")
      public fun numberExpression(numberExpression: RuleNumberExpressionProperty.Builder.() -> Unit)

      /**
       * @param stringExpression The condition applies to a string expression passed in this field.
       */
      public fun stringExpression(stringExpression: IResolvable)

      /**
       * @param stringExpression The condition applies to a string expression passed in this field.
       */
      public fun stringExpression(stringExpression: RuleStringExpressionProperty)

      /**
       * @param stringExpression The condition applies to a string expression passed in this field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a16b1ce52b60a212426ef42466a9659dc40939bf55dda0ab7d4658d10fad7624")
      public fun stringExpression(stringExpression: RuleStringExpressionProperty.Builder.() -> Unit)

      /**
       * @param verdictExpression The condition applies to a verdict expression passed in this
       * field.
       */
      public fun verdictExpression(verdictExpression: IResolvable)

      /**
       * @param verdictExpression The condition applies to a verdict expression passed in this
       * field.
       */
      public fun verdictExpression(verdictExpression: RuleVerdictExpressionProperty)

      /**
       * @param verdictExpression The condition applies to a verdict expression passed in this
       * field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98a1325013ad97dc52a41da6ad42c8838af984ec5a3774d644ba9b9e43b4b85f")
      public
          fun verdictExpression(verdictExpression: RuleVerdictExpressionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleConditionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleConditionProperty.builder()

      /**
       * @param booleanExpression The condition applies to a boolean expression passed in this
       * field.
       */
      override fun booleanExpression(booleanExpression: IResolvable) {
        cdkBuilder.booleanExpression(booleanExpression.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param booleanExpression The condition applies to a boolean expression passed in this
       * field.
       */
      override fun booleanExpression(booleanExpression: RuleBooleanExpressionProperty) {
        cdkBuilder.booleanExpression(booleanExpression.let(RuleBooleanExpressionProperty.Companion::unwrap))
      }

      /**
       * @param booleanExpression The condition applies to a boolean expression passed in this
       * field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b01dc7b51aa5a857711c4db2886524099a713e0f7b5a4f7ac1b13432a95f23e")
      override
          fun booleanExpression(booleanExpression: RuleBooleanExpressionProperty.Builder.() -> Unit):
          Unit = booleanExpression(RuleBooleanExpressionProperty(booleanExpression))

      /**
       * @param dmarcExpression The condition applies to a DMARC policy expression passed in this
       * field.
       */
      override fun dmarcExpression(dmarcExpression: IResolvable) {
        cdkBuilder.dmarcExpression(dmarcExpression.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dmarcExpression The condition applies to a DMARC policy expression passed in this
       * field.
       */
      override fun dmarcExpression(dmarcExpression: RuleDmarcExpressionProperty) {
        cdkBuilder.dmarcExpression(dmarcExpression.let(RuleDmarcExpressionProperty.Companion::unwrap))
      }

      /**
       * @param dmarcExpression The condition applies to a DMARC policy expression passed in this
       * field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9dbb78c5d5e5de599cb2b4aa4621f5e7b5896f0c563ecdc19ebd2ee51076f01a")
      override fun dmarcExpression(dmarcExpression: RuleDmarcExpressionProperty.Builder.() -> Unit):
          Unit = dmarcExpression(RuleDmarcExpressionProperty(dmarcExpression))

      /**
       * @param ipExpression The condition applies to an IP address expression passed in this field.
       */
      override fun ipExpression(ipExpression: IResolvable) {
        cdkBuilder.ipExpression(ipExpression.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ipExpression The condition applies to an IP address expression passed in this field.
       */
      override fun ipExpression(ipExpression: RuleIpExpressionProperty) {
        cdkBuilder.ipExpression(ipExpression.let(RuleIpExpressionProperty.Companion::unwrap))
      }

      /**
       * @param ipExpression The condition applies to an IP address expression passed in this field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84d55695ef22ec1d2181a767d45c313df3791143b0a3efec64eeb3c0876d4860")
      override fun ipExpression(ipExpression: RuleIpExpressionProperty.Builder.() -> Unit): Unit =
          ipExpression(RuleIpExpressionProperty(ipExpression))

      /**
       * @param numberExpression The condition applies to a number expression passed in this field.
       */
      override fun numberExpression(numberExpression: IResolvable) {
        cdkBuilder.numberExpression(numberExpression.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param numberExpression The condition applies to a number expression passed in this field.
       */
      override fun numberExpression(numberExpression: RuleNumberExpressionProperty) {
        cdkBuilder.numberExpression(numberExpression.let(RuleNumberExpressionProperty.Companion::unwrap))
      }

      /**
       * @param numberExpression The condition applies to a number expression passed in this field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da1d5560abd8484e74573fbfffb169aa150c2c795525d4ecb799ff017aef4c9e")
      override
          fun numberExpression(numberExpression: RuleNumberExpressionProperty.Builder.() -> Unit):
          Unit = numberExpression(RuleNumberExpressionProperty(numberExpression))

      /**
       * @param stringExpression The condition applies to a string expression passed in this field.
       */
      override fun stringExpression(stringExpression: IResolvable) {
        cdkBuilder.stringExpression(stringExpression.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param stringExpression The condition applies to a string expression passed in this field.
       */
      override fun stringExpression(stringExpression: RuleStringExpressionProperty) {
        cdkBuilder.stringExpression(stringExpression.let(RuleStringExpressionProperty.Companion::unwrap))
      }

      /**
       * @param stringExpression The condition applies to a string expression passed in this field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a16b1ce52b60a212426ef42466a9659dc40939bf55dda0ab7d4658d10fad7624")
      override
          fun stringExpression(stringExpression: RuleStringExpressionProperty.Builder.() -> Unit):
          Unit = stringExpression(RuleStringExpressionProperty(stringExpression))

      /**
       * @param verdictExpression The condition applies to a verdict expression passed in this
       * field.
       */
      override fun verdictExpression(verdictExpression: IResolvable) {
        cdkBuilder.verdictExpression(verdictExpression.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param verdictExpression The condition applies to a verdict expression passed in this
       * field.
       */
      override fun verdictExpression(verdictExpression: RuleVerdictExpressionProperty) {
        cdkBuilder.verdictExpression(verdictExpression.let(RuleVerdictExpressionProperty.Companion::unwrap))
      }

      /**
       * @param verdictExpression The condition applies to a verdict expression passed in this
       * field.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98a1325013ad97dc52a41da6ad42c8838af984ec5a3774d644ba9b9e43b4b85f")
      override
          fun verdictExpression(verdictExpression: RuleVerdictExpressionProperty.Builder.() -> Unit):
          Unit = verdictExpression(RuleVerdictExpressionProperty(verdictExpression))

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleConditionProperty,
    ) : CdkObject(cdkObject),
        RuleConditionProperty {
      /**
       * The condition applies to a boolean expression passed in this field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulecondition.html#cfn-ses-mailmanagerruleset-rulecondition-booleanexpression)
       */
      override fun booleanExpression(): Any? = unwrap(this).getBooleanExpression()

      /**
       * The condition applies to a DMARC policy expression passed in this field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulecondition.html#cfn-ses-mailmanagerruleset-rulecondition-dmarcexpression)
       */
      override fun dmarcExpression(): Any? = unwrap(this).getDmarcExpression()

      /**
       * The condition applies to an IP address expression passed in this field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulecondition.html#cfn-ses-mailmanagerruleset-rulecondition-ipexpression)
       */
      override fun ipExpression(): Any? = unwrap(this).getIpExpression()

      /**
       * The condition applies to a number expression passed in this field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulecondition.html#cfn-ses-mailmanagerruleset-rulecondition-numberexpression)
       */
      override fun numberExpression(): Any? = unwrap(this).getNumberExpression()

      /**
       * The condition applies to a string expression passed in this field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulecondition.html#cfn-ses-mailmanagerruleset-rulecondition-stringexpression)
       */
      override fun stringExpression(): Any? = unwrap(this).getStringExpression()

      /**
       * The condition applies to a verdict expression passed in this field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulecondition.html#cfn-ses-mailmanagerruleset-rulecondition-verdictexpression)
       */
      override fun verdictExpression(): Any? = unwrap(this).getVerdictExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleConditionProperty):
          RuleConditionProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleConditionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleConditionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleConditionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleConditionProperty
    }
  }

  /**
   * A DMARC policy expression.
   *
   * The condition matches if the given DMARC policy matches that of the incoming email.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * RuleDmarcExpressionProperty ruleDmarcExpressionProperty = RuleDmarcExpressionProperty.builder()
   * .operator("operator")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruledmarcexpression.html)
   */
  public interface RuleDmarcExpressionProperty {
    /**
     * The operator to apply to the DMARC policy of the incoming email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruledmarcexpression.html#cfn-ses-mailmanagerruleset-ruledmarcexpression-operator)
     */
    public fun `operator`(): String

    /**
     * The values to use for the given DMARC policy operator.
     *
     * For the operator EQUALS, if multiple values are given, they are evaluated as an OR. That is,
     * if any of the given values match, the condition is deemed to match. For the operator NOT_EQUALS,
     * if multiple values are given, they are evaluated as an AND. That is, only if the email's DMARC
     * policy is not equal to any of the given values, then the condition is deemed to match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruledmarcexpression.html#cfn-ses-mailmanagerruleset-ruledmarcexpression-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [RuleDmarcExpressionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param operator The operator to apply to the DMARC policy of the incoming email. 
       */
      public fun `operator`(`operator`: String)

      /**
       * @param values The values to use for the given DMARC policy operator. 
       * For the operator EQUALS, if multiple values are given, they are evaluated as an OR. That
       * is, if any of the given values match, the condition is deemed to match. For the operator
       * NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is, only if the
       * email's DMARC policy is not equal to any of the given values, then the condition is deemed to
       * match.
       */
      public fun values(values: List<String>)

      /**
       * @param values The values to use for the given DMARC policy operator. 
       * For the operator EQUALS, if multiple values are given, they are evaluated as an OR. That
       * is, if any of the given values match, the condition is deemed to match. For the operator
       * NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is, only if the
       * email's DMARC policy is not equal to any of the given values, then the condition is deemed to
       * match.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleDmarcExpressionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleDmarcExpressionProperty.builder()

      /**
       * @param operator The operator to apply to the DMARC policy of the incoming email. 
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param values The values to use for the given DMARC policy operator. 
       * For the operator EQUALS, if multiple values are given, they are evaluated as an OR. That
       * is, if any of the given values match, the condition is deemed to match. For the operator
       * NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is, only if the
       * email's DMARC policy is not equal to any of the given values, then the condition is deemed to
       * match.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The values to use for the given DMARC policy operator. 
       * For the operator EQUALS, if multiple values are given, they are evaluated as an OR. That
       * is, if any of the given values match, the condition is deemed to match. For the operator
       * NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is, only if the
       * email's DMARC policy is not equal to any of the given values, then the condition is deemed to
       * match.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleDmarcExpressionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleDmarcExpressionProperty,
    ) : CdkObject(cdkObject),
        RuleDmarcExpressionProperty {
      /**
       * The operator to apply to the DMARC policy of the incoming email.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruledmarcexpression.html#cfn-ses-mailmanagerruleset-ruledmarcexpression-operator)
       */
      override fun `operator`(): String = unwrap(this).getOperator()

      /**
       * The values to use for the given DMARC policy operator.
       *
       * For the operator EQUALS, if multiple values are given, they are evaluated as an OR. That
       * is, if any of the given values match, the condition is deemed to match. For the operator
       * NOT_EQUALS, if multiple values are given, they are evaluated as an AND. That is, only if the
       * email's DMARC policy is not equal to any of the given values, then the condition is deemed to
       * match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruledmarcexpression.html#cfn-ses-mailmanagerruleset-ruledmarcexpression-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleDmarcExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleDmarcExpressionProperty):
          RuleDmarcExpressionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuleDmarcExpressionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleDmarcExpressionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleDmarcExpressionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleDmarcExpressionProperty
    }
  }

  /**
   * An IP address expression matching certain IP addresses within a given range of IP addresses.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * RuleIpExpressionProperty ruleIpExpressionProperty = RuleIpExpressionProperty.builder()
   * .evaluate(RuleIpToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleipexpression.html)
   */
  public interface RuleIpExpressionProperty {
    /**
     * The IP address to evaluate in this condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleipexpression.html#cfn-ses-mailmanagerruleset-ruleipexpression-evaluate)
     */
    public fun evaluate(): Any

    /**
     * The operator to evaluate the IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleipexpression.html#cfn-ses-mailmanagerruleset-ruleipexpression-operator)
     */
    public fun `operator`(): String

    /**
     * The IP CIDR blocks in format "x.y.z.w/n" (eg 10.0.0.0/8) to match with the email's IP
     * address. For the operator CIDR_MATCHES, if multiple values are given, they are evaluated as an
     * OR. That is, if the IP address is contained within any of the given CIDR ranges, the condition
     * is deemed to match. For NOT_CIDR_MATCHES, if multiple CIDR ranges are given, the condition is
     * deemed to match if the IP address is not contained in any of the given CIDR ranges.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleipexpression.html#cfn-ses-mailmanagerruleset-ruleipexpression-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [RuleIpExpressionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param evaluate The IP address to evaluate in this condition. 
       */
      public fun evaluate(evaluate: IResolvable)

      /**
       * @param evaluate The IP address to evaluate in this condition. 
       */
      public fun evaluate(evaluate: RuleIpToEvaluateProperty)

      /**
       * @param evaluate The IP address to evaluate in this condition. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cef72ebbc414e64de6b08923e2184281cb2fd7692b7af3e3a60c98f7b9d42b2e")
      public fun evaluate(evaluate: RuleIpToEvaluateProperty.Builder.() -> Unit)

      /**
       * @param operator The operator to evaluate the IP address. 
       */
      public fun `operator`(`operator`: String)

      /**
       * @param values The IP CIDR blocks in format "x.y.z.w/n" (eg 10.0.0.0/8) to match with the
       * email's IP address. For the operator CIDR_MATCHES, if multiple values are given, they are
       * evaluated as an OR. That is, if the IP address is contained within any of the given CIDR
       * ranges, the condition is deemed to match. For NOT_CIDR_MATCHES, if multiple CIDR ranges are
       * given, the condition is deemed to match if the IP address is not contained in any of the given
       * CIDR ranges. 
       */
      public fun values(values: List<String>)

      /**
       * @param values The IP CIDR blocks in format "x.y.z.w/n" (eg 10.0.0.0/8) to match with the
       * email's IP address. For the operator CIDR_MATCHES, if multiple values are given, they are
       * evaluated as an OR. That is, if the IP address is contained within any of the given CIDR
       * ranges, the condition is deemed to match. For NOT_CIDR_MATCHES, if multiple CIDR ranges are
       * given, the condition is deemed to match if the IP address is not contained in any of the given
       * CIDR ranges. 
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIpExpressionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIpExpressionProperty.builder()

      /**
       * @param evaluate The IP address to evaluate in this condition. 
       */
      override fun evaluate(evaluate: IResolvable) {
        cdkBuilder.evaluate(evaluate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param evaluate The IP address to evaluate in this condition. 
       */
      override fun evaluate(evaluate: RuleIpToEvaluateProperty) {
        cdkBuilder.evaluate(evaluate.let(RuleIpToEvaluateProperty.Companion::unwrap))
      }

      /**
       * @param evaluate The IP address to evaluate in this condition. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cef72ebbc414e64de6b08923e2184281cb2fd7692b7af3e3a60c98f7b9d42b2e")
      override fun evaluate(evaluate: RuleIpToEvaluateProperty.Builder.() -> Unit): Unit =
          evaluate(RuleIpToEvaluateProperty(evaluate))

      /**
       * @param operator The operator to evaluate the IP address. 
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param values The IP CIDR blocks in format "x.y.z.w/n" (eg 10.0.0.0/8) to match with the
       * email's IP address. For the operator CIDR_MATCHES, if multiple values are given, they are
       * evaluated as an OR. That is, if the IP address is contained within any of the given CIDR
       * ranges, the condition is deemed to match. For NOT_CIDR_MATCHES, if multiple CIDR ranges are
       * given, the condition is deemed to match if the IP address is not contained in any of the given
       * CIDR ranges. 
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The IP CIDR blocks in format "x.y.z.w/n" (eg 10.0.0.0/8) to match with the
       * email's IP address. For the operator CIDR_MATCHES, if multiple values are given, they are
       * evaluated as an OR. That is, if the IP address is contained within any of the given CIDR
       * ranges, the condition is deemed to match. For NOT_CIDR_MATCHES, if multiple CIDR ranges are
       * given, the condition is deemed to match if the IP address is not contained in any of the given
       * CIDR ranges. 
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIpExpressionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIpExpressionProperty,
    ) : CdkObject(cdkObject),
        RuleIpExpressionProperty {
      /**
       * The IP address to evaluate in this condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleipexpression.html#cfn-ses-mailmanagerruleset-ruleipexpression-evaluate)
       */
      override fun evaluate(): Any = unwrap(this).getEvaluate()

      /**
       * The operator to evaluate the IP address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleipexpression.html#cfn-ses-mailmanagerruleset-ruleipexpression-operator)
       */
      override fun `operator`(): String = unwrap(this).getOperator()

      /**
       * The IP CIDR blocks in format "x.y.z.w/n" (eg 10.0.0.0/8) to match with the email's IP
       * address. For the operator CIDR_MATCHES, if multiple values are given, they are evaluated as an
       * OR. That is, if the IP address is contained within any of the given CIDR ranges, the condition
       * is deemed to match. For NOT_CIDR_MATCHES, if multiple CIDR ranges are given, the condition is
       * deemed to match if the IP address is not contained in any of the given CIDR ranges.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleipexpression.html#cfn-ses-mailmanagerruleset-ruleipexpression-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleIpExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIpExpressionProperty):
          RuleIpExpressionProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleIpExpressionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleIpExpressionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIpExpressionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIpExpressionProperty
    }
  }

  /**
   * The IP address to evaluate for this condition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * RuleIpToEvaluateProperty ruleIpToEvaluateProperty = RuleIpToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleiptoevaluate.html)
   */
  public interface RuleIpToEvaluateProperty {
    /**
     * The attribute of the email to evaluate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleiptoevaluate.html#cfn-ses-mailmanagerruleset-ruleiptoevaluate-attribute)
     */
    public fun attribute(): String

    /**
     * A builder for [RuleIpToEvaluateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attribute The attribute of the email to evaluate. 
       */
      public fun attribute(attribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIpToEvaluateProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIpToEvaluateProperty.builder()

      /**
       * @param attribute The attribute of the email to evaluate. 
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIpToEvaluateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIpToEvaluateProperty,
    ) : CdkObject(cdkObject),
        RuleIpToEvaluateProperty {
      /**
       * The attribute of the email to evaluate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleiptoevaluate.html#cfn-ses-mailmanagerruleset-ruleiptoevaluate-attribute)
       */
      override fun attribute(): String = unwrap(this).getAttribute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleIpToEvaluateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIpToEvaluateProperty):
          RuleIpToEvaluateProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleIpToEvaluateProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleIpToEvaluateProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIpToEvaluateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIpToEvaluateProperty
    }
  }

  /**
   * The structure type for a boolean condition that provides the address lists and address list
   * attribute to evaluate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * RuleIsInAddressListProperty ruleIsInAddressListProperty = RuleIsInAddressListProperty.builder()
   * .addressLists(List.of("addressLists"))
   * .attribute("attribute")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleisinaddresslist.html)
   */
  public interface RuleIsInAddressListProperty {
    /**
     * The address lists that will be used for evaluation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleisinaddresslist.html#cfn-ses-mailmanagerruleset-ruleisinaddresslist-addresslists)
     */
    public fun addressLists(): List<String>

    /**
     * The email attribute that needs to be evaluated against the address list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleisinaddresslist.html#cfn-ses-mailmanagerruleset-ruleisinaddresslist-attribute)
     */
    public fun attribute(): String

    /**
     * A builder for [RuleIsInAddressListProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addressLists The address lists that will be used for evaluation. 
       */
      public fun addressLists(addressLists: List<String>)

      /**
       * @param addressLists The address lists that will be used for evaluation. 
       */
      public fun addressLists(vararg addressLists: String)

      /**
       * @param attribute The email attribute that needs to be evaluated against the address list. 
       */
      public fun attribute(attribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIsInAddressListProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIsInAddressListProperty.builder()

      /**
       * @param addressLists The address lists that will be used for evaluation. 
       */
      override fun addressLists(addressLists: List<String>) {
        cdkBuilder.addressLists(addressLists)
      }

      /**
       * @param addressLists The address lists that will be used for evaluation. 
       */
      override fun addressLists(vararg addressLists: String): Unit =
          addressLists(addressLists.toList())

      /**
       * @param attribute The email attribute that needs to be evaluated against the address list. 
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIsInAddressListProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIsInAddressListProperty,
    ) : CdkObject(cdkObject),
        RuleIsInAddressListProperty {
      /**
       * The address lists that will be used for evaluation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleisinaddresslist.html#cfn-ses-mailmanagerruleset-ruleisinaddresslist-addresslists)
       */
      override fun addressLists(): List<String> = unwrap(this).getAddressLists()

      /**
       * The email attribute that needs to be evaluated against the address list.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleisinaddresslist.html#cfn-ses-mailmanagerruleset-ruleisinaddresslist-attribute)
       */
      override fun attribute(): String = unwrap(this).getAttribute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleIsInAddressListProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIsInAddressListProperty):
          RuleIsInAddressListProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuleIsInAddressListProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleIsInAddressListProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIsInAddressListProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleIsInAddressListProperty
    }
  }

  /**
   * A number expression to match numeric conditions with integers from the incoming email.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * RuleNumberExpressionProperty ruleNumberExpressionProperty =
   * RuleNumberExpressionProperty.builder()
   * .evaluate(RuleNumberToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulenumberexpression.html)
   */
  public interface RuleNumberExpressionProperty {
    /**
     * The number to evaluate in a numeric condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulenumberexpression.html#cfn-ses-mailmanagerruleset-rulenumberexpression-evaluate)
     */
    public fun evaluate(): Any

    /**
     * The operator for a numeric condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulenumberexpression.html#cfn-ses-mailmanagerruleset-rulenumberexpression-operator)
     */
    public fun `operator`(): String

    /**
     * The value to evaluate in a numeric condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulenumberexpression.html#cfn-ses-mailmanagerruleset-rulenumberexpression-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [RuleNumberExpressionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param evaluate The number to evaluate in a numeric condition expression. 
       */
      public fun evaluate(evaluate: IResolvable)

      /**
       * @param evaluate The number to evaluate in a numeric condition expression. 
       */
      public fun evaluate(evaluate: RuleNumberToEvaluateProperty)

      /**
       * @param evaluate The number to evaluate in a numeric condition expression. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fafd77a4e9ebc9af5b6af5e4d4f0192c753c9af587ef59dac6b559a92d077d4")
      public fun evaluate(evaluate: RuleNumberToEvaluateProperty.Builder.() -> Unit)

      /**
       * @param operator The operator for a numeric condition expression. 
       */
      public fun `operator`(`operator`: String)

      /**
       * @param value The value to evaluate in a numeric condition expression. 
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleNumberExpressionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleNumberExpressionProperty.builder()

      /**
       * @param evaluate The number to evaluate in a numeric condition expression. 
       */
      override fun evaluate(evaluate: IResolvable) {
        cdkBuilder.evaluate(evaluate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param evaluate The number to evaluate in a numeric condition expression. 
       */
      override fun evaluate(evaluate: RuleNumberToEvaluateProperty) {
        cdkBuilder.evaluate(evaluate.let(RuleNumberToEvaluateProperty.Companion::unwrap))
      }

      /**
       * @param evaluate The number to evaluate in a numeric condition expression. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2fafd77a4e9ebc9af5b6af5e4d4f0192c753c9af587ef59dac6b559a92d077d4")
      override fun evaluate(evaluate: RuleNumberToEvaluateProperty.Builder.() -> Unit): Unit =
          evaluate(RuleNumberToEvaluateProperty(evaluate))

      /**
       * @param operator The operator for a numeric condition expression. 
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param value The value to evaluate in a numeric condition expression. 
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleNumberExpressionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleNumberExpressionProperty,
    ) : CdkObject(cdkObject),
        RuleNumberExpressionProperty {
      /**
       * The number to evaluate in a numeric condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulenumberexpression.html#cfn-ses-mailmanagerruleset-rulenumberexpression-evaluate)
       */
      override fun evaluate(): Any = unwrap(this).getEvaluate()

      /**
       * The operator for a numeric condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulenumberexpression.html#cfn-ses-mailmanagerruleset-rulenumberexpression-operator)
       */
      override fun `operator`(): String = unwrap(this).getOperator()

      /**
       * The value to evaluate in a numeric condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulenumberexpression.html#cfn-ses-mailmanagerruleset-rulenumberexpression-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleNumberExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleNumberExpressionProperty):
          RuleNumberExpressionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuleNumberExpressionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleNumberExpressionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleNumberExpressionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleNumberExpressionProperty
    }
  }

  /**
   * The number to evaluate in a numeric condition expression.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * RuleNumberToEvaluateProperty ruleNumberToEvaluateProperty =
   * RuleNumberToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulenumbertoevaluate.html)
   */
  public interface RuleNumberToEvaluateProperty {
    /**
     * An email attribute that is used as the number to evaluate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulenumbertoevaluate.html#cfn-ses-mailmanagerruleset-rulenumbertoevaluate-attribute)
     */
    public fun attribute(): String

    /**
     * A builder for [RuleNumberToEvaluateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attribute An email attribute that is used as the number to evaluate. 
       */
      public fun attribute(attribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleNumberToEvaluateProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleNumberToEvaluateProperty.builder()

      /**
       * @param attribute An email attribute that is used as the number to evaluate. 
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleNumberToEvaluateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleNumberToEvaluateProperty,
    ) : CdkObject(cdkObject),
        RuleNumberToEvaluateProperty {
      /**
       * An email attribute that is used as the number to evaluate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulenumbertoevaluate.html#cfn-ses-mailmanagerruleset-rulenumbertoevaluate-attribute)
       */
      override fun attribute(): String = unwrap(this).getAttribute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleNumberToEvaluateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleNumberToEvaluateProperty):
          RuleNumberToEvaluateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuleNumberToEvaluateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleNumberToEvaluateProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleNumberToEvaluateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleNumberToEvaluateProperty
    }
  }

  /**
   * A rule contains conditions, "unless conditions" and actions.
   *
   * For each envelope recipient of an email, if all conditions match and none of the "unless
   * conditions" match, then all of the actions are executed sequentially. If no conditions are
   * provided, the rule always applies and the actions are implicitly executed. If only "unless
   * conditions" are provided, the rule applies if the email does not match the evaluation of the
   * "unless conditions".
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * Object drop;
   * RuleProperty ruleProperty = RuleProperty.builder()
   * .actions(List.of(RuleActionProperty.builder()
   * .addHeader(AddHeaderActionProperty.builder()
   * .headerName("headerName")
   * .headerValue("headerValue")
   * .build())
   * .archive(ArchiveActionProperty.builder()
   * .targetArchive("targetArchive")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .build())
   * .deliverToMailbox(DeliverToMailboxActionProperty.builder()
   * .mailboxArn("mailboxArn")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .build())
   * .deliverToQBusiness(DeliverToQBusinessActionProperty.builder()
   * .applicationId("applicationId")
   * .indexId("indexId")
   * .roleArn("roleArn")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .build())
   * .drop(drop)
   * .publishToSns(SnsActionProperty.builder()
   * .roleArn("roleArn")
   * .topicArn("topicArn")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .encoding("encoding")
   * .payloadType("payloadType")
   * .build())
   * .relay(RelayActionProperty.builder()
   * .relay("relay")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .mailFrom("mailFrom")
   * .build())
   * .replaceRecipient(ReplaceRecipientActionProperty.builder()
   * .replaceWith(List.of("replaceWith"))
   * .build())
   * .send(SendActionProperty.builder()
   * .roleArn("roleArn")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .build())
   * .writeToS3(S3ActionProperty.builder()
   * .roleArn("roleArn")
   * .s3Bucket("s3Bucket")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .s3Prefix("s3Prefix")
   * .s3SseKmsKeyId("s3SseKmsKeyId")
   * .build())
   * .build()))
   * // the properties below are optional
   * .conditions(List.of(RuleConditionProperty.builder()
   * .booleanExpression(RuleBooleanExpressionProperty.builder()
   * .evaluate(RuleBooleanToEvaluateProperty.builder()
   * .analysis(AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .isInAddressList(RuleIsInAddressListProperty.builder()
   * .addressLists(List.of("addressLists"))
   * .attribute("attribute")
   * .build())
   * .build())
   * .operator("operator")
   * .build())
   * .dmarcExpression(RuleDmarcExpressionProperty.builder()
   * .operator("operator")
   * .values(List.of("values"))
   * .build())
   * .ipExpression(RuleIpExpressionProperty.builder()
   * .evaluate(RuleIpToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build())
   * .numberExpression(RuleNumberExpressionProperty.builder()
   * .evaluate(RuleNumberToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .value(123)
   * .build())
   * .stringExpression(RuleStringExpressionProperty.builder()
   * .evaluate(RuleStringToEvaluateProperty.builder()
   * .analysis(AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .mimeHeaderAttribute("mimeHeaderAttribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build())
   * .verdictExpression(RuleVerdictExpressionProperty.builder()
   * .evaluate(RuleVerdictToEvaluateProperty.builder()
   * .analysis(AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build())
   * .build()))
   * .name("name")
   * .unless(List.of(RuleConditionProperty.builder()
   * .booleanExpression(RuleBooleanExpressionProperty.builder()
   * .evaluate(RuleBooleanToEvaluateProperty.builder()
   * .analysis(AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .isInAddressList(RuleIsInAddressListProperty.builder()
   * .addressLists(List.of("addressLists"))
   * .attribute("attribute")
   * .build())
   * .build())
   * .operator("operator")
   * .build())
   * .dmarcExpression(RuleDmarcExpressionProperty.builder()
   * .operator("operator")
   * .values(List.of("values"))
   * .build())
   * .ipExpression(RuleIpExpressionProperty.builder()
   * .evaluate(RuleIpToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build())
   * .numberExpression(RuleNumberExpressionProperty.builder()
   * .evaluate(RuleNumberToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .value(123)
   * .build())
   * .stringExpression(RuleStringExpressionProperty.builder()
   * .evaluate(RuleStringToEvaluateProperty.builder()
   * .analysis(AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .mimeHeaderAttribute("mimeHeaderAttribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build())
   * .verdictExpression(RuleVerdictExpressionProperty.builder()
   * .evaluate(RuleVerdictToEvaluateProperty.builder()
   * .analysis(AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rule.html)
   */
  public interface RuleProperty {
    /**
     * The list of actions to execute when the conditions match the incoming email, and none of the
     * "unless conditions" match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rule.html#cfn-ses-mailmanagerruleset-rule-actions)
     */
    public fun actions(): Any

    /**
     * The conditions of this rule.
     *
     * All conditions must match the email for the actions to be executed. An empty list of
     * conditions means that all emails match, but are still subject to any "unless conditions"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rule.html#cfn-ses-mailmanagerruleset-rule-conditions)
     */
    public fun conditions(): Any? = unwrap(this).getConditions()

    /**
     * The user-friendly name of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rule.html#cfn-ses-mailmanagerruleset-rule-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The "unless conditions" of this rule.
     *
     * None of the conditions can match the email for the actions to be executed. If any of these
     * conditions do match the email, then the actions are not executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rule.html#cfn-ses-mailmanagerruleset-rule-unless)
     */
    public fun unless(): Any? = unwrap(this).getUnless()

    /**
     * A builder for [RuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actions The list of actions to execute when the conditions match the incoming email,
       * and none of the "unless conditions" match. 
       */
      public fun actions(actions: IResolvable)

      /**
       * @param actions The list of actions to execute when the conditions match the incoming email,
       * and none of the "unless conditions" match. 
       */
      public fun actions(actions: List<Any>)

      /**
       * @param actions The list of actions to execute when the conditions match the incoming email,
       * and none of the "unless conditions" match. 
       */
      public fun actions(vararg actions: Any)

      /**
       * @param conditions The conditions of this rule.
       * All conditions must match the email for the actions to be executed. An empty list of
       * conditions means that all emails match, but are still subject to any "unless conditions"
       */
      public fun conditions(conditions: IResolvable)

      /**
       * @param conditions The conditions of this rule.
       * All conditions must match the email for the actions to be executed. An empty list of
       * conditions means that all emails match, but are still subject to any "unless conditions"
       */
      public fun conditions(conditions: List<Any>)

      /**
       * @param conditions The conditions of this rule.
       * All conditions must match the email for the actions to be executed. An empty list of
       * conditions means that all emails match, but are still subject to any "unless conditions"
       */
      public fun conditions(vararg conditions: Any)

      /**
       * @param name The user-friendly name of the rule.
       */
      public fun name(name: String)

      /**
       * @param unless The "unless conditions" of this rule.
       * None of the conditions can match the email for the actions to be executed. If any of these
       * conditions do match the email, then the actions are not executed.
       */
      public fun unless(unless: IResolvable)

      /**
       * @param unless The "unless conditions" of this rule.
       * None of the conditions can match the email for the actions to be executed. If any of these
       * conditions do match the email, then the actions are not executed.
       */
      public fun unless(unless: List<Any>)

      /**
       * @param unless The "unless conditions" of this rule.
       * None of the conditions can match the email for the actions to be executed. If any of these
       * conditions do match the email, then the actions are not executed.
       */
      public fun unless(vararg unless: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleProperty.Builder =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleProperty.builder()

      /**
       * @param actions The list of actions to execute when the conditions match the incoming email,
       * and none of the "unless conditions" match. 
       */
      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param actions The list of actions to execute when the conditions match the incoming email,
       * and none of the "unless conditions" match. 
       */
      override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param actions The list of actions to execute when the conditions match the incoming email,
       * and none of the "unless conditions" match. 
       */
      override fun actions(vararg actions: Any): Unit = actions(actions.toList())

      /**
       * @param conditions The conditions of this rule.
       * All conditions must match the email for the actions to be executed. An empty list of
       * conditions means that all emails match, but are still subject to any "unless conditions"
       */
      override fun conditions(conditions: IResolvable) {
        cdkBuilder.conditions(conditions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conditions The conditions of this rule.
       * All conditions must match the email for the actions to be executed. An empty list of
       * conditions means that all emails match, but are still subject to any "unless conditions"
       */
      override fun conditions(conditions: List<Any>) {
        cdkBuilder.conditions(conditions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param conditions The conditions of this rule.
       * All conditions must match the email for the actions to be executed. An empty list of
       * conditions means that all emails match, but are still subject to any "unless conditions"
       */
      override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

      /**
       * @param name The user-friendly name of the rule.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param unless The "unless conditions" of this rule.
       * None of the conditions can match the email for the actions to be executed. If any of these
       * conditions do match the email, then the actions are not executed.
       */
      override fun unless(unless: IResolvable) {
        cdkBuilder.unless(unless.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param unless The "unless conditions" of this rule.
       * None of the conditions can match the email for the actions to be executed. If any of these
       * conditions do match the email, then the actions are not executed.
       */
      override fun unless(unless: List<Any>) {
        cdkBuilder.unless(unless.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param unless The "unless conditions" of this rule.
       * None of the conditions can match the email for the actions to be executed. If any of these
       * conditions do match the email, then the actions are not executed.
       */
      override fun unless(vararg unless: Any): Unit = unless(unless.toList())

      public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleProperty,
    ) : CdkObject(cdkObject),
        RuleProperty {
      /**
       * The list of actions to execute when the conditions match the incoming email, and none of
       * the "unless conditions" match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rule.html#cfn-ses-mailmanagerruleset-rule-actions)
       */
      override fun actions(): Any = unwrap(this).getActions()

      /**
       * The conditions of this rule.
       *
       * All conditions must match the email for the actions to be executed. An empty list of
       * conditions means that all emails match, but are still subject to any "unless conditions"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rule.html#cfn-ses-mailmanagerruleset-rule-conditions)
       */
      override fun conditions(): Any? = unwrap(this).getConditions()

      /**
       * The user-friendly name of the rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rule.html#cfn-ses-mailmanagerruleset-rule-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The "unless conditions" of this rule.
       *
       * None of the conditions can match the email for the actions to be executed. If any of these
       * conditions do match the email, then the actions are not executed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rule.html#cfn-ses-mailmanagerruleset-rule-unless)
       */
      override fun unless(): Any? = unwrap(this).getUnless()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleProperty):
          RuleProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleProperty
    }
  }

  /**
   * A string expression is evaluated against strings or substrings of the email.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * RuleStringExpressionProperty ruleStringExpressionProperty =
   * RuleStringExpressionProperty.builder()
   * .evaluate(RuleStringToEvaluateProperty.builder()
   * .analysis(AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .mimeHeaderAttribute("mimeHeaderAttribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulestringexpression.html)
   */
  public interface RuleStringExpressionProperty {
    /**
     * The string to evaluate in a string condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulestringexpression.html#cfn-ses-mailmanagerruleset-rulestringexpression-evaluate)
     */
    public fun evaluate(): Any

    /**
     * The matching operator for a string condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulestringexpression.html#cfn-ses-mailmanagerruleset-rulestringexpression-operator)
     */
    public fun `operator`(): String

    /**
     * The string(s) to be evaluated in a string condition expression.
     *
     * For all operators, except for NOT_EQUALS, if multiple values are given, the values are
     * processed as an OR. That is, if any of the values match the email's string using the given
     * operator, the condition is deemed to match. However, for NOT_EQUALS, the condition is only
     * deemed to match if none of the given strings match the email's string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulestringexpression.html#cfn-ses-mailmanagerruleset-rulestringexpression-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [RuleStringExpressionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param evaluate The string to evaluate in a string condition expression. 
       */
      public fun evaluate(evaluate: IResolvable)

      /**
       * @param evaluate The string to evaluate in a string condition expression. 
       */
      public fun evaluate(evaluate: RuleStringToEvaluateProperty)

      /**
       * @param evaluate The string to evaluate in a string condition expression. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2e8ab33b37a21dab971839d45ccda23dd8894a9428265d4e81e955ac59717aa")
      public fun evaluate(evaluate: RuleStringToEvaluateProperty.Builder.() -> Unit)

      /**
       * @param operator The matching operator for a string condition expression. 
       */
      public fun `operator`(`operator`: String)

      /**
       * @param values The string(s) to be evaluated in a string condition expression. 
       * For all operators, except for NOT_EQUALS, if multiple values are given, the values are
       * processed as an OR. That is, if any of the values match the email's string using the given
       * operator, the condition is deemed to match. However, for NOT_EQUALS, the condition is only
       * deemed to match if none of the given strings match the email's string.
       */
      public fun values(values: List<String>)

      /**
       * @param values The string(s) to be evaluated in a string condition expression. 
       * For all operators, except for NOT_EQUALS, if multiple values are given, the values are
       * processed as an OR. That is, if any of the values match the email's string using the given
       * operator, the condition is deemed to match. However, for NOT_EQUALS, the condition is only
       * deemed to match if none of the given strings match the email's string.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleStringExpressionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleStringExpressionProperty.builder()

      /**
       * @param evaluate The string to evaluate in a string condition expression. 
       */
      override fun evaluate(evaluate: IResolvable) {
        cdkBuilder.evaluate(evaluate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param evaluate The string to evaluate in a string condition expression. 
       */
      override fun evaluate(evaluate: RuleStringToEvaluateProperty) {
        cdkBuilder.evaluate(evaluate.let(RuleStringToEvaluateProperty.Companion::unwrap))
      }

      /**
       * @param evaluate The string to evaluate in a string condition expression. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2e8ab33b37a21dab971839d45ccda23dd8894a9428265d4e81e955ac59717aa")
      override fun evaluate(evaluate: RuleStringToEvaluateProperty.Builder.() -> Unit): Unit =
          evaluate(RuleStringToEvaluateProperty(evaluate))

      /**
       * @param operator The matching operator for a string condition expression. 
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param values The string(s) to be evaluated in a string condition expression. 
       * For all operators, except for NOT_EQUALS, if multiple values are given, the values are
       * processed as an OR. That is, if any of the values match the email's string using the given
       * operator, the condition is deemed to match. However, for NOT_EQUALS, the condition is only
       * deemed to match if none of the given strings match the email's string.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The string(s) to be evaluated in a string condition expression. 
       * For all operators, except for NOT_EQUALS, if multiple values are given, the values are
       * processed as an OR. That is, if any of the values match the email's string using the given
       * operator, the condition is deemed to match. However, for NOT_EQUALS, the condition is only
       * deemed to match if none of the given strings match the email's string.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleStringExpressionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleStringExpressionProperty,
    ) : CdkObject(cdkObject),
        RuleStringExpressionProperty {
      /**
       * The string to evaluate in a string condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulestringexpression.html#cfn-ses-mailmanagerruleset-rulestringexpression-evaluate)
       */
      override fun evaluate(): Any = unwrap(this).getEvaluate()

      /**
       * The matching operator for a string condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulestringexpression.html#cfn-ses-mailmanagerruleset-rulestringexpression-operator)
       */
      override fun `operator`(): String = unwrap(this).getOperator()

      /**
       * The string(s) to be evaluated in a string condition expression.
       *
       * For all operators, except for NOT_EQUALS, if multiple values are given, the values are
       * processed as an OR. That is, if any of the values match the email's string using the given
       * operator, the condition is deemed to match. However, for NOT_EQUALS, the condition is only
       * deemed to match if none of the given strings match the email's string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulestringexpression.html#cfn-ses-mailmanagerruleset-rulestringexpression-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleStringExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleStringExpressionProperty):
          RuleStringExpressionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuleStringExpressionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleStringExpressionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleStringExpressionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleStringExpressionProperty
    }
  }

  /**
   * The string to evaluate in a string condition expression.
   *
   *
   * This data type is a UNION, so only one of the following members can be specified when used or
   * returned.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * RuleStringToEvaluateProperty ruleStringToEvaluateProperty =
   * RuleStringToEvaluateProperty.builder()
   * .analysis(AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .mimeHeaderAttribute("mimeHeaderAttribute")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulestringtoevaluate.html)
   */
  public interface RuleStringToEvaluateProperty {
    /**
     * The Add On ARN and its returned value to evaluate in a string condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulestringtoevaluate.html#cfn-ses-mailmanagerruleset-rulestringtoevaluate-analysis)
     */
    public fun analysis(): Any? = unwrap(this).getAnalysis()

    /**
     * The email attribute to evaluate in a string condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulestringtoevaluate.html#cfn-ses-mailmanagerruleset-rulestringtoevaluate-attribute)
     */
    public fun attribute(): String? = unwrap(this).getAttribute()

    /**
     * The email MIME X-Header attribute to evaluate in a string condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulestringtoevaluate.html#cfn-ses-mailmanagerruleset-rulestringtoevaluate-mimeheaderattribute)
     */
    public fun mimeHeaderAttribute(): String? = unwrap(this).getMimeHeaderAttribute()

    /**
     * A builder for [RuleStringToEvaluateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a string condition
       * expression.
       */
      public fun analysis(analysis: IResolvable)

      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a string condition
       * expression.
       */
      public fun analysis(analysis: AnalysisProperty)

      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a string condition
       * expression.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb1bd5fef6eb3a80329b002ff9c86ae3ea9f7f91bfa1840051e4176f0231ecbd")
      public fun analysis(analysis: AnalysisProperty.Builder.() -> Unit)

      /**
       * @param attribute The email attribute to evaluate in a string condition expression.
       */
      public fun attribute(attribute: String)

      /**
       * @param mimeHeaderAttribute The email MIME X-Header attribute to evaluate in a string
       * condition expression.
       */
      public fun mimeHeaderAttribute(mimeHeaderAttribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleStringToEvaluateProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleStringToEvaluateProperty.builder()

      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a string condition
       * expression.
       */
      override fun analysis(analysis: IResolvable) {
        cdkBuilder.analysis(analysis.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a string condition
       * expression.
       */
      override fun analysis(analysis: AnalysisProperty) {
        cdkBuilder.analysis(analysis.let(AnalysisProperty.Companion::unwrap))
      }

      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a string condition
       * expression.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb1bd5fef6eb3a80329b002ff9c86ae3ea9f7f91bfa1840051e4176f0231ecbd")
      override fun analysis(analysis: AnalysisProperty.Builder.() -> Unit): Unit =
          analysis(AnalysisProperty(analysis))

      /**
       * @param attribute The email attribute to evaluate in a string condition expression.
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      /**
       * @param mimeHeaderAttribute The email MIME X-Header attribute to evaluate in a string
       * condition expression.
       */
      override fun mimeHeaderAttribute(mimeHeaderAttribute: String) {
        cdkBuilder.mimeHeaderAttribute(mimeHeaderAttribute)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleStringToEvaluateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleStringToEvaluateProperty,
    ) : CdkObject(cdkObject),
        RuleStringToEvaluateProperty {
      /**
       * The Add On ARN and its returned value to evaluate in a string condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulestringtoevaluate.html#cfn-ses-mailmanagerruleset-rulestringtoevaluate-analysis)
       */
      override fun analysis(): Any? = unwrap(this).getAnalysis()

      /**
       * The email attribute to evaluate in a string condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulestringtoevaluate.html#cfn-ses-mailmanagerruleset-rulestringtoevaluate-attribute)
       */
      override fun attribute(): String? = unwrap(this).getAttribute()

      /**
       * The email MIME X-Header attribute to evaluate in a string condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-rulestringtoevaluate.html#cfn-ses-mailmanagerruleset-rulestringtoevaluate-mimeheaderattribute)
       */
      override fun mimeHeaderAttribute(): String? = unwrap(this).getMimeHeaderAttribute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleStringToEvaluateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleStringToEvaluateProperty):
          RuleStringToEvaluateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuleStringToEvaluateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleStringToEvaluateProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleStringToEvaluateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleStringToEvaluateProperty
    }
  }

  /**
   * A verdict expression is evaluated against verdicts of the email.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * RuleVerdictExpressionProperty ruleVerdictExpressionProperty =
   * RuleVerdictExpressionProperty.builder()
   * .evaluate(RuleVerdictToEvaluateProperty.builder()
   * .analysis(AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleverdictexpression.html)
   */
  public interface RuleVerdictExpressionProperty {
    /**
     * The verdict to evaluate in a verdict condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleverdictexpression.html#cfn-ses-mailmanagerruleset-ruleverdictexpression-evaluate)
     */
    public fun evaluate(): Any

    /**
     * The matching operator for a verdict condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleverdictexpression.html#cfn-ses-mailmanagerruleset-ruleverdictexpression-operator)
     */
    public fun `operator`(): String

    /**
     * The values to match with the email's verdict using the given operator.
     *
     * For the EQUALS operator, if multiple values are given, the condition is deemed to match if
     * any of the given verdicts match that of the email. For the NOT_EQUALS operator, if multiple
     * values are given, the condition is deemed to match of none of the given verdicts match the
     * verdict of the email.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleverdictexpression.html#cfn-ses-mailmanagerruleset-ruleverdictexpression-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [RuleVerdictExpressionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param evaluate The verdict to evaluate in a verdict condition expression. 
       */
      public fun evaluate(evaluate: IResolvable)

      /**
       * @param evaluate The verdict to evaluate in a verdict condition expression. 
       */
      public fun evaluate(evaluate: RuleVerdictToEvaluateProperty)

      /**
       * @param evaluate The verdict to evaluate in a verdict condition expression. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43567c7c92a6d41991ecbaa593ccb700de2d4c80f18b7dae4a3567520ca8110c")
      public fun evaluate(evaluate: RuleVerdictToEvaluateProperty.Builder.() -> Unit)

      /**
       * @param operator The matching operator for a verdict condition expression. 
       */
      public fun `operator`(`operator`: String)

      /**
       * @param values The values to match with the email's verdict using the given operator. 
       * For the EQUALS operator, if multiple values are given, the condition is deemed to match if
       * any of the given verdicts match that of the email. For the NOT_EQUALS operator, if multiple
       * values are given, the condition is deemed to match of none of the given verdicts match the
       * verdict of the email.
       */
      public fun values(values: List<String>)

      /**
       * @param values The values to match with the email's verdict using the given operator. 
       * For the EQUALS operator, if multiple values are given, the condition is deemed to match if
       * any of the given verdicts match that of the email. For the NOT_EQUALS operator, if multiple
       * values are given, the condition is deemed to match of none of the given verdicts match the
       * verdict of the email.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleVerdictExpressionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleVerdictExpressionProperty.builder()

      /**
       * @param evaluate The verdict to evaluate in a verdict condition expression. 
       */
      override fun evaluate(evaluate: IResolvable) {
        cdkBuilder.evaluate(evaluate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param evaluate The verdict to evaluate in a verdict condition expression. 
       */
      override fun evaluate(evaluate: RuleVerdictToEvaluateProperty) {
        cdkBuilder.evaluate(evaluate.let(RuleVerdictToEvaluateProperty.Companion::unwrap))
      }

      /**
       * @param evaluate The verdict to evaluate in a verdict condition expression. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43567c7c92a6d41991ecbaa593ccb700de2d4c80f18b7dae4a3567520ca8110c")
      override fun evaluate(evaluate: RuleVerdictToEvaluateProperty.Builder.() -> Unit): Unit =
          evaluate(RuleVerdictToEvaluateProperty(evaluate))

      /**
       * @param operator The matching operator for a verdict condition expression. 
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param values The values to match with the email's verdict using the given operator. 
       * For the EQUALS operator, if multiple values are given, the condition is deemed to match if
       * any of the given verdicts match that of the email. For the NOT_EQUALS operator, if multiple
       * values are given, the condition is deemed to match of none of the given verdicts match the
       * verdict of the email.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The values to match with the email's verdict using the given operator. 
       * For the EQUALS operator, if multiple values are given, the condition is deemed to match if
       * any of the given verdicts match that of the email. For the NOT_EQUALS operator, if multiple
       * values are given, the condition is deemed to match of none of the given verdicts match the
       * verdict of the email.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleVerdictExpressionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleVerdictExpressionProperty,
    ) : CdkObject(cdkObject),
        RuleVerdictExpressionProperty {
      /**
       * The verdict to evaluate in a verdict condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleverdictexpression.html#cfn-ses-mailmanagerruleset-ruleverdictexpression-evaluate)
       */
      override fun evaluate(): Any = unwrap(this).getEvaluate()

      /**
       * The matching operator for a verdict condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleverdictexpression.html#cfn-ses-mailmanagerruleset-ruleverdictexpression-operator)
       */
      override fun `operator`(): String = unwrap(this).getOperator()

      /**
       * The values to match with the email's verdict using the given operator.
       *
       * For the EQUALS operator, if multiple values are given, the condition is deemed to match if
       * any of the given verdicts match that of the email. For the NOT_EQUALS operator, if multiple
       * values are given, the condition is deemed to match of none of the given verdicts match the
       * verdict of the email.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleverdictexpression.html#cfn-ses-mailmanagerruleset-ruleverdictexpression-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleVerdictExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleVerdictExpressionProperty):
          RuleVerdictExpressionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuleVerdictExpressionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleVerdictExpressionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleVerdictExpressionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleVerdictExpressionProperty
    }
  }

  /**
   * The verdict to evaluate in a verdict condition expression.
   *
   *
   * This data type is a UNION, so only one of the following members can be specified when used or
   * returned.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * RuleVerdictToEvaluateProperty ruleVerdictToEvaluateProperty =
   * RuleVerdictToEvaluateProperty.builder()
   * .analysis(AnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleverdicttoevaluate.html)
   */
  public interface RuleVerdictToEvaluateProperty {
    /**
     * The Add On ARN and its returned value to evaluate in a verdict condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleverdicttoevaluate.html#cfn-ses-mailmanagerruleset-ruleverdicttoevaluate-analysis)
     */
    public fun analysis(): Any? = unwrap(this).getAnalysis()

    /**
     * The email verdict attribute to evaluate in a string verdict expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleverdicttoevaluate.html#cfn-ses-mailmanagerruleset-ruleverdicttoevaluate-attribute)
     */
    public fun attribute(): String? = unwrap(this).getAttribute()

    /**
     * A builder for [RuleVerdictToEvaluateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a verdict condition
       * expression.
       */
      public fun analysis(analysis: IResolvable)

      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a verdict condition
       * expression.
       */
      public fun analysis(analysis: AnalysisProperty)

      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a verdict condition
       * expression.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69d64c27246c4ebd6bdba0707a31f839ab04253e8143a92373bea809dbf71fbd")
      public fun analysis(analysis: AnalysisProperty.Builder.() -> Unit)

      /**
       * @param attribute The email verdict attribute to evaluate in a string verdict expression.
       */
      public fun attribute(attribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleVerdictToEvaluateProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleVerdictToEvaluateProperty.builder()

      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a verdict condition
       * expression.
       */
      override fun analysis(analysis: IResolvable) {
        cdkBuilder.analysis(analysis.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a verdict condition
       * expression.
       */
      override fun analysis(analysis: AnalysisProperty) {
        cdkBuilder.analysis(analysis.let(AnalysisProperty.Companion::unwrap))
      }

      /**
       * @param analysis The Add On ARN and its returned value to evaluate in a verdict condition
       * expression.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69d64c27246c4ebd6bdba0707a31f839ab04253e8143a92373bea809dbf71fbd")
      override fun analysis(analysis: AnalysisProperty.Builder.() -> Unit): Unit =
          analysis(AnalysisProperty(analysis))

      /**
       * @param attribute The email verdict attribute to evaluate in a string verdict expression.
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleVerdictToEvaluateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleVerdictToEvaluateProperty,
    ) : CdkObject(cdkObject),
        RuleVerdictToEvaluateProperty {
      /**
       * The Add On ARN and its returned value to evaluate in a verdict condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleverdicttoevaluate.html#cfn-ses-mailmanagerruleset-ruleverdicttoevaluate-analysis)
       */
      override fun analysis(): Any? = unwrap(this).getAnalysis()

      /**
       * The email verdict attribute to evaluate in a string verdict expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-ruleverdicttoevaluate.html#cfn-ses-mailmanagerruleset-ruleverdicttoevaluate-attribute)
       */
      override fun attribute(): String? = unwrap(this).getAttribute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleVerdictToEvaluateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleVerdictToEvaluateProperty):
          RuleVerdictToEvaluateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuleVerdictToEvaluateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleVerdictToEvaluateProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleVerdictToEvaluateProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.RuleVerdictToEvaluateProperty
    }
  }

  /**
   * Writes the MIME content of the email to an S3 bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * S3ActionProperty s3ActionProperty = S3ActionProperty.builder()
   * .roleArn("roleArn")
   * .s3Bucket("s3Bucket")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .s3Prefix("s3Prefix")
   * .s3SseKmsKeyId("s3SseKmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-s3action.html)
   */
  public interface S3ActionProperty {
    /**
     * A policy that states what to do in the case of failure.
     *
     * The action will fail if there are configuration errors. For example, the specified the bucket
     * has been deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-s3action.html#cfn-ses-mailmanagerruleset-s3action-actionfailurepolicy)
     */
    public fun actionFailurePolicy(): String? = unwrap(this).getActionFailurePolicy()

    /**
     * The Amazon Resource Name (ARN) of the IAM Role to use while writing to S3.
     *
     * This role must have access to the s3:PutObject, kms:Encrypt, and kms:GenerateDataKey APIs for
     * the given bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-s3action.html#cfn-ses-mailmanagerruleset-s3action-rolearn)
     */
    public fun roleArn(): String

    /**
     * The bucket name of the S3 bucket to write to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-s3action.html#cfn-ses-mailmanagerruleset-s3action-s3bucket)
     */
    public fun s3Bucket(): String

    /**
     * The S3 prefix to use for the write to the s3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-s3action.html#cfn-ses-mailmanagerruleset-s3action-s3prefix)
     */
    public fun s3Prefix(): String? = unwrap(this).getS3Prefix()

    /**
     * The KMS Key ID to use to encrypt the message in S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-s3action.html#cfn-ses-mailmanagerruleset-s3action-s3ssekmskeyid)
     */
    public fun s3SseKmsKeyId(): String? = unwrap(this).getS3SseKmsKeyId()

    /**
     * A builder for [S3ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionFailurePolicy A policy that states what to do in the case of failure.
       * The action will fail if there are configuration errors. For example, the specified the
       * bucket has been deleted.
       */
      public fun actionFailurePolicy(actionFailurePolicy: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM Role to use while writing to S3. 
       * This role must have access to the s3:PutObject, kms:Encrypt, and kms:GenerateDataKey APIs
       * for the given bucket.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param s3Bucket The bucket name of the S3 bucket to write to. 
       */
      public fun s3Bucket(s3Bucket: String)

      /**
       * @param s3Prefix The S3 prefix to use for the write to the s3 bucket.
       */
      public fun s3Prefix(s3Prefix: String)

      /**
       * @param s3SseKmsKeyId The KMS Key ID to use to encrypt the message in S3.
       */
      public fun s3SseKmsKeyId(s3SseKmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.S3ActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.S3ActionProperty.builder()

      /**
       * @param actionFailurePolicy A policy that states what to do in the case of failure.
       * The action will fail if there are configuration errors. For example, the specified the
       * bucket has been deleted.
       */
      override fun actionFailurePolicy(actionFailurePolicy: String) {
        cdkBuilder.actionFailurePolicy(actionFailurePolicy)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM Role to use while writing to S3. 
       * This role must have access to the s3:PutObject, kms:Encrypt, and kms:GenerateDataKey APIs
       * for the given bucket.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param s3Bucket The bucket name of the S3 bucket to write to. 
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      /**
       * @param s3Prefix The S3 prefix to use for the write to the s3 bucket.
       */
      override fun s3Prefix(s3Prefix: String) {
        cdkBuilder.s3Prefix(s3Prefix)
      }

      /**
       * @param s3SseKmsKeyId The KMS Key ID to use to encrypt the message in S3.
       */
      override fun s3SseKmsKeyId(s3SseKmsKeyId: String) {
        cdkBuilder.s3SseKmsKeyId(s3SseKmsKeyId)
      }

      public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.S3ActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.S3ActionProperty,
    ) : CdkObject(cdkObject),
        S3ActionProperty {
      /**
       * A policy that states what to do in the case of failure.
       *
       * The action will fail if there are configuration errors. For example, the specified the
       * bucket has been deleted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-s3action.html#cfn-ses-mailmanagerruleset-s3action-actionfailurepolicy)
       */
      override fun actionFailurePolicy(): String? = unwrap(this).getActionFailurePolicy()

      /**
       * The Amazon Resource Name (ARN) of the IAM Role to use while writing to S3.
       *
       * This role must have access to the s3:PutObject, kms:Encrypt, and kms:GenerateDataKey APIs
       * for the given bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-s3action.html#cfn-ses-mailmanagerruleset-s3action-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The bucket name of the S3 bucket to write to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-s3action.html#cfn-ses-mailmanagerruleset-s3action-s3bucket)
       */
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      /**
       * The S3 prefix to use for the write to the s3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-s3action.html#cfn-ses-mailmanagerruleset-s3action-s3prefix)
       */
      override fun s3Prefix(): String? = unwrap(this).getS3Prefix()

      /**
       * The KMS Key ID to use to encrypt the message in S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-s3action.html#cfn-ses-mailmanagerruleset-s3action-s3ssekmskeyid)
       */
      override fun s3SseKmsKeyId(): String? = unwrap(this).getS3SseKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.S3ActionProperty):
          S3ActionProperty = CdkObjectWrappers.wrap(cdkObject) as? S3ActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ActionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.S3ActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.S3ActionProperty
    }
  }

  /**
   * Sends the email to the internet using the ses:SendRawEmail API.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * SendActionProperty sendActionProperty = SendActionProperty.builder()
   * .roleArn("roleArn")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-sendaction.html)
   */
  public interface SendActionProperty {
    /**
     * A policy that states what to do in the case of failure.
     *
     * The action will fail if there are configuration errors. For example, the caller does not have
     * the permissions to call the sendRawEmail API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-sendaction.html#cfn-ses-mailmanagerruleset-sendaction-actionfailurepolicy)
     */
    public fun actionFailurePolicy(): String? = unwrap(this).getActionFailurePolicy()

    /**
     * The Amazon Resource Name (ARN) of the role to use for this action.
     *
     * This role must have access to the ses:SendRawEmail API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-sendaction.html#cfn-ses-mailmanagerruleset-sendaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * A builder for [SendActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionFailurePolicy A policy that states what to do in the case of failure.
       * The action will fail if there are configuration errors. For example, the caller does not
       * have the permissions to call the sendRawEmail API.
       */
      public fun actionFailurePolicy(actionFailurePolicy: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role to use for this action. 
       * This role must have access to the ses:SendRawEmail API.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.SendActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.SendActionProperty.builder()

      /**
       * @param actionFailurePolicy A policy that states what to do in the case of failure.
       * The action will fail if there are configuration errors. For example, the caller does not
       * have the permissions to call the sendRawEmail API.
       */
      override fun actionFailurePolicy(actionFailurePolicy: String) {
        cdkBuilder.actionFailurePolicy(actionFailurePolicy)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the role to use for this action. 
       * This role must have access to the ses:SendRawEmail API.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.SendActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.SendActionProperty,
    ) : CdkObject(cdkObject),
        SendActionProperty {
      /**
       * A policy that states what to do in the case of failure.
       *
       * The action will fail if there are configuration errors. For example, the caller does not
       * have the permissions to call the sendRawEmail API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-sendaction.html#cfn-ses-mailmanagerruleset-sendaction-actionfailurepolicy)
       */
      override fun actionFailurePolicy(): String? = unwrap(this).getActionFailurePolicy()

      /**
       * The Amazon Resource Name (ARN) of the role to use for this action.
       *
       * This role must have access to the ses:SendRawEmail API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-sendaction.html#cfn-ses-mailmanagerruleset-sendaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SendActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.SendActionProperty):
          SendActionProperty = CdkObjectWrappers.wrap(cdkObject) as? SendActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SendActionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.SendActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.SendActionProperty
    }
  }

  /**
   * The action to publish the email content to an Amazon SNS topic.
   *
   * When executed, this action will send the email as a notification to the specified SNS topic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * SnsActionProperty snsActionProperty = SnsActionProperty.builder()
   * .roleArn("roleArn")
   * .topicArn("topicArn")
   * // the properties below are optional
   * .actionFailurePolicy("actionFailurePolicy")
   * .encoding("encoding")
   * .payloadType("payloadType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-snsaction.html)
   */
  public interface SnsActionProperty {
    /**
     * A policy that states what to do in the case of failure.
     *
     * The action will fail if there are configuration errors. For example, specified SNS topic has
     * been deleted or the role lacks necessary permissions to call the `sns:Publish` API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-snsaction.html#cfn-ses-mailmanagerruleset-snsaction-actionfailurepolicy)
     */
    public fun actionFailurePolicy(): String? = unwrap(this).getActionFailurePolicy()

    /**
     * The encoding to use for the email within the Amazon SNS notification.
     *
     * The default value is `UTF-8` . Use `BASE64` if you need to preserve all special characters,
     * especially when the original message uses a different encoding format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-snsaction.html#cfn-ses-mailmanagerruleset-snsaction-encoding)
     */
    public fun encoding(): String? = unwrap(this).getEncoding()

    /**
     * The expected payload type within the Amazon SNS notification.
     *
     * `CONTENT` attempts to publish the full email content with 20KB of headers content. `HEADERS`
     * extracts up to 100KB of header content to include in the notification, email content will not be
     * included to the notification. The default value is `CONTENT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-snsaction.html#cfn-ses-mailmanagerruleset-snsaction-payloadtype)
     */
    public fun payloadType(): String? = unwrap(this).getPayloadType()

    /**
     * The Amazon Resource Name (ARN) of the IAM Role to use while writing to Amazon SNS.
     *
     * This role must have access to the `sns:Publish` API for the given topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-snsaction.html#cfn-ses-mailmanagerruleset-snsaction-rolearn)
     */
    public fun roleArn(): String

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS Topic to which notification for the email
     * received will be published.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-snsaction.html#cfn-ses-mailmanagerruleset-snsaction-topicarn)
     */
    public fun topicArn(): String

    /**
     * A builder for [SnsActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionFailurePolicy A policy that states what to do in the case of failure.
       * The action will fail if there are configuration errors. For example, specified SNS topic
       * has been deleted or the role lacks necessary permissions to call the `sns:Publish` API.
       */
      public fun actionFailurePolicy(actionFailurePolicy: String)

      /**
       * @param encoding The encoding to use for the email within the Amazon SNS notification.
       * The default value is `UTF-8` . Use `BASE64` if you need to preserve all special characters,
       * especially when the original message uses a different encoding format.
       */
      public fun encoding(encoding: String)

      /**
       * @param payloadType The expected payload type within the Amazon SNS notification.
       * `CONTENT` attempts to publish the full email content with 20KB of headers content.
       * `HEADERS` extracts up to 100KB of header content to include in the notification, email content
       * will not be included to the notification. The default value is `CONTENT` .
       */
      public fun payloadType(payloadType: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM Role to use while writing to
       * Amazon SNS. 
       * This role must have access to the `sns:Publish` API for the given topic.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS Topic to which
       * notification for the email received will be published. 
       */
      public fun topicArn(topicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.SnsActionProperty.Builder =
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.SnsActionProperty.builder()

      /**
       * @param actionFailurePolicy A policy that states what to do in the case of failure.
       * The action will fail if there are configuration errors. For example, specified SNS topic
       * has been deleted or the role lacks necessary permissions to call the `sns:Publish` API.
       */
      override fun actionFailurePolicy(actionFailurePolicy: String) {
        cdkBuilder.actionFailurePolicy(actionFailurePolicy)
      }

      /**
       * @param encoding The encoding to use for the email within the Amazon SNS notification.
       * The default value is `UTF-8` . Use `BASE64` if you need to preserve all special characters,
       * especially when the original message uses a different encoding format.
       */
      override fun encoding(encoding: String) {
        cdkBuilder.encoding(encoding)
      }

      /**
       * @param payloadType The expected payload type within the Amazon SNS notification.
       * `CONTENT` attempts to publish the full email content with 20KB of headers content.
       * `HEADERS` extracts up to 100KB of header content to include in the notification, email content
       * will not be included to the notification. The default value is `CONTENT` .
       */
      override fun payloadType(payloadType: String) {
        cdkBuilder.payloadType(payloadType)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of the IAM Role to use while writing to
       * Amazon SNS. 
       * This role must have access to the `sns:Publish` API for the given topic.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS Topic to which
       * notification for the email received will be published. 
       */
      override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.SnsActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.SnsActionProperty,
    ) : CdkObject(cdkObject),
        SnsActionProperty {
      /**
       * A policy that states what to do in the case of failure.
       *
       * The action will fail if there are configuration errors. For example, specified SNS topic
       * has been deleted or the role lacks necessary permissions to call the `sns:Publish` API.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-snsaction.html#cfn-ses-mailmanagerruleset-snsaction-actionfailurepolicy)
       */
      override fun actionFailurePolicy(): String? = unwrap(this).getActionFailurePolicy()

      /**
       * The encoding to use for the email within the Amazon SNS notification.
       *
       * The default value is `UTF-8` . Use `BASE64` if you need to preserve all special characters,
       * especially when the original message uses a different encoding format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-snsaction.html#cfn-ses-mailmanagerruleset-snsaction-encoding)
       */
      override fun encoding(): String? = unwrap(this).getEncoding()

      /**
       * The expected payload type within the Amazon SNS notification.
       *
       * `CONTENT` attempts to publish the full email content with 20KB of headers content.
       * `HEADERS` extracts up to 100KB of header content to include in the notification, email content
       * will not be included to the notification. The default value is `CONTENT` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-snsaction.html#cfn-ses-mailmanagerruleset-snsaction-payloadtype)
       */
      override fun payloadType(): String? = unwrap(this).getPayloadType()

      /**
       * The Amazon Resource Name (ARN) of the IAM Role to use while writing to Amazon SNS.
       *
       * This role must have access to the `sns:Publish` API for the given topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-snsaction.html#cfn-ses-mailmanagerruleset-snsaction-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The Amazon Resource Name (ARN) of the Amazon SNS Topic to which notification for the email
       * received will be published.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagerruleset-snsaction.html#cfn-ses-mailmanagerruleset-snsaction-topicarn)
       */
      override fun topicArn(): String = unwrap(this).getTopicArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnsActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.SnsActionProperty):
          SnsActionProperty = CdkObjectWrappers.wrap(cdkObject) as? SnsActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnsActionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.SnsActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerRuleSet.SnsActionProperty
    }
  }
}
