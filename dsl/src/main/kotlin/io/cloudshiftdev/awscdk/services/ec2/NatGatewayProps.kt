package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface NatGatewayProps {
  public fun eipAllocationIds(): List<String> = unwrap(this).getEipAllocationIds() ?: emptyList()

  public interface Builder {
    public fun eipAllocationIds(eipAllocationIds: List<String>)

    public fun eipAllocationIds(vararg eipAllocationIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NatGatewayProps.Builder =
        software.amazon.awscdk.services.ec2.NatGatewayProps.builder()

    override fun eipAllocationIds(eipAllocationIds: List<String>) {
      cdkBuilder.eipAllocationIds(eipAllocationIds)
    }

    override fun eipAllocationIds(vararg eipAllocationIds: String): Unit =
        eipAllocationIds(eipAllocationIds.toList())

    public fun build(): software.amazon.awscdk.services.ec2.NatGatewayProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.NatGatewayProps,
  ) : NatGatewayProps {
    override fun eipAllocationIds(): List<String> = unwrap(this).getEipAllocationIds() ?:
        emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NatGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NatGatewayProps):
        NatGatewayProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NatGatewayProps):
        software.amazon.awscdk.services.ec2.NatGatewayProps = (wrapped as Wrapper).cdkObject
  }
}
