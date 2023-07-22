@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationApplicationRestoreConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.ApplicationRestoreConfigurationProperty.Builder =
      CfnApplication.ApplicationRestoreConfigurationProperty.builder()

  /**
   * @param applicationRestoreType Specifies how the application should be restored. 
   */
  public fun applicationRestoreType(applicationRestoreType: String) {
    cdkBuilder.applicationRestoreType(applicationRestoreType)
  }

  /**
   * @param snapshotName The identifier of an existing snapshot of application state to use to
   * restart an application.
   * The application uses this value if `RESTORE_FROM_CUSTOM_SNAPSHOT` is specified for the
   * `ApplicationRestoreType` .
   */
  public fun snapshotName(snapshotName: String) {
    cdkBuilder.snapshotName(snapshotName)
  }

  public fun build(): CfnApplication.ApplicationRestoreConfigurationProperty = cdkBuilder.build()
}
