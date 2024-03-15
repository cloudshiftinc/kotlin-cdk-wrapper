@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFeatureGroupProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun eventTimeFeatureName(): String

  public fun featureDefinitions(): Any

  public fun featureGroupName(): String

  public fun offlineStoreConfig(): Any? = unwrap(this).getOfflineStoreConfig()

  public fun onlineStoreConfig(): Any? = unwrap(this).getOnlineStoreConfig()

  public fun recordIdentifierFeatureName(): String

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun throughputConfig(): Any? = unwrap(this).getThroughputConfig()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun eventTimeFeatureName(eventTimeFeatureName: String)

    public fun featureDefinitions(featureDefinitions: IResolvable)

    public fun featureDefinitions(featureDefinitions: List<Any>)

    public fun featureDefinitions(vararg featureDefinitions: Any)

    public fun featureGroupName(featureGroupName: String)

    public fun offlineStoreConfig(offlineStoreConfig: Any)

    public fun onlineStoreConfig(onlineStoreConfig: Any)

    public fun recordIdentifierFeatureName(recordIdentifierFeatureName: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun throughputConfig(throughputConfig: IResolvable)

    public fun throughputConfig(throughputConfig: CfnFeatureGroup.ThroughputConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("357de001ed16b380820ab06022cbd2748a0b0a00b4eb8a37aefec7bf5c7b3336")
    public
        fun throughputConfig(throughputConfig: CfnFeatureGroup.ThroughputConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventTimeFeatureName(eventTimeFeatureName: String) {
      cdkBuilder.eventTimeFeatureName(eventTimeFeatureName)
    }

    override fun featureDefinitions(featureDefinitions: IResolvable) {
      cdkBuilder.featureDefinitions(featureDefinitions.let(IResolvable::unwrap))
    }

    override fun featureDefinitions(featureDefinitions: List<Any>) {
      cdkBuilder.featureDefinitions(featureDefinitions)
    }

    override fun featureDefinitions(vararg featureDefinitions: Any): Unit =
        featureDefinitions(featureDefinitions.toList())

    override fun featureGroupName(featureGroupName: String) {
      cdkBuilder.featureGroupName(featureGroupName)
    }

    override fun offlineStoreConfig(offlineStoreConfig: Any) {
      cdkBuilder.offlineStoreConfig(offlineStoreConfig)
    }

    override fun onlineStoreConfig(onlineStoreConfig: Any) {
      cdkBuilder.onlineStoreConfig(onlineStoreConfig)
    }

    override fun recordIdentifierFeatureName(recordIdentifierFeatureName: String) {
      cdkBuilder.recordIdentifierFeatureName(recordIdentifierFeatureName)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun throughputConfig(throughputConfig: IResolvable) {
      cdkBuilder.throughputConfig(throughputConfig.let(IResolvable::unwrap))
    }

    override fun throughputConfig(throughputConfig: CfnFeatureGroup.ThroughputConfigProperty) {
      cdkBuilder.throughputConfig(throughputConfig.let(CfnFeatureGroup.ThroughputConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("357de001ed16b380820ab06022cbd2748a0b0a00b4eb8a37aefec7bf5c7b3336")
    override
        fun throughputConfig(throughputConfig: CfnFeatureGroup.ThroughputConfigProperty.Builder.() -> Unit):
        Unit = throughputConfig(CfnFeatureGroup.ThroughputConfigProperty(throughputConfig))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps,
  ) : CdkObject(cdkObject), CfnFeatureGroupProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun eventTimeFeatureName(): String = unwrap(this).getEventTimeFeatureName()

    override fun featureDefinitions(): Any = unwrap(this).getFeatureDefinitions()

    override fun featureGroupName(): String = unwrap(this).getFeatureGroupName()

    override fun offlineStoreConfig(): Any? = unwrap(this).getOfflineStoreConfig()

    override fun onlineStoreConfig(): Any? = unwrap(this).getOnlineStoreConfig()

    override fun recordIdentifierFeatureName(): String =
        unwrap(this).getRecordIdentifierFeatureName()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun throughputConfig(): Any? = unwrap(this).getThroughputConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFeatureGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps):
        CfnFeatureGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFeatureGroupProps):
        software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnFeatureGroupProps
  }
}
