@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Contains all metrics for an Application Load Balancer.
 */
public interface IApplicationLoadBalancerMetrics {
  /**
   * The total number of concurrent TCP connections active from clients to the load balancer and
   * from the load balancer to targets.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun activeConnectionCount(): Metric

  /**
   * The total number of concurrent TCP connections active from clients to the load balancer and
   * from the load balancer to targets.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun activeConnectionCount(props: MetricOptions): Metric

  /**
   * The total number of concurrent TCP connections active from clients to the load balancer and
   * from the load balancer to targets.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e883e659e9f5b247d2582b2e634786d63ac3b1ef6ca1f890b4b18b8b90d5189c")
  public fun activeConnectionCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of TLS connections initiated by the client that did not establish a session with the
   * load balancer.
   *
   * Possible causes include a
   * mismatch of ciphers or protocols.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun clientTlsNegotiationErrorCount(): Metric

  /**
   * The number of TLS connections initiated by the client that did not establish a session with the
   * load balancer.
   *
   * Possible causes include a
   * mismatch of ciphers or protocols.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun clientTlsNegotiationErrorCount(props: MetricOptions): Metric

  /**
   * The number of TLS connections initiated by the client that did not establish a session with the
   * load balancer.
   *
   * Possible causes include a
   * mismatch of ciphers or protocols.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fdbae383d8e263982367b05a82bc68e589a7c576f59dd42c2af44bd37de26925")
  public fun clientTlsNegotiationErrorCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of load balancer capacity units (LCU) used by your load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun consumedLCUs(): Metric

  /**
   * The number of load balancer capacity units (LCU) used by your load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun consumedLCUs(props: MetricOptions): Metric

  /**
   * The number of load balancer capacity units (LCU) used by your load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0a8818b706c379823814d623a4c84e8808252fc6cfff988c82b9c21805c7cc02")
  public fun consumedLCUs(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Return the given named metric for this Application Load Balancer.
   *
   * Default: Average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public fun custom(metricName: String): Metric

  /**
   * Return the given named metric for this Application Load Balancer.
   *
   * Default: Average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public fun custom(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this Application Load Balancer.
   *
   * Default: Average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3a7bf310cfbfe77339a32a3f576ae6834193015bd367fe25d8280f53f24860b")
  public fun custom(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of user authentications that could not be completed.
   *
   * Because an authenticate action was misconfigured, the load balancer
   * couldn't establish a connection with the IdP, or the load balancer
   * couldn't complete the authentication flow due to an internal error.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun elbAuthError(): Metric

  /**
   * The number of user authentications that could not be completed.
   *
   * Because an authenticate action was misconfigured, the load balancer
   * couldn't establish a connection with the IdP, or the load balancer
   * couldn't complete the authentication flow due to an internal error.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun elbAuthError(props: MetricOptions): Metric

  /**
   * The number of user authentications that could not be completed.
   *
   * Because an authenticate action was misconfigured, the load balancer
   * couldn't establish a connection with the IdP, or the load balancer
   * couldn't complete the authentication flow due to an internal error.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12656122a4f18d4bd28d02c8eb4c06650fbf79edfeb9cf85b2946d2a08193e52")
  public fun elbAuthError(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of user authentications that could not be completed because the IdP denied access to
   * the user or an authorization code was used more than once.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun elbAuthFailure(): Metric

  /**
   * The number of user authentications that could not be completed because the IdP denied access to
   * the user or an authorization code was used more than once.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun elbAuthFailure(props: MetricOptions): Metric

  /**
   * The number of user authentications that could not be completed because the IdP denied access to
   * the user or an authorization code was used more than once.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("aa21e9e70d1cb86ab01c7a65f15f70989ca194636fef42a18486fd548f4a76a0")
  public fun elbAuthFailure(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The time elapsed, in milliseconds, to query the IdP for the ID token and user info.
   *
   * If one or more of these operations fail, this is the time to failure.
   *
   * Default: Average over 5 minutes
   *
   * @param props
   */
  public fun elbAuthLatency(): Metric

  /**
   * The time elapsed, in milliseconds, to query the IdP for the ID token and user info.
   *
   * If one or more of these operations fail, this is the time to failure.
   *
   * Default: Average over 5 minutes
   *
   * @param props
   */
  public fun elbAuthLatency(props: MetricOptions): Metric

