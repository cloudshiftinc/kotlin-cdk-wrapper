@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

public interface DomainProps {
  @Deprecated(message = "deprecated in CDK")
  public fun accessPolicies(): List<PolicyStatement> =
      unwrap(this).getAccessPolicies()?.map(PolicyStatement::wrap) ?: emptyList()

  @Deprecated(message = "deprecated in CDK")
  public fun advancedOptions(): Map<String, String> = unwrap(this).getAdvancedOptions() ?:
      emptyMap()

  @Deprecated(message = "deprecated in CDK")
  public fun automatedSnapshotStartHour(): Number? = unwrap(this).getAutomatedSnapshotStartHour()

  @Deprecated(message = "deprecated in CDK")
  public fun capacity(): CapacityConfig? = unwrap(this).getCapacity()?.let(CapacityConfig::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun cognitoKibanaAuth(): CognitoOptions? =
      unwrap(this).getCognitoKibanaAuth()?.let(CognitoOptions::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun customEndpoint(): CustomEndpointOptions? =
      unwrap(this).getCustomEndpoint()?.let(CustomEndpointOptions::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun domainName(): String? = unwrap(this).getDomainName()

  @Deprecated(message = "deprecated in CDK")
  public fun ebs(): EbsOptions? = unwrap(this).getEbs()?.let(EbsOptions::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun enableVersionUpgrade(): Boolean? = unwrap(this).getEnableVersionUpgrade()

  @Deprecated(message = "deprecated in CDK")
  public fun encryptionAtRest(): EncryptionAtRestOptions? =
      unwrap(this).getEncryptionAtRest()?.let(EncryptionAtRestOptions::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun enforceHttps(): Boolean? = unwrap(this).getEnforceHttps()

  @Deprecated(message = "deprecated in CDK")
  public fun fineGrainedAccessControl(): AdvancedSecurityOptions? =
      unwrap(this).getFineGrainedAccessControl()?.let(AdvancedSecurityOptions::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun nodeToNodeEncryption(): Boolean? = unwrap(this).getNodeToNodeEncryption()

  @Deprecated(message = "deprecated in CDK")
  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  @Deprecated(message = "deprecated in CDK")
  public fun tlsSecurityPolicy(): TLSSecurityPolicy? =
      unwrap(this).getTlsSecurityPolicy()?.let(TLSSecurityPolicy::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun useUnsignedBasicAuth(): Boolean? = unwrap(this).getUseUnsignedBasicAuth()

  @Deprecated(message = "deprecated in CDK")
  public fun version(): ElasticsearchVersion

  @Deprecated(message = "deprecated in CDK")
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun vpcSubnets(): List<SubnetSelection> =
      unwrap(this).getVpcSubnets()?.map(SubnetSelection::wrap) ?: emptyList()

  @Deprecated(message = "deprecated in CDK")
  public fun zoneAwareness(): ZoneAwarenessConfig? =
      unwrap(this).getZoneAwareness()?.let(ZoneAwarenessConfig::wrap)

  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun accessPolicies(accessPolicies: List<PolicyStatement>)

    @Deprecated(message = "deprecated in CDK")
    public fun accessPolicies(vararg accessPolicies: PolicyStatement)

    @Deprecated(message = "deprecated in CDK")
    public fun advancedOptions(advancedOptions: Map<String, String>)

    @Deprecated(message = "deprecated in CDK")
    public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number)

    @Deprecated(message = "deprecated in CDK")
    public fun capacity(capacity: CapacityConfig)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b109cdbf131e5550be3edc0e2a9f9c5d3b0806ad4a2b12b80d47266879481b93")
    public fun capacity(capacity: CapacityConfig.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f13e7dab868f11aff645edf400035e30cf13e128d35cf1f2a6662a18b56c6b05")
    public fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun customEndpoint(customEndpoint: CustomEndpointOptions)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c50c1635eb80ee23c1e091e711750a47de582b0aac4fa60cc6786e22aae2639")
    public fun customEndpoint(customEndpoint: CustomEndpointOptions.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun domainName(domainName: String)

    @Deprecated(message = "deprecated in CDK")
    public fun ebs(ebs: EbsOptions)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d97c189489a69fc31417451f8f3508a1b26b53571043e87cbc8245fd61e76ad9")
    public fun ebs(ebs: EbsOptions.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun enableVersionUpgrade(enableVersionUpgrade: Boolean)

    @Deprecated(message = "deprecated in CDK")
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24b48c9a456533b4cae5ca0aca64321babe6a0fccf60c04c4f7214842d7ca6bf")
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun enforceHttps(enforceHttps: Boolean)

    @Deprecated(message = "deprecated in CDK")
    public fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7b6f8887a21f8027f7c6f1fd8b7b8ffdd5f60a87ee502da105c9d57077b3dc8")
    public
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun logging(logging: LoggingOptions)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aba05d229e9246f738f24266f5f3add48200e93225fc0d664a2502ceb2db1738")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean)

    @Deprecated(message = "deprecated in CDK")
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    @Deprecated(message = "deprecated in CDK")
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    @Deprecated(message = "deprecated in CDK")
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    @Deprecated(message = "deprecated in CDK")
    public fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy)

    @Deprecated(message = "deprecated in CDK")
    public fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean)

    @Deprecated(message = "deprecated in CDK")
    public fun version(version: ElasticsearchVersion)

    @Deprecated(message = "deprecated in CDK")
    public fun vpc(vpc: IVpc)

    @Deprecated(message = "deprecated in CDK")
    public fun vpcSubnets(vpcSubnets: List<SubnetSelection>)

    @Deprecated(message = "deprecated in CDK")
    public fun vpcSubnets(vararg vpcSubnets: SubnetSelection)

    @Deprecated(message = "deprecated in CDK")
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6934866c54ce1ccd7109cd9eb1ec07b2163effc425b9437f5591a2879146a443")
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.DomainProps.Builder =
        software.amazon.awscdk.services.elasticsearch.DomainProps.builder()

    @Deprecated(message = "deprecated in CDK")
    override fun accessPolicies(accessPolicies: List<PolicyStatement>) {
      cdkBuilder.accessPolicies(accessPolicies.map(PolicyStatement::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun accessPolicies(vararg accessPolicies: PolicyStatement): Unit =
        accessPolicies(accessPolicies.toList())

    @Deprecated(message = "deprecated in CDK")
    override fun advancedOptions(advancedOptions: Map<String, String>) {
      cdkBuilder.advancedOptions(advancedOptions)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
      cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun capacity(capacity: CapacityConfig) {
      cdkBuilder.capacity(capacity.let(CapacityConfig::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b109cdbf131e5550be3edc0e2a9f9c5d3b0806ad4a2b12b80d47266879481b93")
    override fun capacity(capacity: CapacityConfig.Builder.() -> Unit): Unit =
        capacity(CapacityConfig(capacity))

    @Deprecated(message = "deprecated in CDK")
    override fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions) {
      cdkBuilder.cognitoKibanaAuth(cognitoKibanaAuth.let(CognitoOptions::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f13e7dab868f11aff645edf400035e30cf13e128d35cf1f2a6662a18b56c6b05")
    override fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions.Builder.() -> Unit): Unit =
        cognitoKibanaAuth(CognitoOptions(cognitoKibanaAuth))

    @Deprecated(message = "deprecated in CDK")
    override fun customEndpoint(customEndpoint: CustomEndpointOptions) {
      cdkBuilder.customEndpoint(customEndpoint.let(CustomEndpointOptions::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c50c1635eb80ee23c1e091e711750a47de582b0aac4fa60cc6786e22aae2639")
    override fun customEndpoint(customEndpoint: CustomEndpointOptions.Builder.() -> Unit): Unit =
        customEndpoint(CustomEndpointOptions(customEndpoint))

    @Deprecated(message = "deprecated in CDK")
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun ebs(ebs: EbsOptions) {
      cdkBuilder.ebs(ebs.let(EbsOptions::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d97c189489a69fc31417451f8f3508a1b26b53571043e87cbc8245fd61e76ad9")
    override fun ebs(ebs: EbsOptions.Builder.() -> Unit): Unit = ebs(EbsOptions(ebs))

    @Deprecated(message = "deprecated in CDK")
    override fun enableVersionUpgrade(enableVersionUpgrade: Boolean) {
      cdkBuilder.enableVersionUpgrade(enableVersionUpgrade)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions) {
      cdkBuilder.encryptionAtRest(encryptionAtRest.let(EncryptionAtRestOptions::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24b48c9a456533b4cae5ca0aca64321babe6a0fccf60c04c4f7214842d7ca6bf")
    override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions.Builder.() -> Unit):
        Unit = encryptionAtRest(EncryptionAtRestOptions(encryptionAtRest))

    @Deprecated(message = "deprecated in CDK")
    override fun enforceHttps(enforceHttps: Boolean) {
      cdkBuilder.enforceHttps(enforceHttps)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions) {
      cdkBuilder.fineGrainedAccessControl(fineGrainedAccessControl.let(AdvancedSecurityOptions::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7b6f8887a21f8027f7c6f1fd8b7b8ffdd5f60a87ee502da105c9d57077b3dc8")
    override
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit):
        Unit = fineGrainedAccessControl(AdvancedSecurityOptions(fineGrainedAccessControl))

    @Deprecated(message = "deprecated in CDK")
    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aba05d229e9246f738f24266f5f3add48200e93225fc0d664a2502ceb2db1738")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

    @Deprecated(message = "deprecated in CDK")
    override fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean) {
      cdkBuilder.nodeToNodeEncryption(nodeToNodeEncryption)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    @Deprecated(message = "deprecated in CDK")
    override fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy) {
      cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy.let(TLSSecurityPolicy::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean) {
      cdkBuilder.useUnsignedBasicAuth(useUnsignedBasicAuth)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun version(version: ElasticsearchVersion) {
      cdkBuilder.version(version.let(ElasticsearchVersion::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun vpcSubnets(vpcSubnets: List<SubnetSelection>) {
      cdkBuilder.vpcSubnets(vpcSubnets.map(SubnetSelection::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun vpcSubnets(vararg vpcSubnets: SubnetSelection): Unit =
        vpcSubnets(vpcSubnets.toList())

    @Deprecated(message = "deprecated in CDK")
    override fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig) {
      cdkBuilder.zoneAwareness(zoneAwareness.let(ZoneAwarenessConfig::unwrap))
    }

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
    @Deprecated(message = "deprecated in CDK")
    override fun accessPolicies(): List<PolicyStatement> =
        unwrap(this).getAccessPolicies()?.map(PolicyStatement::wrap) ?: emptyList()

    @Deprecated(message = "deprecated in CDK")
    override fun advancedOptions(): Map<String, String> = unwrap(this).getAdvancedOptions() ?:
        emptyMap()

    @Deprecated(message = "deprecated in CDK")
    override fun automatedSnapshotStartHour(): Number? =
        unwrap(this).getAutomatedSnapshotStartHour()

    @Deprecated(message = "deprecated in CDK")
    override fun capacity(): CapacityConfig? = unwrap(this).getCapacity()?.let(CapacityConfig::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun cognitoKibanaAuth(): CognitoOptions? =
        unwrap(this).getCognitoKibanaAuth()?.let(CognitoOptions::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun customEndpoint(): CustomEndpointOptions? =
        unwrap(this).getCustomEndpoint()?.let(CustomEndpointOptions::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun domainName(): String? = unwrap(this).getDomainName()

    @Deprecated(message = "deprecated in CDK")
    override fun ebs(): EbsOptions? = unwrap(this).getEbs()?.let(EbsOptions::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun enableVersionUpgrade(): Boolean? = unwrap(this).getEnableVersionUpgrade()

    @Deprecated(message = "deprecated in CDK")
    override fun encryptionAtRest(): EncryptionAtRestOptions? =
        unwrap(this).getEncryptionAtRest()?.let(EncryptionAtRestOptions::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun enforceHttps(): Boolean? = unwrap(this).getEnforceHttps()

    @Deprecated(message = "deprecated in CDK")
    override fun fineGrainedAccessControl(): AdvancedSecurityOptions? =
        unwrap(this).getFineGrainedAccessControl()?.let(AdvancedSecurityOptions::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun nodeToNodeEncryption(): Boolean? = unwrap(this).getNodeToNodeEncryption()

    @Deprecated(message = "deprecated in CDK")
    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    @Deprecated(message = "deprecated in CDK")
    override fun tlsSecurityPolicy(): TLSSecurityPolicy? =
        unwrap(this).getTlsSecurityPolicy()?.let(TLSSecurityPolicy::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun useUnsignedBasicAuth(): Boolean? = unwrap(this).getUseUnsignedBasicAuth()

    @Deprecated(message = "deprecated in CDK")
    override fun version(): ElasticsearchVersion =
        unwrap(this).getVersion().let(ElasticsearchVersion::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun vpcSubnets(): List<SubnetSelection> =
        unwrap(this).getVpcSubnets()?.map(SubnetSelection::wrap) ?: emptyList()

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
        DomainProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainProps):
        software.amazon.awscdk.services.elasticsearch.DomainProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.elasticsearch.DomainProps
  }
}
