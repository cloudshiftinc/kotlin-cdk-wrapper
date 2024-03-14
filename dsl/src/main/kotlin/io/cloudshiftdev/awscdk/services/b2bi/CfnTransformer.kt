package io.cloudshiftdev.awscdk.services.b2bi

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransformer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  public open fun attrTransformerArn(): String = unwrap(this).getAttrTransformerArn()

  public open fun attrTransformerId(): String = unwrap(this).getAttrTransformerId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun ediType(): Any = unwrap(this).getEdiType()

  public open fun ediType(`value`: IResolvable) {
    unwrap(this).setEdiType(`value`.let(IResolvable::unwrap))
  }

  public open fun ediType(`value`: EdiTypeProperty) {
    unwrap(this).setEdiType(`value`.let(EdiTypeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("29258a7ce16a2d224867c8765eb0a3ee84d47c152f097310fd6e8b6ac2af3c9e")
  public open fun ediType(`value`: EdiTypeProperty.Builder.() -> Unit): Unit =
      ediType(EdiTypeProperty(`value`))

  public open fun fileFormat(): String = unwrap(this).getFileFormat()

  public open fun fileFormat(`value`: String) {
    unwrap(this).setFileFormat(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun mappingTemplate(): String = unwrap(this).getMappingTemplate()

  public open fun mappingTemplate(`value`: String) {
    unwrap(this).setMappingTemplate(`value`)
  }

  public open fun modifiedAt(): String? = unwrap(this).getModifiedAt()

  public open fun modifiedAt(`value`: String) {
    unwrap(this).setModifiedAt(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun sampleDocument(): String? = unwrap(this).getSampleDocument()

  public open fun sampleDocument(`value`: String) {
    unwrap(this).setSampleDocument(`value`)
  }

  public open fun status(): String = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public interface Builder {
    public fun ediType(ediType: IResolvable)

    public fun ediType(ediType: EdiTypeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("656a19a9bb53086dd23f8198400500ac9d17071d7bf257e96ea303635530af67")
    public fun ediType(ediType: EdiTypeProperty.Builder.() -> Unit)

    public fun fileFormat(fileFormat: String)

    public fun mappingTemplate(mappingTemplate: String)

    public fun modifiedAt(modifiedAt: String)

    public fun name(name: String)

    public fun sampleDocument(sampleDocument: String)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnTransformer.Builder =
        software.amazon.awscdk.services.b2bi.CfnTransformer.Builder.create(scope, id)

    override fun ediType(ediType: IResolvable) {
      cdkBuilder.ediType(ediType.let(IResolvable::unwrap))
    }

    override fun ediType(ediType: EdiTypeProperty) {
      cdkBuilder.ediType(ediType.let(EdiTypeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("656a19a9bb53086dd23f8198400500ac9d17071d7bf257e96ea303635530af67")
    override fun ediType(ediType: EdiTypeProperty.Builder.() -> Unit): Unit =
        ediType(EdiTypeProperty(ediType))

    override fun fileFormat(fileFormat: String) {
      cdkBuilder.fileFormat(fileFormat)
    }

    override fun mappingTemplate(mappingTemplate: String) {
      cdkBuilder.mappingTemplate(mappingTemplate)
    }

    override fun modifiedAt(modifiedAt: String) {
      cdkBuilder.modifiedAt(modifiedAt)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun sampleDocument(sampleDocument: String) {
      cdkBuilder.sampleDocument(sampleDocument)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.b2bi.CfnTransformer = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransformer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransformer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer):
        CfnTransformer = CfnTransformer(cdkObject)

    internal fun unwrap(wrapped: CfnTransformer):
        software.amazon.awscdk.services.b2bi.CfnTransformer = wrapped.cdkObject
  }

  public interface X12DetailsProperty {
    public fun transactionSet(): String? = unwrap(this).getTransactionSet()

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun transactionSet(transactionSet: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12DetailsProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12DetailsProperty.builder()

      override fun transactionSet(transactionSet: String) {
        cdkBuilder.transactionSet(transactionSet)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.b2bi.CfnTransformer.X12DetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12DetailsProperty,
    ) : X12DetailsProperty {
      override fun transactionSet(): String? = unwrap(this).getTransactionSet()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): X12DetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.X12DetailsProperty):
          X12DetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: X12DetailsProperty):
          software.amazon.awscdk.services.b2bi.CfnTransformer.X12DetailsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EdiTypeProperty {
    public fun x12Details(): Any

    public interface Builder {
      public fun x12Details(x12Details: IResolvable)

      public fun x12Details(x12Details: X12DetailsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e7f53f7c8b93292a1154273d61bb66f75775193f21594f4971c63075e5ebc9a")
      public fun x12Details(x12Details: X12DetailsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.b2bi.CfnTransformer.EdiTypeProperty.Builder =
          software.amazon.awscdk.services.b2bi.CfnTransformer.EdiTypeProperty.builder()

      override fun x12Details(x12Details: IResolvable) {
        cdkBuilder.x12Details(x12Details.let(IResolvable::unwrap))
      }

      override fun x12Details(x12Details: X12DetailsProperty) {
        cdkBuilder.x12Details(x12Details.let(X12DetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e7f53f7c8b93292a1154273d61bb66f75775193f21594f4971c63075e5ebc9a")
      override fun x12Details(x12Details: X12DetailsProperty.Builder.() -> Unit): Unit =
          x12Details(X12DetailsProperty(x12Details))

      public fun build(): software.amazon.awscdk.services.b2bi.CfnTransformer.EdiTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.EdiTypeProperty,
    ) : EdiTypeProperty {
      override fun x12Details(): Any = unwrap(this).getX12Details()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EdiTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformer.EdiTypeProperty):
          EdiTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EdiTypeProperty):
          software.amazon.awscdk.services.b2bi.CfnTransformer.EdiTypeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
