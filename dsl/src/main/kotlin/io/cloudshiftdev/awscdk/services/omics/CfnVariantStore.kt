package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVariantStore internal constructor(
  private val cdkObject: software.amazon.awscdk.services.omics.CfnVariantStore,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

  public open fun attrStoreArn(): String = unwrap(this).getAttrStoreArn()

  public open fun attrStoreSizeBytes(): IResolvable =
      unwrap(this).getAttrStoreSizeBytes().let(IResolvable::wrap)

  public open fun attrUpdateTime(): String = unwrap(this).getAttrUpdateTime()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun reference(): Any = unwrap(this).getReference()

  public open fun reference(`value`: IResolvable) {
    unwrap(this).setReference(`value`.let(IResolvable::unwrap))
  }

  public open fun reference(`value`: ReferenceItemProperty) {
    unwrap(this).setReference(`value`.let(ReferenceItemProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e041845eebfa928d45781331f20ec3a225ba47d29f1c6d6518b60070cf6bd1b")
  public open fun reference(`value`: ReferenceItemProperty.Builder.() -> Unit): Unit =
      reference(ReferenceItemProperty(`value`))

  public open fun sseConfig(): Any? = unwrap(this).getSseConfig()

  public open fun sseConfig(`value`: IResolvable) {
    unwrap(this).setSseConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun sseConfig(`value`: SseConfigProperty) {
    unwrap(this).setSseConfig(`value`.let(SseConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c682aa4ae4b204175f8226ff468036d94d65cfc832c6afbf260bfe47504106c6")
  public open fun sseConfig(`value`: SseConfigProperty.Builder.() -> Unit): Unit =
      sseConfig(SseConfigProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun reference(reference: IResolvable)

    public fun reference(reference: ReferenceItemProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bad7d77455224cc7c3ebfb552a282ce4210a14bd1e17965b10826a8b341188e3")
    public fun reference(reference: ReferenceItemProperty.Builder.() -> Unit)

    public fun sseConfig(sseConfig: IResolvable)

    public fun sseConfig(sseConfig: SseConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8ac15b344a45f91b8dd63c865bc33d644e6e7fa6d7bbd6c76750a2a941227bf")
    public fun sseConfig(sseConfig: SseConfigProperty.Builder.() -> Unit)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnVariantStore.Builder =
        software.amazon.awscdk.services.omics.CfnVariantStore.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun reference(reference: IResolvable) {
      cdkBuilder.reference(reference.let(IResolvable::unwrap))
    }

    override fun reference(reference: ReferenceItemProperty) {
      cdkBuilder.reference(reference.let(ReferenceItemProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bad7d77455224cc7c3ebfb552a282ce4210a14bd1e17965b10826a8b341188e3")
    override fun reference(reference: ReferenceItemProperty.Builder.() -> Unit): Unit =
        reference(ReferenceItemProperty(reference))

    override fun sseConfig(sseConfig: IResolvable) {
      cdkBuilder.sseConfig(sseConfig.let(IResolvable::unwrap))
    }

    override fun sseConfig(sseConfig: SseConfigProperty) {
      cdkBuilder.sseConfig(sseConfig.let(SseConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d8ac15b344a45f91b8dd63c865bc33d644e6e7fa6d7bbd6c76750a2a941227bf")
    override fun sseConfig(sseConfig: SseConfigProperty.Builder.() -> Unit): Unit =
        sseConfig(SseConfigProperty(sseConfig))

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnVariantStore = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVariantStore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVariantStore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnVariantStore):
        CfnVariantStore = CfnVariantStore(cdkObject)

    internal fun unwrap(wrapped: CfnVariantStore):
        software.amazon.awscdk.services.omics.CfnVariantStore = wrapped.cdkObject
  }

  public interface SseConfigProperty {
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    public fun type(): String

    public interface Builder {
      public fun keyArn(keyArn: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.omics.CfnVariantStore.SseConfigProperty.Builder =
          software.amazon.awscdk.services.omics.CfnVariantStore.SseConfigProperty.builder()

      override fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.omics.CfnVariantStore.SseConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.omics.CfnVariantStore.SseConfigProperty,
    ) : SseConfigProperty {
      override fun keyArn(): String? = unwrap(this).getKeyArn()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SseConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnVariantStore.SseConfigProperty):
          SseConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SseConfigProperty):
          software.amazon.awscdk.services.omics.CfnVariantStore.SseConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ReferenceItemProperty {
    public fun referenceArn(): String

    public interface Builder {
      public fun referenceArn(referenceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.omics.CfnVariantStore.ReferenceItemProperty.Builder =
          software.amazon.awscdk.services.omics.CfnVariantStore.ReferenceItemProperty.builder()

      override fun referenceArn(referenceArn: String) {
        cdkBuilder.referenceArn(referenceArn)
      }

      public fun build():
          software.amazon.awscdk.services.omics.CfnVariantStore.ReferenceItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.omics.CfnVariantStore.ReferenceItemProperty,
    ) : ReferenceItemProperty {
      override fun referenceArn(): String = unwrap(this).getReferenceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnVariantStore.ReferenceItemProperty):
          ReferenceItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceItemProperty):
          software.amazon.awscdk.services.omics.CfnVariantStore.ReferenceItemProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
