@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateDataColorPropertyDsl {
  private val cdkBuilder: CfnTemplate.DataColorProperty.Builder =
      CfnTemplate.DataColorProperty.builder()

  public fun color(color: String) {
    cdkBuilder.color(color)
  }

  public fun dataValue(dataValue: Number) {
    cdkBuilder.dataValue(dataValue)
  }

  public fun build(): CfnTemplate.DataColorProperty = cdkBuilder.build()
}
