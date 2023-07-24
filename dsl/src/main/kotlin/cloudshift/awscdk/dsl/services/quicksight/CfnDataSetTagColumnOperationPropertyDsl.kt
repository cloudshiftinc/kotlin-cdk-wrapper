@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * A transform operation that tags a column with additional information.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TagColumnOperationProperty tagColumnOperationProperty = TagColumnOperationProperty.builder()
 * .columnName("columnName")
 * .tags(List.of(ColumnTagProperty.builder()
 * .columnDescription(ColumnDescriptionProperty.builder()
 * .text("text")
 * .build())
 * .columnGeographicRole("columnGeographicRole")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-tagcolumnoperation.html)
 */
@CdkDslMarker
public class CfnDataSetTagColumnOperationPropertyDsl {
    private val cdkBuilder: CfnDataSet.TagColumnOperationProperty.Builder =
        CfnDataSet.TagColumnOperationProperty.builder()

    private val _tags: MutableList<CfnDataSet.ColumnTagProperty> = mutableListOf()

    /**
     * @param columnName The column that this operation acts on.
     */
    public fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
    }

    /**
     * @param tags The dataset column tag, currently only used for geospatial type tagging.
     *
     * This is not tags for the AWS tagging feature.
     */
    public fun tags(tags: CfnDataSetColumnTagPropertyDsl.() -> Unit) {
        _tags.add(CfnDataSetColumnTagPropertyDsl().apply(tags).build())
    }

    /**
     * @param tags The dataset column tag, currently only used for geospatial type tagging.
     *
     * This is not tags for the AWS tagging feature.
     */
    public fun tags(tags: Collection<CfnDataSet.ColumnTagProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDataSet.TagColumnOperationProperty {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
