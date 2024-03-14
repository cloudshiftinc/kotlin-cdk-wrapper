package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDocument internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ssm.CfnDocument,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attachments(): Any? = unwrap(this).getAttachments()

  public open fun attachments(`value`: IResolvable) {
    unwrap(this).setAttachments(`value`.let(IResolvable::unwrap))
  }

  public open fun attachments(__idx_ac66f0: List<Any>) {
    unwrap(this).setAttachments(__idx_ac66f0)
  }

  public open fun attachments(vararg __idx_ac66f0: Any): Unit = attachments(__idx_ac66f0.toList())

  public open fun content(): Any = unwrap(this).getContent()

  public open fun content(`value`: Any) {
    unwrap(this).setContent(`value`)
  }

  public open fun documentFormat(): String? = unwrap(this).getDocumentFormat()

  public open fun documentFormat(`value`: String) {
    unwrap(this).setDocumentFormat(`value`)
  }

  public open fun documentType(): String? = unwrap(this).getDocumentType()

  public open fun documentType(`value`: String) {
    unwrap(this).setDocumentType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun requires(): Any? = unwrap(this).getRequires()

  public open fun requires(`value`: IResolvable) {
    unwrap(this).setRequires(`value`.let(IResolvable::unwrap))
  }

  public open fun requires(__idx_ac66f0: List<Any>) {
    unwrap(this).setRequires(__idx_ac66f0)
  }

  public open fun requires(vararg __idx_ac66f0: Any): Unit = requires(__idx_ac66f0.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun targetType(): String? = unwrap(this).getTargetType()

  public open fun targetType(`value`: String) {
    unwrap(this).setTargetType(`value`)
  }

  public open fun updateMethod(): String? = unwrap(this).getUpdateMethod()

  public open fun updateMethod(`value`: String) {
    unwrap(this).setUpdateMethod(`value`)
  }

  public open fun versionName(): String? = unwrap(this).getVersionName()

  public open fun versionName(`value`: String) {
    unwrap(this).setVersionName(`value`)
  }

  public interface Builder {
    public fun attachments(attachments: IResolvable)

    public fun attachments(attachments: List<Any>)

    public fun attachments(vararg attachments: Any)

    public fun content(content: Any)

    public fun documentFormat(documentFormat: String)

    public fun documentType(documentType: String)

    public fun name(name: String)

    public fun requires(requires: IResolvable)

    public fun requires(requires: List<Any>)

    public fun requires(vararg requires: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetType(targetType: String)

    public fun updateMethod(updateMethod: String)

    public fun versionName(versionName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnDocument.Builder =
        software.amazon.awscdk.services.ssm.CfnDocument.Builder.create(scope, id)

    override fun attachments(attachments: IResolvable) {
      cdkBuilder.attachments(attachments.let(IResolvable::unwrap))
    }

    override fun attachments(attachments: List<Any>) {
      cdkBuilder.attachments(attachments)
    }

    override fun attachments(vararg attachments: Any): Unit = attachments(attachments.toList())

    override fun content(content: Any) {
      cdkBuilder.content(content)
    }

    override fun documentFormat(documentFormat: String) {
      cdkBuilder.documentFormat(documentFormat)
    }

    override fun documentType(documentType: String) {
      cdkBuilder.documentType(documentType)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun requires(requires: IResolvable) {
      cdkBuilder.requires(requires.let(IResolvable::unwrap))
    }

    override fun requires(requires: List<Any>) {
      cdkBuilder.requires(requires)
    }

    override fun requires(vararg requires: Any): Unit = requires(requires.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    override fun updateMethod(updateMethod: String) {
      cdkBuilder.updateMethod(updateMethod)
    }

    override fun versionName(versionName: String) {
      cdkBuilder.versionName(versionName)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnDocument = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDocument {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDocument(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnDocument): CfnDocument =
        CfnDocument(cdkObject)

    internal fun unwrap(wrapped: CfnDocument): software.amazon.awscdk.services.ssm.CfnDocument =
        wrapped.cdkObject
  }

  public interface AttachmentsSourceProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun name(): String? = unwrap(this).getName()

    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    public interface Builder {
      public fun key(key: String)

      public fun name(name: String)

      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnDocument.AttachmentsSourceProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnDocument.AttachmentsSourceProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.ssm.CfnDocument.AttachmentsSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnDocument.AttachmentsSourceProperty,
    ) : AttachmentsSourceProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun name(): String? = unwrap(this).getName()

      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttachmentsSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnDocument.AttachmentsSourceProperty):
          AttachmentsSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttachmentsSourceProperty):
          software.amazon.awscdk.services.ssm.CfnDocument.AttachmentsSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DocumentRequiresProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun name(name: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnDocument.DocumentRequiresProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnDocument.DocumentRequiresProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.ssm.CfnDocument.DocumentRequiresProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ssm.CfnDocument.DocumentRequiresProperty,
    ) : DocumentRequiresProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentRequiresProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnDocument.DocumentRequiresProperty):
          DocumentRequiresProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentRequiresProperty):
          software.amazon.awscdk.services.ssm.CfnDocument.DocumentRequiresProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
