@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation
import software.amazon.awscdk.services.cloudwatch.Shading

@CdkDslMarker
public class HorizontalAnnotationDsl {
  private val cdkBuilder: HorizontalAnnotation.Builder = HorizontalAnnotation.builder()

  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun fill(fill: Shading) {
    cdkBuilder.fill(fill)
  }

  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun visible(visible: Boolean) {
    cdkBuilder.visible(visible)
  }

  public fun build(): HorizontalAnnotation = cdkBuilder.build()
}
