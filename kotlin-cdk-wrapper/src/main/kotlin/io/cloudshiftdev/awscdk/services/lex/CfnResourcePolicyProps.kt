@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lex

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnResourcePolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lex.*;
 * Object policy;
 * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
 * .policy(policy)
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-resourcepolicy.html)
 */
public interface CfnResourcePolicyProps {
  /**
   * A resource policy to add to the resource.
   *
   * The policy is a JSON structure that contains one or more statements that define the policy. The
   * policy must follow IAM syntax. If the policy isn't valid, Amazon Lex returns a validation
   * exception.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-resourcepolicy.html#cfn-lex-resourcepolicy-policy)
   */
  public fun policy(): Any

  /**
   * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-resourcepolicy.html#cfn-lex-resourcepolicy-resourcearn)
   */
  public fun resourceArn(): String

  /**
   * A builder for [CfnResourcePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policy A resource policy to add to the resource. 
     * The policy is a JSON structure that contains one or more statements that define the policy.
     * The policy must follow IAM syntax. If the policy isn't valid, Amazon Lex returns a validation
     * exception.
     */
    public fun policy(policy: Any)

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the bot or bot alias that the resource
     * policy is attached to. 
     */
    public fun resourceArn(resourceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lex.CfnResourcePolicyProps.Builder =
        software.amazon.awscdk.services.lex.CfnResourcePolicyProps.builder()

    /**
     * @param policy A resource policy to add to the resource. 
     * The policy is a JSON structure that contains one or more statements that define the policy.
     * The policy must follow IAM syntax. If the policy isn't valid, Amazon Lex returns a validation
     * exception.
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param resourceArn The Amazon Resource Name (ARN) of the bot or bot alias that the resource
     * policy is attached to. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): software.amazon.awscdk.services.lex.CfnResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lex.CfnResourcePolicyProps,
  ) : CdkObject(cdkObject), CfnResourcePolicyProps {
    /**
     * A resource policy to add to the resource.
     *
     * The policy is a JSON structure that contains one or more statements that define the policy.
     * The policy must follow IAM syntax. If the policy isn't valid, Amazon Lex returns a validation
     * exception.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-resourcepolicy.html#cfn-lex-resourcepolicy-policy)
     */
    override fun policy(): Any = unwrap(this).getPolicy()

    /**
     * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached
     * to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-resourcepolicy.html#cfn-lex-resourcepolicy-resourcearn)
     */
    override fun resourceArn(): String = unwrap(this).getResourceArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnResourcePolicyProps):
        CfnResourcePolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnResourcePolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicyProps):
        software.amazon.awscdk.services.lex.CfnResourcePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lex.CfnResourcePolicyProps
  }
}
