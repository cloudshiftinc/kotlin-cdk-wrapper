@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.macie

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCustomDataIdentifier`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.macie.*;
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
public interface CfnCustomDataIdentifierProps {
  /**
   * A custom description of the custom data identifier. The description can contain 1-512
   * characters.
   *
   * Avoid including sensitive data in the description. Users of the account might be able to see
   * the description, depending on the actions that they're allowed to perform in Amazon Macie .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

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
   */
  public fun ignoreWords(): List<String> = unwrap(this).getIgnoreWords() ?: emptyList()

  /**
   * An array of character sequences ( *keywords* ), one of which must precede and be in proximity (
   * `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
   *
   * The array can contain 1-50 keywords. Each keyword can contain 3-90 UTF-8 characters. Keywords
   * aren't case sensitive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-keywords)
   */
  public fun keywords(): List<String> = unwrap(this).getKeywords() ?: emptyList()

  /**
   * The maximum number of characters that can exist between the end of at least one complete
   * character sequence specified by the `Keywords` array and the end of text that matches the regular
   * expression ( `Regex` ).
   *
   * If a complete keyword precedes all the text that matches the regular expression and the keyword
   * is within the specified distance, Amazon Macie includes the result.
   *
   * The distance can be 1-300 characters. The default value is 50.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-maximummatchdistance)
   */
  public fun maximumMatchDistance(): Number? = unwrap(this).getMaximumMatchDistance()

  /**
   * A custom name for the custom data identifier. The name can contain 1-128 characters.
   *
   * Avoid including sensitive data in the name of a custom data identifier. Users of the account
   * might be able to see the name, depending on the actions that they're allowed to perform in Amazon
   * Macie .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-name)
   */
  public fun name(): String

  /**
   * The regular expression ( *regex* ) that defines the text pattern to match.
   *
   * The expression can contain 1-512 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-regex)
   */
  public fun regex(): String

  /**
   * An array of key-value pairs to apply to the custom data identifier.
   *
   * For more information, see [Resource
   * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCustomDataIdentifierProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A custom description of the custom data identifier. The description can
     * contain 1-512 characters.
     * Avoid including sensitive data in the description. Users of the account might be able to see
     * the description, depending on the actions that they're allowed to perform in Amazon Macie .
     */
    public fun description(description: String)

    /**
     * @param ignoreWords An array of character sequences ( *ignore words* ) to exclude from the
     * results.
     * If text matches the regular expression ( `Regex` ) but it contains a string in this array,
     * Amazon Macie ignores the text and doesn't include it in the results.
     *
     * The array can contain 1-10 ignore words. Each ignore word can contain 4-90 UTF-8 characters.
     * Ignore words are case sensitive.
     */
    public fun ignoreWords(ignoreWords: List<String>)

    /**
     * @param ignoreWords An array of character sequences ( *ignore words* ) to exclude from the
     * results.
     * If text matches the regular expression ( `Regex` ) but it contains a string in this array,
     * Amazon Macie ignores the text and doesn't include it in the results.
     *
     * The array can contain 1-10 ignore words. Each ignore word can contain 4-90 UTF-8 characters.
     * Ignore words are case sensitive.
     */
    public fun ignoreWords(vararg ignoreWords: String)

    /**
     * @param keywords An array of character sequences ( *keywords* ), one of which must precede and
     * be in proximity ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
     * The array can contain 1-50 keywords. Each keyword can contain 3-90 UTF-8 characters. Keywords
     * aren't case sensitive.
     */
    public fun keywords(keywords: List<String>)

    /**
     * @param keywords An array of character sequences ( *keywords* ), one of which must precede and
     * be in proximity ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
     * The array can contain 1-50 keywords. Each keyword can contain 3-90 UTF-8 characters. Keywords
     * aren't case sensitive.
     */
    public fun keywords(vararg keywords: String)

    /**
     * @param maximumMatchDistance The maximum number of characters that can exist between the end
     * of at least one complete character sequence specified by the `Keywords` array and the end of
     * text that matches the regular expression ( `Regex` ).
     * If a complete keyword precedes all the text that matches the regular expression and the
     * keyword is within the specified distance, Amazon Macie includes the result.
     *
     * The distance can be 1-300 characters. The default value is 50.
     */
    public fun maximumMatchDistance(maximumMatchDistance: Number)

    /**
     * @param name A custom name for the custom data identifier. The name can contain 1-128
     * characters. 
     * Avoid including sensitive data in the name of a custom data identifier. Users of the account
     * might be able to see the name, depending on the actions that they're allowed to perform in
     * Amazon Macie .
     */
    public fun name(name: String)

    /**
     * @param regex The regular expression ( *regex* ) that defines the text pattern to match. 
     * The expression can contain 1-512 characters.
     */
    public fun regex(regex: String)

    /**
     * @param tags An array of key-value pairs to apply to the custom data identifier.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to the custom data identifier.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps.Builder =
        software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps.builder()

    /**
     * @param description A custom description of the custom data identifier. The description can
     * contain 1-512 characters.
     * Avoid including sensitive data in the description. Users of the account might be able to see
     * the description, depending on the actions that they're allowed to perform in Amazon Macie .
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param ignoreWords An array of character sequences ( *ignore words* ) to exclude from the
     * results.
     * If text matches the regular expression ( `Regex` ) but it contains a string in this array,
     * Amazon Macie ignores the text and doesn't include it in the results.
     *
     * The array can contain 1-10 ignore words. Each ignore word can contain 4-90 UTF-8 characters.
     * Ignore words are case sensitive.
     */
    override fun ignoreWords(ignoreWords: List<String>) {
      cdkBuilder.ignoreWords(ignoreWords)
    }

    /**
     * @param ignoreWords An array of character sequences ( *ignore words* ) to exclude from the
     * results.
     * If text matches the regular expression ( `Regex` ) but it contains a string in this array,
     * Amazon Macie ignores the text and doesn't include it in the results.
     *
     * The array can contain 1-10 ignore words. Each ignore word can contain 4-90 UTF-8 characters.
     * Ignore words are case sensitive.
     */
    override fun ignoreWords(vararg ignoreWords: String): Unit = ignoreWords(ignoreWords.toList())

    /**
     * @param keywords An array of character sequences ( *keywords* ), one of which must precede and
     * be in proximity ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
     * The array can contain 1-50 keywords. Each keyword can contain 3-90 UTF-8 characters. Keywords
     * aren't case sensitive.
     */
    override fun keywords(keywords: List<String>) {
      cdkBuilder.keywords(keywords)
    }

    /**
     * @param keywords An array of character sequences ( *keywords* ), one of which must precede and
     * be in proximity ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
     * The array can contain 1-50 keywords. Each keyword can contain 3-90 UTF-8 characters. Keywords
     * aren't case sensitive.
     */
    override fun keywords(vararg keywords: String): Unit = keywords(keywords.toList())

    /**
     * @param maximumMatchDistance The maximum number of characters that can exist between the end
     * of at least one complete character sequence specified by the `Keywords` array and the end of
     * text that matches the regular expression ( `Regex` ).
     * If a complete keyword precedes all the text that matches the regular expression and the
     * keyword is within the specified distance, Amazon Macie includes the result.
     *
     * The distance can be 1-300 characters. The default value is 50.
     */
    override fun maximumMatchDistance(maximumMatchDistance: Number) {
      cdkBuilder.maximumMatchDistance(maximumMatchDistance)
    }

    /**
     * @param name A custom name for the custom data identifier. The name can contain 1-128
     * characters. 
     * Avoid including sensitive data in the name of a custom data identifier. Users of the account
     * might be able to see the name, depending on the actions that they're allowed to perform in
     * Amazon Macie .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param regex The regular expression ( *regex* ) that defines the text pattern to match. 
     * The expression can contain 1-512 characters.
     */
    override fun regex(regex: String) {
      cdkBuilder.regex(regex)
    }

    /**
     * @param tags An array of key-value pairs to apply to the custom data identifier.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to the custom data identifier.
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps,
  ) : CdkObject(cdkObject), CfnCustomDataIdentifierProps {
    /**
     * A custom description of the custom data identifier. The description can contain 1-512
     * characters.
     *
     * Avoid including sensitive data in the description. Users of the account might be able to see
     * the description, depending on the actions that they're allowed to perform in Amazon Macie .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

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
     */
    override fun ignoreWords(): List<String> = unwrap(this).getIgnoreWords() ?: emptyList()

    /**
     * An array of character sequences ( *keywords* ), one of which must precede and be in proximity
     * ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
     *
     * The array can contain 1-50 keywords. Each keyword can contain 3-90 UTF-8 characters. Keywords
     * aren't case sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-keywords)
     */
    override fun keywords(): List<String> = unwrap(this).getKeywords() ?: emptyList()

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
     */
    override fun maximumMatchDistance(): Number? = unwrap(this).getMaximumMatchDistance()

    /**
     * A custom name for the custom data identifier. The name can contain 1-128 characters.
     *
     * Avoid including sensitive data in the name of a custom data identifier. Users of the account
     * might be able to see the name, depending on the actions that they're allowed to perform in
     * Amazon Macie .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The regular expression ( *regex* ) that defines the text pattern to match.
     *
     * The expression can contain 1-512 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-regex)
     */
    override fun regex(): String = unwrap(this).getRegex()

    /**
     * An array of key-value pairs to apply to the custom data identifier.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomDataIdentifierProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps):
        CfnCustomDataIdentifierProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnCustomDataIdentifierProps

    internal fun unwrap(wrapped: CfnCustomDataIdentifierProps):
        software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.macie.CfnCustomDataIdentifierProps
  }
}
