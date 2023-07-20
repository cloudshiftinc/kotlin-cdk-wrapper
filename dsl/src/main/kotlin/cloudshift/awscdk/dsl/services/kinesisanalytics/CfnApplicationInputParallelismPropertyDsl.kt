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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication
import kotlin.Number

@CdkDslMarker
public class CfnApplicationInputParallelismPropertyDsl {
    private val cdkBuilder: CfnApplication.InputParallelismProperty.Builder =
        CfnApplication.InputParallelismProperty.builder()

    public fun count(count: Number) {
        cdkBuilder.count(count)
    }

    public fun build(): CfnApplication.InputParallelismProperty = cdkBuilder.build()
}
