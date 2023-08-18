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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * A filter that identifies the subset of objects to which the replication rule applies.
 *
 * A `Filter` must specify exactly one `Prefix` , `TagFilter` , or an `And` child element.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * ReplicationRuleFilterProperty replicationRuleFilterProperty =
 * ReplicationRuleFilterProperty.builder()
 * .and(ReplicationRuleAndOperatorProperty.builder()
 * .prefix("prefix")
 * .tagFilters(List.of(TagFilterProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .prefix("prefix")
 * .tagFilter(TagFilterProperty.builder()
 * .key("key")
 * .value("value")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationrulefilter.html)
 */
@CdkDslMarker
public class CfnBucketReplicationRuleFilterPropertyDsl {
    private val cdkBuilder: CfnBucket.ReplicationRuleFilterProperty.Builder =
        CfnBucket.ReplicationRuleFilterProperty.builder()

    /**
     * @param and A container for specifying rule filters. The filters determine the subset of
     *   objects to which the rule applies. This element is required only if you specify more than
     *   one filter. For example:
     * * If you specify both a `Prefix` and a `TagFilter` , wrap these filters in an `And` tag.
     * * If you specify a filter based on multiple tags, wrap the `TagFilter` elements in an `And`
     *   tag.
     */
    public fun and(and: IResolvable) {
        cdkBuilder.and(and)
    }

    /**
     * @param and A container for specifying rule filters. The filters determine the subset of
     *   objects to which the rule applies. This element is required only if you specify more than
     *   one filter. For example:
     * * If you specify both a `Prefix` and a `TagFilter` , wrap these filters in an `And` tag.
     * * If you specify a filter based on multiple tags, wrap the `TagFilter` elements in an `And`
     *   tag.
     */
    public fun and(and: CfnBucket.ReplicationRuleAndOperatorProperty) {
        cdkBuilder.and(and)
    }

    /**
     * @param prefix An object key name prefix that identifies the subset of objects to which the
     *   rule applies.
     *
     * Replacement must be made for object keys containing special characters (such as carriage
     * returns) when using XML requests. For more information, see
     * [XML related object key constraints](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-keys.html#object-key-xml-related-constraints)
     * .
     */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    /**
     * @param tagFilter A container for specifying a tag key and value. The rule applies only to
     *   objects that have the tag in their tag set.
     */
    public fun tagFilter(tagFilter: IResolvable) {
        cdkBuilder.tagFilter(tagFilter)
    }

    /**
     * @param tagFilter A container for specifying a tag key and value. The rule applies only to
     *   objects that have the tag in their tag set.
     */
    public fun tagFilter(tagFilter: CfnBucket.TagFilterProperty) {
        cdkBuilder.tagFilter(tagFilter)
    }

    public fun build(): CfnBucket.ReplicationRuleFilterProperty = cdkBuilder.build()
}
