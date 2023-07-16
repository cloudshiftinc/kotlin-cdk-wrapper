@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplatePercentVisibleRangePropertyDsl {
  private val cdkBuilder: CfnTemplate.PercentVisibleRangeProperty.Builder =
      CfnTemplate.PercentVisibleRangeProperty.builder()

  public fun from(from: Number) {
    cdkBuilder.from(from)
  }

  public fun to(to: Number) {
    cdkBuilder.to(to)
  }

  public fun build(): CfnTemplate.PercentVisibleRangeProperty = cdkBuilder.build()
}
