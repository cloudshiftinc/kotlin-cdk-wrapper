@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.xray

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSamplingRule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.xray.*;
 * CfnSamplingRuleProps cfnSamplingRuleProps = CfnSamplingRuleProps.builder()
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
public interface CfnSamplingRuleProps {
  /**
   * (deprecated) The ARN of the sampling rule.
   *
   * Specify a rule by either name or ARN, but not both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-rulename)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun ruleName(): String? = unwrap(this).getRuleName()

  /**
   * The sampling rule to be created or updated.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrule)
   */
  public fun samplingRule(): Any? = unwrap(this).getSamplingRule()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrulerecord)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun samplingRuleRecord(): Any? = unwrap(this).getSamplingRuleRecord()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingruleupdate)
   * @deprecated this property has been deprecated
   */
  @Deprecated(message = "deprecated in CDK")
  public fun samplingRuleUpdate(): Any? = unwrap(this).getSamplingRuleUpdate()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSamplingRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ruleName The ARN of the sampling rule.
     * Specify a rule by either name or ARN, but not both.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun ruleName(ruleName: String)

    /**
     * @param samplingRule The sampling rule to be created or updated.
     */
    public fun samplingRule(samplingRule: IResolvable)

    /**
     * @param samplingRule The sampling rule to be created or updated.
     */
    public fun samplingRule(samplingRule: CfnSamplingRule.SamplingRuleProperty)

    /**
     * @param samplingRule The sampling rule to be created or updated.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f9bd38e6eedd9eed0b96d14bddd6c404714f4cb67becd24bc776c146be46099")
    public fun samplingRule(samplingRule: CfnSamplingRule.SamplingRuleProperty.Builder.() -> Unit)

    /**
     * @param samplingRuleRecord the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleRecord(samplingRuleRecord: IResolvable)

    /**
     * @param samplingRuleRecord the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleRecord(samplingRuleRecord: CfnSamplingRule.SamplingRuleRecordProperty)

    /**
     * @param samplingRuleRecord the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6b2bf197ae8343a1807b08d7b6c6b172b138cadfa849498c36afb865b0c69e0")
    public
        fun samplingRuleRecord(samplingRuleRecord: CfnSamplingRule.SamplingRuleRecordProperty.Builder.() -> Unit)

    /**
     * @param samplingRuleUpdate the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleUpdate(samplingRuleUpdate: IResolvable)

    /**
     * @param samplingRuleUpdate the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleUpdate(samplingRuleUpdate: CfnSamplingRule.SamplingRuleUpdateProperty)

    /**
     * @param samplingRuleUpdate the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c61904e1af23a4bb165c9271b8adf14c9af44001437f67d469f0415a24f784b")
    public
        fun samplingRuleUpdate(samplingRuleUpdate: CfnSamplingRule.SamplingRuleUpdateProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.xray.CfnSamplingRuleProps.Builder =
        software.amazon.awscdk.services.xray.CfnSamplingRuleProps.builder()

    /**
     * @param ruleName The ARN of the sampling rule.
     * Specify a rule by either name or ARN, but not both.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * @param samplingRule The sampling rule to be created or updated.
     */
    override fun samplingRule(samplingRule: IResolvable) {
      cdkBuilder.samplingRule(samplingRule.let(IResolvable::unwrap))
    }

    /**
     * @param samplingRule The sampling rule to be created or updated.
     */
    override fun samplingRule(samplingRule: CfnSamplingRule.SamplingRuleProperty) {
      cdkBuilder.samplingRule(samplingRule.let(CfnSamplingRule.SamplingRuleProperty::unwrap))
    }

    /**
     * @param samplingRule The sampling rule to be created or updated.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f9bd38e6eedd9eed0b96d14bddd6c404714f4cb67becd24bc776c146be46099")
    override
        fun samplingRule(samplingRule: CfnSamplingRule.SamplingRuleProperty.Builder.() -> Unit):
        Unit = samplingRule(CfnSamplingRule.SamplingRuleProperty(samplingRule))

    /**
     * @param samplingRuleRecord the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleRecord(samplingRuleRecord: IResolvable) {
      cdkBuilder.samplingRuleRecord(samplingRuleRecord.let(IResolvable::unwrap))
    }

    /**
     * @param samplingRuleRecord the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun samplingRuleRecord(samplingRuleRecord: CfnSamplingRule.SamplingRuleRecordProperty) {
      cdkBuilder.samplingRuleRecord(samplingRuleRecord.let(CfnSamplingRule.SamplingRuleRecordProperty::unwrap))
    }

    /**
     * @param samplingRuleRecord the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6b2bf197ae8343a1807b08d7b6c6b172b138cadfa849498c36afb865b0c69e0")
    override
        fun samplingRuleRecord(samplingRuleRecord: CfnSamplingRule.SamplingRuleRecordProperty.Builder.() -> Unit):
        Unit = samplingRuleRecord(CfnSamplingRule.SamplingRuleRecordProperty(samplingRuleRecord))

    /**
     * @param samplingRuleUpdate the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleUpdate(samplingRuleUpdate: IResolvable) {
      cdkBuilder.samplingRuleUpdate(samplingRuleUpdate.let(IResolvable::unwrap))
    }

    /**
     * @param samplingRuleUpdate the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun samplingRuleUpdate(samplingRuleUpdate: CfnSamplingRule.SamplingRuleUpdateProperty) {
      cdkBuilder.samplingRuleUpdate(samplingRuleUpdate.let(CfnSamplingRule.SamplingRuleUpdateProperty::unwrap))
    }

    /**
     * @param samplingRuleUpdate the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c61904e1af23a4bb165c9271b8adf14c9af44001437f67d469f0415a24f784b")
    override
        fun samplingRuleUpdate(samplingRuleUpdate: CfnSamplingRule.SamplingRuleUpdateProperty.Builder.() -> Unit):
        Unit = samplingRuleUpdate(CfnSamplingRule.SamplingRuleUpdateProperty(samplingRuleUpdate))

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.xray.CfnSamplingRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.xray.CfnSamplingRuleProps,
  ) : CdkObject(cdkObject), CfnSamplingRuleProps {
    /**
     * (deprecated) The ARN of the sampling rule.
     *
     * Specify a rule by either name or ARN, but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-rulename)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun ruleName(): String? = unwrap(this).getRuleName()

    /**
     * The sampling rule to be created or updated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrule)
     */
    override fun samplingRule(): Any? = unwrap(this).getSamplingRule()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingrulerecord)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleRecord(): Any? = unwrap(this).getSamplingRuleRecord()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-samplingruleupdate)
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleUpdate(): Any? = unwrap(this).getSamplingRuleUpdate()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-samplingrule.html#cfn-xray-samplingrule-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSamplingRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnSamplingRuleProps):
        CfnSamplingRuleProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSamplingRuleProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSamplingRuleProps):
        software.amazon.awscdk.services.xray.CfnSamplingRuleProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.xray.CfnSamplingRuleProps
  }
}
