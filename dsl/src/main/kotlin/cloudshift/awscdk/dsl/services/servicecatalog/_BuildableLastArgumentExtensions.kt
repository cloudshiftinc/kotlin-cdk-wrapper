@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.servicecatalog

import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct
import software.amazon.awscdk.services.servicecatalog.IPortfolio
import software.amazon.awscdk.services.servicecatalog.IProduct
import software.amazon.awscdk.services.servicecatalog.Portfolio
import software.amazon.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit

public inline fun CfnCloudFormationProvisionedProduct.setProvisioningPreferences(
    block: CfnCloudFormationProvisionedProductProvisioningPreferencesPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnCloudFormationProvisionedProductProvisioningPreferencesPropertyDsl()
    builder.apply(block)
    return setProvisioningPreferences(builder.build())
}

public inline fun Portfolio.constrainCloudFormationParameters(
    product: IProduct,
    block: CloudFormationRuleConstraintOptionsDsl.() -> Unit = {},
) {
    val builder = CloudFormationRuleConstraintOptionsDsl()
    builder.apply(block)
    return constrainCloudFormationParameters(product, builder.build())
}

public inline fun Portfolio.constrainTagUpdates(
    product: IProduct,
    block: TagUpdateConstraintOptionsDsl.() -> Unit = {},
) {
    val builder = TagUpdateConstraintOptionsDsl()
    builder.apply(block)
    return constrainTagUpdates(product, builder.build())
}

public inline fun Portfolio.deployWithStackSets(
    product: IProduct,
    block: StackSetsConstraintOptionsDsl.() -> Unit = {},
) {
    val builder = StackSetsConstraintOptionsDsl()
    builder.apply(block)
    return deployWithStackSets(product, builder.build())
}

public inline fun Portfolio.notifyOnStackEvents(
    product: IProduct,
    topic: ITopic,
    block: CommonConstraintOptionsDsl.() -> Unit = {},
) {
    val builder = CommonConstraintOptionsDsl()
    builder.apply(block)
    return notifyOnStackEvents(product, topic, builder.build())
}

public inline fun Portfolio.setLaunchRole(
    product: IProduct,
    launchRole: IRole,
    block: CommonConstraintOptionsDsl.() -> Unit = {},
) {
    val builder = CommonConstraintOptionsDsl()
    builder.apply(block)
    return setLaunchRole(product, launchRole, builder.build())
}

public inline fun Portfolio.setLocalLaunchRole(
    product: IProduct,
    launchRole: IRole,
    block: CommonConstraintOptionsDsl.() -> Unit = {},
) {
    val builder = CommonConstraintOptionsDsl()
    builder.apply(block)
    return setLocalLaunchRole(product, launchRole, builder.build())
}

public inline fun Portfolio.setLocalLaunchRoleName(
    product: IProduct,
    launchRoleName: String,
    block: CommonConstraintOptionsDsl.() -> Unit = {},
): IRole {
    val builder = CommonConstraintOptionsDsl()
    builder.apply(block)
    return setLocalLaunchRoleName(product, launchRoleName, builder.build())
}

public inline fun Portfolio.shareWithAccount(
    accountId: String,
    block: PortfolioShareOptionsDsl.() -> Unit = {},
) {
    val builder = PortfolioShareOptionsDsl()
    builder.apply(block)
    return shareWithAccount(accountId, builder.build())
}

public inline fun CfnCloudFormationProduct.setSourceConnection(
    block: CfnCloudFormationProductSourceConnectionPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnCloudFormationProductSourceConnectionPropertyDsl()
    builder.apply(block)
    return setSourceConnection(builder.build())
}

public inline fun IPortfolio.constrainCloudFormationParameters(
    arg0: IProduct,
    block: CloudFormationRuleConstraintOptionsDsl.() -> Unit = {},
) {
    val builder = CloudFormationRuleConstraintOptionsDsl()
    builder.apply(block)
    return constrainCloudFormationParameters(arg0, builder.build())
}

public inline fun IPortfolio.constrainTagUpdates(
    arg0: IProduct,
    block: TagUpdateConstraintOptionsDsl.() -> Unit = {},
) {
    val builder = TagUpdateConstraintOptionsDsl()
    builder.apply(block)
    return constrainTagUpdates(arg0, builder.build())
}

public inline fun IPortfolio.deployWithStackSets(
    arg0: IProduct,
    block: StackSetsConstraintOptionsDsl.() -> Unit = {},
) {
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

public inline fun IPortfolio.shareWithAccount(
    arg0: String,
    block: PortfolioShareOptionsDsl.() -> Unit = {},
) {
    val builder = PortfolioShareOptionsDsl()
    builder.apply(block)
    return shareWithAccount(arg0, builder.build())
}
