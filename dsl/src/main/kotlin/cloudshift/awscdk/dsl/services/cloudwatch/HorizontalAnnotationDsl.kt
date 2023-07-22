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

  /**
   * @param color The hex color code, prefixed with '#' (e.g. '#00ff00'), to be used for the
   * annotation. The `Color` class has a set of standard colors that can be used here.
   */
  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  /**
   * @param fill Add shading above or below the annotation.
   */
  public fun fill(fill: Shading) {
    cdkBuilder.fill(fill)
  }

  /**
   * @param label Label for the annotation.
   */
  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  /**
   * @param value The value of the annotation. 
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param visible Whether the annotation is visible.
   */
  public fun visible(visible: Boolean) {
    cdkBuilder.visible(visible)
  }

  public fun build(): HorizontalAnnotation = cdkBuilder.build()
}
