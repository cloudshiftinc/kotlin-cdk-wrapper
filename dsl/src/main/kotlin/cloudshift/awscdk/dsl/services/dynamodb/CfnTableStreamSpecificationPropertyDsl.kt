@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dynamodb.CfnTable

@CdkDslMarker
public class CfnTableStreamSpecificationPropertyDsl {
  private val cdkBuilder: CfnTable.StreamSpecificationProperty.Builder =
      CfnTable.StreamSpecificationProperty.builder()

  public fun streamViewType(streamViewType: String) {
    cdkBuilder.streamViewType(streamViewType)
  }

  public fun build(): CfnTable.StreamSpecificationProperty = cdkBuilder.build()
}
