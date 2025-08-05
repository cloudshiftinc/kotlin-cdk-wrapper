@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::OpenSearchService::Domain resource creates an Amazon OpenSearch Service domain.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
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
 * .jwtOptions(JWTOptionsProperty.builder()
 * .enabled(false)
 * .publicKey("publicKey")
 * .rolesKey("rolesKey")
 * .subjectKey("subjectKey")
 * .build())
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
 * .coldStorageOptions(ColdStorageOptionsProperty.builder()
 * .enabled(false)
 * .build())
 * .dedicatedMasterCount(123)
 * .dedicatedMasterEnabled(false)
 * .dedicatedMasterType("dedicatedMasterType")
 * .instanceCount(123)
 * .instanceType("instanceType")
 * .multiAzWithStandbyEnabled(false)
 * .nodeOptions(List.of(NodeOptionProperty.builder()
 * .nodeConfig(NodeConfigProperty.builder()
 * .count(123)
 * .enabled(false)
 * .type("type")
 * .build())
 * .nodeType("nodeType")
 * .build()))
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
 * .identityCenterOptions(IdentityCenterOptionsProperty.builder()
 * .enabledApiAccess(false)
 * .identityCenterApplicationArn("identityCenterApplicationArn")
 * .identityCenterInstanceArn("identityCenterInstanceArn")
 * .identityStoreId("identityStoreId")
 * .rolesKey("rolesKey")
 * .subjectKey("subjectKey")
 * .build())
 * .ipAddressType("ipAddressType")
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
 * .skipShardMigrationWait(false)
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
public open class CfnDomain(
  cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.opensearchservice.CfnDomain(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainProps,
  ) :
      this(software.amazon.awscdk.services.opensearchservice.CfnDomain(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDomainProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDomainProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDomainProps(props)
  )

  /**
   * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access the
   * OpenSearch Service domain and their permissions.
   */
  public open fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

  /**
   * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access the
   * OpenSearch Service domain and their permissions.
   */
  public open fun accessPolicies(`value`: Any) {
    unwrap(this).setAccessPolicies(`value`)
  }

  /**
   * Additional options to specify for the OpenSearch Service domain.
   */
  public open fun advancedOptions(): Any? = unwrap(this).getAdvancedOptions()

  /**
   * Additional options to specify for the OpenSearch Service domain.
   */
  public open fun advancedOptions(`value`: Map<String, String>) {
    unwrap(this).setAdvancedOptions(`value`)
  }

  /**
   * Additional options to specify for the OpenSearch Service domain.
   */
  public open fun advancedOptions(`value`: IResolvable) {
    unwrap(this).setAdvancedOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies options for fine-grained access control and SAML authentication.
   */
  public open fun advancedSecurityOptions(): Any? = unwrap(this).getAdvancedSecurityOptions()

  /**
   * Specifies options for fine-grained access control and SAML authentication.
   */
  public open fun advancedSecurityOptions(`value`: IResolvable) {
    unwrap(this).setAdvancedSecurityOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies options for fine-grained access control and SAML authentication.
   */
  public open fun advancedSecurityOptions(`value`: AdvancedSecurityOptionsInputProperty) {
    unwrap(this).setAdvancedSecurityOptions(`value`.let(AdvancedSecurityOptionsInputProperty.Companion::unwrap))
  }

  /**
   * Specifies options for fine-grained access control and SAML authentication.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6c28b2da42ac3dc4442bbe6a9008f9d5a959103d9590cea7c6832ba6f41d03bf")
  public open
      fun advancedSecurityOptions(`value`: AdvancedSecurityOptionsInputProperty.Builder.() -> Unit):
      Unit = advancedSecurityOptions(AdvancedSecurityOptionsInputProperty(`value`))

  /**
   * Date and time when the migration period will be disabled.
   *
   * Only necessary when [enabling fine-grained access control on an existing
   * domain](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing)
   * .
   */
  public open fun attrAdvancedSecurityOptionsAnonymousAuthDisableDate(): String =
      unwrap(this).getAttrAdvancedSecurityOptionsAnonymousAuthDisableDate()

  /**
   * The Amazon Resource Name (ARN) of the CloudFormation stack.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The domain-specific endpoint used for requests to the OpenSearch APIs, such as
   * `search-mystack-1ab2cdefghij-ab1c2deckoyb3hofw7wpqa3cm.us-west-1.es.amazonaws.com` .
   */
  public open fun attrDomainEndpoint(): String = unwrap(this).getAttrDomainEndpoint()

  /**
   * If `IPAddressType` to set to `dualstack` , a version 2 domain endpoint is provisioned.
   *
   * This endpoint functions like a normal endpoint, except that it works with both IPv4 and IPv6 IP
   * addresses. Normal endpoints work only with IPv4 IP addresses.
   */
  public open fun attrDomainEndpointV2(): String = unwrap(this).getAttrDomainEndpointV2()

  /**
   *
   */
  public open fun attrDomainEndpoints(): IResolvable =
      unwrap(this).getAttrDomainEndpoints().let(IResolvable::wrap)

  /**
   * The resource ID.
   *
   * For example, `123456789012/my-domain` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ARN of the IAM Identity Center application that integrates with Amazon OpenSearch Service.
   */
  public open fun attrIdentityCenterOptionsIdentityCenterApplicationArn(): String =
      unwrap(this).getAttrIdentityCenterOptionsIdentityCenterApplicationArn()

  /**
   * The identifier of the IAM Identity Store.
   */
  public open fun attrIdentityCenterOptionsIdentityStoreId(): String =
      unwrap(this).getAttrIdentityCenterOptionsIdentityStoreId()

  /**
   *
   */
  public open fun attrServiceSoftwareOptions(): IResolvable =
      unwrap(this).getAttrServiceSoftwareOptions().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrServiceSoftwareOptionsAutomatedUpdateDate(): String =
      unwrap(this).getAttrServiceSoftwareOptionsAutomatedUpdateDate()

  /**
   *
   */
  public open fun attrServiceSoftwareOptionsCancellable(): IResolvable =
      unwrap(this).getAttrServiceSoftwareOptionsCancellable().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrServiceSoftwareOptionsCurrentVersion(): String =
      unwrap(this).getAttrServiceSoftwareOptionsCurrentVersion()

  /**
   *
   */
  public open fun attrServiceSoftwareOptionsDescription(): String =
      unwrap(this).getAttrServiceSoftwareOptionsDescription()

  /**
   *
   */
  public open fun attrServiceSoftwareOptionsNewVersion(): String =
      unwrap(this).getAttrServiceSoftwareOptionsNewVersion()

  /**
   *
   */
  public open fun attrServiceSoftwareOptionsOptionalDeployment(): IResolvable =
      unwrap(this).getAttrServiceSoftwareOptionsOptionalDeployment().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrServiceSoftwareOptionsUpdateAvailable(): IResolvable =
      unwrap(this).getAttrServiceSoftwareOptionsUpdateAvailable().let(IResolvable::wrap)

  /**
   *
   */
  public open fun attrServiceSoftwareOptionsUpdateStatus(): String =
      unwrap(this).getAttrServiceSoftwareOptionsUpdateStatus()

  /**
   * Container for the cluster configuration of a domain.
   */
  public open fun clusterConfig(): Any? = unwrap(this).getClusterConfig()

  /**
   * Container for the cluster configuration of a domain.
   */
  public open fun clusterConfig(`value`: IResolvable) {
    unwrap(this).setClusterConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Container for the cluster configuration of a domain.
   */
  public open fun clusterConfig(`value`: ClusterConfigProperty) {
    unwrap(this).setClusterConfig(`value`.let(ClusterConfigProperty.Companion::unwrap))
  }

  /**
   * Container for the cluster configuration of a domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9420330d8784c41caf9345373c326e9f5cce887def2ba5fe8bcc4f2e5f1ec38d")
  public open fun clusterConfig(`value`: ClusterConfigProperty.Builder.() -> Unit): Unit =
      clusterConfig(ClusterConfigProperty(`value`))

  /**
   * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
   */
  public open fun cognitoOptions(): Any? = unwrap(this).getCognitoOptions()

  /**
   * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
   */
  public open fun cognitoOptions(`value`: IResolvable) {
    unwrap(this).setCognitoOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
   */
  public open fun cognitoOptions(`value`: CognitoOptionsProperty) {
    unwrap(this).setCognitoOptions(`value`.let(CognitoOptionsProperty.Companion::unwrap))
  }

  /**
   * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ed481c65110f14845c68832e48ec332101fb249aeb5f4d8aeeef1a8dc87c1034")
  public open fun cognitoOptions(`value`: CognitoOptionsProperty.Builder.() -> Unit): Unit =
      cognitoOptions(CognitoOptionsProperty(`value`))

  /**
   *
   */
  public open fun domainArn(): String? = unwrap(this).getDomainArn()

  /**
   *
   */
  public open fun domainArn(`value`: String) {
    unwrap(this).setDomainArn(`value`)
  }

  /**
   * Specifies additional options for the domain endpoint, such as whether to require HTTPS for all
   * traffic or whether to use a custom endpoint rather than the default endpoint.
   */
  public open fun domainEndpointOptions(): Any? = unwrap(this).getDomainEndpointOptions()

  /**
   * Specifies additional options for the domain endpoint, such as whether to require HTTPS for all
   * traffic or whether to use a custom endpoint rather than the default endpoint.
   */
  public open fun domainEndpointOptions(`value`: IResolvable) {
    unwrap(this).setDomainEndpointOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies additional options for the domain endpoint, such as whether to require HTTPS for all
   * traffic or whether to use a custom endpoint rather than the default endpoint.
   */
  public open fun domainEndpointOptions(`value`: DomainEndpointOptionsProperty) {
    unwrap(this).setDomainEndpointOptions(`value`.let(DomainEndpointOptionsProperty.Companion::unwrap))
  }

  /**
   * Specifies additional options for the domain endpoint, such as whether to require HTTPS for all
   * traffic or whether to use a custom endpoint rather than the default endpoint.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a953a25005b1492f858a7d896f3a82e988cc72baac2a500d41e1aac1e57f3c7e")
  public open fun domainEndpointOptions(`value`: DomainEndpointOptionsProperty.Builder.() -> Unit):
      Unit = domainEndpointOptions(DomainEndpointOptionsProperty(`value`))

  /**
   * A name for the OpenSearch Service domain.
   */
  public open fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * A name for the OpenSearch Service domain.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data
   * nodes in the OpenSearch Service domain.
   */
  public open fun ebsOptions(): Any? = unwrap(this).getEbsOptions()

  /**
   * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data
   * nodes in the OpenSearch Service domain.
   */
  public open fun ebsOptions(`value`: IResolvable) {
    unwrap(this).setEbsOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data
   * nodes in the OpenSearch Service domain.
   */
  public open fun ebsOptions(`value`: EBSOptionsProperty) {
    unwrap(this).setEbsOptions(`value`.let(EBSOptionsProperty.Companion::unwrap))
  }

  /**
   * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data
   * nodes in the OpenSearch Service domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("804b732196675b89ecc603c00e3f565cb6aec6fe0b49cb935514c6d9bda0f943")
  public open fun ebsOptions(`value`: EBSOptionsProperty.Builder.() -> Unit): Unit =
      ebsOptions(EBSOptionsProperty(`value`))

  /**
   * Whether the domain should encrypt data at rest, and if so, the AWS KMS key to use.
   */
  public open fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

  /**
   * Whether the domain should encrypt data at rest, and if so, the AWS KMS key to use.
   */
  public open fun encryptionAtRestOptions(`value`: IResolvable) {
    unwrap(this).setEncryptionAtRestOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Whether the domain should encrypt data at rest, and if so, the AWS KMS key to use.
   */
  public open fun encryptionAtRestOptions(`value`: EncryptionAtRestOptionsProperty) {
    unwrap(this).setEncryptionAtRestOptions(`value`.let(EncryptionAtRestOptionsProperty.Companion::unwrap))
  }

  /**
   * Whether the domain should encrypt data at rest, and if so, the AWS KMS key to use.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9cdbf6ec2ef8e9ca0b822a48221d6d133494b3fca448529843523cf8dacf5de7")
  public open
      fun encryptionAtRestOptions(`value`: EncryptionAtRestOptionsProperty.Builder.() -> Unit): Unit
      = encryptionAtRestOptions(EncryptionAtRestOptionsProperty(`value`))

  /**
   * The version of OpenSearch to use.
   */
  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  /**
   * The version of OpenSearch to use.
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  /**
   * Configuration options for controlling IAM Identity Center integration within a domain.
   */
  public open fun identityCenterOptions(): Any? = unwrap(this).getIdentityCenterOptions()

  /**
   * Configuration options for controlling IAM Identity Center integration within a domain.
   */
  public open fun identityCenterOptions(`value`: IResolvable) {
    unwrap(this).setIdentityCenterOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration options for controlling IAM Identity Center integration within a domain.
   */
  public open fun identityCenterOptions(`value`: IdentityCenterOptionsProperty) {
    unwrap(this).setIdentityCenterOptions(`value`.let(IdentityCenterOptionsProperty.Companion::unwrap))
  }

  /**
   * Configuration options for controlling IAM Identity Center integration within a domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8845fc4355a2aaa4c86944fc30cca1a3079ffe8c8982873441653141d9bc882b")
  public open fun identityCenterOptions(`value`: IdentityCenterOptionsProperty.Builder.() -> Unit):
      Unit = identityCenterOptions(IdentityCenterOptionsProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Choose either dual stack or IPv4 as your IP address type.
   */
  public open fun ipAddressType(): String? = unwrap(this).getIpAddressType()

  /**
   * Choose either dual stack or IPv4 as your IP address type.
   */
  public open fun ipAddressType(`value`: String) {
    unwrap(this).setIpAddressType(`value`)
  }

  /**
   * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` ,
   * `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
   */
  public open fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

  /**
   * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` ,
   * `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
   */
  public open fun logPublishingOptions(`value`: IResolvable) {
    unwrap(this).setLogPublishingOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` ,
   * `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
   */
  public open fun logPublishingOptions(`value`: Map<String, Any>) {
    unwrap(this).setLogPublishingOptions(`value`.mapValues{CdkObjectWrappers.unwrap(it.value)})
  }

  /**
   * Specifies whether node-to-node encryption is enabled.
   */
  public open fun nodeToNodeEncryptionOptions(): Any? =
      unwrap(this).getNodeToNodeEncryptionOptions()

  /**
   * Specifies whether node-to-node encryption is enabled.
   */
  public open fun nodeToNodeEncryptionOptions(`value`: IResolvable) {
    unwrap(this).setNodeToNodeEncryptionOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies whether node-to-node encryption is enabled.
   */
  public open fun nodeToNodeEncryptionOptions(`value`: NodeToNodeEncryptionOptionsProperty) {
    unwrap(this).setNodeToNodeEncryptionOptions(`value`.let(NodeToNodeEncryptionOptionsProperty.Companion::unwrap))
  }

  /**
   * Specifies whether node-to-node encryption is enabled.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ef66184eba660b40227924b4ff7a02f3ad1abab98b663a43f6c87689398f1ee5")
  public open
      fun nodeToNodeEncryptionOptions(`value`: NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit):
      Unit = nodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsProperty(`value`))

  /**
   * Options for a domain's off-peak window, during which OpenSearch Service can perform mandatory
   * configuration changes on the domain.
   */
  public open fun offPeakWindowOptions(): Any? = unwrap(this).getOffPeakWindowOptions()

  /**
   * Options for a domain's off-peak window, during which OpenSearch Service can perform mandatory
   * configuration changes on the domain.
   */
  public open fun offPeakWindowOptions(`value`: IResolvable) {
    unwrap(this).setOffPeakWindowOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Options for a domain's off-peak window, during which OpenSearch Service can perform mandatory
   * configuration changes on the domain.
   */
  public open fun offPeakWindowOptions(`value`: OffPeakWindowOptionsProperty) {
    unwrap(this).setOffPeakWindowOptions(`value`.let(OffPeakWindowOptionsProperty.Companion::unwrap))
  }

  /**
   * Options for a domain's off-peak window, during which OpenSearch Service can perform mandatory
   * configuration changes on the domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("10360d18cf0e8887df35f99efa1b24f31b6e2817cab33ff9cc997b316f616517")
  public open fun offPeakWindowOptions(`value`: OffPeakWindowOptionsProperty.Builder.() -> Unit):
      Unit = offPeakWindowOptions(OffPeakWindowOptionsProperty(`value`))

  /**
   *
   */
  public open fun skipShardMigrationWait(): Any? = unwrap(this).getSkipShardMigrationWait()

  /**
   *
   */
  public open fun skipShardMigrationWait(`value`: Boolean) {
    unwrap(this).setSkipShardMigrationWait(`value`)
  }

  /**
   *
   */
  public open fun skipShardMigrationWait(`value`: IResolvable) {
    unwrap(this).setSkipShardMigrationWait(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * *DEPRECATED* .
   */
  public open fun snapshotOptions(): Any? = unwrap(this).getSnapshotOptions()

  /**
   * *DEPRECATED* .
   */
  public open fun snapshotOptions(`value`: IResolvable) {
    unwrap(this).setSnapshotOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * *DEPRECATED* .
   */
  public open fun snapshotOptions(`value`: SnapshotOptionsProperty) {
    unwrap(this).setSnapshotOptions(`value`.let(SnapshotOptionsProperty.Companion::unwrap))
  }

  /**
   * *DEPRECATED* .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8e1b191407712d8dd20c7d3f109bc313af9689418a592820e66798367e0072f8")
  public open fun snapshotOptions(`value`: SnapshotOptionsProperty.Builder.() -> Unit): Unit =
      snapshotOptions(SnapshotOptionsProperty(`value`))

  /**
   * Service software update options for the domain.
   */
  public open fun softwareUpdateOptions(): Any? = unwrap(this).getSoftwareUpdateOptions()

  /**
   * Service software update options for the domain.
   */
  public open fun softwareUpdateOptions(`value`: IResolvable) {
    unwrap(this).setSoftwareUpdateOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Service software update options for the domain.
   */
  public open fun softwareUpdateOptions(`value`: SoftwareUpdateOptionsProperty) {
    unwrap(this).setSoftwareUpdateOptions(`value`.let(SoftwareUpdateOptionsProperty.Companion::unwrap))
  }

  /**
   * Service software update options for the domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3b6e5ec903a843bf8e3a0c6b0fda8663559168d1d78e76c80c3aacc84bd681ec")
  public open fun softwareUpdateOptions(`value`: SoftwareUpdateOptionsProperty.Builder.() -> Unit):
      Unit = softwareUpdateOptions(SoftwareUpdateOptionsProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
   */
  public open fun vpcOptions(): Any? = unwrap(this).getVpcOptions()

  /**
   * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
   */
  public open fun vpcOptions(`value`: IResolvable) {
    unwrap(this).setVpcOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
   */
  public open fun vpcOptions(`value`: VPCOptionsProperty) {
    unwrap(this).setVpcOptions(`value`.let(VPCOptionsProperty.Companion::unwrap))
  }

  /**
   * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e30ee28e2b442ea8b068cda6068651e547e362d019ae35ade105292b097dd295")
  public open fun vpcOptions(`value`: VPCOptionsProperty.Builder.() -> Unit): Unit =
      vpcOptions(VPCOptionsProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.opensearchservice.CfnDomain].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access
     * the OpenSearch Service domain and their permissions.
     *
     * For more information, see [Configuring access
     * policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-accesspolicies)
     * @param accessPolicies An AWS Identity and Access Management ( IAM ) policy document that
     * specifies who can access the OpenSearch Service domain and their permissions. 
     */
    public fun accessPolicies(accessPolicies: Any)

    /**
     * Additional options to specify for the OpenSearch Service domain.
     *
     * For more information, see
     * [AdvancedOptions](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_CreateDomain.html#API_CreateDomain_RequestBody)
     * in the OpenSearch Service API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedoptions)
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain. 
     */
    public fun advancedOptions(advancedOptions: Map<String, String>)

    /**
     * Additional options to specify for the OpenSearch Service domain.
     *
     * For more information, see
     * [AdvancedOptions](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_CreateDomain.html#API_CreateDomain_RequestBody)
     * in the OpenSearch Service API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedoptions)
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain. 
     */
    public fun advancedOptions(advancedOptions: IResolvable)

    /**
     * Specifies options for fine-grained access control and SAML authentication.
     *
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedsecurityoptions)
     * @param advancedSecurityOptions Specifies options for fine-grained access control and SAML
     * authentication. 
     */
    public fun advancedSecurityOptions(advancedSecurityOptions: IResolvable)

    /**
     * Specifies options for fine-grained access control and SAML authentication.
     *
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedsecurityoptions)
     * @param advancedSecurityOptions Specifies options for fine-grained access control and SAML
     * authentication. 
     */
    public
        fun advancedSecurityOptions(advancedSecurityOptions: AdvancedSecurityOptionsInputProperty)

    /**
     * Specifies options for fine-grained access control and SAML authentication.
     *
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedsecurityoptions)
     * @param advancedSecurityOptions Specifies options for fine-grained access control and SAML
     * authentication. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cff95f06bbe4f718dcc8b3f07f1d447fa61aea2aab93bb2133840db36f656aef")
    public
        fun advancedSecurityOptions(advancedSecurityOptions: AdvancedSecurityOptionsInputProperty.Builder.() -> Unit)

    /**
     * Container for the cluster configuration of a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-clusterconfig)
     * @param clusterConfig Container for the cluster configuration of a domain. 
     */
    public fun clusterConfig(clusterConfig: IResolvable)

    /**
     * Container for the cluster configuration of a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-clusterconfig)
     * @param clusterConfig Container for the cluster configuration of a domain. 
     */
    public fun clusterConfig(clusterConfig: ClusterConfigProperty)

    /**
     * Container for the cluster configuration of a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-clusterconfig)
     * @param clusterConfig Container for the cluster configuration of a domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b5dd218dbd779db471ccb326f7f4bf12c2df12a9ee4464f7e3bf4981c3bfa70")
    public fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit)

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-cognitooptions)
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards. 
     */
    public fun cognitoOptions(cognitoOptions: IResolvable)

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-cognitooptions)
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards. 
     */
    public fun cognitoOptions(cognitoOptions: CognitoOptionsProperty)

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-cognitooptions)
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bbf5b9c5171b1ae7b4aebdc4a06f730f24d5e5f5f024dfdc3e9ce4d90603359")
    public fun cognitoOptions(cognitoOptions: CognitoOptionsProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainarn)
     * @param domainArn 
     */
    public fun domainArn(domainArn: String)

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainendpointoptions)
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint. 
     */
    public fun domainEndpointOptions(domainEndpointOptions: IResolvable)

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainendpointoptions)
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint. 
     */
    public fun domainEndpointOptions(domainEndpointOptions: DomainEndpointOptionsProperty)

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainendpointoptions)
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("254043fab7706a69964bd04ba00f4938efd89d3bcba72a854478c427e1aae7b4")
    public
        fun domainEndpointOptions(domainEndpointOptions: DomainEndpointOptionsProperty.Builder.() -> Unit)

    /**
     * A name for the OpenSearch Service domain.
     *
     * The name must have a minimum length of 3 and a maximum length of 28. If you don't specify a
     * name, AWS CloudFormation generates a unique physical ID and uses that ID for the domain name.
     * For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * Required when creating a new domain.
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainname)
     * @param domainName A name for the OpenSearch Service domain. 
     */
    public fun domainName(domainName: String)

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-ebsoptions)
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain. 
     */
    public fun ebsOptions(ebsOptions: IResolvable)

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-ebsoptions)
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain. 
     */
    public fun ebsOptions(ebsOptions: EBSOptionsProperty)

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-ebsoptions)
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a15cd8967fb7df8426143e70c8919d0fe344957f9fd90759af1760ec63b16ae")
    public fun ebsOptions(ebsOptions: EBSOptionsProperty.Builder.() -> Unit)

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS KMS key to use.
     *
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * If no encryption at rest options were initially specified in the template, updating this
     * property by adding it causes no interruption. However, if you change this property after it's
     * already been set within a template, the domain is deleted and recreated in order to modify the
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-encryptionatrestoptions)
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS KMS key to use. 
     */
    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable)

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS KMS key to use.
     *
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * If no encryption at rest options were initially specified in the template, updating this
     * property by adding it causes no interruption. However, if you change this property after it's
     * already been set within a template, the domain is deleted and recreated in order to modify the
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-encryptionatrestoptions)
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS KMS key to use. 
     */
    public fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty)

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS KMS key to use.
     *
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * If no encryption at rest options were initially specified in the template, updating this
     * property by adding it causes no interruption. However, if you change this property after it's
     * already been set within a template, the domain is deleted and recreated in order to modify the
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-encryptionatrestoptions)
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS KMS key to use. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2c540038a60d9380dcfbdae380d305126e72c3893df4fbf893a2051861b3e67")
    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty.Builder.() -> Unit)

    /**
     * The version of OpenSearch to use.
     *
     * The value must be in the format `OpenSearch_X.Y` or `Elasticsearch_X.Y` . If not specified,
     * the latest version of OpenSearch is used. For information about the versions that OpenSearch
     * Service supports, see [Supported versions of OpenSearch and
     * Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * If you set the
     * [EnableVersionUpgrade](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
     * update policy to `true` , you can update `EngineVersion` without interruption. When
     * `EnableVersionUpgrade` is set to `false` , or is not specified, updating `EngineVersion` results
     * in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-engineversion)
     * @param engineVersion The version of OpenSearch to use. 
     */
    public fun engineVersion(engineVersion: String)

    /**
     * Configuration options for controlling IAM Identity Center integration within a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-identitycenteroptions)
     * @param identityCenterOptions Configuration options for controlling IAM Identity Center
     * integration within a domain. 
     */
    public fun identityCenterOptions(identityCenterOptions: IResolvable)

    /**
     * Configuration options for controlling IAM Identity Center integration within a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-identitycenteroptions)
     * @param identityCenterOptions Configuration options for controlling IAM Identity Center
     * integration within a domain. 
     */
    public fun identityCenterOptions(identityCenterOptions: IdentityCenterOptionsProperty)

    /**
     * Configuration options for controlling IAM Identity Center integration within a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-identitycenteroptions)
     * @param identityCenterOptions Configuration options for controlling IAM Identity Center
     * integration within a domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c8fd82ae73b4adbcf008ebc9ea26847d3d005d517b1565cb4873713bbb68ebc")
    public
        fun identityCenterOptions(identityCenterOptions: IdentityCenterOptionsProperty.Builder.() -> Unit)

    /**
     * Choose either dual stack or IPv4 as your IP address type.
     *
     * Dual stack allows you to share domain resources across IPv4 and IPv6 address types, and is
     * the recommended option. If you set your IP address type to dual stack, you can't change your
     * address type later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-ipaddresstype)
     * @param ipAddressType Choose either dual stack or IPv4 as your IP address type. 
     */
    public fun ipAddressType(ipAddressType: String)

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value. For the full syntax, see the
     * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-logpublishingoptions)
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish. 
     */
    public fun logPublishingOptions(logPublishingOptions: IResolvable)

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value. For the full syntax, see the
     * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-logpublishingoptions)
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish. 
     */
    public fun logPublishingOptions(logPublishingOptions: Map<String, Any>)

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-nodetonodeencryptionoptions)
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled. 
     */
    public fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable)

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-nodetonodeencryptionoptions)
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled. 
     */
    public
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsProperty)

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-nodetonodeencryptionoptions)
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cd2d31758310fde86c8260065275d297e7e1091f47c05666565eab12698cc81")
    public
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit)

    /**
     * Options for a domain's off-peak window, during which OpenSearch Service can perform mandatory
     * configuration changes on the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-offpeakwindowoptions)
     * @param offPeakWindowOptions Options for a domain's off-peak window, during which OpenSearch
     * Service can perform mandatory configuration changes on the domain. 
     */
    public fun offPeakWindowOptions(offPeakWindowOptions: IResolvable)

    /**
     * Options for a domain's off-peak window, during which OpenSearch Service can perform mandatory
     * configuration changes on the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-offpeakwindowoptions)
     * @param offPeakWindowOptions Options for a domain's off-peak window, during which OpenSearch
     * Service can perform mandatory configuration changes on the domain. 
     */
    public fun offPeakWindowOptions(offPeakWindowOptions: OffPeakWindowOptionsProperty)

    /**
     * Options for a domain's off-peak window, during which OpenSearch Service can perform mandatory
     * configuration changes on the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-offpeakwindowoptions)
     * @param offPeakWindowOptions Options for a domain's off-peak window, during which OpenSearch
     * Service can perform mandatory configuration changes on the domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e70e5778d97125c7fda25481a6d9e1dee790e8fcafaf024d5d7c4e554b4a6f72")
    public
        fun offPeakWindowOptions(offPeakWindowOptions: OffPeakWindowOptionsProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-skipshardmigrationwait)
     * @param skipShardMigrationWait 
     */
    public fun skipShardMigrationWait(skipShardMigrationWait: Boolean)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-skipshardmigrationwait)
     * @param skipShardMigrationWait 
     */
    public fun skipShardMigrationWait(skipShardMigrationWait: IResolvable)

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-snapshotoptions)
     * @param snapshotOptions *DEPRECATED* . 
     */
    public fun snapshotOptions(snapshotOptions: IResolvable)

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-snapshotoptions)
     * @param snapshotOptions *DEPRECATED* . 
     */
    public fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty)

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-snapshotoptions)
     * @param snapshotOptions *DEPRECATED* . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72bd4cd626caa011c00aedc195d48d59960c1e02bab0f3d5aa0f5923597e593e")
    public fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty.Builder.() -> Unit)

    /**
     * Service software update options for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-softwareupdateoptions)
     * @param softwareUpdateOptions Service software update options for the domain. 
     */
    public fun softwareUpdateOptions(softwareUpdateOptions: IResolvable)

    /**
     * Service software update options for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-softwareupdateoptions)
     * @param softwareUpdateOptions Service software update options for the domain. 
     */
    public fun softwareUpdateOptions(softwareUpdateOptions: SoftwareUpdateOptionsProperty)

    /**
     * Service software update options for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-softwareupdateoptions)
     * @param softwareUpdateOptions Service software update options for the domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e26d3115ca890c89afa47f5ab6ffe5fb905dfa1a0a2a8f81deb379168fa8458")
    public
        fun softwareUpdateOptions(softwareUpdateOptions: SoftwareUpdateOptionsProperty.Builder.() -> Unit)

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     * Service domain. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     * Service domain. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * If you remove this entity altogether, along with its associated properties, it causes a
     * replacement. You might encounter this scenario if you're updating your security configuration
     * from a VPC to a public endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-vpcoptions)
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain. 
     */
    public fun vpcOptions(vpcOptions: IResolvable)

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * If you remove this entity altogether, along with its associated properties, it causes a
     * replacement. You might encounter this scenario if you're updating your security configuration
     * from a VPC to a public endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-vpcoptions)
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain. 
     */
    public fun vpcOptions(vpcOptions: VPCOptionsProperty)

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * If you remove this entity altogether, along with its associated properties, it causes a
     * replacement. You might encounter this scenario if you're updating your security configuration
     * from a VPC to a public endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-vpcoptions)
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19c2530da7c20d4902b3f93679f21fb0a9aa629f1fc4b216b31aa8fec75a0e0e")
    public fun vpcOptions(vpcOptions: VPCOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.CfnDomain.Builder =
        software.amazon.awscdk.services.opensearchservice.CfnDomain.Builder.create(scope, id)

    /**
     * An AWS Identity and Access Management ( IAM ) policy document that specifies who can access
     * the OpenSearch Service domain and their permissions.
     *
     * For more information, see [Configuring access
     * policies](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ac.html#ac-creating)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-accesspolicies)
     * @param accessPolicies An AWS Identity and Access Management ( IAM ) policy document that
     * specifies who can access the OpenSearch Service domain and their permissions. 
     */
    override fun accessPolicies(accessPolicies: Any) {
      cdkBuilder.accessPolicies(accessPolicies)
    }

    /**
     * Additional options to specify for the OpenSearch Service domain.
     *
     * For more information, see
     * [AdvancedOptions](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_CreateDomain.html#API_CreateDomain_RequestBody)
     * in the OpenSearch Service API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedoptions)
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain. 
     */
    override fun advancedOptions(advancedOptions: Map<String, String>) {
      cdkBuilder.advancedOptions(advancedOptions)
    }

    /**
     * Additional options to specify for the OpenSearch Service domain.
     *
     * For more information, see
     * [AdvancedOptions](https://docs.aws.amazon.com/opensearch-service/latest/APIReference/API_CreateDomain.html#API_CreateDomain_RequestBody)
     * in the OpenSearch Service API reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedoptions)
     * @param advancedOptions Additional options to specify for the OpenSearch Service domain. 
     */
    override fun advancedOptions(advancedOptions: IResolvable) {
      cdkBuilder.advancedOptions(advancedOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies options for fine-grained access control and SAML authentication.
     *
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedsecurityoptions)
     * @param advancedSecurityOptions Specifies options for fine-grained access control and SAML
     * authentication. 
     */
    override fun advancedSecurityOptions(advancedSecurityOptions: IResolvable) {
      cdkBuilder.advancedSecurityOptions(advancedSecurityOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies options for fine-grained access control and SAML authentication.
     *
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedsecurityoptions)
     * @param advancedSecurityOptions Specifies options for fine-grained access control and SAML
     * authentication. 
     */
    override
        fun advancedSecurityOptions(advancedSecurityOptions: AdvancedSecurityOptionsInputProperty) {
      cdkBuilder.advancedSecurityOptions(advancedSecurityOptions.let(AdvancedSecurityOptionsInputProperty.Companion::unwrap))
    }

    /**
     * Specifies options for fine-grained access control and SAML authentication.
     *
     * If you specify advanced security options, you must also enable node-to-node encryption (
     * [NodeToNodeEncryptionOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
     * ) and encryption at rest (
     * [EncryptionAtRestOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
     * ). You must also enable `EnforceHTTPS` within
     * [DomainEndpointOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html)
     * , which requires HTTPS for all traffic to the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-advancedsecurityoptions)
     * @param advancedSecurityOptions Specifies options for fine-grained access control and SAML
     * authentication. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cff95f06bbe4f718dcc8b3f07f1d447fa61aea2aab93bb2133840db36f656aef")
    override
        fun advancedSecurityOptions(advancedSecurityOptions: AdvancedSecurityOptionsInputProperty.Builder.() -> Unit):
        Unit =
        advancedSecurityOptions(AdvancedSecurityOptionsInputProperty(advancedSecurityOptions))

    /**
     * Container for the cluster configuration of a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-clusterconfig)
     * @param clusterConfig Container for the cluster configuration of a domain. 
     */
    override fun clusterConfig(clusterConfig: IResolvable) {
      cdkBuilder.clusterConfig(clusterConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Container for the cluster configuration of a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-clusterconfig)
     * @param clusterConfig Container for the cluster configuration of a domain. 
     */
    override fun clusterConfig(clusterConfig: ClusterConfigProperty) {
      cdkBuilder.clusterConfig(clusterConfig.let(ClusterConfigProperty.Companion::unwrap))
    }

    /**
     * Container for the cluster configuration of a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-clusterconfig)
     * @param clusterConfig Container for the cluster configuration of a domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6b5dd218dbd779db471ccb326f7f4bf12c2df12a9ee4464f7e3bf4981c3bfa70")
    override fun clusterConfig(clusterConfig: ClusterConfigProperty.Builder.() -> Unit): Unit =
        clusterConfig(ClusterConfigProperty(clusterConfig))

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-cognitooptions)
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards. 
     */
    override fun cognitoOptions(cognitoOptions: IResolvable) {
      cdkBuilder.cognitoOptions(cognitoOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-cognitooptions)
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards. 
     */
    override fun cognitoOptions(cognitoOptions: CognitoOptionsProperty) {
      cdkBuilder.cognitoOptions(cognitoOptions.let(CognitoOptionsProperty.Companion::unwrap))
    }

    /**
     * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-cognitooptions)
     * @param cognitoOptions Configures OpenSearch Service to use Amazon Cognito authentication for
     * OpenSearch Dashboards. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bbf5b9c5171b1ae7b4aebdc4a06f730f24d5e5f5f024dfdc3e9ce4d90603359")
    override fun cognitoOptions(cognitoOptions: CognitoOptionsProperty.Builder.() -> Unit): Unit =
        cognitoOptions(CognitoOptionsProperty(cognitoOptions))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainarn)
     * @param domainArn 
     */
    override fun domainArn(domainArn: String) {
      cdkBuilder.domainArn(domainArn)
    }

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainendpointoptions)
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint. 
     */
    override fun domainEndpointOptions(domainEndpointOptions: IResolvable) {
      cdkBuilder.domainEndpointOptions(domainEndpointOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainendpointoptions)
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint. 
     */
    override fun domainEndpointOptions(domainEndpointOptions: DomainEndpointOptionsProperty) {
      cdkBuilder.domainEndpointOptions(domainEndpointOptions.let(DomainEndpointOptionsProperty.Companion::unwrap))
    }

    /**
     * Specifies additional options for the domain endpoint, such as whether to require HTTPS for
     * all traffic or whether to use a custom endpoint rather than the default endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainendpointoptions)
     * @param domainEndpointOptions Specifies additional options for the domain endpoint, such as
     * whether to require HTTPS for all traffic or whether to use a custom endpoint rather than the
     * default endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("254043fab7706a69964bd04ba00f4938efd89d3bcba72a854478c427e1aae7b4")
    override
        fun domainEndpointOptions(domainEndpointOptions: DomainEndpointOptionsProperty.Builder.() -> Unit):
        Unit = domainEndpointOptions(DomainEndpointOptionsProperty(domainEndpointOptions))

    /**
     * A name for the OpenSearch Service domain.
     *
     * The name must have a minimum length of 3 and a maximum length of 28. If you don't specify a
     * name, AWS CloudFormation generates a unique physical ID and uses that ID for the domain name.
     * For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     * Required when creating a new domain.
     *
     *
     * If you specify a name, you can't perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-domainname)
     * @param domainName A name for the OpenSearch Service domain. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-ebsoptions)
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain. 
     */
    override fun ebsOptions(ebsOptions: IResolvable) {
      cdkBuilder.ebsOptions(ebsOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-ebsoptions)
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain. 
     */
    override fun ebsOptions(ebsOptions: EBSOptionsProperty) {
      cdkBuilder.ebsOptions(ebsOptions.let(EBSOptionsProperty.Companion::unwrap))
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the OpenSearch Service domain.
     *
     * For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-ebsoptions)
     * @param ebsOptions The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that
     * are attached to data nodes in the OpenSearch Service domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a15cd8967fb7df8426143e70c8919d0fe344957f9fd90759af1760ec63b16ae")
    override fun ebsOptions(ebsOptions: EBSOptionsProperty.Builder.() -> Unit): Unit =
        ebsOptions(EBSOptionsProperty(ebsOptions))

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS KMS key to use.
     *
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * If no encryption at rest options were initially specified in the template, updating this
     * property by adding it causes no interruption. However, if you change this property after it's
     * already been set within a template, the domain is deleted and recreated in order to modify the
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-encryptionatrestoptions)
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS KMS key to use. 
     */
    override fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS KMS key to use.
     *
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * If no encryption at rest options were initially specified in the template, updating this
     * property by adding it causes no interruption. However, if you change this property after it's
     * already been set within a template, the domain is deleted and recreated in order to modify the
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-encryptionatrestoptions)
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS KMS key to use. 
     */
    override fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(EncryptionAtRestOptionsProperty.Companion::unwrap))
    }

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS KMS key to use.
     *
     * See [Encryption of data at rest for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/encryption-at-rest.html)
     * .
     *
     * If no encryption at rest options were initially specified in the template, updating this
     * property by adding it causes no interruption. However, if you change this property after it's
     * already been set within a template, the domain is deleted and recreated in order to modify the
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-encryptionatrestoptions)
     * @param encryptionAtRestOptions Whether the domain should encrypt data at rest, and if so, the
     * AWS KMS key to use. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2c540038a60d9380dcfbdae380d305126e72c3893df4fbf893a2051861b3e67")
    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: EncryptionAtRestOptionsProperty.Builder.() -> Unit):
        Unit = encryptionAtRestOptions(EncryptionAtRestOptionsProperty(encryptionAtRestOptions))

    /**
     * The version of OpenSearch to use.
     *
     * The value must be in the format `OpenSearch_X.Y` or `Elasticsearch_X.Y` . If not specified,
     * the latest version of OpenSearch is used. For information about the versions that OpenSearch
     * Service supports, see [Supported versions of OpenSearch and
     * Elasticsearch](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/what-is.html#choosing-version)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * If you set the
     * [EnableVersionUpgrade](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
     * update policy to `true` , you can update `EngineVersion` without interruption. When
     * `EnableVersionUpgrade` is set to `false` , or is not specified, updating `EngineVersion` results
     * in
     * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-engineversion)
     * @param engineVersion The version of OpenSearch to use. 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * Configuration options for controlling IAM Identity Center integration within a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-identitycenteroptions)
     * @param identityCenterOptions Configuration options for controlling IAM Identity Center
     * integration within a domain. 
     */
    override fun identityCenterOptions(identityCenterOptions: IResolvable) {
      cdkBuilder.identityCenterOptions(identityCenterOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration options for controlling IAM Identity Center integration within a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-identitycenteroptions)
     * @param identityCenterOptions Configuration options for controlling IAM Identity Center
     * integration within a domain. 
     */
    override fun identityCenterOptions(identityCenterOptions: IdentityCenterOptionsProperty) {
      cdkBuilder.identityCenterOptions(identityCenterOptions.let(IdentityCenterOptionsProperty.Companion::unwrap))
    }

    /**
     * Configuration options for controlling IAM Identity Center integration within a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-identitycenteroptions)
     * @param identityCenterOptions Configuration options for controlling IAM Identity Center
     * integration within a domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c8fd82ae73b4adbcf008ebc9ea26847d3d005d517b1565cb4873713bbb68ebc")
    override
        fun identityCenterOptions(identityCenterOptions: IdentityCenterOptionsProperty.Builder.() -> Unit):
        Unit = identityCenterOptions(IdentityCenterOptionsProperty(identityCenterOptions))

    /**
     * Choose either dual stack or IPv4 as your IP address type.
     *
     * Dual stack allows you to share domain resources across IPv4 and IPv6 address types, and is
     * the recommended option. If you set your IP address type to dual stack, you can't change your
     * address type later.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-ipaddresstype)
     * @param ipAddressType Choose either dual stack or IPv4 as your IP address type. 
     */
    override fun ipAddressType(ipAddressType: String) {
      cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value. For the full syntax, see the
     * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-logpublishingoptions)
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish. 
     */
    override fun logPublishingOptions(logPublishingOptions: IResolvable) {
      cdkBuilder.logPublishingOptions(logPublishingOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object with one or more of the following keys: `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS`
     * , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the types of logs you want to publish.
     *
     * Each key needs a valid `LogPublishingOption` value. For the full syntax, see the
     * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-logpublishingoptions)
     * @param logPublishingOptions An object with one or more of the following keys:
     * `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` , `INDEX_SLOW_LOGS` , `AUDIT_LOGS` , depending on the
     * types of logs you want to publish. 
     */
    override fun logPublishingOptions(logPublishingOptions: Map<String, Any>) {
      cdkBuilder.logPublishingOptions(logPublishingOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-nodetonodeencryptionoptions)
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled. 
     */
    override fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: IResolvable) {
      cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-nodetonodeencryptionoptions)
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled. 
     */
    override
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsProperty) {
      cdkBuilder.nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions.let(NodeToNodeEncryptionOptionsProperty.Companion::unwrap))
    }

    /**
     * Specifies whether node-to-node encryption is enabled.
     *
     * See [Node-to-node encryption for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ntn.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-nodetonodeencryptionoptions)
     * @param nodeToNodeEncryptionOptions Specifies whether node-to-node encryption is enabled. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3cd2d31758310fde86c8260065275d297e7e1091f47c05666565eab12698cc81")
    override
        fun nodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsProperty.Builder.() -> Unit):
        Unit =
        nodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsProperty(nodeToNodeEncryptionOptions))

    /**
     * Options for a domain's off-peak window, during which OpenSearch Service can perform mandatory
     * configuration changes on the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-offpeakwindowoptions)
     * @param offPeakWindowOptions Options for a domain's off-peak window, during which OpenSearch
     * Service can perform mandatory configuration changes on the domain. 
     */
    override fun offPeakWindowOptions(offPeakWindowOptions: IResolvable) {
      cdkBuilder.offPeakWindowOptions(offPeakWindowOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Options for a domain's off-peak window, during which OpenSearch Service can perform mandatory
     * configuration changes on the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-offpeakwindowoptions)
     * @param offPeakWindowOptions Options for a domain's off-peak window, during which OpenSearch
     * Service can perform mandatory configuration changes on the domain. 
     */
    override fun offPeakWindowOptions(offPeakWindowOptions: OffPeakWindowOptionsProperty) {
      cdkBuilder.offPeakWindowOptions(offPeakWindowOptions.let(OffPeakWindowOptionsProperty.Companion::unwrap))
    }

    /**
     * Options for a domain's off-peak window, during which OpenSearch Service can perform mandatory
     * configuration changes on the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-offpeakwindowoptions)
     * @param offPeakWindowOptions Options for a domain's off-peak window, during which OpenSearch
     * Service can perform mandatory configuration changes on the domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e70e5778d97125c7fda25481a6d9e1dee790e8fcafaf024d5d7c4e554b4a6f72")
    override
        fun offPeakWindowOptions(offPeakWindowOptions: OffPeakWindowOptionsProperty.Builder.() -> Unit):
        Unit = offPeakWindowOptions(OffPeakWindowOptionsProperty(offPeakWindowOptions))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-skipshardmigrationwait)
     * @param skipShardMigrationWait 
     */
    override fun skipShardMigrationWait(skipShardMigrationWait: Boolean) {
      cdkBuilder.skipShardMigrationWait(skipShardMigrationWait)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-skipshardmigrationwait)
     * @param skipShardMigrationWait 
     */
    override fun skipShardMigrationWait(skipShardMigrationWait: IResolvable) {
      cdkBuilder.skipShardMigrationWait(skipShardMigrationWait.let(IResolvable.Companion::unwrap))
    }

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-snapshotoptions)
     * @param snapshotOptions *DEPRECATED* . 
     */
    override fun snapshotOptions(snapshotOptions: IResolvable) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-snapshotoptions)
     * @param snapshotOptions *DEPRECATED* . 
     */
    override fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty) {
      cdkBuilder.snapshotOptions(snapshotOptions.let(SnapshotOptionsProperty.Companion::unwrap))
    }

    /**
     * *DEPRECATED* .
     *
     * The automated snapshot configuration for the OpenSearch Service domain indexes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-snapshotoptions)
     * @param snapshotOptions *DEPRECATED* . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72bd4cd626caa011c00aedc195d48d59960c1e02bab0f3d5aa0f5923597e593e")
    override fun snapshotOptions(snapshotOptions: SnapshotOptionsProperty.Builder.() -> Unit): Unit
        = snapshotOptions(SnapshotOptionsProperty(snapshotOptions))

    /**
     * Service software update options for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-softwareupdateoptions)
     * @param softwareUpdateOptions Service software update options for the domain. 
     */
    override fun softwareUpdateOptions(softwareUpdateOptions: IResolvable) {
      cdkBuilder.softwareUpdateOptions(softwareUpdateOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Service software update options for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-softwareupdateoptions)
     * @param softwareUpdateOptions Service software update options for the domain. 
     */
    override fun softwareUpdateOptions(softwareUpdateOptions: SoftwareUpdateOptionsProperty) {
      cdkBuilder.softwareUpdateOptions(softwareUpdateOptions.let(SoftwareUpdateOptionsProperty.Companion::unwrap))
    }

    /**
     * Service software update options for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-softwareupdateoptions)
     * @param softwareUpdateOptions Service software update options for the domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e26d3115ca890c89afa47f5ab6ffe5fb905dfa1a0a2a8f81deb379168fa8458")
    override
        fun softwareUpdateOptions(softwareUpdateOptions: SoftwareUpdateOptionsProperty.Builder.() -> Unit):
        Unit = softwareUpdateOptions(SoftwareUpdateOptionsProperty(softwareUpdateOptions))

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     * Service domain. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-tags)
     * @param tags An arbitrary set of tags (key–value pairs) to associate with the OpenSearch
     * Service domain. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * If you remove this entity altogether, along with its associated properties, it causes a
     * replacement. You might encounter this scenario if you're updating your security configuration
     * from a VPC to a public endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-vpcoptions)
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain. 
     */
    override fun vpcOptions(vpcOptions: IResolvable) {
      cdkBuilder.vpcOptions(vpcOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * If you remove this entity altogether, along with its associated properties, it causes a
     * replacement. You might encounter this scenario if you're updating your security configuration
     * from a VPC to a public endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-vpcoptions)
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain. 
     */
    override fun vpcOptions(vpcOptions: VPCOptionsProperty) {
      cdkBuilder.vpcOptions(vpcOptions.let(VPCOptionsProperty.Companion::unwrap))
    }

    /**
     * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
     *
     * For more information, see [Launching your Amazon OpenSearch Service domains within a
     * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the
     * *Amazon OpenSearch Service Developer Guide* .
     *
     * If you remove this entity altogether, along with its associated properties, it causes a
     * replacement. You might encounter this scenario if you're updating your security configuration
     * from a VPC to a public endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#cfn-opensearchservice-domain-vpcoptions)
     * @param vpcOptions The virtual private cloud (VPC) configuration for the OpenSearch Service
     * domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19c2530da7c20d4902b3f93679f21fb0a9aa629f1fc4b216b31aa8fec75a0e0e")
    override fun vpcOptions(vpcOptions: VPCOptionsProperty.Builder.() -> Unit): Unit =
        vpcOptions(VPCOptionsProperty(vpcOptions))

    public fun build(): software.amazon.awscdk.services.opensearchservice.CfnDomain =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opensearchservice.CfnDomain.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain):
        CfnDomain = CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain):
        software.amazon.awscdk.services.opensearchservice.CfnDomain = wrapped.cdkObject as
        software.amazon.awscdk.services.opensearchservice.CfnDomain
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
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * AdvancedSecurityOptionsInputProperty advancedSecurityOptionsInputProperty =
   * AdvancedSecurityOptionsInputProperty.builder()
   * .anonymousAuthDisableDate("anonymousAuthDisableDate")
   * .anonymousAuthEnabled(false)
   * .enabled(false)
   * .internalUserDatabaseEnabled(false)
   * .jwtOptions(JWTOptionsProperty.builder()
   * .enabled(false)
   * .publicKey("publicKey")
   * .rolesKey("rolesKey")
   * .subjectKey("subjectKey")
   * .build())
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
  public interface AdvancedSecurityOptionsInputProperty {
    /**
     * Date and time when the migration period will be disabled.
     *
     * Only necessary when [enabling fine-grained access control on an existing
     * domain](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html#cfn-opensearchservice-domain-advancedsecurityoptionsinput-anonymousauthdisabledate)
     */
    public fun anonymousAuthDisableDate(): String? = unwrap(this).getAnonymousAuthDisableDate()

    /**
     * True to enable a 30-day migration period during which administrators can create role
     * mappings.
     *
     * Only necessary when [enabling fine-grained access control on an existing
     * domain](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html#cfn-opensearchservice-domain-advancedsecurityoptionsinput-anonymousauthenabled)
     */
    public fun anonymousAuthEnabled(): Any? = unwrap(this).getAnonymousAuthEnabled()

    /**
     * True to enable fine-grained access control.
     *
     * You must also enable encryption of data at rest and node-to-node encryption. See
     * [Fine-grained access control in Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html#cfn-opensearchservice-domain-advancedsecurityoptionsinput-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * True to enable the internal user database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html#cfn-opensearchservice-domain-advancedsecurityoptionsinput-internaluserdatabaseenabled)
     */
    public fun internalUserDatabaseEnabled(): Any? = unwrap(this).getInternalUserDatabaseEnabled()

    /**
     * Container for information about the JWT configuration of the Amazon OpenSearch Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html#cfn-opensearchservice-domain-advancedsecurityoptionsinput-jwtoptions)
     */
    public fun jwtOptions(): Any? = unwrap(this).getJwtOptions()

    /**
     * Specifies information about the master user.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html#cfn-opensearchservice-domain-advancedsecurityoptionsinput-masteruseroptions)
     */
    public fun masterUserOptions(): Any? = unwrap(this).getMasterUserOptions()

    /**
     * Container for information about the SAML configuration for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html#cfn-opensearchservice-domain-advancedsecurityoptionsinput-samloptions)
     */
    public fun samlOptions(): Any? = unwrap(this).getSamlOptions()

    /**
     * A builder for [AdvancedSecurityOptionsInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param anonymousAuthDisableDate Date and time when the migration period will be disabled.
       * Only necessary when [enabling fine-grained access control on an existing
       * domain](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing)
       * .
       */
      public fun anonymousAuthDisableDate(anonymousAuthDisableDate: String)

      /**
       * @param anonymousAuthEnabled True to enable a 30-day migration period during which
       * administrators can create role mappings.
       * Only necessary when [enabling fine-grained access control on an existing
       * domain](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing)
       * .
       */
      public fun anonymousAuthEnabled(anonymousAuthEnabled: Boolean)

      /**
       * @param anonymousAuthEnabled True to enable a 30-day migration period during which
       * administrators can create role mappings.
       * Only necessary when [enabling fine-grained access control on an existing
       * domain](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing)
       * .
       */
      public fun anonymousAuthEnabled(anonymousAuthEnabled: IResolvable)

      /**
       * @param enabled True to enable fine-grained access control.
       * You must also enable encryption of data at rest and node-to-node encryption. See
       * [Fine-grained access control in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html) .
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled True to enable fine-grained access control.
       * You must also enable encryption of data at rest and node-to-node encryption. See
       * [Fine-grained access control in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html) .
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param internalUserDatabaseEnabled True to enable the internal user database.
       */
      public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: Boolean)

      /**
       * @param internalUserDatabaseEnabled True to enable the internal user database.
       */
      public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: IResolvable)

      /**
       * @param jwtOptions Container for information about the JWT configuration of the Amazon
       * OpenSearch Service.
       */
      public fun jwtOptions(jwtOptions: IResolvable)

      /**
       * @param jwtOptions Container for information about the JWT configuration of the Amazon
       * OpenSearch Service.
       */
      public fun jwtOptions(jwtOptions: JWTOptionsProperty)

      /**
       * @param jwtOptions Container for information about the JWT configuration of the Amazon
       * OpenSearch Service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cef78b4cf87e380205c518c60c1ae00ab2031655fc3a42bcdc0b7a6610ccdf6f")
      public fun jwtOptions(jwtOptions: JWTOptionsProperty.Builder.() -> Unit)

      /**
       * @param masterUserOptions Specifies information about the master user.
       */
      public fun masterUserOptions(masterUserOptions: IResolvable)

      /**
       * @param masterUserOptions Specifies information about the master user.
       */
      public fun masterUserOptions(masterUserOptions: MasterUserOptionsProperty)

      /**
       * @param masterUserOptions Specifies information about the master user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db718d65484ad7164088f3bb85f48b915da76cb61cefa31caf55466a4df21631")
      public fun masterUserOptions(masterUserOptions: MasterUserOptionsProperty.Builder.() -> Unit)

      /**
       * @param samlOptions Container for information about the SAML configuration for OpenSearch
       * Dashboards.
       */
      public fun samlOptions(samlOptions: IResolvable)

      /**
       * @param samlOptions Container for information about the SAML configuration for OpenSearch
       * Dashboards.
       */
      public fun samlOptions(samlOptions: SAMLOptionsProperty)

      /**
       * @param samlOptions Container for information about the SAML configuration for OpenSearch
       * Dashboards.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce753ad125cbf06be7919d8c6277eaf4989fa6029b9ca7fa095f124a48a12afb")
      public fun samlOptions(samlOptions: SAMLOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.AdvancedSecurityOptionsInputProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.AdvancedSecurityOptionsInputProperty.builder()

      /**
       * @param anonymousAuthDisableDate Date and time when the migration period will be disabled.
       * Only necessary when [enabling fine-grained access control on an existing
       * domain](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing)
       * .
       */
      override fun anonymousAuthDisableDate(anonymousAuthDisableDate: String) {
        cdkBuilder.anonymousAuthDisableDate(anonymousAuthDisableDate)
      }

      /**
       * @param anonymousAuthEnabled True to enable a 30-day migration period during which
       * administrators can create role mappings.
       * Only necessary when [enabling fine-grained access control on an existing
       * domain](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing)
       * .
       */
      override fun anonymousAuthEnabled(anonymousAuthEnabled: Boolean) {
        cdkBuilder.anonymousAuthEnabled(anonymousAuthEnabled)
      }

      /**
       * @param anonymousAuthEnabled True to enable a 30-day migration period during which
       * administrators can create role mappings.
       * Only necessary when [enabling fine-grained access control on an existing
       * domain](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing)
       * .
       */
      override fun anonymousAuthEnabled(anonymousAuthEnabled: IResolvable) {
        cdkBuilder.anonymousAuthEnabled(anonymousAuthEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param enabled True to enable fine-grained access control.
       * You must also enable encryption of data at rest and node-to-node encryption. See
       * [Fine-grained access control in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html) .
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled True to enable fine-grained access control.
       * You must also enable encryption of data at rest and node-to-node encryption. See
       * [Fine-grained access control in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html) .
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param internalUserDatabaseEnabled True to enable the internal user database.
       */
      override fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: Boolean) {
        cdkBuilder.internalUserDatabaseEnabled(internalUserDatabaseEnabled)
      }

      /**
       * @param internalUserDatabaseEnabled True to enable the internal user database.
       */
      override fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: IResolvable) {
        cdkBuilder.internalUserDatabaseEnabled(internalUserDatabaseEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param jwtOptions Container for information about the JWT configuration of the Amazon
       * OpenSearch Service.
       */
      override fun jwtOptions(jwtOptions: IResolvable) {
        cdkBuilder.jwtOptions(jwtOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param jwtOptions Container for information about the JWT configuration of the Amazon
       * OpenSearch Service.
       */
      override fun jwtOptions(jwtOptions: JWTOptionsProperty) {
        cdkBuilder.jwtOptions(jwtOptions.let(JWTOptionsProperty.Companion::unwrap))
      }

      /**
       * @param jwtOptions Container for information about the JWT configuration of the Amazon
       * OpenSearch Service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cef78b4cf87e380205c518c60c1ae00ab2031655fc3a42bcdc0b7a6610ccdf6f")
      override fun jwtOptions(jwtOptions: JWTOptionsProperty.Builder.() -> Unit): Unit =
          jwtOptions(JWTOptionsProperty(jwtOptions))

      /**
       * @param masterUserOptions Specifies information about the master user.
       */
      override fun masterUserOptions(masterUserOptions: IResolvable) {
        cdkBuilder.masterUserOptions(masterUserOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param masterUserOptions Specifies information about the master user.
       */
      override fun masterUserOptions(masterUserOptions: MasterUserOptionsProperty) {
        cdkBuilder.masterUserOptions(masterUserOptions.let(MasterUserOptionsProperty.Companion::unwrap))
      }

      /**
       * @param masterUserOptions Specifies information about the master user.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("db718d65484ad7164088f3bb85f48b915da76cb61cefa31caf55466a4df21631")
      override
          fun masterUserOptions(masterUserOptions: MasterUserOptionsProperty.Builder.() -> Unit):
          Unit = masterUserOptions(MasterUserOptionsProperty(masterUserOptions))

      /**
       * @param samlOptions Container for information about the SAML configuration for OpenSearch
       * Dashboards.
       */
      override fun samlOptions(samlOptions: IResolvable) {
        cdkBuilder.samlOptions(samlOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param samlOptions Container for information about the SAML configuration for OpenSearch
       * Dashboards.
       */
      override fun samlOptions(samlOptions: SAMLOptionsProperty) {
        cdkBuilder.samlOptions(samlOptions.let(SAMLOptionsProperty.Companion::unwrap))
      }

      /**
       * @param samlOptions Container for information about the SAML configuration for OpenSearch
       * Dashboards.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce753ad125cbf06be7919d8c6277eaf4989fa6029b9ca7fa095f124a48a12afb")
      override fun samlOptions(samlOptions: SAMLOptionsProperty.Builder.() -> Unit): Unit =
          samlOptions(SAMLOptionsProperty(samlOptions))

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.AdvancedSecurityOptionsInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.AdvancedSecurityOptionsInputProperty,
    ) : CdkObject(cdkObject),
        AdvancedSecurityOptionsInputProperty {
      /**
       * Date and time when the migration period will be disabled.
       *
       * Only necessary when [enabling fine-grained access control on an existing
       * domain](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html#cfn-opensearchservice-domain-advancedsecurityoptionsinput-anonymousauthdisabledate)
       */
      override fun anonymousAuthDisableDate(): String? = unwrap(this).getAnonymousAuthDisableDate()

      /**
       * True to enable a 30-day migration period during which administrators can create role
       * mappings.
       *
       * Only necessary when [enabling fine-grained access control on an existing
       * domain](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html#fgac-enabling-existing)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html#cfn-opensearchservice-domain-advancedsecurityoptionsinput-anonymousauthenabled)
       */
      override fun anonymousAuthEnabled(): Any? = unwrap(this).getAnonymousAuthEnabled()

      /**
       * True to enable fine-grained access control.
       *
       * You must also enable encryption of data at rest and node-to-node encryption. See
       * [Fine-grained access control in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/fgac.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html#cfn-opensearchservice-domain-advancedsecurityoptionsinput-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * True to enable the internal user database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html#cfn-opensearchservice-domain-advancedsecurityoptionsinput-internaluserdatabaseenabled)
       */
      override fun internalUserDatabaseEnabled(): Any? =
          unwrap(this).getInternalUserDatabaseEnabled()

      /**
       * Container for information about the JWT configuration of the Amazon OpenSearch Service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html#cfn-opensearchservice-domain-advancedsecurityoptionsinput-jwtoptions)
       */
      override fun jwtOptions(): Any? = unwrap(this).getJwtOptions()

      /**
       * Specifies information about the master user.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html#cfn-opensearchservice-domain-advancedsecurityoptionsinput-masteruseroptions)
       */
      override fun masterUserOptions(): Any? = unwrap(this).getMasterUserOptions()

      /**
       * Container for information about the SAML configuration for OpenSearch Dashboards.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html#cfn-opensearchservice-domain-advancedsecurityoptionsinput-samloptions)
       */
      override fun samlOptions(): Any? = unwrap(this).getSamlOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdvancedSecurityOptionsInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.AdvancedSecurityOptionsInputProperty):
          AdvancedSecurityOptionsInputProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AdvancedSecurityOptionsInputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedSecurityOptionsInputProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.AdvancedSecurityOptionsInputProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.AdvancedSecurityOptionsInputProperty
    }
  }

  /**
   * The cluster configuration for the OpenSearch Service domain.
   *
   * You can specify options such as the instance type and the number of instances. For more
   * information, see [Creating and managing Amazon OpenSearch Service
   * domains](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * ClusterConfigProperty clusterConfigProperty = ClusterConfigProperty.builder()
   * .coldStorageOptions(ColdStorageOptionsProperty.builder()
   * .enabled(false)
   * .build())
   * .dedicatedMasterCount(123)
   * .dedicatedMasterEnabled(false)
   * .dedicatedMasterType("dedicatedMasterType")
   * .instanceCount(123)
   * .instanceType("instanceType")
   * .multiAzWithStandbyEnabled(false)
   * .nodeOptions(List.of(NodeOptionProperty.builder()
   * .nodeConfig(NodeConfigProperty.builder()
   * .count(123)
   * .enabled(false)
   * .type("type")
   * .build())
   * .nodeType("nodeType")
   * .build()))
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
  public interface ClusterConfigProperty {
    /**
     * Container for cold storage configuration options.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-coldstorageoptions)
     */
    public fun coldStorageOptions(): Any? = unwrap(this).getColdStorageOptions()

    /**
     * The number of instances to use for the master node.
     *
     * If you specify this property, you must specify `true` for the `DedicatedMasterEnabled`
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-dedicatedmastercount)
     */
    public fun dedicatedMasterCount(): Number? = unwrap(this).getDedicatedMasterCount()

    /**
     * Indicates whether to use a dedicated master node for the OpenSearch Service domain.
     *
     * A dedicated master node is a cluster node that performs cluster management tasks, but doesn't
     * hold data or respond to data upload requests. Dedicated master nodes offload cluster management
     * tasks to increase the stability of your search clusters. See [Dedicated master nodes in Amazon
     * OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-dedicatedmasternodes.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-dedicatedmasterenabled)
     */
    public fun dedicatedMasterEnabled(): Any? = unwrap(this).getDedicatedMasterEnabled()

    /**
     * The hardware configuration of the computer that hosts the dedicated master node, such as
     * `m3.medium.search` . If you specify this property, you must specify `true` for the
     * `DedicatedMasterEnabled` property. For valid values, see [Supported instance types in Amazon
     * OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-dedicatedmastertype)
     */
    public fun dedicatedMasterType(): String? = unwrap(this).getDedicatedMasterType()

    /**
     * The number of data nodes (instances) to use in the OpenSearch Service domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-instancecount)
     */
    public fun instanceCount(): Number? = unwrap(this).getInstanceCount()

    /**
     * The instance type for your data nodes, such as `m3.medium.search` . For valid values, see
     * [Supported instance types in Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-instancetype)
     */
    public fun instanceType(): String? = unwrap(this).getInstanceType()

    /**
     * Indicates whether Multi-AZ with Standby deployment option is enabled.
     *
     * For more information, see [Multi-AZ with
     * Standby](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html#managedomains-za-standby)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-multiazwithstandbyenabled)
     */
    public fun multiAzWithStandbyEnabled(): Any? = unwrap(this).getMultiAzWithStandbyEnabled()

    /**
     * List of node options for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-nodeoptions)
     */
    public fun nodeOptions(): Any? = unwrap(this).getNodeOptions()

    /**
     * The number of warm nodes in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-warmcount)
     */
    public fun warmCount(): Number? = unwrap(this).getWarmCount()

    /**
     * Whether to enable UltraWarm storage for the cluster.
     *
     * See [UltraWarm storage for Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ultrawarm.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-warmenabled)
     */
    public fun warmEnabled(): Any? = unwrap(this).getWarmEnabled()

    /**
     * The instance type for the cluster's warm nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-warmtype)
     */
    public fun warmType(): String? = unwrap(this).getWarmType()

    /**
     * Specifies zone awareness configuration options.
     *
     * Only use if `ZoneAwarenessEnabled` is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-zoneawarenessconfig)
     */
    public fun zoneAwarenessConfig(): Any? = unwrap(this).getZoneAwarenessConfig()

    /**
     * Indicates whether to enable zone awareness for the OpenSearch Service domain.
     *
     * When you enable zone awareness, OpenSearch Service allocates the nodes and replica index
     * shards that belong to a cluster across two Availability Zones (AZs) in the same region to
     * prevent data loss and minimize downtime in the event of node or data center failure. Don't
     * enable zone awareness if your cluster has no replica index shards or is a single-node cluster.
     * For more information, see [Configuring a multi-AZ domain in Amazon OpenSearch
     * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-zoneawarenessenabled)
     */
    public fun zoneAwarenessEnabled(): Any? = unwrap(this).getZoneAwarenessEnabled()

    /**
     * A builder for [ClusterConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param coldStorageOptions Container for cold storage configuration options.
       */
      public fun coldStorageOptions(coldStorageOptions: IResolvable)

      /**
       * @param coldStorageOptions Container for cold storage configuration options.
       */
      public fun coldStorageOptions(coldStorageOptions: ColdStorageOptionsProperty)

      /**
       * @param coldStorageOptions Container for cold storage configuration options.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1822352ea71203b92b2fbf8a9c574aa529cf46c3083eb8ea53e532de17da1635")
      public
          fun coldStorageOptions(coldStorageOptions: ColdStorageOptionsProperty.Builder.() -> Unit)

      /**
       * @param dedicatedMasterCount The number of instances to use for the master node.
       * If you specify this property, you must specify `true` for the `DedicatedMasterEnabled`
       * property.
       */
      public fun dedicatedMasterCount(dedicatedMasterCount: Number)

      /**
       * @param dedicatedMasterEnabled Indicates whether to use a dedicated master node for the
       * OpenSearch Service domain.
       * A dedicated master node is a cluster node that performs cluster management tasks, but
       * doesn't hold data or respond to data upload requests. Dedicated master nodes offload cluster
       * management tasks to increase the stability of your search clusters. See [Dedicated master
       * nodes in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-dedicatedmasternodes.html)
       * .
       */
      public fun dedicatedMasterEnabled(dedicatedMasterEnabled: Boolean)

      /**
       * @param dedicatedMasterEnabled Indicates whether to use a dedicated master node for the
       * OpenSearch Service domain.
       * A dedicated master node is a cluster node that performs cluster management tasks, but
       * doesn't hold data or respond to data upload requests. Dedicated master nodes offload cluster
       * management tasks to increase the stability of your search clusters. See [Dedicated master
       * nodes in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-dedicatedmasternodes.html)
       * .
       */
      public fun dedicatedMasterEnabled(dedicatedMasterEnabled: IResolvable)

      /**
       * @param dedicatedMasterType The hardware configuration of the computer that hosts the
       * dedicated master node, such as `m3.medium.search` . If you specify this property, you must
       * specify `true` for the `DedicatedMasterEnabled` property. For valid values, see [Supported
       * instance types in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
       * .
       */
      public fun dedicatedMasterType(dedicatedMasterType: String)

      /**
       * @param instanceCount The number of data nodes (instances) to use in the OpenSearch Service
       * domain.
       */
      public fun instanceCount(instanceCount: Number)

      /**
       * @param instanceType The instance type for your data nodes, such as `m3.medium.search` . For
       * valid values, see [Supported instance types in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
       * .
       */
      public fun instanceType(instanceType: String)

      /**
       * @param multiAzWithStandbyEnabled Indicates whether Multi-AZ with Standby deployment option
       * is enabled.
       * For more information, see [Multi-AZ with
       * Standby](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html#managedomains-za-standby)
       * .
       */
      public fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: Boolean)

      /**
       * @param multiAzWithStandbyEnabled Indicates whether Multi-AZ with Standby deployment option
       * is enabled.
       * For more information, see [Multi-AZ with
       * Standby](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html#managedomains-za-standby)
       * .
       */
      public fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: IResolvable)

      /**
       * @param nodeOptions List of node options for the domain.
       */
      public fun nodeOptions(nodeOptions: IResolvable)

      /**
       * @param nodeOptions List of node options for the domain.
       */
      public fun nodeOptions(nodeOptions: List<Any>)

      /**
       * @param nodeOptions List of node options for the domain.
       */
      public fun nodeOptions(vararg nodeOptions: Any)

      /**
       * @param warmCount The number of warm nodes in the cluster.
       */
      public fun warmCount(warmCount: Number)

      /**
       * @param warmEnabled Whether to enable UltraWarm storage for the cluster.
       * See [UltraWarm storage for Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ultrawarm.html)
       * .
       */
      public fun warmEnabled(warmEnabled: Boolean)

      /**
       * @param warmEnabled Whether to enable UltraWarm storage for the cluster.
       * See [UltraWarm storage for Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ultrawarm.html)
       * .
       */
      public fun warmEnabled(warmEnabled: IResolvable)

      /**
       * @param warmType The instance type for the cluster's warm nodes.
       */
      public fun warmType(warmType: String)

      /**
       * @param zoneAwarenessConfig Specifies zone awareness configuration options.
       * Only use if `ZoneAwarenessEnabled` is `true` .
       */
      public fun zoneAwarenessConfig(zoneAwarenessConfig: IResolvable)

      /**
       * @param zoneAwarenessConfig Specifies zone awareness configuration options.
       * Only use if `ZoneAwarenessEnabled` is `true` .
       */
      public fun zoneAwarenessConfig(zoneAwarenessConfig: ZoneAwarenessConfigProperty)

      /**
       * @param zoneAwarenessConfig Specifies zone awareness configuration options.
       * Only use if `ZoneAwarenessEnabled` is `true` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdc81f2f0fd336ad06569f2ff2c6451da52fa162b58311d6df529bf63527dbb0")
      public
          fun zoneAwarenessConfig(zoneAwarenessConfig: ZoneAwarenessConfigProperty.Builder.() -> Unit)

      /**
       * @param zoneAwarenessEnabled Indicates whether to enable zone awareness for the OpenSearch
       * Service domain.
       * When you enable zone awareness, OpenSearch Service allocates the nodes and replica index
       * shards that belong to a cluster across two Availability Zones (AZs) in the same region to
       * prevent data loss and minimize downtime in the event of node or data center failure. Don't
       * enable zone awareness if your cluster has no replica index shards or is a single-node cluster.
       * For more information, see [Configuring a multi-AZ domain in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
       * .
       */
      public fun zoneAwarenessEnabled(zoneAwarenessEnabled: Boolean)

      /**
       * @param zoneAwarenessEnabled Indicates whether to enable zone awareness for the OpenSearch
       * Service domain.
       * When you enable zone awareness, OpenSearch Service allocates the nodes and replica index
       * shards that belong to a cluster across two Availability Zones (AZs) in the same region to
       * prevent data loss and minimize downtime in the event of node or data center failure. Don't
       * enable zone awareness if your cluster has no replica index shards or is a single-node cluster.
       * For more information, see [Configuring a multi-AZ domain in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
       * .
       */
      public fun zoneAwarenessEnabled(zoneAwarenessEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty.builder()

      /**
       * @param coldStorageOptions Container for cold storage configuration options.
       */
      override fun coldStorageOptions(coldStorageOptions: IResolvable) {
        cdkBuilder.coldStorageOptions(coldStorageOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param coldStorageOptions Container for cold storage configuration options.
       */
      override fun coldStorageOptions(coldStorageOptions: ColdStorageOptionsProperty) {
        cdkBuilder.coldStorageOptions(coldStorageOptions.let(ColdStorageOptionsProperty.Companion::unwrap))
      }

      /**
       * @param coldStorageOptions Container for cold storage configuration options.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1822352ea71203b92b2fbf8a9c574aa529cf46c3083eb8ea53e532de17da1635")
      override
          fun coldStorageOptions(coldStorageOptions: ColdStorageOptionsProperty.Builder.() -> Unit):
          Unit = coldStorageOptions(ColdStorageOptionsProperty(coldStorageOptions))

      /**
       * @param dedicatedMasterCount The number of instances to use for the master node.
       * If you specify this property, you must specify `true` for the `DedicatedMasterEnabled`
       * property.
       */
      override fun dedicatedMasterCount(dedicatedMasterCount: Number) {
        cdkBuilder.dedicatedMasterCount(dedicatedMasterCount)
      }

      /**
       * @param dedicatedMasterEnabled Indicates whether to use a dedicated master node for the
       * OpenSearch Service domain.
       * A dedicated master node is a cluster node that performs cluster management tasks, but
       * doesn't hold data or respond to data upload requests. Dedicated master nodes offload cluster
       * management tasks to increase the stability of your search clusters. See [Dedicated master
       * nodes in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-dedicatedmasternodes.html)
       * .
       */
      override fun dedicatedMasterEnabled(dedicatedMasterEnabled: Boolean) {
        cdkBuilder.dedicatedMasterEnabled(dedicatedMasterEnabled)
      }

      /**
       * @param dedicatedMasterEnabled Indicates whether to use a dedicated master node for the
       * OpenSearch Service domain.
       * A dedicated master node is a cluster node that performs cluster management tasks, but
       * doesn't hold data or respond to data upload requests. Dedicated master nodes offload cluster
       * management tasks to increase the stability of your search clusters. See [Dedicated master
       * nodes in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-dedicatedmasternodes.html)
       * .
       */
      override fun dedicatedMasterEnabled(dedicatedMasterEnabled: IResolvable) {
        cdkBuilder.dedicatedMasterEnabled(dedicatedMasterEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dedicatedMasterType The hardware configuration of the computer that hosts the
       * dedicated master node, such as `m3.medium.search` . If you specify this property, you must
       * specify `true` for the `DedicatedMasterEnabled` property. For valid values, see [Supported
       * instance types in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
       * .
       */
      override fun dedicatedMasterType(dedicatedMasterType: String) {
        cdkBuilder.dedicatedMasterType(dedicatedMasterType)
      }

      /**
       * @param instanceCount The number of data nodes (instances) to use in the OpenSearch Service
       * domain.
       */
      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      /**
       * @param instanceType The instance type for your data nodes, such as `m3.medium.search` . For
       * valid values, see [Supported instance types in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
       * .
       */
      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      /**
       * @param multiAzWithStandbyEnabled Indicates whether Multi-AZ with Standby deployment option
       * is enabled.
       * For more information, see [Multi-AZ with
       * Standby](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html#managedomains-za-standby)
       * .
       */
      override fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: Boolean) {
        cdkBuilder.multiAzWithStandbyEnabled(multiAzWithStandbyEnabled)
      }

      /**
       * @param multiAzWithStandbyEnabled Indicates whether Multi-AZ with Standby deployment option
       * is enabled.
       * For more information, see [Multi-AZ with
       * Standby](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html#managedomains-za-standby)
       * .
       */
      override fun multiAzWithStandbyEnabled(multiAzWithStandbyEnabled: IResolvable) {
        cdkBuilder.multiAzWithStandbyEnabled(multiAzWithStandbyEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nodeOptions List of node options for the domain.
       */
      override fun nodeOptions(nodeOptions: IResolvable) {
        cdkBuilder.nodeOptions(nodeOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nodeOptions List of node options for the domain.
       */
      override fun nodeOptions(nodeOptions: List<Any>) {
        cdkBuilder.nodeOptions(nodeOptions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param nodeOptions List of node options for the domain.
       */
      override fun nodeOptions(vararg nodeOptions: Any): Unit = nodeOptions(nodeOptions.toList())

      /**
       * @param warmCount The number of warm nodes in the cluster.
       */
      override fun warmCount(warmCount: Number) {
        cdkBuilder.warmCount(warmCount)
      }

      /**
       * @param warmEnabled Whether to enable UltraWarm storage for the cluster.
       * See [UltraWarm storage for Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ultrawarm.html)
       * .
       */
      override fun warmEnabled(warmEnabled: Boolean) {
        cdkBuilder.warmEnabled(warmEnabled)
      }

      /**
       * @param warmEnabled Whether to enable UltraWarm storage for the cluster.
       * See [UltraWarm storage for Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ultrawarm.html)
       * .
       */
      override fun warmEnabled(warmEnabled: IResolvable) {
        cdkBuilder.warmEnabled(warmEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param warmType The instance type for the cluster's warm nodes.
       */
      override fun warmType(warmType: String) {
        cdkBuilder.warmType(warmType)
      }

      /**
       * @param zoneAwarenessConfig Specifies zone awareness configuration options.
       * Only use if `ZoneAwarenessEnabled` is `true` .
       */
      override fun zoneAwarenessConfig(zoneAwarenessConfig: IResolvable) {
        cdkBuilder.zoneAwarenessConfig(zoneAwarenessConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param zoneAwarenessConfig Specifies zone awareness configuration options.
       * Only use if `ZoneAwarenessEnabled` is `true` .
       */
      override fun zoneAwarenessConfig(zoneAwarenessConfig: ZoneAwarenessConfigProperty) {
        cdkBuilder.zoneAwarenessConfig(zoneAwarenessConfig.let(ZoneAwarenessConfigProperty.Companion::unwrap))
      }

      /**
       * @param zoneAwarenessConfig Specifies zone awareness configuration options.
       * Only use if `ZoneAwarenessEnabled` is `true` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cdc81f2f0fd336ad06569f2ff2c6451da52fa162b58311d6df529bf63527dbb0")
      override
          fun zoneAwarenessConfig(zoneAwarenessConfig: ZoneAwarenessConfigProperty.Builder.() -> Unit):
          Unit = zoneAwarenessConfig(ZoneAwarenessConfigProperty(zoneAwarenessConfig))

      /**
       * @param zoneAwarenessEnabled Indicates whether to enable zone awareness for the OpenSearch
       * Service domain.
       * When you enable zone awareness, OpenSearch Service allocates the nodes and replica index
       * shards that belong to a cluster across two Availability Zones (AZs) in the same region to
       * prevent data loss and minimize downtime in the event of node or data center failure. Don't
       * enable zone awareness if your cluster has no replica index shards or is a single-node cluster.
       * For more information, see [Configuring a multi-AZ domain in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
       * .
       */
      override fun zoneAwarenessEnabled(zoneAwarenessEnabled: Boolean) {
        cdkBuilder.zoneAwarenessEnabled(zoneAwarenessEnabled)
      }

      /**
       * @param zoneAwarenessEnabled Indicates whether to enable zone awareness for the OpenSearch
       * Service domain.
       * When you enable zone awareness, OpenSearch Service allocates the nodes and replica index
       * shards that belong to a cluster across two Availability Zones (AZs) in the same region to
       * prevent data loss and minimize downtime in the event of node or data center failure. Don't
       * enable zone awareness if your cluster has no replica index shards or is a single-node cluster.
       * For more information, see [Configuring a multi-AZ domain in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
       * .
       */
      override fun zoneAwarenessEnabled(zoneAwarenessEnabled: IResolvable) {
        cdkBuilder.zoneAwarenessEnabled(zoneAwarenessEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty,
    ) : CdkObject(cdkObject),
        ClusterConfigProperty {
      /**
       * Container for cold storage configuration options.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-coldstorageoptions)
       */
      override fun coldStorageOptions(): Any? = unwrap(this).getColdStorageOptions()

      /**
       * The number of instances to use for the master node.
       *
       * If you specify this property, you must specify `true` for the `DedicatedMasterEnabled`
       * property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-dedicatedmastercount)
       */
      override fun dedicatedMasterCount(): Number? = unwrap(this).getDedicatedMasterCount()

      /**
       * Indicates whether to use a dedicated master node for the OpenSearch Service domain.
       *
       * A dedicated master node is a cluster node that performs cluster management tasks, but
       * doesn't hold data or respond to data upload requests. Dedicated master nodes offload cluster
       * management tasks to increase the stability of your search clusters. See [Dedicated master
       * nodes in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-dedicatedmasternodes.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-dedicatedmasterenabled)
       */
      override fun dedicatedMasterEnabled(): Any? = unwrap(this).getDedicatedMasterEnabled()

      /**
       * The hardware configuration of the computer that hosts the dedicated master node, such as
       * `m3.medium.search` . If you specify this property, you must specify `true` for the
       * `DedicatedMasterEnabled` property. For valid values, see [Supported instance types in Amazon
       * OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-dedicatedmastertype)
       */
      override fun dedicatedMasterType(): String? = unwrap(this).getDedicatedMasterType()

      /**
       * The number of data nodes (instances) to use in the OpenSearch Service domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-instancecount)
       */
      override fun instanceCount(): Number? = unwrap(this).getInstanceCount()

      /**
       * The instance type for your data nodes, such as `m3.medium.search` . For valid values, see
       * [Supported instance types in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-instancetype)
       */
      override fun instanceType(): String? = unwrap(this).getInstanceType()

      /**
       * Indicates whether Multi-AZ with Standby deployment option is enabled.
       *
       * For more information, see [Multi-AZ with
       * Standby](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html#managedomains-za-standby)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-multiazwithstandbyenabled)
       */
      override fun multiAzWithStandbyEnabled(): Any? = unwrap(this).getMultiAzWithStandbyEnabled()

      /**
       * List of node options for the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-nodeoptions)
       */
      override fun nodeOptions(): Any? = unwrap(this).getNodeOptions()

      /**
       * The number of warm nodes in the cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-warmcount)
       */
      override fun warmCount(): Number? = unwrap(this).getWarmCount()

      /**
       * Whether to enable UltraWarm storage for the cluster.
       *
       * See [UltraWarm storage for Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/ultrawarm.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-warmenabled)
       */
      override fun warmEnabled(): Any? = unwrap(this).getWarmEnabled()

      /**
       * The instance type for the cluster's warm nodes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-warmtype)
       */
      override fun warmType(): String? = unwrap(this).getWarmType()

      /**
       * Specifies zone awareness configuration options.
       *
       * Only use if `ZoneAwarenessEnabled` is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-zoneawarenessconfig)
       */
      override fun zoneAwarenessConfig(): Any? = unwrap(this).getZoneAwarenessConfig()

      /**
       * Indicates whether to enable zone awareness for the OpenSearch Service domain.
       *
       * When you enable zone awareness, OpenSearch Service allocates the nodes and replica index
       * shards that belong to a cluster across two Availability Zones (AZs) in the same region to
       * prevent data loss and minimize downtime in the event of node or data center failure. Don't
       * enable zone awareness if your cluster has no replica index shards or is a single-node cluster.
       * For more information, see [Configuring a multi-AZ domain in Amazon OpenSearch
       * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/managedomains-multiaz.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html#cfn-opensearchservice-domain-clusterconfig-zoneawarenessenabled)
       */
      override fun zoneAwarenessEnabled(): Any? = unwrap(this).getZoneAwarenessEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty):
          ClusterConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? ClusterConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterConfigProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ClusterConfigProperty
    }
  }

  /**
   * Configures OpenSearch Service to use Amazon Cognito authentication for OpenSearch Dashboards.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
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
  public interface CognitoOptionsProperty {
    /**
     * Whether to enable or disable Amazon Cognito authentication for OpenSearch Dashboards.
     *
     * See [Amazon Cognito authentication for OpenSearch
     * Dashboards](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-cognitooptions.html#cfn-opensearchservice-domain-cognitooptions-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The Amazon Cognito identity pool ID that you want OpenSearch Service to use for OpenSearch
     * Dashboards authentication.
     *
     * Required if you enabled Cognito Authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-cognitooptions.html#cfn-opensearchservice-domain-cognitooptions-identitypoolid)
     */
    public fun identityPoolId(): String? = unwrap(this).getIdentityPoolId()

    /**
     * The `AmazonOpenSearchServiceCognitoAccess` role that allows OpenSearch Service to configure
     * your user pool and identity pool.
     *
     * Required if you enabled Cognito Authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-cognitooptions.html#cfn-opensearchservice-domain-cognitooptions-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * The Amazon Cognito user pool ID that you want OpenSearch Service to use for OpenSearch
     * Dashboards authentication.
     *
     * Required if you enabled Cognito Authentication for OpenSearch Dashboards.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-cognitooptions.html#cfn-opensearchservice-domain-cognitooptions-userpoolid)
     */
    public fun userPoolId(): String? = unwrap(this).getUserPoolId()

    /**
     * A builder for [CognitoOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Whether to enable or disable Amazon Cognito authentication for OpenSearch
       * Dashboards.
       * See [Amazon Cognito authentication for OpenSearch
       * Dashboards](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
       * .
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Whether to enable or disable Amazon Cognito authentication for OpenSearch
       * Dashboards.
       * See [Amazon Cognito authentication for OpenSearch
       * Dashboards](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
       * .
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param identityPoolId The Amazon Cognito identity pool ID that you want OpenSearch Service
       * to use for OpenSearch Dashboards authentication.
       * Required if you enabled Cognito Authentication for OpenSearch Dashboards.
       */
      public fun identityPoolId(identityPoolId: String)

      /**
       * @param roleArn The `AmazonOpenSearchServiceCognitoAccess` role that allows OpenSearch
       * Service to configure your user pool and identity pool.
       * Required if you enabled Cognito Authentication for OpenSearch Dashboards.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param userPoolId The Amazon Cognito user pool ID that you want OpenSearch Service to use
       * for OpenSearch Dashboards authentication.
       * Required if you enabled Cognito Authentication for OpenSearch Dashboards.
       */
      public fun userPoolId(userPoolId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty.builder()

      /**
       * @param enabled Whether to enable or disable Amazon Cognito authentication for OpenSearch
       * Dashboards.
       * See [Amazon Cognito authentication for OpenSearch
       * Dashboards](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
       * .
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Whether to enable or disable Amazon Cognito authentication for OpenSearch
       * Dashboards.
       * See [Amazon Cognito authentication for OpenSearch
       * Dashboards](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
       * .
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param identityPoolId The Amazon Cognito identity pool ID that you want OpenSearch Service
       * to use for OpenSearch Dashboards authentication.
       * Required if you enabled Cognito Authentication for OpenSearch Dashboards.
       */
      override fun identityPoolId(identityPoolId: String) {
        cdkBuilder.identityPoolId(identityPoolId)
      }

      /**
       * @param roleArn The `AmazonOpenSearchServiceCognitoAccess` role that allows OpenSearch
       * Service to configure your user pool and identity pool.
       * Required if you enabled Cognito Authentication for OpenSearch Dashboards.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param userPoolId The Amazon Cognito user pool ID that you want OpenSearch Service to use
       * for OpenSearch Dashboards authentication.
       * Required if you enabled Cognito Authentication for OpenSearch Dashboards.
       */
      override fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty,
    ) : CdkObject(cdkObject),
        CognitoOptionsProperty {
      /**
       * Whether to enable or disable Amazon Cognito authentication for OpenSearch Dashboards.
       *
       * See [Amazon Cognito authentication for OpenSearch
       * Dashboards](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-cognitooptions.html#cfn-opensearchservice-domain-cognitooptions-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The Amazon Cognito identity pool ID that you want OpenSearch Service to use for OpenSearch
       * Dashboards authentication.
       *
       * Required if you enabled Cognito Authentication for OpenSearch Dashboards.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-cognitooptions.html#cfn-opensearchservice-domain-cognitooptions-identitypoolid)
       */
      override fun identityPoolId(): String? = unwrap(this).getIdentityPoolId()

      /**
       * The `AmazonOpenSearchServiceCognitoAccess` role that allows OpenSearch Service to configure
       * your user pool and identity pool.
       *
       * Required if you enabled Cognito Authentication for OpenSearch Dashboards.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-cognitooptions.html#cfn-opensearchservice-domain-cognitooptions-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * The Amazon Cognito user pool ID that you want OpenSearch Service to use for OpenSearch
       * Dashboards authentication.
       *
       * Required if you enabled Cognito Authentication for OpenSearch Dashboards.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-cognitooptions.html#cfn-opensearchservice-domain-cognitooptions-userpoolid)
       */
      override fun userPoolId(): String? = unwrap(this).getUserPoolId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CognitoOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty):
          CognitoOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? CognitoOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CognitoOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.CognitoOptionsProperty
    }
  }

  /**
   * Container for the parameters required to enable cold storage for an OpenSearch Service domain.
   *
   * For more information, see [Cold storage for Amazon OpenSearch
   * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cold-storage.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * ColdStorageOptionsProperty coldStorageOptionsProperty = ColdStorageOptionsProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-coldstorageoptions.html)
   */
  public interface ColdStorageOptionsProperty {
    /**
     * Whether to enable or disable cold storage on the domain.
     *
     * You must enable UltraWarm storage to enable cold storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-coldstorageoptions.html#cfn-opensearchservice-domain-coldstorageoptions-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [ColdStorageOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Whether to enable or disable cold storage on the domain.
       * You must enable UltraWarm storage to enable cold storage.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Whether to enable or disable cold storage on the domain.
       * You must enable UltraWarm storage to enable cold storage.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ColdStorageOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ColdStorageOptionsProperty.builder()

      /**
       * @param enabled Whether to enable or disable cold storage on the domain.
       * You must enable UltraWarm storage to enable cold storage.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Whether to enable or disable cold storage on the domain.
       * You must enable UltraWarm storage to enable cold storage.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ColdStorageOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.ColdStorageOptionsProperty,
    ) : CdkObject(cdkObject),
        ColdStorageOptionsProperty {
      /**
       * Whether to enable or disable cold storage on the domain.
       *
       * You must enable UltraWarm storage to enable cold storage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-coldstorageoptions.html#cfn-opensearchservice-domain-coldstorageoptions-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColdStorageOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.ColdStorageOptionsProperty):
          ColdStorageOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ColdStorageOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColdStorageOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ColdStorageOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ColdStorageOptionsProperty
    }
  }

  /**
   * Specifies additional options for the domain endpoint, such as whether to require HTTPS for all
   * traffic or whether to use a custom endpoint rather than the default endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
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
  public interface DomainEndpointOptionsProperty {
    /**
     * The fully qualified URL for your custom endpoint.
     *
     * Required if you enabled a custom endpoint for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html#cfn-opensearchservice-domain-domainendpointoptions-customendpoint)
     */
    public fun customEndpoint(): String? = unwrap(this).getCustomEndpoint()

    /**
     * The AWS Certificate Manager ARN for your domain's SSL/TLS certificate.
     *
     * Required if you enabled a custom endpoint for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html#cfn-opensearchservice-domain-domainendpointoptions-customendpointcertificatearn)
     */
    public fun customEndpointCertificateArn(): String? =
        unwrap(this).getCustomEndpointCertificateArn()

    /**
     * True to enable a custom endpoint for the domain.
     *
     * If enabled, you must also provide values for `CustomEndpoint` and
     * `CustomEndpointCertificateArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html#cfn-opensearchservice-domain-domainendpointoptions-customendpointenabled)
     */
    public fun customEndpointEnabled(): Any? = unwrap(this).getCustomEndpointEnabled()

    /**
     * True to require that all traffic to the domain arrive over HTTPS.
     *
     * Required if you enable fine-grained access control in
     * [AdvancedSecurityOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html#cfn-opensearchservice-domain-domainendpointoptions-enforcehttps)
     */
    public fun enforceHttps(): Any? = unwrap(this).getEnforceHttps()

    /**
     * The minimum TLS version required for traffic to the domain. The policy can be one of the
     * following values:.
     *
     * * *Policy-Min-TLS-1-0-2019-07:* TLS security policy that supports TLS version 1.0 to TLS
     * version 1.2
     * * *Policy-Min-TLS-1-2-2019-07:* TLS security policy that supports only TLS version 1.2
     * * *Policy-Min-TLS-1-2-PFS-2023-10:* TLS security policy that supports TLS version 1.2 to TLS
     * version 1.3 with perfect forward secrecy cipher suites
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html#cfn-opensearchservice-domain-domainendpointoptions-tlssecuritypolicy)
     */
    public fun tlsSecurityPolicy(): String? = unwrap(this).getTlsSecurityPolicy()

    /**
     * A builder for [DomainEndpointOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customEndpoint The fully qualified URL for your custom endpoint.
       * Required if you enabled a custom endpoint for the domain.
       */
      public fun customEndpoint(customEndpoint: String)

      /**
       * @param customEndpointCertificateArn The AWS Certificate Manager ARN for your domain's
       * SSL/TLS certificate.
       * Required if you enabled a custom endpoint for the domain.
       */
      public fun customEndpointCertificateArn(customEndpointCertificateArn: String)

      /**
       * @param customEndpointEnabled True to enable a custom endpoint for the domain.
       * If enabled, you must also provide values for `CustomEndpoint` and
       * `CustomEndpointCertificateArn` .
       */
      public fun customEndpointEnabled(customEndpointEnabled: Boolean)

      /**
       * @param customEndpointEnabled True to enable a custom endpoint for the domain.
       * If enabled, you must also provide values for `CustomEndpoint` and
       * `CustomEndpointCertificateArn` .
       */
      public fun customEndpointEnabled(customEndpointEnabled: IResolvable)

      /**
       * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
       * Required if you enable fine-grained access control in
       * [AdvancedSecurityOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       */
      public fun enforceHttps(enforceHttps: Boolean)

      /**
       * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
       * Required if you enable fine-grained access control in
       * [AdvancedSecurityOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       */
      public fun enforceHttps(enforceHttps: IResolvable)

      /**
       * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain. The
       * policy can be one of the following values:.
       * * *Policy-Min-TLS-1-0-2019-07:* TLS security policy that supports TLS version 1.0 to TLS
       * version 1.2
       * * *Policy-Min-TLS-1-2-2019-07:* TLS security policy that supports only TLS version 1.2
       * * *Policy-Min-TLS-1-2-PFS-2023-10:* TLS security policy that supports TLS version 1.2 to
       * TLS version 1.3 with perfect forward secrecy cipher suites
       */
      public fun tlsSecurityPolicy(tlsSecurityPolicy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty.builder()

      /**
       * @param customEndpoint The fully qualified URL for your custom endpoint.
       * Required if you enabled a custom endpoint for the domain.
       */
      override fun customEndpoint(customEndpoint: String) {
        cdkBuilder.customEndpoint(customEndpoint)
      }

      /**
       * @param customEndpointCertificateArn The AWS Certificate Manager ARN for your domain's
       * SSL/TLS certificate.
       * Required if you enabled a custom endpoint for the domain.
       */
      override fun customEndpointCertificateArn(customEndpointCertificateArn: String) {
        cdkBuilder.customEndpointCertificateArn(customEndpointCertificateArn)
      }

      /**
       * @param customEndpointEnabled True to enable a custom endpoint for the domain.
       * If enabled, you must also provide values for `CustomEndpoint` and
       * `CustomEndpointCertificateArn` .
       */
      override fun customEndpointEnabled(customEndpointEnabled: Boolean) {
        cdkBuilder.customEndpointEnabled(customEndpointEnabled)
      }

      /**
       * @param customEndpointEnabled True to enable a custom endpoint for the domain.
       * If enabled, you must also provide values for `CustomEndpoint` and
       * `CustomEndpointCertificateArn` .
       */
      override fun customEndpointEnabled(customEndpointEnabled: IResolvable) {
        cdkBuilder.customEndpointEnabled(customEndpointEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
       * Required if you enable fine-grained access control in
       * [AdvancedSecurityOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       */
      override fun enforceHttps(enforceHttps: Boolean) {
        cdkBuilder.enforceHttps(enforceHttps)
      }

      /**
       * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
       * Required if you enable fine-grained access control in
       * [AdvancedSecurityOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       */
      override fun enforceHttps(enforceHttps: IResolvable) {
        cdkBuilder.enforceHttps(enforceHttps.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain. The
       * policy can be one of the following values:.
       * * *Policy-Min-TLS-1-0-2019-07:* TLS security policy that supports TLS version 1.0 to TLS
       * version 1.2
       * * *Policy-Min-TLS-1-2-2019-07:* TLS security policy that supports only TLS version 1.2
       * * *Policy-Min-TLS-1-2-PFS-2023-10:* TLS security policy that supports TLS version 1.2 to
       * TLS version 1.3 with perfect forward secrecy cipher suites
       */
      override fun tlsSecurityPolicy(tlsSecurityPolicy: String) {
        cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty,
    ) : CdkObject(cdkObject),
        DomainEndpointOptionsProperty {
      /**
       * The fully qualified URL for your custom endpoint.
       *
       * Required if you enabled a custom endpoint for the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html#cfn-opensearchservice-domain-domainendpointoptions-customendpoint)
       */
      override fun customEndpoint(): String? = unwrap(this).getCustomEndpoint()

      /**
       * The AWS Certificate Manager ARN for your domain's SSL/TLS certificate.
       *
       * Required if you enabled a custom endpoint for the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html#cfn-opensearchservice-domain-domainendpointoptions-customendpointcertificatearn)
       */
      override fun customEndpointCertificateArn(): String? =
          unwrap(this).getCustomEndpointCertificateArn()

      /**
       * True to enable a custom endpoint for the domain.
       *
       * If enabled, you must also provide values for `CustomEndpoint` and
       * `CustomEndpointCertificateArn` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html#cfn-opensearchservice-domain-domainendpointoptions-customendpointenabled)
       */
      override fun customEndpointEnabled(): Any? = unwrap(this).getCustomEndpointEnabled()

      /**
       * True to require that all traffic to the domain arrive over HTTPS.
       *
       * Required if you enable fine-grained access control in
       * [AdvancedSecurityOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html#cfn-opensearchservice-domain-domainendpointoptions-enforcehttps)
       */
      override fun enforceHttps(): Any? = unwrap(this).getEnforceHttps()

      /**
       * The minimum TLS version required for traffic to the domain. The policy can be one of the
       * following values:.
       *
       * * *Policy-Min-TLS-1-0-2019-07:* TLS security policy that supports TLS version 1.0 to TLS
       * version 1.2
       * * *Policy-Min-TLS-1-2-2019-07:* TLS security policy that supports only TLS version 1.2
       * * *Policy-Min-TLS-1-2-PFS-2023-10:* TLS security policy that supports TLS version 1.2 to
       * TLS version 1.3 with perfect forward secrecy cipher suites
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-domainendpointoptions.html#cfn-opensearchservice-domain-domainendpointoptions-tlssecuritypolicy)
       */
      override fun tlsSecurityPolicy(): String? = unwrap(this).getTlsSecurityPolicy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DomainEndpointOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty):
          DomainEndpointOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DomainEndpointOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainEndpointOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.DomainEndpointOptionsProperty
    }
  }

  /**
   * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data
   * nodes in the OpenSearch Service domain.
   *
   * For more information, see [EBS volume size
   * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
   * in the *Amazon OpenSearch Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
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
  public interface EBSOptionsProperty {
    /**
     * Specifies whether Amazon EBS volumes are attached to data nodes in the OpenSearch Service
     * domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-ebsoptions.html#cfn-opensearchservice-domain-ebsoptions-ebsenabled)
     */
    public fun ebsEnabled(): Any? = unwrap(this).getEbsEnabled()

    /**
     * The number of I/O operations per second (IOPS) that the volume supports.
     *
     * This property applies only to the `gp3` and provisioned IOPS EBS volume types.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-ebsoptions.html#cfn-opensearchservice-domain-ebsoptions-iops)
     */
    public fun iops(): Number? = unwrap(this).getIops()

    /**
     * The throughput (in MiB/s) of the EBS volumes attached to data nodes.
     *
     * Applies only to the `gp3` volume type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-ebsoptions.html#cfn-opensearchservice-domain-ebsoptions-throughput)
     */
    public fun throughput(): Number? = unwrap(this).getThroughput()

    /**
     * The size (in GiB) of the EBS volume for each data node.
     *
     * The minimum and maximum size of an EBS volume depends on the EBS volume type and the instance
     * type to which it is attached. For more information, see [EBS volume size
     * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
     * in the *Amazon OpenSearch Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-ebsoptions.html#cfn-opensearchservice-domain-ebsoptions-volumesize)
     */
    public fun volumeSize(): Number? = unwrap(this).getVolumeSize()

    /**
     * The EBS volume type to use with the OpenSearch Service domain.
     *
     * If you choose `gp3` , you must also specify values for `Iops` and `Throughput` . For more
     * information about each type, see [Amazon EBS volume
     * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
     * EC2 User Guide for Linux Instances* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-ebsoptions.html#cfn-opensearchservice-domain-ebsoptions-volumetype)
     */
    public fun volumeType(): String? = unwrap(this).getVolumeType()

    /**
     * A builder for [EBSOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ebsEnabled Specifies whether Amazon EBS volumes are attached to data nodes in the
       * OpenSearch Service domain.
       */
      public fun ebsEnabled(ebsEnabled: Boolean)

      /**
       * @param ebsEnabled Specifies whether Amazon EBS volumes are attached to data nodes in the
       * OpenSearch Service domain.
       */
      public fun ebsEnabled(ebsEnabled: IResolvable)

      /**
       * @param iops The number of I/O operations per second (IOPS) that the volume supports.
       * This property applies only to the `gp3` and provisioned IOPS EBS volume types.
       */
      public fun iops(iops: Number)

      /**
       * @param throughput The throughput (in MiB/s) of the EBS volumes attached to data nodes.
       * Applies only to the `gp3` volume type.
       */
      public fun throughput(throughput: Number)

      /**
       * @param volumeSize The size (in GiB) of the EBS volume for each data node.
       * The minimum and maximum size of an EBS volume depends on the EBS volume type and the
       * instance type to which it is attached. For more information, see [EBS volume size
       * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
       * in the *Amazon OpenSearch Service Developer Guide* .
       */
      public fun volumeSize(volumeSize: Number)

      /**
       * @param volumeType The EBS volume type to use with the OpenSearch Service domain.
       * If you choose `gp3` , you must also specify values for `Iops` and `Throughput` . For more
       * information about each type, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
       * EC2 User Guide for Linux Instances* .
       */
      public fun volumeType(volumeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty.Builder =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty.builder()

      /**
       * @param ebsEnabled Specifies whether Amazon EBS volumes are attached to data nodes in the
       * OpenSearch Service domain.
       */
      override fun ebsEnabled(ebsEnabled: Boolean) {
        cdkBuilder.ebsEnabled(ebsEnabled)
      }

      /**
       * @param ebsEnabled Specifies whether Amazon EBS volumes are attached to data nodes in the
       * OpenSearch Service domain.
       */
      override fun ebsEnabled(ebsEnabled: IResolvable) {
        cdkBuilder.ebsEnabled(ebsEnabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param iops The number of I/O operations per second (IOPS) that the volume supports.
       * This property applies only to the `gp3` and provisioned IOPS EBS volume types.
       */
      override fun iops(iops: Number) {
        cdkBuilder.iops(iops)
      }

      /**
       * @param throughput The throughput (in MiB/s) of the EBS volumes attached to data nodes.
       * Applies only to the `gp3` volume type.
       */
      override fun throughput(throughput: Number) {
        cdkBuilder.throughput(throughput)
      }

      /**
       * @param volumeSize The size (in GiB) of the EBS volume for each data node.
       * The minimum and maximum size of an EBS volume depends on the EBS volume type and the
       * instance type to which it is attached. For more information, see [EBS volume size
       * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
       * in the *Amazon OpenSearch Service Developer Guide* .
       */
      override fun volumeSize(volumeSize: Number) {
        cdkBuilder.volumeSize(volumeSize)
      }

      /**
       * @param volumeType The EBS volume type to use with the OpenSearch Service domain.
       * If you choose `gp3` , you must also specify values for `Iops` and `Throughput` . For more
       * information about each type, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
       * EC2 User Guide for Linux Instances* .
       */
      override fun volumeType(volumeType: String) {
        cdkBuilder.volumeType(volumeType)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty,
    ) : CdkObject(cdkObject),
        EBSOptionsProperty {
      /**
       * Specifies whether Amazon EBS volumes are attached to data nodes in the OpenSearch Service
       * domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-ebsoptions.html#cfn-opensearchservice-domain-ebsoptions-ebsenabled)
       */
      override fun ebsEnabled(): Any? = unwrap(this).getEbsEnabled()

      /**
       * The number of I/O operations per second (IOPS) that the volume supports.
       *
       * This property applies only to the `gp3` and provisioned IOPS EBS volume types.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-ebsoptions.html#cfn-opensearchservice-domain-ebsoptions-iops)
       */
      override fun iops(): Number? = unwrap(this).getIops()

      /**
       * The throughput (in MiB/s) of the EBS volumes attached to data nodes.
       *
       * Applies only to the `gp3` volume type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-ebsoptions.html#cfn-opensearchservice-domain-ebsoptions-throughput)
       */
      override fun throughput(): Number? = unwrap(this).getThroughput()

      /**
       * The size (in GiB) of the EBS volume for each data node.
       *
       * The minimum and maximum size of an EBS volume depends on the EBS volume type and the
       * instance type to which it is attached. For more information, see [EBS volume size
       * limits](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/limits.html#ebsresource)
       * in the *Amazon OpenSearch Service Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-ebsoptions.html#cfn-opensearchservice-domain-ebsoptions-volumesize)
       */
      override fun volumeSize(): Number? = unwrap(this).getVolumeSize()

      /**
       * The EBS volume type to use with the OpenSearch Service domain.
       *
       * If you choose `gp3` , you must also specify values for `Iops` and `Throughput` . For more
       * information about each type, see [Amazon EBS volume
       * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon
       * EC2 User Guide for Linux Instances* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-ebsoptions.html#cfn-opensearchservice-domain-ebsoptions-volumetype)
       */
      override fun volumeType(): String? = unwrap(this).getVolumeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EBSOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty):
          EBSOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? EBSOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EBSOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EBSOptionsProperty
    }
  }

  /**
   * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service key
   * to use.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * EncryptionAtRestOptionsProperty encryptionAtRestOptionsProperty =
   * EncryptionAtRestOptionsProperty.builder()
   * .enabled(false)
   * .kmsKeyId("kmsKeyId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html)
   */
  public interface EncryptionAtRestOptionsProperty {
    /**
     * Specify `true` to enable encryption at rest. Required if you enable fine-grained access
     * control in
     * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
     * .
     *
     * If no encryption at rest options were initially specified in the template, updating this
     * property by adding it causes no interruption. However, if you change this property after it's
     * already been set within a template, the domain is deleted and recreated in order to modify the
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html#cfn-opensearchservice-domain-encryptionatrestoptions-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The KMS key ID. Takes the form `1a2a3a4-1a2a-3a4a-5a6a-1a2a3a4a5a6a` . Required if you enable
     * encryption at rest.
     *
     * You can also use `keyAlias` as a value.
     *
     * If no encryption at rest options were initially specified in the template, updating this
     * property by adding it causes no interruption. However, if you change this property after it's
     * already been set within a template, the domain is deleted and recreated in order to modify the
     * property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html#cfn-opensearchservice-domain-encryptionatrestoptions-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * A builder for [EncryptionAtRestOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Specify `true` to enable encryption at rest. Required if you enable
       * fine-grained access control in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       * If no encryption at rest options were initially specified in the template, updating this
       * property by adding it causes no interruption. However, if you change this property after it's
       * already been set within a template, the domain is deleted and recreated in order to modify the
       * property.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specify `true` to enable encryption at rest. Required if you enable
       * fine-grained access control in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       * If no encryption at rest options were initially specified in the template, updating this
       * property by adding it causes no interruption. However, if you change this property after it's
       * already been set within a template, the domain is deleted and recreated in order to modify the
       * property.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param kmsKeyId The KMS key ID. Takes the form `1a2a3a4-1a2a-3a4a-5a6a-1a2a3a4a5a6a` .
       * Required if you enable encryption at rest.
       * You can also use `keyAlias` as a value.
       *
       * If no encryption at rest options were initially specified in the template, updating this
       * property by adding it causes no interruption. However, if you change this property after it's
       * already been set within a template, the domain is deleted and recreated in order to modify the
       * property.
       */
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty.builder()

      /**
       * @param enabled Specify `true` to enable encryption at rest. Required if you enable
       * fine-grained access control in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       * If no encryption at rest options were initially specified in the template, updating this
       * property by adding it causes no interruption. However, if you change this property after it's
       * already been set within a template, the domain is deleted and recreated in order to modify the
       * property.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specify `true` to enable encryption at rest. Required if you enable
       * fine-grained access control in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       * If no encryption at rest options were initially specified in the template, updating this
       * property by adding it causes no interruption. However, if you change this property after it's
       * already been set within a template, the domain is deleted and recreated in order to modify the
       * property.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kmsKeyId The KMS key ID. Takes the form `1a2a3a4-1a2a-3a4a-5a6a-1a2a3a4a5a6a` .
       * Required if you enable encryption at rest.
       * You can also use `keyAlias` as a value.
       *
       * If no encryption at rest options were initially specified in the template, updating this
       * property by adding it causes no interruption. However, if you change this property after it's
       * already been set within a template, the domain is deleted and recreated in order to modify the
       * property.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty,
    ) : CdkObject(cdkObject),
        EncryptionAtRestOptionsProperty {
      /**
       * Specify `true` to enable encryption at rest. Required if you enable fine-grained access
       * control in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       *
       * If no encryption at rest options were initially specified in the template, updating this
       * property by adding it causes no interruption. However, if you change this property after it's
       * already been set within a template, the domain is deleted and recreated in order to modify the
       * property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html#cfn-opensearchservice-domain-encryptionatrestoptions-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The KMS key ID. Takes the form `1a2a3a4-1a2a-3a4a-5a6a-1a2a3a4a5a6a` . Required if you
       * enable encryption at rest.
       *
       * You can also use `keyAlias` as a value.
       *
       * If no encryption at rest options were initially specified in the template, updating this
       * property by adding it causes no interruption. However, if you change this property after it's
       * already been set within a template, the domain is deleted and recreated in order to modify the
       * property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-encryptionatrestoptions.html#cfn-opensearchservice-domain-encryptionatrestoptions-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionAtRestOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty):
          EncryptionAtRestOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionAtRestOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionAtRestOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.EncryptionAtRestOptionsProperty
    }
  }

  /**
   * Settings container for integrating IAM Identity Center with OpenSearch UI applications, which
   * enables enabling secure user authentication and access control across multiple data sources.
   *
   * This setup supports single sign-on (SSO) through IAM Identity Center, allowing centralized user
   * management.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * IdentityCenterOptionsProperty identityCenterOptionsProperty =
   * IdentityCenterOptionsProperty.builder()
   * .enabledApiAccess(false)
   * .identityCenterApplicationArn("identityCenterApplicationArn")
   * .identityCenterInstanceArn("identityCenterInstanceArn")
   * .identityStoreId("identityStoreId")
   * .rolesKey("rolesKey")
   * .subjectKey("subjectKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-identitycenteroptions.html)
   */
  public interface IdentityCenterOptionsProperty {
    /**
     * Indicates whether IAM Identity Center is enabled for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-identitycenteroptions.html#cfn-opensearchservice-domain-identitycenteroptions-enabledapiaccess)
     */
    public fun enabledApiAccess(): Any? = unwrap(this).getEnabledApiAccess()

    /**
     * The ARN of the IAM Identity Center application that integrates with Amazon OpenSearch
     * Service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-identitycenteroptions.html#cfn-opensearchservice-domain-identitycenteroptions-identitycenterapplicationarn)
     */
    public fun identityCenterApplicationArn(): String? =
        unwrap(this).getIdentityCenterApplicationArn()

    /**
     * The Amazon Resource Name (ARN) of the IAM Identity Center instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-identitycenteroptions.html#cfn-opensearchservice-domain-identitycenteroptions-identitycenterinstancearn)
     */
    public fun identityCenterInstanceArn(): String? = unwrap(this).getIdentityCenterInstanceArn()

    /**
     * The identifier of the IAM Identity Store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-identitycenteroptions.html#cfn-opensearchservice-domain-identitycenteroptions-identitystoreid)
     */
    public fun identityStoreId(): String? = unwrap(this).getIdentityStoreId()

    /**
     * Specifies the attribute that contains the backend role identifier (such as group name or
     * group ID) in IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-identitycenteroptions.html#cfn-opensearchservice-domain-identitycenteroptions-roleskey)
     */
    public fun rolesKey(): String? = unwrap(this).getRolesKey()

    /**
     * Specifies the attribute that contains the subject identifier (such as username, user ID, or
     * email) in IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-identitycenteroptions.html#cfn-opensearchservice-domain-identitycenteroptions-subjectkey)
     */
    public fun subjectKey(): String? = unwrap(this).getSubjectKey()

    /**
     * A builder for [IdentityCenterOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabledApiAccess Indicates whether IAM Identity Center is enabled for the
       * application.
       */
      public fun enabledApiAccess(enabledApiAccess: Boolean)

      /**
       * @param enabledApiAccess Indicates whether IAM Identity Center is enabled for the
       * application.
       */
      public fun enabledApiAccess(enabledApiAccess: IResolvable)

      /**
       * @param identityCenterApplicationArn The ARN of the IAM Identity Center application that
       * integrates with Amazon OpenSearch Service.
       */
      public fun identityCenterApplicationArn(identityCenterApplicationArn: String)

      /**
       * @param identityCenterInstanceArn The Amazon Resource Name (ARN) of the IAM Identity Center
       * instance.
       */
      public fun identityCenterInstanceArn(identityCenterInstanceArn: String)

      /**
       * @param identityStoreId The identifier of the IAM Identity Store.
       */
      public fun identityStoreId(identityStoreId: String)

      /**
       * @param rolesKey Specifies the attribute that contains the backend role identifier (such as
       * group name or group ID) in IAM Identity Center.
       */
      public fun rolesKey(rolesKey: String)

      /**
       * @param subjectKey Specifies the attribute that contains the subject identifier (such as
       * username, user ID, or email) in IAM Identity Center.
       */
      public fun subjectKey(subjectKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.IdentityCenterOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.IdentityCenterOptionsProperty.builder()

      /**
       * @param enabledApiAccess Indicates whether IAM Identity Center is enabled for the
       * application.
       */
      override fun enabledApiAccess(enabledApiAccess: Boolean) {
        cdkBuilder.enabledApiAccess(enabledApiAccess)
      }

      /**
       * @param enabledApiAccess Indicates whether IAM Identity Center is enabled for the
       * application.
       */
      override fun enabledApiAccess(enabledApiAccess: IResolvable) {
        cdkBuilder.enabledApiAccess(enabledApiAccess.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param identityCenterApplicationArn The ARN of the IAM Identity Center application that
       * integrates with Amazon OpenSearch Service.
       */
      override fun identityCenterApplicationArn(identityCenterApplicationArn: String) {
        cdkBuilder.identityCenterApplicationArn(identityCenterApplicationArn)
      }

      /**
       * @param identityCenterInstanceArn The Amazon Resource Name (ARN) of the IAM Identity Center
       * instance.
       */
      override fun identityCenterInstanceArn(identityCenterInstanceArn: String) {
        cdkBuilder.identityCenterInstanceArn(identityCenterInstanceArn)
      }

      /**
       * @param identityStoreId The identifier of the IAM Identity Store.
       */
      override fun identityStoreId(identityStoreId: String) {
        cdkBuilder.identityStoreId(identityStoreId)
      }

      /**
       * @param rolesKey Specifies the attribute that contains the backend role identifier (such as
       * group name or group ID) in IAM Identity Center.
       */
      override fun rolesKey(rolesKey: String) {
        cdkBuilder.rolesKey(rolesKey)
      }

      /**
       * @param subjectKey Specifies the attribute that contains the subject identifier (such as
       * username, user ID, or email) in IAM Identity Center.
       */
      override fun subjectKey(subjectKey: String) {
        cdkBuilder.subjectKey(subjectKey)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.IdentityCenterOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.IdentityCenterOptionsProperty,
    ) : CdkObject(cdkObject),
        IdentityCenterOptionsProperty {
      /**
       * Indicates whether IAM Identity Center is enabled for the application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-identitycenteroptions.html#cfn-opensearchservice-domain-identitycenteroptions-enabledapiaccess)
       */
      override fun enabledApiAccess(): Any? = unwrap(this).getEnabledApiAccess()

      /**
       * The ARN of the IAM Identity Center application that integrates with Amazon OpenSearch
       * Service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-identitycenteroptions.html#cfn-opensearchservice-domain-identitycenteroptions-identitycenterapplicationarn)
       */
      override fun identityCenterApplicationArn(): String? =
          unwrap(this).getIdentityCenterApplicationArn()

      /**
       * The Amazon Resource Name (ARN) of the IAM Identity Center instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-identitycenteroptions.html#cfn-opensearchservice-domain-identitycenteroptions-identitycenterinstancearn)
       */
      override fun identityCenterInstanceArn(): String? =
          unwrap(this).getIdentityCenterInstanceArn()

      /**
       * The identifier of the IAM Identity Store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-identitycenteroptions.html#cfn-opensearchservice-domain-identitycenteroptions-identitystoreid)
       */
      override fun identityStoreId(): String? = unwrap(this).getIdentityStoreId()

      /**
       * Specifies the attribute that contains the backend role identifier (such as group name or
       * group ID) in IAM Identity Center.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-identitycenteroptions.html#cfn-opensearchservice-domain-identitycenteroptions-roleskey)
       */
      override fun rolesKey(): String? = unwrap(this).getRolesKey()

      /**
       * Specifies the attribute that contains the subject identifier (such as username, user ID, or
       * email) in IAM Identity Center.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-identitycenteroptions.html#cfn-opensearchservice-domain-identitycenteroptions-subjectkey)
       */
      override fun subjectKey(): String? = unwrap(this).getSubjectKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IdentityCenterOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.IdentityCenterOptionsProperty):
          IdentityCenterOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdentityCenterOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdentityCenterOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.IdentityCenterOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.IdentityCenterOptionsProperty
    }
  }

  /**
   * The SAML Identity Provider's information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * IdpProperty idpProperty = IdpProperty.builder()
   * .entityId("entityId")
   * .metadataContent("metadataContent")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-idp.html)
   */
  public interface IdpProperty {
    /**
     * The unique entity ID of the application in the SAML identity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-idp.html#cfn-opensearchservice-domain-idp-entityid)
     */
    public fun entityId(): String

    /**
     * The metadata of the SAML application, in XML format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-idp.html#cfn-opensearchservice-domain-idp-metadatacontent)
     */
    public fun metadataContent(): String

    /**
     * A builder for [IdpProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param entityId The unique entity ID of the application in the SAML identity provider. 
       */
      public fun entityId(entityId: String)

      /**
       * @param metadataContent The metadata of the SAML application, in XML format. 
       */
      public fun metadataContent(metadataContent: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.IdpProperty.Builder =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.IdpProperty.builder()

      /**
       * @param entityId The unique entity ID of the application in the SAML identity provider. 
       */
      override fun entityId(entityId: String) {
        cdkBuilder.entityId(entityId)
      }

      /**
       * @param metadataContent The metadata of the SAML application, in XML format. 
       */
      override fun metadataContent(metadataContent: String) {
        cdkBuilder.metadataContent(metadataContent)
      }

      public fun build(): software.amazon.awscdk.services.opensearchservice.CfnDomain.IdpProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.IdpProperty,
    ) : CdkObject(cdkObject),
        IdpProperty {
      /**
       * The unique entity ID of the application in the SAML identity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-idp.html#cfn-opensearchservice-domain-idp-entityid)
       */
      override fun entityId(): String = unwrap(this).getEntityId()

      /**
       * The metadata of the SAML application, in XML format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-idp.html#cfn-opensearchservice-domain-idp-metadatacontent)
       */
      override fun metadataContent(): String = unwrap(this).getMetadataContent()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IdpProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.IdpProperty):
          IdpProperty = CdkObjectWrappers.wrap(cdkObject) as? IdpProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdpProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.IdpProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.IdpProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * JWTOptionsProperty jWTOptionsProperty = JWTOptionsProperty.builder()
   * .enabled(false)
   * .publicKey("publicKey")
   * .rolesKey("rolesKey")
   * .subjectKey("subjectKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-jwtoptions.html)
   */
  public interface JWTOptionsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-jwtoptions.html#cfn-opensearchservice-domain-jwtoptions-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-jwtoptions.html#cfn-opensearchservice-domain-jwtoptions-publickey)
     */
    public fun publicKey(): String? = unwrap(this).getPublicKey()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-jwtoptions.html#cfn-opensearchservice-domain-jwtoptions-roleskey)
     */
    public fun rolesKey(): String? = unwrap(this).getRolesKey()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-jwtoptions.html#cfn-opensearchservice-domain-jwtoptions-subjectkey)
     */
    public fun subjectKey(): String? = unwrap(this).getSubjectKey()

    /**
     * A builder for [JWTOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param publicKey the value to be set.
       */
      public fun publicKey(publicKey: String)

      /**
       * @param rolesKey the value to be set.
       */
      public fun rolesKey(rolesKey: String)

      /**
       * @param subjectKey the value to be set.
       */
      public fun subjectKey(subjectKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.JWTOptionsProperty.Builder =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.JWTOptionsProperty.builder()

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param publicKey the value to be set.
       */
      override fun publicKey(publicKey: String) {
        cdkBuilder.publicKey(publicKey)
      }

      /**
       * @param rolesKey the value to be set.
       */
      override fun rolesKey(rolesKey: String) {
        cdkBuilder.rolesKey(rolesKey)
      }

      /**
       * @param subjectKey the value to be set.
       */
      override fun subjectKey(subjectKey: String) {
        cdkBuilder.subjectKey(subjectKey)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.JWTOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.JWTOptionsProperty,
    ) : CdkObject(cdkObject),
        JWTOptionsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-jwtoptions.html#cfn-opensearchservice-domain-jwtoptions-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-jwtoptions.html#cfn-opensearchservice-domain-jwtoptions-publickey)
       */
      override fun publicKey(): String? = unwrap(this).getPublicKey()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-jwtoptions.html#cfn-opensearchservice-domain-jwtoptions-roleskey)
       */
      override fun rolesKey(): String? = unwrap(this).getRolesKey()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-jwtoptions.html#cfn-opensearchservice-domain-jwtoptions-subjectkey)
       */
      override fun subjectKey(): String? = unwrap(this).getSubjectKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JWTOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.JWTOptionsProperty):
          JWTOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? JWTOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: JWTOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.JWTOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.JWTOptionsProperty
    }
  }

  /**
   * Specifies whether the OpenSearch Service domain publishes application, search slow logs, or
   * index slow logs to Amazon CloudWatch.
   *
   * Each option must be an object of name `SEARCH_SLOW_LOGS` , `ES_APPLICATION_LOGS` ,
   * `INDEX_SLOW_LOGS` , or `AUDIT_LOGS` depending on the type of logs you want to publish. For the
   * full syntax, see the
   * [examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchservice-domain.html#aws-resource-opensearchservice-domain--examples)
   * .
   *
   * Before you enable log publishing, you need to create a CloudWatch log group and provide
   * OpenSearch Service the correct permissions to write to it. To learn more, see [Enabling log
   * publishing ( AWS
   * CloudFormation)](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createdomain-configure-slow-logs.html#createdomain-configure-slow-logs-cfn)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * LogPublishingOptionProperty logPublishingOptionProperty = LogPublishingOptionProperty.builder()
   * .cloudWatchLogsLogGroupArn("cloudWatchLogsLogGroupArn")
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-logpublishingoption.html)
   */
  public interface LogPublishingOptionProperty {
    /**
     * Specifies the CloudWatch log group to publish to.
     *
     * Required if you enable log publishing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-logpublishingoption.html#cfn-opensearchservice-domain-logpublishingoption-cloudwatchlogsloggrouparn)
     */
    public fun cloudWatchLogsLogGroupArn(): String? = unwrap(this).getCloudWatchLogsLogGroupArn()

    /**
     * If `true` , enables the publishing of logs to CloudWatch.
     *
     * Default: `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-logpublishingoption.html#cfn-opensearchservice-domain-logpublishingoption-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [LogPublishingOptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchLogsLogGroupArn Specifies the CloudWatch log group to publish to.
       * Required if you enable log publishing.
       */
      public fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String)

      /**
       * @param enabled If `true` , enables the publishing of logs to CloudWatch.
       * Default: `false` .
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled If `true` , enables the publishing of logs to CloudWatch.
       * Default: `false` .
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.LogPublishingOptionProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.LogPublishingOptionProperty.builder()

      /**
       * @param cloudWatchLogsLogGroupArn Specifies the CloudWatch log group to publish to.
       * Required if you enable log publishing.
       */
      override fun cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn: String) {
        cdkBuilder.cloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn)
      }

      /**
       * @param enabled If `true` , enables the publishing of logs to CloudWatch.
       * Default: `false` .
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled If `true` , enables the publishing of logs to CloudWatch.
       * Default: `false` .
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.LogPublishingOptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.LogPublishingOptionProperty,
    ) : CdkObject(cdkObject),
        LogPublishingOptionProperty {
      /**
       * Specifies the CloudWatch log group to publish to.
       *
       * Required if you enable log publishing.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-logpublishingoption.html#cfn-opensearchservice-domain-logpublishingoption-cloudwatchlogsloggrouparn)
       */
      override fun cloudWatchLogsLogGroupArn(): String? =
          unwrap(this).getCloudWatchLogsLogGroupArn()

      /**
       * If `true` , enables the publishing of logs to CloudWatch.
       *
       * Default: `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-logpublishingoption.html#cfn-opensearchservice-domain-logpublishingoption-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LogPublishingOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.LogPublishingOptionProperty):
          LogPublishingOptionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LogPublishingOptionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogPublishingOptionProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.LogPublishingOptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.LogPublishingOptionProperty
    }
  }

  /**
   * Specifies information about the master user.
   *
   * Required if `InternalUserDatabaseEnabled` is true in
   * [AdvancedSecurityOptions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * MasterUserOptionsProperty masterUserOptionsProperty = MasterUserOptionsProperty.builder()
   * .masterUserArn("masterUserArn")
   * .masterUserName("masterUserName")
   * .masterUserPassword("masterUserPassword")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-masteruseroptions.html)
   */
  public interface MasterUserOptionsProperty {
    /**
     * Amazon Resource Name (ARN) for the master user.
     *
     * The ARN can point to an IAM user or role. This property is required for Amazon Cognito to
     * work, and it must match the role configured for Cognito. Only specify if
     * `InternalUserDatabaseEnabled` is false in
     * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-masteruseroptions.html#cfn-opensearchservice-domain-masteruseroptions-masteruserarn)
     */
    public fun masterUserArn(): String? = unwrap(this).getMasterUserArn()

    /**
     * Username for the master user. Only specify if `InternalUserDatabaseEnabled` is true in
     * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
     * .
     *
     * If you don't want to specify this value directly within the template, you can use a [dynamic
     * reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html)
     * instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-masteruseroptions.html#cfn-opensearchservice-domain-masteruseroptions-masterusername)
     */
    public fun masterUserName(): String? = unwrap(this).getMasterUserName()

    /**
     * Password for the master user. Only specify if `InternalUserDatabaseEnabled` is true in
     * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
     * .
     *
     * If you don't want to specify this value directly within the template, you can use a [dynamic
     * reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html)
     * instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-masteruseroptions.html#cfn-opensearchservice-domain-masteruseroptions-masteruserpassword)
     */
    public fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

    /**
     * A builder for [MasterUserOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param masterUserArn Amazon Resource Name (ARN) for the master user.
       * The ARN can point to an IAM user or role. This property is required for Amazon Cognito to
       * work, and it must match the role configured for Cognito. Only specify if
       * `InternalUserDatabaseEnabled` is false in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       */
      public fun masterUserArn(masterUserArn: String)

      /**
       * @param masterUserName Username for the master user. Only specify if
       * `InternalUserDatabaseEnabled` is true in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       * If you don't want to specify this value directly within the template, you can use a
       * [dynamic
       * reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html)
       * instead.
       */
      public fun masterUserName(masterUserName: String)

      /**
       * @param masterUserPassword Password for the master user. Only specify if
       * `InternalUserDatabaseEnabled` is true in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       * If you don't want to specify this value directly within the template, you can use a
       * [dynamic
       * reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html)
       * instead.
       */
      public fun masterUserPassword(masterUserPassword: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty.builder()

      /**
       * @param masterUserArn Amazon Resource Name (ARN) for the master user.
       * The ARN can point to an IAM user or role. This property is required for Amazon Cognito to
       * work, and it must match the role configured for Cognito. Only specify if
       * `InternalUserDatabaseEnabled` is false in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       */
      override fun masterUserArn(masterUserArn: String) {
        cdkBuilder.masterUserArn(masterUserArn)
      }

      /**
       * @param masterUserName Username for the master user. Only specify if
       * `InternalUserDatabaseEnabled` is true in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       * If you don't want to specify this value directly within the template, you can use a
       * [dynamic
       * reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html)
       * instead.
       */
      override fun masterUserName(masterUserName: String) {
        cdkBuilder.masterUserName(masterUserName)
      }

      /**
       * @param masterUserPassword Password for the master user. Only specify if
       * `InternalUserDatabaseEnabled` is true in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       * If you don't want to specify this value directly within the template, you can use a
       * [dynamic
       * reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html)
       * instead.
       */
      override fun masterUserPassword(masterUserPassword: String) {
        cdkBuilder.masterUserPassword(masterUserPassword)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty,
    ) : CdkObject(cdkObject),
        MasterUserOptionsProperty {
      /**
       * Amazon Resource Name (ARN) for the master user.
       *
       * The ARN can point to an IAM user or role. This property is required for Amazon Cognito to
       * work, and it must match the role configured for Cognito. Only specify if
       * `InternalUserDatabaseEnabled` is false in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-masteruseroptions.html#cfn-opensearchservice-domain-masteruseroptions-masteruserarn)
       */
      override fun masterUserArn(): String? = unwrap(this).getMasterUserArn()

      /**
       * Username for the master user. Only specify if `InternalUserDatabaseEnabled` is true in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       *
       * If you don't want to specify this value directly within the template, you can use a
       * [dynamic
       * reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html)
       * instead.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-masteruseroptions.html#cfn-opensearchservice-domain-masteruseroptions-masterusername)
       */
      override fun masterUserName(): String? = unwrap(this).getMasterUserName()

      /**
       * Password for the master user. Only specify if `InternalUserDatabaseEnabled` is true in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       *
       * If you don't want to specify this value directly within the template, you can use a
       * [dynamic
       * reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html)
       * instead.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-masteruseroptions.html#cfn-opensearchservice-domain-masteruseroptions-masteruserpassword)
       */
      override fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MasterUserOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty):
          MasterUserOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MasterUserOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MasterUserOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.MasterUserOptionsProperty
    }
  }

  /**
   * Configuration options for defining the setup of any node type within the cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * NodeConfigProperty nodeConfigProperty = NodeConfigProperty.builder()
   * .count(123)
   * .enabled(false)
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodeconfig.html)
   */
  public interface NodeConfigProperty {
    /**
     * The number of nodes of a specific type within the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodeconfig.html#cfn-opensearchservice-domain-nodeconfig-count)
     */
    public fun count(): Number? = unwrap(this).getCount()

    /**
     * A boolean value indicating whether a specific node type is active or inactive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodeconfig.html#cfn-opensearchservice-domain-nodeconfig-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The instance type of a particular node within the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodeconfig.html#cfn-opensearchservice-domain-nodeconfig-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [NodeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param count The number of nodes of a specific type within the cluster.
       */
      public fun count(count: Number)

      /**
       * @param enabled A boolean value indicating whether a specific node type is active or
       * inactive.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled A boolean value indicating whether a specific node type is active or
       * inactive.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param type The instance type of a particular node within the cluster.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeConfigProperty.Builder =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeConfigProperty.builder()

      /**
       * @param count The number of nodes of a specific type within the cluster.
       */
      override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      /**
       * @param enabled A boolean value indicating whether a specific node type is active or
       * inactive.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled A boolean value indicating whether a specific node type is active or
       * inactive.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param type The instance type of a particular node within the cluster.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeConfigProperty,
    ) : CdkObject(cdkObject),
        NodeConfigProperty {
      /**
       * The number of nodes of a specific type within the cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodeconfig.html#cfn-opensearchservice-domain-nodeconfig-count)
       */
      override fun count(): Number? = unwrap(this).getCount()

      /**
       * A boolean value indicating whether a specific node type is active or inactive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodeconfig.html#cfn-opensearchservice-domain-nodeconfig-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The instance type of a particular node within the cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodeconfig.html#cfn-opensearchservice-domain-nodeconfig-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NodeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeConfigProperty):
          NodeConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? NodeConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeConfigProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeConfigProperty
    }
  }

  /**
   * Configuration settings for defining the node type within a cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * NodeOptionProperty nodeOptionProperty = NodeOptionProperty.builder()
   * .nodeConfig(NodeConfigProperty.builder()
   * .count(123)
   * .enabled(false)
   * .type("type")
   * .build())
   * .nodeType("nodeType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodeoption.html)
   */
  public interface NodeOptionProperty {
    /**
     * Configuration options for defining the setup of any node type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodeoption.html#cfn-opensearchservice-domain-nodeoption-nodeconfig)
     */
    public fun nodeConfig(): Any? = unwrap(this).getNodeConfig()

    /**
     * Defines the type of node, such as coordinating nodes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodeoption.html#cfn-opensearchservice-domain-nodeoption-nodetype)
     */
    public fun nodeType(): String? = unwrap(this).getNodeType()

    /**
     * A builder for [NodeOptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param nodeConfig Configuration options for defining the setup of any node type.
       */
      public fun nodeConfig(nodeConfig: IResolvable)

      /**
       * @param nodeConfig Configuration options for defining the setup of any node type.
       */
      public fun nodeConfig(nodeConfig: NodeConfigProperty)

      /**
       * @param nodeConfig Configuration options for defining the setup of any node type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c70a345142a08a1eb2934bdcf087d396dc8a89e7d381626dc4049410bdf153d3")
      public fun nodeConfig(nodeConfig: NodeConfigProperty.Builder.() -> Unit)

      /**
       * @param nodeType Defines the type of node, such as coordinating nodes.
       */
      public fun nodeType(nodeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeOptionProperty.Builder =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeOptionProperty.builder()

      /**
       * @param nodeConfig Configuration options for defining the setup of any node type.
       */
      override fun nodeConfig(nodeConfig: IResolvable) {
        cdkBuilder.nodeConfig(nodeConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nodeConfig Configuration options for defining the setup of any node type.
       */
      override fun nodeConfig(nodeConfig: NodeConfigProperty) {
        cdkBuilder.nodeConfig(nodeConfig.let(NodeConfigProperty.Companion::unwrap))
      }

      /**
       * @param nodeConfig Configuration options for defining the setup of any node type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c70a345142a08a1eb2934bdcf087d396dc8a89e7d381626dc4049410bdf153d3")
      override fun nodeConfig(nodeConfig: NodeConfigProperty.Builder.() -> Unit): Unit =
          nodeConfig(NodeConfigProperty(nodeConfig))

      /**
       * @param nodeType Defines the type of node, such as coordinating nodes.
       */
      override fun nodeType(nodeType: String) {
        cdkBuilder.nodeType(nodeType)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeOptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeOptionProperty,
    ) : CdkObject(cdkObject),
        NodeOptionProperty {
      /**
       * Configuration options for defining the setup of any node type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodeoption.html#cfn-opensearchservice-domain-nodeoption-nodeconfig)
       */
      override fun nodeConfig(): Any? = unwrap(this).getNodeConfig()

      /**
       * Defines the type of node, such as coordinating nodes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodeoption.html#cfn-opensearchservice-domain-nodeoption-nodetype)
       */
      override fun nodeType(): String? = unwrap(this).getNodeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NodeOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeOptionProperty):
          NodeOptionProperty = CdkObjectWrappers.wrap(cdkObject) as? NodeOptionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeOptionProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeOptionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeOptionProperty
    }
  }

  /**
   * Specifies options for node-to-node encryption.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * NodeToNodeEncryptionOptionsProperty nodeToNodeEncryptionOptionsProperty =
   * NodeToNodeEncryptionOptionsProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html)
   */
  public interface NodeToNodeEncryptionOptionsProperty {
    /**
     * Specifies to enable or disable node-to-node encryption on the domain.
     *
     * Required if you enable fine-grained access control in
     * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html#cfn-opensearchservice-domain-nodetonodeencryptionoptions-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [NodeToNodeEncryptionOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Specifies to enable or disable node-to-node encryption on the domain.
       * Required if you enable fine-grained access control in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specifies to enable or disable node-to-node encryption on the domain.
       * Required if you enable fine-grained access control in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty.builder()

      /**
       * @param enabled Specifies to enable or disable node-to-node encryption on the domain.
       * Required if you enable fine-grained access control in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specifies to enable or disable node-to-node encryption on the domain.
       * Required if you enable fine-grained access control in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty,
    ) : CdkObject(cdkObject),
        NodeToNodeEncryptionOptionsProperty {
      /**
       * Specifies to enable or disable node-to-node encryption on the domain.
       *
       * Required if you enable fine-grained access control in
       * [AdvancedSecurityOptionsInput](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-advancedsecurityoptionsinput.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-nodetonodeencryptionoptions.html#cfn-opensearchservice-domain-nodetonodeencryptionoptions-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NodeToNodeEncryptionOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty):
          NodeToNodeEncryptionOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NodeToNodeEncryptionOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeToNodeEncryptionOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.NodeToNodeEncryptionOptionsProperty
    }
  }

  /**
   * Off-peak window settings for the domain.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
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
  public interface OffPeakWindowOptionsProperty {
    /**
     * Specifies whether off-peak window settings are enabled for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-offpeakwindowoptions.html#cfn-opensearchservice-domain-offpeakwindowoptions-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * Off-peak window settings for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-offpeakwindowoptions.html#cfn-opensearchservice-domain-offpeakwindowoptions-offpeakwindow)
     */
    public fun offPeakWindow(): Any? = unwrap(this).getOffPeakWindow()

    /**
     * A builder for [OffPeakWindowOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Specifies whether off-peak window settings are enabled for the domain.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Specifies whether off-peak window settings are enabled for the domain.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param offPeakWindow Off-peak window settings for the domain.
       */
      public fun offPeakWindow(offPeakWindow: IResolvable)

      /**
       * @param offPeakWindow Off-peak window settings for the domain.
       */
      public fun offPeakWindow(offPeakWindow: OffPeakWindowProperty)

      /**
       * @param offPeakWindow Off-peak window settings for the domain.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0816bae19b39183938b8f9bbfbcecebc689836be9c7c945c0fda0ba6d6bb8c40")
      public fun offPeakWindow(offPeakWindow: OffPeakWindowProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowOptionsProperty.builder()

      /**
       * @param enabled Specifies whether off-peak window settings are enabled for the domain.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Specifies whether off-peak window settings are enabled for the domain.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param offPeakWindow Off-peak window settings for the domain.
       */
      override fun offPeakWindow(offPeakWindow: IResolvable) {
        cdkBuilder.offPeakWindow(offPeakWindow.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param offPeakWindow Off-peak window settings for the domain.
       */
      override fun offPeakWindow(offPeakWindow: OffPeakWindowProperty) {
        cdkBuilder.offPeakWindow(offPeakWindow.let(OffPeakWindowProperty.Companion::unwrap))
      }

      /**
       * @param offPeakWindow Off-peak window settings for the domain.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0816bae19b39183938b8f9bbfbcecebc689836be9c7c945c0fda0ba6d6bb8c40")
      override fun offPeakWindow(offPeakWindow: OffPeakWindowProperty.Builder.() -> Unit): Unit =
          offPeakWindow(OffPeakWindowProperty(offPeakWindow))

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowOptionsProperty,
    ) : CdkObject(cdkObject),
        OffPeakWindowOptionsProperty {
      /**
       * Specifies whether off-peak window settings are enabled for the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-offpeakwindowoptions.html#cfn-opensearchservice-domain-offpeakwindowoptions-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * Off-peak window settings for the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-offpeakwindowoptions.html#cfn-opensearchservice-domain-offpeakwindowoptions-offpeakwindow)
       */
      override fun offPeakWindow(): Any? = unwrap(this).getOffPeakWindow()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OffPeakWindowOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowOptionsProperty):
          OffPeakWindowOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          OffPeakWindowOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: OffPeakWindowOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowOptionsProperty
    }
  }

  /**
   * A custom 10-hour, low-traffic window during which OpenSearch Service can perform mandatory
   * configuration changes on the domain.
   *
   * These actions can include scheduled service software updates and blue/green Auto-Tune
   * enhancements. OpenSearch Service will schedule these actions during the window that you specify.
   * If you don't specify a window start time, it defaults to 10:00 P.M. local time.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
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
  public interface OffPeakWindowProperty {
    /**
     * The desired start time for an off-peak maintenance window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-offpeakwindow.html#cfn-opensearchservice-domain-offpeakwindow-windowstarttime)
     */
    public fun windowStartTime(): Any? = unwrap(this).getWindowStartTime()

    /**
     * A builder for [OffPeakWindowProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param windowStartTime The desired start time for an off-peak maintenance window.
       */
      public fun windowStartTime(windowStartTime: IResolvable)

      /**
       * @param windowStartTime The desired start time for an off-peak maintenance window.
       */
      public fun windowStartTime(windowStartTime: WindowStartTimeProperty)

      /**
       * @param windowStartTime The desired start time for an off-peak maintenance window.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc5262ef36470bc541159ef7d9a759a914ee2768b27431e784d1afc15afb33f3")
      public fun windowStartTime(windowStartTime: WindowStartTimeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowProperty.builder()

      /**
       * @param windowStartTime The desired start time for an off-peak maintenance window.
       */
      override fun windowStartTime(windowStartTime: IResolvable) {
        cdkBuilder.windowStartTime(windowStartTime.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param windowStartTime The desired start time for an off-peak maintenance window.
       */
      override fun windowStartTime(windowStartTime: WindowStartTimeProperty) {
        cdkBuilder.windowStartTime(windowStartTime.let(WindowStartTimeProperty.Companion::unwrap))
      }

      /**
       * @param windowStartTime The desired start time for an off-peak maintenance window.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc5262ef36470bc541159ef7d9a759a914ee2768b27431e784d1afc15afb33f3")
      override fun windowStartTime(windowStartTime: WindowStartTimeProperty.Builder.() -> Unit):
          Unit = windowStartTime(WindowStartTimeProperty(windowStartTime))

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowProperty,
    ) : CdkObject(cdkObject),
        OffPeakWindowProperty {
      /**
       * The desired start time for an off-peak maintenance window.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-offpeakwindow.html#cfn-opensearchservice-domain-offpeakwindow-windowstarttime)
       */
      override fun windowStartTime(): Any? = unwrap(this).getWindowStartTime()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OffPeakWindowProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowProperty):
          OffPeakWindowProperty = CdkObjectWrappers.wrap(cdkObject) as? OffPeakWindowProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OffPeakWindowProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.OffPeakWindowProperty
    }
  }

  /**
   * Container for information about the SAML configuration for OpenSearch Dashboards.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
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
  public interface SAMLOptionsProperty {
    /**
     * True to enable SAML authentication for a domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html#cfn-opensearchservice-domain-samloptions-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The SAML Identity Provider's information.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html#cfn-opensearchservice-domain-samloptions-idp)
     */
    public fun idp(): Any? = unwrap(this).getIdp()

    /**
     * The backend role that the SAML master user is mapped to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html#cfn-opensearchservice-domain-samloptions-masterbackendrole)
     */
    public fun masterBackendRole(): String? = unwrap(this).getMasterBackendRole()

    /**
     * The SAML master user name, which is stored in the domain's internal user database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html#cfn-opensearchservice-domain-samloptions-masterusername)
     */
    public fun masterUserName(): String? = unwrap(this).getMasterUserName()

    /**
     * Element of the SAML assertion to use for backend roles.
     *
     * Default is `roles` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html#cfn-opensearchservice-domain-samloptions-roleskey)
     */
    public fun rolesKey(): String? = unwrap(this).getRolesKey()

    /**
     * The duration, in minutes, after which a user session becomes inactive.
     *
     * Acceptable values are between 1 and 1440, and the default value is 60.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html#cfn-opensearchservice-domain-samloptions-sessiontimeoutminutes)
     */
    public fun sessionTimeoutMinutes(): Number? = unwrap(this).getSessionTimeoutMinutes()

    /**
     * Element of the SAML assertion to use for the user name.
     *
     * Default is `NameID` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html#cfn-opensearchservice-domain-samloptions-subjectkey)
     */
    public fun subjectKey(): String? = unwrap(this).getSubjectKey()

    /**
     * A builder for [SAMLOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled True to enable SAML authentication for a domain.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled True to enable SAML authentication for a domain.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param idp The SAML Identity Provider's information.
       */
      public fun idp(idp: IResolvable)

      /**
       * @param idp The SAML Identity Provider's information.
       */
      public fun idp(idp: IdpProperty)

      /**
       * @param idp The SAML Identity Provider's information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98f2e7eab165afbb620ad885b13a80a025703d8a9b6df570b0ab2364e8364860")
      public fun idp(idp: IdpProperty.Builder.() -> Unit)

      /**
       * @param masterBackendRole The backend role that the SAML master user is mapped to.
       */
      public fun masterBackendRole(masterBackendRole: String)

      /**
       * @param masterUserName The SAML master user name, which is stored in the domain's internal
       * user database.
       */
      public fun masterUserName(masterUserName: String)

      /**
       * @param rolesKey Element of the SAML assertion to use for backend roles.
       * Default is `roles` .
       */
      public fun rolesKey(rolesKey: String)

      /**
       * @param sessionTimeoutMinutes The duration, in minutes, after which a user session becomes
       * inactive.
       * Acceptable values are between 1 and 1440, and the default value is 60.
       */
      public fun sessionTimeoutMinutes(sessionTimeoutMinutes: Number)

      /**
       * @param subjectKey Element of the SAML assertion to use for the user name.
       * Default is `NameID` .
       */
      public fun subjectKey(subjectKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SAMLOptionsProperty.Builder =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SAMLOptionsProperty.builder()

      /**
       * @param enabled True to enable SAML authentication for a domain.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled True to enable SAML authentication for a domain.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param idp The SAML Identity Provider's information.
       */
      override fun idp(idp: IResolvable) {
        cdkBuilder.idp(idp.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param idp The SAML Identity Provider's information.
       */
      override fun idp(idp: IdpProperty) {
        cdkBuilder.idp(idp.let(IdpProperty.Companion::unwrap))
      }

      /**
       * @param idp The SAML Identity Provider's information.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98f2e7eab165afbb620ad885b13a80a025703d8a9b6df570b0ab2364e8364860")
      override fun idp(idp: IdpProperty.Builder.() -> Unit): Unit = idp(IdpProperty(idp))

      /**
       * @param masterBackendRole The backend role that the SAML master user is mapped to.
       */
      override fun masterBackendRole(masterBackendRole: String) {
        cdkBuilder.masterBackendRole(masterBackendRole)
      }

      /**
       * @param masterUserName The SAML master user name, which is stored in the domain's internal
       * user database.
       */
      override fun masterUserName(masterUserName: String) {
        cdkBuilder.masterUserName(masterUserName)
      }

      /**
       * @param rolesKey Element of the SAML assertion to use for backend roles.
       * Default is `roles` .
       */
      override fun rolesKey(rolesKey: String) {
        cdkBuilder.rolesKey(rolesKey)
      }

      /**
       * @param sessionTimeoutMinutes The duration, in minutes, after which a user session becomes
       * inactive.
       * Acceptable values are between 1 and 1440, and the default value is 60.
       */
      override fun sessionTimeoutMinutes(sessionTimeoutMinutes: Number) {
        cdkBuilder.sessionTimeoutMinutes(sessionTimeoutMinutes)
      }

      /**
       * @param subjectKey Element of the SAML assertion to use for the user name.
       * Default is `NameID` .
       */
      override fun subjectKey(subjectKey: String) {
        cdkBuilder.subjectKey(subjectKey)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SAMLOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.SAMLOptionsProperty,
    ) : CdkObject(cdkObject),
        SAMLOptionsProperty {
      /**
       * True to enable SAML authentication for a domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html#cfn-opensearchservice-domain-samloptions-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The SAML Identity Provider's information.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html#cfn-opensearchservice-domain-samloptions-idp)
       */
      override fun idp(): Any? = unwrap(this).getIdp()

      /**
       * The backend role that the SAML master user is mapped to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html#cfn-opensearchservice-domain-samloptions-masterbackendrole)
       */
      override fun masterBackendRole(): String? = unwrap(this).getMasterBackendRole()

      /**
       * The SAML master user name, which is stored in the domain's internal user database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html#cfn-opensearchservice-domain-samloptions-masterusername)
       */
      override fun masterUserName(): String? = unwrap(this).getMasterUserName()

      /**
       * Element of the SAML assertion to use for backend roles.
       *
       * Default is `roles` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html#cfn-opensearchservice-domain-samloptions-roleskey)
       */
      override fun rolesKey(): String? = unwrap(this).getRolesKey()

      /**
       * The duration, in minutes, after which a user session becomes inactive.
       *
       * Acceptable values are between 1 and 1440, and the default value is 60.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html#cfn-opensearchservice-domain-samloptions-sessiontimeoutminutes)
       */
      override fun sessionTimeoutMinutes(): Number? = unwrap(this).getSessionTimeoutMinutes()

      /**
       * Element of the SAML assertion to use for the user name.
       *
       * Default is `NameID` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-samloptions.html#cfn-opensearchservice-domain-samloptions-subjectkey)
       */
      override fun subjectKey(): String? = unwrap(this).getSubjectKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SAMLOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.SAMLOptionsProperty):
          SAMLOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? SAMLOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAMLOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SAMLOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SAMLOptionsProperty
    }
  }

  /**
   * The current status of the service software for an Amazon OpenSearch Service domain.
   *
   * For more information, see [Service software updates in Amazon OpenSearch
   * Service](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/service-software.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
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
  public interface ServiceSoftwareOptionsProperty {
    /**
     * The timestamp, in Epoch time, until which you can manually request a service software update.
     *
     * After this date, we automatically update your service software.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-automatedupdatedate)
     */
    public fun automatedUpdateDate(): String? = unwrap(this).getAutomatedUpdateDate()

    /**
     * True if you're able to cancel your service software version update.
     *
     * False if you can't cancel your service software update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-cancellable)
     */
    public fun cancellable(): Any? = unwrap(this).getCancellable()

    /**
     * The current service software version present on the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-currentversion)
     */
    public fun currentVersion(): String? = unwrap(this).getCurrentVersion()

    /**
     * A description of the service software update status.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The new service software version, if one is available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-newversion)
     */
    public fun newVersion(): String? = unwrap(this).getNewVersion()

    /**
     * True if a service software is never automatically updated.
     *
     * False if a service software is automatically updated after the automated update date.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-optionaldeployment)
     */
    public fun optionalDeployment(): Any? = unwrap(this).getOptionalDeployment()

    /**
     * True if you're able to update your service software version.
     *
     * False if you can't update your service software version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-updateavailable)
     */
    public fun updateAvailable(): Any? = unwrap(this).getUpdateAvailable()

    /**
     * The status of your service software update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-updatestatus)
     */
    public fun updateStatus(): String? = unwrap(this).getUpdateStatus()

    /**
     * A builder for [ServiceSoftwareOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param automatedUpdateDate The timestamp, in Epoch time, until which you can manually
       * request a service software update.
       * After this date, we automatically update your service software.
       */
      public fun automatedUpdateDate(automatedUpdateDate: String)

      /**
       * @param cancellable True if you're able to cancel your service software version update.
       * False if you can't cancel your service software update.
       */
      public fun cancellable(cancellable: Boolean)

      /**
       * @param cancellable True if you're able to cancel your service software version update.
       * False if you can't cancel your service software update.
       */
      public fun cancellable(cancellable: IResolvable)

      /**
       * @param currentVersion The current service software version present on the domain.
       */
      public fun currentVersion(currentVersion: String)

      /**
       * @param description A description of the service software update status.
       */
      public fun description(description: String)

      /**
       * @param newVersion The new service software version, if one is available.
       */
      public fun newVersion(newVersion: String)

      /**
       * @param optionalDeployment True if a service software is never automatically updated.
       * False if a service software is automatically updated after the automated update date.
       */
      public fun optionalDeployment(optionalDeployment: Boolean)

      /**
       * @param optionalDeployment True if a service software is never automatically updated.
       * False if a service software is automatically updated after the automated update date.
       */
      public fun optionalDeployment(optionalDeployment: IResolvable)

      /**
       * @param updateAvailable True if you're able to update your service software version.
       * False if you can't update your service software version.
       */
      public fun updateAvailable(updateAvailable: Boolean)

      /**
       * @param updateAvailable True if you're able to update your service software version.
       * False if you can't update your service software version.
       */
      public fun updateAvailable(updateAvailable: IResolvable)

      /**
       * @param updateStatus The status of your service software update.
       */
      public fun updateStatus(updateStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ServiceSoftwareOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ServiceSoftwareOptionsProperty.builder()

      /**
       * @param automatedUpdateDate The timestamp, in Epoch time, until which you can manually
       * request a service software update.
       * After this date, we automatically update your service software.
       */
      override fun automatedUpdateDate(automatedUpdateDate: String) {
        cdkBuilder.automatedUpdateDate(automatedUpdateDate)
      }

      /**
       * @param cancellable True if you're able to cancel your service software version update.
       * False if you can't cancel your service software update.
       */
      override fun cancellable(cancellable: Boolean) {
        cdkBuilder.cancellable(cancellable)
      }

      /**
       * @param cancellable True if you're able to cancel your service software version update.
       * False if you can't cancel your service software update.
       */
      override fun cancellable(cancellable: IResolvable) {
        cdkBuilder.cancellable(cancellable.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param currentVersion The current service software version present on the domain.
       */
      override fun currentVersion(currentVersion: String) {
        cdkBuilder.currentVersion(currentVersion)
      }

      /**
       * @param description A description of the service software update status.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param newVersion The new service software version, if one is available.
       */
      override fun newVersion(newVersion: String) {
        cdkBuilder.newVersion(newVersion)
      }

      /**
       * @param optionalDeployment True if a service software is never automatically updated.
       * False if a service software is automatically updated after the automated update date.
       */
      override fun optionalDeployment(optionalDeployment: Boolean) {
        cdkBuilder.optionalDeployment(optionalDeployment)
      }

      /**
       * @param optionalDeployment True if a service software is never automatically updated.
       * False if a service software is automatically updated after the automated update date.
       */
      override fun optionalDeployment(optionalDeployment: IResolvable) {
        cdkBuilder.optionalDeployment(optionalDeployment.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param updateAvailable True if you're able to update your service software version.
       * False if you can't update your service software version.
       */
      override fun updateAvailable(updateAvailable: Boolean) {
        cdkBuilder.updateAvailable(updateAvailable)
      }

      /**
       * @param updateAvailable True if you're able to update your service software version.
       * False if you can't update your service software version.
       */
      override fun updateAvailable(updateAvailable: IResolvable) {
        cdkBuilder.updateAvailable(updateAvailable.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param updateStatus The status of your service software update.
       */
      override fun updateStatus(updateStatus: String) {
        cdkBuilder.updateStatus(updateStatus)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ServiceSoftwareOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.ServiceSoftwareOptionsProperty,
    ) : CdkObject(cdkObject),
        ServiceSoftwareOptionsProperty {
      /**
       * The timestamp, in Epoch time, until which you can manually request a service software
       * update.
       *
       * After this date, we automatically update your service software.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-automatedupdatedate)
       */
      override fun automatedUpdateDate(): String? = unwrap(this).getAutomatedUpdateDate()

      /**
       * True if you're able to cancel your service software version update.
       *
       * False if you can't cancel your service software update.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-cancellable)
       */
      override fun cancellable(): Any? = unwrap(this).getCancellable()

      /**
       * The current service software version present on the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-currentversion)
       */
      override fun currentVersion(): String? = unwrap(this).getCurrentVersion()

      /**
       * A description of the service software update status.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The new service software version, if one is available.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-newversion)
       */
      override fun newVersion(): String? = unwrap(this).getNewVersion()

      /**
       * True if a service software is never automatically updated.
       *
       * False if a service software is automatically updated after the automated update date.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-optionaldeployment)
       */
      override fun optionalDeployment(): Any? = unwrap(this).getOptionalDeployment()

      /**
       * True if you're able to update your service software version.
       *
       * False if you can't update your service software version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-updateavailable)
       */
      override fun updateAvailable(): Any? = unwrap(this).getUpdateAvailable()

      /**
       * The status of your service software update.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-servicesoftwareoptions.html#cfn-opensearchservice-domain-servicesoftwareoptions-updatestatus)
       */
      override fun updateStatus(): String? = unwrap(this).getUpdateStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServiceSoftwareOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.ServiceSoftwareOptionsProperty):
          ServiceSoftwareOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServiceSoftwareOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceSoftwareOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ServiceSoftwareOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ServiceSoftwareOptionsProperty
    }
  }

  /**
   * *DEPRECATED* .
   *
   * This setting is only relevant to domains running legacy Elasticsearch OSS versions earlier than
   * 5.3. It does not apply to OpenSearch domains.
   *
   * The automated snapshot configuration for the OpenSearch Service domain indexes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * SnapshotOptionsProperty snapshotOptionsProperty = SnapshotOptionsProperty.builder()
   * .automatedSnapshotStartHour(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-snapshotoptions.html)
   */
  public interface SnapshotOptionsProperty {
    /**
     * The hour in UTC during which the service takes an automated daily snapshot of the indexes in
     * the OpenSearch Service domain.
     *
     * For example, if you specify 0, OpenSearch Service takes an automated snapshot everyday
     * between midnight and 1 am. You can specify a value between 0 and 23.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-snapshotoptions.html#cfn-opensearchservice-domain-snapshotoptions-automatedsnapshotstarthour)
     */
    public fun automatedSnapshotStartHour(): Number? = unwrap(this).getAutomatedSnapshotStartHour()

    /**
     * A builder for [SnapshotOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param automatedSnapshotStartHour The hour in UTC during which the service takes an
       * automated daily snapshot of the indexes in the OpenSearch Service domain.
       * For example, if you specify 0, OpenSearch Service takes an automated snapshot everyday
       * between midnight and 1 am. You can specify a value between 0 and 23.
       */
      public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty.builder()

      /**
       * @param automatedSnapshotStartHour The hour in UTC during which the service takes an
       * automated daily snapshot of the indexes in the OpenSearch Service domain.
       * For example, if you specify 0, OpenSearch Service takes an automated snapshot everyday
       * between midnight and 1 am. You can specify a value between 0 and 23.
       */
      override fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
        cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty,
    ) : CdkObject(cdkObject),
        SnapshotOptionsProperty {
      /**
       * The hour in UTC during which the service takes an automated daily snapshot of the indexes
       * in the OpenSearch Service domain.
       *
       * For example, if you specify 0, OpenSearch Service takes an automated snapshot everyday
       * between midnight and 1 am. You can specify a value between 0 and 23.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-snapshotoptions.html#cfn-opensearchservice-domain-snapshotoptions-automatedsnapshotstarthour)
       */
      override fun automatedSnapshotStartHour(): Number? =
          unwrap(this).getAutomatedSnapshotStartHour()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SnapshotOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty):
          SnapshotOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? SnapshotOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnapshotOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SnapshotOptionsProperty
    }
  }

  /**
   * Options for configuring service software updates for a domain.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * SoftwareUpdateOptionsProperty softwareUpdateOptionsProperty =
   * SoftwareUpdateOptionsProperty.builder()
   * .autoSoftwareUpdateEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-softwareupdateoptions.html)
   */
  public interface SoftwareUpdateOptionsProperty {
    /**
     * Specifies whether automatic service software updates are enabled for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-softwareupdateoptions.html#cfn-opensearchservice-domain-softwareupdateoptions-autosoftwareupdateenabled)
     */
    public fun autoSoftwareUpdateEnabled(): Any? = unwrap(this).getAutoSoftwareUpdateEnabled()

    /**
     * A builder for [SoftwareUpdateOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoSoftwareUpdateEnabled Specifies whether automatic service software updates are
       * enabled for the domain.
       */
      public fun autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled: Boolean)

      /**
       * @param autoSoftwareUpdateEnabled Specifies whether automatic service software updates are
       * enabled for the domain.
       */
      public fun autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SoftwareUpdateOptionsProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SoftwareUpdateOptionsProperty.builder()

      /**
       * @param autoSoftwareUpdateEnabled Specifies whether automatic service software updates are
       * enabled for the domain.
       */
      override fun autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled: Boolean) {
        cdkBuilder.autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled)
      }

      /**
       * @param autoSoftwareUpdateEnabled Specifies whether automatic service software updates are
       * enabled for the domain.
       */
      override fun autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled: IResolvable) {
        cdkBuilder.autoSoftwareUpdateEnabled(autoSoftwareUpdateEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SoftwareUpdateOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.SoftwareUpdateOptionsProperty,
    ) : CdkObject(cdkObject),
        SoftwareUpdateOptionsProperty {
      /**
       * Specifies whether automatic service software updates are enabled for the domain.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-softwareupdateoptions.html#cfn-opensearchservice-domain-softwareupdateoptions-autosoftwareupdateenabled)
       */
      override fun autoSoftwareUpdateEnabled(): Any? = unwrap(this).getAutoSoftwareUpdateEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SoftwareUpdateOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.SoftwareUpdateOptionsProperty):
          SoftwareUpdateOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SoftwareUpdateOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SoftwareUpdateOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SoftwareUpdateOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.SoftwareUpdateOptionsProperty
    }
  }

  /**
   * The virtual private cloud (VPC) configuration for the OpenSearch Service domain.
   *
   * For more information, see [Launching your Amazon OpenSearch Service domains using a
   * VPC](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html) in the *Amazon
   * OpenSearch Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * VPCOptionsProperty vPCOptionsProperty = VPCOptionsProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-vpcoptions.html)
   */
  public interface VPCOptionsProperty {
    /**
     * The list of security group IDs that are associated with the VPC endpoints for the domain.
     *
     * If you don't provide a security group ID, OpenSearch Service uses the default security group
     * for the VPC. To learn more, see [Security groups for your
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
     * VPC User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-vpcoptions.html#cfn-opensearchservice-domain-vpcoptions-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * Provide one subnet ID for each Availability Zone that your domain uses.
     *
     * For example, you must specify three subnet IDs for a three-AZ domain. To learn more, see
     * [VPCs and subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the
     * *Amazon VPC User Guide* .
     *
     * If you specify more than one subnet, you must also configure `ZoneAwarenessEnabled` and
     * `ZoneAwarenessConfig` within
     * [ClusterConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html)
     * , otherwise you'll see the error "You must specify exactly one subnet" during template creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-vpcoptions.html#cfn-opensearchservice-domain-vpcoptions-subnetids)
     */
    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * A builder for [VPCOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The list of security group IDs that are associated with the VPC
       * endpoints for the domain.
       * If you don't provide a security group ID, OpenSearch Service uses the default security
       * group for the VPC. To learn more, see [Security groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
       * VPC User Guide* .
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The list of security group IDs that are associated with the VPC
       * endpoints for the domain.
       * If you don't provide a security group ID, OpenSearch Service uses the default security
       * group for the VPC. To learn more, see [Security groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
       * VPC User Guide* .
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds Provide one subnet ID for each Availability Zone that your domain uses.
       * For example, you must specify three subnet IDs for a three-AZ domain. To learn more, see
       * [VPCs and subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the
       * *Amazon VPC User Guide* .
       *
       * If you specify more than one subnet, you must also configure `ZoneAwarenessEnabled` and
       * `ZoneAwarenessConfig` within
       * [ClusterConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html)
       * , otherwise you'll see the error "You must specify exactly one subnet" during template
       * creation.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds Provide one subnet ID for each Availability Zone that your domain uses.
       * For example, you must specify three subnet IDs for a three-AZ domain. To learn more, see
       * [VPCs and subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the
       * *Amazon VPC User Guide* .
       *
       * If you specify more than one subnet, you must also configure `ZoneAwarenessEnabled` and
       * `ZoneAwarenessConfig` within
       * [ClusterConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html)
       * , otherwise you'll see the error "You must specify exactly one subnet" during template
       * creation.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty.Builder =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty.builder()

      /**
       * @param securityGroupIds The list of security group IDs that are associated with the VPC
       * endpoints for the domain.
       * If you don't provide a security group ID, OpenSearch Service uses the default security
       * group for the VPC. To learn more, see [Security groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
       * VPC User Guide* .
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The list of security group IDs that are associated with the VPC
       * endpoints for the domain.
       * If you don't provide a security group ID, OpenSearch Service uses the default security
       * group for the VPC. To learn more, see [Security groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
       * VPC User Guide* .
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds Provide one subnet ID for each Availability Zone that your domain uses.
       * For example, you must specify three subnet IDs for a three-AZ domain. To learn more, see
       * [VPCs and subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the
       * *Amazon VPC User Guide* .
       *
       * If you specify more than one subnet, you must also configure `ZoneAwarenessEnabled` and
       * `ZoneAwarenessConfig` within
       * [ClusterConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html)
       * , otherwise you'll see the error "You must specify exactly one subnet" during template
       * creation.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds Provide one subnet ID for each Availability Zone that your domain uses.
       * For example, you must specify three subnet IDs for a three-AZ domain. To learn more, see
       * [VPCs and subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the
       * *Amazon VPC User Guide* .
       *
       * If you specify more than one subnet, you must also configure `ZoneAwarenessEnabled` and
       * `ZoneAwarenessConfig` within
       * [ClusterConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html)
       * , otherwise you'll see the error "You must specify exactly one subnet" during template
       * creation.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty,
    ) : CdkObject(cdkObject),
        VPCOptionsProperty {
      /**
       * The list of security group IDs that are associated with the VPC endpoints for the domain.
       *
       * If you don't provide a security group ID, OpenSearch Service uses the default security
       * group for the VPC. To learn more, see [Security groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) in the *Amazon
       * VPC User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-vpcoptions.html#cfn-opensearchservice-domain-vpcoptions-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * Provide one subnet ID for each Availability Zone that your domain uses.
       *
       * For example, you must specify three subnet IDs for a three-AZ domain. To learn more, see
       * [VPCs and subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in the
       * *Amazon VPC User Guide* .
       *
       * If you specify more than one subnet, you must also configure `ZoneAwarenessEnabled` and
       * `ZoneAwarenessConfig` within
       * [ClusterConfig](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-clusterconfig.html)
       * , otherwise you'll see the error "You must specify exactly one subnet" during template
       * creation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-vpcoptions.html#cfn-opensearchservice-domain-vpcoptions-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VPCOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty):
          VPCOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? VPCOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VPCOptionsProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.VPCOptionsProperty
    }
  }

  /**
   * A custom start time for the off-peak window, in Coordinated Universal Time (UTC).
   *
   * The window length will always be 10 hours, so you can't specify an end time. For example, if
   * you specify 11:00 P.M. UTC as a start time, the end time will automatically be set to 9:00 A.M.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * WindowStartTimeProperty windowStartTimeProperty = WindowStartTimeProperty.builder()
   * .hours(123)
   * .minutes(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-windowstarttime.html)
   */
  public interface WindowStartTimeProperty {
    /**
     * The start hour of the window in Coordinated Universal Time (UTC), using 24-hour time.
     *
     * For example, 17 refers to 5:00 P.M. UTC. The minimum value is 0 and the maximum value is 23.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-windowstarttime.html#cfn-opensearchservice-domain-windowstarttime-hours)
     */
    public fun hours(): Number

    /**
     * The start minute of the window, in UTC.
     *
     * The minimum value is 0 and the maximum value is 59.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-windowstarttime.html#cfn-opensearchservice-domain-windowstarttime-minutes)
     */
    public fun minutes(): Number

    /**
     * A builder for [WindowStartTimeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hours The start hour of the window in Coordinated Universal Time (UTC), using
       * 24-hour time. 
       * For example, 17 refers to 5:00 P.M. UTC. The minimum value is 0 and the maximum value is
       * 23.
       */
      public fun hours(hours: Number)

      /**
       * @param minutes The start minute of the window, in UTC. 
       * The minimum value is 0 and the maximum value is 59.
       */
      public fun minutes(minutes: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.WindowStartTimeProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.WindowStartTimeProperty.builder()

      /**
       * @param hours The start hour of the window in Coordinated Universal Time (UTC), using
       * 24-hour time. 
       * For example, 17 refers to 5:00 P.M. UTC. The minimum value is 0 and the maximum value is
       * 23.
       */
      override fun hours(hours: Number) {
        cdkBuilder.hours(hours)
      }

      /**
       * @param minutes The start minute of the window, in UTC. 
       * The minimum value is 0 and the maximum value is 59.
       */
      override fun minutes(minutes: Number) {
        cdkBuilder.minutes(minutes)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.WindowStartTimeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.WindowStartTimeProperty,
    ) : CdkObject(cdkObject),
        WindowStartTimeProperty {
      /**
       * The start hour of the window in Coordinated Universal Time (UTC), using 24-hour time.
       *
       * For example, 17 refers to 5:00 P.M. UTC. The minimum value is 0 and the maximum value is
       * 23.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-windowstarttime.html#cfn-opensearchservice-domain-windowstarttime-hours)
       */
      override fun hours(): Number = unwrap(this).getHours()

      /**
       * The start minute of the window, in UTC.
       *
       * The minimum value is 0 and the maximum value is 59.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-windowstarttime.html#cfn-opensearchservice-domain-windowstarttime-minutes)
       */
      override fun minutes(): Number = unwrap(this).getMinutes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WindowStartTimeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.WindowStartTimeProperty):
          WindowStartTimeProperty = CdkObjectWrappers.wrap(cdkObject) as? WindowStartTimeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: WindowStartTimeProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.WindowStartTimeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.WindowStartTimeProperty
    }
  }

  /**
   * Specifies zone awareness configuration options.
   *
   * Only use if `ZoneAwarenessEnabled` is `true` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.opensearchservice.*;
   * ZoneAwarenessConfigProperty zoneAwarenessConfigProperty = ZoneAwarenessConfigProperty.builder()
   * .availabilityZoneCount(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-zoneawarenessconfig.html)
   */
  public interface ZoneAwarenessConfigProperty {
    /**
     * If you enabled multiple Availability Zones (AZs), the number of AZs that you want the domain
     * to use.
     *
     * Valid values are `2` and `3` . Default is 2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-zoneawarenessconfig.html#cfn-opensearchservice-domain-zoneawarenessconfig-availabilityzonecount)
     */
    public fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()

    /**
     * A builder for [ZoneAwarenessConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZoneCount If you enabled multiple Availability Zones (AZs), the number
       * of AZs that you want the domain to use.
       * Valid values are `2` and `3` . Default is 2.
       */
      public fun availabilityZoneCount(availabilityZoneCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty.Builder
          =
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty.builder()

      /**
       * @param availabilityZoneCount If you enabled multiple Availability Zones (AZs), the number
       * of AZs that you want the domain to use.
       * Valid values are `2` and `3` . Default is 2.
       */
      override fun availabilityZoneCount(availabilityZoneCount: Number) {
        cdkBuilder.availabilityZoneCount(availabilityZoneCount)
      }

      public fun build():
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty,
    ) : CdkObject(cdkObject),
        ZoneAwarenessConfigProperty {
      /**
       * If you enabled multiple Availability Zones (AZs), the number of AZs that you want the
       * domain to use.
       *
       * Valid values are `2` and `3` . Default is 2.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-zoneawarenessconfig.html#cfn-opensearchservice-domain-zoneawarenessconfig-availabilityzonecount)
       */
      override fun availabilityZoneCount(): Number? = unwrap(this).getAvailabilityZoneCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ZoneAwarenessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty):
          ZoneAwarenessConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ZoneAwarenessConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ZoneAwarenessConfigProperty):
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opensearchservice.CfnDomain.ZoneAwarenessConfigProperty
    }
  }
}
