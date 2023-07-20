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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnBotCustomVocabularyItemPropertyDsl {
    private val cdkBuilder: CfnBot.CustomVocabularyItemProperty.Builder =
        CfnBot.CustomVocabularyItemProperty.builder()

    public fun displayAs(displayAs: String) {
        cdkBuilder.displayAs(displayAs)
    }

    public fun phrase(phrase: String) {
        cdkBuilder.phrase(phrase)
    }

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnBot.CustomVocabularyItemProperty = cdkBuilder.build()
}
