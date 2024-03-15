@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.xray

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use the `AWS::XRay::SamplingRule` resource to specify a sampling rule, which controls sampling
 * behavior for instrumented applications.
 *
 * Include a `SamplingRule` entity to create or update a sampling rule.
 *
 *
 * `SamplingRule.Version` can only be set when creating a sampling rule. Updating the version will
 * cause the update to fail.
 *
 *
 * Services retrieve rules with
 * [GetSamplingRules](https://docs.aws.amazon.com//xray/latest/api/API_GetSamplingRules.html) , and
 * evaluate each rule in ascending order of *priority* for each request. If a rule matches, the service
 * records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports back to
 * X-Ray with
 * [GetSamplingTargets](https://docs.aws.amazon.com//xray/latest/api/API_GetSamplingTargets.html) to
 * get updated versions of each in-use rule. The updated rule contains a trace quota that the service
 * can use instead of borrowing from the reservoir.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.xray.*;
 * CfnSamplingRule cfnSamplingRule = CfnSamplingRule.Builder.create(this, "MyCfnSamplingRule")
 * .ruleName("ruleName")
 * .samplingRule(SamplingRuleProperty.builder()
 * .fixedRate(123)
 * .host("host")
 * .httpMethod("httpMethod")
 * .priority(123)
 * .reservoirSize(123)
 * .resourceArn("resourceArn")
 * .serviceName("serviceName")
 * .serviceType("serviceType")
 * .urlPath("urlPath")
 * // the properties below are optional
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .ruleArn("ruleArn")
 * .ruleName("ruleName")
 * .version(123)
 * .build())
 * .samplingRuleRecord(SamplingRuleRecordProperty.builder()
 * .createdAt("createdAt")
 * .modifiedAt("modifiedAt")
 * .samplingRule(SamplingRuleProperty.builder()
 * .fixedRate(123)
 * .host("host")
 * .httpMethod("httpMethod")
 * .priority(123)
 * .reservoirSize(123)
 * .resourceArn("resourceArn")
 * .serviceName("serviceName")
 * .serviceType("serviceType")
 * .urlPath("urlPath")
 * // the properties below are optional
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .ruleArn("ruleArn")
 * .ruleName("ruleName")
 * .version(123)
 * .build())
 * .build())
 * .samplingRuleUpdate(SamplingRuleUpdateProperty.builder()
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .fixedRate(123)
 * .host("host")
 * .httpMethod("httpMethod")
 * .priority(123)
 * .reservoirSize(123)
 * .resourceArn("resourceArn")
 * .ruleArn("ruleArn")
 * .ruleName("ruleName")
 * .serviceName("serviceName")
 * .serviceType("serviceType")
 * .urlPath("urlPath")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html)
 */
public open class CfnSamplingRule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.xray.CfnSamplingRule,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The sampling rule ARN that was created or updated.
   */
  public open fun attrRuleArn(): String = unwrap(this).getAttrRuleArn()

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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * (deprecated) The ARN of the sampling rule.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun ruleName(): String? = unwrap(this).getRuleName()

  /**
   * (deprecated) The ARN of the sampling rule.
   *
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun ruleName(`value`: String) {
    unwrap(this).setRuleName(`value`)
  }

  /**
   * The sampling rule to be created or updated.
   */
  public open fun samplingRule(): Any? = unwrap(this).getSamplingRule()

  /**
   * The sampling rule to be created or updated.
   */
  public open fun samplingRule(`value`: IResolvable) {
    unwrap(this).setSamplingRule(`value`.let(IResolvable::unwrap))
  }

  /**
   * The sampling rule to be created or updated.
   */
  public open fun samplingRule(`value`: SamplingRuleProperty) {
    unwrap(this).setSamplingRule(`value`.let(SamplingRuleProperty::unwrap))
  }

  /**
   * The sampling rule to be created or updated.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("37472a2510c859b7cbe11b1dc88b0a255339ce976cdb0d91ceecc303b0930a27")
  public open fun samplingRule(`value`: SamplingRuleProperty.Builder.() -> Unit): Unit =
      samplingRule(SamplingRuleProperty(`value`))

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun samplingRuleRecord(): Any? = unwrap(this).getSamplingRuleRecord()

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun samplingRuleRecord(`value`: IResolvable) {
    unwrap(this).setSamplingRuleRecord(`value`.let(IResolvable::unwrap))
  }

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun samplingRuleRecord(`value`: SamplingRuleRecordProperty) {
    unwrap(this).setSamplingRuleRecord(`value`.let(SamplingRuleRecordProperty::unwrap))
  }

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("15adbfc34f3b59b8505c9787b7b0f468c359830643a1e9f060ff7d6bc3dbdb9d")
  public open fun samplingRuleRecord(`value`: SamplingRuleRecordProperty.Builder.() -> Unit): Unit =
      samplingRuleRecord(SamplingRuleRecordProperty(`value`))

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun samplingRuleUpdate(): Any? = unwrap(this).getSamplingRuleUpdate()

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun samplingRuleUpdate(`value`: IResolvable) {
    unwrap(this).setSamplingRuleUpdate(`value`.let(IResolvable::unwrap))
  }

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun samplingRuleUpdate(`value`: SamplingRuleUpdateProperty) {
    unwrap(this).setSamplingRuleUpdate(`value`.let(SamplingRuleUpdateProperty::unwrap))
  }

  /**
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("900633761a1f94263b9bb82b45f70b9e6a6ebf2afc1035b7332813c877cea9e0")
  public open fun samplingRuleUpdate(`value`: SamplingRuleUpdateProperty.Builder.() -> Unit): Unit =
      samplingRuleUpdate(SamplingRuleUpdateProperty(`value`))

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.xray.CfnSamplingRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * (deprecated) The ARN of the sampling rule.
     *
     * Specify a rule by either name or ARN, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-rulename)
     * @deprecated this property has been deprecated
     * @param ruleName The ARN of the sampling rule. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun ruleName(ruleName: String)

    /**
     * The sampling rule to be created or updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrule)
     * @param samplingRule The sampling rule to be created or updated. 
     */
    public fun samplingRule(samplingRule: IResolvable)

    /**
     * The sampling rule to be created or updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrule)
     * @param samplingRule The sampling rule to be created or updated. 
     */
    public fun samplingRule(samplingRule: SamplingRuleProperty)

    /**
     * The sampling rule to be created or updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrule)
     * @param samplingRule The sampling rule to be created or updated. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("476ff858ddaa900ccc407e7324c1a97e86c63086543927965bc6df26dacdb71b")
    public fun samplingRule(samplingRule: SamplingRuleProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrulerecord)
     * @deprecated this property has been deprecated
     * @param samplingRuleRecord 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleRecord(samplingRuleRecord: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrulerecord)
     * @deprecated this property has been deprecated
     * @param samplingRuleRecord 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleRecord(samplingRuleRecord: SamplingRuleRecordProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrulerecord)
     * @deprecated this property has been deprecated
     * @param samplingRuleRecord 
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9512381903e4b282b50e8957ec042d2f99e67305fa5596a9d97eddf38683076")
    public fun samplingRuleRecord(samplingRuleRecord: SamplingRuleRecordProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingruleupdate)
     * @deprecated this property has been deprecated
     * @param samplingRuleUpdate 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleUpdate(samplingRuleUpdate: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingruleupdate)
     * @deprecated this property has been deprecated
     * @param samplingRuleUpdate 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleUpdate(samplingRuleUpdate: SamplingRuleUpdateProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingruleupdate)
     * @deprecated this property has been deprecated
     * @param samplingRuleUpdate 
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4de8ad76fdb29adbb93e3cb81dfc874a57d56809daebd73aa4c85e4f246035d2")
    public fun samplingRuleUpdate(samplingRuleUpdate: SamplingRuleUpdateProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.xray.CfnSamplingRule.Builder =
        software.amazon.awscdk.services.xray.CfnSamplingRule.Builder.create(scope, id)

    /**
     * (deprecated) The ARN of the sampling rule.
     *
     * Specify a rule by either name or ARN, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-rulename)
     * @deprecated this property has been deprecated
     * @param ruleName The ARN of the sampling rule. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * The sampling rule to be created or updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrule)
     * @param samplingRule The sampling rule to be created or updated. 
     */
    override fun samplingRule(samplingRule: IResolvable) {
      cdkBuilder.samplingRule(samplingRule.let(IResolvable::unwrap))
    }

    /**
     * The sampling rule to be created or updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrule)
     * @param samplingRule The sampling rule to be created or updated. 
     */
    override fun samplingRule(samplingRule: SamplingRuleProperty) {
      cdkBuilder.samplingRule(samplingRule.let(SamplingRuleProperty::unwrap))
    }

    /**
     * The sampling rule to be created or updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrule)
     * @param samplingRule The sampling rule to be created or updated. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("476ff858ddaa900ccc407e7324c1a97e86c63086543927965bc6df26dacdb71b")
    override fun samplingRule(samplingRule: SamplingRuleProperty.Builder.() -> Unit): Unit =
        samplingRule(SamplingRuleProperty(samplingRule))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrulerecord)
     * @deprecated this property has been deprecated
     * @param samplingRuleRecord 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleRecord(samplingRuleRecord: IResolvable) {
      cdkBuilder.samplingRuleRecord(samplingRuleRecord.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrulerecord)
     * @deprecated this property has been deprecated
     * @param samplingRuleRecord 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleRecord(samplingRuleRecord: SamplingRuleRecordProperty) {
      cdkBuilder.samplingRuleRecord(samplingRuleRecord.let(SamplingRuleRecordProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrulerecord)
     * @deprecated this property has been deprecated
     * @param samplingRuleRecord 
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c9512381903e4b282b50e8957ec042d2f99e67305fa5596a9d97eddf38683076")
    override
        fun samplingRuleRecord(samplingRuleRecord: SamplingRuleRecordProperty.Builder.() -> Unit):
        Unit = samplingRuleRecord(SamplingRuleRecordProperty(samplingRuleRecord))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingruleupdate)
     * @deprecated this property has been deprecated
     * @param samplingRuleUpdate 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleUpdate(samplingRuleUpdate: IResolvable) {
      cdkBuilder.samplingRuleUpdate(samplingRuleUpdate.let(IResolvable::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingruleupdate)
     * @deprecated this property has been deprecated
     * @param samplingRuleUpdate 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleUpdate(samplingRuleUpdate: SamplingRuleUpdateProperty) {
      cdkBuilder.samplingRuleUpdate(samplingRuleUpdate.let(SamplingRuleUpdateProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingruleupdate)
     * @deprecated this property has been deprecated
     * @param samplingRuleUpdate 
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4de8ad76fdb29adbb93e3cb81dfc874a57d56809daebd73aa4c85e4f246035d2")
    override
        fun samplingRuleUpdate(samplingRuleUpdate: SamplingRuleUpdateProperty.Builder.() -> Unit):
        Unit = samplingRuleUpdate(SamplingRuleUpdateProperty(samplingRuleUpdate))

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.xray.CfnSamplingRule = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.xray.CfnSamplingRule.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSamplingRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSamplingRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnSamplingRule):
        CfnSamplingRule = CfnSamplingRule(cdkObject)

    internal fun unwrap(wrapped: CfnSamplingRule):
        software.amazon.awscdk.services.xray.CfnSamplingRule = wrapped.cdkObject
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.xray.*;
   * SamplingRuleUpdateProperty samplingRuleUpdateProperty = SamplingRuleUpdateProperty.builder()
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .fixedRate(123)
   * .host("host")
   * .httpMethod("httpMethod")
   * .priority(123)
   * .reservoirSize(123)
   * .resourceArn("resourceArn")
   * .ruleArn("ruleArn")
   * .ruleName("ruleName")
   * .serviceName("serviceName")
   * .serviceType("serviceType")
   * .urlPath("urlPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html)
   */
  public interface SamplingRuleUpdateProperty {
    /**
     * Matches attributes derived from the request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-attributes)
     */
    public fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-fixedrate)
     */
    public fun fixedRate(): Number? = unwrap(this).getFixedRate()

    /**
     * Matches the hostname from a request URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-host)
     */
    public fun host(): String? = unwrap(this).getHost()

    /**
     * Matches the HTTP method from a request URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-httpmethod)
     */
    public fun httpMethod(): String? = unwrap(this).getHttpMethod()

    /**
     * The priority of the sampling rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-priority)
     */
    public fun priority(): Number? = unwrap(this).getPriority()

    /**
     * A fixed number of matching requests to instrument per second, prior to applying the fixed
     * rate.
     *
     * The reservoir is not used directly by services, but applies to all services using the rule
     * collectively.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-reservoirsize)
     */
    public fun reservoirSize(): Number? = unwrap(this).getReservoirSize()

    /**
     * Matches the ARN of the AWS resource on which the service runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-resourcearn)
     */
    public fun resourceArn(): String? = unwrap(this).getResourceArn()

    /**
     * The ARN of the sampling rule.
     *
     * Specify a rule by either name or ARN, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-rulearn)
     */
    public fun ruleArn(): String? = unwrap(this).getRuleArn()

    /**
     * The ARN of the sampling rule.
     *
     * Specify a rule by either name or ARN, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-rulename)
     */
    public fun ruleName(): String? = unwrap(this).getRuleName()

    /**
     * Matches the name that the service uses to identify itself in segments.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-servicename)
     */
    public fun serviceName(): String? = unwrap(this).getServiceName()

    /**
     * Matches the origin that the service uses to identify its type in segments.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-servicetype)
     */
    public fun serviceType(): String? = unwrap(this).getServiceType()

    /**
     * Matches the path from a request URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-urlpath)
     */
    public fun urlPath(): String? = unwrap(this).getUrlPath()

    /**
     * A builder for [SamplingRuleUpdateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributes Matches attributes derived from the request.
       */
      public fun attributes(attributes: IResolvable)

      /**
       * @param attributes Matches attributes derived from the request.
       */
      public fun attributes(attributes: Map<String, String>)

      /**
       * @param fixedRate The percentage of matching requests to instrument, after the reservoir is
       * exhausted.
       */
      public fun fixedRate(fixedRate: Number)

      /**
       * @param host Matches the hostname from a request URL.
       */
      public fun host(host: String)

      /**
       * @param httpMethod Matches the HTTP method from a request URL.
       */
      public fun httpMethod(httpMethod: String)

      /**
       * @param priority The priority of the sampling rule.
       */
      public fun priority(priority: Number)

      /**
       * @param reservoirSize A fixed number of matching requests to instrument per second, prior to
       * applying the fixed rate.
       * The reservoir is not used directly by services, but applies to all services using the rule
       * collectively.
       */
      public fun reservoirSize(reservoirSize: Number)

      /**
       * @param resourceArn Matches the ARN of the AWS resource on which the service runs.
       */
      public fun resourceArn(resourceArn: String)

      /**
       * @param ruleArn The ARN of the sampling rule.
       * Specify a rule by either name or ARN, but not both.
       */
      public fun ruleArn(ruleArn: String)

      /**
       * @param ruleName The ARN of the sampling rule.
       * Specify a rule by either name or ARN, but not both.
       */
      public fun ruleName(ruleName: String)

      /**
       * @param serviceName Matches the name that the service uses to identify itself in segments.
       */
      public fun serviceName(serviceName: String)

      /**
       * @param serviceType Matches the origin that the service uses to identify its type in
       * segments.
       */
      public fun serviceType(serviceType: String)

      /**
       * @param urlPath Matches the path from a request URL.
       */
      public fun urlPath(urlPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleUpdateProperty.Builder =
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleUpdateProperty.builder()

      /**
       * @param attributes Matches attributes derived from the request.
       */
      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      /**
       * @param attributes Matches attributes derived from the request.
       */
      override fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
      }

      /**
       * @param fixedRate The percentage of matching requests to instrument, after the reservoir is
       * exhausted.
       */
      override fun fixedRate(fixedRate: Number) {
        cdkBuilder.fixedRate(fixedRate)
      }

      /**
       * @param host Matches the hostname from a request URL.
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param httpMethod Matches the HTTP method from a request URL.
       */
      override fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
      }

      /**
       * @param priority The priority of the sampling rule.
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param reservoirSize A fixed number of matching requests to instrument per second, prior to
       * applying the fixed rate.
       * The reservoir is not used directly by services, but applies to all services using the rule
       * collectively.
       */
      override fun reservoirSize(reservoirSize: Number) {
        cdkBuilder.reservoirSize(reservoirSize)
      }

      /**
       * @param resourceArn Matches the ARN of the AWS resource on which the service runs.
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      /**
       * @param ruleArn The ARN of the sampling rule.
       * Specify a rule by either name or ARN, but not both.
       */
      override fun ruleArn(ruleArn: String) {
        cdkBuilder.ruleArn(ruleArn)
      }

      /**
       * @param ruleName The ARN of the sampling rule.
       * Specify a rule by either name or ARN, but not both.
       */
      override fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
      }

      /**
       * @param serviceName Matches the name that the service uses to identify itself in segments.
       */
      override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      /**
       * @param serviceType Matches the origin that the service uses to identify its type in
       * segments.
       */
      override fun serviceType(serviceType: String) {
        cdkBuilder.serviceType(serviceType)
      }

      /**
       * @param urlPath Matches the path from a request URL.
       */
      override fun urlPath(urlPath: String) {
        cdkBuilder.urlPath(urlPath)
      }

      public fun build():
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleUpdateProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleUpdateProperty,
    ) : CdkObject(cdkObject), SamplingRuleUpdateProperty {
      /**
       * Matches attributes derived from the request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-attributes)
       */
      override fun attributes(): Any? = unwrap(this).getAttributes()

      /**
       * The percentage of matching requests to instrument, after the reservoir is exhausted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-fixedrate)
       */
      override fun fixedRate(): Number? = unwrap(this).getFixedRate()

      /**
       * Matches the hostname from a request URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-host)
       */
      override fun host(): String? = unwrap(this).getHost()

      /**
       * Matches the HTTP method from a request URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-httpmethod)
       */
      override fun httpMethod(): String? = unwrap(this).getHttpMethod()

      /**
       * The priority of the sampling rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-priority)
       */
      override fun priority(): Number? = unwrap(this).getPriority()

      /**
       * A fixed number of matching requests to instrument per second, prior to applying the fixed
       * rate.
       *
       * The reservoir is not used directly by services, but applies to all services using the rule
       * collectively.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-reservoirsize)
       */
      override fun reservoirSize(): Number? = unwrap(this).getReservoirSize()

      /**
       * Matches the ARN of the AWS resource on which the service runs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-resourcearn)
       */
      override fun resourceArn(): String? = unwrap(this).getResourceArn()

      /**
       * The ARN of the sampling rule.
       *
       * Specify a rule by either name or ARN, but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-rulearn)
       */
      override fun ruleArn(): String? = unwrap(this).getRuleArn()

      /**
       * The ARN of the sampling rule.
       *
       * Specify a rule by either name or ARN, but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-rulename)
       */
      override fun ruleName(): String? = unwrap(this).getRuleName()

      /**
       * Matches the name that the service uses to identify itself in segments.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-servicename)
       */
      override fun serviceName(): String? = unwrap(this).getServiceName()

      /**
       * Matches the origin that the service uses to identify its type in segments.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-servicetype)
       */
      override fun serviceType(): String? = unwrap(this).getServiceType()

      /**
       * Matches the path from a request URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingruleupdate.html#cfn-xray-samplingrule-samplingruleupdate-urlpath)
       */
      override fun urlPath(): String? = unwrap(this).getUrlPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SamplingRuleUpdateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleUpdateProperty):
          SamplingRuleUpdateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SamplingRuleUpdateProperty):
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleUpdateProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleUpdateProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.xray.*;
   * SamplingRuleRecordProperty samplingRuleRecordProperty = SamplingRuleRecordProperty.builder()
   * .createdAt("createdAt")
   * .modifiedAt("modifiedAt")
   * .samplingRule(SamplingRuleProperty.builder()
   * .fixedRate(123)
   * .host("host")
   * .httpMethod("httpMethod")
   * .priority(123)
   * .reservoirSize(123)
   * .resourceArn("resourceArn")
   * .serviceName("serviceName")
   * .serviceType("serviceType")
   * .urlPath("urlPath")
   * // the properties below are optional
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .ruleArn("ruleArn")
   * .ruleName("ruleName")
   * .version(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrulerecord.html)
   */
  public interface SamplingRuleRecordProperty {
    /**
     * When the rule was created, in Unix time seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrulerecord.html#cfn-xray-samplingrule-samplingrulerecord-createdat)
     */
    public fun createdAt(): String? = unwrap(this).getCreatedAt()

    /**
     * When the rule was modified, in Unix time seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrulerecord.html#cfn-xray-samplingrule-samplingrulerecord-modifiedat)
     */
    public fun modifiedAt(): String? = unwrap(this).getModifiedAt()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrulerecord.html#cfn-xray-samplingrule-samplingrulerecord-samplingrule)
     */
    public fun samplingRule(): Any? = unwrap(this).getSamplingRule()

    /**
     * A builder for [SamplingRuleRecordProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param createdAt When the rule was created, in Unix time seconds.
       */
      public fun createdAt(createdAt: String)

      /**
       * @param modifiedAt When the rule was modified, in Unix time seconds.
       */
      public fun modifiedAt(modifiedAt: String)

      /**
       * @param samplingRule the value to be set.
       */
      public fun samplingRule(samplingRule: IResolvable)

      /**
       * @param samplingRule the value to be set.
       */
      public fun samplingRule(samplingRule: SamplingRuleProperty)

      /**
       * @param samplingRule the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41c9de72ca80f09c20d098e90d2651b92910a0810750e74af4d05c2fa127941a")
      public fun samplingRule(samplingRule: SamplingRuleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty.Builder =
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty.builder()

      /**
       * @param createdAt When the rule was created, in Unix time seconds.
       */
      override fun createdAt(createdAt: String) {
        cdkBuilder.createdAt(createdAt)
      }

      /**
       * @param modifiedAt When the rule was modified, in Unix time seconds.
       */
      override fun modifiedAt(modifiedAt: String) {
        cdkBuilder.modifiedAt(modifiedAt)
      }

      /**
       * @param samplingRule the value to be set.
       */
      override fun samplingRule(samplingRule: IResolvable) {
        cdkBuilder.samplingRule(samplingRule.let(IResolvable::unwrap))
      }

      /**
       * @param samplingRule the value to be set.
       */
      override fun samplingRule(samplingRule: SamplingRuleProperty) {
        cdkBuilder.samplingRule(samplingRule.let(SamplingRuleProperty::unwrap))
      }

      /**
       * @param samplingRule the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("41c9de72ca80f09c20d098e90d2651b92910a0810750e74af4d05c2fa127941a")
      override fun samplingRule(samplingRule: SamplingRuleProperty.Builder.() -> Unit): Unit =
          samplingRule(SamplingRuleProperty(samplingRule))

      public fun build():
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty,
    ) : CdkObject(cdkObject), SamplingRuleRecordProperty {
      /**
       * When the rule was created, in Unix time seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrulerecord.html#cfn-xray-samplingrule-samplingrulerecord-createdat)
       */
      override fun createdAt(): String? = unwrap(this).getCreatedAt()

      /**
       * When the rule was modified, in Unix time seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrulerecord.html#cfn-xray-samplingrule-samplingrulerecord-modifiedat)
       */
      override fun modifiedAt(): String? = unwrap(this).getModifiedAt()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrulerecord.html#cfn-xray-samplingrule-samplingrulerecord-samplingrule)
       */
      override fun samplingRule(): Any? = unwrap(this).getSamplingRule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SamplingRuleRecordProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty):
          SamplingRuleRecordProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SamplingRuleRecordProperty):
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleRecordProperty
    }
  }

  /**
   * A sampling rule that services use to decide whether to instrument a request.
   *
   * Rule fields can match properties of the service, or properties of a request. The service can
   * ignore rules that don't match its properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.xray.*;
   * SamplingRuleProperty samplingRuleProperty = SamplingRuleProperty.builder()
   * .fixedRate(123)
   * .host("host")
   * .httpMethod("httpMethod")
   * .priority(123)
   * .reservoirSize(123)
   * .resourceArn("resourceArn")
   * .serviceName("serviceName")
   * .serviceType("serviceType")
   * .urlPath("urlPath")
   * // the properties below are optional
   * .attributes(Map.of(
   * "attributesKey", "attributes"))
   * .ruleArn("ruleArn")
   * .ruleName("ruleName")
   * .version(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html)
   */
  public interface SamplingRuleProperty {
    /**
     * Matches attributes derived from the request.
     *
     * *Map Entries:* Maximum number of 5 items.
     *
     * *Key Length Constraints:* Minimum length of 1. Maximum length of 32.
     *
     * *Value Length Constraints:* Minimum length of 1. Maximum length of 32.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-attributes)
     */
    public fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * The percentage of matching requests to instrument, after the reservoir is exhausted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-fixedrate)
     */
    public fun fixedRate(): Number

    /**
     * Matches the hostname from a request URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-host)
     */
    public fun host(): String

    /**
     * Matches the HTTP method of a request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-httpmethod)
     */
    public fun httpMethod(): String

    /**
     * The priority of the sampling rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-priority)
     */
    public fun priority(): Number

    /**
     * A fixed number of matching requests to instrument per second, prior to applying the fixed
     * rate.
     *
     * The reservoir is not used directly by services, but applies to all services using the rule
     * collectively.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-reservoirsize)
     */
    public fun reservoirSize(): Number

    /**
     * Matches the ARN of the AWS resource on which the service runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
     *
     *
     * Specifying a sampling rule by name is recommended, as specifying by ARN will be deprecated in
     * future.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-rulearn)
     */
    public fun ruleArn(): String? = unwrap(this).getRuleArn()

    /**
     * The name of the sampling rule.
     *
     * Specify a rule by either name or ARN, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-rulename)
     */
    public fun ruleName(): String? = unwrap(this).getRuleName()

    /**
     * Matches the `name` that the service uses to identify itself in segments.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-servicename)
     */
    public fun serviceName(): String

    /**
     * Matches the `origin` that the service uses to identify its type in segments.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-servicetype)
     */
    public fun serviceType(): String

    /**
     * Matches the path from a request URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-urlpath)
     */
    public fun urlPath(): String

    /**
     * The version of the sampling rule.
     *
     * `Version` can only be set when creating a new sampling rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-version)
     */
    public fun version(): Number? = unwrap(this).getVersion()

    /**
     * A builder for [SamplingRuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributes Matches attributes derived from the request.
       * *Map Entries:* Maximum number of 5 items.
       *
       * *Key Length Constraints:* Minimum length of 1. Maximum length of 32.
       *
       * *Value Length Constraints:* Minimum length of 1. Maximum length of 32.
       */
      public fun attributes(attributes: IResolvable)

      /**
       * @param attributes Matches attributes derived from the request.
       * *Map Entries:* Maximum number of 5 items.
       *
       * *Key Length Constraints:* Minimum length of 1. Maximum length of 32.
       *
       * *Value Length Constraints:* Minimum length of 1. Maximum length of 32.
       */
      public fun attributes(attributes: Map<String, String>)

      /**
       * @param fixedRate The percentage of matching requests to instrument, after the reservoir is
       * exhausted. 
       */
      public fun fixedRate(fixedRate: Number)

      /**
       * @param host Matches the hostname from a request URL. 
       */
      public fun host(host: String)

      /**
       * @param httpMethod Matches the HTTP method of a request. 
       */
      public fun httpMethod(httpMethod: String)

      /**
       * @param priority The priority of the sampling rule. 
       */
      public fun priority(priority: Number)

      /**
       * @param reservoirSize A fixed number of matching requests to instrument per second, prior to
       * applying the fixed rate. 
       * The reservoir is not used directly by services, but applies to all services using the rule
       * collectively.
       */
      public fun reservoirSize(reservoirSize: Number)

      /**
       * @param resourceArn Matches the ARN of the AWS resource on which the service runs. 
       */
      public fun resourceArn(resourceArn: String)

      /**
       * @param ruleArn The ARN of the sampling rule. Specify a rule by either name or ARN, but not
       * both.
       *
       * Specifying a sampling rule by name is recommended, as specifying by ARN will be deprecated
       * in future.
       */
      public fun ruleArn(ruleArn: String)

      /**
       * @param ruleName The name of the sampling rule.
       * Specify a rule by either name or ARN, but not both.
       */
      public fun ruleName(ruleName: String)

      /**
       * @param serviceName Matches the `name` that the service uses to identify itself in segments.
       * 
       */
      public fun serviceName(serviceName: String)

      /**
       * @param serviceType Matches the `origin` that the service uses to identify its type in
       * segments. 
       */
      public fun serviceType(serviceType: String)

      /**
       * @param urlPath Matches the path from a request URL. 
       */
      public fun urlPath(urlPath: String)

      /**
       * @param version The version of the sampling rule.
       * `Version` can only be set when creating a new sampling rule.
       */
      public fun version(version: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty.Builder =
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty.builder()

      /**
       * @param attributes Matches attributes derived from the request.
       * *Map Entries:* Maximum number of 5 items.
       *
       * *Key Length Constraints:* Minimum length of 1. Maximum length of 32.
       *
       * *Value Length Constraints:* Minimum length of 1. Maximum length of 32.
       */
      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      /**
       * @param attributes Matches attributes derived from the request.
       * *Map Entries:* Maximum number of 5 items.
       *
       * *Key Length Constraints:* Minimum length of 1. Maximum length of 32.
       *
       * *Value Length Constraints:* Minimum length of 1. Maximum length of 32.
       */
      override fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
      }

      /**
       * @param fixedRate The percentage of matching requests to instrument, after the reservoir is
       * exhausted. 
       */
      override fun fixedRate(fixedRate: Number) {
        cdkBuilder.fixedRate(fixedRate)
      }

      /**
       * @param host Matches the hostname from a request URL. 
       */
      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      /**
       * @param httpMethod Matches the HTTP method of a request. 
       */
      override fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
      }

      /**
       * @param priority The priority of the sampling rule. 
       */
      override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      /**
       * @param reservoirSize A fixed number of matching requests to instrument per second, prior to
       * applying the fixed rate. 
       * The reservoir is not used directly by services, but applies to all services using the rule
       * collectively.
       */
      override fun reservoirSize(reservoirSize: Number) {
        cdkBuilder.reservoirSize(reservoirSize)
      }

      /**
       * @param resourceArn Matches the ARN of the AWS resource on which the service runs. 
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      /**
       * @param ruleArn The ARN of the sampling rule. Specify a rule by either name or ARN, but not
       * both.
       *
       * Specifying a sampling rule by name is recommended, as specifying by ARN will be deprecated
       * in future.
       */
      override fun ruleArn(ruleArn: String) {
        cdkBuilder.ruleArn(ruleArn)
      }

      /**
       * @param ruleName The name of the sampling rule.
       * Specify a rule by either name or ARN, but not both.
       */
      override fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
      }

      /**
       * @param serviceName Matches the `name` that the service uses to identify itself in segments.
       * 
       */
      override fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
      }

      /**
       * @param serviceType Matches the `origin` that the service uses to identify its type in
       * segments. 
       */
      override fun serviceType(serviceType: String) {
        cdkBuilder.serviceType(serviceType)
      }

      /**
       * @param urlPath Matches the path from a request URL. 
       */
      override fun urlPath(urlPath: String) {
        cdkBuilder.urlPath(urlPath)
      }

      /**
       * @param version The version of the sampling rule.
       * `Version` can only be set when creating a new sampling rule.
       */
      override fun version(version: Number) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty,
    ) : CdkObject(cdkObject), SamplingRuleProperty {
      /**
       * Matches attributes derived from the request.
       *
       * *Map Entries:* Maximum number of 5 items.
       *
       * *Key Length Constraints:* Minimum length of 1. Maximum length of 32.
       *
       * *Value Length Constraints:* Minimum length of 1. Maximum length of 32.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-attributes)
       */
      override fun attributes(): Any? = unwrap(this).getAttributes()

      /**
       * The percentage of matching requests to instrument, after the reservoir is exhausted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-fixedrate)
       */
      override fun fixedRate(): Number = unwrap(this).getFixedRate()

      /**
       * Matches the hostname from a request URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-host)
       */
      override fun host(): String = unwrap(this).getHost()

      /**
       * Matches the HTTP method of a request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-httpmethod)
       */
      override fun httpMethod(): String = unwrap(this).getHttpMethod()

      /**
       * The priority of the sampling rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-priority)
       */
      override fun priority(): Number = unwrap(this).getPriority()

      /**
       * A fixed number of matching requests to instrument per second, prior to applying the fixed
       * rate.
       *
       * The reservoir is not used directly by services, but applies to all services using the rule
       * collectively.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-reservoirsize)
       */
      override fun reservoirSize(): Number = unwrap(this).getReservoirSize()

      /**
       * Matches the ARN of the AWS resource on which the service runs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()

      /**
       * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
       *
       *
       * Specifying a sampling rule by name is recommended, as specifying by ARN will be deprecated
       * in future.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-rulearn)
       */
      override fun ruleArn(): String? = unwrap(this).getRuleArn()

      /**
       * The name of the sampling rule.
       *
       * Specify a rule by either name or ARN, but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-rulename)
       */
      override fun ruleName(): String? = unwrap(this).getRuleName()

      /**
       * Matches the `name` that the service uses to identify itself in segments.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-servicename)
       */
      override fun serviceName(): String = unwrap(this).getServiceName()

      /**
       * Matches the `origin` that the service uses to identify its type in segments.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-servicetype)
       */
      override fun serviceType(): String = unwrap(this).getServiceType()

      /**
       * Matches the path from a request URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-urlpath)
       */
      override fun urlPath(): String = unwrap(this).getUrlPath()

      /**
       * The version of the sampling rule.
       *
       * `Version` can only be set when creating a new sampling rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrule.html#cfn-xray-samplingrule-samplingrule-version)
       */
      override fun version(): Number? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SamplingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty):
          SamplingRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SamplingRuleProperty):
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.xray.CfnSamplingRule.SamplingRuleProperty
    }
  }
}
