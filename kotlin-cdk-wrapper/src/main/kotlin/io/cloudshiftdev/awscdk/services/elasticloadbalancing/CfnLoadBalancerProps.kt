@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLoadBalancerProps {
  public fun accessLoggingPolicy(): Any? = unwrap(this).getAccessLoggingPolicy()

  public fun appCookieStickinessPolicy(): Any? = unwrap(this).getAppCookieStickinessPolicy()

  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

  public fun connectionDrainingPolicy(): Any? = unwrap(this).getConnectionDrainingPolicy()

  public fun connectionSettings(): Any? = unwrap(this).getConnectionSettings()

  public fun crossZone(): Any? = unwrap(this).getCrossZone()

  public fun healthCheck(): Any? = unwrap(this).getHealthCheck()

  public fun instances(): List<String> = unwrap(this).getInstances() ?: emptyList()

  public fun lbCookieStickinessPolicy(): Any? = unwrap(this).getLbCookieStickinessPolicy()

  public fun listeners(): Any

  public fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

  public fun policies(): Any? = unwrap(this).getPolicies()

  public fun scheme(): String? = unwrap(this).getScheme()

  public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  public fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accessLoggingPolicy(accessLoggingPolicy: IResolvable)

    public fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21630f019adef32227375e8027479ed097d0f60931ab92d3fbc91fbfcbf954de")
    public
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit)

    public fun appCookieStickinessPolicy(appCookieStickinessPolicy: IResolvable)

    public fun appCookieStickinessPolicy(appCookieStickinessPolicy: List<Any>)

    public fun appCookieStickinessPolicy(vararg appCookieStickinessPolicy: Any)

    public fun availabilityZones(availabilityZones: List<String>)

    public fun availabilityZones(vararg availabilityZones: String)

    public fun connectionDrainingPolicy(connectionDrainingPolicy: IResolvable)

    public
        fun connectionDrainingPolicy(connectionDrainingPolicy: CfnLoadBalancer.ConnectionDrainingPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8b1dd4718875e9e808ec4070b292385ed7cee5890a3f8c4be43dd3b1f79531b")
    public
        fun connectionDrainingPolicy(connectionDrainingPolicy: CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder.() -> Unit)

    public fun connectionSettings(connectionSettings: IResolvable)

    public fun connectionSettings(connectionSettings: CfnLoadBalancer.ConnectionSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7670306a43c0c8e5c175210ce2adfe4df9a208cc5bfd248260f3a3f6b9e4a205")
    public
        fun connectionSettings(connectionSettings: CfnLoadBalancer.ConnectionSettingsProperty.Builder.() -> Unit)

    public fun crossZone(crossZone: Boolean)

    public fun crossZone(crossZone: IResolvable)

    public fun healthCheck(healthCheck: IResolvable)

    public fun healthCheck(healthCheck: CfnLoadBalancer.HealthCheckProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb0026d3683ec299419366ce90e7c230bcc77c5a6fb78a0b56f084fe9ab4d35d")
    public fun healthCheck(healthCheck: CfnLoadBalancer.HealthCheckProperty.Builder.() -> Unit)

    public fun instances(instances: List<String>)

    public fun instances(vararg instances: String)

    public fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: IResolvable)

    public fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: List<Any>)

    public fun lbCookieStickinessPolicy(vararg lbCookieStickinessPolicy: Any)

    public fun listeners(listeners: IResolvable)

    public fun listeners(listeners: List<Any>)

    public fun listeners(vararg listeners: Any)

    public fun loadBalancerName(loadBalancerName: String)

    public fun policies(policies: IResolvable)

    public fun policies(policies: List<Any>)

    public fun policies(vararg policies: Any)

    public fun scheme(scheme: String)

    public fun securityGroups(securityGroups: List<String>)

    public fun securityGroups(vararg securityGroups: String)

    public fun subnets(subnets: List<String>)

    public fun subnets(vararg subnets: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.builder()

    override fun accessLoggingPolicy(accessLoggingPolicy: IResolvable) {
      cdkBuilder.accessLoggingPolicy(accessLoggingPolicy.let(IResolvable::unwrap))
    }

    override
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty) {
      cdkBuilder.accessLoggingPolicy(accessLoggingPolicy.let(CfnLoadBalancer.AccessLoggingPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21630f019adef32227375e8027479ed097d0f60931ab92d3fbc91fbfcbf954de")
    override
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit):
        Unit = accessLoggingPolicy(CfnLoadBalancer.AccessLoggingPolicyProperty(accessLoggingPolicy))

    override fun appCookieStickinessPolicy(appCookieStickinessPolicy: IResolvable) {
      cdkBuilder.appCookieStickinessPolicy(appCookieStickinessPolicy.let(IResolvable::unwrap))
    }

    override fun appCookieStickinessPolicy(appCookieStickinessPolicy: List<Any>) {
      cdkBuilder.appCookieStickinessPolicy(appCookieStickinessPolicy)
    }

    override fun appCookieStickinessPolicy(vararg appCookieStickinessPolicy: Any): Unit =
        appCookieStickinessPolicy(appCookieStickinessPolicy.toList())

    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    override fun connectionDrainingPolicy(connectionDrainingPolicy: IResolvable) {
      cdkBuilder.connectionDrainingPolicy(connectionDrainingPolicy.let(IResolvable::unwrap))
    }

    override
        fun connectionDrainingPolicy(connectionDrainingPolicy: CfnLoadBalancer.ConnectionDrainingPolicyProperty) {
      cdkBuilder.connectionDrainingPolicy(connectionDrainingPolicy.let(CfnLoadBalancer.ConnectionDrainingPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8b1dd4718875e9e808ec4070b292385ed7cee5890a3f8c4be43dd3b1f79531b")
    override
        fun connectionDrainingPolicy(connectionDrainingPolicy: CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder.() -> Unit):
        Unit =
        connectionDrainingPolicy(CfnLoadBalancer.ConnectionDrainingPolicyProperty(connectionDrainingPolicy))

    override fun connectionSettings(connectionSettings: IResolvable) {
      cdkBuilder.connectionSettings(connectionSettings.let(IResolvable::unwrap))
    }

    override
        fun connectionSettings(connectionSettings: CfnLoadBalancer.ConnectionSettingsProperty) {
      cdkBuilder.connectionSettings(connectionSettings.let(CfnLoadBalancer.ConnectionSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7670306a43c0c8e5c175210ce2adfe4df9a208cc5bfd248260f3a3f6b9e4a205")
    override
        fun connectionSettings(connectionSettings: CfnLoadBalancer.ConnectionSettingsProperty.Builder.() -> Unit):
        Unit = connectionSettings(CfnLoadBalancer.ConnectionSettingsProperty(connectionSettings))

    override fun crossZone(crossZone: Boolean) {
      cdkBuilder.crossZone(crossZone)
    }

    override fun crossZone(crossZone: IResolvable) {
      cdkBuilder.crossZone(crossZone.let(IResolvable::unwrap))
    }

    override fun healthCheck(healthCheck: IResolvable) {
      cdkBuilder.healthCheck(healthCheck.let(IResolvable::unwrap))
    }

    override fun healthCheck(healthCheck: CfnLoadBalancer.HealthCheckProperty) {
      cdkBuilder.healthCheck(healthCheck.let(CfnLoadBalancer.HealthCheckProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb0026d3683ec299419366ce90e7c230bcc77c5a6fb78a0b56f084fe9ab4d35d")
    override fun healthCheck(healthCheck: CfnLoadBalancer.HealthCheckProperty.Builder.() -> Unit):
        Unit = healthCheck(CfnLoadBalancer.HealthCheckProperty(healthCheck))

    override fun instances(instances: List<String>) {
      cdkBuilder.instances(instances)
    }

    override fun instances(vararg instances: String): Unit = instances(instances.toList())

    override fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: IResolvable) {
      cdkBuilder.lbCookieStickinessPolicy(lbCookieStickinessPolicy.let(IResolvable::unwrap))
    }

    override fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: List<Any>) {
      cdkBuilder.lbCookieStickinessPolicy(lbCookieStickinessPolicy)
    }

    override fun lbCookieStickinessPolicy(vararg lbCookieStickinessPolicy: Any): Unit =
        lbCookieStickinessPolicy(lbCookieStickinessPolicy.toList())

    override fun listeners(listeners: IResolvable) {
      cdkBuilder.listeners(listeners.let(IResolvable::unwrap))
    }

    override fun listeners(listeners: List<Any>) {
      cdkBuilder.listeners(listeners)
    }

    override fun listeners(vararg listeners: Any): Unit = listeners(listeners.toList())

    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    override fun scheme(scheme: String) {
      cdkBuilder.scheme(scheme)
    }

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

    public fun build(): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps,
  ) : CdkObject(cdkObject), CfnLoadBalancerProps {
    override fun accessLoggingPolicy(): Any? = unwrap(this).getAccessLoggingPolicy()

    override fun appCookieStickinessPolicy(): Any? = unwrap(this).getAppCookieStickinessPolicy()

    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    override fun connectionDrainingPolicy(): Any? = unwrap(this).getConnectionDrainingPolicy()

    override fun connectionSettings(): Any? = unwrap(this).getConnectionSettings()

    override fun crossZone(): Any? = unwrap(this).getCrossZone()

    override fun healthCheck(): Any? = unwrap(this).getHealthCheck()

    override fun instances(): List<String> = unwrap(this).getInstances() ?: emptyList()

    override fun lbCookieStickinessPolicy(): Any? = unwrap(this).getLbCookieStickinessPolicy()

    override fun listeners(): Any = unwrap(this).getListeners()

    override fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

    override fun policies(): Any? = unwrap(this).getPolicies()

    override fun scheme(): String? = unwrap(this).getScheme()

    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoadBalancerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps):
        CfnLoadBalancerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoadBalancerProps):
        software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps
  }
}
