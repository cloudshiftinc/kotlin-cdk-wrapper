@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2KinesisFirehoseInputPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.KinesisFirehoseInputProperty.Builder =
      CfnApplicationV2.KinesisFirehoseInputProperty.builder()

  /**
   * @param resourceArn The Amazon Resource Name (ARN) of the delivery stream. 
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnApplicationV2.KinesisFirehoseInputProperty = cdkBuilder.build()
}
