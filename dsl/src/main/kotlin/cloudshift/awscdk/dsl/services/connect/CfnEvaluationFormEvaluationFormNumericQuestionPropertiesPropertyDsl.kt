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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEvaluationFormEvaluationFormNumericQuestionPropertiesPropertyDsl {
    private val cdkBuilder: CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty.Builder =
        CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty.builder()

    private val _options: MutableList<Any> = mutableListOf()

    public fun automation(automation: IResolvable) {
        cdkBuilder.automation(automation)
    }

    public fun automation(automation: CfnEvaluationForm.EvaluationFormNumericQuestionAutomationProperty) {
        cdkBuilder.automation(automation)
    }

    public fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
    }

    public fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
    }

    public fun options(vararg options: Any) {
        _options.addAll(listOf(*options))
    }

    public fun options(options: Collection<Any>) {
        _options.addAll(options)
    }

    public fun options(options: IResolvable) {
        cdkBuilder.options(options)
    }

    public fun build(): CfnEvaluationForm.EvaluationFormNumericQuestionPropertiesProperty {
        if (_options.isNotEmpty()) cdkBuilder.options(_options)
        return cdkBuilder.build()
    }
}
