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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dynamodb.CfnTable

/**
 * Represents attributes that are copied (projected) from the table into an index.
 *
 * These are in addition to the primary key attributes and index key attributes, which are
 * automatically projected.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * ProjectionProperty projectionProperty = ProjectionProperty.builder()
 * .nonKeyAttributes(List.of("nonKeyAttributes"))
 * .projectionType("projectionType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dynamodb-table-projection.html)
 */
@CdkDslMarker
public class CfnTableProjectionPropertyDsl {
    private val cdkBuilder: CfnTable.ProjectionProperty.Builder =
        CfnTable.ProjectionProperty.builder()

    private val _nonKeyAttributes: MutableList<String> = mutableListOf()

    /**
     * @param nonKeyAttributes Represents the non-key attribute names which will be projected into
     *   the index. For local secondary indexes, the total count of `NonKeyAttributes` summed across
     *   all of the local secondary indexes, must not exceed 100. If you project the same attribute
     *   into two different indexes, this counts as two distinct attributes when determining the
     *   total.
     */
    public fun nonKeyAttributes(vararg nonKeyAttributes: String) {
        _nonKeyAttributes.addAll(listOf(*nonKeyAttributes))
    }

    /**
     * @param nonKeyAttributes Represents the non-key attribute names which will be projected into
     *   the index. For local secondary indexes, the total count of `NonKeyAttributes` summed across
     *   all of the local secondary indexes, must not exceed 100. If you project the same attribute
     *   into two different indexes, this counts as two distinct attributes when determining the
     *   total.
     */
    public fun nonKeyAttributes(nonKeyAttributes: Collection<String>) {
        _nonKeyAttributes.addAll(nonKeyAttributes)
    }

    /**
     * @param projectionType The set of attributes that are projected into the index:.
     * * `KEYS_ONLY` - Only the index and primary keys are projected into the index.
     * * `INCLUDE` - In addition to the attributes described in `KEYS_ONLY` , the secondary index
     *   will include other non-key attributes that you specify.
     * * `ALL` - All of the table attributes are projected into the index.
     */
    public fun projectionType(projectionType: String) {
        cdkBuilder.projectionType(projectionType)
    }

    public fun build(): CfnTable.ProjectionProperty {
        if (_nonKeyAttributes.isNotEmpty()) cdkBuilder.nonKeyAttributes(_nonKeyAttributes)
        return cdkBuilder.build()
    }
}
