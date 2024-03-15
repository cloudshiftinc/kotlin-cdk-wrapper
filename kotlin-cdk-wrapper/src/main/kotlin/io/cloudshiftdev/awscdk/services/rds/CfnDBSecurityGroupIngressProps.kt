@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnDBSecurityGroupIngressProps {
  public fun cidrip(): String? = unwrap(this).getCidrip()

  public fun dbSecurityGroupName(): String

  public fun ec2SecurityGroupId(): String? = unwrap(this).getEc2SecurityGroupId()

  public fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

  public fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()

  @CdkDslMarker
  public interface Builder {
    public fun cidrip(cidrip: String)

    public fun dbSecurityGroupName(dbSecurityGroupName: String)

    public fun ec2SecurityGroupId(ec2SecurityGroupId: String)

    public fun ec2SecurityGroupName(ec2SecurityGroupName: String)

    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps.builder()

    override fun cidrip(cidrip: String) {
      cdkBuilder.cidrip(cidrip)
    }

    override fun dbSecurityGroupName(dbSecurityGroupName: String) {
      cdkBuilder.dbSecurityGroupName(dbSecurityGroupName)
    }

    override fun ec2SecurityGroupId(ec2SecurityGroupId: String) {
      cdkBuilder.ec2SecurityGroupId(ec2SecurityGroupId)
    }

    override fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
      cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    override fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
      cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps,
  ) : CdkObject(cdkObject), CfnDBSecurityGroupIngressProps {
    override fun cidrip(): String? = unwrap(this).getCidrip()

    override fun dbSecurityGroupName(): String = unwrap(this).getDbSecurityGroupName()

    override fun ec2SecurityGroupId(): String? = unwrap(this).getEc2SecurityGroupId()

    override fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

    override fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBSecurityGroupIngressProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps):
        CfnDBSecurityGroupIngressProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBSecurityGroupIngressProps):
        software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngressProps
  }
}
