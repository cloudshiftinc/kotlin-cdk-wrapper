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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * A container for specifying rule filters.
 *
 * The filters determine the subset of objects to which the rule applies. This element is required
 * only if you specify more than one filter.
 *
 * For example:
 * * If you specify both a `Prefix` and a `TagFilter` , wrap these filters in an `And` tag.
 * * If you specify a filter based on multiple tags, wrap the `TagFilter` elements in an `And` tag
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * ReplicationRuleAndOperatorProperty replicationRuleAndOperatorProperty =
 * ReplicationRuleAndOperatorProperty.builder()
 * .prefix("prefix")
 * .tagFilters(List.of(TagFilterProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationruleandoperator.html)
 */
@CdkDslMarker
public class CfnBucketReplicationRuleAndOperatorPropertyDsl {
    private val cdkBuilder: CfnBucket.ReplicationRuleAndOperatorProperty.Builder =
        CfnBucket.ReplicationRuleAndOperatorProperty.builder()

    private val _tagFilters: MutableList<Any> = mutableListOf()

    /**
     * @param prefix An object key name prefix that identifies the subset of objects to which the
     *   rule applies.
     */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    /** @param tagFilters An array of tags containing key and value pairs. */
    public fun tagFilters(vararg tagFilters: Any) {
        _tagFilters.addAll(listOf(*tagFilters))
    }

    /** @param tagFilters An array of tags containing key and value pairs. */
    public fun tagFilters(tagFilters: Collection<Any>) {
        _tagFilters.addAll(tagFilters)
    }

    /** @param tagFilters An array of tags containing key and value pairs. */
    public fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters)
    }

    public fun build(): CfnBucket.ReplicationRuleAndOperatorProperty {
        if (_tagFilters.isNotEmpty()) cdkBuilder.tagFilters(_tagFilters)
        return cdkBuilder.build()
    }
}
