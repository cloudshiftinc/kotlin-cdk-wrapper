@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a launch constraint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * CfnLaunchRoleConstraint cfnLaunchRoleConstraint = CfnLaunchRoleConstraint.Builder.create(this,
 * "MyCfnLaunchRoleConstraint")
 * .portfolioId("portfolioId")
 * .productId("productId")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .description("description")
 * .localRoleName("localRoleName")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html)
 */
public open class CfnLaunchRoleConstraint(
  cdkObject: software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLaunchRoleConstraintProps,
  ) :
      this(software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnLaunchRoleConstraintProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLaunchRoleConstraintProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLaunchRoleConstraintProps(props)
  )

  /**
   * The language code.
   */
  public open fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * The language code.
   */
  public open fun acceptLanguage(`value`: String) {
    unwrap(this).setAcceptLanguage(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The description of the constraint.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the constraint.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * You are required to specify either the `RoleArn` or the `LocalRoleName` but can't use both.
   */
  public open fun localRoleName(): String? = unwrap(this).getLocalRoleName()

  /**
   * You are required to specify either the `RoleArn` or the `LocalRoleName` but can't use both.
   */
  public open fun localRoleName(`value`: String) {
    unwrap(this).setLocalRoleName(`value`)
  }

  /**
   * The portfolio identifier.
   */
  public open fun portfolioId(): String = unwrap(this).getPortfolioId()

  /**
   * The portfolio identifier.
   */
  public open fun portfolioId(`value`: String) {
    unwrap(this).setPortfolioId(`value`)
  }

  /**
   * The product identifier.
   */
  public open fun productId(): String = unwrap(this).getProductId()

  /**
   * The product identifier.
   */
  public open fun productId(`value`: String) {
    unwrap(this).setProductId(`value`)
  }

  /**
   * The ARN of the launch role.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The ARN of the launch role.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.servicecatalog.CfnLaunchRoleConstraint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-acceptlanguage)
     * @param acceptLanguage The language code. 
     */
    public fun acceptLanguage(acceptLanguage: String)

    /**
     * The description of the constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-description)
     * @param description The description of the constraint. 
     */
    public fun description(description: String)

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
     * @param localRoleName You are required to specify either the `RoleArn` or the `LocalRoleName`
     * but can't use both. 
     */
    public fun localRoleName(localRoleName: String)

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-portfolioid)
     * @param portfolioId The portfolio identifier. 
     */
    public fun portfolioId(portfolioId: String)

    /**
     * The product identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-productid)
     * @param productId The product identifier. 
     */
    public fun productId(productId: String)

    /**
     * The ARN of the launch role.
     *
     * You are required to specify `RoleArn` or `LocalRoleName` but can't use both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-rolearn)
     * @param roleArn The ARN of the launch role. 
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint.Builder.create(scope,
        id)

    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-acceptlanguage)
     * @param acceptLanguage The language code. 
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * The description of the constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-description)
     * @param description The description of the constraint. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

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
     * @param localRoleName You are required to specify either the `RoleArn` or the `LocalRoleName`
     * but can't use both. 
     */
    override fun localRoleName(localRoleName: String) {
      cdkBuilder.localRoleName(localRoleName)
    }

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-portfolioid)
     * @param portfolioId The portfolio identifier. 
     */
    override fun portfolioId(portfolioId: String) {
      cdkBuilder.portfolioId(portfolioId)
    }

    /**
     * The product identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-productid)
     * @param productId The product identifier. 
     */
    override fun productId(productId: String) {
      cdkBuilder.productId(productId)
    }

    /**
     * The ARN of the launch role.
     *
     * You are required to specify `RoleArn` or `LocalRoleName` but can't use both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchroleconstraint.html#cfn-servicecatalog-launchroleconstraint-rolearn)
     * @param roleArn The ARN of the launch role. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLaunchRoleConstraint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLaunchRoleConstraint(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint):
        CfnLaunchRoleConstraint = CfnLaunchRoleConstraint(cdkObject)

    internal fun unwrap(wrapped: CfnLaunchRoleConstraint):
        software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint = wrapped.cdkObject
        as software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint
  }
}
