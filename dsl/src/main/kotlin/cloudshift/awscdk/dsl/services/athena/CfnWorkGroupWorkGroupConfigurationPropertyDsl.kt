@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnWorkGroup

@CdkDslMarker
public class CfnWorkGroupWorkGroupConfigurationPropertyDsl {
  private val cdkBuilder: CfnWorkGroup.WorkGroupConfigurationProperty.Builder =
      CfnWorkGroup.WorkGroupConfigurationProperty.builder()

  /**
   * @param additionalConfiguration Specifies a user defined JSON string that is passed to the
   * session engine.
   */
  public fun additionalConfiguration(additionalConfiguration: String) {
    cdkBuilder.additionalConfiguration(additionalConfiguration)
  }

  /**
   * @param bytesScannedCutoffPerQuery The upper limit (cutoff) for the amount of bytes a single
   * query in a workgroup is allowed to scan.
   * No default is defined.
   *
   *
   * This property currently supports integer types. Support for long values is planned.
   */
  public fun bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery: Number) {
    cdkBuilder.bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery)
  }

  /**
   * @param customerContentEncryptionConfiguration Specifies the KMS key that is used to encrypt the
   * user's data stores in Athena.
   * This setting does not apply to Athena SQL workgroups.
   */
  public
      fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: IResolvable) {
    cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration)
  }

  /**
   * @param customerContentEncryptionConfiguration Specifies the KMS key that is used to encrypt the
   * user's data stores in Athena.
   * This setting does not apply to Athena SQL workgroups.
   */
  public
      fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CfnWorkGroup.CustomerContentEncryptionConfigurationProperty) {
    cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration)
  }

  /**
   * @param enforceWorkGroupConfiguration If set to "true", the settings for the workgroup override
   * client-side settings.
   * If set to "false", client-side settings are used. For more information, see [Workgroup Settings
   * Override Client-Side
   * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
   */
  public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: Boolean) {
    cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration)
  }

  /**
   * @param enforceWorkGroupConfiguration If set to "true", the settings for the workgroup override
   * client-side settings.
   * If set to "false", client-side settings are used. For more information, see [Workgroup Settings
   * Override Client-Side
   * Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html) .
   */
  public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: IResolvable) {
    cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration)
  }

  /**
   * @param engineVersion The engine version that all queries running on the workgroup use.
   */
  public fun engineVersion(engineVersion: IResolvable) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * @param engineVersion The engine version that all queries running on the workgroup use.
   */
  public fun engineVersion(engineVersion: CfnWorkGroup.EngineVersionProperty) {
    cdkBuilder.engineVersion(engineVersion)
  }

  /**
   * @param executionRole Role used to access user resources in an Athena for Apache Spark session.
   * This property applies only to Spark-enabled workgroups in Athena.
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
   * @param requesterPaysEnabled If set to `true` , allows members assigned to a workgroup to
   * reference Amazon S3 Requester Pays buckets in queries.
   * If set to `false` , workgroup members cannot query data from Requester Pays buckets, and
   * queries that retrieve data from Requester Pays buckets cause an error. The default is `false` .
   * For more information about Requester Pays buckets, see [Requester Pays
   * Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html) in the *Amazon
   * Simple Storage Service Developer Guide* .
   */
  public fun requesterPaysEnabled(requesterPaysEnabled: Boolean) {
    cdkBuilder.requesterPaysEnabled(requesterPaysEnabled)
  }

  /**
   * @param requesterPaysEnabled If set to `true` , allows members assigned to a workgroup to
   * reference Amazon S3 Requester Pays buckets in queries.
   * If set to `false` , workgroup members cannot query data from Requester Pays buckets, and
   * queries that retrieve data from Requester Pays buckets cause an error. The default is `false` .
   * For more information about Requester Pays buckets, see [Requester Pays
   * Buckets](https://docs.aws.amazon.com/AmazonS3/latest/dev/RequesterPaysBuckets.html) in the *Amazon
   * Simple Storage Service Developer Guide* .
   */
  public fun requesterPaysEnabled(requesterPaysEnabled: IResolvable) {
    cdkBuilder.requesterPaysEnabled(requesterPaysEnabled)
  }

  /**
   * @param resultConfiguration Specifies the location in Amazon S3 where query results are stored
   * and the encryption option, if any, used for query results.
   * For more information, see [Working with Query Results, Output Files, and Query
   * History](https://docs.aws.amazon.com/athena/latest/ug/querying.html) .
   */
  public fun resultConfiguration(resultConfiguration: IResolvable) {
    cdkBuilder.resultConfiguration(resultConfiguration)
  }

  /**
   * @param resultConfiguration Specifies the location in Amazon S3 where query results are stored
   * and the encryption option, if any, used for query results.
   * For more information, see [Working with Query Results, Output Files, and Query
   * History](https://docs.aws.amazon.com/athena/latest/ug/querying.html) .
   */
  public fun resultConfiguration(resultConfiguration: CfnWorkGroup.ResultConfigurationProperty) {
    cdkBuilder.resultConfiguration(resultConfiguration)
  }

  public fun build(): CfnWorkGroup.WorkGroupConfigurationProperty = cdkBuilder.build()
}
