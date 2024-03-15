@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface DomainProps {
  public fun accessPolicies(): List<PolicyStatement> =
      unwrap(this).getAccessPolicies()?.map(PolicyStatement::wrap) ?: emptyList()

  public fun advancedOptions(): Map<String, String> = unwrap(this).getAdvancedOptions() ?:
      emptyMap()

  public fun automatedSnapshotStartHour(): Number? = unwrap(this).getAutomatedSnapshotStartHour()

  public fun capacity(): CapacityConfig? = unwrap(this).getCapacity()?.let(CapacityConfig::wrap)

  public fun cognitoDashboardsAuth(): CognitoOptions? =
      unwrap(this).getCognitoDashboardsAuth()?.let(CognitoOptions::wrap)

  public fun customEndpoint(): CustomEndpointOptions? =
      unwrap(this).getCustomEndpoint()?.let(CustomEndpointOptions::wrap)

  public fun domainName(): String? = unwrap(this).getDomainName()

  public fun ebs(): EbsOptions? = unwrap(this).getEbs()?.let(EbsOptions::wrap)

  public fun enableAutoSoftwareUpdate(): Boolean? = unwrap(this).getEnableAutoSoftwareUpdate()

  public fun enableVersionUpgrade(): Boolean? = unwrap(this).getEnableVersionUpgrade()

  public fun encryptionAtRest(): EncryptionAtRestOptions? =
      unwrap(this).getEncryptionAtRest()?.let(EncryptionAtRestOptions::wrap)

  public fun enforceHttps(): Boolean? = unwrap(this).getEnforceHttps()

  public fun fineGrainedAccessControl(): AdvancedSecurityOptions? =
      unwrap(this).getFineGrainedAccessControl()?.let(AdvancedSecurityOptions::wrap)

  public fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  public fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

  public fun nodeToNodeEncryption(): Boolean? = unwrap(this).getNodeToNodeEncryption()

  public fun offPeakWindowEnabled(): Boolean? = unwrap(this).getOffPeakWindowEnabled()

  public fun offPeakWindowStart(): WindowStartTime? =
      unwrap(this).getOffPeakWindowStart()?.let(WindowStartTime::wrap)

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun suppressLogsResourcePolicy(): Boolean? = unwrap(this).getSuppressLogsResourcePolicy()

  public fun tlsSecurityPolicy(): TLSSecurityPolicy? =
      unwrap(this).getTlsSecurityPolicy()?.let(TLSSecurityPolicy::wrap)

  public fun useUnsignedBasicAuth(): Boolean? = unwrap(this).getUseUnsignedBasicAuth()

  public fun version(): EngineVersion

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public fun vpcSubnets(): List<SubnetSelection> =
      unwrap(this).getVpcSubnets()?.map(SubnetSelection::wrap) ?: emptyList()

  public fun zoneAwareness(): ZoneAwarenessConfig? =
      unwrap(this).getZoneAwareness()?.let(ZoneAwarenessConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun accessPolicies(accessPolicies: List<PolicyStatement>)

    public fun accessPolicies(vararg accessPolicies: PolicyStatement)

    public fun advancedOptions(advancedOptions: Map<String, String>)

    public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number)

    public fun capacity(capacity: CapacityConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d17b221e87d243df16c7252c6ebb457f876efd1c16e0fc27b4390f1c30df304b")
    public fun capacity(capacity: CapacityConfig.Builder.() -> Unit)

    public fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7b0909f0598e484969e326b739d47118b07ab6ec85c8226ca4af46f560057a7")
    public fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions.Builder.() -> Unit)

    public fun customEndpoint(customEndpoint: CustomEndpointOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdf5b2d75b35bcdddb04ffe29da4de4c9e4bf733b565a995741a0537ac14a7b9")
    public fun customEndpoint(customEndpoint: CustomEndpointOptions.Builder.() -> Unit)

    public fun domainName(domainName: String)

    public fun ebs(ebs: EbsOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9001bb79f0578857cecc95ce96cf807ea71335c7e4d4e8c72e2c6221420d13b0")
    public fun ebs(ebs: EbsOptions.Builder.() -> Unit)

    public fun enableAutoSoftwareUpdate(enableAutoSoftwareUpdate: Boolean)

    public fun enableVersionUpgrade(enableVersionUpgrade: Boolean)

    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed3218d8f8662ab49b5919a4e80ec6ccb6b765caa314fdef579be7c881f5c5c9")
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions.Builder.() -> Unit)

    public fun enforceHttps(enforceHttps: Boolean)

    public fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0451d562325cd4aabdf0096513de3e8ffcba6027563de5d5fb19f0f1190359f5")
    public
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit)

    public fun ipAddressType(ipAddressType: IpAddressType)

    public fun logging(logging: LoggingOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18c4305abd171c7ac1ab935481ae51bb0128240a90888efbfc49e28faef3f3d7")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    public fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean)

    public fun offPeakWindowEnabled(offPeakWindowEnabled: Boolean)

    public fun offPeakWindowStart(offPeakWindowStart: WindowStartTime)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a7241b81db94838055df7bc3fb613e6fbbe54d245153be4d536750027c8d210")
    public fun offPeakWindowStart(offPeakWindowStart: WindowStartTime.Builder.() -> Unit)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun suppressLogsResourcePolicy(suppressLogsResourcePolicy: Boolean)

    public fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy)

    public fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean)

    public fun version(version: EngineVersion)

    public fun vpc(vpc: IVpc)

    public fun vpcSubnets(vpcSubnets: List<SubnetSelection>)

    public fun vpcSubnets(vararg vpcSubnets: SubnetSelection)

    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("405ef68e0f28476fbc594af980692b73b8b213552bcce55e1e8ac5a96a025481")
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.DomainProps.Builder =
        software.amazon.awscdk.services.opensearchservice.DomainProps.builder()

    override fun accessPolicies(accessPolicies: List<PolicyStatement>) {
      cdkBuilder.accessPolicies(accessPolicies.map(PolicyStatement::unwrap))
    }

    override fun accessPolicies(vararg accessPolicies: PolicyStatement): Unit =
        accessPolicies(accessPolicies.toList())

    override fun advancedOptions(advancedOptions: Map<String, String>) {
      cdkBuilder.advancedOptions(advancedOptions)
    }

    override fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
      cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
    }

    override fun capacity(capacity: CapacityConfig) {
      cdkBuilder.capacity(capacity.let(CapacityConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d17b221e87d243df16c7252c6ebb457f876efd1c16e0fc27b4390f1c30df304b")
    override fun capacity(capacity: CapacityConfig.Builder.() -> Unit): Unit =
        capacity(CapacityConfig(capacity))

    override fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions) {
      cdkBuilder.cognitoDashboardsAuth(cognitoDashboardsAuth.let(CognitoOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7b0909f0598e484969e326b739d47118b07ab6ec85c8226ca4af46f560057a7")
    override fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions.Builder.() -> Unit):
        Unit = cognitoDashboardsAuth(CognitoOptions(cognitoDashboardsAuth))

    override fun customEndpoint(customEndpoint: CustomEndpointOptions) {
      cdkBuilder.customEndpoint(customEndpoint.let(CustomEndpointOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdf5b2d75b35bcdddb04ffe29da4de4c9e4bf733b565a995741a0537ac14a7b9")
    override fun customEndpoint(customEndpoint: CustomEndpointOptions.Builder.() -> Unit): Unit =
        customEndpoint(CustomEndpointOptions(customEndpoint))

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun ebs(ebs: EbsOptions) {
      cdkBuilder.ebs(ebs.let(EbsOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9001bb79f0578857cecc95ce96cf807ea71335c7e4d4e8c72e2c6221420d13b0")
    override fun ebs(ebs: EbsOptions.Builder.() -> Unit): Unit = ebs(EbsOptions(ebs))

    override fun enableAutoSoftwareUpdate(enableAutoSoftwareUpdate: Boolean) {
      cdkBuilder.enableAutoSoftwareUpdate(enableAutoSoftwareUpdate)
    }

    override fun enableVersionUpgrade(enableVersionUpgrade: Boolean) {
      cdkBuilder.enableVersionUpgrade(enableVersionUpgrade)
    }

    override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions) {
      cdkBuilder.encryptionAtRest(encryptionAtRest.let(EncryptionAtRestOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed3218d8f8662ab49b5919a4e80ec6ccb6b765caa314fdef579be7c881f5c5c9")
    override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions.Builder.() -> Unit):
        Unit = encryptionAtRest(EncryptionAtRestOptions(encryptionAtRest))

    override fun enforceHttps(enforceHttps: Boolean) {
      cdkBuilder.enforceHttps(enforceHttps)
    }

    override fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions) {
      cdkBuilder.fineGrainedAccessControl(fineGrainedAccessControl.let(AdvancedSecurityOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0451d562325cd4aabdf0096513de3e8ffcba6027563de5d5fb19f0f1190359f5")
    override
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit):
        Unit = fineGrainedAccessControl(AdvancedSecurityOptions(fineGrainedAccessControl))

    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType::unwrap))
    }

    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18c4305abd171c7ac1ab935481ae51bb0128240a90888efbfc49e28faef3f3d7")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

    override fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean) {
      cdkBuilder.nodeToNodeEncryption(nodeToNodeEncryption)
    }

    override fun offPeakWindowEnabled(offPeakWindowEnabled: Boolean) {
      cdkBuilder.offPeakWindowEnabled(offPeakWindowEnabled)
    }

    override fun offPeakWindowStart(offPeakWindowStart: WindowStartTime) {
      cdkBuilder.offPeakWindowStart(offPeakWindowStart.let(WindowStartTime::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a7241b81db94838055df7bc3fb613e6fbbe54d245153be4d536750027c8d210")
    override fun offPeakWindowStart(offPeakWindowStart: WindowStartTime.Builder.() -> Unit): Unit =
        offPeakWindowStart(WindowStartTime(offPeakWindowStart))

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun suppressLogsResourcePolicy(suppressLogsResourcePolicy: Boolean) {
      cdkBuilder.suppressLogsResourcePolicy(suppressLogsResourcePolicy)
    }

    override fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy) {
      cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy.let(TLSSecurityPolicy::unwrap))
    }

    override fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean) {
      cdkBuilder.useUnsignedBasicAuth(useUnsignedBasicAuth)
    }

    override fun version(version: EngineVersion) {
      cdkBuilder.version(version.let(EngineVersion::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcSubnets(vpcSubnets: List<SubnetSelection>) {
      cdkBuilder.vpcSubnets(vpcSubnets.map(SubnetSelection::unwrap))
    }

    override fun vpcSubnets(vararg vpcSubnets: SubnetSelection): Unit =
        vpcSubnets(vpcSubnets.toList())

    override fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig) {
      cdkBuilder.zoneAwareness(zoneAwareness.let(ZoneAwarenessConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("405ef68e0f28476fbc594af980692b73b8b213552bcce55e1e8ac5a96a025481")
    override fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig.Builder.() -> Unit): Unit =
        zoneAwareness(ZoneAwarenessConfig(zoneAwareness))

    public fun build(): software.amazon.awscdk.services.opensearchservice.DomainProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.opensearchservice.DomainProps,
  ) : CdkObject(cdkObject), DomainProps {
    override fun accessPolicies(): List<PolicyStatement> =
        unwrap(this).getAccessPolicies()?.map(PolicyStatement::wrap) ?: emptyList()

    override fun advancedOptions(): Map<String, String> = unwrap(this).getAdvancedOptions() ?:
        emptyMap()

    override fun automatedSnapshotStartHour(): Number? =
        unwrap(this).getAutomatedSnapshotStartHour()

    override fun capacity(): CapacityConfig? = unwrap(this).getCapacity()?.let(CapacityConfig::wrap)

    override fun cognitoDashboardsAuth(): CognitoOptions? =
        unwrap(this).getCognitoDashboardsAuth()?.let(CognitoOptions::wrap)

    override fun customEndpoint(): CustomEndpointOptions? =
        unwrap(this).getCustomEndpoint()?.let(CustomEndpointOptions::wrap)

    override fun domainName(): String? = unwrap(this).getDomainName()

    override fun ebs(): EbsOptions? = unwrap(this).getEbs()?.let(EbsOptions::wrap)

    override fun enableAutoSoftwareUpdate(): Boolean? = unwrap(this).getEnableAutoSoftwareUpdate()

    override fun enableVersionUpgrade(): Boolean? = unwrap(this).getEnableVersionUpgrade()

    override fun encryptionAtRest(): EncryptionAtRestOptions? =
        unwrap(this).getEncryptionAtRest()?.let(EncryptionAtRestOptions::wrap)

    override fun enforceHttps(): Boolean? = unwrap(this).getEnforceHttps()

    override fun fineGrainedAccessControl(): AdvancedSecurityOptions? =
        unwrap(this).getFineGrainedAccessControl()?.let(AdvancedSecurityOptions::wrap)

    override fun ipAddressType(): IpAddressType? =
        unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

    override fun logging(): LoggingOptions? = unwrap(this).getLogging()?.let(LoggingOptions::wrap)

    override fun nodeToNodeEncryption(): Boolean? = unwrap(this).getNodeToNodeEncryption()

    override fun offPeakWindowEnabled(): Boolean? = unwrap(this).getOffPeakWindowEnabled()

    override fun offPeakWindowStart(): WindowStartTime? =
        unwrap(this).getOffPeakWindowStart()?.let(WindowStartTime::wrap)

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun suppressLogsResourcePolicy(): Boolean? =
        unwrap(this).getSuppressLogsResourcePolicy()

    override fun tlsSecurityPolicy(): TLSSecurityPolicy? =
        unwrap(this).getTlsSecurityPolicy()?.let(TLSSecurityPolicy::wrap)

    override fun useUnsignedBasicAuth(): Boolean? = unwrap(this).getUseUnsignedBasicAuth()

    override fun version(): EngineVersion = unwrap(this).getVersion().let(EngineVersion::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

    override fun vpcSubnets(): List<SubnetSelection> =
        unwrap(this).getVpcSubnets()?.map(SubnetSelection::wrap) ?: emptyList()

    override fun zoneAwareness(): ZoneAwarenessConfig? =
        unwrap(this).getZoneAwareness()?.let(ZoneAwarenessConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.DomainProps):
        DomainProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DomainProps):
        software.amazon.awscdk.services.opensearchservice.DomainProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.opensearchservice.DomainProps
  }
}
