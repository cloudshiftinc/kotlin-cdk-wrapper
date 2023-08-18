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

package io.cloudshiftdev.awscdkdsl.services.lakeformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter
import software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps

/**
 * Properties for defining a `CfnDataCellsFilter`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * Object allRowsWildcard;
 * CfnDataCellsFilterProps cfnDataCellsFilterProps = CfnDataCellsFilterProps.builder()
 * .databaseName("databaseName")
 * .name("name")
 * .tableCatalogId("tableCatalogId")
 * .tableName("tableName")
 * // the properties below are optional
 * .columnNames(List.of("columnNames"))
 * .columnWildcard(ColumnWildcardProperty.builder()
 * .excludedColumnNames(List.of("excludedColumnNames"))
 * .build())
 * .rowFilter(RowFilterProperty.builder()
 * .allRowsWildcard(allRowsWildcard)
 * .filterExpression("filterExpression")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html)
 */
@CdkDslMarker
public class CfnDataCellsFilterPropsDsl {
    private val cdkBuilder: CfnDataCellsFilterProps.Builder = CfnDataCellsFilterProps.builder()

    private val _columnNames: MutableList<String> = mutableListOf()

    /** @param columnNames An array of UTF-8 strings. A list of column names. */
    public fun columnNames(vararg columnNames: String) {
        _columnNames.addAll(listOf(*columnNames))
    }

    /** @param columnNames An array of UTF-8 strings. A list of column names. */
    public fun columnNames(columnNames: Collection<String>) {
        _columnNames.addAll(columnNames)
    }

    /**
     * @param columnWildcard A wildcard with exclusions. You must specify either a `ColumnNames`
     *   list or the `ColumnWildCard` .
     */
    public fun columnWildcard(columnWildcard: IResolvable) {
        cdkBuilder.columnWildcard(columnWildcard)
    }

    /**
     * @param columnWildcard A wildcard with exclusions. You must specify either a `ColumnNames`
     *   list or the `ColumnWildCard` .
     */
    public fun columnWildcard(columnWildcard: CfnDataCellsFilter.ColumnWildcardProperty) {
        cdkBuilder.columnWildcard(columnWildcard)
    }

    /**
     * @param databaseName UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     *   [single-line string pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     *   . A database in the Data Catalog .
     */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param name UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     *   [single-line string pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     *   . The name given by the user to the data filter cell.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param rowFilter A PartiQL predicate. */
    public fun rowFilter(rowFilter: IResolvable) {
        cdkBuilder.rowFilter(rowFilter)
    }

    /** @param rowFilter A PartiQL predicate. */
    public fun rowFilter(rowFilter: CfnDataCellsFilter.RowFilterProperty) {
        cdkBuilder.rowFilter(rowFilter)
    }

    /**
     * @param tableCatalogId Catalog id string, not less than 1 or more than 255 bytes long,
     *   matching the
     *   [single-line string pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     *   . The ID of the catalog to which the table belongs.
     */
    public fun tableCatalogId(tableCatalogId: String) {
        cdkBuilder.tableCatalogId(tableCatalogId)
    }

    /**
     * @param tableName UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     *   [single-line string pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     *   . A table in the database.
     */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun build(): CfnDataCellsFilterProps {
        if (_columnNames.isNotEmpty()) cdkBuilder.columnNames(_columnNames)
        return cdkBuilder.build()
    }
}
