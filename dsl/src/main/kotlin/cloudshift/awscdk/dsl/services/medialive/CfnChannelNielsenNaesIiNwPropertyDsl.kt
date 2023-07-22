@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelNielsenNaesIiNwPropertyDsl {
  private val cdkBuilder: CfnChannel.NielsenNaesIiNwProperty.Builder =
      CfnChannel.NielsenNaesIiNwProperty.builder()

  /**
   * @param checkDigitString Enter the check digit string for the watermark.
   */
  public fun checkDigitString(checkDigitString: String) {
    cdkBuilder.checkDigitString(checkDigitString)
  }

  /**
   * @param sid Enter the Nielsen Source ID (SID) to include in the watermark.
   */
  public fun sid(sid: Number) {
    cdkBuilder.sid(sid)
  }

  /**
   * @param timezone the value to be set.
   */
  public fun timezone(timezone: String) {
    cdkBuilder.timezone(timezone)
  }

  public fun build(): CfnChannel.NielsenNaesIiNwProperty = cdkBuilder.build()
}
