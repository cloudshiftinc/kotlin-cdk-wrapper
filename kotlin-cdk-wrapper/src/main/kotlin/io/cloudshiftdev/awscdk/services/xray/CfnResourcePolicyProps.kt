@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.xray

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
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
 * import io.cloudshiftdev.awscdk.services.xray.*;
 * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
 * .policyDocument("policyDocument")
 * .policyName("policyName")
 * // the properties below are optional
 * .bypassPolicyLockoutCheck(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html)
 */
public interface CfnResourcePolicyProps {
  /**
   * A flag to indicate whether to bypass the resource-based policy lockout safety check.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-bypasspolicylockoutcheck)
   */
  public fun bypassPolicyLockoutCheck(): Any? = unwrap(this).getBypassPolicyLockoutCheck()

  /**
   * The resource-based policy document, which can be up to 5kb in size.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-policydocument)
   */
  public fun policyDocument(): String

  /**
   * The name of the resource-based policy.
   *
   * Must be unique within a specific AWS account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-policyname)
   */
  public fun policyName(): String

  /**
   * A builder for [CfnResourcePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bypassPolicyLockoutCheck A flag to indicate whether to bypass the resource-based
     * policy lockout safety check.
     */
    public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: Boolean)

    /**
     * @param bypassPolicyLockoutCheck A flag to indicate whether to bypass the resource-based
     * policy lockout safety check.
     */
    public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: IResolvable)

    /**
     * @param policyDocument The resource-based policy document, which can be up to 5kb in size. 
     */
    public fun policyDocument(policyDocument: String)

    /**
     * @param policyName The name of the resource-based policy. 
     * Must be unique within a specific AWS account.
     */
    public fun policyName(policyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.xray.CfnResourcePolicyProps.Builder =
        software.amazon.awscdk.services.xray.CfnResourcePolicyProps.builder()

    /**
     * @param bypassPolicyLockoutCheck A flag to indicate whether to bypass the resource-based
     * policy lockout safety check.
     */
    override fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: Boolean) {
      cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck)
    }

    /**
     * @param bypassPolicyLockoutCheck A flag to indicate whether to bypass the resource-based
     * policy lockout safety check.
     */
    override fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: IResolvable) {
      cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck.let(IResolvable::unwrap))
    }

    /**
     * @param policyDocument The resource-based policy document, which can be up to 5kb in size. 
     */
    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param policyName The name of the resource-based policy. 
     * Must be unique within a specific AWS account.
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    public fun build(): software.amazon.awscdk.services.xray.CfnResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.xray.CfnResourcePolicyProps,
  ) : CdkObject(cdkObject), CfnResourcePolicyProps {
    /**
     * A flag to indicate whether to bypass the resource-based policy lockout safety check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-bypasspolicylockoutcheck)
     */
    override fun bypassPolicyLockoutCheck(): Any? = unwrap(this).getBypassPolicyLockoutCheck()

    /**
     * The resource-based policy document, which can be up to 5kb in size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-policydocument)
     */
    override fun policyDocument(): String = unwrap(this).getPolicyDocument()

    /**
     * The name of the resource-based policy.
     *
     * Must be unique within a specific AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-policyname)
     */
    override fun policyName(): String = unwrap(this).getPolicyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnResourcePolicyProps):
        CfnResourcePolicyProps = CdkObjectWrappers.wrap(cdkObject) as CfnResourcePolicyProps

    internal fun unwrap(wrapped: CfnResourcePolicyProps):
        software.amazon.awscdk.services.xray.CfnResourcePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.xray.CfnResourcePolicyProps
  }
}
