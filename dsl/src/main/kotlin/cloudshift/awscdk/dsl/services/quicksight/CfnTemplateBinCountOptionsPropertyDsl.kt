@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateBinCountOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.BinCountOptionsProperty.Builder =
      CfnTemplate.BinCountOptionsProperty.builder()

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTemplate.BinCountOptionsProperty = cdkBuilder.build()
}
