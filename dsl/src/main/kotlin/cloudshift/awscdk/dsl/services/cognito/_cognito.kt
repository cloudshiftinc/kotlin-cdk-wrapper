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

package cloudshift.awscdk.dsl.services.cognito

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.AttributeMapping
import software.amazon.awscdk.services.cognito.AuthFlow
import software.amazon.awscdk.services.cognito.AutoVerifiedAttrs
import software.amazon.awscdk.services.cognito.BaseUrlOptions
import software.amazon.awscdk.services.cognito.BooleanAttribute
import software.amazon.awscdk.services.cognito.CfnIdentityPool
import software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTag
import software.amazon.awscdk.services.cognito.CfnIdentityPoolPrincipalTagProps
import software.amazon.awscdk.services.cognito.CfnIdentityPoolProps
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment
import software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachmentProps
import software.amazon.awscdk.services.cognito.CfnUserPool
import software.amazon.awscdk.services.cognito.CfnUserPoolClient
import software.amazon.awscdk.services.cognito.CfnUserPoolClientProps
import software.amazon.awscdk.services.cognito.CfnUserPoolDomain
import software.amazon.awscdk.services.cognito.CfnUserPoolDomainProps
import software.amazon.awscdk.services.cognito.CfnUserPoolGroup
import software.amazon.awscdk.services.cognito.CfnUserPoolGroupProps
import software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider
import software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps
import software.amazon.awscdk.services.cognito.CfnUserPoolProps
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServer
import software.amazon.awscdk.services.cognito.CfnUserPoolResourceServerProps
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachmentProps
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps
import software.amazon.awscdk.services.cognito.CfnUserPoolUser
import software.amazon.awscdk.services.cognito.CfnUserPoolUserProps
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachment
import software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps
import software.amazon.awscdk.services.cognito.CognitoDomainOptions
import software.amazon.awscdk.services.cognito.CustomAttributeConfig
import software.amazon.awscdk.services.cognito.CustomAttributeProps
import software.amazon.awscdk.services.cognito.CustomDomainOptions
import software.amazon.awscdk.services.cognito.DateTimeAttribute
import software.amazon.awscdk.services.cognito.DeviceTracking
import software.amazon.awscdk.services.cognito.EmailSettings
import software.amazon.awscdk.services.cognito.KeepOriginalAttrs
import software.amazon.awscdk.services.cognito.MfaSecondFactor
import software.amazon.awscdk.services.cognito.NumberAttribute
import software.amazon.awscdk.services.cognito.NumberAttributeConstraints
import software.amazon.awscdk.services.cognito.NumberAttributeProps
import software.amazon.awscdk.services.cognito.OAuthFlows
import software.amazon.awscdk.services.cognito.OAuthSettings
import software.amazon.awscdk.services.cognito.OidcEndpoints
import software.amazon.awscdk.services.cognito.PasswordPolicy
import software.amazon.awscdk.services.cognito.ResourceServerScope
import software.amazon.awscdk.services.cognito.ResourceServerScopeProps
import software.amazon.awscdk.services.cognito.SignInAliases
import software.amazon.awscdk.services.cognito.SignInUrlOptions
import software.amazon.awscdk.services.cognito.StandardAttribute
import software.amazon.awscdk.services.cognito.StandardAttributes
import software.amazon.awscdk.services.cognito.StandardAttributesMask
import software.amazon.awscdk.services.cognito.StringAttribute
import software.amazon.awscdk.services.cognito.StringAttributeConstraints
import software.amazon.awscdk.services.cognito.StringAttributeProps
import software.amazon.awscdk.services.cognito.UserInvitationConfig
import software.amazon.awscdk.services.cognito.UserPool
import software.amazon.awscdk.services.cognito.UserPoolClient
import software.amazon.awscdk.services.cognito.UserPoolClientOptions
import software.amazon.awscdk.services.cognito.UserPoolClientProps
import software.amazon.awscdk.services.cognito.UserPoolDomain
import software.amazon.awscdk.services.cognito.UserPoolDomainOptions
import software.amazon.awscdk.services.cognito.UserPoolDomainProps
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazonProps
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderApple
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAppleProps
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebook
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderFacebookProps
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidcProps
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSaml
import software.amazon.awscdk.services.cognito.UserPoolIdentityProviderSamlProps
import software.amazon.awscdk.services.cognito.UserPoolProps
import software.amazon.awscdk.services.cognito.UserPoolResourceServer
import software.amazon.awscdk.services.cognito.UserPoolResourceServerOptions
import software.amazon.awscdk.services.cognito.UserPoolResourceServerProps
import software.amazon.awscdk.services.cognito.UserPoolSESOptions
import software.amazon.awscdk.services.cognito.UserPoolTriggers
import software.amazon.awscdk.services.cognito.UserVerificationConfig
import software.constructs.Construct

