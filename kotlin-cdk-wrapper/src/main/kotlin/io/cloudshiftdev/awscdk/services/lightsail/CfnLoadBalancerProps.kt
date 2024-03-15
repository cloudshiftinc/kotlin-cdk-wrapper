@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLoadBalancerProps {
  public fun attachedInstances(): List<String> = unwrap(this).getAttachedInstances() ?: emptyList()

  public fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

  public fun instancePort(): Number

  public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  public fun loadBalancerName(): String

  public fun sessionStickinessEnabled(): Any? = unwrap(this).getSessionStickinessEnabled()

  public fun sessionStickinessLbCookieDurationSeconds(): String? =
      unwrap(this).getSessionStickinessLbCookieDurationSeconds()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun tlsPolicyName(): String? = unwrap(this).getTlsPolicyName()

  @CdkDslMarker
  public interface Builder {
    public fun attachedInstances(attachedInstances: List<String>)

    public fun attachedInstances(vararg attachedInstances: String)

    public fun healthCheckPath(healthCheckPath: String)

    public fun instancePort(instancePort: Number)

    public fun ipAddressType(ipAddressType: String)

    public fun loadBalancerName(loadBalancerName: String)

    public fun sessionStickinessEnabled(sessionStickinessEnabled: Boolean)

    public fun sessionStickinessEnabled(sessionStickinessEnabled: IResolvable)

    public
        fun sessionStickinessLbCookieDurationSeconds(sessionStickinessLbCookieDurationSeconds: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tlsPolicyName(tlsPolicyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnLoadBalancerProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerProps.builder()

    override fun attachedInstances(attachedInstances: List<String>) {
      cdkBuilder.attachedInstances(attachedInstances)
    }

    override fun attachedInstances(vararg attachedInstances: String): Unit =
        attachedInstances(attachedInstances.toList())

    override fun healthCheckPath(healthCheckPath: String) {
      cdkBuilder.healthCheckPath(healthCheckPath)
    }

    override fun instancePort(instancePort: Number) {
      cdkBuilder.instancePort(instancePort)
    }

    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    override fun sessionStickinessEnabled(sessionStickinessEnabled: Boolean) {
      cdkBuilder.sessionStickinessEnabled(sessionStickinessEnabled)
    }

    override fun sessionStickinessEnabled(sessionStickinessEnabled: IResolvable) {
      cdkBuilder.sessionStickinessEnabled(sessionStickinessEnabled.let(IResolvable::unwrap))
    }

    override
        fun sessionStickinessLbCookieDurationSeconds(sessionStickinessLbCookieDurationSeconds: String) {
      cdkBuilder.sessionStickinessLbCookieDurationSeconds(sessionStickinessLbCookieDurationSeconds)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tlsPolicyName(tlsPolicyName: String) {
      cdkBuilder.tlsPolicyName(tlsPolicyName)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnLoadBalancerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnLoadBalancerProps,
  ) : CdkObject(cdkObject), CfnLoadBalancerProps {
    override fun attachedInstances(): List<String> = unwrap(this).getAttachedInstances() ?:
        emptyList()

    override fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

    override fun instancePort(): Number = unwrap(this).getInstancePort()

    override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    override fun loadBalancerName(): String = unwrap(this).getLoadBalancerName()

    override fun sessionStickinessEnabled(): Any? = unwrap(this).getSessionStickinessEnabled()

    override fun sessionStickinessLbCookieDurationSeconds(): String? =
        unwrap(this).getSessionStickinessLbCookieDurationSeconds()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun tlsPolicyName(): String? = unwrap(this).getTlsPolicyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoadBalancerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnLoadBalancerProps):
        CfnLoadBalancerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoadBalancerProps):
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lightsail.CfnLoadBalancerProps
  }
}
