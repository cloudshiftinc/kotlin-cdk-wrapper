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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Specifies an entry in a custom vocabulary.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * CustomVocabularyItemProperty customVocabularyItemProperty =
 * CustomVocabularyItemProperty.builder()
 * .phrase("phrase")
 * // the properties below are optional
 * .displayAs("displayAs")
 * .weight(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-customvocabularyitem.html)
 */
@CdkDslMarker
public class CfnBotCustomVocabularyItemPropertyDsl {
    private val cdkBuilder: CfnBot.CustomVocabularyItemProperty.Builder =
        CfnBot.CustomVocabularyItemProperty.builder()

    /**
     * @param displayAs The DisplayAs value for the custom vocabulary item from the custom
     *   vocabulary list.
     */
    public fun displayAs(displayAs: String) {
        cdkBuilder.displayAs(displayAs)
    }

    /** @param phrase Specifies 1 - 4 words that should be recognized. */
    public fun phrase(phrase: String) {
        cdkBuilder.phrase(phrase)
    }

    /**
     * @param weight Specifies the degree to which the phrase recognition is boosted. The default
     *   value is 1.
     */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnBot.CustomVocabularyItemProperty = cdkBuilder.build()
}
