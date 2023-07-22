@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnWorkGroup

/**
 * The configuration information that will be updated for this workgroup, which includes the
 * location in Amazon S3 where query results are stored, the encryption option, if any, used for query
 * results, whether the Amazon CloudWatch Metrics are enabled for the workgroup, whether the workgroup
 * settings override the client-side settings, and the data usage limit for the amount of bytes scanned
 * per query, if it is specified.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.athena.*;
 * WorkGroupConfigurationUpdatesProperty workGroupConfigurationUpdatesProperty =
 * WorkGroupConfigurationUpdatesProperty.builder()
 * .additionalConfiguration("additionalConfiguration")
 * .bytesScannedCutoffPerQuery(123)
 * .customerContentEncryptionConfiguration(CustomerContentEncryptionConfigurationProperty.builder()
 * .kmsKey("kmsKey")
 * .build())
 * .enforceWorkGroupConfiguration(false)
 * .engineVersion(EngineVersionProperty.builder()
 * .effectiveEngineVersion("effectiveEngineVersion")
 * .selectedEngineVersion("selectedEngineVersion")
 * .build())
 * .executionRole("executionRole")
 * .publishCloudWatchMetricsEnabled(false)
 * .removeBytesScannedCutoffPerQuery(false)
 * .removeCustomerContentEncryptionConfiguration(false)
 * .requesterPaysEnabled(false)
 * .resultConfigurationUpdates(ResultConfigurationUpdatesProperty.builder()
 * .aclConfiguration(AclConfigurationProperty.builder()
 * .s3AclOption("s3AclOption")
 * .build())
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .encryptionOption("encryptionOption")
 * // the properties below are optional
 * .kmsKey("kmsKey")
 * .build())
 * .expectedBucketOwner("expectedBucketOwner")
 * .outputLocation("outputLocation")
 * .removeAclConfiguration(false)
 * .removeEncryptionConfiguration(false)
 * .removeExpectedBucketOwner(false)
 * .removeOutputLocation(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-workgroupconfigurationupdates.html)
 */
@CdkDslMarker
public class CfnWorkGroupWorkGroupConfigurationUpdatesPropertyDsl {
  private val cdkBuilder: CfnWorkGroup.WorkGroupConfigurationUpdatesProperty.Builder =
      CfnWorkGroup.WorkGroupConfigurationUpdatesProperty.builder()

  /**
   * @param additionalConfiguration Additional Configuration that are passed to Athena Spark
   * Calculations running in this workgroup.
   */
  public fun additionalConfiguration(additionalConfiguration: String) {
    cdkBuilder.additionalConfiguration(additionalConfiguration)
  }

  /**
   * @param bytesScannedCutoffPerQuery The upper data usage limit (cutoff) for the amount of bytes a
   * single query in a workgroup is allowed to scan.
   */
  public fun bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery: Number) {
    cdkBuilder.bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery)
  }

  /**
   * @param customerContentEncryptionConfiguration Indicates the KMS key for encrypting notebook
   * content.
   */
  public
      fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: IResolvable) {
    cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration)
  }

  /**
   * @param customerContentEncryptionConfiguration Indicates the KMS key for encrypting notebook
   * content.
   */
  public
      fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CfnWorkGroup.CustomerContentEncryptionConfigurationProperty) {
    cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration)
  }

  /**
   * @param enforceWorkGroupConfiguration If set to "true", the settings for the workgroup override
   * client-side settings.
   * If set to "false", client-side settings are used
   */
  public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: Boolean) {
    cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration)
  }

  /**
   * @param enforceWorkGroupConfiguration If set to "true", the settings for the workgroup override
   * client-side settings.
   * If set to "false", client-side settings are used
   */
  public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: IResolvable) {
    cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration)
  }

  /**
   * @param engineVersion The Athena engine version for running queries.
   */
  public fun engineVersion(engineVersion: IResolvable) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * @param engineVersion The Athena engine version for running queries.
   */
  public fun engineVersion(engineVersion: CfnWorkGroup.EngineVersionProperty) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * @param executionRole Execution Role ARN required to run Athena Spark Calculations.
   */
  public fun executionRole(executionRole: String) {
    cdkBuilder.executionRole(executionRole)
  }

  /**
   * @param publishCloudWatchMetricsEnabled Indicates that the Amazon CloudWatch metrics are enabled
   * for the workgroup.
   */
  public fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: Boolean) {
    cdkBuilder.publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled)
  }

  /**
   * @param publishCloudWatchMetricsEnabled Indicates that the Amazon CloudWatch metrics are enabled
   * for the workgroup.
   */
  public fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: IResolvable) {
    cdkBuilder.publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled)
  }

  /**
   * @param removeBytesScannedCutoffPerQuery Indicates that the data usage control limit per query
   * is removed.
   */
  public fun removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery: Boolean) {
    cdkBuilder.removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery)
  }

  /**
   * @param removeBytesScannedCutoffPerQuery Indicates that the data usage control limit per query
   * is removed.
   */
  public fun removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery: IResolvable) {
    cdkBuilder.removeBytesScannedCutoffPerQuery(removeBytesScannedCutoffPerQuery)
  }

  /**
   * @param removeCustomerContentEncryptionConfiguration the value to be set.
   */
  public
      fun removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration: Boolean) {
    cdkBuilder.removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration)
  }

  /**
   * @param removeCustomerContentEncryptionConfiguration the value to be set.
   */
  public
      fun removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration: IResolvable) {
    cdkBuilder.removeCustomerContentEncryptionConfiguration(removeCustomerContentEncryptionConfiguration)
  }

  /**
   * @param requesterPaysEnabled If set to true, allows members assigned to a workgroup to reference
   * Amazon S3 Requester Pays buckets in queries.
   * If set to false, workgroup members cannot query data from Requester Pays buckets, and queries
   * that retrieve data from Requester Pays buckets cause an error.
   */
  public fun requesterPaysEnabled(requesterPaysEnabled: Boolean) {
    cdkBuilder.requesterPaysEnabled(requesterPaysEnabled)
  }

  /**
   * @param requesterPaysEnabled If set to true, allows members assigned to a workgroup to reference
   * Amazon S3 Requester Pays buckets in queries.
   * If set to false, workgroup members cannot query data from Requester Pays buckets, and queries
   * that retrieve data from Requester Pays buckets cause an error.
   */
  public fun requesterPaysEnabled(requesterPaysEnabled: IResolvable) {
    cdkBuilder.requesterPaysEnabled(requesterPaysEnabled)
  }

  /**
   * @param resultConfigurationUpdates The result configuration information about the queries in
   * this workgroup that will be updated.
   * Includes the updated results location and an updated option for encrypting query results.
   */
  public fun resultConfigurationUpdates(resultConfigurationUpdates: IResolvable) {
    cdkBuilder.resultConfigurationUpdates(resultConfigurationUpdates)
  }

  /**
   * @param resultConfigurationUpdates The result configuration information about the queries in
   * this workgroup that will be updated.
   * Includes the updated results location and an updated option for encrypting query results.
   */
  public
      fun resultConfigurationUpdates(resultConfigurationUpdates: CfnWorkGroup.ResultConfigurationUpdatesProperty) {
    cdkBuilder.resultConfigurationUpdates(resultConfigurationUpdates)
  }

  public fun build(): CfnWorkGroup.WorkGroupConfigurationUpdatesProperty = cdkBuilder.build()
}
