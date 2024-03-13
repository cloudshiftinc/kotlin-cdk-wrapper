package io.cloudshiftdev.awscdk.cloudassembly.schema

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

  public interface Builder {
    public fun account(account: String) {
    }

    public fun filter(filter: Map<String, String>) {
    }

    public fun lookupRoleArn(lookupRoleArn: String) {
    }

    public fun region(region: String) {
    }

    public fun returnAsymmetricSubnets(returnAsymmetricSubnets: Boolean) {
    }

    public fun returnVpnGateways(returnVpnGateways: Boolean) {
    }

    public fun subnetGroupNameTag(subnetGroupNameTag: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.VpcContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.VpcContextQuery.builder()

    public override fun account(account: String) {
      cdkBuilder.account(account)
    }

    public override fun filter(filter: Map<String, String>) {
      cdkBuilder.filter(filter)
    }

    public override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public override fun returnAsymmetricSubnets(returnAsymmetricSubnets: Boolean) {
      cdkBuilder.returnAsymmetricSubnets(returnAsymmetricSubnets)
    }

    public override fun returnVpnGateways(returnVpnGateways: Boolean) {
      cdkBuilder.returnVpnGateways(returnVpnGateways)
    }

    public override fun subnetGroupNameTag(subnetGroupNameTag: String) {
      cdkBuilder.subnetGroupNameTag(subnetGroupNameTag)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.VpcContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.VpcContextQuery,
  ) : VpcContextQuery {
    public override fun account(): String = unwrap(this).getAccount()

    public override fun filter(): Map<String, String> = unwrap(this).getFilter() ?: emptyMap()

    public override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    public override fun region(): String = unwrap(this).getRegion()

    public override fun returnAsymmetricSubnets(): Boolean? =
        unwrap(this).getReturnAsymmetricSubnets()

    public override fun returnVpnGateways(): Boolean? = unwrap(this).getReturnVpnGateways()

    public override fun subnetGroupNameTag(): String? = unwrap(this).getSubnetGroupNameTag()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VpcContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.VpcContextQuery):
        VpcContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcContextQuery):
        software.amazon.awscdk.cloudassembly.schema.VpcContextQuery = (wrapped as Wrapper).cdkObject
  }
}
