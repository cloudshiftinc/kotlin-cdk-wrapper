@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps

@CdkDslMarker
public class CfnSimulationApplicationVersionPropsDsl {
  private val cdkBuilder: CfnSimulationApplicationVersionProps.Builder =
      CfnSimulationApplicationVersionProps.builder()

  /**
   * @param application The application information for the simulation application. 
   */
  public fun application(application: String) {
    cdkBuilder.application(application)
  }

  /**
   * @param currentRevisionId The current revision id for the simulation application.
   * If you provide a value and it matches the latest revision ID, a new version will be created.
   */
  public fun currentRevisionId(currentRevisionId: String) {
    cdkBuilder.currentRevisionId(currentRevisionId)
  }

  public fun build(): CfnSimulationApplicationVersionProps = cdkBuilder.build()
}
