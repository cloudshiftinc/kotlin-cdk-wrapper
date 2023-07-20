@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.robomaker.CfnSimulationApplicationVersionProps

@CdkDslMarker
public class CfnSimulationApplicationVersionPropsDsl {
  private val cdkBuilder: CfnSimulationApplicationVersionProps.Builder =
      CfnSimulationApplicationVersionProps.builder()

  public fun application(application: String) {
    cdkBuilder.application(application)
  }

  public fun currentRevisionId(currentRevisionId: String) {
    cdkBuilder.currentRevisionId(currentRevisionId)
  }

  public fun build(): CfnSimulationApplicationVersionProps = cdkBuilder.build()
}
