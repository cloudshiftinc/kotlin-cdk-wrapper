@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnSequenceStoreProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun fallbackLocation(): String? = unwrap(this).getFallbackLocation()

  public fun name(): String

  public fun sseConfig(): Any? = unwrap(this).getSseConfig()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun fallbackLocation(fallbackLocation: String)

    public fun name(name: String)

    public fun sseConfig(sseConfig: IResolvable)

    public fun sseConfig(sseConfig: CfnSequenceStore.SseConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b08f61f52e6ffa4653df1814db4d891dd87c7ed451582e12630c0ec29da408ba")
    public fun sseConfig(sseConfig: CfnSequenceStore.SseConfigProperty.Builder.() -> Unit)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnSequenceStoreProps.Builder =
        software.amazon.awscdk.services.omics.CfnSequenceStoreProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun fallbackLocation(fallbackLocation: String) {
      cdkBuilder.fallbackLocation(fallbackLocation)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun sseConfig(sseConfig: IResolvable) {
      cdkBuilder.sseConfig(sseConfig.let(IResolvable::unwrap))
    }

    override fun sseConfig(sseConfig: CfnSequenceStore.SseConfigProperty) {
      cdkBuilder.sseConfig(sseConfig.let(CfnSequenceStore.SseConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b08f61f52e6ffa4653df1814db4d891dd87c7ed451582e12630c0ec29da408ba")
    override fun sseConfig(sseConfig: CfnSequenceStore.SseConfigProperty.Builder.() -> Unit): Unit =
        sseConfig(CfnSequenceStore.SseConfigProperty(sseConfig))

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnSequenceStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.omics.CfnSequenceStoreProps,
  ) : CdkObject(cdkObject), CfnSequenceStoreProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun fallbackLocation(): String? = unwrap(this).getFallbackLocation()

    override fun name(): String = unwrap(this).getName()

    override fun sseConfig(): Any? = unwrap(this).getSseConfig()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSequenceStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnSequenceStoreProps):
        CfnSequenceStoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSequenceStoreProps):
        software.amazon.awscdk.services.omics.CfnSequenceStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.omics.CfnSequenceStoreProps
  }
}
