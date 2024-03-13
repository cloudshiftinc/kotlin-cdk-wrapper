package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.String
import kotlin.Unit

public interface SecurityGroupContextQuery {
  public fun account(): String

  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  public fun region(): String

  public fun securityGroupId(): String? = unwrap(this).getSecurityGroupId()

  public fun securityGroupName(): String? = unwrap(this).getSecurityGroupName()

  public fun vpcId(): String? = unwrap(this).getVpcId()

  public interface Builder {
    public fun account(account: String) {
    }

    public fun lookupRoleArn(lookupRoleArn: String) {
    }

    public fun region(region: String) {
    }

    public fun securityGroupId(securityGroupId: String) {
    }

    public fun securityGroupName(securityGroupName: String) {
    }

    public fun vpcId(vpcId: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery.builder()

    public override fun account(account: String) {
      cdkBuilder.account(account)
    }

    public override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public override fun securityGroupId(securityGroupId: String) {
      cdkBuilder.securityGroupId(securityGroupId)
    }

    public override fun securityGroupName(securityGroupName: String) {
      cdkBuilder.securityGroupName(securityGroupName)
    }

    public override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery,
  ) : SecurityGroupContextQuery {
    public override fun account(): String = unwrap(this).getAccount()

    public override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    public override fun region(): String = unwrap(this).getRegion()

    public override fun securityGroupId(): String? = unwrap(this).getSecurityGroupId()

    public override fun securityGroupName(): String? = unwrap(this).getSecurityGroupName()

    public override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SecurityGroupContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery):
        SecurityGroupContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecurityGroupContextQuery):
        software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery = (wrapped as
        Wrapper).cdkObject
  }
}