  /**
   * The time elapsed, in milliseconds, to query the IdP for the ID token and user info.
   *
   * If one or more of these operations fail, this is the time to failure.
   *
   * Default: Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d33c955bd8a8640379e8a1fee24e976ba7b2f06214c1b4b7df598d473a4b0b2f")
  public fun elbAuthLatency(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of authenticate actions that were successful.
   *
   * This metric is incremented at the end of the authentication workflow,
   * after the load balancer has retrieved the user claims from the IdP.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun elbAuthSuccess(): Metric

  /**
   * The number of authenticate actions that were successful.
   *
   * This metric is incremented at the end of the authentication workflow,
   * after the load balancer has retrieved the user claims from the IdP.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun elbAuthSuccess(props: MetricOptions): Metric

  /**
   * The number of authenticate actions that were successful.
   *
   * This metric is incremented at the end of the authentication workflow,
   * after the load balancer has retrieved the user claims from the IdP.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("139f674ec3ad7cc15a247ed7ac3d1313cf9bacbeaeec0013dc930d0161567483")
  public fun elbAuthSuccess(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of HTTP 3xx/4xx/5xx codes that originate from the load balancer.
   *
   * This does not include any response codes generated by the targets.
   *
   * Default: Sum over 5 minutes
   *
   * @param code 
   * @param props
   */
  public fun httpCodeElb(code: HttpCodeElb): Metric

  /**
   * The number of HTTP 3xx/4xx/5xx codes that originate from the load balancer.
   *
   * This does not include any response codes generated by the targets.
   *
   * Default: Sum over 5 minutes
   *
   * @param code 
   * @param props
   */
  public fun httpCodeElb(code: HttpCodeElb, props: MetricOptions): Metric

  /**
   * The number of HTTP 3xx/4xx/5xx codes that originate from the load balancer.
   *
   * This does not include any response codes generated by the targets.
   *
   * Default: Sum over 5 minutes
   *
   * @param code 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4ec0c18e504ddbc3691899458ee1d9517d415b1e48a0d3108d7d82cd429225f5")
  public fun httpCodeElb(code: HttpCodeElb, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in the load
   * balancer.
   *
   * This does not include any response codes generated by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param code 
   * @param props
   */
  public fun httpCodeTarget(code: HttpCodeTarget): Metric

  /**
   * The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in the load
   * balancer.
   *
   * This does not include any response codes generated by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param code 
   * @param props
   */
  public fun httpCodeTarget(code: HttpCodeTarget, props: MetricOptions): Metric

