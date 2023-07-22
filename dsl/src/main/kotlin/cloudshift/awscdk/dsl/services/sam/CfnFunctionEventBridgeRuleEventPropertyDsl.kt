@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionEventBridgeRuleEventPropertyDsl {
  private val cdkBuilder: CfnFunction.EventBridgeRuleEventProperty.Builder =
      CfnFunction.EventBridgeRuleEventProperty.builder()

  /**
   * @param eventBusName the value to be set.
   */
  public fun eventBusName(eventBusName: String) {
    cdkBuilder.eventBusName(eventBusName)
  }

  /**
   * @param input the value to be set.
   */
  public fun input(input: String) {
    cdkBuilder.input(input)
  }

  /**
   * @param inputPath the value to be set.
   */
  public fun inputPath(inputPath: String) {
    cdkBuilder.inputPath(inputPath)
  }

  /**
   * @param pattern the value to be set. 
   */
  public fun pattern(pattern: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(pattern)
    cdkBuilder.pattern(builder.map)
  }

  /**
   * @param pattern the value to be set. 
   */
  public fun pattern(pattern: Any) {
    cdkBuilder.pattern(pattern)
  }

  public fun build(): CfnFunction.EventBridgeRuleEventProperty = cdkBuilder.build()
}
