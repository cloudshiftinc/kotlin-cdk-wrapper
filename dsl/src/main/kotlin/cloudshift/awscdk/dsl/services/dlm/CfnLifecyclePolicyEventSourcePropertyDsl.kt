@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
 * *[Event-based policies only]* Specifies an event that activates an event-based policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * EventSourceProperty eventSourceProperty = EventSourceProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .parameters(EventParametersProperty.builder()
 * .eventType("eventType")
 * .snapshotOwner(List.of("snapshotOwner"))
 * // the properties below are optional
 * .descriptionRegex("descriptionRegex")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-eventsource.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyEventSourcePropertyDsl {
  private val cdkBuilder: CfnLifecyclePolicy.EventSourceProperty.Builder =
      CfnLifecyclePolicy.EventSourceProperty.builder()

  /**
   * @param parameters Information about the event.
   */
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param parameters Information about the event.
   */
  public fun parameters(parameters: CfnLifecyclePolicy.EventParametersProperty) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param type The source of the event. 
   * Currently only managed CloudWatch Events rules are supported.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnLifecyclePolicy.EventSourceProperty = cdkBuilder.build()
}
