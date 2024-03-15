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

public interface CfnVariantStoreProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun reference(): Any

  public fun sseConfig(): Any? = unwrap(this).getSseConfig()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun reference(reference: IResolvable)

    public fun reference(reference: CfnVariantStore.ReferenceItemProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7e5aa46d9d82fb254975099d8acd828f6c5fc9f2f168cd8baeace1dba2b47d7")
    public fun reference(reference: CfnVariantStore.ReferenceItemProperty.Builder.() -> Unit)

    public fun sseConfig(sseConfig: IResolvable)

    public fun sseConfig(sseConfig: CfnVariantStore.SseConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e3668a9020afb7400d7bbf89cb75d2cc9edd65d1f25ed15ccb4ae04fd8b4b78")
    public fun sseConfig(sseConfig: CfnVariantStore.SseConfigProperty.Builder.() -> Unit)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnVariantStoreProps.Builder =
        software.amazon.awscdk.services.omics.CfnVariantStoreProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun reference(reference: IResolvable) {
      cdkBuilder.reference(reference.let(IResolvable::unwrap))
    }

    override fun reference(reference: CfnVariantStore.ReferenceItemProperty) {
      cdkBuilder.reference(reference.let(CfnVariantStore.ReferenceItemProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7e5aa46d9d82fb254975099d8acd828f6c5fc9f2f168cd8baeace1dba2b47d7")
    override fun reference(reference: CfnVariantStore.ReferenceItemProperty.Builder.() -> Unit):
        Unit = reference(CfnVariantStore.ReferenceItemProperty(reference))

    override fun sseConfig(sseConfig: IResolvable) {
      cdkBuilder.sseConfig(sseConfig.let(IResolvable::unwrap))
    }

    override fun sseConfig(sseConfig: CfnVariantStore.SseConfigProperty) {
      cdkBuilder.sseConfig(sseConfig.let(CfnVariantStore.SseConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0e3668a9020afb7400d7bbf89cb75d2cc9edd65d1f25ed15ccb4ae04fd8b4b78")
    override fun sseConfig(sseConfig: CfnVariantStore.SseConfigProperty.Builder.() -> Unit): Unit =
        sseConfig(CfnVariantStore.SseConfigProperty(sseConfig))

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnVariantStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.omics.CfnVariantStoreProps,
  ) : CdkObject(cdkObject), CfnVariantStoreProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun reference(): Any = unwrap(this).getReference()

    override fun sseConfig(): Any? = unwrap(this).getSseConfig()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVariantStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnVariantStoreProps):
        CfnVariantStoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVariantStoreProps):
        software.amazon.awscdk.services.omics.CfnVariantStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.omics.CfnVariantStoreProps
  }
}
