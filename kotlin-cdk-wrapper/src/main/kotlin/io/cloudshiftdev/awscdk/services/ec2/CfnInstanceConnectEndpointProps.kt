@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnInstanceConnectEndpointProps {
  public fun clientToken(): String? = unwrap(this).getClientToken()

  public fun preserveClientIp(): Any? = unwrap(this).getPreserveClientIp()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun subnetId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun clientToken(clientToken: String)

    public fun preserveClientIp(preserveClientIp: Boolean)

    public fun preserveClientIp(preserveClientIp: IResolvable)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun subnetId(subnetId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps.Builder =
        software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps.builder()

    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

    override fun preserveClientIp(preserveClientIp: IResolvable) {
      cdkBuilder.preserveClientIp(preserveClientIp.let(IResolvable::unwrap))
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps,
  ) : CdkObject(cdkObject), CfnInstanceConnectEndpointProps {
    override fun clientToken(): String? = unwrap(this).getClientToken()

    override fun preserveClientIp(): Any? = unwrap(this).getPreserveClientIp()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun subnetId(): String = unwrap(this).getSubnetId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceConnectEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps):
        CfnInstanceConnectEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceConnectEndpointProps):
        software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnInstanceConnectEndpointProps
  }
}
