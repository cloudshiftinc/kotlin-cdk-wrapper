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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution
import software.constructs.Construct

/**
 * This resource is deprecated.
 *
 * Amazon CloudFront is deprecating real-time messaging protocol (RTMP) distributions on December
 * 31, 2020. For more information,
 * [read the announcement](https://docs.aws.amazon.com/ann.jspa?annID=7356) on the Amazon CloudFront
 * discussion forum.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnStreamingDistribution cfnStreamingDistribution = CfnStreamingDistribution.Builder.create(this,
 * "MyCfnStreamingDistribution")
 * .streamingDistributionConfig(StreamingDistributionConfigProperty.builder()
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
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html)
 */
@CdkDslMarker
public class CfnStreamingDistributionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStreamingDistribution.Builder =
        CfnStreamingDistribution.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The current configuration information for the RTMP distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig)
     *
     * @param streamingDistributionConfig The current configuration information for the RTMP
     *   distribution.
     */
    public fun streamingDistributionConfig(streamingDistributionConfig: IResolvable) {
        cdkBuilder.streamingDistributionConfig(streamingDistributionConfig)
    }

    /**
     * The current configuration information for the RTMP distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-streamingdistributionconfig)
     *
     * @param streamingDistributionConfig The current configuration information for the RTMP
     *   distribution.
     */
    public fun streamingDistributionConfig(
        streamingDistributionConfig: CfnStreamingDistribution.StreamingDistributionConfigProperty
    ) {
        cdkBuilder.streamingDistributionConfig(streamingDistributionConfig)
    }

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags)
     *
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html#cfn-cloudfront-streamingdistribution-tags)
     *
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStreamingDistribution {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
