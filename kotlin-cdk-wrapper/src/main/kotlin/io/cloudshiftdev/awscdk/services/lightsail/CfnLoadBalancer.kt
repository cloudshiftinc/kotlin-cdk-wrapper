@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Lightsail::LoadBalancer` resource specifies a load balancer that can be used with
 * Lightsail instances.
 *
 *
 * You cannot attach a TLS certificate to a load balancer using the `AWS::Lightsail::LoadBalancer`
 * resource type. Instead, use the `AWS::Lightsail::LoadBalancerTlsCertificate` resource type to create
 * a certificate and attach it to a load balancer.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
 * CfnLoadBalancer cfnLoadBalancer = CfnLoadBalancer.Builder.create(this, "MyCfnLoadBalancer")
 * .instancePort(123)
 * .loadBalancerName("loadBalancerName")
 * // the properties below are optional
 * .attachedInstances(List.of("attachedInstances"))
 * .healthCheckPath("healthCheckPath")
 * .ipAddressType("ipAddressType")
 * .sessionStickinessEnabled(false)
 * .sessionStickinessLbCookieDurationSeconds("sessionStickinessLbCookieDurationSeconds")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tlsPolicyName("tlsPolicyName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html)
 */
public open class CfnLoadBalancer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lightsail.CfnLoadBalancer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Lightsail instances to attach to the load balancer.
   */
  public open fun attachedInstances(): List<String> = unwrap(this).getAttachedInstances() ?:
      emptyList()

  /**
   * The Lightsail instances to attach to the load balancer.
   */
  public open fun attachedInstances(`value`: List<String>) {
    unwrap(this).setAttachedInstances(`value`)
  }

  /**
   * The Lightsail instances to attach to the load balancer.
   */
  public open fun attachedInstances(vararg `value`: String): Unit =
      attachedInstances(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the load balancer.
   */
  public open fun attrLoadBalancerArn(): String = unwrap(this).getAttrLoadBalancerArn()

  /**
   * The path on the attached instance where the health check will be performed.
   */
  public open fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

  /**
   * The path on the attached instance where the health check will be performed.
   */
  public open fun healthCheckPath(`value`: String) {
    unwrap(this).setHealthCheckPath(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The port that the load balancer uses to direct traffic to your Lightsail instances.
   */
  public open fun instancePort(): Number = unwrap(this).getInstancePort()

  /**
   * The port that the load balancer uses to direct traffic to your Lightsail instances.
   */
  public open fun instancePort(`value`: Number) {
    unwrap(this).setInstancePort(`value`)
  }

  /**
   * The IP address type of the load balancer.
   */
  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * The IP address type of the load balancer.
   */
  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  /**
   * The name of the load balancer.
   */
  public open fun loadBalancerName(): String = unwrap(this).getLoadBalancerName()

  /**
   * The name of the load balancer.
   */
  public open fun loadBalancerName(`value`: String) {
    unwrap(this).setLoadBalancerName(`value`)
  }

  /**
   * A Boolean value indicating whether session stickiness is enabled.
   */
  public open fun sessionStickinessEnabled(): Any? = unwrap(this).getSessionStickinessEnabled()

  /**
   * A Boolean value indicating whether session stickiness is enabled.
   */
  public open fun sessionStickinessEnabled(`value`: Boolean) {
    unwrap(this).setSessionStickinessEnabled(`value`)
  }

  /**
   * A Boolean value indicating whether session stickiness is enabled.
   */
  public open fun sessionStickinessEnabled(`value`: IResolvable) {
    unwrap(this).setSessionStickinessEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The time period, in seconds, after which the load balancer session stickiness cookie should be
   * considered stale.
   */
  public open fun sessionStickinessLbCookieDurationSeconds(): String? =
      unwrap(this).getSessionStickinessLbCookieDurationSeconds()

  /**
   * The time period, in seconds, after which the load balancer session stickiness cookie should be
   * considered stale.
   */
  public open fun sessionStickinessLbCookieDurationSeconds(`value`: String) {
    unwrap(this).setSessionStickinessLbCookieDurationSeconds(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The name of the TLS security policy for the load balancer.
   */
  public open fun tlsPolicyName(): String? = unwrap(this).getTlsPolicyName()

  /**
   * The name of the TLS security policy for the load balancer.
   */
  public open fun tlsPolicyName(`value`: String) {
    unwrap(this).setTlsPolicyName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lightsail.CfnLoadBalancer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Lightsail instances to attach to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-attachedinstances)
     * @param attachedInstances The Lightsail instances to attach to the load balancer. 
     */
    public fun attachedInstances(attachedInstances: List<String>)

    /**
     * The Lightsail instances to attach to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-attachedinstances)
     * @param attachedInstances The Lightsail instances to attach to the load balancer. 
     */
    public fun attachedInstances(vararg attachedInstances: String)

    /**
     * The path on the attached instance where the health check will be performed.
     *
     * If no path is specified, the load balancer tries to make a request to the default (root) page
     * ( `/index.html` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-healthcheckpath)
     * @param healthCheckPath The path on the attached instance where the health check will be
     * performed. 
     */
    public fun healthCheckPath(healthCheckPath: String)

    /**
     * The port that the load balancer uses to direct traffic to your Lightsail instances.
     *
     * For HTTP traffic, specify port `80` . For HTTPS traffic, specify port `443` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-instanceport)
     * @param instancePort The port that the load balancer uses to direct traffic to your Lightsail
     * instances. 
     */
    public fun instancePort(instancePort: Number)

    /**
     * The IP address type of the load balancer.
     *
     * The possible values are `ipv4` for IPv4 only, and `dualstack` for both IPv4 and IPv6.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-ipaddresstype)
     * @param ipAddressType The IP address type of the load balancer. 
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * The name of the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-loadbalancername)
     * @param loadBalancerName The name of the load balancer. 
     */
    public fun loadBalancerName(loadBalancerName: String)

    /**
     * A Boolean value indicating whether session stickiness is enabled.
     *
     * Enable session stickiness (also known as *session affinity* ) to bind a user's session to a
     * specific instance. This ensures that all requests from the user during the session are sent to
     * the same instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-sessionstickinessenabled)
     * @param sessionStickinessEnabled A Boolean value indicating whether session stickiness is
     * enabled. 
     */
    public fun sessionStickinessEnabled(sessionStickinessEnabled: Boolean)

    /**
     * A Boolean value indicating whether session stickiness is enabled.
     *
     * Enable session stickiness (also known as *session affinity* ) to bind a user's session to a
     * specific instance. This ensures that all requests from the user during the session are sent to
     * the same instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-sessionstickinessenabled)
     * @param sessionStickinessEnabled A Boolean value indicating whether session stickiness is
     * enabled. 
     */
    public fun sessionStickinessEnabled(sessionStickinessEnabled: IResolvable)

    /**
     * The time period, in seconds, after which the load balancer session stickiness cookie should
     * be considered stale.
     *
     * If you do not specify this parameter, the default value is 0, which indicates that the sticky
     * session should last for the duration of the browser session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-sessionstickinesslbcookiedurationseconds)
     * @param sessionStickinessLbCookieDurationSeconds The time period, in seconds, after which the
     * load balancer session stickiness cookie should be considered stale. 
     */
    public
        fun sessionStickinessLbCookieDurationSeconds(sessionStickinessLbCookieDurationSeconds: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the TLS security policy for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-tlspolicyname)
     * @param tlsPolicyName The name of the TLS security policy for the load balancer. 
     */
    public fun tlsPolicyName(tlsPolicyName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnLoadBalancer.Builder =
        software.amazon.awscdk.services.lightsail.CfnLoadBalancer.Builder.create(scope, id)

    /**
     * The Lightsail instances to attach to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-attachedinstances)
     * @param attachedInstances The Lightsail instances to attach to the load balancer. 
     */
    override fun attachedInstances(attachedInstances: List<String>) {
      cdkBuilder.attachedInstances(attachedInstances)
    }

    /**
     * The Lightsail instances to attach to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-attachedinstances)
     * @param attachedInstances The Lightsail instances to attach to the load balancer. 
     */
    override fun attachedInstances(vararg attachedInstances: String): Unit =
        attachedInstances(attachedInstances.toList())

    /**
     * The path on the attached instance where the health check will be performed.
     *
     * If no path is specified, the load balancer tries to make a request to the default (root) page
     * ( `/index.html` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-healthcheckpath)
     * @param healthCheckPath The path on the attached instance where the health check will be
     * performed. 
     */
    override fun healthCheckPath(healthCheckPath: String) {
      cdkBuilder.healthCheckPath(healthCheckPath)
    }

    /**
     * The port that the load balancer uses to direct traffic to your Lightsail instances.
     *
     * For HTTP traffic, specify port `80` . For HTTPS traffic, specify port `443` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-instanceport)
     * @param instancePort The port that the load balancer uses to direct traffic to your Lightsail
     * instances. 
     */
    override fun instancePort(instancePort: Number) {
      cdkBuilder.instancePort(instancePort)
    }

    /**
     * The IP address type of the load balancer.
     *
     * The possible values are `ipv4` for IPv4 only, and `dualstack` for both IPv4 and IPv6.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-ipaddresstype)
     * @param ipAddressType The IP address type of the load balancer. 
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * The name of the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-loadbalancername)
     * @param loadBalancerName The name of the load balancer. 
     */
    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /**
     * A Boolean value indicating whether session stickiness is enabled.
     *
     * Enable session stickiness (also known as *session affinity* ) to bind a user's session to a
     * specific instance. This ensures that all requests from the user during the session are sent to
     * the same instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-sessionstickinessenabled)
     * @param sessionStickinessEnabled A Boolean value indicating whether session stickiness is
     * enabled. 
     */
    override fun sessionStickinessEnabled(sessionStickinessEnabled: Boolean) {
      cdkBuilder.sessionStickinessEnabled(sessionStickinessEnabled)
    }

    /**
     * A Boolean value indicating whether session stickiness is enabled.
     *
     * Enable session stickiness (also known as *session affinity* ) to bind a user's session to a
     * specific instance. This ensures that all requests from the user during the session are sent to
     * the same instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-sessionstickinessenabled)
     * @param sessionStickinessEnabled A Boolean value indicating whether session stickiness is
     * enabled. 
     */
    override fun sessionStickinessEnabled(sessionStickinessEnabled: IResolvable) {
      cdkBuilder.sessionStickinessEnabled(sessionStickinessEnabled.let(IResolvable::unwrap))
    }

    /**
     * The time period, in seconds, after which the load balancer session stickiness cookie should
     * be considered stale.
     *
     * If you do not specify this parameter, the default value is 0, which indicates that the sticky
     * session should last for the duration of the browser session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-sessionstickinesslbcookiedurationseconds)
     * @param sessionStickinessLbCookieDurationSeconds The time period, in seconds, after which the
     * load balancer session stickiness cookie should be considered stale. 
     */
    override
        fun sessionStickinessLbCookieDurationSeconds(sessionStickinessLbCookieDurationSeconds: String) {
      cdkBuilder.sessionStickinessLbCookieDurationSeconds(sessionStickinessLbCookieDurationSeconds)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the TLS security policy for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-tlspolicyname)
     * @param tlsPolicyName The name of the TLS security policy for the load balancer. 
     */
    override fun tlsPolicyName(tlsPolicyName: String) {
      cdkBuilder.tlsPolicyName(tlsPolicyName)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnLoadBalancer =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lightsail.CfnLoadBalancer.CFN_RESOURCE_TYPE_NAME

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
