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
public class CfnChannelCaptionDescriptionPropertyDsl {
    private val cdkBuilder: CfnChannel.CaptionDescriptionProperty.Builder =
        CfnChannel.CaptionDescriptionProperty.builder()

    public fun accessibility(accessibility: String) {
        cdkBuilder.accessibility(accessibility)
    }

    public fun captionSelectorName(captionSelectorName: String) {
        cdkBuilder.captionSelectorName(captionSelectorName)
    }

    public fun destinationSettings(destinationSettings: IResolvable) {
        cdkBuilder.destinationSettings(destinationSettings)
    }

    public fun destinationSettings(destinationSettings: CfnChannel.CaptionDestinationSettingsProperty) {
        cdkBuilder.destinationSettings(destinationSettings)
    }

    public fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
    }

    public fun languageDescription(languageDescription: String) {
        cdkBuilder.languageDescription(languageDescription)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnChannel.CaptionDescriptionProperty = cdkBuilder.build()
}
