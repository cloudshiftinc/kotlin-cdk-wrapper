@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface SecurityGroupProps {
  public fun allowAllIpv6Outbound(): Boolean? = unwrap(this).getAllowAllIpv6Outbound()

  public fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

  public fun description(): String? = unwrap(this).getDescription()

  public fun disableInlineRules(): Boolean? = unwrap(this).getDisableInlineRules()

  public fun securityGroupName(): String? = unwrap(this).getSecurityGroupName()

  public fun vpc(): IVpc

  @CdkDslMarker
  public interface Builder {
    public fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean)

    public fun allowAllOutbound(allowAllOutbound: Boolean)

    public fun description(description: String)

    public fun disableInlineRules(disableInlineRules: Boolean)

    public fun securityGroupName(securityGroupName: String)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SecurityGroupProps.Builder =
        software.amazon.awscdk.services.ec2.SecurityGroupProps.builder()

    override fun allowAllIpv6Outbound(allowAllIpv6Outbound: Boolean) {
      cdkBuilder.allowAllIpv6Outbound(allowAllIpv6Outbound)
    }

    override fun allowAllOutbound(allowAllOutbound: Boolean) {
      cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun disableInlineRules(disableInlineRules: Boolean) {
      cdkBuilder.disableInlineRules(disableInlineRules)
    }

    override fun securityGroupName(securityGroupName: String) {
      cdkBuilder.securityGroupName(securityGroupName)
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.SecurityGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.SecurityGroupProps,
  ) : CdkObject(cdkObject), SecurityGroupProps {
    override fun allowAllIpv6Outbound(): Boolean? = unwrap(this).getAllowAllIpv6Outbound()

    override fun allowAllOutbound(): Boolean? = unwrap(this).getAllowAllOutbound()

    override fun description(): String? = unwrap(this).getDescription()

    override fun disableInlineRules(): Boolean? = unwrap(this).getDisableInlineRules()

    override fun securityGroupName(): String? = unwrap(this).getSecurityGroupName()

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecurityGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SecurityGroupProps):
        SecurityGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecurityGroupProps):
        software.amazon.awscdk.services.ec2.SecurityGroupProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.SecurityGroupProps
  }
}
