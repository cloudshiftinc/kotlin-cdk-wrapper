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

public interface CfnGatewayRouteProps {
  public fun gatewayRouteName(): String? = unwrap(this).getGatewayRouteName()

  public fun meshName(): String

  public fun meshOwner(): String? = unwrap(this).getMeshOwner()

  public fun spec(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun virtualGatewayName(): String

  @CdkDslMarker
  public interface Builder {
    public fun gatewayRouteName(gatewayRouteName: String)

    public fun meshName(meshName: String)

    public fun meshOwner(meshOwner: String)

    public fun spec(spec: IResolvable)

    public fun spec(spec: CfnGatewayRoute.GatewayRouteSpecProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8da30807f8dadb75945a17bec105643ee3428cf45f74eda39e826940fb7f993e")
    public fun spec(spec: CfnGatewayRoute.GatewayRouteSpecProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun virtualGatewayName(virtualGatewayName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps.Builder =
        software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps.builder()

    override fun gatewayRouteName(gatewayRouteName: String) {
      cdkBuilder.gatewayRouteName(gatewayRouteName)
    }

    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    override fun spec(spec: CfnGatewayRoute.GatewayRouteSpecProperty) {
      cdkBuilder.spec(spec.let(CfnGatewayRoute.GatewayRouteSpecProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8da30807f8dadb75945a17bec105643ee3428cf45f74eda39e826940fb7f993e")
    override fun spec(spec: CfnGatewayRoute.GatewayRouteSpecProperty.Builder.() -> Unit): Unit =
        spec(CfnGatewayRoute.GatewayRouteSpecProperty(spec))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun virtualGatewayName(virtualGatewayName: String) {
      cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps,
  ) : CdkObject(cdkObject), CfnGatewayRouteProps {
    override fun gatewayRouteName(): String? = unwrap(this).getGatewayRouteName()

    override fun meshName(): String = unwrap(this).getMeshName()

    override fun meshOwner(): String? = unwrap(this).getMeshOwner()

    override fun spec(): Any = unwrap(this).getSpec()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun virtualGatewayName(): String = unwrap(this).getVirtualGatewayName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGatewayRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps):
        CfnGatewayRouteProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGatewayRouteProps):
        software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.CfnGatewayRouteProps
  }
}
