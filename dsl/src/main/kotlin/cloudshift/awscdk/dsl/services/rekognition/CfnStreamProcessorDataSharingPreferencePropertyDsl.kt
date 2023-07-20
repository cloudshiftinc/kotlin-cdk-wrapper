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

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor
import kotlin.Boolean

@CdkDslMarker
public class CfnStreamProcessorDataSharingPreferencePropertyDsl {
    private val cdkBuilder: CfnStreamProcessor.DataSharingPreferenceProperty.Builder =
        CfnStreamProcessor.DataSharingPreferenceProperty.builder()

    public fun optIn(optIn: Boolean) {
        cdkBuilder.optIn(optIn)
    }

    public fun optIn(optIn: IResolvable) {
        cdkBuilder.optIn(optIn)
    }

    public fun build(): CfnStreamProcessor.DataSharingPreferenceProperty = cdkBuilder.build()
}
