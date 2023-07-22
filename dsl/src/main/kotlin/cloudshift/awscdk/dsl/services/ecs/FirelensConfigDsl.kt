@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.ecs.FirelensConfig
import software.amazon.awscdk.services.ecs.FirelensLogRouterType
import software.amazon.awscdk.services.ecs.FirelensOptions

@CdkDslMarker
public class FirelensConfigDsl {
  private val cdkBuilder: FirelensConfig.Builder = FirelensConfig.builder()

  /**
   * @param options Firelens options.
   */
  public fun options(options: FirelensOptionsDsl.() -> Unit = {}) {
    val builder = FirelensOptionsDsl()
    builder.apply(options)
    cdkBuilder.options(builder.build())
  }

  /**
   * @param options Firelens options.
   */
  public fun options(options: FirelensOptions) {
    cdkBuilder.options(options)
  }

  /**
   * @param type The log router to use. 
   */
  public fun type(type: FirelensLogRouterType) {
    cdkBuilder.type(type)
  }

  public fun build(): FirelensConfig = cdkBuilder.build()
}
