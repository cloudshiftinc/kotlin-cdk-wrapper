@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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

@CdkDslMarker
public class DomainDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: Domain.Builder = Domain.Builder.create(scope, id)

  private val _accessPolicies: MutableList<PolicyStatement> = mutableListOf()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  private val _vpcSubnets: MutableList<SubnetSelection> = mutableListOf()

  public fun accessPolicies(accessPolicies: PolicyStatementDsl.() -> Unit) {
    _accessPolicies.add(PolicyStatementDsl().apply(accessPolicies).build())
  }

  public fun accessPolicies(accessPolicies: Collection<PolicyStatement>) {
    _accessPolicies.addAll(accessPolicies)
  }

  public fun advancedOptions(advancedOptions: Map<String, String>) {
    cdkBuilder.advancedOptions(advancedOptions)
  }

  public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
    cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
  }

  public fun capacity(block: CapacityConfigDsl.() -> Unit = {}) {
    val builder = CapacityConfigDsl()
    builder.apply(block)
    cdkBuilder.capacity(builder.build())
  }

  public fun capacity(capacity: CapacityConfig) {
    cdkBuilder.capacity(capacity)
  }

  public fun cognitoDashboardsAuth(block: CognitoOptionsDsl.() -> Unit = {}) {
    val builder = CognitoOptionsDsl()
    builder.apply(block)
    cdkBuilder.cognitoDashboardsAuth(builder.build())
  }

  public fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions) {
    cdkBuilder.cognitoDashboardsAuth(cognitoDashboardsAuth)
  }

  public fun customEndpoint(block: CustomEndpointOptionsDsl.() -> Unit = {}) {
    val builder = CustomEndpointOptionsDsl()
    builder.apply(block)
    cdkBuilder.customEndpoint(builder.build())
  }

  public fun customEndpoint(customEndpoint: CustomEndpointOptions) {
    cdkBuilder.customEndpoint(customEndpoint)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun ebs(block: EbsOptionsDsl.() -> Unit = {}) {
    val builder = EbsOptionsDsl()
    builder.apply(block)
    cdkBuilder.ebs(builder.build())
  }

  public fun ebs(ebs: EbsOptions) {
    cdkBuilder.ebs(ebs)
  }

  public fun enableVersionUpgrade(enableVersionUpgrade: Boolean) {
    cdkBuilder.enableVersionUpgrade(enableVersionUpgrade)
  }

  public fun encryptionAtRest(block: EncryptionAtRestOptionsDsl.() -> Unit = {}) {
    val builder = EncryptionAtRestOptionsDsl()
    builder.apply(block)
    cdkBuilder.encryptionAtRest(builder.build())
  }

  public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions) {
    cdkBuilder.encryptionAtRest(encryptionAtRest)
  }

  public fun enforceHttps(enforceHttps: Boolean) {
    cdkBuilder.enforceHttps(enforceHttps)
  }

  public fun fineGrainedAccessControl(block: AdvancedSecurityOptionsDsl.() -> Unit = {}) {
    val builder = AdvancedSecurityOptionsDsl()
    builder.apply(block)
    cdkBuilder.fineGrainedAccessControl(builder.build())
  }

  public fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions) {
    cdkBuilder.fineGrainedAccessControl(fineGrainedAccessControl)
  }

  public fun logging(block: LoggingOptionsDsl.() -> Unit = {}) {
    val builder = LoggingOptionsDsl()
    builder.apply(block)
    cdkBuilder.logging(builder.build())
  }

  public fun logging(logging: LoggingOptions) {
    cdkBuilder.logging(logging)
  }

  public fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean) {
    cdkBuilder.nodeToNodeEncryption(nodeToNodeEncryption)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy) {
    cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy)
  }

  public fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean) {
    cdkBuilder.useUnsignedBasicAuth(useUnsignedBasicAuth)
  }

  public fun version(version: EngineVersion) {
    cdkBuilder.version(version)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun vpcSubnets(vpcSubnets: SubnetSelectionDsl.() -> Unit) {
    _vpcSubnets.add(SubnetSelectionDsl().apply(vpcSubnets).build())
  }

  public fun vpcSubnets(vpcSubnets: Collection<SubnetSelection>) {
    _vpcSubnets.addAll(vpcSubnets)
  }

  public fun zoneAwareness(block: ZoneAwarenessConfigDsl.() -> Unit = {}) {
    val builder = ZoneAwarenessConfigDsl()
    builder.apply(block)
    cdkBuilder.zoneAwareness(builder.build())
  }

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
