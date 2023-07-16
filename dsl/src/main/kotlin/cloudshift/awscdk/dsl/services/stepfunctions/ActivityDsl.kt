@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.Activity
import software.constructs.Construct

@CdkDslMarker
public class ActivityDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Activity.Builder = Activity.Builder.create(scope, id)

  public fun activityName(activityName: String) {
    cdkBuilder.activityName(activityName)
  }

  public fun build(): Activity = cdkBuilder.build()
}
