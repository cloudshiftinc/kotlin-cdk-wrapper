@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.certificatemanager.ICertificate
import software.amazon.awscdk.services.cloudfront.BehaviorOptions
import software.amazon.awscdk.services.cloudfront.DistributionProps
import software.amazon.awscdk.services.cloudfront.ErrorResponse
import software.amazon.awscdk.services.cloudfront.GeoRestriction
import software.amazon.awscdk.services.cloudfront.HttpVersion
import software.amazon.awscdk.services.cloudfront.PriceClass
import software.amazon.awscdk.services.cloudfront.SSLMethod
import software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol
import software.amazon.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class DistributionPropsDsl {
    private val cdkBuilder: DistributionProps.Builder = DistributionProps.builder()

    private val _domainNames: MutableList<String> = mutableListOf()

    private val _errorResponses: MutableList<ErrorResponse> = mutableListOf()

    public fun additionalBehaviors(additionalBehaviors: Map<String, BehaviorOptions>) {
        cdkBuilder.additionalBehaviors(additionalBehaviors)
    }

    public fun certificate(certificate: ICertificate) {
        cdkBuilder.certificate(certificate)
    }

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun defaultBehavior(block: BehaviorOptionsDsl.() -> Unit = {}) {
        val builder = BehaviorOptionsDsl()
        builder.apply(block)
        cdkBuilder.defaultBehavior(builder.build())
    }

    public fun defaultBehavior(defaultBehavior: BehaviorOptions) {
        cdkBuilder.defaultBehavior(defaultBehavior)
    }

    public fun defaultRootObject(defaultRootObject: String) {
        cdkBuilder.defaultRootObject(defaultRootObject)
    }

    public fun domainNames(vararg domainNames: String) {
        _domainNames.addAll(listOf(*domainNames))
    }

    public fun domainNames(domainNames: Collection<String>) {
        _domainNames.addAll(domainNames)
    }

    public fun enableIpv6(enableIpv6: Boolean) {
        cdkBuilder.enableIpv6(enableIpv6)
    }

    public fun enableLogging(enableLogging: Boolean) {
        cdkBuilder.enableLogging(enableLogging)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun errorResponses(errorResponses: ErrorResponseDsl.() -> Unit) {
        _errorResponses.add(ErrorResponseDsl().apply(errorResponses).build())
    }

    public fun errorResponses(errorResponses: Collection<ErrorResponse>) {
        _errorResponses.addAll(errorResponses)
    }

    public fun geoRestriction(geoRestriction: GeoRestriction) {
        cdkBuilder.geoRestriction(geoRestriction)
    }

    public fun httpVersion(httpVersion: HttpVersion) {
        cdkBuilder.httpVersion(httpVersion)
    }

    public fun logBucket(logBucket: IBucket) {
        cdkBuilder.logBucket(logBucket)
    }

    public fun logFilePrefix(logFilePrefix: String) {
        cdkBuilder.logFilePrefix(logFilePrefix)
    }

    public fun logIncludesCookies(logIncludesCookies: Boolean) {
        cdkBuilder.logIncludesCookies(logIncludesCookies)
    }

    public fun minimumProtocolVersion(minimumProtocolVersion: SecurityPolicyProtocol) {
        cdkBuilder.minimumProtocolVersion(minimumProtocolVersion)
    }

    public fun priceClass(priceClass: PriceClass) {
        cdkBuilder.priceClass(priceClass)
    }

    public fun sslSupportMethod(sslSupportMethod: SSLMethod) {
        cdkBuilder.sslSupportMethod(sslSupportMethod)
    }

    public fun webAclId(webAclId: String) {
        cdkBuilder.webAclId(webAclId)
    }

    public fun build(): DistributionProps {
        if (_domainNames.isNotEmpty()) cdkBuilder.domainNames(_domainNames)
        if (_errorResponses.isNotEmpty()) cdkBuilder.errorResponses(_errorResponses)
        return cdkBuilder.build()
    }
}
