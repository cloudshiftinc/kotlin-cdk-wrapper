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

package cloudshift.awscdk.dsl.services.opensearchservice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import kotlin.Boolean
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
import software.amazon.awscdk.services.iam.PolicyStatement
import software.amazon.awscdk.services.opensearchservice.AdvancedSecurityOptions
import software.amazon.awscdk.services.opensearchservice.CapacityConfig
import software.amazon.awscdk.services.opensearchservice.CognitoOptions
import software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions
import software.amazon.awscdk.services.opensearchservice.Domain
import software.amazon.awscdk.services.opensearchservice.EbsOptions
import software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions
import software.amazon.awscdk.services.opensearchservice.EngineVersion
import software.amazon.awscdk.services.opensearchservice.LoggingOptions
import software.amazon.awscdk.services.opensearchservice.TLSSecurityPolicy
import software.amazon.awscdk.services.opensearchservice.ZoneAwarenessConfig
import software.constructs.Construct

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
@CdkDslMarker
public class DomainDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Domain.Builder = Domain.Builder.create(scope, id)

    private val _accessPolicies: MutableList<PolicyStatement> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    private val _vpcSubnets: MutableList<SubnetSelection> = mutableListOf()

    /**
     * Domain access policies.
     *
     * Default: - No access policies.
     *
     * @param accessPolicies Domain access policies.
     */
    public fun accessPolicies(accessPolicies: PolicyStatementDsl.() -> Unit) {
        _accessPolicies.add(PolicyStatementDsl().apply(accessPolicies).build())
    }

    /**
     * Domain access policies.
     *
     * Default: - No access policies.
     *
     * @param accessPolicies Domain access policies.
     */
    public fun accessPolicies(accessPolicies: Collection<PolicyStatement>) {
        _accessPolicies.addAll(accessPolicies)
    }

    /**
     * Additional options to specify for the Amazon OpenSearch Service domain.
     *
     * Default: - no advanced options are specified
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
     *
     * @param advancedOptions Additional options to specify for the Amazon OpenSearch Service
     *   domain.
     */
    public fun advancedOptions(advancedOptions: Map<String, String>) {
        cdkBuilder.advancedOptions(advancedOptions)
    }

    /**
     * The hour in UTC during which the service takes an automated daily snapshot of the indices in
     * the Amazon OpenSearch Service domain.
     *
     * Only applies for Elasticsearch versions below 5.3.
     *
     * Default: - Hourly automated snapshots not used
     *
     * @param automatedSnapshotStartHour The hour in UTC during which the service takes an automated
     *   daily snapshot of the indices in the Amazon OpenSearch Service domain.
     */
    public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
        cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
    }

    /**
     * The cluster capacity configuration for the Amazon OpenSearch Service domain.
     *
     * Default: - 1 r5.large.search data node; no dedicated master nodes.
     *
     * @param capacity The cluster capacity configuration for the Amazon OpenSearch Service domain.
     */
    public fun capacity(capacity: CapacityConfigDsl.() -> Unit = {}) {
        val builder = CapacityConfigDsl()
        builder.apply(capacity)
        cdkBuilder.capacity(builder.build())
    }

    /**
     * The cluster capacity configuration for the Amazon OpenSearch Service domain.
     *
     * Default: - 1 r5.large.search data node; no dedicated master nodes.
     *
     * @param capacity The cluster capacity configuration for the Amazon OpenSearch Service domain.
     */
    public fun capacity(capacity: CapacityConfig) {
        cdkBuilder.capacity(capacity)
    }

    /**
     * Configures Amazon OpenSearch Service to use Amazon Cognito authentication for OpenSearch
     * Dashboards.
     *
     * Default: - Cognito not used for authentication to OpenSearch Dashboards.
     *
     * @param cognitoDashboardsAuth Configures Amazon OpenSearch Service to use Amazon Cognito
     *   authentication for OpenSearch Dashboards.
     */
    public fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptionsDsl.() -> Unit = {}) {
        val builder = CognitoOptionsDsl()
        builder.apply(cognitoDashboardsAuth)
        cdkBuilder.cognitoDashboardsAuth(builder.build())
    }

    /**
     * Configures Amazon OpenSearch Service to use Amazon Cognito authentication for OpenSearch
     * Dashboards.
     *
     * Default: - Cognito not used for authentication to OpenSearch Dashboards.
     *
     * @param cognitoDashboardsAuth Configures Amazon OpenSearch Service to use Amazon Cognito
     *   authentication for OpenSearch Dashboards.
     */
    public fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions) {
        cdkBuilder.cognitoDashboardsAuth(cognitoDashboardsAuth)
    }

    /**
     * To configure a custom domain configure these options.
     *
     * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
     * the certificate
     *
     * Default: - no custom domain endpoint will be configured
     *
     * @param customEndpoint To configure a custom domain configure these options.
     */
    public fun customEndpoint(customEndpoint: CustomEndpointOptionsDsl.() -> Unit = {}) {
        val builder = CustomEndpointOptionsDsl()
        builder.apply(customEndpoint)
        cdkBuilder.customEndpoint(builder.build())
    }

    /**
     * To configure a custom domain configure these options.
     *
     * If you specify a Route53 hosted zone it will create a CNAME record and use DNS validation for
     * the certificate
     *
     * Default: - no custom domain endpoint will be configured
     *
     * @param customEndpoint To configure a custom domain configure these options.
     */
    public fun customEndpoint(customEndpoint: CustomEndpointOptions) {
        cdkBuilder.customEndpoint(customEndpoint)
    }

    /**
     * Enforces a particular physical domain name.
     *
     * Default: - A name will be auto-generated.
     *
     * @param domainName Enforces a particular physical domain name.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the Amazon OpenSearch Service domain.
     *
     * Default: - 10 GiB General Purpose (SSD) volumes per node.
     *
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     *   attached to data nodes in the Amazon OpenSearch Service domain.
     */
    public fun ebs(ebs: EbsOptionsDsl.() -> Unit = {}) {
        val builder = EbsOptionsDsl()
        builder.apply(ebs)
        cdkBuilder.ebs(builder.build())
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the Amazon OpenSearch Service domain.
     *
     * Default: - 10 GiB General Purpose (SSD) volumes per node.
     *
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     *   attached to data nodes in the Amazon OpenSearch Service domain.
     */
    public fun ebs(ebs: EbsOptions) {
        cdkBuilder.ebs(ebs)
    }

    /**
     * To upgrade an Amazon OpenSearch Service domain to a new version, rather than replacing the
     * entire domain resource, use the EnableVersionUpgrade update policy.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
     *
     * @param enableVersionUpgrade To upgrade an Amazon OpenSearch Service domain to a new version,
     *   rather than replacing the entire domain resource, use the EnableVersionUpgrade update
     *   policy.
     */
    public fun enableVersionUpgrade(enableVersionUpgrade: Boolean) {
        cdkBuilder.enableVersionUpgrade(enableVersionUpgrade)
    }

    /**
     * Encryption at rest options for the cluster.
     *
     * Default: - No encryption at rest
     *
     * @param encryptionAtRest Encryption at rest options for the cluster.
     */
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptionsDsl.() -> Unit = {}) {
        val builder = EncryptionAtRestOptionsDsl()
        builder.apply(encryptionAtRest)
        cdkBuilder.encryptionAtRest(builder.build())
    }

    /**
     * Encryption at rest options for the cluster.
     *
     * Default: - No encryption at rest
     *
     * @param encryptionAtRest Encryption at rest options for the cluster.
     */
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions) {
        cdkBuilder.encryptionAtRest(encryptionAtRest)
    }

    /**
     * True to require that all traffic to the domain arrive over HTTPS.
     *
     * Default: - false
     *
     * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
     */
    public fun enforceHttps(enforceHttps: Boolean) {
        cdkBuilder.enforceHttps(enforceHttps)
    }

    /**
     * Specifies options for fine-grained access control.
     *
     * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later. Enabling
     * fine-grained access control also requires encryption of data at rest and node-to-node
     * encryption, along with enforced HTTPS.
     *
     * Default: - fine-grained access control is disabled
     *
     * @param fineGrainedAccessControl Specifies options for fine-grained access control.
     */
    public fun fineGrainedAccessControl(
        fineGrainedAccessControl: AdvancedSecurityOptionsDsl.() -> Unit = {}
    ) {
        val builder = AdvancedSecurityOptionsDsl()
        builder.apply(fineGrainedAccessControl)
        cdkBuilder.fineGrainedAccessControl(builder.build())
    }

    /**
     * Specifies options for fine-grained access control.
     *
     * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later. Enabling
     * fine-grained access control also requires encryption of data at rest and node-to-node
     * encryption, along with enforced HTTPS.
     *
     * Default: - fine-grained access control is disabled
     *
     * @param fineGrainedAccessControl Specifies options for fine-grained access control.
     */
    public fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions) {
        cdkBuilder.fineGrainedAccessControl(fineGrainedAccessControl)
    }

    /**
     * Configuration log publishing configuration options.
     *
     * Default: - No logs are published
     *
     * @param logging Configuration log publishing configuration options.
     */
    public fun logging(logging: LoggingOptionsDsl.() -> Unit = {}) {
        val builder = LoggingOptionsDsl()
        builder.apply(logging)
        cdkBuilder.logging(builder.build())
    }

    /**
     * Configuration log publishing configuration options.
     *
     * Default: - No logs are published
     *
     * @param logging Configuration log publishing configuration options.
     */
    public fun logging(logging: LoggingOptions) {
        cdkBuilder.logging(logging)
    }

    /**
     * Specify true to enable node to node encryption.
     *
     * Requires Elasticsearch version 6.0 or later or OpenSearch version 1.0 or later.
     *
     * Default: - Node to node encryption is not enabled.
     *
     * @param nodeToNodeEncryption Specify true to enable node to node encryption.
     */
    public fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean) {
        cdkBuilder.nodeToNodeEncryption(nodeToNodeEncryption)
    }

    /**
     * Policy to apply when the domain is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy Policy to apply when the domain is removed from the stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * The list of security groups that are associated with the VPC endpoints for the domain.
     *
     * Only used if `vpc` is specified.
     *
     * Default: - One new security group is created.
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
     *
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     *   for the domain.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * The list of security groups that are associated with the VPC endpoints for the domain.
     *
     * Only used if `vpc` is specified.
     *
     * Default: - One new security group is created.
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
     *
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     *   for the domain.
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * The minimum TLS version required for traffic to the domain.
     *
     * Default: - TLSSecurityPolicy.TLS_1_0
     *
     * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain.
     */
    public fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy) {
        cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy)
    }

    /**
     * Configures the domain so that unsigned basic auth is enabled.
     *
     * If no master user is provided a default master user with username `admin` and a dynamically
     * generated password stored in KMS is created. The password can be retrieved by getting
     * `masterUserPassword` from the domain instance.
     *
     * Setting this to true will also add an access policy that allows unsigned access, enable node
     * to node encryption, encryption at rest. If conflicting settings are encountered (like
     * disabling encryption at rest) enabling this setting will cause a failure.
     *
     * Default: - false
     *
     * @param useUnsignedBasicAuth Configures the domain so that unsigned basic auth is enabled.
     */
    public fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean) {
        cdkBuilder.useUnsignedBasicAuth(useUnsignedBasicAuth)
    }

    /**
     * The Elasticsearch/OpenSearch version that your domain will leverage.
     *
     * @param version The Elasticsearch/OpenSearch version that your domain will leverage.
     */
    public fun version(version: EngineVersion) {
        cdkBuilder.version(version)
    }

    /**
     * Place the domain inside this VPC.
     *
     * Default: - Domain is not placed in a VPC.
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)
     *
     * @param vpc Place the domain inside this VPC.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * The specific vpc subnets the domain will be placed in.
     *
     * You must provide one subnet for each Availability Zone that your domain uses. For example,
     * you must specify three subnet IDs for a three Availability Zone domain.
     *
     * Only used if `vpc` is specified.
     *
     * Default: - All private subnets.
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html)
     *
     * @param vpcSubnets The specific vpc subnets the domain will be placed in.
     */
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit) {
        _vpcSubnets.add(SubnetSelectionDsl().apply(vpcSubnets).build())
    }

    /**
     * The specific vpc subnets the domain will be placed in.
     *
     * You must provide one subnet for each Availability Zone that your domain uses. For example,
     * you must specify three subnet IDs for a three Availability Zone domain.
     *
     * Only used if `vpc` is specified.
     *
     * Default: - All private subnets.
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html)
     *
     * @param vpcSubnets The specific vpc subnets the domain will be placed in.
     */
    public fun vpcSubnets(vpcSubnets: Collection<SubnetSelection>) {
        _vpcSubnets.addAll(vpcSubnets)
    }

    /**
     * The cluster zone awareness configuration for the Amazon OpenSearch Service domain.
     *
     * Default: - no zone awareness (1 AZ)
     *
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon OpenSearch
     *   Service domain.
     */
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfigDsl.() -> Unit = {}) {
        val builder = ZoneAwarenessConfigDsl()
        builder.apply(zoneAwareness)
        cdkBuilder.zoneAwareness(builder.build())
    }

    /**
     * The cluster zone awareness configuration for the Amazon OpenSearch Service domain.
     *
     * Default: - no zone awareness (1 AZ)
     *
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon OpenSearch
     *   Service domain.
     */
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig) {
        cdkBuilder.zoneAwareness(zoneAwareness)
    }

    public fun build(): Domain {
        if (_accessPolicies.isNotEmpty()) cdkBuilder.accessPolicies(_accessPolicies)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_vpcSubnets.isNotEmpty()) cdkBuilder.vpcSubnets(_vpcSubnets)
        return cdkBuilder.build()
    }
}
