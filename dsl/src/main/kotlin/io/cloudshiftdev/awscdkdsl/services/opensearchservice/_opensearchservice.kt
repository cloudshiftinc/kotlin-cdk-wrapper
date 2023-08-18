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

package io.cloudshiftdev.awscdkdsl.services.opensearchservice

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions
import software.amazon.awscdk.services.opensearchservice.CapacityConfig
import software.amazon.awscdk.services.opensearchservice.CfnDomain
import software.amazon.awscdk.services.opensearchservice.CfnDomainProps
import software.amazon.awscdk.services.opensearchservice.CognitoOptions
import software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions
import software.amazon.awscdk.services.opensearchservice.Domain
import software.amazon.awscdk.services.opensearchservice.DomainAttributes
import software.amazon.awscdk.services.opensearchservice.DomainProps
import software.amazon.awscdk.services.opensearchservice.EbsOptions
import software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions
import software.amazon.awscdk.services.opensearchservice.LoggingOptions
import software.amazon.awscdk.services.opensearchservice.SAMLOptionsProperty
import software.amazon.awscdk.services.opensearchservice.WindowStartTime
import software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig
import software.constructs.Construct

public object opensearchservice {
    /**
     * Specifies options for fine-grained access control.
     *
     * Example:
     * ```
     * Domain domain = Domain.Builder.create(this, "Domain")
     * .version(EngineVersion.OPENSEARCH_1_0)
     * .enforceHttps(true)
     * .nodeToNodeEncryption(true)
     * .encryptionAtRest(EncryptionAtRestOptions.builder()
     * .enabled(true)
     * .build())
     * .fineGrainedAccessControl(AdvancedSecurityOptions.builder()
     * .masterUserName("master-user")
     * .samlAuthenticationEnabled(true)
     * .samlAuthenticationOptions(SAMLOptionsProperty.builder()
     * .idpEntityId("entity-id")
     * .idpMetadataContent("metadata-content-with-quotes-escaped")
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun advancedSecurityOptions(
        block: AdvancedSecurityOptionsDsl.() -> Unit = {}
    ): AdvancedSecurityOptions {
        val builder = AdvancedSecurityOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures the capacity of the cluster such as the instance type and the number of instances.
     *
     * Example:
     * ```
     * Domain domain = Domain.Builder.create(this, "Domain")
     * .version(EngineVersion.OPENSEARCH_1_0)
     * .capacity(CapacityConfig.builder()
     * .masterNodes(2)
     * .warmNodes(2)
     * .warmInstanceType("ultrawarm1.medium.search")
     * .build())
     * .build();
     * ```
     */
    public inline fun capacityConfig(block: CapacityConfigDsl.() -> Unit = {}): CapacityConfig {
        val builder = CapacityConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The AWS::OpenSearchService::Domain resource creates an Amazon OpenSearch Service domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * Object accessPolicies;
     * CfnDomain cfnDomain = CfnDomain.Builder.create(this, "MyCfnDomain")
     * .accessPolicies(accessPolicies)
     * .advancedOptions(Map.of(
     * "advancedOptionsKey", "advancedOptions"))
     * .advancedSecurityOptions(AdvancedSecurityOptionsInputProperty.builder()
     * .anonymousAuthDisableDate("anonymousAuthDisableDate")
     * .anonymousAuthEnabled(false)
     * .enabled(false)
     * .internalUserDatabaseEnabled(false)
     * .masterUserOptions(MasterUserOptionsProperty.builder()
     * .masterUserArn("masterUserArn")
     * .masterUserName("masterUserName")
     * .masterUserPassword("masterUserPassword")
     * .build())
     * .samlOptions(SAMLOptionsProperty.builder()
     * .enabled(false)
     * .idp(IdpProperty.builder()
     * .entityId("entityId")
     * .metadataContent("metadataContent")
     * .build())
     * .masterBackendRole("masterBackendRole")
     * .masterUserName("masterUserName")
     * .rolesKey("rolesKey")
     * .sessionTimeoutMinutes(123)
     * .subjectKey("subjectKey")
     * .build())
     * .build())
     * .clusterConfig(ClusterConfigProperty.builder()
     * .dedicatedMasterCount(123)
     * .dedicatedMasterEnabled(false)
     * .dedicatedMasterType("dedicatedMasterType")
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .multiAzWithStandbyEnabled(false)
     * .warmCount(123)
     * .warmEnabled(false)
     * .warmType("warmType")
     * .zoneAwarenessConfig(ZoneAwarenessConfigProperty.builder()
     * .availabilityZoneCount(123)
     * .build())
     * .zoneAwarenessEnabled(false)
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
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .encryptionAtRestOptions(EncryptionAtRestOptionsProperty.builder()
     * .enabled(false)
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .engineVersion("engineVersion")
     * .logPublishingOptions(Map.of(
     * "logPublishingOptionsKey", LogPublishingOptionProperty.builder()
     * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
     * .enabled(false)
     * .build()))
     * .nodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsProperty.builder()
     * .enabled(false)
     * .build())
     * .offPeakWindowOptions(OffPeakWindowOptionsProperty.builder()
     * .enabled(false)
     * .offPeakWindow(OffPeakWindowProperty.builder()
     * .windowStartTime(WindowStartTimeProperty.builder()
     * .hours(123)
     * .minutes(123)
     * .build())
     * .build())
     * .build())
     * .snapshotOptions(SnapshotOptionsProperty.builder()
     * .automatedSnapshotStartHour(123)
     * .build())
     * .softwareUpdateOptions(SoftwareUpdateOptionsProperty.builder()
     * .autoSoftwareUpdateEnabled(false)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
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
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * AdvancedSecurityOptionsInputProperty advancedSecurityOptionsInputProperty =
     * AdvancedSecurityOptionsInputProperty.builder()
     * .anonymousAuthDisableDate("anonymousAuthDisableDate")
     * .anonymousAuthEnabled(false)
     * .enabled(false)
     * .internalUserDatabaseEnabled(false)
     * .masterUserOptions(MasterUserOptionsProperty.builder()
     * .masterUserArn("masterUserArn")
     * .masterUserName("masterUserName")
     * .masterUserPassword("masterUserPassword")
     * .build())
     * .samlOptions(SAMLOptionsProperty.builder()
     * .enabled(false)
     * .idp(IdpProperty.builder()
     * .entityId("entityId")
     * .metadataContent("metadataContent")
     * .build())
     * .masterBackendRole("masterBackendRole")
     * .masterUserName("masterUserName")
     * .rolesKey("rolesKey")
     * .sessionTimeoutMinutes(123)
     * .subjectKey("subjectKey")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
     */
    public inline fun cfnDomainAdvancedSecurityOptionsInputProperty(
        block: CfnDomainAdvancedSecurityOptionsInputPropertyDsl.() -> Unit = {}
    ): CfnDomain.AdvancedSecurityOptionsInputProperty {
        val builder = CfnDomainAdvancedSecurityOptionsInputPropertyDsl()
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
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * ClusterConfigProperty clusterConfigProperty = ClusterConfigProperty.builder()
     * .dedicatedMasterCount(123)
     * .dedicatedMasterEnabled(false)
     * .dedicatedMasterType("dedicatedMasterType")
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .multiAzWithStandbyEnabled(false)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html)
     */
    public inline fun cfnDomainClusterConfigProperty(
        block: CfnDomainClusterConfigPropertyDsl.() -> Unit = {}
    ): CfnDomain.ClusterConfigProperty {
        val builder = CfnDomainClusterConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * CognitoOptionsProperty cognitoOptionsProperty = CognitoOptionsProperty.builder()
     * .enabled(false)
     * .identityPoolId("identityPoolId")
     * .roleArn("roleArn")
     * .userPoolId("userPoolId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-cognitooptions.html)
     */
    public inline fun cfnDomainCognitoOptionsProperty(
        block: CfnDomainCognitoOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.CognitoOptionsProperty {
        val builder = CfnDomainCognitoOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
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
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * EBSOptionsProperty eBSOptionsProperty = EBSOptionsProperty.builder()
     * .ebsEnabled(false)
     * .iops(123)
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-ebsoptions.html)
     */
    public inline fun cfnDomainEBSOptionsProperty(
        block: CfnDomainEBSOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.EBSOptionsProperty {
        val builder = CfnDomainEBSOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
     * to use.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * EncryptionAtRestOptionsProperty encryptionAtRestOptionsProperty =
     * EncryptionAtRestOptionsProperty.builder()
     * .enabled(false)
     * .kmsKeyId("kmsKeyId")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     */
    public inline fun cfnDomainEncryptionAtRestOptionsProperty(
        block: CfnDomainEncryptionAtRestOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.EncryptionAtRestOptionsProperty {
        val builder = CfnDomainEncryptionAtRestOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The SAML Identity Provider's information.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * IdpProperty idpProperty = IdpProperty.builder()
     * .entityId("entityId")
     * .metadataContent("metadataContent")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-idp.html)
     */
    public inline fun cfnDomainIdpProperty(
        block: CfnDomainIdpPropertyDsl.() -> Unit = {}
    ): CfnDomain.IdpProperty {
        val builder = CfnDomainIdpPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies whether the OpenSearch Service domain publishes application, search slow logs, or
     * index slow logs to Amazon CloudWatch.
     *
     * Each option must be an object of name `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` ,
     * `INDEX_SLOW_LOGS` , or `AUDIT_LOGS` depending on the type of logs you want to publish. For
     * the full syntax, see the
     * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
     * .
     *
     * Before you enable log publishing, you need to create a CloudWatch log group and provide
     * OpenSearch Service the correct permissions to write to it. To learn more, see
     * [Enabling log publishing ( AWS CloudFormation)](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createdomain-configure-slow-logs.html#createdomain-configure-slow-logs-cfn)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * LogPublishingOptionProperty logPublishingOptionProperty = LogPublishingOptionProperty.builder()
     * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-logpublishingoption.html)
     */
    public inline fun cfnDomainLogPublishingOptionProperty(
        block: CfnDomainLogPublishingOptionPropertyDsl.() -> Unit = {}
    ): CfnDomain.LogPublishingOptionProperty {
        val builder = CfnDomainLogPublishingOptionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies information about the master user.
     *
     * Required if if `InternalUserDatabaseEnabled` is true in
     * [AdvancedSecurityOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * MasterUserOptionsProperty masterUserOptionsProperty = MasterUserOptionsProperty.builder()
     * .masterUserArn("masterUserArn")
     * .masterUserName("masterUserName")
     * .masterUserPassword("masterUserPassword")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-masteruseroptions.html)
     */
    public inline fun cfnDomainMasterUserOptionsProperty(
        block: CfnDomainMasterUserOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.MasterUserOptionsProperty {
        val builder = CfnDomainMasterUserOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies options for node-to-node encryption.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * NodeToNodeEncryptionOptionsProperty nodeToNodeEncryptionOptionsProperty =
     * NodeToNodeEncryptionOptionsProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     */
    public inline fun cfnDomainNodeToNodeEncryptionOptionsProperty(
        block: CfnDomainNodeToNodeEncryptionOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.NodeToNodeEncryptionOptionsProperty {
        val builder = CfnDomainNodeToNodeEncryptionOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Off-peak window settings for the domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * OffPeakWindowOptionsProperty offPeakWindowOptionsProperty =
     * OffPeakWindowOptionsProperty.builder()
     * .enabled(false)
     * .offPeakWindow(OffPeakWindowProperty.builder()
     * .windowStartTime(WindowStartTimeProperty.builder()
     * .hours(123)
     * .minutes(123)
     * .build())
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-offpeakwindowoptions.html)
     */
    public inline fun cfnDomainOffPeakWindowOptionsProperty(
        block: CfnDomainOffPeakWindowOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.OffPeakWindowOptionsProperty {
        val builder = CfnDomainOffPeakWindowOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom 10-hour, low-traffic window during which OpenSearch Service can perform mandatory
     * configuration changes on the domain.
     *
     * These actions can include scheduled service software updates and blue/green Auto-Tune
     * enhancements. OpenSearch Service will schedule these actions during the window that you
     * specify. If you don't specify a window start time, it defaults to 10:00 P.M. local time.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * OffPeakWindowProperty offPeakWindowProperty = OffPeakWindowProperty.builder()
     * .windowStartTime(WindowStartTimeProperty.builder()
     * .hours(123)
     * .minutes(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-offpeakwindow.html)
     */
    public inline fun cfnDomainOffPeakWindowProperty(
        block: CfnDomainOffPeakWindowPropertyDsl.() -> Unit = {}
    ): CfnDomain.OffPeakWindowProperty {
        val builder = CfnDomainOffPeakWindowPropertyDsl()
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
     * import software.amazon.awscdk.services.opensearchservice.*;
     * Object accessPolicies;
     * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
     * .accessPolicies(accessPolicies)
     * .advancedOptions(Map.of(
     * "advancedOptionsKey", "advancedOptions"))
     * .advancedSecurityOptions(AdvancedSecurityOptionsInputProperty.builder()
     * .anonymousAuthDisableDate("anonymousAuthDisableDate")
     * .anonymousAuthEnabled(false)
     * .enabled(false)
     * .internalUserDatabaseEnabled(false)
     * .masterUserOptions(MasterUserOptionsProperty.builder()
     * .masterUserArn("masterUserArn")
     * .masterUserName("masterUserName")
     * .masterUserPassword("masterUserPassword")
     * .build())
     * .samlOptions(SAMLOptionsProperty.builder()
     * .enabled(false)
     * .idp(IdpProperty.builder()
     * .entityId("entityId")
     * .metadataContent("metadataContent")
     * .build())
     * .masterBackendRole("masterBackendRole")
     * .masterUserName("masterUserName")
     * .rolesKey("rolesKey")
     * .sessionTimeoutMinutes(123)
     * .subjectKey("subjectKey")
     * .build())
     * .build())
     * .clusterConfig(ClusterConfigProperty.builder()
     * .dedicatedMasterCount(123)
     * .dedicatedMasterEnabled(false)
     * .dedicatedMasterType("dedicatedMasterType")
     * .instanceCount(123)
     * .instanceType("instanceType")
     * .multiAzWithStandbyEnabled(false)
     * .warmCount(123)
     * .warmEnabled(false)
     * .warmType("warmType")
     * .zoneAwarenessConfig(ZoneAwarenessConfigProperty.builder()
     * .availabilityZoneCount(123)
     * .build())
     * .zoneAwarenessEnabled(false)
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
     * .throughput(123)
     * .volumeSize(123)
     * .volumeType("volumeType")
     * .build())
     * .encryptionAtRestOptions(EncryptionAtRestOptionsProperty.builder()
     * .enabled(false)
     * .kmsKeyId("kmsKeyId")
     * .build())
     * .engineVersion("engineVersion")
     * .logPublishingOptions(Map.of(
     * "logPublishingOptionsKey", LogPublishingOptionProperty.builder()
     * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
     * .enabled(false)
     * .build()))
     * .nodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsProperty.builder()
     * .enabled(false)
     * .build())
     * .offPeakWindowOptions(OffPeakWindowOptionsProperty.builder()
     * .enabled(false)
     * .offPeakWindow(OffPeakWindowProperty.builder()
     * .windowStartTime(WindowStartTimeProperty.builder()
     * .hours(123)
     * .minutes(123)
     * .build())
     * .build())
     * .build())
     * .snapshotOptions(SnapshotOptionsProperty.builder()
     * .automatedSnapshotStartHour(123)
     * .build())
     * .softwareUpdateOptions(SoftwareUpdateOptionsProperty.builder()
     * .autoSoftwareUpdateEnabled(false)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html)
     */
    public inline fun cfnDomainProps(block: CfnDomainPropsDsl.() -> Unit = {}): CfnDomainProps {
        val builder = CfnDomainPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Container for information about the SAML configuration for OpenSearch Dashboards.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * SAMLOptionsProperty sAMLOptionsProperty = SAMLOptionsProperty.builder()
     * .enabled(false)
     * .idp(IdpProperty.builder()
     * .entityId("entityId")
     * .metadataContent("metadataContent")
     * .build())
     * .masterBackendRole("masterBackendRole")
     * .masterUserName("masterUserName")
     * .rolesKey("rolesKey")
     * .sessionTimeoutMinutes(123)
     * .subjectKey("subjectKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html)
     */
    public inline fun cfnDomainSAMLOptionsProperty(
        block: CfnDomainSAMLOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.SAMLOptionsProperty {
        val builder = CfnDomainSAMLOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The current status of the service software for an Amazon OpenSearch Service domain.
     *
     * For more information, see
     * [Service software updates in Amazon OpenSearch Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/service-software.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * ServiceSoftwareOptionsProperty serviceSoftwareOptionsProperty =
     * ServiceSoftwareOptionsProperty.builder()
     * .automatedUpdateDate("automatedUpdateDate")
     * .cancellable(false)
     * .currentVersion("currentVersion")
     * .description("description")
     * .newVersion("newVersion")
     * .optionalDeployment(false)
     * .updateAvailable(false)
     * .updateStatus("updateStatus")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html)
     */
    public inline fun cfnDomainServiceSoftwareOptionsProperty(
        block: CfnDomainServiceSoftwareOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.ServiceSoftwareOptionsProperty {
        val builder = CfnDomainServiceSoftwareOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * *DEPRECATED* .
     *
     * This setting is only relevant to domains running legacy Elasticsearch OSS versions earlier
     * than 5.3. It does not apply to OpenSearch domains.
     *
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * SnapshotOptionsProperty snapshotOptionsProperty = SnapshotOptionsProperty.builder()
     * .automatedSnapshotStartHour(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-snapshotoptions.html)
     */
    public inline fun cfnDomainSnapshotOptionsProperty(
        block: CfnDomainSnapshotOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.SnapshotOptionsProperty {
        val builder = CfnDomainSnapshotOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for configuring service software updates for a domain.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * SoftwareUpdateOptionsProperty softwareUpdateOptionsProperty =
     * SoftwareUpdateOptionsProperty.builder()
     * .autoSoftwareUpdateEnabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-softwareupdateoptions.html)
     */
    public inline fun cfnDomainSoftwareUpdateOptionsProperty(
        block: CfnDomainSoftwareUpdateOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.SoftwareUpdateOptionsProperty {
        val builder = CfnDomainSoftwareUpdateOptionsPropertyDsl()
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
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * VPCOptionsProperty vPCOptionsProperty = VPCOptionsProperty.builder()
     * .securityGroupIds(List.of("securityGroupIds"))
     * .subnetIds(List.of("subnetIds"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-vpcoptions.html)
     */
    public inline fun cfnDomainVPCOptionsProperty(
        block: CfnDomainVPCOptionsPropertyDsl.() -> Unit = {}
    ): CfnDomain.VPCOptionsProperty {
        val builder = CfnDomainVPCOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A custom start time for the off-peak window, in Coordinated Universal Time (UTC).
     *
     * The window length will always be 10 hours, so you can't specify an end time. For example, if
     * you specify 11:00 P.M. UTC as a start time, the end time will automatically be set to 9:00
     * A.M.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * WindowStartTimeProperty windowStartTimeProperty = WindowStartTimeProperty.builder()
     * .hours(123)
     * .minutes(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-windowstarttime.html)
     */
    public inline fun cfnDomainWindowStartTimeProperty(
        block: CfnDomainWindowStartTimePropertyDsl.() -> Unit = {}
    ): CfnDomain.WindowStartTimeProperty {
        val builder = CfnDomainWindowStartTimePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies zone awareness configuration options.
     *
     * Only use if `ZoneAwarenessEnabled` is `true` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.opensearchservice.*;
     * ZoneAwarenessConfigProperty zoneAwarenessConfigProperty = ZoneAwarenessConfigProperty.builder()
     * .availabilityZoneCount(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-zoneawarenessconfig.html)
     */
    public inline fun cfnDomainZoneAwarenessConfigProperty(
        block: CfnDomainZoneAwarenessConfigPropertyDsl.() -> Unit = {}
    ): CfnDomain.ZoneAwarenessConfigProperty {
        val builder = CfnDomainZoneAwarenessConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures Amazon OpenSearch Service to use Amazon Cognito authentication for OpenSearch
     * Dashboards.
     *
     * Example:
     * ```
     * Domain.Builder.create(this, "Domain")
     * .cognitoDashboardsAuth(CognitoOptions.builder()
     * .identityPoolId("test-identity-pool-id")
     * .userPoolId("test-user-pool-id")
     * .role(role)
     * .build())
     * .version(openSearchVersion)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
     */
    public inline fun cognitoOptions(block: CognitoOptionsDsl.() -> Unit = {}): CognitoOptions {
        val builder = CognitoOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures a custom domain endpoint for the Amazon OpenSearch Service domain.
     *
     * Example:
     * ```
     * Domain.Builder.create(this, "Domain")
     * .version(EngineVersion.OPENSEARCH_1_0)
     * .customEndpoint(CustomEndpointOptions.builder()
     * .domainName("search.example.com")
     * .build())
     * .build();
     * ```
     */
    public inline fun customEndpointOptions(
        block: CustomEndpointOptionsDsl.() -> Unit = {}
    ): CustomEndpointOptions {
        val builder = CustomEndpointOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Provides an Amazon OpenSearch Service domain.
     *
     * Example:
     * ```
     * Domain domain = Domain.Builder.create(this, "Domain")
     * .version(EngineVersion.OPENSEARCH_1_0)
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
     */
    public inline fun domain(
        scope: Construct,
        id: String,
        block: DomainDsl.() -> Unit = {},
    ): Domain {
        val builder = DomainDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Reference to an Amazon OpenSearch Service domain.
     *
     * Example:
     * ```
     * String domainArn = Fn.importValue("another-cf-stack-export-domain-arn");
     * String domainEndpoint = Fn.importValue("another-cf-stack-export-domain-endpoint");
     * IDomain domain = Domain.fromDomainAttributes(this, "ImportedDomain", DomainAttributes.builder()
     * .domainArn(domainArn)
     * .domainEndpoint(domainEndpoint)
     * .build());
     * ```
     */
    public inline fun domainAttributes(
        block: DomainAttributesDsl.() -> Unit = {}
    ): DomainAttributes {
        val builder = DomainAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an Amazon OpenSearch Service domain.
     *
     * Example:
     * ```
     * Domain domain = Domain.Builder.create(this, "Domain")
     * .version(EngineVersion.OPENSEARCH_1_0)
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
     */
    public inline fun domainProps(block: DomainPropsDsl.() -> Unit = {}): DomainProps {
        val builder = DomainPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the Amazon OpenSearch Service domain.
     *
     * For more information, see [Amazon EBS]
     * (https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AmazonEBS.html) in the Amazon Elastic
     * Compute Cloud Developer Guide.
     *
     * Example:
     * ```
     * Domain domain = Domain.Builder.create(this, "Domain")
     * .version(EngineVersion.OPENSEARCH_1_3)
     * .ebs(EbsOptions.builder()
     * .volumeSize(10)
     * .volumeType(EbsDeviceVolumeType.GENERAL_PURPOSE_SSD_GP3)
     * .build())
     * .zoneAwareness(ZoneAwarenessConfig.builder()
     * .enabled(true)
     * .availabilityZoneCount(3)
     * .build())
     * .capacity(CapacityConfig.builder()
     * .multiAzWithStandbyEnabled(true)
     * .masterNodes(3)
     * .dataNodes(3)
     * .build())
     * .build();
     * ```
     */
    public inline fun ebsOptions(block: EbsOptionsDsl.() -> Unit = {}): EbsOptions {
        val builder = EbsOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service
     * (KMS) key to use.
     *
     * Can only be used to create a new domain, not update an existing one. Requires Elasticsearch
     * version 5.1 or later or OpenSearch version 1.0 or later.
     *
     * Example:
     * ```
     * Domain domain = Domain.Builder.create(this, "Domain")
     * .version(EngineVersion.OPENSEARCH_1_0)
     * .enforceHttps(true)
     * .nodeToNodeEncryption(true)
     * .encryptionAtRest(EncryptionAtRestOptions.builder()
     * .enabled(true)
     * .build())
     * .fineGrainedAccessControl(AdvancedSecurityOptions.builder()
     * .masterUserName("master-user")
     * .samlAuthenticationEnabled(true)
     * .samlAuthenticationOptions(SAMLOptionsProperty.builder()
     * .idpEntityId("entity-id")
     * .idpMetadataContent("metadata-content-with-quotes-escaped")
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun encryptionAtRestOptions(
        block: EncryptionAtRestOptionsDsl.() -> Unit = {}
    ): EncryptionAtRestOptions {
        val builder = EncryptionAtRestOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configures log settings for the domain.
     *
     * Example:
     * ```
     * Domain prodDomain = Domain.Builder.create(this, "Domain")
     * .version(EngineVersion.OPENSEARCH_1_0)
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
     */
    public inline fun loggingOptions(block: LoggingOptionsDsl.() -> Unit = {}): LoggingOptions {
        val builder = LoggingOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Container for information about the SAML configuration for OpenSearch Dashboards.
     *
     * Example:
     * ```
     * Domain domain = Domain.Builder.create(this, "Domain")
     * .version(EngineVersion.OPENSEARCH_1_0)
     * .enforceHttps(true)
     * .nodeToNodeEncryption(true)
     * .encryptionAtRest(EncryptionAtRestOptions.builder()
     * .enabled(true)
     * .build())
     * .fineGrainedAccessControl(AdvancedSecurityOptions.builder()
     * .masterUserName("master-user")
     * .samlAuthenticationEnabled(true)
     * .samlAuthenticationOptions(SAMLOptionsProperty.builder()
     * .idpEntityId("entity-id")
     * .idpMetadataContent("metadata-content-with-quotes-escaped")
     * .build())
     * .build())
     * .build();
     * ```
     */
    public inline fun sAMLOptionsProperty(
        block: SAMLOptionsPropertyDsl.() -> Unit = {}
    ): SAMLOptionsProperty {
        val builder = SAMLOptionsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * Domain domain = Domain.Builder.create(this, "Domain")
     * .version(EngineVersion.OPENSEARCH_1_3)
     * .offPeakWindowEnabled(true) // can be omitted if offPeakWindowStart is set
     * .offPeakWindowStart(WindowStartTime.builder()
     * .hours(20)
     * .minutes(0)
     * .build())
     * .build();
     * ```
     */
    public inline fun windowStartTime(block: WindowStartTimeDsl.() -> Unit = {}): WindowStartTime {
        val builder = WindowStartTimeDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies zone awareness configuration options.
     *
     * Example:
     * ```
     * Domain domain = Domain.Builder.create(this, "Domain")
     * .version(EngineVersion.OPENSEARCH_1_3)
     * .ebs(EbsOptions.builder()
     * .volumeSize(10)
     * .volumeType(EbsDeviceVolumeType.GENERAL_PURPOSE_SSD_GP3)
     * .build())
     * .zoneAwareness(ZoneAwarenessConfig.builder()
     * .enabled(true)
     * .availabilityZoneCount(3)
     * .build())
     * .capacity(CapacityConfig.builder()
     * .multiAzWithStandbyEnabled(true)
     * .masterNodes(3)
     * .dataNodes(3)
     * .build())
     * .build();
     * ```
     */
    public inline fun zoneAwarenessConfig(
        block: ZoneAwarenessConfigDsl.() -> Unit = {}
    ): ZoneAwarenessConfig {
        val builder = ZoneAwarenessConfigDsl()
        builder.apply(block)
        return builder.build()
    }
}
