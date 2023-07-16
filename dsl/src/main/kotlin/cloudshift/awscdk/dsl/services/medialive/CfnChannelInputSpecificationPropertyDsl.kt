@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelInputSpecificationPropertyDsl {
  private val cdkBuilder: CfnChannel.InputSpecificationProperty.Builder =
      CfnChannel.InputSpecificationProperty.builder()

  public fun codec(codec: String) {
    cdkBuilder.codec(codec)
  }

  public fun maximumBitrate(maximumBitrate: String) {
    cdkBuilder.maximumBitrate(maximumBitrate)
  }

  public fun resolution(resolution: String) {
    cdkBuilder.resolution(resolution)
  }

  public fun build(): CfnChannel.InputSpecificationProperty = cdkBuilder.build()
}
