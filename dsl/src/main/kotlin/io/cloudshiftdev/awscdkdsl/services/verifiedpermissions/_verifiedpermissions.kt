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

package io.cloudshiftdev.awscdkdsl.services.verifiedpermissions

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource
import software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySourceProps
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicy
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyProps
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStore
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyStoreProps
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplate
import software.amazon.awscdk.services.verifiedpermissions.CfnPolicyTemplateProps
import software.constructs.Construct

public object verifiedpermissions {
    /**
     * Creates or updates a reference to Amazon Cognito as an external identity provider.
     *
     * If you are creating a new identity source, then you must specify a `Configuration` . If you
     * are updating an existing identity source, then you must specify an `UpdateConfiguration` .
     *
     * After you create an identity source, you can use the identities provided by the IdP as
     * proxies for the principal in authorization queries that use the
     * [IsAuthorizedWithToken](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_IsAuthorizedWithToken.html)
     * operation. These identities take the form of tokens that contain claims about the user, such
     * as IDs, attributes and group memberships. Amazon Cognito provides both identity tokens and
     * access tokens, and Verified Permissions can use either or both. Any combination of identity
     * and access tokens results in the same Cedar principal. Verified Permissions automatically
     * translates the information about the identities into the standard Cedar attributes that can
     * be evaluated by your policies. Because the Amazon Cognito identity and access tokens can
     * contain different information, the tokens you choose to use determine the attributes that are
     * available to access in the Cedar principal from your policies.
     *
     * Amazon Cognito Identity is not available in all of the same AWS Regions as Amazon Verified
     * Permissions . Because of this, the `AWS::VerifiedPermissions::IdentitySource` type is not
     * available to create from AWS CloudFormation in Regions where Amazon Cognito Identity is not
     * currently available. Users can still create `AWS::VerifiedPermissions::IdentitySource` in
     * those Regions, but only from the AWS CLI , Amazon Verified Permissions SDK, or from the AWS
     * console.
     *
     * To reference a user from this identity source in your Cedar policies, use the following
     * syntax.
     *
     * *IdentityType::"<CognitoUserPoolIdentifier>|<CognitoClientId>*
     *
     * Where `IdentityType` is the string that you provide to the `PrincipalEntityType` parameter
     * for this operation. The `CognitoUserPoolId` and `CognitoClientId` are defined by the Amazon
     * Cognito user pool.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * CfnIdentitySource cfnIdentitySource = CfnIdentitySource.Builder.create(this,
     * "MyCfnIdentitySource")
     * .configuration(IdentitySourceConfigurationProperty.builder()
     * .cognitoUserPoolConfiguration(CognitoUserPoolConfigurationProperty.builder()
     * .userPoolArn("userPoolArn")
     * // the properties below are optional
     * .clientIds(List.of("clientIds"))
     * .build())
     * .build())
     * .policyStoreId("policyStoreId")
     * // the properties below are optional
     * .principalEntityType("principalEntityType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html)
     */
    public inline fun cfnIdentitySource(
        scope: Construct,
        id: String,
        block: CfnIdentitySourceDsl.() -> Unit = {},
    ): CfnIdentitySource {
        val builder = CfnIdentitySourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains configuration information used when creating or updating an
     * identity source that represents a connection to an Amazon Cognito user pool used as an
     * identity provider for Verified Permissions .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * CognitoUserPoolConfigurationProperty cognitoUserPoolConfigurationProperty =
     * CognitoUserPoolConfigurationProperty.builder()
     * .userPoolArn("userPoolArn")
     * // the properties below are optional
     * .clientIds(List.of("clientIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-cognitouserpoolconfiguration.html)
     */
    public inline fun cfnIdentitySourceCognitoUserPoolConfigurationProperty(
        block: CfnIdentitySourceCognitoUserPoolConfigurationPropertyDsl.() -> Unit = {}
    ): CfnIdentitySource.CognitoUserPoolConfigurationProperty {
        val builder = CfnIdentitySourceCognitoUserPoolConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains configuration information used when creating or updating a new
     * identity source.
     *
     * At this time, the only valid member of this structure is a Amazon Cognito user pool
     * configuration.
     *
     * You must specify a `userPoolArn` , and optionally, a `ClientId` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * IdentitySourceConfigurationProperty identitySourceConfigurationProperty =
     * IdentitySourceConfigurationProperty.builder()
     * .cognitoUserPoolConfiguration(CognitoUserPoolConfigurationProperty.builder()
     * .userPoolArn("userPoolArn")
     * // the properties below are optional
     * .clientIds(List.of("clientIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourceconfiguration.html)
     */
    public inline fun cfnIdentitySourceIdentitySourceConfigurationProperty(
        block: CfnIdentitySourceIdentitySourceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnIdentitySource.IdentitySourceConfigurationProperty {
        val builder = CfnIdentitySourceIdentitySourceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains configuration of the identity source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * IdentitySourceDetailsProperty identitySourceDetailsProperty =
     * IdentitySourceDetailsProperty.builder()
     * .clientIds(List.of("clientIds"))
     * .discoveryUrl("discoveryUrl")
     * .openIdIssuer("openIdIssuer")
     * .userPoolArn("userPoolArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-identitysource-identitysourcedetails.html)
     */
    public inline fun cfnIdentitySourceIdentitySourceDetailsProperty(
        block: CfnIdentitySourceIdentitySourceDetailsPropertyDsl.() -> Unit = {}
    ): CfnIdentitySource.IdentitySourceDetailsProperty {
        val builder = CfnIdentitySourceIdentitySourceDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIdentitySource`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * CfnIdentitySourceProps cfnIdentitySourceProps = CfnIdentitySourceProps.builder()
     * .configuration(IdentitySourceConfigurationProperty.builder()
     * .cognitoUserPoolConfiguration(CognitoUserPoolConfigurationProperty.builder()
     * .userPoolArn("userPoolArn")
     * // the properties below are optional
     * .clientIds(List.of("clientIds"))
     * .build())
     * .build())
     * .policyStoreId("policyStoreId")
     * // the properties below are optional
     * .principalEntityType("principalEntityType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-identitysource.html)
     */
    public inline fun cfnIdentitySourceProps(
        block: CfnIdentitySourcePropsDsl.() -> Unit = {}
    ): CfnIdentitySourceProps {
        val builder = CfnIdentitySourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates a Cedar policy and saves it in the specified policy store.
     *
     * You can create either a static policy or a policy linked to a policy template.
     *
     * You can directly update only static policies. To update a template-linked policy, you must
     * update it's linked policy template instead.
     * * To create a static policy, in the `Definition` include a `Static` element that includes the
     *   Cedar policy text in the `Statement` element.
     * * To create a policy that is dynamically linked to a policy template, in the `Definition`
     *   include a `Templatelinked` element that specifies the policy template ID and the principal
     *   and resource to associate with this policy. If the policy template is ever updated, any
     *   policies linked to the policy template automatically use the updated template.
     * * If policy validation is enabled in the policy store, then updating a static policy causes
     *   Verified Permissions to validate the policy against the schema in the policy store. If the
     *   updated static policy doesn't pass validation, the operation fails and the update isn't
     *   stored.
     * * When you edit a static policy, You can change only certain elements of a static policy:
     * * The action referenced by the policy.
     * * A condition clause, such as when and unless.
     *
     * You can't change these elements of a static policy:
     * * Changing a policy from a static policy to a template-linked policy.
     * * Changing the effect of a static policy from permit or forbid.
     * * The principal referenced by a static policy.
     * * The resource referenced by a static policy.
     * * To update a template-linked policy, you must update the template instead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * CfnPolicy cfnPolicy = CfnPolicy.Builder.create(this, "MyCfnPolicy")
     * .definition(PolicyDefinitionProperty.builder()
     * .static(StaticPolicyDefinitionProperty.builder()
     * .statement("statement")
     * // the properties below are optional
     * .description("description")
     * .build())
     * .templateLinked(TemplateLinkedPolicyDefinitionProperty.builder()
     * .policyTemplateId("policyTemplateId")
     * // the properties below are optional
     * .principal(EntityIdentifierProperty.builder()
     * .entityId("entityId")
     * .entityType("entityType")
     * .build())
     * .resource(EntityIdentifierProperty.builder()
     * .entityId("entityId")
     * .entityType("entityType")
     * .build())
     * .build())
     * .build())
     * .policyStoreId("policyStoreId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html)
     */
    public inline fun cfnPolicy(
        scope: Construct,
        id: String,
        block: CfnPolicyDsl.() -> Unit = {},
    ): CfnPolicy {
        val builder = CfnPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains the identifier of an entity in a policy, including its ID and type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * EntityIdentifierProperty entityIdentifierProperty = EntityIdentifierProperty.builder()
     * .entityId("entityId")
     * .entityType("entityType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-entityidentifier.html)
     */
    public inline fun cfnPolicyEntityIdentifierProperty(
        block: CfnPolicyEntityIdentifierPropertyDsl.() -> Unit = {}
    ): CfnPolicy.EntityIdentifierProperty {
        val builder = CfnPolicyEntityIdentifierPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that defines a Cedar policy.
     *
     * It includes the policy type, a description, and a policy body. This is a top level data type
     * used to create a policy.
     *
     * This data type is used as a request parameter for the
     * [CreatePolicy](https://docs.aws.amazon.com/verifiedpermissions/latest/apireference/API_CreatePolicy.html)
     * operation. This structure must always have either an `Static` or a `TemplateLinked` element.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * PolicyDefinitionProperty policyDefinitionProperty = PolicyDefinitionProperty.builder()
     * .static(StaticPolicyDefinitionProperty.builder()
     * .statement("statement")
     * // the properties below are optional
     * .description("description")
     * .build())
     * .templateLinked(TemplateLinkedPolicyDefinitionProperty.builder()
     * .policyTemplateId("policyTemplateId")
     * // the properties below are optional
     * .principal(EntityIdentifierProperty.builder()
     * .entityId("entityId")
     * .entityType("entityType")
     * .build())
     * .resource(EntityIdentifierProperty.builder()
     * .entityId("entityId")
     * .entityType("entityType")
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-policydefinition.html)
     */
    public inline fun cfnPolicyPolicyDefinitionProperty(
        block: CfnPolicyPolicyDefinitionPropertyDsl.() -> Unit = {}
    ): CfnPolicy.PolicyDefinitionProperty {
        val builder = CfnPolicyPolicyDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * CfnPolicyProps cfnPolicyProps = CfnPolicyProps.builder()
     * .definition(PolicyDefinitionProperty.builder()
     * .static(StaticPolicyDefinitionProperty.builder()
     * .statement("statement")
     * // the properties below are optional
     * .description("description")
     * .build())
     * .templateLinked(TemplateLinkedPolicyDefinitionProperty.builder()
     * .policyTemplateId("policyTemplateId")
     * // the properties below are optional
     * .principal(EntityIdentifierProperty.builder()
     * .entityId("entityId")
     * .entityType("entityType")
     * .build())
     * .resource(EntityIdentifierProperty.builder()
     * .entityId("entityId")
     * .entityType("entityType")
     * .build())
     * .build())
     * .build())
     * .policyStoreId("policyStoreId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policy.html)
     */
    public inline fun cfnPolicyProps(block: CfnPolicyPropsDsl.() -> Unit = {}): CfnPolicyProps {
        val builder = CfnPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that defines a static policy.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * StaticPolicyDefinitionProperty staticPolicyDefinitionProperty =
     * StaticPolicyDefinitionProperty.builder()
     * .statement("statement")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-staticpolicydefinition.html)
     */
    public inline fun cfnPolicyStaticPolicyDefinitionProperty(
        block: CfnPolicyStaticPolicyDefinitionPropertyDsl.() -> Unit = {}
    ): CfnPolicy.StaticPolicyDefinitionProperty {
        val builder = CfnPolicyStaticPolicyDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a policy store.
     *
     * A policy store is a container for policy resources. You can create a separate policy store
     * for each of your applications.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * CfnPolicyStore cfnPolicyStore = CfnPolicyStore.Builder.create(this, "MyCfnPolicyStore")
     * .validationSettings(ValidationSettingsProperty.builder()
     * .mode("mode")
     * .build())
     * // the properties below are optional
     * .description("description")
     * .schema(SchemaDefinitionProperty.builder()
     * .cedarJson("cedarJson")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html)
     */
    public inline fun cfnPolicyStore(
        scope: Construct,
        id: String,
        block: CfnPolicyStoreDsl.() -> Unit = {},
    ): CfnPolicyStore {
        val builder = CfnPolicyStoreDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPolicyStore`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * CfnPolicyStoreProps cfnPolicyStoreProps = CfnPolicyStoreProps.builder()
     * .validationSettings(ValidationSettingsProperty.builder()
     * .mode("mode")
     * .build())
     * // the properties below are optional
     * .description("description")
     * .schema(SchemaDefinitionProperty.builder()
     * .cedarJson("cedarJson")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policystore.html)
     */
    public inline fun cfnPolicyStoreProps(
        block: CfnPolicyStorePropsDsl.() -> Unit = {}
    ): CfnPolicyStoreProps {
        val builder = CfnPolicyStorePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Contains a list of principal types, resource types, and actions that can be specified in
     * policies stored in the same policy store.
     *
     * If the validation mode for the policy store is set to `STRICT` , then policies that can't be
     * validated by this schema are rejected by Verified Permissions and can't be stored in the
     * policy store.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * SchemaDefinitionProperty schemaDefinitionProperty = SchemaDefinitionProperty.builder()
     * .cedarJson("cedarJson")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policystore-schemadefinition.html)
     */
    public inline fun cfnPolicyStoreSchemaDefinitionProperty(
        block: CfnPolicyStoreSchemaDefinitionPropertyDsl.() -> Unit = {}
    ): CfnPolicyStore.SchemaDefinitionProperty {
        val builder = CfnPolicyStoreSchemaDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that contains Cedar policy validation settings for the policy store.
     *
     * The validation mode determines which validation failures that Cedar considers serious enough
     * to block acceptance of a new or edited static policy or policy template.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * ValidationSettingsProperty validationSettingsProperty = ValidationSettingsProperty.builder()
     * .mode("mode")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policystore-validationsettings.html)
     */
    public inline fun cfnPolicyStoreValidationSettingsProperty(
        block: CfnPolicyStoreValidationSettingsPropertyDsl.() -> Unit = {}
    ): CfnPolicyStore.ValidationSettingsProperty {
        val builder = CfnPolicyStoreValidationSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a policy template.
     *
     * A template can use placeholders for the principal and resource. A template must be
     * instantiated into a policy by associating it with specific principals and resources to use
     * for the placeholders. That instantiated policy can then be considered in authorization
     * decisions. The instantiated policy works identically to any other policy, except that it is
     * dynamically linked to the template. If the template changes, then any policies that are
     * linked to that template are immediately updated as well.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * CfnPolicyTemplate cfnPolicyTemplate = CfnPolicyTemplate.Builder.create(this,
     * "MyCfnPolicyTemplate")
     * .policyStoreId("policyStoreId")
     * .statement("statement")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html)
     */
    public inline fun cfnPolicyTemplate(
        scope: Construct,
        id: String,
        block: CfnPolicyTemplateDsl.() -> Unit = {},
    ): CfnPolicyTemplate {
        val builder = CfnPolicyTemplateDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that describes a policy created by instantiating a policy template.
     *
     * You can't directly update a template-linked policy. You must update the associated policy
     * template instead.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * TemplateLinkedPolicyDefinitionProperty templateLinkedPolicyDefinitionProperty =
     * TemplateLinkedPolicyDefinitionProperty.builder()
     * .policyTemplateId("policyTemplateId")
     * // the properties below are optional
     * .principal(EntityIdentifierProperty.builder()
     * .entityId("entityId")
     * .entityType("entityType")
     * .build())
     * .resource(EntityIdentifierProperty.builder()
     * .entityId("entityId")
     * .entityType("entityType")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-verifiedpermissions-policy-templatelinkedpolicydefinition.html)
     */
    public inline fun cfnPolicyTemplateLinkedPolicyDefinitionProperty(
        block: CfnPolicyTemplateLinkedPolicyDefinitionPropertyDsl.() -> Unit = {}
    ): CfnPolicy.TemplateLinkedPolicyDefinitionProperty {
        val builder = CfnPolicyTemplateLinkedPolicyDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnPolicyTemplate`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.verifiedpermissions.*;
     * CfnPolicyTemplateProps cfnPolicyTemplateProps = CfnPolicyTemplateProps.builder()
     * .policyStoreId("policyStoreId")
     * .statement("statement")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-verifiedpermissions-policytemplate.html)
     */
    public inline fun cfnPolicyTemplateProps(
        block: CfnPolicyTemplatePropsDsl.() -> Unit = {}
    ): CfnPolicyTemplateProps {
        val builder = CfnPolicyTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
