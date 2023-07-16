@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.stepfunctions.SingleStateOptions

@CdkDslMarker
public class SingleStateOptionsDsl {
  private val cdkBuilder: SingleStateOptions.Builder = SingleStateOptions.builder()

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  public fun outputPath(outputPath: String) {
    cdkBuilder.outputPath(outputPath)
  }

  public fun prefixStates(prefixStates: String) {
    cdkBuilder.prefixStates(prefixStates)
  }

  public fun resultPath(resultPath: String) {
    cdkBuilder.resultPath(resultPath)
  }

  public fun resultSelector(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.resultSelector(builder.map)
  }

  public fun resultSelector(resultSelector: Map<String, *>) {
    cdkBuilder.resultSelector(resultSelector)
  }

  public fun stateId(stateId: String) {
    cdkBuilder.stateId(stateId)
  }

  public fun build(): SingleStateOptions = cdkBuilder.build()
}
