@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2

@CdkDslMarker
public class CfnApplicationOutputV2KinesisStreamsOutputPropertyDsl {
  private val cdkBuilder: CfnApplicationOutputV2.KinesisStreamsOutputProperty.Builder =
      CfnApplicationOutputV2.KinesisStreamsOutputProperty.builder()

  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnApplicationOutputV2.KinesisStreamsOutputProperty = cdkBuilder.build()
}
