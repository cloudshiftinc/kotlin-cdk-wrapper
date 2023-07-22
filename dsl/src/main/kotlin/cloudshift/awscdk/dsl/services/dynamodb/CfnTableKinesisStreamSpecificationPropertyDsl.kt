@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dynamodb.CfnTable

@CdkDslMarker
public class CfnTableKinesisStreamSpecificationPropertyDsl {
  private val cdkBuilder: CfnTable.KinesisStreamSpecificationProperty.Builder =
      CfnTable.KinesisStreamSpecificationProperty.builder()

  /**
   * @param streamArn The ARN for a specific Kinesis data stream. 
   * Length Constraints: Minimum length of 37. Maximum length of 1024.
   */
  public fun streamArn(streamArn: String) {
    cdkBuilder.streamArn(streamArn)
  }

  public fun build(): CfnTable.KinesisStreamSpecificationProperty = cdkBuilder.build()
}
