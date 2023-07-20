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

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lex.CfnBot
import kotlin.String

@CdkDslMarker
public class CfnBotSampleUtterancePropertyDsl {
    private val cdkBuilder: CfnBot.SampleUtteranceProperty.Builder =
        CfnBot.SampleUtteranceProperty.builder()

    public fun utterance(utterance: String) {
        cdkBuilder.utterance(utterance)
    }

    public fun build(): CfnBot.SampleUtteranceProperty = cdkBuilder.build()
}
