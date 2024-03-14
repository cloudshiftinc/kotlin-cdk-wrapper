package io.cloudshiftdev.awscdk.services.amazonmq

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrRevision(): Number = unwrap(this).getAttrRevision()

  public open fun authenticationStrategy(): String? = unwrap(this).getAuthenticationStrategy()

  public open fun authenticationStrategy(`value`: String) {
    unwrap(this).setAuthenticationStrategy(`value`)
  }

  public open fun `data`(): String = unwrap(this).getData()

  public open fun `data`(`value`: String) {
    unwrap(this).setData(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun engineType(): String = unwrap(this).getEngineType()

  public open fun engineType(`value`: String) {
    unwrap(this).setEngineType(`value`)
  }

  public open fun engineVersion(): String = unwrap(this).getEngineVersion()

  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<TagsEntryProperty> =
      unwrap(this).getTagsRaw()?.map(TagsEntryProperty::wrap) ?: emptyList()

  public open fun tagsRaw(`value`: List<TagsEntryProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagsEntryProperty::unwrap))
  }

  public interface Builder {
    public fun authenticationStrategy(authenticationStrategy: String)

    public fun `data`(`data`: String)

    public fun description(description: String)

    public fun engineType(engineType: String)

    public fun engineVersion(engineVersion: String)

    public fun name(name: String)

    public fun tags(tags: List<TagsEntryProperty>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amazonmq.CfnConfiguration.Builder =
        software.amazon.awscdk.services.amazonmq.CfnConfiguration.Builder.create(scope, id)

    override fun authenticationStrategy(authenticationStrategy: String) {
      cdkBuilder.authenticationStrategy(authenticationStrategy)
    }

    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(TagsEntryProperty::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.amazonmq.CfnConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfiguration):
        CfnConfiguration = CfnConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnConfiguration):
        software.amazon.awscdk.services.amazonmq.CfnConfiguration = wrapped.cdkObject
  }

  public interface TagsEntryProperty {
    public fun key(): String

    public fun `value`(): String

    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty,
    ) : TagsEntryProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TagsEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty):
          TagsEntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagsEntryProperty):
          software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
