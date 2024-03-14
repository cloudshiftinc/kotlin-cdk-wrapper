package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.CdkObject
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
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLoadBalancer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Information about where and how access logs are stored for the load balancer.
   */
  public open fun accessLoggingPolicy(): Any? = unwrap(this).getAccessLoggingPolicy()

  /**
   * Information about where and how access logs are stored for the load balancer.
   */
  public open fun accessLoggingPolicy(`value`: IResolvable) {
    unwrap(this).setAccessLoggingPolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about where and how access logs are stored for the load balancer.
   */
  public open fun accessLoggingPolicy(`value`: AccessLoggingPolicyProperty) {
    unwrap(this).setAccessLoggingPolicy(`value`.let(AccessLoggingPolicyProperty::unwrap))
  }

  /**
   * Information about where and how access logs are stored for the load balancer.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dd206e1d33e8a82efbc2593a65d5943de517756dd75bb9dff305f92e60ea8785")
  public open fun accessLoggingPolicy(`value`: AccessLoggingPolicyProperty.Builder.() -> Unit): Unit
      = accessLoggingPolicy(AccessLoggingPolicyProperty(`value`))

  /**
   * Information about a policy for application-controlled session stickiness.
   */
  public open fun appCookieStickinessPolicy(): Any? = unwrap(this).getAppCookieStickinessPolicy()

  /**
   * Information about a policy for application-controlled session stickiness.
   */
  public open fun appCookieStickinessPolicy(`value`: IResolvable) {
    unwrap(this).setAppCookieStickinessPolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about a policy for application-controlled session stickiness.
   */
  public open fun appCookieStickinessPolicy(__idx_ac66f0: List<Any>) {
    unwrap(this).setAppCookieStickinessPolicy(__idx_ac66f0)
  }

  /**
   * Information about a policy for application-controlled session stickiness.
   */
  public open fun appCookieStickinessPolicy(vararg __idx_ac66f0: Any): Unit =
      appCookieStickinessPolicy(__idx_ac66f0.toList())

  /**
   * The name of the Route 53 hosted zone that is associated with the load balancer.
   *
   * Internal-facing load balancers don't use this value, use `DNSName` instead.
   */
  public open fun attrCanonicalHostedZoneName(): String =
      unwrap(this).getAttrCanonicalHostedZoneName()

  /**
   * The ID of the Route 53 hosted zone name that is associated with the load balancer.
   */
  public open fun attrCanonicalHostedZoneNameId(): String =
      unwrap(this).getAttrCanonicalHostedZoneNameId()

  /**
   * The DNS name for the load balancer.
   */
  public open fun attrDnsName(): String = unwrap(this).getAttrDnsName()

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the security group that you can use as part of your inbound rules for your load
   * balancer's back-end instances.
   */
  public open fun attrSourceSecurityGroupGroupName(): String =
      unwrap(this).getAttrSourceSecurityGroupGroupName()

  /**
   * The owner of the source security group.
   */
  public open fun attrSourceSecurityGroupOwnerAlias(): String =
      unwrap(this).getAttrSourceSecurityGroupOwnerAlias()

  /**
   * The Availability Zones for the load balancer.
   *
   * For load balancers in a VPC, specify `Subnets` instead.
   */
  public open fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
      emptyList()

  /**
   * The Availability Zones for the load balancer.
   *
   * For load balancers in a VPC, specify `Subnets` instead.
   */
  public open fun availabilityZones(`value`: List<String>) {
    unwrap(this).setAvailabilityZones(`value`)
  }

  /**
   * The Availability Zones for the load balancer.
   *
   * For load balancers in a VPC, specify `Subnets` instead.
   */
  public open fun availabilityZones(vararg `value`: String): Unit =
      availabilityZones(`value`.toList())

  /**
   * If enabled, the load balancer allows existing requests to complete before the load balancer
   * shifts traffic away from a deregistered or unhealthy instance.
   */
  public open fun connectionDrainingPolicy(): Any? = unwrap(this).getConnectionDrainingPolicy()

  /**
   * If enabled, the load balancer allows existing requests to complete before the load balancer
   * shifts traffic away from a deregistered or unhealthy instance.
   */
  public open fun connectionDrainingPolicy(`value`: IResolvable) {
    unwrap(this).setConnectionDrainingPolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * If enabled, the load balancer allows existing requests to complete before the load balancer
   * shifts traffic away from a deregistered or unhealthy instance.
   */
  public open fun connectionDrainingPolicy(`value`: ConnectionDrainingPolicyProperty) {
    unwrap(this).setConnectionDrainingPolicy(`value`.let(ConnectionDrainingPolicyProperty::unwrap))
  }

  /**
   * If enabled, the load balancer allows existing requests to complete before the load balancer
   * shifts traffic away from a deregistered or unhealthy instance.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("da9323ebbbc41341ca5c9c502528a67121ab365b7cd8712e6018fb0e3ff6a50f")
  public open
      fun connectionDrainingPolicy(`value`: ConnectionDrainingPolicyProperty.Builder.() -> Unit):
      Unit = connectionDrainingPolicy(ConnectionDrainingPolicyProperty(`value`))

  /**
   * If enabled, the load balancer allows the connections to remain idle (no data is sent over the
   * connection) for the specified duration.
   */
  public open fun connectionSettings(): Any? = unwrap(this).getConnectionSettings()

  /**
   * If enabled, the load balancer allows the connections to remain idle (no data is sent over the
   * connection) for the specified duration.
   */
  public open fun connectionSettings(`value`: IResolvable) {
    unwrap(this).setConnectionSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * If enabled, the load balancer allows the connections to remain idle (no data is sent over the
   * connection) for the specified duration.
   */
  public open fun connectionSettings(`value`: ConnectionSettingsProperty) {
    unwrap(this).setConnectionSettings(`value`.let(ConnectionSettingsProperty::unwrap))
  }

  /**
   * If enabled, the load balancer allows the connections to remain idle (no data is sent over the
   * connection) for the specified duration.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8924900c6ba29c31d94607caafba3168b5676e63fb10632238b3896aa2306521")
  public open fun connectionSettings(`value`: ConnectionSettingsProperty.Builder.() -> Unit): Unit =
      connectionSettings(ConnectionSettingsProperty(`value`))

  /**
   * If enabled, the load balancer routes the request traffic evenly across all instances regardless
   * of the Availability Zones.
   */
  public open fun crossZone(): Any? = unwrap(this).getCrossZone()

  /**
   * If enabled, the load balancer routes the request traffic evenly across all instances regardless
   * of the Availability Zones.
   */
  public open fun crossZone(`value`: Boolean) {
    unwrap(this).setCrossZone(`value`)
  }

  /**
   * If enabled, the load balancer routes the request traffic evenly across all instances regardless
   * of the Availability Zones.
   */
  public open fun crossZone(`value`: IResolvable) {
    unwrap(this).setCrossZone(`value`.let(IResolvable::unwrap))
  }

  /**
   * The health check settings to use when evaluating the health of your EC2 instances.
   */
  public open fun healthCheck(): Any? = unwrap(this).getHealthCheck()

  /**
   * The health check settings to use when evaluating the health of your EC2 instances.
   */
  public open fun healthCheck(`value`: IResolvable) {
    unwrap(this).setHealthCheck(`value`.let(IResolvable::unwrap))
  }

  /**
   * The health check settings to use when evaluating the health of your EC2 instances.
   */
  public open fun healthCheck(`value`: HealthCheckProperty) {
    unwrap(this).setHealthCheck(`value`.let(HealthCheckProperty::unwrap))
  }

  /**
   * The health check settings to use when evaluating the health of your EC2 instances.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df9477ddb736cfae4bef70c4d81edf0148be0b843623e5eb7b21e976f51eeebc")
  public open fun healthCheck(`value`: HealthCheckProperty.Builder.() -> Unit): Unit =
      healthCheck(HealthCheckProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IDs of the instances for the load balancer.
   */
  public open fun instances(): List<String> = unwrap(this).getInstances() ?: emptyList()

  /**
   * The IDs of the instances for the load balancer.
   */
  public open fun instances(`value`: List<String>) {
    unwrap(this).setInstances(`value`)
  }

  /**
   * The IDs of the instances for the load balancer.
   */
  public open fun instances(vararg `value`: String): Unit = instances(`value`.toList())

  /**
   * Information about a policy for duration-based session stickiness.
   */
  public open fun lbCookieStickinessPolicy(): Any? = unwrap(this).getLbCookieStickinessPolicy()

  /**
   * Information about a policy for duration-based session stickiness.
   */
  public open fun lbCookieStickinessPolicy(`value`: IResolvable) {
    unwrap(this).setLbCookieStickinessPolicy(`value`.let(IResolvable::unwrap))
  }

  /**
   * Information about a policy for duration-based session stickiness.
   */
  public open fun lbCookieStickinessPolicy(__idx_ac66f0: List<Any>) {
    unwrap(this).setLbCookieStickinessPolicy(__idx_ac66f0)
  }

  /**
   * Information about a policy for duration-based session stickiness.
   */
  public open fun lbCookieStickinessPolicy(vararg __idx_ac66f0: Any): Unit =
      lbCookieStickinessPolicy(__idx_ac66f0.toList())

  /**
   * The listeners for the load balancer.
   *
   * You can specify at most one listener per port.
   */
  public open fun listeners(): Any = unwrap(this).getListeners()

  /**
   * The listeners for the load balancer.
   *
   * You can specify at most one listener per port.
   */
  public open fun listeners(`value`: IResolvable) {
    unwrap(this).setListeners(`value`.let(IResolvable::unwrap))
  }

  /**
   * The listeners for the load balancer.
   *
   * You can specify at most one listener per port.
   */
  public open fun listeners(__idx_ac66f0: List<Any>) {
    unwrap(this).setListeners(__idx_ac66f0)
  }

  /**
   * The listeners for the load balancer.
   *
   * You can specify at most one listener per port.
   */
  public open fun listeners(vararg __idx_ac66f0: Any): Unit = listeners(__idx_ac66f0.toList())

  /**
   * The name of the load balancer.
   */
  public open fun loadBalancerName(): String? = unwrap(this).getLoadBalancerName()

  /**
   * The name of the load balancer.
   */
  public open fun loadBalancerName(`value`: String) {
    unwrap(this).setLoadBalancerName(`value`)
  }

  /**
   * The policies defined for your Classic Load Balancer.
   */
  public open fun policies(): Any? = unwrap(this).getPolicies()

  /**
   * The policies defined for your Classic Load Balancer.
   */
  public open fun policies(`value`: IResolvable) {
    unwrap(this).setPolicies(`value`.let(IResolvable::unwrap))
  }

  /**
   * The policies defined for your Classic Load Balancer.
   */
  public open fun policies(__idx_ac66f0: List<Any>) {
    unwrap(this).setPolicies(__idx_ac66f0)
  }

  /**
   * The policies defined for your Classic Load Balancer.
   */
  public open fun policies(vararg __idx_ac66f0: Any): Unit = policies(__idx_ac66f0.toList())

  /**
   * The type of load balancer.
   *
   * Valid only for load balancers in a VPC.
   */
  public open fun scheme(): String? = unwrap(this).getScheme()

  /**
   * The type of load balancer.
   *
   * Valid only for load balancers in a VPC.
   */
  public open fun scheme(`value`: String) {
    unwrap(this).setScheme(`value`)
  }

  /**
   * The security groups for the load balancer.
   */
  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  /**
   * The security groups for the load balancer.
   */
  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  /**
   * The security groups for the load balancer.
   */
  public open fun securityGroups(vararg `value`: String): Unit = securityGroups(`value`.toList())

  /**
   * The IDs of the subnets for the load balancer.
   *
   * You can specify at most one subnet per Availability Zone.
   */
  public open fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

  /**
   * The IDs of the subnets for the load balancer.
   *
   * You can specify at most one subnet per Availability Zone.
   */
  public open fun subnets(`value`: List<String>) {
    unwrap(this).setSubnets(`value`)
  }

  /**
   * The IDs of the subnets for the load balancer.
   *
   * You can specify at most one subnet per Availability Zone.
   */
  public open fun subnets(vararg `value`: String): Unit = subnets(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags associated with a load balancer.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags associated with a load balancer.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags associated with a load balancer.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticloadbalancing.CfnLoadBalancer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Information about where and how access logs are stored for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy)
     * @param accessLoggingPolicy Information about where and how access logs are stored for the
     * load balancer. 
     */
    public fun accessLoggingPolicy(accessLoggingPolicy: IResolvable)

    /**
     * Information about where and how access logs are stored for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy)
     * @param accessLoggingPolicy Information about where and how access logs are stored for the
     * load balancer. 
     */
    public fun accessLoggingPolicy(accessLoggingPolicy: AccessLoggingPolicyProperty)

    /**
     * Information about where and how access logs are stored for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy)
     * @param accessLoggingPolicy Information about where and how access logs are stored for the
     * load balancer. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18d943578206ad14c83ad52f5ea15e3893d45d3139a43179598ff115c2ed0f00")
    public
        fun accessLoggingPolicy(accessLoggingPolicy: AccessLoggingPolicyProperty.Builder.() -> Unit)

    /**
     * Information about a policy for application-controlled session stickiness.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy)
     * @param appCookieStickinessPolicy Information about a policy for application-controlled
     * session stickiness. 
     */
    public fun appCookieStickinessPolicy(appCookieStickinessPolicy: IResolvable)

    /**
     * Information about a policy for application-controlled session stickiness.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy)
     * @param appCookieStickinessPolicy Information about a policy for application-controlled
     * session stickiness. 
     */
    public fun appCookieStickinessPolicy(appCookieStickinessPolicy: List<Any>)

    /**
     * Information about a policy for application-controlled session stickiness.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy)
     * @param appCookieStickinessPolicy Information about a policy for application-controlled
     * session stickiness. 
     */
    public fun appCookieStickinessPolicy(vararg appCookieStickinessPolicy: Any)

    /**
     * The Availability Zones for the load balancer. For load balancers in a VPC, specify `Subnets`
     * instead.
     *
     * Update requires replacement if you did not previously specify an Availability Zone or if you
     * are removing all Availability Zones. Otherwise, update requires no interruption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-availabilityzones)
     * @param availabilityZones The Availability Zones for the load balancer. For load balancers in
     * a VPC, specify `Subnets` instead. 
     */
    public fun availabilityZones(availabilityZones: List<String>)

    /**
     * The Availability Zones for the load balancer. For load balancers in a VPC, specify `Subnets`
     * instead.
     *
     * Update requires replacement if you did not previously specify an Availability Zone or if you
     * are removing all Availability Zones. Otherwise, update requires no interruption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-availabilityzones)
     * @param availabilityZones The Availability Zones for the load balancer. For load balancers in
     * a VPC, specify `Subnets` instead. 
     */
    public fun availabilityZones(vararg availabilityZones: String)

    /**
     * If enabled, the load balancer allows existing requests to complete before the load balancer
     * shifts traffic away from a deregistered or unhealthy instance.
     *
     * For more information, see [Configure connection
     * draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
     * in the *User Guide for Classic Load Balancers* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-connectiondrainingpolicy)
     * @param connectionDrainingPolicy If enabled, the load balancer allows existing requests to
     * complete before the load balancer shifts traffic away from a deregistered or unhealthy instance.
     * 
     */
    public fun connectionDrainingPolicy(connectionDrainingPolicy: IResolvable)

    /**
     * If enabled, the load balancer allows existing requests to complete before the load balancer
     * shifts traffic away from a deregistered or unhealthy instance.
     *
     * For more information, see [Configure connection
     * draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
     * in the *User Guide for Classic Load Balancers* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-connectiondrainingpolicy)
     * @param connectionDrainingPolicy If enabled, the load balancer allows existing requests to
     * complete before the load balancer shifts traffic away from a deregistered or unhealthy instance.
     * 
     */
    public fun connectionDrainingPolicy(connectionDrainingPolicy: ConnectionDrainingPolicyProperty)

    /**
     * If enabled, the load balancer allows existing requests to complete before the load balancer
     * shifts traffic away from a deregistered or unhealthy instance.
     *
     * For more information, see [Configure connection
     * draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
     * in the *User Guide for Classic Load Balancers* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-connectiondrainingpolicy)
     * @param connectionDrainingPolicy If enabled, the load balancer allows existing requests to
     * complete before the load balancer shifts traffic away from a deregistered or unhealthy instance.
     * 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1308d9c6af6779b05692fd2444332ab6d46359ba54c4060ced1a9f2d4bf788c")
    public
        fun connectionDrainingPolicy(connectionDrainingPolicy: ConnectionDrainingPolicyProperty.Builder.() -> Unit)

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
     * @param connectionSettings If enabled, the load balancer allows the connections to remain idle
     * (no data is sent over the connection) for the specified duration. 
     */
    public fun connectionSettings(connectionSettings: IResolvable)

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
     * @param connectionSettings If enabled, the load balancer allows the connections to remain idle
     * (no data is sent over the connection) for the specified duration. 
     */
    public fun connectionSettings(connectionSettings: ConnectionSettingsProperty)

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
     * @param connectionSettings If enabled, the load balancer allows the connections to remain idle
     * (no data is sent over the connection) for the specified duration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef1c9b12d6535ae9972f770ffb300128431c29da02f5c9554522ae128923e5cf")
    public fun connectionSettings(connectionSettings: ConnectionSettingsProperty.Builder.() -> Unit)

    /**
     * If enabled, the load balancer routes the request traffic evenly across all instances
     * regardless of the Availability Zones.
     *
     * For more information, see [Configure cross-zone load
     * balancing](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html)
     * in the *User Guide for Classic Load Balancers* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-crosszone)
     * @param crossZone If enabled, the load balancer routes the request traffic evenly across all
     * instances regardless of the Availability Zones. 
     */
    public fun crossZone(crossZone: Boolean)

    /**
     * If enabled, the load balancer routes the request traffic evenly across all instances
     * regardless of the Availability Zones.
     *
     * For more information, see [Configure cross-zone load
     * balancing](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html)
     * in the *User Guide for Classic Load Balancers* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-crosszone)
     * @param crossZone If enabled, the load balancer routes the request traffic evenly across all
     * instances regardless of the Availability Zones. 
     */
    public fun crossZone(crossZone: IResolvable)

    /**
     * The health check settings to use when evaluating the health of your EC2 instances.
     *
     * Update requires replacement if you did not previously specify health check settings or if you
     * are removing the health check settings. Otherwise, update requires no interruption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-healthcheck)
     * @param healthCheck The health check settings to use when evaluating the health of your EC2
     * instances. 
     */
    public fun healthCheck(healthCheck: IResolvable)

    /**
     * The health check settings to use when evaluating the health of your EC2 instances.
     *
     * Update requires replacement if you did not previously specify health check settings or if you
     * are removing the health check settings. Otherwise, update requires no interruption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-healthcheck)
     * @param healthCheck The health check settings to use when evaluating the health of your EC2
     * instances. 
     */
    public fun healthCheck(healthCheck: HealthCheckProperty)

    /**
     * The health check settings to use when evaluating the health of your EC2 instances.
     *
     * Update requires replacement if you did not previously specify health check settings or if you
     * are removing the health check settings. Otherwise, update requires no interruption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-healthcheck)
     * @param healthCheck The health check settings to use when evaluating the health of your EC2
     * instances. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42ae2f476bb579083ac310d027410b288b9e8b294f4fae50b6fd050fe84c7e98")
    public fun healthCheck(healthCheck: HealthCheckProperty.Builder.() -> Unit)

    /**
     * The IDs of the instances for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-instances)
     * @param instances The IDs of the instances for the load balancer. 
     */
    public fun instances(instances: List<String>)

    /**
     * The IDs of the instances for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-instances)
     * @param instances The IDs of the instances for the load balancer. 
     */
    public fun instances(vararg instances: String)

    /**
     * Information about a policy for duration-based session stickiness.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy)
     * @param lbCookieStickinessPolicy Information about a policy for duration-based session
     * stickiness. 
     */
    public fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: IResolvable)

    /**
     * Information about a policy for duration-based session stickiness.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy)
     * @param lbCookieStickinessPolicy Information about a policy for duration-based session
     * stickiness. 
     */
    public fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: List<Any>)

    /**
     * Information about a policy for duration-based session stickiness.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy)
     * @param lbCookieStickinessPolicy Information about a policy for duration-based session
     * stickiness. 
     */
    public fun lbCookieStickinessPolicy(vararg lbCookieStickinessPolicy: Any)

    /**
     * The listeners for the load balancer. You can specify at most one listener per port.
     *
     * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
     * and creates a new one with the specified properties. While the new listener is being created,
     * clients cannot connect to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-listeners)
     * @param listeners The listeners for the load balancer. You can specify at most one listener
     * per port. 
     */
    public fun listeners(listeners: IResolvable)

    /**
     * The listeners for the load balancer. You can specify at most one listener per port.
     *
     * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
     * and creates a new one with the specified properties. While the new listener is being created,
     * clients cannot connect to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-listeners)
     * @param listeners The listeners for the load balancer. You can specify at most one listener
     * per port. 
     */
    public fun listeners(listeners: List<Any>)

    /**
     * The listeners for the load balancer. You can specify at most one listener per port.
     *
     * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
     * and creates a new one with the specified properties. While the new listener is being created,
     * clients cannot connect to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-listeners)
     * @param listeners The listeners for the load balancer. You can specify at most one listener
     * per port. 
     */
    public fun listeners(vararg listeners: Any)

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
     * @param loadBalancerName The name of the load balancer. 
     */
    public fun loadBalancerName(loadBalancerName: String)

    /**
     * The policies defined for your Classic Load Balancer.
     *
     * Specify only back-end server policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-policies)
     * @param policies The policies defined for your Classic Load Balancer. 
     */
    public fun policies(policies: IResolvable)

    /**
     * The policies defined for your Classic Load Balancer.
     *
     * Specify only back-end server policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-policies)
     * @param policies The policies defined for your Classic Load Balancer. 
     */
    public fun policies(policies: List<Any>)

    /**
     * The policies defined for your Classic Load Balancer.
     *
     * Specify only back-end server policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-policies)
     * @param policies The policies defined for your Classic Load Balancer. 
     */
    public fun policies(vararg policies: Any)

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
     * @param scheme The type of load balancer. Valid only for load balancers in a VPC. 
     */
    public fun scheme(scheme: String)

    /**
     * The security groups for the load balancer.
     *
     * Valid only for load balancers in a VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-securitygroups)
     * @param securityGroups The security groups for the load balancer. 
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * The security groups for the load balancer.
     *
     * Valid only for load balancers in a VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-securitygroups)
     * @param securityGroups The security groups for the load balancer. 
     */
    public fun securityGroups(vararg securityGroups: String)

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
     * @param subnets The IDs of the subnets for the load balancer. You can specify at most one
     * subnet per Availability Zone. 
     */
    public fun subnets(subnets: List<String>)

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
     * @param subnets The IDs of the subnets for the load balancer. You can specify at most one
     * subnet per Availability Zone. 
     */
    public fun subnets(vararg subnets: String)

    /**
     * The tags associated with a load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-tags)
     * @param tags The tags associated with a load balancer. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags associated with a load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-tags)
     * @param tags The tags associated with a load balancer. 
     */
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

    /**
     * Information about where and how access logs are stored for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy)
     * @param accessLoggingPolicy Information about where and how access logs are stored for the
     * load balancer. 
     */
    override fun accessLoggingPolicy(accessLoggingPolicy: IResolvable) {
      cdkBuilder.accessLoggingPolicy(accessLoggingPolicy.let(IResolvable::unwrap))
    }

    /**
     * Information about where and how access logs are stored for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy)
     * @param accessLoggingPolicy Information about where and how access logs are stored for the
     * load balancer. 
     */
    override fun accessLoggingPolicy(accessLoggingPolicy: AccessLoggingPolicyProperty) {
      cdkBuilder.accessLoggingPolicy(accessLoggingPolicy.let(AccessLoggingPolicyProperty::unwrap))
    }

    /**
     * Information about where and how access logs are stored for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy)
     * @param accessLoggingPolicy Information about where and how access logs are stored for the
     * load balancer. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18d943578206ad14c83ad52f5ea15e3893d45d3139a43179598ff115c2ed0f00")
    override
        fun accessLoggingPolicy(accessLoggingPolicy: AccessLoggingPolicyProperty.Builder.() -> Unit):
        Unit = accessLoggingPolicy(AccessLoggingPolicyProperty(accessLoggingPolicy))

    /**
     * Information about a policy for application-controlled session stickiness.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy)
     * @param appCookieStickinessPolicy Information about a policy for application-controlled
     * session stickiness. 
     */
    override fun appCookieStickinessPolicy(appCookieStickinessPolicy: IResolvable) {
      cdkBuilder.appCookieStickinessPolicy(appCookieStickinessPolicy.let(IResolvable::unwrap))
    }

    /**
     * Information about a policy for application-controlled session stickiness.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy)
     * @param appCookieStickinessPolicy Information about a policy for application-controlled
     * session stickiness. 
     */
    override fun appCookieStickinessPolicy(appCookieStickinessPolicy: List<Any>) {
      cdkBuilder.appCookieStickinessPolicy(appCookieStickinessPolicy)
    }

    /**
     * Information about a policy for application-controlled session stickiness.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy)
     * @param appCookieStickinessPolicy Information about a policy for application-controlled
     * session stickiness. 
     */
    override fun appCookieStickinessPolicy(vararg appCookieStickinessPolicy: Any): Unit =
        appCookieStickinessPolicy(appCookieStickinessPolicy.toList())

    /**
     * The Availability Zones for the load balancer. For load balancers in a VPC, specify `Subnets`
     * instead.
     *
     * Update requires replacement if you did not previously specify an Availability Zone or if you
     * are removing all Availability Zones. Otherwise, update requires no interruption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-availabilityzones)
     * @param availabilityZones The Availability Zones for the load balancer. For load balancers in
     * a VPC, specify `Subnets` instead. 
     */
    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    /**
     * The Availability Zones for the load balancer. For load balancers in a VPC, specify `Subnets`
     * instead.
     *
     * Update requires replacement if you did not previously specify an Availability Zone or if you
     * are removing all Availability Zones. Otherwise, update requires no interruption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-availabilityzones)
     * @param availabilityZones The Availability Zones for the load balancer. For load balancers in
     * a VPC, specify `Subnets` instead. 
     */
    override fun availabilityZones(vararg availabilityZones: String): Unit =
        availabilityZones(availabilityZones.toList())

    /**
     * If enabled, the load balancer allows existing requests to complete before the load balancer
     * shifts traffic away from a deregistered or unhealthy instance.
     *
     * For more information, see [Configure connection
     * draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
     * in the *User Guide for Classic Load Balancers* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-connectiondrainingpolicy)
     * @param connectionDrainingPolicy If enabled, the load balancer allows existing requests to
     * complete before the load balancer shifts traffic away from a deregistered or unhealthy instance.
     * 
     */
    override fun connectionDrainingPolicy(connectionDrainingPolicy: IResolvable) {
      cdkBuilder.connectionDrainingPolicy(connectionDrainingPolicy.let(IResolvable::unwrap))
    }

    /**
     * If enabled, the load balancer allows existing requests to complete before the load balancer
     * shifts traffic away from a deregistered or unhealthy instance.
     *
     * For more information, see [Configure connection
     * draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
     * in the *User Guide for Classic Load Balancers* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-connectiondrainingpolicy)
     * @param connectionDrainingPolicy If enabled, the load balancer allows existing requests to
     * complete before the load balancer shifts traffic away from a deregistered or unhealthy instance.
     * 
     */
    override
        fun connectionDrainingPolicy(connectionDrainingPolicy: ConnectionDrainingPolicyProperty) {
      cdkBuilder.connectionDrainingPolicy(connectionDrainingPolicy.let(ConnectionDrainingPolicyProperty::unwrap))
    }

    /**
     * If enabled, the load balancer allows existing requests to complete before the load balancer
     * shifts traffic away from a deregistered or unhealthy instance.
     *
     * For more information, see [Configure connection
     * draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
     * in the *User Guide for Classic Load Balancers* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-connectiondrainingpolicy)
     * @param connectionDrainingPolicy If enabled, the load balancer allows existing requests to
     * complete before the load balancer shifts traffic away from a deregistered or unhealthy instance.
     * 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e1308d9c6af6779b05692fd2444332ab6d46359ba54c4060ced1a9f2d4bf788c")
    override
        fun connectionDrainingPolicy(connectionDrainingPolicy: ConnectionDrainingPolicyProperty.Builder.() -> Unit):
        Unit = connectionDrainingPolicy(ConnectionDrainingPolicyProperty(connectionDrainingPolicy))

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
     * @param connectionSettings If enabled, the load balancer allows the connections to remain idle
     * (no data is sent over the connection) for the specified duration. 
     */
    override fun connectionSettings(connectionSettings: IResolvable) {
      cdkBuilder.connectionSettings(connectionSettings.let(IResolvable::unwrap))
    }

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
     * @param connectionSettings If enabled, the load balancer allows the connections to remain idle
     * (no data is sent over the connection) for the specified duration. 
     */
    override fun connectionSettings(connectionSettings: ConnectionSettingsProperty) {
      cdkBuilder.connectionSettings(connectionSettings.let(ConnectionSettingsProperty::unwrap))
    }

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
     * @param connectionSettings If enabled, the load balancer allows the connections to remain idle
     * (no data is sent over the connection) for the specified duration. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef1c9b12d6535ae9972f770ffb300128431c29da02f5c9554522ae128923e5cf")
    override
        fun connectionSettings(connectionSettings: ConnectionSettingsProperty.Builder.() -> Unit):
        Unit = connectionSettings(ConnectionSettingsProperty(connectionSettings))

    /**
     * If enabled, the load balancer routes the request traffic evenly across all instances
     * regardless of the Availability Zones.
     *
     * For more information, see [Configure cross-zone load
     * balancing](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html)
     * in the *User Guide for Classic Load Balancers* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-crosszone)
     * @param crossZone If enabled, the load balancer routes the request traffic evenly across all
     * instances regardless of the Availability Zones. 
     */
    override fun crossZone(crossZone: Boolean) {
      cdkBuilder.crossZone(crossZone)
    }

    /**
     * If enabled, the load balancer routes the request traffic evenly across all instances
     * regardless of the Availability Zones.
     *
     * For more information, see [Configure cross-zone load
     * balancing](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html)
     * in the *User Guide for Classic Load Balancers* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-crosszone)
     * @param crossZone If enabled, the load balancer routes the request traffic evenly across all
     * instances regardless of the Availability Zones. 
     */
    override fun crossZone(crossZone: IResolvable) {
      cdkBuilder.crossZone(crossZone.let(IResolvable::unwrap))
    }

    /**
     * The health check settings to use when evaluating the health of your EC2 instances.
     *
     * Update requires replacement if you did not previously specify health check settings or if you
     * are removing the health check settings. Otherwise, update requires no interruption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-healthcheck)
     * @param healthCheck The health check settings to use when evaluating the health of your EC2
     * instances. 
     */
    override fun healthCheck(healthCheck: IResolvable) {
      cdkBuilder.healthCheck(healthCheck.let(IResolvable::unwrap))
    }

    /**
     * The health check settings to use when evaluating the health of your EC2 instances.
     *
     * Update requires replacement if you did not previously specify health check settings or if you
     * are removing the health check settings. Otherwise, update requires no interruption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-healthcheck)
     * @param healthCheck The health check settings to use when evaluating the health of your EC2
     * instances. 
     */
    override fun healthCheck(healthCheck: HealthCheckProperty) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheckProperty::unwrap))
    }

    /**
     * The health check settings to use when evaluating the health of your EC2 instances.
     *
     * Update requires replacement if you did not previously specify health check settings or if you
     * are removing the health check settings. Otherwise, update requires no interruption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-healthcheck)
     * @param healthCheck The health check settings to use when evaluating the health of your EC2
     * instances. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42ae2f476bb579083ac310d027410b288b9e8b294f4fae50b6fd050fe84c7e98")
    override fun healthCheck(healthCheck: HealthCheckProperty.Builder.() -> Unit): Unit =
        healthCheck(HealthCheckProperty(healthCheck))

    /**
     * The IDs of the instances for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-instances)
     * @param instances The IDs of the instances for the load balancer. 
     */
    override fun instances(instances: List<String>) {
      cdkBuilder.instances(instances)
    }

    /**
     * The IDs of the instances for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-instances)
     * @param instances The IDs of the instances for the load balancer. 
     */
    override fun instances(vararg instances: String): Unit = instances(instances.toList())

    /**
     * Information about a policy for duration-based session stickiness.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy)
     * @param lbCookieStickinessPolicy Information about a policy for duration-based session
     * stickiness. 
     */
    override fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: IResolvable) {
      cdkBuilder.lbCookieStickinessPolicy(lbCookieStickinessPolicy.let(IResolvable::unwrap))
    }

    /**
     * Information about a policy for duration-based session stickiness.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy)
     * @param lbCookieStickinessPolicy Information about a policy for duration-based session
     * stickiness. 
     */
    override fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: List<Any>) {
      cdkBuilder.lbCookieStickinessPolicy(lbCookieStickinessPolicy)
    }

    /**
     * Information about a policy for duration-based session stickiness.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy)
     * @param lbCookieStickinessPolicy Information about a policy for duration-based session
     * stickiness. 
     */
    override fun lbCookieStickinessPolicy(vararg lbCookieStickinessPolicy: Any): Unit =
        lbCookieStickinessPolicy(lbCookieStickinessPolicy.toList())

    /**
     * The listeners for the load balancer. You can specify at most one listener per port.
     *
     * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
     * and creates a new one with the specified properties. While the new listener is being created,
     * clients cannot connect to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-listeners)
     * @param listeners The listeners for the load balancer. You can specify at most one listener
     * per port. 
     */
    override fun listeners(listeners: IResolvable) {
      cdkBuilder.listeners(listeners.let(IResolvable::unwrap))
    }

    /**
     * The listeners for the load balancer. You can specify at most one listener per port.
     *
     * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
     * and creates a new one with the specified properties. While the new listener is being created,
     * clients cannot connect to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-listeners)
     * @param listeners The listeners for the load balancer. You can specify at most one listener
     * per port. 
     */
    override fun listeners(listeners: List<Any>) {
      cdkBuilder.listeners(listeners)
    }

    /**
     * The listeners for the load balancer. You can specify at most one listener per port.
     *
     * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
     * and creates a new one with the specified properties. While the new listener is being created,
     * clients cannot connect to the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-listeners)
     * @param listeners The listeners for the load balancer. You can specify at most one listener
     * per port. 
     */
    override fun listeners(vararg listeners: Any): Unit = listeners(listeners.toList())

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
     * @param loadBalancerName The name of the load balancer. 
     */
    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /**
     * The policies defined for your Classic Load Balancer.
     *
     * Specify only back-end server policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-policies)
     * @param policies The policies defined for your Classic Load Balancer. 
     */
    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    /**
     * The policies defined for your Classic Load Balancer.
     *
     * Specify only back-end server policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-policies)
     * @param policies The policies defined for your Classic Load Balancer. 
     */
    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    /**
     * The policies defined for your Classic Load Balancer.
     *
     * Specify only back-end server policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-policies)
     * @param policies The policies defined for your Classic Load Balancer. 
     */
    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

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
     * @param scheme The type of load balancer. Valid only for load balancers in a VPC. 
     */
    override fun scheme(scheme: String) {
      cdkBuilder.scheme(scheme)
    }

    /**
     * The security groups for the load balancer.
     *
     * Valid only for load balancers in a VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-securitygroups)
     * @param securityGroups The security groups for the load balancer. 
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * The security groups for the load balancer.
     *
     * Valid only for load balancers in a VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-securitygroups)
     * @param securityGroups The security groups for the load balancer. 
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

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
     * @param subnets The IDs of the subnets for the load balancer. You can specify at most one
     * subnet per Availability Zone. 
     */
    override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

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
     * @param subnets The IDs of the subnets for the load balancer. You can specify at most one
     * subnet per Availability Zone. 
     */
    override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

    /**
     * The tags associated with a load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-tags)
     * @param tags The tags associated with a load balancer. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags associated with a load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancing-loadbalancer.html#cfn-elasticloadbalancing-loadbalancer-tags)
     * @param tags The tags associated with a load balancer. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer =
        cdkBuilder.build()
  }

  public companion object {
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
    /**
     * The policy attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-policies.html#cfn-elasticloadbalancing-loadbalancer-policies-attributes)
     */
    public fun attributes(): Any

    /**
     * The instance ports for the policy.
     *
     * Required only for some policy types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-policies.html#cfn-elasticloadbalancing-loadbalancer-policies-instanceports)
     */
    public fun instancePorts(): List<String> = unwrap(this).getInstancePorts() ?: emptyList()

    /**
     * The load balancer ports for the policy.
     *
     * Required only for some policy types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-policies.html#cfn-elasticloadbalancing-loadbalancer-policies-loadbalancerports)
     */
    public fun loadBalancerPorts(): List<String> = unwrap(this).getLoadBalancerPorts() ?:
        emptyList()

    /**
     * The name of the policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-policies.html#cfn-elasticloadbalancing-loadbalancer-policies-policyname)
     */
    public fun policyName(): String

    /**
     * The name of the policy type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-policies.html#cfn-elasticloadbalancing-loadbalancer-policies-policytype)
     */
    public fun policyType(): String

    /**
     * A builder for [PoliciesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributes The policy attributes. 
       */
      public fun attributes(attributes: List<Any>)

      /**
       * @param attributes The policy attributes. 
       */
      public fun attributes(vararg attributes: Any)

      /**
       * @param attributes The policy attributes. 
       */
      public fun attributes(attributes: IResolvable)

      /**
       * @param instancePorts The instance ports for the policy.
       * Required only for some policy types.
       */
      public fun instancePorts(instancePorts: List<String>)

      /**
       * @param instancePorts The instance ports for the policy.
       * Required only for some policy types.
       */
      public fun instancePorts(vararg instancePorts: String)

      /**
       * @param loadBalancerPorts The load balancer ports for the policy.
       * Required only for some policy types.
       */
      public fun loadBalancerPorts(loadBalancerPorts: List<String>)

      /**
       * @param loadBalancerPorts The load balancer ports for the policy.
       * Required only for some policy types.
       */
      public fun loadBalancerPorts(vararg loadBalancerPorts: String)

      /**
       * @param policyName The name of the policy. 
       */
      public fun policyName(policyName: String)

      /**
       * @param policyType The name of the policy type. 
       */
      public fun policyType(policyType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.PoliciesProperty.builder()

      /**
       * @param attributes The policy attributes. 
       */
      override fun attributes(attributes: List<Any>) {
        cdkBuilder.attributes(attributes)
      }

      /**
       * @param attributes The policy attributes. 
       */
      override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

      /**
       * @param attributes The policy attributes. 
       */
      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      /**
       * @param instancePorts The instance ports for the policy.
       * Required only for some policy types.
       */
      override fun instancePorts(instancePorts: List<String>) {
        cdkBuilder.instancePorts(instancePorts)
      }

      /**
       * @param instancePorts The instance ports for the policy.
       * Required only for some policy types.
       */
      override fun instancePorts(vararg instancePorts: String): Unit =
          instancePorts(instancePorts.toList())

      /**
       * @param loadBalancerPorts The load balancer ports for the policy.
       * Required only for some policy types.
       */
      override fun loadBalancerPorts(loadBalancerPorts: List<String>) {
        cdkBuilder.loadBalancerPorts(loadBalancerPorts)
      }

      /**
       * @param loadBalancerPorts The load balancer ports for the policy.
       * Required only for some policy types.
       */
      override fun loadBalancerPorts(vararg loadBalancerPorts: String): Unit =
          loadBalancerPorts(loadBalancerPorts.toList())

      /**
       * @param policyName The name of the policy. 
       */
      override fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
      }

      /**
       * @param policyType The name of the policy type. 
       */
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
      /**
       * The policy attributes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-policies.html#cfn-elasticloadbalancing-loadbalancer-policies-attributes)
       */
      override fun attributes(): Any = unwrap(this).getAttributes()

      /**
       * The instance ports for the policy.
       *
       * Required only for some policy types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-policies.html#cfn-elasticloadbalancing-loadbalancer-policies-instanceports)
       */
      override fun instancePorts(): List<String> = unwrap(this).getInstancePorts() ?: emptyList()

      /**
       * The load balancer ports for the policy.
       *
       * Required only for some policy types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-policies.html#cfn-elasticloadbalancing-loadbalancer-policies-loadbalancerports)
       */
      override fun loadBalancerPorts(): List<String> = unwrap(this).getLoadBalancerPorts() ?:
          emptyList()

      /**
       * The name of the policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-policies.html#cfn-elasticloadbalancing-loadbalancer-policies-policyname)
       */
      override fun policyName(): String = unwrap(this).getPolicyName()

      /**
       * The name of the policy type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-policies.html#cfn-elasticloadbalancing-loadbalancer-policies-policytype)
       */
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
    /**
     * The time period, in seconds, after which the cookie should be considered stale.
     *
     * If this parameter is not specified, the stickiness session lasts for the duration of the
     * browser session.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy.html#cfn-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy-cookieexpirationperiod)
     */
    public fun cookieExpirationPeriod(): String? = unwrap(this).getCookieExpirationPeriod()

    /**
     * The name of the policy.
     *
     * This name must be unique within the set of policies for this load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy.html#cfn-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy-policyname)
     */
    public fun policyName(): String? = unwrap(this).getPolicyName()

    /**
     * A builder for [LBCookieStickinessPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cookieExpirationPeriod The time period, in seconds, after which the cookie should be
       * considered stale.
       * If this parameter is not specified, the stickiness session lasts for the duration of the
       * browser session.
       */
      public fun cookieExpirationPeriod(cookieExpirationPeriod: String)

      /**
       * @param policyName The name of the policy.
       * This name must be unique within the set of policies for this load balancer.
       */
      public fun policyName(policyName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.LBCookieStickinessPolicyProperty.builder()

      /**
       * @param cookieExpirationPeriod The time period, in seconds, after which the cookie should be
       * considered stale.
       * If this parameter is not specified, the stickiness session lasts for the duration of the
       * browser session.
       */
      override fun cookieExpirationPeriod(cookieExpirationPeriod: String) {
        cdkBuilder.cookieExpirationPeriod(cookieExpirationPeriod)
      }

      /**
       * @param policyName The name of the policy.
       * This name must be unique within the set of policies for this load balancer.
       */
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
      /**
       * The time period, in seconds, after which the cookie should be considered stale.
       *
       * If this parameter is not specified, the stickiness session lasts for the duration of the
       * browser session.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy.html#cfn-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy-cookieexpirationperiod)
       */
      override fun cookieExpirationPeriod(): String? = unwrap(this).getCookieExpirationPeriod()

      /**
       * The name of the policy.
       *
       * This name must be unique within the set of policies for this load balancer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy.html#cfn-elasticloadbalancing-loadbalancer-lbcookiestickinesspolicy-policyname)
       */
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
    /**
     * The interval for publishing the access logs. You can specify an interval of either 5 minutes
     * or 60 minutes.
     *
     * Default: 60 minutes
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-accessloggingpolicy.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy-emitinterval)
     */
    public fun emitInterval(): Number? = unwrap(this).getEmitInterval()

    /**
     * Specifies whether access logs are enabled for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-accessloggingpolicy.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy-enabled)
     */
    public fun enabled(): Any

    /**
     * The name of the Amazon S3 bucket where the access logs are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-accessloggingpolicy.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy-s3bucketname)
     */
    public fun s3BucketName(): String

    /**
     * The logical hierarchy you created for your Amazon S3 bucket, for example
     * `my-bucket-prefix/prod` .
     *
     * If the prefix is not provided, the log is placed at the root level of the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-accessloggingpolicy.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy-s3bucketprefix)
     */
    public fun s3BucketPrefix(): String? = unwrap(this).getS3BucketPrefix()

    /**
     * A builder for [AccessLoggingPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param emitInterval The interval for publishing the access logs. You can specify an
       * interval of either 5 minutes or 60 minutes.
       * Default: 60 minutes
       */
      public fun emitInterval(emitInterval: Number)

      /**
       * @param enabled Specifies whether access logs are enabled for the load balancer. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specifies whether access logs are enabled for the load balancer. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param s3BucketName The name of the Amazon S3 bucket where the access logs are stored. 
       */
      public fun s3BucketName(s3BucketName: String)

      /**
       * @param s3BucketPrefix The logical hierarchy you created for your Amazon S3 bucket, for
       * example `my-bucket-prefix/prod` .
       * If the prefix is not provided, the log is placed at the root level of the bucket.
       */
      public fun s3BucketPrefix(s3BucketPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.builder()

      /**
       * @param emitInterval The interval for publishing the access logs. You can specify an
       * interval of either 5 minutes or 60 minutes.
       * Default: 60 minutes
       */
      override fun emitInterval(emitInterval: Number) {
        cdkBuilder.emitInterval(emitInterval)
      }

      /**
       * @param enabled Specifies whether access logs are enabled for the load balancer. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specifies whether access logs are enabled for the load balancer. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param s3BucketName The name of the Amazon S3 bucket where the access logs are stored. 
       */
      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      /**
       * @param s3BucketPrefix The logical hierarchy you created for your Amazon S3 bucket, for
       * example `my-bucket-prefix/prod` .
       * If the prefix is not provided, the log is placed at the root level of the bucket.
       */
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
      /**
       * The interval for publishing the access logs. You can specify an interval of either 5
       * minutes or 60 minutes.
       *
       * Default: 60 minutes
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-accessloggingpolicy.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy-emitinterval)
       */
      override fun emitInterval(): Number? = unwrap(this).getEmitInterval()

      /**
       * Specifies whether access logs are enabled for the load balancer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-accessloggingpolicy.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * The name of the Amazon S3 bucket where the access logs are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-accessloggingpolicy.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy-s3bucketname)
       */
      override fun s3BucketName(): String = unwrap(this).getS3BucketName()

      /**
       * The logical hierarchy you created for your Amazon S3 bucket, for example
       * `my-bucket-prefix/prod` .
       *
       * If the prefix is not provided, the log is placed at the root level of the bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-accessloggingpolicy.html#cfn-elasticloadbalancing-loadbalancer-accessloggingpolicy-s3bucketprefix)
       */
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
    /**
     * The name of the application cookie used for stickiness.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy.html#cfn-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy-cookiename)
     */
    public fun cookieName(): String

    /**
     * The mnemonic name for the policy being created.
     *
     * The name must be unique within a set of policies for this load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy.html#cfn-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy-policyname)
     */
    public fun policyName(): String

    /**
     * A builder for [AppCookieStickinessPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cookieName The name of the application cookie used for stickiness. 
       */
      public fun cookieName(cookieName: String)

      /**
       * @param policyName The mnemonic name for the policy being created. 
       * The name must be unique within a set of policies for this load balancer.
       */
      public fun policyName(policyName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AppCookieStickinessPolicyProperty.builder()

      /**
       * @param cookieName The name of the application cookie used for stickiness. 
       */
      override fun cookieName(cookieName: String) {
        cdkBuilder.cookieName(cookieName)
      }

      /**
       * @param policyName The mnemonic name for the policy being created. 
       * The name must be unique within a set of policies for this load balancer.
       */
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
      /**
       * The name of the application cookie used for stickiness.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy.html#cfn-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy-cookiename)
       */
      override fun cookieName(): String = unwrap(this).getCookieName()

      /**
       * The mnemonic name for the policy being created.
       *
       * The name must be unique within a set of policies for this load balancer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy.html#cfn-elasticloadbalancing-loadbalancer-appcookiestickinesspolicy-policyname)
       */
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
    /**
     * The port on which the instance is listening.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-listeners.html#cfn-elasticloadbalancing-loadbalancer-listeners-instanceport)
     */
    public fun instancePort(): String

    /**
     * The protocol to use for routing traffic to instances: HTTP, HTTPS, TCP, or SSL.
     *
     * If the front-end protocol is TCP or SSL, the back-end protocol must be TCP or SSL. If the
     * front-end protocol is HTTP or HTTPS, the back-end protocol must be HTTP or HTTPS.
     *
     * If there is another listener with the same `InstancePort` whose `InstanceProtocol` is secure,
     * (HTTPS or SSL), the listener's `InstanceProtocol` must also be secure.
     *
     * If there is another listener with the same `InstancePort` whose `InstanceProtocol` is HTTP or
     * TCP, the listener's `InstanceProtocol` must be HTTP or TCP.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-listeners.html#cfn-elasticloadbalancing-loadbalancer-listeners-instanceprotocol)
     */
    public fun instanceProtocol(): String? = unwrap(this).getInstanceProtocol()

    /**
     * The port on which the load balancer is listening.
     *
     * On EC2-VPC, you can specify any port from the range 1-65535. On EC2-Classic, you can specify
     * any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-listeners.html#cfn-elasticloadbalancing-loadbalancer-listeners-loadbalancerport)
     */
    public fun loadBalancerPort(): String

    /**
     * The names of the policies to associate with the listener.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-listeners.html#cfn-elasticloadbalancing-loadbalancer-listeners-policynames)
     */
    public fun policyNames(): List<String> = unwrap(this).getPolicyNames() ?: emptyList()

    /**
     * The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP, or SSL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-listeners.html#cfn-elasticloadbalancing-loadbalancer-listeners-protocol)
     */
    public fun protocol(): String

    /**
     * The Amazon Resource Name (ARN) of the server certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-listeners.html#cfn-elasticloadbalancing-loadbalancer-listeners-sslcertificateid)
     */
    public fun sslCertificateId(): String? = unwrap(this).getSslCertificateId()

    /**
     * A builder for [ListenersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param instancePort The port on which the instance is listening. 
       */
      public fun instancePort(instancePort: String)

      /**
       * @param instanceProtocol The protocol to use for routing traffic to instances: HTTP, HTTPS,
       * TCP, or SSL.
       * If the front-end protocol is TCP or SSL, the back-end protocol must be TCP or SSL. If the
       * front-end protocol is HTTP or HTTPS, the back-end protocol must be HTTP or HTTPS.
       *
       * If there is another listener with the same `InstancePort` whose `InstanceProtocol` is
       * secure, (HTTPS or SSL), the listener's `InstanceProtocol` must also be secure.
       *
       * If there is another listener with the same `InstancePort` whose `InstanceProtocol` is HTTP
       * or TCP, the listener's `InstanceProtocol` must be HTTP or TCP.
       */
      public fun instanceProtocol(instanceProtocol: String)

      /**
       * @param loadBalancerPort The port on which the load balancer is listening. 
       * On EC2-VPC, you can specify any port from the range 1-65535. On EC2-Classic, you can
       * specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
       */
      public fun loadBalancerPort(loadBalancerPort: String)

      /**
       * @param policyNames The names of the policies to associate with the listener.
       */
      public fun policyNames(policyNames: List<String>)

      /**
       * @param policyNames The names of the policies to associate with the listener.
       */
      public fun policyNames(vararg policyNames: String)

      /**
       * @param protocol The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP,
       * or SSL. 
       */
      public fun protocol(protocol: String)

      /**
       * @param sslCertificateId The Amazon Resource Name (ARN) of the server certificate.
       */
      public fun sslCertificateId(sslCertificateId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ListenersProperty.builder()

      /**
       * @param instancePort The port on which the instance is listening. 
       */
      override fun instancePort(instancePort: String) {
        cdkBuilder.instancePort(instancePort)
      }

      /**
       * @param instanceProtocol The protocol to use for routing traffic to instances: HTTP, HTTPS,
       * TCP, or SSL.
       * If the front-end protocol is TCP or SSL, the back-end protocol must be TCP or SSL. If the
       * front-end protocol is HTTP or HTTPS, the back-end protocol must be HTTP or HTTPS.
       *
       * If there is another listener with the same `InstancePort` whose `InstanceProtocol` is
       * secure, (HTTPS or SSL), the listener's `InstanceProtocol` must also be secure.
       *
       * If there is another listener with the same `InstancePort` whose `InstanceProtocol` is HTTP
       * or TCP, the listener's `InstanceProtocol` must be HTTP or TCP.
       */
      override fun instanceProtocol(instanceProtocol: String) {
        cdkBuilder.instanceProtocol(instanceProtocol)
      }

      /**
       * @param loadBalancerPort The port on which the load balancer is listening. 
       * On EC2-VPC, you can specify any port from the range 1-65535. On EC2-Classic, you can
       * specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
       */
      override fun loadBalancerPort(loadBalancerPort: String) {
        cdkBuilder.loadBalancerPort(loadBalancerPort)
      }

      /**
       * @param policyNames The names of the policies to associate with the listener.
       */
      override fun policyNames(policyNames: List<String>) {
        cdkBuilder.policyNames(policyNames)
      }

      /**
       * @param policyNames The names of the policies to associate with the listener.
       */
      override fun policyNames(vararg policyNames: String): Unit = policyNames(policyNames.toList())

      /**
       * @param protocol The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP,
       * or SSL. 
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param sslCertificateId The Amazon Resource Name (ARN) of the server certificate.
       */
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
      /**
       * The port on which the instance is listening.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-listeners.html#cfn-elasticloadbalancing-loadbalancer-listeners-instanceport)
       */
      override fun instancePort(): String = unwrap(this).getInstancePort()

      /**
       * The protocol to use for routing traffic to instances: HTTP, HTTPS, TCP, or SSL.
       *
       * If the front-end protocol is TCP or SSL, the back-end protocol must be TCP or SSL. If the
       * front-end protocol is HTTP or HTTPS, the back-end protocol must be HTTP or HTTPS.
       *
       * If there is another listener with the same `InstancePort` whose `InstanceProtocol` is
       * secure, (HTTPS or SSL), the listener's `InstanceProtocol` must also be secure.
       *
       * If there is another listener with the same `InstancePort` whose `InstanceProtocol` is HTTP
       * or TCP, the listener's `InstanceProtocol` must be HTTP or TCP.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-listeners.html#cfn-elasticloadbalancing-loadbalancer-listeners-instanceprotocol)
       */
      override fun instanceProtocol(): String? = unwrap(this).getInstanceProtocol()

      /**
       * The port on which the load balancer is listening.
       *
       * On EC2-VPC, you can specify any port from the range 1-65535. On EC2-Classic, you can
       * specify any port from the following list: 25, 80, 443, 465, 587, 1024-65535.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-listeners.html#cfn-elasticloadbalancing-loadbalancer-listeners-loadbalancerport)
       */
      override fun loadBalancerPort(): String = unwrap(this).getLoadBalancerPort()

      /**
       * The names of the policies to associate with the listener.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-listeners.html#cfn-elasticloadbalancing-loadbalancer-listeners-policynames)
       */
      override fun policyNames(): List<String> = unwrap(this).getPolicyNames() ?: emptyList()

      /**
       * The load balancer transport protocol to use for routing: HTTP, HTTPS, TCP, or SSL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-listeners.html#cfn-elasticloadbalancing-loadbalancer-listeners-protocol)
       */
      override fun protocol(): String = unwrap(this).getProtocol()

      /**
       * The Amazon Resource Name (ARN) of the server certificate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-listeners.html#cfn-elasticloadbalancing-loadbalancer-listeners-sslcertificateid)
       */
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
    /**
     * The time, in seconds, that the connection is allowed to be idle (no data has been sent over
     * the connection) before it is closed by the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-connectionsettings.html#cfn-elasticloadbalancing-loadbalancer-connectionsettings-idletimeout)
     */
    public fun idleTimeout(): Number

    /**
     * A builder for [ConnectionSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idleTimeout The time, in seconds, that the connection is allowed to be idle (no data
       * has been sent over the connection) before it is closed by the load balancer. 
       */
      public fun idleTimeout(idleTimeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionSettingsProperty.builder()

      /**
       * @param idleTimeout The time, in seconds, that the connection is allowed to be idle (no data
       * has been sent over the connection) before it is closed by the load balancer. 
       */
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
      /**
       * The time, in seconds, that the connection is allowed to be idle (no data has been sent over
       * the connection) before it is closed by the load balancer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-connectionsettings.html#cfn-elasticloadbalancing-loadbalancer-connectionsettings-idletimeout)
       */
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
    /**
     * The number of consecutive health checks successes required before moving the instance to the
     * `Healthy` state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-healthcheck.html#cfn-elasticloadbalancing-loadbalancer-healthcheck-healthythreshold)
     */
    public fun healthyThreshold(): String

    /**
     * The approximate interval, in seconds, between health checks of an individual instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-healthcheck.html#cfn-elasticloadbalancing-loadbalancer-healthcheck-interval)
     */
    public fun interval(): String

    /**
     * The instance being checked.
     *
     * The protocol is either TCP, HTTP, HTTPS, or SSL. The range of valid ports is one (1) through
     * 65535.
     *
     * TCP is the default, specified as a TCP: port pair, for example "TCP:5000". In this case, a
     * health check simply attempts to open a TCP connection to the instance on the specified port.
     * Failure to connect within the configured timeout is considered unhealthy.
     *
     * SSL is also specified as SSL: port pair, for example, SSL:5000.
     *
     * For HTTP/HTTPS, you must include a ping path in the string. HTTP is specified as a
     * HTTP:port;/;PathToPing; grouping, for example "HTTP:80/weather/us/wa/seattle". In this case, a
     * HTTP GET request is issued to the instance on the given port and path. Any answer other than
     * "200 OK" within the timeout period is considered unhealthy.
     *
     * The total length of the HTTP ping target must be 1024 16-bit Unicode characters or less.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-healthcheck.html#cfn-elasticloadbalancing-loadbalancer-healthcheck-target)
     */
    public fun target(): String

    /**
     * The amount of time, in seconds, during which no response means a failed health check.
     *
     * This value must be less than the `Interval` value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-healthcheck.html#cfn-elasticloadbalancing-loadbalancer-healthcheck-timeout)
     */
    public fun timeout(): String

    /**
     * The number of consecutive health check failures required before moving the instance to the
     * `Unhealthy` state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-healthcheck.html#cfn-elasticloadbalancing-loadbalancer-healthcheck-unhealthythreshold)
     */
    public fun unhealthyThreshold(): String

    /**
     * A builder for [HealthCheckProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param healthyThreshold The number of consecutive health checks successes required before
       * moving the instance to the `Healthy` state. 
       */
      public fun healthyThreshold(healthyThreshold: String)

      /**
       * @param interval The approximate interval, in seconds, between health checks of an
       * individual instance. 
       */
      public fun interval(interval: String)

      /**
       * @param target The instance being checked. 
       * The protocol is either TCP, HTTP, HTTPS, or SSL. The range of valid ports is one (1)
       * through 65535.
       *
       * TCP is the default, specified as a TCP: port pair, for example "TCP:5000". In this case, a
       * health check simply attempts to open a TCP connection to the instance on the specified port.
       * Failure to connect within the configured timeout is considered unhealthy.
       *
       * SSL is also specified as SSL: port pair, for example, SSL:5000.
       *
       * For HTTP/HTTPS, you must include a ping path in the string. HTTP is specified as a
       * HTTP:port;/;PathToPing; grouping, for example "HTTP:80/weather/us/wa/seattle". In this case, a
       * HTTP GET request is issued to the instance on the given port and path. Any answer other than
       * "200 OK" within the timeout period is considered unhealthy.
       *
       * The total length of the HTTP ping target must be 1024 16-bit Unicode characters or less.
       */
      public fun target(target: String)

      /**
       * @param timeout The amount of time, in seconds, during which no response means a failed
       * health check. 
       * This value must be less than the `Interval` value.
       */
      public fun timeout(timeout: String)

      /**
       * @param unhealthyThreshold The number of consecutive health check failures required before
       * moving the instance to the `Unhealthy` state. 
       */
      public fun unhealthyThreshold(unhealthyThreshold: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.HealthCheckProperty.builder()

      /**
       * @param healthyThreshold The number of consecutive health checks successes required before
       * moving the instance to the `Healthy` state. 
       */
      override fun healthyThreshold(healthyThreshold: String) {
        cdkBuilder.healthyThreshold(healthyThreshold)
      }

      /**
       * @param interval The approximate interval, in seconds, between health checks of an
       * individual instance. 
       */
      override fun interval(interval: String) {
        cdkBuilder.interval(interval)
      }

      /**
       * @param target The instance being checked. 
       * The protocol is either TCP, HTTP, HTTPS, or SSL. The range of valid ports is one (1)
       * through 65535.
       *
       * TCP is the default, specified as a TCP: port pair, for example "TCP:5000". In this case, a
       * health check simply attempts to open a TCP connection to the instance on the specified port.
       * Failure to connect within the configured timeout is considered unhealthy.
       *
       * SSL is also specified as SSL: port pair, for example, SSL:5000.
       *
       * For HTTP/HTTPS, you must include a ping path in the string. HTTP is specified as a
       * HTTP:port;/;PathToPing; grouping, for example "HTTP:80/weather/us/wa/seattle". In this case, a
       * HTTP GET request is issued to the instance on the given port and path. Any answer other than
       * "200 OK" within the timeout period is considered unhealthy.
       *
       * The total length of the HTTP ping target must be 1024 16-bit Unicode characters or less.
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      /**
       * @param timeout The amount of time, in seconds, during which no response means a failed
       * health check. 
       * This value must be less than the `Interval` value.
       */
      override fun timeout(timeout: String) {
        cdkBuilder.timeout(timeout)
      }

      /**
       * @param unhealthyThreshold The number of consecutive health check failures required before
       * moving the instance to the `Unhealthy` state. 
       */
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
      /**
       * The number of consecutive health checks successes required before moving the instance to
       * the `Healthy` state.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-healthcheck.html#cfn-elasticloadbalancing-loadbalancer-healthcheck-healthythreshold)
       */
      override fun healthyThreshold(): String = unwrap(this).getHealthyThreshold()

      /**
       * The approximate interval, in seconds, between health checks of an individual instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-healthcheck.html#cfn-elasticloadbalancing-loadbalancer-healthcheck-interval)
       */
      override fun interval(): String = unwrap(this).getInterval()

      /**
       * The instance being checked.
       *
       * The protocol is either TCP, HTTP, HTTPS, or SSL. The range of valid ports is one (1)
       * through 65535.
       *
       * TCP is the default, specified as a TCP: port pair, for example "TCP:5000". In this case, a
       * health check simply attempts to open a TCP connection to the instance on the specified port.
       * Failure to connect within the configured timeout is considered unhealthy.
       *
       * SSL is also specified as SSL: port pair, for example, SSL:5000.
       *
       * For HTTP/HTTPS, you must include a ping path in the string. HTTP is specified as a
       * HTTP:port;/;PathToPing; grouping, for example "HTTP:80/weather/us/wa/seattle". In this case, a
       * HTTP GET request is issued to the instance on the given port and path. Any answer other than
       * "200 OK" within the timeout period is considered unhealthy.
       *
       * The total length of the HTTP ping target must be 1024 16-bit Unicode characters or less.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-healthcheck.html#cfn-elasticloadbalancing-loadbalancer-healthcheck-target)
       */
      override fun target(): String = unwrap(this).getTarget()

      /**
       * The amount of time, in seconds, during which no response means a failed health check.
       *
       * This value must be less than the `Interval` value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-healthcheck.html#cfn-elasticloadbalancing-loadbalancer-healthcheck-timeout)
       */
      override fun timeout(): String = unwrap(this).getTimeout()

      /**
       * The number of consecutive health check failures required before moving the instance to the
       * `Unhealthy` state.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-healthcheck.html#cfn-elasticloadbalancing-loadbalancer-healthcheck-unhealthythreshold)
       */
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
    /**
     * Specifies whether connection draining is enabled for the load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-connectiondrainingpolicy.html#cfn-elasticloadbalancing-loadbalancer-connectiondrainingpolicy-enabled)
     */
    public fun enabled(): Any

    /**
     * The maximum time, in seconds, to keep the existing connections open before deregistering the
     * instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-connectiondrainingpolicy.html#cfn-elasticloadbalancing-loadbalancer-connectiondrainingpolicy-timeout)
     */
    public fun timeout(): Number? = unwrap(this).getTimeout()

    /**
     * A builder for [ConnectionDrainingPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Specifies whether connection draining is enabled for the load balancer. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specifies whether connection draining is enabled for the load balancer. 
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param timeout The maximum time, in seconds, to keep the existing connections open before
       * deregistering the instances.
       */
      public fun timeout(timeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.ConnectionDrainingPolicyProperty.builder()

      /**
       * @param enabled Specifies whether connection draining is enabled for the load balancer. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specifies whether connection draining is enabled for the load balancer. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param timeout The maximum time, in seconds, to keep the existing connections open before
       * deregistering the instances.
       */
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
      /**
       * Specifies whether connection draining is enabled for the load balancer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-connectiondrainingpolicy.html#cfn-elasticloadbalancing-loadbalancer-connectiondrainingpolicy-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * The maximum time, in seconds, to keep the existing connections open before deregistering
       * the instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancing-loadbalancer-connectiondrainingpolicy.html#cfn-elasticloadbalancing-loadbalancer-connectiondrainingpolicy-timeout)
       */
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
