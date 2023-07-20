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

  public fun options(block: FirelensOptionsDsl.() -> Unit = {}) {
    val builder = FirelensOptionsDsl()
    builder.apply(block)
    cdkBuilder.options(builder.build())
  }

  public fun options(options: FirelensOptions) {
    cdkBuilder.options(options)
  }

  public fun type(type: FirelensLogRouterType) {
    cdkBuilder.type(type)
  }

  public fun build(): FirelensConfig = cdkBuilder.build()
}
