@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * (deprecated) Properties for an AWS Elasticsearch Domain.
 *
 * Example:
 *
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
public interface DomainProps {
  /**
   * (deprecated) Domain Access policies.
   *
   * Default: - No access policies.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun accessPolicies(): List<PolicyStatement> =
      unwrap(this).getAccessPolicies()?.map(PolicyStatement::wrap) ?: emptyList()

  /**
   * (deprecated) Additional options to specify for the Amazon ES domain.
   *
   * Default: - no advanced options are specified
   *
   * [Documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options)
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun advancedOptions(): Map<String, String> = unwrap(this).getAdvancedOptions() ?:
      emptyMap()

  /**
   * (deprecated) The hour in UTC during which the service takes an automated daily snapshot of the
   * indices in the Amazon ES domain.
   *
   * Only applies for Elasticsearch
   * versions below 5.3.
   *
   * Default: - Hourly automated snapshots not used
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun automatedSnapshotStartHour(): Number? = unwrap(this).getAutomatedSnapshotStartHour()

  /**
   * (deprecated) The cluster capacity configuration for the Amazon ES domain.
   *
   * Default: - 1 r5.large.elasticsearch data node; no dedicated master nodes.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun capacity(): CapacityConfig? = unwrap(this).getCapacity()?.let(CapacityConfig::wrap)

  /**
   * (deprecated) Configures Amazon ES to use Amazon Cognito authentication for Kibana.
   *
   * Default: - Cognito not used for authentication to Kibana.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun cognitoKibanaAuth(): CognitoOptions? =
      unwrap(this).getCognitoKibanaAuth()?.let(CognitoOptions::wrap)

  /**
   * (deprecated) To configure a custom domain configure these options.
   *
   * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
   * the certificate
   *
   * Default: - no custom domain endpoint will be configured
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun customEndpoint(): CustomEndpointOptions? =
      unwrap(this).getCustomEndpoint()?.let(CustomEndpointOptions::wrap)

  /**
   * (deprecated) Enforces a particular physical domain name.
   *
   * Default: - A name will be auto-generated.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * (deprecated) The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
   * attached to data nodes in the Amazon ES domain.
   *
   * For more information, see
   * [Configuring EBS-based Storage]
   * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
   * in the Amazon Elasticsearch Service Developer Guide.
   *
   * Default: - 10 GiB General Purpose (SSD) volumes per node.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun ebs(): EbsOptions? = unwrap(this).getEbs()?.let(EbsOptions::wrap)

  /**
   * (deprecated) To upgrade an Amazon ES domain to a new version of Elasticsearch rather than
   * replacing the entire domain resource, use the EnableVersionUpgrade update policy.
   *
   * Default: - false
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeelasticsearchdomain)
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun enableVersionUpgrade(): Boolean? = unwrap(this).getEnableVersionUpgrade()

  /**
   * (deprecated) Encryption at rest options for the cluster.
   *
   * Default: - No encryption at rest
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun encryptionAtRest(): EncryptionAtRestOptions? =
      unwrap(this).getEncryptionAtRest()?.let(EncryptionAtRestOptions::wrap)

  /**
   * (deprecated) True to require that all traffic to the domain arrive over HTTPS.
   *
   * Default: - false
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun enforceHttps(): Boolean? = unwrap(this).getEnforceHttps()

  /**
   * (deprecated) Specifies options for fine-grained access control.
   *
   * Requires Elasticsearch version 6.7 or later. Enabling fine-grained access control
   * also requires encryption of data at rest and node-to-node encryption, along with
   * enforced HTTPS.
   *
   * Default: - fine-grained access control is disabled
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun fineGrainedAccessControl(): AdvancedSecurityOptions? =
      unwrap(this).getFineGrainedAccessControl()?.let(AdvancedSecurityOptions::wrap)

  /**
   * (deprecated) Configuration log publishing configuration options.
   *
   * Default: - No logs are published
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

  /**
   * (deprecated) Specify true to enable node to node encryption.
   *
   * Requires Elasticsearch version 6.0 or later.
   *
   * Default: - Node to node encryption is not enabled.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun nodeToNodeEncryption(): Boolean? = unwrap(this).getNodeToNodeEncryption()

  /**
   * (deprecated) Policy to apply when the domain is removed from the stack.
   *
   * Default: RemovalPolicy.RETAIN
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  /**
   * (deprecated) The list of security groups that are associated with the VPC endpoints for the
   * domain.
   *
   * Only used if `vpc` is specified.
   *
   * Default: - One new security group is created.
   *
   * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  /**
   * (deprecated) The minimum TLS version required for traffic to the domain.
   *
   * Default: - TLSSecurityPolicy.TLS_1_0
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun tlsSecurityPolicy(): TLSSecurityPolicy? =
      unwrap(this).getTlsSecurityPolicy()?.let(TLSSecurityPolicy::wrap)

  /**
   * (deprecated) Configures the domain so that unsigned basic auth is enabled.
   *
   * If no master user is provided a default master user
   * with username `admin` and a dynamically generated password stored in KMS is created. The
   * password can be retrieved
   * by getting `masterUserPassword` from the domain instance.
   *
   * Setting this to true will also add an access policy that allows unsigned
   * access, enable node to node encryption, encryption at rest. If conflicting
   * settings are encountered (like disabling encryption at rest) enabling this
   * setting will cause a failure.
   *
   * Default: - false
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun useUnsignedBasicAuth(): Boolean? = unwrap(this).getUseUnsignedBasicAuth()

  /**
   * (deprecated) The Elasticsearch version that your domain will leverage.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun version(): ElasticsearchVersion

  /**
   * (deprecated) Place the domain inside this VPC.
   *
   * Default: - Domain is not placed in a VPC.
   *
   * [Documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html)
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * (deprecated) The specific vpc subnets the domain will be placed in.
   *
   * You must provide one subnet for each Availability Zone
   * that your domain uses. For example, you must specify three subnet IDs for a three Availability
   * Zone
   * domain.
   *
   * Only used if `vpc` is specified.
   *
   * Default: - All private subnets.
   *
   * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html)
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun vpcSubnets(): List<SubnetSelection> =
      unwrap(this).getVpcSubnets()?.map(SubnetSelection::wrap) ?: emptyList()

  /**
   * (deprecated) The cluster zone awareness configuration for the Amazon ES domain.
   *
   * Default: - no zone awareness (1 AZ)
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun zoneAwareness(): ZoneAwarenessConfig? =
      unwrap(this).getZoneAwareness()?.let(ZoneAwarenessConfig::wrap)

  /**
   * A builder for [DomainProps]
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * @param accessPolicies Domain Access policies.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun accessPolicies(accessPolicies: List<PolicyStatement>)

    /**
     * @param accessPolicies Domain Access policies.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun accessPolicies(vararg accessPolicies: PolicyStatement)

    /**
     * @param advancedOptions Additional options to specify for the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun advancedOptions(advancedOptions: Map<String, String>)

    /**
     * @param automatedSnapshotStartHour The hour in UTC during which the service takes an automated
     * daily snapshot of the indices in the Amazon ES domain.
     * Only applies for Elasticsearch
     * versions below 5.3.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number)

    /**
     * @param capacity The cluster capacity configuration for the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun capacity(capacity: CapacityConfig)

    /**
     * @param capacity The cluster capacity configuration for the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b109cdbf131e5550be3edc0e2a9f9c5d3b0806ad4a2b12b80d47266879481b93")
    public fun capacity(capacity: CapacityConfig.Builder.() -> Unit)

    /**
     * @param cognitoKibanaAuth Configures Amazon ES to use Amazon Cognito authentication for
     * Kibana.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions)

    /**
     * @param cognitoKibanaAuth Configures Amazon ES to use Amazon Cognito authentication for
     * Kibana.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f13e7dab868f11aff645edf400035e30cf13e128d35cf1f2a6662a18b56c6b05")
    public fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions.Builder.() -> Unit)

    /**
     * @param customEndpoint To configure a custom domain configure these options.
     * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
     * the certificate
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun customEndpoint(customEndpoint: CustomEndpointOptions)

    /**
     * @param customEndpoint To configure a custom domain configure these options.
     * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
     * the certificate
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c50c1635eb80ee23c1e091e711750a47de582b0aac4fa60cc6786e22aae2639")
    public fun customEndpoint(customEndpoint: CustomEndpointOptions.Builder.() -> Unit)

    /**
     * @param domainName Enforces a particular physical domain name.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun domainName(domainName: String)

    /**
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     * attached to data nodes in the Amazon ES domain.
     * For more information, see
     * [Configuring EBS-based Storage]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
     * in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun ebs(ebs: EbsOptions)

    /**
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     * attached to data nodes in the Amazon ES domain.
     * For more information, see
     * [Configuring EBS-based Storage]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
     * in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d97c189489a69fc31417451f8f3508a1b26b53571043e87cbc8245fd61e76ad9")
    public fun ebs(ebs: EbsOptions.Builder.() -> Unit)

    /**
     * @param enableVersionUpgrade To upgrade an Amazon ES domain to a new version of Elasticsearch
     * rather than replacing the entire domain resource, use the EnableVersionUpgrade update policy.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun enableVersionUpgrade(enableVersionUpgrade: Boolean)

    /**
     * @param encryptionAtRest Encryption at rest options for the cluster.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions)

    /**
     * @param encryptionAtRest Encryption at rest options for the cluster.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24b48c9a456533b4cae5ca0aca64321babe6a0fccf60c04c4f7214842d7ca6bf")
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions.Builder.() -> Unit)

    /**
     * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun enforceHttps(enforceHttps: Boolean)

    /**
     * @param fineGrainedAccessControl Specifies options for fine-grained access control.
     * Requires Elasticsearch version 6.7 or later. Enabling fine-grained access control
     * also requires encryption of data at rest and node-to-node encryption, along with
     * enforced HTTPS.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions)

    /**
     * @param fineGrainedAccessControl Specifies options for fine-grained access control.
     * Requires Elasticsearch version 6.7 or later. Enabling fine-grained access control
     * also requires encryption of data at rest and node-to-node encryption, along with
     * enforced HTTPS.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7b6f8887a21f8027f7c6f1fd8b7b8ffdd5f60a87ee502da105c9d57077b3dc8")
    public
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit)

    /**
     * @param logging Configuration log publishing configuration options.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun logging(logging: LoggingOptions)

    /**
     * @param logging Configuration log publishing configuration options.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aba05d229e9246f738f24266f5f3add48200e93225fc0d664a2502ceb2db1738")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    /**
     * @param nodeToNodeEncryption Specify true to enable node to node encryption.
     * Requires Elasticsearch version 6.0 or later.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean)

    /**
     * @param removalPolicy Policy to apply when the domain is removed from the stack.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     * for the domain.
     * Only used if `vpc` is specified.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     * for the domain.
     * Only used if `vpc` is specified.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy)

    /**
     * @param useUnsignedBasicAuth Configures the domain so that unsigned basic auth is enabled.
     * If no master user is provided a default master user
     * with username `admin` and a dynamically generated password stored in KMS is created. The
     * password can be retrieved
     * by getting `masterUserPassword` from the domain instance.
     *
     * Setting this to true will also add an access policy that allows unsigned
     * access, enable node to node encryption, encryption at rest. If conflicting
     * settings are encountered (like disabling encryption at rest) enabling this
     * setting will cause a failure.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean)

    /**
     * @param version The Elasticsearch version that your domain will leverage. 
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun version(version: ElasticsearchVersion)

    /**
     * @param vpc Place the domain inside this VPC.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcSubnets The specific vpc subnets the domain will be placed in.
     * You must provide one subnet for each Availability Zone
     * that your domain uses. For example, you must specify three subnet IDs for a three
     * Availability Zone
     * domain.
     *
     * Only used if `vpc` is specified.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun vpcSubnets(vpcSubnets: List<SubnetSelection>)

    /**
     * @param vpcSubnets The specific vpc subnets the domain will be placed in.
     * You must provide one subnet for each Availability Zone
     * that your domain uses. For example, you must specify three subnet IDs for a three
     * Availability Zone
     * domain.
     *
     * Only used if `vpc` is specified.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun vpcSubnets(vararg vpcSubnets: SubnetSelection)

    /**
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig)

    /**
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6934866c54ce1ccd7109cd9eb1ec07b2163effc425b9437f5591a2879146a443")
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.DomainProps.Builder =
        software.amazon.awscdk.services.elasticsearch.DomainProps.builder()

    /**
     * @param accessPolicies Domain Access policies.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun accessPolicies(accessPolicies: List<PolicyStatement>) {
      cdkBuilder.accessPolicies(accessPolicies.map(PolicyStatement::unwrap))
    }

    /**
     * @param accessPolicies Domain Access policies.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun accessPolicies(vararg accessPolicies: PolicyStatement): Unit =
        accessPolicies(accessPolicies.toList())

    /**
     * @param advancedOptions Additional options to specify for the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun advancedOptions(advancedOptions: Map<String, String>) {
      cdkBuilder.advancedOptions(advancedOptions)
    }

    /**
     * @param automatedSnapshotStartHour The hour in UTC during which the service takes an automated
     * daily snapshot of the indices in the Amazon ES domain.
     * Only applies for Elasticsearch
     * versions below 5.3.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
      cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
    }

    /**
     * @param capacity The cluster capacity configuration for the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun capacity(capacity: CapacityConfig) {
      cdkBuilder.capacity(capacity.let(CapacityConfig::unwrap))
    }

    /**
     * @param capacity The cluster capacity configuration for the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b109cdbf131e5550be3edc0e2a9f9c5d3b0806ad4a2b12b80d47266879481b93")
    override fun capacity(capacity: CapacityConfig.Builder.() -> Unit): Unit =
        capacity(CapacityConfig(capacity))

    /**
     * @param cognitoKibanaAuth Configures Amazon ES to use Amazon Cognito authentication for
     * Kibana.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions) {
      cdkBuilder.cognitoKibanaAuth(cognitoKibanaAuth.let(CognitoOptions::unwrap))
    }

    /**
     * @param cognitoKibanaAuth Configures Amazon ES to use Amazon Cognito authentication for
     * Kibana.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f13e7dab868f11aff645edf400035e30cf13e128d35cf1f2a6662a18b56c6b05")
    override fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions.Builder.() -> Unit): Unit =
        cognitoKibanaAuth(CognitoOptions(cognitoKibanaAuth))

    /**
     * @param customEndpoint To configure a custom domain configure these options.
     * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
     * the certificate
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun customEndpoint(customEndpoint: CustomEndpointOptions) {
      cdkBuilder.customEndpoint(customEndpoint.let(CustomEndpointOptions::unwrap))
    }

    /**
     * @param customEndpoint To configure a custom domain configure these options.
     * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
     * the certificate
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c50c1635eb80ee23c1e091e711750a47de582b0aac4fa60cc6786e22aae2639")
    override fun customEndpoint(customEndpoint: CustomEndpointOptions.Builder.() -> Unit): Unit =
        customEndpoint(CustomEndpointOptions(customEndpoint))

    /**
     * @param domainName Enforces a particular physical domain name.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     * attached to data nodes in the Amazon ES domain.
     * For more information, see
     * [Configuring EBS-based Storage]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
     * in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun ebs(ebs: EbsOptions) {
      cdkBuilder.ebs(ebs.let(EbsOptions::unwrap))
    }

    /**
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     * attached to data nodes in the Amazon ES domain.
     * For more information, see
     * [Configuring EBS-based Storage]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
     * in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d97c189489a69fc31417451f8f3508a1b26b53571043e87cbc8245fd61e76ad9")
    override fun ebs(ebs: EbsOptions.Builder.() -> Unit): Unit = ebs(EbsOptions(ebs))

    /**
     * @param enableVersionUpgrade To upgrade an Amazon ES domain to a new version of Elasticsearch
     * rather than replacing the entire domain resource, use the EnableVersionUpgrade update policy.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun enableVersionUpgrade(enableVersionUpgrade: Boolean) {
      cdkBuilder.enableVersionUpgrade(enableVersionUpgrade)
    }

    /**
     * @param encryptionAtRest Encryption at rest options for the cluster.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions) {
      cdkBuilder.encryptionAtRest(encryptionAtRest.let(EncryptionAtRestOptions::unwrap))
    }

    /**
     * @param encryptionAtRest Encryption at rest options for the cluster.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24b48c9a456533b4cae5ca0aca64321babe6a0fccf60c04c4f7214842d7ca6bf")
    override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions.Builder.() -> Unit):
        Unit = encryptionAtRest(EncryptionAtRestOptions(encryptionAtRest))

    /**
     * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun enforceHttps(enforceHttps: Boolean) {
      cdkBuilder.enforceHttps(enforceHttps)
    }

    /**
     * @param fineGrainedAccessControl Specifies options for fine-grained access control.
     * Requires Elasticsearch version 6.7 or later. Enabling fine-grained access control
     * also requires encryption of data at rest and node-to-node encryption, along with
     * enforced HTTPS.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions) {
      cdkBuilder.fineGrainedAccessControl(fineGrainedAccessControl.let(AdvancedSecurityOptions::unwrap))
    }

    /**
     * @param fineGrainedAccessControl Specifies options for fine-grained access control.
     * Requires Elasticsearch version 6.7 or later. Enabling fine-grained access control
     * also requires encryption of data at rest and node-to-node encryption, along with
     * enforced HTTPS.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7b6f8887a21f8027f7c6f1fd8b7b8ffdd5f60a87ee502da105c9d57077b3dc8")
    override
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit):
        Unit = fineGrainedAccessControl(AdvancedSecurityOptions(fineGrainedAccessControl))

    /**
     * @param logging Configuration log publishing configuration options.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
    }

    /**
     * @param logging Configuration log publishing configuration options.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aba05d229e9246f738f24266f5f3add48200e93225fc0d664a2502ceb2db1738")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

    /**
     * @param nodeToNodeEncryption Specify true to enable node to node encryption.
     * Requires Elasticsearch version 6.0 or later.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean) {
      cdkBuilder.nodeToNodeEncryption(nodeToNodeEncryption)
    }

    /**
     * @param removalPolicy Policy to apply when the domain is removed from the stack.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     * for the domain.
     * Only used if `vpc` is specified.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     * for the domain.
     * Only used if `vpc` is specified.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy) {
      cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy.let(TLSSecurityPolicy::unwrap))
    }

    /**
     * @param useUnsignedBasicAuth Configures the domain so that unsigned basic auth is enabled.
     * If no master user is provided a default master user
     * with username `admin` and a dynamically generated password stored in KMS is created. The
     * password can be retrieved
     * by getting `masterUserPassword` from the domain instance.
     *
     * Setting this to true will also add an access policy that allows unsigned
     * access, enable node to node encryption, encryption at rest. If conflicting
     * settings are encountered (like disabling encryption at rest) enabling this
     * setting will cause a failure.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean) {
      cdkBuilder.useUnsignedBasicAuth(useUnsignedBasicAuth)
    }

    /**
     * @param version The Elasticsearch version that your domain will leverage. 
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun version(version: ElasticsearchVersion) {
      cdkBuilder.version(version.let(ElasticsearchVersion::unwrap))
    }

    /**
     * @param vpc Place the domain inside this VPC.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcSubnets The specific vpc subnets the domain will be placed in.
     * You must provide one subnet for each Availability Zone
     * that your domain uses. For example, you must specify three subnet IDs for a three
     * Availability Zone
     * domain.
     *
     * Only used if `vpc` is specified.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun vpcSubnets(vpcSubnets: List<SubnetSelection>) {
      cdkBuilder.vpcSubnets(vpcSubnets.map(SubnetSelection::unwrap))
    }

    /**
     * @param vpcSubnets The specific vpc subnets the domain will be placed in.
     * You must provide one subnet for each Availability Zone
     * that your domain uses. For example, you must specify three subnet IDs for a three
     * Availability Zone
     * domain.
     *
     * Only used if `vpc` is specified.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun vpcSubnets(vararg vpcSubnets: SubnetSelection): Unit =
        vpcSubnets(vpcSubnets.toList())

    /**
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig) {
      cdkBuilder.zoneAwareness(zoneAwareness.let(ZoneAwarenessConfig::unwrap))
    }

    /**
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6934866c54ce1ccd7109cd9eb1ec07b2163effc425b9437f5591a2879146a443")
    override fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig.Builder.() -> Unit): Unit =
        zoneAwareness(ZoneAwarenessConfig(zoneAwareness))

    public fun build(): software.amazon.awscdk.services.elasticsearch.DomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticsearch.DomainProps,
  ) : CdkObject(cdkObject), DomainProps {
    /**
     * (deprecated) Domain Access policies.
     *
     * Default: - No access policies.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun accessPolicies(): List<PolicyStatement> =
        unwrap(this).getAccessPolicies()?.map(PolicyStatement::wrap) ?: emptyList()

    /**
     * (deprecated) Additional options to specify for the Amazon ES domain.
     *
     * Default: - no advanced options are specified
     *
     * [Documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options)
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun advancedOptions(): Map<String, String> = unwrap(this).getAdvancedOptions() ?:
        emptyMap()

    /**
     * (deprecated) The hour in UTC during which the service takes an automated daily snapshot of
     * the indices in the Amazon ES domain.
     *
     * Only applies for Elasticsearch
     * versions below 5.3.
     *
     * Default: - Hourly automated snapshots not used
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun automatedSnapshotStartHour(): Number? =
        unwrap(this).getAutomatedSnapshotStartHour()

    /**
     * (deprecated) The cluster capacity configuration for the Amazon ES domain.
     *
     * Default: - 1 r5.large.elasticsearch data node; no dedicated master nodes.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun capacity(): CapacityConfig? = unwrap(this).getCapacity()?.let(CapacityConfig::wrap)

    /**
     * (deprecated) Configures Amazon ES to use Amazon Cognito authentication for Kibana.
     *
     * Default: - Cognito not used for authentication to Kibana.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun cognitoKibanaAuth(): CognitoOptions? =
        unwrap(this).getCognitoKibanaAuth()?.let(CognitoOptions::wrap)

    /**
     * (deprecated) To configure a custom domain configure these options.
     *
     * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
     * the certificate
     *
     * Default: - no custom domain endpoint will be configured
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun customEndpoint(): CustomEndpointOptions? =
        unwrap(this).getCustomEndpoint()?.let(CustomEndpointOptions::wrap)

    /**
     * (deprecated) Enforces a particular physical domain name.
     *
     * Default: - A name will be auto-generated.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun domainName(): String? = unwrap(this).getDomainName()

    /**
     * (deprecated) The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     * attached to data nodes in the Amazon ES domain.
     *
     * For more information, see
     * [Configuring EBS-based Storage]
     * (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
     * in the Amazon Elasticsearch Service Developer Guide.
     *
     * Default: - 10 GiB General Purpose (SSD) volumes per node.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun ebs(): EbsOptions? = unwrap(this).getEbs()?.let(EbsOptions::wrap)

    /**
     * (deprecated) To upgrade an Amazon ES domain to a new version of Elasticsearch rather than
     * replacing the entire domain resource, use the EnableVersionUpgrade update policy.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeelasticsearchdomain)
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun enableVersionUpgrade(): Boolean? = unwrap(this).getEnableVersionUpgrade()

    /**
     * (deprecated) Encryption at rest options for the cluster.
     *
     * Default: - No encryption at rest
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun encryptionAtRest(): EncryptionAtRestOptions? =
        unwrap(this).getEncryptionAtRest()?.let(EncryptionAtRestOptions::wrap)

    /**
     * (deprecated) True to require that all traffic to the domain arrive over HTTPS.
     *
     * Default: - false
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun enforceHttps(): Boolean? = unwrap(this).getEnforceHttps()

    /**
     * (deprecated) Specifies options for fine-grained access control.
     *
     * Requires Elasticsearch version 6.7 or later. Enabling fine-grained access control
     * also requires encryption of data at rest and node-to-node encryption, along with
     * enforced HTTPS.
     *
     * Default: - fine-grained access control is disabled
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun fineGrainedAccessControl(): AdvancedSecurityOptions? =
        unwrap(this).getFineGrainedAccessControl()?.let(AdvancedSecurityOptions::wrap)

    /**
     * (deprecated) Configuration log publishing configuration options.
     *
     * Default: - No logs are published
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

    /**
     * (deprecated) Specify true to enable node to node encryption.
     *
     * Requires Elasticsearch version 6.0 or later.
     *
     * Default: - Node to node encryption is not enabled.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun nodeToNodeEncryption(): Boolean? = unwrap(this).getNodeToNodeEncryption()

    /**
     * (deprecated) Policy to apply when the domain is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    /**
     * (deprecated) The list of security groups that are associated with the VPC endpoints for the
     * domain.
     *
     * Only used if `vpc` is specified.
     *
     * Default: - One new security group is created.
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    /**
     * (deprecated) The minimum TLS version required for traffic to the domain.
     *
     * Default: - TLSSecurityPolicy.TLS_1_0
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun tlsSecurityPolicy(): TLSSecurityPolicy? =
        unwrap(this).getTlsSecurityPolicy()?.let(TLSSecurityPolicy::wrap)

    /**
     * (deprecated) Configures the domain so that unsigned basic auth is enabled.
     *
     * If no master user is provided a default master user
     * with username `admin` and a dynamically generated password stored in KMS is created. The
     * password can be retrieved
     * by getting `masterUserPassword` from the domain instance.
     *
     * Setting this to true will also add an access policy that allows unsigned
     * access, enable node to node encryption, encryption at rest. If conflicting
     * settings are encountered (like disabling encryption at rest) enabling this
     * setting will cause a failure.
     *
     * Default: - false
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun useUnsignedBasicAuth(): Boolean? = unwrap(this).getUseUnsignedBasicAuth()

    /**
     * (deprecated) The Elasticsearch version that your domain will leverage.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun version(): ElasticsearchVersion =
        unwrap(this).getVersion().let(ElasticsearchVersion::wrap)

    /**
     * (deprecated) Place the domain inside this VPC.
     *
     * Default: - Domain is not placed in a VPC.
     *
     * [Documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html)
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    /**
     * (deprecated) The specific vpc subnets the domain will be placed in.
     *
     * You must provide one subnet for each Availability Zone
     * that your domain uses. For example, you must specify three subnet IDs for a three
     * Availability Zone
     * domain.
     *
     * Only used if `vpc` is specified.
     *
     * Default: - All private subnets.
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html)
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun vpcSubnets(): List<SubnetSelection> =
        unwrap(this).getVpcSubnets()?.map(SubnetSelection::wrap) ?: emptyList()

    /**
     * (deprecated) The cluster zone awareness configuration for the Amazon ES domain.
     *
     * Default: - no zone awareness (1 AZ)
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun zoneAwareness(): ZoneAwarenessConfig? =
        unwrap(this).getZoneAwareness()?.let(ZoneAwarenessConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.DomainProps):
        DomainProps = CdkObjectWrappers.wrap(cdkObject) as DomainProps

    internal fun unwrap(wrapped: DomainProps):
        software.amazon.awscdk.services.elasticsearch.DomainProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.elasticsearch.DomainProps
  }
}
