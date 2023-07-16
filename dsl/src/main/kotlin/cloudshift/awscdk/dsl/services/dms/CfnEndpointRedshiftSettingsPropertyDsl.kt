@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

@CdkDslMarker
public class CfnEndpointRedshiftSettingsPropertyDsl {
  private val cdkBuilder: CfnEndpoint.RedshiftSettingsProperty.Builder =
      CfnEndpoint.RedshiftSettingsProperty.builder()

  public fun acceptAnyDate(acceptAnyDate: Boolean) {
    cdkBuilder.acceptAnyDate(acceptAnyDate)
  }

  public fun acceptAnyDate(acceptAnyDate: IResolvable) {
    cdkBuilder.acceptAnyDate(acceptAnyDate)
  }

  public fun afterConnectScript(afterConnectScript: String) {
    cdkBuilder.afterConnectScript(afterConnectScript)
  }

  public fun bucketFolder(bucketFolder: String) {
    cdkBuilder.bucketFolder(bucketFolder)
  }

  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  public fun caseSensitiveNames(caseSensitiveNames: Boolean) {
    cdkBuilder.caseSensitiveNames(caseSensitiveNames)
  }

  public fun caseSensitiveNames(caseSensitiveNames: IResolvable) {
    cdkBuilder.caseSensitiveNames(caseSensitiveNames)
  }

  public fun compUpdate(compUpdate: Boolean) {
    cdkBuilder.compUpdate(compUpdate)
  }

  public fun compUpdate(compUpdate: IResolvable) {
    cdkBuilder.compUpdate(compUpdate)
  }

  public fun connectionTimeout(connectionTimeout: Number) {
    cdkBuilder.connectionTimeout(connectionTimeout)
  }

  public fun dateFormat(dateFormat: String) {
    cdkBuilder.dateFormat(dateFormat)
  }

  public fun emptyAsNull(emptyAsNull: Boolean) {
    cdkBuilder.emptyAsNull(emptyAsNull)
  }

  public fun emptyAsNull(emptyAsNull: IResolvable) {
    cdkBuilder.emptyAsNull(emptyAsNull)
  }

  public fun encryptionMode(encryptionMode: String) {
    cdkBuilder.encryptionMode(encryptionMode)
  }

  public fun explicitIds(explicitIds: Boolean) {
    cdkBuilder.explicitIds(explicitIds)
  }

  public fun explicitIds(explicitIds: IResolvable) {
    cdkBuilder.explicitIds(explicitIds)
  }

  public fun fileTransferUploadStreams(fileTransferUploadStreams: Number) {
    cdkBuilder.fileTransferUploadStreams(fileTransferUploadStreams)
  }

  public fun loadTimeout(loadTimeout: Number) {
    cdkBuilder.loadTimeout(loadTimeout)
  }

  public fun mapBooleanAsBoolean(mapBooleanAsBoolean: Boolean) {
    cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean)
  }

  public fun mapBooleanAsBoolean(mapBooleanAsBoolean: IResolvable) {
    cdkBuilder.mapBooleanAsBoolean(mapBooleanAsBoolean)
  }

  public fun maxFileSize(maxFileSize: Number) {
    cdkBuilder.maxFileSize(maxFileSize)
  }

  public fun removeQuotes(removeQuotes: Boolean) {
    cdkBuilder.removeQuotes(removeQuotes)
  }

  public fun removeQuotes(removeQuotes: IResolvable) {
    cdkBuilder.removeQuotes(removeQuotes)
  }

  public fun replaceChars(replaceChars: String) {
    cdkBuilder.replaceChars(replaceChars)
  }

  public fun replaceInvalidChars(replaceInvalidChars: String) {
    cdkBuilder.replaceInvalidChars(replaceInvalidChars)
  }

  public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
    cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
  }

  public fun secretsManagerSecretId(secretsManagerSecretId: String) {
    cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
  }

  public fun serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId: String) {
    cdkBuilder.serverSideEncryptionKmsKeyId(serverSideEncryptionKmsKeyId)
  }

  public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
    cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
  }

  public fun timeFormat(timeFormat: String) {
    cdkBuilder.timeFormat(timeFormat)
  }

  public fun trimBlanks(trimBlanks: Boolean) {
    cdkBuilder.trimBlanks(trimBlanks)
  }

  public fun trimBlanks(trimBlanks: IResolvable) {
    cdkBuilder.trimBlanks(trimBlanks)
  }

  public fun truncateColumns(truncateColumns: Boolean) {
    cdkBuilder.truncateColumns(truncateColumns)
  }

  public fun truncateColumns(truncateColumns: IResolvable) {
    cdkBuilder.truncateColumns(truncateColumns)
  }

  public fun writeBufferSize(writeBufferSize: Number) {
    cdkBuilder.writeBufferSize(writeBufferSize)
  }

  public fun build(): CfnEndpoint.RedshiftSettingsProperty = cdkBuilder.build()
}
