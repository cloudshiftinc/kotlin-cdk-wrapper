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
import java.time.Instant
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies when an object transitions to a specified storage class.
 *
 * For more information about Amazon S3 lifecycle configuration rules, see
 * [Transitioning Objects Using Amazon S3 Lifecycle](https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html)
 * in the *Amazon S3 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * TransitionProperty transitionProperty = TransitionProperty.builder()
 * .storageClass("storageClass")
 * // the properties below are optional
 * .transitionDate(new Date())
 * .transitionInDays(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-transition.html)
 */
@CdkDslMarker
public class CfnBucketTransitionPropertyDsl {
    private val cdkBuilder: CfnBucket.TransitionProperty.Builder =
        CfnBucket.TransitionProperty.builder()

    /** @param storageClass The storage class to which you want the object to transition. */
    public fun storageClass(storageClass: String) {
        cdkBuilder.storageClass(storageClass)
    }

    /**
     * @param transitionDate Indicates when objects are transitioned to the specified storage class.
     *   The date value must be in ISO 8601 format. The time is always midnight UTC.
     */
    public fun transitionDate(transitionDate: Instant) {
        cdkBuilder.transitionDate(transitionDate)
    }

    /**
     * @param transitionDate Indicates when objects are transitioned to the specified storage class.
     *   The date value must be in ISO 8601 format. The time is always midnight UTC.
     */
    public fun transitionDate(transitionDate: IResolvable) {
        cdkBuilder.transitionDate(transitionDate)
    }

    /**
     * @param transitionInDays Indicates the number of days after creation when objects are
     *   transitioned to the specified storage class. The value must be a positive integer.
     */
    public fun transitionInDays(transitionInDays: Number) {
        cdkBuilder.transitionInDays(transitionInDays)
    }

    public fun build(): CfnBucket.TransitionProperty = cdkBuilder.build()
}
