@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnClusterSecurityGroupIngressProps {
  public fun cidrip(): String? = unwrap(this).getCidrip()

  public fun clusterSecurityGroupName(): String

  public fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

  public fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()

  @CdkDslMarker
  public interface Builder {
    public fun cidrip(cidrip: String)

    public fun clusterSecurityGroupName(clusterSecurityGroupName: String)

    public fun ec2SecurityGroupName(ec2SecurityGroupName: String)

    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.Builder =
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps.builder()

    override fun cidrip(cidrip: String) {
      cdkBuilder.cidrip(cidrip)
    }

    override fun clusterSecurityGroupName(clusterSecurityGroupName: String) {
      cdkBuilder.clusterSecurityGroupName(clusterSecurityGroupName)
    }

    override fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
      cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    override fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
      cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps,
  ) : CdkObject(cdkObject), CfnClusterSecurityGroupIngressProps {
    override fun cidrip(): String? = unwrap(this).getCidrip()

    override fun clusterSecurityGroupName(): String = unwrap(this).getClusterSecurityGroupName()

    override fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

    override fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnClusterSecurityGroupIngressProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps):
        CfnClusterSecurityGroupIngressProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterSecurityGroupIngressProps):
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps
  }
}
