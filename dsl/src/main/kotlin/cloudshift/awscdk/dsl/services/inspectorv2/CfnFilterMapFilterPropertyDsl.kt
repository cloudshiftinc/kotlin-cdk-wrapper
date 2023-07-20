@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.inspectorv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.inspectorv2.CfnFilter

@CdkDslMarker
public class CfnFilterMapFilterPropertyDsl {
  private val cdkBuilder: CfnFilter.MapFilterProperty.Builder =
      CfnFilter.MapFilterProperty.builder()

  public fun comparison(comparison: String) {
    cdkBuilder.comparison(comparison)
  }

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnFilter.MapFilterProperty = cdkBuilder.build()
}
