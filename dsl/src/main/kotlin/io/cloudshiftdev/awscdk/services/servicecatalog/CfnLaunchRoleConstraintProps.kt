package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnLaunchRoleConstraintProps {
  /**
   * The language code.
   *
   * * `jp` - Japanese
   * * `zh` - Chinese
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-acceptlanguage)
   */
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * The description of the constraint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * You are required to specify either the `RoleArn` or the `LocalRoleName` but can't use both.
   *
   * If you specify the `LocalRoleName` property, when an account uses the launch constraint, the
   * IAM role with that name in the account will be used. This allows launch-role constraints to be
   * account-agnostic so the administrator can create fewer resources per shared account.
   *
   * The given role name must exist in the account used to create the launch constraint and the
   * account of the user who launches a product with this launch constraint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-localrolename)
   */
  public fun localRoleName(): String? = unwrap(this).getLocalRoleName()

  /**
   * The portfolio identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-portfolioid)
   */
  public fun portfolioId(): String

  /**
   * The product identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-productid)
   */
  public fun productId(): String

  /**
   * The ARN of the launch role.
   *
   * You are required to specify `RoleArn` or `LocalRoleName` but can't use both.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * A builder for [CfnLaunchRoleConstraintProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    public fun acceptLanguage(acceptLanguage: String)

    /**
     * @param description The description of the constraint.
     */
    public fun description(description: String)

    /**
     * @param localRoleName You are required to specify either the `RoleArn` or the `LocalRoleName`
     * but can't use both.
     * If you specify the `LocalRoleName` property, when an account uses the launch constraint, the
     * IAM role with that name in the account will be used. This allows launch-role constraints to be
     * account-agnostic so the administrator can create fewer resources per shared account.
     *
     * The given role name must exist in the account used to create the launch constraint and the
     * account of the user who launches a product with this launch constraint.
     */
    public fun localRoleName(localRoleName: String)

    /**
     * @param portfolioId The portfolio identifier. 
     */
    public fun portfolioId(portfolioId: String)

    /**
     * @param productId The product identifier. 
     */
    public fun productId(productId: String)

    /**
     * @param roleArn The ARN of the launch role.
     * You are required to specify `RoleArn` or `LocalRoleName` but can't use both.
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps.builder()

    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * @param description The description of the constraint.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param localRoleName You are required to specify either the `RoleArn` or the `LocalRoleName`
     * but can't use both.
     * If you specify the `LocalRoleName` property, when an account uses the launch constraint, the
     * IAM role with that name in the account will be used. This allows launch-role constraints to be
     * account-agnostic so the administrator can create fewer resources per shared account.
     *
     * The given role name must exist in the account used to create the launch constraint and the
     * account of the user who launches a product with this launch constraint.
     */
    override fun localRoleName(localRoleName: String) {
      cdkBuilder.localRoleName(localRoleName)
    }

    /**
     * @param portfolioId The portfolio identifier. 
     */
    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    /**
     * @param productId The product identifier. 
     */
    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    /**
     * @param roleArn The ARN of the launch role.
     * You are required to specify `RoleArn` or `LocalRoleName` but can't use both.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps,
  ) : CdkObject(cdkObject), CfnLaunchRoleConstraintProps {
    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-acceptlanguage)
     */
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    /**
     * The description of the constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * You are required to specify either the `RoleArn` or the `LocalRoleName` but can't use both.
     *
     * If you specify the `LocalRoleName` property, when an account uses the launch constraint, the
     * IAM role with that name in the account will be used. This allows launch-role constraints to be
     * account-agnostic so the administrator can create fewer resources per shared account.
     *
     * The given role name must exist in the account used to create the launch constraint and the
     * account of the user who launches a product with this launch constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-localrolename)
     */
    override fun localRoleName(): String? = unwrap(this).getLocalRoleName()

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-portfolioid)
     */
    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    /**
     * The product identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-productid)
     */
    override fun productId(): String = unwrap(this).getProductId()

    /**
     * The ARN of the launch role.
     *
     * You are required to specify `RoleArn` or `LocalRoleName` but can't use both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLaunchRoleConstraintProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps):
        CfnLaunchRoleConstraintProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchRoleConstraintProps):
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps
  }
}
