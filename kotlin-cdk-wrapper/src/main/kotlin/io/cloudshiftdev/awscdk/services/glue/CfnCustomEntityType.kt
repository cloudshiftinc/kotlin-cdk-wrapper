@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a custom pattern that is used to detect sensitive data across the columns and rows of
 * your structured data.
 *
 * Each custom pattern you create specifies a regular expression and an optional list of context
 * words. If no context words are passed only a regular expression is checked.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * Object tags;
 * CfnCustomEntityType cfnCustomEntityType = CfnCustomEntityType.Builder.create(this,
 * "MyCfnCustomEntityType")
 * .contextWords(List.of("contextWords"))
 * .name("name")
 * .regexString("regexString")
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html)
 */
public open class CfnCustomEntityType(
  cdkObject: software.amazon.awscdk.services.glue.CfnCustomEntityType,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.glue.CfnCustomEntityType(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomEntityTypeProps,
  ) :
      this(software.amazon.awscdk.services.glue.CfnCustomEntityType(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCustomEntityTypeProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCustomEntityTypeProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCustomEntityTypeProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A list of context words.
   */
  public open fun contextWords(): List<String> = unwrap(this).getContextWords() ?: emptyList()

  /**
   * A list of context words.
   */
  public open fun contextWords(`value`: List<String>) {
    unwrap(this).setContextWords(`value`)
  }

  /**
   * A list of context words.
   */
  public open fun contextWords(vararg `value`: String): Unit = contextWords(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A name for the custom pattern that allows it to be retrieved or deleted later.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * A name for the custom pattern that allows it to be retrieved or deleted later.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A regular expression string that is used for detecting sensitive data in a custom pattern.
   */
  public open fun regexString(): String? = unwrap(this).getRegexString()

  /**
   * A regular expression string that is used for detecting sensitive data in a custom pattern.
   */
  public open fun regexString(`value`: String) {
    unwrap(this).setRegexString(`value`)
  }

  /**
   * AWS tags that contain a key value pair and may be searched by console, command line, or API.
   */
  public open fun tags(): Any? = unwrap(this).getTags()

  /**
   * AWS tags that contain a key value pair and may be searched by console, command line, or API.
   */
  public open fun tags(`value`: Any) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnCustomEntityType].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of context words.
     *
     * If none of these context words are found within the vicinity of the regular expression the
     * data will not be detected as sensitive data.
     *
     * If no context words are passed only a regular expression is checked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-contextwords)
     * @param contextWords A list of context words. 
     */
    public fun contextWords(contextWords: List<String>)

    /**
     * A list of context words.
     *
     * If none of these context words are found within the vicinity of the regular expression the
     * data will not be detected as sensitive data.
     *
     * If no context words are passed only a regular expression is checked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-contextwords)
     * @param contextWords A list of context words. 
     */
    public fun contextWords(vararg contextWords: String)

    /**
     * A name for the custom pattern that allows it to be retrieved or deleted later.
     *
     * This name must be unique per AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-name)
     * @param name A name for the custom pattern that allows it to be retrieved or deleted later. 
     */
    public fun name(name: String)

    /**
     * A regular expression string that is used for detecting sensitive data in a custom pattern.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-regexstring)
     * @param regexString A regular expression string that is used for detecting sensitive data in a
     * custom pattern. 
     */
    public fun regexString(regexString: String)

    /**
     * AWS tags that contain a key value pair and may be searched by console, command line, or API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-tags)
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API. 
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnCustomEntityType.Builder =
        software.amazon.awscdk.services.glue.CfnCustomEntityType.Builder.create(scope, id)

    /**
     * A list of context words.
     *
     * If none of these context words are found within the vicinity of the regular expression the
     * data will not be detected as sensitive data.
     *
     * If no context words are passed only a regular expression is checked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-contextwords)
     * @param contextWords A list of context words. 
     */
    override fun contextWords(contextWords: List<String>) {
      cdkBuilder.contextWords(contextWords)
    }

    /**
     * A list of context words.
     *
     * If none of these context words are found within the vicinity of the regular expression the
     * data will not be detected as sensitive data.
     *
     * If no context words are passed only a regular expression is checked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-contextwords)
     * @param contextWords A list of context words. 
     */
    override fun contextWords(vararg contextWords: String): Unit =
        contextWords(contextWords.toList())

    /**
     * A name for the custom pattern that allows it to be retrieved or deleted later.
     *
     * This name must be unique per AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-name)
     * @param name A name for the custom pattern that allows it to be retrieved or deleted later. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A regular expression string that is used for detecting sensitive data in a custom pattern.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-regexstring)
     * @param regexString A regular expression string that is used for detecting sensitive data in a
     * custom pattern. 
     */
    override fun regexString(regexString: String) {
      cdkBuilder.regexString(regexString)
    }

    /**
     * AWS tags that contain a key value pair and may be searched by console, command line, or API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-customentitytype.html#cfn-glue-customentitytype-tags)
     * @param tags AWS tags that contain a key value pair and may be searched by console, command
     * line, or API. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnCustomEntityType =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnCustomEntityType.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomEntityType {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomEntityType(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCustomEntityType):
        CfnCustomEntityType = CfnCustomEntityType(cdkObject)

    internal fun unwrap(wrapped: CfnCustomEntityType):
        software.amazon.awscdk.services.glue.CfnCustomEntityType = wrapped.cdkObject as
        software.amazon.awscdk.services.glue.CfnCustomEntityType
  }
}
