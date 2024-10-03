@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface SecurityGroupContextQuery : ContextLookupRoleOptions {
  public fun securityGroupId(): String? = unwrap(this).getSecurityGroupId()

  public fun securityGroupName(): String? = unwrap(this).getSecurityGroupName()

  public fun vpcId(): String? = unwrap(this).getVpcId()

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    public fun lookupRoleArn(lookupRoleArn: String)

    public fun lookupRoleExternalId(lookupRoleExternalId: String)

    public fun region(region: String)

    public fun securityGroupId(securityGroupId: String)

    public fun securityGroupName(securityGroupName: String)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    override fun lookupRoleExternalId(lookupRoleExternalId: String) {
      cdkBuilder.lookupRoleExternalId(lookupRoleExternalId)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun securityGroupId(securityGroupId: String) {
      cdkBuilder.securityGroupId(securityGroupId)
    }

    override fun securityGroupName(securityGroupName: String) {
      cdkBuilder.securityGroupName(securityGroupName)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery,
  ) : CdkObject(cdkObject),
      SecurityGroupContextQuery {
    override fun account(): String = unwrap(this).getAccount()

    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    override fun lookupRoleExternalId(): String? = unwrap(this).getLookupRoleExternalId()

    override fun region(): String = unwrap(this).getRegion()

    override fun securityGroupId(): String? = unwrap(this).getSecurityGroupId()

    override fun securityGroupName(): String? = unwrap(this).getSecurityGroupName()

    override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecurityGroupContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery):
        SecurityGroupContextQuery = CdkObjectWrappers.wrap(cdkObject) as? SecurityGroupContextQuery
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecurityGroupContextQuery):
        software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.cloudassembly.schema.SecurityGroupContextQuery
  }
}
