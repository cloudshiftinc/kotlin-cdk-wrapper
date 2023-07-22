@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnStateMachine

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * EventSourceProperty eventSourceProperty = EventSourceProperty.builder()
 * .properties(ApiEventProperty.builder()
 * .method("method")
 * .path("path")
 * // the properties below are optional
 * .restApiId("restApiId")
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-eventsource.html)
 */
@CdkDslMarker
public class CfnStateMachineEventSourcePropertyDsl {
  private val cdkBuilder: CfnStateMachine.EventSourceProperty.Builder =
      CfnStateMachine.EventSourceProperty.builder()

  /**
   * @param properties the value to be set. 
   */
  public fun properties(properties: IResolvable) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param properties the value to be set. 
   */
  public fun properties(properties: CfnStateMachine.ApiEventProperty) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param properties the value to be set. 
   */
  public fun properties(properties: CfnStateMachine.CloudWatchEventEventProperty) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param properties the value to be set. 
   */
  public fun properties(properties: CfnStateMachine.EventBridgeRuleEventProperty) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param properties the value to be set. 
   */
  public fun properties(properties: CfnStateMachine.ScheduleEventProperty) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param type the value to be set. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnStateMachine.EventSourceProperty = cdkBuilder.build()
}
