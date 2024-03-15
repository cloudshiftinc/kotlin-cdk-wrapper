@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnNatGatewayProps {
  public fun allocationId(): String? = unwrap(this).getAllocationId()

  public fun connectivityType(): String? = unwrap(this).getConnectivityType()

  public fun maxDrainDurationSeconds(): Number? = unwrap(this).getMaxDrainDurationSeconds()

  public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

  public fun secondaryAllocationIds(): List<String> = unwrap(this).getSecondaryAllocationIds() ?:
      emptyList()

  public fun secondaryPrivateIpAddressCount(): Number? =
      unwrap(this).getSecondaryPrivateIpAddressCount()

  public fun secondaryPrivateIpAddresses(): List<String> =
      unwrap(this).getSecondaryPrivateIpAddresses() ?: emptyList()

  public fun subnetId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun allocationId(allocationId: String)

    public fun connectivityType(connectivityType: String)

    public fun maxDrainDurationSeconds(maxDrainDurationSeconds: Number)

    public fun privateIpAddress(privateIpAddress: String)

    public fun secondaryAllocationIds(secondaryAllocationIds: List<String>)

    public fun secondaryAllocationIds(vararg secondaryAllocationIds: String)

    public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number)

    public fun secondaryPrivateIpAddresses(secondaryPrivateIpAddresses: List<String>)

    public fun secondaryPrivateIpAddresses(vararg secondaryPrivateIpAddresses: String)

    public fun subnetId(subnetId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNatGatewayProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNatGatewayProps.builder()

    override fun allocationId(allocationId: String) {
      cdkBuilder.allocationId(allocationId)
    }

    override fun connectivityType(connectivityType: String) {
      cdkBuilder.connectivityType(connectivityType)
    }

    override fun maxDrainDurationSeconds(maxDrainDurationSeconds: Number) {
      cdkBuilder.maxDrainDurationSeconds(maxDrainDurationSeconds)
    }

    override fun privateIpAddress(privateIpAddress: String) {
      cdkBuilder.privateIpAddress(privateIpAddress)
    }

    override fun secondaryAllocationIds(secondaryAllocationIds: List<String>) {
      cdkBuilder.secondaryAllocationIds(secondaryAllocationIds)
    }

    override fun secondaryAllocationIds(vararg secondaryAllocationIds: String): Unit =
        secondaryAllocationIds(secondaryAllocationIds.toList())

    override fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
      cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
    }

    override fun secondaryPrivateIpAddresses(secondaryPrivateIpAddresses: List<String>) {
      cdkBuilder.secondaryPrivateIpAddresses(secondaryPrivateIpAddresses)
    }

    override fun secondaryPrivateIpAddresses(vararg secondaryPrivateIpAddresses: String): Unit =
        secondaryPrivateIpAddresses(secondaryPrivateIpAddresses.toList())

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNatGatewayProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnNatGatewayProps,
  ) : CdkObject(cdkObject), CfnNatGatewayProps {
    override fun allocationId(): String? = unwrap(this).getAllocationId()

    override fun connectivityType(): String? = unwrap(this).getConnectivityType()

    override fun maxDrainDurationSeconds(): Number? = unwrap(this).getMaxDrainDurationSeconds()

    override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    override fun secondaryAllocationIds(): List<String> = unwrap(this).getSecondaryAllocationIds()
        ?: emptyList()

    override fun secondaryPrivateIpAddressCount(): Number? =
        unwrap(this).getSecondaryPrivateIpAddressCount()

    override fun secondaryPrivateIpAddresses(): List<String> =
        unwrap(this).getSecondaryPrivateIpAddresses() ?: emptyList()

    override fun subnetId(): String = unwrap(this).getSubnetId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNatGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNatGatewayProps):
        CfnNatGatewayProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNatGatewayProps):
        software.amazon.awscdk.services.ec2.CfnNatGatewayProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnNatGatewayProps
  }
}
