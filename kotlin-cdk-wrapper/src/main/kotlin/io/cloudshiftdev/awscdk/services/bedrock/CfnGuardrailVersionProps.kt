@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnGuardrailVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnGuardrailVersionProps cfnGuardrailVersionProps = CfnGuardrailVersionProps.builder()
 * .guardrailIdentifier("guardrailIdentifier")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrailversion.html)
 */
public interface CfnGuardrailVersionProps {
  /**
   * A description of the guardrail version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrailversion.html#cfn-bedrock-guardrailversion-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The unique identifier of the guardrail.
   *
   * This can be an ID or the ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrailversion.html#cfn-bedrock-guardrailversion-guardrailidentifier)
   */
  public fun guardrailIdentifier(): String

  /**
   * A builder for [CfnGuardrailVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the guardrail version.
     */
    public fun description(description: String)

    /**
     * @param guardrailIdentifier The unique identifier of the guardrail. 
     * This can be an ID or the ARN.
     */
    public fun guardrailIdentifier(guardrailIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnGuardrailVersionProps.Builder
        = software.amazon.awscdk.services.bedrock.CfnGuardrailVersionProps.builder()

    /**
     * @param description A description of the guardrail version.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param guardrailIdentifier The unique identifier of the guardrail. 
     * This can be an ID or the ARN.
     */
    override fun guardrailIdentifier(guardrailIdentifier: String) {
      cdkBuilder.guardrailIdentifier(guardrailIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnGuardrailVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrailVersionProps,
  ) : CdkObject(cdkObject),
      CfnGuardrailVersionProps {
    /**
     * A description of the guardrail version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrailversion.html#cfn-bedrock-guardrailversion-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The unique identifier of the guardrail.
     *
     * This can be an ID or the ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrailversion.html#cfn-bedrock-guardrailversion-guardrailidentifier)
     */
    override fun guardrailIdentifier(): String = unwrap(this).getGuardrailIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGuardrailVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrailVersionProps):
        CfnGuardrailVersionProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGuardrailVersionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGuardrailVersionProps):
        software.amazon.awscdk.services.bedrock.CfnGuardrailVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.bedrock.CfnGuardrailVersionProps
  }
}
