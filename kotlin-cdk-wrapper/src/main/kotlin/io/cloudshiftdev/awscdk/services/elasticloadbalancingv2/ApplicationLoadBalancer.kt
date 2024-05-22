@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define an Application Load Balancer.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.autoscaling.AutoScalingGroup;
 * AutoScalingGroup asg;
 * Vpc vpc;
 * // Create the load balancer in a VPC. 'internetFacing' is 'false'
 * // by default, which creates an internal load balancer.
 * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .build();
 * // Add a listener and open up the load balancer's security group
 * // to the world.
 * ApplicationListener listener = lb.addListener("Listener", BaseApplicationListenerProps.builder()
 * .port(80)
 * // 'open: true' is the default, you can leave it out if you want. Set it
 * // to 'false' and use `listener.connections` if you want to be selective
 * // about who can access the load balancer.
 * .open(true)
 * .build());
 * // Create an AutoScaling group and add it as a load balancing
 * // target to the listener.
 * listener.addTargets("ApplicationFleet", AddApplicationTargetsProps.builder()
 * .port(8080)
 * .targets(List.of(asg))
 * .build());
 * ```
 */
public open class ApplicationLoadBalancer(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer,
) : BaseLoadBalancer(cdkObject), IApplicationLoadBalancer {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ApplicationLoadBalancerProps,
  ) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ApplicationLoadBalancerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ApplicationLoadBalancerProps.Builder.() -> Unit,
  ) : this(scope, id, ApplicationLoadBalancerProps(props)
  )

  /**
   * Add a new listener to this load balancer.
   *
   * @param id 
   * @param props 
   */
  public override fun addListener(id: String, props: BaseApplicationListenerProps):
      ApplicationListener = unwrap(this).addListener(id,
      props.let(BaseApplicationListenerProps.Companion::unwrap)).let(ApplicationListener::wrap)

  /**
   * Add a new listener to this load balancer.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c4214bb0ef19ba7cc886c0c0c590fdb239a96d82b7e5e0b4b1bbe44fe0af6df0")
  public override fun addListener(id: String,
      props: BaseApplicationListenerProps.Builder.() -> Unit): ApplicationListener = addListener(id,
      BaseApplicationListenerProps(props))

  /**
   * Add a redirection listener to this load balancer.
   *
   * @param props
   */
  public open fun addRedirect(): ApplicationListener =
      unwrap(this).addRedirect().let(ApplicationListener::wrap)

  /**
   * Add a redirection listener to this load balancer.
   *
   * @param props
   */
  public open fun addRedirect(props: ApplicationLoadBalancerRedirectConfig): ApplicationListener =
      unwrap(this).addRedirect(props.let(ApplicationLoadBalancerRedirectConfig.Companion::unwrap)).let(ApplicationListener::wrap)

  /**
   * Add a redirection listener to this load balancer.
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("414603ae3ccbdc13cba74213055b0f1f5d7593a29ad9b9b93963d4a5b6df379b")
  public open fun addRedirect(props: ApplicationLoadBalancerRedirectConfig.Builder.() -> Unit):
      ApplicationListener = addRedirect(ApplicationLoadBalancerRedirectConfig(props))

  /**
   * Add a security group to this load balancer.
   *
   * @param securityGroup 
   */
  public open fun addSecurityGroup(securityGroup: ISecurityGroup) {
    unwrap(this).addSecurityGroup(securityGroup.let(ISecurityGroup.Companion::unwrap))
  }

  /**
   * The network connections associated with this resource.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The IP Address Type for this load balancer.
   */
  public override fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  /**
   * A list of listeners that have been added to the load balancer.
   *
   * This list is only valid for owned constructs.
   */
  public override fun listeners(): List<ApplicationListener> =
      unwrap(this).getListeners().map(ApplicationListener::wrap)

  /**
   * Enable access logging for this load balancer.
   *
   * A region must be specified on the stack containing the load balancer; you cannot enable logging
   * on
   * environment-agnostic stacks. See https://docs.aws.amazon.com/cdk/latest/guide/environments.html
   *
   * @param bucket 
   * @param prefix
   */
  public override fun logAccessLogs(bucket: IBucket) {
    unwrap(this).logAccessLogs(bucket.let(IBucket.Companion::unwrap))
  }

  /**
   * Enable access logging for this load balancer.
   *
   * A region must be specified on the stack containing the load balancer; you cannot enable logging
   * on
   * environment-agnostic stacks. See https://docs.aws.amazon.com/cdk/latest/guide/environments.html
   *
   * @param bucket 
   * @param prefix
   */
  public override fun logAccessLogs(bucket: IBucket, prefix: String) {
    unwrap(this).logAccessLogs(bucket.let(IBucket.Companion::unwrap), prefix)
  }

  /**
   * (deprecated) Return the given named metric for this Application Load Balancer.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.custom` instead
   * @param metricName 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * (deprecated) Return the given named metric for this Application Load Balancer.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.custom` instead
   * @param metricName 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Return the given named metric for this Application Load Balancer.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.custom` instead
   * @param metricName 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public open fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * (deprecated) The total number of concurrent TCP connections active from clients to the load
   * balancer and from the load balancer to targets.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.activeConnectionCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricActiveConnectionCount(): Metric =
      unwrap(this).metricActiveConnectionCount().let(Metric::wrap)

  /**
   * (deprecated) The total number of concurrent TCP connections active from clients to the load
   * balancer and from the load balancer to targets.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.activeConnectionCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricActiveConnectionCount(props: MetricOptions): Metric =
      unwrap(this).metricActiveConnectionCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The total number of concurrent TCP connections active from clients to the load
   * balancer and from the load balancer to targets.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.activeConnectionCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc2495f0c07e948e0f827d073b565f686e104fc4fec278d64cdc2311f39fd492")
  public open fun metricActiveConnectionCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricActiveConnectionCount(MetricOptions(props))

  /**
   * (deprecated) The number of TLS connections initiated by the client that did not establish a
   * session with the load balancer.
   *
   * Possible causes include a
   * mismatch of ciphers or protocols.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.clientTlsNegotiationErrorCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricClientTlsNegotiationErrorCount(): Metric =
      unwrap(this).metricClientTlsNegotiationErrorCount().let(Metric::wrap)

  /**
   * (deprecated) The number of TLS connections initiated by the client that did not establish a
   * session with the load balancer.
   *
   * Possible causes include a
   * mismatch of ciphers or protocols.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.clientTlsNegotiationErrorCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricClientTlsNegotiationErrorCount(props: MetricOptions): Metric =
      unwrap(this).metricClientTlsNegotiationErrorCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of TLS connections initiated by the client that did not establish a
   * session with the load balancer.
   *
   * Possible causes include a
   * mismatch of ciphers or protocols.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.clientTlsNegotiationErrorCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("16b8a4e8915c89a82cd45c28b3becc2a093996c16013e8ef6401b1961ebf2d1c")
  public open fun metricClientTlsNegotiationErrorCount(props: MetricOptions.Builder.() -> Unit):
      Metric = metricClientTlsNegotiationErrorCount(MetricOptions(props))

  /**
   * (deprecated) The number of load balancer capacity units (LCU) used by your load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.consumedLCUs` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricConsumedLCUs(): Metric = unwrap(this).metricConsumedLCUs().let(Metric::wrap)

  /**
   * (deprecated) The number of load balancer capacity units (LCU) used by your load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.consumedLCUs` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricConsumedLCUs(props: MetricOptions): Metric =
      unwrap(this).metricConsumedLCUs(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of load balancer capacity units (LCU) used by your load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.consumedLCUs` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3e6de8e93f42ba897d92007009735fcc06aede8f8d1f7a9b5b0846ad0b5c213")
  public open fun metricConsumedLCUs(props: MetricOptions.Builder.() -> Unit): Metric =
      metricConsumedLCUs(MetricOptions(props))

  /**
   * (deprecated) The number of user authentications that could not be completed.
   *
   * Because an authenticate action was misconfigured, the load balancer
   * couldn't establish a connection with the IdP, or the load balancer
   * couldn't complete the authentication flow due to an internal error.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthError` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthError(): Metric = unwrap(this).metricElbAuthError().let(Metric::wrap)

  /**
   * (deprecated) The number of user authentications that could not be completed.
   *
   * Because an authenticate action was misconfigured, the load balancer
   * couldn't establish a connection with the IdP, or the load balancer
   * couldn't complete the authentication flow due to an internal error.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthError` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthError(props: MetricOptions): Metric =
      unwrap(this).metricElbAuthError(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of user authentications that could not be completed.
   *
   * Because an authenticate action was misconfigured, the load balancer
   * couldn't establish a connection with the IdP, or the load balancer
   * couldn't complete the authentication flow due to an internal error.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthError` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0580ab9489dbe9c58014f0442e64e902baa9afdf60c89a0982e2347f06d87e75")
  public open fun metricElbAuthError(props: MetricOptions.Builder.() -> Unit): Metric =
      metricElbAuthError(MetricOptions(props))

  /**
   * (deprecated) The number of user authentications that could not be completed because the IdP
   * denied access to the user or an authorization code was used more than once.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthFailure` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthFailure(): Metric =
      unwrap(this).metricElbAuthFailure().let(Metric::wrap)

  /**
   * (deprecated) The number of user authentications that could not be completed because the IdP
   * denied access to the user or an authorization code was used more than once.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthFailure` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthFailure(props: MetricOptions): Metric =
      unwrap(this).metricElbAuthFailure(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of user authentications that could not be completed because the IdP
   * denied access to the user or an authorization code was used more than once.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthFailure` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7fd26803a940ec76e11c596d367dc084ee5431b3622420fef0f4b1595ee3db63")
  public open fun metricElbAuthFailure(props: MetricOptions.Builder.() -> Unit): Metric =
      metricElbAuthFailure(MetricOptions(props))

  /**
   * (deprecated) The time elapsed, in milliseconds, to query the IdP for the ID token and user
   * info.
   *
   * If one or more of these operations fail, this is the time to failure.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthLatency` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthLatency(): Metric =
      unwrap(this).metricElbAuthLatency().let(Metric::wrap)

  /**
   * (deprecated) The time elapsed, in milliseconds, to query the IdP for the ID token and user
   * info.
   *
   * If one or more of these operations fail, this is the time to failure.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthLatency` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthLatency(props: MetricOptions): Metric =
      unwrap(this).metricElbAuthLatency(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The time elapsed, in milliseconds, to query the IdP for the ID token and user
   * info.
   *
   * If one or more of these operations fail, this is the time to failure.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthLatency` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f4a652d5ae97791e249e36f6ec958dcf9a7db75232cc9a189fa42426453b5f1")
  public open fun metricElbAuthLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricElbAuthLatency(MetricOptions(props))

  /**
   * (deprecated) The number of authenticate actions that were successful.
   *
   * This metric is incremented at the end of the authentication workflow,
   * after the load balancer has retrieved the user claims from the IdP.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthSuccess` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthSuccess(): Metric =
      unwrap(this).metricElbAuthSuccess().let(Metric::wrap)

  /**
   * (deprecated) The number of authenticate actions that were successful.
   *
   * This metric is incremented at the end of the authentication workflow,
   * after the load balancer has retrieved the user claims from the IdP.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthSuccess` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricElbAuthSuccess(props: MetricOptions): Metric =
      unwrap(this).metricElbAuthSuccess(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of authenticate actions that were successful.
   *
   * This metric is incremented at the end of the authentication workflow,
   * after the load balancer has retrieved the user claims from the IdP.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.elbAuthSuccess` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c6d3739c144b2050cdbad6b39cf17ec2c6766a1bb389bbddc3ad1d498f3ac7b5")
  public open fun metricElbAuthSuccess(props: MetricOptions.Builder.() -> Unit): Metric =
      metricElbAuthSuccess(MetricOptions(props))

  /**
   * (deprecated) The number of HTTP 3xx/4xx/5xx codes that originate from the load balancer.
   *
   * This does not include any response codes generated by the targets.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.httpCodeElb` instead
   * @param code 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpCodeElb(code: HttpCodeElb): Metric =
      unwrap(this).metricHttpCodeElb(code.let(HttpCodeElb.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of HTTP 3xx/4xx/5xx codes that originate from the load balancer.
   *
   * This does not include any response codes generated by the targets.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.httpCodeElb` instead
   * @param code 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpCodeElb(code: HttpCodeElb, props: MetricOptions): Metric =
      unwrap(this).metricHttpCodeElb(code.let(HttpCodeElb.Companion::unwrap),
      props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of HTTP 3xx/4xx/5xx codes that originate from the load balancer.
   *
   * This does not include any response codes generated by the targets.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.httpCodeElb` instead
   * @param code 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("392490a1a26046d62d729c33c4d04fa8855bcd51361678757e4b14bed869e570")
  public open fun metricHttpCodeElb(code: HttpCodeElb, props: MetricOptions.Builder.() -> Unit):
      Metric = metricHttpCodeElb(code, MetricOptions(props))

  /**
   * (deprecated) The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in the
   * load balancer.
   *
   * This does not include any response codes generated by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.httpCodeTarget` instead
   * @param code 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpCodeTarget(code: HttpCodeTarget): Metric =
      unwrap(this).metricHttpCodeTarget(code.let(HttpCodeTarget.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in the
   * load balancer.
   *
   * This does not include any response codes generated by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.httpCodeTarget` instead
   * @param code 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpCodeTarget(code: HttpCodeTarget, props: MetricOptions): Metric =
      unwrap(this).metricHttpCodeTarget(code.let(HttpCodeTarget.Companion::unwrap),
      props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in the
   * load balancer.
   *
   * This does not include any response codes generated by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.httpCodeTarget` instead
   * @param code 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("121a82afa7f74fa036d0dc74440ef0d024223acab827324eda17b612a9012454")
  public open fun metricHttpCodeTarget(code: HttpCodeTarget,
      props: MetricOptions.Builder.() -> Unit): Metric = metricHttpCodeTarget(code,
      MetricOptions(props))

  /**
   * (deprecated) The number of fixed-response actions that were successful.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.httpFixedResponseCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpFixedResponseCount(): Metric =
      unwrap(this).metricHttpFixedResponseCount().let(Metric::wrap)

  /**
   * (deprecated) The number of fixed-response actions that were successful.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.httpFixedResponseCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpFixedResponseCount(props: MetricOptions): Metric =
      unwrap(this).metricHttpFixedResponseCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of fixed-response actions that were successful.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.httpFixedResponseCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("708d3a5f6c77a47f8d4cc6450e438b896f03f03634ec519d9487b34b574ab88f")
  public open fun metricHttpFixedResponseCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricHttpFixedResponseCount(MetricOptions(props))

  /**
   * (deprecated) The number of redirect actions that were successful.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.httpRedirectCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpRedirectCount(): Metric =
      unwrap(this).metricHttpRedirectCount().let(Metric::wrap)

  /**
   * (deprecated) The number of redirect actions that were successful.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.httpRedirectCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpRedirectCount(props: MetricOptions): Metric =
      unwrap(this).metricHttpRedirectCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of redirect actions that were successful.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.httpRedirectCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f68dc9546e33be9e44d6380446148205bd816c5ec5cb2586d1fdd6e78550d68e")
  public open fun metricHttpRedirectCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricHttpRedirectCount(MetricOptions(props))

  /**
   * (deprecated) The number of redirect actions that couldn't be completed because the URL in the
   * response location header is larger than 8K.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.httpRedirectUrlLimitExceededCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpRedirectUrlLimitExceededCount(): Metric =
      unwrap(this).metricHttpRedirectUrlLimitExceededCount().let(Metric::wrap)

  /**
   * (deprecated) The number of redirect actions that couldn't be completed because the URL in the
   * response location header is larger than 8K.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.httpRedirectUrlLimitExceededCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricHttpRedirectUrlLimitExceededCount(props: MetricOptions): Metric =
      unwrap(this).metricHttpRedirectUrlLimitExceededCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of redirect actions that couldn't be completed because the URL in the
   * response location header is larger than 8K.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.httpRedirectUrlLimitExceededCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f1bd177b78d76f5765fa34d80632dca682423dd12e1b15fcb42f78ecc5b633e5")
  public open fun metricHttpRedirectUrlLimitExceededCount(props: MetricOptions.Builder.() -> Unit):
      Metric = metricHttpRedirectUrlLimitExceededCount(MetricOptions(props))

  /**
   * (deprecated) The total number of bytes processed by the load balancer over IPv6.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.ipv6ProcessedBytes` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricIpv6ProcessedBytes(): Metric =
      unwrap(this).metricIpv6ProcessedBytes().let(Metric::wrap)

  /**
   * (deprecated) The total number of bytes processed by the load balancer over IPv6.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.ipv6ProcessedBytes` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricIpv6ProcessedBytes(props: MetricOptions): Metric =
      unwrap(this).metricIpv6ProcessedBytes(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The total number of bytes processed by the load balancer over IPv6.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.ipv6ProcessedBytes` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("368b04a6767889e581b1f4fe7f2c53a95e67377e7ea031b12e27a65fd45691d7")
  public open fun metricIpv6ProcessedBytes(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIpv6ProcessedBytes(MetricOptions(props))

  /**
   * (deprecated) The number of IPv6 requests received by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.ipv6RequestCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricIpv6RequestCount(): Metric =
      unwrap(this).metricIpv6RequestCount().let(Metric::wrap)

  /**
   * (deprecated) The number of IPv6 requests received by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.ipv6RequestCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricIpv6RequestCount(props: MetricOptions): Metric =
      unwrap(this).metricIpv6RequestCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of IPv6 requests received by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.ipv6RequestCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7cb2b61a2d0456f8f0f6806cc31cbb006c4e1f7f92ce14af7aae5ed4fcb572d1")
  public open fun metricIpv6RequestCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIpv6RequestCount(MetricOptions(props))

  /**
   * (deprecated) The total number of new TCP connections established from clients to the load
   * balancer and from the load balancer to targets.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.newConnectionCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricNewConnectionCount(): Metric =
      unwrap(this).metricNewConnectionCount().let(Metric::wrap)

  /**
   * (deprecated) The total number of new TCP connections established from clients to the load
   * balancer and from the load balancer to targets.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.newConnectionCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricNewConnectionCount(props: MetricOptions): Metric =
      unwrap(this).metricNewConnectionCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The total number of new TCP connections established from clients to the load
   * balancer and from the load balancer to targets.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.newConnectionCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("37c5b98067bb035b5e102e72637621be6f4492f65ba4290ce686a56f69e0d7cb")
  public open fun metricNewConnectionCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricNewConnectionCount(MetricOptions(props))

  /**
   * (deprecated) The total number of bytes processed by the load balancer over IPv4 and IPv6.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.processedBytes` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricProcessedBytes(): Metric =
      unwrap(this).metricProcessedBytes().let(Metric::wrap)

  /**
   * (deprecated) The total number of bytes processed by the load balancer over IPv4 and IPv6.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.processedBytes` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricProcessedBytes(props: MetricOptions): Metric =
      unwrap(this).metricProcessedBytes(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The total number of bytes processed by the load balancer over IPv4 and IPv6.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.processedBytes` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5508437533a512ae29d20a7b9481b4dc589656903396c8e04e3af24fd5173cac")
  public open fun metricProcessedBytes(props: MetricOptions.Builder.() -> Unit): Metric =
      metricProcessedBytes(MetricOptions(props))

  /**
   * (deprecated) The number of connections that were rejected because the load balancer had reached
   * its maximum number of connections.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.rejectedConnectionCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricRejectedConnectionCount(): Metric =
      unwrap(this).metricRejectedConnectionCount().let(Metric::wrap)

  /**
   * (deprecated) The number of connections that were rejected because the load balancer had reached
   * its maximum number of connections.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.rejectedConnectionCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricRejectedConnectionCount(props: MetricOptions): Metric =
      unwrap(this).metricRejectedConnectionCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of connections that were rejected because the load balancer had reached
   * its maximum number of connections.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.rejectedConnectionCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2b33e13f88061de48eb045aaee0cb6a782669f87b64d3a6e1bf71710bba288d1")
  public open fun metricRejectedConnectionCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricRejectedConnectionCount(MetricOptions(props))

  /**
   * (deprecated) The number of requests processed over IPv4 and IPv6.
   *
   * This count includes only the requests with a response generated by a target of the load
   * balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.requestCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricRequestCount(): Metric = unwrap(this).metricRequestCount().let(Metric::wrap)

  /**
   * (deprecated) The number of requests processed over IPv4 and IPv6.
   *
   * This count includes only the requests with a response generated by a target of the load
   * balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.requestCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricRequestCount(props: MetricOptions): Metric =
      unwrap(this).metricRequestCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of requests processed over IPv4 and IPv6.
   *
   * This count includes only the requests with a response generated by a target of the load
   * balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.requestCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a6855b6eecd989b6fd05d9eadf7997928023d1bd51a53703a9bb975518c563c2")
  public open fun metricRequestCount(props: MetricOptions.Builder.() -> Unit): Metric =
      metricRequestCount(MetricOptions(props))

  /**
   * (deprecated) The number of rules processed by the load balancer given a request rate averaged
   * over an hour.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.ruleEvaluations` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricRuleEvaluations(): Metric =
      unwrap(this).metricRuleEvaluations().let(Metric::wrap)

  /**
   * (deprecated) The number of rules processed by the load balancer given a request rate averaged
   * over an hour.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.ruleEvaluations` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricRuleEvaluations(props: MetricOptions): Metric =
      unwrap(this).metricRuleEvaluations(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of rules processed by the load balancer given a request rate averaged
   * over an hour.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.ruleEvaluations` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b5209985584d12969eab89cf0298f5fce3e6f9139755e0599849fab3bbc0e5fd")
  public open fun metricRuleEvaluations(props: MetricOptions.Builder.() -> Unit): Metric =
      metricRuleEvaluations(MetricOptions(props))

  /**
   * (deprecated) The number of connections that were not successfully established between the load
   * balancer and target.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.targetConnectionErrorCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetConnectionErrorCount(): Metric =
      unwrap(this).metricTargetConnectionErrorCount().let(Metric::wrap)

  /**
   * (deprecated) The number of connections that were not successfully established between the load
   * balancer and target.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.targetConnectionErrorCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetConnectionErrorCount(props: MetricOptions): Metric =
      unwrap(this).metricTargetConnectionErrorCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of connections that were not successfully established between the load
   * balancer and target.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.targetConnectionErrorCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("89056777171dd65db09c827c4c0fa488d94a8c0bc618f5b80e0b582e570684fe")
  public open fun metricTargetConnectionErrorCount(props: MetricOptions.Builder.() -> Unit): Metric
      = metricTargetConnectionErrorCount(MetricOptions(props))

  /**
   * (deprecated) The time elapsed, in seconds, after the request leaves the load balancer until a
   * response from the target is received.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.targetResponseTime` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetResponseTime(): Metric =
      unwrap(this).metricTargetResponseTime().let(Metric::wrap)

  /**
   * (deprecated) The time elapsed, in seconds, after the request leaves the load balancer until a
   * response from the target is received.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.targetResponseTime` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetResponseTime(props: MetricOptions): Metric =
      unwrap(this).metricTargetResponseTime(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The time elapsed, in seconds, after the request leaves the load balancer until a
   * response from the target is received.
   *
   * Default: Average over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.targetResponseTime` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("47cb9abec01142cff45f0038aa6de07ef9926f5c2b9b0dfe8af82ee727462c44")
  public open fun metricTargetResponseTime(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTargetResponseTime(MetricOptions(props))

  /**
   * (deprecated) The number of TLS connections initiated by the load balancer that did not
   * establish a session with the target.
   *
   * Possible causes include a mismatch of ciphers or protocols.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.targetTLSNegotiationErrorCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetTLSNegotiationErrorCount(): Metric =
      unwrap(this).metricTargetTLSNegotiationErrorCount().let(Metric::wrap)

  /**
   * (deprecated) The number of TLS connections initiated by the load balancer that did not
   * establish a session with the target.
   *
   * Possible causes include a mismatch of ciphers or protocols.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.targetTLSNegotiationErrorCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricTargetTLSNegotiationErrorCount(props: MetricOptions): Metric =
      unwrap(this).metricTargetTLSNegotiationErrorCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) The number of TLS connections initiated by the load balancer that did not
   * establish a session with the target.
   *
   * Possible causes include a mismatch of ciphers or protocols.
   *
   * Default: Sum over 5 minutes
   *
   * @deprecated Use `ApplicationLoadBalancer.metrics.targetTLSNegotiationErrorCount` instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("70bf713a49db7cc1ea5cbee18d1539d5f4fc72d053cab9032f0270e4cb252ce2")
  public open fun metricTargetTLSNegotiationErrorCount(props: MetricOptions.Builder.() -> Unit):
      Metric = metricTargetTLSNegotiationErrorCount(MetricOptions(props))

  /**
   * All metrics available for this load balancer.
   */
  public override fun metrics(): IApplicationLoadBalancerMetrics =
      unwrap(this).getMetrics().let(IApplicationLoadBalancerMetrics::wrap)

  public override fun vpc(): IVpc? = IApplicationLoadBalancer.unwrap(this).vpc?.let(IVpc::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The client keep alive duration.
     *
     * The valid range is 60 to 604800 seconds (1 minute to 7 days).
     *
     * Default: - Duration.seconds(3600)
     *
     * @param clientKeepAlive The client keep alive duration. 
     */
    public fun clientKeepAlive(clientKeepAlive: Duration)

    /**
     * Indicates whether cross-zone load balancing is enabled.
     *
     * Default: - false for Network Load Balancers and true for Application Load Balancers.
     * This can not be `false` for Application Load Balancers.
     *
     * [Documentation]( -
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-loadbalancerattribute.html)
     * @param crossZoneEnabled Indicates whether cross-zone load balancing is enabled. 
     */
    public fun crossZoneEnabled(crossZoneEnabled: Boolean)

    /**
     * Indicates whether deletion protection is enabled.
     *
     * Default: false
     *
     * @param deletionProtection Indicates whether deletion protection is enabled. 
     */
    public fun deletionProtection(deletionProtection: Boolean)

    /**
     * Indicates whether the load balancer blocks traffic through the Internet Gateway (IGW).
     *
     * Default: - false for internet-facing load balancers and true for internal load balancers
     *
     * @param denyAllIgwTraffic Indicates whether the load balancer blocks traffic through the
     * Internet Gateway (IGW). 
     */
    public fun denyAllIgwTraffic(denyAllIgwTraffic: Boolean)

    /**
     * Determines how the load balancer handles requests that might pose a security risk to your
     * application.
     *
     * Default: DesyncMitigationMode.DEFENSIVE
     *
     * @param desyncMitigationMode Determines how the load balancer handles requests that might pose
     * a security risk to your application. 
     */
    public fun desyncMitigationMode(desyncMitigationMode: DesyncMitigationMode)

    /**
     * Indicates whether HTTP headers with invalid header fields are removed by the load balancer
     * (true) or routed to targets (false).
     *
     * Default: false
     *
     * @param dropInvalidHeaderFields Indicates whether HTTP headers with invalid header fields are
     * removed by the load balancer (true) or routed to targets (false). 
     */
    public fun dropInvalidHeaderFields(dropInvalidHeaderFields: Boolean)

    /**
     * Indicates whether HTTP/2 is enabled.
     *
     * Default: true
     *
     * @param http2Enabled Indicates whether HTTP/2 is enabled. 
     */
    public fun http2Enabled(http2Enabled: Boolean)

    /**
     * The load balancer idle timeout, in seconds.
     *
     * Default: 60
     *
     * @param idleTimeout The load balancer idle timeout, in seconds. 
     */
    public fun idleTimeout(idleTimeout: Duration)

    /**
     * Whether the load balancer has an internet-routable address.
     *
     * Default: false
     *
     * @param internetFacing Whether the load balancer has an internet-routable address. 
     */
    public fun internetFacing(internetFacing: Boolean)

    /**
     * The type of IP addresses to use.
     *
     * Default: IpAddressType.IPV4
     *
     * @param ipAddressType The type of IP addresses to use. 
     */
    public fun ipAddressType(ipAddressType: IpAddressType)

    /**
     * Name of the load balancer.
     *
     * Default: - Automatically generated name.
     *
     * @param loadBalancerName Name of the load balancer. 
     */
    public fun loadBalancerName(loadBalancerName: String)

    /**
     * Indicates whether the Application Load Balancer should preserve the host header in the HTTP
     * request and send it to the target without any change.
     *
     * Default: false
     *
     * @param preserveHostHeader Indicates whether the Application Load Balancer should preserve the
     * host header in the HTTP request and send it to the target without any change. 
     */
    public fun preserveHostHeader(preserveHostHeader: Boolean)

    /**
     * Indicates whether the X-Forwarded-For header should preserve the source port that the client
     * used to connect to the load balancer.
     *
     * Default: false
     *
     * @param preserveXffClientPort Indicates whether the X-Forwarded-For header should preserve the
     * source port that the client used to connect to the load balancer. 
     */
    public fun preserveXffClientPort(preserveXffClientPort: Boolean)

    /**
     * Security group to associate with this load balancer.
     *
     * Default: A security group is created
     *
     * @param securityGroup Security group to associate with this load balancer. 
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * The VPC network to place the load balancer in.
     *
     * @param vpc The VPC network to place the load balancer in. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * Which subnets place the load balancer in.
     *
     * Default: - the Vpc default strategy.
     *
     * @param vpcSubnets Which subnets place the load balancer in. 
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelection)

    /**
     * Which subnets place the load balancer in.
     *
     * Default: - the Vpc default strategy.
     *
     * @param vpcSubnets Which subnets place the load balancer in. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37ab8b88b872e71ae62e225b437c3fd8223e8c24ae05dc0ea4ccb865fb06a8c6")
    public fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit)

    /**
     * Indicates whether to allow a WAF-enabled load balancer to route requests to targets if it is
     * unable to forward the request to AWS WAF.
     *
     * Default: false
     *
     * @param wafFailOpen Indicates whether to allow a WAF-enabled load balancer to route requests
     * to targets if it is unable to forward the request to AWS WAF. 
     */
    public fun wafFailOpen(wafFailOpen: Boolean)

    /**
     * Indicates whether the two headers (x-amzn-tls-version and x-amzn-tls-cipher-suite), which
     * contain information about the negotiated TLS version and cipher suite, are added to the client
     * request before sending it to the target.
     *
     * The x-amzn-tls-version header has information about the TLS protocol version negotiated with
     * the client,
     * and the x-amzn-tls-cipher-suite header has information about the cipher suite negotiated with
     * the client.
     *
     * Both headers are in OpenSSL format.
     *
     * Default: false
     *
     * @param xAmznTlsVersionAndCipherSuiteHeaders Indicates whether the two headers
     * (x-amzn-tls-version and x-amzn-tls-cipher-suite), which contain information about the negotiated
     * TLS version and cipher suite, are added to the client request before sending it to the target. 
     */
    public fun xAmznTlsVersionAndCipherSuiteHeaders(xAmznTlsVersionAndCipherSuiteHeaders: Boolean)

    /**
     * Enables you to modify, preserve, or remove the X-Forwarded-For header in the HTTP request
     * before the Application Load Balancer sends the request to the target.
     *
     * Default: XffHeaderProcessingMode.APPEND
     *
     * @param xffHeaderProcessingMode Enables you to modify, preserve, or remove the X-Forwarded-For
     * header in the HTTP request before the Application Load Balancer sends the request to the target.
     * 
     */
    public fun xffHeaderProcessingMode(xffHeaderProcessingMode: XffHeaderProcessingMode)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer.Builder.create(scope,
        id)

    /**
     * The client keep alive duration.
     *
     * The valid range is 60 to 604800 seconds (1 minute to 7 days).
     *
     * Default: - Duration.seconds(3600)
     *
     * @param clientKeepAlive The client keep alive duration. 
     */
    override fun clientKeepAlive(clientKeepAlive: Duration) {
      cdkBuilder.clientKeepAlive(clientKeepAlive.let(Duration.Companion::unwrap))
    }

    /**
     * Indicates whether cross-zone load balancing is enabled.
     *
     * Default: - false for Network Load Balancers and true for Application Load Balancers.
     * This can not be `false` for Application Load Balancers.
     *
     * [Documentation]( -
     * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-loadbalancer-loadbalancerattribute.html)
     * @param crossZoneEnabled Indicates whether cross-zone load balancing is enabled. 
     */
    override fun crossZoneEnabled(crossZoneEnabled: Boolean) {
      cdkBuilder.crossZoneEnabled(crossZoneEnabled)
    }

    /**
     * Indicates whether deletion protection is enabled.
     *
     * Default: false
     *
     * @param deletionProtection Indicates whether deletion protection is enabled. 
     */
    override fun deletionProtection(deletionProtection: Boolean) {
      cdkBuilder.deletionProtection(deletionProtection)
    }

    /**
     * Indicates whether the load balancer blocks traffic through the Internet Gateway (IGW).
     *
     * Default: - false for internet-facing load balancers and true for internal load balancers
     *
     * @param denyAllIgwTraffic Indicates whether the load balancer blocks traffic through the
     * Internet Gateway (IGW). 
     */
    override fun denyAllIgwTraffic(denyAllIgwTraffic: Boolean) {
      cdkBuilder.denyAllIgwTraffic(denyAllIgwTraffic)
    }

    /**
     * Determines how the load balancer handles requests that might pose a security risk to your
     * application.
     *
     * Default: DesyncMitigationMode.DEFENSIVE
     *
     * @param desyncMitigationMode Determines how the load balancer handles requests that might pose
     * a security risk to your application. 
     */
    override fun desyncMitigationMode(desyncMitigationMode: DesyncMitigationMode) {
      cdkBuilder.desyncMitigationMode(desyncMitigationMode.let(DesyncMitigationMode.Companion::unwrap))
    }

    /**
     * Indicates whether HTTP headers with invalid header fields are removed by the load balancer
     * (true) or routed to targets (false).
     *
     * Default: false
     *
     * @param dropInvalidHeaderFields Indicates whether HTTP headers with invalid header fields are
     * removed by the load balancer (true) or routed to targets (false). 
     */
    override fun dropInvalidHeaderFields(dropInvalidHeaderFields: Boolean) {
      cdkBuilder.dropInvalidHeaderFields(dropInvalidHeaderFields)
    }

    /**
     * Indicates whether HTTP/2 is enabled.
     *
     * Default: true
     *
     * @param http2Enabled Indicates whether HTTP/2 is enabled. 
     */
    override fun http2Enabled(http2Enabled: Boolean) {
      cdkBuilder.http2Enabled(http2Enabled)
    }

    /**
     * The load balancer idle timeout, in seconds.
     *
     * Default: 60
     *
     * @param idleTimeout The load balancer idle timeout, in seconds. 
     */
    override fun idleTimeout(idleTimeout: Duration) {
      cdkBuilder.idleTimeout(idleTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * Whether the load balancer has an internet-routable address.
     *
     * Default: false
     *
     * @param internetFacing Whether the load balancer has an internet-routable address. 
     */
    override fun internetFacing(internetFacing: Boolean) {
      cdkBuilder.internetFacing(internetFacing)
    }

    /**
     * The type of IP addresses to use.
     *
     * Default: IpAddressType.IPV4
     *
     * @param ipAddressType The type of IP addresses to use. 
     */
    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType.Companion::unwrap))
    }

    /**
     * Name of the load balancer.
     *
     * Default: - Automatically generated name.
     *
     * @param loadBalancerName Name of the load balancer. 
     */
    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    /**
     * Indicates whether the Application Load Balancer should preserve the host header in the HTTP
     * request and send it to the target without any change.
     *
     * Default: false
     *
     * @param preserveHostHeader Indicates whether the Application Load Balancer should preserve the
     * host header in the HTTP request and send it to the target without any change. 
     */
    override fun preserveHostHeader(preserveHostHeader: Boolean) {
      cdkBuilder.preserveHostHeader(preserveHostHeader)
    }

    /**
     * Indicates whether the X-Forwarded-For header should preserve the source port that the client
     * used to connect to the load balancer.
     *
     * Default: false
     *
     * @param preserveXffClientPort Indicates whether the X-Forwarded-For header should preserve the
     * source port that the client used to connect to the load balancer. 
     */
    override fun preserveXffClientPort(preserveXffClientPort: Boolean) {
      cdkBuilder.preserveXffClientPort(preserveXffClientPort)
    }

    /**
     * Security group to associate with this load balancer.
     *
     * Default: A security group is created
     *
     * @param securityGroup Security group to associate with this load balancer. 
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup.Companion::unwrap))
    }

    /**
     * The VPC network to place the load balancer in.
     *
     * @param vpc The VPC network to place the load balancer in. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    /**
     * Which subnets place the load balancer in.
     *
     * Default: - the Vpc default strategy.
     *
     * @param vpcSubnets Which subnets place the load balancer in. 
     */
    override fun vpcSubnets(vpcSubnets: SubnetSelection) {
      cdkBuilder.vpcSubnets(vpcSubnets.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * Which subnets place the load balancer in.
     *
     * Default: - the Vpc default strategy.
     *
     * @param vpcSubnets Which subnets place the load balancer in. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("37ab8b88b872e71ae62e225b437c3fd8223e8c24ae05dc0ea4ccb865fb06a8c6")
    override fun vpcSubnets(vpcSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        vpcSubnets(SubnetSelection(vpcSubnets))

    /**
     * Indicates whether to allow a WAF-enabled load balancer to route requests to targets if it is
     * unable to forward the request to AWS WAF.
     *
     * Default: false
     *
     * @param wafFailOpen Indicates whether to allow a WAF-enabled load balancer to route requests
     * to targets if it is unable to forward the request to AWS WAF. 
     */
    override fun wafFailOpen(wafFailOpen: Boolean) {
      cdkBuilder.wafFailOpen(wafFailOpen)
    }

    /**
     * Indicates whether the two headers (x-amzn-tls-version and x-amzn-tls-cipher-suite), which
     * contain information about the negotiated TLS version and cipher suite, are added to the client
     * request before sending it to the target.
     *
     * The x-amzn-tls-version header has information about the TLS protocol version negotiated with
     * the client,
     * and the x-amzn-tls-cipher-suite header has information about the cipher suite negotiated with
     * the client.
     *
     * Both headers are in OpenSSL format.
     *
     * Default: false
     *
     * @param xAmznTlsVersionAndCipherSuiteHeaders Indicates whether the two headers
     * (x-amzn-tls-version and x-amzn-tls-cipher-suite), which contain information about the negotiated
     * TLS version and cipher suite, are added to the client request before sending it to the target. 
     */
    override
        fun xAmznTlsVersionAndCipherSuiteHeaders(xAmznTlsVersionAndCipherSuiteHeaders: Boolean) {
      cdkBuilder.xAmznTlsVersionAndCipherSuiteHeaders(xAmznTlsVersionAndCipherSuiteHeaders)
    }

    /**
     * Enables you to modify, preserve, or remove the X-Forwarded-For header in the HTTP request
     * before the Application Load Balancer sends the request to the target.
     *
     * Default: XffHeaderProcessingMode.APPEND
     *
     * @param xffHeaderProcessingMode Enables you to modify, preserve, or remove the X-Forwarded-For
     * header in the HTTP request before the Application Load Balancer sends the request to the target.
     * 
     */
    override fun xffHeaderProcessingMode(xffHeaderProcessingMode: XffHeaderProcessingMode) {
      cdkBuilder.xffHeaderProcessingMode(xffHeaderProcessingMode.let(XffHeaderProcessingMode.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromApplicationLoadBalancerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ApplicationLoadBalancerAttributes,
    ): IApplicationLoadBalancer =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer.fromApplicationLoadBalancerAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        attrs.let(ApplicationLoadBalancerAttributes.Companion::unwrap)).let(IApplicationLoadBalancer::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13cee8bdd3ada2786fba9f63419504bcf481668ec2f4e0edb3c498f69610ef38")
    public fun fromApplicationLoadBalancerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ApplicationLoadBalancerAttributes.Builder.() -> Unit,
    ): IApplicationLoadBalancer = fromApplicationLoadBalancerAttributes(scope, id,
        ApplicationLoadBalancerAttributes(attrs))

    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: ApplicationLoadBalancerLookupOptions,
    ): IApplicationLoadBalancer =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer.fromLookup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id,
        options.let(ApplicationLoadBalancerLookupOptions.Companion::unwrap)).let(IApplicationLoadBalancer::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("296951d0c25167abddbc9bef4ff4ec5da29b12faec1bbb29a746129a61469732")
    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: ApplicationLoadBalancerLookupOptions.Builder.() -> Unit,
    ): IApplicationLoadBalancer = fromLookup(scope, id,
        ApplicationLoadBalancerLookupOptions(options))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApplicationLoadBalancer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApplicationLoadBalancer(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer):
        ApplicationLoadBalancer = ApplicationLoadBalancer(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancer):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer =
        wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer
  }
}
