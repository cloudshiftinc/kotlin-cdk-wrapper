@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface VpcContextQuery {
  public fun account(): String

  public fun filter(): Map<String, String>

  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  public fun region(): String

  public fun returnAsymmetricSubnets(): Boolean? = unwrap(this).getReturnAsymmetricSubnets()

  public fun returnVpnGateways(): Boolean? = unwrap(this).getReturnVpnGateways()

  public fun subnetGroupNameTag(): String? = unwrap(this).getSubnetGroupNameTag()

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun filter(filter: Map<String, String>)

    public fun lookupRoleArn(lookupRoleArn: String)

    public fun region(region: String)

    public fun returnAsymmetricSubnets(returnAsymmetricSubnets: Boolean)

    public fun returnVpnGateways(returnVpnGateways: Boolean)

    public fun subnetGroupNameTag(subnetGroupNameTag: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.VpcContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.VpcContextQuery.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun filter(filter: Map<String, String>) {
      cdkBuilder.filter(filter)
    }

    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun returnAsymmetricSubnets(returnAsymmetricSubnets: Boolean) {
      cdkBuilder.returnAsymmetricSubnets(returnAsymmetricSubnets)
    }

    override fun returnVpnGateways(returnVpnGateways: Boolean) {
      cdkBuilder.returnVpnGateways(returnVpnGateways)
    }

    override fun subnetGroupNameTag(subnetGroupNameTag: String) {
      cdkBuilder.subnetGroupNameTag(subnetGroupNameTag)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.VpcContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.VpcContextQuery,
  ) : CdkObject(cdkObject), VpcContextQuery {
    override fun account(): String = unwrap(this).getAccount()

    override fun filter(): Map<String, String> = unwrap(this).getFilter() ?: emptyMap()

    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    override fun region(): String = unwrap(this).getRegion()

    override fun returnAsymmetricSubnets(): Boolean? = unwrap(this).getReturnAsymmetricSubnets()

    override fun returnVpnGateways(): Boolean? = unwrap(this).getReturnVpnGateways()

    override fun subnetGroupNameTag(): String? = unwrap(this).getSubnetGroupNameTag()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.VpcContextQuery):
        VpcContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcContextQuery):
        software.amazon.awscdk.cloudassembly.schema.VpcContextQuery = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.VpcContextQuery
  }
}
