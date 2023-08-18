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

package io.cloudshiftdev.awscdkdsl.services.resourcegroups

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.resourcegroups.CfnGroup

/**
 * Specifies a single tag key and optional values that you can use to specify membership in a
 * tag-based group.
 *
 * An AWS resource that doesn't have a matching tag key and value is rejected as a member of the
 * group.
 *
 * A `TagFilter` object includes two properties: `Key` (a string) and `Values` (a list of strings).
 * Only resources in the account that are tagged with a matching key-value pair are members of the
 * group. The `Values` property of `TagFilter` is optional, but specifying it narrows the query
 * results.
 *
 * As an example, suppose the `TagFilters` string is `[{"Key": "Stage", "Values": ["Test", "Beta"]},
 * {"Key": "Storage"}]` . In this case, only resources with all of the following tags are members of
 * the group:
 * * `Stage` tag key with a value of either `Test` or `Beta`
 * * `Storage` tag key with any value
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.resourcegroups.*;
 * TagFilterProperty tagFilterProperty = TagFilterProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resourcegroups-group-tagfilter.html)
 */
@CdkDslMarker
public class CfnGroupTagFilterPropertyDsl {
    private val cdkBuilder: CfnGroup.TagFilterProperty.Builder =
        CfnGroup.TagFilterProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /**
     * @param key A string that defines a tag key. Only resources in the account that are tagged
     *   with a specified tag key are members of the tag-based resource group.
     *
     * This field is required when the `ResourceQuery` structure's `Type` property is
     * `TAG_FILTERS_1_0` . You must specify at least one tag key.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param values A list of tag values that can be included in the tag-based resource group. This
     *   is optional. If you don't specify a value or values for a key, then an AWS resource with
     *   any value for that key is a member.
     */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values A list of tag values that can be included in the tag-based resource group. This
     *   is optional. If you don't specify a value or values for a key, then an AWS resource with
     *   any value for that key is a member.
     */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnGroup.TagFilterProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
