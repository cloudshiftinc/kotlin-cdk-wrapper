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

  public fun accountLevel(accountLevel: IResolvable) {
    cdkBuilder.accountLevel(accountLevel)
  }

  public fun accountLevel(accountLevel: CfnStorageLens.AccountLevelProperty) {
    cdkBuilder.accountLevel(accountLevel)
  }

  public fun awsOrg(awsOrg: IResolvable) {
    cdkBuilder.awsOrg(awsOrg)
  }

  public fun awsOrg(awsOrg: CfnStorageLens.AwsOrgProperty) {
    cdkBuilder.awsOrg(awsOrg)
  }

  public fun dataExport(dataExport: IResolvable) {
    cdkBuilder.dataExport(dataExport)
  }

  public fun dataExport(dataExport: CfnStorageLens.DataExportProperty) {
    cdkBuilder.dataExport(dataExport)
  }

  public fun exclude(exclude: IResolvable) {
    cdkBuilder.exclude(exclude)
  }

  public fun exclude(exclude: CfnStorageLens.BucketsAndRegionsProperty) {
    cdkBuilder.exclude(exclude)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun include(include: IResolvable) {
    cdkBuilder.include(include)
  }

  public fun include(include: CfnStorageLens.BucketsAndRegionsProperty) {
    cdkBuilder.include(include)
  }

  public fun isEnabled(isEnabled: Boolean) {
    cdkBuilder.isEnabled(isEnabled)
  }

  public fun isEnabled(isEnabled: IResolvable) {
    cdkBuilder.isEnabled(isEnabled)
  }

  public fun storageLensArn(storageLensArn: String) {
    cdkBuilder.storageLensArn(storageLensArn)
  }

  public fun build(): CfnStorageLens.StorageLensConfigurationProperty = cdkBuilder.build()
}
