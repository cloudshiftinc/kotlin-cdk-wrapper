@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataCellsFilter`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lakeformation.*;
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
public interface CfnDataCellsFilterProps {
  /**
   * An array of UTF-8 strings.
   *
   * A list of column names.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnnames)
   */
  public fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

  /**
   * A wildcard with exclusions.
   *
   * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnwildcard)
   */
  public fun columnWildcard(): Any? = unwrap(this).getColumnWildcard()

  /**
   * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   *
   * A database in the Data Catalog .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-databasename)
   */
  public fun databaseName(): String

  /**
   * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   *
   * The name given by the user to the data filter cell.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-name)
   */
  public fun name(): String

  /**
   * A PartiQL predicate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-rowfilter)
   */
  public fun rowFilter(): Any? = unwrap(this).getRowFilter()

  /**
   * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
   * string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   *
   * The ID of the catalog to which the table belongs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-tablecatalogid)
   */
  public fun tableCatalogId(): String

  /**
   * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   *
   * A table in the database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-tablename)
   */
  public fun tableName(): String

  /**
   * A builder for [CfnDataCellsFilterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param columnNames An array of UTF-8 strings.
     * A list of column names.
     */
    public fun columnNames(columnNames: List<String>)

    /**
     * @param columnNames An array of UTF-8 strings.
     * A list of column names.
     */
    public fun columnNames(vararg columnNames: String)

    /**
     * @param columnWildcard A wildcard with exclusions.
     * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
     */
    public fun columnWildcard(columnWildcard: IResolvable)

    /**
     * @param columnWildcard A wildcard with exclusions.
     * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
     */
    public fun columnWildcard(columnWildcard: CfnDataCellsFilter.ColumnWildcardProperty)

    /**
     * @param columnWildcard A wildcard with exclusions.
     * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f493fb4633630bef8ff55c00d186076733406fe36738bc91425129e66c789b05")
    public
        fun columnWildcard(columnWildcard: CfnDataCellsFilter.ColumnWildcardProperty.Builder.() -> Unit)

    /**
     * @param databaseName UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     * A database in the Data Catalog .
     */
    public fun databaseName(databaseName: String)

    /**
     * @param name UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     * The name given by the user to the data filter cell.
     */
    public fun name(name: String)

    /**
     * @param rowFilter A PartiQL predicate.
     */
    public fun rowFilter(rowFilter: IResolvable)

    /**
     * @param rowFilter A PartiQL predicate.
     */
    public fun rowFilter(rowFilter: CfnDataCellsFilter.RowFilterProperty)

    /**
     * @param rowFilter A PartiQL predicate.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adaca17dde5756c3fe017a23bde3fb1e4968dc6cd2d4984e64813e2ff470aeff")
    public fun rowFilter(rowFilter: CfnDataCellsFilter.RowFilterProperty.Builder.() -> Unit)

    /**
     * @param tableCatalogId Catalog id string, not less than 1 or more than 255 bytes long,
     * matching the [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     * The ID of the catalog to which the table belongs.
     */
    public fun tableCatalogId(tableCatalogId: String)

    /**
     * @param tableName UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     * A table in the database.
     */
    public fun tableName(tableName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps.Builder =
        software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps.builder()

    /**
     * @param columnNames An array of UTF-8 strings.
     * A list of column names.
     */
    override fun columnNames(columnNames: List<String>) {
      cdkBuilder.columnNames(columnNames)
    }

    /**
     * @param columnNames An array of UTF-8 strings.
     * A list of column names.
     */
    override fun columnNames(vararg columnNames: String): Unit = columnNames(columnNames.toList())

    /**
     * @param columnWildcard A wildcard with exclusions.
     * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
     */
    override fun columnWildcard(columnWildcard: IResolvable) {
      cdkBuilder.columnWildcard(columnWildcard.let(IResolvable::unwrap))
    }

    /**
     * @param columnWildcard A wildcard with exclusions.
     * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
     */
    override fun columnWildcard(columnWildcard: CfnDataCellsFilter.ColumnWildcardProperty) {
      cdkBuilder.columnWildcard(columnWildcard.let(CfnDataCellsFilter.ColumnWildcardProperty::unwrap))
    }

    /**
     * @param columnWildcard A wildcard with exclusions.
     * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f493fb4633630bef8ff55c00d186076733406fe36738bc91425129e66c789b05")
    override
        fun columnWildcard(columnWildcard: CfnDataCellsFilter.ColumnWildcardProperty.Builder.() -> Unit):
        Unit = columnWildcard(CfnDataCellsFilter.ColumnWildcardProperty(columnWildcard))

    /**
     * @param databaseName UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     * A database in the Data Catalog .
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param name UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     * The name given by the user to the data filter cell.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param rowFilter A PartiQL predicate.
     */
    override fun rowFilter(rowFilter: IResolvable) {
      cdkBuilder.rowFilter(rowFilter.let(IResolvable::unwrap))
    }

    /**
     * @param rowFilter A PartiQL predicate.
     */
    override fun rowFilter(rowFilter: CfnDataCellsFilter.RowFilterProperty) {
      cdkBuilder.rowFilter(rowFilter.let(CfnDataCellsFilter.RowFilterProperty::unwrap))
    }

    /**
     * @param rowFilter A PartiQL predicate.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adaca17dde5756c3fe017a23bde3fb1e4968dc6cd2d4984e64813e2ff470aeff")
    override fun rowFilter(rowFilter: CfnDataCellsFilter.RowFilterProperty.Builder.() -> Unit): Unit
        = rowFilter(CfnDataCellsFilter.RowFilterProperty(rowFilter))

    /**
     * @param tableCatalogId Catalog id string, not less than 1 or more than 255 bytes long,
     * matching the [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     * The ID of the catalog to which the table belongs.
     */
    override fun tableCatalogId(tableCatalogId: String) {
      cdkBuilder.tableCatalogId(tableCatalogId)
    }

    /**
     * @param tableName UTF-8 string, not less than 1 or more than 255 bytes long, matching the
     * [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     * A table in the database.
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps,
  ) : CdkObject(cdkObject), CfnDataCellsFilterProps {
    /**
     * An array of UTF-8 strings.
     *
     * A list of column names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnnames)
     */
    override fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

    /**
     * A wildcard with exclusions.
     *
     * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnwildcard)
     */
    override fun columnWildcard(): Any? = unwrap(this).getColumnWildcard()

    /**
     * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * A database in the Data Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-databasename)
     */
    override fun databaseName(): String = unwrap(this).getDatabaseName()

    /**
     * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The name given by the user to the data filter cell.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A PartiQL predicate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-rowfilter)
     */
    override fun rowFilter(): Any? = unwrap(this).getRowFilter()

    /**
     * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
     * string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The ID of the catalog to which the table belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-tablecatalogid)
     */
    override fun tableCatalogId(): String = unwrap(this).getTableCatalogId()

    /**
     * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * A table in the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-tablename)
     */
    override fun tableName(): String = unwrap(this).getTableName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataCellsFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps):
        CfnDataCellsFilterProps = CdkObjectWrappers.wrap(cdkObject) as CfnDataCellsFilterProps

    internal fun unwrap(wrapped: CfnDataCellsFilterProps):
        software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lakeformation.CfnDataCellsFilterProps
  }
}
