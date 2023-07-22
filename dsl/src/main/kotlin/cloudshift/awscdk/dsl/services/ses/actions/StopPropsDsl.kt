@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.actions.StopProps
import software.amazon.awscdk.services.sns.ITopic

/**
 * Construction properties for a stop action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.actions.*;
 * import software.amazon.awscdk.services.sns.*;
 * Topic topic;
 * StopProps stopProps = StopProps.builder()
 * .topic(topic)
 * .build();
 * ```
 */
@CdkDslMarker
public class StopPropsDsl {
  private val cdkBuilder: StopProps.Builder = StopProps.builder()

  /**
   * @param topic The SNS topic to notify when the stop action is taken.
   */
  public fun topic(topic: ITopic) {
    cdkBuilder.topic(topic)
  }

  public fun build(): StopProps = cdkBuilder.build()
}
