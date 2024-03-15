@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEndpointAccessProps {
  public fun clusterIdentifier(): String

  public fun endpointName(): String

  public fun resourceOwner(): String? = unwrap(this).getResourceOwner()

  public fun subnetGroupName(): String

  public fun vpcSecurityGroupIds(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun clusterIdentifier(clusterIdentifier: String)

    public fun endpointName(endpointName: String)

    public fun resourceOwner(resourceOwner: String)

    public fun subnetGroupName(subnetGroupName: String)

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnEndpointAccessProps.Builder
        = software.amazon.awscdk.services.redshift.CfnEndpointAccessProps.builder()

    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    override fun endpointName(endpointName: String) {
      cdkBuilder.endpointName(endpointName)
    }

    override fun resourceOwner(resourceOwner: String) {
      cdkBuilder.resourceOwner(resourceOwner)
    }

    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnEndpointAccessProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAccessProps,
  ) : CdkObject(cdkObject), CfnEndpointAccessProps {
    override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

    override fun endpointName(): String = unwrap(this).getEndpointName()

    override fun resourceOwner(): String? = unwrap(this).getResourceOwner()

    override fun subnetGroupName(): String = unwrap(this).getSubnetGroupName()

    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointAccessProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAccessProps):
        CfnEndpointAccessProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointAccessProps):
        software.amazon.awscdk.services.redshift.CfnEndpointAccessProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.redshift.CfnEndpointAccessProps
  }
}
