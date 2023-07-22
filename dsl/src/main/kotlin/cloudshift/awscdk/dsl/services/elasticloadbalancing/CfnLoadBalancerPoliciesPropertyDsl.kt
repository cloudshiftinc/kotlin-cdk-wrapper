@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer

/**
 * Specifies policies for your Classic Load Balancer.
 *
 * To associate policies with a listener, use the
 * [PolicyNames](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-listener.html#cfn-ec2-elb-listener-policynames)
 * property for the listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancing.*;
 * Object attributes;
 * PoliciesProperty policiesProperty = PoliciesProperty.builder()
 * .attributes(List.of(attributes))
 * .policyName("policyName")
 * .policyType("policyType")
 * // the properties below are optional
 * .instancePorts(List.of("instancePorts"))
 * .loadBalancerPorts(List.of("loadBalancerPorts"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-policies.html)
 */
@CdkDslMarker
public class CfnLoadBalancerPoliciesPropertyDsl {
  private val cdkBuilder: CfnLoadBalancer.PoliciesProperty.Builder =
      CfnLoadBalancer.PoliciesProperty.builder()

  private val _attributes: MutableList<Any> = mutableListOf()

  private val _instancePorts: MutableList<String> = mutableListOf()

  private val _loadBalancerPorts: MutableList<String> = mutableListOf()

  /**
   * @param attributes The policy attributes. 
   */
  public fun attributes(vararg attributes: Any) {
    _attributes.addAll(listOf(*attributes))
  }

  /**
   * @param attributes The policy attributes. 
   */
  public fun attributes(attributes: Collection<Any>) {
    _attributes.addAll(attributes)
  }

  /**
   * @param attributes The policy attributes. 
   */
  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  /**
   * @param instancePorts The instance ports for the policy.
   * Required only for some policy types.
   */
  public fun instancePorts(vararg instancePorts: String) {
    _instancePorts.addAll(listOf(*instancePorts))
  }

  /**
   * @param instancePorts The instance ports for the policy.
   * Required only for some policy types.
   */
  public fun instancePorts(instancePorts: Collection<String>) {
    _instancePorts.addAll(instancePorts)
  }

  /**
   * @param loadBalancerPorts The load balancer ports for the policy.
   * Required only for some policy types.
   */
  public fun loadBalancerPorts(vararg loadBalancerPorts: String) {
    _loadBalancerPorts.addAll(listOf(*loadBalancerPorts))
  }

  /**
   * @param loadBalancerPorts The load balancer ports for the policy.
   * Required only for some policy types.
   */
  public fun loadBalancerPorts(loadBalancerPorts: Collection<String>) {
    _loadBalancerPorts.addAll(loadBalancerPorts)
  }

  /**
   * @param policyName The name of the policy. 
   */
  public fun policyName(policyName: String) {
    cdkBuilder.policyName(policyName)
  }

  /**
   * @param policyType The name of the policy type. 
   */
  public fun policyType(policyType: String) {
    cdkBuilder.policyType(policyType)
  }

  public fun build(): CfnLoadBalancer.PoliciesProperty {
    if(_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
    if(_instancePorts.isNotEmpty()) cdkBuilder.instancePorts(_instancePorts)
    if(_loadBalancerPorts.isNotEmpty()) cdkBuilder.loadBalancerPorts(_loadBalancerPorts)
    return cdkBuilder.build()
  }
}
