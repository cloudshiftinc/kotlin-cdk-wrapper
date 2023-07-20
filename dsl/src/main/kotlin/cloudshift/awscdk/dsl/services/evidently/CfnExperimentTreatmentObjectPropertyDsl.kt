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

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.evidently.CfnExperiment
import kotlin.String

@CdkDslMarker
public class CfnExperimentTreatmentObjectPropertyDsl {
    private val cdkBuilder: CfnExperiment.TreatmentObjectProperty.Builder =
        CfnExperiment.TreatmentObjectProperty.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun feature(feature: String) {
        cdkBuilder.feature(feature)
    }

    public fun treatmentName(treatmentName: String) {
        cdkBuilder.treatmentName(treatmentName)
    }

    public fun variation(variation: String) {
        cdkBuilder.variation(variation)
    }

    public fun build(): CfnExperiment.TreatmentObjectProperty = cdkBuilder.build()
}