  /**
   * The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in the load
   * balancer.
   *
   * This does not include any response codes generated by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param code 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b24b5392cd4eb3171ba7964626471868514de6667c722081bcf28afba9d8f918")
  public fun httpCodeTarget(code: HttpCodeTarget, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of fixed-response actions that were successful.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun httpFixedResponseCount(): Metric

  /**
   * The number of fixed-response actions that were successful.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun httpFixedResponseCount(props: MetricOptions): Metric

  /**
   * The number of fixed-response actions that were successful.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38a993e824d91e43ce5a53673c0a44751916a494aaadf5e648998c7ab9582779")
  public fun httpFixedResponseCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of redirect actions that were successful.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun httpRedirectCount(): Metric

  /**
   * The number of redirect actions that were successful.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun httpRedirectCount(props: MetricOptions): Metric

  /**
   * The number of redirect actions that were successful.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dbe5cdf8d522d73b93f6c8d9b5d82eab909a9d6ebddc89e6dd73a85f9cb612d0")
  public fun httpRedirectCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of redirect actions that couldn't be completed because the URL in the response
   * location header is larger than 8K.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun httpRedirectUrlLimitExceededCount(): Metric

  /**
   * The number of redirect actions that couldn't be completed because the URL in the response
   * location header is larger than 8K.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun httpRedirectUrlLimitExceededCount(props: MetricOptions): Metric

  /**
   * The number of redirect actions that couldn't be completed because the URL in the response
   * location header is larger than 8K.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e327dd03e46195ca0a0412eb1f1b527c163061e837653be3ee60e714c552e76c")
  public fun httpRedirectUrlLimitExceededCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The total number of bytes processed by the load balancer over IPv6.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun ipv6ProcessedBytes(): Metric

  /**
   * The total number of bytes processed by the load balancer over IPv6.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun ipv6ProcessedBytes(props: MetricOptions): Metric

  /**
   * The total number of bytes processed by the load balancer over IPv6.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("32a0d4822abcb35e4c2fa5f348ec171d008bcec27186e2fc2b4b2b80bba8258f")
  public fun ipv6ProcessedBytes(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of IPv6 requests received by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun ipv6RequestCount(): Metric

  /**
   * The number of IPv6 requests received by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun ipv6RequestCount(props: MetricOptions): Metric

  /**
   * The number of IPv6 requests received by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c99b7ad341d61067977149bec151ac4f7bbfa5b606fd1f34d5a0f67bbdfd466")
  public fun ipv6RequestCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The total number of new TCP connections established from clients to the load balancer and from
   * the load balancer to targets.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun newConnectionCount(): Metric

  /**
   * The total number of new TCP connections established from clients to the load balancer and from
   * the load balancer to targets.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun newConnectionCount(props: MetricOptions): Metric

  /**
   * The total number of new TCP connections established from clients to the load balancer and from
   * the load balancer to targets.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("28b664629d8b7698209c63dc1a10d10d8fa9e4d5e6e924ab8b07a75a7b957dc6")
  public fun newConnectionCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The total number of bytes processed by the load balancer over IPv4 and IPv6.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun processedBytes(): Metric

  /**
   * The total number of bytes processed by the load balancer over IPv4 and IPv6.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun processedBytes(props: MetricOptions): Metric

  /**
   * The total number of bytes processed by the load balancer over IPv4 and IPv6.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0834009453def8be68d52ce6251707f95f5284610a225d554c4471bca1f54d3b")
  public fun processedBytes(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of connections that were rejected because the load balancer had reached its maximum
   * number of connections.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun rejectedConnectionCount(): Metric

  /**
   * The number of connections that were rejected because the load balancer had reached its maximum
   * number of connections.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun rejectedConnectionCount(props: MetricOptions): Metric

  /**
   * The number of connections that were rejected because the load balancer had reached its maximum
   * number of connections.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e7f89679f2c45631ab488d73b3b8a5e8b11f674a7f17844cce1926b6ea4f97e")
  public fun rejectedConnectionCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of requests processed over IPv4 and IPv6.
   *
   * This count includes only the requests with a response generated by a target of the load
   * balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun requestCount(): Metric

  /**
   * The number of requests processed over IPv4 and IPv6.
   *
   * This count includes only the requests with a response generated by a target of the load
   * balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun requestCount(props: MetricOptions): Metric

  /**
   * The number of requests processed over IPv4 and IPv6.
   *
   * This count includes only the requests with a response generated by a target of the load
   * balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df6a54fa6c6b3bf8b7a44de0f859f5e74b085d7ce578c6a602288988d4106e46")
  public fun requestCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of rules processed by the load balancer given a request rate averaged over an hour.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun ruleEvaluations(): Metric

  /**
   * The number of rules processed by the load balancer given a request rate averaged over an hour.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun ruleEvaluations(props: MetricOptions): Metric

  /**
   * The number of rules processed by the load balancer given a request rate averaged over an hour.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f0f4a275bd9ef52684f0af49aa0046e50f74a4ca4e5d4e5fa0f484bd907daaac")
  public fun ruleEvaluations(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of connections that were not successfully established between the load balancer and
   * target.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun targetConnectionErrorCount(): Metric

  /**
   * The number of connections that were not successfully established between the load balancer and
   * target.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun targetConnectionErrorCount(props: MetricOptions): Metric

  /**
   * The number of connections that were not successfully established between the load balancer and
   * target.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ff66e9db5aa5ccafc9b54a6ff12c01de760a4cd3c0c5f48043c99cb77fa3203b")
  public fun targetConnectionErrorCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The time elapsed, in seconds, after the request leaves the load balancer until a response from
   * the target is received.
   *
   * Default: Average over 5 minutes
   *
   * @param props
   */
  public fun targetResponseTime(): Metric

  /**
   * The time elapsed, in seconds, after the request leaves the load balancer until a response from
   * the target is received.
   *
   * Default: Average over 5 minutes
   *
   * @param props
   */
  public fun targetResponseTime(props: MetricOptions): Metric

