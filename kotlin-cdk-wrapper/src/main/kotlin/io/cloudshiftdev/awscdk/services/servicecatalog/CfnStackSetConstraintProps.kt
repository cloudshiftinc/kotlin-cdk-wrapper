@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnStackSetConstraint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalog.*;
 * CfnStackSetConstraintProps cfnStackSetConstraintProps = CfnStackSetConstraintProps.builder()
 * .accountList(List.of("accountList"))
 * .adminRole("adminRole")
 * .description("description")
 * .executionRole("executionRole")
 * .portfolioId("portfolioId")
 * .productId("productId")
 * .regionList(List.of("regionList"))
 * .stackInstanceControl("stackInstanceControl")
 * // the properties below are optional
 * .acceptLanguage("acceptLanguage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html)
 */
public interface CfnStackSetConstraintProps {
  /**
   * The language code.
   *
   * * `jp` - Japanese
   * * `zh` - Chinese
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-acceptlanguage)
   */
  public fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

  /**
   * One or more AWS accounts that will have access to the provisioned product.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-accountlist)
   */
  public fun accountList(): List<String>

  /**
   * AdminRole ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-adminrole)
   */
  public fun adminRole(): String

  /**
   * The description of the constraint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-description)
   */
  public fun description(): String

  /**
   * ExecutionRole name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-executionrole)
   */
  public fun executionRole(): String

  /**
   * The portfolio identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-portfolioid)
   */
  public fun portfolioId(): String

  /**
   * The product identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-productid)
   */
  public fun productId(): String

  /**
   * One or more AWS Regions where the provisioned product will be available.
   *
   * Applicable only to a `CFN_STACKSET` provisioned product type.
   *
   * The specified Regions should be within the list of Regions from the `STACKSET` constraint. To
   * get the list of Regions in the `STACKSET` constraint, use the `DescribeProvisioningParameters`
   * operation.
   *
   * If no values are specified, the default value is all Regions from the `STACKSET` constraint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-regionlist)
   */
  public fun regionList(): List<String>

  /**
   * Permission to create, update, and delete stack instances.
   *
   * Choose from ALLOWED and NOT_ALLOWED.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-stackinstancecontrol)
   */
  public fun stackInstanceControl(): String

  /**
   * A builder for [CfnStackSetConstraintProps]
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
     * @param accountList One or more AWS accounts that will have access to the provisioned product.
     * 
     */
    public fun accountList(accountList: List<String>)

    /**
     * @param accountList One or more AWS accounts that will have access to the provisioned product.
     * 
     */
    public fun accountList(vararg accountList: String)

    /**
     * @param adminRole AdminRole ARN. 
     */
    public fun adminRole(adminRole: String)

    /**
     * @param description The description of the constraint. 
     */
    public fun description(description: String)

    /**
     * @param executionRole ExecutionRole name. 
     */
    public fun executionRole(executionRole: String)

    /**
     * @param portfolioId The portfolio identifier. 
     */
    public fun portfolioId(portfolioId: String)

    /**
     * @param productId The product identifier. 
     */
    public fun productId(productId: String)

    /**
     * @param regionList One or more AWS Regions where the provisioned product will be available. 
     * Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * The specified Regions should be within the list of Regions from the `STACKSET` constraint. To
     * get the list of Regions in the `STACKSET` constraint, use the `DescribeProvisioningParameters`
     * operation.
     *
     * If no values are specified, the default value is all Regions from the `STACKSET` constraint.
     */
    public fun regionList(regionList: List<String>)

    /**
     * @param regionList One or more AWS Regions where the provisioned product will be available. 
     * Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * The specified Regions should be within the list of Regions from the `STACKSET` constraint. To
     * get the list of Regions in the `STACKSET` constraint, use the `DescribeProvisioningParameters`
     * operation.
     *
     * If no values are specified, the default value is all Regions from the `STACKSET` constraint.
     */
    public fun regionList(vararg regionList: String)

    /**
     * @param stackInstanceControl Permission to create, update, and delete stack instances. 
     * Choose from ALLOWED and NOT_ALLOWED.
     */
    public fun stackInstanceControl(stackInstanceControl: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps.Builder =
        software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps.builder()

    /**
     * @param acceptLanguage The language code.
     * * `jp` - Japanese
     * * `zh` - Chinese
     */
    override fun acceptLanguage(acceptLanguage: String) {
      cdkBuilder.acceptLanguage(acceptLanguage)
    }

    /**
     * @param accountList One or more AWS accounts that will have access to the provisioned product.
     * 
     */
    override fun accountList(accountList: List<String>) {
      cdkBuilder.accountList(accountList)
    }

    /**
     * @param accountList One or more AWS accounts that will have access to the provisioned product.
     * 
     */
    override fun accountList(vararg accountList: String): Unit = accountList(accountList.toList())

    /**
     * @param adminRole AdminRole ARN. 
     */
    override fun adminRole(adminRole: String) {
      cdkBuilder.adminRole(adminRole)
    }

    /**
     * @param description The description of the constraint. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param executionRole ExecutionRole name. 
     */
    override fun executionRole(executionRole: String) {
      cdkBuilder.executionRole(executionRole)
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
     * @param regionList One or more AWS Regions where the provisioned product will be available. 
     * Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * The specified Regions should be within the list of Regions from the `STACKSET` constraint. To
     * get the list of Regions in the `STACKSET` constraint, use the `DescribeProvisioningParameters`
     * operation.
     *
     * If no values are specified, the default value is all Regions from the `STACKSET` constraint.
     */
    override fun regionList(regionList: List<String>) {
      cdkBuilder.regionList(regionList)
    }

    /**
     * @param regionList One or more AWS Regions where the provisioned product will be available. 
     * Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * The specified Regions should be within the list of Regions from the `STACKSET` constraint. To
     * get the list of Regions in the `STACKSET` constraint, use the `DescribeProvisioningParameters`
     * operation.
     *
     * If no values are specified, the default value is all Regions from the `STACKSET` constraint.
     */
    override fun regionList(vararg regionList: String): Unit = regionList(regionList.toList())

    /**
     * @param stackInstanceControl Permission to create, update, and delete stack instances. 
     * Choose from ALLOWED and NOT_ALLOWED.
     */
    override fun stackInstanceControl(stackInstanceControl: String) {
      cdkBuilder.stackInstanceControl(stackInstanceControl)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps,
  ) : CdkObject(cdkObject),
      CfnStackSetConstraintProps {
    /**
     * The language code.
     *
     * * `jp` - Japanese
     * * `zh` - Chinese
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-acceptlanguage)
     */
    override fun acceptLanguage(): String? = unwrap(this).getAcceptLanguage()

    /**
     * One or more AWS accounts that will have access to the provisioned product.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-accountlist)
     */
    override fun accountList(): List<String> = unwrap(this).getAccountList()

    /**
     * AdminRole ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-adminrole)
     */
    override fun adminRole(): String = unwrap(this).getAdminRole()

    /**
     * The description of the constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * ExecutionRole name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-executionrole)
     */
    override fun executionRole(): String = unwrap(this).getExecutionRole()

    /**
     * The portfolio identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-portfolioid)
     */
    override fun portfolioId(): String = unwrap(this).getPortfolioId()

    /**
     * The product identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-productid)
     */
    override fun productId(): String = unwrap(this).getProductId()

    /**
     * One or more AWS Regions where the provisioned product will be available.
     *
     * Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * The specified Regions should be within the list of Regions from the `STACKSET` constraint. To
     * get the list of Regions in the `STACKSET` constraint, use the `DescribeProvisioningParameters`
     * operation.
     *
     * If no values are specified, the default value is all Regions from the `STACKSET` constraint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-regionlist)
     */
    override fun regionList(): List<String> = unwrap(this).getRegionList()

    /**
     * Permission to create, update, and delete stack instances.
     *
     * Choose from ALLOWED and NOT_ALLOWED.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-stacksetconstraint.html#cfn-servicecatalog-stacksetconstraint-stackinstancecontrol)
     */
    override fun stackInstanceControl(): String = unwrap(this).getStackInstanceControl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStackSetConstraintProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps):
        CfnStackSetConstraintProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnStackSetConstraintProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStackSetConstraintProps):
        software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps
  }
}
