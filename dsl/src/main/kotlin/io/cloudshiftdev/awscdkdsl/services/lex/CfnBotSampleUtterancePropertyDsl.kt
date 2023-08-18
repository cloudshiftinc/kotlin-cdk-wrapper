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
 * A sample utterance that invokes an intent or respond to a slot elicitation prompt.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * SampleUtteranceProperty sampleUtteranceProperty = SampleUtteranceProperty.builder()
 * .utterance("utterance")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-sampleutterance.html)
 */
@CdkDslMarker
public class CfnBotSampleUtterancePropertyDsl {
    private val cdkBuilder: CfnBot.SampleUtteranceProperty.Builder =
        CfnBot.SampleUtteranceProperty.builder()

    /**
     * @param utterance A sample utterance that invokes an intent or respond to a slot elicitation
     *   prompt.
     */
    public fun utterance(utterance: String) {
        cdkBuilder.utterance(utterance)
    }

    public fun build(): CfnBot.SampleUtteranceProperty = cdkBuilder.build()
}
