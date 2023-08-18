@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.servicecatalog

import kotlin.String
import kotlin.Unit
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

public object servicecatalog {
    /**
     * Accepts an offer to share the specified portfolio.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnAcceptedPortfolioShare cfnAcceptedPortfolioShare =
     * CfnAcceptedPortfolioShare.Builder.create(this, "MyCfnAcceptedPortfolioShare")
     * .portfolioId("portfolioId")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html)
     */
    public inline fun cfnAcceptedPortfolioShare(
        scope: Construct,
        id: String,
        block: CfnAcceptedPortfolioShareDsl.() -> Unit = {},
    ): CfnAcceptedPortfolioShare {
        val builder = CfnAcceptedPortfolioShareDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAcceptedPortfolioShare`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnAcceptedPortfolioShareProps cfnAcceptedPortfolioShareProps =
     * CfnAcceptedPortfolioShareProps.builder()
     * .portfolioId("portfolioId")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-acceptedportfolioshare.html)
     */
    public inline fun cfnAcceptedPortfolioShareProps(
        block: CfnAcceptedPortfolioSharePropsDsl.() -> Unit = {}
    ): CfnAcceptedPortfolioShareProps {
        val builder = CfnAcceptedPortfolioSharePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a product.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * Object info;
     * CfnCloudFormationProduct cfnCloudFormationProduct =
     * CfnCloudFormationProduct.Builder.create(this, "MyCfnCloudFormationProduct")
     * .name("name")
     * .owner("owner")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .description("description")
     * .distributor("distributor")
     * .productType("productType")
     * .provisioningArtifactParameters(List.of(ProvisioningArtifactPropertiesProperty.builder()
     * .info(info)
     * // the properties below are optional
     * .description("description")
     * .disableTemplateValidation(false)
     * .name("name")
     * .type("type")
     * .build()))
     * .replaceProvisioningArtifacts(false)
     * .sourceConnection(SourceConnectionProperty.builder()
     * .connectionParameters(ConnectionParametersProperty.builder()
     * .codeStar(CodeStarParametersProperty.builder()
     * .artifactPath("artifactPath")
     * .branch("branch")
     * .connectionArn("connectionArn")
     * .repository("repository")
     * .build())
     * .build())
     * .type("type")
     * .build())
     * .supportDescription("supportDescription")
     * .supportEmail("supportEmail")
     * .supportUrl("supportUrl")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html)
     */
    public inline fun cfnCloudFormationProduct(
        scope: Construct,
        id: String,
        block: CfnCloudFormationProductDsl.() -> Unit = {},
    ): CfnCloudFormationProduct {
        val builder = CfnCloudFormationProductDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The subtype containing details about the Codestar connection `Type` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CodeStarParametersProperty codeStarParametersProperty = CodeStarParametersProperty.builder()
     * .artifactPath("artifactPath")
     * .branch("branch")
     * .connectionArn("connectionArn")
     * .repository("repository")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-codestarparameters.html)
     */
    public inline fun cfnCloudFormationProductCodeStarParametersProperty(
        block: CfnCloudFormationProductCodeStarParametersPropertyDsl.() -> Unit = {}
    ): CfnCloudFormationProduct.CodeStarParametersProperty {
        val builder = CfnCloudFormationProductCodeStarParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides connection details.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * ConnectionParametersProperty connectionParametersProperty =
     * ConnectionParametersProperty.builder()
     * .codeStar(CodeStarParametersProperty.builder()
     * .artifactPath("artifactPath")
     * .branch("branch")
     * .connectionArn("connectionArn")
     * .repository("repository")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-connectionparameters.html)
     */
    public inline fun cfnCloudFormationProductConnectionParametersProperty(
        block: CfnCloudFormationProductConnectionParametersPropertyDsl.() -> Unit = {}
    ): CfnCloudFormationProduct.ConnectionParametersProperty {
        val builder = CfnCloudFormationProductConnectionParametersPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCloudFormationProduct`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * Object info;
     * CfnCloudFormationProductProps cfnCloudFormationProductProps =
     * CfnCloudFormationProductProps.builder()
     * .name("name")
     * .owner("owner")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .description("description")
     * .distributor("distributor")
     * .productType("productType")
     * .provisioningArtifactParameters(List.of(ProvisioningArtifactPropertiesProperty.builder()
     * .info(info)
     * // the properties below are optional
     * .description("description")
     * .disableTemplateValidation(false)
     * .name("name")
     * .type("type")
     * .build()))
     * .replaceProvisioningArtifacts(false)
     * .sourceConnection(SourceConnectionProperty.builder()
     * .connectionParameters(ConnectionParametersProperty.builder()
     * .codeStar(CodeStarParametersProperty.builder()
     * .artifactPath("artifactPath")
     * .branch("branch")
     * .connectionArn("connectionArn")
     * .repository("repository")
     * .build())
     * .build())
     * .type("type")
     * .build())
     * .supportDescription("supportDescription")
     * .supportEmail("supportEmail")
     * .supportUrl("supportUrl")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationproduct.html)
     */
    public inline fun cfnCloudFormationProductProps(
        block: CfnCloudFormationProductPropsDsl.() -> Unit = {}
    ): CfnCloudFormationProductProps {
        val builder = CfnCloudFormationProductPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a provisioning artifact (also known as a version) for a product.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * Object info;
     * ProvisioningArtifactPropertiesProperty provisioningArtifactPropertiesProperty =
     * ProvisioningArtifactPropertiesProperty.builder()
     * .info(info)
     * // the properties below are optional
     * .description("description")
     * .disableTemplateValidation(false)
     * .name("name")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-provisioningartifactproperties.html)
     */
    public inline fun cfnCloudFormationProductProvisioningArtifactPropertiesProperty(
        block: CfnCloudFormationProductProvisioningArtifactPropertiesPropertyDsl.() -> Unit = {}
    ): CfnCloudFormationProduct.ProvisioningArtifactPropertiesProperty {
        val builder = CfnCloudFormationProductProvisioningArtifactPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A top level `ProductViewDetail` response containing details about the product’s connection.
     *
     * AWS Service Catalog returns this field for the `CreateProduct` , `UpdateProduct` ,
     * `DescribeProductAsAdmin` , and `SearchProductAsAdmin` APIs. This response contains the same
     * fields as the `ConnectionParameters` request, with the addition of the `LastSync` response.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * SourceConnectionProperty sourceConnectionProperty = SourceConnectionProperty.builder()
     * .connectionParameters(ConnectionParametersProperty.builder()
     * .codeStar(CodeStarParametersProperty.builder()
     * .artifactPath("artifactPath")
     * .branch("branch")
     * .connectionArn("connectionArn")
     * .repository("repository")
     * .build())
     * .build())
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-sourceconnection.html)
     */
    public inline fun cfnCloudFormationProductSourceConnectionProperty(
        block: CfnCloudFormationProductSourceConnectionPropertyDsl.() -> Unit = {}
    ): CfnCloudFormationProduct.SourceConnectionProperty {
        val builder = CfnCloudFormationProductSourceConnectionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provisions the specified product.
     *
     * A provisioned product is a resourced instance of a product. For example, provisioning a
     * product based on a AWS CloudFormation template launches a AWS CloudFormation stack and its
     * underlying resources. You can check the status of this request using
     * [DescribeRecord](https://docs.aws.amazon.com/servicecatalog/latest/dg/API_DescribeRecord.html)
     * .
     *
     * If the request contains a tag key with an empty list of values, there is a tag conflict for
     * that key. Do not include conflicted keys as tags, or this causes the error "Parameter
     * validation failed: Missing required parameter in Tags[ *N* ]: *Value* ".
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnCloudFormationProvisionedProduct cfnCloudFormationProvisionedProduct =
     * CfnCloudFormationProvisionedProduct.Builder.create(this, "MyCfnCloudFormationProvisionedProduct")
     * .acceptLanguage("acceptLanguage")
     * .notificationArns(List.of("notificationArns"))
     * .pathId("pathId")
     * .pathName("pathName")
     * .productId("productId")
     * .productName("productName")
     * .provisionedProductName("provisionedProductName")
     * .provisioningArtifactId("provisioningArtifactId")
     * .provisioningArtifactName("provisioningArtifactName")
     * .provisioningParameters(List.of(ProvisioningParameterProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .provisioningPreferences(ProvisioningPreferencesProperty.builder()
     * .stackSetAccounts(List.of("stackSetAccounts"))
     * .stackSetFailureToleranceCount(123)
     * .stackSetFailureTolerancePercentage(123)
     * .stackSetMaxConcurrencyCount(123)
     * .stackSetMaxConcurrencyPercentage(123)
     * .stackSetOperationType("stackSetOperationType")
     * .stackSetRegions(List.of("stackSetRegions"))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
     */
    public inline fun cfnCloudFormationProvisionedProduct(
        scope: Construct,
        id: String,
        block: CfnCloudFormationProvisionedProductDsl.() -> Unit = {},
    ): CfnCloudFormationProvisionedProduct {
        val builder = CfnCloudFormationProvisionedProductDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCloudFormationProvisionedProduct`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnCloudFormationProvisionedProductProps cfnCloudFormationProvisionedProductProps =
     * CfnCloudFormationProvisionedProductProps.builder()
     * .acceptLanguage("acceptLanguage")
     * .notificationArns(List.of("notificationArns"))
     * .pathId("pathId")
     * .pathName("pathName")
     * .productId("productId")
     * .productName("productName")
     * .provisionedProductName("provisionedProductName")
     * .provisioningArtifactId("provisioningArtifactId")
     * .provisioningArtifactName("provisioningArtifactName")
     * .provisioningParameters(List.of(ProvisioningParameterProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .provisioningPreferences(ProvisioningPreferencesProperty.builder()
     * .stackSetAccounts(List.of("stackSetAccounts"))
     * .stackSetFailureToleranceCount(123)
     * .stackSetFailureTolerancePercentage(123)
     * .stackSetMaxConcurrencyCount(123)
     * .stackSetMaxConcurrencyPercentage(123)
     * .stackSetOperationType("stackSetOperationType")
     * .stackSetRegions(List.of("stackSetRegions"))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-cloudformationprovisionedproduct.html)
     */
    public inline fun cfnCloudFormationProvisionedProductProps(
        block: CfnCloudFormationProvisionedProductPropsDsl.() -> Unit = {}
    ): CfnCloudFormationProvisionedProductProps {
        val builder = CfnCloudFormationProvisionedProductPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about a parameter used to provision a product.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * ProvisioningParameterProperty provisioningParameterProperty =
     * ProvisioningParameterProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningparameter.html)
     */
    public inline fun cfnCloudFormationProvisionedProductProvisioningParameterProperty(
        block: CfnCloudFormationProvisionedProductProvisioningParameterPropertyDsl.() -> Unit = {}
    ): CfnCloudFormationProvisionedProduct.ProvisioningParameterProperty {
        val builder = CfnCloudFormationProvisionedProductProvisioningParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The user-defined preferences that will be applied when updating a provisioned product.
     *
     * Not all preferences are applicable to all provisioned product type
     *
     * One or more AWS accounts that will have access to the provisioned product.
     *
     * Applicable only to a `CFN_STACKSET` provisioned product type.
     *
     * The AWS accounts specified should be within the list of accounts in the `STACKSET`
     * constraint. To get the list of accounts in the `STACKSET` constraint, use the
     * `DescribeProvisioningParameters` operation.
     *
     * If no values are specified, the default value is all accounts from the `STACKSET` constraint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * ProvisioningPreferencesProperty provisioningPreferencesProperty =
     * ProvisioningPreferencesProperty.builder()
     * .stackSetAccounts(List.of("stackSetAccounts"))
     * .stackSetFailureToleranceCount(123)
     * .stackSetFailureTolerancePercentage(123)
     * .stackSetMaxConcurrencyCount(123)
     * .stackSetMaxConcurrencyPercentage(123)
     * .stackSetOperationType("stackSetOperationType")
     * .stackSetRegions(List.of("stackSetRegions"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationprovisionedproduct-provisioningpreferences.html)
     */
    public inline fun cfnCloudFormationProvisionedProductProvisioningPreferencesProperty(
        block: CfnCloudFormationProvisionedProductProvisioningPreferencesPropertyDsl.() -> Unit = {}
    ): CfnCloudFormationProvisionedProduct.ProvisioningPreferencesProperty {
        val builder = CfnCloudFormationProvisionedProductProvisioningPreferencesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a notification constraint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnLaunchNotificationConstraint cfnLaunchNotificationConstraint =
     * CfnLaunchNotificationConstraint.Builder.create(this, "MyCfnLaunchNotificationConstraint")
     * .notificationArns(List.of("notificationArns"))
     * .portfolioId("portfolioId")
     * .productId("productId")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html)
     */
    public inline fun cfnLaunchNotificationConstraint(
        scope: Construct,
        id: String,
        block: CfnLaunchNotificationConstraintDsl.() -> Unit = {},
    ): CfnLaunchNotificationConstraint {
        val builder = CfnLaunchNotificationConstraintDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLaunchNotificationConstraint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnLaunchNotificationConstraintProps cfnLaunchNotificationConstraintProps =
     * CfnLaunchNotificationConstraintProps.builder()
     * .notificationArns(List.of("notificationArns"))
     * .portfolioId("portfolioId")
     * .productId("productId")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchnotificationconstraint.html)
     */
    public inline fun cfnLaunchNotificationConstraintProps(
        block: CfnLaunchNotificationConstraintPropsDsl.() -> Unit = {}
    ): CfnLaunchNotificationConstraintProps {
        val builder = CfnLaunchNotificationConstraintPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a launch constraint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
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
    public inline fun cfnLaunchRoleConstraint(
        scope: Construct,
        id: String,
        block: CfnLaunchRoleConstraintDsl.() -> Unit = {},
    ): CfnLaunchRoleConstraint {
        val builder = CfnLaunchRoleConstraintDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLaunchRoleConstraint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnLaunchRoleConstraintProps cfnLaunchRoleConstraintProps =
     * CfnLaunchRoleConstraintProps.builder()
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
    public inline fun cfnLaunchRoleConstraintProps(
        block: CfnLaunchRoleConstraintPropsDsl.() -> Unit = {}
    ): CfnLaunchRoleConstraintProps {
        val builder = CfnLaunchRoleConstraintPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a template constraint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnLaunchTemplateConstraint cfnLaunchTemplateConstraint =
     * CfnLaunchTemplateConstraint.Builder.create(this, "MyCfnLaunchTemplateConstraint")
     * .portfolioId("portfolioId")
     * .productId("productId")
     * .rules("rules")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html)
     */
    public inline fun cfnLaunchTemplateConstraint(
        scope: Construct,
        id: String,
        block: CfnLaunchTemplateConstraintDsl.() -> Unit = {},
    ): CfnLaunchTemplateConstraint {
        val builder = CfnLaunchTemplateConstraintDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLaunchTemplateConstraint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnLaunchTemplateConstraintProps cfnLaunchTemplateConstraintProps =
     * CfnLaunchTemplateConstraintProps.builder()
     * .portfolioId("portfolioId")
     * .productId("productId")
     * .rules("rules")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-launchtemplateconstraint.html)
     */
    public inline fun cfnLaunchTemplateConstraintProps(
        block: CfnLaunchTemplateConstraintPropsDsl.() -> Unit = {}
    ): CfnLaunchTemplateConstraintProps {
        val builder = CfnLaunchTemplateConstraintPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a portfolio.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnPortfolio cfnPortfolio = CfnPortfolio.Builder.create(this, "MyCfnPortfolio")
     * .displayName("displayName")
     * .providerName("providerName")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html)
     */
    public inline fun cfnPortfolio(
        scope: Construct,
        id: String,
        block: CfnPortfolioDsl.() -> Unit = {},
    ): CfnPortfolio {
        val builder = CfnPortfolioDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates the specified principal ARN with the specified portfolio.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnPortfolioPrincipalAssociation cfnPortfolioPrincipalAssociation =
     * CfnPortfolioPrincipalAssociation.Builder.create(this, "MyCfnPortfolioPrincipalAssociation")
     * .portfolioId("portfolioId")
     * .principalArn("principalArn")
     * .principalType("principalType")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html)
     */
    public inline fun cfnPortfolioPrincipalAssociation(
        scope: Construct,
        id: String,
        block: CfnPortfolioPrincipalAssociationDsl.() -> Unit = {},
    ): CfnPortfolioPrincipalAssociation {
        val builder = CfnPortfolioPrincipalAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPortfolioPrincipalAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnPortfolioPrincipalAssociationProps cfnPortfolioPrincipalAssociationProps =
     * CfnPortfolioPrincipalAssociationProps.builder()
     * .portfolioId("portfolioId")
     * .principalArn("principalArn")
     * .principalType("principalType")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioprincipalassociation.html)
     */
    public inline fun cfnPortfolioPrincipalAssociationProps(
        block: CfnPortfolioPrincipalAssociationPropsDsl.() -> Unit = {}
    ): CfnPortfolioPrincipalAssociationProps {
        val builder = CfnPortfolioPrincipalAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associates the specified product with the specified portfolio.
     *
     * A delegated admin is authorized to invoke this command.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnPortfolioProductAssociation cfnPortfolioProductAssociation =
     * CfnPortfolioProductAssociation.Builder.create(this, "MyCfnPortfolioProductAssociation")
     * .portfolioId("portfolioId")
     * .productId("productId")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .sourcePortfolioId("sourcePortfolioId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html)
     */
    public inline fun cfnPortfolioProductAssociation(
        scope: Construct,
        id: String,
        block: CfnPortfolioProductAssociationDsl.() -> Unit = {},
    ): CfnPortfolioProductAssociation {
        val builder = CfnPortfolioProductAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPortfolioProductAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnPortfolioProductAssociationProps cfnPortfolioProductAssociationProps =
     * CfnPortfolioProductAssociationProps.builder()
     * .portfolioId("portfolioId")
     * .productId("productId")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .sourcePortfolioId("sourcePortfolioId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioproductassociation.html)
     */
    public inline fun cfnPortfolioProductAssociationProps(
        block: CfnPortfolioProductAssociationPropsDsl.() -> Unit = {}
    ): CfnPortfolioProductAssociationProps {
        val builder = CfnPortfolioProductAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPortfolio`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnPortfolioProps cfnPortfolioProps = CfnPortfolioProps.builder()
     * .displayName("displayName")
     * .providerName("providerName")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolio.html)
     */
    public inline fun cfnPortfolioProps(
        block: CfnPortfolioPropsDsl.() -> Unit = {}
    ): CfnPortfolioProps {
        val builder = CfnPortfolioPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Shares the specified portfolio with the specified account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnPortfolioShare cfnPortfolioShare = CfnPortfolioShare.Builder.create(this,
     * "MyCfnPortfolioShare")
     * .accountId("accountId")
     * .portfolioId("portfolioId")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .shareTagOptions(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html)
     */
    public inline fun cfnPortfolioShare(
        scope: Construct,
        id: String,
        block: CfnPortfolioShareDsl.() -> Unit = {},
    ): CfnPortfolioShare {
        val builder = CfnPortfolioShareDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPortfolioShare`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnPortfolioShareProps cfnPortfolioShareProps = CfnPortfolioShareProps.builder()
     * .accountId("accountId")
     * .portfolioId("portfolioId")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .shareTagOptions(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-portfolioshare.html)
     */
    public inline fun cfnPortfolioShareProps(
        block: CfnPortfolioSharePropsDsl.() -> Unit = {}
    ): CfnPortfolioShareProps {
        val builder = CfnPortfolioSharePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a `RESOURCE_UPDATE` constraint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnResourceUpdateConstraint cfnResourceUpdateConstraint =
     * CfnResourceUpdateConstraint.Builder.create(this, "MyCfnResourceUpdateConstraint")
     * .portfolioId("portfolioId")
     * .productId("productId")
     * .tagUpdateOnProvisionedProduct("tagUpdateOnProvisionedProduct")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
     */
    public inline fun cfnResourceUpdateConstraint(
        scope: Construct,
        id: String,
        block: CfnResourceUpdateConstraintDsl.() -> Unit = {},
    ): CfnResourceUpdateConstraint {
        val builder = CfnResourceUpdateConstraintDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnResourceUpdateConstraint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnResourceUpdateConstraintProps cfnResourceUpdateConstraintProps =
     * CfnResourceUpdateConstraintProps.builder()
     * .portfolioId("portfolioId")
     * .productId("productId")
     * .tagUpdateOnProvisionedProduct("tagUpdateOnProvisionedProduct")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-resourceupdateconstraint.html)
     */
    public inline fun cfnResourceUpdateConstraintProps(
        block: CfnResourceUpdateConstraintPropsDsl.() -> Unit = {}
    ): CfnResourceUpdateConstraintProps {
        val builder = CfnResourceUpdateConstraintPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a self-service action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnServiceAction cfnServiceAction = CfnServiceAction.Builder.create(this, "MyCfnServiceAction")
     * .definition(List.of(DefinitionParameterProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .definitionType("definitionType")
     * .name("name")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html)
     */
    public inline fun cfnServiceAction(
        scope: Construct,
        id: String,
        block: CfnServiceActionDsl.() -> Unit = {},
    ): CfnServiceAction {
        val builder = CfnServiceActionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A self-service action association consisting of the Action ID, the Product ID, and the
     * Provisioning Artifact ID.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnServiceActionAssociation cfnServiceActionAssociation =
     * CfnServiceActionAssociation.Builder.create(this, "MyCfnServiceActionAssociation")
     * .productId("productId")
     * .provisioningArtifactId("provisioningArtifactId")
     * .serviceActionId("serviceActionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html)
     */
    public inline fun cfnServiceActionAssociation(
        scope: Construct,
        id: String,
        block: CfnServiceActionAssociationDsl.() -> Unit = {},
    ): CfnServiceActionAssociation {
        val builder = CfnServiceActionAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnServiceActionAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnServiceActionAssociationProps cfnServiceActionAssociationProps =
     * CfnServiceActionAssociationProps.builder()
     * .productId("productId")
     * .provisioningArtifactId("provisioningArtifactId")
     * .serviceActionId("serviceActionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceactionassociation.html)
     */
    public inline fun cfnServiceActionAssociationProps(
        block: CfnServiceActionAssociationPropsDsl.() -> Unit = {}
    ): CfnServiceActionAssociationProps {
        val builder = CfnServiceActionAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The list of parameters in JSON format.
     *
     * For example: `[{\"Name\":\"InstanceId\",\"Type\":\"TARGET\"}] or
     * [{\"Name\":\"InstanceId\",\"Type\":\"TEXT_VALUE\"}]` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * DefinitionParameterProperty definitionParameterProperty = DefinitionParameterProperty.builder()
     * .key("key")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-serviceaction-definitionparameter.html)
     */
    public inline fun cfnServiceActionDefinitionParameterProperty(
        block: CfnServiceActionDefinitionParameterPropertyDsl.() -> Unit = {}
    ): CfnServiceAction.DefinitionParameterProperty {
        val builder = CfnServiceActionDefinitionParameterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnServiceAction`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnServiceActionProps cfnServiceActionProps = CfnServiceActionProps.builder()
     * .definition(List.of(DefinitionParameterProperty.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .definitionType("definitionType")
     * .name("name")
     * // the properties below are optional
     * .acceptLanguage("acceptLanguage")
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-serviceaction.html)
     */
    public inline fun cfnServiceActionProps(
        block: CfnServiceActionPropsDsl.() -> Unit = {}
    ): CfnServiceActionProps {
        val builder = CfnServiceActionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a StackSet constraint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnStackSetConstraint cfnStackSetConstraint = CfnStackSetConstraint.Builder.create(this,
     * "MyCfnStackSetConstraint")
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
    public inline fun cfnStackSetConstraint(
        scope: Construct,
        id: String,
        block: CfnStackSetConstraintDsl.() -> Unit = {},
    ): CfnStackSetConstraint {
        val builder = CfnStackSetConstraintDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnStackSetConstraint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
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
    public inline fun cfnStackSetConstraintProps(
        block: CfnStackSetConstraintPropsDsl.() -> Unit = {}
    ): CfnStackSetConstraintProps {
        val builder = CfnStackSetConstraintPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a TagOption.
     *
     * A TagOption is a key-value pair managed by AWS Service Catalog that serves as a template for
     * creating an AWS tag.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnTagOption cfnTagOption = CfnTagOption.Builder.create(this, "MyCfnTagOption")
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .active(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html)
     */
    public inline fun cfnTagOption(
        scope: Construct,
        id: String,
        block: CfnTagOptionDsl.() -> Unit = {},
    ): CfnTagOption {
        val builder = CfnTagOptionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Associate the specified TagOption with the specified portfolio or product.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnTagOptionAssociation cfnTagOptionAssociation = CfnTagOptionAssociation.Builder.create(this,
     * "MyCfnTagOptionAssociation")
     * .resourceId("resourceId")
     * .tagOptionId("tagOptionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html)
     */
    public inline fun cfnTagOptionAssociation(
        scope: Construct,
        id: String,
        block: CfnTagOptionAssociationDsl.() -> Unit = {},
    ): CfnTagOptionAssociation {
        val builder = CfnTagOptionAssociationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTagOptionAssociation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnTagOptionAssociationProps cfnTagOptionAssociationProps =
     * CfnTagOptionAssociationProps.builder()
     * .resourceId("resourceId")
     * .tagOptionId("tagOptionId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoptionassociation.html)
     */
    public inline fun cfnTagOptionAssociationProps(
        block: CfnTagOptionAssociationPropsDsl.() -> Unit = {}
    ): CfnTagOptionAssociationProps {
        val builder = CfnTagOptionAssociationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnTagOption`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CfnTagOptionProps cfnTagOptionProps = CfnTagOptionProps.builder()
     * .key("key")
     * .value("value")
     * // the properties below are optional
     * .active(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html)
     */
    public inline fun cfnTagOptionProps(
        block: CfnTagOptionPropsDsl.() -> Unit = {}
    ): CfnTagOptionProps {
        val builder = CfnTagOptionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Service Catalog Cloudformation Product.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * public class S3BucketProduct extends ProductStack {
     * public S3BucketProduct(Construct scope, String id) {
     * super(scope, id);
     * new Bucket(this, "BucketProduct");
     * }
     * }
     * CloudFormationProduct product = CloudFormationProduct.Builder.create(this, "Product")
     * .productName("My Product")
     * .owner("Product Owner")
     * .productVersions(List.of(CloudFormationProductVersion.builder()
     * .productVersionName("v1")
     * .cloudFormationTemplate(CloudFormationTemplate.fromProductStack(new S3BucketProduct(this,
     * "S3BucketProduct")))
     * .build()))
     * .build();
     * ```
     */
    public inline fun cloudFormationProduct(
        scope: Construct,
        id: String,
        block: CloudFormationProductDsl.() -> Unit = {},
    ): CloudFormationProduct {
        val builder = CloudFormationProductDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a Cloudformation Product.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * public class S3BucketProduct extends ProductStack {
     * public S3BucketProduct(Construct scope, String id) {
     * super(scope, id);
     * new Bucket(this, "BucketProduct");
     * }
     * }
     * CloudFormationProduct product = CloudFormationProduct.Builder.create(this, "Product")
     * .productName("My Product")
     * .owner("Product Owner")
     * .productVersions(List.of(CloudFormationProductVersion.builder()
     * .productVersionName("v1")
     * .cloudFormationTemplate(CloudFormationTemplate.fromProductStack(new S3BucketProduct(this,
     * "S3BucketProduct")))
     * .build()))
     * .build();
     * ```
     */
    public inline fun cloudFormationProductProps(
        block: CloudFormationProductPropsDsl.() -> Unit = {}
    ): CloudFormationProductProps {
        val builder = CloudFormationProductPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of product version (also known as a provisioning artifact).
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * CloudFormationTemplate cloudFormationTemplate;
     * CloudFormationProductVersion cloudFormationProductVersion =
     * CloudFormationProductVersion.builder()
     * .cloudFormationTemplate(cloudFormationTemplate)
     * // the properties below are optional
     * .description("description")
     * .productVersionName("productVersionName")
     * .validateTemplate(false)
     * .build();
     * ```
     */
    public inline fun cloudFormationProductVersion(
        block: CloudFormationProductVersionDsl.() -> Unit = {}
    ): CloudFormationProductVersion {
        val builder = CloudFormationProductVersionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for provisoning rule constraint.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * Portfolio portfolio;
     * CloudFormationProduct product;
     * portfolio.constrainCloudFormationParameters(product,
     * CloudFormationRuleConstraintOptions.builder()
     * .rule(TemplateRule.builder()
     * .ruleName("testInstanceType")
     * .condition(Fn.conditionEquals(Fn.ref("Environment"), "test"))
     * .assertions(List.of(TemplateRuleAssertion.builder()
     * .assert(Fn.conditionContains(List.of("t2.micro", "t2.small"), Fn.ref("InstanceType")))
     * .description("For test environment, the instance type should be small")
     * .build()))
     * .build())
     * .build());
     * ```
     */
    public inline fun cloudFormationRuleConstraintOptions(
        block: CloudFormationRuleConstraintOptionsDsl.() -> Unit = {}
    ): CloudFormationRuleConstraintOptions {
        val builder = CloudFormationRuleConstraintOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Result of binding `Template` into a `Product`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.s3.*;
     * import software.amazon.awscdk.services.servicecatalog.*;
     * Bucket bucket;
     * CloudFormationTemplateConfig cloudFormationTemplateConfig =
     * CloudFormationTemplateConfig.builder()
     * .httpUrl("httpUrl")
     * // the properties below are optional
     * .assetBucket(bucket)
     * .build();
     * ```
     */
    public inline fun cloudFormationTemplateConfig(
        block: CloudFormationTemplateConfigDsl.() -> Unit = {}
    ): CloudFormationTemplateConfig {
        val builder = CloudFormationTemplateConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for governance mechanisms and constraints.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.sns.*;
     * Portfolio portfolio;
     * CloudFormationProduct product;
     * Topic topic1 = new Topic(this, "Topic1");
     * portfolio.notifyOnStackEvents(product, topic1);
     * Topic topic2 = new Topic(this, "Topic2");
     * portfolio.notifyOnStackEvents(product, topic2, CommonConstraintOptions.builder()
     * .description("description for topic2")
     * .build());
     * ```
     */
    public inline fun commonConstraintOptions(
        block: CommonConstraintOptionsDsl.() -> Unit = {}
    ): CommonConstraintOptions {
        val builder = CommonConstraintOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Service Catalog portfolio.
     *
     * Example:
     * ```
     * Portfolio.Builder.create(this, "Portfolio")
     * .displayName("MyPortfolio")
     * .providerName("MyTeam")
     * .build();
     * ```
     */
    public inline fun portfolio(
        scope: Construct,
        id: String,
        block: PortfolioDsl.() -> Unit = {},
    ): Portfolio {
        val builder = PortfolioDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a Portfolio.
     *
     * Example:
     * ```
     * Portfolio.Builder.create(this, "Portfolio")
     * .displayName("MyPortfolio")
     * .providerName("MyTeam")
     * .build();
     * ```
     */
    public inline fun portfolioProps(block: PortfolioPropsDsl.() -> Unit = {}): PortfolioProps {
        val builder = PortfolioPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for portfolio share.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.servicecatalog.*;
     * PortfolioShareOptions portfolioShareOptions = PortfolioShareOptions.builder()
     * .messageLanguage(MessageLanguage.EN)
     * .shareTagOptions(false)
     * .build();
     * ```
     */
    public inline fun portfolioShareOptions(
        block: PortfolioShareOptionsDsl.() -> Unit = {}
    ): PortfolioShareOptions {
        val builder = PortfolioShareOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Service Catalog product stack, which is similar in form to a Cloudformation nested stack.
     *
     * You can add the resources to this stack that you want to define for your service catalog
     * product.
     *
     * This stack will not be treated as an independent deployment artifact (won't be listed in "cdk
     * list" or deployable through "cdk deploy"), but rather only synthesized as a template and
     * uploaded as an asset to S3.
     *
     * Example:
     * ```
     * public class S3BucketProduct extends ProductStack {
     * public S3BucketProduct(Construct scope, String id) {
     * super(scope, id);
     * new Bucket(this, "BucketProductV2");
     * }
     * }
     * ProductStackHistory productStackHistory = ProductStackHistory.Builder.create(this,
     * "ProductStackHistory")
     * .productStack(new S3BucketProduct(this, "S3BucketProduct"))
     * .currentVersionName("v2")
     * .currentVersionLocked(true)
     * .build();
     * CloudFormationProduct product = CloudFormationProduct.Builder.create(this, "MyFirstProduct")
     * .productName("My Product")
     * .owner("Product Owner")
     * .productVersions(List.of(productStackHistory.currentVersion(),
     * productStackHistory.versionFromSnapshot("v1")))
     * .build();
     * ```
     */
    public inline fun productStack(
        scope: Construct,
        id: String,
        block: ProductStackDsl.() -> Unit = {},
    ): ProductStack {
        val builder = ProductStackDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Construct that contains a Service Catalog product stack with its previous deployments
     * maintained.
     *
     * Example:
     * ```
     * public class S3BucketProduct extends ProductStack {
     * public S3BucketProduct(Construct scope, String id) {
     * super(scope, id);
     * new Bucket(this, "BucketProductV2");
     * }
     * }
     * ProductStackHistory productStackHistory = ProductStackHistory.Builder.create(this,
     * "ProductStackHistory")
     * .productStack(new S3BucketProduct(this, "S3BucketProduct"))
     * .currentVersionName("v2")
     * .currentVersionLocked(true)
     * .build();
     * CloudFormationProduct product = CloudFormationProduct.Builder.create(this, "MyFirstProduct")
     * .productName("My Product")
     * .owner("Product Owner")
     * .productVersions(List.of(productStackHistory.currentVersion()))
     * .build();
     * ```
     */
    public inline fun productStackHistory(
        scope: Construct,
        id: String,
        block: ProductStackHistoryDsl.() -> Unit = {},
    ): ProductStackHistory {
        val builder = ProductStackHistoryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a ProductStackHistory.
     *
     * Example:
     * ```
     * public class S3BucketProduct extends ProductStack {
     * public S3BucketProduct(Construct scope, String id) {
     * super(scope, id);
     * new Bucket(this, "BucketProductV2");
     * }
     * }
     * ProductStackHistory productStackHistory = ProductStackHistory.Builder.create(this,
     * "ProductStackHistory")
     * .productStack(new S3BucketProduct(this, "S3BucketProduct"))
     * .currentVersionName("v2")
     * .currentVersionLocked(true)
     * .build();
     * CloudFormationProduct product = CloudFormationProduct.Builder.create(this, "MyFirstProduct")
     * .productName("My Product")
     * .owner("Product Owner")
     * .productVersions(List.of(productStackHistory.currentVersion()))
     * .build();
     * ```
     */
    public inline fun productStackHistoryProps(
        block: ProductStackHistoryPropsDsl.() -> Unit = {}
    ): ProductStackHistoryProps {
        val builder = ProductStackHistoryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Product stack props.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.lambda.*;
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.s3.Bucket;
     * public class LambdaProduct extends ProductStack {
     * public LambdaProduct(Construct scope, String id, ProductStackProps props) {
     * super(scope, id, props);
     * Function.Builder.create(this, "LambdaProduct")
     * .runtime(Runtime.PYTHON_3_9)
     * .code(Code.fromAsset("./assets"))
     * .handler("index.handler")
     * .build();
     * }
     * }
     * Bucket userDefinedBucket = Bucket.Builder.create(this, "UserDefinedBucket")
     * .bucketName("user-defined-bucket-for-product-stack-assets")
     * .build();
     * CloudFormationProduct product = CloudFormationProduct.Builder.create(this, "Product")
     * .productName("My Product")
     * .owner("Product Owner")
     * .productVersions(List.of(CloudFormationProductVersion.builder()
     * .productVersionName("v1")
     * .cloudFormationTemplate(CloudFormationTemplate.fromProductStack(LambdaProduct.Builder.create(this,
     * "LambdaFunctionProduct")
     * .assetBucket(userDefinedBucket)
     * .build()))
     * .build()))
     * .build();
     * ```
     */
    public inline fun productStackProps(
        block: ProductStackPropsDsl.() -> Unit = {}
    ): ProductStackProps {
        val builder = ProductStackPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for deploying with Stackset, which creates a StackSet constraint.
     *
     * Example:
     * ```
     * Portfolio portfolio;
     * CloudFormationProduct product;
     * Role adminRole = Role.Builder.create(this, "AdminRole")
     * .assumedBy(new AccountRootPrincipal())
     * .build();
     * portfolio.deployWithStackSets(product, StackSetsConstraintOptions.builder()
     * .accounts(List.of("012345678901", "012345678902", "012345678903"))
     * .regions(List.of("us-west-1", "us-east-1", "us-west-2", "us-east-1"))
     * .adminRole(adminRole)
     * .executionRoleName("SCStackSetExecutionRole") // Name of role deployed in end users accounts.
     * .allowStackSetInstanceOperations(true)
     * .build());
     * ```
     */
    public inline fun stackSetsConstraintOptions(
        block: StackSetsConstraintOptionsDsl.() -> Unit = {}
    ): StackSetsConstraintOptions {
        val builder = StackSetsConstraintOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a set of TagOptions, which are a list of key-value pairs managed in AWS Service
     * Catalog.
     *
     * It is not an AWS tag, but serves as a template for creating an AWS tag based on the
     * TagOption. See https://docs.aws.amazon.com/servicecatalog/latest/adminguide/tagoptions.html
     *
     * Example:
     * ```
     * Portfolio portfolio;
     * CloudFormationProduct product;
     * TagOptions tagOptionsForPortfolio = TagOptions.Builder.create(this, "OrgTagOptions")
     * .allowedValuesForTags(Map.of(
     * "Group", List.of("finance", "engineering", "marketing", "research"),
     * "CostCenter", List.of("01", "02", "03")))
     * .build();
     * portfolio.associateTagOptions(tagOptionsForPortfolio);
     * TagOptions tagOptionsForProduct = TagOptions.Builder.create(this, "ProductTagOptions")
     * .allowedValuesForTags(Map.of(
     * "Environment", List.of("dev", "alpha", "prod")))
     * .build();
     * product.associateTagOptions(tagOptionsForProduct);
     * ```
     */
    public inline fun tagOptions(
        scope: Construct,
        id: String,
        block: TagOptionsDsl.() -> Unit = {},
    ): TagOptions {
        val builder = TagOptionsDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for TagOptions.
     *
     * Example:
     * ```
     * Portfolio portfolio;
     * CloudFormationProduct product;
     * TagOptions tagOptionsForPortfolio = TagOptions.Builder.create(this, "OrgTagOptions")
     * .allowedValuesForTags(Map.of(
     * "Group", List.of("finance", "engineering", "marketing", "research"),
     * "CostCenter", List.of("01", "02", "03")))
     * .build();
     * portfolio.associateTagOptions(tagOptionsForPortfolio);
     * TagOptions tagOptionsForProduct = TagOptions.Builder.create(this, "ProductTagOptions")
     * .allowedValuesForTags(Map.of(
     * "Environment", List.of("dev", "alpha", "prod")))
     * .build();
     * product.associateTagOptions(tagOptionsForProduct);
     * ```
     */
    public inline fun tagOptionsProps(block: TagOptionsPropsDsl.() -> Unit = {}): TagOptionsProps {
        val builder = TagOptionsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for ResourceUpdateConstraint.
     *
     * Example:
     * ```
     * Portfolio portfolio;
     * CloudFormationProduct product;
     * // to disable tag updates:
     * portfolio.constrainTagUpdates(product, TagUpdateConstraintOptions.builder()
     * .allow(false)
     * .build());
     * ```
     */
    public inline fun tagUpdateConstraintOptions(
        block: TagUpdateConstraintOptionsDsl.() -> Unit = {}
    ): TagUpdateConstraintOptions {
        val builder = TagUpdateConstraintOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines the provisioning template constraints.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.*;
     * Portfolio portfolio;
     * CloudFormationProduct product;
     * portfolio.constrainCloudFormationParameters(product,
     * CloudFormationRuleConstraintOptions.builder()
     * .rule(TemplateRule.builder()
     * .ruleName("testInstanceType")
     * .condition(Fn.conditionEquals(Fn.ref("Environment"), "test"))
     * .assertions(List.of(TemplateRuleAssertion.builder()
     * .assert(Fn.conditionContains(List.of("t2.micro", "t2.small"), Fn.ref("InstanceType")))
     * .description("For test environment, the instance type should be small")
     * .build()))
     * .build())
     * .build());
     * ```
     */
    public inline fun templateRule(block: TemplateRuleDsl.() -> Unit = {}): TemplateRule {
        val builder = TemplateRuleDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An assertion within a template rule, defined by intrinsic functions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.servicecatalog.*;
     * ICfnRuleConditionExpression cfnRuleConditionExpression;
     * TemplateRuleAssertion templateRuleAssertion = TemplateRuleAssertion.builder()
     * .assert(cfnRuleConditionExpression)
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     */
    public inline fun templateRuleAssertion(
        block: TemplateRuleAssertionDsl.() -> Unit = {}
    ): TemplateRuleAssertion {
        val builder = TemplateRuleAssertionDsl()
        builder.apply(block)
        return builder.build()
    }
}
