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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2
import kotlin.String

@CdkDslMarker
public class CfnApplicationOutputV2KinesisFirehoseOutputPropertyDsl {
    private val cdkBuilder: CfnApplicationOutputV2.KinesisFirehoseOutputProperty.Builder =
        CfnApplicationOutputV2.KinesisFirehoseOutputProperty.builder()

    public fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): CfnApplicationOutputV2.KinesisFirehoseOutputProperty = cdkBuilder.build()
}
