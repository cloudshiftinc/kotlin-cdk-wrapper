@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDetectorProps {
  public fun dataSources(): Any? = unwrap(this).getDataSources()

  public fun enable(): Any

  public fun features(): Any? = unwrap(this).getFeatures()

  public fun findingPublishingFrequency(): String? = unwrap(this).getFindingPublishingFrequency()

  public fun tags(): List<CfnDetector.TagItemProperty> =
      unwrap(this).getTags()?.map(CfnDetector.TagItemProperty::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun dataSources(dataSources: IResolvable)

    public fun dataSources(dataSources: CfnDetector.CFNDataSourceConfigurationsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ace3003720336dd62e3bf03a63b0cb414964cf4714e30450776737c11434a23")
    public
        fun dataSources(dataSources: CfnDetector.CFNDataSourceConfigurationsProperty.Builder.() -> Unit)

    public fun enable(enable: Boolean)

    public fun enable(enable: IResolvable)

    public fun features(features: IResolvable)

    public fun features(features: List<Any>)

    public fun features(vararg features: Any)

    public fun findingPublishingFrequency(findingPublishingFrequency: String)

    public fun tags(tags: List<CfnDetector.TagItemProperty>)

    public fun tags(vararg tags: CfnDetector.TagItemProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnDetectorProps.Builder =
        software.amazon.awscdk.services.guardduty.CfnDetectorProps.builder()

    override fun dataSources(dataSources: IResolvable) {
      cdkBuilder.dataSources(dataSources.let(IResolvable::unwrap))
    }

    override fun dataSources(dataSources: CfnDetector.CFNDataSourceConfigurationsProperty) {
      cdkBuilder.dataSources(dataSources.let(CfnDetector.CFNDataSourceConfigurationsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ace3003720336dd62e3bf03a63b0cb414964cf4714e30450776737c11434a23")
    override
        fun dataSources(dataSources: CfnDetector.CFNDataSourceConfigurationsProperty.Builder.() -> Unit):
        Unit = dataSources(CfnDetector.CFNDataSourceConfigurationsProperty(dataSources))

    override fun enable(enable: Boolean) {
      cdkBuilder.enable(enable)
    }

    override fun enable(enable: IResolvable) {
      cdkBuilder.enable(enable.let(IResolvable::unwrap))
    }

    override fun features(features: IResolvable) {
      cdkBuilder.features(features.let(IResolvable::unwrap))
    }

    override fun features(features: List<Any>) {
      cdkBuilder.features(features)
    }

    override fun features(vararg features: Any): Unit = features(features.toList())

    override fun findingPublishingFrequency(findingPublishingFrequency: String) {
      cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
    }

    override fun tags(tags: List<CfnDetector.TagItemProperty>) {
      cdkBuilder.tags(tags.map(CfnDetector.TagItemProperty::unwrap))
    }

    override fun tags(vararg tags: CfnDetector.TagItemProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.guardduty.CfnDetectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.guardduty.CfnDetectorProps,
  ) : CdkObject(cdkObject), CfnDetectorProps {
    override fun dataSources(): Any? = unwrap(this).getDataSources()

    override fun enable(): Any = unwrap(this).getEnable()

    override fun features(): Any? = unwrap(this).getFeatures()

    override fun findingPublishingFrequency(): String? =
        unwrap(this).getFindingPublishingFrequency()

    override fun tags(): List<CfnDetector.TagItemProperty> =
        unwrap(this).getTags()?.map(CfnDetector.TagItemProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDetectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetectorProps):
        CfnDetectorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDetectorProps):
        software.amazon.awscdk.services.guardduty.CfnDetectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.guardduty.CfnDetectorProps
  }
}
