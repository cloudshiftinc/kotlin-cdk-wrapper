@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apprunner

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVpcConnectorProps {
  public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  public fun subnets(): List<String>

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcConnectorName(): String? = unwrap(this).getVpcConnectorName()

  @CdkDslMarker
  public interface Builder {
    public fun securityGroups(securityGroups: List<String>)

    public fun securityGroups(vararg securityGroups: String)

    public fun subnets(subnets: List<String>)

    public fun subnets(vararg subnets: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcConnectorName(vpcConnectorName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps.Builder =
        software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps.builder()

    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

    override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcConnectorName(vpcConnectorName: String) {
      cdkBuilder.vpcConnectorName(vpcConnectorName)
    }

    public fun build(): software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps,
  ) : CdkObject(cdkObject), CfnVpcConnectorProps {
    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    override fun subnets(): List<String> = unwrap(this).getSubnets()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcConnectorName(): String? = unwrap(this).getVpcConnectorName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVpcConnectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps):
        CfnVpcConnectorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVpcConnectorProps):
        software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps
  }
}
