@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.TextWidgetBackground
import software.amazon.awscdk.services.cloudwatch.TextWidgetProps

@CdkDslMarker
public class TextWidgetPropsDsl {
  private val cdkBuilder: TextWidgetProps.Builder = TextWidgetProps.builder()

  public fun background(background: TextWidgetBackground) {
    cdkBuilder.background(background)
  }

  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  public fun markdown(markdown: String) {
    cdkBuilder.markdown(markdown)
  }

  public fun width(width: Number) {
    cdkBuilder.width(width)
  }

  public fun build(): TextWidgetProps = cdkBuilder.build()
}
