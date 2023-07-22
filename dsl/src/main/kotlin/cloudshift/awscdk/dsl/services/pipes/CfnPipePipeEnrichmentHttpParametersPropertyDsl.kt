@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * These are custom parameter to be used when the target is an API Gateway REST APIs or EventBridge
 * ApiDestinations.
 *
 * In the latter case, these are merged with any InvocationParameters specified on the Connection,
 * with any values from the Connection taking precedence.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * PipeEnrichmentHttpParametersProperty pipeEnrichmentHttpParametersProperty =
 * PipeEnrichmentHttpParametersProperty.builder()
 * .headerParameters(Map.of(
 * "headerParametersKey", "headerParameters"))
 * .pathParameterValues(List.of("pathParameterValues"))
 * .queryStringParameters(Map.of(
 * "queryStringParametersKey", "queryStringParameters"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipeenrichmenthttpparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeEnrichmentHttpParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeEnrichmentHttpParametersProperty.Builder =
      CfnPipe.PipeEnrichmentHttpParametersProperty.builder()

  private val _pathParameterValues: MutableList<String> = mutableListOf()

  /**
   * @param headerParameters The headers that need to be sent as part of request invoking the API
   * Gateway REST API or EventBridge ApiDestination.
   */
  public fun headerParameters(headerParameters: Map<String, String>) {
    cdkBuilder.headerParameters(headerParameters)
  }

  /**
   * @param headerParameters The headers that need to be sent as part of request invoking the API
   * Gateway REST API or EventBridge ApiDestination.
   */
  public fun headerParameters(headerParameters: IResolvable) {
    cdkBuilder.headerParameters(headerParameters)
  }

  /**
   * @param pathParameterValues The path parameter values to be used to populate API Gateway REST
   * API or EventBridge ApiDestination path wildcards ("*").
   */
  public fun pathParameterValues(vararg pathParameterValues: String) {
    _pathParameterValues.addAll(listOf(*pathParameterValues))
  }

  /**
   * @param pathParameterValues The path parameter values to be used to populate API Gateway REST
   * API or EventBridge ApiDestination path wildcards ("*").
   */
  public fun pathParameterValues(pathParameterValues: Collection<String>) {
    _pathParameterValues.addAll(pathParameterValues)
  }

  /**
   * @param queryStringParameters The query string keys/values that need to be sent as part of
   * request invoking the API Gateway REST API or EventBridge ApiDestination.
   */
  public fun queryStringParameters(queryStringParameters: Map<String, String>) {
    cdkBuilder.queryStringParameters(queryStringParameters)
  }

  /**
   * @param queryStringParameters The query string keys/values that need to be sent as part of
   * request invoking the API Gateway REST API or EventBridge ApiDestination.
   */
  public fun queryStringParameters(queryStringParameters: IResolvable) {
    cdkBuilder.queryStringParameters(queryStringParameters)
  }

  public fun build(): CfnPipe.PipeEnrichmentHttpParametersProperty {
    if(_pathParameterValues.isNotEmpty()) cdkBuilder.pathParameterValues(_pathParameterValues)
    return cdkBuilder.build()
  }
}
