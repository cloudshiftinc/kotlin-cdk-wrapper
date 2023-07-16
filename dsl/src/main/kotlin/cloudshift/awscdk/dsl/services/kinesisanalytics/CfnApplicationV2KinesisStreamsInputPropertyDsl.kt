@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2KinesisStreamsInputPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.KinesisStreamsInputProperty.Builder =
      CfnApplicationV2.KinesisStreamsInputProperty.builder()

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnApplicationV2.KinesisStreamsInputProperty = cdkBuilder.build()
}
