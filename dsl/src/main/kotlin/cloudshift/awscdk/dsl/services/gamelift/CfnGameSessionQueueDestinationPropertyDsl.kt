@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

@CdkDslMarker
public class CfnGameSessionQueueDestinationPropertyDsl {
  private val cdkBuilder: CfnGameSessionQueue.DestinationProperty.Builder =
      CfnGameSessionQueue.DestinationProperty.builder()

  public fun destinationArn(destinationArn: String) {
    cdkBuilder.destinationArn(destinationArn)
  }

  public fun build(): CfnGameSessionQueue.DestinationProperty = cdkBuilder.build()
}
