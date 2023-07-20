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
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor
import kotlin.String

@CdkDslMarker
public class CfnStreamProcessorNotificationChannelPropertyDsl {
    private val cdkBuilder: CfnStreamProcessor.NotificationChannelProperty.Builder =
        CfnStreamProcessor.NotificationChannelProperty.builder()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnStreamProcessor.NotificationChannelProperty = cdkBuilder.build()
}
