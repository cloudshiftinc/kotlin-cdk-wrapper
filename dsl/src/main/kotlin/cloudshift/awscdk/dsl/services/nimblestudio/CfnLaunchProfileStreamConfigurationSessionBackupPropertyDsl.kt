@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile

@CdkDslMarker
public class CfnLaunchProfileStreamConfigurationSessionBackupPropertyDsl {
  private val cdkBuilder: CfnLaunchProfile.StreamConfigurationSessionBackupProperty.Builder =
      CfnLaunchProfile.StreamConfigurationSessionBackupProperty.builder()

  /**
   * @param maxBackupsToRetain The maximum number of backups that each streaming session created
   * from this launch             profile can have.</p>.
   */
  public fun maxBackupsToRetain(maxBackupsToRetain: Number) {
    cdkBuilder.maxBackupsToRetain(maxBackupsToRetain)
  }

  /**
   * @param mode the value to be set.
   */
  public fun mode(mode: String) {
    cdkBuilder.mode(mode)
  }

  public fun build(): CfnLaunchProfile.StreamConfigurationSessionBackupProperty = cdkBuilder.build()
}
