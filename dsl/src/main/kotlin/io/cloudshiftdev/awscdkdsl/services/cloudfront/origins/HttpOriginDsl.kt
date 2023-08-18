@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cloudfront.origins

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cloudfront.OriginProtocolPolicy
import software.amazon.awscdk.services.cloudfront.OriginSslPolicy
import software.amazon.awscdk.services.cloudfront.origins.HttpOrigin

/**
 * An Origin for an HTTP server or S3 bucket configured for website hosting.
 *
 * Example:
 * ```
 * // Validating signed URLs or signed cookies with Trusted Key Groups
 * // public key in PEM format
 * String publicKey;
 * PublicKey pubKey = PublicKey.Builder.create(this, "MyPubKey")
 * .encodedKey(publicKey)
 * .build();
 * KeyGroup keyGroup = KeyGroup.Builder.create(this, "MyKeyGroup")
 * .items(List.of(pubKey))
 * .build();
 * Distribution.Builder.create(this, "Dist")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new HttpOrigin("www.example.com"))
 * .trustedKeyGroups(List.of(keyGroup))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class HttpOriginDsl(
    domainName: String,
) {
    private val cdkBuilder: HttpOrigin.Builder = HttpOrigin.Builder.create(domainName)

    private val _originSslProtocols: MutableList<OriginSslPolicy> = mutableListOf()

    /**
     * The number of times that CloudFront attempts to connect to the origin;
     *
     * valid values are 1, 2, or 3 attempts.
     *
     * Default: 3
     *
     * @param connectionAttempts The number of times that CloudFront attempts to connect to the
     *   origin;.
     */
    public fun connectionAttempts(connectionAttempts: Number) {
        cdkBuilder.connectionAttempts(connectionAttempts)
    }

    /**
     * The number of seconds that CloudFront waits when trying to establish a connection to the
     * origin.
     *
     * Valid values are 1-10 seconds, inclusive.
     *
     * Default: Duration.seconds(10)
     *
     * @param connectionTimeout The number of seconds that CloudFront waits when trying to establish
     *   a connection to the origin.
     */
    public fun connectionTimeout(connectionTimeout: Duration) {
        cdkBuilder.connectionTimeout(connectionTimeout)
    }

    /**
     * A list of HTTP header names and values that CloudFront adds to requests it sends to the
     * origin.
     *
     * Default: {}
     *
     * @param customHeaders A list of HTTP header names and values that CloudFront adds to requests
     *   it sends to the origin.
     */
    public fun customHeaders(customHeaders: Map<String, String>) {
        cdkBuilder.customHeaders(customHeaders)
    }

    /**
     * The HTTP port that CloudFront uses to connect to the origin.
     *
     * Default: 80
     *
     * @param httpPort The HTTP port that CloudFront uses to connect to the origin.
     */
    public fun httpPort(httpPort: Number) {
        cdkBuilder.httpPort(httpPort)
    }

    /**
     * The HTTPS port that CloudFront uses to connect to the origin.
     *
     * Default: 443
     *
     * @param httpsPort The HTTPS port that CloudFront uses to connect to the origin.
     */
    public fun httpsPort(httpsPort: Number) {
        cdkBuilder.httpsPort(httpsPort)
    }

    /**
     * Specifies how long, in seconds, CloudFront persists its connection to the origin.
     *
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota has been approved in the target account; otherwise, values over
     * 60 seconds will produce an error at deploy time.
     *
     * Default: Duration.seconds(5)
     *
     * @param keepaliveTimeout Specifies how long, in seconds, CloudFront persists its connection to
     *   the origin.
     */
    public fun keepaliveTimeout(keepaliveTimeout: Duration) {
        cdkBuilder.keepaliveTimeout(keepaliveTimeout)
    }

    /**
     * A unique identifier for the origin.
     *
     * This value must be unique within the distribution.
     *
     * Default: - an originid will be generated for you
     *
     * @param originId A unique identifier for the origin.
     */
    public fun originId(originId: String) {
        cdkBuilder.originId(originId)
    }

    /**
     * An optional path that CloudFront appends to the origin domain name when CloudFront requests
     * content from the origin.
     *
     * Must begin, but not end, with '/' (e.g., '/production/images').
     *
     * Default: '/'
     *
     * @param originPath An optional path that CloudFront appends to the origin domain name when
     *   CloudFront requests content from the origin.
     */
    public fun originPath(originPath: String) {
        cdkBuilder.originPath(originPath)
    }

    /**
     * Origin Shield is enabled by setting originShieldRegion to a valid region, after this to
     * disable Origin Shield again you must set this flag to false.
     *
     * Default: - true
     *
     * @param originShieldEnabled Origin Shield is enabled by setting originShieldRegion to a valid
     *   region, after this to disable Origin Shield again you must set this flag to false.
     */
    public fun originShieldEnabled(originShieldEnabled: Boolean) {
        cdkBuilder.originShieldEnabled(originShieldEnabled)
    }

    /**
     * When you enable Origin Shield in the AWS Region that has the lowest latency to your origin,
     * you can get better network performance.
     *
     * Default: - origin shield not enabled
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/origin-shield.html)
     *
     * @param originShieldRegion When you enable Origin Shield in the AWS Region that has the lowest
     *   latency to your origin, you can get better network performance.
     */
    public fun originShieldRegion(originShieldRegion: String) {
        cdkBuilder.originShieldRegion(originShieldRegion)
    }

    /**
     * The SSL versions to use when interacting with the origin.
     *
     * Default: OriginSslPolicy.TLS_V1_2
     *
     * @param originSslProtocols The SSL versions to use when interacting with the origin.
     */
    public fun originSslProtocols(vararg originSslProtocols: OriginSslPolicy) {
        _originSslProtocols.addAll(listOf(*originSslProtocols))
    }

    /**
     * The SSL versions to use when interacting with the origin.
     *
     * Default: OriginSslPolicy.TLS_V1_2
     *
     * @param originSslProtocols The SSL versions to use when interacting with the origin.
     */
    public fun originSslProtocols(originSslProtocols: Collection<OriginSslPolicy>) {
        _originSslProtocols.addAll(originSslProtocols)
    }

    /**
     * Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect to the origin.
     *
     * Default: OriginProtocolPolicy.HTTPS_ONLY
     *
     * @param protocolPolicy Specifies the protocol (HTTP or HTTPS) that CloudFront uses to connect
     *   to the origin.
     */
    public fun protocolPolicy(protocolPolicy: OriginProtocolPolicy) {
        cdkBuilder.protocolPolicy(protocolPolicy)
    }

    /**
     * Specifies how long, in seconds, CloudFront waits for a response from the origin, also known
     * as the origin response timeout.
     *
     * The valid range is from 1 to 180 seconds, inclusive.
     *
     * Note that values over 60 seconds are possible only after a limit increase request for the
     * origin response timeout quota has been approved in the target account; otherwise, values over
     * 60 seconds will produce an error at deploy time.
     *
     * Default: Duration.seconds(30)
     *
     * @param readTimeout Specifies how long, in seconds, CloudFront waits for a response from the
     *   origin, also known as the origin response timeout.
     */
    public fun readTimeout(readTimeout: Duration) {
        cdkBuilder.readTimeout(readTimeout)
    }

    public fun build(): HttpOrigin {
        if (_originSslProtocols.isNotEmpty()) cdkBuilder.originSslProtocols(_originSslProtocols)
        return cdkBuilder.build()
    }
}
