@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface CfnEIPAssociationProps {
  public fun allocationId(): String? = unwrap(this).getAllocationId()

  @Deprecated(message = "deprecated in CDK")
  public fun eip(): String? = unwrap(this).getEip()

  public fun instanceId(): String? = unwrap(this).getInstanceId()

  public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  @CdkDslMarker
  public interface Builder {
    public fun allocationId(allocationId: String)

    @Deprecated(message = "deprecated in CDK")
    public fun eip(eip: String)

    public fun instanceId(instanceId: String)

    public fun networkInterfaceId(networkInterfaceId: String)

    public fun privateIpAddress(privateIpAddress: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnEIPAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnEIPAssociationProps.builder()

    override fun allocationId(allocationId: String) {
      cdkBuilder.allocationId(allocationId)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun eip(eip: String) {
      cdkBuilder.eip(eip)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnEIPAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnEIPAssociationProps,
  ) : CdkObject(cdkObject), CfnEIPAssociationProps {
    override fun allocationId(): String? = unwrap(this).getAllocationId()

    @Deprecated(message = "deprecated in CDK")
    override fun eip(): String? = unwrap(this).getEip()

    override fun instanceId(): String? = unwrap(this).getInstanceId()

    override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEIPAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEIPAssociationProps):
        CfnEIPAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEIPAssociationProps):
        software.amazon.awscdk.services.ec2.CfnEIPAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnEIPAssociationProps
  }
}
