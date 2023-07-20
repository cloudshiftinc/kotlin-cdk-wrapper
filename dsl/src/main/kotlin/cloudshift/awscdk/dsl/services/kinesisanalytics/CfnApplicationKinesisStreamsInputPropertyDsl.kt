@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication

@CdkDslMarker
public class CfnApplicationKinesisStreamsInputPropertyDsl {
  private val cdkBuilder: CfnApplication.KinesisStreamsInputProperty.Builder =
      CfnApplication.KinesisStreamsInputProperty.builder()

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnApplication.KinesisStreamsInputProperty = cdkBuilder.build()
}
