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

public interface CfnAssetModelProps {
  public fun assetModelCompositeModels(): Any? = unwrap(this).getAssetModelCompositeModels()

  public fun assetModelDescription(): String? = unwrap(this).getAssetModelDescription()

  public fun assetModelExternalId(): String? = unwrap(this).getAssetModelExternalId()

  public fun assetModelHierarchies(): Any? = unwrap(this).getAssetModelHierarchies()

  public fun assetModelName(): String

  public fun assetModelProperties(): Any? = unwrap(this).getAssetModelProperties()

  public fun assetModelType(): String? = unwrap(this).getAssetModelType()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun assetModelCompositeModels(assetModelCompositeModels: IResolvable)

    public fun assetModelCompositeModels(assetModelCompositeModels: List<Any>)

    public fun assetModelCompositeModels(vararg assetModelCompositeModels: Any)

    public fun assetModelDescription(assetModelDescription: String)

    public fun assetModelExternalId(assetModelExternalId: String)

    public fun assetModelHierarchies(assetModelHierarchies: IResolvable)

    public fun assetModelHierarchies(assetModelHierarchies: List<Any>)

    public fun assetModelHierarchies(vararg assetModelHierarchies: Any)

    public fun assetModelName(assetModelName: String)

    public fun assetModelProperties(assetModelProperties: IResolvable)

    public fun assetModelProperties(assetModelProperties: List<Any>)

    public fun assetModelProperties(vararg assetModelProperties: Any)

    public fun assetModelType(assetModelType: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps.builder()

    override fun assetModelCompositeModels(assetModelCompositeModels: IResolvable) {
      cdkBuilder.assetModelCompositeModels(assetModelCompositeModels.let(IResolvable::unwrap))
    }

    override fun assetModelCompositeModels(assetModelCompositeModels: List<Any>) {
      cdkBuilder.assetModelCompositeModels(assetModelCompositeModels)
    }

    override fun assetModelCompositeModels(vararg assetModelCompositeModels: Any): Unit =
        assetModelCompositeModels(assetModelCompositeModels.toList())

    override fun assetModelDescription(assetModelDescription: String) {
      cdkBuilder.assetModelDescription(assetModelDescription)
    }

    override fun assetModelExternalId(assetModelExternalId: String) {
      cdkBuilder.assetModelExternalId(assetModelExternalId)
    }

    override fun assetModelHierarchies(assetModelHierarchies: IResolvable) {
      cdkBuilder.assetModelHierarchies(assetModelHierarchies.let(IResolvable::unwrap))
    }

    override fun assetModelHierarchies(assetModelHierarchies: List<Any>) {
      cdkBuilder.assetModelHierarchies(assetModelHierarchies)
    }

    override fun assetModelHierarchies(vararg assetModelHierarchies: Any): Unit =
        assetModelHierarchies(assetModelHierarchies.toList())

    override fun assetModelName(assetModelName: String) {
      cdkBuilder.assetModelName(assetModelName)
    }

    override fun assetModelProperties(assetModelProperties: IResolvable) {
      cdkBuilder.assetModelProperties(assetModelProperties.let(IResolvable::unwrap))
    }

    override fun assetModelProperties(assetModelProperties: List<Any>) {
      cdkBuilder.assetModelProperties(assetModelProperties)
    }

    override fun assetModelProperties(vararg assetModelProperties: Any): Unit =
        assetModelProperties(assetModelProperties.toList())

    override fun assetModelType(assetModelType: String) {
      cdkBuilder.assetModelType(assetModelType)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps,
  ) : CdkObject(cdkObject), CfnAssetModelProps {
    override fun assetModelCompositeModels(): Any? = unwrap(this).getAssetModelCompositeModels()

    override fun assetModelDescription(): String? = unwrap(this).getAssetModelDescription()

    override fun assetModelExternalId(): String? = unwrap(this).getAssetModelExternalId()

    override fun assetModelHierarchies(): Any? = unwrap(this).getAssetModelHierarchies()

    override fun assetModelName(): String = unwrap(this).getAssetModelName()

    override fun assetModelProperties(): Any? = unwrap(this).getAssetModelProperties()

    override fun assetModelType(): String? = unwrap(this).getAssetModelType()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssetModelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps):
        CfnAssetModelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssetModelProps):
        software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotsitewise.CfnAssetModelProps
  }
}
