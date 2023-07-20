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
public class CfnApplicationOutputKinesisFirehoseOutputPropertyDsl {
    private val cdkBuilder: CfnApplicationOutput.KinesisFirehoseOutputProperty.Builder =
        CfnApplicationOutput.KinesisFirehoseOutputProperty.builder()

    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnApplicationOutput.KinesisFirehoseOutputProperty = cdkBuilder.build()
}
