@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAssetProps {
  public fun egressEndpoints(): Any? = unwrap(this).getEgressEndpoints()

  public fun id(): String

  public fun packagingGroupId(): String

  public fun resourceId(): String? = unwrap(this).getResourceId()

  public fun sourceArn(): String

  public fun sourceRoleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun egressEndpoints(egressEndpoints: IResolvable)

    public fun egressEndpoints(egressEndpoints: List<Any>)

    public fun egressEndpoints(vararg egressEndpoints: Any)

    public fun id(id: String)

    public fun packagingGroupId(packagingGroupId: String)

    public fun resourceId(resourceId: String)

    public fun sourceArn(sourceArn: String)

    public fun sourceRoleArn(sourceRoleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackage.CfnAssetProps.Builder =
        software.amazon.awscdk.services.mediapackage.CfnAssetProps.builder()

    override fun egressEndpoints(egressEndpoints: IResolvable) {
      cdkBuilder.egressEndpoints(egressEndpoints.let(IResolvable::unwrap))
    }

    override fun egressEndpoints(egressEndpoints: List<Any>) {
      cdkBuilder.egressEndpoints(egressEndpoints)
    }

    override fun egressEndpoints(vararg egressEndpoints: Any): Unit =
        egressEndpoints(egressEndpoints.toList())

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun packagingGroupId(packagingGroupId: String) {
      cdkBuilder.packagingGroupId(packagingGroupId)
    }

    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    override fun sourceRoleArn(sourceRoleArn: String) {
      cdkBuilder.sourceRoleArn(sourceRoleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnAssetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediapackage.CfnAssetProps,
  ) : CdkObject(cdkObject), CfnAssetProps {
    override fun egressEndpoints(): Any? = unwrap(this).getEgressEndpoints()

    override fun id(): String = unwrap(this).getId()

    override fun packagingGroupId(): String = unwrap(this).getPackagingGroupId()

    override fun resourceId(): String? = unwrap(this).getResourceId()

    override fun sourceArn(): String = unwrap(this).getSourceArn()

    override fun sourceRoleArn(): String = unwrap(this).getSourceRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnAssetProps):
        CfnAssetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssetProps):
        software.amazon.awscdk.services.mediapackage.CfnAssetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediapackage.CfnAssetProps
  }
}
