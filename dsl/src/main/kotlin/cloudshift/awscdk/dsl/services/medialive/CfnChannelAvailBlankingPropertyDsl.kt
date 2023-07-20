@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAvailBlankingPropertyDsl {
  private val cdkBuilder: CfnChannel.AvailBlankingProperty.Builder =
      CfnChannel.AvailBlankingProperty.builder()

  public fun availBlankingImage(availBlankingImage: IResolvable) {
    cdkBuilder.availBlankingImage(availBlankingImage)
  }

  public fun availBlankingImage(availBlankingImage: CfnChannel.InputLocationProperty) {
    cdkBuilder.availBlankingImage(availBlankingImage)
  }

  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun build(): CfnChannel.AvailBlankingProperty = cdkBuilder.build()
}
