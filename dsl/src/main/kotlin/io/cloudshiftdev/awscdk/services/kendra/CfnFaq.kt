package io.cloudshiftdev.awscdk.services.kendra

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
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

public open class CfnFaq internal constructor(
  private val cdkObject: software.amazon.awscdk.services.kendra.CfnFaq,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun fileFormat(): String? = unwrap(this).getFileFormat()

  public open fun fileFormat(`value`: String) {
    unwrap(this).setFileFormat(`value`)
  }

  public open fun indexId(): String = unwrap(this).getIndexId()

  public open fun indexId(`value`: String) {
    unwrap(this).setIndexId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun languageCode(): String? = unwrap(this).getLanguageCode()

  public open fun languageCode(`value`: String) {
    unwrap(this).setLanguageCode(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun s3Path(): Any = unwrap(this).getS3Path()

  public open fun s3Path(`value`: IResolvable) {
    unwrap(this).setS3Path(`value`.let(IResolvable::unwrap))
  }

  public open fun s3Path(`value`: S3PathProperty) {
    unwrap(this).setS3Path(`value`.let(S3PathProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e2ee32c5cf7c6bf3aecdb829e9cfd564efb0de1f3fc9a25cc38e18bfe50ec44f")
  public open fun s3Path(`value`: S3PathProperty.Builder.() -> Unit): Unit =
      s3Path(S3PathProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun description(description: String)

    public fun fileFormat(fileFormat: String)

    public fun indexId(indexId: String)

    public fun languageCode(languageCode: String)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun s3Path(s3Path: IResolvable)

    public fun s3Path(s3Path: S3PathProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0148d928706a8212ce1eeb005579e2999c3f08f5d0389b43b8264c1df05eab20")
    public fun s3Path(s3Path: S3PathProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnFaq.Builder =
        software.amazon.awscdk.services.kendra.CfnFaq.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun fileFormat(fileFormat: String) {
      cdkBuilder.fileFormat(fileFormat)
    }

    override fun indexId(indexId: String) {
      cdkBuilder.indexId(indexId)
    }

    override fun languageCode(languageCode: String) {
      cdkBuilder.languageCode(languageCode)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun s3Path(s3Path: IResolvable) {
      cdkBuilder.s3Path(s3Path.let(IResolvable::unwrap))
    }

    override fun s3Path(s3Path: S3PathProperty) {
      cdkBuilder.s3Path(s3Path.let(S3PathProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0148d928706a8212ce1eeb005579e2999c3f08f5d0389b43b8264c1df05eab20")
    override fun s3Path(s3Path: S3PathProperty.Builder.() -> Unit): Unit =
        s3Path(S3PathProperty(s3Path))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kendra.CfnFaq = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFaq {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFaq(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnFaq): CfnFaq =
        CfnFaq(cdkObject)

    internal fun unwrap(wrapped: CfnFaq): software.amazon.awscdk.services.kendra.CfnFaq =
        wrapped.cdkObject
  }

  public interface S3PathProperty {
    public fun bucket(): String

    public fun key(): String

    public interface Builder {
      public fun bucket(bucket: String)

      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build(): software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty,
    ) : S3PathProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun key(): String = unwrap(this).getKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3PathProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty):
          S3PathProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3PathProperty):
          software.amazon.awscdk.services.kendra.CfnFaq.S3PathProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
