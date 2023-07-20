@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnSimpleTable

@CdkDslMarker
public class CfnSimpleTableSSESpecificationPropertyDsl {
  private val cdkBuilder: CfnSimpleTable.SSESpecificationProperty.Builder =
      CfnSimpleTable.SSESpecificationProperty.builder()

  public fun sseEnabled(sseEnabled: Boolean) {
    cdkBuilder.sseEnabled(sseEnabled)
  }

  public fun sseEnabled(sseEnabled: IResolvable) {
    cdkBuilder.sseEnabled(sseEnabled)
  }

  public fun build(): CfnSimpleTable.SSESpecificationProperty = cdkBuilder.build()
}
