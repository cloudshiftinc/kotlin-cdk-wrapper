@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct
import software.amazon.awscdk.services.servicecatalog.IPortfolio
import software.amazon.awscdk.services.servicecatalog.IProduct
import software.amazon.awscdk.services.servicecatalog.Portfolio
import software.amazon.awscdk.services.sns.ITopic

/**
 * StackSet preferences that are required for provisioning the product or updating a provisioned
 * product.
 */
public inline
    fun CfnCloudFormationProvisionedProduct.setProvisioningPreferences(block: CfnCloudFormationProvisionedProductProvisioningPreferencesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCloudFormationProvisionedProductProvisioningPreferencesPropertyDsl()
  builder.apply(block)
  return setProvisioningPreferences(builder.build())
}

/**
 * Set provisioning rules for the product.
 *
 * @param product 
 * @param options 
 */
public inline fun Portfolio.constrainCloudFormationParameters(product: IProduct,
    block: CloudFormationRuleConstraintOptionsDsl.() -> Unit = {}) {
  val builder = CloudFormationRuleConstraintOptionsDsl()
  builder.apply(block)
  return constrainCloudFormationParameters(product, builder.build())
}

/**
 * Add a Resource Update Constraint.
 *
 * @param product 
 * @param options
 */
public inline fun Portfolio.constrainTagUpdates(product: IProduct,
    block: TagUpdateConstraintOptionsDsl.() -> Unit = {}) {
  val builder = TagUpdateConstraintOptionsDsl()
  builder.apply(block)
  return constrainTagUpdates(product, builder.build())
}

/**
 * Configure deployment options using AWS Cloudformation StackSets.
 *
 * @param product 
 * @param options 
 */
public inline fun Portfolio.deployWithStackSets(product: IProduct,
    block: StackSetsConstraintOptionsDsl.() -> Unit = {}) {
  val builder = StackSetsConstraintOptionsDsl()
  builder.apply(block)
  return deployWithStackSets(product, builder.build())
}

/**
 * Add notifications for supplied topics on the provisioned product.
 *
 * @param product 
 * @param topic 
 * @param options
 */
public inline fun Portfolio.notifyOnStackEvents(
  product: IProduct,
  topic: ITopic,
  block: CommonConstraintOptionsDsl.() -> Unit = {},
) {
  val builder = CommonConstraintOptionsDsl()
  builder.apply(block)
  return notifyOnStackEvents(product, topic, builder.build())
}

/**
 * Force users to assume a certain role when launching a product.
 *
 * This sets the launch role using the role arn which is tied to the account this role exists in.
 * This is useful if you will be provisioning products from the account where this role exists.
 * If you intend to share the portfolio across accounts, use a local launch role.
 *
 * @param product 
 * @param launchRole 
 * @param options
 */
public inline fun Portfolio.setLaunchRole(
  product: IProduct,
  launchRole: IRole,
  block: CommonConstraintOptionsDsl.() -> Unit = {},
) {
  val builder = CommonConstraintOptionsDsl()
  builder.apply(block)
  return setLaunchRole(product, launchRole, builder.build())
}

/**
 * Force users to assume a certain role when launching a product.
 *
 * The role name will be referenced by in the local account and must be set explicitly.
 * This is useful when sharing the portfolio with multiple accounts.
 *
 * @param product 
 * @param launchRole 
 * @param options
 */
public inline fun Portfolio.setLocalLaunchRole(
  product: IProduct,
  launchRole: IRole,
  block: CommonConstraintOptionsDsl.() -> Unit = {},
) {
  val builder = CommonConstraintOptionsDsl()
  builder.apply(block)
  return setLocalLaunchRole(product, launchRole, builder.build())
}

/**
 * Force users to assume a certain role when launching a product.
 *
 * The role will be referenced by name in the local account instead of a static role arn.
 * A role with this name will automatically be created and assumable by Service Catalog in this
 * account.
 * This is useful when sharing the portfolio with multiple accounts.
 *
 * @param product 
 * @param launchRoleName 
 * @param options
 */
public inline fun Portfolio.setLocalLaunchRoleName(
  product: IProduct,
  launchRoleName: String,
  block: CommonConstraintOptionsDsl.() -> Unit = {},
): IRole {
  val builder = CommonConstraintOptionsDsl()
  builder.apply(block)
  return setLocalLaunchRoleName(product, launchRoleName, builder.build())
}

/**
 * Initiate a portfolio share with another account.
 *
 * @param accountId 
 * @param options
 */
public inline fun Portfolio.shareWithAccount(accountId: String,
    block: PortfolioShareOptionsDsl.() -> Unit = {}) {
  val builder = PortfolioShareOptionsDsl()
  builder.apply(block)
  return shareWithAccount(accountId, builder.build())
}

/**
 * A top level `ProductViewDetail` response containing details about the product’s connection.
 */
public inline
    fun CfnCloudFormationProduct.setSourceConnection(block: CfnCloudFormationProductSourceConnectionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCloudFormationProductSourceConnectionPropertyDsl()
  builder.apply(block)
  return setSourceConnection(builder.build())
}

public inline fun IPortfolio.constrainCloudFormationParameters(arg0: IProduct,
    block: CloudFormationRuleConstraintOptionsDsl.() -> Unit = {}) {
  val builder = CloudFormationRuleConstraintOptionsDsl()
  builder.apply(block)
  return constrainCloudFormationParameters(arg0, builder.build())
}

public inline fun IPortfolio.constrainTagUpdates(arg0: IProduct,
    block: TagUpdateConstraintOptionsDsl.() -> Unit = {}) {
  val builder = TagUpdateConstraintOptionsDsl()
  builder.apply(block)
  return constrainTagUpdates(arg0, builder.build())
}

public inline fun IPortfolio.deployWithStackSets(arg0: IProduct,
    block: StackSetsConstraintOptionsDsl.() -> Unit = {}) {
  val builder = StackSetsConstraintOptionsDsl()
  builder.apply(block)
  return deployWithStackSets(arg0, builder.build())
}

public inline fun IPortfolio.notifyOnStackEvents(
  arg0: IProduct,
  arg1: ITopic,
  block: CommonConstraintOptionsDsl.() -> Unit = {},
) {
  val builder = CommonConstraintOptionsDsl()
  builder.apply(block)
  return notifyOnStackEvents(arg0, arg1, builder.build())
}

public inline fun IPortfolio.setLaunchRole(
  arg0: IProduct,
  arg1: IRole,
  block: CommonConstraintOptionsDsl.() -> Unit = {},
) {
  val builder = CommonConstraintOptionsDsl()
  builder.apply(block)
  return setLaunchRole(arg0, arg1, builder.build())
}

public inline fun IPortfolio.setLocalLaunchRole(
  arg0: IProduct,
  arg1: IRole,
  block: CommonConstraintOptionsDsl.() -> Unit = {},
) {
  val builder = CommonConstraintOptionsDsl()
  builder.apply(block)
  return setLocalLaunchRole(arg0, arg1, builder.build())
}

public inline fun IPortfolio.setLocalLaunchRoleName(
  arg0: IProduct,
  arg1: String,
  block: CommonConstraintOptionsDsl.() -> Unit = {},
): IRole {
  val builder = CommonConstraintOptionsDsl()
  builder.apply(block)
  return setLocalLaunchRoleName(arg0, arg1, builder.build())
}

public inline fun IPortfolio.shareWithAccount(arg0: String,
    block: PortfolioShareOptionsDsl.() -> Unit = {}) {
  val builder = PortfolioShareOptionsDsl()
  builder.apply(block)
  return shareWithAccount(arg0, builder.build())
}
