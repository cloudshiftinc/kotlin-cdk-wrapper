package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Domain internal constructor(
  private val cdkObject: software.amazon.awscdk.services.opensearchservice.Domain,
) : Resource(cdkObject), IDomain, IConnectable {
  public open fun addAccessPolicies(accessPolicyStatements: PolicyStatement) {
    unwrap(this).addAccessPolicies(accessPolicyStatements.let(PolicyStatement::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6e90405b47e9f3a2cae6574b6735d0a2154075d115d5b9b89af33d54588dd0dd")
  public open fun addAccessPolicies(accessPolicyStatements: PolicyStatement.Builder.() -> Unit):
      Unit = addAccessPolicies(PolicyStatement(accessPolicyStatements))

  public open fun appLogGroup(): ILogGroup? = unwrap(this).getAppLogGroup()?.let(ILogGroup::wrap)

  public open fun auditLogGroup(): ILogGroup? =
      unwrap(this).getAuditLogGroup()?.let(ILogGroup::wrap)

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public override fun domainArn(): String = unwrap(this).getDomainArn()

  public override fun domainEndpoint(): String = unwrap(this).getDomainEndpoint()

  public override fun domainId(): String = unwrap(this).getDomainId()

  public override fun domainName(): String = unwrap(this).getDomainName()

  public override fun grantIndexRead(index: String, identity: IGrantable): Grant =
      unwrap(this).grantIndexRead(index, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantIndexReadWrite(index: String, identity: IGrantable): Grant =
      unwrap(this).grantIndexReadWrite(index, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantIndexWrite(index: String, identity: IGrantable): Grant =
      unwrap(this).grantIndexWrite(index, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantPathRead(path: String, identity: IGrantable): Grant =
      unwrap(this).grantPathRead(path, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantPathReadWrite(path: String, identity: IGrantable): Grant =
      unwrap(this).grantPathReadWrite(path, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantPathWrite(path: String, identity: IGrantable): Grant =
      unwrap(this).grantPathWrite(path, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantRead(identity: IGrantable): Grant =
      unwrap(this).grantRead(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantReadWrite(identity: IGrantable): Grant =
      unwrap(this).grantReadWrite(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantWrite(identity: IGrantable): Grant =
      unwrap(this).grantWrite(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun masterUserPassword(): SecretValue? =
      unwrap(this).getMasterUserPassword()?.let(SecretValue::wrap)

  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public override fun metricAutomatedSnapshotFailure(): Metric =
      unwrap(this).metricAutomatedSnapshotFailure().let(Metric::wrap)

  public override fun metricAutomatedSnapshotFailure(props: MetricOptions): Metric =
      unwrap(this).metricAutomatedSnapshotFailure(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9f702cdc4e375e8b739cdce26ff5c0a5606646a98edb39614863885f1182c7f")
  public override fun metricAutomatedSnapshotFailure(props: MetricOptions.Builder.() -> Unit):
      Metric = metricAutomatedSnapshotFailure(MetricOptions(props))

  public override fun metricClusterIndexWritesBlocked(): Metric =
      unwrap(this).metricClusterIndexWritesBlocked().let(Metric::wrap)

  public override fun metricClusterIndexWritesBlocked(props: MetricOptions): Metric =
      unwrap(this).metricClusterIndexWritesBlocked(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("016b489514978517ae80814c783dc254d3f821a64ba427a0725fa9ed3e854018")
  public override fun metricClusterIndexWritesBlocked(props: MetricOptions.Builder.() -> Unit):
      Metric = metricClusterIndexWritesBlocked(MetricOptions(props))

  public override fun metricClusterStatusRed(): Metric =
      unwrap(this).metricClusterStatusRed().let(Metric::wrap)

  public override fun metricClusterStatusRed(props: MetricOptions): Metric =
      unwrap(this).metricClusterStatusRed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e0926b5a2e18fffe32b1ec2076e81bbcc7d98107a425301c58fbc9d2905a860")
  public override fun metricClusterStatusRed(props: MetricOptions.Builder.() -> Unit): Metric =
      metricClusterStatusRed(MetricOptions(props))

  public override fun metricClusterStatusYellow(): Metric =
      unwrap(this).metricClusterStatusYellow().let(Metric::wrap)

  public override fun metricClusterStatusYellow(props: MetricOptions): Metric =
      unwrap(this).metricClusterStatusYellow(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1ef39420c98f9d4cfefd45b8c2db0c21ea1a1e68a7c9b723df1412af465bda2f")
  public override fun metricClusterStatusYellow(props: MetricOptions.Builder.() -> Unit): Metric =
      metricClusterStatusYellow(MetricOptions(props))

  public override fun metricCpuUtilization(): Metric =
      unwrap(this).metricCPUUtilization().let(Metric::wrap)

  public override fun metricCpuUtilization(props: MetricOptions): Metric =
      unwrap(this).metricCPUUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
  public override fun metricCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCpuUtilization(MetricOptions(props))

  public override fun metricFreeStorageSpace(): Metric =
      unwrap(this).metricFreeStorageSpace().let(Metric::wrap)

  public override fun metricFreeStorageSpace(props: MetricOptions): Metric =
      unwrap(this).metricFreeStorageSpace(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("368af7ac3be4f10e672f08286b7e70f8633b6e9198d1685bfedc9108b3414e62")
  public override fun metricFreeStorageSpace(props: MetricOptions.Builder.() -> Unit): Metric =
      metricFreeStorageSpace(MetricOptions(props))

  public override fun metricIndexingLatency(): Metric =
      unwrap(this).metricIndexingLatency().let(Metric::wrap)

  public override fun metricIndexingLatency(props: MetricOptions): Metric =
      unwrap(this).metricIndexingLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("07b87f2aa9d61ee51a0627ce9ffe82c5e5f6e38fef54d0ff7ab95be9c0731c15")
  public override fun metricIndexingLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIndexingLatency(MetricOptions(props))

  public override fun metricJvmMemoryPressure(): Metric =
      unwrap(this).metricJVMMemoryPressure().let(Metric::wrap)

  public override fun metricJvmMemoryPressure(props: MetricOptions): Metric =
      unwrap(this).metricJVMMemoryPressure(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("283ffec8edbd9b28227078700405c8b7b7fe0f6bf433f6323ba9205b4c8a528f")
  public override fun metricJvmMemoryPressure(props: MetricOptions.Builder.() -> Unit): Metric =
      metricJvmMemoryPressure(MetricOptions(props))

  public override fun metricKmsKeyError(): Metric =
      unwrap(this).metricKMSKeyError().let(Metric::wrap)

  public override fun metricKmsKeyError(props: MetricOptions): Metric =
      unwrap(this).metricKMSKeyError(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("309d28dee34b268d496bc1e8ba269d5bff9ec10e9e17132d9a884e208a805741")
  public override fun metricKmsKeyError(props: MetricOptions.Builder.() -> Unit): Metric =
      metricKmsKeyError(MetricOptions(props))

  public override fun metricKmsKeyInaccessible(): Metric =
      unwrap(this).metricKMSKeyInaccessible().let(Metric::wrap)

  public override fun metricKmsKeyInaccessible(props: MetricOptions): Metric =
      unwrap(this).metricKMSKeyInaccessible(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bfca9e4cdc1ad37f6d57f9fdeb4258e1c6235ab92ed8224c8ee4cda359baaad6")
  public override fun metricKmsKeyInaccessible(props: MetricOptions.Builder.() -> Unit): Metric =
      metricKmsKeyInaccessible(MetricOptions(props))

  public override fun metricMasterCpuUtilization(): Metric =
      unwrap(this).metricMasterCPUUtilization().let(Metric::wrap)

  public override fun metricMasterCpuUtilization(props: MetricOptions): Metric =
      unwrap(this).metricMasterCPUUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8a46b211229de3f431630b8ea4f99843647a1cab494f599c79138732a397c709")
  public override fun metricMasterCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricMasterCpuUtilization(MetricOptions(props))

  public override fun metricMasterJvmMemoryPressure(): Metric =
      unwrap(this).metricMasterJVMMemoryPressure().let(Metric::wrap)

  public override fun metricMasterJvmMemoryPressure(props: MetricOptions): Metric =
      unwrap(this).metricMasterJVMMemoryPressure(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fbcf8e4882306bcb2bed673a80ed7a54a16cc27adfc1a7fe173fbb566b335350")
  public override fun metricMasterJvmMemoryPressure(props: MetricOptions.Builder.() -> Unit): Metric
      = metricMasterJvmMemoryPressure(MetricOptions(props))

  public override fun metricNodes(): Metric = unwrap(this).metricNodes().let(Metric::wrap)

  public override fun metricNodes(props: MetricOptions): Metric =
      unwrap(this).metricNodes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("355f82e0d8db21f2bb54b9766182780100c904a3efcf3167fc2c3468c208268b")
  public override fun metricNodes(props: MetricOptions.Builder.() -> Unit): Metric =
      metricNodes(MetricOptions(props))

  public override fun metricSearchLatency(): Metric =
      unwrap(this).metricSearchLatency().let(Metric::wrap)

  public override fun metricSearchLatency(props: MetricOptions): Metric =
      unwrap(this).metricSearchLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b37148931823e387018afa8190e3e362020aa1dc4211a32e63ee13acb1e89fd6")
  public override fun metricSearchLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSearchLatency(MetricOptions(props))

  public override fun metricSearchableDocuments(): Metric =
      unwrap(this).metricSearchableDocuments().let(Metric::wrap)

  public override fun metricSearchableDocuments(props: MetricOptions): Metric =
      unwrap(this).metricSearchableDocuments(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("92e1cde4c44cd4a6f76bd4af6b9e03846698bfe485a039b042b4989c8258df65")
  public override fun metricSearchableDocuments(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSearchableDocuments(MetricOptions(props))

  public open fun slowIndexLogGroup(): ILogGroup? =
      unwrap(this).getSlowIndexLogGroup()?.let(ILogGroup::wrap)

  public open fun slowSearchLogGroup(): ILogGroup? =
      unwrap(this).getSlowSearchLogGroup()?.let(ILogGroup::wrap)

  public interface Builder {
    public fun accessPolicies(accessPolicies: List<PolicyStatement>)

    public fun accessPolicies(vararg accessPolicies: PolicyStatement)

    public fun advancedOptions(advancedOptions: Map<String, String>)

    public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number)

    public fun capacity(capacity: CapacityConfig)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb8d74c2a2359f1247467c1c9f3c3b8807038d8d29874d5b8a5226c798f5ecb4")
    public fun capacity(capacity: CapacityConfig.Builder.() -> Unit)

    public fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b40b88bb2b5642cedd586a2f5164921ad12a322b47aeee942696cfd6a12c386c")
    public fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions.Builder.() -> Unit)

    public fun customEndpoint(customEndpoint: CustomEndpointOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11b448e2542eb89487142f42a1c4ed9ecbbe3c485df90f9d6065c04682326f0d")
    public fun customEndpoint(customEndpoint: CustomEndpointOptions.Builder.() -> Unit)

    public fun domainName(domainName: String)

    public fun ebs(ebs: EbsOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4e1783c9850be27b4f132cfae032260bbf496dcb0262bc181aea33aba8ffaee")
    public fun ebs(ebs: EbsOptions.Builder.() -> Unit)

    public fun enableAutoSoftwareUpdate(enableAutoSoftwareUpdate: Boolean)

    public fun enableVersionUpgrade(enableVersionUpgrade: Boolean)

    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9feb8a42d3d892f21ac29c9c1694e2318675187876431d4b36dc0e195a051192")
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions.Builder.() -> Unit)

    public fun enforceHttps(enforceHttps: Boolean)

    public fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("722a86d44552c2afeb3222fc9be0fa31a231bf68b4389fb93795473dcee7a8de")
    public
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit)

    public fun ipAddressType(ipAddressType: IpAddressType)

    public fun logging(logging: LoggingOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73acb45b2bb00b33f8c25bd9f52372ccb5eed12bd27b98bb5aac56ece854dc14")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    public fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean)

    public fun offPeakWindowEnabled(offPeakWindowEnabled: Boolean)

    public fun offPeakWindowStart(offPeakWindowStart: WindowStartTime)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2dfbed53a14ef4561fd1f46cf5d9bec3bb82d355a2bc031fcaa68494bd36aa2b")
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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93f7b70cd62c8b07dd4f4a432b1ea42e91d0b0858acd791223dd843a01403432")
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.Domain.Builder =
        software.amazon.awscdk.services.opensearchservice.Domain.Builder.create(scope, id)

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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb8d74c2a2359f1247467c1c9f3c3b8807038d8d29874d5b8a5226c798f5ecb4")
    override fun capacity(capacity: CapacityConfig.Builder.() -> Unit): Unit =
        capacity(CapacityConfig(capacity))

    override fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions) {
      cdkBuilder.cognitoDashboardsAuth(cognitoDashboardsAuth.let(CognitoOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b40b88bb2b5642cedd586a2f5164921ad12a322b47aeee942696cfd6a12c386c")
    override fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions.Builder.() -> Unit):
        Unit = cognitoDashboardsAuth(CognitoOptions(cognitoDashboardsAuth))

    override fun customEndpoint(customEndpoint: CustomEndpointOptions) {
      cdkBuilder.customEndpoint(customEndpoint.let(CustomEndpointOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11b448e2542eb89487142f42a1c4ed9ecbbe3c485df90f9d6065c04682326f0d")
    override fun customEndpoint(customEndpoint: CustomEndpointOptions.Builder.() -> Unit): Unit =
        customEndpoint(CustomEndpointOptions(customEndpoint))

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun ebs(ebs: EbsOptions) {
      cdkBuilder.ebs(ebs.let(EbsOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4e1783c9850be27b4f132cfae032260bbf496dcb0262bc181aea33aba8ffaee")
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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9feb8a42d3d892f21ac29c9c1694e2318675187876431d4b36dc0e195a051192")
    override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions.Builder.() -> Unit):
        Unit = encryptionAtRest(EncryptionAtRestOptions(encryptionAtRest))

    override fun enforceHttps(enforceHttps: Boolean) {
      cdkBuilder.enforceHttps(enforceHttps)
    }

    override fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions) {
      cdkBuilder.fineGrainedAccessControl(fineGrainedAccessControl.let(AdvancedSecurityOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("722a86d44552c2afeb3222fc9be0fa31a231bf68b4389fb93795473dcee7a8de")
    override
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit):
        Unit = fineGrainedAccessControl(AdvancedSecurityOptions(fineGrainedAccessControl))

    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType::unwrap))
    }

    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73acb45b2bb00b33f8c25bd9f52372ccb5eed12bd27b98bb5aac56ece854dc14")
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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2dfbed53a14ef4561fd1f46cf5d9bec3bb82d355a2bc031fcaa68494bd36aa2b")
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

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93f7b70cd62c8b07dd4f4a432b1ea42e91d0b0858acd791223dd843a01403432")
    override fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig.Builder.() -> Unit): Unit =
        zoneAwareness(ZoneAwarenessConfig(zoneAwareness))

    public fun build(): software.amazon.awscdk.services.opensearchservice.Domain =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromDomainAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DomainAttributes,
    ): IDomain =
        software.amazon.awscdk.services.opensearchservice.Domain.fromDomainAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(DomainAttributes::unwrap)).let(IDomain::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d069b497ff5e35048a465bc998136432cf9e92a7a0499ec774570c4479b322c")
    public open fun fromDomainAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DomainAttributes.Builder.() -> Unit,
    ): IDomain = fromDomainAttributes(scope, id, DomainAttributes(attrs))

    public open fun fromDomainEndpoint(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      domainEndpoint: String,
    ): IDomain =
        software.amazon.awscdk.services.opensearchservice.Domain.fromDomainEndpoint(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, domainEndpoint).let(IDomain::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Domain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Domain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.Domain): Domain =
        Domain(cdkObject)

    internal fun unwrap(wrapped: Domain): software.amazon.awscdk.services.opensearchservice.Domain =
        wrapped.cdkObject
  }
}
