@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDBProxyEndpointProps {
  public fun dbProxyEndpointName(): String

  public fun dbProxyName(): String

  public fun tags(): List<CfnDBProxyEndpoint.TagFormatProperty> =
      unwrap(this).getTags()?.map(CfnDBProxyEndpoint.TagFormatProperty::wrap) ?: emptyList()

  public fun targetRole(): String? = unwrap(this).getTargetRole()

  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  public fun vpcSubnetIds(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun dbProxyEndpointName(dbProxyEndpointName: String)

    public fun dbProxyName(dbProxyName: String)

    public fun tags(tags: List<CfnDBProxyEndpoint.TagFormatProperty>)

    public fun tags(vararg tags: CfnDBProxyEndpoint.TagFormatProperty)

    public fun targetRole(targetRole: String)

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)

    public fun vpcSubnetIds(vpcSubnetIds: List<String>)

    public fun vpcSubnetIds(vararg vpcSubnetIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps.Builder =
        software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps.builder()

    override fun dbProxyEndpointName(dbProxyEndpointName: String) {
      cdkBuilder.dbProxyEndpointName(dbProxyEndpointName)
    }

    override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    override fun tags(tags: List<CfnDBProxyEndpoint.TagFormatProperty>) {
      cdkBuilder.tags(tags.map(CfnDBProxyEndpoint.TagFormatProperty::unwrap))
    }

    override fun tags(vararg tags: CfnDBProxyEndpoint.TagFormatProperty): Unit = tags(tags.toList())

    override fun targetRole(targetRole: String) {
      cdkBuilder.targetRole(targetRole)
    }

    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    override fun vpcSubnetIds(vpcSubnetIds: List<String>) {
      cdkBuilder.vpcSubnetIds(vpcSubnetIds)
    }

    override fun vpcSubnetIds(vararg vpcSubnetIds: String): Unit =
        vpcSubnetIds(vpcSubnetIds.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps,
  ) : CdkObject(cdkObject), CfnDBProxyEndpointProps {
    override fun dbProxyEndpointName(): String = unwrap(this).getDbProxyEndpointName()

    override fun dbProxyName(): String = unwrap(this).getDbProxyName()

    override fun tags(): List<CfnDBProxyEndpoint.TagFormatProperty> =
        unwrap(this).getTags()?.map(CfnDBProxyEndpoint.TagFormatProperty::wrap) ?: emptyList()

    override fun targetRole(): String? = unwrap(this).getTargetRole()

    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()

    override fun vpcSubnetIds(): List<String> = unwrap(this).getVpcSubnetIds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBProxyEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps):
        CfnDBProxyEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBProxyEndpointProps):
        software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps
  }
}
