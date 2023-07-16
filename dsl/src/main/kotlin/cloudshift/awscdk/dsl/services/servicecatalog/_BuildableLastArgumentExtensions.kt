@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.dsl.ArnComponentsDsl
import cloudshift.awscdk.dsl.ExportValueOptionsDsl
import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.cloudassembly.schema.MissingContextDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct
import software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint
import software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint
import software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraint
import software.amazon.awscdk.services.servicecatalog.CfnPortfolio
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare
import software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint
import software.amazon.awscdk.services.servicecatalog.CfnServiceAction
import software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation
import software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint
import software.amazon.awscdk.services.servicecatalog.CfnTagOption
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation
import software.amazon.awscdk.services.servicecatalog.IProduct
import software.amazon.awscdk.services.servicecatalog.Portfolio
import software.amazon.awscdk.services.servicecatalog.ProductStack
import software.amazon.awscdk.services.sns.ITopic

public inline fun CfnAcceptedPortfolioShare.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnCloudFormationProduct.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnCloudFormationProduct.setSourceConnection(block: CfnCloudFormationProductSourceConnectionPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCloudFormationProductSourceConnectionPropertyDsl()
  builder.apply(block)
  return setSourceConnection(builder.build())
}

public inline fun CfnCloudFormationProvisionedProduct.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnCloudFormationProvisionedProduct.setProvisioningPreferences(block: CfnCloudFormationProvisionedProductProvisioningPreferencesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnCloudFormationProvisionedProductProvisioningPreferencesPropertyDsl()
  builder.apply(block)
  return setProvisioningPreferences(builder.build())
}

public inline fun CfnLaunchNotificationConstraint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnLaunchRoleConstraint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnLaunchTemplateConstraint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPortfolio.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPortfolioPrincipalAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPortfolioProductAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnPortfolioShare.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnResourceUpdateConstraint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnServiceAction.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnServiceActionAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnStackSetConstraint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTagOption.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnTagOptionAssociation.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun Portfolio.constrainCloudFormationParameters(arg0: IProduct,
    block: CloudFormationRuleConstraintOptionsDsl.() -> Unit = {}) {
  val builder = CloudFormationRuleConstraintOptionsDsl()
  builder.apply(block)
  return constrainCloudFormationParameters(arg0,builder.build())
}

public inline fun Portfolio.constrainTagUpdates(arg0: IProduct,
    block: TagUpdateConstraintOptionsDsl.() -> Unit = {}) {
  val builder = TagUpdateConstraintOptionsDsl()
  builder.apply(block)
  return constrainTagUpdates(arg0,builder.build())
}

public inline fun Portfolio.deployWithStackSets(arg0: IProduct,
    block: StackSetsConstraintOptionsDsl.() -> Unit = {}) {
  val builder = StackSetsConstraintOptionsDsl()
  builder.apply(block)
  return deployWithStackSets(arg0,builder.build())
}

public inline fun Portfolio.notifyOnStackEvents(
  arg0: IProduct,
  arg1: ITopic,
  block: CommonConstraintOptionsDsl.() -> Unit = {},
) {
  val builder = CommonConstraintOptionsDsl()
  builder.apply(block)
  return notifyOnStackEvents(arg0,arg1,builder.build())
}

public inline fun Portfolio.setLaunchRole(
  arg0: IProduct,
  arg1: IRole,
  block: CommonConstraintOptionsDsl.() -> Unit = {},
) {
  val builder = CommonConstraintOptionsDsl()
  builder.apply(block)
  return setLaunchRole(arg0,arg1,builder.build())
}

public inline fun Portfolio.setLocalLaunchRole(
  arg0: IProduct,
  arg1: IRole,
  block: CommonConstraintOptionsDsl.() -> Unit = {},
) {
  val builder = CommonConstraintOptionsDsl()
  builder.apply(block)
  return setLocalLaunchRole(arg0,arg1,builder.build())
}

public inline fun Portfolio.setLocalLaunchRoleName(
  arg0: IProduct,
  arg1: String,
  block: CommonConstraintOptionsDsl.() -> Unit = {},
): IRole {
  val builder = CommonConstraintOptionsDsl()
  builder.apply(block)
  return setLocalLaunchRoleName(arg0,arg1,builder.build())
}

public inline fun Portfolio.shareWithAccount(arg0: String,
    block: PortfolioShareOptionsDsl.() -> Unit = {}) {
  val builder = PortfolioShareOptionsDsl()
  builder.apply(block)
  return shareWithAccount(arg0,builder.build())
}

public inline fun ProductStack.exportStringListValue(arg0: Any,
    block: ExportValueOptionsDsl.() -> Unit = {}): List<String> {
  val builder = ExportValueOptionsDsl()
  builder.apply(block)
  return exportStringListValue(arg0,builder.build())
}

public inline fun ProductStack.exportValue(arg0: Any, block: ExportValueOptionsDsl.() -> Unit = {}):
    String {
  val builder = ExportValueOptionsDsl()
  builder.apply(block)
  return exportValue(arg0,builder.build())
}

public inline fun ProductStack.formatArn(block: ArnComponentsDsl.() -> Unit = {}): String {
  val builder = ArnComponentsDsl()
  builder.apply(block)
  return formatArn(builder.build())
}

public inline fun ProductStack.reportMissingContextKey(block: MissingContextDsl.() -> Unit = {}) {
  val builder = MissingContextDsl()
  builder.apply(block)
  return reportMissingContextKey(builder.build())
}
