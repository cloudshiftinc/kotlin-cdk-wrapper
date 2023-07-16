@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.location

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.location.CfnTrackerProps

@CdkDslMarker
public class CfnTrackerPropsDsl {
  private val cdkBuilder: CfnTrackerProps.Builder = CfnTrackerProps.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun positionFiltering(positionFiltering: String) {
    cdkBuilder.positionFiltering(positionFiltering)
  }

  public fun trackerName(trackerName: String) {
    cdkBuilder.trackerName(trackerName)
  }

  public fun build(): CfnTrackerProps = cdkBuilder.build()
}
