@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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

/**
 * The `AWS::Macie::CustomDataIdentifier` resource specifies a custom data identifier.
 *
 * A *custom data identifier* is a set of custom criteria for Amazon Macie to use when it inspects
 * data sources for sensitive data. The criteria consist of a regular expression ( *regex* ) that
 * defines a text pattern to match and, optionally, character sequences and a proximity rule that
 * refine the results. The character sequences can be:
 *
 * * *Keywords* , which are words or phrases that must be in proximity of text that matches the
 * regex, or
 * * *Ignore words* , which are words or phrases to exclude from the results.
 *
 * By using custom data identifiers, you can supplement the managed data identifiers that Macie
 * provides and detect sensitive data that reflects your particular scenarios, intellectual property,
 * or proprietary data. For more information, see [Building custom data
 * identifiers](https://docs.aws.amazon.com/macie/latest/user/custom-data-identifiers.html) in the
 * *Amazon Macie User Guide* .
 *
 * An `AWS::Macie::Session` resource must exist for an AWS account before you can create an
 * `AWS::Macie::CustomDataIdentifier` resource for the account. Use a [DependsOn
 * attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * to ensure that an `AWS::Macie::Session` resource is created before other Macie resources are created
 * for an account. For example, `"DependsOn": "Session"` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.macie.*;
 * CfnCustomDataIdentifier cfnCustomDataIdentifier = CfnCustomDataIdentifier.Builder.create(this,
 * "MyCfnCustomDataIdentifier")
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
public open class CfnCustomDataIdentifier internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.macie.CfnCustomDataIdentifier,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomDataIdentifierProps,
  ) :
      this(software.amazon.awscdk.services.macie.CfnCustomDataIdentifier(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnCustomDataIdentifierProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomDataIdentifierProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCustomDataIdentifierProps(props)
  )

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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.macie.CfnCustomDataIdentifier.CFN_RESOURCE_TYPE_NAME

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
