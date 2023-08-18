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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * This resource contains the details of the buckets and Regions for the Amazon S3 Storage Lens
 * configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * BucketsAndRegionsProperty bucketsAndRegionsProperty = BucketsAndRegionsProperty.builder()
 * .buckets(List.of("buckets"))
 * .regions(List.of("regions"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-bucketsandregions.html)
 */
@CdkDslMarker
public class CfnStorageLensBucketsAndRegionsPropertyDsl {
    private val cdkBuilder: CfnStorageLens.BucketsAndRegionsProperty.Builder =
        CfnStorageLens.BucketsAndRegionsProperty.builder()

    private val _buckets: MutableList<String> = mutableListOf()

    private val _regions: MutableList<String> = mutableListOf()

    /**
     * @param buckets This property contains the details of the buckets for the Amazon S3 Storage
     *   Lens configuration. This should be the bucket Amazon Resource Name(ARN). For valid values,
     *   see
     *   [Buckets ARN format here](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_Include.html#API_control_Include_Contents)
     *   in the *Amazon S3 API Reference* .
     */
    public fun buckets(vararg buckets: String) {
        _buckets.addAll(listOf(*buckets))
    }

    /**
     * @param buckets This property contains the details of the buckets for the Amazon S3 Storage
     *   Lens configuration. This should be the bucket Amazon Resource Name(ARN). For valid values,
     *   see
     *   [Buckets ARN format here](https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_Include.html#API_control_Include_Contents)
     *   in the *Amazon S3 API Reference* .
     */
    public fun buckets(buckets: Collection<String>) {
        _buckets.addAll(buckets)
    }

    /**
     * @param regions This property contains the details of the Regions for the S3 Storage Lens
     *   configuration.
     */
    public fun regions(vararg regions: String) {
        _regions.addAll(listOf(*regions))
    }

    /**
     * @param regions This property contains the details of the Regions for the S3 Storage Lens
     *   configuration.
     */
    public fun regions(regions: Collection<String>) {
        _regions.addAll(regions)
    }

    public fun build(): CfnStorageLens.BucketsAndRegionsProperty {
        if (_buckets.isNotEmpty()) cdkBuilder.buckets(_buckets)
        if (_regions.isNotEmpty()) cdkBuilder.regions(_regions)
        return cdkBuilder.build()
    }
}
