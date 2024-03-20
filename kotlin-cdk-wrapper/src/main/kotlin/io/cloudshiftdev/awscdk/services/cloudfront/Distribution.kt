@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A CloudFront distribution with associated origin(s) and caching behavior(s).
 *
 * Example:
 *
 * ```
 * // Adding an existing Lambda&#64;Edge function created in a different stack
 * // to a CloudFront distribution.
 * Bucket s3Bucket;
 * IVersion functionVersion = Version.fromVersionArn(this, "Version",
 * "arn:aws:lambda:us-east-1:123456789012:function:functionName:1");
 * Distribution.Builder.create(this, "distro")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new S3Origin(s3Bucket))
 * .edgeLambdas(List.of(EdgeLambda.builder()
 * .functionVersion(functionVersion)
 * .eventType(LambdaEdgeEventType.VIEWER_REQUEST)
 * .build()))
 * .build())
 * .build();
 * ```
 */
public open class Distribution internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.Distribution,
) : Resource(cdkObject), IDistribution {
  /**
   * Adds a new behavior to this distribution for the given pathPattern.
   *
   * @param pathPattern the path pattern (e.g., 'images/ *') that specifies which requests to apply
   * the behavior to. 
   * @param origin the origin to use for this behavior. 
   * @param behaviorOptions the options for the behavior at this path.
   */
  public open fun addBehavior(pathPattern: String, origin: IOrigin) {
    unwrap(this).addBehavior(pathPattern, origin.let(IOrigin::unwrap))
  }

  /**
   * Adds a new behavior to this distribution for the given pathPattern.
   *
   * @param pathPattern the path pattern (e.g., 'images/ *') that specifies which requests to apply
   * the behavior to. 
   * @param origin the origin to use for this behavior. 
   * @param behaviorOptions the options for the behavior at this path.
   */
  public open fun addBehavior(
    pathPattern: String,
    origin: IOrigin,
    behaviorOptions: AddBehaviorOptions,
  ) {
    unwrap(this).addBehavior(pathPattern, origin.let(IOrigin::unwrap),
        behaviorOptions.let(AddBehaviorOptions::unwrap))
  }

  /**
   * Adds a new behavior to this distribution for the given pathPattern.
   *
   * @param pathPattern the path pattern (e.g., 'images/ *') that specifies which requests to apply
   * the behavior to. 
   * @param origin the origin to use for this behavior. 
   * @param behaviorOptions the options for the behavior at this path.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3270956b59fc585e1688314e9abf40ae645618cb0a6dfb917903c1a5d00f564b")
  public open fun addBehavior(
    pathPattern: String,
    origin: IOrigin,
    behaviorOptions: AddBehaviorOptions.Builder.() -> Unit,
  ): Unit = addBehavior(pathPattern, origin, AddBehaviorOptions(behaviorOptions))

  /**
   * The domain name of the Distribution, such as d111111abcdef8.cloudfront.net.
   */
  public override fun distributionDomainName(): String = unwrap(this).getDistributionDomainName()

  /**
   * The distribution ID for this distribution.
   */
  public override fun distributionId(): String = unwrap(this).getDistributionId()

  /**
   * The domain name of the Distribution, such as d111111abcdef8.cloudfront.net.
   */
  public open fun domainName(): String = unwrap(this).getDomainName()

  /**
   * Adds an IAM policy statement associated with this distribution to an IAM principal's policy.
   *
   * @param identity The principal. 
   * @param actions The set of actions to allow (i.e. "cloudfront:ListInvalidations"). 
   */
  public override fun grant(identity: IGrantable, vararg actions: String): Grant =
      unwrap(this).grant(identity.let(IGrantable::unwrap), *actions).let(Grant::wrap)

  /**
   * Grant to create invalidations for this bucket to an IAM principal (Role/Group/User).
   *
   * @param identity The principal. 
   */
  public override fun grantCreateInvalidation(identity: IGrantable): Grant =
      unwrap(this).grantCreateInvalidation(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Return the given named metric for this Distribution.
   *
   * @param metricName 
   * @param props
   */
  public open fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this Distribution.
   *
   * @param metricName 
   * @param props
   */
  public open fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this Distribution.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public open fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 401.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric401ErrorRate(): Metric = unwrap(this).metric401ErrorRate().let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 401.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric401ErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric401ErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 401.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("694f8fecc7276a9a132624ca5168a07e2b5bbd8849446ae62beb70e979242581")
  public open fun metric401ErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric401ErrorRate(MetricOptions(props))

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 403.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric403ErrorRate(): Metric = unwrap(this).metric403ErrorRate().let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 403.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric403ErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric403ErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 403.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("57061caecc9bc3bc98ea4af0048e35a87327138ec52ecff1ebf49e182fa975cf")
  public open fun metric403ErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric403ErrorRate(MetricOptions(props))

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 404.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric404ErrorRate(): Metric = unwrap(this).metric404ErrorRate().let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 404.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric404ErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric404ErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 404.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b923926ba40409a1df3f8d440dd86f37f7b423f7eb07fdd41c01548f5042b881")
  public open fun metric404ErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric404ErrorRate(MetricOptions(props))

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 4xx.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric4xxErrorRate(): Metric = unwrap(this).metric4xxErrorRate().let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 4xx.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric4xxErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric4xxErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 4xx.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c93397e319610e7afd085f7302d92d1fe8f98acd51dddc5fa1eab7e56bd134d")
  public open fun metric4xxErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric4xxErrorRate(MetricOptions(props))

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 502.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric502ErrorRate(): Metric = unwrap(this).metric502ErrorRate().let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 502.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric502ErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric502ErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 502.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8a9a04b1a67791bed1f99079ee1113b37431048bb69df3c20d1dfe51e9a1c72a")
  public open fun metric502ErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric502ErrorRate(MetricOptions(props))

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 503.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric503ErrorRate(): Metric = unwrap(this).metric503ErrorRate().let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 503.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric503ErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric503ErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 503.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("259e1141e0e89e057e180e7dd4e0e358dacf7c475dcba055fa24e66aabd16009")
  public open fun metric503ErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric503ErrorRate(MetricOptions(props))

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 504.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric504ErrorRate(): Metric = unwrap(this).metric504ErrorRate().let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 504.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric504ErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric504ErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 504.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a9591c95b0f5332337addbf8be55aaec31405c32eb30526da8cc7a18b3650a41")
  public open fun metric504ErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric504ErrorRate(MetricOptions(props))

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 5xx.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric5xxErrorRate(): Metric = unwrap(this).metric5xxErrorRate().let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 5xx.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metric5xxErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric5xxErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 5xx.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3103cd2e7de254d79eb354d8c3eee563ef7722d9ef18c9fd26ddfc465360b151")
  public open fun metric5xxErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric5xxErrorRate(MetricOptions(props))

  /**
   * Metric for the total number of bytes downloaded by viewers for GET, HEAD, and OPTIONS requests.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricBytesDownloaded(): Metric =
      unwrap(this).metricBytesDownloaded().let(Metric::wrap)

  /**
   * Metric for the total number of bytes downloaded by viewers for GET, HEAD, and OPTIONS requests.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricBytesDownloaded(props: MetricOptions): Metric =
      unwrap(this).metricBytesDownloaded(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the total number of bytes downloaded by viewers for GET, HEAD, and OPTIONS requests.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("29cb2408077a247b11dbb2e5f7d522b16e1327e08397c04f135e4583012b3a35")
  public open fun metricBytesDownloaded(props: MetricOptions.Builder.() -> Unit): Metric =
      metricBytesDownloaded(MetricOptions(props))

  /**
   * Metric for the total number of bytes that viewers uploaded to your origin with CloudFront,
   * using POST and PUT requests.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricBytesUploaded(): Metric =
      unwrap(this).metricBytesUploaded().let(Metric::wrap)

  /**
   * Metric for the total number of bytes that viewers uploaded to your origin with CloudFront,
   * using POST and PUT requests.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricBytesUploaded(props: MetricOptions): Metric =
      unwrap(this).metricBytesUploaded(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the total number of bytes that viewers uploaded to your origin with CloudFront,
   * using POST and PUT requests.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("23cc88392d872d4ae8727e081547b173283a6bf94b0bc27a6b1ae1e8da69eeb3")
  public open fun metricBytesUploaded(props: MetricOptions.Builder.() -> Unit): Metric =
      metricBytesUploaded(MetricOptions(props))

  /**
   * Metric for the percentage of all cacheable requests for which CloudFront served the content
   * from its cache.
   *
   * HTTP POST and PUT requests, and errors, are not considered cacheable requests.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metricCacheHitRate(): Metric = unwrap(this).metricCacheHitRate().let(Metric::wrap)

  /**
   * Metric for the percentage of all cacheable requests for which CloudFront served the content
   * from its cache.
   *
   * HTTP POST and PUT requests, and errors, are not considered cacheable requests.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metricCacheHitRate(props: MetricOptions): Metric =
      unwrap(this).metricCacheHitRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the percentage of all cacheable requests for which CloudFront served the content
   * from its cache.
   *
   * HTTP POST and PUT requests, and errors, are not considered cacheable requests.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e2e0047cfda9264a01fb93542a414655ce7d7a449cdb3e3eb75ca2b9f8006973")
  public open fun metricCacheHitRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCacheHitRate(MetricOptions(props))

  /**
   * Metric for the total time spent from when CloudFront receives a request to when it starts
   * providing a response to the network (not the viewer), for requests that are served from the
   * origin, not the CloudFront cache.
   *
   * This is also known as first byte latency, or time-to-first-byte.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metricOriginLatency(): Metric =
      unwrap(this).metricOriginLatency().let(Metric::wrap)

  /**
   * Metric for the total time spent from when CloudFront receives a request to when it starts
   * providing a response to the network (not the viewer), for requests that are served from the
   * origin, not the CloudFront cache.
   *
   * This is also known as first byte latency, or time-to-first-byte.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metricOriginLatency(props: MetricOptions): Metric =
      unwrap(this).metricOriginLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the total time spent from when CloudFront receives a request to when it starts
   * providing a response to the network (not the viewer), for requests that are served from the
   * origin, not the CloudFront cache.
   *
   * This is also known as first byte latency, or time-to-first-byte.
   *
   * To obtain this metric, you need to set `publishAdditionalMetrics` to `true`.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e57ac564df89576d995322328d298c55f66e65092088fe3e7f9e3eef1dc1d6be")
  public open fun metricOriginLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricOriginLatency(MetricOptions(props))

  /**
   * Metric for the total number of viewer requests received by CloudFront, for all HTTP methods and
   * for both HTTP and HTTPS requests.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricRequests(): Metric = unwrap(this).metricRequests().let(Metric::wrap)

  /**
   * Metric for the total number of viewer requests received by CloudFront, for all HTTP methods and
   * for both HTTP and HTTPS requests.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  public open fun metricRequests(props: MetricOptions): Metric =
      unwrap(this).metricRequests(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the total number of viewer requests received by CloudFront, for all HTTP methods and
   * for both HTTP and HTTPS requests.
   *
   * Default: - sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("28016486c8327f7a2fa2c64fcf11659a49906e7c4a54c79b22b3434fb2f85b78")
  public open fun metricRequests(props: MetricOptions.Builder.() -> Unit): Metric =
      metricRequests(MetricOptions(props))

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 4xx or 5xx.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metricTotalErrorRate(): Metric =
      unwrap(this).metricTotalErrorRate().let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 4xx or 5xx.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  public open fun metricTotalErrorRate(props: MetricOptions): Metric =
      unwrap(this).metricTotalErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the percentage of all viewer requests for which the response's HTTP status code is
   * 4xx or 5xx.
   *
   * Default: - average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cf2f44939bf0ac959f3d7beaa879f566a0b35c40e6588740930c2a22a69b5a78")
  public open fun metricTotalErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTotalErrorRate(MetricOptions(props))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.Distribution].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Additional behaviors for the distribution, mapped by the pathPattern that specifies which
     * requests to apply the behavior to.
     *
     * Default: - no additional behaviors are added.
     *
     * @param additionalBehaviors Additional behaviors for the distribution, mapped by the
     * pathPattern that specifies which requests to apply the behavior to. 
     */
    public fun additionalBehaviors(additionalBehaviors: Map<String, BehaviorOptions>)

    /**
     * A certificate to associate with the distribution.
     *
     * The certificate must be located in N. Virginia (us-east-1).
     *
     * Default: - the CloudFront wildcard certificate (*.cloudfront.net) will be used.
     *
     * @param certificate A certificate to associate with the distribution. 
     */
    public fun certificate(certificate: ICertificate)

    /**
     * Any comments you want to include about the distribution.
     *
     * Default: - no comment
     *
     * @param comment Any comments you want to include about the distribution. 
     */
    public fun comment(comment: String)

    /**
     * The default behavior for the distribution.
     *
     * @param defaultBehavior The default behavior for the distribution. 
     */
    public fun defaultBehavior(defaultBehavior: BehaviorOptions)

    /**
     * The default behavior for the distribution.
     *
     * @param defaultBehavior The default behavior for the distribution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("559439186f697f3ce0af7d9f62015dec74e259d41adf7c790d264a317fa0d040")
    public fun defaultBehavior(defaultBehavior: BehaviorOptions.Builder.() -> Unit)

    /**
     * The object that you want CloudFront to request from your origin (for example, index.html)
     * when a viewer requests the root URL for your distribution. If no default object is set, the
     * request goes to the origin's root (e.g., example.com/).
     *
     * Default: - no default root object
     *
     * @param defaultRootObject The object that you want CloudFront to request from your origin (for
     * example, index.html) when a viewer requests the root URL for your distribution. If no default
     * object is set, the request goes to the origin's root (e.g., example.com/). 
     */
    public fun defaultRootObject(defaultRootObject: String)

    /**
     * Alternative domain names for this distribution.
     *
     * If you want to use your own domain name, such as www.example.com, instead of the
     * cloudfront.net domain name,
     * you can add an alternate domain name to your distribution. If you attach a certificate to the
     * distribution,
     * you must add (at least one of) the domain names of the certificate to this list.
     *
     * Default: - The distribution will only support the default generated name (e.g.,
     * d111111abcdef8.cloudfront.net)
     *
     * @param domainNames Alternative domain names for this distribution. 
     */
    public fun domainNames(domainNames: List<String>)

    /**
     * Alternative domain names for this distribution.
     *
     * If you want to use your own domain name, such as www.example.com, instead of the
     * cloudfront.net domain name,
     * you can add an alternate domain name to your distribution. If you attach a certificate to the
     * distribution,
     * you must add (at least one of) the domain names of the certificate to this list.
     *
     * Default: - The distribution will only support the default generated name (e.g.,
     * d111111abcdef8.cloudfront.net)
     *
     * @param domainNames Alternative domain names for this distribution. 
     */
    public fun domainNames(vararg domainNames: String)

    /**
     * Whether CloudFront will respond to IPv6 DNS requests with an IPv6 address.
     *
     * If you specify false, CloudFront responds to IPv6 DNS requests with the DNS response code
     * NOERROR and with no IP addresses.
     * This allows viewers to submit a second request, for an IPv4 address for your distribution.
     *
     * Default: true
     *
     * @param enableIpv6 Whether CloudFront will respond to IPv6 DNS requests with an IPv6 address. 
     */
    public fun enableIpv6(enableIpv6: Boolean)

    /**
     * Enable access logging for the distribution.
     *
     * Default: - false, unless `logBucket` is specified.
     *
     * @param enableLogging Enable access logging for the distribution. 
     */
    public fun enableLogging(enableLogging: Boolean)

    /**
     * Enable or disable the distribution.
     *
     * Default: true
     *
     * @param enabled Enable or disable the distribution. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * How CloudFront should handle requests that are not successful (e.g., PageNotFound).
     *
     * Default: - No custom error responses.
     *
     * @param errorResponses How CloudFront should handle requests that are not successful (e.g.,
     * PageNotFound). 
     */
    public fun errorResponses(errorResponses: List<ErrorResponse>)

    /**
     * How CloudFront should handle requests that are not successful (e.g., PageNotFound).
     *
     * Default: - No custom error responses.
     *
     * @param errorResponses How CloudFront should handle requests that are not successful (e.g.,
     * PageNotFound). 
     */
    public fun errorResponses(vararg errorResponses: ErrorResponse)

    /**
     * Controls the countries in which your content is distributed.
     *
     * Default: - No geographic restrictions
     *
     * @param geoRestriction Controls the countries in which your content is distributed. 
     */
    public fun geoRestriction(geoRestriction: GeoRestriction)

    /**
     * Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront.
     *
     * For viewers and CloudFront to use HTTP/2, viewers must support TLS 1.2 or later, and must
     * support server name identification (SNI).
     *
     * Default: HttpVersion.HTTP2
     *
     * @param httpVersion Specify the maximum HTTP version that you want viewers to use to
     * communicate with CloudFront. 
     */
    public fun httpVersion(httpVersion: HttpVersion)

    /**
     * The Amazon S3 bucket to store the access logs in.
     *
     * Make sure to set `objectOwnership` to `s3.ObjectOwnership.OBJECT_WRITER` in your custom
     * bucket.
     *
     * Default: - A bucket is created if `enableLogging` is true
     *
     * @param logBucket The Amazon S3 bucket to store the access logs in. 
     */
    public fun logBucket(logBucket: IBucket)

    /**
     * An optional string that you want CloudFront to prefix to the access log filenames for this
     * distribution.
     *
     * Default: - no prefix
     *
     * @param logFilePrefix An optional string that you want CloudFront to prefix to the access log
     * filenames for this distribution. 
     */
    public fun logFilePrefix(logFilePrefix: String)

    /**
     * Specifies whether you want CloudFront to include cookies in access logs.
     *
     * Default: false
     *
     * @param logIncludesCookies Specifies whether you want CloudFront to include cookies in access
     * logs. 
     */
    public fun logIncludesCookies(logIncludesCookies: Boolean)

    /**
     * The minimum version of the SSL protocol that you want CloudFront to use for HTTPS
     * connections.
     *
     * CloudFront serves your objects only to browsers or devices that support at
     * least the SSL version that you specify.
     *
     * Default: - SecurityPolicyProtocol.TLS_V1_2_2021 if the
     * '@aws-cdk/aws-cloudfront:defaultSecurityPolicyTLSv1.2_2021' feature flag is set; otherwise,
     * SecurityPolicyProtocol.TLS_V1_2_2019.
     *
     * @param minimumProtocolVersion The minimum version of the SSL protocol that you want
     * CloudFront to use for HTTPS connections. 
     */
    public fun minimumProtocolVersion(minimumProtocolVersion: SecurityPolicyProtocol)

    /**
     * The price class that corresponds with the maximum price that you want to pay for CloudFront
     * service.
     *
     * If you specify PriceClass_All, CloudFront responds to requests for your objects from all
     * CloudFront edge locations.
     * If you specify a price class other than PriceClass_All, CloudFront serves your objects from
     * the CloudFront edge location
     * that has the lowest latency among the edge locations in your price class.
     *
     * Default: PriceClass.PRICE_CLASS_ALL
     *
     * @param priceClass The price class that corresponds with the maximum price that you want to
     * pay for CloudFront service. 
     */
    public fun priceClass(priceClass: PriceClass)

    /**
     * Whether to enable additional CloudWatch metrics.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/viewing-cloudfront-metrics.html)
     * @param publishAdditionalMetrics Whether to enable additional CloudWatch metrics. 
     */
    public fun publishAdditionalMetrics(publishAdditionalMetrics: Boolean)

    /**
     * The SSL method CloudFront will use for your distribution.
     *
     * Server Name Indication (SNI) - is an extension to the TLS computer networking protocol by
     * which a client indicates
     * which hostname it is attempting to connect to at the start of the handshaking process. This
     * allows a server to present
     * multiple certificates on the same IP address and TCP port number and hence allows multiple
     * secure (HTTPS) websites
     * (or any other service over TLS) to be served by the same IP address without requiring all
     * those sites to use the same certificate.
     *
     * CloudFront can use SNI to host multiple distributions on the same IP - which a large majority
     * of clients will support.
     *
     * If your clients cannot support SNI however - CloudFront can use dedicated IPs for your
     * distribution - but there is a prorated monthly charge for
     * using this feature. By default, we use SNI - but you can optionally enable dedicated IPs
     * (VIP).
     *
     * See the CloudFront SSL for more details about pricing :
     * https://aws.amazon.com/cloudfront/custom-ssl-domains/
     *
     * Default: SSLMethod.SNI
     *
     * @param sslSupportMethod The SSL method CloudFront will use for your distribution. 
     */
    public fun sslSupportMethod(sslSupportMethod: SSLMethod)

    /**
     * Unique identifier that specifies the AWS WAF web ACL to associate with this CloudFront
     * distribution.
     *
     * To specify a web ACL created using the latest version of AWS WAF, use the ACL ARN, for
     * example
     * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a`.
     * To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     * `473e64fd-f30b-4765-81a0-62ad96dd167a`.
     *
     * Default: - No AWS Web Application Firewall web access control list (web ACL).
     *
     * [Documentation](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CreateDistribution.html#API_CreateDistribution_RequestParameters.)
     * @param webAclId Unique identifier that specifies the AWS WAF web ACL to associate with this
     * CloudFront distribution. 
     */
    public fun webAclId(webAclId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.Distribution.Builder =
        software.amazon.awscdk.services.cloudfront.Distribution.Builder.create(scope, id)

    /**
     * Additional behaviors for the distribution, mapped by the pathPattern that specifies which
     * requests to apply the behavior to.
     *
     * Default: - no additional behaviors are added.
     *
     * @param additionalBehaviors Additional behaviors for the distribution, mapped by the
     * pathPattern that specifies which requests to apply the behavior to. 
     */
    override fun additionalBehaviors(additionalBehaviors: Map<String, BehaviorOptions>) {
      cdkBuilder.additionalBehaviors(additionalBehaviors.mapValues{BehaviorOptions.unwrap(it.value)})
    }

    /**
     * A certificate to associate with the distribution.
     *
     * The certificate must be located in N. Virginia (us-east-1).
     *
     * Default: - the CloudFront wildcard certificate (*.cloudfront.net) will be used.
     *
     * @param certificate A certificate to associate with the distribution. 
     */
    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    /**
     * Any comments you want to include about the distribution.
     *
     * Default: - no comment
     *
     * @param comment Any comments you want to include about the distribution. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * The default behavior for the distribution.
     *
     * @param defaultBehavior The default behavior for the distribution. 
     */
    override fun defaultBehavior(defaultBehavior: BehaviorOptions) {
      cdkBuilder.defaultBehavior(defaultBehavior.let(BehaviorOptions::unwrap))
    }

    /**
     * The default behavior for the distribution.
     *
     * @param defaultBehavior The default behavior for the distribution. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("559439186f697f3ce0af7d9f62015dec74e259d41adf7c790d264a317fa0d040")
    override fun defaultBehavior(defaultBehavior: BehaviorOptions.Builder.() -> Unit): Unit =
        defaultBehavior(BehaviorOptions(defaultBehavior))

    /**
     * The object that you want CloudFront to request from your origin (for example, index.html)
     * when a viewer requests the root URL for your distribution. If no default object is set, the
     * request goes to the origin's root (e.g., example.com/).
     *
     * Default: - no default root object
     *
     * @param defaultRootObject The object that you want CloudFront to request from your origin (for
     * example, index.html) when a viewer requests the root URL for your distribution. If no default
     * object is set, the request goes to the origin's root (e.g., example.com/). 
     */
    override fun defaultRootObject(defaultRootObject: String) {
      cdkBuilder.defaultRootObject(defaultRootObject)
    }

    /**
     * Alternative domain names for this distribution.
     *
     * If you want to use your own domain name, such as www.example.com, instead of the
     * cloudfront.net domain name,
     * you can add an alternate domain name to your distribution. If you attach a certificate to the
     * distribution,
     * you must add (at least one of) the domain names of the certificate to this list.
     *
     * Default: - The distribution will only support the default generated name (e.g.,
     * d111111abcdef8.cloudfront.net)
     *
     * @param domainNames Alternative domain names for this distribution. 
     */
    override fun domainNames(domainNames: List<String>) {
      cdkBuilder.domainNames(domainNames)
    }

    /**
     * Alternative domain names for this distribution.
     *
     * If you want to use your own domain name, such as www.example.com, instead of the
     * cloudfront.net domain name,
     * you can add an alternate domain name to your distribution. If you attach a certificate to the
     * distribution,
     * you must add (at least one of) the domain names of the certificate to this list.
     *
     * Default: - The distribution will only support the default generated name (e.g.,
     * d111111abcdef8.cloudfront.net)
     *
     * @param domainNames Alternative domain names for this distribution. 
     */
    override fun domainNames(vararg domainNames: String): Unit = domainNames(domainNames.toList())

    /**
     * Whether CloudFront will respond to IPv6 DNS requests with an IPv6 address.
     *
     * If you specify false, CloudFront responds to IPv6 DNS requests with the DNS response code
     * NOERROR and with no IP addresses.
     * This allows viewers to submit a second request, for an IPv4 address for your distribution.
     *
     * Default: true
     *
     * @param enableIpv6 Whether CloudFront will respond to IPv6 DNS requests with an IPv6 address. 
     */
    override fun enableIpv6(enableIpv6: Boolean) {
      cdkBuilder.enableIpv6(enableIpv6)
    }

    /**
     * Enable access logging for the distribution.
     *
     * Default: - false, unless `logBucket` is specified.
     *
     * @param enableLogging Enable access logging for the distribution. 
     */
    override fun enableLogging(enableLogging: Boolean) {
      cdkBuilder.enableLogging(enableLogging)
    }

    /**
     * Enable or disable the distribution.
     *
     * Default: true
     *
     * @param enabled Enable or disable the distribution. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * How CloudFront should handle requests that are not successful (e.g., PageNotFound).
     *
     * Default: - No custom error responses.
     *
     * @param errorResponses How CloudFront should handle requests that are not successful (e.g.,
     * PageNotFound). 
     */
    override fun errorResponses(errorResponses: List<ErrorResponse>) {
      cdkBuilder.errorResponses(errorResponses.map(ErrorResponse::unwrap))
    }

    /**
     * How CloudFront should handle requests that are not successful (e.g., PageNotFound).
     *
     * Default: - No custom error responses.
     *
     * @param errorResponses How CloudFront should handle requests that are not successful (e.g.,
     * PageNotFound). 
     */
    override fun errorResponses(vararg errorResponses: ErrorResponse): Unit =
        errorResponses(errorResponses.toList())

    /**
     * Controls the countries in which your content is distributed.
     *
     * Default: - No geographic restrictions
     *
     * @param geoRestriction Controls the countries in which your content is distributed. 
     */
    override fun geoRestriction(geoRestriction: GeoRestriction) {
      cdkBuilder.geoRestriction(geoRestriction.let(GeoRestriction::unwrap))
    }

    /**
     * Specify the maximum HTTP version that you want viewers to use to communicate with CloudFront.
     *
     * For viewers and CloudFront to use HTTP/2, viewers must support TLS 1.2 or later, and must
     * support server name identification (SNI).
     *
     * Default: HttpVersion.HTTP2
     *
     * @param httpVersion Specify the maximum HTTP version that you want viewers to use to
     * communicate with CloudFront. 
     */
    override fun httpVersion(httpVersion: HttpVersion) {
      cdkBuilder.httpVersion(httpVersion.let(HttpVersion::unwrap))
    }

    /**
     * The Amazon S3 bucket to store the access logs in.
     *
     * Make sure to set `objectOwnership` to `s3.ObjectOwnership.OBJECT_WRITER` in your custom
     * bucket.
     *
     * Default: - A bucket is created if `enableLogging` is true
     *
     * @param logBucket The Amazon S3 bucket to store the access logs in. 
     */
    override fun logBucket(logBucket: IBucket) {
      cdkBuilder.logBucket(logBucket.let(IBucket::unwrap))
    }

    /**
     * An optional string that you want CloudFront to prefix to the access log filenames for this
     * distribution.
     *
     * Default: - no prefix
     *
     * @param logFilePrefix An optional string that you want CloudFront to prefix to the access log
     * filenames for this distribution. 
     */
    override fun logFilePrefix(logFilePrefix: String) {
      cdkBuilder.logFilePrefix(logFilePrefix)
    }

    /**
     * Specifies whether you want CloudFront to include cookies in access logs.
     *
     * Default: false
     *
     * @param logIncludesCookies Specifies whether you want CloudFront to include cookies in access
     * logs. 
     */
    override fun logIncludesCookies(logIncludesCookies: Boolean) {
      cdkBuilder.logIncludesCookies(logIncludesCookies)
    }

    /**
     * The minimum version of the SSL protocol that you want CloudFront to use for HTTPS
     * connections.
     *
     * CloudFront serves your objects only to browsers or devices that support at
     * least the SSL version that you specify.
     *
     * Default: - SecurityPolicyProtocol.TLS_V1_2_2021 if the
     * '@aws-cdk/aws-cloudfront:defaultSecurityPolicyTLSv1.2_2021' feature flag is set; otherwise,
     * SecurityPolicyProtocol.TLS_V1_2_2019.
     *
     * @param minimumProtocolVersion The minimum version of the SSL protocol that you want
     * CloudFront to use for HTTPS connections. 
     */
    override fun minimumProtocolVersion(minimumProtocolVersion: SecurityPolicyProtocol) {
      cdkBuilder.minimumProtocolVersion(minimumProtocolVersion.let(SecurityPolicyProtocol::unwrap))
    }

    /**
     * The price class that corresponds with the maximum price that you want to pay for CloudFront
     * service.
     *
     * If you specify PriceClass_All, CloudFront responds to requests for your objects from all
     * CloudFront edge locations.
     * If you specify a price class other than PriceClass_All, CloudFront serves your objects from
     * the CloudFront edge location
     * that has the lowest latency among the edge locations in your price class.
     *
     * Default: PriceClass.PRICE_CLASS_ALL
     *
     * @param priceClass The price class that corresponds with the maximum price that you want to
     * pay for CloudFront service. 
     */
    override fun priceClass(priceClass: PriceClass) {
      cdkBuilder.priceClass(priceClass.let(PriceClass::unwrap))
    }

    /**
     * Whether to enable additional CloudWatch metrics.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/viewing-cloudfront-metrics.html)
     * @param publishAdditionalMetrics Whether to enable additional CloudWatch metrics. 
     */
    override fun publishAdditionalMetrics(publishAdditionalMetrics: Boolean) {
      cdkBuilder.publishAdditionalMetrics(publishAdditionalMetrics)
    }

    /**
     * The SSL method CloudFront will use for your distribution.
     *
     * Server Name Indication (SNI) - is an extension to the TLS computer networking protocol by
     * which a client indicates
     * which hostname it is attempting to connect to at the start of the handshaking process. This
     * allows a server to present
     * multiple certificates on the same IP address and TCP port number and hence allows multiple
     * secure (HTTPS) websites
     * (or any other service over TLS) to be served by the same IP address without requiring all
     * those sites to use the same certificate.
     *
     * CloudFront can use SNI to host multiple distributions on the same IP - which a large majority
     * of clients will support.
     *
     * If your clients cannot support SNI however - CloudFront can use dedicated IPs for your
     * distribution - but there is a prorated monthly charge for
     * using this feature. By default, we use SNI - but you can optionally enable dedicated IPs
     * (VIP).
     *
     * See the CloudFront SSL for more details about pricing :
     * https://aws.amazon.com/cloudfront/custom-ssl-domains/
     *
     * Default: SSLMethod.SNI
     *
     * @param sslSupportMethod The SSL method CloudFront will use for your distribution. 
     */
    override fun sslSupportMethod(sslSupportMethod: SSLMethod) {
      cdkBuilder.sslSupportMethod(sslSupportMethod.let(SSLMethod::unwrap))
    }

    /**
     * Unique identifier that specifies the AWS WAF web ACL to associate with this CloudFront
     * distribution.
     *
     * To specify a web ACL created using the latest version of AWS WAF, use the ACL ARN, for
     * example
     * `arn:aws:wafv2:us-east-1:123456789012:global/webacl/ExampleWebACL/473e64fd-f30b-4765-81a0-62ad96dd167a`.
     * To specify a web ACL created using AWS WAF Classic, use the ACL ID, for example
     * `473e64fd-f30b-4765-81a0-62ad96dd167a`.
     *
     * Default: - No AWS Web Application Firewall web access control list (web ACL).
     *
     * [Documentation](https://docs.aws.amazon.com/cloudfront/latest/APIReference/API_CreateDistribution.html#API_CreateDistribution_RequestParameters.)
     * @param webAclId Unique identifier that specifies the AWS WAF web ACL to associate with this
     * CloudFront distribution. 
     */
    override fun webAclId(webAclId: String) {
      cdkBuilder.webAclId(webAclId)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.Distribution = cdkBuilder.build()
  }

  public companion object {
    public fun fromDistributionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DistributionAttributes,
    ): IDistribution =
        software.amazon.awscdk.services.cloudfront.Distribution.fromDistributionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(DistributionAttributes::unwrap)).let(IDistribution::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13b637f527f535354a6fcac80fa4eef953671068e33f43e905ddf0f27899b7fd")
    public fun fromDistributionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DistributionAttributes.Builder.() -> Unit,
    ): IDistribution = fromDistributionAttributes(scope, id, DistributionAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Distribution {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Distribution(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.Distribution):
        Distribution = Distribution(cdkObject)

    internal fun unwrap(wrapped: Distribution):
        software.amazon.awscdk.services.cloudfront.Distribution = wrapped.cdkObject
  }
}
