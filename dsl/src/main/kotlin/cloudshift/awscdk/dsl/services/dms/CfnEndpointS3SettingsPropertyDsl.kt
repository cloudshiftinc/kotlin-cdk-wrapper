@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

@CdkDslMarker
public class CfnEndpointS3SettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.S3SettingsProperty.Builder =
      CfnEndpoint.S3SettingsProperty.builder()

  public fun addColumnName(addColumnName: Boolean) {
    cdkBuilder.addColumnName(addColumnName)
  }

  public fun addColumnName(addColumnName: IResolvable) {
    cdkBuilder.addColumnName(addColumnName)
  }

  public fun bucketFolder(bucketFolder: String) {
    cdkBuilder.bucketFolder(bucketFolder)
  }

  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  public fun cannedAclForObjects(cannedAclForObjects: String) {
    cdkBuilder.cannedAclForObjects(cannedAclForObjects)
  }

  public fun cdcInsertsAndUpdates(cdcInsertsAndUpdates: Boolean) {
    cdkBuilder.cdcInsertsAndUpdates(cdcInsertsAndUpdates)
  }

  public fun cdcInsertsAndUpdates(cdcInsertsAndUpdates: IResolvable) {
    cdkBuilder.cdcInsertsAndUpdates(cdcInsertsAndUpdates)
  }

  public fun cdcInsertsOnly(cdcInsertsOnly: Boolean) {
    cdkBuilder.cdcInsertsOnly(cdcInsertsOnly)
  }

  public fun cdcInsertsOnly(cdcInsertsOnly: IResolvable) {
    cdkBuilder.cdcInsertsOnly(cdcInsertsOnly)
  }

  public fun cdcMaxBatchInterval(cdcMaxBatchInterval: Number) {
    cdkBuilder.cdcMaxBatchInterval(cdcMaxBatchInterval)
  }

  public fun cdcMinFileSize(cdcMinFileSize: Number) {
    cdkBuilder.cdcMinFileSize(cdcMinFileSize)
  }

  public fun cdcPath(cdcPath: String) {
    cdkBuilder.cdcPath(cdcPath)
  }

  public fun compressionType(compressionType: String) {
    cdkBuilder.compressionType(compressionType)
  }

  public fun csvDelimiter(csvDelimiter: String) {
    cdkBuilder.csvDelimiter(csvDelimiter)
  }

  public fun csvNoSupValue(csvNoSupValue: String) {
    cdkBuilder.csvNoSupValue(csvNoSupValue)
  }

  public fun csvNullValue(csvNullValue: String) {
    cdkBuilder.csvNullValue(csvNullValue)
  }

  public fun csvRowDelimiter(csvRowDelimiter: String) {
    cdkBuilder.csvRowDelimiter(csvRowDelimiter)
  }

  public fun dataFormat(dataFormat: String) {
    cdkBuilder.dataFormat(dataFormat)
  }

  public fun dataPageSize(dataPageSize: Number) {
    cdkBuilder.dataPageSize(dataPageSize)
  }

  public fun datePartitionDelimiter(datePartitionDelimiter: String) {
    cdkBuilder.datePartitionDelimiter(datePartitionDelimiter)
  }

  public fun datePartitionEnabled(datePartitionEnabled: Boolean) {
    cdkBuilder.datePartitionEnabled(datePartitionEnabled)
  }

  public fun datePartitionEnabled(datePartitionEnabled: IResolvable) {
    cdkBuilder.datePartitionEnabled(datePartitionEnabled)
  }

  public fun datePartitionSequence(datePartitionSequence: String) {
    cdkBuilder.datePartitionSequence(datePartitionSequence)
  }

  public fun datePartitionTimezone(datePartitionTimezone: String) {
    cdkBuilder.datePartitionTimezone(datePartitionTimezone)
  }

  public fun dictPageSizeLimit(dictPageSizeLimit: Number) {
    cdkBuilder.dictPageSizeLimit(dictPageSizeLimit)
  }

  public fun enableStatistics(enableStatistics: Boolean) {
    cdkBuilder.enableStatistics(enableStatistics)
  }

  public fun enableStatistics(enableStatistics: IResolvable) {
    cdkBuilder.enableStatistics(enableStatistics)
  }

  public fun encodingType(encodingType: String) {
    cdkBuilder.encodingType(encodingType)
  }

  public fun encryptionMode(encryptionMode: String) {
    cdkBuilder.encryptionMode(encryptionMode)
  }

  public fun externalTableDefinition(externalTableDefinition: String) {
    cdkBuilder.externalTableDefinition(externalTableDefinition)
  }

  public fun ignoreHeaderRows(ignoreHeaderRows: Number) {
    cdkBuilder.ignoreHeaderRows(ignoreHeaderRows)
  }

  public fun includeOpForFullLoad(includeOpForFullLoad: Boolean) {
    cdkBuilder.includeOpForFullLoad(includeOpForFullLoad)
  }

  public fun includeOpForFullLoad(includeOpForFullLoad: IResolvable) {
    cdkBuilder.includeOpForFullLoad(includeOpForFullLoad)
  }

  public fun maxFileSize(maxFileSize: Number) {
    cdkBuilder.maxFileSize(maxFileSize)
  }

  public fun parquetTimestampInMillisecond(parquetTimestampInMillisecond: Boolean) {
    cdkBuilder.parquetTimestampInMillisecond(parquetTimestampInMillisecond)
  }

  public fun parquetTimestampInMillisecond(parquetTimestampInMillisecond: IResolvable) {
    cdkBuilder.parquetTimestampInMillisecond(parquetTimestampInMillisecond)
  }

  public fun parquetVersion(parquetVersion: String) {
    cdkBuilder.parquetVersion(parquetVersion)
  }

  public fun preserveTransactions(preserveTransactions: Boolean) {
    cdkBuilder.preserveTransactions(preserveTransactions)
  }

  public fun preserveTransactions(preserveTransactions: IResolvable) {
    cdkBuilder.preserveTransactions(preserveTransactions)
  }

  public fun rfc4180(rfc4180: Boolean) {
    cdkBuilder.rfc4180(rfc4180)
  }

  public fun rfc4180(rfc4180: IResolvable) {
    cdkBuilder.rfc4180(rfc4180)
  }

  public fun rowGroupLength(rowGroupLength: Number) {
    cdkBuilder.rowGroupLength(rowGroupLength)
  }

  public fun serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId: String) {
    cdkBuilder.serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId)
  }

  public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
    cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
  }

  public fun timestampColumnName(timestampColumnName: String) {
    cdkBuilder.timestampColumnName(timestampColumnName)
  }

  public fun useCsvNoSupValue(useCsvNoSupValue: Boolean) {
    cdkBuilder.useCsvNoSupValue(useCsvNoSupValue)
  }

  public fun useCsvNoSupValue(useCsvNoSupValue: IResolvable) {
    cdkBuilder.useCsvNoSupValue(useCsvNoSupValue)
  }

  public fun useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp: Boolean) {
    cdkBuilder.useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp)
  }

  public
      fun useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp: IResolvable) {
    cdkBuilder.useTaskStartTimeForFullLoadTimestamp(useTaskStartTimeForFullLoadTimestamp)
  }

  public fun build(): CfnEndpoint.S3SettingsProperty = cdkBuilder.build()
}
