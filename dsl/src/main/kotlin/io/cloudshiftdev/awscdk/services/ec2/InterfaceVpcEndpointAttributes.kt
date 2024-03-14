package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface InterfaceVpcEndpointAttributes {
  public fun port(): Number

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun vpcEndpointId(): String

  public interface Builder {
    public fun port(port: Number)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun vpcEndpointId(vpcEndpointId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes.Builder =
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes.builder()

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun vpcEndpointId(vpcEndpointId: String) {
      cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes,
  ) : InterfaceVpcEndpointAttributes {
    override fun port(): Number = unwrap(this).getPort()

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun vpcEndpointId(): String = unwrap(this).getVpcEndpointId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): InterfaceVpcEndpointAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes):
        InterfaceVpcEndpointAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InterfaceVpcEndpointAttributes):
        software.amazon.awscdk.services.ec2.InterfaceVpcEndpointAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
