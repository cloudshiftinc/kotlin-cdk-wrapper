@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Complete these fields only if you want to insert watermarks of type Nielsen CBET.
 *
 * The parent of this entity is NielsenWatermarksSettings
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * NielsenCBETProperty nielsenCBETProperty = NielsenCBETProperty.builder()
 * .cbetCheckDigitString("cbetCheckDigitString")
 * .cbetStepaside("cbetStepaside")
 * .csid("csid")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-nielsencbet.html)
 */
@CdkDslMarker
public class CfnChannelNielsenCBETPropertyDsl {
  private val cdkBuilder: CfnChannel.NielsenCBETProperty.Builder =
      CfnChannel.NielsenCBETProperty.builder()

  /**
   * @param cbetCheckDigitString Enter the CBET check digits to use in the watermark.
   */
  public fun cbetCheckDigitString(cbetCheckDigitString: String) {
    cdkBuilder.cbetCheckDigitString(cbetCheckDigitString)
  }

  /**
   * @param cbetStepaside Determines the method of CBET insertion mode when prior encoding is
   * detected on the same layer.
   */
  public fun cbetStepaside(cbetStepaside: String) {
    cdkBuilder.cbetStepaside(cbetStepaside)
  }

  /**
   * @param csid Enter the CBET Source ID (CSID) to use in the watermark.
   */
  public fun csid(csid: String) {
    cdkBuilder.csid(csid)
  }

  public fun build(): CfnChannel.NielsenCBETProperty = cdkBuilder.build()
}
