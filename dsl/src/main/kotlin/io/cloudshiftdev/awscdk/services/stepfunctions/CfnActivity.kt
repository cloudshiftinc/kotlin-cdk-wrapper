package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnActivity internal constructor(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivity,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrName(): String = unwrap(this).getAttrName()

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
    public fun name(name: String)

    public fun tags(tags: List<TagsEntryProperty>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.CfnActivity.Builder =
        software.amazon.awscdk.services.stepfunctions.CfnActivity.Builder.create(scope, id)

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(TagsEntryProperty::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.CfnActivity =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnActivity {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnActivity(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivity):
        CfnActivity = CfnActivity(cdkObject)

    internal fun unwrap(wrapped: CfnActivity):
        software.amazon.awscdk.services.stepfunctions.CfnActivity = wrapped.cdkObject
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
          software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty.Builder =
          software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty):
          TagsEntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagsEntryProperty):
          software.amazon.awscdk.services.stepfunctions.CfnActivity.TagsEntryProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
