@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.String

@CdkDslMarker
public class CfnChannelNielsenCBETPropertyDsl {
    private val cdkBuilder: CfnChannel.NielsenCBETProperty.Builder =
        CfnChannel.NielsenCBETProperty.builder()

    public fun cbetCheckDigitString(cbetCheckDigitString: String) {
        cdkBuilder.cbetCheckDigitString(cbetCheckDigitString)
    }

    public fun cbetStepaside(cbetStepaside: String) {
        cdkBuilder.cbetStepaside(cbetStepaside)
    }

    public fun csid(csid: String) {
        cdkBuilder.csid(csid)
    }

    public fun build(): CfnChannel.NielsenCBETProperty = cdkBuilder.build()
}
