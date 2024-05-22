@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLoadBalancer`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancing.*;
 * Object attributes;
 * CfnLoadBalancerProps cfnLoadBalancerProps = CfnLoadBalancerProps.builder()
 * .listeners(List.of(ListenersProperty.builder()
 * .instancePort("instancePort")
 * .loadBalancerPort("loadBalancerPort")
 * .protocol("protocol")
 * // the properties below are optional
 * .instanceProtocol("instanceProtocol")
 * .policyNames(List.of("policyNames"))
 * .sslCertificateId("sslCertificateId")
 * .build()))
 * // the properties below are optional
 * .accessLoggingPolicy(AccessLoggingPolicyProperty.builder()
 * .enabled(false)
 * .s3BucketName("s3BucketName")
 * // the properties below are optional
 * .emitInterval(123)
 * .s3BucketPrefix("s3BucketPrefix")
 * .build())
 * .appCookieStickinessPolicy(List.of(AppCookieStickinessPolicyProperty.builder()
 * .cookieName("cookieName")
 * .policyName("policyName")
 * .build()))
 * .availabilityZones(List.of("availabilityZones"))
 * .connectionDrainingPolicy(ConnectionDrainingPolicyProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .timeout(123)
 * .build())
 * .connectionSettings(ConnectionSettingsProperty.builder()
 * .idleTimeout(123)
 * .build())
 * .crossZone(false)
 * .healthCheck(HealthCheckProperty.builder()
 * .healthyThreshold("healthyThreshold")
 * .interval("interval")
 * .target("target")
 * .timeout("timeout")
 * .unhealthyThreshold("unhealthyThreshold")
 * .build())
 * .instances(List.of("instances"))
 * .lbCookieStickinessPolicy(List.of(LBCookieStickinessPolicyProperty.builder()
 * .cookieExpirationPeriod("cookieExpirationPeriod")
 * .policyName("policyName")
 * .build()))
 * .loadBalancerName("loadBalancerName")
 * .policies(List.of(PoliciesProperty.builder()
 * .attributes(List.of(attributes))
 * .policyName("policyName")
 * .policyType("policyType")
 * // the properties below are optional
 * .instancePorts(List.of("instancePorts"))
 * .loadBalancerPorts(List.of("loadBalancerPorts"))
 * .build()))
 * .scheme("scheme")
 * .securityGroups(List.of("securityGroups"))
 * .subnets(List.of("subnets"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html)
 */
public interface CfnLoadBalancerProps {
  /**
   * Information about where and how access logs are stored for the load balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy)
   */
  public fun accessLoggingPolicy(): Any? = unwrap(this).getAccessLoggingPolicy()

  /**
   * Information about a policy for application-controlled session stickiness.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy)
   */
  public fun appCookieStickinessPolicy(): Any? = unwrap(this).getAppCookieStickinessPolicy()

  /**
   * The Availability Zones for a load balancer in a default VPC.
   *
   * For a load balancer in a nondefault VPC, specify `Subnets` instead.
   *
   * Update requires replacement if you did not previously specify an Availability Zone or if you
   * are removing all Availability Zones. Otherwise, update requires no interruption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-availabilityzones)
   */
  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

  /**
   * If enabled, the load balancer allows existing requests to complete before the load balancer
   * shifts traffic away from a deregistered or unhealthy instance.
   *
   * For more information, see [Configure connection
   * draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
   * in the *User Guide for Classic Load Balancers* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-connectiondrainingpolicy)
   */
  public fun connectionDrainingPolicy(): Any? = unwrap(this).getConnectionDrainingPolicy()

  /**
   * If enabled, the load balancer allows the connections to remain idle (no data is sent over the
   * connection) for the specified duration.
   *
   * By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both
   * front-end and back-end connections of your load balancer. For more information, see [Configure
   * idle connection
   * timeout](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html)
   * in the *User Guide for Classic Load Balancers* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-connectionsettings)
   */
  public fun connectionSettings(): Any? = unwrap(this).getConnectionSettings()

  /**
   * If enabled, the load balancer routes the request traffic evenly across all instances regardless
   * of the Availability Zones.
   *
   * For more information, see [Configure cross-zone load
   * balancing](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html)
   * in the *User Guide for Classic Load Balancers* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-crosszone)
   */
  public fun crossZone(): Any? = unwrap(this).getCrossZone()

  /**
   * The health check settings to use when evaluating the health of your EC2 instances.
   *
   * Update requires replacement if you did not previously specify health check settings or if you
   * are removing the health check settings. Otherwise, update requires no interruption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-healthcheck)
   */
  public fun healthCheck(): Any? = unwrap(this).getHealthCheck()

  /**
   * The IDs of the instances for the load balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-instances)
   */
  public fun instances(): List<String> = unwrap(this).getInstances() ?: emptyList()

  /**
   * Information about a policy for duration-based session stickiness.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy)
   */
  public fun lbCookieStickinessPolicy(): Any? = unwrap(this).getLbCookieStickinessPolicy()

  /**
   * The listeners for the load balancer. You can specify at most one listener per port.
   *
   * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
   * and creates a new one with the specified properties. While the new listener is being created,
   * clients cannot connect to the load balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-listeners)
   */
  public fun listeners(): Any

  /**
   * The name of the load balancer.
   *
   * This name must be unique within your set of load balancers for the region.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the load
   * balancer. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   * If you specify a name, you cannot perform updates that require replacement of this resource, but
   * you can perform other updates. To replace the resource, specify a new name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-loadbalancername)
   */
  public fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

  /**
   * The policies defined for your Classic Load Balancer.
   *
   * Specify only back-end server policies.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-policies)
   */
  public fun policies(): Any? = unwrap(this).getPolicies()

  /**
   * The type of load balancer. Valid only for load balancers in a VPC.
   *
   * If `Scheme` is `internet-facing` , the load balancer has a public DNS name that resolves to a
   * public IP address.
   *
   * If `Scheme` is `internal` , the load balancer has a public DNS name that resolves to a private
   * IP address.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-scheme)
   */
  public fun scheme(): String? = unwrap(this).getScheme()

  /**
   * The security groups for the load balancer.
   *
   * Valid only for load balancers in a VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-securitygroups)
   */
  public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  /**
   * The IDs of the subnets for the load balancer. You can specify at most one subnet per
   * Availability Zone.
   *
   * Update requires replacement if you did not previously specify a subnet or if you are removing
   * all subnets. Otherwise, update requires no interruption. To update to a different subnet in the
   * current Availability Zone, you must first update to a subnet in a different Availability Zone,
   * then update to the new subnet in the original Availability Zone.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-subnets)
   */
  public fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

  /**
   * The tags associated with a load balancer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLoadBalancerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessLoggingPolicy Information about where and how access logs are stored for the
     * load balancer.
     */
    public fun accessLoggingPolicy(accessLoggingPolicy: IResolvable)

    /**
     * @param accessLoggingPolicy Information about where and how access logs are stored for the
     * load balancer.
     */
    public fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty)

    /**
     * @param accessLoggingPolicy Information about where and how access logs are stored for the
     * load balancer.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21630f019adef32227375e8027479ed097d0f60931ab92d3fbc91fbfcbf954de")
    public
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit)

    /**
     * @param appCookieStickinessPolicy Information about a policy for application-controlled
     * session stickiness.
     */
    public fun appCookieStickinessPolicy(appCookieStickinessPolicy: IResolvable)

    /**
     * @param appCookieStickinessPolicy Information about a policy for application-controlled
     * session stickiness.
     */
    public fun appCookieStickinessPolicy(appCookieStickinessPolicy: List<Any>)

    /**
     * @param appCookieStickinessPolicy Information about a policy for application-controlled
     * session stickiness.
     */
    public fun appCookieStickinessPolicy(vararg appCookieStickinessPolicy: Any)

    /**
     * @param availabilityZones The Availability Zones for a load balancer in a default VPC.
     * For a load balancer in a nondefault VPC, specify `Subnets` instead.
     *
     * Update requires replacement if you did not previously specify an Availability Zone or if you
     * are removing all Availability Zones. Otherwise, update requires no interruption.
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * @param availabilityZones The Availability Zones for a load balancer in a default VPC.
     * For a load balancer in a nondefault VPC, specify `Subnets` instead.
     *
     * Update requires replacement if you did not previously specify an Availability Zone or if you
     * are removing all Availability Zones. Otherwise, update requires no interruption.
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * @param connectionDrainingPolicy If enabled, the load balancer allows existing requests to
     * complete before the load balancer shifts traffic away from a deregistered or unhealthy instance.
     * For more information, see [Configure connection
     * draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    public fun connectionDrainingPolicy(connectionDrainingPolicy: IResolvable)

    /**
     * @param connectionDrainingPolicy If enabled, the load balancer allows existing requests to
     * complete before the load balancer shifts traffic away from a deregistered or unhealthy instance.
     * For more information, see [Configure connection
     * draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    public
        fun connectionDrainingPolicy(connectionDrainingPolicy: CfnLoadBalancer.ConnectionDrainingPolicyProperty)

    /**
     * @param connectionDrainingPolicy If enabled, the load balancer allows existing requests to
     * complete before the load balancer shifts traffic away from a deregistered or unhealthy instance.
     * For more information, see [Configure connection
     * draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8b1dd4718875e9e808ec4070b292385ed7cee5890a3f8c4be43dd3b1f79531b")
    public
        fun connectionDrainingPolicy(connectionDrainingPolicy: CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder.() -> Unit)

    /**
     * @param connectionSettings If enabled, the load balancer allows the connections to remain idle
     * (no data is sent over the connection) for the specified duration.
     * By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both
     * front-end and back-end connections of your load balancer. For more information, see [Configure
     * idle connection
     * timeout](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    public fun connectionSettings(connectionSettings: IResolvable)

    /**
     * @param connectionSettings If enabled, the load balancer allows the connections to remain idle
     * (no data is sent over the connection) for the specified duration.
     * By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both
     * front-end and back-end connections of your load balancer. For more information, see [Configure
     * idle connection
     * timeout](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    public fun connectionSettings(connectionSettings: CfnLoadBalancer.ConnectionSettingsProperty)

    /**
     * @param connectionSettings If enabled, the load balancer allows the connections to remain idle
     * (no data is sent over the connection) for the specified duration.
     * By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both
     * front-end and back-end connections of your load balancer. For more information, see [Configure
     * idle connection
     * timeout](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7670306a43c0c8e5c175210ce2adfe4df9a208cc5bfd248260f3a3f6b9e4a205")
    public
        fun connectionSettings(connectionSettings: CfnLoadBalancer.ConnectionSettingsProperty.Builder.() -> Unit)

    /**
     * @param crossZone If enabled, the load balancer routes the request traffic evenly across all
     * instances regardless of the Availability Zones.
     * For more information, see [Configure cross-zone load
     * balancing](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    public fun crossZone(crossZone: Boolean)

    /**
     * @param crossZone If enabled, the load balancer routes the request traffic evenly across all
     * instances regardless of the Availability Zones.
     * For more information, see [Configure cross-zone load
     * balancing](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    public fun crossZone(crossZone: IResolvable)

    /**
     * @param healthCheck The health check settings to use when evaluating the health of your EC2
     * instances.
     * Update requires replacement if you did not previously specify health check settings or if you
     * are removing the health check settings. Otherwise, update requires no interruption.
     */
    public fun healthCheck(healthCheck: IResolvable)

    /**
     * @param healthCheck The health check settings to use when evaluating the health of your EC2
     * instances.
     * Update requires replacement if you did not previously specify health check settings or if you
     * are removing the health check settings. Otherwise, update requires no interruption.
     */
    public fun healthCheck(healthCheck: CfnLoadBalancer.HealthCheckProperty)

    /**
     * @param healthCheck The health check settings to use when evaluating the health of your EC2
     * instances.
     * Update requires replacement if you did not previously specify health check settings or if you
     * are removing the health check settings. Otherwise, update requires no interruption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb0026d3683ec299419366ce90e7c230bcc77c5a6fb78a0b56f084fe9ab4d35d")
    public fun healthCheck(healthCheck: CfnLoadBalancer.HealthCheckProperty.Builder.() -> Unit)

    /**
     * @param instances The IDs of the instances for the load balancer.
     */
    public fun instances(instances: List<String>)

    /**
     * @param instances The IDs of the instances for the load balancer.
     */
    public fun instances(vararg instances: String)

    /**
     * @param lbCookieStickinessPolicy Information about a policy for duration-based session
     * stickiness.
     */
    public fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: IResolvable)

    /**
     * @param lbCookieStickinessPolicy Information about a policy for duration-based session
     * stickiness.
     */
    public fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: List<Any>)

    /**
     * @param lbCookieStickinessPolicy Information about a policy for duration-based session
     * stickiness.
     */
    public fun lbCookieStickinessPolicy(vararg lbCookieStickinessPolicy: Any)

    /**
     * @param listeners The listeners for the load balancer. You can specify at most one listener
     * per port. 
     * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
     * and creates a new one with the specified properties. While the new listener is being created,
     * clients cannot connect to the load balancer.
     */
    public fun listeners(listeners: IResolvable)

    /**
     * @param listeners The listeners for the load balancer. You can specify at most one listener
     * per port. 
     * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
     * and creates a new one with the specified properties. While the new listener is being created,
     * clients cannot connect to the load balancer.
     */
    public fun listeners(listeners: List<Any>)

    /**
     * @param listeners The listeners for the load balancer. You can specify at most one listener
     * per port. 
     * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
     * and creates a new one with the specified properties. While the new listener is being created,
     * clients cannot connect to the load balancer.
     */
    public fun listeners(vararg listeners: Any)

    /**
     * @param loadBalancerName The name of the load balancer.
     * This name must be unique within your set of load balancers for the region.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the load
     * balancer. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     * If you specify a name, you cannot perform updates that require replacement of this resource, but
     * you can perform other updates. To replace the resource, specify a new name.
     */
    public fun loadBalancerName(loadBalancerName: String)

    /**
     * @param policies The policies defined for your Classic Load Balancer.
     * Specify only back-end server policies.
     */
    public fun policies(policies: IResolvable)

    /**
     * @param policies The policies defined for your Classic Load Balancer.
     * Specify only back-end server policies.
     */
    public fun policies(policies: List<Any>)

    /**
     * @param policies The policies defined for your Classic Load Balancer.
     * Specify only back-end server policies.
     */
    public fun policies(vararg policies: Any)

    /**
     * @param scheme The type of load balancer. Valid only for load balancers in a VPC.
     * If `Scheme` is `internet-facing` , the load balancer has a public DNS name that resolves to a
     * public IP address.
     *
     * If `Scheme` is `internal` , the load balancer has a public DNS name that resolves to a
     * private IP address.
     */
    public fun scheme(scheme: String)

    /**
     * @param securityGroups The security groups for the load balancer.
     * Valid only for load balancers in a VPC.
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * @param securityGroups The security groups for the load balancer.
     * Valid only for load balancers in a VPC.
     */
    public fun securityGroups(vararg securityGroups: String)

    /**
     * @param subnets The IDs of the subnets for the load balancer. You can specify at most one
     * subnet per Availability Zone.
     * Update requires replacement if you did not previously specify a subnet or if you are removing
     * all subnets. Otherwise, update requires no interruption. To update to a different subnet in the
     * current Availability Zone, you must first update to a subnet in a different Availability Zone,
     * then update to the new subnet in the original Availability Zone.
     */
    public fun subnets(subnets: List<String>)

    /**
     * @param subnets The IDs of the subnets for the load balancer. You can specify at most one
     * subnet per Availability Zone.
     * Update requires replacement if you did not previously specify a subnet or if you are removing
     * all subnets. Otherwise, update requires no interruption. To update to a different subnet in the
     * current Availability Zone, you must first update to a subnet in a different Availability Zone,
     * then update to the new subnet in the original Availability Zone.
     */
    public fun subnets(vararg subnets: String)

    /**
     * @param tags The tags associated with a load balancer.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags associated with a load balancer.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps.builder()

    /**
     * @param accessLoggingPolicy Information about where and how access logs are stored for the
     * load balancer.
     */
    override fun accessLoggingPolicy(accessLoggingPolicy: IResolvable) {
      cdkBuilder.accessLoggingPolicy(accessLoggingPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param accessLoggingPolicy Information about where and how access logs are stored for the
     * load balancer.
     */
    override
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty) {
      cdkBuilder.accessLoggingPolicy(accessLoggingPolicy.let(CfnLoadBalancer.AccessLoggingPolicyProperty.Companion::unwrap))
    }

    /**
     * @param accessLoggingPolicy Information about where and how access logs are stored for the
     * load balancer.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21630f019adef32227375e8027479ed097d0f60931ab92d3fbc91fbfcbf954de")
    override
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit):
        Unit = accessLoggingPolicy(CfnLoadBalancer.AccessLoggingPolicyProperty(accessLoggingPolicy))

    /**
     * @param appCookieStickinessPolicy Information about a policy for application-controlled
     * session stickiness.
     */
    override fun appCookieStickinessPolicy(appCookieStickinessPolicy: IResolvable) {
      cdkBuilder.appCookieStickinessPolicy(appCookieStickinessPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param appCookieStickinessPolicy Information about a policy for application-controlled
     * session stickiness.
     */
    override fun appCookieStickinessPolicy(appCookieStickinessPolicy: List<Any>) {
      cdkBuilder.appCookieStickinessPolicy(appCookieStickinessPolicy.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param appCookieStickinessPolicy Information about a policy for application-controlled
     * session stickiness.
     */
    override fun appCookieStickinessPolicy(vararg appCookieStickinessPolicy: Any): Unit =
        appCookieStickinessPolicy(appCookieStickinessPolicy.toList())

    /**
     * @param availabilityZones The Availability Zones for a load balancer in a default VPC.
     * For a load balancer in a nondefault VPC, specify `Subnets` instead.
     *
     * Update requires replacement if you did not previously specify an Availability Zone or if you
     * are removing all Availability Zones. Otherwise, update requires no interruption.
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * @param availabilityZones The Availability Zones for a load balancer in a default VPC.
     * For a load balancer in a nondefault VPC, specify `Subnets` instead.
     *
     * Update requires replacement if you did not previously specify an Availability Zone or if you
     * are removing all Availability Zones. Otherwise, update requires no interruption.
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * @param connectionDrainingPolicy If enabled, the load balancer allows existing requests to
     * complete before the load balancer shifts traffic away from a deregistered or unhealthy instance.
     * For more information, see [Configure connection
     * draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    override fun connectionDrainingPolicy(connectionDrainingPolicy: IResolvable) {
      cdkBuilder.connectionDrainingPolicy(connectionDrainingPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param connectionDrainingPolicy If enabled, the load balancer allows existing requests to
     * complete before the load balancer shifts traffic away from a deregistered or unhealthy instance.
     * For more information, see [Configure connection
     * draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    override
        fun connectionDrainingPolicy(connectionDrainingPolicy: CfnLoadBalancer.ConnectionDrainingPolicyProperty) {
      cdkBuilder.connectionDrainingPolicy(connectionDrainingPolicy.let(CfnLoadBalancer.ConnectionDrainingPolicyProperty.Companion::unwrap))
    }

    /**
     * @param connectionDrainingPolicy If enabled, the load balancer allows existing requests to
     * complete before the load balancer shifts traffic away from a deregistered or unhealthy instance.
     * For more information, see [Configure connection
     * draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8b1dd4718875e9e808ec4070b292385ed7cee5890a3f8c4be43dd3b1f79531b")
    override
        fun connectionDrainingPolicy(connectionDrainingPolicy: CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder.() -> Unit):
        Unit =
        connectionDrainingPolicy(CfnLoadBalancer.ConnectionDrainingPolicyProperty(connectionDrainingPolicy))

    /**
     * @param connectionSettings If enabled, the load balancer allows the connections to remain idle
     * (no data is sent over the connection) for the specified duration.
     * By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both
     * front-end and back-end connections of your load balancer. For more information, see [Configure
     * idle connection
     * timeout](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    override fun connectionSettings(connectionSettings: IResolvable) {
      cdkBuilder.connectionSettings(connectionSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param connectionSettings If enabled, the load balancer allows the connections to remain idle
     * (no data is sent over the connection) for the specified duration.
     * By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both
     * front-end and back-end connections of your load balancer. For more information, see [Configure
     * idle connection
     * timeout](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    override
        fun connectionSettings(connectionSettings: CfnLoadBalancer.ConnectionSettingsProperty) {
      cdkBuilder.connectionSettings(connectionSettings.let(CfnLoadBalancer.ConnectionSettingsProperty.Companion::unwrap))
    }

    /**
     * @param connectionSettings If enabled, the load balancer allows the connections to remain idle
     * (no data is sent over the connection) for the specified duration.
     * By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both
     * front-end and back-end connections of your load balancer. For more information, see [Configure
     * idle connection
     * timeout](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7670306a43c0c8e5c175210ce2adfe4df9a208cc5bfd248260f3a3f6b9e4a205")
    override
        fun connectionSettings(connectionSettings: CfnLoadBalancer.ConnectionSettingsProperty.Builder.() -> Unit):
        Unit = connectionSettings(CfnLoadBalancer.ConnectionSettingsProperty(connectionSettings))

    /**
     * @param crossZone If enabled, the load balancer routes the request traffic evenly across all
     * instances regardless of the Availability Zones.
     * For more information, see [Configure cross-zone load
     * balancing](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    override fun crossZone(crossZone: Boolean) {
      cdkBuilder.crossZone(crossZone)
    }

    /**
     * @param crossZone If enabled, the load balancer routes the request traffic evenly across all
     * instances regardless of the Availability Zones.
     * For more information, see [Configure cross-zone load
     * balancing](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html)
     * in the *User Guide for Classic Load Balancers* .
     */
    override fun crossZone(crossZone: IResolvable) {
      cdkBuilder.crossZone(crossZone.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param healthCheck The health check settings to use when evaluating the health of your EC2
     * instances.
     * Update requires replacement if you did not previously specify health check settings or if you
     * are removing the health check settings. Otherwise, update requires no interruption.
     */
    override fun healthCheck(healthCheck: IResolvable) {
      cdkBuilder.healthCheck(healthCheck.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param healthCheck The health check settings to use when evaluating the health of your EC2
     * instances.
     * Update requires replacement if you did not previously specify health check settings or if you
     * are removing the health check settings. Otherwise, update requires no interruption.
     */
    override fun healthCheck(healthCheck: CfnLoadBalancer.HealthCheckProperty) {
      cdkBuilder.healthCheck(healthCheck.let(CfnLoadBalancer.HealthCheckProperty.Companion::unwrap))
    }

    /**
     * @param healthCheck The health check settings to use when evaluating the health of your EC2
     * instances.
     * Update requires replacement if you did not previously specify health check settings or if you
     * are removing the health check settings. Otherwise, update requires no interruption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb0026d3683ec299419366ce90e7c230bcc77c5a6fb78a0b56f084fe9ab4d35d")
    override fun healthCheck(healthCheck: CfnLoadBalancer.HealthCheckProperty.Builder.() -> Unit):
        Unit = healthCheck(CfnLoadBalancer.HealthCheckProperty(healthCheck))

    /**
     * @param instances The IDs of the instances for the load balancer.
     */
    override fun instances(instances: List<String>) {
      cdkBuilder.instances(instances)
    }

    /**
     * @param instances The IDs of the instances for the load balancer.
     */
    override fun instances(vararg instances: String): Unit = instances(instances.toList())

    /**
     * @param lbCookieStickinessPolicy Information about a policy for duration-based session
     * stickiness.
     */
    override fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: IResolvable) {
      cdkBuilder.lbCookieStickinessPolicy(lbCookieStickinessPolicy.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param lbCookieStickinessPolicy Information about a policy for duration-based session
     * stickiness.
     */
    override fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: List<Any>) {
      cdkBuilder.lbCookieStickinessPolicy(lbCookieStickinessPolicy.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param lbCookieStickinessPolicy Information about a policy for duration-based session
     * stickiness.
     */
    override fun lbCookieStickinessPolicy(vararg lbCookieStickinessPolicy: Any): Unit =
        lbCookieStickinessPolicy(lbCookieStickinessPolicy.toList())

    /**
     * @param listeners The listeners for the load balancer. You can specify at most one listener
     * per port. 
     * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
     * and creates a new one with the specified properties. While the new listener is being created,
     * clients cannot connect to the load balancer.
     */
    override fun listeners(listeners: IResolvable) {
      cdkBuilder.listeners(listeners.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param listeners The listeners for the load balancer. You can specify at most one listener
     * per port. 
     * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
     * and creates a new one with the specified properties. While the new listener is being created,
     * clients cannot connect to the load balancer.
     */
    override fun listeners(listeners: List<Any>) {
      cdkBuilder.listeners(listeners.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param listeners The listeners for the load balancer. You can specify at most one listener
     * per port. 
     * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
     * and creates a new one with the specified properties. While the new listener is being created,
     * clients cannot connect to the load balancer.
     */
    override fun listeners(vararg listeners: Any): Unit = listeners(listeners.toList())

    /**
     * @param loadBalancerName The name of the load balancer.
     * This name must be unique within your set of load balancers for the region.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the load
     * balancer. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     * If you specify a name, you cannot perform updates that require replacement of this resource, but
     * you can perform other updates. To replace the resource, specify a new name.
     */
    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /**
     * @param policies The policies defined for your Classic Load Balancer.
     * Specify only back-end server policies.
     */
    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param policies The policies defined for your Classic Load Balancer.
     * Specify only back-end server policies.
     */
    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param policies The policies defined for your Classic Load Balancer.
     * Specify only back-end server policies.
     */
    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    /**
     * @param scheme The type of load balancer. Valid only for load balancers in a VPC.
     * If `Scheme` is `internet-facing` , the load balancer has a public DNS name that resolves to a
     * public IP address.
     *
     * If `Scheme` is `internal` , the load balancer has a public DNS name that resolves to a
     * private IP address.
     */
    override fun scheme(scheme: String) {
      cdkBuilder.scheme(scheme)
    }

    /**
     * @param securityGroups The security groups for the load balancer.
     * Valid only for load balancers in a VPC.
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * @param securityGroups The security groups for the load balancer.
     * Valid only for load balancers in a VPC.
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param subnets The IDs of the subnets for the load balancer. You can specify at most one
     * subnet per Availability Zone.
     * Update requires replacement if you did not previously specify a subnet or if you are removing
     * all subnets. Otherwise, update requires no interruption. To update to a different subnet in the
     * current Availability Zone, you must first update to a subnet in a different Availability Zone,
     * then update to the new subnet in the original Availability Zone.
     */
    override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

    /**
     * @param subnets The IDs of the subnets for the load balancer. You can specify at most one
     * subnet per Availability Zone.
     * Update requires replacement if you did not previously specify a subnet or if you are removing
     * all subnets. Otherwise, update requires no interruption. To update to a different subnet in the
     * current Availability Zone, you must first update to a subnet in a different Availability Zone,
     * then update to the new subnet in the original Availability Zone.
     */
    override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

    /**
     * @param tags The tags associated with a load balancer.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags associated with a load balancer.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps,
  ) : CdkObject(cdkObject), CfnLoadBalancerProps {
    /**
     * Information about where and how access logs are stored for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy)
     */
    override fun accessLoggingPolicy(): Any? = unwrap(this).getAccessLoggingPolicy()

    /**
     * Information about a policy for application-controlled session stickiness.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy)
     */
    override fun appCookieStickinessPolicy(): Any? = unwrap(this).getAppCookieStickinessPolicy()

    /**
     * The Availability Zones for a load balancer in a default VPC.
     *
     * For a load balancer in a nondefault VPC, specify `Subnets` instead.
     *
     * Update requires replacement if you did not previously specify an Availability Zone or if you
     * are removing all Availability Zones. Otherwise, update requires no interruption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-availabilityzones)
     */
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    /**
     * If enabled, the load balancer allows existing requests to complete before the load balancer
     * shifts traffic away from a deregistered or unhealthy instance.
     *
     * For more information, see [Configure connection
     * draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
     * in the *User Guide for Classic Load Balancers* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-connectiondrainingpolicy)
     */
    override fun connectionDrainingPolicy(): Any? = unwrap(this).getConnectionDrainingPolicy()

    /**
     * If enabled, the load balancer allows the connections to remain idle (no data is sent over the
     * connection) for the specified duration.
     *
     * By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both
     * front-end and back-end connections of your load balancer. For more information, see [Configure
     * idle connection
     * timeout](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html)
     * in the *User Guide for Classic Load Balancers* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-connectionsettings)
     */
    override fun connectionSettings(): Any? = unwrap(this).getConnectionSettings()

    /**
     * If enabled, the load balancer routes the request traffic evenly across all instances
     * regardless of the Availability Zones.
     *
     * For more information, see [Configure cross-zone load
     * balancing](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html)
     * in the *User Guide for Classic Load Balancers* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-crosszone)
     */
    override fun crossZone(): Any? = unwrap(this).getCrossZone()

    /**
     * The health check settings to use when evaluating the health of your EC2 instances.
     *
     * Update requires replacement if you did not previously specify health check settings or if you
     * are removing the health check settings. Otherwise, update requires no interruption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-healthcheck)
     */
    override fun healthCheck(): Any? = unwrap(this).getHealthCheck()

    /**
     * The IDs of the instances for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-instances)
     */
    override fun instances(): List<String> = unwrap(this).getInstances() ?: emptyList()

    /**
     * Information about a policy for duration-based session stickiness.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy)
     */
    override fun lbCookieStickinessPolicy(): Any? = unwrap(this).getLbCookieStickinessPolicy()

    /**
     * The listeners for the load balancer. You can specify at most one listener per port.
     *
     * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
     * and creates a new one with the specified properties. While the new listener is being created,
     * clients cannot connect to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-listeners)
     */
    override fun listeners(): Any = unwrap(this).getListeners()

    /**
     * The name of the load balancer.
     *
     * This name must be unique within your set of load balancers for the region.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the load
     * balancer. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     * If you specify a name, you cannot perform updates that require replacement of this resource, but
     * you can perform other updates. To replace the resource, specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-loadbalancername)
     */
    override fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

    /**
     * The policies defined for your Classic Load Balancer.
     *
     * Specify only back-end server policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-policies)
     */
    override fun policies(): Any? = unwrap(this).getPolicies()

    /**
     * The type of load balancer. Valid only for load balancers in a VPC.
     *
     * If `Scheme` is `internet-facing` , the load balancer has a public DNS name that resolves to a
     * public IP address.
     *
     * If `Scheme` is `internal` , the load balancer has a public DNS name that resolves to a
     * private IP address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-scheme)
     */
    override fun scheme(): String? = unwrap(this).getScheme()

    /**
     * The security groups for the load balancer.
     *
     * Valid only for load balancers in a VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-securitygroups)
     */
    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * The IDs of the subnets for the load balancer. You can specify at most one subnet per
     * Availability Zone.
     *
     * Update requires replacement if you did not previously specify a subnet or if you are removing
     * all subnets. Otherwise, update requires no interruption. To update to a different subnet in the
     * current Availability Zone, you must first update to a subnet in a different Availability Zone,
     * then update to the new subnet in the original Availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-subnets)
     */
    override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

    /**
     * The tags associated with a load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoadBalancerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps):
        CfnLoadBalancerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLoadBalancerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoadBalancerProps):
        software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps
  }
}
