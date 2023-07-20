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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelAvailConfigurationPropertyDsl {
    private val cdkBuilder: CfnChannel.AvailConfigurationProperty.Builder =
        CfnChannel.AvailConfigurationProperty.builder()

    public fun availSettings(availSettings: IResolvable) {
        cdkBuilder.availSettings(availSettings)
    }

    public fun availSettings(availSettings: CfnChannel.AvailSettingsProperty) {
        cdkBuilder.availSettings(availSettings)
    }

    public fun build(): CfnChannel.AvailConfigurationProperty = cdkBuilder.build()
}
