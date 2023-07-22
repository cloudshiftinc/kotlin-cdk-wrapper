@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The parameters for using an EventBridge event bus as a target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeTargetEventBridgeEventBusParametersProperty pipeTargetEventBridgeEventBusParametersProperty =
 * PipeTargetEventBridgeEventBusParametersProperty.builder()
 * .detailType("detailType")
 * .endpointId("endpointId")
 * .resources(List.of("resources"))
 * .source("source")
 * .time("time")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargeteventbridgeeventbusparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeTargetEventBridgeEventBusParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeTargetEventBridgeEventBusParametersProperty.Builder =
      CfnPipe.PipeTargetEventBridgeEventBusParametersProperty.builder()

  private val _resources: MutableList<String> = mutableListOf()

  /**
   * @param detailType A free-form string, with a maximum of 128 characters, used to decide what
   * fields to expect in the event detail.
   */
  public fun detailType(detailType: String) {
    cdkBuilder.detailType(detailType)
  }

  /**
   * @param endpointId The URL subdomain of the endpoint.
   * For example, if the URL for Endpoint is https://abcde.veo.endpoints.event.amazonaws.com, then
   * the EndpointId is `abcde.veo` .
   */
  public fun endpointId(endpointId: String) {
    cdkBuilder.endpointId(endpointId)
  }

  /**
   * @param resources AWS resources, identified by Amazon Resource Name (ARN), which the event
   * primarily concerns.
   * Any number, including zero, may be present.
   */
  public fun resources(vararg resources: String) {
    _resources.addAll(listOf(*resources))
  }

  /**
   * @param resources AWS resources, identified by Amazon Resource Name (ARN), which the event
   * primarily concerns.
   * Any number, including zero, may be present.
   */
  public fun resources(resources: Collection<String>) {
    _resources.addAll(resources)
  }

  /**
   * @param source The source of the event.
   */
  public fun source(source: String) {
    cdkBuilder.source(source)
  }

  /**
   * @param time The time stamp of the event, per
   * [RFC3339](https://docs.aws.amazon.com/https://www.rfc-editor.org/rfc/rfc3339.txt) . If no time
   * stamp is provided, the time stamp of the
   * [PutEvents](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html) call
   * is used.
   */
  public fun time(time: String) {
    cdkBuilder.time(time)
  }

  public fun build(): CfnPipe.PipeTargetEventBridgeEventBusParametersProperty {
    if(_resources.isNotEmpty()) cdkBuilder.resources(_resources)
    return cdkBuilder.build()
  }
}