  /**
   * The time elapsed, in seconds, after the request leaves the load balancer until a response from
   * the target is received.
   *
   * Default: Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd42be106eb1a94ad8464621cbb797fff2f60bfbaf6069acaafdc175dcd64b7f")
  public fun targetResponseTime(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of TLS connections initiated by the load balancer that did not establish a session
   * with the target.
   *
   * Possible causes include a mismatch of ciphers or protocols.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun targetTLSNegotiationErrorCount(): Metric

  /**
   * The number of TLS connections initiated by the load balancer that did not establish a session
   * with the target.
   *
   * Possible causes include a mismatch of ciphers or protocols.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun targetTLSNegotiationErrorCount(props: MetricOptions): Metric

  /**
   * The number of TLS connections initiated by the load balancer that did not establish a session
   * with the target.
   *
   * Possible causes include a mismatch of ciphers or protocols.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("680e36d5f42c32084e2104a1182ce24b50a180324bfe0c58c1bcd6523da0a161")
  public fun targetTLSNegotiationErrorCount(props: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerMetrics,
  ) : CdkObject(cdkObject), IApplicationLoadBalancerMetrics {
    /**
     * The total number of concurrent TCP connections active from clients to the load balancer and
     * from the load balancer to targets.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun activeConnectionCount(): Metric =
        unwrap(this).activeConnectionCount().let(Metric::wrap)

    /**
     * The total number of concurrent TCP connections active from clients to the load balancer and
     * from the load balancer to targets.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun activeConnectionCount(props: MetricOptions): Metric =
        unwrap(this).activeConnectionCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The total number of concurrent TCP connections active from clients to the load balancer and
     * from the load balancer to targets.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e883e659e9f5b247d2582b2e634786d63ac3b1ef6ca1f890b4b18b8b90d5189c")
    override fun activeConnectionCount(props: MetricOptions.Builder.() -> Unit): Metric =
        activeConnectionCount(MetricOptions(props))

    /**
     * The number of TLS connections initiated by the client that did not establish a session with
     * the load balancer.
     *
     * Possible causes include a
     * mismatch of ciphers or protocols.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun clientTlsNegotiationErrorCount(): Metric =
        unwrap(this).clientTlsNegotiationErrorCount().let(Metric::wrap)

    /**
     * The number of TLS connections initiated by the client that did not establish a session with
     * the load balancer.
     *
     * Possible causes include a
     * mismatch of ciphers or protocols.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun clientTlsNegotiationErrorCount(props: MetricOptions): Metric =
        unwrap(this).clientTlsNegotiationErrorCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of TLS connections initiated by the client that did not establish a session with
     * the load balancer.
     *
     * Possible causes include a
     * mismatch of ciphers or protocols.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdbae383d8e263982367b05a82bc68e589a7c576f59dd42c2af44bd37de26925")
    override fun clientTlsNegotiationErrorCount(props: MetricOptions.Builder.() -> Unit): Metric =
        clientTlsNegotiationErrorCount(MetricOptions(props))

    /**
     * The number of load balancer capacity units (LCU) used by your load balancer.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun consumedLCUs(): Metric = unwrap(this).consumedLCUs().let(Metric::wrap)

    /**
     * The number of load balancer capacity units (LCU) used by your load balancer.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun consumedLCUs(props: MetricOptions): Metric =
        unwrap(this).consumedLCUs(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of load balancer capacity units (LCU) used by your load balancer.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a8818b706c379823814d623a4c84e8808252fc6cfff988c82b9c21805c7cc02")
    override fun consumedLCUs(props: MetricOptions.Builder.() -> Unit): Metric =
        consumedLCUs(MetricOptions(props))

    /**
     * Return the given named metric for this Application Load Balancer.
     *
     * Default: Average over 5 minutes
     *
     * @param metricName 
     * @param props
     */
    override fun custom(metricName: String): Metric =
        unwrap(this).custom(metricName).let(Metric::wrap)

