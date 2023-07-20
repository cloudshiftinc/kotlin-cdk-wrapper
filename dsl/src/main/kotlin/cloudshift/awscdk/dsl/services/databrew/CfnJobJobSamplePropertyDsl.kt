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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.databrew.CfnJob
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnJobJobSamplePropertyDsl {
    private val cdkBuilder: CfnJob.JobSampleProperty.Builder = CfnJob.JobSampleProperty.builder()

    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    public fun build(): CfnJob.JobSampleProperty = cdkBuilder.build()
}
