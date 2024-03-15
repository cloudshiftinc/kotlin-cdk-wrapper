@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.xray

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnSamplingRuleProps {
  @Deprecated(message = "deprecated in CDK")
  public fun ruleName(): String? = unwrap(this).getRuleName()

  public fun samplingRule(): Any? = unwrap(this).getSamplingRule()

  @Deprecated(message = "deprecated in CDK")
  public fun samplingRuleRecord(): Any? = unwrap(this).getSamplingRuleRecord()

  @Deprecated(message = "deprecated in CDK")
  public fun samplingRuleUpdate(): Any? = unwrap(this).getSamplingRuleUpdate()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun ruleName(ruleName: String)

    public fun samplingRule(samplingRule: IResolvable)

    public fun samplingRule(samplingRule: CfnSamplingRule.SamplingRuleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f9bd38e6eedd9eed0b96d14bddd6c404714f4cb67becd24bc776c146be46099")
    public fun samplingRule(samplingRule: CfnSamplingRule.SamplingRuleProperty.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleRecord(samplingRuleRecord: IResolvable)

    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleRecord(samplingRuleRecord: CfnSamplingRule.SamplingRuleRecordProperty)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6b2bf197ae8343a1807b08d7b6c6b172b138cadfa849498c36afb865b0c69e0")
    public
        fun samplingRuleRecord(samplingRuleRecord: CfnSamplingRule.SamplingRuleRecordProperty.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleUpdate(samplingRuleUpdate: IResolvable)

    @Deprecated(message = "deprecated in CDK")
    public fun samplingRuleUpdate(samplingRuleUpdate: CfnSamplingRule.SamplingRuleUpdateProperty)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c61904e1af23a4bb165c9271b8adf14c9af44001437f67d469f0415a24f784b")
    public
        fun samplingRuleUpdate(samplingRuleUpdate: CfnSamplingRule.SamplingRuleUpdateProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.xray.CfnSamplingRuleProps.Builder =
        software.amazon.awscdk.services.xray.CfnSamplingRuleProps.builder()

    @Deprecated(message = "deprecated in CDK")
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun samplingRule(samplingRule: IResolvable) {
      cdkBuilder.samplingRule(samplingRule.let(IResolvable::unwrap))
    }

    override fun samplingRule(samplingRule: CfnSamplingRule.SamplingRuleProperty) {
      cdkBuilder.samplingRule(samplingRule.let(CfnSamplingRule.SamplingRuleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3f9bd38e6eedd9eed0b96d14bddd6c404714f4cb67becd24bc776c146be46099")
    override
        fun samplingRule(samplingRule: CfnSamplingRule.SamplingRuleProperty.Builder.() -> Unit):
        Unit = samplingRule(CfnSamplingRule.SamplingRuleProperty(samplingRule))

    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleRecord(samplingRuleRecord: IResolvable) {
      cdkBuilder.samplingRuleRecord(samplingRuleRecord.let(IResolvable::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override
        fun samplingRuleRecord(samplingRuleRecord: CfnSamplingRule.SamplingRuleRecordProperty) {
      cdkBuilder.samplingRuleRecord(samplingRuleRecord.let(CfnSamplingRule.SamplingRuleRecordProperty::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c6b2bf197ae8343a1807b08d7b6c6b172b138cadfa849498c36afb865b0c69e0")
    override
        fun samplingRuleRecord(samplingRuleRecord: CfnSamplingRule.SamplingRuleRecordProperty.Builder.() -> Unit):
        Unit = samplingRuleRecord(CfnSamplingRule.SamplingRuleRecordProperty(samplingRuleRecord))

    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleUpdate(samplingRuleUpdate: IResolvable) {
      cdkBuilder.samplingRuleUpdate(samplingRuleUpdate.let(IResolvable::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override
        fun samplingRuleUpdate(samplingRuleUpdate: CfnSamplingRule.SamplingRuleUpdateProperty) {
      cdkBuilder.samplingRuleUpdate(samplingRuleUpdate.let(CfnSamplingRule.SamplingRuleUpdateProperty::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c61904e1af23a4bb165c9271b8adf14c9af44001437f67d469f0415a24f784b")
    override
        fun samplingRuleUpdate(samplingRuleUpdate: CfnSamplingRule.SamplingRuleUpdateProperty.Builder.() -> Unit):
        Unit = samplingRuleUpdate(CfnSamplingRule.SamplingRuleUpdateProperty(samplingRuleUpdate))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.xray.CfnSamplingRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.xray.CfnSamplingRuleProps,
  ) : CdkObject(cdkObject), CfnSamplingRuleProps {
    @Deprecated(message = "deprecated in CDK")
    override fun ruleName(): String? = unwrap(this).getRuleName()

    override fun samplingRule(): Any? = unwrap(this).getSamplingRule()

    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleRecord(): Any? = unwrap(this).getSamplingRuleRecord()

    @Deprecated(message = "deprecated in CDK")
    override fun samplingRuleUpdate(): Any? = unwrap(this).getSamplingRuleUpdate()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSamplingRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnSamplingRuleProps):
        CfnSamplingRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSamplingRuleProps):
        software.amazon.awscdk.services.xray.CfnSamplingRuleProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.xray.CfnSamplingRuleProps
  }
}
