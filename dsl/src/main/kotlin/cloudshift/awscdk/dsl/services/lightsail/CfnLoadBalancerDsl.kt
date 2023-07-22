@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnLoadBalancer
import software.constructs.Construct

@CdkDslMarker
public class CfnLoadBalancerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLoadBalancer.Builder = CfnLoadBalancer.Builder.create(scope, id)

  private val _attachedInstances: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The Lightsail instances to attach to the load balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-attachedinstances)
   * @param attachedInstances The Lightsail instances to attach to the load balancer. 
   */
  public fun attachedInstances(vararg attachedInstances: String) {
    _attachedInstances.addAll(listOf(*attachedInstances))
  }

  /**
   * The Lightsail instances to attach to the load balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-attachedinstances)
   * @param attachedInstances The Lightsail instances to attach to the load balancer. 
   */
  public fun attachedInstances(attachedInstances: Collection<String>) {
    _attachedInstances.addAll(attachedInstances)
  }

  /**
   * The path on the attached instance where the health check will be performed.
   *
   * If no path is specified, the load balancer tries to make a request to the default (root) page (
   * `/index.html` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-healthcheckpath)
   * @param healthCheckPath The path on the attached instance where the health check will be
   * performed. 
   */
  public fun healthCheckPath(healthCheckPath: String) {
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
  public fun instancePort(instancePort: Number) {
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
  public fun ipAddressType(ipAddressType: String) {
    cdkBuilder.ipAddressType(ipAddressType)
  }

  /**
   * The name of the load balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-loadbalancername)
   * @param loadBalancerName The name of the load balancer. 
   */
  public fun loadBalancerName(loadBalancerName: String) {
    cdkBuilder.loadBalancerName(loadBalancerName)
  }

  /**
   * A Boolean value indicating whether session stickiness is enabled.
   *
   * Enable session stickiness (also known as *session affinity* ) to bind a user's session to a
   * specific instance. This ensures that all requests from the user during the session are sent to the
   * same instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-sessionstickinessenabled)
   * @param sessionStickinessEnabled A Boolean value indicating whether session stickiness is
   * enabled. 
   */
  public fun sessionStickinessEnabled(sessionStickinessEnabled: Boolean) {
    cdkBuilder.sessionStickinessEnabled(sessionStickinessEnabled)
  }

  /**
   * A Boolean value indicating whether session stickiness is enabled.
   *
   * Enable session stickiness (also known as *session affinity* ) to bind a user's session to a
   * specific instance. This ensures that all requests from the user during the session are sent to the
   * same instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-sessionstickinessenabled)
   * @param sessionStickinessEnabled A Boolean value indicating whether session stickiness is
   * enabled. 
   */
  public fun sessionStickinessEnabled(sessionStickinessEnabled: IResolvable) {
    cdkBuilder.sessionStickinessEnabled(sessionStickinessEnabled)
  }

  /**
   * The time period, in seconds, after which the load balancer session stickiness cookie should be
   * considered stale.
   *
   * If you do not specify this parameter, the default value is 0, which indicates that the sticky
   * session should last for the duration of the browser session.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-sessionstickinesslbcookiedurationseconds)
   * @param sessionStickinessLbCookieDurationSeconds The time period, in seconds, after which the
   * load balancer session stickiness cookie should be considered stale. 
   */
  public
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
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
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
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The name of the TLS security policy for the load balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-loadbalancer.html#cfn-lightsail-loadbalancer-tlspolicyname)
   * @param tlsPolicyName The name of the TLS security policy for the load balancer. 
   */
  public fun tlsPolicyName(tlsPolicyName: String) {
    cdkBuilder.tlsPolicyName(tlsPolicyName)
  }

  public fun build(): CfnLoadBalancer {
    if(_attachedInstances.isNotEmpty()) cdkBuilder.attachedInstances(_attachedInstances)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
