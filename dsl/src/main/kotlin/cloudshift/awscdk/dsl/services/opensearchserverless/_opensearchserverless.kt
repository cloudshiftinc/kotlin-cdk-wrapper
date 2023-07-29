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

package cloudshift.awscdk.dsl.services.opensearchserverless

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicy
import software.amazon.awscdk.services.opensearchserverless.CfnAccessPolicyProps
import software.amazon.awscdk.services.opensearchserverless.CfnCollection
import software.amazon.awscdk.services.opensearchserverless.CfnCollectionProps
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicy
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityPolicyProps
import software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpoint
import software.amazon.awscdk.services.opensearchserverless.CfnVpcEndpointProps
import software.constructs.Construct

public object opensearchserverless {
    /**
     * Creates a data access policy for OpenSearch Serverless.
     *
     * Access policies limit access to collections and the resources within them, and allow a user
     * to access that data irrespective of the access mechanism or network source. For more
     * information, see
     * [Data access control for Amazon OpenSearch Serverless](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-data-access.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchserverless.*;
     * CfnAccessPolicy cfnAccessPolicy = CfnAccessPolicy.Builder.create(this, "MyCfnAccessPolicy")
     * .name("name")
     * .policy("policy")
     * .type("type")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html)
     */
    public inline fun cfnAccessPolicy(
        scope: Construct,
        id: String,
        block: CfnAccessPolicyDsl.() -> Unit = {},
    ): CfnAccessPolicy {
        val builder = CfnAccessPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAccessPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchserverless.*;
     * CfnAccessPolicyProps cfnAccessPolicyProps = CfnAccessPolicyProps.builder()
     * .name("name")
     * .policy("policy")
     * .type("type")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-accesspolicy.html)
     */
    public inline fun cfnAccessPolicyProps(
        block: CfnAccessPolicyPropsDsl.() -> Unit = {}
    ): CfnAccessPolicyProps {
        val builder = CfnAccessPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an OpenSearch Serverless collection.
     *
     * For more information, see
     * [Creating and managing Amazon OpenSearch Serverless collections](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-manage.html)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * You must create a matching
     * [encryption policy](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html)
     * in order for a collection to be created successfully. You can specify the policy resource
     * within the same CloudFormation template as the collection resource if you use the
     * [DependsOn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * attribute. See
     * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html#aws-resource-opensearchserverless-collection--examples)
     * for a sample template. Otherwise the encryption policy must already exist before you create
     * the collection.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchserverless.*;
     * CfnCollection cfnCollection = CfnCollection.Builder.create(this, "MyCfnCollection")
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html)
     */
    public inline fun cfnCollection(
        scope: Construct,
        id: String,
        block: CfnCollectionDsl.() -> Unit = {},
    ): CfnCollection {
        val builder = CfnCollectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCollection`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchserverless.*;
     * CfnCollectionProps cfnCollectionProps = CfnCollectionProps.builder()
     * .name("name")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-collection.html)
     */
    public inline fun cfnCollectionProps(
        block: CfnCollectionPropsDsl.() -> Unit = {}
    ): CfnCollectionProps {
        val builder = CfnCollectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies a security configuration for OpenSearch Serverless.
     *
     * For more information, see
     * [SAML authentication for Amazon OpenSearch Serverless](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-saml.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchserverless.*;
     * CfnSecurityConfig cfnSecurityConfig = CfnSecurityConfig.Builder.create(this,
     * "MyCfnSecurityConfig")
     * .description("description")
     * .name("name")
     * .samlOptions(SamlConfigOptionsProperty.builder()
     * .metadata("metadata")
     * // the properties below are optional
     * .groupAttribute("groupAttribute")
     * .sessionTimeout(123)
     * .userAttribute("userAttribute")
     * .build())
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html)
     */
    public inline fun cfnSecurityConfig(
        scope: Construct,
        id: String,
        block: CfnSecurityConfigDsl.() -> Unit = {},
    ): CfnSecurityConfig {
        val builder = CfnSecurityConfigDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSecurityConfig`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchserverless.*;
     * CfnSecurityConfigProps cfnSecurityConfigProps = CfnSecurityConfigProps.builder()
     * .description("description")
     * .name("name")
     * .samlOptions(SamlConfigOptionsProperty.builder()
     * .metadata("metadata")
     * // the properties below are optional
     * .groupAttribute("groupAttribute")
     * .sessionTimeout(123)
     * .userAttribute("userAttribute")
     * .build())
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html)
     */
    public inline fun cfnSecurityConfigProps(
        block: CfnSecurityConfigPropsDsl.() -> Unit = {}
    ): CfnSecurityConfigProps {
        val builder = CfnSecurityConfigPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Describes SAML options for an OpenSearch Serverless security configuration in the form of a
     * key-value map.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchserverless.*;
     * SamlConfigOptionsProperty samlConfigOptionsProperty = SamlConfigOptionsProperty.builder()
     * .metadata("metadata")
     * // the properties below are optional
     * .groupAttribute("groupAttribute")
     * .sessionTimeout(123)
     * .userAttribute("userAttribute")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchserverless-securityconfig-samlconfigoptions.html)
     */
    public inline fun cfnSecurityConfigSamlConfigOptionsProperty(
        block: CfnSecurityConfigSamlConfigOptionsPropertyDsl.() -> Unit = {}
    ): CfnSecurityConfig.SamlConfigOptionsProperty {
        val builder = CfnSecurityConfigSamlConfigOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an encryption or network policy to be used by one or more OpenSearch Serverless
     * collections.
     *
     * Network policies specify access to a collection and its OpenSearch Dashboards endpoint from
     * public networks or specific VPC endpoints. For more information, see
     * [Network access for Amazon OpenSearch Serverless](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-network.html)
     * .
     *
     * Encryption policies specify a KMS encryption key to assign to particular collections. For
     * more information, see
     * [Encryption at rest for Amazon OpenSearch Serverless](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-encryption.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchserverless.*;
     * CfnSecurityPolicy cfnSecurityPolicy = CfnSecurityPolicy.Builder.create(this,
     * "MyCfnSecurityPolicy")
     * .name("name")
     * .policy("policy")
     * .type("type")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html)
     */
    public inline fun cfnSecurityPolicy(
        scope: Construct,
        id: String,
        block: CfnSecurityPolicyDsl.() -> Unit = {},
    ): CfnSecurityPolicy {
        val builder = CfnSecurityPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSecurityPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchserverless.*;
     * CfnSecurityPolicyProps cfnSecurityPolicyProps = CfnSecurityPolicyProps.builder()
     * .name("name")
     * .policy("policy")
     * .type("type")
     * // the properties below are optional
     * .description("description")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securitypolicy.html)
     */
    public inline fun cfnSecurityPolicyProps(
        block: CfnSecurityPolicyPropsDsl.() -> Unit = {}
    ): CfnSecurityPolicyProps {
        val builder = CfnSecurityPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates an OpenSearch Serverless-managed interface VPC endpoint.
     *
     * For more information, see
     * [Access Amazon OpenSearch Serverless using an interface endpoint](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/serverless-vpc.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchserverless.*;
     * CfnVpcEndpoint cfnVpcEndpoint = CfnVpcEndpoint.Builder.create(this, "MyCfnVpcEndpoint")
     * .name("name")
     * .subnetIds(List.of("subnetIds"))
     * .vpcId("vpcId")
     * // the properties below are optional
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html)
     */
    public inline fun cfnVpcEndpoint(
        scope: Construct,
        id: String,
        block: CfnVpcEndpointDsl.() -> Unit = {},
    ): CfnVpcEndpoint {
        val builder = CfnVpcEndpointDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVpcEndpoint`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchserverless.*;
     * CfnVpcEndpointProps cfnVpcEndpointProps = CfnVpcEndpointProps.builder()
     * .name("name")
     * .subnetIds(List.of("subnetIds"))
     * .vpcId("vpcId")
     * // the properties below are optional
     * .securityGroupIds(List.of("securityGroupIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-vpcendpoint.html)
     */
    public inline fun cfnVpcEndpointProps(
        block: CfnVpcEndpointPropsDsl.() -> Unit = {}
    ): CfnVpcEndpointProps {
        val builder = CfnVpcEndpointPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
