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

public interface CfnAnnotationStoreProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String

  public fun reference(): Any? = unwrap(this).getReference()

  public fun sseConfig(): Any? = unwrap(this).getSseConfig()

  public fun storeFormat(): String

  public fun storeOptions(): Any? = unwrap(this).getStoreOptions()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun reference(reference: IResolvable)

    public fun reference(reference: CfnAnnotationStore.ReferenceItemProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b311b75f53a798bcf105a53b644a70d582b706e7155a81df86afc84dd1e5247")
    public fun reference(reference: CfnAnnotationStore.ReferenceItemProperty.Builder.() -> Unit)

    public fun sseConfig(sseConfig: IResolvable)

    public fun sseConfig(sseConfig: CfnAnnotationStore.SseConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5349e90bc0b910c760eccd5ac607bb4807c4c2cb32a332e28bfba23869782ea")
    public fun sseConfig(sseConfig: CfnAnnotationStore.SseConfigProperty.Builder.() -> Unit)

    public fun storeFormat(storeFormat: String)

    public fun storeOptions(storeOptions: IResolvable)

    public fun storeOptions(storeOptions: CfnAnnotationStore.StoreOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8fc5fc9d641ca248b61b5eaf45a09c0f8b380b8cc294d9fe6872b3987a5d4332")
    public
        fun storeOptions(storeOptions: CfnAnnotationStore.StoreOptionsProperty.Builder.() -> Unit)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnAnnotationStoreProps.Builder =
        software.amazon.awscdk.services.omics.CfnAnnotationStoreProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun reference(reference: IResolvable) {
      cdkBuilder.reference(reference.let(IResolvable::unwrap))
    }

    override fun reference(reference: CfnAnnotationStore.ReferenceItemProperty) {
      cdkBuilder.reference(reference.let(CfnAnnotationStore.ReferenceItemProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b311b75f53a798bcf105a53b644a70d582b706e7155a81df86afc84dd1e5247")
    override fun reference(reference: CfnAnnotationStore.ReferenceItemProperty.Builder.() -> Unit):
        Unit = reference(CfnAnnotationStore.ReferenceItemProperty(reference))

    override fun sseConfig(sseConfig: IResolvable) {
      cdkBuilder.sseConfig(sseConfig.let(IResolvable::unwrap))
    }

    override fun sseConfig(sseConfig: CfnAnnotationStore.SseConfigProperty) {
      cdkBuilder.sseConfig(sseConfig.let(CfnAnnotationStore.SseConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5349e90bc0b910c760eccd5ac607bb4807c4c2cb32a332e28bfba23869782ea")
    override fun sseConfig(sseConfig: CfnAnnotationStore.SseConfigProperty.Builder.() -> Unit): Unit
        = sseConfig(CfnAnnotationStore.SseConfigProperty(sseConfig))

    override fun storeFormat(storeFormat: String) {
      cdkBuilder.storeFormat(storeFormat)
    }

    override fun storeOptions(storeOptions: IResolvable) {
      cdkBuilder.storeOptions(storeOptions.let(IResolvable::unwrap))
    }

    override fun storeOptions(storeOptions: CfnAnnotationStore.StoreOptionsProperty) {
      cdkBuilder.storeOptions(storeOptions.let(CfnAnnotationStore.StoreOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8fc5fc9d641ca248b61b5eaf45a09c0f8b380b8cc294d9fe6872b3987a5d4332")
    override
        fun storeOptions(storeOptions: CfnAnnotationStore.StoreOptionsProperty.Builder.() -> Unit):
        Unit = storeOptions(CfnAnnotationStore.StoreOptionsProperty(storeOptions))

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnAnnotationStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStoreProps,
  ) : CdkObject(cdkObject), CfnAnnotationStoreProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String = unwrap(this).getName()

    override fun reference(): Any? = unwrap(this).getReference()

    override fun sseConfig(): Any? = unwrap(this).getSseConfig()

    override fun storeFormat(): String = unwrap(this).getStoreFormat()

    override fun storeOptions(): Any? = unwrap(this).getStoreOptions()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAnnotationStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStoreProps):
        CfnAnnotationStoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAnnotationStoreProps):
        software.amazon.awscdk.services.omics.CfnAnnotationStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.omics.CfnAnnotationStoreProps
  }
}
