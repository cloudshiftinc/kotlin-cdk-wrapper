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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.CfnDistribution

/**
 * A custom origin.
 *
 * A custom origin is any origin that is *not* an Amazon S3 bucket, with one exception. An Amazon S3
 * bucket that is
 * [configured with static website hosting](https://docs.aws.amazon.com/AmazonS3/latest/dev/WebsiteHosting.html)
 * *is* a custom origin.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CustomOriginConfigProperty customOriginConfigProperty = CustomOriginConfigProperty.builder()
 * .originProtocolPolicy("originProtocolPolicy")
 * // the properties below are optional
 * .httpPort(123)
 * .httpsPort(123)
 * .originKeepaliveTimeout(123)
 * .originReadTimeout(123)
 * .originSslProtocols(List.of("originSslProtocols"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customoriginconfig.html)
 */
@CdkDslMarker
public class CfnDistributionCustomOriginConfigPropertyDsl {
    private val cdkBuilder: CfnDistribution.CustomOriginConfigProperty.Builder =
        CfnDistribution.CustomOriginConfigProperty.builder()

    private val _originSslProtocols: MutableList<String> = mutableListOf()

    /**
     * @param httpPort The HTTP port that CloudFront uses to connect to the origin. Specify the HTTP
     *   port that the origin listens on.
     */
    public fun httpPort(httpPort: Number) {
        cdkBuilder.httpPort(httpPort)
    }

    /**
     * @param httpsPort The HTTPS port that CloudFront uses to connect to the origin. Specify the
     *   HTTPS port that the origin listens on.
     */
    public fun httpsPort(httpsPort: Number) {
        cdkBuilder.httpsPort(httpsPort)
    }

    /**
     * @param originKeepaliveTimeout Specifies how long, in seconds, CloudFront persists its
     *   connection to the origin. The minimum timeout is 1 second, the maximum is 60 seconds, and
     *   the default (if you don't specify otherwise) is 5 seconds.
     *
     * For more information, see
     * [Origin Keep-alive Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginKeepaliveTimeout)
     * in the *Amazon CloudFront Developer Guide* .
     */
    public fun originKeepaliveTimeout(originKeepaliveTimeout: Number) {
        cdkBuilder.originKeepaliveTimeout(originKeepaliveTimeout)
    }

    /**
     * @param originProtocolPolicy Specifies the protocol (HTTP or HTTPS) that CloudFront uses to
     *   connect to the origin. Valid values are:.
     * * `http-only` – CloudFront always uses HTTP to connect to the origin.
     * * `match-viewer` – CloudFront connects to the origin using the same protocol that the viewer
     *   used to connect to CloudFront.
     * * `https-only` – CloudFront always uses HTTPS to connect to the origin.
     */
    public fun originProtocolPolicy(originProtocolPolicy: String) {
        cdkBuilder.originProtocolPolicy(originProtocolPolicy)
    }

    /**
     * @param originReadTimeout Specifies how long, in seconds, CloudFront waits for a response from
     *   the origin. This is also known as the *origin response timeout* . The minimum timeout is 1
     *   second, the maximum is 60 seconds, and the default (if you don't specify otherwise) is 30
     *   seconds.
     *
     * For more information, see
     * [Origin Response Timeout](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginResponseTimeout)
     * in the *Amazon CloudFront Developer Guide* .
     */
    public fun originReadTimeout(originReadTimeout: Number) {
        cdkBuilder.originReadTimeout(originReadTimeout)
    }

    /**
     * @param originSslProtocols Specifies the minimum SSL/TLS protocol that CloudFront uses when
     *   connecting to your origin over HTTPS. Valid values include `SSLv3` , `TLSv1` , `TLSv1.1` ,
     *   and `TLSv1.2` .
     *
     * For more information, see
     * [Minimum Origin SSL Protocol](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols)
     * in the *Amazon CloudFront Developer Guide* .
     */
    public fun originSslProtocols(vararg originSslProtocols: String) {
        _originSslProtocols.addAll(listOf(*originSslProtocols))
    }

    /**
     * @param originSslProtocols Specifies the minimum SSL/TLS protocol that CloudFront uses when
     *   connecting to your origin over HTTPS. Valid values include `SSLv3` , `TLSv1` , `TLSv1.1` ,
     *   and `TLSv1.2` .
     *
     * For more information, see
     * [Minimum Origin SSL Protocol](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/distribution-web-values-specify.html#DownloadDistValuesOriginSSLProtocols)
     * in the *Amazon CloudFront Developer Guide* .
     */
    public fun originSslProtocols(originSslProtocols: Collection<String>) {
        _originSslProtocols.addAll(originSslProtocols)
    }

    public fun build(): CfnDistribution.CustomOriginConfigProperty {
        if (_originSslProtocols.isNotEmpty()) cdkBuilder.originSslProtocols(_originSslProtocols)
        return cdkBuilder.build()
    }
}
