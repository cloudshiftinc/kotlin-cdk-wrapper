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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnEvaluationForm

/**
 * Information about the automation configuration in single select questions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * EvaluationFormSingleSelectQuestionOptionProperty evaluationFormSingleSelectQuestionOptionProperty
 * = EvaluationFormSingleSelectQuestionOptionProperty.builder()
 * .refId("refId")
 * .text("text")
 * // the properties below are optional
 * .automaticFail(false)
 * .score(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-evaluationformsingleselectquestionoption.html)
 */
@CdkDslMarker
public class CfnEvaluationFormEvaluationFormSingleSelectQuestionOptionPropertyDsl {
    private val cdkBuilder:
        CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty.Builder =
        CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty.builder()

    /**
     * @param automaticFail The flag to mark the option as automatic fail. If an automatic fail
     *   answer is provided, the overall evaluation gets a score of 0.
     */
    public fun automaticFail(automaticFail: Boolean) {
        cdkBuilder.automaticFail(automaticFail)
    }

    /**
     * @param automaticFail The flag to mark the option as automatic fail. If an automatic fail
     *   answer is provided, the overall evaluation gets a score of 0.
     */
    public fun automaticFail(automaticFail: IResolvable) {
        cdkBuilder.automaticFail(automaticFail)
    }

    /**
     * @param refId The identifier of the answer option. An identifier must be unique within the
     *   question. *Length Constraints* : Minimum length of 1. Maximum length of 40.
     */
    public fun refId(refId: String) {
        cdkBuilder.refId(refId)
    }

    /**
     * @param score The score assigned to the answer option. *Minimum* : 0
     *
     * *Maximum* : 10
     */
    public fun score(score: Number) {
        cdkBuilder.score(score)
    }

    /**
     * @param text The title of the answer option. *Length Constraints* : Minimum length of 1.
     *   Maximum length of 128.
     */
    public fun text(text: String) {
        cdkBuilder.text(text)
    }

    public fun build(): CfnEvaluationForm.EvaluationFormSingleSelectQuestionOptionProperty =
        cdkBuilder.build()
}
