@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.omics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAnnotationStore internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStore,
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

  public open fun reference(): Any? = unwrap(this).getReference()

  public open fun reference(`value`: IResolvable) {
    unwrap(this).setReference(`value`.let(IResolvable::unwrap))
  }

  public open fun reference(`value`: ReferenceItemProperty) {
    unwrap(this).setReference(`value`.let(ReferenceItemProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5fd83254e2bd0fd0afa244a3ac8186d4e3eb6bb60009220e32fab605786b0bc5")
  public open fun reference(`value`: ReferenceItemProperty.Builder.() -> Unit): Unit =
      reference(ReferenceItemProperty(`value`))

  public open fun sseConfig(): Any? = unwrap(this).getSseConfig()

  public open fun sseConfig(`value`: IResolvable) {
    unwrap(this).setSseConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun sseConfig(`value`: SseConfigProperty) {
    unwrap(this).setSseConfig(`value`.let(SseConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("80afde8fe85a68acbfb18efefc53f47af970c76603c8038fbb3d02c2673e8ff2")
  public open fun sseConfig(`value`: SseConfigProperty.Builder.() -> Unit): Unit =
      sseConfig(SseConfigProperty(`value`))

  public open fun storeFormat(): String = unwrap(this).getStoreFormat()

  public open fun storeFormat(`value`: String) {
    unwrap(this).setStoreFormat(`value`)
  }

  public open fun storeOptions(): Any? = unwrap(this).getStoreOptions()

  public open fun storeOptions(`value`: IResolvable) {
    unwrap(this).setStoreOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun storeOptions(`value`: StoreOptionsProperty) {
    unwrap(this).setStoreOptions(`value`.let(StoreOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("70a993ece6290faebfc74a8e370effbf8fc6d3722406b7fa47e292f3144f171b")
  public open fun storeOptions(`value`: StoreOptionsProperty.Builder.() -> Unit): Unit =
      storeOptions(StoreOptionsProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun reference(reference: IResolvable)

    public fun reference(reference: ReferenceItemProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b22f41b8a821fe302ac46e3b1913c8d8308a0c128f5983ae28a00c1e4338e220")
    public fun reference(reference: ReferenceItemProperty.Builder.() -> Unit)

    public fun sseConfig(sseConfig: IResolvable)

    public fun sseConfig(sseConfig: SseConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("742026332c2b98f1f2e17b196108d72301db805af046abb664e8285bdfee8680")
    public fun sseConfig(sseConfig: SseConfigProperty.Builder.() -> Unit)

    public fun storeFormat(storeFormat: String)

    public fun storeOptions(storeOptions: IResolvable)

    public fun storeOptions(storeOptions: StoreOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("beb1462e4842546350e44250c96c6d60a6a58edea24c6780a368fe4b701e385d")
    public fun storeOptions(storeOptions: StoreOptionsProperty.Builder.() -> Unit)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.omics.CfnAnnotationStore.Builder =
        software.amazon.awscdk.services.omics.CfnAnnotationStore.Builder.create(scope, id)

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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b22f41b8a821fe302ac46e3b1913c8d8308a0c128f5983ae28a00c1e4338e220")
    override fun reference(reference: ReferenceItemProperty.Builder.() -> Unit): Unit =
        reference(ReferenceItemProperty(reference))

    override fun sseConfig(sseConfig: IResolvable) {
      cdkBuilder.sseConfig(sseConfig.let(IResolvable::unwrap))
    }

    override fun sseConfig(sseConfig: SseConfigProperty) {
      cdkBuilder.sseConfig(sseConfig.let(SseConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("742026332c2b98f1f2e17b196108d72301db805af046abb664e8285bdfee8680")
    override fun sseConfig(sseConfig: SseConfigProperty.Builder.() -> Unit): Unit =
        sseConfig(SseConfigProperty(sseConfig))

    override fun storeFormat(storeFormat: String) {
      cdkBuilder.storeFormat(storeFormat)
    }

    override fun storeOptions(storeOptions: IResolvable) {
      cdkBuilder.storeOptions(storeOptions.let(IResolvable::unwrap))
    }

    override fun storeOptions(storeOptions: StoreOptionsProperty) {
      cdkBuilder.storeOptions(storeOptions.let(StoreOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("beb1462e4842546350e44250c96c6d60a6a58edea24c6780a368fe4b701e385d")
    override fun storeOptions(storeOptions: StoreOptionsProperty.Builder.() -> Unit): Unit =
        storeOptions(StoreOptionsProperty(storeOptions))

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.omics.CfnAnnotationStore =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.omics.CfnAnnotationStore.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAnnotationStore {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAnnotationStore(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStore):
        CfnAnnotationStore = CfnAnnotationStore(cdkObject)

    internal fun unwrap(wrapped: CfnAnnotationStore):
        software.amazon.awscdk.services.omics.CfnAnnotationStore = wrapped.cdkObject
  }

  public interface ReferenceItemProperty {
    public fun referenceArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun referenceArn(referenceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.ReferenceItemProperty.Builder =
          software.amazon.awscdk.services.omics.CfnAnnotationStore.ReferenceItemProperty.builder()

      override fun referenceArn(referenceArn: String) {
        cdkBuilder.referenceArn(referenceArn)
      }

      public fun build():
          software.amazon.awscdk.services.omics.CfnAnnotationStore.ReferenceItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.ReferenceItemProperty,
    ) : CdkObject(cdkObject), ReferenceItemProperty {
      override fun referenceArn(): String = unwrap(this).getReferenceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStore.ReferenceItemProperty):
          ReferenceItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceItemProperty):
          software.amazon.awscdk.services.omics.CfnAnnotationStore.ReferenceItemProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.omics.CfnAnnotationStore.ReferenceItemProperty
    }
  }

  public interface StoreOptionsProperty {
    public fun tsvStoreOptions(): Any

    @CdkDslMarker
    public interface Builder {
      public fun tsvStoreOptions(tsvStoreOptions: IResolvable)

      public fun tsvStoreOptions(tsvStoreOptions: TsvStoreOptionsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da03542bf298b1170fb52c32eea77b038cc256601686481b3dc9a051bd3305e1")
      public fun tsvStoreOptions(tsvStoreOptions: TsvStoreOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.StoreOptionsProperty.Builder =
          software.amazon.awscdk.services.omics.CfnAnnotationStore.StoreOptionsProperty.builder()

      override fun tsvStoreOptions(tsvStoreOptions: IResolvable) {
        cdkBuilder.tsvStoreOptions(tsvStoreOptions.let(IResolvable::unwrap))
      }

      override fun tsvStoreOptions(tsvStoreOptions: TsvStoreOptionsProperty) {
        cdkBuilder.tsvStoreOptions(tsvStoreOptions.let(TsvStoreOptionsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da03542bf298b1170fb52c32eea77b038cc256601686481b3dc9a051bd3305e1")
      override fun tsvStoreOptions(tsvStoreOptions: TsvStoreOptionsProperty.Builder.() -> Unit):
          Unit = tsvStoreOptions(TsvStoreOptionsProperty(tsvStoreOptions))

      public fun build():
          software.amazon.awscdk.services.omics.CfnAnnotationStore.StoreOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.StoreOptionsProperty,
    ) : CdkObject(cdkObject), StoreOptionsProperty {
      override fun tsvStoreOptions(): Any = unwrap(this).getTsvStoreOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StoreOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStore.StoreOptionsProperty):
          StoreOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StoreOptionsProperty):
          software.amazon.awscdk.services.omics.CfnAnnotationStore.StoreOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.omics.CfnAnnotationStore.StoreOptionsProperty
    }
  }

  public interface SseConfigProperty {
    public fun keyArn(): String? = unwrap(this).getKeyArn()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun keyArn(keyArn: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.SseConfigProperty.Builder =
          software.amazon.awscdk.services.omics.CfnAnnotationStore.SseConfigProperty.builder()

      override fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.omics.CfnAnnotationStore.SseConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.SseConfigProperty,
    ) : CdkObject(cdkObject), SseConfigProperty {
      override fun keyArn(): String? = unwrap(this).getKeyArn()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SseConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStore.SseConfigProperty):
          SseConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SseConfigProperty):
          software.amazon.awscdk.services.omics.CfnAnnotationStore.SseConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.omics.CfnAnnotationStore.SseConfigProperty
    }
  }

  public interface TsvStoreOptionsProperty {
    public fun annotationType(): String? = unwrap(this).getAnnotationType()

    public fun formatToHeader(): Any? = unwrap(this).getFormatToHeader()

    public fun schema(): Any? = unwrap(this).getSchema()

    @CdkDslMarker
    public interface Builder {
      public fun annotationType(annotationType: String)

      public fun formatToHeader(formatToHeader: IResolvable)

      public fun formatToHeader(formatToHeader: Map<String, String>)

      public fun schema(schema: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.TsvStoreOptionsProperty.Builder =
          software.amazon.awscdk.services.omics.CfnAnnotationStore.TsvStoreOptionsProperty.builder()

      override fun annotationType(annotationType: String) {
        cdkBuilder.annotationType(annotationType)
      }

      override fun formatToHeader(formatToHeader: IResolvable) {
        cdkBuilder.formatToHeader(formatToHeader.let(IResolvable::unwrap))
      }

      override fun formatToHeader(formatToHeader: Map<String, String>) {
        cdkBuilder.formatToHeader(formatToHeader)
      }

      override fun schema(schema: Any) {
        cdkBuilder.schema(schema)
      }

      public fun build():
          software.amazon.awscdk.services.omics.CfnAnnotationStore.TsvStoreOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.omics.CfnAnnotationStore.TsvStoreOptionsProperty,
    ) : CdkObject(cdkObject), TsvStoreOptionsProperty {
      override fun annotationType(): String? = unwrap(this).getAnnotationType()

      override fun formatToHeader(): Any? = unwrap(this).getFormatToHeader()

      override fun schema(): Any? = unwrap(this).getSchema()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TsvStoreOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.omics.CfnAnnotationStore.TsvStoreOptionsProperty):
          TsvStoreOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TsvStoreOptionsProperty):
          software.amazon.awscdk.services.omics.CfnAnnotationStore.TsvStoreOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.omics.CfnAnnotationStore.TsvStoreOptionsProperty
    }
  }
}
