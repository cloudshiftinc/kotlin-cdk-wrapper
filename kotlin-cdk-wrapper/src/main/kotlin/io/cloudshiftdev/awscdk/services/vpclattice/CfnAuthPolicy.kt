@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

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
 * Creates or updates the auth policy. The policy string in JSON must not contain newlines or blank
 * lines.
 *
 * For more information, see [Auth
 * policies](https://docs.aws.amazon.com/vpc-lattice/latest/ug/auth-policies.html) in the *Amazon VPC
 * Lattice User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * Object policy;
 * CfnAuthPolicy cfnAuthPolicy = CfnAuthPolicy.Builder.create(this, "MyCfnAuthPolicy")
 * .policy(policy)
 * .resourceIdentifier("resourceIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html)
 */
public open class CfnAuthPolicy(
  cdkObject: software.amazon.awscdk.services.vpclattice.CfnAuthPolicy,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAuthPolicyProps,
  ) :
      this(software.amazon.awscdk.services.vpclattice.CfnAuthPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAuthPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAuthPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAuthPolicyProps(props)
  )

  /**
   * The state of the auth policy.
   *
   * The auth policy is only active when the auth type is set to `AWS _IAM` . If you provide a
   * policy, then authentication and authorization decisions are made based on this policy and the
   * client's IAM policy. If the auth type is `NONE` , then any auth policy you provide will remain
   * inactive.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The auth policy.
   */
  public open fun policy(): Any = unwrap(this).getPolicy()

  /**
   * The auth policy.
   */
  public open fun policy(`value`: Any) {
    unwrap(this).setPolicy(`value`)
  }

  /**
   * The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is
   * created.
   */
  public open fun resourceIdentifier(): String = unwrap(this).getResourceIdentifier()

  /**
   * The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is
   * created.
   */
  public open fun resourceIdentifier(`value`: String) {
    unwrap(this).setResourceIdentifier(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.vpclattice.CfnAuthPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The auth policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html#cfn-vpclattice-authpolicy-policy)
     * @param policy The auth policy. 
     */
    public fun policy(policy: Any)

    /**
     * The ID or Amazon Resource Name (ARN) of the service network or service for which the policy
     * is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html#cfn-vpclattice-authpolicy-resourceidentifier)
     * @param resourceIdentifier The ID or Amazon Resource Name (ARN) of the service network or
     * service for which the policy is created. 
     */
    public fun resourceIdentifier(resourceIdentifier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnAuthPolicy.Builder =
        software.amazon.awscdk.services.vpclattice.CfnAuthPolicy.Builder.create(scope, id)

    /**
     * The auth policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html#cfn-vpclattice-authpolicy-policy)
     * @param policy The auth policy. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * The ID or Amazon Resource Name (ARN) of the service network or service for which the policy
     * is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html#cfn-vpclattice-authpolicy-resourceidentifier)
     * @param resourceIdentifier The ID or Amazon Resource Name (ARN) of the service network or
     * service for which the policy is created. 
     */
    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnAuthPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.vpclattice.CfnAuthPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAuthPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAuthPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnAuthPolicy):
        CfnAuthPolicy = CfnAuthPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnAuthPolicy):
        software.amazon.awscdk.services.vpclattice.CfnAuthPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnAuthPolicy
  }
}
