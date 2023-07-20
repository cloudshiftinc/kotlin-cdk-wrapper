@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
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
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
@Deprecated(message = "deprecated in CDK")
public class DomainPropsDsl {
    private val cdkBuilder: DomainProps.Builder = DomainProps.builder()

    private val _accessPolicies: MutableList<PolicyStatement> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    private val _vpcSubnets: MutableList<SubnetSelection> = mutableListOf()

    @Deprecated(message = "deprecated in CDK")
    public fun accessPolicies(accessPolicies: PolicyStatementDsl.() -> Unit) {
        _accessPolicies.add(PolicyStatementDsl().apply(accessPolicies).build())
    }

    @Deprecated(message = "deprecated in CDK")
    public fun accessPolicies(accessPolicies: Collection<PolicyStatement>) {
        _accessPolicies.addAll(accessPolicies)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun advancedOptions(advancedOptions: Map<String, String>) {
        cdkBuilder.advancedOptions(advancedOptions)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
        cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun capacity(block: CapacityConfigDsl.() -> Unit = {}) {
        val builder = CapacityConfigDsl()
        builder.apply(block)
        cdkBuilder.capacity(builder.build())
    }

    @Deprecated(message = "deprecated in CDK")
    public fun capacity(capacity: CapacityConfig) {
        cdkBuilder.capacity(capacity)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun cognitoKibanaAuth(block: CognitoOptionsDsl.() -> Unit = {}) {
        val builder = CognitoOptionsDsl()
        builder.apply(block)
        cdkBuilder.cognitoKibanaAuth(builder.build())
    }

    @Deprecated(message = "deprecated in CDK")
    public fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions) {
        cdkBuilder.cognitoKibanaAuth(cognitoKibanaAuth)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun customEndpoint(block: CustomEndpointOptionsDsl.() -> Unit = {}) {
        val builder = CustomEndpointOptionsDsl()
        builder.apply(block)
        cdkBuilder.customEndpoint(builder.build())
    }

    @Deprecated(message = "deprecated in CDK")
    public fun customEndpoint(customEndpoint: CustomEndpointOptions) {
        cdkBuilder.customEndpoint(customEndpoint)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun ebs(block: EbsOptionsDsl.() -> Unit = {}) {
        val builder = EbsOptionsDsl()
        builder.apply(block)
        cdkBuilder.ebs(builder.build())
    }

    @Deprecated(message = "deprecated in CDK")
    public fun ebs(ebs: EbsOptions) {
        cdkBuilder.ebs(ebs)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun enableVersionUpgrade(enableVersionUpgrade: Boolean) {
        cdkBuilder.enableVersionUpgrade(enableVersionUpgrade)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun encryptionAtRest(block: EncryptionAtRestOptionsDsl.() -> Unit = {}) {
        val builder = EncryptionAtRestOptionsDsl()
        builder.apply(block)
        cdkBuilder.encryptionAtRest(builder.build())
    }

    @Deprecated(message = "deprecated in CDK")
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions) {
        cdkBuilder.encryptionAtRest(encryptionAtRest)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun enforceHttps(enforceHttps: Boolean) {
        cdkBuilder.enforceHttps(enforceHttps)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun fineGrainedAccessControl(block: AdvancedSecurityOptionsDsl.() -> Unit = {}) {
        val builder = AdvancedSecurityOptionsDsl()
        builder.apply(block)
        cdkBuilder.fineGrainedAccessControl(builder.build())
    }

    @Deprecated(message = "deprecated in CDK")
    public fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions) {
        cdkBuilder.fineGrainedAccessControl(fineGrainedAccessControl)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun logging(block: LoggingOptionsDsl.() -> Unit = {}) {
        val builder = LoggingOptionsDsl()
        builder.apply(block)
        cdkBuilder.logging(builder.build())
    }

    @Deprecated(message = "deprecated in CDK")
    public fun logging(logging: LoggingOptions) {
        cdkBuilder.logging(logging)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean) {
        cdkBuilder.nodeToNodeEncryption(nodeToNodeEncryption)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    @Deprecated(message = "deprecated in CDK")
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy) {
        cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean) {
        cdkBuilder.useUnsignedBasicAuth(useUnsignedBasicAuth)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun version(version: ElasticsearchVersion) {
        cdkBuilder.version(version)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit) {
        _vpcSubnets.add(SubnetSelectionDsl().apply(vpcSubnets).build())
    }

    @Deprecated(message = "deprecated in CDK")
    public fun vpcSubnets(vpcSubnets: Collection<SubnetSelection>) {
        _vpcSubnets.addAll(vpcSubnets)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun zoneAwareness(block: ZoneAwarenessConfigDsl.() -> Unit = {}) {
        val builder = ZoneAwarenessConfigDsl()
        builder.apply(block)
        cdkBuilder.zoneAwareness(builder.build())
    }

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
