@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnSecurityGroupIngressProps {
  public fun cacheSecurityGroupName(): String

  public fun ec2SecurityGroupName(): String

  public fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()

  @CdkDslMarker
  public interface Builder {
    public fun cacheSecurityGroupName(cacheSecurityGroupName: String)

    public fun ec2SecurityGroupName(ec2SecurityGroupName: String)

    public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps.Builder =
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps.builder()

    override fun cacheSecurityGroupName(cacheSecurityGroupName: String) {
      cdkBuilder.cacheSecurityGroupName(cacheSecurityGroupName)
    }

    override fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
      cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
    }

    override fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
      cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
    }

    public fun build(): software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps,
  ) : CdkObject(cdkObject), CfnSecurityGroupIngressProps {
    override fun cacheSecurityGroupName(): String = unwrap(this).getCacheSecurityGroupName()

    override fun ec2SecurityGroupName(): String = unwrap(this).getEc2SecurityGroupName()

    override fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityGroupIngressProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps):
        CfnSecurityGroupIngressProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupIngressProps):
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps
  }
}
