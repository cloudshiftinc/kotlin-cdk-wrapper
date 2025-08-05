@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnAIGuardrailVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnAIGuardrailVersionProps cfnAIGuardrailVersionProps = CfnAIGuardrailVersionProps.builder()
 * .aiGuardrailId("aiGuardrailId")
 * .assistantId("assistantId")
 * // the properties below are optional
 * .modifiedTimeSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html)
 */
public interface CfnAIGuardrailVersionProps {
  /**
   * The ID of the AI guardrail version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-aiguardrailid)
   */
  public fun aiGuardrailId(): String

  /**
   * The ID of the AI guardrail version assistant.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-assistantid)
   */
  public fun assistantId(): String

  /**
   * The modified time of the AI guardrail version in seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-modifiedtimeseconds)
   */
  public fun modifiedTimeSeconds(): Number? = unwrap(this).getModifiedTimeSeconds()

  /**
   * A builder for [CfnAIGuardrailVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aiGuardrailId The ID of the AI guardrail version. 
     */
    public fun aiGuardrailId(aiGuardrailId: String)

    /**
     * @param assistantId The ID of the AI guardrail version assistant. 
     */
    public fun assistantId(assistantId: String)

    /**
     * @param modifiedTimeSeconds The modified time of the AI guardrail version in seconds.
     */
    public fun modifiedTimeSeconds(modifiedTimeSeconds: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersionProps.Builder =
        software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersionProps.builder()

    /**
     * @param aiGuardrailId The ID of the AI guardrail version. 
     */
    override fun aiGuardrailId(aiGuardrailId: String) {
      cdkBuilder.aiGuardrailId(aiGuardrailId)
    }

    /**
     * @param assistantId The ID of the AI guardrail version assistant. 
     */
    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    /**
     * @param modifiedTimeSeconds The modified time of the AI guardrail version in seconds.
     */
    override fun modifiedTimeSeconds(modifiedTimeSeconds: Number) {
      cdkBuilder.modifiedTimeSeconds(modifiedTimeSeconds)
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersionProps,
  ) : CdkObject(cdkObject),
      CfnAIGuardrailVersionProps {
    /**
     * The ID of the AI guardrail version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-aiguardrailid)
     */
    override fun aiGuardrailId(): String = unwrap(this).getAiGuardrailId()

    /**
     * The ID of the AI guardrail version assistant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-assistantid)
     */
    override fun assistantId(): String = unwrap(this).getAssistantId()

    /**
     * The modified time of the AI guardrail version in seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-modifiedtimeseconds)
     */
    override fun modifiedTimeSeconds(): Number? = unwrap(this).getModifiedTimeSeconds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAIGuardrailVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersionProps):
        CfnAIGuardrailVersionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnAIGuardrailVersionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAIGuardrailVersionProps):
        software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersionProps
  }
}
