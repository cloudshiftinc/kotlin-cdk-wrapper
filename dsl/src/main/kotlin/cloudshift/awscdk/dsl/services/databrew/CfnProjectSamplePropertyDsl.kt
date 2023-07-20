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
import software.amazon.awscdk.services.databrew.CfnProject
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnProjectSamplePropertyDsl {
    private val cdkBuilder: CfnProject.SampleProperty.Builder = CfnProject.SampleProperty.builder()

    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnProject.SampleProperty = cdkBuilder.build()
}
