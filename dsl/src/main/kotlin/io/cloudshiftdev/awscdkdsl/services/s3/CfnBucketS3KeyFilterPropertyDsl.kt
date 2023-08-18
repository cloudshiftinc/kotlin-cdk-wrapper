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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * A container for object key name prefix and suffix filtering rules.
 *
 * For more information about object key name filtering, see
 * [Configuring event notifications using object key name filtering](https://docs.aws.amazon.com/AmazonS3/latest/userguide/notification-how-to-filtering.html)
 * in the *Amazon S3 User Guide* .
 *
 * The same type of filter rule cannot be used more than once. For example, you cannot specify two
 * prefix rules.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * S3KeyFilterProperty s3KeyFilterProperty = S3KeyFilterProperty.builder()
 * .rules(List.of(FilterRuleProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-s3keyfilter.html)
 */
@CdkDslMarker
public class CfnBucketS3KeyFilterPropertyDsl {
    private val cdkBuilder: CfnBucket.S3KeyFilterProperty.Builder =
        CfnBucket.S3KeyFilterProperty.builder()

    private val _rules: MutableList<Any> = mutableListOf()

    /**
     * @param rules A list of containers for the key-value pair that defines the criteria for the
     *   filter rule.
     */
    public fun rules(vararg rules: Any) {
        _rules.addAll(listOf(*rules))
    }

    /**
     * @param rules A list of containers for the key-value pair that defines the criteria for the
     *   filter rule.
     */
    public fun rules(rules: Collection<Any>) {
        _rules.addAll(rules)
    }

    /**
     * @param rules A list of containers for the key-value pair that defines the criteria for the
     *   filter rule.
     */
    public fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules)
    }

    public fun build(): CfnBucket.S3KeyFilterProperty {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        return cdkBuilder.build()
    }
}
