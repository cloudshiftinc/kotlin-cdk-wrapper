@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnVpcConnectionProps {
  public fun authentication(): String

  public fun clientSubnets(): List<String>

  public fun securityGroups(): List<String>

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun targetClusterArn(): String

  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun authentication(authentication: String)

    public fun clientSubnets(clientSubnets: List<String>)

    public fun clientSubnets(vararg clientSubnets: String)

    public fun securityGroups(securityGroups: List<String>)

    public fun securityGroups(vararg securityGroups: String)

    public fun tags(tags: Map<String, String>)

    public fun targetClusterArn(targetClusterArn: String)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnVpcConnectionProps.Builder =
        software.amazon.awscdk.services.msk.CfnVpcConnectionProps.builder()

    override fun authentication(authentication: String) {
      cdkBuilder.authentication(authentication)
    }

    override fun clientSubnets(clientSubnets: List<String>) {
      cdkBuilder.clientSubnets(clientSubnets)
    }

    override fun clientSubnets(vararg clientSubnets: String): Unit =
        clientSubnets(clientSubnets.toList())

    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun targetClusterArn(targetClusterArn: String) {
      cdkBuilder.targetClusterArn(targetClusterArn)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnVpcConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.msk.CfnVpcConnectionProps,
  ) : CdkObject(cdkObject), CfnVpcConnectionProps {
    override fun authentication(): String = unwrap(this).getAuthentication()

    override fun clientSubnets(): List<String> = unwrap(this).getClientSubnets()

    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun targetClusterArn(): String = unwrap(this).getTargetClusterArn()

    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVpcConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnVpcConnectionProps):
        CfnVpcConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVpcConnectionProps):
        software.amazon.awscdk.services.msk.CfnVpcConnectionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.msk.CfnVpcConnectionProps
  }
}
