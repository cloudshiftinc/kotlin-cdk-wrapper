@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnIndex

@CdkDslMarker
public class CfnIndexValueImportanceItemPropertyDsl {
  private val cdkBuilder: CfnIndex.ValueImportanceItemProperty.Builder =
      CfnIndex.ValueImportanceItemProperty.builder()

  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnIndex.ValueImportanceItemProperty = cdkBuilder.build()
}
