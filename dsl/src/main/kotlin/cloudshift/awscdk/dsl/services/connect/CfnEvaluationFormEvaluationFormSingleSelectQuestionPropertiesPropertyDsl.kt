@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

/**
 * Information about the options in single select questions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * EvaluationFormSingleSelectQuestionPropertiesProperty
 * evaluationFormSingleSelectQuestionPropertiesProperty =
 * EvaluationFormSingleSelectQuestionPropertiesProperty.builder()
 * .options(List.of(EvaluationFormSingleSelectQuestionOptionProperty.builder()
 * .refId("refId")
 * .text("text")
 * // the properties below are optional
 * .automaticFail(false)
 * .score(123)
 * .build()))
 * // the properties below are optional
 * .automation(EvaluationFormSingleSelectQuestionAutomationProperty.builder()
 * .options(List.of(EvaluationFormSingleSelectQuestionAutomationOptionProperty.builder()
 * .ruleCategory(SingleSelectQuestionRuleCategoryAutomationProperty.builder()
 * .category("category")
 * .condition("condition")
 * .optionRefId("optionRefId")
 * .build())
 * .build()))
 * // the properties below are optional
 * .defaultOptionRefId("defaultOptionRefId")
 * .build())
 * .displayAs("displayAs")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionproperties.html)
 */
@CdkDslMarker
public class CfnEvaluationFormEvaluationFormSingleSelectQuestionPropertiesPropertyDsl {
    private val cdkBuilder:
        CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty.Builder =
        CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty.builder()

    private val _options: MutableList<Any> = mutableListOf()

    /** @param automation The display mode of the single select question. */
    public fun automation(automation: IResolvable) {
        cdkBuilder.automation(automation)
    }

    /** @param automation The display mode of the single select question. */
    public fun automation(
        automation: CfnEvaluationForm.EvaluationFormSingleSelectQuestionAutomationProperty
    ) {
        cdkBuilder.automation(automation)
    }

    /**
     * @param displayAs The display mode of the single select question. *Allowed values* :
     *   `DROPDOWN` | `RADIO`
     */
    public fun displayAs(displayAs: String) {
        cdkBuilder.displayAs(displayAs)
    }

    /**
     * @param options The answer options of the single select question. *Minimum* : 2
     *
     * *Maximum* : 256
     */
    public fun options(vararg options: Any) {
        _options.addAll(listOf(*options))
    }

    /**
     * @param options The answer options of the single select question. *Minimum* : 2
     *
     * *Maximum* : 256
     */
    public fun options(options: Collection<Any>) {
        _options.addAll(options)
    }

    /**
     * @param options The answer options of the single select question. *Minimum* : 2
     *
     * *Maximum* : 256
     */
    public fun options(options: IResolvable) {
        cdkBuilder.options(options)
    }

    public fun build(): CfnEvaluationForm.EvaluationFormSingleSelectQuestionPropertiesProperty {
        if (_options.isNotEmpty()) cdkBuilder.options(_options)
        return cdkBuilder.build()
    }
}
