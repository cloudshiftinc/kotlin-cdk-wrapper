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

package io.cloudshiftdev.awscdkdsl.services.s3express

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps

/**
 * Properties for defining a `CfnDirectoryBucket`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3express.*;
 * CfnDirectoryBucketProps cfnDirectoryBucketProps = CfnDirectoryBucketProps.builder()
 * .dataRedundancy("dataRedundancy")
 * .locationName("locationName")
 * // the properties below are optional
 * .bucketName("bucketName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3express-directorybucket.html)
 */
@CdkDslMarker
public class CfnDirectoryBucketPropsDsl {
    private val cdkBuilder: CfnDirectoryBucketProps.Builder = CfnDirectoryBucketProps.builder()

    /**
     * @param bucketName A name for the bucket. The bucket name must contain only lowercase letters,
     *   numbers, and hyphens (-). A directory bucket name must be unique in the chosen Availability
     *   Zone. The bucket name must also follow the format `*bucket_base_name* -- *az_id* --x-s3`
     *   (for example, `*DOC-EXAMPLE-BUCKET* -- *usw2-az1* --x-s3` ). If you don't specify a name,
     *   AWS CloudFormation generates a unique ID and uses that ID for the bucket name. For
     *   information about bucket naming restrictions, see
     *   [Directory bucket naming rules](https://docs.aws.amazon.com/AmazonS3/latest/userguide/directory-bucket-naming-rules.html)
     *   in the *Amazon S3 User Guide* .
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you need to replace the
     * resource, specify a new name.
     */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param dataRedundancy The number of Availability Zone that's used for redundancy for the
     *   bucket.
     */
    public fun dataRedundancy(dataRedundancy: String) {
        cdkBuilder.dataRedundancy(dataRedundancy)
    }

    /**
     * @param locationName The name of the location where the bucket will be created. For directory
     *   buckets, the name of the location is the AZ ID of the Availability Zone where the bucket
     *   will be created. An example AZ ID value is `usw2-az1` .
     */
    public fun locationName(locationName: String) {
        cdkBuilder.locationName(locationName)
    }

    public fun build(): CfnDirectoryBucketProps = cdkBuilder.build()
}
