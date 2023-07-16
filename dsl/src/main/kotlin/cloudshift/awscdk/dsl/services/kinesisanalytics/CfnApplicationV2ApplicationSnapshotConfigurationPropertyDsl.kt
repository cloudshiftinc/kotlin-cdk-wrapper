@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2ApplicationSnapshotConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.ApplicationSnapshotConfigurationProperty.Builder =
      CfnApplicationV2.ApplicationSnapshotConfigurationProperty.builder()

  public fun snapshotsEnabled(snapshotsEnabled: Boolean) {
    cdkBuilder.snapshotsEnabled(snapshotsEnabled)
  }

  public fun snapshotsEnabled(snapshotsEnabled: IResolvable) {
    cdkBuilder.snapshotsEnabled(snapshotsEnabled)
  }

  public fun build(): CfnApplicationV2.ApplicationSnapshotConfigurationProperty = cdkBuilder.build()
}
