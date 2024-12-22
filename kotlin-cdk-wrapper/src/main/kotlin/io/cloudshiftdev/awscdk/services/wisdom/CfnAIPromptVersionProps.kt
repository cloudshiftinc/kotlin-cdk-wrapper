@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnAIPromptVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnAIPromptVersionProps cfnAIPromptVersionProps = CfnAIPromptVersionProps.builder()
 * .aiPromptId("aiPromptId")
 * .assistantId("assistantId")
 * // the properties below are optional
 * .modifiedTimeSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aipromptversion.html)
 */
public interface CfnAIPromptVersionProps {
  /**
   * The identifier of the Amazon Q in Connect AI prompt.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aipromptversion.html#cfn-wisdom-aipromptversion-aipromptid)
   */
  public fun aiPromptId(): String

  /**
   * The identifier of the Amazon Q in Connect assistant.
   *
   * Can be either the ID or the ARN. URLs cannot contain the ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aipromptversion.html#cfn-wisdom-aipromptversion-assistantid)
   */
  public fun assistantId(): String

  /**
   * The time the AI Prompt version was last modified in seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aipromptversion.html#cfn-wisdom-aipromptversion-modifiedtimeseconds)
   */
  public fun modifiedTimeSeconds(): Number? = unwrap(this).getModifiedTimeSeconds()

  /**
   * A builder for [CfnAIPromptVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aiPromptId The identifier of the Amazon Q in Connect AI prompt. 
     */
    public fun aiPromptId(aiPromptId: String)

    /**
     * @param assistantId The identifier of the Amazon Q in Connect assistant. 
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     */
    public fun assistantId(assistantId: String)

    /**
     * @param modifiedTimeSeconds The time the AI Prompt version was last modified in seconds.
     */
    public fun modifiedTimeSeconds(modifiedTimeSeconds: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnAIPromptVersionProps.Builder =
        software.amazon.awscdk.services.wisdom.CfnAIPromptVersionProps.builder()

    /**
     * @param aiPromptId The identifier of the Amazon Q in Connect AI prompt. 
     */
    override fun aiPromptId(aiPromptId: String) {
      cdkBuilder.aiPromptId(aiPromptId)
    }

    /**
     * @param assistantId The identifier of the Amazon Q in Connect assistant. 
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     */
    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    /**
     * @param modifiedTimeSeconds The time the AI Prompt version was last modified in seconds.
     */
    override fun modifiedTimeSeconds(modifiedTimeSeconds: Number) {
      cdkBuilder.modifiedTimeSeconds(modifiedTimeSeconds)
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAIPromptVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.wisdom.CfnAIPromptVersionProps,
  ) : CdkObject(cdkObject),
      CfnAIPromptVersionProps {
    /**
     * The identifier of the Amazon Q in Connect AI prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aipromptversion.html#cfn-wisdom-aipromptversion-aipromptid)
     */
    override fun aiPromptId(): String = unwrap(this).getAiPromptId()

    /**
     * The identifier of the Amazon Q in Connect assistant.
     *
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aipromptversion.html#cfn-wisdom-aipromptversion-assistantid)
     */
    override fun assistantId(): String = unwrap(this).getAssistantId()

    /**
     * The time the AI Prompt version was last modified in seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aipromptversion.html#cfn-wisdom-aipromptversion-modifiedtimeseconds)
     */
    override fun modifiedTimeSeconds(): Number? = unwrap(this).getModifiedTimeSeconds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAIPromptVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIPromptVersionProps):
        CfnAIPromptVersionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAIPromptVersionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAIPromptVersionProps):
        software.amazon.awscdk.services.wisdom.CfnAIPromptVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wisdom.CfnAIPromptVersionProps
  }
}
