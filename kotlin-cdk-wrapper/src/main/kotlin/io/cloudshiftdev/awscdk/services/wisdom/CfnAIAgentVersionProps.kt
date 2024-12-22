@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnAIAgentVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnAIAgentVersionProps cfnAIAgentVersionProps = CfnAIAgentVersionProps.builder()
 * .aiAgentId("aiAgentId")
 * .assistantId("assistantId")
 * // the properties below are optional
 * .modifiedTimeSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagentversion.html)
 */
public interface CfnAIAgentVersionProps {
  /**
   * The identifier of the AI Agent.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagentversion.html#cfn-wisdom-aiagentversion-aiagentid)
   */
  public fun aiAgentId(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagentversion.html#cfn-wisdom-aiagentversion-assistantid)
   */
  public fun assistantId(): String

  /**
   * The time the AI Agent version was last modified in seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagentversion.html#cfn-wisdom-aiagentversion-modifiedtimeseconds)
   */
  public fun modifiedTimeSeconds(): Number? = unwrap(this).getModifiedTimeSeconds()

  /**
   * A builder for [CfnAIAgentVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aiAgentId The identifier of the AI Agent. 
     */
    public fun aiAgentId(aiAgentId: String)

    /**
     * @param assistantId the value to be set. 
     */
    public fun assistantId(assistantId: String)

    /**
     * @param modifiedTimeSeconds The time the AI Agent version was last modified in seconds.
     */
    public fun modifiedTimeSeconds(modifiedTimeSeconds: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnAIAgentVersionProps.Builder =
        software.amazon.awscdk.services.wisdom.CfnAIAgentVersionProps.builder()

    /**
     * @param aiAgentId The identifier of the AI Agent. 
     */
    override fun aiAgentId(aiAgentId: String) {
      cdkBuilder.aiAgentId(aiAgentId)
    }

    /**
     * @param assistantId the value to be set. 
     */
    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    /**
     * @param modifiedTimeSeconds The time the AI Agent version was last modified in seconds.
     */
    override fun modifiedTimeSeconds(modifiedTimeSeconds: Number) {
      cdkBuilder.modifiedTimeSeconds(modifiedTimeSeconds)
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAIAgentVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgentVersionProps,
  ) : CdkObject(cdkObject),
      CfnAIAgentVersionProps {
    /**
     * The identifier of the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagentversion.html#cfn-wisdom-aiagentversion-aiagentid)
     */
    override fun aiAgentId(): String = unwrap(this).getAiAgentId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagentversion.html#cfn-wisdom-aiagentversion-assistantid)
     */
    override fun assistantId(): String = unwrap(this).getAssistantId()

    /**
     * The time the AI Agent version was last modified in seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagentversion.html#cfn-wisdom-aiagentversion-modifiedtimeseconds)
     */
    override fun modifiedTimeSeconds(): Number? = unwrap(this).getModifiedTimeSeconds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAIAgentVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgentVersionProps):
        CfnAIAgentVersionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAIAgentVersionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAIAgentVersionProps):
        software.amazon.awscdk.services.wisdom.CfnAIAgentVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wisdom.CfnAIAgentVersionProps
  }
}
