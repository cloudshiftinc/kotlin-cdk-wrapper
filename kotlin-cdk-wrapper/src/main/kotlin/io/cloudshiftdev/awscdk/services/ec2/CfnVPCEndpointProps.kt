@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVPCEndpointProps {
  public fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

  public fun privateDnsEnabled(): Any? = unwrap(this).getPrivateDnsEnabled()

  public fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds() ?: emptyList()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun serviceName(): String

  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public fun vpcEndpointType(): String? = unwrap(this).getVpcEndpointType()

  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun policyDocument(policyDocument: Any)

    public fun privateDnsEnabled(privateDnsEnabled: Boolean)

    public fun privateDnsEnabled(privateDnsEnabled: IResolvable)

    public fun routeTableIds(routeTableIds: List<String>)

    public fun routeTableIds(vararg routeTableIds: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun serviceName(serviceName: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun vpcEndpointType(vpcEndpointType: String)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCEndpointProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPCEndpointProps.builder()

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun privateDnsEnabled(privateDnsEnabled: Boolean) {
      cdkBuilder.privateDnsEnabled(privateDnsEnabled)
    }

    override fun privateDnsEnabled(privateDnsEnabled: IResolvable) {
      cdkBuilder.privateDnsEnabled(privateDnsEnabled.let(IResolvable::unwrap))
    }

    override fun routeTableIds(routeTableIds: List<String>) {
      cdkBuilder.routeTableIds(routeTableIds)
    }

    override fun routeTableIds(vararg routeTableIds: String): Unit =
        routeTableIds(routeTableIds.toList())

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun vpcEndpointType(vpcEndpointType: String) {
      cdkBuilder.vpcEndpointType(vpcEndpointType)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCEndpointProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointProps,
  ) : CdkObject(cdkObject), CfnVPCEndpointProps {
    override fun policyDocument(): Any? = unwrap(this).getPolicyDocument()

    override fun privateDnsEnabled(): Any? = unwrap(this).getPrivateDnsEnabled()

    override fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds() ?: emptyList()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun serviceName(): String = unwrap(this).getServiceName()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    override fun vpcEndpointType(): String? = unwrap(this).getVpcEndpointType()

    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCEndpointProps):
        CfnVPCEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCEndpointProps):
        software.amazon.awscdk.services.ec2.CfnVPCEndpointProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.CfnVPCEndpointProps
  }
}
