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

import software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShare
import software.amazon.awscdk.services.servicecatalog.CfnAcceptedPortfolioShareProps
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProductProps
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProduct
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProvisionedProductProps
import software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint
import software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraintProps
import software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraint
import software.amazon.awscdk.services.servicecatalog.CfnLaunchRoleConstraintProps
import software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraint
import software.amazon.awscdk.services.servicecatalog.CfnLaunchTemplateConstraintProps
import software.amazon.awscdk.services.servicecatalog.CfnPortfolio
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociation
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioPrincipalAssociationProps
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociation
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProductAssociationProps
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioProps
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioShare
import software.amazon.awscdk.services.servicecatalog.CfnPortfolioShareProps
import software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraint
import software.amazon.awscdk.services.servicecatalog.CfnResourceUpdateConstraintProps
import software.amazon.awscdk.services.servicecatalog.CfnServiceAction
import software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociation
import software.amazon.awscdk.services.servicecatalog.CfnServiceActionAssociationProps
import software.amazon.awscdk.services.servicecatalog.CfnServiceActionProps
import software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraint
import software.amazon.awscdk.services.servicecatalog.CfnStackSetConstraintProps
import software.amazon.awscdk.services.servicecatalog.CfnTagOption
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociation
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionAssociationProps
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps
import software.amazon.awscdk.services.servicecatalog.CloudFormationProduct
import software.amazon.awscdk.services.servicecatalog.CloudFormationProductProps
import software.amazon.awscdk.services.servicecatalog.CloudFormationProductVersion
import software.amazon.awscdk.services.servicecatalog.CloudFormationRuleConstraintOptions
import software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig
import software.amazon.awscdk.services.servicecatalog.CommonConstraintOptions
import software.amazon.awscdk.services.servicecatalog.Portfolio
import software.amazon.awscdk.services.servicecatalog.PortfolioProps
import software.amazon.awscdk.services.servicecatalog.PortfolioShareOptions
import software.amazon.awscdk.services.servicecatalog.ProductStack
import software.amazon.awscdk.services.servicecatalog.ProductStackHistory
import software.amazon.awscdk.services.servicecatalog.ProductStackHistoryProps
import software.amazon.awscdk.services.servicecatalog.ProductStackProps
import software.amazon.awscdk.services.servicecatalog.StackSetsConstraintOptions
import software.amazon.awscdk.services.servicecatalog.TagOptions
import software.amazon.awscdk.services.servicecatalog.TagOptionsProps
import software.amazon.awscdk.services.servicecatalog.TagUpdateConstraintOptions
import software.amazon.awscdk.services.servicecatalog.TemplateRule
import software.amazon.awscdk.services.servicecatalog.TemplateRuleAssertion
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object servicecatalog {
    public inline fun cfnAcceptedPortfolioShare(
        scope: Construct,
        id: String,
        block: CfnAcceptedPortfolioShareDsl.() -> Unit = {},
    ): CfnAcceptedPortfolioShare {
        val builder = CfnAcceptedPortfolioShareDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnAcceptedPortfolioShareProps(block: CfnAcceptedPortfolioSharePropsDsl.() -> Unit = {}): CfnAcceptedPortfolioShareProps {
        val builder = CfnAcceptedPortfolioSharePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCloudFormationProduct(
        scope: Construct,
        id: String,
        block: CfnCloudFormationProductDsl.() -> Unit = {},
    ): CfnCloudFormationProduct {
        val builder = CfnCloudFormationProductDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCloudFormationProductCodeStarParametersProperty(
        block: CfnCloudFormationProductCodeStarParametersPropertyDsl.() -> Unit =
            {},
    ): CfnCloudFormationProduct.CodeStarParametersProperty {
        val builder = CfnCloudFormationProductCodeStarParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCloudFormationProductConnectionParametersProperty(
        block: CfnCloudFormationProductConnectionParametersPropertyDsl.() -> Unit =
            {},
    ): CfnCloudFormationProduct.ConnectionParametersProperty {
        val builder = CfnCloudFormationProductConnectionParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCloudFormationProductProps(
        block: CfnCloudFormationProductPropsDsl.() -> Unit =
            {},
    ): CfnCloudFormationProductProps {
        val builder = CfnCloudFormationProductPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCloudFormationProductProvisioningArtifactPropertiesProperty(
        block: CfnCloudFormationProductProvisioningArtifactPropertiesPropertyDsl.() -> Unit =
            {},
    ): CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty {
        val builder = CfnCloudFormationProductProvisioningArtifactPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCloudFormationProductSourceConnectionProperty(
        block: CfnCloudFormationProductSourceConnectionPropertyDsl.() -> Unit =
            {},
    ): CfnCloudFormationProduct.SourceConnectionProperty {
        val builder = CfnCloudFormationProductSourceConnectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCloudFormationProvisionedProduct(
        scope: Construct,
        id: String,
        block: CfnCloudFormationProvisionedProductDsl.() -> Unit = {},
    ): CfnCloudFormationProvisionedProduct {
        val builder = CfnCloudFormationProvisionedProductDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCloudFormationProvisionedProductProps(
        block: CfnCloudFormationProvisionedProductPropsDsl.() -> Unit =
            {},
    ): CfnCloudFormationProvisionedProductProps {
        val builder = CfnCloudFormationProvisionedProductPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCloudFormationProvisionedProductProvisioningParameterProperty(
        block: CfnCloudFormationProvisionedProductProvisioningParameterPropertyDsl.() -> Unit =
            {},
    ): CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty {
        val builder = CfnCloudFormationProvisionedProductProvisioningParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnCloudFormationProvisionedProductProvisioningPreferencesProperty(
        block: CfnCloudFormationProvisionedProductProvisioningPreferencesPropertyDsl.() -> Unit =
            {},
    ): CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty {
        val builder = CfnCloudFormationProvisionedProductProvisioningPreferencesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchNotificationConstraint(
        scope: Construct,
        id: String,
        block: CfnLaunchNotificationConstraintDsl.() -> Unit = {},
    ): CfnLaunchNotificationConstraint {
        val builder = CfnLaunchNotificationConstraintDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchNotificationConstraintProps(
        block: CfnLaunchNotificationConstraintPropsDsl.() -> Unit =
            {},
    ): CfnLaunchNotificationConstraintProps {
        val builder = CfnLaunchNotificationConstraintPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchRoleConstraint(
        scope: Construct,
        id: String,
        block: CfnLaunchRoleConstraintDsl.() -> Unit = {},
    ): CfnLaunchRoleConstraint {
        val builder = CfnLaunchRoleConstraintDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchRoleConstraintProps(
        block: CfnLaunchRoleConstraintPropsDsl.() -> Unit =
            {},
    ): CfnLaunchRoleConstraintProps {
        val builder = CfnLaunchRoleConstraintPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchTemplateConstraint(
        scope: Construct,
        id: String,
        block: CfnLaunchTemplateConstraintDsl.() -> Unit = {},
    ): CfnLaunchTemplateConstraint {
        val builder = CfnLaunchTemplateConstraintDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnLaunchTemplateConstraintProps(
        block: CfnLaunchTemplateConstraintPropsDsl.() -> Unit =
            {},
    ): CfnLaunchTemplateConstraintProps {
        val builder = CfnLaunchTemplateConstraintPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPortfolio(
        scope: Construct,
        id: String,
        block: CfnPortfolioDsl.() -> Unit = {},
    ): CfnPortfolio {
        val builder = CfnPortfolioDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPortfolioPrincipalAssociation(
        scope: Construct,
        id: String,
        block: CfnPortfolioPrincipalAssociationDsl.() -> Unit = {},
    ): CfnPortfolioPrincipalAssociation {
        val builder = CfnPortfolioPrincipalAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPortfolioPrincipalAssociationProps(
        block: CfnPortfolioPrincipalAssociationPropsDsl.() -> Unit =
            {},
    ): CfnPortfolioPrincipalAssociationProps {
        val builder = CfnPortfolioPrincipalAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPortfolioProductAssociation(
        scope: Construct,
        id: String,
        block: CfnPortfolioProductAssociationDsl.() -> Unit = {},
    ): CfnPortfolioProductAssociation {
        val builder = CfnPortfolioProductAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPortfolioProductAssociationProps(
        block: CfnPortfolioProductAssociationPropsDsl.() -> Unit =
            {},
    ): CfnPortfolioProductAssociationProps {
        val builder = CfnPortfolioProductAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPortfolioProps(block: CfnPortfolioPropsDsl.() -> Unit = {}): CfnPortfolioProps {
        val builder = CfnPortfolioPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPortfolioShare(
        scope: Construct,
        id: String,
        block: CfnPortfolioShareDsl.() -> Unit = {},
    ): CfnPortfolioShare {
        val builder = CfnPortfolioShareDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPortfolioShareProps(block: CfnPortfolioSharePropsDsl.() -> Unit = {}): CfnPortfolioShareProps {
        val builder = CfnPortfolioSharePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResourceUpdateConstraint(
        scope: Construct,
        id: String,
        block: CfnResourceUpdateConstraintDsl.() -> Unit = {},
    ): CfnResourceUpdateConstraint {
        val builder = CfnResourceUpdateConstraintDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnResourceUpdateConstraintProps(
        block: CfnResourceUpdateConstraintPropsDsl.() -> Unit =
            {},
    ): CfnResourceUpdateConstraintProps {
        val builder = CfnResourceUpdateConstraintPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceAction(
        scope: Construct,
        id: String,
        block: CfnServiceActionDsl.() -> Unit = {},
    ): CfnServiceAction {
        val builder = CfnServiceActionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceActionAssociation(
        scope: Construct,
        id: String,
        block: CfnServiceActionAssociationDsl.() -> Unit = {},
    ): CfnServiceActionAssociation {
        val builder = CfnServiceActionAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceActionAssociationProps(
        block: CfnServiceActionAssociationPropsDsl.() -> Unit =
            {},
    ): CfnServiceActionAssociationProps {
        val builder = CfnServiceActionAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceActionDefinitionParameterProperty(
        block: CfnServiceActionDefinitionParameterPropertyDsl.() -> Unit =
            {},
    ): CfnServiceAction.DefinitionParameterProperty {
        val builder = CfnServiceActionDefinitionParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServiceActionProps(block: CfnServiceActionPropsDsl.() -> Unit = {}): CfnServiceActionProps {
        val builder = CfnServiceActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackSetConstraint(
        scope: Construct,
        id: String,
        block: CfnStackSetConstraintDsl.() -> Unit = {},
    ): CfnStackSetConstraint {
        val builder = CfnStackSetConstraintDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnStackSetConstraintProps(
        block: CfnStackSetConstraintPropsDsl.() -> Unit =
            {},
    ): CfnStackSetConstraintProps {
        val builder = CfnStackSetConstraintPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTagOption(
        scope: Construct,
        id: String,
        block: CfnTagOptionDsl.() -> Unit = {},
    ): CfnTagOption {
        val builder = CfnTagOptionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTagOptionAssociation(
        scope: Construct,
        id: String,
        block: CfnTagOptionAssociationDsl.() -> Unit = {},
    ): CfnTagOptionAssociation {
        val builder = CfnTagOptionAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTagOptionAssociationProps(
        block: CfnTagOptionAssociationPropsDsl.() -> Unit =
            {},
    ): CfnTagOptionAssociationProps {
        val builder = CfnTagOptionAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnTagOptionProps(block: CfnTagOptionPropsDsl.() -> Unit = {}): CfnTagOptionProps {
        val builder = CfnTagOptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationProduct(
        scope: Construct,
        id: String,
        block: CloudFormationProductDsl.() -> Unit = {},
    ): CloudFormationProduct {
        val builder = CloudFormationProductDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationProductProps(
        block: CloudFormationProductPropsDsl.() -> Unit =
            {},
    ): CloudFormationProductProps {
        val builder = CloudFormationProductPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationProductVersion(
        block: CloudFormationProductVersionDsl.() -> Unit =
            {},
    ): CloudFormationProductVersion {
        val builder = CloudFormationProductVersionDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationRuleConstraintOptions(
        block: CloudFormationRuleConstraintOptionsDsl.() -> Unit =
            {},
    ): CloudFormationRuleConstraintOptions {
        val builder = CloudFormationRuleConstraintOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cloudFormationTemplateConfig(
        block: CloudFormationTemplateConfigDsl.() -> Unit =
            {},
    ): CloudFormationTemplateConfig {
        val builder = CloudFormationTemplateConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun commonConstraintOptions(block: CommonConstraintOptionsDsl.() -> Unit = {}): CommonConstraintOptions {
        val builder = CommonConstraintOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun portfolio(
        scope: Construct,
        id: String,
        block: PortfolioDsl.() -> Unit = {},
    ): Portfolio {
        val builder = PortfolioDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun portfolioProps(block: PortfolioPropsDsl.() -> Unit = {}): PortfolioProps {
        val builder = PortfolioPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun portfolioShareOptions(block: PortfolioShareOptionsDsl.() -> Unit = {}): PortfolioShareOptions {
        val builder = PortfolioShareOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun productStack(
        scope: Construct,
        id: String,
        block: ProductStackDsl.() -> Unit = {},
    ): ProductStack {
        val builder = ProductStackDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun productStackHistory(
        scope: Construct,
        id: String,
        block: ProductStackHistoryDsl.() -> Unit = {},
    ): ProductStackHistory {
        val builder = ProductStackHistoryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun productStackHistoryProps(block: ProductStackHistoryPropsDsl.() -> Unit = {}): ProductStackHistoryProps {
        val builder = ProductStackHistoryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun productStackProps(block: ProductStackPropsDsl.() -> Unit = {}): ProductStackProps {
        val builder = ProductStackPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stackSetsConstraintOptions(
        block: StackSetsConstraintOptionsDsl.() -> Unit =
            {},
    ): StackSetsConstraintOptions {
        val builder = StackSetsConstraintOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun tagOptions(
        scope: Construct,
        id: String,
        block: TagOptionsDsl.() -> Unit = {},
    ): TagOptions {
        val builder = TagOptionsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun tagOptionsProps(block: TagOptionsPropsDsl.() -> Unit = {}): TagOptionsProps {
        val builder = TagOptionsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun tagUpdateConstraintOptions(
        block: TagUpdateConstraintOptionsDsl.() -> Unit =
            {},
    ): TagUpdateConstraintOptions {
        val builder = TagUpdateConstraintOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun templateRule(block: TemplateRuleDsl.() -> Unit = {}): TemplateRule {
        val builder = TemplateRuleDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun templateRuleAssertion(block: TemplateRuleAssertionDsl.() -> Unit = {}): TemplateRuleAssertion {
        val builder = TemplateRuleAssertionDsl()
        builder.apply(block)
        return builder.build()
    }
}
