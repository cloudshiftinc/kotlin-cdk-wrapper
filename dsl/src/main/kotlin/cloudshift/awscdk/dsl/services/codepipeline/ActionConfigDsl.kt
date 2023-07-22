@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.ActionConfig

@CdkDslMarker
public class ActionConfigDsl {
  private val cdkBuilder: ActionConfig.Builder = ActionConfig.builder()

  /**
   * @param configuration the value to be set.
   */
  public fun configuration(configuration: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(configuration)
    cdkBuilder.configuration(builder.map)
  }

  /**
   * @param configuration the value to be set.
   */
  public fun configuration(configuration: Any) {
    cdkBuilder.configuration(configuration)
  }

  public fun build(): ActionConfig = cdkBuilder.build()
}
