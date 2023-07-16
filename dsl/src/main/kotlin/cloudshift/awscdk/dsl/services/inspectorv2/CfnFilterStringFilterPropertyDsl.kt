@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspectorv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.inspectorv2.CfnFilter

@CdkDslMarker
public class CfnFilterStringFilterPropertyDsl {
  private val cdkBuilder: CfnFilter.StringFilterProperty.Builder =
      CfnFilter.StringFilterProperty.builder()

  public fun comparison(comparison: String) {
    cdkBuilder.comparison(comparison)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnFilter.StringFilterProperty = cdkBuilder.build()
}
