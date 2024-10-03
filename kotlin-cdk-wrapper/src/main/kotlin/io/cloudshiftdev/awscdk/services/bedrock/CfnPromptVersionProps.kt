@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnPromptVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnPromptVersionProps cfnPromptVersionProps = CfnPromptVersionProps.builder()
 * .promptArn("promptArn")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html)
 */
public interface CfnPromptVersionProps {
  /**
   * The description of the prompt version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the version of the prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-promptarn)
   */
  public fun promptArn(): String

  /**
   * A map of tag keys and values.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnPromptVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the prompt version.
     */
    public fun description(description: String)

    /**
     * @param promptArn The Amazon Resource Name (ARN) of the version of the prompt. 
     */
    public fun promptArn(promptArn: String)

    /**
     * @param tags A map of tag keys and values.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnPromptVersionProps.Builder =
        software.amazon.awscdk.services.bedrock.CfnPromptVersionProps.builder()

    /**
     * @param description The description of the prompt version.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param promptArn The Amazon Resource Name (ARN) of the version of the prompt. 
     */
    override fun promptArn(promptArn: String) {
      cdkBuilder.promptArn(promptArn)
    }

    /**
     * @param tags A map of tag keys and values.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnPromptVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersionProps,
  ) : CdkObject(cdkObject),
      CfnPromptVersionProps {
    /**
     * The description of the prompt version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of the version of the prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-promptarn)
     */
    override fun promptArn(): String = unwrap(this).getPromptArn()

    /**
     * A map of tag keys and values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-promptversion.html#cfn-bedrock-promptversion-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPromptVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnPromptVersionProps):
        CfnPromptVersionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPromptVersionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPromptVersionProps):
        software.amazon.awscdk.services.bedrock.CfnPromptVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.bedrock.CfnPromptVersionProps
  }
}
