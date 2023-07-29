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
import kotlin.Number
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies when noncurrent object versions expire.
 *
 * Upon expiration, Amazon S3 permanently deletes the noncurrent object versions. You set this
 * lifecycle configuration action on a bucket that has versioning enabled (or suspended) to request
 * that Amazon S3 delete noncurrent object versions at a specific period in the object's lifetime.
 * For more information about setting a lifecycle rule configuration, see
 * [AWS::S3::Bucket Rule](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-lifecycleconfig-rule.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * NoncurrentVersionExpirationProperty noncurrentVersionExpirationProperty =
 * NoncurrentVersionExpirationProperty.builder()
 * .noncurrentDays(123)
 * // the properties below are optional
 * .newerNoncurrentVersions(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-noncurrentversionexpiration.html)
 */
@CdkDslMarker
public class CfnBucketNoncurrentVersionExpirationPropertyDsl {
    private val cdkBuilder: CfnBucket.NoncurrentVersionExpirationProperty.Builder =
        CfnBucket.NoncurrentVersionExpirationProperty.builder()

    /**
     * @param newerNoncurrentVersions Specifies how many noncurrent versions Amazon S3 will retain.
     *   If there are this many more recent noncurrent versions, Amazon S3 will take the associated
     *   action. For more information about noncurrent versions, see
     *   [Lifecycle configuration elements](https://docs.aws.amazon.com/AmazonS3/latest/userguide/intro-lifecycle-rules.html)
     *   in the *Amazon S3 User Guide* .
     */
    public fun newerNoncurrentVersions(newerNoncurrentVersions: Number) {
        cdkBuilder.newerNoncurrentVersions(newerNoncurrentVersions)
    }

    /**
     * @param noncurrentDays Specifies the number of days an object is noncurrent before Amazon S3
     *   can perform the associated action. For information about the noncurrent days calculations,
     *   see
     *   [How Amazon S3 Calculates When an Object Became Noncurrent](https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations)
     *   in the *Amazon S3 User Guide* .
     */
    public fun noncurrentDays(noncurrentDays: Number) {
        cdkBuilder.noncurrentDays(noncurrentDays)
    }

    public fun build(): CfnBucket.NoncurrentVersionExpirationProperty = cdkBuilder.build()
}
