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

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.macie.CfnCustomDataIdentifier
import software.constructs.Construct

/**
 * The `AWS::Macie::CustomDataIdentifier` resource specifies a custom data identifier.
 *
 * A *custom data identifier* is a set of custom criteria for Amazon Macie to use when it inspects
 * data sources for sensitive data. The criteria consist of a regular expression ( *regex* ) that
 * defines a text pattern to match and, optionally, character sequences and a proximity rule that
 * refine the results. The character sequences can be:
 * * *Keywords* , which are words or phrases that must be in proximity of text that matches the
 *   regex, or
 * * *Ignore words* , which are words or phrases to exclude from the results.
 *
 * By using custom data identifiers, you can supplement the managed data identifiers that Macie
 * provides and detect sensitive data that reflects your particular scenarios, intellectual
 * property, or proprietary data. For more information, see
 * [Building custom data identifiers](https://docs.aws.amazon.com/macie/latest/user/custom-data-identifiers.html)
 * in the *Amazon Macie User Guide* .
 *
 * An `AWS::Macie::Session` resource must exist for an AWS account before you can create an
 * `AWS::Macie::CustomDataIdentifier` resource for the account. Use a
 * [DependsOn attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * to ensure that an `AWS::Macie::Session` resource is created before other Macie resources are
 * created for an account. For example, `"DependsOn": "Session"` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.macie.*;
 * CfnCustomDataIdentifier cfnCustomDataIdentifier = CfnCustomDataIdentifier.Builder.create(this,
 * "MyCfnCustomDataIdentifier")
 * .name("name")
 * .regex("regex")
 * // the properties below are optional
 * .description("description")
 * .ignoreWords(List.of("ignoreWords"))
 * .keywords(List.of("keywords"))
 * .maximumMatchDistance(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html)
 */
@CdkDslMarker
public class CfnCustomDataIdentifierDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCustomDataIdentifier.Builder =
        CfnCustomDataIdentifier.Builder.create(scope, id)

    private val _ignoreWords: MutableList<String> = mutableListOf()

    private val _keywords: MutableList<String> = mutableListOf()

    /**
     * A custom description of the custom data identifier. The description can contain 1-512
     * characters.
     *
     * Avoid including sensitive data in the description. Users of the account might be able to see
     * the description, depending on the actions that they're allowed to perform in Amazon Macie .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-description)
     *
     * @param description A custom description of the custom data identifier. The description can
     *   contain 1-512 characters.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * An array of character sequences ( *ignore words* ) to exclude from the results.
     *
     * If text matches the regular expression ( `Regex` ) but it contains a string in this array,
     * Amazon Macie ignores the text and doesn't include it in the results.
     *
     * The array can contain 1-10 ignore words. Each ignore word can contain 4-90 UTF-8 characters.
     * Ignore words are case sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-ignorewords)
     *
     * @param ignoreWords An array of character sequences ( *ignore words* ) to exclude from the
     *   results.
     */
    public fun ignoreWords(vararg ignoreWords: String) {
        _ignoreWords.addAll(listOf(*ignoreWords))
    }

    /**
     * An array of character sequences ( *ignore words* ) to exclude from the results.
     *
     * If text matches the regular expression ( `Regex` ) but it contains a string in this array,
     * Amazon Macie ignores the text and doesn't include it in the results.
     *
     * The array can contain 1-10 ignore words. Each ignore word can contain 4-90 UTF-8 characters.
     * Ignore words are case sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-ignorewords)
     *
     * @param ignoreWords An array of character sequences ( *ignore words* ) to exclude from the
     *   results.
     */
    public fun ignoreWords(ignoreWords: Collection<String>) {
        _ignoreWords.addAll(ignoreWords)
    }

    /**
     * An array of character sequences ( *keywords* ), one of which must precede and be in proximity
     * ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
     *
     * The array can contain 1-50 keywords. Each keyword can contain 3-90 UTF-8 characters. Keywords
     * aren't case sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-keywords)
     *
     * @param keywords An array of character sequences ( *keywords* ), one of which must precede and
     *   be in proximity ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
     */
    public fun keywords(vararg keywords: String) {
        _keywords.addAll(listOf(*keywords))
    }

    /**
     * An array of character sequences ( *keywords* ), one of which must precede and be in proximity
     * ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
     *
     * The array can contain 1-50 keywords. Each keyword can contain 3-90 UTF-8 characters. Keywords
     * aren't case sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-keywords)
     *
     * @param keywords An array of character sequences ( *keywords* ), one of which must precede and
     *   be in proximity ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
     */
    public fun keywords(keywords: Collection<String>) {
        _keywords.addAll(keywords)
    }

    /**
     * The maximum number of characters that can exist between the end of at least one complete
     * character sequence specified by the `Keywords` array and the end of text that matches the
     * regular expression ( `Regex` ).
     *
     * If a complete keyword precedes all the text that matches the regular expression and the
     * keyword is within the specified distance, Amazon Macie includes the result.
     *
     * The distance can be 1-300 characters. The default value is 50.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-maximummatchdistance)
     *
     * @param maximumMatchDistance The maximum number of characters that can exist between the end
     *   of at least one complete character sequence specified by the `Keywords` array and the end
     *   of text that matches the regular expression ( `Regex` ).
     */
    public fun maximumMatchDistance(maximumMatchDistance: Number) {
        cdkBuilder.maximumMatchDistance(maximumMatchDistance)
    }

    /**
     * A custom name for the custom data identifier. The name can contain 1-128 characters.
     *
     * Avoid including sensitive data in the name of a custom data identifier. Users of the account
     * might be able to see the name, depending on the actions that they're allowed to perform in
     * Amazon Macie .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-name)
     *
     * @param name A custom name for the custom data identifier. The name can contain 1-128
     *   characters.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The regular expression ( *regex* ) that defines the text pattern to match.
     *
     * The expression can contain 1-512 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-regex)
     *
     * @param regex The regular expression ( *regex* ) that defines the text pattern to match.
     */
    public fun regex(regex: String) {
        cdkBuilder.regex(regex)
    }

    public fun build(): CfnCustomDataIdentifier {
        if (_ignoreWords.isNotEmpty()) cdkBuilder.ignoreWords(_ignoreWords)
        if (_keywords.isNotEmpty()) cdkBuilder.keywords(_keywords)
        return cdkBuilder.build()
    }
}
