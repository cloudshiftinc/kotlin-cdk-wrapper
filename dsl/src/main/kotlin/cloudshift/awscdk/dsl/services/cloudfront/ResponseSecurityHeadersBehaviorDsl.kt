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
import software.amazon.awscdk.services.cloudfront.ResponseHeadersContentSecurityPolicy
import software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions
import software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions
import software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy
import software.amazon.awscdk.services.cloudfront.ResponseHeadersStrictTransportSecurity
import software.amazon.awscdk.services.cloudfront.ResponseHeadersXSSProtection
import software.amazon.awscdk.services.cloudfront.ResponseSecurityHeadersBehavior
import kotlin.Unit

@CdkDslMarker
public class ResponseSecurityHeadersBehaviorDsl {
    private val cdkBuilder: ResponseSecurityHeadersBehavior.Builder =
        ResponseSecurityHeadersBehavior.builder()

    public fun contentSecurityPolicy(block: ResponseHeadersContentSecurityPolicyDsl.() -> Unit = {}) {
        val builder = ResponseHeadersContentSecurityPolicyDsl()
        builder.apply(block)
        cdkBuilder.contentSecurityPolicy(builder.build())
    }

    public fun contentSecurityPolicy(contentSecurityPolicy: ResponseHeadersContentSecurityPolicy) {
        cdkBuilder.contentSecurityPolicy(contentSecurityPolicy)
    }

    public fun contentTypeOptions(block: ResponseHeadersContentTypeOptionsDsl.() -> Unit = {}) {
        val builder = ResponseHeadersContentTypeOptionsDsl()
        builder.apply(block)
        cdkBuilder.contentTypeOptions(builder.build())
    }

    public fun contentTypeOptions(contentTypeOptions: ResponseHeadersContentTypeOptions) {
        cdkBuilder.contentTypeOptions(contentTypeOptions)
    }

    public fun frameOptions(block: ResponseHeadersFrameOptionsDsl.() -> Unit = {}) {
        val builder = ResponseHeadersFrameOptionsDsl()
        builder.apply(block)
        cdkBuilder.frameOptions(builder.build())
    }

    public fun frameOptions(frameOptions: ResponseHeadersFrameOptions) {
        cdkBuilder.frameOptions(frameOptions)
    }

    public fun referrerPolicy(block: ResponseHeadersReferrerPolicyDsl.() -> Unit = {}) {
        val builder = ResponseHeadersReferrerPolicyDsl()
        builder.apply(block)
        cdkBuilder.referrerPolicy(builder.build())
    }

    public fun referrerPolicy(referrerPolicy: ResponseHeadersReferrerPolicy) {
        cdkBuilder.referrerPolicy(referrerPolicy)
    }

    public fun strictTransportSecurity(
        block: ResponseHeadersStrictTransportSecurityDsl.() -> Unit =
            {},
    ) {
        val builder = ResponseHeadersStrictTransportSecurityDsl()
        builder.apply(block)
        cdkBuilder.strictTransportSecurity(builder.build())
    }

    public fun strictTransportSecurity(strictTransportSecurity: ResponseHeadersStrictTransportSecurity) {
        cdkBuilder.strictTransportSecurity(strictTransportSecurity)
    }

    public fun xssProtection(block: ResponseHeadersXSSProtectionDsl.() -> Unit = {}) {
        val builder = ResponseHeadersXSSProtectionDsl()
        builder.apply(block)
        cdkBuilder.xssProtection(builder.build())
    }

    public fun xssProtection(xssProtection: ResponseHeadersXSSProtection) {
        cdkBuilder.xssProtection(xssProtection)
    }

    public fun build(): ResponseSecurityHeadersBehavior = cdkBuilder.build()
}
