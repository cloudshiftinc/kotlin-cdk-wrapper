@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

@CdkDslMarker
public class CfnEndpointKinesisSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.KinesisSettingsProperty.Builder =
      CfnEndpoint.KinesisSettingsProperty.builder()

  /**
   * @param includeControlDetails Shows detailed control information for table definition, column
   * definition, and table and column changes in the Kinesis message output.
   * The default is `false` .
   */
  public fun includeControlDetails(includeControlDetails: Boolean) {
    cdkBuilder.includeControlDetails(includeControlDetails)
  }

  /**
   * @param includeControlDetails Shows detailed control information for table definition, column
   * definition, and table and column changes in the Kinesis message output.
   * The default is `false` .
   */
  public fun includeControlDetails(includeControlDetails: IResolvable) {
    cdkBuilder.includeControlDetails(includeControlDetails)
  }

  /**
   * @param includeNullAndEmpty Include NULL and empty columns for records migrated to the endpoint.
   * The default is `false` .
   */
  public fun includeNullAndEmpty(includeNullAndEmpty: Boolean) {
    cdkBuilder.includeNullAndEmpty(includeNullAndEmpty)
  }

  /**
   * @param includeNullAndEmpty Include NULL and empty columns for records migrated to the endpoint.
   * The default is `false` .
   */
  public fun includeNullAndEmpty(includeNullAndEmpty: IResolvable) {
    cdkBuilder.includeNullAndEmpty(includeNullAndEmpty)
  }

  /**
   * @param includePartitionValue Shows the partition value within the Kinesis message output,
   * unless the partition type is `schema-table-type` .
   * The default is `false` .
   */
  public fun includePartitionValue(includePartitionValue: Boolean) {
    cdkBuilder.includePartitionValue(includePartitionValue)
  }

  /**
   * @param includePartitionValue Shows the partition value within the Kinesis message output,
   * unless the partition type is `schema-table-type` .
   * The default is `false` .
   */
  public fun includePartitionValue(includePartitionValue: IResolvable) {
    cdkBuilder.includePartitionValue(includePartitionValue)
  }

  /**
   * @param includeTableAlterOperations Includes any data definition language (DDL) operations that
   * change the table in the control data, such as `rename-table` , `drop-table` , `add-column` ,
   * `drop-column` , and `rename-column` .
   * The default is `false` .
   */
  public fun includeTableAlterOperations(includeTableAlterOperations: Boolean) {
    cdkBuilder.includeTableAlterOperations(includeTableAlterOperations)
  }

  /**
   * @param includeTableAlterOperations Includes any data definition language (DDL) operations that
   * change the table in the control data, such as `rename-table` , `drop-table` , `add-column` ,
   * `drop-column` , and `rename-column` .
   * The default is `false` .
   */
  public fun includeTableAlterOperations(includeTableAlterOperations: IResolvable) {
    cdkBuilder.includeTableAlterOperations(includeTableAlterOperations)
  }

  /**
   * @param includeTransactionDetails Provides detailed transaction information from the source
   * database.
   * This information includes a commit timestamp, a log position, and values for `transaction_id` ,
   * previous `transaction_id` , and `transaction_record_id` (the record offset within a transaction).
   * The default is `false` .
   */
  public fun includeTransactionDetails(includeTransactionDetails: Boolean) {
    cdkBuilder.includeTransactionDetails(includeTransactionDetails)
  }

  /**
   * @param includeTransactionDetails Provides detailed transaction information from the source
   * database.
   * This information includes a commit timestamp, a log position, and values for `transaction_id` ,
   * previous `transaction_id` , and `transaction_record_id` (the record offset within a transaction).
   * The default is `false` .
   */
  public fun includeTransactionDetails(includeTransactionDetails: IResolvable) {
    cdkBuilder.includeTransactionDetails(includeTransactionDetails)
  }

  /**
   * @param messageFormat The output format for the records created on the endpoint.
   * The message format is `JSON` (default) or `JSON_UNFORMATTED` (a single line with no tab).
   */
  public fun messageFormat(messageFormat: String) {
    cdkBuilder.messageFormat(messageFormat)
  }

  /**
   * @param noHexPrefix Set this optional parameter to `true` to avoid adding a '0x' prefix to raw
   * data in hexadecimal format.
   * For example, by default, AWS DMS adds a '0x' prefix to the LOB column type in hexadecimal
   * format moving from an Oracle source to an Amazon Kinesis target. Use the `NoHexPrefix` endpoint
   * setting to enable migration of RAW data type columns without adding the '0x' prefix.
   */
  public fun noHexPrefix(noHexPrefix: Boolean) {
    cdkBuilder.noHexPrefix(noHexPrefix)
  }

  /**
   * @param noHexPrefix Set this optional parameter to `true` to avoid adding a '0x' prefix to raw
   * data in hexadecimal format.
   * For example, by default, AWS DMS adds a '0x' prefix to the LOB column type in hexadecimal
   * format moving from an Oracle source to an Amazon Kinesis target. Use the `NoHexPrefix` endpoint
   * setting to enable migration of RAW data type columns without adding the '0x' prefix.
   */
  public fun noHexPrefix(noHexPrefix: IResolvable) {
    cdkBuilder.noHexPrefix(noHexPrefix)
  }

  /**
   * @param partitionIncludeSchemaTable Prefixes schema and table names to partition values, when
   * the partition type is `primary-key-type` .
   * Doing this increases data distribution among Kinesis shards. For example, suppose that a
   * SysBench schema has thousands of tables and each table has only limited range for a primary key.
   * In this case, the same primary key is sent from thousands of tables to the same shard, which
   * causes throttling. The default is `false` .
   */
  public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: Boolean) {
    cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable)
  }

  /**
   * @param partitionIncludeSchemaTable Prefixes schema and table names to partition values, when
   * the partition type is `primary-key-type` .
   * Doing this increases data distribution among Kinesis shards. For example, suppose that a
   * SysBench schema has thousands of tables and each table has only limited range for a primary key.
   * In this case, the same primary key is sent from thousands of tables to the same shard, which
   * causes throttling. The default is `false` .
   */
  public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: IResolvable) {
    cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable)
  }

  /**
   * @param serviceAccessRoleArn The Amazon Resource Name (ARN) for the IAM role that AWS DMS uses
   * to write to the Kinesis data stream.
   * The role must allow the `iam:PassRole` action.
   */
  public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
    cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
  }

  /**
   * @param streamArn The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
   */
  public fun streamArn(streamArn: String) {
    cdkBuilder.streamArn(streamArn)
  }

  public fun build(): CfnEndpoint.KinesisSettingsProperty = cdkBuilder.build()
}
