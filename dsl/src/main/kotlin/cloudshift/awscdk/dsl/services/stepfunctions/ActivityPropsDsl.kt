@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.ActivityProps

@CdkDslMarker
public class ActivityPropsDsl {
  private val cdkBuilder: ActivityProps.Builder = ActivityProps.builder()

  public fun activityName(activityName: String) {
    cdkBuilder.activityName(activityName)
  }

  public fun build(): ActivityProps = cdkBuilder.build()
}
