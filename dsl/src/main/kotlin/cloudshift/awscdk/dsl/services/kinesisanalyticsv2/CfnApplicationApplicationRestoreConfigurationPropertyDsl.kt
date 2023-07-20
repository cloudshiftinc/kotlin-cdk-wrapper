@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationApplicationRestoreConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.ApplicationRestoreConfigurationProperty.Builder =
      CfnApplication.ApplicationRestoreConfigurationProperty.builder()

  public fun applicationRestoreType(applicationRestoreType: String) {
    cdkBuilder.applicationRestoreType(applicationRestoreType)
  }

  public fun snapshotName(snapshotName: String) {
    cdkBuilder.snapshotName(snapshotName)
  }

  public fun build(): CfnApplication.ApplicationRestoreConfigurationProperty = cdkBuilder.build()
}
