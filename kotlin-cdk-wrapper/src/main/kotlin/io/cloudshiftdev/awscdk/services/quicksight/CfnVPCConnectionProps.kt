@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVPCConnectionProps {
  public fun availabilityStatus(): String? = unwrap(this).getAvailabilityStatus()

  public fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  public fun dnsResolvers(): List<String> = unwrap(this).getDnsResolvers() ?: emptyList()

  public fun name(): String? = unwrap(this).getName()

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcConnectionId(): String? = unwrap(this).getVpcConnectionId()

  @CdkDslMarker
  public interface Builder {
    public fun availabilityStatus(availabilityStatus: String)

    public fun awsAccountId(awsAccountId: String)

    public fun dnsResolvers(dnsResolvers: List<String>)

    public fun dnsResolvers(vararg dnsResolvers: String)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcConnectionId(vpcConnectionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps.Builder
        = software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps.builder()

    override fun availabilityStatus(availabilityStatus: String) {
      cdkBuilder.availabilityStatus(availabilityStatus)
    }

    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    override fun dnsResolvers(dnsResolvers: List<String>) {
      cdkBuilder.dnsResolvers(dnsResolvers)
    }

    override fun dnsResolvers(vararg dnsResolvers: String): Unit =
        dnsResolvers(dnsResolvers.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcConnectionId(vpcConnectionId: String) {
      cdkBuilder.vpcConnectionId(vpcConnectionId)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps,
  ) : CdkObject(cdkObject), CfnVPCConnectionProps {
    override fun availabilityStatus(): String? = unwrap(this).getAvailabilityStatus()

    override fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

    override fun dnsResolvers(): List<String> = unwrap(this).getDnsResolvers() ?: emptyList()

    override fun name(): String? = unwrap(this).getName()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcConnectionId(): String? = unwrap(this).getVpcConnectionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps):
        CfnVPCConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCConnectionProps):
        software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps
  }
}
