@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnServiceNetworkVpcAssociationProps {
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun serviceNetworkIdentifier(): String? = unwrap(this).getServiceNetworkIdentifier()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcIdentifier(): String? = unwrap(this).getVpcIdentifier()

  @CdkDslMarker
  public interface Builder {
    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun serviceNetworkIdentifier(serviceNetworkIdentifier: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcIdentifier(vpcIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps.builder()

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun serviceNetworkIdentifier(serviceNetworkIdentifier: String) {
      cdkBuilder.serviceNetworkIdentifier(serviceNetworkIdentifier)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcIdentifier(vpcIdentifier: String) {
      cdkBuilder.vpcIdentifier(vpcIdentifier)
    }

    public fun build():
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps,
  ) : CdkObject(cdkObject), CfnServiceNetworkVpcAssociationProps {
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun serviceNetworkIdentifier(): String? = unwrap(this).getServiceNetworkIdentifier()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcIdentifier(): String? = unwrap(this).getVpcIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnServiceNetworkVpcAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps):
        CfnServiceNetworkVpcAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnServiceNetworkVpcAssociationProps):
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps
  }
}
