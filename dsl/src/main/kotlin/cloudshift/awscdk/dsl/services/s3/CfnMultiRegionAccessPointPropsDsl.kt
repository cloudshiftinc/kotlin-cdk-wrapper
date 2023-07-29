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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPointProps

/**
 * Properties for defining a `CfnMultiRegionAccessPoint`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * CfnMultiRegionAccessPointProps cfnMultiRegionAccessPointProps =
 * CfnMultiRegionAccessPointProps.builder()
 * .regions(List.of(RegionProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketAccountId("bucketAccountId")
 * .build()))
 * // the properties below are optional
 * .name("name")
 * .publicAccessBlockConfiguration(PublicAccessBlockConfigurationProperty.builder()
 * .blockPublicAcls(false)
 * .blockPublicPolicy(false)
 * .ignorePublicAcls(false)
 * .restrictPublicBuckets(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-multiregionaccesspoint.html)
 */
@CdkDslMarker
public class CfnMultiRegionAccessPointPropsDsl {
    private val cdkBuilder: CfnMultiRegionAccessPointProps.Builder =
        CfnMultiRegionAccessPointProps.builder()

    private val _regions: MutableList<Any> = mutableListOf()

    /** @param name The name of the Multi-Region Access Point. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     *   apply to this Multi-Region Access Point. You can enable the configuration options in any
     *   combination. For more information about when Amazon S3 considers an object public, see
     *   [The Meaning of "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     *   in the *Amazon S3 User Guide* .
     */
    public fun publicAccessBlockConfiguration(publicAccessBlockConfiguration: IResolvable) {
        cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
    }

    /**
     * @param publicAccessBlockConfiguration The PublicAccessBlock configuration that you want to
     *   apply to this Multi-Region Access Point. You can enable the configuration options in any
     *   combination. For more information about when Amazon S3 considers an object public, see
     *   [The Meaning of "Public"](https://docs.aws.amazon.com/AmazonS3/latest/dev/access-control-block-public-access.html#access-control-block-public-access-policy-status)
     *   in the *Amazon S3 User Guide* .
     */
    public fun publicAccessBlockConfiguration(
        publicAccessBlockConfiguration:
            CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty
    ) {
        cdkBuilder.publicAccessBlockConfiguration(publicAccessBlockConfiguration)
    }

    /**
     * @param regions A collection of the Regions and buckets associated with the Multi-Region
     *   Access Point.
     */
    public fun regions(vararg regions: Any) {
        _regions.addAll(listOf(*regions))
    }

    /**
     * @param regions A collection of the Regions and buckets associated with the Multi-Region
     *   Access Point.
     */
    public fun regions(regions: Collection<Any>) {
        _regions.addAll(regions)
    }

    /**
     * @param regions A collection of the Regions and buckets associated with the Multi-Region
     *   Access Point.
     */
    public fun regions(regions: IResolvable) {
        cdkBuilder.regions(regions)
    }

    public fun build(): CfnMultiRegionAccessPointProps {
        if (_regions.isNotEmpty()) cdkBuilder.regions(_regions)
        return cdkBuilder.build()
    }
}
