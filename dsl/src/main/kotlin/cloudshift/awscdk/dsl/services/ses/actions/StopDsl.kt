@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.actions.Stop
import software.amazon.awscdk.services.sns.ITopic

/**
 * Terminates the evaluation of the receipt rule set and optionally publishes a notification to
 * Amazon SNS.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.actions.*;
 * import software.amazon.awscdk.services.sns.*;
 * Topic topic;
 * Stop stop = Stop.Builder.create()
 * .topic(topic)
 * .build();
 * ```
 */
@CdkDslMarker
public class StopDsl {
  private val cdkBuilder: Stop.Builder = Stop.Builder.create()

  /**
   * The SNS topic to notify when the stop action is taken.
   *
   * @param topic The SNS topic to notify when the stop action is taken. 
   */
  public fun topic(topic: ITopic) {
    cdkBuilder.topic(topic)
  }

  public fun build(): Stop = cdkBuilder.build()
}
