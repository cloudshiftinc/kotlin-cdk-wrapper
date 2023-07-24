@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * A structure that represents a data cell filter with column-level, row-level, and/or cell-level
 * security.
 *
 * Data cell filters belong to a specific table in a Data Catalog . During a stack operation, AWS
 * CloudFormation calls the AWS Lake Formation `CreateDataCellsFilter` API operation to create a
 * `DataCellsFilter` resource, and calls the `DeleteDataCellsFilter` API operation to delete it.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * Object allRowsWildcard;
 * CfnDataCellsFilter cfnDataCellsFilter = CfnDataCellsFilter.Builder.create(this,
 * "MyCfnDataCellsFilter")
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
public class CfnDataCellsFilterDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnDataCellsFilter.Builder = CfnDataCellsFilter.Builder.create(scope, id)

    private val _columnNames: MutableList<String> = mutableListOf()

    /**
     * An array of UTF-8 strings.
     *
     * A list of column names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnnames)
     * @param columnNames An array of UTF-8 strings.
     */
    public fun columnNames(vararg columnNames: String) {
        _columnNames.addAll(listOf(*columnNames))
    }

    /**
     * An array of UTF-8 strings.
     *
     * A list of column names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnnames)
     * @param columnNames An array of UTF-8 strings.
     */
    public fun columnNames(columnNames: Collection<String>) {
        _columnNames.addAll(columnNames)
    }

    /**
     * A wildcard with exclusions.
     *
     * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnwildcard)
     * @param columnWildcard A wildcard with exclusions.
     */
    public fun columnWildcard(columnWildcard: IResolvable) {
        cdkBuilder.columnWildcard(columnWildcard)
    }

    /**
     * A wildcard with exclusions.
     *
     * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnwildcard)
     * @param columnWildcard A wildcard with exclusions.
     */
    public fun columnWildcard(columnWildcard: CfnDataCellsFilter.ColumnWildcardProperty) {
        cdkBuilder.columnWildcard(columnWildcard)
    }

    /**
     * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * A database in the Data Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-databasename)
     * @param databaseName UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /**
     * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The name given by the user to the data filter cell.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-name)
     * @param name UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * A PartiQL predicate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-rowfilter)
     * @param rowFilter A PartiQL predicate.
     */
    public fun rowFilter(rowFilter: IResolvable) {
        cdkBuilder.rowFilter(rowFilter)
    }

    /**
     * A PartiQL predicate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-rowfilter)
     * @param rowFilter A PartiQL predicate.
     */
    public fun rowFilter(rowFilter: CfnDataCellsFilter.RowFilterProperty) {
        cdkBuilder.rowFilter(rowFilter)
    }

    /**
     * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
   * string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The ID of the catalog to which the table belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-tablecatalogid)
     * @param tableCatalogId Catalog id string, not less than 1 or more than 255 bytes long, matching
     * the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     */
    public fun tableCatalogId(tableCatalogId: String) {
        cdkBuilder.tableCatalogId(tableCatalogId)
    }

    /**
     * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * A table in the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-tablename)
     * @param tableName UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun build(): CfnDataCellsFilter {
        if (_columnNames.isNotEmpty()) cdkBuilder.columnNames(_columnNames)
        return cdkBuilder.build()
    }
}
