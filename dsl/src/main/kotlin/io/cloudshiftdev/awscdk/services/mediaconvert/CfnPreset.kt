package io.cloudshiftdev.awscdk.services.mediaconvert

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPreset internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediaconvert.CfnPreset,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun category(): String? = unwrap(this).getCategory()

  public open fun category(`value`: String) {
    unwrap(this).setCategory(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun settingsJson(): Any = unwrap(this).getSettingsJson()

  public open fun settingsJson(`value`: Any) {
    unwrap(this).setSettingsJson(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun category(category: String)

    public fun description(description: String)

    public fun name(name: String)

    public fun tags(tags: Any)

    public fun tingsJson(settingsJson: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconvert.CfnPreset.Builder =
        software.amazon.awscdk.services.mediaconvert.CfnPreset.Builder.create(scope, id)

    override fun category(category: String) {
      cdkBuilder.category(category)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun tingsJson(settingsJson: Any) {
      cdkBuilder.settingsJson(settingsJson)
    }

    public fun build(): software.amazon.awscdk.services.mediaconvert.CfnPreset = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPreset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPreset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconvert.CfnPreset): CfnPreset
        = CfnPreset(cdkObject)

    internal fun unwrap(wrapped: CfnPreset): software.amazon.awscdk.services.mediaconvert.CfnPreset
        = wrapped.cdkObject
  }
}
