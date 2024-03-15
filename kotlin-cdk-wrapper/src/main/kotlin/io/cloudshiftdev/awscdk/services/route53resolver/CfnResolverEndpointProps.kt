@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnResolverEndpointProps {
  public fun direction(): String

  public fun ipAddresses(): Any

  public fun name(): String? = unwrap(this).getName()

  public fun outpostArn(): String? = unwrap(this).getOutpostArn()

  public fun preferredInstanceType(): String? = unwrap(this).getPreferredInstanceType()

  public fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

  public fun resolverEndpointType(): String? = unwrap(this).getResolverEndpointType()

  public fun securityGroupIds(): List<String>

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun direction(direction: String)

    public fun ipAddresses(ipAddresses: IResolvable)

    public fun ipAddresses(ipAddresses: List<Any>)

    public fun ipAddresses(vararg ipAddresses: Any)

    public fun name(name: String)

    public fun outpostArn(outpostArn: String)

    public fun preferredInstanceType(preferredInstanceType: String)

    public fun protocols(protocols: List<String>)

    public fun protocols(vararg protocols: String)

    public fun resolverEndpointType(resolverEndpointType: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps.Builder =
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps.builder()

    override fun direction(direction: String) {
      cdkBuilder.direction(direction)
    }

    override fun ipAddresses(ipAddresses: IResolvable) {
      cdkBuilder.ipAddresses(ipAddresses.let(IResolvable::unwrap))
    }

    override fun ipAddresses(ipAddresses: List<Any>) {
      cdkBuilder.ipAddresses(ipAddresses)
    }

    override fun ipAddresses(vararg ipAddresses: Any): Unit = ipAddresses(ipAddresses.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    override fun preferredInstanceType(preferredInstanceType: String) {
      cdkBuilder.preferredInstanceType(preferredInstanceType)
    }

    override fun protocols(protocols: List<String>) {
      cdkBuilder.protocols(protocols)
    }

    override fun protocols(vararg protocols: String): Unit = protocols(protocols.toList())

    override fun resolverEndpointType(resolverEndpointType: String) {
      cdkBuilder.resolverEndpointType(resolverEndpointType)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps,
  ) : CdkObject(cdkObject), CfnResolverEndpointProps {
    override fun direction(): String = unwrap(this).getDirection()

    override fun ipAddresses(): Any = unwrap(this).getIpAddresses()

    override fun name(): String? = unwrap(this).getName()

    override fun outpostArn(): String? = unwrap(this).getOutpostArn()

    override fun preferredInstanceType(): String? = unwrap(this).getPreferredInstanceType()

    override fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

    override fun resolverEndpointType(): String? = unwrap(this).getResolverEndpointType()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResolverEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps):
        CfnResolverEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResolverEndpointProps):
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps
  }
}
