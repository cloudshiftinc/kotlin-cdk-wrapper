@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnAuthPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * Object policy;
 * CfnAuthPolicyProps cfnAuthPolicyProps = CfnAuthPolicyProps.builder()
 * .policy(policy)
 * .resourceIdentifier("resourceIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html)
 */
public interface CfnAuthPolicyProps {
  /**
   * The auth policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html#cfn-vpclattice-authpolicy-policy)
   */
  public fun policy(): Any

  /**
   * The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is
   * created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html#cfn-vpclattice-authpolicy-resourceidentifier)
   */
  public fun resourceIdentifier(): String

  /**
   * A builder for [CfnAuthPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policy The auth policy. 
     */
    public fun policy(policy: Any)

    /**
     * @param resourceIdentifier The ID or Amazon Resource Name (ARN) of the service network or
     * service for which the policy is created. 
     */
    public fun resourceIdentifier(resourceIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps.builder()

    /**
     * @param policy The auth policy. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    /**
     * @param resourceIdentifier The ID or Amazon Resource Name (ARN) of the service network or
     * service for which the policy is created. 
     */
    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps,
  ) : CdkObject(cdkObject),
      CfnAuthPolicyProps {
    /**
     * The auth policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html#cfn-vpclattice-authpolicy-policy)
     */
    override fun policy(): Any = unwrap(this).getPolicy()

    /**
     * The ID or Amazon Resource Name (ARN) of the service network or service for which the policy
     * is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-authpolicy.html#cfn-vpclattice-authpolicy-resourceidentifier)
     */
    override fun resourceIdentifier(): String = unwrap(this).getResourceIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAuthPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps):
        CfnAuthPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAuthPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAuthPolicyProps):
        software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnAuthPolicyProps
  }
}
