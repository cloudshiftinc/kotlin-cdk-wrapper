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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * Dataset configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataSetConfigurationProperty dataSetConfigurationProperty =
 * DataSetConfigurationProperty.builder()
 * .columnGroupSchemaList(List.of(ColumnGroupSchemaProperty.builder()
 * .columnGroupColumnSchemaList(List.of(ColumnGroupColumnSchemaProperty.builder()
 * .name("name")
 * .build()))
 * .name("name")
 * .build()))
 * .dataSetSchema(DataSetSchemaProperty.builder()
 * .columnSchemaList(List.of(ColumnSchemaProperty.builder()
 * .dataType("dataType")
 * .geographicRole("geographicRole")
 * .name("name")
 * .build()))
 * .build())
 * .placeholder("placeholder")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-datasetconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateDataSetConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.DataSetConfigurationProperty.Builder =
        CfnTemplate.DataSetConfigurationProperty.builder()

    private val _columnGroupSchemaList: MutableList<Any> = mutableListOf()

    /** @param columnGroupSchemaList A structure containing the list of column group schemas. */
    public fun columnGroupSchemaList(vararg columnGroupSchemaList: Any) {
        _columnGroupSchemaList.addAll(listOf(*columnGroupSchemaList))
    }

    /** @param columnGroupSchemaList A structure containing the list of column group schemas. */
    public fun columnGroupSchemaList(columnGroupSchemaList: Collection<Any>) {
        _columnGroupSchemaList.addAll(columnGroupSchemaList)
    }

    /** @param columnGroupSchemaList A structure containing the list of column group schemas. */
    public fun columnGroupSchemaList(columnGroupSchemaList: IResolvable) {
        cdkBuilder.columnGroupSchemaList(columnGroupSchemaList)
    }

    /** @param dataSetSchema Dataset schema. */
    public fun dataSetSchema(dataSetSchema: IResolvable) {
        cdkBuilder.dataSetSchema(dataSetSchema)
    }

    /** @param dataSetSchema Dataset schema. */
    public fun dataSetSchema(dataSetSchema: CfnTemplate.DataSetSchemaProperty) {
        cdkBuilder.dataSetSchema(dataSetSchema)
    }

    /** @param placeholder Placeholder. */
    public fun placeholder(placeholder: String) {
        cdkBuilder.placeholder(placeholder)
    }

    public fun build(): CfnTemplate.DataSetConfigurationProperty {
        if (_columnGroupSchemaList.isNotEmpty())
            cdkBuilder.columnGroupSchemaList(_columnGroupSchemaList)
        return cdkBuilder.build()
    }
}
