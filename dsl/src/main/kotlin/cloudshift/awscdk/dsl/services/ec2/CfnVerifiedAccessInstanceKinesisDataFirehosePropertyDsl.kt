@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance

@CdkDslMarker
public class CfnVerifiedAccessInstanceKinesisDataFirehosePropertyDsl {
  private val cdkBuilder: CfnVerifiedAccessInstance.KinesisDataFirehoseProperty.Builder =
      CfnVerifiedAccessInstance.KinesisDataFirehoseProperty.builder()

  public fun deliveryStream(deliveryStream: String) {
    cdkBuilder.deliveryStream(deliveryStream)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnVerifiedAccessInstance.KinesisDataFirehoseProperty = cdkBuilder.build()
}
