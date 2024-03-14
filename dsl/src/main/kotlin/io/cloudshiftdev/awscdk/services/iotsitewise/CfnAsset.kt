package io.cloudshiftdev.awscdk.services.iotsitewise

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

public open class CfnAsset internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAsset,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun assetDescription(): String? = unwrap(this).getAssetDescription()

  public open fun assetDescription(`value`: String) {
    unwrap(this).setAssetDescription(`value`)
  }

  public open fun assetExternalId(): String? = unwrap(this).getAssetExternalId()

  public open fun assetExternalId(`value`: String) {
    unwrap(this).setAssetExternalId(`value`)
  }

  public open fun assetHierarchies(): Any? = unwrap(this).getAssetHierarchies()

  public open fun assetHierarchies(`value`: IResolvable) {
    unwrap(this).setAssetHierarchies(`value`.let(IResolvable::unwrap))
  }

  public open fun assetHierarchies(__idx_ac66f0: List<Any>) {
    unwrap(this).setAssetHierarchies(__idx_ac66f0)
  }

  public open fun assetModelId(): String = unwrap(this).getAssetModelId()

  public open fun assetModelId(`value`: String) {
    unwrap(this).setAssetModelId(`value`)
  }

  public open fun assetName(): String = unwrap(this).getAssetName()

  public open fun assetName(`value`: String) {
    unwrap(this).setAssetName(`value`)
  }

  public open fun assetProperties(): Any? = unwrap(this).getAssetProperties()

  public open fun assetProperties(`value`: IResolvable) {
    unwrap(this).setAssetProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun assetProperties(__idx_ac66f0: List<Any>) {
    unwrap(this).setAssetProperties(__idx_ac66f0)
  }

  public open fun attrAssetArn(): String = unwrap(this).getAttrAssetArn()

  public open fun attrAssetId(): String = unwrap(this).getAttrAssetId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun assetDescription(assetDescription: String)

    public fun assetExternalId(assetExternalId: String)

    public fun assetHierarchies(assetHierarchies: IResolvable)

    public fun assetHierarchies(assetHierarchies: List<Any>)

    public fun assetModelId(assetModelId: String)

    public fun assetName(assetName: String)

    public fun assetProperties(assetProperties: IResolvable)

    public fun assetProperties(assetProperties: List<Any>)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnAsset.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnAsset.Builder.create(scope, id)

    override fun assetDescription(assetDescription: String) {
      cdkBuilder.assetDescription(assetDescription)
    }

    override fun assetExternalId(assetExternalId: String) {
      cdkBuilder.assetExternalId(assetExternalId)
    }

    override fun assetHierarchies(assetHierarchies: IResolvable) {
      cdkBuilder.assetHierarchies(assetHierarchies.let(IResolvable::unwrap))
    }

    override fun assetHierarchies(assetHierarchies: List<Any>) {
      cdkBuilder.assetHierarchies(assetHierarchies)
    }

    override fun assetModelId(assetModelId: String) {
      cdkBuilder.assetModelId(assetModelId)
    }

    override fun assetName(assetName: String) {
      cdkBuilder.assetName(assetName)
    }

    override fun assetProperties(assetProperties: IResolvable) {
      cdkBuilder.assetProperties(assetProperties.let(IResolvable::unwrap))
    }

    override fun assetProperties(assetProperties: List<Any>) {
      cdkBuilder.assetProperties(assetProperties)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAsset = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAsset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAsset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAsset): CfnAsset =
        CfnAsset(cdkObject)

    internal fun unwrap(wrapped: CfnAsset): software.amazon.awscdk.services.iotsitewise.CfnAsset =
        wrapped.cdkObject
  }

  public interface AssetHierarchyProperty {
    public fun childAssetId(): String

    public fun externalId(): String? = unwrap(this).getExternalId()

    public fun id(): String? = unwrap(this).getId()

    public fun logicalId(): String? = unwrap(this).getLogicalId()

    public interface Builder {
      public fun childAssetId(childAssetId: String)

      public fun externalId(externalId: String)

      public fun id(id: String)

      public fun logicalId(logicalId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty.builder()

      override fun childAssetId(childAssetId: String) {
        cdkBuilder.childAssetId(childAssetId)
      }

      override fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun logicalId(logicalId: String) {
        cdkBuilder.logicalId(logicalId)
      }

      public fun build():
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty,
    ) : AssetHierarchyProperty {
      override fun childAssetId(): String = unwrap(this).getChildAssetId()

      override fun externalId(): String? = unwrap(this).getExternalId()

      override fun id(): String? = unwrap(this).getId()

      override fun logicalId(): String? = unwrap(this).getLogicalId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssetHierarchyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty):
          AssetHierarchyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetHierarchyProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetHierarchyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AssetPropertyProperty {
    public fun alias(): String? = unwrap(this).getAlias()

    public fun externalId(): String? = unwrap(this).getExternalId()

    public fun id(): String? = unwrap(this).getId()

    public fun logicalId(): String? = unwrap(this).getLogicalId()

    public fun notificationState(): String? = unwrap(this).getNotificationState()

    public fun unit(): String? = unwrap(this).getUnit()

    public interface Builder {
      public fun alias(alias: String)

      public fun externalId(externalId: String)

      public fun id(id: String)

      public fun logicalId(logicalId: String)

      public fun notificationState(notificationState: String)

      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty.Builder =
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty.builder()

      override fun alias(alias: String) {
        cdkBuilder.alias(alias)
      }

      override fun externalId(externalId: String) {
        cdkBuilder.externalId(externalId)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun logicalId(logicalId: String) {
        cdkBuilder.logicalId(logicalId)
      }

      override fun notificationState(notificationState: String) {
        cdkBuilder.notificationState(notificationState)
      }

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty,
    ) : AssetPropertyProperty {
      override fun alias(): String? = unwrap(this).getAlias()

      override fun externalId(): String? = unwrap(this).getExternalId()

      override fun id(): String? = unwrap(this).getId()

      override fun logicalId(): String? = unwrap(this).getLogicalId()

      override fun notificationState(): String? = unwrap(this).getNotificationState()

      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssetPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty):
          AssetPropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssetPropertyProperty):
          software.amazon.awscdk.services.iotsitewise.CfnAsset.AssetPropertyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
