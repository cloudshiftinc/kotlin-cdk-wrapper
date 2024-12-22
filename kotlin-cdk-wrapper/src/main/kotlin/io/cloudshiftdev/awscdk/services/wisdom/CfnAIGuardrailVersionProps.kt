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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-aiguardrailid)
   */
  public fun aiGuardrailId(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-assistantid)
   */
  public fun assistantId(): String

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-modifiedtimeseconds)
   */
  public fun modifiedTimeSeconds(): Number? = unwrap(this).getModifiedTimeSeconds()

  /**
   * A builder for [CfnAIGuardrailVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aiGuardrailId the value to be set. 
     */
    public fun aiGuardrailId(aiGuardrailId: String)

    /**
     * @param assistantId the value to be set. 
     */
    public fun assistantId(assistantId: String)

    /**
     * @param modifiedTimeSeconds the value to be set.
     */
    public fun modifiedTimeSeconds(modifiedTimeSeconds: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersionProps.Builder =
        software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersionProps.builder()

    /**
     * @param aiGuardrailId the value to be set. 
     */
    override fun aiGuardrailId(aiGuardrailId: String) {
      cdkBuilder.aiGuardrailId(aiGuardrailId)
    }

    /**
     * @param assistantId the value to be set. 
     */
    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    /**
     * @param modifiedTimeSeconds the value to be set.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-aiguardrailid)
     */
    override fun aiGuardrailId(): String = unwrap(this).getAiGuardrailId()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-assistantid)
     */
    override fun assistantId(): String = unwrap(this).getAssistantId()

    /**
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
