@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnSecurityGroupEgressProps {
  public fun cidrIp(): String? = unwrap(this).getCidrIp()

  public fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

  public fun description(): String? = unwrap(this).getDescription()

  public fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

  public fun destinationSecurityGroupId(): String? = unwrap(this).getDestinationSecurityGroupId()

  public fun fromPort(): Number? = unwrap(this).getFromPort()

  public fun groupId(): String

  public fun ipProtocol(): String

  public fun toPort(): Number? = unwrap(this).getToPort()

  @CdkDslMarker
  public interface Builder {
    public fun cidrIp(cidrIp: String)

    public fun cidrIpv6(cidrIpv6: String)

    public fun description(description: String)

    public fun destinationPrefixListId(destinationPrefixListId: String)

    public fun destinationSecurityGroupId(destinationSecurityGroupId: String)

    public fun fromPort(fromPort: Number)

    public fun groupId(groupId: String)

    public fun ipProtocol(ipProtocol: String)

    public fun toPort(toPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps.Builder
        = software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps.builder()

    override fun cidrIp(cidrIp: String) {
      cdkBuilder.cidrIp(cidrIp)
    }

    override fun cidrIpv6(cidrIpv6: String) {
      cdkBuilder.cidrIpv6(cidrIpv6)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun destinationPrefixListId(destinationPrefixListId: String) {
      cdkBuilder.destinationPrefixListId(destinationPrefixListId)
    }

    override fun destinationSecurityGroupId(destinationSecurityGroupId: String) {
      cdkBuilder.destinationSecurityGroupId(destinationSecurityGroupId)
    }

    override fun fromPort(fromPort: Number) {
      cdkBuilder.fromPort(fromPort)
    }

    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    override fun ipProtocol(ipProtocol: String) {
      cdkBuilder.ipProtocol(ipProtocol)
    }

    override fun toPort(toPort: Number) {
      cdkBuilder.toPort(toPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps,
  ) : CdkObject(cdkObject), CfnSecurityGroupEgressProps {
    override fun cidrIp(): String? = unwrap(this).getCidrIp()

    override fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

    override fun description(): String? = unwrap(this).getDescription()

    override fun destinationPrefixListId(): String? = unwrap(this).getDestinationPrefixListId()

    override fun destinationSecurityGroupId(): String? =
        unwrap(this).getDestinationSecurityGroupId()

    override fun fromPort(): Number? = unwrap(this).getFromPort()

    override fun groupId(): String = unwrap(this).getGroupId()

    override fun ipProtocol(): String = unwrap(this).getIpProtocol()

    override fun toPort(): Number? = unwrap(this).getToPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityGroupEgressProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps):
        CfnSecurityGroupEgressProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupEgressProps):
        software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps
  }
}
