@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2ApplicationRestoreConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.ApplicationRestoreConfigurationProperty.Builder =
      CfnApplicationV2.ApplicationRestoreConfigurationProperty.builder()

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

  public fun build(): CfnApplicationV2.ApplicationRestoreConfigurationProperty = cdkBuilder.build()
}
