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

  /**
   * @param deliveryStream The ID of the delivery stream.
   */
  public fun deliveryStream(deliveryStream: String) {
    cdkBuilder.deliveryStream(deliveryStream)
  }

  /**
   * @param enabled Indicates whether logging is enabled.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Indicates whether logging is enabled.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnVerifiedAccessInstance.KinesisDataFirehoseProperty = cdkBuilder.build()
}
