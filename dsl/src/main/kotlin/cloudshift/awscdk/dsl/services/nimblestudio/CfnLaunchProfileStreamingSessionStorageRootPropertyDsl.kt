@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile

@CdkDslMarker
public class CfnLaunchProfileStreamingSessionStorageRootPropertyDsl {
  private val cdkBuilder: CfnLaunchProfile.StreamingSessionStorageRootProperty.Builder =
      CfnLaunchProfile.StreamingSessionStorageRootProperty.builder()

  /**
   * @param linux The folder path in Linux workstations where files are uploaded.
   */
  public fun linux(linux: String) {
    cdkBuilder.linux(linux)
  }

  /**
   * @param windows The folder path in Windows workstations where files are uploaded.
   */
  public fun windows(windows: String) {
    cdkBuilder.windows(windows)
  }

  public fun build(): CfnLaunchProfile.StreamingSessionStorageRootProperty = cdkBuilder.build()
}
