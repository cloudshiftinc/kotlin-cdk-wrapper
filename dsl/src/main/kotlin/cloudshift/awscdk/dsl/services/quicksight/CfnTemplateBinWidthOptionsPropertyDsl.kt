@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateBinWidthOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.BinWidthOptionsProperty.Builder =
      CfnTemplate.BinWidthOptionsProperty.builder()

  public fun binCountLimit(binCountLimit: Number) {
    cdkBuilder.binCountLimit(binCountLimit)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTemplate.BinWidthOptionsProperty = cdkBuilder.build()
}
