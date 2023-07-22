@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelTimecodeBurninSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.TimecodeBurninSettingsProperty.Builder =
      CfnChannel.TimecodeBurninSettingsProperty.builder()

  /**
   * @param fontSize the value to be set.
   */
  public fun fontSize(fontSize: String) {
    cdkBuilder.fontSize(fontSize)
  }

  /**
   * @param position the value to be set.
   */
  public fun position(position: String) {
    cdkBuilder.position(position)
  }

  /**
   * @param prefix the value to be set.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): CfnChannel.TimecodeBurninSettingsProperty = cdkBuilder.build()
}
