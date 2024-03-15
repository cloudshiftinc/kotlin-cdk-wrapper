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

public interface CfnReferenceStoreProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun sseConfig(): Any? = unwrap(this).getSseConfig()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun sseConfig(sseConfig: IResolvable)

    public fun sseConfig(sseConfig: CfnReferenceStore.SseConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45d6bb523f9d2f3d09ca7f69569817845c5368f4e519712321b047b485fd803d")
    public fun sseConfig(sseConfig: CfnReferenceStore.SseConfigProperty.Builder.() -> Unit)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnReferenceStoreProps.Builder =
        software.amazon.awscdk.services.omics.CfnReferenceStoreProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun sseConfig(sseConfig: IResolvable) {
      cdkBuilder.sseConfig(sseConfig.let(IResolvable::unwrap))
    }

    override fun sseConfig(sseConfig: CfnReferenceStore.SseConfigProperty) {
      cdkBuilder.sseConfig(sseConfig.let(CfnReferenceStore.SseConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45d6bb523f9d2f3d09ca7f69569817845c5368f4e519712321b047b485fd803d")
    override fun sseConfig(sseConfig: CfnReferenceStore.SseConfigProperty.Builder.() -> Unit): Unit
        = sseConfig(CfnReferenceStore.SseConfigProperty(sseConfig))

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnReferenceStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.omics.CfnReferenceStoreProps,
  ) : CdkObject(cdkObject), CfnReferenceStoreProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun sseConfig(): Any? = unwrap(this).getSseConfig()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReferenceStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnReferenceStoreProps):
        CfnReferenceStoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReferenceStoreProps):
        software.amazon.awscdk.services.omics.CfnReferenceStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.omics.CfnReferenceStoreProps
  }
}
