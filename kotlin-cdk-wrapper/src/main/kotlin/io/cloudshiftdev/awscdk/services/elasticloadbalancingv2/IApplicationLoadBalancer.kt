@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * An application load balancer.
 */
public interface IApplicationLoadBalancer : ILoadBalancerV2, IConnectable {
  /**
   * Add a new listener to this load balancer.
   *
   * @param id 
   * @param props 
   */
  public fun addListener(id: String, props: BaseApplicationListenerProps): ApplicationListener

  /**
   * Add a new listener to this load balancer.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c4214bb0ef19ba7cc886c0c0c590fdb239a96d82b7e5e0b4b1bbe44fe0af6df0")
  public fun addListener(id: String, props: BaseApplicationListenerProps.Builder.() -> Unit):
      ApplicationListener

  /**
   * The IP Address Type for this load balancer.
   *
   * If the
   * `&#64;aws-cdk/aws-elasticloadbalancingV2:albDualstackWithoutPublicIpv4SecurityGroupRulesDefault`
   * feature flag is set (the default for new projects), and `addListener()` is called with `open:
   * true`,
   * the load balancer's security group will automatically include both IPv4 and IPv6 ingress rules
   * when using `IpAddressType.DUAL_STACK_WITHOUT_PUBLIC_IPV4`.
   *
   * For existing projects that only have IPv4 rules, you can opt-in to IPv6 ingress rules
   * by enabling the feature flag in your cdk.json file. Note that enabling this feature flag
   * will modify existing security group rules.
   *
   * Default: IpAddressType.IPV4
   */
  public fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  /**
   * A list of listeners that have been added to the load balancer.
   *
   * This list is only valid for owned constructs.
   */
  public fun listeners(): List<ApplicationListener>

  /**
   * The ARN of this load balancer.
   */
  public fun loadBalancerArn(): String

  /**
   * All metrics available for this load balancer.
   */
  public fun metrics(): IApplicationLoadBalancerMetrics

  /**
   * The VPC this load balancer has been created in (if available).
   *
   * If this interface is the result of an import call to fromApplicationLoadBalancerAttributes,
   * the vpc attribute will be undefined unless specified in the optional properties of that method.
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer,
  ) : CdkObject(cdkObject),
      IApplicationLoadBalancer {
    /**
     * Add a new listener to this load balancer.
     *
     * @param id 
     * @param props 
     */
    override fun addListener(id: String, props: BaseApplicationListenerProps): ApplicationListener =
        unwrap(this).addListener(id,
        props.let(BaseApplicationListenerProps.Companion::unwrap)).let(ApplicationListener::wrap)

    /**
     * Add a new listener to this load balancer.
     *
     * @param id 
     * @param props 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4214bb0ef19ba7cc886c0c0c590fdb239a96d82b7e5e0b4b1bbe44fe0af6df0")
    override fun addListener(id: String, props: BaseApplicationListenerProps.Builder.() -> Unit):
        ApplicationListener = addListener(id, BaseApplicationListenerProps(props))

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * The network connections associated with this resource.
     */
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * The IP Address Type for this load balancer.
     *
     * If the
     * `&#64;aws-cdk/aws-elasticloadbalancingV2:albDualstackWithoutPublicIpv4SecurityGroupRulesDefault`
     * feature flag is set (the default for new projects), and `addListener()` is called with `open:
     * true`,
     * the load balancer's security group will automatically include both IPv4 and IPv6 ingress
     * rules
     * when using `IpAddressType.DUAL_STACK_WITHOUT_PUBLIC_IPV4`.
     *
     * For existing projects that only have IPv4 rules, you can opt-in to IPv6 ingress rules
     * by enabling the feature flag in your cdk.json file. Note that enabling this feature flag
     * will modify existing security group rules.
     *
     * Default: IpAddressType.IPV4
     */
    override fun ipAddressType(): IpAddressType? =
        unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

    /**
     * A list of listeners that have been added to the load balancer.
     *
     * This list is only valid for owned constructs.
     */
    override fun listeners(): List<ApplicationListener> =
        unwrap(this).getListeners().map(ApplicationListener::wrap)

    /**
     * The ARN of this load balancer.
     */
    override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

    /**
     * The canonical hosted zone ID of this load balancer.
     *
     * Example value: `Z2P70J7EXAMPLE`
     */
    override fun loadBalancerCanonicalHostedZoneId(): String =
        unwrap(this).getLoadBalancerCanonicalHostedZoneId()

    /**
     * The DNS name of this load balancer.
     *
     * Example value: `my-load-balancer-424835706.us-west-2.elb.amazonaws.com`
     */
    override fun loadBalancerDnsName(): String = unwrap(this).getLoadBalancerDnsName()

    /**
     * All metrics available for this load balancer.
     */
    override fun metrics(): IApplicationLoadBalancerMetrics =
        unwrap(this).getMetrics().let(IApplicationLoadBalancerMetrics::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The VPC this load balancer has been created in (if available).
     *
     * If this interface is the result of an import call to fromApplicationLoadBalancerAttributes,
     * the vpc attribute will be undefined unless specified in the optional properties of that
     * method.
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer):
        IApplicationLoadBalancer = CdkObjectWrappers.wrap(cdkObject) as? IApplicationLoadBalancer ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApplicationLoadBalancer):
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
  }
}
