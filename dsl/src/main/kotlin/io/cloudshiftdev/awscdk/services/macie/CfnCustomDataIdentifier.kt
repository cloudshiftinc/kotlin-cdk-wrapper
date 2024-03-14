package io.cloudshiftdev.awscdk.services.macie

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCustomDataIdentifier internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.macie.CfnCustomDataIdentifier,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) of the custom data identifier.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique identifier for the custom data identifier.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A custom description of the custom data identifier.
   *
   * The description can contain 1-512 characters.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A custom description of the custom data identifier.
   *
   * The description can contain 1-512 characters.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * An array of character sequences ( *ignore words* ) to exclude from the results.
   */
  public open fun ignoreWords(): List<String> = unwrap(this).getIgnoreWords() ?: emptyList()

  /**
   * An array of character sequences ( *ignore words* ) to exclude from the results.
   */
  public open fun ignoreWords(`value`: List<String>) {
    unwrap(this).setIgnoreWords(`value`)
  }

  /**
   * An array of character sequences ( *ignore words* ) to exclude from the results.
   */
  public open fun ignoreWords(vararg `value`: String): Unit = ignoreWords(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * An array of character sequences ( *keywords* ), one of which must precede and be in proximity (
   * `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
   */
  public open fun keywords(): List<String> = unwrap(this).getKeywords() ?: emptyList()

  /**
   * An array of character sequences ( *keywords* ), one of which must precede and be in proximity (
   * `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
   */
  public open fun keywords(`value`: List<String>) {
    unwrap(this).setKeywords(`value`)
  }

  /**
   * An array of character sequences ( *keywords* ), one of which must precede and be in proximity (
   * `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
   */
  public open fun keywords(vararg `value`: String): Unit = keywords(`value`.toList())

  /**
   * The maximum number of characters that can exist between the end of at least one complete
   * character sequence specified by the `Keywords` array and the end of text that matches the regular
   * expression ( `Regex` ).
   */
  public open fun maximumMatchDistance(): Number? = unwrap(this).getMaximumMatchDistance()

  /**
   * The maximum number of characters that can exist between the end of at least one complete
   * character sequence specified by the `Keywords` array and the end of text that matches the regular
   * expression ( `Regex` ).
   */
  public open fun maximumMatchDistance(`value`: Number) {
    unwrap(this).setMaximumMatchDistance(`value`)
  }

  /**
   * A custom name for the custom data identifier.
   *
   * The name can contain 1-128 characters.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * A custom name for the custom data identifier.
   *
   * The name can contain 1-128 characters.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The regular expression ( *regex* ) that defines the text pattern to match.
   */
  public open fun regex(): String = unwrap(this).getRegex()

  /**
   * The regular expression ( *regex* ) that defines the text pattern to match.
   */
  public open fun regex(`value`: String) {
    unwrap(this).setRegex(`value`)
  }

  /**
   * An array of key-value pairs to apply to the custom data identifier.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to the custom data identifier.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to the custom data identifier.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.macie.CfnCustomDataIdentifier].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A custom description of the custom data identifier. The description can contain 1-512
     * characters.
     *
     * Avoid including sensitive data in the description. Users of the account might be able to see
     * the description, depending on the actions that they're allowed to perform in Amazon Macie .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-description)
     * @param description A custom description of the custom data identifier. The description can
     * contain 1-512 characters. 
     */
    public fun description(description: String)

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
     * @param ignoreWords An array of character sequences ( *ignore words* ) to exclude from the
     * results. 
     */
    public fun ignoreWords(ignoreWords: List<String>)

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
     * @param ignoreWords An array of character sequences ( *ignore words* ) to exclude from the
     * results. 
     */
    public fun ignoreWords(vararg ignoreWords: String)

    /**
     * An array of character sequences ( *keywords* ), one of which must precede and be in proximity
     * ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
     *
     * The array can contain 1-50 keywords. Each keyword can contain 3-90 UTF-8 characters. Keywords
     * aren't case sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-keywords)
     * @param keywords An array of character sequences ( *keywords* ), one of which must precede and
     * be in proximity ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match. 
     */
    public fun keywords(keywords: List<String>)

    /**
     * An array of character sequences ( *keywords* ), one of which must precede and be in proximity
     * ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
     *
     * The array can contain 1-50 keywords. Each keyword can contain 3-90 UTF-8 characters. Keywords
     * aren't case sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-keywords)
     * @param keywords An array of character sequences ( *keywords* ), one of which must precede and
     * be in proximity ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match. 
     */
    public fun keywords(vararg keywords: String)

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
     * @param maximumMatchDistance The maximum number of characters that can exist between the end
     * of at least one complete character sequence specified by the `Keywords` array and the end of
     * text that matches the regular expression ( `Regex` ). 
     */
    public fun maximumMatchDistance(maximumMatchDistance: Number)

    /**
     * A custom name for the custom data identifier. The name can contain 1-128 characters.
     *
     * Avoid including sensitive data in the name of a custom data identifier. Users of the account
     * might be able to see the name, depending on the actions that they're allowed to perform in
     * Amazon Macie .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-name)
     * @param name A custom name for the custom data identifier. The name can contain 1-128
     * characters. 
     */
    public fun name(name: String)

    /**
     * The regular expression ( *regex* ) that defines the text pattern to match.
     *
     * The expression can contain 1-512 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-regex)
     * @param regex The regular expression ( *regex* ) that defines the text pattern to match. 
     */
    public fun regex(regex: String)

    /**
     * An array of key-value pairs to apply to the custom data identifier.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-tags)
     * @param tags An array of key-value pairs to apply to the custom data identifier. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to the custom data identifier.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-tags)
     * @param tags An array of key-value pairs to apply to the custom data identifier. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.macie.CfnCustomDataIdentifier.Builder =
        software.amazon.awscdk.services.macie.CfnCustomDataIdentifier.Builder.create(scope, id)

    /**
     * A custom description of the custom data identifier. The description can contain 1-512
     * characters.
     *
     * Avoid including sensitive data in the description. Users of the account might be able to see
     * the description, depending on the actions that they're allowed to perform in Amazon Macie .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-description)
     * @param description A custom description of the custom data identifier. The description can
     * contain 1-512 characters. 
     */
    override fun description(description: String) {
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
     * @param ignoreWords An array of character sequences ( *ignore words* ) to exclude from the
     * results. 
     */
    override fun ignoreWords(ignoreWords: List<String>) {
      cdkBuilder.ignoreWords(ignoreWords)
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
     * @param ignoreWords An array of character sequences ( *ignore words* ) to exclude from the
     * results. 
     */
    override fun ignoreWords(vararg ignoreWords: String): Unit = ignoreWords(ignoreWords.toList())

    /**
     * An array of character sequences ( *keywords* ), one of which must precede and be in proximity
     * ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
     *
     * The array can contain 1-50 keywords. Each keyword can contain 3-90 UTF-8 characters. Keywords
     * aren't case sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-keywords)
     * @param keywords An array of character sequences ( *keywords* ), one of which must precede and
     * be in proximity ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match. 
     */
    override fun keywords(keywords: List<String>) {
      cdkBuilder.keywords(keywords)
    }

    /**
     * An array of character sequences ( *keywords* ), one of which must precede and be in proximity
     * ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match.
     *
     * The array can contain 1-50 keywords. Each keyword can contain 3-90 UTF-8 characters. Keywords
     * aren't case sensitive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-keywords)
     * @param keywords An array of character sequences ( *keywords* ), one of which must precede and
     * be in proximity ( `MaximumMatchDistance` ) of the regular expression ( `Regex` ) to match. 
     */
    override fun keywords(vararg keywords: String): Unit = keywords(keywords.toList())

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
     * @param maximumMatchDistance The maximum number of characters that can exist between the end
     * of at least one complete character sequence specified by the `Keywords` array and the end of
     * text that matches the regular expression ( `Regex` ). 
     */
    override fun maximumMatchDistance(maximumMatchDistance: Number) {
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
     * @param name A custom name for the custom data identifier. The name can contain 1-128
     * characters. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The regular expression ( *regex* ) that defines the text pattern to match.
     *
     * The expression can contain 1-512 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-regex)
     * @param regex The regular expression ( *regex* ) that defines the text pattern to match. 
     */
    override fun regex(regex: String) {
      cdkBuilder.regex(regex)
    }

    /**
     * An array of key-value pairs to apply to the custom data identifier.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-tags)
     * @param tags An array of key-value pairs to apply to the custom data identifier. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to the custom data identifier.
     *
     * For more information, see [Resource
     * tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-macie-customdataidentifier.html#cfn-macie-customdataidentifier-tags)
     * @param tags An array of key-value pairs to apply to the custom data identifier. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.macie.CfnCustomDataIdentifier =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomDataIdentifier {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomDataIdentifier(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnCustomDataIdentifier):
        CfnCustomDataIdentifier = CfnCustomDataIdentifier(cdkObject)

    internal fun unwrap(wrapped: CfnCustomDataIdentifier):
        software.amazon.awscdk.services.macie.CfnCustomDataIdentifier = wrapped.cdkObject
  }
}