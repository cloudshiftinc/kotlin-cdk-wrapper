@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

@CdkDslMarker
public class CfnStorageLensStorageLensConfigurationPropertyDsl {
  private val cdkBuilder: CfnStorageLens.StorageLensConfigurationProperty.Builder =
      CfnStorageLens.StorageLensConfigurationProperty.builder()

  /**
   * @param accountLevel This property contains the details of the account-level metrics for Amazon
   * S3 Storage Lens configuration. 
   */
  public fun accountLevel(accountLevel: IResolvable) {
    cdkBuilder.accountLevel(accountLevel)
  }

  /**
   * @param accountLevel This property contains the details of the account-level metrics for Amazon
   * S3 Storage Lens configuration. 
   */
  public fun accountLevel(accountLevel: CfnStorageLens.AccountLevelProperty) {
    cdkBuilder.accountLevel(accountLevel)
  }

  /**
   * @param awsOrg This property contains the details of the AWS Organization for the S3 Storage
   * Lens configuration.
   */
  public fun awsOrg(awsOrg: IResolvable) {
    cdkBuilder.awsOrg(awsOrg)
  }

  /**
   * @param awsOrg This property contains the details of the AWS Organization for the S3 Storage
   * Lens configuration.
   */
  public fun awsOrg(awsOrg: CfnStorageLens.AwsOrgProperty) {
    cdkBuilder.awsOrg(awsOrg)
  }

  /**
   * @param dataExport This property contains the details of this S3 Storage Lens configuration's
   * metrics export.
   */
  public fun dataExport(dataExport: IResolvable) {
    cdkBuilder.dataExport(dataExport)
  }

  /**
   * @param dataExport This property contains the details of this S3 Storage Lens configuration's
   * metrics export.
   */
  public fun dataExport(dataExport: CfnStorageLens.DataExportProperty) {
    cdkBuilder.dataExport(dataExport)
  }

  /**
   * @param exclude This property contains the details of the bucket and or Regions excluded for
   * Amazon S3 Storage Lens configuration.
   */
  public fun exclude(exclude: IResolvable) {
    cdkBuilder.exclude(exclude)
  }

  /**
   * @param exclude This property contains the details of the bucket and or Regions excluded for
   * Amazon S3 Storage Lens configuration.
   */
  public fun exclude(exclude: CfnStorageLens.BucketsAndRegionsProperty) {
    cdkBuilder.exclude(exclude)
  }

  /**
   * @param id This property contains the details of the ID of the S3 Storage Lens configuration. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param include This property contains the details of the bucket and or Regions included for
   * Amazon S3 Storage Lens configuration.
   */
  public fun include(include: IResolvable) {
    cdkBuilder.include(include)
  }

  /**
   * @param include This property contains the details of the bucket and or Regions included for
   * Amazon S3 Storage Lens configuration.
   */
  public fun include(include: CfnStorageLens.BucketsAndRegionsProperty) {
    cdkBuilder.include(include)
  }

  /**
   * @param isEnabled This property contains the details of whether the Amazon S3 Storage Lens
   * configuration is enabled. 
   */
  public fun isEnabled(isEnabled: Boolean) {
    cdkBuilder.isEnabled(isEnabled)
  }

  /**
   * @param isEnabled This property contains the details of whether the Amazon S3 Storage Lens
   * configuration is enabled. 
   */
  public fun isEnabled(isEnabled: IResolvable) {
    cdkBuilder.isEnabled(isEnabled)
  }

  /**
   * @param storageLensArn This property contains the details of the ARN of the S3 Storage Lens
   * configuration.
   * This property is read-only.
   */
  public fun storageLensArn(storageLensArn: String) {
    cdkBuilder.storageLensArn(storageLensArn)
  }

  public fun build(): CfnStorageLens.StorageLensConfigurationProperty = cdkBuilder.build()
}
