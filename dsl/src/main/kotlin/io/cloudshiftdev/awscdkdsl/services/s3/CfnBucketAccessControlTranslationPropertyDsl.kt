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
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specify this only in a cross-account scenario (where source and destination bucket owners are not
 * the same), and you want to change replica ownership to the AWS account that owns the destination
 * bucket.
 *
 * If this is not specified in the replication configuration, the replicas are owned by same AWS
 * account that owns the source object.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * AccessControlTranslationProperty accessControlTranslationProperty =
 * AccessControlTranslationProperty.builder()
 * .owner("owner")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html)
 */
@CdkDslMarker
public class CfnBucketAccessControlTranslationPropertyDsl {
    private val cdkBuilder: CfnBucket.AccessControlTranslationProperty.Builder =
        CfnBucket.AccessControlTranslationProperty.builder()

    /**
     * @param owner Specifies the replica ownership. For default and valid values, see
     *   [PUT bucket replication](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html)
     *   in the *Amazon S3 API Reference* .
     */
    public fun owner(owner: String) {
        cdkBuilder.owner(owner)
    }

    public fun build(): CfnBucket.AccessControlTranslationProperty = cdkBuilder.build()
}
