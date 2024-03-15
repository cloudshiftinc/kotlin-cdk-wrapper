@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPrompt`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnPromptProps cfnPromptProps = CfnPromptProps.builder()
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
public interface CfnPromptProps {
  /**
   * The description of the prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The identifier of the Amazon Connect instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The name of the prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-name)
   */
  public fun name(): String

  /**
   * The URI for the S3 bucket where the prompt is stored.
   *
   * This property is required when you create a prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-s3uri)
   */
  public fun s3Uri(): String? = unwrap(this).getS3Uri()

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPromptProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the prompt.
     */
    public fun description(description: String)

    /**
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param name The name of the prompt. 
     */
    public fun name(name: String)

    /**
     * @param s3Uri The URI for the S3 bucket where the prompt is stored.
     * This property is required when you create a prompt.
     */
    public fun s3Uri(s3Uri: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnPromptProps.Builder =
        software.amazon.awscdk.services.connect.CfnPromptProps.builder()

    /**
     * @param description The description of the prompt.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param instanceArn The identifier of the Amazon Connect instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param name The name of the prompt. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param s3Uri The URI for the S3 bucket where the prompt is stored.
     * This property is required when you create a prompt.
     */
    override fun s3Uri(s3Uri: String) {
      cdkBuilder.s3Uri(s3Uri)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnPromptProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnPromptProps,
  ) : CdkObject(cdkObject), CfnPromptProps {
    /**
     * The description of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The identifier of the Amazon Connect instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The name of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The URI for the S3 bucket where the prompt is stored.
     *
     * This property is required when you create a prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-s3uri)
     */
    override fun s3Uri(): String? = unwrap(this).getS3Uri()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-prompt.html#cfn-connect-prompt-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPromptProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnPromptProps):
        CfnPromptProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPromptProps):
        software.amazon.awscdk.services.connect.CfnPromptProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.connect.CfnPromptProps
  }
}
