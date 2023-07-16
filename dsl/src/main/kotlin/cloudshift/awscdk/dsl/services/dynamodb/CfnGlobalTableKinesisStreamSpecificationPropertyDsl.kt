@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable

@CdkDslMarker
public class CfnGlobalTableKinesisStreamSpecificationPropertyDsl {
  private val cdkBuilder: CfnGlobalTable.KinesisStreamSpecificationProperty.Builder =
      CfnGlobalTable.KinesisStreamSpecificationProperty.builder()

  public fun streamArn(streamArn: String) {
    cdkBuilder.streamArn(streamArn)
  }

  public fun build(): CfnGlobalTable.KinesisStreamSpecificationProperty = cdkBuilder.build()
}
