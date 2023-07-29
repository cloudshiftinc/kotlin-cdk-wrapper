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
import software.amazon.awscdk.services.elasticsearch.DomainProps
import software.amazon.awscdk.services.elasticsearch.EbsOptions
import software.amazon.awscdk.services.elasticsearch.ElasticsearchVersion
import software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions
import software.amazon.awscdk.services.elasticsearch.LoggingOptions
import software.amazon.awscdk.services.elasticsearch.TLSSecurityPolicy
import software.amazon.awscdk.services.elasticsearch.ZoneAwarenessConfig
import software.amazon.awscdk.services.iam.PolicyStatement

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
@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class DomainPropsDsl {
    private val cdkBuilder: DomainProps.Builder = DomainProps.builder()

    private val _accessPolicies: MutableList<PolicyStatement> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    private val _vpcSubnets: MutableList<SubnetSelection> = mutableListOf()

    /**
     * @param accessPolicies Domain Access policies.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun accessPolicies(accessPolicies: PolicyStatementDsl.() -> Unit) {
        _accessPolicies.add(PolicyStatementDsl().apply(accessPolicies).build())
    }

    /**
     * @param accessPolicies Domain Access policies.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun accessPolicies(accessPolicies: Collection<PolicyStatement>) {
        _accessPolicies.addAll(accessPolicies)
    }

    /**
     * @param advancedOptions Additional options to specify for the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun advancedOptions(advancedOptions: Map<String, String>) {
        cdkBuilder.advancedOptions(advancedOptions)
    }

    /**
     * @param automatedSnapshotStartHour The hour in UTC during which the service takes an automated
     *   daily snapshot of the indices in the Amazon ES domain. Only applies for Elasticsearch
     *   versions below 5.3.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
        cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
    }

    /**
     * @param capacity The cluster capacity configuration for the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun capacity(capacity: CapacityConfigDsl.() -> Unit = {}) {
        val builder = CapacityConfigDsl()
        builder.apply(capacity)
        cdkBuilder.capacity(builder.build())
    }

    /**
     * @param capacity The cluster capacity configuration for the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun capacity(capacity: CapacityConfig) {
        cdkBuilder.capacity(capacity)
    }

    /**
     * @param cognitoKibanaAuth Configures Amazon ES to use Amazon Cognito authentication for
     *   Kibana.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptionsDsl.() -> Unit = {}) {
        val builder = CognitoOptionsDsl()
        builder.apply(cognitoKibanaAuth)
        cdkBuilder.cognitoKibanaAuth(builder.build())
    }

    /**
     * @param cognitoKibanaAuth Configures Amazon ES to use Amazon Cognito authentication for
     *   Kibana.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions) {
        cdkBuilder.cognitoKibanaAuth(cognitoKibanaAuth)
    }

    /**
     * @param customEndpoint To configure a custom domain configure these options. If you specify a
     *   Route53 hosted zone it will create a CNAME record and use DNS validation for the
     *   certificate
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun customEndpoint(customEndpoint: CustomEndpointOptionsDsl.() -> Unit = {}) {
        val builder = CustomEndpointOptionsDsl()
        builder.apply(customEndpoint)
        cdkBuilder.customEndpoint(builder.build())
    }

    /**
     * @param customEndpoint To configure a custom domain configure these options. If you specify a
     *   Route53 hosted zone it will create a CNAME record and use DNS validation for the
     *   certificate
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun customEndpoint(customEndpoint: CustomEndpointOptions) {
        cdkBuilder.customEndpoint(customEndpoint)
    }

    /**
     * @param domainName Enforces a particular physical domain name.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     *   attached to data nodes in the Amazon ES domain. For more information, see
     *   [Configuring EBS-based Storage]
     *   (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
     *   in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun ebs(ebs: EbsOptionsDsl.() -> Unit = {}) {
        val builder = EbsOptionsDsl()
        builder.apply(ebs)
        cdkBuilder.ebs(builder.build())
    }

    /**
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     *   attached to data nodes in the Amazon ES domain. For more information, see
     *   [Configuring EBS-based Storage]
     *   (https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs)
     *   in the Amazon Elasticsearch Service Developer Guide.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun ebs(ebs: EbsOptions) {
        cdkBuilder.ebs(ebs)
    }

    /**
     * @param enableVersionUpgrade To upgrade an Amazon ES domain to a new version of Elasticsearch
     *   rather than replacing the entire domain resource, use the EnableVersionUpgrade update
     *   policy.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun enableVersionUpgrade(enableVersionUpgrade: Boolean) {
        cdkBuilder.enableVersionUpgrade(enableVersionUpgrade)
    }

    /**
     * @param encryptionAtRest Encryption at rest options for the cluster.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptionsDsl.() -> Unit = {}) {
        val builder = EncryptionAtRestOptionsDsl()
        builder.apply(encryptionAtRest)
        cdkBuilder.encryptionAtRest(builder.build())
    }

    /**
     * @param encryptionAtRest Encryption at rest options for the cluster.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions) {
        cdkBuilder.encryptionAtRest(encryptionAtRest)
    }

    /**
     * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun enforceHttps(enforceHttps: Boolean) {
        cdkBuilder.enforceHttps(enforceHttps)
    }

    /**
     * @param fineGrainedAccessControl Specifies options for fine-grained access control. Requires
     *   Elasticsearch version 6.7 or later. Enabling fine-grained access control also requires
     *   encryption of data at rest and node-to-node encryption, along with enforced HTTPS.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun fineGrainedAccessControl(
        fineGrainedAccessControl: AdvancedSecurityOptionsDsl.() -> Unit = {}
    ) {
        val builder = AdvancedSecurityOptionsDsl()
        builder.apply(fineGrainedAccessControl)
        cdkBuilder.fineGrainedAccessControl(builder.build())
    }

    /**
     * @param fineGrainedAccessControl Specifies options for fine-grained access control. Requires
     *   Elasticsearch version 6.7 or later. Enabling fine-grained access control also requires
     *   encryption of data at rest and node-to-node encryption, along with enforced HTTPS.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions) {
        cdkBuilder.fineGrainedAccessControl(fineGrainedAccessControl)
    }

    /**
     * @param logging Configuration log publishing configuration options.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun logging(logging: LoggingOptionsDsl.() -> Unit = {}) {
        val builder = LoggingOptionsDsl()
        builder.apply(logging)
        cdkBuilder.logging(builder.build())
    }

    /**
     * @param logging Configuration log publishing configuration options.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun logging(logging: LoggingOptions) {
        cdkBuilder.logging(logging)
    }

    /**
     * @param nodeToNodeEncryption Specify true to enable node to node encryption. Requires
     *   Elasticsearch version 6.0 or later.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean) {
        cdkBuilder.nodeToNodeEncryption(nodeToNodeEncryption)
    }

    /**
     * @param removalPolicy Policy to apply when the domain is removed from the stack.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     *   for the domain. Only used if `vpc` is specified.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     *   for the domain. Only used if `vpc` is specified.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy) {
        cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy)
    }

    /**
     * @param useUnsignedBasicAuth Configures the domain so that unsigned basic auth is enabled. If
     *   no master user is provided a default master user with username `admin` and a dynamically
     *   generated password stored in KMS is created. The password can be retrieved by getting
     *   `masterUserPassword` from the domain instance.
     *
     * Setting this to true will also add an access policy that allows unsigned access, enable node
     * to node encryption, encryption at rest. If conflicting settings are encountered (like
     * disabling encryption at rest) enabling this setting will cause a failure.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean) {
        cdkBuilder.useUnsignedBasicAuth(useUnsignedBasicAuth)
    }

    /**
     * @param version The Elasticsearch version that your domain will leverage.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun version(version: ElasticsearchVersion) {
        cdkBuilder.version(version)
    }

    /**
     * @param vpc Place the domain inside this VPC.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * @param vpcSubnets The specific vpc subnets the domain will be placed in. You must provide one
     *   subnet for each Availability Zone that your domain uses. For example, you must specify
     *   three subnet IDs for a three Availability Zone domain.
     *
     * Only used if `vpc` is specified.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit) {
        _vpcSubnets.add(SubnetSelectionDsl().apply(vpcSubnets).build())
    }

    /**
     * @param vpcSubnets The specific vpc subnets the domain will be placed in. You must provide one
     *   subnet for each Availability Zone that your domain uses. For example, you must specify
     *   three subnet IDs for a three Availability Zone domain.
     *
     * Only used if `vpc` is specified.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun vpcSubnets(vpcSubnets: Collection<SubnetSelection>) {
        _vpcSubnets.addAll(vpcSubnets)
    }

    /**
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfigDsl.() -> Unit = {}) {
        val builder = ZoneAwarenessConfigDsl()
        builder.apply(zoneAwareness)
        cdkBuilder.zoneAwareness(builder.build())
    }

    /**
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon ES domain.
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig) {
        cdkBuilder.zoneAwareness(zoneAwareness)
    }

    public fun build(): DomainProps {
        if (_accessPolicies.isNotEmpty()) cdkBuilder.accessPolicies(_accessPolicies)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        if (_vpcSubnets.isNotEmpty()) cdkBuilder.vpcSubnets(_vpcSubnets)
        return cdkBuilder.build()
    }
}
