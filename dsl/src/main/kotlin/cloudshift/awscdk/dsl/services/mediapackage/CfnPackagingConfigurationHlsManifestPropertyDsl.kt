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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnPackagingConfigurationHlsManifestPropertyDsl {
    private val cdkBuilder: CfnPackagingConfiguration.HlsManifestProperty.Builder =
        CfnPackagingConfiguration.HlsManifestProperty.builder()

    public fun adMarkers(adMarkers: String) {
        cdkBuilder.adMarkers(adMarkers)
    }

    public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
    }

    public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
    }

    public fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
    }

    public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
    }

    public fun repeatExtXKey(repeatExtXKey: Boolean) {
        cdkBuilder.repeatExtXKey(repeatExtXKey)
    }

    public fun repeatExtXKey(repeatExtXKey: IResolvable) {
        cdkBuilder.repeatExtXKey(repeatExtXKey)
    }

    public fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection)
    }

    public fun streamSelection(streamSelection: CfnPackagingConfiguration.StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection)
    }

    public fun build(): CfnPackagingConfiguration.HlsManifestProperty = cdkBuilder.build()
}
