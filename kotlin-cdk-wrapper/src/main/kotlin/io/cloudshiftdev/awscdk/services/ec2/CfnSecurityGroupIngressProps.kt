@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnSecurityGroupIngressProps {
  public fun cidrIp(): String? = unwrap(this).getCidrIp()

  public fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

  public fun description(): String? = unwrap(this).getDescription()

  public fun fromPort(): Number? = unwrap(this).getFromPort()

  public fun groupId(): String? = unwrap(this).getGroupId()

  public fun groupName(): String? = unwrap(this).getGroupName()

  public fun ipProtocol(): String

  public fun sourcePrefixListId(): String? = unwrap(this).getSourcePrefixListId()

  public fun sourceSecurityGroupId(): String? = unwrap(this).getSourceSecurityGroupId()

  public fun sourceSecurityGroupName(): String? = unwrap(this).getSourceSecurityGroupName()

  public fun sourceSecurityGroupOwnerId(): String? = unwrap(this).getSourceSecurityGroupOwnerId()

  public fun toPort(): Number? = unwrap(this).getToPort()

  @CdkDslMarker
  public interface Builder {
    public fun cidrIp(cidrIp: String)

    public fun cidrIpv6(cidrIpv6: String)

    public fun description(description: String)

    public fun fromPort(fromPort: Number)

    public fun groupId(groupId: String)

    public fun groupName(groupName: String)

    public fun ipProtocol(ipProtocol: String)

    public fun sourcePrefixListId(sourcePrefixListId: String)

    public fun sourceSecurityGroupId(sourceSecurityGroupId: String)

    public fun sourceSecurityGroupName(sourceSecurityGroupName: String)

    public fun sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId: String)

    public fun toPort(toPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps.Builder
        = software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps.builder()

    override fun cidrIp(cidrIp: String) {
      cdkBuilder.cidrIp(cidrIp)
    }

    override fun cidrIpv6(cidrIpv6: String) {
      cdkBuilder.cidrIpv6(cidrIpv6)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun fromPort(fromPort: Number) {
      cdkBuilder.fromPort(fromPort)
    }

    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun ipProtocol(ipProtocol: String) {
      cdkBuilder.ipProtocol(ipProtocol)
    }

    override fun sourcePrefixListId(sourcePrefixListId: String) {
      cdkBuilder.sourcePrefixListId(sourcePrefixListId)
    }

    override fun sourceSecurityGroupId(sourceSecurityGroupId: String) {
      cdkBuilder.sourceSecurityGroupId(sourceSecurityGroupId)
    }

    override fun sourceSecurityGroupName(sourceSecurityGroupName: String) {
      cdkBuilder.sourceSecurityGroupName(sourceSecurityGroupName)
    }

    override fun sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId: String) {
      cdkBuilder.sourceSecurityGroupOwnerId(sourceSecurityGroupOwnerId)
    }

    override fun toPort(toPort: Number) {
      cdkBuilder.toPort(toPort)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps,
  ) : CdkObject(cdkObject), CfnSecurityGroupIngressProps {
    override fun cidrIp(): String? = unwrap(this).getCidrIp()

    override fun cidrIpv6(): String? = unwrap(this).getCidrIpv6()

    override fun description(): String? = unwrap(this).getDescription()

    override fun fromPort(): Number? = unwrap(this).getFromPort()

    override fun groupId(): String? = unwrap(this).getGroupId()

    override fun groupName(): String? = unwrap(this).getGroupName()

    override fun ipProtocol(): String = unwrap(this).getIpProtocol()

    override fun sourcePrefixListId(): String? = unwrap(this).getSourcePrefixListId()

    override fun sourceSecurityGroupId(): String? = unwrap(this).getSourceSecurityGroupId()

    override fun sourceSecurityGroupName(): String? = unwrap(this).getSourceSecurityGroupName()

    override fun sourceSecurityGroupOwnerId(): String? =
        unwrap(this).getSourceSecurityGroupOwnerId()

    override fun toPort(): Number? = unwrap(this).getToPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityGroupIngressProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps):
        CfnSecurityGroupIngressProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupIngressProps):
        software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnSecurityGroupIngressProps
  }
}
