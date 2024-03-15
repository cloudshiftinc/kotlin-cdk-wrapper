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

/**
 * Properties for defining a `CfnLoadBalancer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
 * CfnLoadBalancerProps cfnLoadBalancerProps = CfnLoadBalancerProps.builder()
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
public interface CfnLoadBalancerProps {
  /**
   * The Lightsail instances to attach to the load balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-attachedinstances)
   */
  public fun attachedInstances(): List<String> = unwrap(this).getAttachedInstances() ?: emptyList()

  /**
   * The path on the attached instance where the health check will be performed.
   *
   * If no path is specified, the load balancer tries to make a request to the default (root) page (
   * `/index.html` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-healthcheckpath)
   */
  public fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

  /**
   * The port that the load balancer uses to direct traffic to your Lightsail instances.
   *
   * For HTTP traffic, specify port `80` . For HTTPS traffic, specify port `443` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-instanceport)
   */
  public fun instancePort(): Number

  /**
   * The IP address type of the load balancer.
   *
   * The possible values are `ipv4` for IPv4 only, and `dualstack` for both IPv4 and IPv6.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-ipaddresstype)
   */
  public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * The name of the load balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-loadbalancername)
   */
  public fun loadBalancerName(): String

  /**
   * A Boolean value indicating whether session stickiness is enabled.
   *
   * Enable session stickiness (also known as *session affinity* ) to bind a user's session to a
   * specific instance. This ensures that all requests from the user during the session are sent to the
   * same instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-sessionstickinessenabled)
   */
  public fun sessionStickinessEnabled(): Any? = unwrap(this).getSessionStickinessEnabled()

  /**
   * The time period, in seconds, after which the load balancer session stickiness cookie should be
   * considered stale.
   *
   * If you do not specify this parameter, the default value is 0, which indicates that the sticky
   * session should last for the duration of the browser session.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-sessionstickinesslbcookiedurationseconds)
   */
  public fun sessionStickinessLbCookieDurationSeconds(): String? =
      unwrap(this).getSessionStickinessLbCookieDurationSeconds()

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the TLS security policy for the load balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-tlspolicyname)
   */
  public fun tlsPolicyName(): String? = unwrap(this).getTlsPolicyName()

  /**
   * A builder for [CfnLoadBalancerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attachedInstances The Lightsail instances to attach to the load balancer.
     */
    public fun attachedInstances(attachedInstances: List<String>)

    /**
     * @param attachedInstances The Lightsail instances to attach to the load balancer.
     */
    public fun attachedInstances(vararg attachedInstances: String)

    /**
     * @param healthCheckPath The path on the attached instance where the health check will be
     * performed.
     * If no path is specified, the load balancer tries to make a request to the default (root) page
     * ( `/index.html` ).
     */
    public fun healthCheckPath(healthCheckPath: String)

    /**
     * @param instancePort The port that the load balancer uses to direct traffic to your Lightsail
     * instances. 
     * For HTTP traffic, specify port `80` . For HTTPS traffic, specify port `443` .
     */
    public fun instancePort(instancePort: Number)

    /**
     * @param ipAddressType The IP address type of the load balancer.
     * The possible values are `ipv4` for IPv4 only, and `dualstack` for both IPv4 and IPv6.
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * @param loadBalancerName The name of the load balancer. 
     */
    public fun loadBalancerName(loadBalancerName: String)

    /**
     * @param sessionStickinessEnabled A Boolean value indicating whether session stickiness is
     * enabled.
     * Enable session stickiness (also known as *session affinity* ) to bind a user's session to a
     * specific instance. This ensures that all requests from the user during the session are sent to
     * the same instance.
     */
    public fun sessionStickinessEnabled(sessionStickinessEnabled: Boolean)

    /**
     * @param sessionStickinessEnabled A Boolean value indicating whether session stickiness is
     * enabled.
     * Enable session stickiness (also known as *session affinity* ) to bind a user's session to a
     * specific instance. This ensures that all requests from the user during the session are sent to
     * the same instance.
     */
    public fun sessionStickinessEnabled(sessionStickinessEnabled: IResolvable)

    /**
     * @param sessionStickinessLbCookieDurationSeconds The time period, in seconds, after which the
     * load balancer session stickiness cookie should be considered stale.
     * If you do not specify this parameter, the default value is 0, which indicates that the sticky
     * session should last for the duration of the browser session.
     */
    public
        fun sessionStickinessLbCookieDurationSeconds(sessionStickinessLbCookieDurationSeconds: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param tlsPolicyName The name of the TLS security policy for the load balancer.
     */
    public fun tlsPolicyName(tlsPolicyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnLoadBalancerProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerProps.builder()

    /**
     * @param attachedInstances The Lightsail instances to attach to the load balancer.
     */
    override fun attachedInstances(attachedInstances: List<String>) {
      cdkBuilder.attachedInstances(attachedInstances)
    }

    /**
     * @param attachedInstances The Lightsail instances to attach to the load balancer.
     */
    override fun attachedInstances(vararg attachedInstances: String): Unit =
        attachedInstances(attachedInstances.toList())

    /**
     * @param healthCheckPath The path on the attached instance where the health check will be
     * performed.
     * If no path is specified, the load balancer tries to make a request to the default (root) page
     * ( `/index.html` ).
     */
    override fun healthCheckPath(healthCheckPath: String) {
      cdkBuilder.healthCheckPath(healthCheckPath)
    }

    /**
     * @param instancePort The port that the load balancer uses to direct traffic to your Lightsail
     * instances. 
     * For HTTP traffic, specify port `80` . For HTTPS traffic, specify port `443` .
     */
    override fun instancePort(instancePort: Number) {
      cdkBuilder.instancePort(instancePort)
    }

    /**
     * @param ipAddressType The IP address type of the load balancer.
     * The possible values are `ipv4` for IPv4 only, and `dualstack` for both IPv4 and IPv6.
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * @param loadBalancerName The name of the load balancer. 
     */
    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /**
     * @param sessionStickinessEnabled A Boolean value indicating whether session stickiness is
     * enabled.
     * Enable session stickiness (also known as *session affinity* ) to bind a user's session to a
     * specific instance. This ensures that all requests from the user during the session are sent to
     * the same instance.
     */
    override fun sessionStickinessEnabled(sessionStickinessEnabled: Boolean) {
      cdkBuilder.sessionStickinessEnabled(sessionStickinessEnabled)
    }

    /**
     * @param sessionStickinessEnabled A Boolean value indicating whether session stickiness is
     * enabled.
     * Enable session stickiness (also known as *session affinity* ) to bind a user's session to a
     * specific instance. This ensures that all requests from the user during the session are sent to
     * the same instance.
     */
    override fun sessionStickinessEnabled(sessionStickinessEnabled: IResolvable) {
      cdkBuilder.sessionStickinessEnabled(sessionStickinessEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param sessionStickinessLbCookieDurationSeconds The time period, in seconds, after which the
     * load balancer session stickiness cookie should be considered stale.
     * If you do not specify this parameter, the default value is 0, which indicates that the sticky
     * session should last for the duration of the browser session.
     */
    override
        fun sessionStickinessLbCookieDurationSeconds(sessionStickinessLbCookieDurationSeconds: String) {
      cdkBuilder.sessionStickinessLbCookieDurationSeconds(sessionStickinessLbCookieDurationSeconds)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param tlsPolicyName The name of the TLS security policy for the load balancer.
     */
    override fun tlsPolicyName(tlsPolicyName: String) {
      cdkBuilder.tlsPolicyName(tlsPolicyName)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnLoadBalancerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnLoadBalancerProps,
  ) : CdkObject(cdkObject), CfnLoadBalancerProps {
    /**
     * The Lightsail instances to attach to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-attachedinstances)
     */
    override fun attachedInstances(): List<String> = unwrap(this).getAttachedInstances() ?:
        emptyList()

    /**
     * The path on the attached instance where the health check will be performed.
     *
     * If no path is specified, the load balancer tries to make a request to the default (root) page
     * ( `/index.html` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-healthcheckpath)
     */
    override fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

    /**
     * The port that the load balancer uses to direct traffic to your Lightsail instances.
     *
     * For HTTP traffic, specify port `80` . For HTTPS traffic, specify port `443` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-instanceport)
     */
    override fun instancePort(): Number = unwrap(this).getInstancePort()

    /**
     * The IP address type of the load balancer.
     *
     * The possible values are `ipv4` for IPv4 only, and `dualstack` for both IPv4 and IPv6.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-ipaddresstype)
     */
    override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    /**
     * The name of the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-loadbalancername)
     */
    override fun loadBalancerName(): String = unwrap(this).getLoadBalancerName()

    /**
     * A Boolean value indicating whether session stickiness is enabled.
     *
     * Enable session stickiness (also known as *session affinity* ) to bind a user's session to a
     * specific instance. This ensures that all requests from the user during the session are sent to
     * the same instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-sessionstickinessenabled)
     */
    override fun sessionStickinessEnabled(): Any? = unwrap(this).getSessionStickinessEnabled()

    /**
     * The time period, in seconds, after which the load balancer session stickiness cookie should
     * be considered stale.
     *
     * If you do not specify this parameter, the default value is 0, which indicates that the sticky
     * session should last for the duration of the browser session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-sessionstickinesslbcookiedurationseconds)
     */
    override fun sessionStickinessLbCookieDurationSeconds(): String? =
        unwrap(this).getSessionStickinessLbCookieDurationSeconds()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the TLS security policy for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-tlspolicyname)
     */
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
