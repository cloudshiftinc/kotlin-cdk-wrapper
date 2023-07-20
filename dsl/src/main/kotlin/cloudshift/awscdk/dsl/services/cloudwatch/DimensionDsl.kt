@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Dimension

@CdkDslMarker
public class DimensionDsl {
  private val cdkBuilder: Dimension.Builder = Dimension.builder()

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun `value`(block: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(block)
    cdkBuilder.`value`(builder.map)
  }

  public fun `value`(`value`: Any) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): Dimension = cdkBuilder.build()
}
