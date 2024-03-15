@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLoadBalancer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessLoggingPolicy(): Any? = unwrap(this).getAccessLoggingPolicy()

  public open fun accessLoggingPolicy(`value`: IResolvable) {
    unwrap(this).setAccessLoggingPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun accessLoggingPolicy(`value`: AccessLoggingPolicyProperty) {
    unwrap(this).setAccessLoggingPolicy(`value`.let(AccessLoggingPolicyProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dd206e1d33e8a82efbc2593a65d5943de517756dd75bb9dff305f92e60ea8785")
  public open fun accessLoggingPolicy(`value`: AccessLoggingPolicyProperty.Builder.() -> Unit): Unit
      = accessLoggingPolicy(AccessLoggingPolicyProperty(`value`))

  public open fun appCookieStickinessPolicy(): Any? = unwrap(this).getAppCookieStickinessPolicy()

  public open fun appCookieStickinessPolicy(`value`: IResolvable) {
    unwrap(this).setAppCookieStickinessPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun appCookieStickinessPolicy(__idx_ac66f0: List<Any>) {
    unwrap(this).setAppCookieStickinessPolicy(__idx_ac66f0)
  }

  public open fun appCookieStickinessPolicy(vararg __idx_ac66f0: Any): Unit =
      appCookieStickinessPolicy(__idx_ac66f0.toList())

  public open fun attrCanonicalHostedZoneName(): String =
      unwrap(this).getAttrCanonicalHostedZoneName()

  public open fun attrCanonicalHostedZoneNameId(): String =
      unwrap(this).getAttrCanonicalHostedZoneNameId()

  public open fun attrDnsName(): String = unwrap(this).getAttrDnsName()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrSourceSecurityGroupGroupName(): String =
      unwrap(this).getAttrSourceSecurityGroupGroupName()

  public open fun attrSourceSecurityGroupOwnerAlias(): String =
      unwrap(this).getAttrSourceSecurityGroupOwnerAlias()

  public open fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
      emptyList()

  public open fun availabilityZones(`value`: List<String>) {
    unwrap(this).setAvailabilityZones(`value`)
  }

  public open fun availabilityZones(vararg `value`: String): Unit =
      availabilityZones(`value`.toList())

  public open fun connectionDrainingPolicy(): Any? = unwrap(this).getConnectionDrainingPolicy()

  public open fun connectionDrainingPolicy(`value`: IResolvable) {
    unwrap(this).setConnectionDrainingPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun connectionDrainingPolicy(`value`: ConnectionDrainingPolicyProperty) {
    unwrap(this).setConnectionDrainingPolicy(`value`.let(ConnectionDrainingPolicyProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("da9323ebbbc41341ca5c9c502528a67121ab365b7cd8712e6018fb0e3ff6a50f")
  public open
      fun connectionDrainingPolicy(`value`: ConnectionDrainingPolicyProperty.Builder.() -> Unit):
      Unit = connectionDrainingPolicy(ConnectionDrainingPolicyProperty(`value`))

  public open fun connectionSettings(): Any? = unwrap(this).getConnectionSettings()

  public open fun connectionSettings(`value`: IResolvable) {
    unwrap(this).setConnectionSettings(`value`.let(IResolvable::unwrap))
  }

  public open fun connectionSettings(`value`: ConnectionSettingsProperty) {
    unwrap(this).setConnectionSettings(`value`.let(ConnectionSettingsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8924900c6ba29c31d94607caafba3168b5676e63fb10632238b3896aa2306521")
  public open fun connectionSettings(`value`: ConnectionSettingsProperty.Builder.() -> Unit): Unit =
      connectionSettings(ConnectionSettingsProperty(`value`))

  public open fun crossZone(): Any? = unwrap(this).getCrossZone()

  public open fun crossZone(`value`: Boolean) {
    unwrap(this).setCrossZone(`value`)
  }

  public open fun crossZone(`value`: IResolvable) {
    unwrap(this).setCrossZone(`value`.let(IResolvable::unwrap))
  }

  public open fun healthCheck(): Any? = unwrap(this).getHealthCheck()

  public open fun healthCheck(`value`: IResolvable) {
    unwrap(this).setHealthCheck(`value`.let(IResolvable::unwrap))
  }

  public open fun healthCheck(`value`: HealthCheckProperty) {
    unwrap(this).setHealthCheck(`value`.let(HealthCheckProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df9477ddb736cfae4bef70c4d81edf0148be0b843623e5eb7b21e976f51eeebc")
  public open fun healthCheck(`value`: HealthCheckProperty.Builder.() -> Unit): Unit =
      healthCheck(HealthCheckProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instances(): List<String> = unwrap(this).getInstances() ?: emptyList()

  public open fun instances(`value`: List<String>) {
    unwrap(this).setInstances(`value`)
  }

  public open fun instances(vararg `value`: String): Unit = instances(`value`.toList())

  public open fun lbCookieStickinessPolicy(): Any? = unwrap(this).getLbCookieStickinessPolicy()

  public open fun lbCookieStickinessPolicy(`value`: IResolvable) {
    unwrap(this).setLbCookieStickinessPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun lbCookieStickinessPolicy(__idx_ac66f0: List<Any>) {
    unwrap(this).setLbCookieStickinessPolicy(__idx_ac66f0)
  }

  public open fun lbCookieStickinessPolicy(vararg __idx_ac66f0: Any): Unit =
      lbCookieStickinessPolicy(__idx_ac66f0.toList())

  public open fun listeners(): Any = unwrap(this).getListeners()

  public open fun listeners(`value`: IResolvable) {
    unwrap(this).setListeners(`value`.let(IResolvable::unwrap))
  }

  public open fun listeners(__idx_ac66f0: List<Any>) {
    unwrap(this).setListeners(__idx_ac66f0)
  }

  public open fun listeners(vararg __idx_ac66f0: Any): Unit = listeners(__idx_ac66f0.toList())

  public open fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

  public open fun loadBalancerName(`value`: String) {
    unwrap(this).setLoadBalancerName(`value`)
  }

  public open fun policies(): Any? = unwrap(this).getPolicies()

  public open fun policies(`value`: IResolvable) {
    unwrap(this).setPolicies(`value`.let(IResolvable::unwrap))
  }

  public open fun policies(__idx_ac66f0: List<Any>) {
    unwrap(this).setPolicies(__idx_ac66f0)
  }

  public open fun policies(vararg __idx_ac66f0: Any): Unit = policies(__idx_ac66f0.toList())

  public open fun scheme(): String? = unwrap(this).getScheme()

  public open fun scheme(`value`: String) {
    unwrap(this).setScheme(`value`)
  }

  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  public open fun securityGroups(vararg `value`: String): Unit = securityGroups(`value`.toList())

  public open fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

  public open fun subnets(`value`: List<String>) {
    unwrap(this).setSubnets(`value`)
  }

  public open fun subnets(vararg `value`: String): Unit = subnets(`value`.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun accessLoggingPolicy(accessLoggingPolicy: IResolvable)

    public fun accessLoggingPolicy(accessLoggingPolicy: AccessLoggingPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18d943578206ad14c83ad52f5ea15e3893d45d3139a43179598ff115c2ed0f00")
    public
        fun accessLoggingPolicy(accessLoggingPolicy: AccessLoggingPolicyProperty.Builder.() -> Unit)

    public fun appCookieStickinessPolicy(appCookieStickinessPolicy: IResolvable)

    public fun appCookieStickinessPolicy(appCookieStickinessPolicy: List<Any>)

    public fun appCookieStickinessPolicy(vararg appCookieStickinessPolicy: Any)

    public fun availabilityZones(availabilityZones: List<String>)

    public fun availabilityZones(vararg availabilityZones: String)

    public fun connectionDrainingPolicy(connectionDrainingPolicy: IResolvable)

    public fun connectionDrainingPolicy(connectionDrainingPolicy: ConnectionDrainingPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1308d9c6af6779b05692fd2444332ab6d46359ba54c4060ced1a9f2d4bf788c")
    public
        fun connectionDrainingPolicy(connectionDrainingPolicy: ConnectionDrainingPolicyProperty.Builder.() -> Unit)

    public fun connectionSettings(connectionSettings: IResolvable)

    public fun connectionSettings(connectionSettings: ConnectionSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef1c9b12d6535ae9972f770ffb300128431c29da02f5c9554522ae128923e5cf")
    public fun connectionSettings(connectionSettings: ConnectionSettingsProperty.Builder.() -> Unit)

    public fun crossZone(crossZone: Boolean)

    public fun crossZone(crossZone: IResolvable)

    public fun healthCheck(healthCheck: IResolvable)

    public fun healthCheck(healthCheck: HealthCheckProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42ae2f476bb579083ac310d027410b288b9e8b294f4fae50b6fd050fe84c7e98")
    public fun healthCheck(healthCheck: HealthCheckProperty.Builder.() -> Unit)

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.Builder =
        software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.Builder.create(scope,
        id)

    override fun accessLoggingPolicy(accessLoggingPolicy: IResolvable) {
      cdkBuilder.accessLoggingPolicy(accessLoggingPolicy.let(IResolvable::unwrap))
    }

    override fun accessLoggingPolicy(accessLoggingPolicy: AccessLoggingPolicyProperty) {
      cdkBuilder.accessLoggingPolicy(accessLoggingPolicy.let(AccessLoggingPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18d943578206ad14c83ad52f5ea15e3893d45d3139a43179598ff115c2ed0f00")
    override
        fun accessLoggingPolicy(accessLoggingPolicy: AccessLoggingPolicyProperty.Builder.() -> Unit):
        Unit = accessLoggingPolicy(AccessLoggingPolicyProperty(accessLoggingPolicy))

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
        fun connectionDrainingPolicy(connectionDrainingPolicy: ConnectionDrainingPolicyProperty) {
      cdkBuilder.connectionDrainingPolicy(connectionDrainingPolicy.let(ConnectionDrainingPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1308d9c6af6779b05692fd2444332ab6d46359ba54c4060ced1a9f2d4bf788c")
    override
        fun connectionDrainingPolicy(connectionDrainingPolicy: ConnectionDrainingPolicyProperty.Builder.() -> Unit):
        Unit = connectionDrainingPolicy(ConnectionDrainingPolicyProperty(connectionDrainingPolicy))

    override fun connectionSettings(connectionSettings: IResolvable) {
      cdkBuilder.connectionSettings(connectionSettings.let(IResolvable::unwrap))
    }

    override fun connectionSettings(connectionSettings: ConnectionSettingsProperty) {
      cdkBuilder.connectionSettings(connectionSettings.let(ConnectionSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef1c9b12d6535ae9972f770ffb300128431c29da02f5c9554522ae128923e5cf")
    override
        fun connectionSettings(connectionSettings: ConnectionSettingsProperty.Builder.() -> Unit):
        Unit = connectionSettings(ConnectionSettingsProperty(connectionSettings))

    override fun crossZone(crossZone: Boolean) {
      cdkBuilder.crossZone(crossZone)
    }

    override fun crossZone(crossZone: IResolvable) {
      cdkBuilder.crossZone(crossZone.let(IResolvable::unwrap))
    }

    override fun healthCheck(healthCheck: IResolvable) {
      cdkBuilder.healthCheck(healthCheck.let(IResolvable::unwrap))
    }

    override fun healthCheck(healthCheck: HealthCheckProperty) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheckProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42ae2f476bb579083ac310d027410b288b9e8b294f4fae50b6fd050fe84c7e98")
    override fun healthCheck(healthCheck: HealthCheckProperty.Builder.() -> Unit): Unit =
        healthCheck(HealthCheckProperty(healthCheck))

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

    public fun build(): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoadBalancer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoadBalancer(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer):
        CfnLoadBalancer = CfnLoadBalancer(cdkObject)

    internal fun unwrap(wrapped: CfnLoadBalancer):
        software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer = wrapped.cdkObject
  }

  public interface PoliciesProperty {
    public fun attributes(): Any

    public fun instancePorts(): List<String> = unwrap(this).getInstancePorts() ?: emptyList()

    public fun loadBalancerPorts(): List<String> = unwrap(this).getLoadBalancerPorts() ?:
        emptyList()

    public fun policyName(): String

    public fun policyType(): String

    @CdkDslMarker
    public interface Builder {
      public fun attributes(attributes: List<Any>)

      public fun attributes(vararg attributes: Any)

      public fun attributes(attributes: IResolvable)

      public fun instancePorts(instancePorts: List<String>)

      public fun instancePorts(vararg instancePorts: String)

      public fun loadBalancerPorts(loadBalancerPorts: List<String>)

      public fun loadBalancerPorts(vararg loadBalancerPorts: String)

      public fun policyName(policyName: String)

      public fun policyType(policyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty.builder()

      override fun attributes(attributes: List<Any>) {
        cdkBuilder.attributes(attributes)
      }

      override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      override fun instancePorts(instancePorts: List<String>) {
        cdkBuilder.instancePorts(instancePorts)
      }

      override fun instancePorts(vararg instancePorts: String): Unit =
          instancePorts(instancePorts.toList())

      override fun loadBalancerPorts(loadBalancerPorts: List<String>) {
        cdkBuilder.loadBalancerPorts(loadBalancerPorts)
      }

      override fun loadBalancerPorts(vararg loadBalancerPorts: String): Unit =
          loadBalancerPorts(loadBalancerPorts.toList())

      override fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
      }

      override fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty,
    ) : CdkObject(cdkObject), PoliciesProperty {
      override fun attributes(): Any = unwrap(this).getAttributes()

      override fun instancePorts(): List<String> = unwrap(this).getInstancePorts() ?: emptyList()

      override fun loadBalancerPorts(): List<String> = unwrap(this).getLoadBalancerPorts() ?:
          emptyList()

      override fun policyName(): String = unwrap(this).getPolicyName()

      override fun policyType(): String = unwrap(this).getPolicyType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PoliciesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty):
          PoliciesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PoliciesProperty):
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty
    }
  }

  public interface LBCookieStickinessPolicyProperty {
    public fun cookieExpirationPeriod(): String? = unwrap(this).getCookieExpirationPeriod()

    public fun policyName(): String? = unwrap(this).getPolicyName()

    @CdkDslMarker
    public interface Builder {
      public fun cookieExpirationPeriod(cookieExpirationPeriod: String)

      public fun policyName(policyName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty.builder()

      override fun cookieExpirationPeriod(cookieExpirationPeriod: String) {
        cdkBuilder.cookieExpirationPeriod(cookieExpirationPeriod)
      }

      override fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty,
    ) : CdkObject(cdkObject), LBCookieStickinessPolicyProperty {
      override fun cookieExpirationPeriod(): String? = unwrap(this).getCookieExpirationPeriod()

      override fun policyName(): String? = unwrap(this).getPolicyName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LBCookieStickinessPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty):
          LBCookieStickinessPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LBCookieStickinessPolicyProperty):
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty
    }
  }

  public interface AccessLoggingPolicyProperty {
    public fun emitInterval(): Number? = unwrap(this).getEmitInterval()

    public fun enabled(): Any

    public fun s3BucketName(): String

    public fun s3BucketPrefix(): String? = unwrap(this).getS3BucketPrefix()

    @CdkDslMarker
    public interface Builder {
      public fun emitInterval(emitInterval: Number)

      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun s3BucketName(s3BucketName: String)

      public fun s3BucketPrefix(s3BucketPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.builder()

      override fun emitInterval(emitInterval: Number) {
        cdkBuilder.emitInterval(emitInterval)
      }

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      override fun s3BucketPrefix(s3BucketPrefix: String) {
        cdkBuilder.s3BucketPrefix(s3BucketPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty,
    ) : CdkObject(cdkObject), AccessLoggingPolicyProperty {
      override fun emitInterval(): Number? = unwrap(this).getEmitInterval()

      override fun enabled(): Any = unwrap(this).getEnabled()

      override fun s3BucketName(): String = unwrap(this).getS3BucketName()

      override fun s3BucketPrefix(): String? = unwrap(this).getS3BucketPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessLoggingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty):
          AccessLoggingPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessLoggingPolicyProperty):
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty
    }
  }

  public interface AppCookieStickinessPolicyProperty {
    public fun cookieName(): String

    public fun policyName(): String

    @CdkDslMarker
    public interface Builder {
      public fun cookieName(cookieName: String)

      public fun policyName(policyName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty.builder()

      override fun cookieName(cookieName: String) {
        cdkBuilder.cookieName(cookieName)
      }

      override fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty,
    ) : CdkObject(cdkObject), AppCookieStickinessPolicyProperty {
      override fun cookieName(): String = unwrap(this).getCookieName()

      override fun policyName(): String = unwrap(this).getPolicyName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AppCookieStickinessPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty):
          AppCookieStickinessPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppCookieStickinessPolicyProperty):
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty
    }
  }

  public interface ListenersProperty {
    public fun instancePort(): String

    public fun instanceProtocol(): String? = unwrap(this).getInstanceProtocol()

    public fun loadBalancerPort(): String

    public fun policyNames(): List<String> = unwrap(this).getPolicyNames() ?: emptyList()

    public fun protocol(): String

    public fun sslCertificateId(): String? = unwrap(this).getSslCertificateId()

    @CdkDslMarker
    public interface Builder {
      public fun instancePort(instancePort: String)

      public fun instanceProtocol(instanceProtocol: String)

      public fun loadBalancerPort(loadBalancerPort: String)

      public fun policyNames(policyNames: List<String>)

      public fun policyNames(vararg policyNames: String)

      public fun protocol(protocol: String)

      public fun sslCertificateId(sslCertificateId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.builder()

      override fun instancePort(instancePort: String) {
        cdkBuilder.instancePort(instancePort)
      }

      override fun instanceProtocol(instanceProtocol: String) {
        cdkBuilder.instanceProtocol(instanceProtocol)
      }

      override fun loadBalancerPort(loadBalancerPort: String) {
        cdkBuilder.loadBalancerPort(loadBalancerPort)
      }

      override fun policyNames(policyNames: List<String>) {
        cdkBuilder.policyNames(policyNames)
      }

      override fun policyNames(vararg policyNames: String): Unit = policyNames(policyNames.toList())

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      override fun sslCertificateId(sslCertificateId: String) {
        cdkBuilder.sslCertificateId(sslCertificateId)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty,
    ) : CdkObject(cdkObject), ListenersProperty {
      override fun instancePort(): String = unwrap(this).getInstancePort()

      override fun instanceProtocol(): String? = unwrap(this).getInstanceProtocol()

      override fun loadBalancerPort(): String = unwrap(this).getLoadBalancerPort()

      override fun policyNames(): List<String> = unwrap(this).getPolicyNames() ?: emptyList()

      override fun protocol(): String = unwrap(this).getProtocol()

      override fun sslCertificateId(): String? = unwrap(this).getSslCertificateId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ListenersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty):
          ListenersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ListenersProperty):
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty
    }
  }

  public interface ConnectionSettingsProperty {
    public fun idleTimeout(): Number

    @CdkDslMarker
    public interface Builder {
      public fun idleTimeout(idleTimeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty.builder()

      override fun idleTimeout(idleTimeout: Number) {
        cdkBuilder.idleTimeout(idleTimeout)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty,
    ) : CdkObject(cdkObject), ConnectionSettingsProperty {
      override fun idleTimeout(): Number = unwrap(this).getIdleTimeout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty):
          ConnectionSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionSettingsProperty):
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty
    }
  }

  public interface HealthCheckProperty {
    public fun healthyThreshold(): String

    public fun interval(): String

    public fun target(): String

    public fun timeout(): String

    public fun unhealthyThreshold(): String

    @CdkDslMarker
    public interface Builder {
      public fun healthyThreshold(healthyThreshold: String)

      public fun interval(interval: String)

      public fun target(target: String)

      public fun timeout(timeout: String)

      public fun unhealthyThreshold(unhealthyThreshold: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.builder()

      override fun healthyThreshold(healthyThreshold: String) {
        cdkBuilder.healthyThreshold(healthyThreshold)
      }

      override fun interval(interval: String) {
        cdkBuilder.interval(interval)
      }

      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      override fun timeout(timeout: String) {
        cdkBuilder.timeout(timeout)
      }

      override fun unhealthyThreshold(unhealthyThreshold: String) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty,
    ) : CdkObject(cdkObject), HealthCheckProperty {
      override fun healthyThreshold(): String = unwrap(this).getHealthyThreshold()

      override fun interval(): String = unwrap(this).getInterval()

      override fun target(): String = unwrap(this).getTarget()

      override fun timeout(): String = unwrap(this).getTimeout()

      override fun unhealthyThreshold(): String = unwrap(this).getUnhealthyThreshold()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty):
          HealthCheckProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckProperty):
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty
    }
  }

  public interface ConnectionDrainingPolicyProperty {
    public fun enabled(): Any

    public fun timeout(): Number? = unwrap(this).getTimeout()

    @CdkDslMarker
    public interface Builder {
      public fun enabled(enabled: Boolean)

      public fun enabled(enabled: IResolvable)

      public fun timeout(timeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty.builder()

      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      override fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty,
    ) : CdkObject(cdkObject), ConnectionDrainingPolicyProperty {
      override fun enabled(): Any = unwrap(this).getEnabled()

      override fun timeout(): Number? = unwrap(this).getTimeout()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionDrainingPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty):
          ConnectionDrainingPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionDrainingPolicyProperty):
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty
    }
  }
}
