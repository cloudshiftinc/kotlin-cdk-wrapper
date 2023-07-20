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
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput
import kotlin.String

@CdkDslMarker
public class CfnApplicationOutputKinesisStreamsOutputPropertyDsl {
    private val cdkBuilder: CfnApplicationOutput.KinesisStreamsOutputProperty.Builder =
        CfnApplicationOutput.KinesisStreamsOutputProperty.builder()

    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnApplicationOutput.KinesisStreamsOutputProperty = cdkBuilder.build()
}
