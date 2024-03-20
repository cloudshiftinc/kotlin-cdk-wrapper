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
 * The `AWS::Glue::Partition` resource creates an AWS Glue partition, which represents a slice of
 * table data.
 *
 * For more information, see [CreatePartition
 * Action](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-partitions.html#aws-glue-api-catalog-partitions-CreatePartition)
 * and [Partition
 * Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-partitions.html#aws-glue-api-catalog-partitions-Partition)
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
 * CfnPartition cfnPartition = CfnPartition.Builder.create(this, "MyCfnPartition")
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .partitionInput(PartitionInputProperty.builder()
 * .values(List.of("values"))
 * // the properties below are optional
 * .parameters(parameters)
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
 * // the properties below are optional
 * .sortOrder(123)
 * .build()))
 * .storedAsSubDirectories(false)
 * .build())
 * .build())
 * .tableName("tableName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html)
 */
public open class CfnPartition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.glue.CfnPartition,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPartitionProps,
  ) :
      this(software.amazon.awscdk.services.glue.CfnPartition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnPartitionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPartitionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPartitionProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The AWS account ID of the catalog in which the partion is to be created.
   */
  public open fun catalogId(): String = unwrap(this).getCatalogId()

  /**
   * The AWS account ID of the catalog in which the partion is to be created.
   */
  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
  }

  /**
   * The name of the catalog database in which to create the partition.
   */
  public open fun databaseName(): String = unwrap(this).getDatabaseName()

  /**
   * The name of the catalog database in which to create the partition.
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
   * The structure used to create and update a partition.
   */
  public open fun partitionInput(): Any = unwrap(this).getPartitionInput()

  /**
   * The structure used to create and update a partition.
   */
  public open fun partitionInput(`value`: IResolvable) {
    unwrap(this).setPartitionInput(`value`.let(IResolvable::unwrap))
  }

  /**
   * The structure used to create and update a partition.
   */
  public open fun partitionInput(`value`: PartitionInputProperty) {
    unwrap(this).setPartitionInput(`value`.let(PartitionInputProperty::unwrap))
  }

  /**
   * The structure used to create and update a partition.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2c8b7d437210edad061772e588456f864d5cbcef2396715fd8ba0547b1a28f51")
  public open fun partitionInput(`value`: PartitionInputProperty.Builder.() -> Unit): Unit =
      partitionInput(PartitionInputProperty(`value`))

  /**
   * The name of the metadata table in which the partition is to be created.
   */
  public open fun tableName(): String = unwrap(this).getTableName()

  /**
   * The name of the metadata table in which the partition is to be created.
   */
  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnPartition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account ID of the catalog in which the partion is to be created.
     *
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-catalogid)
     * @param catalogId The AWS account ID of the catalog in which the partion is to be created. 
     */
    public fun catalogId(catalogId: String)

    /**
     * The name of the catalog database in which to create the partition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-databasename)
     * @param databaseName The name of the catalog database in which to create the partition. 
     */
    public fun databaseName(databaseName: String)

    /**
     * The structure used to create and update a partition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-partitioninput)
     * @param partitionInput The structure used to create and update a partition. 
     */
    public fun partitionInput(partitionInput: IResolvable)

    /**
     * The structure used to create and update a partition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-partitioninput)
     * @param partitionInput The structure used to create and update a partition. 
     */
    public fun partitionInput(partitionInput: PartitionInputProperty)

    /**
     * The structure used to create and update a partition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-partitioninput)
     * @param partitionInput The structure used to create and update a partition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13310d4b97ab5623df3f0de1f1e4731127a740a13dc005d8ef2bae156d6b2973")
    public fun partitionInput(partitionInput: PartitionInputProperty.Builder.() -> Unit)

    /**
     * The name of the metadata table in which the partition is to be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-tablename)
     * @param tableName The name of the metadata table in which the partition is to be created. 
     */
    public fun tableName(tableName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnPartition.Builder =
        software.amazon.awscdk.services.glue.CfnPartition.Builder.create(scope, id)

    /**
     * The AWS account ID of the catalog in which the partion is to be created.
     *
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-catalogid)
     * @param catalogId The AWS account ID of the catalog in which the partion is to be created. 
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * The name of the catalog database in which to create the partition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-databasename)
     * @param databaseName The name of the catalog database in which to create the partition. 
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * The structure used to create and update a partition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-partitioninput)
     * @param partitionInput The structure used to create and update a partition. 
     */
    override fun partitionInput(partitionInput: IResolvable) {
      cdkBuilder.partitionInput(partitionInput.let(IResolvable::unwrap))
    }

    /**
     * The structure used to create and update a partition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-partitioninput)
     * @param partitionInput The structure used to create and update a partition. 
     */
    override fun partitionInput(partitionInput: PartitionInputProperty) {
      cdkBuilder.partitionInput(partitionInput.let(PartitionInputProperty::unwrap))
    }

    /**
     * The structure used to create and update a partition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-partitioninput)
     * @param partitionInput The structure used to create and update a partition. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("13310d4b97ab5623df3f0de1f1e4731127a740a13dc005d8ef2bae156d6b2973")
    override fun partitionInput(partitionInput: PartitionInputProperty.Builder.() -> Unit): Unit =
        partitionInput(PartitionInputProperty(partitionInput))

    /**
     * The name of the metadata table in which the partition is to be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-tablename)
     * @param tableName The name of the metadata table in which the partition is to be created. 
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnPartition = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnPartition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPartition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPartition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition): CfnPartition =
        CfnPartition(cdkObject)

    internal fun unwrap(wrapped: CfnPartition): software.amazon.awscdk.services.glue.CfnPartition =
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
   * // the properties below are optional
   * .sortOrder(123)
   * .build()))
   * .storedAsSubDirectories(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html)
   */
  public interface StorageDescriptorProperty {
    /**
     * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-bucketcolumns)
     */
    public fun bucketColumns(): List<String> = unwrap(this).getBucketColumns() ?: emptyList()

    /**
     * A list of the `Columns` in the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-columns)
     */
    public fun columns(): Any? = unwrap(this).getColumns()

    /**
     * `True` if the data in the table is compressed, or `False` if not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-compressed)
     */
    public fun compressed(): Any? = unwrap(this).getCompressed()

    /**
     * The input format: `SequenceFileInputFormat` (binary), or `TextInputFormat` , or a custom
     * format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-inputformat)
     */
    public fun inputFormat(): String? = unwrap(this).getInputFormat()

    /**
     * The physical location of the table.
     *
     * By default, this takes the form of the warehouse location, followed by the database location
     * in the warehouse, followed by the table name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-location)
     */
    public fun location(): String? = unwrap(this).getLocation()

    /**
     * The number of buckets.
     *
     * You must specify this property if the partition contains any dimension columns.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-numberofbuckets)
     */
    public fun numberOfBuckets(): Number? = unwrap(this).getNumberOfBuckets()

    /**
     * The output format: `SequenceFileOutputFormat` (binary), or `IgnoreKeyTextOutputFormat` , or a
     * custom format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-outputformat)
     */
    public fun outputFormat(): String? = unwrap(this).getOutputFormat()

    /**
     * The user-supplied properties in key-value form.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * An object that references a schema stored in the AWS Glue Schema Registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-schemareference)
     */
    public fun schemaReference(): Any? = unwrap(this).getSchemaReference()

    /**
     * The serialization/deserialization (SerDe) information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-serdeinfo)
     */
    public fun serdeInfo(): Any? = unwrap(this).getSerdeInfo()

    /**
     * The information about values that appear frequently in a column (skewed values).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-skewedinfo)
     */
    public fun skewedInfo(): Any? = unwrap(this).getSkewedInfo()

    /**
     * A list specifying the sort order of each bucket in the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-sortcolumns)
     */
    public fun sortColumns(): Any? = unwrap(this).getSortColumns()

    /**
     * `True` if the table data is stored in subdirectories, or `False` if not.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-storedassubdirectories)
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
       * @param numberOfBuckets The number of buckets.
       * You must specify this property if the partition contains any dimension columns.
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
      @JvmName("e9c3efe0adf91e48ecefaa9660eab15f934953dd0f18001f7d18c407fddf154b")
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
      @JvmName("85c29376465bc74bcec0b7af8368bb60b1c26650f328b4ec2ec02f9246c9802c")
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
      @JvmName("ec641bc1fd863bb5524801e42a8d83f6d4af25f62d31ac79f4aae85a2b277a89")
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
          software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty.builder()

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
       * @param numberOfBuckets The number of buckets.
       * You must specify this property if the partition contains any dimension columns.
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
      @JvmName("e9c3efe0adf91e48ecefaa9660eab15f934953dd0f18001f7d18c407fddf154b")
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
      @JvmName("85c29376465bc74bcec0b7af8368bb60b1c26650f328b4ec2ec02f9246c9802c")
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
      @JvmName("ec641bc1fd863bb5524801e42a8d83f6d4af25f62d31ac79f4aae85a2b277a89")
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

      public fun build():
          software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty,
    ) : CdkObject(cdkObject), StorageDescriptorProperty {
      /**
       * A list of reducer grouping columns, clustering columns, and bucketing columns in the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-bucketcolumns)
       */
      override fun bucketColumns(): List<String> = unwrap(this).getBucketColumns() ?: emptyList()

      /**
       * A list of the `Columns` in the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-columns)
       */
      override fun columns(): Any? = unwrap(this).getColumns()

      /**
       * `True` if the data in the table is compressed, or `False` if not.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-compressed)
       */
      override fun compressed(): Any? = unwrap(this).getCompressed()

      /**
       * The input format: `SequenceFileInputFormat` (binary), or `TextInputFormat` , or a custom
       * format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-inputformat)
       */
      override fun inputFormat(): String? = unwrap(this).getInputFormat()

      /**
       * The physical location of the table.
       *
       * By default, this takes the form of the warehouse location, followed by the database
       * location in the warehouse, followed by the table name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-location)
       */
      override fun location(): String? = unwrap(this).getLocation()

      /**
       * The number of buckets.
       *
       * You must specify this property if the partition contains any dimension columns.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-numberofbuckets)
       */
      override fun numberOfBuckets(): Number? = unwrap(this).getNumberOfBuckets()

      /**
       * The output format: `SequenceFileOutputFormat` (binary), or `IgnoreKeyTextOutputFormat` , or
       * a custom format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-outputformat)
       */
      override fun outputFormat(): String? = unwrap(this).getOutputFormat()

      /**
       * The user-supplied properties in key-value form.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * An object that references a schema stored in the AWS Glue Schema Registry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-schemareference)
       */
      override fun schemaReference(): Any? = unwrap(this).getSchemaReference()

      /**
       * The serialization/deserialization (SerDe) information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-serdeinfo)
       */
      override fun serdeInfo(): Any? = unwrap(this).getSerdeInfo()

      /**
       * The information about values that appear frequently in a column (skewed values).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-skewedinfo)
       */
      override fun skewedInfo(): Any? = unwrap(this).getSkewedInfo()

      /**
       * A list specifying the sort order of each bucket in the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-sortcolumns)
       */
      override fun sortColumns(): Any? = unwrap(this).getSortColumns()

      /**
       * `True` if the table data is stored in subdirectories, or `False` if not.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-storedassubdirectories)
       */
      override fun storedAsSubDirectories(): Any? = unwrap(this).getStoredAsSubDirectories()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StorageDescriptorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty):
          StorageDescriptorProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StorageDescriptorProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StorageDescriptorProperty):
          software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnPartition.StorageDescriptorProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemaid.html)
   */
  public interface SchemaIdProperty {
    /**
     * The name of the schema registry that contains the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemaid.html#cfn-glue-partition-schemaid-registryname)
     */
    public fun registryName(): String? = unwrap(this).getRegistryName()

    /**
     * The Amazon Resource Name (ARN) of the schema.
     *
     * One of `SchemaArn` or `SchemaName` has to be
     * provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemaid.html#cfn-glue-partition-schemaid-schemaarn)
     */
    public fun schemaArn(): String? = unwrap(this).getSchemaArn()

    /**
     * The name of the schema.
     *
     * One of `SchemaArn` or `SchemaName` has to be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemaid.html#cfn-glue-partition-schemaid-schemaname)
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
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnPartition.SchemaIdProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.SchemaIdProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.glue.CfnPartition.SchemaIdProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnPartition.SchemaIdProperty,
    ) : CdkObject(cdkObject), SchemaIdProperty {
      /**
       * The name of the schema registry that contains the schema.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemaid.html#cfn-glue-partition-schemaid-registryname)
       */
      override fun registryName(): String? = unwrap(this).getRegistryName()

      /**
       * The Amazon Resource Name (ARN) of the schema.
       *
       * One of `SchemaArn` or `SchemaName` has to be
       * provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemaid.html#cfn-glue-partition-schemaid-schemaarn)
       */
      override fun schemaArn(): String? = unwrap(this).getSchemaArn()

      /**
       * The name of the schema.
       *
       * One of `SchemaArn` or `SchemaName` has to be provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemaid.html#cfn-glue-partition-schemaid-schemaname)
       */
      override fun schemaName(): String? = unwrap(this).getSchemaName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.SchemaIdProperty):
          SchemaIdProperty = CdkObjectWrappers.wrap(cdkObject) as? SchemaIdProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaIdProperty):
          software.amazon.awscdk.services.glue.CfnPartition.SchemaIdProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnPartition.SchemaIdProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html)
   */
  public interface ColumnProperty {
    /**
     * A free-form text comment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-comment)
     */
    public fun comment(): String? = unwrap(this).getComment()

    /**
     * The name of the `Column` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-name)
     */
    public fun name(): String

    /**
     * The data type of the `Column` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-type)
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
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnPartition.ColumnProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.ColumnProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.glue.CfnPartition.ColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnPartition.ColumnProperty,
    ) : CdkObject(cdkObject), ColumnProperty {
      /**
       * A free-form text comment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-comment)
       */
      override fun comment(): String? = unwrap(this).getComment()

      /**
       * The name of the `Column` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The data type of the `Column` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-column.html#cfn-glue-partition-column-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.ColumnProperty):
          ColumnProperty = CdkObjectWrappers.wrap(cdkObject) as? ColumnProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnProperty):
          software.amazon.awscdk.services.glue.CfnPartition.ColumnProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnPartition.ColumnProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemareference.html)
   */
  public interface SchemaReferenceProperty {
    /**
     * A structure that contains schema identity fields.
     *
     * Either this or the `SchemaVersionId` has to be
     * provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemareference.html#cfn-glue-partition-schemareference-schemaid)
     */
    public fun schemaId(): Any? = unwrap(this).getSchemaId()

    /**
     * The unique ID assigned to a version of the schema.
     *
     * Either this or the `SchemaId` has to be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemareference.html#cfn-glue-partition-schemareference-schemaversionid)
     */
    public fun schemaVersionId(): String? = unwrap(this).getSchemaVersionId()

    /**
     * The version number of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemareference.html#cfn-glue-partition-schemareference-schemaversionnumber)
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
      @JvmName("03ff2e1c9acdac33995fc8caefb6c46f55c96b6dc41840e421c805500d5d7e12")
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
          software.amazon.awscdk.services.glue.CfnPartition.SchemaReferenceProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.SchemaReferenceProperty.builder()

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
      @JvmName("03ff2e1c9acdac33995fc8caefb6c46f55c96b6dc41840e421c805500d5d7e12")
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

      public fun build(): software.amazon.awscdk.services.glue.CfnPartition.SchemaReferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnPartition.SchemaReferenceProperty,
    ) : CdkObject(cdkObject), SchemaReferenceProperty {
      /**
       * A structure that contains schema identity fields.
       *
       * Either this or the `SchemaVersionId` has to be
       * provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemareference.html#cfn-glue-partition-schemareference-schemaid)
       */
      override fun schemaId(): Any? = unwrap(this).getSchemaId()

      /**
       * The unique ID assigned to a version of the schema.
       *
       * Either this or the `SchemaId` has to be provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemareference.html#cfn-glue-partition-schemareference-schemaversionid)
       */
      override fun schemaVersionId(): String? = unwrap(this).getSchemaVersionId()

      /**
       * The version number of the schema.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-schemareference.html#cfn-glue-partition-schemareference-schemaversionnumber)
       */
      override fun schemaVersionNumber(): Number? = unwrap(this).getSchemaVersionNumber()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.SchemaReferenceProperty):
          SchemaReferenceProperty = CdkObjectWrappers.wrap(cdkObject) as? SchemaReferenceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaReferenceProperty):
          software.amazon.awscdk.services.glue.CfnPartition.SchemaReferenceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnPartition.SchemaReferenceProperty
    }
  }

  /**
   * The structure used to create and update a partition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * Object parameters;
   * Object skewedColumnValueLocationMaps;
   * PartitionInputProperty partitionInputProperty = PartitionInputProperty.builder()
   * .values(List.of("values"))
   * // the properties below are optional
   * .parameters(parameters)
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
   * // the properties below are optional
   * .sortOrder(123)
   * .build()))
   * .storedAsSubDirectories(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html)
   */
  public interface PartitionInputProperty {
    /**
     * These key-value pairs define partition parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * Provides information about the physical location where the partition is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-storagedescriptor)
     */
    public fun storageDescriptor(): Any? = unwrap(this).getStorageDescriptor()

    /**
     * The values of the partition.
     *
     * Although this parameter is not required by the SDK, you must specify this parameter for a
     * valid input.
     *
     * The values for the keys for the new partition must be passed as an array of String objects
     * that must be ordered in the same order as the partition keys appearing in the Amazon S3 prefix.
     * Otherwise AWS Glue will add the values to the wrong keys.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [PartitionInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameters These key-value pairs define partition parameters.
       */
      public fun parameters(parameters: Any)

      /**
       * @param storageDescriptor Provides information about the physical location where the
       * partition is stored.
       */
      public fun storageDescriptor(storageDescriptor: IResolvable)

      /**
       * @param storageDescriptor Provides information about the physical location where the
       * partition is stored.
       */
      public fun storageDescriptor(storageDescriptor: StorageDescriptorProperty)

      /**
       * @param storageDescriptor Provides information about the physical location where the
       * partition is stored.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("949cf435c9353952c473055192374a4c38ddaf89d8f8a3a99d4aab181a8518a1")
      public fun storageDescriptor(storageDescriptor: StorageDescriptorProperty.Builder.() -> Unit)

      /**
       * @param values The values of the partition. 
       * Although this parameter is not required by the SDK, you must specify this parameter for a
       * valid input.
       *
       * The values for the keys for the new partition must be passed as an array of String objects
       * that must be ordered in the same order as the partition keys appearing in the Amazon S3
       * prefix. Otherwise AWS Glue will add the values to the wrong keys.
       */
      public fun values(values: List<String>)

      /**
       * @param values The values of the partition. 
       * Although this parameter is not required by the SDK, you must specify this parameter for a
       * valid input.
       *
       * The values for the keys for the new partition must be passed as an array of String objects
       * that must be ordered in the same order as the partition keys appearing in the Amazon S3
       * prefix. Otherwise AWS Glue will add the values to the wrong keys.
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty.builder()

      /**
       * @param parameters These key-value pairs define partition parameters.
       */
      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param storageDescriptor Provides information about the physical location where the
       * partition is stored.
       */
      override fun storageDescriptor(storageDescriptor: IResolvable) {
        cdkBuilder.storageDescriptor(storageDescriptor.let(IResolvable::unwrap))
      }

      /**
       * @param storageDescriptor Provides information about the physical location where the
       * partition is stored.
       */
      override fun storageDescriptor(storageDescriptor: StorageDescriptorProperty) {
        cdkBuilder.storageDescriptor(storageDescriptor.let(StorageDescriptorProperty::unwrap))
      }

      /**
       * @param storageDescriptor Provides information about the physical location where the
       * partition is stored.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("949cf435c9353952c473055192374a4c38ddaf89d8f8a3a99d4aab181a8518a1")
      override
          fun storageDescriptor(storageDescriptor: StorageDescriptorProperty.Builder.() -> Unit):
          Unit = storageDescriptor(StorageDescriptorProperty(storageDescriptor))

      /**
       * @param values The values of the partition. 
       * Although this parameter is not required by the SDK, you must specify this parameter for a
       * valid input.
       *
       * The values for the keys for the new partition must be passed as an array of String objects
       * that must be ordered in the same order as the partition keys appearing in the Amazon S3
       * prefix. Otherwise AWS Glue will add the values to the wrong keys.
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The values of the partition. 
       * Although this parameter is not required by the SDK, you must specify this parameter for a
       * valid input.
       *
       * The values for the keys for the new partition must be passed as an array of String objects
       * that must be ordered in the same order as the partition keys appearing in the Amazon S3
       * prefix. Otherwise AWS Glue will add the values to the wrong keys.
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty,
    ) : CdkObject(cdkObject), PartitionInputProperty {
      /**
       * These key-value pairs define partition parameters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * Provides information about the physical location where the partition is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-storagedescriptor)
       */
      override fun storageDescriptor(): Any? = unwrap(this).getStorageDescriptor()

      /**
       * The values of the partition.
       *
       * Although this parameter is not required by the SDK, you must specify this parameter for a
       * valid input.
       *
       * The values for the keys for the new partition must be passed as an array of String objects
       * that must be ordered in the same order as the partition keys appearing in the Amazon S3
       * prefix. Otherwise AWS Glue will add the values to the wrong keys.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html#cfn-glue-partition-partitioninput-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PartitionInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty):
          PartitionInputProperty = CdkObjectWrappers.wrap(cdkObject) as? PartitionInputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PartitionInputProperty):
          software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnPartition.PartitionInputProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html)
   */
  public interface SkewedInfoProperty {
    /**
     * A list of names of columns that contain skewed values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnnames)
     */
    public fun skewedColumnNames(): List<String> = unwrap(this).getSkewedColumnNames() ?:
        emptyList()

    /**
     * A mapping of skewed values to the columns that contain them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnvaluelocationmaps)
     */
    public fun skewedColumnValueLocationMaps(): Any? =
        unwrap(this).getSkewedColumnValueLocationMaps()

    /**
     * A list of values that appear so frequently as to be considered skewed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnvalues)
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
          software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty,
    ) : CdkObject(cdkObject), SkewedInfoProperty {
      /**
       * A list of names of columns that contain skewed values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnnames)
       */
      override fun skewedColumnNames(): List<String> = unwrap(this).getSkewedColumnNames() ?:
          emptyList()

      /**
       * A mapping of skewed values to the columns that contain them.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnvaluelocationmaps)
       */
      override fun skewedColumnValueLocationMaps(): Any? =
          unwrap(this).getSkewedColumnValueLocationMaps()

      /**
       * A list of values that appear so frequently as to be considered skewed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html#cfn-glue-partition-skewedinfo-skewedcolumnvalues)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty):
          SkewedInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? SkewedInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SkewedInfoProperty):
          software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnPartition.SkewedInfoProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html)
   */
  public interface SerdeInfoProperty {
    /**
     * Name of the SerDe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * These key-value pairs define initialization parameters for the SerDe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * Usually the class that implements the SerDe.
     *
     * An example is `org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-serializationlibrary)
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
          software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty,
    ) : CdkObject(cdkObject), SerdeInfoProperty {
      /**
       * Name of the SerDe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * These key-value pairs define initialization parameters for the SerDe.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * Usually the class that implements the SerDe.
       *
       * An example is `org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html#cfn-glue-partition-serdeinfo-serializationlibrary)
       */
      override fun serializationLibrary(): String? = unwrap(this).getSerializationLibrary()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SerdeInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty):
          SerdeInfoProperty = CdkObjectWrappers.wrap(cdkObject) as? SerdeInfoProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SerdeInfoProperty):
          software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnPartition.SerdeInfoProperty
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
   * // the properties below are optional
   * .sortOrder(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html)
   */
  public interface OrderProperty {
    /**
     * The name of the column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-column)
     */
    public fun column(): String

    /**
     * Indicates that the column is sorted in ascending order ( `== 1` ), or in descending order (
     * `==0` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-sortorder)
     */
    public fun sortOrder(): Number? = unwrap(this).getSortOrder()

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
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnPartition.OrderProperty.Builder =
          software.amazon.awscdk.services.glue.CfnPartition.OrderProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.glue.CfnPartition.OrderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnPartition.OrderProperty,
    ) : CdkObject(cdkObject), OrderProperty {
      /**
       * The name of the column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-column)
       */
      override fun column(): String = unwrap(this).getColumn()

      /**
       * Indicates that the column is sorted in ascending order ( `== 1` ), or in descending order (
       * `==0` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-sortorder)
       */
      override fun sortOrder(): Number? = unwrap(this).getSortOrder()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OrderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnPartition.OrderProperty):
          OrderProperty = CdkObjectWrappers.wrap(cdkObject) as? OrderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OrderProperty):
          software.amazon.awscdk.services.glue.CfnPartition.OrderProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnPartition.OrderProperty
    }
  }
}
