@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediaconnect

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnGatewayProps {
  public fun egressCidrBlocks(): List<String>

  public fun name(): String

  public fun networks(): Any

  @CdkDslMarker
  public interface Builder {
    public fun egressCidrBlocks(egressCidrBlocks: List<String>)

    public fun egressCidrBlocks(vararg egressCidrBlocks: String)

    public fun name(name: String)

    public fun networks(networks: IResolvable)

    public fun networks(networks: List<Any>)

    public fun networks(vararg networks: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconnect.CfnGatewayProps.Builder =
        software.amazon.awscdk.services.mediaconnect.CfnGatewayProps.builder()

    override fun egressCidrBlocks(egressCidrBlocks: List<String>) {
      cdkBuilder.egressCidrBlocks(egressCidrBlocks)
    }

    override fun egressCidrBlocks(vararg egressCidrBlocks: String): Unit =
        egressCidrBlocks(egressCidrBlocks.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun networks(networks: IResolvable) {
      cdkBuilder.networks(networks.let(IResolvable::unwrap))
    }

    override fun networks(networks: List<Any>) {
      cdkBuilder.networks(networks)
    }

    override fun networks(vararg networks: Any): Unit = networks(networks.toList())

    public fun build(): software.amazon.awscdk.services.mediaconnect.CfnGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediaconnect.CfnGatewayProps,
  ) : CdkObject(cdkObject), CfnGatewayProps {
    override fun egressCidrBlocks(): List<String> = unwrap(this).getEgressCidrBlocks()

    override fun name(): String = unwrap(this).getName()

    override fun networks(): Any = unwrap(this).getNetworks()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconnect.CfnGatewayProps):
        CfnGatewayProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGatewayProps):
        software.amazon.awscdk.services.mediaconnect.CfnGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediaconnect.CfnGatewayProps
  }
}
