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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEvaluationFormEvaluationFormSingleSelectQuestionAutomationPropertyDsl {
    private val cdkBuilder:
        CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty.Builder =
        CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty.builder()

    private val _options: MutableList<Any> = mutableListOf()

    public fun defaultOptionRefId(defaultOptionRefId: String) {
        cdkBuilder.defaultOptionRefId(defaultOptionRefId)
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

    public fun build(): CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty {
        if (_options.isNotEmpty()) cdkBuilder.options(_options)
        return cdkBuilder.build()
    }
}
