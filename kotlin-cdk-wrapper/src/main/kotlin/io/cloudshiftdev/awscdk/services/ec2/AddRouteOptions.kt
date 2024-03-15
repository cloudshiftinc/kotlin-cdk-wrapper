@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface AddRouteOptions {
  public fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

  public fun destinationIpv6CidrBlock(): String? = unwrap(this).getDestinationIpv6CidrBlock()

  public fun enablesInternetConnectivity(): Boolean? = unwrap(this).getEnablesInternetConnectivity()

  public fun routerId(): String

  public fun routerType(): RouterType

  @CdkDslMarker
  public interface Builder {
    public fun destinationCidrBlock(destinationCidrBlock: String)

    public fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String)

    public fun enablesInternetConnectivity(enablesInternetConnectivity: Boolean)

    public fun routerId(routerId: String)

    public fun routerType(routerType: RouterType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AddRouteOptions.Builder =
        software.amazon.awscdk.services.ec2.AddRouteOptions.builder()

    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    override fun destinationIpv6CidrBlock(destinationIpv6CidrBlock: String) {
      cdkBuilder.destinationIpv6CidrBlock(destinationIpv6CidrBlock)
    }

    override fun enablesInternetConnectivity(enablesInternetConnectivity: Boolean) {
      cdkBuilder.enablesInternetConnectivity(enablesInternetConnectivity)
    }

    override fun routerId(routerId: String) {
      cdkBuilder.routerId(routerId)
    }

    override fun routerType(routerType: RouterType) {
      cdkBuilder.routerType(routerType.let(RouterType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.AddRouteOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AddRouteOptions,
  ) : CdkObject(cdkObject), AddRouteOptions {
    override fun destinationCidrBlock(): String? = unwrap(this).getDestinationCidrBlock()

    override fun destinationIpv6CidrBlock(): String? = unwrap(this).getDestinationIpv6CidrBlock()

    override fun enablesInternetConnectivity(): Boolean? =
        unwrap(this).getEnablesInternetConnectivity()

    override fun routerId(): String = unwrap(this).getRouterId()

    override fun routerType(): RouterType = unwrap(this).getRouterType().let(RouterType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AddRouteOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AddRouteOptions):
        AddRouteOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddRouteOptions):
        software.amazon.awscdk.services.ec2.AddRouteOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.AddRouteOptions
  }
}
