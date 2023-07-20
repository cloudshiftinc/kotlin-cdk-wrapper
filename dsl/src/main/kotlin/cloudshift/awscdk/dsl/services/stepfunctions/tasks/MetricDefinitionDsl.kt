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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition
import kotlin.String

@CdkDslMarker
public class MetricDefinitionDsl {
    private val cdkBuilder: MetricDefinition.Builder = MetricDefinition.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun regex(regex: String) {
        cdkBuilder.regex(regex)
    }

    public fun build(): MetricDefinition = cdkBuilder.build()
}
