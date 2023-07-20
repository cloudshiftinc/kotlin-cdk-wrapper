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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnExperiment
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnExperimentOnlineAbConfigObjectPropertyDsl {
    private val cdkBuilder: CfnExperiment.OnlineAbConfigObjectProperty.Builder =
        CfnExperiment.OnlineAbConfigObjectProperty.builder()

    private val _treatmentWeights: MutableList<Any> = mutableListOf()

    public fun controlTreatmentName(controlTreatmentName: String) {
        cdkBuilder.controlTreatmentName(controlTreatmentName)
    }

    public fun treatmentWeights(vararg treatmentWeights: Any) {
        _treatmentWeights.addAll(listOf(*treatmentWeights))
    }

    public fun treatmentWeights(treatmentWeights: Collection<Any>) {
        _treatmentWeights.addAll(treatmentWeights)
    }

    public fun treatmentWeights(treatmentWeights: IResolvable) {
        cdkBuilder.treatmentWeights(treatmentWeights)
    }

    public fun build(): CfnExperiment.OnlineAbConfigObjectProperty {
        if (_treatmentWeights.isNotEmpty()) cdkBuilder.treatmentWeights(_treatmentWeights)
        return cdkBuilder.build()
    }
}
