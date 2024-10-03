@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates or updates a Systems Manager resource policy.
 *
 * A resource policy helps you to define the IAM entity (for example, an AWS account ) that can
 * manage your Systems Manager resources. Currently, `OpsItemGroup` is the only resource that supports
 * Systems Manager resource policies. The resource policy for `OpsItemGroup` enables AWS accounts to
 * view and interact with OpsCenter operational work items (OpsItems). OpsCenter is a capability of
 * Systems Manager .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssm.*;
 * Object policy;
 * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
 * "MyCfnResourcePolicy")
 * .policy(policy)
 * .resourceArn("resourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html)
 */
public open class CfnResourcePolicy(
  cdkObject: software.amazon.awscdk.services.ssm.CfnResourcePolicy,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourcePolicyProps,
  ) :
      this(software.amazon.awscdk.services.ssm.CfnResourcePolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnResourcePolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourcePolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResourcePolicyProps(props)
  )

  /**
   * ID of the current policy version.
   *
   * The hash helps to prevent a situation where multiple users attempt to overwrite a policy. You
   * must provide this hash and the policy ID when updating or deleting a policy.
   */
  public open fun attrPolicyHash(): String = unwrap(this).getAttrPolicyHash()

  /**
   * ID of the current policy version.
   */
  public open fun attrPolicyId(): String = unwrap(this).getAttrPolicyId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A policy you want to associate with a resource.
   */
  public open fun policy(): Any = unwrap(this).getPolicy()

  /**
   * A policy you want to associate with a resource.
   */
  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
   */
  public open fun resourceArn(): String = unwrap(this).getResourceArn()

  /**
   * The Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
   */
  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssm.CfnResourcePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A policy you want to associate with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html#cfn-ssm-resourcepolicy-policy)
     * @param policy A policy you want to associate with a resource. 
     */
    public fun policy(policy: Any)

    /**
     * The Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html#cfn-ssm-resourcepolicy-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) of the resource to which you want to attach
     * a policy. 
     */
    public fun resourceArn(resourceArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnResourcePolicy.Builder =
        software.amazon.awscdk.services.ssm.CfnResourcePolicy.Builder.create(scope, id)

    /**
     * A policy you want to associate with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html#cfn-ssm-resourcepolicy-policy)
     * @param policy A policy you want to associate with a resource. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * The Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html#cfn-ssm-resourcepolicy-resourcearn)
     * @param resourceArn The Amazon Resource Name (ARN) of the resource to which you want to attach
     * a policy. 
     */
    override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): software.amazon.awscdk.services.ssm.CfnResourcePolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssm.CfnResourcePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourcePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourcePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnResourcePolicy):
        CfnResourcePolicy = CfnResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicy):
        software.amazon.awscdk.services.ssm.CfnResourcePolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.ssm.CfnResourcePolicy
  }
}
