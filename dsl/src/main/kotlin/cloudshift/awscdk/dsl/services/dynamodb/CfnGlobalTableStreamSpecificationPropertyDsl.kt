@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@CdkDslMarker
public class CfnGlobalTableStreamSpecificationPropertyDsl {
  private val cdkBuilder: CfnGlobalTable.StreamSpecificationProperty.Builder =
      CfnGlobalTable.StreamSpecificationProperty.builder()

  public fun streamViewType(streamViewType: String) {
    cdkBuilder.streamViewType(streamViewType)
  }

  public fun build(): CfnGlobalTable.StreamSpecificationProperty = cdkBuilder.build()
}
