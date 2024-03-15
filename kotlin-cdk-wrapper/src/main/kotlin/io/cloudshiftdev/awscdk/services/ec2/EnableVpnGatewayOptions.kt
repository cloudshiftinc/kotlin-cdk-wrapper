@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface EnableVpnGatewayOptions : VpnGatewayProps {
  public fun vpnRoutePropagation(): List<SubnetSelection> =
      unwrap(this).getVpnRoutePropagation()?.map(SubnetSelection::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun amazonSideAsn(amazonSideAsn: Number)

    public fun type(type: String)

    public fun vpnRoutePropagation(vpnRoutePropagation: List<SubnetSelection>)

    public fun vpnRoutePropagation(vararg vpnRoutePropagation: SubnetSelection)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions.Builder =
        software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions.builder()

    override fun amazonSideAsn(amazonSideAsn: Number) {
      cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun vpnRoutePropagation(vpnRoutePropagation: List<SubnetSelection>) {
      cdkBuilder.vpnRoutePropagation(vpnRoutePropagation.map(SubnetSelection::unwrap))
    }

    override fun vpnRoutePropagation(vararg vpnRoutePropagation: SubnetSelection): Unit =
        vpnRoutePropagation(vpnRoutePropagation.toList())

    public fun build(): software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions,
  ) : CdkObject(cdkObject), EnableVpnGatewayOptions {
    override fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

    override fun type(): String = unwrap(this).getType()

    override fun vpnRoutePropagation(): List<SubnetSelection> =
        unwrap(this).getVpnRoutePropagation()?.map(SubnetSelection::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EnableVpnGatewayOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions):
        EnableVpnGatewayOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnableVpnGatewayOptions):
        software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.EnableVpnGatewayOptions
  }
}
