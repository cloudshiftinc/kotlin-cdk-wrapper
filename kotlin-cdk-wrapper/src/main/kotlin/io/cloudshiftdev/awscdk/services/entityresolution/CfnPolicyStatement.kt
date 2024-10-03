@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.entityresolution

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds a policy statement object.
 *
 * To retrieve a list of existing policy statements, use the `GetPolicy` API.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.entityresolution.*;
 * CfnPolicyStatement cfnPolicyStatement = CfnPolicyStatement.Builder.create(this,
 * "MyCfnPolicyStatement")
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
public open class CfnPolicyStatement(
  cdkObject: software.amazon.awscdk.services.entityresolution.CfnPolicyStatement,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPolicyStatementProps,
  ) :
      this(software.amazon.awscdk.services.entityresolution.CfnPolicyStatement(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPolicyStatementProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPolicyStatementProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPolicyStatementProps(props)
  )

  /**
   * The action that the principal can use on the resource.
   */
  public open fun action(): List<String> = unwrap(this).getAction() ?: emptyList()

  /**
   * The action that the principal can use on the resource.
   */
  public open fun action(`value`: List<String>) {
    unwrap(this).setAction(`value`)
  }

  /**
   * The action that the principal can use on the resource.
   */
  public open fun action(vararg `value`: String): Unit = action(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the resource that will be accessed by the principal.
   */
  public open fun arn(): String = unwrap(this).getArn()

  /**
   * The Amazon Resource Name (ARN) of the resource that will be accessed by the principal.
   */
  public open fun arn(`value`: String) {
    unwrap(this).setArn(`value`)
  }

  /**
   * A set of condition keys that you can use in key policies.
   */
  public open fun condition(): String? = unwrap(this).getCondition()

  /**
   * A set of condition keys that you can use in key policies.
   */
  public open fun condition(`value`: String) {
    unwrap(this).setCondition(`value`)
  }

  /**
   * Determines whether the permissions specified in the policy are to be allowed ( `Allow` ) or
   * denied ( `Deny` ).
   */
  public open fun effect(): String? = unwrap(this).getEffect()

  /**
   * Determines whether the permissions specified in the policy are to be allowed ( `Allow` ) or
   * denied ( `Deny` ).
   */
  public open fun effect(`value`: String) {
    unwrap(this).setEffect(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The AWS service or AWS account that can access the resource defined as ARN.
   */
  public open fun principal(): List<String> = unwrap(this).getPrincipal() ?: emptyList()

  /**
   * The AWS service or AWS account that can access the resource defined as ARN.
   */
  public open fun principal(`value`: List<String>) {
    unwrap(this).setPrincipal(`value`)
  }

  /**
   * The AWS service or AWS account that can access the resource defined as ARN.
   */
  public open fun principal(vararg `value`: String): Unit = principal(`value`.toList())

  /**
   * A statement identifier that differentiates the statement from others in the same policy.
   */
  public open fun statementId(): String = unwrap(this).getStatementId()

  /**
   * A statement identifier that differentiates the statement from others in the same policy.
   */
  public open fun statementId(`value`: String) {
    unwrap(this).setStatementId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.entityresolution.CfnPolicyStatement].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The action that the principal can use on the resource.
     *
     * For example, `entityresolution:GetIdMappingJob` , `entityresolution:GetMatchingJob` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-action)
     * @param action The action that the principal can use on the resource. 
     */
    public fun action(action: List<String>)

    /**
     * The action that the principal can use on the resource.
     *
     * For example, `entityresolution:GetIdMappingJob` , `entityresolution:GetMatchingJob` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-action)
     * @param action The action that the principal can use on the resource. 
     */
    public fun action(vararg action: String)

    /**
     * The Amazon Resource Name (ARN) of the resource that will be accessed by the principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-arn)
     * @param arn The Amazon Resource Name (ARN) of the resource that will be accessed by the
     * principal. 
     */
    public fun arn(arn: String)

    /**
     * A set of condition keys that you can use in key policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-condition)
     * @param condition A set of condition keys that you can use in key policies. 
     */
    public fun condition(condition: String)

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
     * @param effect Determines whether the permissions specified in the policy are to be allowed (
     * `Allow` ) or denied ( `Deny` ). 
     */
    public fun effect(effect: String)

    /**
     * The AWS service or AWS account that can access the resource defined as ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-principal)
     * @param principal The AWS service or AWS account that can access the resource defined as ARN. 
     */
    public fun principal(principal: List<String>)

    /**
     * The AWS service or AWS account that can access the resource defined as ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-principal)
     * @param principal The AWS service or AWS account that can access the resource defined as ARN. 
     */
    public fun principal(vararg principal: String)

    /**
     * A statement identifier that differentiates the statement from others in the same policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-statementid)
     * @param statementId A statement identifier that differentiates the statement from others in
     * the same policy. 
     */
    public fun statementId(statementId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.entityresolution.CfnPolicyStatement.Builder =
        software.amazon.awscdk.services.entityresolution.CfnPolicyStatement.Builder.create(scope,
        id)

    /**
     * The action that the principal can use on the resource.
     *
     * For example, `entityresolution:GetIdMappingJob` , `entityresolution:GetMatchingJob` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-action)
     * @param action The action that the principal can use on the resource. 
     */
    override fun action(action: List<String>) {
      cdkBuilder.action(action)
    }

    /**
     * The action that the principal can use on the resource.
     *
     * For example, `entityresolution:GetIdMappingJob` , `entityresolution:GetMatchingJob` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-action)
     * @param action The action that the principal can use on the resource. 
     */
    override fun action(vararg action: String): Unit = action(action.toList())

    /**
     * The Amazon Resource Name (ARN) of the resource that will be accessed by the principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-arn)
     * @param arn The Amazon Resource Name (ARN) of the resource that will be accessed by the
     * principal. 
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * A set of condition keys that you can use in key policies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-condition)
     * @param condition A set of condition keys that you can use in key policies. 
     */
    override fun condition(condition: String) {
      cdkBuilder.condition(condition)
    }

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
     * @param effect Determines whether the permissions specified in the policy are to be allowed (
     * `Allow` ) or denied ( `Deny` ). 
     */
    override fun effect(effect: String) {
      cdkBuilder.effect(effect)
    }

    /**
     * The AWS service or AWS account that can access the resource defined as ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-principal)
     * @param principal The AWS service or AWS account that can access the resource defined as ARN. 
     */
    override fun principal(principal: List<String>) {
      cdkBuilder.principal(principal)
    }

    /**
     * The AWS service or AWS account that can access the resource defined as ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-principal)
     * @param principal The AWS service or AWS account that can access the resource defined as ARN. 
     */
    override fun principal(vararg principal: String): Unit = principal(principal.toList())

    /**
     * A statement identifier that differentiates the statement from others in the same policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-policystatement.html#cfn-entityresolution-policystatement-statementid)
     * @param statementId A statement identifier that differentiates the statement from others in
     * the same policy. 
     */
    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnPolicyStatement =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.entityresolution.CfnPolicyStatement.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPolicyStatement {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPolicyStatement(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnPolicyStatement):
        CfnPolicyStatement = CfnPolicyStatement(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyStatement):
        software.amazon.awscdk.services.entityresolution.CfnPolicyStatement = wrapped.cdkObject as
        software.amazon.awscdk.services.entityresolution.CfnPolicyStatement
  }
}
