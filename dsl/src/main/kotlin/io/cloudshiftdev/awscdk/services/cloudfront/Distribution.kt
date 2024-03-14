package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Distribution internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.Distribution,
) : Resource(cdkObject), IDistribution {
  public open fun addBehavior(pathPattern: String, origin: IOrigin) {
    unwrap(this).addBehavior(pathPattern, origin.let(IOrigin::unwrap))
  }

  public open fun addBehavior(
    pathPattern: String,
    origin: IOrigin,
    behaviorOptions: AddBehaviorOptions,
  ) {
    unwrap(this).addBehavior(pathPattern, origin.let(IOrigin::unwrap),
        behaviorOptions.let(AddBehaviorOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3270956b59fc585e1688314e9abf40ae645618cb0a6dfb917903c1a5d00f564b")
  public open fun addBehavior(
    pathPattern: String,
    origin: IOrigin,
    behaviorOptions: AddBehaviorOptions.Builder.() -> Unit,
  ): Unit = addBehavior(pathPattern, origin, AddBehaviorOptions(behaviorOptions))

  public override fun distributionDomainName(): String = unwrap(this).getDistributionDomainName()

  public override fun distributionId(): String = unwrap(this).getDistributionId()

  public open fun domainName(): String = unwrap(this).getDomainName()

  public override fun grant(identity: IGrantable, actions: String): Grant =
      unwrap(this).grant(identity.let(IGrantable::unwrap), actions).let(Grant::wrap)

  public override fun grantCreateInvalidation(identity: IGrantable): Grant =
      unwrap(this).grantCreateInvalidation(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public open fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public open fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public open fun metric401ErrorRate(): Metric = unwrap(this).metric401ErrorRate().let(Metric::wrap)

  public open fun metric401ErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric401ErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("694f8fecc7276a9a132624ca5168a07e2b5bbd8849446ae62beb70e979242581")
  public open fun metric401ErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric401ErrorRate(MetricOptions(props))

  public open fun metric403ErrorRate(): Metric = unwrap(this).metric403ErrorRate().let(Metric::wrap)

  public open fun metric403ErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric403ErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("57061caecc9bc3bc98ea4af0048e35a87327138ec52ecff1ebf49e182fa975cf")
  public open fun metric403ErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric403ErrorRate(MetricOptions(props))

  public open fun metric404ErrorRate(): Metric = unwrap(this).metric404ErrorRate().let(Metric::wrap)

  public open fun metric404ErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric404ErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b923926ba40409a1df3f8d440dd86f37f7b423f7eb07fdd41c01548f5042b881")
  public open fun metric404ErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric404ErrorRate(MetricOptions(props))

  public open fun metric4xxErrorRate(): Metric = unwrap(this).metric4xxErrorRate().let(Metric::wrap)

  public open fun metric4xxErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric4xxErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c93397e319610e7afd085f7302d92d1fe8f98acd51dddc5fa1eab7e56bd134d")
  public open fun metric4xxErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric4xxErrorRate(MetricOptions(props))

  public open fun metric502ErrorRate(): Metric = unwrap(this).metric502ErrorRate().let(Metric::wrap)

  public open fun metric502ErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric502ErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8a9a04b1a67791bed1f99079ee1113b37431048bb69df3c20d1dfe51e9a1c72a")
  public open fun metric502ErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric502ErrorRate(MetricOptions(props))

  public open fun metric503ErrorRate(): Metric = unwrap(this).metric503ErrorRate().let(Metric::wrap)

  public open fun metric503ErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric503ErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("259e1141e0e89e057e180e7dd4e0e358dacf7c475dcba055fa24e66aabd16009")
  public open fun metric503ErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric503ErrorRate(MetricOptions(props))

  public open fun metric504ErrorRate(): Metric = unwrap(this).metric504ErrorRate().let(Metric::wrap)

  public open fun metric504ErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric504ErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a9591c95b0f5332337addbf8be55aaec31405c32eb30526da8cc7a18b3650a41")
  public open fun metric504ErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric504ErrorRate(MetricOptions(props))

  public open fun metric5xxErrorRate(): Metric = unwrap(this).metric5xxErrorRate().let(Metric::wrap)

  public open fun metric5xxErrorRate(props: MetricOptions): Metric =
      unwrap(this).metric5xxErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3103cd2e7de254d79eb354d8c3eee563ef7722d9ef18c9fd26ddfc465360b151")
  public open fun metric5xxErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metric5xxErrorRate(MetricOptions(props))

  public open fun metricBytesDownloaded(): Metric =
      unwrap(this).metricBytesDownloaded().let(Metric::wrap)

  public open fun metricBytesDownloaded(props: MetricOptions): Metric =
      unwrap(this).metricBytesDownloaded(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("29cb2408077a247b11dbb2e5f7d522b16e1327e08397c04f135e4583012b3a35")
  public open fun metricBytesDownloaded(props: MetricOptions.Builder.() -> Unit): Metric =
      metricBytesDownloaded(MetricOptions(props))

  public open fun metricBytesUploaded(): Metric =
      unwrap(this).metricBytesUploaded().let(Metric::wrap)

  public open fun metricBytesUploaded(props: MetricOptions): Metric =
      unwrap(this).metricBytesUploaded(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("23cc88392d872d4ae8727e081547b173283a6bf94b0bc27a6b1ae1e8da69eeb3")
  public open fun metricBytesUploaded(props: MetricOptions.Builder.() -> Unit): Metric =
      metricBytesUploaded(MetricOptions(props))

  public open fun metricCacheHitRate(): Metric = unwrap(this).metricCacheHitRate().let(Metric::wrap)

  public open fun metricCacheHitRate(props: MetricOptions): Metric =
      unwrap(this).metricCacheHitRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e2e0047cfda9264a01fb93542a414655ce7d7a449cdb3e3eb75ca2b9f8006973")
  public open fun metricCacheHitRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCacheHitRate(MetricOptions(props))

  public open fun metricOriginLatency(): Metric =
      unwrap(this).metricOriginLatency().let(Metric::wrap)

  public open fun metricOriginLatency(props: MetricOptions): Metric =
      unwrap(this).metricOriginLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e57ac564df89576d995322328d298c55f66e65092088fe3e7f9e3eef1dc1d6be")
  public open fun metricOriginLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricOriginLatency(MetricOptions(props))

  public open fun metricRequests(): Metric = unwrap(this).metricRequests().let(Metric::wrap)

  public open fun metricRequests(props: MetricOptions): Metric =
      unwrap(this).metricRequests(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("28016486c8327f7a2fa2c64fcf11659a49906e7c4a54c79b22b3434fb2f85b78")
  public open fun metricRequests(props: MetricOptions.Builder.() -> Unit): Metric =
      metricRequests(MetricOptions(props))

  public open fun metricTotalErrorRate(): Metric =
      unwrap(this).metricTotalErrorRate().let(Metric::wrap)

  public open fun metricTotalErrorRate(props: MetricOptions): Metric =
      unwrap(this).metricTotalErrorRate(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cf2f44939bf0ac959f3d7beaa879f566a0b35c40e6588740930c2a22a69b5a78")
  public open fun metricTotalErrorRate(props: MetricOptions.Builder.() -> Unit): Metric =
      metricTotalErrorRate(MetricOptions(props))

  public interface Builder {
    public fun additionalBehaviors(additionalBehaviors: Map<String, BehaviorOptions>)

    public fun certificate(certificate: ICertificate)

    public fun comment(comment: String)

    public fun defaultBehavior(defaultBehavior: BehaviorOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("559439186f697f3ce0af7d9f62015dec74e259d41adf7c790d264a317fa0d040")
    public fun defaultBehavior(defaultBehavior: BehaviorOptions.Builder.() -> Unit)

    public fun defaultRootObject(defaultRootObject: String)

    public fun domainNames(domainNames: List<String>)

    public fun domainNames(vararg domainNames: String)

    public fun enableIpv6(enableIpv6: Boolean)

    public fun enableLogging(enableLogging: Boolean)

    public fun enabled(enabled: Boolean)

    public fun errorResponses(errorResponses: List<ErrorResponse>)

    public fun errorResponses(vararg errorResponses: ErrorResponse)

    public fun geoRestriction(geoRestriction: GeoRestriction)

    public fun httpVersion(httpVersion: HttpVersion)

    public fun logBucket(logBucket: IBucket)

    public fun logFilePrefix(logFilePrefix: String)

    public fun logIncludesCookies(logIncludesCookies: Boolean)

    public fun minimumProtocolVersion(minimumProtocolVersion: SecurityPolicyProtocol)

    public fun priceClass(priceClass: PriceClass)

    public fun publishAdditionalMetrics(publishAdditionalMetrics: Boolean)

    public fun sslSupportMethod(sslSupportMethod: SSLMethod)

    public fun webAclId(webAclId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.Distribution.Builder =
        software.amazon.awscdk.services.cloudfront.Distribution.Builder.create(scope, id)

    override fun additionalBehaviors(additionalBehaviors: Map<String, BehaviorOptions>) {
      cdkBuilder.additionalBehaviors(additionalBehaviors.mapValues{BehaviorOptions.unwrap(it.value)})
    }

    override fun certificate(certificate: ICertificate) {
      cdkBuilder.certificate(certificate.let(ICertificate::unwrap))
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun defaultBehavior(defaultBehavior: BehaviorOptions) {
      cdkBuilder.defaultBehavior(defaultBehavior.let(BehaviorOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("559439186f697f3ce0af7d9f62015dec74e259d41adf7c790d264a317fa0d040")
    override fun defaultBehavior(defaultBehavior: BehaviorOptions.Builder.() -> Unit): Unit =
        defaultBehavior(BehaviorOptions(defaultBehavior))

    override fun defaultRootObject(defaultRootObject: String) {
      cdkBuilder.defaultRootObject(defaultRootObject)
    }

    override fun domainNames(domainNames: List<String>) {
      cdkBuilder.domainNames(domainNames)
    }

    override fun domainNames(vararg domainNames: String): Unit = domainNames(domainNames.toList())

    override fun enableIpv6(enableIpv6: Boolean) {
      cdkBuilder.enableIpv6(enableIpv6)
    }

    override fun enableLogging(enableLogging: Boolean) {
      cdkBuilder.enableLogging(enableLogging)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun errorResponses(errorResponses: List<ErrorResponse>) {
      cdkBuilder.errorResponses(errorResponses.map(ErrorResponse::unwrap))
    }

    override fun errorResponses(vararg errorResponses: ErrorResponse): Unit =
        errorResponses(errorResponses.toList())

    override fun geoRestriction(geoRestriction: GeoRestriction) {
      cdkBuilder.geoRestriction(geoRestriction.let(GeoRestriction::unwrap))
    }

    override fun httpVersion(httpVersion: HttpVersion) {
      cdkBuilder.httpVersion(httpVersion.let(HttpVersion::unwrap))
    }

    override fun logBucket(logBucket: IBucket) {
      cdkBuilder.logBucket(logBucket.let(IBucket::unwrap))
    }

    override fun logFilePrefix(logFilePrefix: String) {
      cdkBuilder.logFilePrefix(logFilePrefix)
    }

    override fun logIncludesCookies(logIncludesCookies: Boolean) {
      cdkBuilder.logIncludesCookies(logIncludesCookies)
    }

    override fun minimumProtocolVersion(minimumProtocolVersion: SecurityPolicyProtocol) {
      cdkBuilder.minimumProtocolVersion(minimumProtocolVersion.let(SecurityPolicyProtocol::unwrap))
    }

    override fun priceClass(priceClass: PriceClass) {
      cdkBuilder.priceClass(priceClass.let(PriceClass::unwrap))
    }

    override fun publishAdditionalMetrics(publishAdditionalMetrics: Boolean) {
      cdkBuilder.publishAdditionalMetrics(publishAdditionalMetrics)
    }

    override fun sslSupportMethod(sslSupportMethod: SSLMethod) {
      cdkBuilder.sslSupportMethod(sslSupportMethod.let(SSLMethod::unwrap))
    }

    override fun webAclId(webAclId: String) {
      cdkBuilder.webAclId(webAclId)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.Distribution = cdkBuilder.build()
  }

  public companion object {
    public open fun fromDistributionAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DistributionAttributes,
    ): IDistribution =
        software.amazon.awscdk.services.cloudfront.Distribution.fromDistributionAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(DistributionAttributes::unwrap)).let(IDistribution::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13b637f527f535354a6fcac80fa4eef953671068e33f43e905ddf0f27899b7fd")
    public open fun fromDistributionAttributes(
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
