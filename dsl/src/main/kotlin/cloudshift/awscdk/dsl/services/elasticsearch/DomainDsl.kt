@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions
import software.amazon.awscdk.services.elasticsearch.CapacityConfig
import software.amazon.awscdk.services.elasticsearch.CognitoOptions
import software.amazon.awscdk.services.elasticsearch.CustomEndpointOptions
import software.amazon.awscdk.services.elasticsearch.Domain
import software.amazon.awscdk.services.elasticsearch.EbsOptions
import software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion
import software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions
import software.amazon.awscdk.services.elasticsearch.LoggingOptions
import software.amazon.awscdk.services.elasticsearch.TLSSecurityPolicy
import software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig
import software.amazon.awscdk.services.iam.PolicyStatement
import software.constructs.Construct

@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class DomainDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Domain.Builder = Domain.Builder.create(scope, id)

  private val _accessPolicies: MutableList<PolicyStatement> = mutableListOf()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  private val _vpcSubnets: MutableList<SubnetSelection> = mutableListOf()

  /**
   * (deprecated) Domain Access policies.
   *
   * Default: - No access policies.
   *
   * @deprecated use opensearchservice module instead
   * @param accessPolicies Domain Access policies. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun accessPolicies(accessPolicies: PolicyStatementDsl.() -> Unit) {
    _accessPolicies.add(PolicyStatementDsl().apply(accessPolicies).build())
  }

  /**
   * (deprecated) Domain Access policies.
   *
   * Default: - No access policies.
   *
   * @deprecated use opensearchservice module instead
   * @param accessPolicies Domain Access policies. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun accessPolicies(accessPolicies: Collection<PolicyStatement>) {
    _accessPolicies.addAll(accessPolicies)
  }

  /**
   * (deprecated) Additional options to specify for the Amazon ES domain.
   *
   * Default: - no advanced options are specified
   *
   * [Documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options)
   * @deprecated use opensearchservice module instead
   * @param advancedOptions Additional options to specify for the Amazon ES domain. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun advancedOptions(advancedOptions: Map<String, String>) {
    cdkBuilder.advancedOptions(advancedOptions)
  }

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
   * @param automatedSnapshotStartHour The hour in UTC during which the service takes an automated
   * daily snapshot of the indices in the Amazon ES domain. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
    cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
  }

  /**
   * (deprecated) The cluster capacity configuration for the Amazon ES domain.
   *
   * Default: - 1 r5.large.elasticsearch data node; no dedicated master nodes.
   *
   * @deprecated use opensearchservice module instead
   * @param capacity The cluster capacity configuration for the Amazon ES domain. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun capacity(capacity: CapacityConfigDsl.() -> Unit = {}) {
    val builder = CapacityConfigDsl()
    builder.apply(capacity)
    cdkBuilder.capacity(builder.build())
  }

  /**
   * (deprecated) The cluster capacity configuration for the Amazon ES domain.
   *
   * Default: - 1 r5.large.elasticsearch data node; no dedicated master nodes.
   *
   * @deprecated use opensearchservice module instead
   * @param capacity The cluster capacity configuration for the Amazon ES domain. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun capacity(capacity: CapacityConfig) {
    cdkBuilder.capacity(capacity)
  }

  /**
   * (deprecated) Configures Amazon ES to use Amazon Cognito authentication for Kibana.
   *
   * Default: - Cognito not used for authentication to Kibana.
   *
   * @deprecated use opensearchservice module instead
   * @param cognitoKibanaAuth Configures Amazon ES to use Amazon Cognito authentication for Kibana. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptionsDsl.() -> Unit = {}) {
    val builder = CognitoOptionsDsl()
    builder.apply(cognitoKibanaAuth)
    cdkBuilder.cognitoKibanaAuth(builder.build())
  }

  /**
   * (deprecated) Configures Amazon ES to use Amazon Cognito authentication for Kibana.
   *
   * Default: - Cognito not used for authentication to Kibana.
   *
   * @deprecated use opensearchservice module instead
   * @param cognitoKibanaAuth Configures Amazon ES to use Amazon Cognito authentication for Kibana. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions) {
    cdkBuilder.cognitoKibanaAuth(cognitoKibanaAuth)
  }

  /**
   * (deprecated) To configure a custom domain configure these options.
   *
   * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
   * the certificate
   *
   * Default: - no custom domain endpoint will be configured
   *
   * @deprecated use opensearchservice module instead
   * @param customEndpoint To configure a custom domain configure these options. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun customEndpoint(customEndpoint: CustomEndpointOptionsDsl.() -> Unit = {}) {
    val builder = CustomEndpointOptionsDsl()
    builder.apply(customEndpoint)
    cdkBuilder.customEndpoint(builder.build())
  }

  /**
   * (deprecated) To configure a custom domain configure these options.
   *
   * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
   * the certificate
   *
   * Default: - no custom domain endpoint will be configured
   *
   * @deprecated use opensearchservice module instead
   * @param customEndpoint To configure a custom domain configure these options. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun customEndpoint(customEndpoint: CustomEndpointOptions) {
    cdkBuilder.customEndpoint(customEndpoint)
  }

  /**
   * (deprecated) Enforces a particular physical domain name.
   *
   * Default: - A name will be auto-generated.
   *
   * @deprecated use opensearchservice module instead
   * @param domainName Enforces a particular physical domain name. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

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
   * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
   * attached to data nodes in the Amazon ES domain. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun ebs(ebs: EbsOptionsDsl.() -> Unit = {}) {
    val builder = EbsOptionsDsl()
    builder.apply(ebs)
    cdkBuilder.ebs(builder.build())
  }

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
   * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
   * attached to data nodes in the Amazon ES domain. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun ebs(ebs: EbsOptions) {
    cdkBuilder.ebs(ebs)
  }

  /**
   * (deprecated) To upgrade an Amazon ES domain to a new version of Elasticsearch rather than
   * replacing the entire domain resource, use the EnableVersionUpgrade update policy.
   *
   * Default: - false
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeelasticsearchdomain)
   * @deprecated use opensearchservice module instead
   * @param enableVersionUpgrade To upgrade an Amazon ES domain to a new version of Elasticsearch
   * rather than replacing the entire domain resource, use the EnableVersionUpgrade update policy. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun enableVersionUpgrade(enableVersionUpgrade: Boolean) {
    cdkBuilder.enableVersionUpgrade(enableVersionUpgrade)
  }

  /**
   * (deprecated) Encryption at rest options for the cluster.
   *
   * Default: - No encryption at rest
   *
   * @deprecated use opensearchservice module instead
   * @param encryptionAtRest Encryption at rest options for the cluster. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptionsDsl.() -> Unit = {}) {
    val builder = EncryptionAtRestOptionsDsl()
    builder.apply(encryptionAtRest)
    cdkBuilder.encryptionAtRest(builder.build())
  }

  /**
   * (deprecated) Encryption at rest options for the cluster.
   *
   * Default: - No encryption at rest
   *
   * @deprecated use opensearchservice module instead
   * @param encryptionAtRest Encryption at rest options for the cluster. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions) {
    cdkBuilder.encryptionAtRest(encryptionAtRest)
  }

  /**
   * (deprecated) True to require that all traffic to the domain arrive over HTTPS.
   *
   * Default: - false
   *
   * @deprecated use opensearchservice module instead
   * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun enforceHttps(enforceHttps: Boolean) {
    cdkBuilder.enforceHttps(enforceHttps)
  }

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
   * @param fineGrainedAccessControl Specifies options for fine-grained access control. 
   */
  @Deprecated(message = "deprecated in CDK")
  public
      fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptionsDsl.() -> Unit =
      {}) {
    val builder = AdvancedSecurityOptionsDsl()
    builder.apply(fineGrainedAccessControl)
    cdkBuilder.fineGrainedAccessControl(builder.build())
  }

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
   * @param fineGrainedAccessControl Specifies options for fine-grained access control. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions) {
    cdkBuilder.fineGrainedAccessControl(fineGrainedAccessControl)
  }

  /**
   * (deprecated) Configuration log publishing configuration options.
   *
   * Default: - No logs are published
   *
   * @deprecated use opensearchservice module instead
   * @param logging Configuration log publishing configuration options. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun logging(logging: LoggingOptionsDsl.() -> Unit = {}) {
    val builder = LoggingOptionsDsl()
    builder.apply(logging)
    cdkBuilder.logging(builder.build())
  }

  /**
   * (deprecated) Configuration log publishing configuration options.
   *
   * Default: - No logs are published
   *
   * @deprecated use opensearchservice module instead
   * @param logging Configuration log publishing configuration options. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun logging(logging: LoggingOptions) {
    cdkBuilder.logging(logging)
  }

  /**
   * (deprecated) Specify true to enable node to node encryption.
   *
   * Requires Elasticsearch version 6.0 or later.
   *
   * Default: - Node to node encryption is not enabled.
   *
   * @deprecated use opensearchservice module instead
   * @param nodeToNodeEncryption Specify true to enable node to node encryption. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean) {
    cdkBuilder.nodeToNodeEncryption(nodeToNodeEncryption)
  }

  /**
   * (deprecated) Policy to apply when the domain is removed from the stack.
   *
   * Default: RemovalPolicy.RETAIN
   *
   * @deprecated use opensearchservice module instead
   * @param removalPolicy Policy to apply when the domain is removed from the stack. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

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
   * @param securityGroups The list of security groups that are associated with the VPC endpoints
   * for the domain. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

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
   * @param securityGroups The list of security groups that are associated with the VPC endpoints
   * for the domain. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * (deprecated) The minimum TLS version required for traffic to the domain.
   *
   * Default: - TLSSecurityPolicy.TLS_1_0
   *
   * @deprecated use opensearchservice module instead
   * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy) {
    cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy)
  }

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
   * @param useUnsignedBasicAuth Configures the domain so that unsigned basic auth is enabled. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean) {
    cdkBuilder.useUnsignedBasicAuth(useUnsignedBasicAuth)
  }

  /**
   * (deprecated) The Elasticsearch version that your domain will leverage.
   *
   * @deprecated use opensearchservice module instead
   * @param version The Elasticsearch version that your domain will leverage. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun version(version: ElasticsearchVersion) {
    cdkBuilder.version(version)
  }

  /**
   * (deprecated) Place the domain inside this VPC.
   *
   * Default: - Domain is not placed in a VPC.
   *
   * [Documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html)
   * @deprecated use opensearchservice module instead
   * @param vpc Place the domain inside this VPC. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

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
   * @param vpcSubnets The specific vpc subnets the domain will be placed in. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit) {
    _vpcSubnets.add(SubnetSelectionDsl().apply(vpcSubnets).build())
  }

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
   * @param vpcSubnets The specific vpc subnets the domain will be placed in. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun vpcSubnets(vpcSubnets: Collection<SubnetSelection>) {
    _vpcSubnets.addAll(vpcSubnets)
  }

  /**
   * (deprecated) The cluster zone awareness configuration for the Amazon ES domain.
   *
   * Default: - no zone awareness (1 AZ)
   *
   * @deprecated use opensearchservice module instead
   * @param zoneAwareness The cluster zone awareness configuration for the Amazon ES domain. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfigDsl.() -> Unit = {}) {
    val builder = ZoneAwarenessConfigDsl()
    builder.apply(zoneAwareness)
    cdkBuilder.zoneAwareness(builder.build())
  }

  /**
   * (deprecated) The cluster zone awareness configuration for the Amazon ES domain.
   *
   * Default: - no zone awareness (1 AZ)
   *
   * @deprecated use opensearchservice module instead
   * @param zoneAwareness The cluster zone awareness configuration for the Amazon ES domain. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig) {
    cdkBuilder.zoneAwareness(zoneAwareness)
  }

  public fun build(): Domain {
    if(_accessPolicies.isNotEmpty()) cdkBuilder.accessPolicies(_accessPolicies)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    if(_vpcSubnets.isNotEmpty()) cdkBuilder.vpcSubnets(_vpcSubnets)
    return cdkBuilder.build()
  }
}
