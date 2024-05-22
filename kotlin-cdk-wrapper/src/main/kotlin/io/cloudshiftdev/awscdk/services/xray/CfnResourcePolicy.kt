@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.xray

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Use `AWS::XRay::ResourcePolicy` to specify an X-Ray resource-based policy, which grants one or
 * more AWS services and accounts permissions to access X-Ray .
 *
 * Each resource-based policy is associated with a specific AWS account.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.xray.*;
 * CfnResourcePolicy cfnResourcePolicy = CfnResourcePolicy.Builder.create(this,
 * "MyCfnResourcePolicy")
 * .policyDocument("policyDocument")
 * .policyName("policyName")
 * // the properties below are optional
 * .bypassPolicyLockoutCheck(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html)
 */
public open class CfnResourcePolicy(
  cdkObject: software.amazon.awscdk.services.xray.CfnResourcePolicy,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourcePolicyProps,
  ) :
      this(software.amazon.awscdk.services.xray.CfnResourcePolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnResourcePolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourcePolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResourcePolicyProps(props)
  )

  /**
   * A flag to indicate whether to bypass the resource-based policy lockout safety check.
   */
  public open fun bypassPolicyLockoutCheck(): Any? = unwrap(this).getBypassPolicyLockoutCheck()

  /**
   * A flag to indicate whether to bypass the resource-based policy lockout safety check.
   */
  public open fun bypassPolicyLockoutCheck(`value`: Boolean) {
    unwrap(this).setBypassPolicyLockoutCheck(`value`)
  }

  /**
   * A flag to indicate whether to bypass the resource-based policy lockout safety check.
   */
  public open fun bypassPolicyLockoutCheck(`value`: IResolvable) {
    unwrap(this).setBypassPolicyLockoutCheck(`value`.let(IResolvable.Companion::unwrap))
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
   * The resource-based policy document, which can be up to 5kb in size.
   */
  public open fun policyDocument(): String = unwrap(this).getPolicyDocument()

  /**
   * The resource-based policy document, which can be up to 5kb in size.
   */
  public open fun policyDocument(`value`: String) {
    unwrap(this).setPolicyDocument(`value`)
  }

  /**
   * The name of the resource-based policy.
   */
  public open fun policyName(): String = unwrap(this).getPolicyName()

  /**
   * The name of the resource-based policy.
   */
  public open fun policyName(`value`: String) {
    unwrap(this).setPolicyName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.xray.CfnResourcePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A flag to indicate whether to bypass the resource-based policy lockout safety check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-bypasspolicylockoutcheck)
     * @param bypassPolicyLockoutCheck A flag to indicate whether to bypass the resource-based
     * policy lockout safety check. 
     */
    public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: Boolean)

    /**
     * A flag to indicate whether to bypass the resource-based policy lockout safety check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-bypasspolicylockoutcheck)
     * @param bypassPolicyLockoutCheck A flag to indicate whether to bypass the resource-based
     * policy lockout safety check. 
     */
    public fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: IResolvable)

    /**
     * The resource-based policy document, which can be up to 5kb in size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-policydocument)
     * @param policyDocument The resource-based policy document, which can be up to 5kb in size. 
     */
    public fun policyDocument(policyDocument: String)

    /**
     * The name of the resource-based policy.
     *
     * Must be unique within a specific AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-policyname)
     * @param policyName The name of the resource-based policy. 
     */
    public fun policyName(policyName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.xray.CfnResourcePolicy.Builder =
        software.amazon.awscdk.services.xray.CfnResourcePolicy.Builder.create(scope, id)

    /**
     * A flag to indicate whether to bypass the resource-based policy lockout safety check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-bypasspolicylockoutcheck)
     * @param bypassPolicyLockoutCheck A flag to indicate whether to bypass the resource-based
     * policy lockout safety check. 
     */
    override fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: Boolean) {
      cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck)
    }

    /**
     * A flag to indicate whether to bypass the resource-based policy lockout safety check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-bypasspolicylockoutcheck)
     * @param bypassPolicyLockoutCheck A flag to indicate whether to bypass the resource-based
     * policy lockout safety check. 
     */
    override fun bypassPolicyLockoutCheck(bypassPolicyLockoutCheck: IResolvable) {
      cdkBuilder.bypassPolicyLockoutCheck(bypassPolicyLockoutCheck.let(IResolvable.Companion::unwrap))
    }

    /**
     * The resource-based policy document, which can be up to 5kb in size.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-policydocument)
     * @param policyDocument The resource-based policy document, which can be up to 5kb in size. 
     */
    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The name of the resource-based policy.
     *
     * Must be unique within a specific AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-xray-resourcepolicy.html#cfn-xray-resourcepolicy-policyname)
     * @param policyName The name of the resource-based policy. 
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    public fun build(): software.amazon.awscdk.services.xray.CfnResourcePolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.xray.CfnResourcePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourcePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourcePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnResourcePolicy):
        CfnResourcePolicy = CfnResourcePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicy):
        software.amazon.awscdk.services.xray.CfnResourcePolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.xray.CfnResourcePolicy
  }
}
