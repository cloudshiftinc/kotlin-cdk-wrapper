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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationKinesisStreamsInputPropertyDsl {
    private val cdkBuilder: CfnApplication.KinesisStreamsInputProperty.Builder =
        CfnApplication.KinesisStreamsInputProperty.builder()

    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnApplication.KinesisStreamsInputProperty = cdkBuilder.build()
}
