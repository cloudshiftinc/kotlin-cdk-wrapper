@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.timestream

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The CreateTable operation adds a new table to an existing database in your account.
 *
 * In an AWS account, table names must be at least unique within each Region if they are in the same
 * database. You may have identical table names in the same Region if the tables are in separate
 * databases. While creating the table, you must specify the table name, database name, and the
 * retention properties. [Service quotas
 * apply](https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html) . See [code
 * sample](https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.create-table.html)
 * for details.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.timestream.*;
 * Object magneticStoreWriteProperties;
 * Object retentionProperties;
 * CfnTable cfnTable = CfnTable.Builder.create(this, "MyCfnTable")
 * .databaseName("databaseName")
 * // the properties below are optional
 * .magneticStoreWriteProperties(magneticStoreWriteProperties)
 * .retentionProperties(retentionProperties)
 * .schema(SchemaProperty.builder()
 * .compositePartitionKey(List.of(PartitionKeyProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .enforcementInRecord("enforcementInRecord")
 * .name("name")
 * .build()))
 * .build())
 * .tableName("tableName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html)
 */
public open class CfnTable internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.timestream.CfnTable,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The `arn` of the table.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of the table.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The name of the Timestream database that contains this table.
   */
  public open fun databaseName(): String = unwrap(this).getDatabaseName()

  /**
   * The name of the Timestream database that contains this table.
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
   * Contains properties to set on the table when enabling magnetic store writes.
   */
  public open fun magneticStoreWriteProperties(): Any? =
      unwrap(this).getMagneticStoreWriteProperties()

  /**
   * Contains properties to set on the table when enabling magnetic store writes.
   */
  public open fun magneticStoreWriteProperties(`value`: Any) {
    unwrap(this).setMagneticStoreWriteProperties(`value`)
  }

  /**
   * The retention duration for the memory store and magnetic store.
   *
   * This object has the following attributes:.
   */
  public open fun retentionProperties(): Any? = unwrap(this).getRetentionProperties()

  /**
   * The retention duration for the memory store and magnetic store.
   *
   * This object has the following attributes:.
   */
  public open fun retentionProperties(`value`: Any) {
    unwrap(this).setRetentionProperties(`value`)
  }

  /**
   * The schema of the table.
   */
  public open fun schema(): Any? = unwrap(this).getSchema()

  /**
   * The schema of the table.
   */
  public open fun schema(`value`: IResolvable) {
    unwrap(this).setSchema(`value`.let(IResolvable::unwrap))
  }

  /**
   * The schema of the table.
   */
  public open fun schema(`value`: SchemaProperty) {
    unwrap(this).setSchema(`value`.let(SchemaProperty::unwrap))
  }

  /**
   * The schema of the table.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("898ec461486903bfb2f445f8579fd860b99ac9ac5c95b607446ed45b49d10513")
  public open fun schema(`value`: SchemaProperty.Builder.() -> Unit): Unit =
      schema(SchemaProperty(`value`))

  /**
   * The name of the Timestream table.
   */
  public open fun tableName(): String? = unwrap(this).getTableName()

  /**
   * The name of the Timestream table.
   */
  public open fun tableName(`value`: String) {
    unwrap(this).setTableName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to add to the table.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to add to the table.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to add to the table.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.timestream.CfnTable].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Timestream database that contains this table.
     *
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-databasename)
     * @param databaseName The name of the Timestream database that contains this table. 
     */
    public fun databaseName(databaseName: String)

    /**
     * Contains properties to set on the table when enabling magnetic store writes.
     *
     * This object has the following attributes:
     *
     * * *EnableMagneticStoreWrites* : A `boolean` flag to enable magnetic store writes.
     * * *MagneticStoreRejectedDataLocation* : The location to write error reports for records
     * rejected, asynchronously, during magnetic store writes. Only `S3Configuration` objects are
     * allowed. The `S3Configuration` object has the following attributes:
     * * *BucketName* : The name of the S3 bucket.
     * * *EncryptionOption* : The encryption option for the S3 location. Valid values are S3
     * server-side encryption with an S3 managed key ( `SSE_S3` ) or AWS managed key ( `SSE_KMS` ).
     * * *KmsKeyId* : The AWS KMS key ID to use when encrypting with an AWS managed key.
     * * *ObjectKeyPrefix* : The prefix to use option for the objects stored in S3.
     *
     * Both `BucketName` and `EncryptionOption` are *required* when `S3Configuration` is specified.
     * If you specify `SSE_KMS` as your `EncryptionOption` then `KmsKeyId` is *required* .
     *
     * `EnableMagneticStoreWrites` attribute is *required* when `MagneticStoreWriteProperties` is
     * specified. `MagneticStoreRejectedDataLocation` attribute is *required* when
     * `EnableMagneticStoreWrites` is set to `true` .
     *
     * See the following examples:
     *
     * *JSON*
     *
     * ```
     * { "Type" : AWS::Timestream::Table", "Properties":{ "DatabaseName":"TestDatabase",
     * "TableName":"TestTable", "MagneticStoreWriteProperties":{ "EnableMagneticStoreWrites":true,
     * "MagneticStoreRejectedDataLocation":{ "S3Configuration":{ "BucketName":"testbucket",
     * "EncryptionOption":"SSE_KMS", "KmsKeyId":"1234abcd-12ab-34cd-56ef-1234567890ab",
     * "ObjectKeyPrefix":"prefix" } } } }
     * }
     * ```
     *
     * *YAML*
     *
     * ```
     * Type: AWS::Timestream::Table
     * DependsOn: TestDatabase
     * Properties: TableName: "TestTable" DatabaseName: "TestDatabase" MagneticStoreWriteProperties:
     * EnableMagneticStoreWrites: true MagneticStoreRejectedDataLocation: S3Configuration: BucketName:
     * "testbucket" EncryptionOption: "SSE_KMS" KmsKeyId: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * ObjectKeyPrefix: "prefix"
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-magneticstorewriteproperties)
     * @param magneticStoreWriteProperties Contains properties to set on the table when enabling
     * magnetic store writes. 
     */
    public fun magneticStoreWriteProperties(magneticStoreWriteProperties: Any)

    /**
     * The retention duration for the memory store and magnetic store. This object has the following
     * attributes:.
     *
     * * *MemoryStoreRetentionPeriodInHours* : Retention duration for memory store, in hours.
     * * *MagneticStoreRetentionPeriodInDays* : Retention duration for magnetic store, in days.
     *
     * Both attributes are of type `string` . Both attributes are *required* when
     * `RetentionProperties` is specified.
     *
     * See the following examples:
     *
     * *JSON*
     *
     * `{ "Type" : AWS::Timestream::Table", "Properties" : { "DatabaseName" : "TestDatabase",
     * "TableName" : "TestTable", "RetentionProperties" : { "MemoryStoreRetentionPeriodInHours": "24",
     * "MagneticStoreRetentionPeriodInDays": "7" } } }`
     *
     * *YAML*
     *
     * ```
     * Type: AWS::Timestream::Table
     * DependsOn: TestDatabase
     * Properties: TableName: "TestTable" DatabaseName: "TestDatabase" RetentionProperties:
     * MemoryStoreRetentionPeriodInHours: "24" MagneticStoreRetentionPeriodInDays: "7"
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-retentionproperties)
     * @param retentionProperties The retention duration for the memory store and magnetic store.
     * This object has the following attributes:. 
     */
    public fun retentionProperties(retentionProperties: Any)

    /**
     * The schema of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-schema)
     * @param schema The schema of the table. 
     */
    public fun schema(schema: IResolvable)

    /**
     * The schema of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-schema)
     * @param schema The schema of the table. 
     */
    public fun schema(schema: SchemaProperty)

    /**
     * The schema of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-schema)
     * @param schema The schema of the table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21bcbf5f6346b7e1bf71608e43f5642d4324e83cf893c4df218d01acd50a40e9")
    public fun schema(schema: SchemaProperty.Builder.() -> Unit)

    /**
     * The name of the Timestream table.
     *
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-tablename)
     * @param tableName The name of the Timestream table. 
     */
    public fun tableName(tableName: String)

    /**
     * The tags to add to the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-tags)
     * @param tags The tags to add to the table. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to add to the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-tags)
     * @param tags The tags to add to the table. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.timestream.CfnTable.Builder =
        software.amazon.awscdk.services.timestream.CfnTable.Builder.create(scope, id)

    /**
     * The name of the Timestream database that contains this table.
     *
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-databasename)
     * @param databaseName The name of the Timestream database that contains this table. 
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * Contains properties to set on the table when enabling magnetic store writes.
     *
     * This object has the following attributes:
     *
     * * *EnableMagneticStoreWrites* : A `boolean` flag to enable magnetic store writes.
     * * *MagneticStoreRejectedDataLocation* : The location to write error reports for records
     * rejected, asynchronously, during magnetic store writes. Only `S3Configuration` objects are
     * allowed. The `S3Configuration` object has the following attributes:
     * * *BucketName* : The name of the S3 bucket.
     * * *EncryptionOption* : The encryption option for the S3 location. Valid values are S3
     * server-side encryption with an S3 managed key ( `SSE_S3` ) or AWS managed key ( `SSE_KMS` ).
     * * *KmsKeyId* : The AWS KMS key ID to use when encrypting with an AWS managed key.
     * * *ObjectKeyPrefix* : The prefix to use option for the objects stored in S3.
     *
     * Both `BucketName` and `EncryptionOption` are *required* when `S3Configuration` is specified.
     * If you specify `SSE_KMS` as your `EncryptionOption` then `KmsKeyId` is *required* .
     *
     * `EnableMagneticStoreWrites` attribute is *required* when `MagneticStoreWriteProperties` is
     * specified. `MagneticStoreRejectedDataLocation` attribute is *required* when
     * `EnableMagneticStoreWrites` is set to `true` .
     *
     * See the following examples:
     *
     * *JSON*
     *
     * ```
     * { "Type" : AWS::Timestream::Table", "Properties":{ "DatabaseName":"TestDatabase",
     * "TableName":"TestTable", "MagneticStoreWriteProperties":{ "EnableMagneticStoreWrites":true,
     * "MagneticStoreRejectedDataLocation":{ "S3Configuration":{ "BucketName":"testbucket",
     * "EncryptionOption":"SSE_KMS", "KmsKeyId":"1234abcd-12ab-34cd-56ef-1234567890ab",
     * "ObjectKeyPrefix":"prefix" } } } }
     * }
     * ```
     *
     * *YAML*
     *
     * ```
     * Type: AWS::Timestream::Table
     * DependsOn: TestDatabase
     * Properties: TableName: "TestTable" DatabaseName: "TestDatabase" MagneticStoreWriteProperties:
     * EnableMagneticStoreWrites: true MagneticStoreRejectedDataLocation: S3Configuration: BucketName:
     * "testbucket" EncryptionOption: "SSE_KMS" KmsKeyId: "1234abcd-12ab-34cd-56ef-1234567890ab"
     * ObjectKeyPrefix: "prefix"
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-magneticstorewriteproperties)
     * @param magneticStoreWriteProperties Contains properties to set on the table when enabling
     * magnetic store writes. 
     */
    override fun magneticStoreWriteProperties(magneticStoreWriteProperties: Any) {
      cdkBuilder.magneticStoreWriteProperties(magneticStoreWriteProperties)
    }

    /**
     * The retention duration for the memory store and magnetic store. This object has the following
     * attributes:.
     *
     * * *MemoryStoreRetentionPeriodInHours* : Retention duration for memory store, in hours.
     * * *MagneticStoreRetentionPeriodInDays* : Retention duration for magnetic store, in days.
     *
     * Both attributes are of type `string` . Both attributes are *required* when
     * `RetentionProperties` is specified.
     *
     * See the following examples:
     *
     * *JSON*
     *
     * `{ "Type" : AWS::Timestream::Table", "Properties" : { "DatabaseName" : "TestDatabase",
     * "TableName" : "TestTable", "RetentionProperties" : { "MemoryStoreRetentionPeriodInHours": "24",
     * "MagneticStoreRetentionPeriodInDays": "7" } } }`
     *
     * *YAML*
     *
     * ```
     * Type: AWS::Timestream::Table
     * DependsOn: TestDatabase
     * Properties: TableName: "TestTable" DatabaseName: "TestDatabase" RetentionProperties:
     * MemoryStoreRetentionPeriodInHours: "24" MagneticStoreRetentionPeriodInDays: "7"
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-retentionproperties)
     * @param retentionProperties The retention duration for the memory store and magnetic store.
     * This object has the following attributes:. 
     */
    override fun retentionProperties(retentionProperties: Any) {
      cdkBuilder.retentionProperties(retentionProperties)
    }

    /**
     * The schema of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-schema)
     * @param schema The schema of the table. 
     */
    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable::unwrap))
    }

    /**
     * The schema of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-schema)
     * @param schema The schema of the table. 
     */
    override fun schema(schema: SchemaProperty) {
      cdkBuilder.schema(schema.let(SchemaProperty::unwrap))
    }

    /**
     * The schema of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-schema)
     * @param schema The schema of the table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21bcbf5f6346b7e1bf71608e43f5642d4324e83cf893c4df218d01acd50a40e9")
    override fun schema(schema: SchemaProperty.Builder.() -> Unit): Unit =
        schema(SchemaProperty(schema))

    /**
     * The name of the Timestream table.
     *
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-tablename)
     * @param tableName The name of the Timestream table. 
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    /**
     * The tags to add to the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-tags)
     * @param tags The tags to add to the table. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to add to the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-tags)
     * @param tags The tags to add to the table. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.timestream.CfnTable = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.timestream.CfnTable.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTable): CfnTable =
        CfnTable(cdkObject)

    internal fun unwrap(wrapped: CfnTable): software.amazon.awscdk.services.timestream.CfnTable =
        wrapped.cdkObject
  }

  /**
   * The set of properties on a table for configuring magnetic store writes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.timestream.*;
   * MagneticStoreWritePropertiesProperty magneticStoreWritePropertiesProperty =
   * MagneticStoreWritePropertiesProperty.builder()
   * .enableMagneticStoreWrites(false)
   * // the properties below are optional
   * .magneticStoreRejectedDataLocation(MagneticStoreRejectedDataLocationProperty.builder()
   * .s3Configuration(S3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKeyId("kmsKeyId")
   * .objectKeyPrefix("objectKeyPrefix")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-magneticstorewriteproperties.html)
   */
  public interface MagneticStoreWritePropertiesProperty {
    /**
     * A flag to enable magnetic store writes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-magneticstorewriteproperties.html#cfn-timestream-table-magneticstorewriteproperties-enablemagneticstorewrites)
     */
    public fun enableMagneticStoreWrites(): Any

    /**
     * The location to write error reports for records rejected asynchronously during magnetic store
     * writes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-magneticstorewriteproperties.html#cfn-timestream-table-magneticstorewriteproperties-magneticstorerejecteddatalocation)
     */
    public fun magneticStoreRejectedDataLocation(): Any? =
        unwrap(this).getMagneticStoreRejectedDataLocation()

    /**
     * A builder for [MagneticStoreWritePropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enableMagneticStoreWrites A flag to enable magnetic store writes. 
       */
      public fun enableMagneticStoreWrites(enableMagneticStoreWrites: Boolean)

      /**
       * @param enableMagneticStoreWrites A flag to enable magnetic store writes. 
       */
      public fun enableMagneticStoreWrites(enableMagneticStoreWrites: IResolvable)

      /**
       * @param magneticStoreRejectedDataLocation The location to write error reports for records
       * rejected asynchronously during magnetic store writes.
       */
      public fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: IResolvable)

      /**
       * @param magneticStoreRejectedDataLocation The location to write error reports for records
       * rejected asynchronously during magnetic store writes.
       */
      public
          fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: MagneticStoreRejectedDataLocationProperty)

      /**
       * @param magneticStoreRejectedDataLocation The location to write error reports for records
       * rejected asynchronously during magnetic store writes.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c569486247805444394ade6f2fe0afbacaa1cd8b23b4f320fb2d85c552783ecb")
      public
          fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: MagneticStoreRejectedDataLocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreWritePropertiesProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreWritePropertiesProperty.builder()

      /**
       * @param enableMagneticStoreWrites A flag to enable magnetic store writes. 
       */
      override fun enableMagneticStoreWrites(enableMagneticStoreWrites: Boolean) {
        cdkBuilder.enableMagneticStoreWrites(enableMagneticStoreWrites)
      }

      /**
       * @param enableMagneticStoreWrites A flag to enable magnetic store writes. 
       */
      override fun enableMagneticStoreWrites(enableMagneticStoreWrites: IResolvable) {
        cdkBuilder.enableMagneticStoreWrites(enableMagneticStoreWrites.let(IResolvable::unwrap))
      }

      /**
       * @param magneticStoreRejectedDataLocation The location to write error reports for records
       * rejected asynchronously during magnetic store writes.
       */
      override
          fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: IResolvable) {
        cdkBuilder.magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation.let(IResolvable::unwrap))
      }

      /**
       * @param magneticStoreRejectedDataLocation The location to write error reports for records
       * rejected asynchronously during magnetic store writes.
       */
      override
          fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: MagneticStoreRejectedDataLocationProperty) {
        cdkBuilder.magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation.let(MagneticStoreRejectedDataLocationProperty::unwrap))
      }

      /**
       * @param magneticStoreRejectedDataLocation The location to write error reports for records
       * rejected asynchronously during magnetic store writes.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c569486247805444394ade6f2fe0afbacaa1cd8b23b4f320fb2d85c552783ecb")
      override
          fun magneticStoreRejectedDataLocation(magneticStoreRejectedDataLocation: MagneticStoreRejectedDataLocationProperty.Builder.() -> Unit):
          Unit =
          magneticStoreRejectedDataLocation(MagneticStoreRejectedDataLocationProperty(magneticStoreRejectedDataLocation))

      public fun build():
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreWritePropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreWritePropertiesProperty,
    ) : CdkObject(cdkObject), MagneticStoreWritePropertiesProperty {
      /**
       * A flag to enable magnetic store writes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-magneticstorewriteproperties.html#cfn-timestream-table-magneticstorewriteproperties-enablemagneticstorewrites)
       */
      override fun enableMagneticStoreWrites(): Any = unwrap(this).getEnableMagneticStoreWrites()

      /**
       * The location to write error reports for records rejected asynchronously during magnetic
       * store writes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-magneticstorewriteproperties.html#cfn-timestream-table-magneticstorewriteproperties-magneticstorerejecteddatalocation)
       */
      override fun magneticStoreRejectedDataLocation(): Any? =
          unwrap(this).getMagneticStoreRejectedDataLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MagneticStoreWritePropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreWritePropertiesProperty):
          MagneticStoreWritePropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as
          MagneticStoreWritePropertiesProperty

      internal fun unwrap(wrapped: MagneticStoreWritePropertiesProperty):
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreWritePropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreWritePropertiesProperty
    }
  }

  /**
   * The configuration that specifies an S3 location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.timestream.*;
   * S3ConfigurationProperty s3ConfigurationProperty = S3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKeyId("kmsKeyId")
   * .objectKeyPrefix("objectKeyPrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-s3configuration.html)
   */
  public interface S3ConfigurationProperty {
    /**
     * The bucket name of the customer S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-s3configuration.html#cfn-timestream-table-s3configuration-bucketname)
     */
    public fun bucketName(): String

    /**
     * The encryption option for the customer S3 location.
     *
     * Options are S3 server-side encryption with an S3 managed key or AWS managed key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-s3configuration.html#cfn-timestream-table-s3configuration-encryptionoption)
     */
    public fun encryptionOption(): String

    /**
     * The AWS KMS key ID for the customer S3 location when encrypting with an AWS managed key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-s3configuration.html#cfn-timestream-table-s3configuration-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The object key preview for the customer S3 location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-s3configuration.html#cfn-timestream-table-s3configuration-objectkeyprefix)
     */
    public fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()

    /**
     * A builder for [S3ConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The bucket name of the customer S3 bucket. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param encryptionOption The encryption option for the customer S3 location. 
       * Options are S3 server-side encryption with an S3 managed key or AWS managed key.
       */
      public fun encryptionOption(encryptionOption: String)

      /**
       * @param kmsKeyId The AWS KMS key ID for the customer S3 location when encrypting with an AWS
       * managed key.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param objectKeyPrefix The object key preview for the customer S3 location.
       */
      public fun objectKeyPrefix(objectKeyPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnTable.S3ConfigurationProperty.Builder =
          software.amazon.awscdk.services.timestream.CfnTable.S3ConfigurationProperty.builder()

      /**
       * @param bucketName The bucket name of the customer S3 bucket. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param encryptionOption The encryption option for the customer S3 location. 
       * Options are S3 server-side encryption with an S3 managed key or AWS managed key.
       */
      override fun encryptionOption(encryptionOption: String) {
        cdkBuilder.encryptionOption(encryptionOption)
      }

      /**
       * @param kmsKeyId The AWS KMS key ID for the customer S3 location when encrypting with an AWS
       * managed key.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param objectKeyPrefix The object key preview for the customer S3 location.
       */
      override fun objectKeyPrefix(objectKeyPrefix: String) {
        cdkBuilder.objectKeyPrefix(objectKeyPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.timestream.CfnTable.S3ConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.timestream.CfnTable.S3ConfigurationProperty,
    ) : CdkObject(cdkObject), S3ConfigurationProperty {
      /**
       * The bucket name of the customer S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-s3configuration.html#cfn-timestream-table-s3configuration-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * The encryption option for the customer S3 location.
       *
       * Options are S3 server-side encryption with an S3 managed key or AWS managed key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-s3configuration.html#cfn-timestream-table-s3configuration-encryptionoption)
       */
      override fun encryptionOption(): String = unwrap(this).getEncryptionOption()

      /**
       * The AWS KMS key ID for the customer S3 location when encrypting with an AWS managed key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-s3configuration.html#cfn-timestream-table-s3configuration-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The object key preview for the customer S3 location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-s3configuration.html#cfn-timestream-table-s3configuration-objectkeyprefix)
       */
      override fun objectKeyPrefix(): String? = unwrap(this).getObjectKeyPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTable.S3ConfigurationProperty):
          S3ConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as S3ConfigurationProperty

      internal fun unwrap(wrapped: S3ConfigurationProperty):
          software.amazon.awscdk.services.timestream.CfnTable.S3ConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.timestream.CfnTable.S3ConfigurationProperty
    }
  }

  /**
   * The location to write error reports for records rejected, asynchronously, during magnetic store
   * writes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.timestream.*;
   * MagneticStoreRejectedDataLocationProperty magneticStoreRejectedDataLocationProperty =
   * MagneticStoreRejectedDataLocationProperty.builder()
   * .s3Configuration(S3ConfigurationProperty.builder()
   * .bucketName("bucketName")
   * .encryptionOption("encryptionOption")
   * // the properties below are optional
   * .kmsKeyId("kmsKeyId")
   * .objectKeyPrefix("objectKeyPrefix")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-magneticstorerejecteddatalocation.html)
   */
  public interface MagneticStoreRejectedDataLocationProperty {
    /**
     * Configuration of an S3 location to write error reports for records rejected, asynchronously,
     * during magnetic store writes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-magneticstorerejecteddatalocation.html#cfn-timestream-table-magneticstorerejecteddatalocation-s3configuration)
     */
    public fun s3Configuration(): Any? = unwrap(this).getS3Configuration()

    /**
     * A builder for [MagneticStoreRejectedDataLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Configuration Configuration of an S3 location to write error reports for records
       * rejected, asynchronously, during magnetic store writes.
       */
      public fun s3Configuration(s3Configuration: IResolvable)

      /**
       * @param s3Configuration Configuration of an S3 location to write error reports for records
       * rejected, asynchronously, during magnetic store writes.
       */
      public fun s3Configuration(s3Configuration: S3ConfigurationProperty)

      /**
       * @param s3Configuration Configuration of an S3 location to write error reports for records
       * rejected, asynchronously, during magnetic store writes.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10e1eb1148b8aba7ae6adac45f114bd752ea2d64d79ab505728e036970edb4c7")
      public fun s3Configuration(s3Configuration: S3ConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreRejectedDataLocationProperty.Builder
          =
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreRejectedDataLocationProperty.builder()

      /**
       * @param s3Configuration Configuration of an S3 location to write error reports for records
       * rejected, asynchronously, during magnetic store writes.
       */
      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      /**
       * @param s3Configuration Configuration of an S3 location to write error reports for records
       * rejected, asynchronously, during magnetic store writes.
       */
      override fun s3Configuration(s3Configuration: S3ConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3ConfigurationProperty::unwrap))
      }

      /**
       * @param s3Configuration Configuration of an S3 location to write error reports for records
       * rejected, asynchronously, during magnetic store writes.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10e1eb1148b8aba7ae6adac45f114bd752ea2d64d79ab505728e036970edb4c7")
      override fun s3Configuration(s3Configuration: S3ConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3ConfigurationProperty(s3Configuration))

      public fun build():
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreRejectedDataLocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreRejectedDataLocationProperty,
    ) : CdkObject(cdkObject), MagneticStoreRejectedDataLocationProperty {
      /**
       * Configuration of an S3 location to write error reports for records rejected,
       * asynchronously, during magnetic store writes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-magneticstorerejecteddatalocation.html#cfn-timestream-table-magneticstorerejecteddatalocation-s3configuration)
       */
      override fun s3Configuration(): Any? = unwrap(this).getS3Configuration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MagneticStoreRejectedDataLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreRejectedDataLocationProperty):
          MagneticStoreRejectedDataLocationProperty = CdkObjectWrappers.wrap(cdkObject) as
          MagneticStoreRejectedDataLocationProperty

      internal fun unwrap(wrapped: MagneticStoreRejectedDataLocationProperty):
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreRejectedDataLocationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.timestream.CfnTable.MagneticStoreRejectedDataLocationProperty
    }
  }

  /**
   * An attribute used in partitioning data in a table.
   *
   * A dimension key partitions data using the values of the dimension specified by the
   * dimension-name as partition key, while a measure key partitions data using measure names (values
   * of the 'measure_name' column).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.timestream.*;
   * PartitionKeyProperty partitionKeyProperty = PartitionKeyProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .enforcementInRecord("enforcementInRecord")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-partitionkey.html)
   */
  public interface PartitionKeyProperty {
    /**
     * The level of enforcement for the specification of a dimension key in ingested records.
     *
     * Options are REQUIRED (dimension key must be specified) and OPTIONAL (dimension key does not
     * have to be specified).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-partitionkey.html#cfn-timestream-table-partitionkey-enforcementinrecord)
     */
    public fun enforcementInRecord(): String? = unwrap(this).getEnforcementInRecord()

    /**
     * The name of the attribute used for a dimension key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-partitionkey.html#cfn-timestream-table-partitionkey-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The type of the partition key.
     *
     * Options are DIMENSION (dimension key) and MEASURE (measure key).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-partitionkey.html#cfn-timestream-table-partitionkey-type)
     */
    public fun type(): String

    /**
     * A builder for [PartitionKeyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enforcementInRecord The level of enforcement for the specification of a dimension
       * key in ingested records.
       * Options are REQUIRED (dimension key must be specified) and OPTIONAL (dimension key does not
       * have to be specified).
       */
      public fun enforcementInRecord(enforcementInRecord: String)

      /**
       * @param name The name of the attribute used for a dimension key.
       */
      public fun name(name: String)

      /**
       * @param type The type of the partition key. 
       * Options are DIMENSION (dimension key) and MEASURE (measure key).
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnTable.PartitionKeyProperty.Builder =
          software.amazon.awscdk.services.timestream.CfnTable.PartitionKeyProperty.builder()

      /**
       * @param enforcementInRecord The level of enforcement for the specification of a dimension
       * key in ingested records.
       * Options are REQUIRED (dimension key must be specified) and OPTIONAL (dimension key does not
       * have to be specified).
       */
      override fun enforcementInRecord(enforcementInRecord: String) {
        cdkBuilder.enforcementInRecord(enforcementInRecord)
      }

      /**
       * @param name The name of the attribute used for a dimension key.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type The type of the partition key. 
       * Options are DIMENSION (dimension key) and MEASURE (measure key).
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.timestream.CfnTable.PartitionKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.timestream.CfnTable.PartitionKeyProperty,
    ) : CdkObject(cdkObject), PartitionKeyProperty {
      /**
       * The level of enforcement for the specification of a dimension key in ingested records.
       *
       * Options are REQUIRED (dimension key must be specified) and OPTIONAL (dimension key does not
       * have to be specified).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-partitionkey.html#cfn-timestream-table-partitionkey-enforcementinrecord)
       */
      override fun enforcementInRecord(): String? = unwrap(this).getEnforcementInRecord()

      /**
       * The name of the attribute used for a dimension key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-partitionkey.html#cfn-timestream-table-partitionkey-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The type of the partition key.
       *
       * Options are DIMENSION (dimension key) and MEASURE (measure key).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-partitionkey.html#cfn-timestream-table-partitionkey-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PartitionKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTable.PartitionKeyProperty):
          PartitionKeyProperty = CdkObjectWrappers.wrap(cdkObject) as PartitionKeyProperty

      internal fun unwrap(wrapped: PartitionKeyProperty):
          software.amazon.awscdk.services.timestream.CfnTable.PartitionKeyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.timestream.CfnTable.PartitionKeyProperty
    }
  }

  /**
   * A Schema specifies the expected data model of the table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.timestream.*;
   * SchemaProperty schemaProperty = SchemaProperty.builder()
   * .compositePartitionKey(List.of(PartitionKeyProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .enforcementInRecord("enforcementInRecord")
   * .name("name")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-schema.html)
   */
  public interface SchemaProperty {
    /**
     * A non-empty list of partition keys defining the attributes used to partition the table data.
     *
     * The order of the list determines the partition hierarchy. The name and type of each partition
     * key as well as the partition key order cannot be changed after the table is created. However,
     * the enforcement level of each partition key can be changed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-schema.html#cfn-timestream-table-schema-compositepartitionkey)
     */
    public fun compositePartitionKey(): Any? = unwrap(this).getCompositePartitionKey()

    /**
     * A builder for [SchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param compositePartitionKey A non-empty list of partition keys defining the attributes
       * used to partition the table data.
       * The order of the list determines the partition hierarchy. The name and type of each
       * partition key as well as the partition key order cannot be changed after the table is created.
       * However, the enforcement level of each partition key can be changed.
       */
      public fun compositePartitionKey(compositePartitionKey: IResolvable)

      /**
       * @param compositePartitionKey A non-empty list of partition keys defining the attributes
       * used to partition the table data.
       * The order of the list determines the partition hierarchy. The name and type of each
       * partition key as well as the partition key order cannot be changed after the table is created.
       * However, the enforcement level of each partition key can be changed.
       */
      public fun compositePartitionKey(compositePartitionKey: List<Any>)

      /**
       * @param compositePartitionKey A non-empty list of partition keys defining the attributes
       * used to partition the table data.
       * The order of the list determines the partition hierarchy. The name and type of each
       * partition key as well as the partition key order cannot be changed after the table is created.
       * However, the enforcement level of each partition key can be changed.
       */
      public fun compositePartitionKey(vararg compositePartitionKey: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnTable.SchemaProperty.Builder =
          software.amazon.awscdk.services.timestream.CfnTable.SchemaProperty.builder()

      /**
       * @param compositePartitionKey A non-empty list of partition keys defining the attributes
       * used to partition the table data.
       * The order of the list determines the partition hierarchy. The name and type of each
       * partition key as well as the partition key order cannot be changed after the table is created.
       * However, the enforcement level of each partition key can be changed.
       */
      override fun compositePartitionKey(compositePartitionKey: IResolvable) {
        cdkBuilder.compositePartitionKey(compositePartitionKey.let(IResolvable::unwrap))
      }

      /**
       * @param compositePartitionKey A non-empty list of partition keys defining the attributes
       * used to partition the table data.
       * The order of the list determines the partition hierarchy. The name and type of each
       * partition key as well as the partition key order cannot be changed after the table is created.
       * However, the enforcement level of each partition key can be changed.
       */
      override fun compositePartitionKey(compositePartitionKey: List<Any>) {
        cdkBuilder.compositePartitionKey(compositePartitionKey)
      }

      /**
       * @param compositePartitionKey A non-empty list of partition keys defining the attributes
       * used to partition the table data.
       * The order of the list determines the partition hierarchy. The name and type of each
       * partition key as well as the partition key order cannot be changed after the table is created.
       * However, the enforcement level of each partition key can be changed.
       */
      override fun compositePartitionKey(vararg compositePartitionKey: Any): Unit =
          compositePartitionKey(compositePartitionKey.toList())

      public fun build(): software.amazon.awscdk.services.timestream.CfnTable.SchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.timestream.CfnTable.SchemaProperty,
    ) : CdkObject(cdkObject), SchemaProperty {
      /**
       * A non-empty list of partition keys defining the attributes used to partition the table
       * data.
       *
       * The order of the list determines the partition hierarchy. The name and type of each
       * partition key as well as the partition key order cannot be changed after the table is created.
       * However, the enforcement level of each partition key can be changed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-schema.html#cfn-timestream-table-schema-compositepartitionkey)
       */
      override fun compositePartitionKey(): Any? = unwrap(this).getCompositePartitionKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTable.SchemaProperty):
          SchemaProperty = CdkObjectWrappers.wrap(cdkObject) as SchemaProperty

      internal fun unwrap(wrapped: SchemaProperty):
          software.amazon.awscdk.services.timestream.CfnTable.SchemaProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.timestream.CfnTable.SchemaProperty
    }
  }

  /**
   * Retention properties contain the duration for which your time-series data must be stored in the
   * magnetic store and the memory store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.timestream.*;
   * RetentionPropertiesProperty retentionPropertiesProperty = RetentionPropertiesProperty.builder()
   * .magneticStoreRetentionPeriodInDays("magneticStoreRetentionPeriodInDays")
   * .memoryStoreRetentionPeriodInHours("memoryStoreRetentionPeriodInHours")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-retentionproperties.html)
   */
  public interface RetentionPropertiesProperty {
    /**
     * The duration for which data must be stored in the magnetic store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-retentionproperties.html#cfn-timestream-table-retentionproperties-magneticstoreretentionperiodindays)
     */
    public fun magneticStoreRetentionPeriodInDays(): String? =
        unwrap(this).getMagneticStoreRetentionPeriodInDays()

    /**
     * The duration for which data must be stored in the memory store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-retentionproperties.html#cfn-timestream-table-retentionproperties-memorystoreretentionperiodinhours)
     */
    public fun memoryStoreRetentionPeriodInHours(): String? =
        unwrap(this).getMemoryStoreRetentionPeriodInHours()

    /**
     * A builder for [RetentionPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param magneticStoreRetentionPeriodInDays The duration for which data must be stored in the
       * magnetic store.
       */
      public fun magneticStoreRetentionPeriodInDays(magneticStoreRetentionPeriodInDays: String)

      /**
       * @param memoryStoreRetentionPeriodInHours The duration for which data must be stored in the
       * memory store.
       */
      public fun memoryStoreRetentionPeriodInHours(memoryStoreRetentionPeriodInHours: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.timestream.CfnTable.RetentionPropertiesProperty.Builder =
          software.amazon.awscdk.services.timestream.CfnTable.RetentionPropertiesProperty.builder()

      /**
       * @param magneticStoreRetentionPeriodInDays The duration for which data must be stored in the
       * magnetic store.
       */
      override fun magneticStoreRetentionPeriodInDays(magneticStoreRetentionPeriodInDays: String) {
        cdkBuilder.magneticStoreRetentionPeriodInDays(magneticStoreRetentionPeriodInDays)
      }

      /**
       * @param memoryStoreRetentionPeriodInHours The duration for which data must be stored in the
       * memory store.
       */
      override fun memoryStoreRetentionPeriodInHours(memoryStoreRetentionPeriodInHours: String) {
        cdkBuilder.memoryStoreRetentionPeriodInHours(memoryStoreRetentionPeriodInHours)
      }

      public fun build():
          software.amazon.awscdk.services.timestream.CfnTable.RetentionPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.timestream.CfnTable.RetentionPropertiesProperty,
    ) : CdkObject(cdkObject), RetentionPropertiesProperty {
      /**
       * The duration for which data must be stored in the magnetic store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-retentionproperties.html#cfn-timestream-table-retentionproperties-magneticstoreretentionperiodindays)
       */
      override fun magneticStoreRetentionPeriodInDays(): String? =
          unwrap(this).getMagneticStoreRetentionPeriodInDays()

      /**
       * The duration for which data must be stored in the memory store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-retentionproperties.html#cfn-timestream-table-retentionproperties-memorystoreretentionperiodinhours)
       */
      override fun memoryStoreRetentionPeriodInHours(): String? =
          unwrap(this).getMemoryStoreRetentionPeriodInHours()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetentionPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTable.RetentionPropertiesProperty):
          RetentionPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as
          RetentionPropertiesProperty

      internal fun unwrap(wrapped: RetentionPropertiesProperty):
          software.amazon.awscdk.services.timestream.CfnTable.RetentionPropertiesProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.timestream.CfnTable.RetentionPropertiesProperty
    }
  }
}
