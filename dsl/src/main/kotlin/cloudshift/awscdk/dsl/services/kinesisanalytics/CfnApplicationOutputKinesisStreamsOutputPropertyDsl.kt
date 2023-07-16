@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput

@CdkDslMarker
public class CfnApplicationOutputKinesisStreamsOutputPropertyDsl {
  private val cdkBuilder: CfnApplicationOutput.KinesisStreamsOutputProperty.Builder =
      CfnApplicationOutput.KinesisStreamsOutputProperty.builder()

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnApplicationOutput.KinesisStreamsOutputProperty = cdkBuilder.build()
}
