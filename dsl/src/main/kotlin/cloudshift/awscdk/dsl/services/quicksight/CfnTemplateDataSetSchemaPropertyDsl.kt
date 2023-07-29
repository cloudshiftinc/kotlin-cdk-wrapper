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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * Dataset schema.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataSetSchemaProperty dataSetSchemaProperty = DataSetSchemaProperty.builder()
 * .columnSchemaList(List.of(ColumnSchemaProperty.builder()
 * .dataType("dataType")
 * .geographicRole("geographicRole")
 * .name("name")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-datasetschema.html)
 */
@CdkDslMarker
public class CfnTemplateDataSetSchemaPropertyDsl {
    private val cdkBuilder: CfnTemplate.DataSetSchemaProperty.Builder =
        CfnTemplate.DataSetSchemaProperty.builder()

    private val _columnSchemaList: MutableList<Any> = mutableListOf()

    /** @param columnSchemaList A structure containing the list of column schemas. */
    public fun columnSchemaList(vararg columnSchemaList: Any) {
        _columnSchemaList.addAll(listOf(*columnSchemaList))
    }

    /** @param columnSchemaList A structure containing the list of column schemas. */
    public fun columnSchemaList(columnSchemaList: Collection<Any>) {
        _columnSchemaList.addAll(columnSchemaList)
    }

    /** @param columnSchemaList A structure containing the list of column schemas. */
    public fun columnSchemaList(columnSchemaList: IResolvable) {
        cdkBuilder.columnSchemaList(columnSchemaList)
    }

    public fun build(): CfnTemplate.DataSetSchemaProperty {
        if (_columnSchemaList.isNotEmpty()) cdkBuilder.columnSchemaList(_columnSchemaList)
        return cdkBuilder.build()
    }
}
