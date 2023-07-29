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
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * A physical table type for relational data sources.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RelationalTableProperty relationalTableProperty = RelationalTableProperty.builder()
 * .dataSourceArn("dataSourceArn")
 * .inputColumns(List.of(InputColumnProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .catalog("catalog")
 * .schema("schema")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-relationaltable.html)
 */
@CdkDslMarker
public class CfnDataSetRelationalTablePropertyDsl {
    private val cdkBuilder: CfnDataSet.RelationalTableProperty.Builder =
        CfnDataSet.RelationalTableProperty.builder()

    private val _inputColumns: MutableList<Any> = mutableListOf()

    /** @param catalog The catalog associated with a table.</p>. */
    public fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
    }

    /** @param dataSourceArn The Amazon Resource Name (ARN) for the data source. */
    public fun dataSourceArn(dataSourceArn: String) {
        cdkBuilder.dataSourceArn(dataSourceArn)
    }

    /** @param inputColumns The column schema of the table. */
    public fun inputColumns(vararg inputColumns: Any) {
        _inputColumns.addAll(listOf(*inputColumns))
    }

    /** @param inputColumns The column schema of the table. */
    public fun inputColumns(inputColumns: Collection<Any>) {
        _inputColumns.addAll(inputColumns)
    }

    /** @param inputColumns The column schema of the table. */
    public fun inputColumns(inputColumns: IResolvable) {
        cdkBuilder.inputColumns(inputColumns)
    }

    /** @param name The name of the relational table. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param schema The schema name. This name applies to certain relational database engines. */
    public fun schema(schema: String) {
        cdkBuilder.schema(schema)
    }

    public fun build(): CfnDataSet.RelationalTableProperty {
        if (_inputColumns.isNotEmpty()) cdkBuilder.inputColumns(_inputColumns)
        return cdkBuilder.build()
    }
}
