@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

@CdkDslMarker
public class CfnPipePipeTargetHttpParametersPropertyDsl {
  private val cdkBuilder: CfnPipe.PipeTargetHttpParametersProperty.Builder =
      CfnPipe.PipeTargetHttpParametersProperty.builder()

  private val _pathParameterValues: MutableList<String> = mutableListOf()

  public fun headerParameters(headerParameters: Map<String, String>) {
    cdkBuilder.headerParameters(headerParameters)
  }

  public fun headerParameters(headerParameters: IResolvable) {
    cdkBuilder.headerParameters(headerParameters)
  }

  public fun pathParameterValues(vararg pathParameterValues: String) {
    _pathParameterValues.addAll(listOf(*pathParameterValues))
  }

  public fun pathParameterValues(pathParameterValues: Collection<String>) {
    _pathParameterValues.addAll(pathParameterValues)
  }

  public fun queryStringParameters(queryStringParameters: Map<String, String>) {
    cdkBuilder.queryStringParameters(queryStringParameters)
  }

  public fun queryStringParameters(queryStringParameters: IResolvable) {
    cdkBuilder.queryStringParameters(queryStringParameters)
  }

  public fun build(): CfnPipe.PipeTargetHttpParametersProperty {
    if(_pathParameterValues.isNotEmpty()) cdkBuilder.pathParameterValues(_pathParameterValues)
    return cdkBuilder.build()
  }
}
