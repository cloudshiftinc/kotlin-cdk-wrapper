@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateLegendOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.LegendOptionsProperty.Builder =
      CfnTemplate.LegendOptionsProperty.builder()

  public fun height(height: String) {
    cdkBuilder.height(height)
  }

  public fun position(position: String) {
    cdkBuilder.position(position)
  }

  public fun title(title: IResolvable) {
    cdkBuilder.title(title)
  }

  public fun title(title: CfnTemplate.LabelOptionsProperty) {
    cdkBuilder.title(title)
  }

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun width(width: String) {
    cdkBuilder.width(width)
  }

  public fun build(): CfnTemplate.LegendOptionsProperty = cdkBuilder.build()
}
