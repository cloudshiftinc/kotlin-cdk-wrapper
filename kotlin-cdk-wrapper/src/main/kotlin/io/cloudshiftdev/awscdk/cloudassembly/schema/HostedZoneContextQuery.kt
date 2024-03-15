@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface HostedZoneContextQuery {
  public fun account(): String

  public fun domainName(): String

  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  public fun privateZone(): Boolean? = unwrap(this).getPrivateZone()

  public fun region(): String

  public fun vpcId(): String? = unwrap(this).getVpcId()

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun domainName(domainName: String)

    public fun lookupRoleArn(lookupRoleArn: String)

    public fun privateZone(privateZone: Boolean)

    public fun region(region: String)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    override fun privateZone(privateZone: Boolean) {
      cdkBuilder.privateZone(privateZone)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery,
  ) : CdkObject(cdkObject), HostedZoneContextQuery {
    override fun account(): String = unwrap(this).getAccount()

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    override fun privateZone(): Boolean? = unwrap(this).getPrivateZone()

    override fun region(): String = unwrap(this).getRegion()

    override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HostedZoneContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery):
        HostedZoneContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostedZoneContextQuery):
        software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.HostedZoneContextQuery
  }
}
