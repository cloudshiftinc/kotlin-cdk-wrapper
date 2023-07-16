@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication

@CdkDslMarker
public class CfnApplicationKinesisFirehoseInputPropertyDsl {
  private val cdkBuilder: CfnApplication.KinesisFirehoseInputProperty.Builder =
      CfnApplication.KinesisFirehoseInputProperty.builder()

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnApplication.KinesisFirehoseInputProperty = cdkBuilder.build()
}
