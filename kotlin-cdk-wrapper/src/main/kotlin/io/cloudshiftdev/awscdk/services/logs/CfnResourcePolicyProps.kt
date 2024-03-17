@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
 * .policyDocument("policyDocument")
 * .policyName("policyName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html)
 */
public interface CfnResourcePolicyProps {
  /**
   * The details of the policy.
   *
   * It must be formatted in JSON, and you must use backslashes to escape characters that need to be
   * escaped in JSON strings, such as double quote marks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html#cfn-logs-resourcepolicy-policydocument)
   */
  public fun policyDocument(): String

  /**
   * The name of the resource policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html#cfn-logs-resourcepolicy-policyname)
   */
  public fun policyName(): String

  /**
   * A builder for [CfnResourcePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policyDocument The details of the policy. 
     * It must be formatted in JSON, and you must use backslashes to escape characters that need to
     * be escaped in JSON strings, such as double quote marks.
     */
    public fun policyDocument(policyDocument: String)

    /**
     * @param policyName The name of the resource policy. 
     */
    public fun policyName(policyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnResourcePolicyProps.Builder =
        software.amazon.awscdk.services.logs.CfnResourcePolicyProps.builder()

    /**
     * @param policyDocument The details of the policy. 
     * It must be formatted in JSON, and you must use backslashes to escape characters that need to
     * be escaped in JSON strings, such as double quote marks.
     */
    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param policyName The name of the resource policy. 
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.CfnResourcePolicyProps,
  ) : CdkObject(cdkObject), CfnResourcePolicyProps {
    /**
     * The details of the policy.
     *
     * It must be formatted in JSON, and you must use backslashes to escape characters that need to
     * be escaped in JSON strings, such as double quote marks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html#cfn-logs-resourcepolicy-policydocument)
     */
    override fun policyDocument(): String = unwrap(this).getPolicyDocument()

    /**
     * The name of the resource policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-resourcepolicy.html#cfn-logs-resourcepolicy-policyname)
     */
    override fun policyName(): String = unwrap(this).getPolicyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnResourcePolicyProps):
        CfnResourcePolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnResourcePolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicyProps):
        software.amazon.awscdk.services.logs.CfnResourcePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.CfnResourcePolicyProps
  }
}
