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

package io.cloudshiftdev.awscdkdsl.services.lex

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Provides an expression that evaluates to true or false.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * ConditionProperty conditionProperty = ConditionProperty.builder()
 * .expressionString("expressionString")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-condition.html)
 */
@CdkDslMarker
public class CfnBotConditionPropertyDsl {
    private val cdkBuilder: CfnBot.ConditionProperty.Builder = CfnBot.ConditionProperty.builder()

    /** @param expressionString The expression string that is evaluated. */
    public fun expressionString(expressionString: String) {
        cdkBuilder.expressionString(expressionString)
    }

    public fun build(): CfnBot.ConditionProperty = cdkBuilder.build()
}
