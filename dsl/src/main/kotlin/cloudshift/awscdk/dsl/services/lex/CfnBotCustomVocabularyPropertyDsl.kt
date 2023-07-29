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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Specifies a custom vocabulary.
 *
 * A custom vocabulary is a list of words that you expect to be used during a conversation with your
 * bot.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * CustomVocabularyProperty customVocabularyProperty = CustomVocabularyProperty.builder()
 * .customVocabularyItems(List.of(CustomVocabularyItemProperty.builder()
 * .phrase("phrase")
 * // the properties below are optional
 * .displayAs("displayAs")
 * .weight(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-customvocabulary.html)
 */
@CdkDslMarker
public class CfnBotCustomVocabularyPropertyDsl {
    private val cdkBuilder: CfnBot.CustomVocabularyProperty.Builder =
        CfnBot.CustomVocabularyProperty.builder()

    private val _customVocabularyItems: MutableList<Any> = mutableListOf()

    /**
     * @param customVocabularyItems Specifies a list of words that you expect to be used during a
     *   conversation with your bot.
     */
    public fun customVocabularyItems(vararg customVocabularyItems: Any) {
        _customVocabularyItems.addAll(listOf(*customVocabularyItems))
    }

    /**
     * @param customVocabularyItems Specifies a list of words that you expect to be used during a
     *   conversation with your bot.
     */
    public fun customVocabularyItems(customVocabularyItems: Collection<Any>) {
        _customVocabularyItems.addAll(customVocabularyItems)
    }

    /**
     * @param customVocabularyItems Specifies a list of words that you expect to be used during a
     *   conversation with your bot.
     */
    public fun customVocabularyItems(customVocabularyItems: IResolvable) {
        cdkBuilder.customVocabularyItems(customVocabularyItems)
    }

    public fun build(): CfnBot.CustomVocabularyProperty {
        if (_customVocabularyItems.isNotEmpty())
            cdkBuilder.customVocabularyItems(_customVocabularyItems)
        return cdkBuilder.build()
    }
}
