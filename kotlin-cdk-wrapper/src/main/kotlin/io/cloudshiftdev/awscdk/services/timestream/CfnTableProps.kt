@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.timestream

import io.cloudshiftdev.awscdk.CfnTag
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
 * Properties for defining a `CfnTable`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.timestream.*;
 * Object magneticStoreWriteProperties;
 * Object retentionProperties;
 * CfnTableProps cfnTableProps = CfnTableProps.builder()
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
public interface CfnTableProps {
  /**
   * The name of the Timestream database that contains this table.
   *
   * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-databasename)
   */
  public fun databaseName(): String

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
   * Both `BucketName` and `EncryptionOption` are *required* when `S3Configuration` is specified. If
   * you specify `SSE_KMS` as your `EncryptionOption` then `KmsKeyId` is *required* .
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
   * "MagneticStoreRejectedDataLocation":{ "S3Configuration":{ "BucketName":" amzn-s3-demo-bucket ",
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
   * EnableMagneticStoreWrites: true MagneticStoreRejectedDataLocation: S3Configuration: BucketName: "
   * amzn-s3-demo-bucket " EncryptionOption: "SSE_KMS" KmsKeyId: "1234abcd-12ab-34cd-56ef-1234567890ab"
   * ObjectKeyPrefix: "prefix"
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-magneticstorewriteproperties)
   */
  public fun magneticStoreWriteProperties(): Any? = unwrap(this).getMagneticStoreWriteProperties()

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
   */
  public fun retentionProperties(): Any? = unwrap(this).getRetentionProperties()

  /**
   * The schema of the table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-schema)
   */
  public fun schema(): Any? = unwrap(this).getSchema()

  /**
   * The name of the Timestream table.
   *
   * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-tablename)
   */
  public fun tableName(): String? = unwrap(this).getTableName()

  /**
   * The tags to add to the table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnTableProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param databaseName The name of the Timestream database that contains this table. 
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     */
    public fun databaseName(databaseName: String)

    /**
     * @param magneticStoreWriteProperties Contains properties to set on the table when enabling
     * magnetic store writes.
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
     * "MagneticStoreRejectedDataLocation":{ "S3Configuration":{ "BucketName":" amzn-s3-demo-bucket ",
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
     * " amzn-s3-demo-bucket " EncryptionOption: "SSE_KMS" KmsKeyId:
     * "1234abcd-12ab-34cd-56ef-1234567890ab" ObjectKeyPrefix: "prefix"
     * ```
     */
    public fun magneticStoreWriteProperties(magneticStoreWriteProperties: Any)

    /**
     * @param retentionProperties The retention duration for the memory store and magnetic store.
     * This object has the following attributes:.
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
     */
    public fun retentionProperties(retentionProperties: Any)

    /**
     * @param schema The schema of the table.
     */
    public fun schema(schema: IResolvable)

    /**
     * @param schema The schema of the table.
     */
    public fun schema(schema: CfnTable.SchemaProperty)

    /**
     * @param schema The schema of the table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e176944cdf0bff481d12f798cfd78751404a6c0f4c0775b4cb5734d216f21777")
    public fun schema(schema: CfnTable.SchemaProperty.Builder.() -> Unit)

    /**
     * @param tableName The name of the Timestream table.
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     */
    public fun tableName(tableName: String)

    /**
     * @param tags The tags to add to the table.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to the table.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.timestream.CfnTableProps.Builder =
        software.amazon.awscdk.services.timestream.CfnTableProps.builder()

    /**
     * @param databaseName The name of the Timestream database that contains this table. 
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     */
    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    /**
     * @param magneticStoreWriteProperties Contains properties to set on the table when enabling
     * magnetic store writes.
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
     * "MagneticStoreRejectedDataLocation":{ "S3Configuration":{ "BucketName":" amzn-s3-demo-bucket ",
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
     * " amzn-s3-demo-bucket " EncryptionOption: "SSE_KMS" KmsKeyId:
     * "1234abcd-12ab-34cd-56ef-1234567890ab" ObjectKeyPrefix: "prefix"
     * ```
     */
    override fun magneticStoreWriteProperties(magneticStoreWriteProperties: Any) {
      cdkBuilder.magneticStoreWriteProperties(magneticStoreWriteProperties)
    }

    /**
     * @param retentionProperties The retention duration for the memory store and magnetic store.
     * This object has the following attributes:.
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
     */
    override fun retentionProperties(retentionProperties: Any) {
      cdkBuilder.retentionProperties(retentionProperties)
    }

    /**
     * @param schema The schema of the table.
     */
    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param schema The schema of the table.
     */
    override fun schema(schema: CfnTable.SchemaProperty) {
      cdkBuilder.schema(schema.let(CfnTable.SchemaProperty.Companion::unwrap))
    }

    /**
     * @param schema The schema of the table.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e176944cdf0bff481d12f798cfd78751404a6c0f4c0775b4cb5734d216f21777")
    override fun schema(schema: CfnTable.SchemaProperty.Builder.() -> Unit): Unit =
        schema(CfnTable.SchemaProperty(schema))

    /**
     * @param tableName The name of the Timestream table.
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     */
    override fun tableName(tableName: String) {
      cdkBuilder.tableName(tableName)
    }

    /**
     * @param tags The tags to add to the table.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to add to the table.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.timestream.CfnTableProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.timestream.CfnTableProps,
  ) : CdkObject(cdkObject),
      CfnTableProps {
    /**
     * The name of the Timestream database that contains this table.
     *
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-databasename)
     */
    override fun databaseName(): String = unwrap(this).getDatabaseName()

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
     * "MagneticStoreRejectedDataLocation":{ "S3Configuration":{ "BucketName":" amzn-s3-demo-bucket ",
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
     * " amzn-s3-demo-bucket " EncryptionOption: "SSE_KMS" KmsKeyId:
     * "1234abcd-12ab-34cd-56ef-1234567890ab" ObjectKeyPrefix: "prefix"
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-magneticstorewriteproperties)
     */
    override fun magneticStoreWriteProperties(): Any? =
        unwrap(this).getMagneticStoreWriteProperties()

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
     */
    override fun retentionProperties(): Any? = unwrap(this).getRetentionProperties()

    /**
     * The schema of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-schema)
     */
    override fun schema(): Any? = unwrap(this).getSchema()

    /**
     * The name of the Timestream table.
     *
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-tablename)
     */
    override fun tableName(): String? = unwrap(this).getTableName()

    /**
     * The tags to add to the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.timestream.CfnTableProps):
        CfnTableProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTableProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTableProps):
        software.amazon.awscdk.services.timestream.CfnTableProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.timestream.CfnTableProps
  }
}
