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

  public fun stateJson(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.stateJson(builder.map)
  }

  public fun stateJson(stateJson: Map<String, Any>) {
    cdkBuilder.stateJson(stateJson)
  }

  public fun build(): CustomStateProps = cdkBuilder.build()
}
