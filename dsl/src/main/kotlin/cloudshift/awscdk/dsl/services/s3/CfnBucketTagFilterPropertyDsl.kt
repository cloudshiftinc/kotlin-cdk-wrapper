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
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies tags to use to identify a subset of objects for an Amazon S3 bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * TagFilterProperty tagFilterProperty = TagFilterProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-tagfilter.html)
 */
@CdkDslMarker
public class CfnBucketTagFilterPropertyDsl {
    private val cdkBuilder: CfnBucket.TagFilterProperty.Builder =
        CfnBucket.TagFilterProperty.builder()

    /** @param key The tag key. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The tag value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnBucket.TagFilterProperty = cdkBuilder.build()
}
