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

package io.cloudshiftdev.awscdkdsl.services.timestream

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnTable
import software.constructs.Construct

/**
 * The CreateTable operation adds a new table to an existing database in your account.
 *
 * In an AWS account, table names must be at least unique within each Region if they are in the same
 * database. You may have identical table names in the same Region if the tables are in separate
 * databases. While creating the table, you must specify the table name, database name, and the
 * retention properties.
 * [Service quotas apply](https://docs.aws.amazon.com/timestream/latest/developerguide/ts-limits.html)
 * . See
 * [code sample](https://docs.aws.amazon.com/timestream/latest/developerguide/code-samples.create-table.html)
 * for details.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
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
@CdkDslMarker
public class CfnTableDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTable.Builder = CfnTable.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The name of the Timestream database that contains this table.
     *
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-databasename)
     *
     * @param databaseName The name of the Timestream database that contains this table.
     */
    public fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
    }

    /**
     * Contains properties to set on the table when enabling magnetic store writes.
     *
     * This object has the following attributes:
     * * *EnableMagneticStoreWrites* : A `boolean` flag to enable magnetic store writes.
     * * *MagneticStoreRejectedDataLocation* : The location to write error reports for records
     *   rejected, asynchronously, during magnetic store writes. Only `S3Configuration` objects are
     *   allowed. The `S3Configuration` object has the following attributes:
     * * *BucketName* : The name of the S3 bucket.
     * * *EncryptionOption* : The encryption option for the S3 location. Valid values are S3
     *   server-side encryption with an S3 managed key ( `SSE_S3` ) or AWS managed key ( `SSE_KMS`
     *   ).
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
     *
     * @param magneticStoreWriteProperties Contains properties to set on the table when enabling
     *   magnetic store writes.
     */
    public fun magneticStoreWriteProperties(
        magneticStoreWriteProperties: MapBuilder.() -> Unit = {}
    ) {
        val builder = MapBuilder()
        builder.apply(magneticStoreWriteProperties)
        cdkBuilder.magneticStoreWriteProperties(builder.map)
    }

    /**
     * Contains properties to set on the table when enabling magnetic store writes.
     *
     * This object has the following attributes:
     * * *EnableMagneticStoreWrites* : A `boolean` flag to enable magnetic store writes.
     * * *MagneticStoreRejectedDataLocation* : The location to write error reports for records
     *   rejected, asynchronously, during magnetic store writes. Only `S3Configuration` objects are
     *   allowed. The `S3Configuration` object has the following attributes:
     * * *BucketName* : The name of the S3 bucket.
     * * *EncryptionOption* : The encryption option for the S3 location. Valid values are S3
     *   server-side encryption with an S3 managed key ( `SSE_S3` ) or AWS managed key ( `SSE_KMS`
     *   ).
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
     *
     * @param magneticStoreWriteProperties Contains properties to set on the table when enabling
     *   magnetic store writes.
     */
    public fun magneticStoreWriteProperties(magneticStoreWriteProperties: Any) {
        cdkBuilder.magneticStoreWriteProperties(magneticStoreWriteProperties)
    }

    /**
     * The retention duration for the memory store and magnetic store. This object has the following
     * attributes:.
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
     * "TableName" : "TestTable", "RetentionProperties" : { "MemoryStoreRetentionPeriodInHours":
     * "24", "MagneticStoreRetentionPeriodInDays": "7" } } }`
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
     *
     * @param retentionProperties The retention duration for the memory store and magnetic store.
     *   This object has the following attributes:.
     */
    public fun retentionProperties(retentionProperties: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(retentionProperties)
        cdkBuilder.retentionProperties(builder.map)
    }

    /**
     * The retention duration for the memory store and magnetic store. This object has the following
     * attributes:.
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
     * "TableName" : "TestTable", "RetentionProperties" : { "MemoryStoreRetentionPeriodInHours":
     * "24", "MagneticStoreRetentionPeriodInDays": "7" } } }`
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
     *
     * @param retentionProperties The retention duration for the memory store and magnetic store.
     *   This object has the following attributes:.
     */
    public fun retentionProperties(retentionProperties: Any) {
        cdkBuilder.retentionProperties(retentionProperties)
    }

    /**
     * The schema of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-schema)
     *
     * @param schema The schema of the table.
     */
    public fun schema(schema: IResolvable) {
        cdkBuilder.schema(schema)
    }

    /**
     * The schema of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-schema)
     *
     * @param schema The schema of the table.
     */
    public fun schema(schema: CfnTable.SchemaProperty) {
        cdkBuilder.schema(schema)
    }

    /**
     * The name of the Timestream table.
     *
     * *Length Constraints* : Minimum length of 3 bytes. Maximum length of 256 bytes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-tablename)
     *
     * @param tableName The name of the Timestream table.
     */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    /**
     * The tags to add to the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-tags)
     *
     * @param tags The tags to add to the table.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to add to the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-timestream-table.html#cfn-timestream-table-tags)
     *
     * @param tags The tags to add to the table.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTable {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
