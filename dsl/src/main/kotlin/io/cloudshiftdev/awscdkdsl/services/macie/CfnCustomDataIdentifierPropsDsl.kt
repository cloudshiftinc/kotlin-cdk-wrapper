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

package io.cloudshiftdev.awscdkdsl.services.macie

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps

/**
 * Properties for defining a `CfnCustomDataIdentifier`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.macie.*;
 * CfnCustomDataIdentifierProps cfnCustomDataIdentifierProps =
 * CfnCustomDataIdentifierProps.builder()
 * .name("name")
 * .regex("regex")
 * // the properties below are optional
 * .description("description")
 * .ignoreWords(List.of("ignoreWords"))
 * .keywords(List.of("keywords"))
 * .maximumMatchDistance(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html)
 */
@CdkDslMarker
public class CfnCustomDataIdentifierPropsDsl {
    private val cdkBuilder: CfnCustomDataIdentifierProps.Builder =
        CfnCustomDataIdentifierProps.builder()

    private val _ignoreWords: MutableList<String> = mutableListOf()

    private val _keywords: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param description A custom description of the custom data identifier. The description can
     *   contain 1-512 characters. Avoid including sensitive data in the description. Users of the
     *   account might be able to see the description, depending on the actions that they're allowed
     *   to perform in Amazon Macie .
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param ignoreWords An array of character sequences ( *ignore words* ) to exclude from the
     *   results. If text matches the regular expression ( `Regex` ) but it contains a string in
     *   this array, Amazon Macie ignores the text and doesn't include it in the results.
     *
     * The array can contain 1-10 ignore words. Each ignore word can contain 4-90 UTF-8 characters.
     * Ignore words are case sensitive.
     */
    public fun ignoreWords(vararg ignoreWords: String) {
        _ignoreWords.addAll(listOf(*ignoreWords))
    }

    /**
     * @param ignoreWords An array of character sequences ( *ignore words* ) to exclude from the
     *   results. If text matches the regular expression ( `Regex` ) but it contains a string in
     *   this array, Amazon Macie ignores the text and doesn't include it in the results.
     *
     * The array can contain 1-10 ignore words. Each ignore word can contain 4-90 UTF-8 characters.
     * Ignore words are case sensitive.
     */
    public fun ignoreWords(ignoreWords: Collection<String>) {
        _ignoreWords.addAll(ignoreWords)
    }

    /**
     * @param keywords An array of character sequences ( *keywords* ), one of which must precede and
     *   be in proximity ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
     *   The array can contain 1-50 keywords. Each keyword can contain 3-90 UTF-8 characters.
     *   Keywords aren't case sensitive.
     */
    public fun keywords(vararg keywords: String) {
        _keywords.addAll(listOf(*keywords))
    }

    /**
     * @param keywords An array of character sequences ( *keywords* ), one of which must precede and
     *   be in proximity ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
     *   The array can contain 1-50 keywords. Each keyword can contain 3-90 UTF-8 characters.
     *   Keywords aren't case sensitive.
     */
    public fun keywords(keywords: Collection<String>) {
        _keywords.addAll(keywords)
    }

    /**
     * @param maximumMatchDistance The maximum number of characters that can exist between the end
     *   of at least one complete character sequence specified by the `Keywords` array and the end
     *   of text that matches the regular expression ( `Regex` ). If a complete keyword precedes all
     *   the text that matches the regular expression and the keyword is within the specified
     *   distance, Amazon Macie includes the result.
     *
     * The distance can be 1-300 characters. The default value is 50.
     */
    public fun maximumMatchDistance(maximumMatchDistance: Number) {
        cdkBuilder.maximumMatchDistance(maximumMatchDistance)
    }

    /**
     * @param name A custom name for the custom data identifier. The name can contain 1-128
     *   characters. Avoid including sensitive data in the name of a custom data identifier. Users
     *   of the account might be able to see the name, depending on the actions that they're allowed
     *   to perform in Amazon Macie .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param regex The regular expression ( *regex* ) that defines the text pattern to match. The
     *   expression can contain 1-512 characters.
     */
    public fun regex(regex: String) {
        cdkBuilder.regex(regex)
    }

    /**
     * @param tags An array of key-value pairs to apply to the custom data identifier. For more
     *   information, see
     *   [Resource tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to the custom data identifier. For more
     *   information, see
     *   [Resource tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnCustomDataIdentifierProps {
        if (_ignoreWords.isNotEmpty()) cdkBuilder.ignoreWords(_ignoreWords)
        if (_keywords.isNotEmpty()) cdkBuilder.keywords(_keywords)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
