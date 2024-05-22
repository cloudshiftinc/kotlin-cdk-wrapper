@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.lakeformation.*;
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
public open class CfnDataCellsFilter(
  cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataCellsFilterProps,
  ) :
      this(software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDataCellsFilterProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataCellsFilterProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDataCellsFilterProps(props)
  )

  /**
   * An array of UTF-8 strings.
   */
  public open fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

  /**
   * An array of UTF-8 strings.
   */
  public open fun columnNames(`value`: List<String>) {
    unwrap(this).setColumnNames(`value`)
  }

  /**
   * An array of UTF-8 strings.
   */
  public open fun columnNames(vararg `value`: String): Unit = columnNames(`value`.toList())

  /**
   * A wildcard with exclusions.
   */
  public open fun columnWildcard(): Any? = unwrap(this).getColumnWildcard()

  /**
   * A wildcard with exclusions.
   */
  public open fun columnWildcard(`value`: IResolvable) {
    unwrap(this).setColumnWildcard(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A wildcard with exclusions.
   */
  public open fun columnWildcard(`value`: ColumnWildcardProperty) {
    unwrap(this).setColumnWildcard(`value`.let(ColumnWildcardProperty.Companion::unwrap))
  }

  /**
   * A wildcard with exclusions.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7a6707b99fcb777c0e80f2ea7331b82c69af665821f311de54edad3b177b1d9")
  public open fun columnWildcard(`value`: ColumnWildcardProperty.Builder.() -> Unit): Unit =
      columnWildcard(ColumnWildcardProperty(`value`))

  /**
   * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun databaseName(): String = unwrap(this).getDatabaseName()

  /**
   * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun databaseName(`value`: String) {
    unwrap(this).setDatabaseName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A PartiQL predicate.
   */
  public open fun rowFilter(): Any? = unwrap(this).getRowFilter()

  /**
   * A PartiQL predicate.
   */
  public open fun rowFilter(`value`: IResolvable) {
    unwrap(this).setRowFilter(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A PartiQL predicate.
   */
  public open fun rowFilter(`value`: RowFilterProperty) {
    unwrap(this).setRowFilter(`value`.let(RowFilterProperty.Companion::unwrap))
  }

  /**
   * A PartiQL predicate.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bf0bfdd8084d2b3f16564afba1bbbdf7eb63cadfd7a71253ae20c995bf5f5736")
  public open fun rowFilter(`value`: RowFilterProperty.Builder.() -> Unit): Unit =
      rowFilter(RowFilterProperty(`value`))

  /**
   * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
   * string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun tableCatalogId(): String = unwrap(this).getTableCatalogId()

  /**
   * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
   * string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun tableCatalogId(`value`: String) {
    unwrap(this).setTableCatalogId(`value`)
  }

  /**
   * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun tableName(): String = unwrap(this).getTableName()

  /**
   * UTF-8 string, not less than 1 or more than 255 bytes long, matching the [single-line string
   * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
   * .
   */
  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lakeformation.CfnDataCellsFilter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An array of UTF-8 strings.
     *
     * A list of column names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnnames)
     * @param columnNames An array of UTF-8 strings. 
     */
    public fun columnNames(columnNames: List<String>)

    /**
     * An array of UTF-8 strings.
     *
     * A list of column names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnnames)
     * @param columnNames An array of UTF-8 strings. 
     */
    public fun columnNames(vararg columnNames: String)

    /**
     * A wildcard with exclusions.
     *
     * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnwildcard)
     * @param columnWildcard A wildcard with exclusions. 
     */
    public fun columnWildcard(columnWildcard: IResolvable)

    /**
     * A wildcard with exclusions.
     *
     * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnwildcard)
     * @param columnWildcard A wildcard with exclusions. 
     */
    public fun columnWildcard(columnWildcard: ColumnWildcardProperty)

    /**
     * A wildcard with exclusions.
     *
     * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnwildcard)
     * @param columnWildcard A wildcard with exclusions. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a782abca87786545ff85c73d56e1b48a708a17e905a6bad6c589ca7e46f27dd")
    public fun columnWildcard(columnWildcard: ColumnWildcardProperty.Builder.() -> Unit)

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
    public fun databaseName(databaseName: String)

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
    public fun name(name: String)

    /**
     * A PartiQL predicate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-rowfilter)
     * @param rowFilter A PartiQL predicate. 
     */
    public fun rowFilter(rowFilter: IResolvable)

    /**
     * A PartiQL predicate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-rowfilter)
     * @param rowFilter A PartiQL predicate. 
     */
    public fun rowFilter(rowFilter: RowFilterProperty)

    /**
     * A PartiQL predicate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-rowfilter)
     * @param rowFilter A PartiQL predicate. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b8aec745d029dd5db34cc689594c3964031cc29463514afc0d2913022b0dc17")
    public fun rowFilter(rowFilter: RowFilterProperty.Builder.() -> Unit)

    /**
     * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
     * string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The ID of the catalog to which the table belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-tablecatalogid)
     * @param tableCatalogId Catalog id string, not less than 1 or more than 255 bytes long,
     * matching the [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     */
    public fun tableCatalogId(tableCatalogId: String)

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
    public fun tableName(tableName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.Builder
        = software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.Builder.create(scope, id)

    /**
     * An array of UTF-8 strings.
     *
     * A list of column names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnnames)
     * @param columnNames An array of UTF-8 strings. 
     */
    override fun columnNames(columnNames: List<String>) {
      cdkBuilder.columnNames(columnNames)
    }

    /**
     * An array of UTF-8 strings.
     *
     * A list of column names.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnnames)
     * @param columnNames An array of UTF-8 strings. 
     */
    override fun columnNames(vararg columnNames: String): Unit = columnNames(columnNames.toList())

    /**
     * A wildcard with exclusions.
     *
     * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnwildcard)
     * @param columnWildcard A wildcard with exclusions. 
     */
    override fun columnWildcard(columnWildcard: IResolvable) {
      cdkBuilder.columnWildcard(columnWildcard.let(IResolvable.Companion::unwrap))
    }

    /**
     * A wildcard with exclusions.
     *
     * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnwildcard)
     * @param columnWildcard A wildcard with exclusions. 
     */
    override fun columnWildcard(columnWildcard: ColumnWildcardProperty) {
      cdkBuilder.columnWildcard(columnWildcard.let(ColumnWildcardProperty.Companion::unwrap))
    }

    /**
     * A wildcard with exclusions.
     *
     * You must specify either a `ColumnNames` list or the `ColumnWildCard` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-columnwildcard)
     * @param columnWildcard A wildcard with exclusions. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a782abca87786545ff85c73d56e1b48a708a17e905a6bad6c589ca7e46f27dd")
    override fun columnWildcard(columnWildcard: ColumnWildcardProperty.Builder.() -> Unit): Unit =
        columnWildcard(ColumnWildcardProperty(columnWildcard))

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
    override fun databaseName(databaseName: String) {
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
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A PartiQL predicate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-rowfilter)
     * @param rowFilter A PartiQL predicate. 
     */
    override fun rowFilter(rowFilter: IResolvable) {
      cdkBuilder.rowFilter(rowFilter.let(IResolvable.Companion::unwrap))
    }

    /**
     * A PartiQL predicate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-rowfilter)
     * @param rowFilter A PartiQL predicate. 
     */
    override fun rowFilter(rowFilter: RowFilterProperty) {
      cdkBuilder.rowFilter(rowFilter.let(RowFilterProperty.Companion::unwrap))
    }

    /**
     * A PartiQL predicate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-rowfilter)
     * @param rowFilter A PartiQL predicate. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b8aec745d029dd5db34cc689594c3964031cc29463514afc0d2913022b0dc17")
    override fun rowFilter(rowFilter: RowFilterProperty.Builder.() -> Unit): Unit =
        rowFilter(RowFilterProperty(rowFilter))

    /**
     * Catalog id string, not less than 1 or more than 255 bytes long, matching the [single-line
     * string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * .
     *
     * The ID of the catalog to which the table belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-datacellsfilter.html#cfn-lakeformation-datacellsfilter-tablecatalogid)
     * @param tableCatalogId Catalog id string, not less than 1 or more than 255 bytes long,
     * matching the [single-line string
     * pattern](https://docs.aws.amazon.com/lake-formation/latest/dg/aws-lake-formation-api-aws-lake-formation-api-common.html)
     * . 
     */
    override fun tableCatalogId(tableCatalogId: String) {
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
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataCellsFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataCellsFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter):
        CfnDataCellsFilter = CfnDataCellsFilter(cdkObject)

    internal fun unwrap(wrapped: CfnDataCellsFilter):
        software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter = wrapped.cdkObject as
        software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter
  }

  /**
   * A wildcard object, consisting of an optional list of excluded column names or indexes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * ColumnWildcardProperty columnWildcardProperty = ColumnWildcardProperty.builder()
   * .excludedColumnNames(List.of("excludedColumnNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datacellsfilter-columnwildcard.html)
   */
  public interface ColumnWildcardProperty {
    /**
     * Excludes column names.
     *
     * Any column with this name will be excluded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datacellsfilter-columnwildcard.html#cfn-lakeformation-datacellsfilter-columnwildcard-excludedcolumnnames)
     */
    public fun excludedColumnNames(): List<String> = unwrap(this).getExcludedColumnNames() ?:
        emptyList()

    /**
     * A builder for [ColumnWildcardProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param excludedColumnNames Excludes column names.
       * Any column with this name will be excluded.
       */
      public fun excludedColumnNames(excludedColumnNames: List<String>)

      /**
       * @param excludedColumnNames Excludes column names.
       * Any column with this name will be excluded.
       */
      public fun excludedColumnNames(vararg excludedColumnNames: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.ColumnWildcardProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.ColumnWildcardProperty.builder()

      /**
       * @param excludedColumnNames Excludes column names.
       * Any column with this name will be excluded.
       */
      override fun excludedColumnNames(excludedColumnNames: List<String>) {
        cdkBuilder.excludedColumnNames(excludedColumnNames)
      }

      /**
       * @param excludedColumnNames Excludes column names.
       * Any column with this name will be excluded.
       */
      override fun excludedColumnNames(vararg excludedColumnNames: String): Unit =
          excludedColumnNames(excludedColumnNames.toList())

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.ColumnWildcardProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.ColumnWildcardProperty,
    ) : CdkObject(cdkObject), ColumnWildcardProperty {
      /**
       * Excludes column names.
       *
       * Any column with this name will be excluded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datacellsfilter-columnwildcard.html#cfn-lakeformation-datacellsfilter-columnwildcard-excludedcolumnnames)
       */
      override fun excludedColumnNames(): List<String> = unwrap(this).getExcludedColumnNames() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnWildcardProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.ColumnWildcardProperty):
          ColumnWildcardProperty = CdkObjectWrappers.wrap(cdkObject) as? ColumnWildcardProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnWildcardProperty):
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.ColumnWildcardProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.ColumnWildcardProperty
    }
  }

  /**
   * A PartiQL predicate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * Object allRowsWildcard;
   * RowFilterProperty rowFilterProperty = RowFilterProperty.builder()
   * .allRowsWildcard(allRowsWildcard)
   * .filterExpression("filterExpression")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datacellsfilter-rowfilter.html)
   */
  public interface RowFilterProperty {
    /**
     * A wildcard for all rows.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datacellsfilter-rowfilter.html#cfn-lakeformation-datacellsfilter-rowfilter-allrowswildcard)
     */
    public fun allRowsWildcard(): Any? = unwrap(this).getAllRowsWildcard()

    /**
     * A filter expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datacellsfilter-rowfilter.html#cfn-lakeformation-datacellsfilter-rowfilter-filterexpression)
     */
    public fun filterExpression(): String? = unwrap(this).getFilterExpression()

    /**
     * A builder for [RowFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allRowsWildcard A wildcard for all rows.
       */
      public fun allRowsWildcard(allRowsWildcard: Any)

      /**
       * @param filterExpression A filter expression.
       */
      public fun filterExpression(filterExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.RowFilterProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.RowFilterProperty.builder()

      /**
       * @param allRowsWildcard A wildcard for all rows.
       */
      override fun allRowsWildcard(allRowsWildcard: Any) {
        cdkBuilder.allRowsWildcard(allRowsWildcard)
      }

      /**
       * @param filterExpression A filter expression.
       */
      override fun filterExpression(filterExpression: String) {
        cdkBuilder.filterExpression(filterExpression)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.RowFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.RowFilterProperty,
    ) : CdkObject(cdkObject), RowFilterProperty {
      /**
       * A wildcard for all rows.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datacellsfilter-rowfilter.html#cfn-lakeformation-datacellsfilter-rowfilter-allrowswildcard)
       */
      override fun allRowsWildcard(): Any? = unwrap(this).getAllRowsWildcard()

      /**
       * A filter expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datacellsfilter-rowfilter.html#cfn-lakeformation-datacellsfilter-rowfilter-filterexpression)
       */
      override fun filterExpression(): String? = unwrap(this).getFilterExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RowFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.RowFilterProperty):
          RowFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? RowFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RowFilterProperty):
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.RowFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnDataCellsFilter.RowFilterProperty
    }
  }
}
