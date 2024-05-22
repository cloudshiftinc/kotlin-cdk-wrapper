@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.entityresolution

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPolicyStatement`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.entityresolution.*;
 * CfnPolicyStatementProps cfnPolicyStatementProps = CfnPolicyStatementProps.builder()
 * .arn("arn")
 * .statementId("statementId")
 * // the properties below are optional
 * .action(List.of("action"))
 * .condition("condition")
 * .effect("effect")
 * .principal(List.of("principal"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html)
 */
public interface CfnPolicyStatementProps {
  /**
   * The action that the principal can use on the resource.
   *
   * For example, `entityresolution:GetIdMappingJob` , `entityresolution:GetMatchingJob` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-action)
   */
  public fun action(): List<String> = unwrap(this).getAction() ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) of the resource that will be accessed by the principal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-arn)
   */
  public fun arn(): String

  /**
   * A set of condition keys that you can use in key policies.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-condition)
   */
  public fun condition(): String? = unwrap(this).getCondition()

  /**
   * Determines whether the permissions specified in the policy are to be allowed ( `Allow` ) or
   * denied ( `Deny` ).
   *
   *
   * If you set the value of the `effect` parameter to `Deny` for the `AddPolicyStatement`
   * operation, you must also set the value of the `effect` parameter in the `policy` to `Deny` for the
   * `PutPolicy` operation.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-effect)
   */
  public fun effect(): String? = unwrap(this).getEffect()

  /**
   * The AWS service or AWS account that can access the resource defined as ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-principal)
   */
  public fun principal(): List<String> = unwrap(this).getPrincipal() ?: emptyList()

  /**
   * A statement identifier that differentiates the statement from others in the same policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-statementid)
   */
  public fun statementId(): String

  /**
   * A builder for [CfnPolicyStatementProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action The action that the principal can use on the resource.
     * For example, `entityresolution:GetIdMappingJob` , `entityresolution:GetMatchingJob` .
     */
    public fun action(action: List<String>)

    /**
     * @param action The action that the principal can use on the resource.
     * For example, `entityresolution:GetIdMappingJob` , `entityresolution:GetMatchingJob` .
     */
    public fun action(vararg action: String)

    /**
     * @param arn The Amazon Resource Name (ARN) of the resource that will be accessed by the
     * principal. 
     */
    public fun arn(arn: String)

    /**
     * @param condition A set of condition keys that you can use in key policies.
     */
    public fun condition(condition: String)

    /**
     * @param effect Determines whether the permissions specified in the policy are to be allowed (
     * `Allow` ) or denied ( `Deny` ).
     *
     * If you set the value of the `effect` parameter to `Deny` for the `AddPolicyStatement`
     * operation, you must also set the value of the `effect` parameter in the `policy` to `Deny` for
     * the `PutPolicy` operation.
     */
    public fun effect(effect: String)

    /**
     * @param principal The AWS service or AWS account that can access the resource defined as ARN.
     */
    public fun principal(principal: List<String>)

    /**
     * @param principal The AWS service or AWS account that can access the resource defined as ARN.
     */
    public fun principal(vararg principal: String)

    /**
     * @param statementId A statement identifier that differentiates the statement from others in
     * the same policy. 
     */
    public fun statementId(statementId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.entityresolution.CfnPolicyStatementProps.Builder =
        software.amazon.awscdk.services.entityresolution.CfnPolicyStatementProps.builder()

    /**
     * @param action The action that the principal can use on the resource.
     * For example, `entityresolution:GetIdMappingJob` , `entityresolution:GetMatchingJob` .
     */
    override fun action(action: List<String>) {
      cdkBuilder.action(action)
    }

    /**
     * @param action The action that the principal can use on the resource.
     * For example, `entityresolution:GetIdMappingJob` , `entityresolution:GetMatchingJob` .
     */
    override fun action(vararg action: String): Unit = action(action.toList())

    /**
     * @param arn The Amazon Resource Name (ARN) of the resource that will be accessed by the
     * principal. 
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * @param condition A set of condition keys that you can use in key policies.
     */
    override fun condition(condition: String) {
      cdkBuilder.condition(condition)
    }

    /**
     * @param effect Determines whether the permissions specified in the policy are to be allowed (
     * `Allow` ) or denied ( `Deny` ).
     *
     * If you set the value of the `effect` parameter to `Deny` for the `AddPolicyStatement`
     * operation, you must also set the value of the `effect` parameter in the `policy` to `Deny` for
     * the `PutPolicy` operation.
     */
    override fun effect(effect: String) {
      cdkBuilder.effect(effect)
    }

    /**
     * @param principal The AWS service or AWS account that can access the resource defined as ARN.
     */
    override fun principal(principal: List<String>) {
      cdkBuilder.principal(principal)
    }

    /**
     * @param principal The AWS service or AWS account that can access the resource defined as ARN.
     */
    override fun principal(vararg principal: String): Unit = principal(principal.toList())

    /**
     * @param statementId A statement identifier that differentiates the statement from others in
     * the same policy. 
     */
    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnPolicyStatementProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.entityresolution.CfnPolicyStatementProps,
  ) : CdkObject(cdkObject), CfnPolicyStatementProps {
    /**
     * The action that the principal can use on the resource.
     *
     * For example, `entityresolution:GetIdMappingJob` , `entityresolution:GetMatchingJob` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-action)
     */
    override fun action(): List<String> = unwrap(this).getAction() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the resource that will be accessed by the principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-arn)
     */
    override fun arn(): String = unwrap(this).getArn()

    /**
     * A set of condition keys that you can use in key policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-condition)
     */
    override fun condition(): String? = unwrap(this).getCondition()

    /**
     * Determines whether the permissions specified in the policy are to be allowed ( `Allow` ) or
     * denied ( `Deny` ).
     *
     *
     * If you set the value of the `effect` parameter to `Deny` for the `AddPolicyStatement`
     * operation, you must also set the value of the `effect` parameter in the `policy` to `Deny` for
     * the `PutPolicy` operation.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-effect)
     */
    override fun effect(): String? = unwrap(this).getEffect()

    /**
     * The AWS service or AWS account that can access the resource defined as ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-principal)
     */
    override fun principal(): List<String> = unwrap(this).getPrincipal() ?: emptyList()

    /**
     * A statement identifier that differentiates the statement from others in the same policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-statementid)
     */
    override fun statementId(): String = unwrap(this).getStatementId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyStatementProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnPolicyStatementProps):
        CfnPolicyStatementProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPolicyStatementProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyStatementProps):
        software.amazon.awscdk.services.entityresolution.CfnPolicyStatementProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.entityresolution.CfnPolicyStatementProps
  }
}
