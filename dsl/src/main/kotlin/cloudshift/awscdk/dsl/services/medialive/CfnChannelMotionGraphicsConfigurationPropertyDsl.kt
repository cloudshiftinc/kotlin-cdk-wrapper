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
import kotlin.String

@CdkDslMarker
public class CfnChannelMotionGraphicsConfigurationPropertyDsl {
    private val cdkBuilder: CfnChannel.MotionGraphicsConfigurationProperty.Builder =
        CfnChannel.MotionGraphicsConfigurationProperty.builder()

    public fun motionGraphicsInsertion(motionGraphicsInsertion: String) {
        cdkBuilder.motionGraphicsInsertion(motionGraphicsInsertion)
    }

    public fun motionGraphicsSettings(motionGraphicsSettings: IResolvable) {
        cdkBuilder.motionGraphicsSettings(motionGraphicsSettings)
    }

    public fun motionGraphicsSettings(motionGraphicsSettings: CfnChannel.MotionGraphicsSettingsProperty) {
        cdkBuilder.motionGraphicsSettings(motionGraphicsSettings)
    }

    public fun build(): CfnChannel.MotionGraphicsConfigurationProperty = cdkBuilder.build()
}