public object cognito {
    /**
     * The mapping of user pool attributes to the attributes provided by the identity providers.
     *
     * Example:
     * ```
     * UserPool userpool = new UserPool(this, "Pool");
     * UserPoolIdentityProviderAmazon.Builder.create(this, "Amazon")
     * .clientId("amzn-client-id")
     * .clientSecret("amzn-client-secret")
     * .userPool(userpool)
     * .attributeMapping(AttributeMapping.builder()
     * .email(ProviderAttribute.AMAZON_EMAIL)
     * .website(ProviderAttribute.other("url")) // use other() when an attribute is not pre-defined in
     * the CDK
     * .custom(Map.of(
     * // custom user pool attributes go here
     * "uniqueId", ProviderAttribute.AMAZON_USER_ID))
     * .build())
     * .build();
     * ```
     */
    public inline fun attributeMapping(
        block: AttributeMappingDsl.() -> Unit = {}
    ): AttributeMapping {
        val builder = AttributeMappingDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Types of authentication flow.
     *
     * Example:
     * ```
     * UserPool pool = new UserPool(this, "pool");
     * pool.addClient("app-client", UserPoolClientOptions.builder()
     * .authFlows(AuthFlow.builder()
     * .userPassword(true)
     * .userSrp(true)
     * .build())
     * .build());
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow.html)
     */
    public inline fun authFlow(block: AuthFlowDsl.() -> Unit = {}): AuthFlow {
        val builder = AuthFlowDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes that can be automatically verified for users in a user pool.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * // ...
     * .signInAliases(SignInAliases.builder().username(true).email(true).build())
     * .autoVerify(AutoVerifiedAttrs.builder().email(true).phone(true).build())
     * .build();
     * ```
     */
    public inline fun autoVerifiedAttrs(
        block: AutoVerifiedAttrsDsl.() -> Unit = {}
    ): AutoVerifiedAttrs {
        val builder = AutoVerifiedAttrsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to customize the behaviour of `baseUrl()`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * BaseUrlOptions baseUrlOptions = BaseUrlOptions.builder()
     * .fips(false)
     * .build();
     * ```
     */
    public inline fun baseUrlOptions(block: BaseUrlOptionsDsl.() -> Unit = {}): BaseUrlOptions {
        val builder = BaseUrlOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Boolean custom attribute type.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .standardAttributes(StandardAttributes.builder()
     * .fullname(StandardAttribute.builder()
     * .required(true)
     * .mutable(false)
     * .build())
     * .address(StandardAttribute.builder()
     * .required(false)
     * .mutable(true)
     * .build())
     * .build())
     * .customAttributes(Map.of(
     * "myappid", StringAttribute.Builder.create().minLen(5).maxLen(15).mutable(false).build(),
     * "callingcode", NumberAttribute.Builder.create().min(1).max(3).mutable(true).build(),
     * "isEmployee", BooleanAttribute.Builder.create().mutable(true).build(),
     * "joinedOn", new DateTimeAttribute()))
     * .build();
     * ```
     */
    public inline fun booleanAttribute(
        block: BooleanAttributeDsl.() -> Unit = {}
    ): BooleanAttribute {
        val builder = BooleanAttributeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Cognito::IdentityPool` resource creates an Amazon Cognito identity pool.
     *
     * To avoid deleting the resource accidentally from AWS CloudFormation , use
     * [DeletionPolicy Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-deletionpolicy.html)
     * and the
     * [UpdateReplacePolicy Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatereplacepolicy.html)
     * to retain the resource on deletion or replacement.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cognito.*;
     * OpenIdConnectProvider myProvider;
     * CfnIdentityPool.Builder.create(this, "IdentityPool")
     * .openIdConnectProviderArns(List.of(myProvider.getOpenIdConnectProviderArn()))
     * // And the other properties for your identity pool
     * .allowUnauthenticatedIdentities(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html)
     */
    public inline fun cfnIdentityPool(
        scope: Construct,
        id: String,
        block: CfnIdentityPoolDsl.() -> Unit = {},
    ): CfnIdentityPool {
        val builder = CfnIdentityPoolDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * `CognitoIdentityProvider` is a property of the
     * [AWS::Cognito::IdentityPool](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html)
     * resource that represents an Amazon Cognito user pool and its client ID.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CognitoIdentityProviderProperty cognitoIdentityProviderProperty =
     * CognitoIdentityProviderProperty.builder()
     * .clientId("clientId")
     * .providerName("providerName")
     * .serverSideTokenCheck(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html)
     */
    public inline fun cfnIdentityPoolCognitoIdentityProviderProperty(
        block: CfnIdentityPoolCognitoIdentityProviderPropertyDsl.() -> Unit = {}
    ): CfnIdentityPool.CognitoIdentityProviderProperty {
        val builder = CfnIdentityPoolCognitoIdentityProviderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `CognitoStreams` is a property of the
     * [AWS::Cognito::IdentityPool](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html)
     * resource that defines configuration options for Amazon Cognito streams.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CognitoStreamsProperty cognitoStreamsProperty = CognitoStreamsProperty.builder()
     * .roleArn("roleArn")
     * .streamingStatus("streamingStatus")
     * .streamName("streamName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitostreams.html)
     */
    public inline fun cfnIdentityPoolCognitoStreamsProperty(
        block: CfnIdentityPoolCognitoStreamsPropertyDsl.() -> Unit = {}
    ): CfnIdentityPool.CognitoStreamsProperty {
        val builder = CfnIdentityPoolCognitoStreamsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of the identity pool principal tag assignments for attributes for access control.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * Object principalTags;
     * CfnIdentityPoolPrincipalTag cfnIdentityPoolPrincipalTag =
     * CfnIdentityPoolPrincipalTag.Builder.create(this, "MyCfnIdentityPoolPrincipalTag")
     * .identityPoolId("identityPoolId")
     * .identityProviderName("identityProviderName")
     * // the properties below are optional
     * .principalTags(principalTags)
     * .useDefaults(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html)
     */
    public inline fun cfnIdentityPoolPrincipalTag(
        scope: Construct,
        id: String,
        block: CfnIdentityPoolPrincipalTagDsl.() -> Unit = {},
    ): CfnIdentityPoolPrincipalTag {
        val builder = CfnIdentityPoolPrincipalTagDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIdentityPoolPrincipalTag`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * Object principalTags;
     * CfnIdentityPoolPrincipalTagProps cfnIdentityPoolPrincipalTagProps =
     * CfnIdentityPoolPrincipalTagProps.builder()
     * .identityPoolId("identityPoolId")
     * .identityProviderName("identityProviderName")
     * // the properties below are optional
     * .principalTags(principalTags)
     * .useDefaults(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolprincipaltag.html)
     */
    public inline fun cfnIdentityPoolPrincipalTagProps(
        block: CfnIdentityPoolPrincipalTagPropsDsl.() -> Unit = {}
    ): CfnIdentityPoolPrincipalTagProps {
        val builder = CfnIdentityPoolPrincipalTagPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIdentityPool`.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cognito.*;
     * OpenIdConnectProvider myProvider;
     * CfnIdentityPool.Builder.create(this, "IdentityPool")
     * .openIdConnectProviderArns(List.of(myProvider.getOpenIdConnectProviderArn()))
     * // And the other properties for your identity pool
     * .allowUnauthenticatedIdentities(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html)
     */
    public inline fun cfnIdentityPoolProps(
        block: CfnIdentityPoolPropsDsl.() -> Unit = {}
    ): CfnIdentityPoolProps {
        val builder = CfnIdentityPoolPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `PushSync` is a property of the
     * [AWS::Cognito::IdentityPool](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypool.html)
     * resource that defines the configuration options to be applied to an Amazon Cognito identity
     * pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * PushSyncProperty pushSyncProperty = PushSyncProperty.builder()
     * .applicationArns(List.of("applicationArns"))
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-pushsync.html)
     */
    public inline fun cfnIdentityPoolPushSyncProperty(
        block: CfnIdentityPoolPushSyncPropertyDsl.() -> Unit = {}
    ): CfnIdentityPool.PushSyncProperty {
        val builder = CfnIdentityPoolPushSyncPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Cognito::IdentityPoolRoleAttachment` resource manages the role configuration for an
     * Amazon Cognito identity pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * Object roles;
     * CfnIdentityPoolRoleAttachment cfnIdentityPoolRoleAttachment =
     * CfnIdentityPoolRoleAttachment.Builder.create(this, "MyCfnIdentityPoolRoleAttachment")
     * .identityPoolId("identityPoolId")
     * // the properties below are optional
     * .roleMappings(Map.of(
     * "roleMappingsKey", RoleMappingProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .ambiguousRoleResolution("ambiguousRoleResolution")
     * .identityProvider("identityProvider")
     * .rulesConfiguration(RulesConfigurationTypeProperty.builder()
     * .rules(List.of(MappingRuleProperty.builder()
     * .claim("claim")
     * .matchType("matchType")
     * .roleArn("roleArn")
     * .value("value")
     * .build()))
     * .build())
     * .build()))
     * .roles(roles)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html)
     */
    public inline fun cfnIdentityPoolRoleAttachment(
        scope: Construct,
        id: String,
        block: CfnIdentityPoolRoleAttachmentDsl.() -> Unit = {},
    ): CfnIdentityPoolRoleAttachment {
        val builder = CfnIdentityPoolRoleAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines how to map a claim to a role ARN.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * MappingRuleProperty mappingRuleProperty = MappingRuleProperty.builder()
     * .claim("claim")
     * .matchType("matchType")
     * .roleArn("roleArn")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-mappingrule.html)
     */
    public inline fun cfnIdentityPoolRoleAttachmentMappingRuleProperty(
        block: CfnIdentityPoolRoleAttachmentMappingRulePropertyDsl.() -> Unit = {}
    ): CfnIdentityPoolRoleAttachment.MappingRuleProperty {
        val builder = CfnIdentityPoolRoleAttachmentMappingRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIdentityPoolRoleAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * Object roles;
     * CfnIdentityPoolRoleAttachmentProps cfnIdentityPoolRoleAttachmentProps =
     * CfnIdentityPoolRoleAttachmentProps.builder()
     * .identityPoolId("identityPoolId")
     * // the properties below are optional
     * .roleMappings(Map.of(
     * "roleMappingsKey", RoleMappingProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .ambiguousRoleResolution("ambiguousRoleResolution")
     * .identityProvider("identityProvider")
     * .rulesConfiguration(RulesConfigurationTypeProperty.builder()
     * .rules(List.of(MappingRuleProperty.builder()
     * .claim("claim")
     * .matchType("matchType")
     * .roleArn("roleArn")
     * .value("value")
     * .build()))
     * .build())
     * .build()))
     * .roles(roles)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html)
     */
    public inline fun cfnIdentityPoolRoleAttachmentProps(
        block: CfnIdentityPoolRoleAttachmentPropsDsl.() -> Unit = {}
    ): CfnIdentityPoolRoleAttachmentProps {
        val builder = CfnIdentityPoolRoleAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `RoleMapping` is a property of the
     * [AWS::Cognito::IdentityPoolRoleAttachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-identitypoolroleattachment.html)
     * resource that defines the role-mapping attributes of an Amazon Cognito identity pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * RoleMappingProperty roleMappingProperty = RoleMappingProperty.builder()
     * .type("type")
     * // the properties below are optional
     * .ambiguousRoleResolution("ambiguousRoleResolution")
     * .identityProvider("identityProvider")
     * .rulesConfiguration(RulesConfigurationTypeProperty.builder()
     * .rules(List.of(MappingRuleProperty.builder()
     * .claim("claim")
     * .matchType("matchType")
     * .roleArn("roleArn")
     * .value("value")
     * .build()))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
     */
    public inline fun cfnIdentityPoolRoleAttachmentRoleMappingProperty(
        block: CfnIdentityPoolRoleAttachmentRoleMappingPropertyDsl.() -> Unit = {}
    ): CfnIdentityPoolRoleAttachment.RoleMappingProperty {
        val builder = CfnIdentityPoolRoleAttachmentRoleMappingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * `RulesConfigurationType` is a subproperty of the
     * [RoleMapping](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rolemapping.html)
     * property that defines the rules to be used for mapping users to roles.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * RulesConfigurationTypeProperty rulesConfigurationTypeProperty =
     * RulesConfigurationTypeProperty.builder()
     * .rules(List.of(MappingRuleProperty.builder()
     * .claim("claim")
     * .matchType("matchType")
     * .roleArn("roleArn")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypoolroleattachment-rulesconfigurationtype.html)
     */
    public inline fun cfnIdentityPoolRoleAttachmentRulesConfigurationTypeProperty(
        block: CfnIdentityPoolRoleAttachmentRulesConfigurationTypePropertyDsl.() -> Unit = {}
    ): CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty {
        val builder = CfnIdentityPoolRoleAttachmentRulesConfigurationTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Cognito::UserPool` resource creates an Amazon Cognito user pool.
     *
     * For more information on working with Amazon Cognito user pools, see
     * [Amazon Cognito User Pools](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools.html)
     * and
     * [CreateUserPool](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_CreateUserPool.html)
     * .
     *
     * If you don't specify a value for a parameter, Amazon Cognito sets it to a default value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * Object userPoolTags;
     * CfnUserPool cfnUserPool = CfnUserPool.Builder.create(this, "MyCfnUserPool")
     * .accountRecoverySetting(AccountRecoverySettingProperty.builder()
     * .recoveryMechanisms(List.of(RecoveryOptionProperty.builder()
     * .name("name")
     * .priority(123)
     * .build()))
     * .build())
     * .adminCreateUserConfig(AdminCreateUserConfigProperty.builder()
     * .allowAdminCreateUserOnly(false)
     * .inviteMessageTemplate(InviteMessageTemplateProperty.builder()
     * .emailMessage("emailMessage")
     * .emailSubject("emailSubject")
     * .smsMessage("smsMessage")
     * .build())
     * .unusedAccountValidityDays(123)
     * .build())
     * .aliasAttributes(List.of("aliasAttributes"))
     * .autoVerifiedAttributes(List.of("autoVerifiedAttributes"))
     * .deletionProtection("deletionProtection")
     * .deviceConfiguration(DeviceConfigurationProperty.builder()
     * .challengeRequiredOnNewDevice(false)
     * .deviceOnlyRememberedOnUserPrompt(false)
     * .build())
     * .emailConfiguration(EmailConfigurationProperty.builder()
     * .configurationSet("configurationSet")
     * .emailSendingAccount("emailSendingAccount")
     * .from("from")
     * .replyToEmailAddress("replyToEmailAddress")
     * .sourceArn("sourceArn")
     * .build())
     * .emailVerificationMessage("emailVerificationMessage")
     * .emailVerificationSubject("emailVerificationSubject")
     * .enabledMfas(List.of("enabledMfas"))
     * .lambdaConfig(LambdaConfigProperty.builder()
     * .createAuthChallenge("createAuthChallenge")
     * .customEmailSender(CustomEmailSenderProperty.builder()
     * .lambdaArn("lambdaArn")
     * .lambdaVersion("lambdaVersion")
     * .build())
     * .customMessage("customMessage")
     * .customSmsSender(CustomSMSSenderProperty.builder()
     * .lambdaArn("lambdaArn")
     * .lambdaVersion("lambdaVersion")
     * .build())
     * .defineAuthChallenge("defineAuthChallenge")
     * .kmsKeyId("kmsKeyId")
     * .postAuthentication("postAuthentication")
     * .postConfirmation("postConfirmation")
     * .preAuthentication("preAuthentication")
     * .preSignUp("preSignUp")
     * .preTokenGeneration("preTokenGeneration")
     * .userMigration("userMigration")
     * .verifyAuthChallengeResponse("verifyAuthChallengeResponse")
     * .build())
     * .mfaConfiguration("mfaConfiguration")
     * .policies(PoliciesProperty.builder()
     * .passwordPolicy(PasswordPolicyProperty.builder()
     * .minimumLength(123)
     * .requireLowercase(false)
     * .requireNumbers(false)
     * .requireSymbols(false)
     * .requireUppercase(false)
     * .temporaryPasswordValidityDays(123)
     * .build())
     * .build())
     * .schema(List.of(SchemaAttributeProperty.builder()
     * .attributeDataType("attributeDataType")
     * .developerOnlyAttribute(false)
     * .mutable(false)
     * .name("name")
     * .numberAttributeConstraints(NumberAttributeConstraintsProperty.builder()
     * .maxValue("maxValue")
     * .minValue("minValue")
     * .build())
     * .required(false)
     * .stringAttributeConstraints(StringAttributeConstraintsProperty.builder()
     * .maxLength("maxLength")
     * .minLength("minLength")
     * .build())
     * .build()))
     * .smsAuthenticationMessage("smsAuthenticationMessage")
     * .smsConfiguration(SmsConfigurationProperty.builder()
     * .externalId("externalId")
     * .snsCallerArn("snsCallerArn")
     * .snsRegion("snsRegion")
     * .build())
     * .smsVerificationMessage("smsVerificationMessage")
     * .userAttributeUpdateSettings(UserAttributeUpdateSettingsProperty.builder()
     * .attributesRequireVerificationBeforeUpdate(List.of("attributesRequireVerificationBeforeUpdate"))
     * .build())
     * .usernameAttributes(List.of("usernameAttributes"))
     * .usernameConfiguration(UsernameConfigurationProperty.builder()
     * .caseSensitive(false)
     * .build())
     * .userPoolAddOns(UserPoolAddOnsProperty.builder()
     * .advancedSecurityMode("advancedSecurityMode")
     * .build())
     * .userPoolName("userPoolName")
     * .userPoolTags(userPoolTags)
     * .verificationMessageTemplate(VerificationMessageTemplateProperty.builder()
     * .defaultEmailOption("defaultEmailOption")
     * .emailMessage("emailMessage")
     * .emailMessageByLink("emailMessageByLink")
     * .emailSubject("emailSubject")
     * .emailSubjectByLink("emailSubjectByLink")
     * .smsMessage("smsMessage")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html)
     */
    public inline fun cfnUserPool(
        scope: Construct,
        id: String,
        block: CfnUserPoolDsl.() -> Unit = {},
    ): CfnUserPool {
        val builder = CfnUserPoolDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Use this setting to define which verified available method a user can use to recover their
     * password when they call `ForgotPassword` .
     *
     * It allows you to define a preferred method when a user has more than one method available.
     * With this setting, SMS does not qualify for a valid password recovery mechanism if the user
     * also has SMS MFA enabled. In the absence of this setting, Cognito uses the legacy behavior to
     * determine the recovery method where SMS is preferred over email.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * AccountRecoverySettingProperty accountRecoverySettingProperty =
     * AccountRecoverySettingProperty.builder()
     * .recoveryMechanisms(List.of(RecoveryOptionProperty.builder()
     * .name("name")
     * .priority(123)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-accountrecoverysetting.html)
     */
    public inline fun cfnUserPoolAccountRecoverySettingProperty(
        block: CfnUserPoolAccountRecoverySettingPropertyDsl.() -> Unit = {}
    ): CfnUserPool.AccountRecoverySettingProperty {
        val builder = CfnUserPoolAccountRecoverySettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for `AdminCreateUser` requests.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * AdminCreateUserConfigProperty adminCreateUserConfigProperty =
     * AdminCreateUserConfigProperty.builder()
     * .allowAdminCreateUserOnly(false)
     * .inviteMessageTemplate(InviteMessageTemplateProperty.builder()
     * .emailMessage("emailMessage")
     * .emailSubject("emailSubject")
     * .smsMessage("smsMessage")
     * .build())
     * .unusedAccountValidityDays(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html)
     */
    public inline fun cfnUserPoolAdminCreateUserConfigProperty(
        block: CfnUserPoolAdminCreateUserConfigPropertyDsl.() -> Unit = {}
    ): CfnUserPool.AdminCreateUserConfigProperty {
        val builder = CfnUserPoolAdminCreateUserConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Cognito::UserPoolClient` resource specifies an Amazon Cognito user pool client.
     *
     * If you don't specify a value for a parameter, Amazon Cognito sets it to a default value.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.certificatemanager.*;
     * Vpc vpc;
     * Certificate certificate;
     * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this, "LB")
     * .vpc(vpc)
     * .internetFacing(true)
     * .build();
     * UserPool userPool = new UserPool(this, "UserPool");
     * UserPoolClient userPoolClient = UserPoolClient.Builder.create(this, "Client")
     * .userPool(userPool)
     * // Required minimal configuration for use with an ELB
     * .generateSecret(true)
     * .authFlows(AuthFlow.builder()
     * .userPassword(true)
     * .build())
     * .oAuth(OAuthSettings.builder()
     * .flows(OAuthFlows.builder()
     * .authorizationCodeGrant(true)
     * .build())
     * .scopes(List.of(OAuthScope.EMAIL))
     * .callbackUrls(List.of(String.format("https://%s/oauth2/idpresponse",
     * lb.getLoadBalancerDnsName())))
     * .build())
     * .build();
     * CfnUserPoolClient cfnClient = (CfnUserPoolClient)userPoolClient.getNode().getDefaultChild();
     * cfnClient.addPropertyOverride("RefreshTokenValidity", 1);
     * cfnClient.addPropertyOverride("SupportedIdentityProviders", List.of("COGNITO"));
     * UserPoolDomain userPoolDomain = UserPoolDomain.Builder.create(this, "Domain")
     * .userPool(userPool)
     * .cognitoDomain(CognitoDomainOptions.builder()
     * .domainPrefix("test-cdk-prefix")
     * .build())
     * .build();
     * lb.addListener("Listener", BaseApplicationListenerProps.builder()
     * .port(443)
     * .certificates(List.of(certificate))
     * .defaultAction(AuthenticateCognitoAction.Builder.create()
     * .userPool(userPool)
     * .userPoolClient(userPoolClient)
     * .userPoolDomain(userPoolDomain)
     * .next(ListenerAction.fixedResponse(200, FixedResponseOptions.builder()
     * .contentType("text/plain")
     * .messageBody("Authenticated")
     * .build()))
     * .build())
     * .build());
     * CfnOutput.Builder.create(this, "DNS")
     * .value(lb.getLoadBalancerDnsName())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html)
     */
    public inline fun cfnUserPoolClient(
        scope: Construct,
        id: String,
        block: CfnUserPoolClientDsl.() -> Unit = {},
    ): CfnUserPoolClient {
        val builder = CfnUserPoolClientDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon Pinpoint analytics configuration necessary to collect metrics for a user pool.
     *
     * In Regions where Amazon Pinpoint isn't available, user pools only support sending events to
     * Amazon Pinpoint projects in us-east-1. In Regions where Amazon Pinpoint is available, user
     * pools support sending events to Amazon Pinpoint projects within that same Region.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * AnalyticsConfigurationProperty analyticsConfigurationProperty =
     * AnalyticsConfigurationProperty.builder()
     * .applicationArn("applicationArn")
     * .applicationId("applicationId")
     * .externalId("externalId")
     * .roleArn("roleArn")
     * .userDataShared(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-analyticsconfiguration.html)
     */
    public inline fun cfnUserPoolClientAnalyticsConfigurationProperty(
        block: CfnUserPoolClientAnalyticsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnUserPoolClient.AnalyticsConfigurationProperty {
        val builder = CfnUserPoolClientAnalyticsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserPoolClient`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CfnUserPoolClientProps cfnUserPoolClientProps = CfnUserPoolClientProps.builder()
     * .userPoolId("userPoolId")
     * // the properties below are optional
     * .accessTokenValidity(123)
     * .allowedOAuthFlows(List.of("allowedOAuthFlows"))
     * .allowedOAuthFlowsUserPoolClient(false)
     * .allowedOAuthScopes(List.of("allowedOAuthScopes"))
     * .analyticsConfiguration(AnalyticsConfigurationProperty.builder()
     * .applicationArn("applicationArn")
     * .applicationId("applicationId")
     * .externalId("externalId")
     * .roleArn("roleArn")
     * .userDataShared(false)
     * .build())
     * .authSessionValidity(123)
     * .callbackUrLs(List.of("callbackUrLs"))
     * .clientName("clientName")
     * .defaultRedirectUri("defaultRedirectUri")
     * .enablePropagateAdditionalUserContextData(false)
     * .enableTokenRevocation(false)
     * .explicitAuthFlows(List.of("explicitAuthFlows"))
     * .generateSecret(false)
     * .idTokenValidity(123)
     * .logoutUrLs(List.of("logoutUrLs"))
     * .preventUserExistenceErrors("preventUserExistenceErrors")
     * .readAttributes(List.of("readAttributes"))
     * .refreshTokenValidity(123)
     * .supportedIdentityProviders(List.of("supportedIdentityProviders"))
     * .tokenValidityUnits(TokenValidityUnitsProperty.builder()
     * .accessToken("accessToken")
     * .idToken("idToken")
     * .refreshToken("refreshToken")
     * .build())
     * .writeAttributes(List.of("writeAttributes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolclient.html)
     */
    public inline fun cfnUserPoolClientProps(
        block: CfnUserPoolClientPropsDsl.() -> Unit = {}
    ): CfnUserPoolClientProps {
        val builder = CfnUserPoolClientPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The time units you use when you set the duration of ID, access, and refresh tokens.
     *
     * The default unit for RefreshToken is days, and the default for ID and access tokens is hours.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * TokenValidityUnitsProperty tokenValidityUnitsProperty = TokenValidityUnitsProperty.builder()
     * .accessToken("accessToken")
     * .idToken("idToken")
     * .refreshToken("refreshToken")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolclient-tokenvalidityunits.html)
     */
    public inline fun cfnUserPoolClientTokenValidityUnitsProperty(
        block: CfnUserPoolClientTokenValidityUnitsPropertyDsl.() -> Unit = {}
    ): CfnUserPoolClient.TokenValidityUnitsProperty {
        val builder = CfnUserPoolClientTokenValidityUnitsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom email sender AWS Lambda trigger.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CustomEmailSenderProperty customEmailSenderProperty = CustomEmailSenderProperty.builder()
     * .lambdaArn("lambdaArn")
     * .lambdaVersion("lambdaVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customemailsender.html)
     */
    public inline fun cfnUserPoolCustomEmailSenderProperty(
        block: CfnUserPoolCustomEmailSenderPropertyDsl.() -> Unit = {}
    ): CfnUserPool.CustomEmailSenderProperty {
        val builder = CfnUserPoolCustomEmailSenderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom SMS sender AWS Lambda trigger.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CustomSMSSenderProperty customSMSSenderProperty = CustomSMSSenderProperty.builder()
     * .lambdaArn("lambdaArn")
     * .lambdaVersion("lambdaVersion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customsmssender.html)
     */
    public inline fun cfnUserPoolCustomSMSSenderProperty(
        block: CfnUserPoolCustomSMSSenderPropertyDsl.() -> Unit = {}
    ): CfnUserPool.CustomSMSSenderProperty {
        val builder = CfnUserPoolCustomSMSSenderPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The device-remembering configuration for a user pool.
     *
     * A
     * [DescribeUserPool](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeUserPool.html)
     * request returns a null value for this object when the user pool isn't configured to remember
     * devices. When device remembering is active, you can remember a user's device with a
     * [ConfirmDevice](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_ConfirmDevice.html)
     * API request. Additionally. when the property `DeviceOnlyRememberedOnUserPrompt` is `true` ,
     * you must follow `ConfirmDevice` with an
     * [UpdateDeviceStatus](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UpdateDeviceStatus.html)
     * API request that sets the user's device to `remembered` or `not_remembered` .
     *
     * To sign in with a remembered device, include `DEVICE_KEY` in the authentication parameters in
     * your user's
     * [InitiateAuth](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html)
     * request. If your app doesn't include a `DEVICE_KEY` parameter, the
     * [response](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_InitiateAuth.html#API_InitiateAuth_ResponseSyntax)
     * from Amazon Cognito includes newly-generated `DEVICE_KEY` and `DEVICE_GROUP_KEY` values under
     * `NewDeviceMetadata` . Store these values to use in future device-authentication requests.
     *
     * When you provide a value for any property of `DeviceConfiguration` , you activate the device
     * remembering for the user pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * DeviceConfigurationProperty deviceConfigurationProperty = DeviceConfigurationProperty.builder()
     * .challengeRequiredOnNewDevice(false)
     * .deviceOnlyRememberedOnUserPrompt(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html)
     */
    public inline fun cfnUserPoolDeviceConfigurationProperty(
        block: CfnUserPoolDeviceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnUserPool.DeviceConfigurationProperty {
        val builder = CfnUserPoolDeviceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::Cognito::UserPoolDomain resource creates a new domain for a user pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CfnUserPoolDomain cfnUserPoolDomain = CfnUserPoolDomain.Builder.create(this,
     * "MyCfnUserPoolDomain")
     * .domain("domain")
     * .userPoolId("userPoolId")
     * // the properties below are optional
     * .customDomainConfig(CustomDomainConfigTypeProperty.builder()
     * .certificateArn("certificateArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html)
     */
    public inline fun cfnUserPoolDomain(
        scope: Construct,
        id: String,
        block: CfnUserPoolDomainDsl.() -> Unit = {},
    ): CfnUserPoolDomain {
        val builder = CfnUserPoolDomainDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your
     * application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CustomDomainConfigTypeProperty customDomainConfigTypeProperty =
     * CustomDomainConfigTypeProperty.builder()
     * .certificateArn("certificateArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooldomain-customdomainconfigtype.html)
     */
    public inline fun cfnUserPoolDomainCustomDomainConfigTypeProperty(
        block: CfnUserPoolDomainCustomDomainConfigTypePropertyDsl.() -> Unit = {}
    ): CfnUserPoolDomain.CustomDomainConfigTypeProperty {
        val builder = CfnUserPoolDomainCustomDomainConfigTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserPoolDomain`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CfnUserPoolDomainProps cfnUserPoolDomainProps = CfnUserPoolDomainProps.builder()
     * .domain("domain")
     * .userPoolId("userPoolId")
     * // the properties below are optional
     * .customDomainConfig(CustomDomainConfigTypeProperty.builder()
     * .certificateArn("certificateArn")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html)
     */
    public inline fun cfnUserPoolDomainProps(
        block: CfnUserPoolDomainPropsDsl.() -> Unit = {}
    ): CfnUserPoolDomainProps {
        val builder = CfnUserPoolDomainPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The email configuration of your user pool.
     *
     * The email configuration type sets your preferred sending method, AWS Region, and sender for
     * messages from your user pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * EmailConfigurationProperty emailConfigurationProperty = EmailConfigurationProperty.builder()
     * .configurationSet("configurationSet")
     * .emailSendingAccount("emailSendingAccount")
     * .from("from")
     * .replyToEmailAddress("replyToEmailAddress")
     * .sourceArn("sourceArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-emailconfiguration.html)
     */
    public inline fun cfnUserPoolEmailConfigurationProperty(
        block: CfnUserPoolEmailConfigurationPropertyDsl.() -> Unit = {}
    ): CfnUserPool.EmailConfigurationProperty {
        val builder = CfnUserPoolEmailConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a new group in the identified user pool.
     *
     * Calling this action requires developer credentials.
     *
     * If you don't specify a value for a parameter, Amazon Cognito sets it to a default value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CfnUserPoolGroup cfnUserPoolGroup = CfnUserPoolGroup.Builder.create(this, "MyCfnUserPoolGroup")
     * .userPoolId("userPoolId")
     * // the properties below are optional
     * .description("description")
     * .groupName("groupName")
     * .precedence(123)
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html)
     */
    public inline fun cfnUserPoolGroup(
        scope: Construct,
        id: String,
        block: CfnUserPoolGroupDsl.() -> Unit = {},
    ): CfnUserPoolGroup {
        val builder = CfnUserPoolGroupDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserPoolGroup`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CfnUserPoolGroupProps cfnUserPoolGroupProps = CfnUserPoolGroupProps.builder()
     * .userPoolId("userPoolId")
     * // the properties below are optional
     * .description("description")
     * .groupName("groupName")
     * .precedence(123)
     * .roleArn("roleArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolgroup.html)
     */
    public inline fun cfnUserPoolGroupProps(
        block: CfnUserPoolGroupPropsDsl.() -> Unit = {}
    ): CfnUserPoolGroupProps {
        val builder = CfnUserPoolGroupPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Cognito::UserPoolIdentityProvider` resource creates an identity provider for a user
     * pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * Object attributeMapping;
     * Object providerDetails;
     * CfnUserPoolIdentityProvider cfnUserPoolIdentityProvider =
     * CfnUserPoolIdentityProvider.Builder.create(this, "MyCfnUserPoolIdentityProvider")
     * .providerName("providerName")
     * .providerType("providerType")
     * .userPoolId("userPoolId")
     * // the properties below are optional
     * .attributeMapping(attributeMapping)
     * .idpIdentifiers(List.of("idpIdentifiers"))
     * .providerDetails(providerDetails)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html)
     */
    public inline fun cfnUserPoolIdentityProvider(
        scope: Construct,
        id: String,
        block: CfnUserPoolIdentityProviderDsl.() -> Unit = {},
    ): CfnUserPoolIdentityProvider {
        val builder = CfnUserPoolIdentityProviderDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserPoolIdentityProvider`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * Object attributeMapping;
     * Object providerDetails;
     * CfnUserPoolIdentityProviderProps cfnUserPoolIdentityProviderProps =
     * CfnUserPoolIdentityProviderProps.builder()
     * .providerName("providerName")
     * .providerType("providerType")
     * .userPoolId("userPoolId")
     * // the properties below are optional
     * .attributeMapping(attributeMapping)
     * .idpIdentifiers(List.of("idpIdentifiers"))
     * .providerDetails(providerDetails)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html)
     */
    public inline fun cfnUserPoolIdentityProviderProps(
        block: CfnUserPoolIdentityProviderPropsDsl.() -> Unit = {}
    ): CfnUserPoolIdentityProviderProps {
        val builder = CfnUserPoolIdentityProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The message template to be used for the welcome message to new users.
     *
     * See also
     * [Customizing User Invitation Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * InviteMessageTemplateProperty inviteMessageTemplateProperty =
     * InviteMessageTemplateProperty.builder()
     * .emailMessage("emailMessage")
     * .emailSubject("emailSubject")
     * .smsMessage("smsMessage")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html)
     */
    public inline fun cfnUserPoolInviteMessageTemplateProperty(
        block: CfnUserPoolInviteMessageTemplatePropertyDsl.() -> Unit = {}
    ): CfnUserPool.InviteMessageTemplateProperty {
        val builder = CfnUserPoolInviteMessageTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies the configuration for AWS Lambda triggers.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * LambdaConfigProperty lambdaConfigProperty = LambdaConfigProperty.builder()
     * .createAuthChallenge("createAuthChallenge")
     * .customEmailSender(CustomEmailSenderProperty.builder()
     * .lambdaArn("lambdaArn")
     * .lambdaVersion("lambdaVersion")
     * .build())
     * .customMessage("customMessage")
     * .customSmsSender(CustomSMSSenderProperty.builder()
     * .lambdaArn("lambdaArn")
     * .lambdaVersion("lambdaVersion")
     * .build())
     * .defineAuthChallenge("defineAuthChallenge")
     * .kmsKeyId("kmsKeyId")
     * .postAuthentication("postAuthentication")
     * .postConfirmation("postConfirmation")
     * .preAuthentication("preAuthentication")
     * .preSignUp("preSignUp")
     * .preTokenGeneration("preTokenGeneration")
     * .userMigration("userMigration")
     * .verifyAuthChallengeResponse("verifyAuthChallengeResponse")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-lambdaconfig.html)
     */
    public inline fun cfnUserPoolLambdaConfigProperty(
        block: CfnUserPoolLambdaConfigPropertyDsl.() -> Unit = {}
    ): CfnUserPool.LambdaConfigProperty {
        val builder = CfnUserPoolLambdaConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The minimum and maximum values of an attribute that is of the number data type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * NumberAttributeConstraintsProperty numberAttributeConstraintsProperty =
     * NumberAttributeConstraintsProperty.builder()
     * .maxValue("maxValue")
     * .minValue("minValue")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html)
     */
    public inline fun cfnUserPoolNumberAttributeConstraintsProperty(
        block: CfnUserPoolNumberAttributeConstraintsPropertyDsl.() -> Unit = {}
    ): CfnUserPool.NumberAttributeConstraintsProperty {
        val builder = CfnUserPoolNumberAttributeConstraintsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The password policy type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * PasswordPolicyProperty passwordPolicyProperty = PasswordPolicyProperty.builder()
     * .minimumLength(123)
     * .requireLowercase(false)
     * .requireNumbers(false)
     * .requireSymbols(false)
     * .requireUppercase(false)
     * .temporaryPasswordValidityDays(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-passwordpolicy.html)
     */
    public inline fun cfnUserPoolPasswordPolicyProperty(
        block: CfnUserPoolPasswordPolicyPropertyDsl.() -> Unit = {}
    ): CfnUserPool.PasswordPolicyProperty {
        val builder = CfnUserPoolPasswordPolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The policy associated with a user pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * PoliciesProperty policiesProperty = PoliciesProperty.builder()
     * .passwordPolicy(PasswordPolicyProperty.builder()
     * .minimumLength(123)
     * .requireLowercase(false)
     * .requireNumbers(false)
     * .requireSymbols(false)
     * .requireUppercase(false)
     * .temporaryPasswordValidityDays(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-policies.html)
     */
    public inline fun cfnUserPoolPoliciesProperty(
        block: CfnUserPoolPoliciesPropertyDsl.() -> Unit = {}
    ): CfnUserPool.PoliciesProperty {
        val builder = CfnUserPoolPoliciesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserPool`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * Object userPoolTags;
     * CfnUserPoolProps cfnUserPoolProps = CfnUserPoolProps.builder()
     * .accountRecoverySetting(AccountRecoverySettingProperty.builder()
     * .recoveryMechanisms(List.of(RecoveryOptionProperty.builder()
     * .name("name")
     * .priority(123)
     * .build()))
     * .build())
     * .adminCreateUserConfig(AdminCreateUserConfigProperty.builder()
     * .allowAdminCreateUserOnly(false)
     * .inviteMessageTemplate(InviteMessageTemplateProperty.builder()
     * .emailMessage("emailMessage")
     * .emailSubject("emailSubject")
     * .smsMessage("smsMessage")
     * .build())
     * .unusedAccountValidityDays(123)
     * .build())
     * .aliasAttributes(List.of("aliasAttributes"))
     * .autoVerifiedAttributes(List.of("autoVerifiedAttributes"))
     * .deletionProtection("deletionProtection")
     * .deviceConfiguration(DeviceConfigurationProperty.builder()
     * .challengeRequiredOnNewDevice(false)
     * .deviceOnlyRememberedOnUserPrompt(false)
     * .build())
     * .emailConfiguration(EmailConfigurationProperty.builder()
     * .configurationSet("configurationSet")
     * .emailSendingAccount("emailSendingAccount")
     * .from("from")
     * .replyToEmailAddress("replyToEmailAddress")
     * .sourceArn("sourceArn")
     * .build())
     * .emailVerificationMessage("emailVerificationMessage")
     * .emailVerificationSubject("emailVerificationSubject")
     * .enabledMfas(List.of("enabledMfas"))
     * .lambdaConfig(LambdaConfigProperty.builder()
     * .createAuthChallenge("createAuthChallenge")
     * .customEmailSender(CustomEmailSenderProperty.builder()
     * .lambdaArn("lambdaArn")
     * .lambdaVersion("lambdaVersion")
     * .build())
     * .customMessage("customMessage")
     * .customSmsSender(CustomSMSSenderProperty.builder()
     * .lambdaArn("lambdaArn")
     * .lambdaVersion("lambdaVersion")
     * .build())
     * .defineAuthChallenge("defineAuthChallenge")
     * .kmsKeyId("kmsKeyId")
     * .postAuthentication("postAuthentication")
     * .postConfirmation("postConfirmation")
     * .preAuthentication("preAuthentication")
     * .preSignUp("preSignUp")
     * .preTokenGeneration("preTokenGeneration")
     * .userMigration("userMigration")
     * .verifyAuthChallengeResponse("verifyAuthChallengeResponse")
     * .build())
     * .mfaConfiguration("mfaConfiguration")
     * .policies(PoliciesProperty.builder()
     * .passwordPolicy(PasswordPolicyProperty.builder()
     * .minimumLength(123)
     * .requireLowercase(false)
     * .requireNumbers(false)
     * .requireSymbols(false)
     * .requireUppercase(false)
     * .temporaryPasswordValidityDays(123)
     * .build())
     * .build())
     * .schema(List.of(SchemaAttributeProperty.builder()
     * .attributeDataType("attributeDataType")
     * .developerOnlyAttribute(false)
     * .mutable(false)
     * .name("name")
     * .numberAttributeConstraints(NumberAttributeConstraintsProperty.builder()
     * .maxValue("maxValue")
     * .minValue("minValue")
     * .build())
     * .required(false)
     * .stringAttributeConstraints(StringAttributeConstraintsProperty.builder()
     * .maxLength("maxLength")
     * .minLength("minLength")
     * .build())
     * .build()))
     * .smsAuthenticationMessage("smsAuthenticationMessage")
     * .smsConfiguration(SmsConfigurationProperty.builder()
     * .externalId("externalId")
     * .snsCallerArn("snsCallerArn")
     * .snsRegion("snsRegion")
     * .build())
     * .smsVerificationMessage("smsVerificationMessage")
     * .userAttributeUpdateSettings(UserAttributeUpdateSettingsProperty.builder()
     * .attributesRequireVerificationBeforeUpdate(List.of("attributesRequireVerificationBeforeUpdate"))
     * .build())
     * .usernameAttributes(List.of("usernameAttributes"))
     * .usernameConfiguration(UsernameConfigurationProperty.builder()
     * .caseSensitive(false)
     * .build())
     * .userPoolAddOns(UserPoolAddOnsProperty.builder()
     * .advancedSecurityMode("advancedSecurityMode")
     * .build())
     * .userPoolName("userPoolName")
     * .userPoolTags(userPoolTags)
     * .verificationMessageTemplate(VerificationMessageTemplateProperty.builder()
     * .defaultEmailOption("defaultEmailOption")
     * .emailMessage("emailMessage")
     * .emailMessageByLink("emailMessageByLink")
     * .emailSubject("emailSubject")
     * .emailSubjectByLink("emailSubjectByLink")
     * .smsMessage("smsMessage")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpool.html)
     */
    public inline fun cfnUserPoolProps(
        block: CfnUserPoolPropsDsl.() -> Unit = {}
    ): CfnUserPoolProps {
        val builder = CfnUserPoolPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A map containing a priority as a key, and recovery method name as a value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * RecoveryOptionProperty recoveryOptionProperty = RecoveryOptionProperty.builder()
     * .name("name")
     * .priority(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-recoveryoption.html)
     */
    public inline fun cfnUserPoolRecoveryOptionProperty(
        block: CfnUserPoolRecoveryOptionPropertyDsl.() -> Unit = {}
    ): CfnUserPool.RecoveryOptionProperty {
        val builder = CfnUserPoolRecoveryOptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Cognito::UserPoolResourceServer` resource creates a new OAuth2.0 resource server
     * and defines custom scopes in it.
     *
     * If you don't specify a value for a parameter, Amazon Cognito sets it to a default value.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CfnUserPoolResourceServer cfnUserPoolResourceServer =
     * CfnUserPoolResourceServer.Builder.create(this, "MyCfnUserPoolResourceServer")
     * .identifier("identifier")
     * .name("name")
     * .userPoolId("userPoolId")
     * // the properties below are optional
     * .scopes(List.of(ResourceServerScopeTypeProperty.builder()
     * .scopeDescription("scopeDescription")
     * .scopeName("scopeName")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html)
     */
    public inline fun cfnUserPoolResourceServer(
        scope: Construct,
        id: String,
        block: CfnUserPoolResourceServerDsl.() -> Unit = {},
    ): CfnUserPoolResourceServer {
        val builder = CfnUserPoolResourceServerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserPoolResourceServer`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CfnUserPoolResourceServerProps cfnUserPoolResourceServerProps =
     * CfnUserPoolResourceServerProps.builder()
     * .identifier("identifier")
     * .name("name")
     * .userPoolId("userPoolId")
     * // the properties below are optional
     * .scopes(List.of(ResourceServerScopeTypeProperty.builder()
     * .scopeDescription("scopeDescription")
     * .scopeName("scopeName")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolresourceserver.html)
     */
    public inline fun cfnUserPoolResourceServerProps(
        block: CfnUserPoolResourceServerPropsDsl.() -> Unit = {}
    ): CfnUserPoolResourceServerProps {
        val builder = CfnUserPoolResourceServerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A resource server scope.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * ResourceServerScopeTypeProperty resourceServerScopeTypeProperty =
     * ResourceServerScopeTypeProperty.builder()
     * .scopeDescription("scopeDescription")
     * .scopeName("scopeName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolresourceserver-resourceserverscopetype.html)
     */
    public inline fun cfnUserPoolResourceServerResourceServerScopeTypeProperty(
        block: CfnUserPoolResourceServerResourceServerScopeTypePropertyDsl.() -> Unit = {}
    ): CfnUserPoolResourceServer.ResourceServerScopeTypeProperty {
        val builder = CfnUserPoolResourceServerResourceServerScopeTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Cognito::UserPoolRiskConfigurationAttachment` resource sets the risk configuration
     * that is used for Amazon Cognito advanced security features.
     *
     * You can specify risk configuration for a single client (with a specific `clientId` ) or for
     * all clients (by setting the `clientId` to `ALL` ). If you specify `ALL` , the default
     * configuration is used for every client that has had no risk configuration set previously. If
     * you specify risk configuration for a particular client, it no longer falls back to the `ALL`
     * configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CfnUserPoolRiskConfigurationAttachment cfnUserPoolRiskConfigurationAttachment =
     * CfnUserPoolRiskConfigurationAttachment.Builder.create(this,
     * "MyCfnUserPoolRiskConfigurationAttachment")
     * .clientId("clientId")
     * .userPoolId("userPoolId")
     * // the properties below are optional
     * .accountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationTypeProperty.builder()
     * .actions(AccountTakeoverActionsTypeProperty.builder()
     * .highAction(AccountTakeoverActionTypeProperty.builder()
     * .eventAction("eventAction")
     * .notify(false)
     * .build())
     * .lowAction(AccountTakeoverActionTypeProperty.builder()
     * .eventAction("eventAction")
     * .notify(false)
     * .build())
     * .mediumAction(AccountTakeoverActionTypeProperty.builder()
     * .eventAction("eventAction")
     * .notify(false)
     * .build())
     * .build())
     * // the properties below are optional
     * .notifyConfiguration(NotifyConfigurationTypeProperty.builder()
     * .sourceArn("sourceArn")
     * // the properties below are optional
     * .blockEmail(NotifyEmailTypeProperty.builder()
     * .subject("subject")
     * // the properties below are optional
     * .htmlBody("htmlBody")
     * .textBody("textBody")
     * .build())
     * .from("from")
     * .mfaEmail(NotifyEmailTypeProperty.builder()
     * .subject("subject")
     * // the properties below are optional
     * .htmlBody("htmlBody")
     * .textBody("textBody")
     * .build())
     * .noActionEmail(NotifyEmailTypeProperty.builder()
     * .subject("subject")
     * // the properties below are optional
     * .htmlBody("htmlBody")
     * .textBody("textBody")
     * .build())
     * .replyTo("replyTo")
     * .build())
     * .build())
     * .compromisedCredentialsRiskConfiguration(CompromisedCredentialsRiskConfigurationTypeProperty.builder()
     * .actions(CompromisedCredentialsActionsTypeProperty.builder()
     * .eventAction("eventAction")
     * .build())
     * // the properties below are optional
     * .eventFilter(List.of("eventFilter"))
     * .build())
     * .riskExceptionConfiguration(RiskExceptionConfigurationTypeProperty.builder()
     * .blockedIpRangeList(List.of("blockedIpRangeList"))
     * .skippedIpRangeList(List.of("skippedIpRangeList"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html)
     */
    public inline fun cfnUserPoolRiskConfigurationAttachment(
        scope: Construct,
        id: String,
        block: CfnUserPoolRiskConfigurationAttachmentDsl.() -> Unit = {},
    ): CfnUserPoolRiskConfigurationAttachment {
        val builder = CfnUserPoolRiskConfigurationAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Account takeover action type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * AccountTakeoverActionTypeProperty accountTakeoverActionTypeProperty =
     * AccountTakeoverActionTypeProperty.builder()
     * .eventAction("eventAction")
     * .notify(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html)
     */
    public inline fun cfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionTypeProperty(
        block:
            CfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionTypePropertyDsl.() -> Unit =
            {}
    ): CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionTypeProperty {
        val builder = CfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Account takeover actions type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * AccountTakeoverActionsTypeProperty accountTakeoverActionsTypeProperty =
     * AccountTakeoverActionsTypeProperty.builder()
     * .highAction(AccountTakeoverActionTypeProperty.builder()
     * .eventAction("eventAction")
     * .notify(false)
     * .build())
     * .lowAction(AccountTakeoverActionTypeProperty.builder()
     * .eventAction("eventAction")
     * .notify(false)
     * .build())
     * .mediumAction(AccountTakeoverActionTypeProperty.builder()
     * .eventAction("eventAction")
     * .notify(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html)
     */
    public inline fun cfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionsTypeProperty(
        block:
            CfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionsTypePropertyDsl.() -> Unit =
            {}
    ): CfnUserPoolRiskConfigurationAttachment.AccountTakeoverActionsTypeProperty {
        val builder = CfnUserPoolRiskConfigurationAttachmentAccountTakeoverActionsTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for mitigation actions and notification for different levels of risk detected
     * for a potential account takeover.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * AccountTakeoverRiskConfigurationTypeProperty accountTakeoverRiskConfigurationTypeProperty =
     * AccountTakeoverRiskConfigurationTypeProperty.builder()
     * .actions(AccountTakeoverActionsTypeProperty.builder()
     * .highAction(AccountTakeoverActionTypeProperty.builder()
     * .eventAction("eventAction")
     * .notify(false)
     * .build())
     * .lowAction(AccountTakeoverActionTypeProperty.builder()
     * .eventAction("eventAction")
     * .notify(false)
     * .build())
     * .mediumAction(AccountTakeoverActionTypeProperty.builder()
     * .eventAction("eventAction")
     * .notify(false)
     * .build())
     * .build())
     * // the properties below are optional
     * .notifyConfiguration(NotifyConfigurationTypeProperty.builder()
     * .sourceArn("sourceArn")
     * // the properties below are optional
     * .blockEmail(NotifyEmailTypeProperty.builder()
     * .subject("subject")
     * // the properties below are optional
     * .htmlBody("htmlBody")
     * .textBody("textBody")
     * .build())
     * .from("from")
     * .mfaEmail(NotifyEmailTypeProperty.builder()
     * .subject("subject")
     * // the properties below are optional
     * .htmlBody("htmlBody")
     * .textBody("textBody")
     * .build())
     * .noActionEmail(NotifyEmailTypeProperty.builder()
     * .subject("subject")
     * // the properties below are optional
     * .htmlBody("htmlBody")
     * .textBody("textBody")
     * .build())
     * .replyTo("replyTo")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoverriskconfigurationtype.html)
     */
    public inline fun cfnUserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationTypeProperty(
        block:
            CfnUserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationTypePropertyDsl.(
            ) -> Unit =
            {}
    ): CfnUserPoolRiskConfigurationAttachment.AccountTakeoverRiskConfigurationTypeProperty {
        val builder =
            CfnUserPoolRiskConfigurationAttachmentAccountTakeoverRiskConfigurationTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The compromised credentials actions type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CompromisedCredentialsActionsTypeProperty compromisedCredentialsActionsTypeProperty =
     * CompromisedCredentialsActionsTypeProperty.builder()
     * .eventAction("eventAction")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsactionstype.html)
     */
    public inline fun cfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsTypeProperty(
        block:
            CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsTypePropertyDsl.(
            ) -> Unit =
            {}
    ): CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty {
        val builder =
            CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The compromised credentials risk configuration type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CompromisedCredentialsRiskConfigurationTypeProperty
     * compromisedCredentialsRiskConfigurationTypeProperty =
     * CompromisedCredentialsRiskConfigurationTypeProperty.builder()
     * .actions(CompromisedCredentialsActionsTypeProperty.builder()
     * .eventAction("eventAction")
     * .build())
     * // the properties below are optional
     * .eventFilter(List.of("eventFilter"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-compromisedcredentialsriskconfigurationtype.html)
     */
    public inline fun cfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationTypeProperty(
        block:
            CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationTypePropertyDsl.(
            ) -> Unit =
            {}
    ): CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsRiskConfigurationTypeProperty {
        val builder =
            CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsRiskConfigurationTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The notify configuration type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * NotifyConfigurationTypeProperty notifyConfigurationTypeProperty =
     * NotifyConfigurationTypeProperty.builder()
     * .sourceArn("sourceArn")
     * // the properties below are optional
     * .blockEmail(NotifyEmailTypeProperty.builder()
     * .subject("subject")
     * // the properties below are optional
     * .htmlBody("htmlBody")
     * .textBody("textBody")
     * .build())
     * .from("from")
     * .mfaEmail(NotifyEmailTypeProperty.builder()
     * .subject("subject")
     * // the properties below are optional
     * .htmlBody("htmlBody")
     * .textBody("textBody")
     * .build())
     * .noActionEmail(NotifyEmailTypeProperty.builder()
     * .subject("subject")
     * // the properties below are optional
     * .htmlBody("htmlBody")
     * .textBody("textBody")
     * .build())
     * .replyTo("replyTo")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyconfigurationtype.html)
     */
    public inline fun cfnUserPoolRiskConfigurationAttachmentNotifyConfigurationTypeProperty(
        block: CfnUserPoolRiskConfigurationAttachmentNotifyConfigurationTypePropertyDsl.() -> Unit =
            {}
    ): CfnUserPoolRiskConfigurationAttachment.NotifyConfigurationTypeProperty {
        val builder = CfnUserPoolRiskConfigurationAttachmentNotifyConfigurationTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The notify email type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * NotifyEmailTypeProperty notifyEmailTypeProperty = NotifyEmailTypeProperty.builder()
     * .subject("subject")
     * // the properties below are optional
     * .htmlBody("htmlBody")
     * .textBody("textBody")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-notifyemailtype.html)
     */
    public inline fun cfnUserPoolRiskConfigurationAttachmentNotifyEmailTypeProperty(
        block: CfnUserPoolRiskConfigurationAttachmentNotifyEmailTypePropertyDsl.() -> Unit = {}
    ): CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty {
        val builder = CfnUserPoolRiskConfigurationAttachmentNotifyEmailTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserPoolRiskConfigurationAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CfnUserPoolRiskConfigurationAttachmentProps cfnUserPoolRiskConfigurationAttachmentProps =
     * CfnUserPoolRiskConfigurationAttachmentProps.builder()
     * .clientId("clientId")
     * .userPoolId("userPoolId")
     * // the properties below are optional
     * .accountTakeoverRiskConfiguration(AccountTakeoverRiskConfigurationTypeProperty.builder()
     * .actions(AccountTakeoverActionsTypeProperty.builder()
     * .highAction(AccountTakeoverActionTypeProperty.builder()
     * .eventAction("eventAction")
     * .notify(false)
     * .build())
     * .lowAction(AccountTakeoverActionTypeProperty.builder()
     * .eventAction("eventAction")
     * .notify(false)
     * .build())
     * .mediumAction(AccountTakeoverActionTypeProperty.builder()
     * .eventAction("eventAction")
     * .notify(false)
     * .build())
     * .build())
     * // the properties below are optional
     * .notifyConfiguration(NotifyConfigurationTypeProperty.builder()
     * .sourceArn("sourceArn")
     * // the properties below are optional
     * .blockEmail(NotifyEmailTypeProperty.builder()
     * .subject("subject")
     * // the properties below are optional
     * .htmlBody("htmlBody")
     * .textBody("textBody")
     * .build())
     * .from("from")
     * .mfaEmail(NotifyEmailTypeProperty.builder()
     * .subject("subject")
     * // the properties below are optional
     * .htmlBody("htmlBody")
     * .textBody("textBody")
     * .build())
     * .noActionEmail(NotifyEmailTypeProperty.builder()
     * .subject("subject")
     * // the properties below are optional
     * .htmlBody("htmlBody")
     * .textBody("textBody")
     * .build())
     * .replyTo("replyTo")
     * .build())
     * .build())
     * .compromisedCredentialsRiskConfiguration(CompromisedCredentialsRiskConfigurationTypeProperty.builder()
     * .actions(CompromisedCredentialsActionsTypeProperty.builder()
     * .eventAction("eventAction")
     * .build())
     * // the properties below are optional
     * .eventFilter(List.of("eventFilter"))
     * .build())
     * .riskExceptionConfiguration(RiskExceptionConfigurationTypeProperty.builder()
     * .blockedIpRangeList(List.of("blockedIpRangeList"))
     * .skippedIpRangeList(List.of("skippedIpRangeList"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolriskconfigurationattachment.html)
     */
    public inline fun cfnUserPoolRiskConfigurationAttachmentProps(
        block: CfnUserPoolRiskConfigurationAttachmentPropsDsl.() -> Unit = {}
    ): CfnUserPoolRiskConfigurationAttachmentProps {
        val builder = CfnUserPoolRiskConfigurationAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The type of the configuration to override the risk decision.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * RiskExceptionConfigurationTypeProperty riskExceptionConfigurationTypeProperty =
     * RiskExceptionConfigurationTypeProperty.builder()
     * .blockedIpRangeList(List.of("blockedIpRangeList"))
     * .skippedIpRangeList(List.of("skippedIpRangeList"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-riskexceptionconfigurationtype.html)
     */
    public inline fun cfnUserPoolRiskConfigurationAttachmentRiskExceptionConfigurationTypeProperty(
        block:
            CfnUserPoolRiskConfigurationAttachmentRiskExceptionConfigurationTypePropertyDsl.(
            ) -> Unit =
            {}
    ): CfnUserPoolRiskConfigurationAttachment.RiskExceptionConfigurationTypeProperty {
        val builder =
            CfnUserPoolRiskConfigurationAttachmentRiskExceptionConfigurationTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains information about the schema attribute.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * SchemaAttributeProperty schemaAttributeProperty = SchemaAttributeProperty.builder()
     * .attributeDataType("attributeDataType")
     * .developerOnlyAttribute(false)
     * .mutable(false)
     * .name("name")
     * .numberAttributeConstraints(NumberAttributeConstraintsProperty.builder()
     * .maxValue("maxValue")
     * .minValue("minValue")
     * .build())
     * .required(false)
     * .stringAttributeConstraints(StringAttributeConstraintsProperty.builder()
     * .maxLength("maxLength")
     * .minLength("minLength")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html)
     */
    public inline fun cfnUserPoolSchemaAttributeProperty(
        block: CfnUserPoolSchemaAttributePropertyDsl.() -> Unit = {}
    ): CfnUserPool.SchemaAttributeProperty {
        val builder = CfnUserPoolSchemaAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The SMS configuration type that includes the settings the Cognito User Pool needs to call for
     * the Amazon SNS service to send an SMS message from your AWS account .
     *
     * The Cognito User Pool makes the request to the Amazon SNS Service by using an IAM role that
     * you provide for your AWS account .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * SmsConfigurationProperty smsConfigurationProperty = SmsConfigurationProperty.builder()
     * .externalId("externalId")
     * .snsCallerArn("snsCallerArn")
     * .snsRegion("snsRegion")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html)
     */
    public inline fun cfnUserPoolSmsConfigurationProperty(
        block: CfnUserPoolSmsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnUserPool.SmsConfigurationProperty {
        val builder = CfnUserPoolSmsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `StringAttributeConstraints` property type defines the string attribute constraints of an
     * Amazon Cognito user pool.
     *
     * `StringAttributeConstraints` is a subproperty of the
     * [SchemaAttribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * StringAttributeConstraintsProperty stringAttributeConstraintsProperty =
     * StringAttributeConstraintsProperty.builder()
     * .maxLength("maxLength")
     * .minLength("minLength")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html)
     */
    public inline fun cfnUserPoolStringAttributeConstraintsProperty(
        block: CfnUserPoolStringAttributeConstraintsPropertyDsl.() -> Unit = {}
    ): CfnUserPool.StringAttributeConstraintsProperty {
        val builder = CfnUserPoolStringAttributeConstraintsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Cognito::UserPoolUICustomizationAttachment` resource sets the UI customization
     * information for a user pool's built-in app UI.
     *
     * You can specify app UI customization settings for a single client (with a specific `clientId`
     * ) or for all clients (by setting the `clientId` to `ALL` ). If you specify `ALL` , the
     * default configuration is used for every client that has had no UI customization set
     * previously. If you specify UI customization settings for a particular client, it no longer
     * falls back to the `ALL` configuration.
     *
     * Before you create this resource, your user pool must have a domain associated with it. You
     * can create an `AWS::Cognito::UserPoolDomain` resource first in this user pool.
     *
     * Setting a logo image isn't supported from AWS CloudFormation . Use the Amazon Cognito
     * [SetUICustomization](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUICustomization.html#API_SetUICustomization_RequestSyntax)
     * API operation to set the image.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CfnUserPoolUICustomizationAttachment cfnUserPoolUICustomizationAttachment =
     * CfnUserPoolUICustomizationAttachment.Builder.create(this,
     * "MyCfnUserPoolUICustomizationAttachment")
     * .clientId("clientId")
     * .userPoolId("userPoolId")
     * // the properties below are optional
     * .css("css")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html)
     */
    public inline fun cfnUserPoolUICustomizationAttachment(
        scope: Construct,
        id: String,
        block: CfnUserPoolUICustomizationAttachmentDsl.() -> Unit = {},
    ): CfnUserPoolUICustomizationAttachment {
        val builder = CfnUserPoolUICustomizationAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserPoolUICustomizationAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CfnUserPoolUICustomizationAttachmentProps cfnUserPoolUICustomizationAttachmentProps =
     * CfnUserPoolUICustomizationAttachmentProps.builder()
     * .clientId("clientId")
     * .userPoolId("userPoolId")
     * // the properties below are optional
     * .css("css")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluicustomizationattachment.html)
     */
    public inline fun cfnUserPoolUICustomizationAttachmentProps(
        block: CfnUserPoolUICustomizationAttachmentPropsDsl.() -> Unit = {}
    ): CfnUserPoolUICustomizationAttachmentProps {
        val builder = CfnUserPoolUICustomizationAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Cognito::UserPoolUser` resource creates an Amazon Cognito user pool user.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * Object clientMetadata;
     * CfnUserPoolUser cfnUserPoolUser = CfnUserPoolUser.Builder.create(this, "MyCfnUserPoolUser")
     * .userPoolId("userPoolId")
     * // the properties below are optional
     * .clientMetadata(clientMetadata)
     * .desiredDeliveryMediums(List.of("desiredDeliveryMediums"))
     * .forceAliasCreation(false)
     * .messageAction("messageAction")
     * .userAttributes(List.of(AttributeTypeProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .username("username")
     * .validationData(List.of(AttributeTypeProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html)
     */
    public inline fun cfnUserPoolUser(
        scope: Construct,
        id: String,
        block: CfnUserPoolUserDsl.() -> Unit = {},
    ): CfnUserPoolUser {
        val builder = CfnUserPoolUserDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies whether the attribute is standard or custom.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * AttributeTypeProperty attributeTypeProperty = AttributeTypeProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html)
     */
    public inline fun cfnUserPoolUserAttributeTypeProperty(
        block: CfnUserPoolUserAttributeTypePropertyDsl.() -> Unit = {}
    ): CfnUserPoolUser.AttributeTypeProperty {
        val builder = CfnUserPoolUserAttributeTypePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The settings for updates to user attributes.
     *
     * These settings include the property `AttributesRequireVerificationBeforeUpdate` , a user-pool
     * setting that tells Amazon Cognito how to handle changes to the value of your users' email
     * address and phone number attributes. For more information, see
     * [Verifying updates to email addresses and phone numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * UserAttributeUpdateSettingsProperty userAttributeUpdateSettingsProperty =
     * UserAttributeUpdateSettingsProperty.builder()
     * .attributesRequireVerificationBeforeUpdate(List.of("attributesRequireVerificationBeforeUpdate"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userattributeupdatesettings.html)
     */
    public inline fun cfnUserPoolUserAttributeUpdateSettingsProperty(
        block: CfnUserPoolUserAttributeUpdateSettingsPropertyDsl.() -> Unit = {}
    ): CfnUserPool.UserAttributeUpdateSettingsProperty {
        val builder = CfnUserPoolUserAttributeUpdateSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The user pool add-ons type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * UserPoolAddOnsProperty userPoolAddOnsProperty = UserPoolAddOnsProperty.builder()
     * .advancedSecurityMode("advancedSecurityMode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userpooladdons.html)
     */
    public inline fun cfnUserPoolUserPoolAddOnsProperty(
        block: CfnUserPoolUserPoolAddOnsPropertyDsl.() -> Unit = {}
    ): CfnUserPool.UserPoolAddOnsProperty {
        val builder = CfnUserPoolUserPoolAddOnsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserPoolUser`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * Object clientMetadata;
     * CfnUserPoolUserProps cfnUserPoolUserProps = CfnUserPoolUserProps.builder()
     * .userPoolId("userPoolId")
     * // the properties below are optional
     * .clientMetadata(clientMetadata)
     * .desiredDeliveryMediums(List.of("desiredDeliveryMediums"))
     * .forceAliasCreation(false)
     * .messageAction("messageAction")
     * .userAttributes(List.of(AttributeTypeProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .username("username")
     * .validationData(List.of(AttributeTypeProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html)
     */
    public inline fun cfnUserPoolUserProps(
        block: CfnUserPoolUserPropsDsl.() -> Unit = {}
    ): CfnUserPoolUserProps {
        val builder = CfnUserPoolUserPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds the specified user to the specified group.
     *
     * Calling this action requires developer credentials.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CfnUserPoolUserToGroupAttachment cfnUserPoolUserToGroupAttachment =
     * CfnUserPoolUserToGroupAttachment.Builder.create(this, "MyCfnUserPoolUserToGroupAttachment")
     * .groupName("groupName")
     * .username("username")
     * .userPoolId("userPoolId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html)
     */
    public inline fun cfnUserPoolUserToGroupAttachment(
        scope: Construct,
        id: String,
        block: CfnUserPoolUserToGroupAttachmentDsl.() -> Unit = {},
    ): CfnUserPoolUserToGroupAttachment {
        val builder = CfnUserPoolUserToGroupAttachmentDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnUserPoolUserToGroupAttachment`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CfnUserPoolUserToGroupAttachmentProps cfnUserPoolUserToGroupAttachmentProps =
     * CfnUserPoolUserToGroupAttachmentProps.builder()
     * .groupName("groupName")
     * .username("username")
     * .userPoolId("userPoolId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolusertogroupattachment.html)
     */
    public inline fun cfnUserPoolUserToGroupAttachmentProps(
        block: CfnUserPoolUserToGroupAttachmentPropsDsl.() -> Unit = {}
    ): CfnUserPoolUserToGroupAttachmentProps {
        val builder = CfnUserPoolUserToGroupAttachmentPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `UsernameConfiguration` property type specifies case sensitivity on the username input
     * for the selected sign-in option.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * UsernameConfigurationProperty usernameConfigurationProperty =
     * UsernameConfigurationProperty.builder()
     * .caseSensitive(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-usernameconfiguration.html)
     */
    public inline fun cfnUserPoolUsernameConfigurationProperty(
        block: CfnUserPoolUsernameConfigurationPropertyDsl.() -> Unit = {}
    ): CfnUserPool.UsernameConfigurationProperty {
        val builder = CfnUserPoolUsernameConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The template for verification messages.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * VerificationMessageTemplateProperty verificationMessageTemplateProperty =
     * VerificationMessageTemplateProperty.builder()
     * .defaultEmailOption("defaultEmailOption")
     * .emailMessage("emailMessage")
     * .emailMessageByLink("emailMessageByLink")
     * .emailSubject("emailSubject")
     * .emailSubjectByLink("emailSubjectByLink")
     * .smsMessage("smsMessage")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-verificationmessagetemplate.html)
     */
    public inline fun cfnUserPoolVerificationMessageTemplateProperty(
        block: CfnUserPoolVerificationMessageTemplatePropertyDsl.() -> Unit = {}
    ): CfnUserPool.VerificationMessageTemplateProperty {
        val builder = CfnUserPoolVerificationMessageTemplatePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options while specifying a cognito prefix domain.
     *
     * Example:
     * ```
     * UserPool pool = new UserPool(this, "Pool");
     * pool.addDomain("CognitoDomain", UserPoolDomainOptions.builder()
     * .cognitoDomain(CognitoDomainOptions.builder()
     * .domainPrefix("my-awesome-app")
     * .build())
     * .build());
     * String certificateArn =
     * "arn:aws:acm:us-east-1:123456789012:certificate/11-3336f1-44483d-adc7-9cd375c5169d";
     * ICertificate domainCert = Certificate.fromCertificateArn(this, "domainCert", certificateArn);
     * pool.addDomain("CustomDomain", UserPoolDomainOptions.builder()
     * .customDomain(CustomDomainOptions.builder()
     * .domainName("user.myapp.com")
     * .certificate(domainCert)
     * .build())
     * .build());
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-assign-domain-prefix.html)
     */
    public inline fun cognitoDomainOptions(
        block: CognitoDomainOptionsDsl.() -> Unit = {}
    ): CognitoDomainOptions {
        val builder = CognitoDomainOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration that will be fed into CloudFormation for any custom attribute type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * CustomAttributeConfig customAttributeConfig = CustomAttributeConfig.builder()
     * .dataType("dataType")
     * // the properties below are optional
     * .mutable(false)
     * .numberConstraints(NumberAttributeConstraints.builder()
     * .max(123)
     * .min(123)
     * .build())
     * .stringConstraints(StringAttributeConstraints.builder()
     * .maxLen(123)
     * .minLen(123)
     * .build())
     * .build();
     * ```
     */
    public inline fun customAttributeConfig(
        block: CustomAttributeConfigDsl.() -> Unit = {}
    ): CustomAttributeConfig {
        val builder = CustomAttributeConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Constraints that can be applied to a custom attribute of any type.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .standardAttributes(StandardAttributes.builder()
     * .fullname(StandardAttribute.builder()
     * .required(true)
     * .mutable(false)
     * .build())
     * .address(StandardAttribute.builder()
     * .required(false)
     * .mutable(true)
     * .build())
     * .build())
     * .customAttributes(Map.of(
     * "myappid", StringAttribute.Builder.create().minLen(5).maxLen(15).mutable(false).build(),
     * "callingcode", NumberAttribute.Builder.create().min(1).max(3).mutable(true).build(),
     * "isEmployee", BooleanAttribute.Builder.create().mutable(true).build(),
     * "joinedOn", new DateTimeAttribute()))
     * .build();
     * ```
     */
    public inline fun customAttributeProps(
        block: CustomAttributePropsDsl.() -> Unit = {}
    ): CustomAttributeProps {
        val builder = CustomAttributePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options while specifying custom domain.
     *
     * Example:
     * ```
     * UserPool pool = new UserPool(this, "Pool");
     * pool.addDomain("CognitoDomain", UserPoolDomainOptions.builder()
     * .cognitoDomain(CognitoDomainOptions.builder()
     * .domainPrefix("my-awesome-app")
     * .build())
     * .build());
     * String certificateArn =
     * "arn:aws:acm:us-east-1:123456789012:certificate/11-3336f1-44483d-adc7-9cd375c5169d";
     * ICertificate domainCert = Certificate.fromCertificateArn(this, "domainCert", certificateArn);
     * pool.addDomain("CustomDomain", UserPoolDomainOptions.builder()
     * .customDomain(CustomDomainOptions.builder()
     * .domainName("user.myapp.com")
     * .certificate(domainCert)
     * .build())
     * .build());
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html)
     */
    public inline fun customDomainOptions(
        block: CustomDomainOptionsDsl.() -> Unit = {}
    ): CustomDomainOptions {
        val builder = CustomDomainOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The DateTime custom attribute type.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .standardAttributes(StandardAttributes.builder()
     * .fullname(StandardAttribute.builder()
     * .required(true)
     * .mutable(false)
     * .build())
     * .address(StandardAttribute.builder()
     * .required(false)
     * .mutable(true)
     * .build())
     * .build())
     * .customAttributes(Map.of(
     * "myappid", StringAttribute.Builder.create().minLen(5).maxLen(15).mutable(false).build(),
     * "callingcode", NumberAttribute.Builder.create().min(1).max(3).mutable(true).build(),
     * "isEmployee", BooleanAttribute.Builder.create().mutable(true).build(),
     * "joinedOn", new DateTimeAttribute()))
     * .build();
     * ```
     */
    public inline fun dateTimeAttribute(
        block: DateTimeAttributeDsl.() -> Unit = {}
    ): DateTimeAttribute {
        val builder = DateTimeAttributeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Device tracking settings.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .deviceTracking(DeviceTracking.builder()
     * .challengeRequiredOnNewDevice(true)
     * .deviceOnlyRememberedOnUserPrompt(true)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-device-tracking.html)
     */
    public inline fun deviceTracking(block: DeviceTrackingDsl.() -> Unit = {}): DeviceTracking {
        val builder = DeviceTrackingDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Email settings for the user pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * EmailSettings emailSettings = EmailSettings.builder()
     * .from("from")
     * .replyTo("replyTo")
     * .build();
     * ```
     */
    public inline fun emailSettings(block: EmailSettingsDsl.() -> Unit = {}): EmailSettings {
        val builder = EmailSettingsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Attributes that will be kept until the user verifies the changed attribute.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .signInAliases(SignInAliases.builder().username(true).build())
     * .autoVerify(AutoVerifiedAttrs.builder().email(true).phone(true).build())
     * .keepOriginal(KeepOriginalAttrs.builder()
     * .email(true)
     * .phone(true)
     * .build())
     * .build();
     * ```
     */
    public inline fun keepOriginalAttrs(
        block: KeepOriginalAttrsDsl.() -> Unit = {}
    ): KeepOriginalAttrs {
        val builder = KeepOriginalAttrsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The different ways in which a user pool can obtain their MFA token for sign in.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .mfa(Mfa.REQUIRED)
     * .mfaSecondFactor(MfaSecondFactor.builder()
     * .sms(true)
     * .otp(true)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-mfa.html)
     */
    public inline fun mfaSecondFactor(block: MfaSecondFactorDsl.() -> Unit = {}): MfaSecondFactor {
        val builder = MfaSecondFactorDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Number custom attribute type.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .standardAttributes(StandardAttributes.builder()
     * .fullname(StandardAttribute.builder()
     * .required(true)
     * .mutable(false)
     * .build())
     * .address(StandardAttribute.builder()
     * .required(false)
     * .mutable(true)
     * .build())
     * .build())
     * .customAttributes(Map.of(
     * "myappid", StringAttribute.Builder.create().minLen(5).maxLen(15).mutable(false).build(),
     * "callingcode", NumberAttribute.Builder.create().min(1).max(3).mutable(true).build(),
     * "isEmployee", BooleanAttribute.Builder.create().mutable(true).build(),
     * "joinedOn", new DateTimeAttribute()))
     * .build();
     * ```
     */
    public inline fun numberAttribute(block: NumberAttributeDsl.() -> Unit = {}): NumberAttribute {
        val builder = NumberAttributeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Constraints that can be applied to a custom attribute of number type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * NumberAttributeConstraints numberAttributeConstraints = NumberAttributeConstraints.builder()
     * .max(123)
     * .min(123)
     * .build();
     * ```
     */
    public inline fun numberAttributeConstraints(
        block: NumberAttributeConstraintsDsl.() -> Unit = {}
    ): NumberAttributeConstraints {
        val builder = NumberAttributeConstraintsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props for NumberAttr.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .standardAttributes(StandardAttributes.builder()
     * .fullname(StandardAttribute.builder()
     * .required(true)
     * .mutable(false)
     * .build())
     * .address(StandardAttribute.builder()
     * .required(false)
     * .mutable(true)
     * .build())
     * .build())
     * .customAttributes(Map.of(
     * "myappid", StringAttribute.Builder.create().minLen(5).maxLen(15).mutable(false).build(),
     * "callingcode", NumberAttribute.Builder.create().min(1).max(3).mutable(true).build(),
     * "isEmployee", BooleanAttribute.Builder.create().mutable(true).build(),
     * "joinedOn", new DateTimeAttribute()))
     * .build();
     * ```
     */
    public inline fun numberAttributeProps(
        block: NumberAttributePropsDsl.() -> Unit = {}
    ): NumberAttributeProps {
        val builder = NumberAttributePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Types of OAuth grant flows.
     *
     * Example:
     * ```
     * UserPool userpool = UserPool.Builder.create(this, "UserPool").build();
     * UserPoolClient client = userpool.addClient("Client", UserPoolClientOptions.builder()
     * // ...
     * .oAuth(OAuthSettings.builder()
     * .flows(OAuthFlows.builder()
     * .implicitCodeGrant(true)
     * .build())
     * .callbackUrls(List.of("https://myapp.com/home", "https://myapp.com/users"))
     * .build())
     * .build());
     * UserPoolDomain domain = userpool.addDomain("Domain", UserPoolDomainOptions.builder().build());
     * String signInUrl = domain.signInUrl(client, SignInUrlOptions.builder()
     * .redirectUri("https://myapp.com/home")
     * .build());
     * ```
     *
     * [Documentation]( - the 'Allowed OAuth Flows' section at
     * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-app-idp-settings.html)
     */
    public inline fun oAuthFlows(block: OAuthFlowsDsl.() -> Unit = {}): OAuthFlows {
        val builder = OAuthFlowsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * OAuth settings to configure the interaction between the app and this client.
     *
     * Example:
     * ```
     * UserPool pool = new UserPool(this, "Pool");
     * ResourceServerScope readOnlyScope =
     * ResourceServerScope.Builder.create().scopeName("read").scopeDescription("Read-only
     * access").build();
     * ResourceServerScope fullAccessScope =
     * ResourceServerScope.Builder.create().scopeName("*").scopeDescription("Full access").build();
     * UserPoolResourceServer userServer = pool.addResourceServer("ResourceServer",
     * UserPoolResourceServerOptions.builder()
     * .identifier("users")
     * .scopes(List.of(readOnlyScope, fullAccessScope))
     * .build());
     * UserPoolClient readOnlyClient = pool.addClient("read-only-client",
     * UserPoolClientOptions.builder()
     * // ...
     * .oAuth(OAuthSettings.builder()
     * // ...
     * .scopes(List.of(OAuthScope.resourceServer(userServer, readOnlyScope)))
     * .build())
     * .build());
     * UserPoolClient fullAccessClient = pool.addClient("full-access-client",
     * UserPoolClientOptions.builder()
     * // ...
     * .oAuth(OAuthSettings.builder()
     * // ...
     * .scopes(List.of(OAuthScope.resourceServer(userServer, fullAccessScope)))
     * .build())
     * .build());
     * ```
     */
    public inline fun oAuthSettings(block: OAuthSettingsDsl.() -> Unit = {}): OAuthSettings {
        val builder = OAuthSettingsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * OpenID Connect endpoints.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * OidcEndpoints oidcEndpoints = OidcEndpoints.builder()
     * .authorization("authorization")
     * .jwksUri("jwksUri")
     * .token("token")
     * .userInfo("userInfo")
     * .build();
     * ```
     */
    public inline fun oidcEndpoints(block: OidcEndpointsDsl.() -> Unit = {}): OidcEndpoints {
        val builder = OidcEndpointsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Password policy for User Pools.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .passwordPolicy(PasswordPolicy.builder()
     * .minLength(12)
     * .requireLowercase(true)
     * .requireUppercase(true)
     * .requireDigits(true)
     * .requireSymbols(true)
     * .tempPasswordValidity(Duration.days(3))
     * .build())
     * .build();
     * ```
     */
    public inline fun passwordPolicy(block: PasswordPolicyDsl.() -> Unit = {}): PasswordPolicy {
        val builder = PasswordPolicyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A scope for ResourceServer.
     *
     * Example:
     * ```
     * UserPool pool = new UserPool(this, "Pool");
     * ResourceServerScope readOnlyScope =
     * ResourceServerScope.Builder.create().scopeName("read").scopeDescription("Read-only
     * access").build();
     * ResourceServerScope fullAccessScope =
     * ResourceServerScope.Builder.create().scopeName("*").scopeDescription("Full access").build();
     * UserPoolResourceServer userServer = pool.addResourceServer("ResourceServer",
     * UserPoolResourceServerOptions.builder()
     * .identifier("users")
     * .scopes(List.of(readOnlyScope, fullAccessScope))
     * .build());
     * UserPoolClient readOnlyClient = pool.addClient("read-only-client",
     * UserPoolClientOptions.builder()
     * // ...
     * .oAuth(OAuthSettings.builder()
     * // ...
     * .scopes(List.of(OAuthScope.resourceServer(userServer, readOnlyScope)))
     * .build())
     * .build());
     * UserPoolClient fullAccessClient = pool.addClient("full-access-client",
     * UserPoolClientOptions.builder()
     * // ...
     * .oAuth(OAuthSettings.builder()
     * // ...
     * .scopes(List.of(OAuthScope.resourceServer(userServer, fullAccessScope)))
     * .build())
     * .build());
     * ```
     */
    public inline fun resourceServerScope(
        block: ResourceServerScopeDsl.() -> Unit = {}
    ): ResourceServerScope {
        val builder = ResourceServerScopeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props to initialize ResourceServerScope.
     *
     * Example:
     * ```
     * UserPool pool = new UserPool(this, "Pool");
     * ResourceServerScope readOnlyScope =
     * ResourceServerScope.Builder.create().scopeName("read").scopeDescription("Read-only
     * access").build();
     * ResourceServerScope fullAccessScope =
     * ResourceServerScope.Builder.create().scopeName("*").scopeDescription("Full access").build();
     * UserPoolResourceServer userServer = pool.addResourceServer("ResourceServer",
     * UserPoolResourceServerOptions.builder()
     * .identifier("users")
     * .scopes(List.of(readOnlyScope, fullAccessScope))
     * .build());
     * UserPoolClient readOnlyClient = pool.addClient("read-only-client",
     * UserPoolClientOptions.builder()
     * // ...
     * .oAuth(OAuthSettings.builder()
     * // ...
     * .scopes(List.of(OAuthScope.resourceServer(userServer, readOnlyScope)))
     * .build())
     * .build());
     * UserPoolClient fullAccessClient = pool.addClient("full-access-client",
     * UserPoolClientOptions.builder()
     * // ...
     * .oAuth(OAuthSettings.builder()
     * // ...
     * .scopes(List.of(OAuthScope.resourceServer(userServer, fullAccessScope)))
     * .build())
     * .build());
     * ```
     */
    public inline fun resourceServerScopeProps(
        block: ResourceServerScopePropsDsl.() -> Unit = {}
    ): ResourceServerScopeProps {
        val builder = ResourceServerScopePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The different ways in which users of this pool can sign up or sign in.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * // ...
     * .signInAliases(SignInAliases.builder().username(true).email(true).build())
     * .autoVerify(AutoVerifiedAttrs.builder().email(true).phone(true).build())
     * .build();
     * ```
     */
    public inline fun signInAliases(block: SignInAliasesDsl.() -> Unit = {}): SignInAliases {
        val builder = SignInAliasesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to customize the behaviour of `signInUrl()`.
     *
     * Example:
     * ```
     * UserPool userpool = UserPool.Builder.create(this, "UserPool").build();
     * UserPoolClient client = userpool.addClient("Client", UserPoolClientOptions.builder()
     * // ...
     * .oAuth(OAuthSettings.builder()
     * .flows(OAuthFlows.builder()
     * .implicitCodeGrant(true)
     * .build())
     * .callbackUrls(List.of("https://myapp.com/home", "https://myapp.com/users"))
     * .build())
     * .build());
     * UserPoolDomain domain = userpool.addDomain("Domain", UserPoolDomainOptions.builder().build());
     * String signInUrl = domain.signInUrl(client, SignInUrlOptions.builder()
     * .redirectUri("https://myapp.com/home")
     * .build());
     * ```
     */
    public inline fun signInUrlOptions(
        block: SignInUrlOptionsDsl.() -> Unit = {}
    ): SignInUrlOptions {
        val builder = SignInUrlOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Standard attribute that can be marked as required or mutable.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .standardAttributes(StandardAttributes.builder()
     * .fullname(StandardAttribute.builder()
     * .required(true)
     * .mutable(false)
     * .build())
     * .address(StandardAttribute.builder()
     * .required(false)
     * .mutable(true)
     * .build())
     * .build())
     * .customAttributes(Map.of(
     * "myappid", StringAttribute.Builder.create().minLen(5).maxLen(15).mutable(false).build(),
     * "callingcode", NumberAttribute.Builder.create().min(1).max(3).mutable(true).build(),
     * "isEmployee", BooleanAttribute.Builder.create().mutable(true).build(),
     * "joinedOn", new DateTimeAttribute()))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes)
     */
    public inline fun standardAttribute(
        block: StandardAttributeDsl.() -> Unit = {}
    ): StandardAttribute {
        val builder = StandardAttributeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The set of standard attributes that can be marked as required or mutable.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .standardAttributes(StandardAttributes.builder()
     * .fullname(StandardAttribute.builder()
     * .required(true)
     * .mutable(false)
     * .build())
     * .address(StandardAttribute.builder()
     * .required(false)
     * .mutable(true)
     * .build())
     * .build())
     * .customAttributes(Map.of(
     * "myappid", StringAttribute.Builder.create().minLen(5).maxLen(15).mutable(false).build(),
     * "callingcode", NumberAttribute.Builder.create().min(1).max(3).mutable(true).build(),
     * "isEmployee", BooleanAttribute.Builder.create().mutable(true).build(),
     * "joinedOn", new DateTimeAttribute()))
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes)
     */
    public inline fun standardAttributes(
        block: StandardAttributesDsl.() -> Unit = {}
    ): StandardAttributes {
        val builder = StandardAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This interface contains standard attributes recognized by Cognito from
     * https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html
     * including built-in attributes `email_verified` and `phone_number_verified`.
     *
     * Example:
     * ```
     * UserPool pool = new UserPool(this, "Pool");
     * ClientAttributes clientWriteAttributes = (new
     * ClientAttributes()).withStandardAttributes(StandardAttributesMask.builder().fullname(true).email(true).build()).withCustomAttributes("favouritePizza",
     * "favouriteBeverage");
     * ClientAttributes clientReadAttributes =
     * clientWriteAttributes.withStandardAttributes(StandardAttributesMask.builder().emailVerified(true).build()).withCustomAttributes("pointsEarned");
     * pool.addClient("app-client", UserPoolClientOptions.builder()
     * // ...
     * .readAttributes(clientReadAttributes)
     * .writeAttributes(clientWriteAttributes)
     * .build());
     * ```
     */
    public inline fun standardAttributesMask(
        block: StandardAttributesMaskDsl.() -> Unit = {}
    ): StandardAttributesMask {
        val builder = StandardAttributesMaskDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The String custom attribute type.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .standardAttributes(StandardAttributes.builder()
     * .fullname(StandardAttribute.builder()
     * .required(true)
     * .mutable(false)
     * .build())
     * .address(StandardAttribute.builder()
     * .required(false)
     * .mutable(true)
     * .build())
     * .build())
     * .customAttributes(Map.of(
     * "myappid", StringAttribute.Builder.create().minLen(5).maxLen(15).mutable(false).build(),
     * "callingcode", NumberAttribute.Builder.create().min(1).max(3).mutable(true).build(),
     * "isEmployee", BooleanAttribute.Builder.create().mutable(true).build(),
     * "joinedOn", new DateTimeAttribute()))
     * .build();
     * ```
     */
    public inline fun stringAttribute(block: StringAttributeDsl.() -> Unit = {}): StringAttribute {
        val builder = StringAttributeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Constraints that can be applied to a custom attribute of string type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * StringAttributeConstraints stringAttributeConstraints = StringAttributeConstraints.builder()
     * .maxLen(123)
     * .minLen(123)
     * .build();
     * ```
     */
    public inline fun stringAttributeConstraints(
        block: StringAttributeConstraintsDsl.() -> Unit = {}
    ): StringAttributeConstraints {
        val builder = StringAttributeConstraintsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props for constructing a StringAttr.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .standardAttributes(StandardAttributes.builder()
     * .fullname(StandardAttribute.builder()
     * .required(true)
     * .mutable(false)
     * .build())
     * .address(StandardAttribute.builder()
     * .required(false)
     * .mutable(true)
     * .build())
     * .build())
     * .customAttributes(Map.of(
     * "myappid", StringAttribute.Builder.create().minLen(5).maxLen(15).mutable(false).build(),
     * "callingcode", NumberAttribute.Builder.create().min(1).max(3).mutable(true).build(),
     * "isEmployee", BooleanAttribute.Builder.create().mutable(true).build(),
     * "joinedOn", new DateTimeAttribute()))
     * .build();
     * ```
     */
    public inline fun stringAttributeProps(
        block: StringAttributePropsDsl.() -> Unit = {}
    ): StringAttributeProps {
        val builder = StringAttributePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * User pool configuration when administrators sign users up.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .userInvitation(UserInvitationConfig.builder()
     * .emailSubject("Invite to join our awesome app!")
     * .emailBody("Hello {username}, you have been invited to join our awesome app! Your temporary
     * password is {####}")
     * .smsMessage("Hello {username}, your temporary password for our awesome app is {####}")
     * .build())
     * .build();
     * ```
     */
    public inline fun userInvitationConfig(
        block: UserInvitationConfigDsl.() -> Unit = {}
    ): UserInvitationConfig {
        val builder = UserInvitationConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a Cognito User Pool.
     *
     * Example:
     * ```
     * UserPool pool = new UserPool(this, "Pool");
     * pool.addClient("app-client", UserPoolClientOptions.builder()
     * .oAuth(OAuthSettings.builder()
     * .flows(OAuthFlows.builder()
     * .authorizationCodeGrant(true)
     * .build())
     * .scopes(List.of(OAuthScope.OPENID))
     * .callbackUrls(List.of("https://my-app-domain.com/welcome"))
     * .logoutUrls(List.of("https://my-app-domain.com/signin"))
     * .build())
     * .build());
     * ```
     */
    public inline fun userPool(
        scope: Construct,
        id: String,
        block: UserPoolDsl.() -> Unit = {},
    ): UserPool {
        val builder = UserPoolDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a UserPool App Client.
     *
     * Example:
     * ```
     * UserPool pool = new UserPool(this, "Pool");
     * UserPoolIdentityProviderAmazon provider = UserPoolIdentityProviderAmazon.Builder.create(this,
     * "Amazon")
     * .userPool(pool)
     * .clientId("amzn-client-id")
     * .clientSecret("amzn-client-secret")
     * .build();
     * UserPoolClient client = pool.addClient("app-client", UserPoolClientOptions.builder()
     * // ...
     * .supportedIdentityProviders(List.of(UserPoolClientIdentityProvider.AMAZON))
     * .build());
     * client.node.addDependency(provider);
     * ```
     */
    public inline fun userPoolClient(
        scope: Construct,
        id: String,
        block: UserPoolClientDsl.() -> Unit = {},
    ): UserPoolClient {
        val builder = UserPoolClientDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to create a UserPoolClient.
     *
     * Example:
     * ```
     * UserPool pool = new UserPool(this, "Pool");
     * pool.addClient("app-client", UserPoolClientOptions.builder()
     * .oAuth(OAuthSettings.builder()
     * .flows(OAuthFlows.builder()
     * .authorizationCodeGrant(true)
     * .build())
     * .scopes(List.of(OAuthScope.OPENID))
     * .callbackUrls(List.of("https://my-app-domain.com/welcome"))
     * .logoutUrls(List.of("https://my-app-domain.com/signin"))
     * .build())
     * .build());
     * ```
     */
    public inline fun userPoolClientOptions(
        block: UserPoolClientOptionsDsl.() -> Unit = {}
    ): UserPoolClientOptions {
        val builder = UserPoolClientOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the UserPoolClient construct.
     *
     * Example:
     * ```
     * UserPool importedPool;
     * UserPoolClient userPoolClient = UserPoolClient.Builder.create(this, "UserPoolClient")
     * .userPool(importedPool)
     * .generateSecret(true)
     * .build();
     * // Allows you to pass the generated secret to other pieces of infrastructure
     * SecretValue secret = userPoolClient.getUserPoolClientSecret();
     * ```
     */
    public inline fun userPoolClientProps(
        block: UserPoolClientPropsDsl.() -> Unit = {}
    ): UserPoolClientProps {
        val builder = UserPoolClientPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define a user pool domain.
     *
     * Example:
     * ```
     * UserPool userpool = UserPool.Builder.create(this, "UserPool").build();
     * UserPoolClient client = userpool.addClient("Client", UserPoolClientOptions.builder()
     * // ...
     * .oAuth(OAuthSettings.builder()
     * .flows(OAuthFlows.builder()
     * .implicitCodeGrant(true)
     * .build())
     * .callbackUrls(List.of("https://myapp.com/home", "https://myapp.com/users"))
     * .build())
     * .build());
     * UserPoolDomain domain = userpool.addDomain("Domain", UserPoolDomainOptions.builder().build());
     * String signInUrl = domain.signInUrl(client, SignInUrlOptions.builder()
     * .redirectUri("https://myapp.com/home")
     * .build());
     * ```
     */
    public inline fun userPoolDomain(
        scope: Construct,
        id: String,
        block: UserPoolDomainDsl.() -> Unit = {},
    ): UserPoolDomain {
        val builder = UserPoolDomainDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to create a UserPoolDomain.
     *
     * Example:
     * ```
     * UserPool pool = new UserPool(this, "Pool");
     * pool.addDomain("CognitoDomain", UserPoolDomainOptions.builder()
     * .cognitoDomain(CognitoDomainOptions.builder()
     * .domainPrefix("my-awesome-app")
     * .build())
     * .build());
     * String certificateArn =
     * "arn:aws:acm:us-east-1:123456789012:certificate/11-3336f1-44483d-adc7-9cd375c5169d";
     * ICertificate domainCert = Certificate.fromCertificateArn(this, "domainCert", certificateArn);
     * pool.addDomain("CustomDomain", UserPoolDomainOptions.builder()
     * .customDomain(CustomDomainOptions.builder()
     * .domainName("user.myapp.com")
     * .certificate(domainCert)
     * .build())
     * .build());
     * ```
     */
    public inline fun userPoolDomainOptions(
        block: UserPoolDomainOptionsDsl.() -> Unit = {}
    ): UserPoolDomainOptions {
        val builder = UserPoolDomainOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props for UserPoolDomain construct.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.certificatemanager.*;
     * Vpc vpc;
     * Certificate certificate;
     * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this, "LB")
     * .vpc(vpc)
     * .internetFacing(true)
     * .build();
     * UserPool userPool = new UserPool(this, "UserPool");
     * UserPoolClient userPoolClient = UserPoolClient.Builder.create(this, "Client")
     * .userPool(userPool)
     * // Required minimal configuration for use with an ELB
     * .generateSecret(true)
     * .authFlows(AuthFlow.builder()
     * .userPassword(true)
     * .build())
     * .oAuth(OAuthSettings.builder()
     * .flows(OAuthFlows.builder()
     * .authorizationCodeGrant(true)
     * .build())
     * .scopes(List.of(OAuthScope.EMAIL))
     * .callbackUrls(List.of(String.format("https://%s/oauth2/idpresponse",
     * lb.getLoadBalancerDnsName())))
     * .build())
     * .build();
     * CfnUserPoolClient cfnClient = (CfnUserPoolClient)userPoolClient.getNode().getDefaultChild();
     * cfnClient.addPropertyOverride("RefreshTokenValidity", 1);
     * cfnClient.addPropertyOverride("SupportedIdentityProviders", List.of("COGNITO"));
     * UserPoolDomain userPoolDomain = UserPoolDomain.Builder.create(this, "Domain")
     * .userPool(userPool)
     * .cognitoDomain(CognitoDomainOptions.builder()
     * .domainPrefix("test-cdk-prefix")
     * .build())
     * .build();
     * lb.addListener("Listener", BaseApplicationListenerProps.builder()
     * .port(443)
     * .certificates(List.of(certificate))
     * .defaultAction(AuthenticateCognitoAction.Builder.create()
     * .userPool(userPool)
     * .userPoolClient(userPoolClient)
     * .userPoolDomain(userPoolDomain)
     * .next(ListenerAction.fixedResponse(200, FixedResponseOptions.builder()
     * .contentType("text/plain")
     * .messageBody("Authenticated")
     * .build()))
     * .build())
     * .build());
     * CfnOutput.Builder.create(this, "DNS")
     * .value(lb.getLoadBalancerDnsName())
     * .build();
     * ```
     */
    public inline fun userPoolDomainProps(
        block: UserPoolDomainPropsDsl.() -> Unit = {}
    ): UserPoolDomainProps {
        val builder = UserPoolDomainPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a identity provider that integrates with 'Login with Amazon'.
     *
     * Example:
     * ```
     * UserPool pool = new UserPool(this, "Pool");
     * UserPoolIdentityProviderAmazon provider = UserPoolIdentityProviderAmazon.Builder.create(this,
     * "Amazon")
     * .userPool(pool)
     * .clientId("amzn-client-id")
     * .clientSecret("amzn-client-secret")
     * .build();
     * UserPoolClient client = pool.addClient("app-client", UserPoolClientOptions.builder()
     * // ...
     * .supportedIdentityProviders(List.of(UserPoolClientIdentityProvider.AMAZON))
     * .build());
     * client.node.addDependency(provider);
     * ```
     */
    public inline fun userPoolIdentityProviderAmazon(
        scope: Construct,
        id: String,
        block: UserPoolIdentityProviderAmazonDsl.() -> Unit = {},
    ): UserPoolIdentityProviderAmazon {
        val builder = UserPoolIdentityProviderAmazonDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize UserPoolAmazonIdentityProvider.
     *
     * Example:
     * ```
     * UserPool pool = new UserPool(this, "Pool");
     * UserPoolIdentityProviderAmazon provider = UserPoolIdentityProviderAmazon.Builder.create(this,
     * "Amazon")
     * .userPool(pool)
     * .clientId("amzn-client-id")
     * .clientSecret("amzn-client-secret")
     * .build();
     * UserPoolClient client = pool.addClient("app-client", UserPoolClientOptions.builder()
     * // ...
     * .supportedIdentityProviders(List.of(UserPoolClientIdentityProvider.AMAZON))
     * .build());
     * client.node.addDependency(provider);
     * ```
     */
    public inline fun userPoolIdentityProviderAmazonProps(
        block: UserPoolIdentityProviderAmazonPropsDsl.() -> Unit = {}
    ): UserPoolIdentityProviderAmazonProps {
        val builder = UserPoolIdentityProviderAmazonPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a identity provider that integrates with 'Apple'.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * ProviderAttribute providerAttribute;
     * UserPool userPool;
     * UserPoolIdentityProviderApple userPoolIdentityProviderApple =
     * UserPoolIdentityProviderApple.Builder.create(this, "MyUserPoolIdentityProviderApple")
     * .clientId("clientId")
     * .keyId("keyId")
     * .privateKey("privateKey")
     * .teamId("teamId")
     * .userPool(userPool)
     * // the properties below are optional
     * .attributeMapping(AttributeMapping.builder()
     * .address(providerAttribute)
     * .birthdate(providerAttribute)
     * .custom(Map.of(
     * "customKey", providerAttribute))
     * .email(providerAttribute)
     * .familyName(providerAttribute)
     * .fullname(providerAttribute)
     * .gender(providerAttribute)
     * .givenName(providerAttribute)
     * .lastUpdateTime(providerAttribute)
     * .locale(providerAttribute)
     * .middleName(providerAttribute)
     * .nickname(providerAttribute)
     * .phoneNumber(providerAttribute)
     * .preferredUsername(providerAttribute)
     * .profilePage(providerAttribute)
     * .profilePicture(providerAttribute)
     * .timezone(providerAttribute)
     * .website(providerAttribute)
     * .build())
     * .scopes(List.of("scopes"))
     * .build();
     * ```
     */
    public inline fun userPoolIdentityProviderApple(
        scope: Construct,
        id: String,
        block: UserPoolIdentityProviderAppleDsl.() -> Unit = {},
    ): UserPoolIdentityProviderApple {
        val builder = UserPoolIdentityProviderAppleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize UserPoolAppleIdentityProvider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * ProviderAttribute providerAttribute;
     * UserPool userPool;
     * UserPoolIdentityProviderAppleProps userPoolIdentityProviderAppleProps =
     * UserPoolIdentityProviderAppleProps.builder()
     * .clientId("clientId")
     * .keyId("keyId")
     * .privateKey("privateKey")
     * .teamId("teamId")
     * .userPool(userPool)
     * // the properties below are optional
     * .attributeMapping(AttributeMapping.builder()
     * .address(providerAttribute)
     * .birthdate(providerAttribute)
     * .custom(Map.of(
     * "customKey", providerAttribute))
     * .email(providerAttribute)
     * .familyName(providerAttribute)
     * .fullname(providerAttribute)
     * .gender(providerAttribute)
     * .givenName(providerAttribute)
     * .lastUpdateTime(providerAttribute)
     * .locale(providerAttribute)
     * .middleName(providerAttribute)
     * .nickname(providerAttribute)
     * .phoneNumber(providerAttribute)
     * .preferredUsername(providerAttribute)
     * .profilePage(providerAttribute)
     * .profilePicture(providerAttribute)
     * .timezone(providerAttribute)
     * .website(providerAttribute)
     * .build())
     * .scopes(List.of("scopes"))
     * .build();
     * ```
     */
    public inline fun userPoolIdentityProviderAppleProps(
        block: UserPoolIdentityProviderApplePropsDsl.() -> Unit = {}
    ): UserPoolIdentityProviderAppleProps {
        val builder = UserPoolIdentityProviderApplePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a identity provider that integrates with 'Facebook Login'.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * ProviderAttribute providerAttribute;
     * UserPool userPool;
     * UserPoolIdentityProviderFacebook userPoolIdentityProviderFacebook =
     * UserPoolIdentityProviderFacebook.Builder.create(this, "MyUserPoolIdentityProviderFacebook")
     * .clientId("clientId")
     * .clientSecret("clientSecret")
     * .userPool(userPool)
     * // the properties below are optional
     * .apiVersion("apiVersion")
     * .attributeMapping(AttributeMapping.builder()
     * .address(providerAttribute)
     * .birthdate(providerAttribute)
     * .custom(Map.of(
     * "customKey", providerAttribute))
     * .email(providerAttribute)
     * .familyName(providerAttribute)
     * .fullname(providerAttribute)
     * .gender(providerAttribute)
     * .givenName(providerAttribute)
     * .lastUpdateTime(providerAttribute)
     * .locale(providerAttribute)
     * .middleName(providerAttribute)
     * .nickname(providerAttribute)
     * .phoneNumber(providerAttribute)
     * .preferredUsername(providerAttribute)
     * .profilePage(providerAttribute)
     * .profilePicture(providerAttribute)
     * .timezone(providerAttribute)
     * .website(providerAttribute)
     * .build())
     * .scopes(List.of("scopes"))
     * .build();
     * ```
     */
    public inline fun userPoolIdentityProviderFacebook(
        scope: Construct,
        id: String,
        block: UserPoolIdentityProviderFacebookDsl.() -> Unit = {},
    ): UserPoolIdentityProviderFacebook {
        val builder = UserPoolIdentityProviderFacebookDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize UserPoolFacebookIdentityProvider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * ProviderAttribute providerAttribute;
     * UserPool userPool;
     * UserPoolIdentityProviderFacebookProps userPoolIdentityProviderFacebookProps =
     * UserPoolIdentityProviderFacebookProps.builder()
     * .clientId("clientId")
     * .clientSecret("clientSecret")
     * .userPool(userPool)
     * // the properties below are optional
     * .apiVersion("apiVersion")
     * .attributeMapping(AttributeMapping.builder()
     * .address(providerAttribute)
     * .birthdate(providerAttribute)
     * .custom(Map.of(
     * "customKey", providerAttribute))
     * .email(providerAttribute)
     * .familyName(providerAttribute)
     * .fullname(providerAttribute)
     * .gender(providerAttribute)
     * .givenName(providerAttribute)
     * .lastUpdateTime(providerAttribute)
     * .locale(providerAttribute)
     * .middleName(providerAttribute)
     * .nickname(providerAttribute)
     * .phoneNumber(providerAttribute)
     * .preferredUsername(providerAttribute)
     * .profilePage(providerAttribute)
     * .profilePicture(providerAttribute)
     * .timezone(providerAttribute)
     * .website(providerAttribute)
     * .build())
     * .scopes(List.of("scopes"))
     * .build();
     * ```
     */
    public inline fun userPoolIdentityProviderFacebookProps(
        block: UserPoolIdentityProviderFacebookPropsDsl.() -> Unit = {}
    ): UserPoolIdentityProviderFacebookProps {
        val builder = UserPoolIdentityProviderFacebookPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a identity provider that integrates with 'Google'.
     *
     * Example:
     * ```
     * UserPool userpool = new UserPool(this, "Pool");
     * SecretValue secret = Secret.fromSecretAttributes(this, "CognitoClientSecret",
     * SecretAttributes.builder()
     * .secretCompleteArn("arn:aws:secretsmanager:xxx:xxx:secret:xxx-xxx")
     * .build()).getSecretValue();
     * UserPoolIdentityProviderGoogle provider = UserPoolIdentityProviderGoogle.Builder.create(this,
     * "Google")
     * .clientId("amzn-client-id")
     * .clientSecretValue(secret)
     * .userPool(userpool)
     * .build();
     * ```
     */
    public inline fun userPoolIdentityProviderGoogle(
        scope: Construct,
        id: String,
        block: UserPoolIdentityProviderGoogleDsl.() -> Unit = {},
    ): UserPoolIdentityProviderGoogle {
        val builder = UserPoolIdentityProviderGoogleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize UserPoolGoogleIdentityProvider.
     *
     * Example:
     * ```
     * UserPool userpool = new UserPool(this, "Pool");
     * SecretValue secret = Secret.fromSecretAttributes(this, "CognitoClientSecret",
     * SecretAttributes.builder()
     * .secretCompleteArn("arn:aws:secretsmanager:xxx:xxx:secret:xxx-xxx")
     * .build()).getSecretValue();
     * UserPoolIdentityProviderGoogle provider = UserPoolIdentityProviderGoogle.Builder.create(this,
     * "Google")
     * .clientId("amzn-client-id")
     * .clientSecretValue(secret)
     * .userPool(userpool)
     * .build();
     * ```
     */
    public inline fun userPoolIdentityProviderGoogleProps(
        block: UserPoolIdentityProviderGooglePropsDsl.() -> Unit = {}
    ): UserPoolIdentityProviderGoogleProps {
        val builder = UserPoolIdentityProviderGooglePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a identity provider that integrates with OpenID Connect.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * ProviderAttribute providerAttribute;
     * UserPool userPool;
     * UserPoolIdentityProviderOidc userPoolIdentityProviderOidc =
     * UserPoolIdentityProviderOidc.Builder.create(this, "MyUserPoolIdentityProviderOidc")
     * .clientId("clientId")
     * .clientSecret("clientSecret")
     * .issuerUrl("issuerUrl")
     * .userPool(userPool)
     * // the properties below are optional
     * .attributeMapping(AttributeMapping.builder()
     * .address(providerAttribute)
     * .birthdate(providerAttribute)
     * .custom(Map.of(
     * "customKey", providerAttribute))
     * .email(providerAttribute)
     * .familyName(providerAttribute)
     * .fullname(providerAttribute)
     * .gender(providerAttribute)
     * .givenName(providerAttribute)
     * .lastUpdateTime(providerAttribute)
     * .locale(providerAttribute)
     * .middleName(providerAttribute)
     * .nickname(providerAttribute)
     * .phoneNumber(providerAttribute)
     * .preferredUsername(providerAttribute)
     * .profilePage(providerAttribute)
     * .profilePicture(providerAttribute)
     * .timezone(providerAttribute)
     * .website(providerAttribute)
     * .build())
     * .attributeRequestMethod(OidcAttributeRequestMethod.GET)
     * .endpoints(OidcEndpoints.builder()
     * .authorization("authorization")
     * .jwksUri("jwksUri")
     * .token("token")
     * .userInfo("userInfo")
     * .build())
     * .identifiers(List.of("identifiers"))
     * .name("name")
     * .scopes(List.of("scopes"))
     * .build();
     * ```
     */
    public inline fun userPoolIdentityProviderOidc(
        scope: Construct,
        id: String,
        block: UserPoolIdentityProviderOidcDsl.() -> Unit = {},
    ): UserPoolIdentityProviderOidc {
        val builder = UserPoolIdentityProviderOidcDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize UserPoolIdentityProviderOidc.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * ProviderAttribute providerAttribute;
     * UserPool userPool;
     * UserPoolIdentityProviderOidcProps userPoolIdentityProviderOidcProps =
     * UserPoolIdentityProviderOidcProps.builder()
     * .clientId("clientId")
     * .clientSecret("clientSecret")
     * .issuerUrl("issuerUrl")
     * .userPool(userPool)
     * // the properties below are optional
     * .attributeMapping(AttributeMapping.builder()
     * .address(providerAttribute)
     * .birthdate(providerAttribute)
     * .custom(Map.of(
     * "customKey", providerAttribute))
     * .email(providerAttribute)
     * .familyName(providerAttribute)
     * .fullname(providerAttribute)
     * .gender(providerAttribute)
     * .givenName(providerAttribute)
     * .lastUpdateTime(providerAttribute)
     * .locale(providerAttribute)
     * .middleName(providerAttribute)
     * .nickname(providerAttribute)
     * .phoneNumber(providerAttribute)
     * .preferredUsername(providerAttribute)
     * .profilePage(providerAttribute)
     * .profilePicture(providerAttribute)
     * .timezone(providerAttribute)
     * .website(providerAttribute)
     * .build())
     * .attributeRequestMethod(OidcAttributeRequestMethod.GET)
     * .endpoints(OidcEndpoints.builder()
     * .authorization("authorization")
     * .jwksUri("jwksUri")
     * .token("token")
     * .userInfo("userInfo")
     * .build())
     * .identifiers(List.of("identifiers"))
     * .name("name")
     * .scopes(List.of("scopes"))
     * .build();
     * ```
     */
    public inline fun userPoolIdentityProviderOidcProps(
        block: UserPoolIdentityProviderOidcPropsDsl.() -> Unit = {}
    ): UserPoolIdentityProviderOidcProps {
        val builder = UserPoolIdentityProviderOidcPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to create a new instance of UserPoolIdentityProvider.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * ProviderAttribute providerAttribute;
     * UserPool userPool;
     * UserPoolIdentityProviderProps userPoolIdentityProviderProps =
     * UserPoolIdentityProviderProps.builder()
     * .userPool(userPool)
     * // the properties below are optional
     * .attributeMapping(AttributeMapping.builder()
     * .address(providerAttribute)
     * .birthdate(providerAttribute)
     * .custom(Map.of(
     * "customKey", providerAttribute))
     * .email(providerAttribute)
     * .familyName(providerAttribute)
     * .fullname(providerAttribute)
     * .gender(providerAttribute)
     * .givenName(providerAttribute)
     * .lastUpdateTime(providerAttribute)
     * .locale(providerAttribute)
     * .middleName(providerAttribute)
     * .nickname(providerAttribute)
     * .phoneNumber(providerAttribute)
     * .preferredUsername(providerAttribute)
     * .profilePage(providerAttribute)
     * .profilePicture(providerAttribute)
     * .timezone(providerAttribute)
     * .website(providerAttribute)
     * .build())
     * .build();
     * ```
     */
    public inline fun userPoolIdentityProviderProps(
        block: UserPoolIdentityProviderPropsDsl.() -> Unit = {}
    ): UserPoolIdentityProviderProps {
        val builder = UserPoolIdentityProviderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a identity provider that integrates with SAML.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * ProviderAttribute providerAttribute;
     * UserPool userPool;
     * UserPoolIdentityProviderSamlMetadata userPoolIdentityProviderSamlMetadata;
     * UserPoolIdentityProviderSaml userPoolIdentityProviderSaml =
     * UserPoolIdentityProviderSaml.Builder.create(this, "MyUserPoolIdentityProviderSaml")
     * .metadata(userPoolIdentityProviderSamlMetadata)
     * .userPool(userPool)
     * // the properties below are optional
     * .attributeMapping(AttributeMapping.builder()
     * .address(providerAttribute)
     * .birthdate(providerAttribute)
     * .custom(Map.of(
     * "customKey", providerAttribute))
     * .email(providerAttribute)
     * .familyName(providerAttribute)
     * .fullname(providerAttribute)
     * .gender(providerAttribute)
     * .givenName(providerAttribute)
     * .lastUpdateTime(providerAttribute)
     * .locale(providerAttribute)
     * .middleName(providerAttribute)
     * .nickname(providerAttribute)
     * .phoneNumber(providerAttribute)
     * .preferredUsername(providerAttribute)
     * .profilePage(providerAttribute)
     * .profilePicture(providerAttribute)
     * .timezone(providerAttribute)
     * .website(providerAttribute)
     * .build())
     * .identifiers(List.of("identifiers"))
     * .idpSignout(false)
     * .name("name")
     * .build();
     * ```
     */
    public inline fun userPoolIdentityProviderSaml(
        scope: Construct,
        id: String,
        block: UserPoolIdentityProviderSamlDsl.() -> Unit = {},
    ): UserPoolIdentityProviderSaml {
        val builder = UserPoolIdentityProviderSamlDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize UserPoolIdentityProviderSaml.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * ProviderAttribute providerAttribute;
     * UserPool userPool;
     * UserPoolIdentityProviderSamlMetadata userPoolIdentityProviderSamlMetadata;
     * UserPoolIdentityProviderSamlProps userPoolIdentityProviderSamlProps =
     * UserPoolIdentityProviderSamlProps.builder()
     * .metadata(userPoolIdentityProviderSamlMetadata)
     * .userPool(userPool)
     * // the properties below are optional
     * .attributeMapping(AttributeMapping.builder()
     * .address(providerAttribute)
     * .birthdate(providerAttribute)
     * .custom(Map.of(
     * "customKey", providerAttribute))
     * .email(providerAttribute)
     * .familyName(providerAttribute)
     * .fullname(providerAttribute)
     * .gender(providerAttribute)
     * .givenName(providerAttribute)
     * .lastUpdateTime(providerAttribute)
     * .locale(providerAttribute)
     * .middleName(providerAttribute)
     * .nickname(providerAttribute)
     * .phoneNumber(providerAttribute)
     * .preferredUsername(providerAttribute)
     * .profilePage(providerAttribute)
     * .profilePicture(providerAttribute)
     * .timezone(providerAttribute)
     * .website(providerAttribute)
     * .build())
     * .identifiers(List.of("identifiers"))
     * .idpSignout(false)
     * .name("name")
     * .build();
     * ```
     */
    public inline fun userPoolIdentityProviderSamlProps(
        block: UserPoolIdentityProviderSamlPropsDsl.() -> Unit = {}
    ): UserPoolIdentityProviderSamlProps {
        val builder = UserPoolIdentityProviderSamlPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props for the UserPool construct.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .selfSignUpEnabled(true)
     * .userVerification(UserVerificationConfig.builder()
     * .emailSubject("Verify your email for our awesome app!")
     * .emailBody("Thanks for signing up to our awesome app! Your verification code is {####}")
     * .emailStyle(VerificationEmailStyle.CODE)
     * .smsMessage("Thanks for signing up to our awesome app! Your verification code is {####}")
     * .build())
     * .build();
     * ```
     */
    public inline fun userPoolProps(block: UserPoolPropsDsl.() -> Unit = {}): UserPoolProps {
        val builder = UserPoolPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Defines a User Pool OAuth2.0 Resource Server.
     *
     * Example:
     * ```
     * UserPool pool = new UserPool(this, "Pool");
     * ResourceServerScope readOnlyScope =
     * ResourceServerScope.Builder.create().scopeName("read").scopeDescription("Read-only
     * access").build();
     * ResourceServerScope fullAccessScope =
     * ResourceServerScope.Builder.create().scopeName("*").scopeDescription("Full access").build();
     * UserPoolResourceServer userServer = pool.addResourceServer("ResourceServer",
     * UserPoolResourceServerOptions.builder()
     * .identifier("users")
     * .scopes(List.of(readOnlyScope, fullAccessScope))
     * .build());
     * UserPoolClient readOnlyClient = pool.addClient("read-only-client",
     * UserPoolClientOptions.builder()
     * // ...
     * .oAuth(OAuthSettings.builder()
     * // ...
     * .scopes(List.of(OAuthScope.resourceServer(userServer, readOnlyScope)))
     * .build())
     * .build());
     * UserPoolClient fullAccessClient = pool.addClient("full-access-client",
     * UserPoolClientOptions.builder()
     * // ...
     * .oAuth(OAuthSettings.builder()
     * // ...
     * .scopes(List.of(OAuthScope.resourceServer(userServer, fullAccessScope)))
     * .build())
     * .build());
     * ```
     */
    public inline fun userPoolResourceServer(
        scope: Construct,
        id: String,
        block: UserPoolResourceServerDsl.() -> Unit = {},
    ): UserPoolResourceServer {
        val builder = UserPoolResourceServerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to create a UserPoolResourceServer.
     *
     * Example:
     * ```
     * UserPool pool = new UserPool(this, "Pool");
     * ResourceServerScope readOnlyScope =
     * ResourceServerScope.Builder.create().scopeName("read").scopeDescription("Read-only
     * access").build();
     * ResourceServerScope fullAccessScope =
     * ResourceServerScope.Builder.create().scopeName("*").scopeDescription("Full access").build();
     * UserPoolResourceServer userServer = pool.addResourceServer("ResourceServer",
     * UserPoolResourceServerOptions.builder()
     * .identifier("users")
     * .scopes(List.of(readOnlyScope, fullAccessScope))
     * .build());
     * UserPoolClient readOnlyClient = pool.addClient("read-only-client",
     * UserPoolClientOptions.builder()
     * // ...
     * .oAuth(OAuthSettings.builder()
     * // ...
     * .scopes(List.of(OAuthScope.resourceServer(userServer, readOnlyScope)))
     * .build())
     * .build());
     * UserPoolClient fullAccessClient = pool.addClient("full-access-client",
     * UserPoolClientOptions.builder()
     * // ...
     * .oAuth(OAuthSettings.builder()
     * // ...
     * .scopes(List.of(OAuthScope.resourceServer(userServer, fullAccessScope)))
     * .build())
     * .build());
     * ```
     */
    public inline fun userPoolResourceServerOptions(
        block: UserPoolResourceServerOptionsDsl.() -> Unit = {}
    ): UserPoolResourceServerOptions {
        val builder = UserPoolResourceServerOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for the UserPoolResourceServer construct.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cognito.*;
     * ResourceServerScope resourceServerScope;
     * UserPool userPool;
     * UserPoolResourceServerProps userPoolResourceServerProps = UserPoolResourceServerProps.builder()
     * .identifier("identifier")
     * .userPool(userPool)
     * // the properties below are optional
     * .scopes(List.of(resourceServerScope))
     * .userPoolResourceServerName("userPoolResourceServerName")
     * .build();
     * ```
     */
    public inline fun userPoolResourceServerProps(
        block: UserPoolResourceServerPropsDsl.() -> Unit = {}
    ): UserPoolResourceServerProps {
        val builder = UserPoolResourceServerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration for Cognito sending emails via Amazon SES.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * .email(UserPoolEmail.withSES(UserPoolSESOptions.builder()
     * .fromEmail("noreply&#64;myawesomeapp.com")
     * .fromName("Awesome App")
     * .replyTo("support&#64;myawesomeapp.com")
     * .build()))
     * .build();
     * ```
     */
    public inline fun userPoolSESOptions(
        block: UserPoolSESOptionsDsl.() -> Unit = {}
    ): UserPoolSESOptions {
        val builder = UserPoolSESOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Triggers for a user pool.
     *
     * Example:
     * ```
     * Function authChallengeFn = Function.Builder.create(this, "authChallengeFn")
     * .runtime(Runtime.NODEJS_14_X)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "path/to/asset")))
     * .build();
     * UserPool userpool = UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .lambdaTriggers(UserPoolTriggers.builder()
     * .createAuthChallenge(authChallengeFn)
     * .build())
     * .build();
     * userpool.addTrigger(UserPoolOperation.USER_MIGRATION, Function.Builder.create(this,
     * "userMigrationFn")
     * .runtime(Runtime.NODEJS_14_X)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "path/to/asset")))
     * .build());
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-working-with-aws-lambda-triggers.html)
     */
    public inline fun userPoolTriggers(
        block: UserPoolTriggersDsl.() -> Unit = {}
    ): UserPoolTriggers {
        val builder = UserPoolTriggersDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * User pool configuration for user self sign up.
     *
     * Example:
     * ```
     * UserPool.Builder.create(this, "myuserpool")
     * // ...
     * .selfSignUpEnabled(true)
     * .userVerification(UserVerificationConfig.builder()
     * .emailSubject("Verify your email for our awesome app!")
     * .emailBody("Thanks for signing up to our awesome app! Your verification code is {####}")
     * .emailStyle(VerificationEmailStyle.CODE)
     * .smsMessage("Thanks for signing up to our awesome app! Your verification code is {####}")
     * .build())
     * .build();
     * ```
     */
    public inline fun userVerificationConfig(
        block: UserVerificationConfigDsl.() -> Unit = {}
    ): UserVerificationConfig {
        val builder = UserVerificationConfigDsl()
        builder.apply(block)
        return builder.build()
    }
}
