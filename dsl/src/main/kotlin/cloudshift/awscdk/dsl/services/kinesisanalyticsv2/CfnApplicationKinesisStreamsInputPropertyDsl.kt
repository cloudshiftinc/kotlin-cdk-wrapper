@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationKinesisStreamsInputPropertyDsl {
  private val cdkBuilder: CfnApplication.KinesisStreamsInputProperty.Builder =
      CfnApplication.KinesisStreamsInputProperty.builder()

  /**
   * @param resourceArn The ARN of the input Kinesis data stream to read. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnApplication.KinesisStreamsInputProperty = cdkBuilder.build()
}
