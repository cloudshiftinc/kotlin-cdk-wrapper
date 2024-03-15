@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.certificatemanager.ICertificate
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface DistributionProps {
  public fun additionalBehaviors(): Map<String, BehaviorOptions> =
      unwrap(this).getAdditionalBehaviors()?.mapValues{BehaviorOptions.wrap(it.value)} ?: emptyMap()

  public fun certificate(): ICertificate? = unwrap(this).getCertificate()?.let(ICertificate::wrap)

  public fun comment(): String? = unwrap(this).getComment()

  public fun defaultBehavior(): BehaviorOptions

  public fun defaultRootObject(): String? = unwrap(this).getDefaultRootObject()

  public fun domainNames(): List<String> = unwrap(this).getDomainNames() ?: emptyList()

  public fun enableIpv6(): Boolean? = unwrap(this).getEnableIpv6()

  public fun enableLogging(): Boolean? = unwrap(this).getEnableLogging()

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun errorResponses(): List<ErrorResponse> =
      unwrap(this).getErrorResponses()?.map(ErrorResponse::wrap) ?: emptyList()

  public fun geoRestriction(): GeoRestriction? =
      unwrap(this).getGeoRestriction()?.let(GeoRestriction::wrap)

  public fun httpVersion(): HttpVersion? = unwrap(this).getHttpVersion()?.let(HttpVersion::wrap)

  public fun logBucket(): IBucket? = unwrap(this).getLogBucket()?.let(IBucket::wrap)

  public fun logFilePrefix(): String? = unwrap(this).getLogFilePrefix()

  public fun logIncludesCookies(): Boolean? = unwrap(this).getLogIncludesCookies()

  public fun minimumProtocolVersion(): SecurityPolicyProtocol? =
      unwrap(this).getMinimumProtocolVersion()?.let(SecurityPolicyProtocol::wrap)

  public fun priceClass(): PriceClass? = unwrap(this).getPriceClass()?.let(PriceClass::wrap)

  public fun publishAdditionalMetrics(): Boolean? = unwrap(this).getPublishAdditionalMetrics()

  public fun sslSupportMethod(): SSLMethod? =
      unwrap(this).getSslSupportMethod()?.let(SSLMethod::wrap)

  public fun webAclId(): String? = unwrap(this).getWebAclId()

  @CdkDslMarker
  public interface Builder {
    public fun additionalBehaviors(additionalBehaviors: Map<String, BehaviorOptions>)

    public fun certificate(certificate: ICertificate)

    public fun comment(comment: String)

    public fun defaultBehavior(defaultBehavior: BehaviorOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80a91bac75a0f8e6677c3ecfd1080e30cdedc9eb185dbde5f7c2ce912e9e666c")
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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.DistributionProps.Builder =
        software.amazon.awscdk.services.cloudfront.DistributionProps.builder()

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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80a91bac75a0f8e6677c3ecfd1080e30cdedc9eb185dbde5f7c2ce912e9e666c")
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

    public fun build(): software.amazon.awscdk.services.cloudfront.DistributionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.DistributionProps,
  ) : CdkObject(cdkObject), DistributionProps {
    override fun additionalBehaviors(): Map<String, BehaviorOptions> =
        unwrap(this).getAdditionalBehaviors()?.mapValues{BehaviorOptions.wrap(it.value)} ?:
        emptyMap()

    override fun certificate(): ICertificate? =
        unwrap(this).getCertificate()?.let(ICertificate::wrap)

    override fun comment(): String? = unwrap(this).getComment()

    override fun defaultBehavior(): BehaviorOptions =
        unwrap(this).getDefaultBehavior().let(BehaviorOptions::wrap)

    override fun defaultRootObject(): String? = unwrap(this).getDefaultRootObject()

    override fun domainNames(): List<String> = unwrap(this).getDomainNames() ?: emptyList()

    override fun enableIpv6(): Boolean? = unwrap(this).getEnableIpv6()

    override fun enableLogging(): Boolean? = unwrap(this).getEnableLogging()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun errorResponses(): List<ErrorResponse> =
        unwrap(this).getErrorResponses()?.map(ErrorResponse::wrap) ?: emptyList()

    override fun geoRestriction(): GeoRestriction? =
        unwrap(this).getGeoRestriction()?.let(GeoRestriction::wrap)

    override fun httpVersion(): HttpVersion? = unwrap(this).getHttpVersion()?.let(HttpVersion::wrap)

    override fun logBucket(): IBucket? = unwrap(this).getLogBucket()?.let(IBucket::wrap)

    override fun logFilePrefix(): String? = unwrap(this).getLogFilePrefix()

    override fun logIncludesCookies(): Boolean? = unwrap(this).getLogIncludesCookies()

    override fun minimumProtocolVersion(): SecurityPolicyProtocol? =
        unwrap(this).getMinimumProtocolVersion()?.let(SecurityPolicyProtocol::wrap)

    override fun priceClass(): PriceClass? = unwrap(this).getPriceClass()?.let(PriceClass::wrap)

    override fun publishAdditionalMetrics(): Boolean? = unwrap(this).getPublishAdditionalMetrics()

    override fun sslSupportMethod(): SSLMethod? =
        unwrap(this).getSslSupportMethod()?.let(SSLMethod::wrap)

    override fun webAclId(): String? = unwrap(this).getWebAclId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DistributionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.DistributionProps):
        DistributionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DistributionProps):
        software.amazon.awscdk.services.cloudfront.DistributionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.DistributionProps
  }
}
