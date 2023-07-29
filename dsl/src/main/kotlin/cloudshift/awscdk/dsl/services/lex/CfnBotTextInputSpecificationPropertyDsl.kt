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

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Specifies the text input specifications.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * TextInputSpecificationProperty textInputSpecificationProperty =
 * TextInputSpecificationProperty.builder()
 * .startTimeoutMs(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-textinputspecification.html)
 */
@CdkDslMarker
public class CfnBotTextInputSpecificationPropertyDsl {
    private val cdkBuilder: CfnBot.TextInputSpecificationProperty.Builder =
        CfnBot.TextInputSpecificationProperty.builder()

    /**
     * @param startTimeoutMs Time for which a bot waits before re-prompting a customer for text
     *   input.
     */
    public fun startTimeoutMs(startTimeoutMs: Number) {
        cdkBuilder.startTimeoutMs(startTimeoutMs)
    }

    public fun build(): CfnBot.TextInputSpecificationProperty = cdkBuilder.build()
}
