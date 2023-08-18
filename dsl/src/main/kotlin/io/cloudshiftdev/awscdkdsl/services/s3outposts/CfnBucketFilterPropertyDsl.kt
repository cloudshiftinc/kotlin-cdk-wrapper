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

package io.cloudshiftdev.awscdkdsl.services.s3outposts

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3outposts.CfnBucket

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3outposts.*;
 * FilterProperty filterProperty = FilterProperty.builder()
 * .andOperator(FilterAndOperatorProperty.builder()
 * .tags(List.of(FilterTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * // the properties below are optional
 * .prefix("prefix")
 * .build())
 * .prefix("prefix")
 * .tag(FilterTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filter.html)
 */
@CdkDslMarker
public class CfnBucketFilterPropertyDsl {
    private val cdkBuilder: CfnBucket.FilterProperty.Builder = CfnBucket.FilterProperty.builder()

    /** @param andOperator the value to be set. */
    public fun andOperator(andOperator: IResolvable) {
        cdkBuilder.andOperator(andOperator)
    }

    /** @param andOperator the value to be set. */
    public fun andOperator(andOperator: CfnBucket.FilterAndOperatorProperty) {
        cdkBuilder.andOperator(andOperator)
    }

    /** @param prefix the value to be set. */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    /** @param tag the value to be set. */
    public fun tag(tag: IResolvable) {
        cdkBuilder.tag(tag)
    }

    /** @param tag the value to be set. */
    public fun tag(tag: CfnBucket.FilterTagProperty) {
        cdkBuilder.tag(tag)
    }

    public fun build(): CfnBucket.FilterProperty = cdkBuilder.build()
}
