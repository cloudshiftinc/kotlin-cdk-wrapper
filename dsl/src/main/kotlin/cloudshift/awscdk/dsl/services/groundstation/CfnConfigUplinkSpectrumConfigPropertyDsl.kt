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

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnConfig
import kotlin.String

@CdkDslMarker
public class CfnConfigUplinkSpectrumConfigPropertyDsl {
    private val cdkBuilder: CfnConfig.UplinkSpectrumConfigProperty.Builder =
        CfnConfig.UplinkSpectrumConfigProperty.builder()

    public fun centerFrequency(centerFrequency: IResolvable) {
        cdkBuilder.centerFrequency(centerFrequency)
    }

    public fun centerFrequency(centerFrequency: CfnConfig.FrequencyProperty) {
        cdkBuilder.centerFrequency(centerFrequency)
    }

    public fun polarization(polarization: String) {
        cdkBuilder.polarization(polarization)
    }

    public fun build(): CfnConfig.UplinkSpectrumConfigProperty = cdkBuilder.build()
}
