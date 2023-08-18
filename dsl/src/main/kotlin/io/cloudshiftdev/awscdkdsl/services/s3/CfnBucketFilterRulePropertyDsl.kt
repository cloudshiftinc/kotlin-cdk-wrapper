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
 * Specifies the Amazon S3 object key name to filter on and whether to filter on the suffix or
 * prefix of the key name.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * FilterRuleProperty filterRuleProperty = FilterRuleProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-filterrule.html)
 */
@CdkDslMarker
public class CfnBucketFilterRulePropertyDsl {
    private val cdkBuilder: CfnBucket.FilterRuleProperty.Builder =
        CfnBucket.FilterRuleProperty.builder()

    /**
     * @param name The object key name prefix or suffix identifying one or more objects to which the
     *   filtering rule applies. The maximum length is 1,024 characters. Overlapping prefixes and
     *   suffixes are not supported. For more information, see
     *   [Configuring Event Notifications](https://docs.aws.amazon.com/AmazonS3/latest/dev/NotificationHowTo.html)
     *   in the *Amazon S3 User Guide* .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value The value that the filter searches for in object key names. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnBucket.FilterRuleProperty = cdkBuilder.build()
}
