@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Domain internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.elasticsearch.Domain,
) : Resource(cdkObject), IDomain, IConnectable {
  @Deprecated(message = "deprecated in CDK")
  public open fun addAccessPolicies(accessPolicyStatements: PolicyStatement) {
    unwrap(this).addAccessPolicies(accessPolicyStatements.let(PolicyStatement::unwrap))
  }

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6e90405b47e9f3a2cae6574b6735d0a2154075d115d5b9b89af33d54588dd0dd")
  public open fun addAccessPolicies(accessPolicyStatements: PolicyStatement.Builder.() -> Unit):
      Unit = addAccessPolicies(PolicyStatement(accessPolicyStatements))

  @Deprecated(message = "deprecated in CDK")
  public open fun appLogGroup(): ILogGroup? = unwrap(this).getAppLogGroup()?.let(ILogGroup::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun auditLogGroup(): ILogGroup? =
      unwrap(this).getAuditLogGroup()?.let(ILogGroup::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun domainArn(): String = unwrap(this).getDomainArn()

  @Deprecated(message = "deprecated in CDK")
  public override fun domainEndpoint(): String = unwrap(this).getDomainEndpoint()

  @Deprecated(message = "deprecated in CDK")
  public override fun domainName(): String = unwrap(this).getDomainName()

  @Deprecated(message = "deprecated in CDK")
  public override fun grantIndexRead(index: String, identity: IGrantable): Grant =
      unwrap(this).grantIndexRead(index, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun grantIndexReadWrite(index: String, identity: IGrantable): Grant =
      unwrap(this).grantIndexReadWrite(index, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun grantIndexWrite(index: String, identity: IGrantable): Grant =
      unwrap(this).grantIndexWrite(index, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun grantPathRead(path: String, identity: IGrantable): Grant =
      unwrap(this).grantPathRead(path, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun grantPathReadWrite(path: String, identity: IGrantable): Grant =
      unwrap(this).grantPathReadWrite(path, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun grantPathWrite(path: String, identity: IGrantable): Grant =
      unwrap(this).grantPathWrite(path, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun grantRead(identity: IGrantable): Grant =
      unwrap(this).grantRead(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun grantReadWrite(identity: IGrantable): Grant =
      unwrap(this).grantReadWrite(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun grantWrite(identity: IGrantable): Grant =
      unwrap(this).grantWrite(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun masterUserPassword(): SecretValue? =
      unwrap(this).getMasterUserPassword()?.let(SecretValue::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun metricAutomatedSnapshotFailure(): Metric =
      unwrap(this).metricAutomatedSnapshotFailure().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricAutomatedSnapshotFailure(props: MetricOptions): Metric =
      unwrap(this).metricAutomatedSnapshotFailure(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9f702cdc4e375e8b739cdce26ff5c0a5606646a98edb39614863885f1182c7f")
  public override fun metricAutomatedSnapshotFailure(props: MetricOptions.Builder.() -> Unit):
      Metric = metricAutomatedSnapshotFailure(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun metricClusterIndexWritesBlocked(): Metric =
      unwrap(this).metricClusterIndexWritesBlocked().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricClusterIndexWritesBlocked(props: MetricOptions): Metric =
      unwrap(this).metricClusterIndexWritesBlocked(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("016b489514978517ae80814c783dc254d3f821a64ba427a0725fa9ed3e854018")
  public override fun metricClusterIndexWritesBlocked(props: MetricOptions.Builder.() -> Unit):
      Metric = metricClusterIndexWritesBlocked(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun metricClusterStatusRed(): Metric =
      unwrap(this).metricClusterStatusRed().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricClusterStatusRed(props: MetricOptions): Metric =
      unwrap(this).metricClusterStatusRed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e0926b5a2e18fffe32b1ec2076e81bbcc7d98107a425301c58fbc9d2905a860")
  public override fun metricClusterStatusRed(props: MetricOptions.Builder.() -> Unit): Metric =
      metricClusterStatusRed(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun metricClusterStatusYellow(): Metric =
      unwrap(this).metricClusterStatusYellow().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricClusterStatusYellow(props: MetricOptions): Metric =
      unwrap(this).metricClusterStatusYellow(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1ef39420c98f9d4cfefd45b8c2db0c21ea1a1e68a7c9b723df1412af465bda2f")
  public override fun metricClusterStatusYellow(props: MetricOptions.Builder.() -> Unit): Metric =
      metricClusterStatusYellow(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun metricCpuUtilization(): Metric =
      unwrap(this).metricCPUUtilization().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricCpuUtilization(props: MetricOptions): Metric =
      unwrap(this).metricCPUUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
  public override fun metricCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCpuUtilization(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun metricFreeStorageSpace(): Metric =
      unwrap(this).metricFreeStorageSpace().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricFreeStorageSpace(props: MetricOptions): Metric =
      unwrap(this).metricFreeStorageSpace(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("368af7ac3be4f10e672f08286b7e70f8633b6e9198d1685bfedc9108b3414e62")
  public override fun metricFreeStorageSpace(props: MetricOptions.Builder.() -> Unit): Metric =
      metricFreeStorageSpace(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun metricIndexingLatency(): Metric =
      unwrap(this).metricIndexingLatency().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricIndexingLatency(props: MetricOptions): Metric =
      unwrap(this).metricIndexingLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("07b87f2aa9d61ee51a0627ce9ffe82c5e5f6e38fef54d0ff7ab95be9c0731c15")
  public override fun metricIndexingLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIndexingLatency(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun metricJvmMemoryPressure(): Metric =
      unwrap(this).metricJVMMemoryPressure().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricJvmMemoryPressure(props: MetricOptions): Metric =
      unwrap(this).metricJVMMemoryPressure(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("283ffec8edbd9b28227078700405c8b7b7fe0f6bf433f6323ba9205b4c8a528f")
  public override fun metricJvmMemoryPressure(props: MetricOptions.Builder.() -> Unit): Metric =
      metricJvmMemoryPressure(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun metricKmsKeyError(): Metric =
      unwrap(this).metricKMSKeyError().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricKmsKeyError(props: MetricOptions): Metric =
      unwrap(this).metricKMSKeyError(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("309d28dee34b268d496bc1e8ba269d5bff9ec10e9e17132d9a884e208a805741")
  public override fun metricKmsKeyError(props: MetricOptions.Builder.() -> Unit): Metric =
      metricKmsKeyError(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun metricKmsKeyInaccessible(): Metric =
      unwrap(this).metricKMSKeyInaccessible().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricKmsKeyInaccessible(props: MetricOptions): Metric =
      unwrap(this).metricKMSKeyInaccessible(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bfca9e4cdc1ad37f6d57f9fdeb4258e1c6235ab92ed8224c8ee4cda359baaad6")
  public override fun metricKmsKeyInaccessible(props: MetricOptions.Builder.() -> Unit): Metric =
      metricKmsKeyInaccessible(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun metricMasterCpuUtilization(): Metric =
      unwrap(this).metricMasterCPUUtilization().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricMasterCpuUtilization(props: MetricOptions): Metric =
      unwrap(this).metricMasterCPUUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8a46b211229de3f431630b8ea4f99843647a1cab494f599c79138732a397c709")
  public override fun metricMasterCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricMasterCpuUtilization(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun metricMasterJvmMemoryPressure(): Metric =
      unwrap(this).metricMasterJVMMemoryPressure().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricMasterJvmMemoryPressure(props: MetricOptions): Metric =
      unwrap(this).metricMasterJVMMemoryPressure(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fbcf8e4882306bcb2bed673a80ed7a54a16cc27adfc1a7fe173fbb566b335350")
  public override fun metricMasterJvmMemoryPressure(props: MetricOptions.Builder.() -> Unit): Metric
      = metricMasterJvmMemoryPressure(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun metricNodes(): Metric = unwrap(this).metricNodes().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricNodes(props: MetricOptions): Metric =
      unwrap(this).metricNodes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("355f82e0d8db21f2bb54b9766182780100c904a3efcf3167fc2c3468c208268b")
  public override fun metricNodes(props: MetricOptions.Builder.() -> Unit): Metric =
      metricNodes(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun metricSearchLatency(): Metric =
      unwrap(this).metricSearchLatency().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricSearchLatency(props: MetricOptions): Metric =
      unwrap(this).metricSearchLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b37148931823e387018afa8190e3e362020aa1dc4211a32e63ee13acb1e89fd6")
  public override fun metricSearchLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSearchLatency(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public override fun metricSearchableDocuments(): Metric =
      unwrap(this).metricSearchableDocuments().let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  public override fun metricSearchableDocuments(props: MetricOptions): Metric =
      unwrap(this).metricSearchableDocuments(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("92e1cde4c44cd4a6f76bd4af6b9e03846698bfe485a039b042b4989c8258df65")
  public override fun metricSearchableDocuments(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSearchableDocuments(MetricOptions(props))

  @Deprecated(message = "deprecated in CDK")
  public open fun slowIndexLogGroup(): ILogGroup? =
      unwrap(this).getSlowIndexLogGroup()?.let(ILogGroup::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun slowSearchLogGroup(): ILogGroup? =
      unwrap(this).getSlowSearchLogGroup()?.let(ILogGroup::wrap)

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
    @JvmName("59e14073a9006bd9aeaad8d2850cb89744b0e955f399e88ba1685cdabccaeb27")
    public fun capacity(capacity: CapacityConfig.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e77ba00188f502ac0b1fec3045bd60bb5eaab1729f7f472ad993b3931ae38621")
    public fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun customEndpoint(customEndpoint: CustomEndpointOptions)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af3ea43edd5d3febe54a5bf205984de0f18909bbb989205ddb8fb384748a2113")
    public fun customEndpoint(customEndpoint: CustomEndpointOptions.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun domainName(domainName: String)

    @Deprecated(message = "deprecated in CDK")
    public fun ebs(ebs: EbsOptions)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11bec5fa51edd86c9862938613dd971392f6f600b8a5c2a986e7cb5d23e72ffb")
    public fun ebs(ebs: EbsOptions.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun enableVersionUpgrade(enableVersionUpgrade: Boolean)

    @Deprecated(message = "deprecated in CDK")
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39c79da56d51b0b0f8496ec80f422777fedcd43ef0d858a7d96a93e534e39d07")
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun enforceHttps(enforceHttps: Boolean)

    @Deprecated(message = "deprecated in CDK")
    public fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec0fdf74bda530bf2ff94955382fba11c1d03ef9a750aa65318408b998fb9a1e")
    public
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun logging(logging: LoggingOptions)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec98f1e9b529d8be1920cc8aa6cbbf7f15a8f26cf1c85a68ab20898f4afe5300")
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
    @JvmName("ac677fe381a681aa5cd4535a2ea000f9190ed75f54cb01c96f494d03ae426568")
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.Domain.Builder =
        software.amazon.awscdk.services.elasticsearch.Domain.Builder.create(scope, id)

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
    @JvmName("59e14073a9006bd9aeaad8d2850cb89744b0e955f399e88ba1685cdabccaeb27")
    override fun capacity(capacity: CapacityConfig.Builder.() -> Unit): Unit =
        capacity(CapacityConfig(capacity))

    @Deprecated(message = "deprecated in CDK")
    override fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions) {
      cdkBuilder.cognitoKibanaAuth(cognitoKibanaAuth.let(CognitoOptions::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e77ba00188f502ac0b1fec3045bd60bb5eaab1729f7f472ad993b3931ae38621")
    override fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions.Builder.() -> Unit): Unit =
        cognitoKibanaAuth(CognitoOptions(cognitoKibanaAuth))

    @Deprecated(message = "deprecated in CDK")
    override fun customEndpoint(customEndpoint: CustomEndpointOptions) {
      cdkBuilder.customEndpoint(customEndpoint.let(CustomEndpointOptions::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af3ea43edd5d3febe54a5bf205984de0f18909bbb989205ddb8fb384748a2113")
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
    @JvmName("11bec5fa51edd86c9862938613dd971392f6f600b8a5c2a986e7cb5d23e72ffb")
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
    @JvmName("39c79da56d51b0b0f8496ec80f422777fedcd43ef0d858a7d96a93e534e39d07")
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
    @JvmName("ec0fdf74bda530bf2ff94955382fba11c1d03ef9a750aa65318408b998fb9a1e")
    override
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit):
        Unit = fineGrainedAccessControl(AdvancedSecurityOptions(fineGrainedAccessControl))

    @Deprecated(message = "deprecated in CDK")
    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec98f1e9b529d8be1920cc8aa6cbbf7f15a8f26cf1c85a68ab20898f4afe5300")
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
    @JvmName("ac677fe381a681aa5cd4535a2ea000f9190ed75f54cb01c96f494d03ae426568")
    override fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig.Builder.() -> Unit): Unit =
        zoneAwareness(ZoneAwarenessConfig(zoneAwareness))

    public fun build(): software.amazon.awscdk.services.elasticsearch.Domain = cdkBuilder.build()
  }

  public companion object {
    @Deprecated(message = "deprecated in CDK")
    public fun fromDomainAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DomainAttributes,
    ): IDomain =
        software.amazon.awscdk.services.elasticsearch.Domain.fromDomainAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(DomainAttributes::unwrap)).let(IDomain::wrap)

    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6b6e823aacde4e5d3571a6a9ccbffa6b8ece4a042cd0d9720ea3333e125a72a")
    public fun fromDomainAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DomainAttributes.Builder.() -> Unit,
    ): IDomain = fromDomainAttributes(scope, id, DomainAttributes(attrs))

    @Deprecated(message = "deprecated in CDK")
    public fun fromDomainEndpoint(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      domainEndpoint: String,
    ): IDomain =
        software.amazon.awscdk.services.elasticsearch.Domain.fromDomainEndpoint(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, domainEndpoint).let(IDomain::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Domain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Domain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.Domain): Domain =
        Domain(cdkObject)

    internal fun unwrap(wrapped: Domain): software.amazon.awscdk.services.elasticsearch.Domain =
        wrapped.cdkObject
  }
}
