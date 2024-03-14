package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLoadBalancer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lightsail.CfnLoadBalancer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attachedInstances(): List<String> = unwrap(this).getAttachedInstances() ?:
      emptyList()

  public open fun attachedInstances(`value`: List<String>) {
    unwrap(this).setAttachedInstances(`value`)
  }

  public open fun attachedInstances(vararg `value`: String): Unit =
      attachedInstances(`value`.toList())

  public open fun attrLoadBalancerArn(): String = unwrap(this).getAttrLoadBalancerArn()

  public open fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

  public open fun healthCheckPath(`value`: String) {
    unwrap(this).setHealthCheckPath(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instancePort(): Number = unwrap(this).getInstancePort()

  public open fun instancePort(`value`: Number) {
    unwrap(this).setInstancePort(`value`)
  }

  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  public open fun loadBalancerName(): String = unwrap(this).getLoadBalancerName()

  public open fun loadBalancerName(`value`: String) {
    unwrap(this).setLoadBalancerName(`value`)
  }

  public open fun sessionStickinessEnabled(): Any? = unwrap(this).getSessionStickinessEnabled()

  public open fun sessionStickinessEnabled(`value`: Boolean) {
    unwrap(this).setSessionStickinessEnabled(`value`)
  }

  public open fun sessionStickinessEnabled(`value`: IResolvable) {
    unwrap(this).setSessionStickinessEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun sessionStickinessLbCookieDurationSeconds(): String? =
      unwrap(this).getSessionStickinessLbCookieDurationSeconds()

  public open fun sessionStickinessLbCookieDurationSeconds(`value`: String) {
    unwrap(this).setSessionStickinessLbCookieDurationSeconds(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun tlsPolicyName(): String? = unwrap(this).getTlsPolicyName()

  public open fun tlsPolicyName(`value`: String) {
    unwrap(this).setTlsPolicyName(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnLoadBalancer.Builder =
        software.amazon.awscdk.services.lightsail.CfnLoadBalancer.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.lightsail.CfnLoadBalancer =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoadBalancer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoadBalancer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnLoadBalancer):
        CfnLoadBalancer = CfnLoadBalancer(cdkObject)

    internal fun unwrap(wrapped: CfnLoadBalancer):
        software.amazon.awscdk.services.lightsail.CfnLoadBalancer = wrapped.cdkObject
  }
}
