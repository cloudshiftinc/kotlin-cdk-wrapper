@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEndpointAuthorizationProps {
  public fun account(): String

  public fun clusterIdentifier(): String

  public fun force(): Any? = unwrap(this).getForce()

  public fun vpcIds(): List<String> = unwrap(this).getVpcIds() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun clusterIdentifier(clusterIdentifier: String)

    public fun force(force: Boolean)

    public fun force(force: IResolvable)

    public fun vpcIds(vpcIds: List<String>)

    public fun vpcIds(vararg vpcIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps.Builder =
        software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    override fun force(force: Boolean) {
      cdkBuilder.force(force)
    }

    override fun force(force: IResolvable) {
      cdkBuilder.force(force.let(IResolvable::unwrap))
    }

    override fun vpcIds(vpcIds: List<String>) {
      cdkBuilder.vpcIds(vpcIds)
    }

    override fun vpcIds(vararg vpcIds: String): Unit = vpcIds(vpcIds.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps,
  ) : CdkObject(cdkObject), CfnEndpointAuthorizationProps {
    override fun account(): String = unwrap(this).getAccount()

    override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

    override fun force(): Any? = unwrap(this).getForce()

    override fun vpcIds(): List<String> = unwrap(this).getVpcIds() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEndpointAuthorizationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps):
        CfnEndpointAuthorizationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEndpointAuthorizationProps):
        software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.redshift.CfnEndpointAuthorizationProps
  }
}
