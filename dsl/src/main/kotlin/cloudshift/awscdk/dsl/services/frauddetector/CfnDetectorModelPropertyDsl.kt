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

package cloudshift.awscdk.dsl.services.frauddetector

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.frauddetector.CfnDetector
import kotlin.String

@CdkDslMarker
public class CfnDetectorModelPropertyDsl {
    private val cdkBuilder: CfnDetector.ModelProperty.Builder = CfnDetector.ModelProperty.builder()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun build(): CfnDetector.ModelProperty = cdkBuilder.build()
}
