@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a prompt for the specified Amazon Connect instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnPrompt cfnPrompt = CfnPrompt.Builder.create(this, "MyCfnPrompt")
 * .instanceArn("instanceArn")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .s3Uri("s3Uri")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html)
 */
public open class CfnPrompt(
  cdkObject: software.amazon.awscdk.services.connect.CfnPrompt,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPromptProps,
  ) :
      this(software.amazon.awscdk.services.connect.CfnPrompt(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnPromptProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPromptProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPromptProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the prompt.
   */
  public open fun attrPromptArn(): String = unwrap(this).getAttrPromptArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the prompt.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the prompt.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The identifier of the Amazon Connect instance.
   */
  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  /**
   * The identifier of the Amazon Connect instance.
   */
  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  /**
   * The name of the prompt.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the prompt.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The URI for the S3 bucket where the prompt is stored.
   */
  public open fun s3Uri(): String? = unwrap(this).getS3Uri()

  /**
   * The URI for the S3 bucket where the prompt is stored.
   */
  public open fun s3Uri(`value`: String) {
    unwrap(this).setS3Uri(`value`)
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnPrompt].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-description)
     * @param description The description of the prompt. 
     */
    public fun description(description: String)

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-instancearn)
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * The name of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-name)
     * @param name The name of the prompt. 
     */
    public fun name(name: String)

    /**
     * The URI for the S3 bucket where the prompt is stored.
     *
     * This property is required when you create a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-s3uri)
     * @param s3Uri The URI for the S3 bucket where the prompt is stored. 
     */
    public fun s3Uri(s3Uri: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnPrompt.Builder =
        software.amazon.awscdk.services.connect.CfnPrompt.Builder.create(scope, id)

    /**
     * The description of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-description)
     * @param description The description of the prompt. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-instancearn)
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * The name of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-name)
     * @param name The name of the prompt. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The URI for the S3 bucket where the prompt is stored.
     *
     * This property is required when you create a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-s3uri)
     * @param s3Uri The URI for the S3 bucket where the prompt is stored. 
     */
    override fun s3Uri(s3Uri: String) {
      cdkBuilder.s3Uri(s3Uri)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnPrompt = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.connect.CfnPrompt.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPrompt {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPrompt(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnPrompt): CfnPrompt =
        CfnPrompt(cdkObject)

    internal fun unwrap(wrapped: CfnPrompt): software.amazon.awscdk.services.connect.CfnPrompt =
        wrapped.cdkObject as software.amazon.awscdk.services.connect.CfnPrompt
  }
}
