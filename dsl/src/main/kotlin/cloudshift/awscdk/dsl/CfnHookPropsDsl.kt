@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.CfnHookProps

@CdkDslMarker
public class CfnHookPropsDsl {
  private val cdkBuilder: CfnHookProps.Builder = CfnHookProps.builder()

  /**
   * @param properties The properties of the hook.
   */
  public fun properties(properties: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(properties)
    cdkBuilder.properties(builder.map)
  }

  /**
   * @param properties The properties of the hook.
   */
  public fun properties(properties: Map<String, Any>) {
    cdkBuilder.properties(properties)
  }

  /**
   * @param type The type of the hook (for example, "AWS::CodeDeploy::BlueGreen"). 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnHookProps = cdkBuilder.build()
}
