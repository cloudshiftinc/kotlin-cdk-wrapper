@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Glue::Table` resource specifies tabular data in the AWS Glue data catalog.
 *
 * For more information, see [Defining Tables in the AWS Glue Data
 * Catalog](https://docs.aws.amazon.com/glue/latest/dg/tables-described.html) and [Table
 * Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-tables.html#aws-glue-api-catalog-tables-Table)
 * in the *AWS Glue Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * Object parameters;
 * Object skewedColumnValueLocationMaps;
 * CfnTable cfnTable = CfnTable.Builder.create(this, "MyCfnTable")
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .tableInput(TableInputProperty.builder()
 * .description("description")
 * .name("name")
 * .owner("owner")
 * .parameters(parameters)
 * .partitionKeys(List.of(ColumnProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .type("type")
 * .build()))
 * .retention(123)
 * .storageDescriptor(StorageDescriptorProperty.builder()
 * .bucketColumns(List.of("bucketColumns"))
 * .columns(List.of(ColumnProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .type("type")
 * .build()))
 * .compressed(false)
 * .inputFormat("inputFormat")
 * .location("location")
 * .numberOfBuckets(123)
 * .outputFormat("outputFormat")
 * .parameters(parameters)
 * .schemaReference(SchemaReferenceProperty.builder()
 * .schemaId(SchemaIdProperty.builder()
 * .registryName("registryName")
 * .schemaArn("schemaArn")
 * .schemaName("schemaName")
 * .build())
 * .schemaVersionId("schemaVersionId")
 * .schemaVersionNumber(123)
 * .build())
 * .serdeInfo(SerdeInfoProperty.builder()
 * .name("name")
 * .parameters(parameters)
 * .serializationLibrary("serializationLibrary")
 * .build())
 * .skewedInfo(SkewedInfoProperty.builder()
 * .skewedColumnNames(List.of("skewedColumnNames"))
 * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
 * .skewedColumnValues(List.of("skewedColumnValues"))
 * .build())
 * .sortColumns(List.of(OrderProperty.builder()
 * .column("column")
 * .sortOrder(123)
 * .build()))
 * .storedAsSubDirectories(false)
 * .build())
 * .tableType("tableType")
 * .targetTable(TableIdentifierProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .name("name")
 * .region("region")
 * .build())
 * .viewExpandedText("viewExpandedText")
 * .viewOriginalText("viewOriginalText")
 * .build())
 * // the properties below are optional
 * .openTableFormatInput(OpenTableFormatInputProperty.builder()
 * .icebergInput(IcebergInputProperty.builder()
 * .metadataOperation("metadataOperation")
 * .version("version")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html)
 */
public open class CfnTable internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.glue.CfnTable,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTableProps,
  ) :
      this(software.amazon.awscdk.services.glue.CfnTable(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTableProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTableProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTableProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ID of the Data Catalog in which to create the `Table` .
   */
  public open fun catalogId(): String = unwrap(this).getCatalogId()

  /**
   * The ID of the Data Catalog in which to create the `Table` .
   */
  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
  }

  /**
   * The name of the database where the table metadata resides.
   */
  public open fun databaseName(): String = unwrap(this).getDatabaseName()

  /**
   * The name of the database where the table metadata resides.
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies an `OpenTableFormatInput` structure when creating an open format table.
   */
  public open fun openTableFormatInput(): Any? = unwrap(this).getOpenTableFormatInput()

  /**
   * Specifies an `OpenTableFormatInput` structure when creating an open format table.
   */
  public open fun openTableFormatInput(`value`: IResolvable) {
    unwrap(this).setOpenTableFormatInput(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies an `OpenTableFormatInput` structure when creating an open format table.
   */
  public open fun openTableFormatInput(`value`: OpenTableFormatInputProperty) {
    unwrap(this).setOpenTableFormatInput(`value`.let(OpenTableFormatInputProperty::unwrap))
  }

  /**
   * Specifies an `OpenTableFormatInput` structure when creating an open format table.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11fe2e18d5fffdbe6cf5bc00b869ce67bcf18389a9143b5c0b0ba9f0e3e62676")
  public open fun openTableFormatInput(`value`: OpenTableFormatInputProperty.Builder.() -> Unit):
      Unit = openTableFormatInput(OpenTableFormatInputProperty(`value`))

  /**
   * A structure used to define a table.
   */
  public open fun tableInput(): Any = unwrap(this).getTableInput()

  /**
   * A structure used to define a table.
   */
  public open fun tableInput(`value`: IResolvable) {
    unwrap(this).setTableInput(`value`.let(IResolvable::unwrap))
  }

  /**
   * A structure used to define a table.
   */
  public open fun tableInput(`value`: TableInputProperty) {
    unwrap(this).setTableInput(`value`.let(TableInputProperty::unwrap))
  }

  /**
   * A structure used to define a table.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3e638cb9c322af54329f162e9be8bb6388f3779d8aeb6a2d7a6a9645cf7822ab")
  public open fun tableInput(`value`: TableInputProperty.Builder.() -> Unit): Unit =
      tableInput(TableInputProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnTable].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the Data Catalog in which to create the `Table` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-catalogid)
     * @param catalogId The ID of the Data Catalog in which to create the `Table` . 
     */
    public fun catalogId(catalogId: String)

    /**
     * The name of the database where the table metadata resides.
     *
     * For Hive compatibility, this must be all lowercase.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-databasename)
     * @param databaseName The name of the database where the table metadata resides. 
     */
    public fun databaseName(databaseName: String)

    /**
     * Specifies an `OpenTableFormatInput` structure when creating an open format table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-opentableformatinput)
     * @param openTableFormatInput Specifies an `OpenTableFormatInput` structure when creating an
     * open format table. 
     */
    public fun openTableFormatInput(openTableFormatInput: IResolvable)

    /**
     * Specifies an `OpenTableFormatInput` structure when creating an open format table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-opentableformatinput)
     * @param openTableFormatInput Specifies an `OpenTableFormatInput` structure when creating an
     * open format table. 
     */
    public fun openTableFormatInput(openTableFormatInput: OpenTableFormatInputProperty)

    /**
     * Specifies an `OpenTableFormatInput` structure when creating an open format table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-opentableformatinput)
     * @param openTableFormatInput Specifies an `OpenTableFormatInput` structure when creating an
     * open format table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8a1ce0206fa476f9741b875788859f70d5a35a996dc5005de444f861511e06d")
    public
        fun openTableFormatInput(openTableFormatInput: OpenTableFormatInputProperty.Builder.() -> Unit)

    /**
     * A structure used to define a table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-tableinput)
     * @param tableInput A structure used to define a table. 
     */
    public fun tableInput(tableInput: IResolvable)

    /**
     * A structure used to define a table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-tableinput)
     * @param tableInput A structure used to define a table. 
     */
    public fun tableInput(tableInput: TableInputProperty)

    /**
     * A structure used to define a table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-tableinput)
     * @param tableInput A structure used to define a table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e4d6f4a371dc83ceaf52f80f085408dbc5ced0bf91865c754ab74ee3ace17d1")
    public fun tableInput(tableInput: TableInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTable.Builder =
        software.amazon.awscdk.services.glue.CfnTable.Builder.create(scope, id)

    /**
     * The ID of the Data Catalog in which to create the `Table` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-catalogid)
     * @param catalogId The ID of the Data Catalog in which to create the `Table` . 
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * The name of the database where the table metadata resides.
     *
     * For Hive compatibility, this must be all lowercase.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-databasename)
     * @param databaseName The name of the database where the table metadata resides. 
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * Specifies an `OpenTableFormatInput` structure when creating an open format table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-opentableformatinput)
     * @param openTableFormatInput Specifies an `OpenTableFormatInput` structure when creating an
     * open format table. 
     */
    override fun openTableFormatInput(openTableFormatInput: IResolvable) {
      cdkBuilder.openTableFormatInput(openTableFormatInput.let(IResolvable::unwrap))
    }

    /**
     * Specifies an `OpenTableFormatInput` structure when creating an open format table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-opentableformatinput)
     * @param openTableFormatInput Specifies an `OpenTableFormatInput` structure when creating an
     * open format table. 
     */
    override fun openTableFormatInput(openTableFormatInput: OpenTableFormatInputProperty) {
      cdkBuilder.openTableFormatInput(openTableFormatInput.let(OpenTableFormatInputProperty::unwrap))
    }

    /**
     * Specifies an `OpenTableFormatInput` structure when creating an open format table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-opentableformatinput)
     * @param openTableFormatInput Specifies an `OpenTableFormatInput` structure when creating an
     * open format table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8a1ce0206fa476f9741b875788859f70d5a35a996dc5005de444f861511e06d")
    override
        fun openTableFormatInput(openTableFormatInput: OpenTableFormatInputProperty.Builder.() -> Unit):
        Unit = openTableFormatInput(OpenTableFormatInputProperty(openTableFormatInput))

    /**
     * A structure used to define a table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-tableinput)
     * @param tableInput A structure used to define a table. 
     */
    override fun tableInput(tableInput: IResolvable) {
      cdkBuilder.tableInput(tableInput.let(IResolvable::unwrap))
    }

    /**
     * A structure used to define a table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-tableinput)
     * @param tableInput A structure used to define a table. 
     */
    override fun tableInput(tableInput: TableInputProperty) {
      cdkBuilder.tableInput(tableInput.let(TableInputProperty::unwrap))
    }

    /**
     * A structure used to define a table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-tableinput)
     * @param tableInput A structure used to define a table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e4d6f4a371dc83ceaf52f80f085408dbc5ced0bf91865c754ab74ee3ace17d1")
    override fun tableInput(tableInput: TableInputProperty.Builder.() -> Unit): Unit =
        tableInput(TableInputProperty(tableInput))

    public fun build(): software.amazon.awscdk.services.glue.CfnTable = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnTable.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable): CfnTable =
        CfnTable(cdkObject)

    internal fun unwrap(wrapped: CfnTable): software.amazon.awscdk.services.glue.CfnTable =
        wrapped.cdkObject
  }

  /**
   * Describes the physical storage of table data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * Object parameters;
   * Object skewedColumnValueLocationMaps;
   * StorageDescriptorProperty storageDescriptorProperty = StorageDescriptorProperty.builder()
   * .bucketColumns(List.of("bucketColumns"))
   * .columns(List.of(ColumnProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .comment("comment")
   * .type("type")
   * .build()))
   * .compressed(false)
   * .inputFormat("inputFormat")
   * .location("location")
   * .numberOfBuckets(123)
   * .outputFormat("outputFormat")
   * .parameters(parameters)
   * .schemaReference(SchemaReferenceProperty.builder()
   * .schemaId(SchemaIdProperty.builder()
   * .registryName("registryName")
   * .schemaArn("schemaArn")
   * .schemaName("schemaName")
   * .build())
   * .schemaVersionId("schemaVersionId")
   * .schemaVersionNumber(123)
   * .build())
   * .serdeInfo(SerdeInfoProperty.builder()
   * .name("name")
   * .parameters(parameters)
   * .serializationLibrary("serializationLibrary")
   * .build())
   * .skewedInfo(SkewedInfoProperty.builder()
   * .skewedColumnNames(List.of("skewedColumnNames"))
   * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
   * .skewedColumnValues(List.of("skewedColumnValues"))
   * .build())
   * .sortColumns(List.of(OrderProperty.builder()
   * .column("column")
   * .sortOrder(123)
   * .build()))
   * .storedAsSubDirectories(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html)
   */
  public interface StorageDescriptorProperty {
    /**
     * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-bucketcolumns)
     */
    public fun bucketColumns(): List<String> = unwrap(this).getBucketColumns() ?: emptyList()

    /**
     * A list of the `Columns` in the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-columns)
     */
    public fun columns(): Any? = unwrap(this).getColumns()

    /**
     * `True` if the data in the table is compressed, or `False` if not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-compressed)
     */
    public fun compressed(): Any? = unwrap(this).getCompressed()

    /**
     * The input format: `SequenceFileInputFormat` (binary), or `TextInputFormat` , or a custom
     * format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-inputformat)
     */
    public fun inputFormat(): String? = unwrap(this).getInputFormat()

    /**
     * The physical location of the table.
     *
     * By default, this takes the form of the warehouse location, followed by the database location
     * in the warehouse, followed by the table name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-location)
     */
    public fun location(): String? = unwrap(this).getLocation()

    /**
     * Must be specified if the table contains any dimension columns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-numberofbuckets)
     */
    public fun numberOfBuckets(): Number? = unwrap(this).getNumberOfBuckets()

    /**
     * The output format: `SequenceFileOutputFormat` (binary), or `IgnoreKeyTextOutputFormat` , or a
     * custom format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-outputformat)
     */
    public fun outputFormat(): String? = unwrap(this).getOutputFormat()

    /**
     * The user-supplied properties in key-value form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * An object that references a schema stored in the AWS Glue Schema Registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-schemareference)
     */
    public fun schemaReference(): Any? = unwrap(this).getSchemaReference()

    /**
     * The serialization/deserialization (SerDe) information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-serdeinfo)
     */
    public fun serdeInfo(): Any? = unwrap(this).getSerdeInfo()

    /**
     * The information about values that appear frequently in a column (skewed values).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-skewedinfo)
     */
    public fun skewedInfo(): Any? = unwrap(this).getSkewedInfo()

    /**
     * A list specifying the sort order of each bucket in the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-sortcolumns)
     */
    public fun sortColumns(): Any? = unwrap(this).getSortColumns()

    /**
     * `True` if the table data is stored in subdirectories, or `False` if not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-storedassubdirectories)
     */
    public fun storedAsSubDirectories(): Any? = unwrap(this).getStoredAsSubDirectories()

    /**
     * A builder for [StorageDescriptorProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketColumns A list of reducer grouping columns, clustering columns, and bucketing
       * columns in the table.
       */
      public fun bucketColumns(bucketColumns: List<String>)

      /**
       * @param bucketColumns A list of reducer grouping columns, clustering columns, and bucketing
       * columns in the table.
       */
      public fun bucketColumns(vararg bucketColumns: String)

      /**
       * @param columns A list of the `Columns` in the table.
       */
      public fun columns(columns: IResolvable)

      /**
       * @param columns A list of the `Columns` in the table.
       */
      public fun columns(columns: List<Any>)

      /**
       * @param columns A list of the `Columns` in the table.
       */
      public fun columns(vararg columns: Any)

      /**
       * @param compressed `True` if the data in the table is compressed, or `False` if not.
       */
      public fun compressed(compressed: Boolean)

      /**
       * @param compressed `True` if the data in the table is compressed, or `False` if not.
       */
      public fun compressed(compressed: IResolvable)

      /**
       * @param inputFormat The input format: `SequenceFileInputFormat` (binary), or
       * `TextInputFormat` , or a custom format.
       */
      public fun inputFormat(inputFormat: String)

      /**
       * @param location The physical location of the table.
       * By default, this takes the form of the warehouse location, followed by the database
       * location in the warehouse, followed by the table name.
       */
      public fun location(location: String)

      /**
       * @param numberOfBuckets Must be specified if the table contains any dimension columns.
       */
      public fun numberOfBuckets(numberOfBuckets: Number)

      /**
       * @param outputFormat The output format: `SequenceFileOutputFormat` (binary), or
       * `IgnoreKeyTextOutputFormat` , or a custom format.
       */
      public fun outputFormat(outputFormat: String)

      /**
       * @param parameters The user-supplied properties in key-value form.
       */
      public fun parameters(parameters: Any)

      /**
       * @param schemaReference An object that references a schema stored in the AWS Glue Schema
       * Registry.
       */
      public fun schemaReference(schemaReference: IResolvable)

      /**
       * @param schemaReference An object that references a schema stored in the AWS Glue Schema
       * Registry.
       */
      public fun schemaReference(schemaReference: SchemaReferenceProperty)

      /**
       * @param schemaReference An object that references a schema stored in the AWS Glue Schema
       * Registry.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da5e942beacf9cf335ff658999fff79422fdc7bf7cd4256314d18849988a9648")
      public fun schemaReference(schemaReference: SchemaReferenceProperty.Builder.() -> Unit)

      /**
       * @param serdeInfo The serialization/deserialization (SerDe) information.
       */
      public fun serdeInfo(serdeInfo: IResolvable)

      /**
       * @param serdeInfo The serialization/deserialization (SerDe) information.
       */
      public fun serdeInfo(serdeInfo: SerdeInfoProperty)

      /**
       * @param serdeInfo The serialization/deserialization (SerDe) information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11d04ede27877c042f8a31a30de79399591e90dd4a64a080f93acccbd4779395")
      public fun serdeInfo(serdeInfo: SerdeInfoProperty.Builder.() -> Unit)

      /**
       * @param skewedInfo The information about values that appear frequently in a column (skewed
       * values).
       */
      public fun skewedInfo(skewedInfo: IResolvable)

      /**
       * @param skewedInfo The information about values that appear frequently in a column (skewed
       * values).
       */
      public fun skewedInfo(skewedInfo: SkewedInfoProperty)

      /**
       * @param skewedInfo The information about values that appear frequently in a column (skewed
       * values).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2202e46e0497ddccdb231fcb92fd088f818c533569e70f9091b006a0c4b2b8eb")
      public fun skewedInfo(skewedInfo: SkewedInfoProperty.Builder.() -> Unit)

      /**
       * @param sortColumns A list specifying the sort order of each bucket in the table.
       */
      public fun sortColumns(sortColumns: IResolvable)

      /**
       * @param sortColumns A list specifying the sort order of each bucket in the table.
       */
      public fun sortColumns(sortColumns: List<Any>)

      /**
       * @param sortColumns A list specifying the sort order of each bucket in the table.
       */
      public fun sortColumns(vararg sortColumns: Any)

      /**
       * @param storedAsSubDirectories `True` if the table data is stored in subdirectories, or
       * `False` if not.
       */
      public fun storedAsSubDirectories(storedAsSubDirectories: Boolean)

      /**
       * @param storedAsSubDirectories `True` if the table data is stored in subdirectories, or
       * `False` if not.
       */
      public fun storedAsSubDirectories(storedAsSubDirectories: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.StorageDescriptorProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.StorageDescriptorProperty.builder()

      /**
       * @param bucketColumns A list of reducer grouping columns, clustering columns, and bucketing
       * columns in the table.
       */
      override fun bucketColumns(bucketColumns: List<String>) {
        cdkBuilder.bucketColumns(bucketColumns)
      }

      /**
       * @param bucketColumns A list of reducer grouping columns, clustering columns, and bucketing
       * columns in the table.
       */
      override fun bucketColumns(vararg bucketColumns: String): Unit =
          bucketColumns(bucketColumns.toList())

      /**
       * @param columns A list of the `Columns` in the table.
       */
      override fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns.let(IResolvable::unwrap))
      }

      /**
       * @param columns A list of the `Columns` in the table.
       */
      override fun columns(columns: List<Any>) {
        cdkBuilder.columns(columns)
      }

      /**
       * @param columns A list of the `Columns` in the table.
       */
      override fun columns(vararg columns: Any): Unit = columns(columns.toList())

      /**
       * @param compressed `True` if the data in the table is compressed, or `False` if not.
       */
      override fun compressed(compressed: Boolean) {
        cdkBuilder.compressed(compressed)
      }

      /**
       * @param compressed `True` if the data in the table is compressed, or `False` if not.
       */
      override fun compressed(compressed: IResolvable) {
        cdkBuilder.compressed(compressed.let(IResolvable::unwrap))
      }

      /**
       * @param inputFormat The input format: `SequenceFileInputFormat` (binary), or
       * `TextInputFormat` , or a custom format.
       */
      override fun inputFormat(inputFormat: String) {
        cdkBuilder.inputFormat(inputFormat)
      }

      /**
       * @param location The physical location of the table.
       * By default, this takes the form of the warehouse location, followed by the database
       * location in the warehouse, followed by the table name.
       */
      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      /**
       * @param numberOfBuckets Must be specified if the table contains any dimension columns.
       */
      override fun numberOfBuckets(numberOfBuckets: Number) {
        cdkBuilder.numberOfBuckets(numberOfBuckets)
      }

      /**
       * @param outputFormat The output format: `SequenceFileOutputFormat` (binary), or
       * `IgnoreKeyTextOutputFormat` , or a custom format.
       */
      override fun outputFormat(outputFormat: String) {
        cdkBuilder.outputFormat(outputFormat)
      }

      /**
       * @param parameters The user-supplied properties in key-value form.
       */
      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param schemaReference An object that references a schema stored in the AWS Glue Schema
       * Registry.
       */
      override fun schemaReference(schemaReference: IResolvable) {
        cdkBuilder.schemaReference(schemaReference.let(IResolvable::unwrap))
      }

      /**
       * @param schemaReference An object that references a schema stored in the AWS Glue Schema
       * Registry.
       */
      override fun schemaReference(schemaReference: SchemaReferenceProperty) {
        cdkBuilder.schemaReference(schemaReference.let(SchemaReferenceProperty::unwrap))
      }

      /**
       * @param schemaReference An object that references a schema stored in the AWS Glue Schema
       * Registry.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da5e942beacf9cf335ff658999fff79422fdc7bf7cd4256314d18849988a9648")
      override fun schemaReference(schemaReference: SchemaReferenceProperty.Builder.() -> Unit):
          Unit = schemaReference(SchemaReferenceProperty(schemaReference))

      /**
       * @param serdeInfo The serialization/deserialization (SerDe) information.
       */
      override fun serdeInfo(serdeInfo: IResolvable) {
        cdkBuilder.serdeInfo(serdeInfo.let(IResolvable::unwrap))
      }

      /**
       * @param serdeInfo The serialization/deserialization (SerDe) information.
       */
      override fun serdeInfo(serdeInfo: SerdeInfoProperty) {
        cdkBuilder.serdeInfo(serdeInfo.let(SerdeInfoProperty::unwrap))
      }

      /**
       * @param serdeInfo The serialization/deserialization (SerDe) information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11d04ede27877c042f8a31a30de79399591e90dd4a64a080f93acccbd4779395")
      override fun serdeInfo(serdeInfo: SerdeInfoProperty.Builder.() -> Unit): Unit =
          serdeInfo(SerdeInfoProperty(serdeInfo))

      /**
       * @param skewedInfo The information about values that appear frequently in a column (skewed
       * values).
       */
      override fun skewedInfo(skewedInfo: IResolvable) {
        cdkBuilder.skewedInfo(skewedInfo.let(IResolvable::unwrap))
      }

      /**
       * @param skewedInfo The information about values that appear frequently in a column (skewed
       * values).
       */
      override fun skewedInfo(skewedInfo: SkewedInfoProperty) {
        cdkBuilder.skewedInfo(skewedInfo.let(SkewedInfoProperty::unwrap))
      }

      /**
       * @param skewedInfo The information about values that appear frequently in a column (skewed
       * values).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2202e46e0497ddccdb231fcb92fd088f818c533569e70f9091b006a0c4b2b8eb")
      override fun skewedInfo(skewedInfo: SkewedInfoProperty.Builder.() -> Unit): Unit =
          skewedInfo(SkewedInfoProperty(skewedInfo))

      /**
       * @param sortColumns A list specifying the sort order of each bucket in the table.
       */
      override fun sortColumns(sortColumns: IResolvable) {
        cdkBuilder.sortColumns(sortColumns.let(IResolvable::unwrap))
      }

      /**
       * @param sortColumns A list specifying the sort order of each bucket in the table.
       */
      override fun sortColumns(sortColumns: List<Any>) {
        cdkBuilder.sortColumns(sortColumns)
      }

      /**
       * @param sortColumns A list specifying the sort order of each bucket in the table.
       */
      override fun sortColumns(vararg sortColumns: Any): Unit = sortColumns(sortColumns.toList())

      /**
       * @param storedAsSubDirectories `True` if the table data is stored in subdirectories, or
       * `False` if not.
       */
      override fun storedAsSubDirectories(storedAsSubDirectories: Boolean) {
        cdkBuilder.storedAsSubDirectories(storedAsSubDirectories)
      }

      /**
       * @param storedAsSubDirectories `True` if the table data is stored in subdirectories, or
       * `False` if not.
       */
      override fun storedAsSubDirectories(storedAsSubDirectories: IResolvable) {
        cdkBuilder.storedAsSubDirectories(storedAsSubDirectories.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.StorageDescriptorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnTable.StorageDescriptorProperty,
    ) : CdkObject(cdkObject), StorageDescriptorProperty {
      /**
       * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-bucketcolumns)
       */
      override fun bucketColumns(): List<String> = unwrap(this).getBucketColumns() ?: emptyList()

      /**
       * A list of the `Columns` in the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-columns)
       */
      override fun columns(): Any? = unwrap(this).getColumns()

      /**
       * `True` if the data in the table is compressed, or `False` if not.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-compressed)
       */
      override fun compressed(): Any? = unwrap(this).getCompressed()

      /**
       * The input format: `SequenceFileInputFormat` (binary), or `TextInputFormat` , or a custom
       * format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-inputformat)
       */
      override fun inputFormat(): String? = unwrap(this).getInputFormat()

      /**
       * The physical location of the table.
       *
       * By default, this takes the form of the warehouse location, followed by the database
       * location in the warehouse, followed by the table name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-location)
       */
      override fun location(): String? = unwrap(this).getLocation()

      /**
       * Must be specified if the table contains any dimension columns.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-numberofbuckets)
       */
      override fun numberOfBuckets(): Number? = unwrap(this).getNumberOfBuckets()

      /**
       * The output format: `SequenceFileOutputFormat` (binary), or `IgnoreKeyTextOutputFormat` , or
       * a custom format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-outputformat)
       */
      override fun outputFormat(): String? = unwrap(this).getOutputFormat()

      /**
       * The user-supplied properties in key-value form.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * An object that references a schema stored in the AWS Glue Schema Registry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-schemareference)
       */
      override fun schemaReference(): Any? = unwrap(this).getSchemaReference()

      /**
       * The serialization/deserialization (SerDe) information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-serdeinfo)
       */
      override fun serdeInfo(): Any? = unwrap(this).getSerdeInfo()

      /**
       * The information about values that appear frequently in a column (skewed values).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-skewedinfo)
       */
      override fun skewedInfo(): Any? = unwrap(this).getSkewedInfo()

      /**
       * A list specifying the sort order of each bucket in the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-sortcolumns)
       */
      override fun sortColumns(): Any? = unwrap(this).getSortColumns()

      /**
       * `True` if the table data is stored in subdirectories, or `False` if not.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-storedassubdirectories)
       */
      override fun storedAsSubDirectories(): Any? = unwrap(this).getStoredAsSubDirectories()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StorageDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.StorageDescriptorProperty):
          StorageDescriptorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StorageDescriptorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageDescriptorProperty):
          software.amazon.awscdk.services.glue.CfnTable.StorageDescriptorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnTable.StorageDescriptorProperty
    }
  }

  /**
   * Specifies an `OpenTableFormatInput` structure when creating an open format table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * OpenTableFormatInputProperty openTableFormatInputProperty =
   * OpenTableFormatInputProperty.builder()
   * .icebergInput(IcebergInputProperty.builder()
   * .metadataOperation("metadataOperation")
   * .version("version")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-opentableformatinput.html)
   */
  public interface OpenTableFormatInputProperty {
    /**
     * Specifies an `IcebergInput` structure that defines an Apache Iceberg metadata table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-opentableformatinput.html#cfn-glue-table-opentableformatinput-iceberginput)
     */
    public fun icebergInput(): Any? = unwrap(this).getIcebergInput()

    /**
     * A builder for [OpenTableFormatInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param icebergInput Specifies an `IcebergInput` structure that defines an Apache Iceberg
       * metadata table.
       */
      public fun icebergInput(icebergInput: IResolvable)

      /**
       * @param icebergInput Specifies an `IcebergInput` structure that defines an Apache Iceberg
       * metadata table.
       */
      public fun icebergInput(icebergInput: IcebergInputProperty)

      /**
       * @param icebergInput Specifies an `IcebergInput` structure that defines an Apache Iceberg
       * metadata table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1dabdd8870b197acdacd5ca509199e8896ee45cc3920d4d67e7624b2f6cec6e2")
      public fun icebergInput(icebergInput: IcebergInputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.OpenTableFormatInputProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.OpenTableFormatInputProperty.builder()

      /**
       * @param icebergInput Specifies an `IcebergInput` structure that defines an Apache Iceberg
       * metadata table.
       */
      override fun icebergInput(icebergInput: IResolvable) {
        cdkBuilder.icebergInput(icebergInput.let(IResolvable::unwrap))
      }

      /**
       * @param icebergInput Specifies an `IcebergInput` structure that defines an Apache Iceberg
       * metadata table.
       */
      override fun icebergInput(icebergInput: IcebergInputProperty) {
        cdkBuilder.icebergInput(icebergInput.let(IcebergInputProperty::unwrap))
      }

      /**
       * @param icebergInput Specifies an `IcebergInput` structure that defines an Apache Iceberg
       * metadata table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1dabdd8870b197acdacd5ca509199e8896ee45cc3920d4d67e7624b2f6cec6e2")
      override fun icebergInput(icebergInput: IcebergInputProperty.Builder.() -> Unit): Unit =
          icebergInput(IcebergInputProperty(icebergInput))

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.OpenTableFormatInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnTable.OpenTableFormatInputProperty,
    ) : CdkObject(cdkObject), OpenTableFormatInputProperty {
      /**
       * Specifies an `IcebergInput` structure that defines an Apache Iceberg metadata table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-opentableformatinput.html#cfn-glue-table-opentableformatinput-iceberginput)
       */
      override fun icebergInput(): Any? = unwrap(this).getIcebergInput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OpenTableFormatInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.OpenTableFormatInputProperty):
          OpenTableFormatInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OpenTableFormatInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OpenTableFormatInputProperty):
          software.amazon.awscdk.services.glue.CfnTable.OpenTableFormatInputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnTable.OpenTableFormatInputProperty
    }
  }

  /**
   * An object that references a schema stored in the AWS Glue Schema Registry.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * SchemaReferenceProperty schemaReferenceProperty = SchemaReferenceProperty.builder()
   * .schemaId(SchemaIdProperty.builder()
   * .registryName("registryName")
   * .schemaArn("schemaArn")
   * .schemaName("schemaName")
   * .build())
   * .schemaVersionId("schemaVersionId")
   * .schemaVersionNumber(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemareference.html)
   */
  public interface SchemaReferenceProperty {
    /**
     * A structure that contains schema identity fields.
     *
     * Either this or the `SchemaVersionId` has to be
     * provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemareference.html#cfn-glue-table-schemareference-schemaid)
     */
    public fun schemaId(): Any? = unwrap(this).getSchemaId()

    /**
     * The unique ID assigned to a version of the schema.
     *
     * Either this or the `SchemaId` has to be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemareference.html#cfn-glue-table-schemareference-schemaversionid)
     */
    public fun schemaVersionId(): String? = unwrap(this).getSchemaVersionId()

    /**
     * The version number of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemareference.html#cfn-glue-table-schemareference-schemaversionnumber)
     */
    public fun schemaVersionNumber(): Number? = unwrap(this).getSchemaVersionNumber()

    /**
     * A builder for [SchemaReferenceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param schemaId A structure that contains schema identity fields.
       * Either this or the `SchemaVersionId` has to be
       * provided.
       */
      public fun schemaId(schemaId: IResolvable)

      /**
       * @param schemaId A structure that contains schema identity fields.
       * Either this or the `SchemaVersionId` has to be
       * provided.
       */
      public fun schemaId(schemaId: SchemaIdProperty)

      /**
       * @param schemaId A structure that contains schema identity fields.
       * Either this or the `SchemaVersionId` has to be
       * provided.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d16db282fc361cca1004a18f2a4b3646e53a680b0e48f5046406cea621d158b")
      public fun schemaId(schemaId: SchemaIdProperty.Builder.() -> Unit)

      /**
       * @param schemaVersionId The unique ID assigned to a version of the schema.
       * Either this or the `SchemaId` has to be provided.
       */
      public fun schemaVersionId(schemaVersionId: String)

      /**
       * @param schemaVersionNumber The version number of the schema.
       */
      public fun schemaVersionNumber(schemaVersionNumber: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty.builder()

      /**
       * @param schemaId A structure that contains schema identity fields.
       * Either this or the `SchemaVersionId` has to be
       * provided.
       */
      override fun schemaId(schemaId: IResolvable) {
        cdkBuilder.schemaId(schemaId.let(IResolvable::unwrap))
      }

      /**
       * @param schemaId A structure that contains schema identity fields.
       * Either this or the `SchemaVersionId` has to be
       * provided.
       */
      override fun schemaId(schemaId: SchemaIdProperty) {
        cdkBuilder.schemaId(schemaId.let(SchemaIdProperty::unwrap))
      }

      /**
       * @param schemaId A structure that contains schema identity fields.
       * Either this or the `SchemaVersionId` has to be
       * provided.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d16db282fc361cca1004a18f2a4b3646e53a680b0e48f5046406cea621d158b")
      override fun schemaId(schemaId: SchemaIdProperty.Builder.() -> Unit): Unit =
          schemaId(SchemaIdProperty(schemaId))

      /**
       * @param schemaVersionId The unique ID assigned to a version of the schema.
       * Either this or the `SchemaId` has to be provided.
       */
      override fun schemaVersionId(schemaVersionId: String) {
        cdkBuilder.schemaVersionId(schemaVersionId)
      }

      /**
       * @param schemaVersionNumber The version number of the schema.
       */
      override fun schemaVersionNumber(schemaVersionNumber: Number) {
        cdkBuilder.schemaVersionNumber(schemaVersionNumber)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty,
    ) : CdkObject(cdkObject), SchemaReferenceProperty {
      /**
       * A structure that contains schema identity fields.
       *
       * Either this or the `SchemaVersionId` has to be
       * provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemareference.html#cfn-glue-table-schemareference-schemaid)
       */
      override fun schemaId(): Any? = unwrap(this).getSchemaId()

      /**
       * The unique ID assigned to a version of the schema.
       *
       * Either this or the `SchemaId` has to be provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemareference.html#cfn-glue-table-schemareference-schemaversionid)
       */
      override fun schemaVersionId(): String? = unwrap(this).getSchemaVersionId()

      /**
       * The version number of the schema.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemareference.html#cfn-glue-table-schemareference-schemaversionnumber)
       */
      override fun schemaVersionNumber(): Number? = unwrap(this).getSchemaVersionNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty):
          SchemaReferenceProperty = CdkObjectWrappers.wrap(cdkObject) as? SchemaReferenceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaReferenceProperty):
          software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnTable.SchemaReferenceProperty
    }
  }

  /**
   * A structure used to define a table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * Object parameters;
   * Object skewedColumnValueLocationMaps;
   * TableInputProperty tableInputProperty = TableInputProperty.builder()
   * .description("description")
   * .name("name")
   * .owner("owner")
   * .parameters(parameters)
   * .partitionKeys(List.of(ColumnProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .comment("comment")
   * .type("type")
   * .build()))
   * .retention(123)
   * .storageDescriptor(StorageDescriptorProperty.builder()
   * .bucketColumns(List.of("bucketColumns"))
   * .columns(List.of(ColumnProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .comment("comment")
   * .type("type")
   * .build()))
   * .compressed(false)
   * .inputFormat("inputFormat")
   * .location("location")
   * .numberOfBuckets(123)
   * .outputFormat("outputFormat")
   * .parameters(parameters)
   * .schemaReference(SchemaReferenceProperty.builder()
   * .schemaId(SchemaIdProperty.builder()
   * .registryName("registryName")
   * .schemaArn("schemaArn")
   * .schemaName("schemaName")
   * .build())
   * .schemaVersionId("schemaVersionId")
   * .schemaVersionNumber(123)
   * .build())
   * .serdeInfo(SerdeInfoProperty.builder()
   * .name("name")
   * .parameters(parameters)
   * .serializationLibrary("serializationLibrary")
   * .build())
   * .skewedInfo(SkewedInfoProperty.builder()
   * .skewedColumnNames(List.of("skewedColumnNames"))
   * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
   * .skewedColumnValues(List.of("skewedColumnValues"))
   * .build())
   * .sortColumns(List.of(OrderProperty.builder()
   * .column("column")
   * .sortOrder(123)
   * .build()))
   * .storedAsSubDirectories(false)
   * .build())
   * .tableType("tableType")
   * .targetTable(TableIdentifierProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * .name("name")
   * .region("region")
   * .build())
   * .viewExpandedText("viewExpandedText")
   * .viewOriginalText("viewOriginalText")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html)
   */
  public interface TableInputProperty {
    /**
     * A description of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The table name.
     *
     * For Hive compatibility, this is folded to lowercase when it is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The table owner.
     *
     * Included for Apache Hive compatibility. Not used in the normal course of AWS Glue operations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-owner)
     */
    public fun owner(): String? = unwrap(this).getOwner()

    /**
     * These key-value pairs define properties associated with the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * A list of columns by which the table is partitioned. Only primitive types are supported as
     * partition keys.
     *
     * When you create a table used by Amazon Athena, and you do not specify any `partitionKeys` ,
     * you must at least set the value of `partitionKeys` to an empty list. For example:
     *
     * `"PartitionKeys": []`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-partitionkeys)
     */
    public fun partitionKeys(): Any? = unwrap(this).getPartitionKeys()

    /**
     * The retention time for this table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-retention)
     */
    public fun retention(): Number? = unwrap(this).getRetention()

    /**
     * A storage descriptor containing information about the physical storage of this table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-storagedescriptor)
     */
    public fun storageDescriptor(): Any? = unwrap(this).getStorageDescriptor()

    /**
     * The type of this table.
     *
     * AWS Glue will create tables with the `EXTERNAL_TABLE` type. Other services, such as Athena,
     * may create tables with additional table types.
     *
     * AWS Glue related table types:
     *
     * * **EXTERNAL_TABLE** - Hive compatible attribute - indicates a non-Hive managed table.
     * * **GOVERNED** - Used by AWS Lake Formation . The AWS Glue Data Catalog understands
     * `GOVERNED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-tabletype)
     */
    public fun tableType(): String? = unwrap(this).getTableType()

    /**
     * A `TableIdentifier` structure that describes a target table for resource linking.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-targettable)
     */
    public fun targetTable(): Any? = unwrap(this).getTargetTable()

    /**
     * Included for Apache Hive compatibility.
     *
     * Not used in the normal course of AWS Glue operations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-viewexpandedtext)
     */
    public fun viewExpandedText(): String? = unwrap(this).getViewExpandedText()

    /**
     * Included for Apache Hive compatibility.
     *
     * Not used in the normal course of AWS Glue operations. If the table is a `VIRTUAL_VIEW` ,
     * certain Athena configuration encoded in base64.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-vieworiginaltext)
     */
    public fun viewOriginalText(): String? = unwrap(this).getViewOriginalText()

    /**
     * A builder for [TableInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description A description of the table.
       */
      public fun description(description: String)

      /**
       * @param name The table name.
       * For Hive compatibility, this is folded to lowercase when it is stored.
       */
      public fun name(name: String)

      /**
       * @param owner The table owner.
       * Included for Apache Hive compatibility. Not used in the normal course of AWS Glue
       * operations.
       */
      public fun owner(owner: String)

      /**
       * @param parameters These key-value pairs define properties associated with the table.
       */
      public fun parameters(parameters: Any)

      /**
       * @param partitionKeys A list of columns by which the table is partitioned. Only primitive
       * types are supported as partition keys.
       * When you create a table used by Amazon Athena, and you do not specify any `partitionKeys` ,
       * you must at least set the value of `partitionKeys` to an empty list. For example:
       *
       * `"PartitionKeys": []`
       */
      public fun partitionKeys(partitionKeys: IResolvable)

      /**
       * @param partitionKeys A list of columns by which the table is partitioned. Only primitive
       * types are supported as partition keys.
       * When you create a table used by Amazon Athena, and you do not specify any `partitionKeys` ,
       * you must at least set the value of `partitionKeys` to an empty list. For example:
       *
       * `"PartitionKeys": []`
       */
      public fun partitionKeys(partitionKeys: List<Any>)

      /**
       * @param partitionKeys A list of columns by which the table is partitioned. Only primitive
       * types are supported as partition keys.
       * When you create a table used by Amazon Athena, and you do not specify any `partitionKeys` ,
       * you must at least set the value of `partitionKeys` to an empty list. For example:
       *
       * `"PartitionKeys": []`
       */
      public fun partitionKeys(vararg partitionKeys: Any)

      /**
       * @param retention The retention time for this table.
       */
      public fun retention(retention: Number)

      /**
       * @param storageDescriptor A storage descriptor containing information about the physical
       * storage of this table.
       */
      public fun storageDescriptor(storageDescriptor: IResolvable)

      /**
       * @param storageDescriptor A storage descriptor containing information about the physical
       * storage of this table.
       */
      public fun storageDescriptor(storageDescriptor: StorageDescriptorProperty)

      /**
       * @param storageDescriptor A storage descriptor containing information about the physical
       * storage of this table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b6c9a4cc9b5aec52f3b2756da1f1dbf002620d455a76472b85570ded6b8c74a")
      public fun storageDescriptor(storageDescriptor: StorageDescriptorProperty.Builder.() -> Unit)

      /**
       * @param tableType The type of this table.
       * AWS Glue will create tables with the `EXTERNAL_TABLE` type. Other services, such as Athena,
       * may create tables with additional table types.
       *
       * AWS Glue related table types:
       *
       * * **EXTERNAL_TABLE** - Hive compatible attribute - indicates a non-Hive managed table.
       * * **GOVERNED** - Used by AWS Lake Formation . The AWS Glue Data Catalog understands
       * `GOVERNED` .
       */
      public fun tableType(tableType: String)

      /**
       * @param targetTable A `TableIdentifier` structure that describes a target table for resource
       * linking.
       */
      public fun targetTable(targetTable: IResolvable)

      /**
       * @param targetTable A `TableIdentifier` structure that describes a target table for resource
       * linking.
       */
      public fun targetTable(targetTable: TableIdentifierProperty)

      /**
       * @param targetTable A `TableIdentifier` structure that describes a target table for resource
       * linking.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e244fadecf32f732dd9674fd91e548f3b7dd67fa134be4457fe24a18c9e5c53c")
      public fun targetTable(targetTable: TableIdentifierProperty.Builder.() -> Unit)

      /**
       * @param viewExpandedText Included for Apache Hive compatibility.
       * Not used in the normal course of AWS Glue operations.
       */
      public fun viewExpandedText(viewExpandedText: String)

      /**
       * @param viewOriginalText Included for Apache Hive compatibility.
       * Not used in the normal course of AWS Glue operations. If the table is a `VIRTUAL_VIEW` ,
       * certain Athena configuration encoded in base64.
       */
      public fun viewOriginalText(viewOriginalText: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.TableInputProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.TableInputProperty.builder()

      /**
       * @param description A description of the table.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param name The table name.
       * For Hive compatibility, this is folded to lowercase when it is stored.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param owner The table owner.
       * Included for Apache Hive compatibility. Not used in the normal course of AWS Glue
       * operations.
       */
      override fun owner(owner: String) {
        cdkBuilder.owner(owner)
      }

      /**
       * @param parameters These key-value pairs define properties associated with the table.
       */
      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param partitionKeys A list of columns by which the table is partitioned. Only primitive
       * types are supported as partition keys.
       * When you create a table used by Amazon Athena, and you do not specify any `partitionKeys` ,
       * you must at least set the value of `partitionKeys` to an empty list. For example:
       *
       * `"PartitionKeys": []`
       */
      override fun partitionKeys(partitionKeys: IResolvable) {
        cdkBuilder.partitionKeys(partitionKeys.let(IResolvable::unwrap))
      }

      /**
       * @param partitionKeys A list of columns by which the table is partitioned. Only primitive
       * types are supported as partition keys.
       * When you create a table used by Amazon Athena, and you do not specify any `partitionKeys` ,
       * you must at least set the value of `partitionKeys` to an empty list. For example:
       *
       * `"PartitionKeys": []`
       */
      override fun partitionKeys(partitionKeys: List<Any>) {
        cdkBuilder.partitionKeys(partitionKeys)
      }

      /**
       * @param partitionKeys A list of columns by which the table is partitioned. Only primitive
       * types are supported as partition keys.
       * When you create a table used by Amazon Athena, and you do not specify any `partitionKeys` ,
       * you must at least set the value of `partitionKeys` to an empty list. For example:
       *
       * `"PartitionKeys": []`
       */
      override fun partitionKeys(vararg partitionKeys: Any): Unit =
          partitionKeys(partitionKeys.toList())

      /**
       * @param retention The retention time for this table.
       */
      override fun retention(retention: Number) {
        cdkBuilder.retention(retention)
      }

      /**
       * @param storageDescriptor A storage descriptor containing information about the physical
       * storage of this table.
       */
      override fun storageDescriptor(storageDescriptor: IResolvable) {
        cdkBuilder.storageDescriptor(storageDescriptor.let(IResolvable::unwrap))
      }

      /**
       * @param storageDescriptor A storage descriptor containing information about the physical
       * storage of this table.
       */
      override fun storageDescriptor(storageDescriptor: StorageDescriptorProperty) {
        cdkBuilder.storageDescriptor(storageDescriptor.let(StorageDescriptorProperty::unwrap))
      }

      /**
       * @param storageDescriptor A storage descriptor containing information about the physical
       * storage of this table.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2b6c9a4cc9b5aec52f3b2756da1f1dbf002620d455a76472b85570ded6b8c74a")
      override
          fun storageDescriptor(storageDescriptor: StorageDescriptorProperty.Builder.() -> Unit):
          Unit = storageDescriptor(StorageDescriptorProperty(storageDescriptor))

      /**
       * @param tableType The type of this table.
       * AWS Glue will create tables with the `EXTERNAL_TABLE` type. Other services, such as Athena,
       * may create tables with additional table types.
       *
       * AWS Glue related table types:
       *
       * * **EXTERNAL_TABLE** - Hive compatible attribute - indicates a non-Hive managed table.
       * * **GOVERNED** - Used by AWS Lake Formation . The AWS Glue Data Catalog understands
       * `GOVERNED` .
       */
      override fun tableType(tableType: String) {
        cdkBuilder.tableType(tableType)
      }

      /**
       * @param targetTable A `TableIdentifier` structure that describes a target table for resource
       * linking.
       */
      override fun targetTable(targetTable: IResolvable) {
        cdkBuilder.targetTable(targetTable.let(IResolvable::unwrap))
      }

      /**
       * @param targetTable A `TableIdentifier` structure that describes a target table for resource
       * linking.
       */
      override fun targetTable(targetTable: TableIdentifierProperty) {
        cdkBuilder.targetTable(targetTable.let(TableIdentifierProperty::unwrap))
      }

      /**
       * @param targetTable A `TableIdentifier` structure that describes a target table for resource
       * linking.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e244fadecf32f732dd9674fd91e548f3b7dd67fa134be4457fe24a18c9e5c53c")
      override fun targetTable(targetTable: TableIdentifierProperty.Builder.() -> Unit): Unit =
          targetTable(TableIdentifierProperty(targetTable))

      /**
       * @param viewExpandedText Included for Apache Hive compatibility.
       * Not used in the normal course of AWS Glue operations.
       */
      override fun viewExpandedText(viewExpandedText: String) {
        cdkBuilder.viewExpandedText(viewExpandedText)
      }

      /**
       * @param viewOriginalText Included for Apache Hive compatibility.
       * Not used in the normal course of AWS Glue operations. If the table is a `VIRTUAL_VIEW` ,
       * certain Athena configuration encoded in base64.
       */
      override fun viewOriginalText(viewOriginalText: String) {
        cdkBuilder.viewOriginalText(viewOriginalText)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.TableInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.TableInputProperty,
    ) : CdkObject(cdkObject), TableInputProperty {
      /**
       * A description of the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The table name.
       *
       * For Hive compatibility, this is folded to lowercase when it is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The table owner.
       *
       * Included for Apache Hive compatibility. Not used in the normal course of AWS Glue
       * operations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-owner)
       */
      override fun owner(): String? = unwrap(this).getOwner()

      /**
       * These key-value pairs define properties associated with the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * A list of columns by which the table is partitioned. Only primitive types are supported as
       * partition keys.
       *
       * When you create a table used by Amazon Athena, and you do not specify any `partitionKeys` ,
       * you must at least set the value of `partitionKeys` to an empty list. For example:
       *
       * `"PartitionKeys": []`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-partitionkeys)
       */
      override fun partitionKeys(): Any? = unwrap(this).getPartitionKeys()

      /**
       * The retention time for this table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-retention)
       */
      override fun retention(): Number? = unwrap(this).getRetention()

      /**
       * A storage descriptor containing information about the physical storage of this table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-storagedescriptor)
       */
      override fun storageDescriptor(): Any? = unwrap(this).getStorageDescriptor()

      /**
       * The type of this table.
       *
       * AWS Glue will create tables with the `EXTERNAL_TABLE` type. Other services, such as Athena,
       * may create tables with additional table types.
       *
       * AWS Glue related table types:
       *
       * * **EXTERNAL_TABLE** - Hive compatible attribute - indicates a non-Hive managed table.
       * * **GOVERNED** - Used by AWS Lake Formation . The AWS Glue Data Catalog understands
       * `GOVERNED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-tabletype)
       */
      override fun tableType(): String? = unwrap(this).getTableType()

      /**
       * A `TableIdentifier` structure that describes a target table for resource linking.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-targettable)
       */
      override fun targetTable(): Any? = unwrap(this).getTargetTable()

      /**
       * Included for Apache Hive compatibility.
       *
       * Not used in the normal course of AWS Glue operations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-viewexpandedtext)
       */
      override fun viewExpandedText(): String? = unwrap(this).getViewExpandedText()

      /**
       * Included for Apache Hive compatibility.
       *
       * Not used in the normal course of AWS Glue operations. If the table is a `VIRTUAL_VIEW` ,
       * certain Athena configuration encoded in base64.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-vieworiginaltext)
       */
      override fun viewOriginalText(): String? = unwrap(this).getViewOriginalText()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TableInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.TableInputProperty):
          TableInputProperty = CdkObjectWrappers.wrap(cdkObject) as? TableInputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableInputProperty):
          software.amazon.awscdk.services.glue.CfnTable.TableInputProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTable.TableInputProperty
    }
  }

  /**
   * Specifies skewed values in a table.
   *
   * Skewed values are those that occur with very high frequency.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * Object skewedColumnValueLocationMaps;
   * SkewedInfoProperty skewedInfoProperty = SkewedInfoProperty.builder()
   * .skewedColumnNames(List.of("skewedColumnNames"))
   * .skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
   * .skewedColumnValues(List.of("skewedColumnValues"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html)
   */
  public interface SkewedInfoProperty {
    /**
     * A list of names of columns that contain skewed values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnnames)
     */
    public fun skewedColumnNames(): List<String> = unwrap(this).getSkewedColumnNames() ?:
        emptyList()

    /**
     * A mapping of skewed values to the columns that contain them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvaluelocationmaps)
     */
    public fun skewedColumnValueLocationMaps(): Any? =
        unwrap(this).getSkewedColumnValueLocationMaps()

    /**
     * A list of values that appear so frequently as to be considered skewed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvalues)
     */
    public fun skewedColumnValues(): List<String> = unwrap(this).getSkewedColumnValues() ?:
        emptyList()

    /**
     * A builder for [SkewedInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param skewedColumnNames A list of names of columns that contain skewed values.
       */
      public fun skewedColumnNames(skewedColumnNames: List<String>)

      /**
       * @param skewedColumnNames A list of names of columns that contain skewed values.
       */
      public fun skewedColumnNames(vararg skewedColumnNames: String)

      /**
       * @param skewedColumnValueLocationMaps A mapping of skewed values to the columns that contain
       * them.
       */
      public fun skewedColumnValueLocationMaps(skewedColumnValueLocationMaps: Any)

      /**
       * @param skewedColumnValues A list of values that appear so frequently as to be considered
       * skewed.
       */
      public fun skewedColumnValues(skewedColumnValues: List<String>)

      /**
       * @param skewedColumnValues A list of values that appear so frequently as to be considered
       * skewed.
       */
      public fun skewedColumnValues(vararg skewedColumnValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty.builder()

      /**
       * @param skewedColumnNames A list of names of columns that contain skewed values.
       */
      override fun skewedColumnNames(skewedColumnNames: List<String>) {
        cdkBuilder.skewedColumnNames(skewedColumnNames)
      }

      /**
       * @param skewedColumnNames A list of names of columns that contain skewed values.
       */
      override fun skewedColumnNames(vararg skewedColumnNames: String): Unit =
          skewedColumnNames(skewedColumnNames.toList())

      /**
       * @param skewedColumnValueLocationMaps A mapping of skewed values to the columns that contain
       * them.
       */
      override fun skewedColumnValueLocationMaps(skewedColumnValueLocationMaps: Any) {
        cdkBuilder.skewedColumnValueLocationMaps(skewedColumnValueLocationMaps)
      }

      /**
       * @param skewedColumnValues A list of values that appear so frequently as to be considered
       * skewed.
       */
      override fun skewedColumnValues(skewedColumnValues: List<String>) {
        cdkBuilder.skewedColumnValues(skewedColumnValues)
      }

      /**
       * @param skewedColumnValues A list of values that appear so frequently as to be considered
       * skewed.
       */
      override fun skewedColumnValues(vararg skewedColumnValues: String): Unit =
          skewedColumnValues(skewedColumnValues.toList())

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty,
    ) : CdkObject(cdkObject), SkewedInfoProperty {
      /**
       * A list of names of columns that contain skewed values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnnames)
       */
      override fun skewedColumnNames(): List<String> = unwrap(this).getSkewedColumnNames() ?:
          emptyList()

      /**
       * A mapping of skewed values to the columns that contain them.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvaluelocationmaps)
       */
      override fun skewedColumnValueLocationMaps(): Any? =
          unwrap(this).getSkewedColumnValueLocationMaps()

      /**
       * A list of values that appear so frequently as to be considered skewed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html#cfn-glue-table-skewedinfo-skewedcolumnvalues)
       */
      override fun skewedColumnValues(): List<String> = unwrap(this).getSkewedColumnValues() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SkewedInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty):
          SkewedInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? SkewedInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SkewedInfoProperty):
          software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTable.SkewedInfoProperty
    }
  }

  /**
   * Information about a serialization/deserialization program (SerDe) that serves as an extractor
   * and loader.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * Object parameters;
   * SerdeInfoProperty serdeInfoProperty = SerdeInfoProperty.builder()
   * .name("name")
   * .parameters(parameters)
   * .serializationLibrary("serializationLibrary")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html)
   */
  public interface SerdeInfoProperty {
    /**
     * Name of the SerDe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * These key-value pairs define initialization parameters for the SerDe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * Usually the class that implements the SerDe.
     *
     * An example is `org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-serializationlibrary)
     */
    public fun serializationLibrary(): String? = unwrap(this).getSerializationLibrary()

    /**
     * A builder for [SerdeInfoProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name Name of the SerDe.
       */
      public fun name(name: String)

      /**
       * @param parameters These key-value pairs define initialization parameters for the SerDe.
       */
      public fun parameters(parameters: Any)

      /**
       * @param serializationLibrary Usually the class that implements the SerDe.
       * An example is `org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe` .
       */
      public fun serializationLibrary(serializationLibrary: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty.builder()

      /**
       * @param name Name of the SerDe.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param parameters These key-value pairs define initialization parameters for the SerDe.
       */
      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param serializationLibrary Usually the class that implements the SerDe.
       * An example is `org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe` .
       */
      override fun serializationLibrary(serializationLibrary: String) {
        cdkBuilder.serializationLibrary(serializationLibrary)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty,
    ) : CdkObject(cdkObject), SerdeInfoProperty {
      /**
       * Name of the SerDe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * These key-value pairs define initialization parameters for the SerDe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * Usually the class that implements the SerDe.
       *
       * An example is `org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html#cfn-glue-table-serdeinfo-serializationlibrary)
       */
      override fun serializationLibrary(): String? = unwrap(this).getSerializationLibrary()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SerdeInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty):
          SerdeInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? SerdeInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SerdeInfoProperty):
          software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTable.SerdeInfoProperty
    }
  }

  /**
   * A structure that describes a target table for resource linking.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * TableIdentifierProperty tableIdentifierProperty = TableIdentifierProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * .name("name")
   * .region("region")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableidentifier.html)
   */
  public interface TableIdentifierProperty {
    /**
     * The ID of the Data Catalog in which the table resides.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableidentifier.html#cfn-glue-table-tableidentifier-catalogid)
     */
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    /**
     * The name of the catalog database that contains the target table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableidentifier.html#cfn-glue-table-tableidentifier-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * The name of the target table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableidentifier.html#cfn-glue-table-tableidentifier-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The Region of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableidentifier.html#cfn-glue-table-tableidentifier-region)
     */
    public fun region(): String? = unwrap(this).getRegion()

    /**
     * A builder for [TableIdentifierProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The ID of the Data Catalog in which the table resides.
       */
      public fun catalogId(catalogId: String)

      /**
       * @param databaseName The name of the catalog database that contains the target table.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param name The name of the target table.
       */
      public fun name(name: String)

      /**
       * @param region The Region of the table.
       */
      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty.builder()

      /**
       * @param catalogId The ID of the Data Catalog in which the table resides.
       */
      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      /**
       * @param databaseName The name of the catalog database that contains the target table.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param name The name of the target table.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param region The Region of the table.
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty,
    ) : CdkObject(cdkObject), TableIdentifierProperty {
      /**
       * The ID of the Data Catalog in which the table resides.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableidentifier.html#cfn-glue-table-tableidentifier-catalogid)
       */
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      /**
       * The name of the catalog database that contains the target table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableidentifier.html#cfn-glue-table-tableidentifier-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * The name of the target table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableidentifier.html#cfn-glue-table-tableidentifier-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The Region of the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableidentifier.html#cfn-glue-table-tableidentifier-region)
       */
      override fun region(): String? = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TableIdentifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty):
          TableIdentifierProperty = CdkObjectWrappers.wrap(cdkObject) as? TableIdentifierProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableIdentifierProperty):
          software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnTable.TableIdentifierProperty
    }
  }

  /**
   * Specifies the sort order of a sorted column.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * OrderProperty orderProperty = OrderProperty.builder()
   * .column("column")
   * .sortOrder(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html)
   */
  public interface OrderProperty {
    /**
     * The name of the column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-column)
     */
    public fun column(): String

    /**
     * Indicates that the column is sorted in ascending order ( `== 1` ), or in descending order (
     * `==0` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-sortorder)
     */
    public fun sortOrder(): Number

    /**
     * A builder for [OrderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param column The name of the column. 
       */
      public fun column(column: String)

      /**
       * @param sortOrder Indicates that the column is sorted in ascending order ( `== 1` ), or in
       * descending order ( `==0` ). 
       */
      public fun sortOrder(sortOrder: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTable.OrderProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.OrderProperty.builder()

      /**
       * @param column The name of the column. 
       */
      override fun column(column: String) {
        cdkBuilder.column(column)
      }

      /**
       * @param sortOrder Indicates that the column is sorted in ascending order ( `== 1` ), or in
       * descending order ( `==0` ). 
       */
      override fun sortOrder(sortOrder: Number) {
        cdkBuilder.sortOrder(sortOrder)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.OrderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.OrderProperty,
    ) : CdkObject(cdkObject), OrderProperty {
      /**
       * The name of the column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-column)
       */
      override fun column(): String = unwrap(this).getColumn()

      /**
       * Indicates that the column is sorted in ascending order ( `== 1` ), or in descending order (
       * `==0` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-sortorder)
       */
      override fun sortOrder(): Number = unwrap(this).getSortOrder()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OrderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.OrderProperty):
          OrderProperty = CdkObjectWrappers.wrap(cdkObject) as? OrderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrderProperty):
          software.amazon.awscdk.services.glue.CfnTable.OrderProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTable.OrderProperty
    }
  }

  /**
   * A structure that contains schema identity fields.
   *
   * Either this or the `SchemaVersionId` has to be
   * provided.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * SchemaIdProperty schemaIdProperty = SchemaIdProperty.builder()
   * .registryName("registryName")
   * .schemaArn("schemaArn")
   * .schemaName("schemaName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemaid.html)
   */
  public interface SchemaIdProperty {
    /**
     * The name of the schema registry that contains the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemaid.html#cfn-glue-table-schemaid-registryname)
     */
    public fun registryName(): String? = unwrap(this).getRegistryName()

    /**
     * The Amazon Resource Name (ARN) of the schema.
     *
     * One of `SchemaArn` or `SchemaName` has to be
     * provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemaid.html#cfn-glue-table-schemaid-schemaarn)
     */
    public fun schemaArn(): String? = unwrap(this).getSchemaArn()

    /**
     * The name of the schema.
     *
     * One of `SchemaArn` or `SchemaName` has to be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemaid.html#cfn-glue-table-schemaid-schemaname)
     */
    public fun schemaName(): String? = unwrap(this).getSchemaName()

    /**
     * A builder for [SchemaIdProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param registryName The name of the schema registry that contains the schema.
       */
      public fun registryName(registryName: String)

      /**
       * @param schemaArn The Amazon Resource Name (ARN) of the schema.
       * One of `SchemaArn` or `SchemaName` has to be
       * provided.
       */
      public fun schemaArn(schemaArn: String)

      /**
       * @param schemaName The name of the schema.
       * One of `SchemaArn` or `SchemaName` has to be provided.
       */
      public fun schemaName(schemaName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTable.SchemaIdProperty.Builder
          = software.amazon.awscdk.services.glue.CfnTable.SchemaIdProperty.builder()

      /**
       * @param registryName The name of the schema registry that contains the schema.
       */
      override fun registryName(registryName: String) {
        cdkBuilder.registryName(registryName)
      }

      /**
       * @param schemaArn The Amazon Resource Name (ARN) of the schema.
       * One of `SchemaArn` or `SchemaName` has to be
       * provided.
       */
      override fun schemaArn(schemaArn: String) {
        cdkBuilder.schemaArn(schemaArn)
      }

      /**
       * @param schemaName The name of the schema.
       * One of `SchemaArn` or `SchemaName` has to be provided.
       */
      override fun schemaName(schemaName: String) {
        cdkBuilder.schemaName(schemaName)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.SchemaIdProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.SchemaIdProperty,
    ) : CdkObject(cdkObject), SchemaIdProperty {
      /**
       * The name of the schema registry that contains the schema.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemaid.html#cfn-glue-table-schemaid-registryname)
       */
      override fun registryName(): String? = unwrap(this).getRegistryName()

      /**
       * The Amazon Resource Name (ARN) of the schema.
       *
       * One of `SchemaArn` or `SchemaName` has to be
       * provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemaid.html#cfn-glue-table-schemaid-schemaarn)
       */
      override fun schemaArn(): String? = unwrap(this).getSchemaArn()

      /**
       * The name of the schema.
       *
       * One of `SchemaArn` or `SchemaName` has to be provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-schemaid.html#cfn-glue-table-schemaid-schemaname)
       */
      override fun schemaName(): String? = unwrap(this).getSchemaName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.SchemaIdProperty):
          SchemaIdProperty = CdkObjectWrappers.wrap(cdkObject) as? SchemaIdProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaIdProperty):
          software.amazon.awscdk.services.glue.CfnTable.SchemaIdProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTable.SchemaIdProperty
    }
  }

  /**
   * Specifies an input structure that defines an Apache Iceberg metadata table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * IcebergInputProperty icebergInputProperty = IcebergInputProperty.builder()
   * .metadataOperation("metadataOperation")
   * .version("version")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-iceberginput.html)
   */
  public interface IcebergInputProperty {
    /**
     * A required metadata operation.
     *
     * Can only be set to CREATE.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-iceberginput.html#cfn-glue-table-iceberginput-metadataoperation)
     */
    public fun metadataOperation(): String? = unwrap(this).getMetadataOperation()

    /**
     * The table version for the Iceberg table.
     *
     * Defaults to 2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-iceberginput.html#cfn-glue-table-iceberginput-version)
     */
    public fun version(): String? = unwrap(this).getVersion()

    /**
     * A builder for [IcebergInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metadataOperation A required metadata operation.
       * Can only be set to CREATE.
       */
      public fun metadataOperation(metadataOperation: String)

      /**
       * @param version The table version for the Iceberg table.
       * Defaults to 2.
       */
      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTable.IcebergInputProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.IcebergInputProperty.builder()

      /**
       * @param metadataOperation A required metadata operation.
       * Can only be set to CREATE.
       */
      override fun metadataOperation(metadataOperation: String) {
        cdkBuilder.metadataOperation(metadataOperation)
      }

      /**
       * @param version The table version for the Iceberg table.
       * Defaults to 2.
       */
      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.IcebergInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.IcebergInputProperty,
    ) : CdkObject(cdkObject), IcebergInputProperty {
      /**
       * A required metadata operation.
       *
       * Can only be set to CREATE.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-iceberginput.html#cfn-glue-table-iceberginput-metadataoperation)
       */
      override fun metadataOperation(): String? = unwrap(this).getMetadataOperation()

      /**
       * The table version for the Iceberg table.
       *
       * Defaults to 2.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-iceberginput.html#cfn-glue-table-iceberginput-version)
       */
      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IcebergInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.IcebergInputProperty):
          IcebergInputProperty = CdkObjectWrappers.wrap(cdkObject) as? IcebergInputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IcebergInputProperty):
          software.amazon.awscdk.services.glue.CfnTable.IcebergInputProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTable.IcebergInputProperty
    }
  }

  /**
   * A column in a `Table` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * ColumnProperty columnProperty = ColumnProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .comment("comment")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html)
   */
  public interface ColumnProperty {
    /**
     * A free-form text comment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-comment)
     */
    public fun comment(): String? = unwrap(this).getComment()

    /**
     * The name of the `Column` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-name)
     */
    public fun name(): String

    /**
     * The data type of the `Column` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [ColumnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param comment A free-form text comment.
       */
      public fun comment(comment: String)

      /**
       * @param name The name of the `Column` . 
       */
      public fun name(name: String)

      /**
       * @param type The data type of the `Column` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTable.ColumnProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTable.ColumnProperty.builder()

      /**
       * @param comment A free-form text comment.
       */
      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      /**
       * @param name The name of the `Column` . 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type The data type of the `Column` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTable.ColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnTable.ColumnProperty,
    ) : CdkObject(cdkObject), ColumnProperty {
      /**
       * A free-form text comment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-comment)
       */
      override fun comment(): String? = unwrap(this).getComment()

      /**
       * The name of the `Column` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The data type of the `Column` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-column.html#cfn-glue-table-column-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTable.ColumnProperty):
          ColumnProperty = CdkObjectWrappers.wrap(cdkObject) as? ColumnProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnProperty):
          software.amazon.awscdk.services.glue.CfnTable.ColumnProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnTable.ColumnProperty
    }
  }
}
