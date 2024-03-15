@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAssetProps {
  public fun assetDescription(): String? = unwrap(this).getAssetDescription()

  public fun assetExternalId(): String? = unwrap(this).getAssetExternalId()

  public fun assetHierarchies(): Any? = unwrap(this).getAssetHierarchies()

  public fun assetModelId(): String

  public fun assetName(): String

  public fun assetProperties(): Any? = unwrap(this).getAssetProperties()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun assetDescription(assetDescription: String)

    public fun assetExternalId(assetExternalId: String)

    public fun assetHierarchies(assetHierarchies: IResolvable)

    public fun assetHierarchies(assetHierarchies: List<Any>)

    public fun assetHierarchies(vararg assetHierarchies: Any)

    public fun assetModelId(assetModelId: String)

    public fun assetName(assetName: String)

    public fun assetProperties(assetProperties: IResolvable)

    public fun assetProperties(assetProperties: List<Any>)

    public fun assetProperties(vararg assetProperties: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnAssetProps.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnAssetProps.builder()

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

    override fun assetHierarchies(vararg assetHierarchies: Any): Unit =
        assetHierarchies(assetHierarchies.toList())

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

    override fun assetProperties(vararg assetProperties: Any): Unit =
        assetProperties(assetProperties.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAssetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetProps,
  ) : CdkObject(cdkObject), CfnAssetProps {
    override fun assetDescription(): String? = unwrap(this).getAssetDescription()

    override fun assetExternalId(): String? = unwrap(this).getAssetExternalId()

    override fun assetHierarchies(): Any? = unwrap(this).getAssetHierarchies()

    override fun assetModelId(): String = unwrap(this).getAssetModelId()

    override fun assetName(): String = unwrap(this).getAssetName()

    override fun assetProperties(): Any? = unwrap(this).getAssetProperties()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetProps):
        CfnAssetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssetProps):
        software.amazon.awscdk.services.iotsitewise.CfnAssetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iotsitewise.CfnAssetProps
  }
}
