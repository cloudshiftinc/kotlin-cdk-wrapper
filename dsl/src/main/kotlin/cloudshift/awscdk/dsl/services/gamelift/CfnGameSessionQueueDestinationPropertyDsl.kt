@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.gamelift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

/**
 * A fleet or alias designated in a game session queue.
 *
 * Queues fulfill requests for new game sessions by placing a new game session on any of the queue's
 * destinations.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.gamelift.*;
 * DestinationProperty destinationProperty = DestinationProperty.builder()
 * .destinationArn("destinationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-destination.html)
 */
@CdkDslMarker
public class CfnGameSessionQueueDestinationPropertyDsl {
  private val cdkBuilder: CfnGameSessionQueue.DestinationProperty.Builder =
      CfnGameSessionQueue.DestinationProperty.builder()

  /**
   * @param destinationArn The Amazon Resource Name (ARN) that is assigned to fleet or fleet alias.
   * ARNs, which include a fleet ID or alias ID and a Region name, provide a unique identifier
   * across all Regions.
   */
  public fun destinationArn(destinationArn: String) {
    cdkBuilder.destinationArn(destinationArn)
  }

  public fun build(): CfnGameSessionQueue.DestinationProperty = cdkBuilder.build()
}
