@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.stepfunctions.CustomStateProps

@CdkDslMarker
public class CustomStatePropsDsl {
  private val cdkBuilder: CustomStateProps.Builder = CustomStateProps.builder()

  /**
   * @param stateJson Amazon States Language (JSON-based) definition of the state. 
   */
  public fun stateJson(stateJson: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(stateJson)
    cdkBuilder.stateJson(builder.map)
  }

  /**
   * @param stateJson Amazon States Language (JSON-based) definition of the state. 
   */
  public fun stateJson(stateJson: Map<String, Any>) {
    cdkBuilder.stateJson(stateJson)
  }

  public fun build(): CustomStateProps = cdkBuilder.build()
}