    /**
     * Return the given named metric for this Application Load Balancer.
     *
     * Default: Average over 5 minutes
     *
     * @param metricName 
     * @param props
     */
    override fun custom(metricName: String, props: MetricOptions): Metric =
        unwrap(this).custom(metricName,
        props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Return the given named metric for this Application Load Balancer.
     *
     * Default: Average over 5 minutes
     *
     * @param metricName 
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3a7bf310cfbfe77339a32a3f576ae6834193015bd367fe25d8280f53f24860b")
    override fun custom(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        custom(metricName, MetricOptions(props))

    /**
     * The number of user authentications that could not be completed.
     *
     * Because an authenticate action was misconfigured, the load balancer
     * couldn't establish a connection with the IdP, or the load balancer
     * couldn't complete the authentication flow due to an internal error.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun elbAuthError(): Metric = unwrap(this).elbAuthError().let(Metric::wrap)

    /**
     * The number of user authentications that could not be completed.
     *
     * Because an authenticate action was misconfigured, the load balancer
     * couldn't establish a connection with the IdP, or the load balancer
     * couldn't complete the authentication flow due to an internal error.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun elbAuthError(props: MetricOptions): Metric =
        unwrap(this).elbAuthError(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of user authentications that could not be completed.
     *
     * Because an authenticate action was misconfigured, the load balancer
     * couldn't establish a connection with the IdP, or the load balancer
     * couldn't complete the authentication flow due to an internal error.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12656122a4f18d4bd28d02c8eb4c06650fbf79edfeb9cf85b2946d2a08193e52")
    override fun elbAuthError(props: MetricOptions.Builder.() -> Unit): Metric =
        elbAuthError(MetricOptions(props))

    /**
     * The number of user authentications that could not be completed because the IdP denied access
     * to the user or an authorization code was used more than once.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun elbAuthFailure(): Metric = unwrap(this).elbAuthFailure().let(Metric::wrap)

    /**
     * The number of user authentications that could not be completed because the IdP denied access
     * to the user or an authorization code was used more than once.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun elbAuthFailure(props: MetricOptions): Metric =
        unwrap(this).elbAuthFailure(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of user authentications that could not be completed because the IdP denied access
     * to the user or an authorization code was used more than once.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa21e9e70d1cb86ab01c7a65f15f70989ca194636fef42a18486fd548f4a76a0")
    override fun elbAuthFailure(props: MetricOptions.Builder.() -> Unit): Metric =
        elbAuthFailure(MetricOptions(props))

    /**
     * The time elapsed, in milliseconds, to query the IdP for the ID token and user info.
     *
     * If one or more of these operations fail, this is the time to failure.
     *
     * Default: Average over 5 minutes
     *
     * @param props
     */
    override fun elbAuthLatency(): Metric = unwrap(this).elbAuthLatency().let(Metric::wrap)

    /**
     * The time elapsed, in milliseconds, to query the IdP for the ID token and user info.
     *
     * If one or more of these operations fail, this is the time to failure.
     *
     * Default: Average over 5 minutes
     *
     * @param props
     */
    override fun elbAuthLatency(props: MetricOptions): Metric =
        unwrap(this).elbAuthLatency(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The time elapsed, in milliseconds, to query the IdP for the ID token and user info.
     *
     * If one or more of these operations fail, this is the time to failure.
     *
     * Default: Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d33c955bd8a8640379e8a1fee24e976ba7b2f06214c1b4b7df598d473a4b0b2f")
    override fun elbAuthLatency(props: MetricOptions.Builder.() -> Unit): Metric =
        elbAuthLatency(MetricOptions(props))

    /**
     * The number of authenticate actions that were successful.
     *
     * This metric is incremented at the end of the authentication workflow,
     * after the load balancer has retrieved the user claims from the IdP.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun elbAuthSuccess(): Metric = unwrap(this).elbAuthSuccess().let(Metric::wrap)

    /**
     * The number of authenticate actions that were successful.
     *
     * This metric is incremented at the end of the authentication workflow,
     * after the load balancer has retrieved the user claims from the IdP.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun elbAuthSuccess(props: MetricOptions): Metric =
        unwrap(this).elbAuthSuccess(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of authenticate actions that were successful.
     *
     * This metric is incremented at the end of the authentication workflow,
     * after the load balancer has retrieved the user claims from the IdP.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("139f674ec3ad7cc15a247ed7ac3d1313cf9bacbeaeec0013dc930d0161567483")
    override fun elbAuthSuccess(props: MetricOptions.Builder.() -> Unit): Metric =
        elbAuthSuccess(MetricOptions(props))

    /**
     * The number of HTTP 3xx/4xx/5xx codes that originate from the load balancer.
     *
     * This does not include any response codes generated by the targets.
     *
     * Default: Sum over 5 minutes
     *
     * @param code 
     * @param props
     */
    override fun httpCodeElb(code: HttpCodeElb): Metric =
        unwrap(this).httpCodeElb(code.let(HttpCodeElb.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of HTTP 3xx/4xx/5xx codes that originate from the load balancer.
     *
     * This does not include any response codes generated by the targets.
     *
     * Default: Sum over 5 minutes
     *
     * @param code 
     * @param props
     */
    override fun httpCodeElb(code: HttpCodeElb, props: MetricOptions): Metric =
        unwrap(this).httpCodeElb(code.let(HttpCodeElb.Companion::unwrap),
        props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of HTTP 3xx/4xx/5xx codes that originate from the load balancer.
     *
     * This does not include any response codes generated by the targets.
     *
     * Default: Sum over 5 minutes
     *
     * @param code 
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ec0c18e504ddbc3691899458ee1d9517d415b1e48a0d3108d7d82cd429225f5")
    override fun httpCodeElb(code: HttpCodeElb, props: MetricOptions.Builder.() -> Unit): Metric =
        httpCodeElb(code, MetricOptions(props))

    /**
     * The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in the load
     * balancer.
     *
     * This does not include any response codes generated by the load balancer.
     *
     * Default: Sum over 5 minutes
     *
     * @param code 
     * @param props
     */
    override fun httpCodeTarget(code: HttpCodeTarget): Metric =
        unwrap(this).httpCodeTarget(code.let(HttpCodeTarget.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in the load
     * balancer.
     *
     * This does not include any response codes generated by the load balancer.
     *
     * Default: Sum over 5 minutes
     *
     * @param code 
     * @param props
     */
    override fun httpCodeTarget(code: HttpCodeTarget, props: MetricOptions): Metric =
        unwrap(this).httpCodeTarget(code.let(HttpCodeTarget.Companion::unwrap),
        props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of HTTP 2xx/3xx/4xx/5xx response codes generated by all targets in the load
     * balancer.
     *
     * This does not include any response codes generated by the load balancer.
     *
     * Default: Sum over 5 minutes
     *
     * @param code 
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b24b5392cd4eb3171ba7964626471868514de6667c722081bcf28afba9d8f918")
    override fun httpCodeTarget(code: HttpCodeTarget, props: MetricOptions.Builder.() -> Unit):
        Metric = httpCodeTarget(code, MetricOptions(props))

    /**
     * The number of fixed-response actions that were successful.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun httpFixedResponseCount(): Metric =
        unwrap(this).httpFixedResponseCount().let(Metric::wrap)

    /**
     * The number of fixed-response actions that were successful.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun httpFixedResponseCount(props: MetricOptions): Metric =
        unwrap(this).httpFixedResponseCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of fixed-response actions that were successful.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38a993e824d91e43ce5a53673c0a44751916a494aaadf5e648998c7ab9582779")
    override fun httpFixedResponseCount(props: MetricOptions.Builder.() -> Unit): Metric =
        httpFixedResponseCount(MetricOptions(props))

    /**
     * The number of redirect actions that were successful.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun httpRedirectCount(): Metric = unwrap(this).httpRedirectCount().let(Metric::wrap)

    /**
     * The number of redirect actions that were successful.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun httpRedirectCount(props: MetricOptions): Metric =
        unwrap(this).httpRedirectCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of redirect actions that were successful.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dbe5cdf8d522d73b93f6c8d9b5d82eab909a9d6ebddc89e6dd73a85f9cb612d0")
    override fun httpRedirectCount(props: MetricOptions.Builder.() -> Unit): Metric =
        httpRedirectCount(MetricOptions(props))

    /**
     * The number of redirect actions that couldn't be completed because the URL in the response
     * location header is larger than 8K.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun httpRedirectUrlLimitExceededCount(): Metric =
        unwrap(this).httpRedirectUrlLimitExceededCount().let(Metric::wrap)

    /**
     * The number of redirect actions that couldn't be completed because the URL in the response
     * location header is larger than 8K.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun httpRedirectUrlLimitExceededCount(props: MetricOptions): Metric =
        unwrap(this).httpRedirectUrlLimitExceededCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of redirect actions that couldn't be completed because the URL in the response
     * location header is larger than 8K.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e327dd03e46195ca0a0412eb1f1b527c163061e837653be3ee60e714c552e76c")
    override fun httpRedirectUrlLimitExceededCount(props: MetricOptions.Builder.() -> Unit): Metric
        = httpRedirectUrlLimitExceededCount(MetricOptions(props))

    /**
     * The total number of bytes processed by the load balancer over IPv6.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun ipv6ProcessedBytes(): Metric = unwrap(this).ipv6ProcessedBytes().let(Metric::wrap)

    /**
     * The total number of bytes processed by the load balancer over IPv6.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun ipv6ProcessedBytes(props: MetricOptions): Metric =
        unwrap(this).ipv6ProcessedBytes(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The total number of bytes processed by the load balancer over IPv6.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32a0d4822abcb35e4c2fa5f348ec171d008bcec27186e2fc2b4b2b80bba8258f")
    override fun ipv6ProcessedBytes(props: MetricOptions.Builder.() -> Unit): Metric =
        ipv6ProcessedBytes(MetricOptions(props))

    /**
     * The number of IPv6 requests received by the load balancer.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun ipv6RequestCount(): Metric = unwrap(this).ipv6RequestCount().let(Metric::wrap)

    /**
     * The number of IPv6 requests received by the load balancer.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun ipv6RequestCount(props: MetricOptions): Metric =
        unwrap(this).ipv6RequestCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of IPv6 requests received by the load balancer.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c99b7ad341d61067977149bec151ac4f7bbfa5b606fd1f34d5a0f67bbdfd466")
    override fun ipv6RequestCount(props: MetricOptions.Builder.() -> Unit): Metric =
        ipv6RequestCount(MetricOptions(props))

    /**
     * The total number of new TCP connections established from clients to the load balancer and
     * from the load balancer to targets.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun newConnectionCount(): Metric = unwrap(this).newConnectionCount().let(Metric::wrap)

    /**
     * The total number of new TCP connections established from clients to the load balancer and
     * from the load balancer to targets.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun newConnectionCount(props: MetricOptions): Metric =
        unwrap(this).newConnectionCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The total number of new TCP connections established from clients to the load balancer and
     * from the load balancer to targets.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28b664629d8b7698209c63dc1a10d10d8fa9e4d5e6e924ab8b07a75a7b957dc6")
    override fun newConnectionCount(props: MetricOptions.Builder.() -> Unit): Metric =
        newConnectionCount(MetricOptions(props))

    /**
     * The total number of bytes processed by the load balancer over IPv4 and IPv6.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun processedBytes(): Metric = unwrap(this).processedBytes().let(Metric::wrap)

    /**
     * The total number of bytes processed by the load balancer over IPv4 and IPv6.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun processedBytes(props: MetricOptions): Metric =
        unwrap(this).processedBytes(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The total number of bytes processed by the load balancer over IPv4 and IPv6.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0834009453def8be68d52ce6251707f95f5284610a225d554c4471bca1f54d3b")
    override fun processedBytes(props: MetricOptions.Builder.() -> Unit): Metric =
        processedBytes(MetricOptions(props))

    /**
     * The number of connections that were rejected because the load balancer had reached its
     * maximum number of connections.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun rejectedConnectionCount(): Metric =
        unwrap(this).rejectedConnectionCount().let(Metric::wrap)

    /**
     * The number of connections that were rejected because the load balancer had reached its
     * maximum number of connections.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun rejectedConnectionCount(props: MetricOptions): Metric =
        unwrap(this).rejectedConnectionCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of connections that were rejected because the load balancer had reached its
     * maximum number of connections.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e7f89679f2c45631ab488d73b3b8a5e8b11f674a7f17844cce1926b6ea4f97e")
    override fun rejectedConnectionCount(props: MetricOptions.Builder.() -> Unit): Metric =
        rejectedConnectionCount(MetricOptions(props))

    /**
     * The number of requests processed over IPv4 and IPv6.
     *
     * This count includes only the requests with a response generated by a target of the load
     * balancer.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun requestCount(): Metric = unwrap(this).requestCount().let(Metric::wrap)

    /**
     * The number of requests processed over IPv4 and IPv6.
     *
     * This count includes only the requests with a response generated by a target of the load
     * balancer.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun requestCount(props: MetricOptions): Metric =
        unwrap(this).requestCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of requests processed over IPv4 and IPv6.
     *
     * This count includes only the requests with a response generated by a target of the load
     * balancer.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df6a54fa6c6b3bf8b7a44de0f859f5e74b085d7ce578c6a602288988d4106e46")
    override fun requestCount(props: MetricOptions.Builder.() -> Unit): Metric =
        requestCount(MetricOptions(props))

    /**
     * The number of rules processed by the load balancer given a request rate averaged over an
     * hour.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun ruleEvaluations(): Metric = unwrap(this).ruleEvaluations().let(Metric::wrap)

    /**
     * The number of rules processed by the load balancer given a request rate averaged over an
     * hour.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun ruleEvaluations(props: MetricOptions): Metric =
        unwrap(this).ruleEvaluations(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of rules processed by the load balancer given a request rate averaged over an
     * hour.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f0f4a275bd9ef52684f0af49aa0046e50f74a4ca4e5d4e5fa0f484bd907daaac")
    override fun ruleEvaluations(props: MetricOptions.Builder.() -> Unit): Metric =
        ruleEvaluations(MetricOptions(props))

    /**
     * The number of connections that were not successfully established between the load balancer
     * and target.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun targetConnectionErrorCount(): Metric =
        unwrap(this).targetConnectionErrorCount().let(Metric::wrap)

    /**
     * The number of connections that were not successfully established between the load balancer
     * and target.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun targetConnectionErrorCount(props: MetricOptions): Metric =
        unwrap(this).targetConnectionErrorCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of connections that were not successfully established between the load balancer
     * and target.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff66e9db5aa5ccafc9b54a6ff12c01de760a4cd3c0c5f48043c99cb77fa3203b")
    override fun targetConnectionErrorCount(props: MetricOptions.Builder.() -> Unit): Metric =
        targetConnectionErrorCount(MetricOptions(props))

    /**
     * The time elapsed, in seconds, after the request leaves the load balancer until a response
     * from the target is received.
     *
     * Default: Average over 5 minutes
     *
     * @param props
     */
    override fun targetResponseTime(): Metric = unwrap(this).targetResponseTime().let(Metric::wrap)

    /**
     * The time elapsed, in seconds, after the request leaves the load balancer until a response
     * from the target is received.
     *
     * Default: Average over 5 minutes
     *
     * @param props
     */
    override fun targetResponseTime(props: MetricOptions): Metric =
        unwrap(this).targetResponseTime(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The time elapsed, in seconds, after the request leaves the load balancer until a response
     * from the target is received.
     *
     * Default: Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd42be106eb1a94ad8464621cbb797fff2f60bfbaf6069acaafdc175dcd64b7f")
    override fun targetResponseTime(props: MetricOptions.Builder.() -> Unit): Metric =
        targetResponseTime(MetricOptions(props))

    /**
     * The number of TLS connections initiated by the load balancer that did not establish a session
     * with the target.
     *
     * Possible causes include a mismatch of ciphers or protocols.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun targetTLSNegotiationErrorCount(): Metric =
        unwrap(this).targetTLSNegotiationErrorCount().let(Metric::wrap)

    /**
     * The number of TLS connections initiated by the load balancer that did not establish a session
     * with the target.
     *
     * Possible causes include a mismatch of ciphers or protocols.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    override fun targetTLSNegotiationErrorCount(props: MetricOptions): Metric =
        unwrap(this).targetTLSNegotiationErrorCount(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of TLS connections initiated by the load balancer that did not establish a session
     * with the target.
     *
     * Possible causes include a mismatch of ciphers or protocols.
     *
     * Default: Sum over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("680e36d5f42c32084e2104a1182ce24b50a180324bfe0c58c1bcd6523da0a161")
    override fun targetTLSNegotiationErrorCount(props: MetricOptions.Builder.() -> Unit): Metric =
        targetTLSNegotiationErrorCount(MetricOptions(props))
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerMetrics):
        IApplicationLoadBalancerMetrics = CdkObjectWrappers.wrap(cdkObject) as?
        IApplicationLoadBalancerMetrics ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApplicationLoadBalancerMetrics):
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerMetrics =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancerMetrics
  }
}
