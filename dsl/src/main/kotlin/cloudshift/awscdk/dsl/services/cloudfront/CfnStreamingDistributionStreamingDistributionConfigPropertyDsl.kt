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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution

/**
 * The RTMP distribution's configuration information.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * StreamingDistributionConfigProperty streamingDistributionConfigProperty =
 * StreamingDistributionConfigProperty.builder()
 * .comment("comment")
 * .enabled(false)
 * .s3Origin(S3OriginProperty.builder()
 * .domainName("domainName")
 * .originAccessIdentity("originAccessIdentity")
 * .build())
 * .trustedSigners(TrustedSignersProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .awsAccountNumbers(List.of("awsAccountNumbers"))
 * .build())
 * // the properties below are optional
 * .aliases(List.of("aliases"))
 * .logging(LoggingProperty.builder()
 * .bucket("bucket")
 * .enabled(false)
 * .prefix("prefix")
 * .build())
 * .priceClass("priceClass")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-streamingdistributionconfig.html)
 */
@CdkDslMarker
public class CfnStreamingDistributionStreamingDistributionConfigPropertyDsl {
    private val cdkBuilder: CfnStreamingDistribution.StreamingDistributionConfigProperty.Builder =
        CfnStreamingDistribution.StreamingDistributionConfigProperty.builder()

    private val _aliases: MutableList<String> = mutableListOf()

    /**
     * @param aliases A complex type that contains information about CNAMEs (alternate domain
     *   names), if any, for this streaming distribution.
     */
    public fun aliases(vararg aliases: String) {
        _aliases.addAll(listOf(*aliases))
    }

    /**
     * @param aliases A complex type that contains information about CNAMEs (alternate domain
     *   names), if any, for this streaming distribution.
     */
    public fun aliases(aliases: Collection<String>) {
        _aliases.addAll(aliases)
    }

    /** @param comment Any comments you want to include about the streaming distribution. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param enabled Whether the streaming distribution is enabled to accept user requests for
     *   content.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Whether the streaming distribution is enabled to accept user requests for
     *   content.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param logging A complex type that controls whether access logs are written for the streaming
     *   distribution.
     */
    public fun logging(logging: IResolvable) {
        cdkBuilder.logging(logging)
    }

    /**
     * @param logging A complex type that controls whether access logs are written for the streaming
     *   distribution.
     */
    public fun logging(logging: CfnStreamingDistribution.LoggingProperty) {
        cdkBuilder.logging(logging)
    }

    /**
     * @param priceClass A complex type that contains information about price class for this
     *   streaming distribution.
     */
    public fun priceClass(priceClass: String) {
        cdkBuilder.priceClass(priceClass)
    }

    /**
     * @param s3Origin A complex type that contains information about the Amazon S3 bucket from
     *   which you want CloudFront to get your media files for distribution.
     */
    public fun s3Origin(s3Origin: IResolvable) {
        cdkBuilder.s3Origin(s3Origin)
    }

    /**
     * @param s3Origin A complex type that contains information about the Amazon S3 bucket from
     *   which you want CloudFront to get your media files for distribution.
     */
    public fun s3Origin(s3Origin: CfnStreamingDistribution.S3OriginProperty) {
        cdkBuilder.s3Origin(s3Origin)
    }

    /**
     * @param trustedSigners A complex type that specifies any AWS accounts that you want to permit
     *   to create signed URLs for private content. If you want the distribution to use signed URLs,
     *   include this element; if you want the distribution to use public URLs, remove this element.
     *   For more information, see
     *   [Serving Private Content through CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun trustedSigners(trustedSigners: IResolvable) {
        cdkBuilder.trustedSigners(trustedSigners)
    }

    /**
     * @param trustedSigners A complex type that specifies any AWS accounts that you want to permit
     *   to create signed URLs for private content. If you want the distribution to use signed URLs,
     *   include this element; if you want the distribution to use public URLs, remove this element.
     *   For more information, see
     *   [Serving Private Content through CloudFront](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun trustedSigners(trustedSigners: CfnStreamingDistribution.TrustedSignersProperty) {
        cdkBuilder.trustedSigners(trustedSigners)
    }

    public fun build(): CfnStreamingDistribution.StreamingDistributionConfigProperty {
        if (_aliases.isNotEmpty()) cdkBuilder.aliases(_aliases)
        return cdkBuilder.build()
    }
}
