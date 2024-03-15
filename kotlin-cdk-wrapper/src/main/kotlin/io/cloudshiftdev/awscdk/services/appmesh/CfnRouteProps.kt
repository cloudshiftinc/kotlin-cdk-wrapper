@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnRouteProps {
  public fun meshName(): String

  public fun meshOwner(): String? = unwrap(this).getMeshOwner()

  public fun routeName(): String? = unwrap(this).getRouteName()

  public fun spec(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun virtualRouterName(): String

  @CdkDslMarker
  public interface Builder {
    public fun meshName(meshName: String)

    public fun meshOwner(meshOwner: String)

    public fun routeName(routeName: String)

    public fun spec(spec: IResolvable)

    public fun spec(spec: CfnRoute.RouteSpecProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1b12af40c8f1b8f945e68d5c27c5aaf074c96033f10b2bb9489f10c91674295")
    public fun spec(spec: CfnRoute.RouteSpecProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun virtualRouterName(virtualRouterName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnRouteProps.Builder =
        software.amazon.awscdk.services.appmesh.CfnRouteProps.builder()

    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    override fun routeName(routeName: String) {
      cdkBuilder.routeName(routeName)
    }

    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    override fun spec(spec: CfnRoute.RouteSpecProperty) {
      cdkBuilder.spec(spec.let(CfnRoute.RouteSpecProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1b12af40c8f1b8f945e68d5c27c5aaf074c96033f10b2bb9489f10c91674295")
    override fun spec(spec: CfnRoute.RouteSpecProperty.Builder.() -> Unit): Unit =
        spec(CfnRoute.RouteSpecProperty(spec))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun virtualRouterName(virtualRouterName: String) {
      cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnRouteProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.CfnRouteProps,
  ) : CdkObject(cdkObject), CfnRouteProps {
    override fun meshName(): String = unwrap(this).getMeshName()

    override fun meshOwner(): String? = unwrap(this).getMeshOwner()

    override fun routeName(): String? = unwrap(this).getRouteName()

    override fun spec(): Any = unwrap(this).getSpec()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun virtualRouterName(): String = unwrap(this).getVirtualRouterName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnRouteProps):
        CfnRouteProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteProps):
        software.amazon.awscdk.services.appmesh.CfnRouteProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.CfnRouteProps
  }
}
