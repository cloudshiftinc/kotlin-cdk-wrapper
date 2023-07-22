@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationKinesisFirehoseInputPropertyDsl {
  private val cdkBuilder: CfnApplication.KinesisFirehoseInputProperty.Builder =
      CfnApplication.KinesisFirehoseInputProperty.builder()

  /**
   * @param resourceArn The Amazon Resource Name (ARN) of the delivery stream. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnApplication.KinesisFirehoseInputProperty = cdkBuilder.build()
}
