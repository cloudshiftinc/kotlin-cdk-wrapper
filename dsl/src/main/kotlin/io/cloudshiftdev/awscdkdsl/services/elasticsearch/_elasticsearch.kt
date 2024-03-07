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

package io.cloudshiftdev.awscdkdsl.services.elasticsearch

import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions
import software.amazon.awscdk.services.elasticsearch.CapacityConfig
import software.amazon.awscdk.services.elasticsearch.CfnDomain
import software.amazon.awscdk.services.elasticsearch.CfnDomainProps
import software.amazon.awscdk.services.elasticsearch.CognitoOptions
import software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions
import software.amazon.awscdk.services.elasticsearch.DomainAttributes
import software.amazon.awscdk.services.elasticsearch.DomainProps
import software.amazon.awscdk.services.elasticsearch.EbsOptions
import software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions
import software.amazon.awscdk.services.elasticsearch.IDomain
import software.amazon.awscdk.services.elasticsearch.LoggingOptions
import software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig
import software.constructs.Construct

public object elasticsearch {
    /**
     * (deprecated) Specifies options for fine-grained access control.
     *
     * Example:
     * ```
     * Domain domain = Domain.Builder.create(this, "Domain")
     * .version(ElasticsearchVersion.V7_1)
     * .enforceHttps(true)
     * .nodeToNodeEncryption(true)
     * .encryptionAtRest(EncryptionAtRestOptions.builder()
     * .enabled(true)
     * .build())
     * .fineGrainedAccessControl(AdvancedSecurityOptions.builder()
     * .masterUserName("master-user")
     * .build())
     * .build();
     * SecretValue masterUserPassword = domain.getMasterUserPassword();
     * ```
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public inline fun advancedSecurityOptions(
        block: AdvancedSecurityOptionsDsl.() -> Unit = {}
    ): AdvancedSecurityOptions {
        val builder = AdvancedSecurityOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (deprecated) Configures the capacity of the cluster such as the instance type and the number
     * of instances.
     *
     * Example:
     * ```
     * Domain domain = Domain.Builder.create(this, "Domain")
     * .version(ElasticsearchVersion.V7_10)
     * .capacity(CapacityConfig.builder()
     * .masterNodes(2)
     * .warmNodes(2)
     * .warmInstanceType("ultrawarm1.medium.elasticsearch")
     * .build())
     * .build();
     * ```
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public inline fun capacityConfig(block: CapacityConfigDsl.() -> Unit = {}): CapacityConfig {
        val builder = CapacityConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::Elasticsearch::Domain resource creates an Amazon OpenSearch Service domain.
     *
     * The `AWS::Elasticsearch::Domain` resource is being replaced by the
     * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
     * resource. While the legacy Elasticsearch resource and options are still supported, we
     * recommend modifying your existing Cloudformation templates to use the new OpenSearch Service
     * resource, which supports both OpenSearch and legacy Elasticsearch. For instructions to
     * upgrade domains defined within CloudFormation from Elasticsearch to OpenSearch, see
     * [Remarks](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--remarks)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * Object accessPolicies;
     * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
     * .accessPolicies(accessPolicies)
     * .advancedOptions(Map.of(
     * "advancedOptionsKey", "advancedOptions"))
     * .advancedSecurityOptions(AdvancedSecurityOptionsInputProperty.builder()
     * .anonymousAuthEnabled(false)
     * .enabled(false)
     * .internalUserDatabaseEnabled(false)
     * .masterUserOptions(MasterUserOptionsProperty.builder()
     * .masterUserArn("masterUserArn")
     * .masterUserName("masterUserName")
     * .masterUserPassword("masterUserPassword")
     * .build())
     * .build())
     * .cognitoOptions(CognitoOptionsProperty.builder()
     * .enabled(false)
     * .identityPoolId("identityPoolId")
     * .roleArn("roleArn")
     * .userPoolId("userPoolId")
     * .build())
     * .domainArn("domainArn")
     * .domainEndpointOptions(DomainEndpointOptionsProperty.builder()
     * .customEndpoint("customEndpoint")
     * .customEndpointCertificateArn("customEndpointCertificateArn")
     * .customEndpointEnabled(false)
     * .enforceHttps(false)
     * .tlsSecurityPolicy("tlsSecurityPolicy")
     * .build())
     * .domainName("domainName")
     * .ebsOptions(EBSOptionsProperty.builder()
     * .ebsEnabled(false)
     * .iops(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .elasticsearchClusterConfig(ElasticsearchClusterConfigProperty.builder()
     * .coldStorageOptions(ColdStorageOptionsProperty.builder()
     * .enabled(false)
     * .build())
     * .dedicatedMasterCount(123)
     * .dedicatedMasterEnabled(false)
     * .dedicatedMasterType("dedicatedMasterType")
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .warmCount(123)
     * .warmEnabled(false)
     * .warmType("warmType")
     * .zoneAwarenessConfig(ZoneAwarenessConfigProperty.builder()
     * .availabilityZoneCount(123)
     * .build())
     * .zoneAwarenessEnabled(false)
     * .build())
     * .elasticsearchVersion("elasticsearchVersion")
     * .encryptionAtRestOptions(EncryptionAtRestOptionsProperty.builder()
     * .enabled(false)
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .logPublishingOptions(Map.of(
     * "logPublishingOptionsKey", LogPublishingOptionProperty.builder()
     * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
     * .enabled(false)
     * .build()))
     * .nodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsProperty.builder()
     * .enabled(false)
     * .build())
     * .snapshotOptions(SnapshotOptionsProperty.builder()
     * .automatedSnapshotStartHour(123)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcOptions(VPCOptionsProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html)
     */
    public inline fun cfnDomain(
        scope: Construct,
        id: String,
        block: CfnDomainDsl.() -> Unit = {},
    ): CfnDomain {
        val builder = CfnDomainDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies options for fine-grained access control.
     *
     * The `AWS::Elasticsearch::Domain` resource is being replaced by the
     * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
     * resource. While the legacy Elasticsearch resource and options are still supported, we
     * recommend modifying your existing Cloudformation templates to use the new OpenSearch Service
     * resource, which supports both OpenSearch and Elasticsearch. For more information about the
     * service rename, see
     * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * AdvancedSecurityOptionsInputProperty advancedSecurityOptionsInputProperty =
     * AdvancedSecurityOptionsInputProperty.builder()
     * .anonymousAuthEnabled(false)
     * .enabled(false)
     * .internalUserDatabaseEnabled(false)
     * .masterUserOptions(MasterUserOptionsProperty.builder()
     * .masterUserArn("masterUserArn")
     * .masterUserName("masterUserName")
     * .masterUserPassword("masterUserPassword")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-advancedsecurityoptionsinput.html)
     */
    public inline fun cfnDomainAdvancedSecurityOptionsInputProperty(
        block: CfnDomainAdvancedSecurityOptionsInputPropertyDsl.() -> Unit = {}
    ): CfnDomain.AdvancedSecurityOptionsInputProperty {
        val builder = CfnDomainAdvancedSecurityOptionsInputPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * The `AWS::Elasticsearch::Domain` resource is being replaced by the
     * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
     * resource. While the legacy Elasticsearch resource and options are still supported, we
     * recommend modifying your existing Cloudformation templates to use the new OpenSearch Service
     * resource, which supports both OpenSearch and Elasticsearch. For more information about the
     * service rename, see
     * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * CognitoOptionsProperty cognitoOptionsProperty = CognitoOptionsProperty.builder()
     * .enabled(false)
     * .identityPoolId("identityPoolId")
     * .roleArn("roleArn")
     * .userPoolId("userPoolId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-cognitooptions.html)
     */
    public inline fun cfnDomainCognitoOptionsProperty(
        block: CfnDomainCognitoOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.CognitoOptionsProperty {
        val builder = CfnDomainCognitoOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies options for cold storage. For more information, see
     * [Cold storage for Amazon Elasticsearch Service](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/cold-storage.html)
     * .
     *
     * The `AWS::Elasticsearch::Domain` resource is being replaced by the
     * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
     * resource. While the legacy Elasticsearch resource and options are still supported, we
     * recommend modifying your existing Cloudformation templates to use the new OpenSearch Service
     * resource, which supports both OpenSearch and Elasticsearch. For more information about the
     * service rename, see
     * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * ColdStorageOptionsProperty coldStorageOptionsProperty = ColdStorageOptionsProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-coldstorageoptions.html)
     */
    public inline fun cfnDomainColdStorageOptionsProperty(
        block: CfnDomainColdStorageOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.ColdStorageOptionsProperty {
        val builder = CfnDomainColdStorageOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * The `AWS::Elasticsearch::Domain` resource is being replaced by the
     * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
     * resource. While the legacy Elasticsearch resource and options are still supported, we
     * recommend modifying your existing Cloudformation templates to use the new OpenSearch Service
     * resource, which supports both OpenSearch and Elasticsearch. For more information about the
     * service rename, see
     * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * DomainEndpointOptionsProperty domainEndpointOptionsProperty =
     * DomainEndpointOptionsProperty.builder()
     * .customEndpoint("customEndpoint")
     * .customEndpointCertificateArn("customEndpointCertificateArn")
     * .customEndpointEnabled(false)
     * .enforceHttps(false)
     * .tlsSecurityPolicy("tlsSecurityPolicy")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-domainendpointoptions.html)
     */
    public inline fun cfnDomainDomainEndpointOptionsProperty(
        block: CfnDomainDomainEndpointOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.DomainEndpointOptionsProperty {
        val builder = CfnDomainDomainEndpointOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see
     * [EBS volume size limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * The `AWS::Elasticsearch::Domain` resource is being replaced by the
     * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
     * resource. While the legacy Elasticsearch resource and options are still supported, we
     * recommend modifying your existing Cloudformation templates to use the new OpenSearch Service
     * resource, which supports both OpenSearch and Elasticsearch. For more information about the
     * service rename, see
     * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * EBSOptionsProperty eBSOptionsProperty = EBSOptionsProperty.builder()
     * .ebsEnabled(false)
     * .iops(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-ebsoptions.html)
     */
    public inline fun cfnDomainEBSOptionsProperty(
        block: CfnDomainEBSOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.EBSOptionsProperty {
        val builder = CfnDomainEBSOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The cluster configuration for the OpenSearch Service domain.
     *
     * You can specify options such as the instance type and the number of instances. For more
     * information, see
     * [Creating and managing Amazon OpenSearch Service domains](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * The `AWS::Elasticsearch::Domain` resource is being replaced by the
     * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
     * resource. While the legacy Elasticsearch resource and options are still supported, we
     * recommend modifying your existing Cloudformation templates to use the new OpenSearch Service
     * resource, which supports both OpenSearch and Elasticsearch. For more information about the
     * service rename, see
     * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * ElasticsearchClusterConfigProperty elasticsearchClusterConfigProperty =
     * ElasticsearchClusterConfigProperty.builder()
     * .coldStorageOptions(ColdStorageOptionsProperty.builder()
     * .enabled(false)
     * .build())
     * .dedicatedMasterCount(123)
     * .dedicatedMasterEnabled(false)
     * .dedicatedMasterType("dedicatedMasterType")
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .warmCount(123)
     * .warmEnabled(false)
     * .warmType("warmType")
     * .zoneAwarenessConfig(ZoneAwarenessConfigProperty.builder()
     * .availabilityZoneCount(123)
     * .build())
     * .zoneAwarenessEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-elasticsearchclusterconfig.html)
     */
    public inline fun cfnDomainElasticsearchClusterConfigProperty(
        block: CfnDomainElasticsearchClusterConfigPropertyDsl.() -> Unit = {}
    ): CfnDomain.ElasticsearchClusterConfigProperty {
        val builder = CfnDomainElasticsearchClusterConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
     * to use.
     *
     * The `AWS::Elasticsearch::Domain` resource is being replaced by the
     * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
     * resource. While the legacy Elasticsearch resource and options are still supported, we
     * recommend modifying your existing Cloudformation templates to use the new OpenSearch Service
     * resource, which supports both OpenSearch and Elasticsearch. For more information about the
     * service rename, see
     * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * EncryptionAtRestOptionsProperty encryptionAtRestOptionsProperty =
     * EncryptionAtRestOptionsProperty.builder()
     * .enabled(false)
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-encryptionatrestoptions.html)
     */
    public inline fun cfnDomainEncryptionAtRestOptionsProperty(
        block: CfnDomainEncryptionAtRestOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.EncryptionAtRestOptionsProperty {
        val builder = CfnDomainEncryptionAtRestOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Elasticsearch::Domain` resource is being replaced by the
     * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
     * resource. While the legacy Elasticsearch resource and options are still supported, we
     * recommend modifying your existing Cloudformation templates to use the new OpenSearch Service
     * resource, which supports both OpenSearch and Elasticsearch. For more information about the
     * service rename, see
     * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * Specifies whether the OpenSearch Service domain publishes the Elasticsearch application,
     * search slow logs, or index slow logs to Amazon CloudWatch. Each option must be an object of
     * name `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , or `AUDIT_LOGS`
     * depending on the type of logs you want to publish.
     *
     * If you enable a slow log, you still have to enable the *collection* of slow logs using the
     * Configuration API. To learn more, see
     * [Enabling log publishing ( AWS CLI)](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createdomain-configure-slow-logs.html#createdomain-configure-slow-logs-cli)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * LogPublishingOptionProperty logPublishingOptionProperty = LogPublishingOptionProperty.builder()
     * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-logpublishingoption.html)
     */
    public inline fun cfnDomainLogPublishingOptionProperty(
        block: CfnDomainLogPublishingOptionPropertyDsl.() -> Unit = {}
    ): CfnDomain.LogPublishingOptionProperty {
        val builder = CfnDomainLogPublishingOptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies information about the master user. Required if you enabled the internal user
     * database.
     *
     * The `AWS::Elasticsearch::Domain` resource is being replaced by the
     * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
     * resource. While the legacy Elasticsearch resource and options are still supported, we
     * recommend modifying your existing Cloudformation templates to use the new OpenSearch Service
     * resource, which supports both OpenSearch and Elasticsearch. For more information about the
     * service rename, see
     * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * MasterUserOptionsProperty masterUserOptionsProperty = MasterUserOptionsProperty.builder()
     * .masterUserArn("masterUserArn")
     * .masterUserName("masterUserName")
     * .masterUserPassword("masterUserPassword")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-masteruseroptions.html)
     */
    public inline fun cfnDomainMasterUserOptionsProperty(
        block: CfnDomainMasterUserOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.MasterUserOptionsProperty {
        val builder = CfnDomainMasterUserOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * The `AWS::Elasticsearch::Domain` resource is being replaced by the
     * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
     * resource. While the legacy Elasticsearch resource and options are still supported, we
     * recommend modifying your existing Cloudformation templates to use the new OpenSearch Service
     * resource, which supports both OpenSearch and Elasticsearch. For more information about the
     * service rename, see
     * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * NodeToNodeEncryptionOptionsProperty nodeToNodeEncryptionOptionsProperty =
     * NodeToNodeEncryptionOptionsProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-nodetonodeencryptionoptions.html)
     */
    public inline fun cfnDomainNodeToNodeEncryptionOptionsProperty(
        block: CfnDomainNodeToNodeEncryptionOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.NodeToNodeEncryptionOptionsProperty {
        val builder = CfnDomainNodeToNodeEncryptionOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDomain`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * Object accessPolicies;
     * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
     * .accessPolicies(accessPolicies)
     * .advancedOptions(Map.of(
     * "advancedOptionsKey", "advancedOptions"))
     * .advancedSecurityOptions(AdvancedSecurityOptionsInputProperty.builder()
     * .anonymousAuthEnabled(false)
     * .enabled(false)
     * .internalUserDatabaseEnabled(false)
     * .masterUserOptions(MasterUserOptionsProperty.builder()
     * .masterUserArn("masterUserArn")
     * .masterUserName("masterUserName")
     * .masterUserPassword("masterUserPassword")
     * .build())
     * .build())
     * .cognitoOptions(CognitoOptionsProperty.builder()
     * .enabled(false)
     * .identityPoolId("identityPoolId")
     * .roleArn("roleArn")
     * .userPoolId("userPoolId")
     * .build())
     * .domainArn("domainArn")
     * .domainEndpointOptions(DomainEndpointOptionsProperty.builder()
     * .customEndpoint("customEndpoint")
     * .customEndpointCertificateArn("customEndpointCertificateArn")
     * .customEndpointEnabled(false)
     * .enforceHttps(false)
     * .tlsSecurityPolicy("tlsSecurityPolicy")
     * .build())
     * .domainName("domainName")
     * .ebsOptions(EBSOptionsProperty.builder()
     * .ebsEnabled(false)
     * .iops(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .elasticsearchClusterConfig(ElasticsearchClusterConfigProperty.builder()
     * .coldStorageOptions(ColdStorageOptionsProperty.builder()
     * .enabled(false)
     * .build())
     * .dedicatedMasterCount(123)
     * .dedicatedMasterEnabled(false)
     * .dedicatedMasterType("dedicatedMasterType")
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .warmCount(123)
     * .warmEnabled(false)
     * .warmType("warmType")
     * .zoneAwarenessConfig(ZoneAwarenessConfigProperty.builder()
     * .availabilityZoneCount(123)
     * .build())
     * .zoneAwarenessEnabled(false)
     * .build())
     * .elasticsearchVersion("elasticsearchVersion")
     * .encryptionAtRestOptions(EncryptionAtRestOptionsProperty.builder()
     * .enabled(false)
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .logPublishingOptions(Map.of(
     * "logPublishingOptionsKey", LogPublishingOptionProperty.builder()
     * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
     * .enabled(false)
     * .build()))
     * .nodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsProperty.builder()
     * .enabled(false)
     * .build())
     * .snapshotOptions(SnapshotOptionsProperty.builder()
     * .automatedSnapshotStartHour(123)
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .vpcOptions(VPCOptionsProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticsearch-domain.html)
     */
    public inline fun cfnDomainProps(block: CfnDomainPropsDsl.() -> Unit = {}): CfnDomainProps {
        val builder = CfnDomainPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::Elasticsearch::Domain` resource is being replaced by the
     * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
     * resource. While the legacy Elasticsearch resource and options are still supported, we
     * recommend modifying your existing Cloudformation templates to use the new OpenSearch Service
     * resource, which supports both OpenSearch and Elasticsearch. For more information about the
     * service rename, see
     * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * *DEPRECATED* . For domains running Elasticsearch 5.3 and later, OpenSearch Service takes
     * hourly automated snapshots, making this setting irrelevant. For domains running earlier
     * versions of Elasticsearch, OpenSearch Service takes daily automated snapshots.
     *
     * The automated snapshot configuration for the OpenSearch Service domain indices.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * SnapshotOptionsProperty snapshotOptionsProperty = SnapshotOptionsProperty.builder()
     * .automatedSnapshotStartHour(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-snapshotoptions.html)
     */
    public inline fun cfnDomainSnapshotOptionsProperty(
        block: CfnDomainSnapshotOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.SnapshotOptionsProperty {
        val builder = CfnDomainSnapshotOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see
     * [Launching your Amazon OpenSearch Service domains using a VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * The `AWS::Elasticsearch::Domain` resource is being replaced by the
     * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
     * resource. While the legacy Elasticsearch resource and options are still supported, we
     * recommend modifying your existing Cloudformation templates to use the new OpenSearch Service
     * resource, which supports both OpenSearch and Elasticsearch. For more information about the
     * service rename, see
     * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * VPCOptionsProperty vPCOptionsProperty = VPCOptionsProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html)
     */
    public inline fun cfnDomainVPCOptionsProperty(
        block: CfnDomainVPCOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.VPCOptionsProperty {
        val builder = CfnDomainVPCOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies zone awareness configuration options. Only use if `ZoneAwarenessEnabled` is `true`
     * .
     *
     * The `AWS::Elasticsearch::Domain` resource is being replaced by the
     * [AWS::OpenSearchService::Domain](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
     * resource. While the legacy Elasticsearch resource and options are still supported, we
     * recommend modifying your existing Cloudformation templates to use the new OpenSearch Service
     * resource, which supports both OpenSearch and Elasticsearch. For more information about the
     * service rename, see
     * [New resource types](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/rename.html#rename-resource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * ZoneAwarenessConfigProperty zoneAwarenessConfigProperty = ZoneAwarenessConfigProperty.builder()
     * .availabilityZoneCount(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-zoneawarenessconfig.html)
     */
    public inline fun cfnDomainZoneAwarenessConfigProperty(
        block: CfnDomainZoneAwarenessConfigPropertyDsl.() -> Unit = {}
    ): CfnDomain.ZoneAwarenessConfigProperty {
        val builder = CfnDomainZoneAwarenessConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (deprecated) Configures Amazon ES to use Amazon Cognito authentication for Kibana.
     *
     * Example:
     * ```
     * Domain.Builder.create(this, "Domain")
     * .cognitoKibanaAuth(CognitoOptions.builder()
     * .identityPoolId("test-identity-pool-id")
     * .userPoolId("test-user-pool-id")
     * .role(role)
     * .build())
     * .version(elasticsearchVersion)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html)
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public inline fun cognitoOptions(block: CognitoOptionsDsl.() -> Unit = {}): CognitoOptions {
        val builder = CognitoOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (deprecated) Configures a custom domain endpoint for the ES domain.
     *
     * Example:
     * ```
     * Domain.Builder.create(this, "Domain")
     * .version(ElasticsearchVersion.V7_7)
     * .customEndpoint(CustomEndpointOptions.builder()
     * .domainName("search.example.com")
     * .build())
     * .build();
     * ```
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public inline fun customEndpointOptions(
        block: CustomEndpointOptionsDsl.() -> Unit = {}
    ): CustomEndpointOptions {
        val builder = CustomEndpointOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (deprecated) Provides an Elasticsearch domain.
     *
     * Example:
     * ```
     * Domain domain = Domain.Builder.create(this, "Domain")
     * .version(ElasticsearchVersion.V7_4)
     * .ebs(EbsOptions.builder()
     * .volumeSize(100)
     * .volumeType(EbsDeviceVolumeType.GENERAL_PURPOSE_SSD)
     * .build())
     * .nodeToNodeEncryption(true)
     * .encryptionAtRest(EncryptionAtRestOptions.builder()
     * .enabled(true)
     * .build())
     * .build();
     * ```
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public inline fun domain(
        scope: Construct,
        id: String,
        block: DomainDsl.() -> Unit = {},
    ): software.amazon.awscdk.services.elasticsearch.Domain {
        val builder = DomainDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * (deprecated) Reference to an Elasticsearch domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.elasticsearch.*;
     * DomainAttributes domainAttributes = DomainAttributes.builder()
     * .domainArn("domainArn")
     * .domainEndpoint("domainEndpoint")
     * .build();
     * ```
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public inline fun domainAttributes(
        block: DomainAttributesDsl.() -> Unit = {}
    ): DomainAttributes {
        val builder = DomainAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (deprecated) Properties for an AWS Elasticsearch Domain.
     *
     * Example:
     * ```
     * Domain domain = Domain.Builder.create(this, "Domain")
     * .version(ElasticsearchVersion.V7_4)
     * .ebs(EbsOptions.builder()
     * .volumeSize(100)
     * .volumeType(EbsDeviceVolumeType.GENERAL_PURPOSE_SSD)
     * .build())
     * .nodeToNodeEncryption(true)
     * .encryptionAtRest(EncryptionAtRestOptions.builder()
     * .enabled(true)
     * .build())
     * .build();
     * ```
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public inline fun domainProps(block: DomainPropsDsl.() -> Unit = {}): DomainProps {
        val builder = DomainPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (deprecated) The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     * attached to data nodes in the Amazon ES domain.
     *
     * For more information, see [Configuring EBS-based Storage]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
     * in the Amazon Elasticsearch Service Developer Guide.
     *
     * Example:
     * ```
     * Domain prodDomain = Domain.Builder.create(this, "Domain")
     * .version(ElasticsearchVersion.V7_1)
     * .capacity(CapacityConfig.builder()
     * .masterNodes(5)
     * .dataNodes(20)
     * .build())
     * .ebs(EbsOptions.builder()
     * .volumeSize(20)
     * .build())
     * .zoneAwareness(ZoneAwarenessConfig.builder()
     * .availabilityZoneCount(3)
     * .build())
     * .logging(LoggingOptions.builder()
     * .slowSearchLogEnabled(true)
     * .appLogEnabled(true)
     * .slowIndexLogEnabled(true)
     * .build())
     * .build();
     * ```
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public inline fun ebsOptions(block: EbsOptionsDsl.() -> Unit = {}): EbsOptions {
        val builder = EbsOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (deprecated) Whether the domain should encrypt data at rest, and if so, the AWS Key
     * Management Service (KMS) key to use.
     *
     * Can only be used to create a new domain, not update an existing one. Requires Elasticsearch
     * version 5.1 or later.
     *
     * Example:
     * ```
     * Domain domain = Domain.Builder.create(this, "Domain")
     * .version(ElasticsearchVersion.V7_1)
     * .enforceHttps(true)
     * .nodeToNodeEncryption(true)
     * .encryptionAtRest(EncryptionAtRestOptions.builder()
     * .enabled(true)
     * .build())
     * .fineGrainedAccessControl(AdvancedSecurityOptions.builder()
     * .masterUserName("master-user")
     * .build())
     * .build();
     * SecretValue masterUserPassword = domain.getMasterUserPassword();
     * ```
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public inline fun encryptionAtRestOptions(
        block: EncryptionAtRestOptionsDsl.() -> Unit = {}
    ): EncryptionAtRestOptions {
        val builder = EncryptionAtRestOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (deprecated) Configures log settings for the domain.
     *
     * Example:
     * ```
     * Domain prodDomain = Domain.Builder.create(this, "Domain")
     * .version(ElasticsearchVersion.V7_1)
     * .capacity(CapacityConfig.builder()
     * .masterNodes(5)
     * .dataNodes(20)
     * .build())
     * .ebs(EbsOptions.builder()
     * .volumeSize(20)
     * .build())
     * .zoneAwareness(ZoneAwarenessConfig.builder()
     * .availabilityZoneCount(3)
     * .build())
     * .logging(LoggingOptions.builder()
     * .slowSearchLogEnabled(true)
     * .appLogEnabled(true)
     * .slowIndexLogEnabled(true)
     * .build())
     * .build();
     * ```
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public inline fun loggingOptions(block: LoggingOptionsDsl.() -> Unit = {}): LoggingOptions {
        val builder = LoggingOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * (deprecated) Specifies zone awareness configuration options.
     *
     * Example:
     * ```
     * Domain prodDomain = Domain.Builder.create(this, "Domain")
     * .version(ElasticsearchVersion.V7_1)
     * .capacity(CapacityConfig.builder()
     * .masterNodes(5)
     * .dataNodes(20)
     * .build())
     * .ebs(EbsOptions.builder()
     * .volumeSize(20)
     * .build())
     * .zoneAwareness(ZoneAwarenessConfig.builder()
     * .availabilityZoneCount(3)
     * .build())
     * .logging(LoggingOptions.builder()
     * .slowSearchLogEnabled(true)
     * .appLogEnabled(true)
     * .slowIndexLogEnabled(true)
     * .build())
     * .build();
     * ```
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public inline fun zoneAwarenessConfig(
        block: ZoneAwarenessConfigDsl.() -> Unit = {}
    ): ZoneAwarenessConfig {
        val builder = ZoneAwarenessConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    public object Domain {
        public fun fromDomainAttributes(
            scope: Construct,
            id: String,
            block: DomainAttributesDsl.() -> Unit = {},
        ): IDomain {
            val builder = DomainAttributesDsl()
            builder.apply(block)
            return software.amazon.awscdk.services.elasticsearch.Domain.fromDomainAttributes(
                scope,
                id,
                builder.build()
            )
        }
    }
}
