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

  public fun checkDigitString(checkDigitString: String) {
    cdkBuilder.checkDigitString(checkDigitString)
  }

  public fun sid(sid: Number) {
    cdkBuilder.sid(sid)
  }

  public fun timezone(timezone: String) {
    cdkBuilder.timezone(timezone)
  }

  public fun build(): CfnChannel.NielsenNaesIiNwProperty = cdkBuilder.build()
}
