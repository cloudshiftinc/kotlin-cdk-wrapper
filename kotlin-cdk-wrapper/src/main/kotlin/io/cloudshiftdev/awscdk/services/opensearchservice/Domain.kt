@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Provides an Amazon OpenSearch Service domain.
 *
 * Example:
 *
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
public open class Domain(
  cdkObject: software.amazon.awscdk.services.opensearchservice.Domain,
) : Resource(cdkObject), IDomain, IConnectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DomainProps,
  ) :
      this(software.amazon.awscdk.services.opensearchservice.Domain(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(DomainProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DomainProps.Builder.() -> Unit,
  ) : this(scope, id, DomainProps(props)
  )

  /**
   * Add policy statements to the domain access policy.
   *
   * @param accessPolicyStatements 
   */
  public open fun addAccessPolicies(vararg accessPolicyStatements: PolicyStatement) {
    unwrap(this).addAccessPolicies(*accessPolicyStatements.map(PolicyStatement::unwrap).toTypedArray())
  }

  /**
   * Add policy statements to the domain access policy.
   *
   * @param accessPolicyStatements 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6e90405b47e9f3a2cae6574b6735d0a2154075d115d5b9b89af33d54588dd0dd")
  public open fun addAccessPolicies(accessPolicyStatements: PolicyStatement.Builder.() -> Unit):
      Unit = addAccessPolicies(PolicyStatement(accessPolicyStatements))

  /**
   * Log group that application logs are logged to.
   */
  public open fun appLogGroup(): ILogGroup? = unwrap(this).getAppLogGroup()?.let(ILogGroup::wrap)

  /**
   * Log group that audit logs are logged to.
   */
  public open fun auditLogGroup(): ILogGroup? =
      unwrap(this).getAuditLogGroup()?.let(ILogGroup::wrap)

  /**
   * Manages network connections to the domain.
   *
   * This will throw an error in case the domain
   * is not placed inside a VPC.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * Arn of the Amazon OpenSearch Service domain.
   */
  public override fun domainArn(): String = unwrap(this).getDomainArn()

  /**
   * Endpoint of the Amazon OpenSearch Service domain.
   */
  public override fun domainEndpoint(): String = unwrap(this).getDomainEndpoint()

  /**
   * Identifier of the Amazon OpenSearch Service domain.
   */
  public override fun domainId(): String = unwrap(this).getDomainId()

  /**
   * Domain name of the Amazon OpenSearch Service domain.
   */
  public override fun domainName(): String = unwrap(this).getDomainName()

  /**
   * Grant read permissions for an index in this domain to an IAM principal (Role/Group/User).
   *
   * @param index The index to grant permissions for. 
   * @param identity The principal. 
   */
  public override fun grantIndexRead(index: String, identity: IGrantable): Grant =
      unwrap(this).grantIndexRead(index, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant read/write permissions for an index in this domain to an IAM principal (Role/Group/User).
   *
   * @param index The index to grant permissions for. 
   * @param identity The principal. 
   */
  public override fun grantIndexReadWrite(index: String, identity: IGrantable): Grant =
      unwrap(this).grantIndexReadWrite(index, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant write permissions for an index in this domain to an IAM principal (Role/Group/User).
   *
   * @param index The index to grant permissions for. 
   * @param identity The principal. 
   */
  public override fun grantIndexWrite(index: String, identity: IGrantable): Grant =
      unwrap(this).grantIndexWrite(index, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant read permissions for a specific path in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @param path The path to grant permissions for. 
   * @param identity The principal. 
   */
  public override fun grantPathRead(path: String, identity: IGrantable): Grant =
      unwrap(this).grantPathRead(path, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant read/write permissions for a specific path in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @param path The path to grant permissions for. 
   * @param identity The principal. 
   */
  public override fun grantPathReadWrite(path: String, identity: IGrantable): Grant =
      unwrap(this).grantPathReadWrite(path, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant write permissions for a specific path in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @param path The path to grant permissions for. 
   * @param identity The principal. 
   */
  public override fun grantPathWrite(path: String, identity: IGrantable): Grant =
      unwrap(this).grantPathWrite(path, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant read permissions for this domain and its contents to an IAM principal (Role/Group/User).
   *
   * @param identity The principal. 
   */
  public override fun grantRead(identity: IGrantable): Grant =
      unwrap(this).grantRead(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant read/write permissions for this domain and its contents to an IAM principal
   * (Role/Group/User).
   *
   * @param identity The principal. 
   */
  public override fun grantReadWrite(identity: IGrantable): Grant =
      unwrap(this).grantReadWrite(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant write permissions for this domain and its contents to an IAM principal (Role/Group/User).
   *
   * @param identity The principal. 
   */
  public override fun grantWrite(identity: IGrantable): Grant =
      unwrap(this).grantWrite(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Master user password if fine grained access control is configured.
   */
  public open fun masterUserPassword(): SecretValue? =
      unwrap(this).getMasterUserPassword()?.let(SecretValue::wrap)

  /**
   * Return the given named metric for this domain.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this domain.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this domain.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * Metric for automated snapshot failures.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricAutomatedSnapshotFailure(): Metric =
      unwrap(this).metricAutomatedSnapshotFailure().let(Metric::wrap)

  /**
   * Metric for automated snapshot failures.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricAutomatedSnapshotFailure(props: MetricOptions): Metric =
      unwrap(this).metricAutomatedSnapshotFailure(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for automated snapshot failures.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9f702cdc4e375e8b739cdce26ff5c0a5606646a98edb39614863885f1182c7f")
  public override fun metricAutomatedSnapshotFailure(props: MetricOptions.Builder.() -> Unit):
      Metric = metricAutomatedSnapshotFailure(MetricOptions(props))

  /**
   * Metric for the cluster blocking index writes.
   *
   * Default: maximum over 1 minute
   *
   * @param props
   */
  public override fun metricClusterIndexWritesBlocked(): Metric =
      unwrap(this).metricClusterIndexWritesBlocked().let(Metric::wrap)

  /**
   * Metric for the cluster blocking index writes.
   *
   * Default: maximum over 1 minute
   *
   * @param props
   */
  public override fun metricClusterIndexWritesBlocked(props: MetricOptions): Metric =
      unwrap(this).metricClusterIndexWritesBlocked(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the cluster blocking index writes.
   *
   * Default: maximum over 1 minute
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("016b489514978517ae80814c783dc254d3f821a64ba427a0725fa9ed3e854018")
  public override fun metricClusterIndexWritesBlocked(props: MetricOptions.Builder.() -> Unit):
      Metric = metricClusterIndexWritesBlocked(MetricOptions(props))

  /**
   * Metric for the time the cluster status is red.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricClusterStatusRed(): Metric =
      unwrap(this).metricClusterStatusRed().let(Metric::wrap)

  /**
   * Metric for the time the cluster status is red.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricClusterStatusRed(props: MetricOptions): Metric =
      unwrap(this).metricClusterStatusRed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the time the cluster status is red.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e0926b5a2e18fffe32b1ec2076e81bbcc7d98107a425301c58fbc9d2905a860")
  public override fun metricClusterStatusRed(props: MetricOptions.Builder.() -> Unit): Metric =
      metricClusterStatusRed(MetricOptions(props))

  /**
   * Metric for the time the cluster status is yellow.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricClusterStatusYellow(): Metric =
      unwrap(this).metricClusterStatusYellow().let(Metric::wrap)

  /**
   * Metric for the time the cluster status is yellow.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricClusterStatusYellow(props: MetricOptions): Metric =
      unwrap(this).metricClusterStatusYellow(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the time the cluster status is yellow.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1ef39420c98f9d4cfefd45b8c2db0c21ea1a1e68a7c9b723df1412af465bda2f")
  public override fun metricClusterStatusYellow(props: MetricOptions.Builder.() -> Unit): Metric =
      metricClusterStatusYellow(MetricOptions(props))

  /**
   * Metric for CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricCpuUtilization(): Metric =
      unwrap(this).metricCPUUtilization().let(Metric::wrap)

  /**
   * Metric for CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricCpuUtilization(props: MetricOptions): Metric =
      unwrap(this).metricCPUUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
  public override fun metricCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCpuUtilization(MetricOptions(props))

  /**
   * Metric for the storage space of nodes in the cluster.
   *
   * Default: minimum over 5 minutes
   *
   * @param props
   */
  public override fun metricFreeStorageSpace(): Metric =
      unwrap(this).metricFreeStorageSpace().let(Metric::wrap)

  /**
   * Metric for the storage space of nodes in the cluster.
   *
   * Default: minimum over 5 minutes
   *
   * @param props
   */
  public override fun metricFreeStorageSpace(props: MetricOptions): Metric =
      unwrap(this).metricFreeStorageSpace(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the storage space of nodes in the cluster.
   *
   * Default: minimum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("368af7ac3be4f10e672f08286b7e70f8633b6e9198d1685bfedc9108b3414e62")
  public override fun metricFreeStorageSpace(props: MetricOptions.Builder.() -> Unit): Metric =
      metricFreeStorageSpace(MetricOptions(props))

  /**
   * Metric for indexing latency.
   *
   * Default: p99 over 5 minutes
   *
   * @param props
   */
  public override fun metricIndexingLatency(): Metric =
      unwrap(this).metricIndexingLatency().let(Metric::wrap)

  /**
   * Metric for indexing latency.
   *
   * Default: p99 over 5 minutes
   *
   * @param props
   */
  public override fun metricIndexingLatency(props: MetricOptions): Metric =
      unwrap(this).metricIndexingLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for indexing latency.
   *
   * Default: p99 over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("07b87f2aa9d61ee51a0627ce9ffe82c5e5f6e38fef54d0ff7ab95be9c0731c15")
  public override fun metricIndexingLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIndexingLatency(MetricOptions(props))

  /**
   * Metric for JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricJvmMemoryPressure(): Metric =
      unwrap(this).metricJVMMemoryPressure().let(Metric::wrap)

  /**
   * Metric for JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricJvmMemoryPressure(props: MetricOptions): Metric =
      unwrap(this).metricJVMMemoryPressure(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("283ffec8edbd9b28227078700405c8b7b7fe0f6bf433f6323ba9205b4c8a528f")
  public override fun metricJvmMemoryPressure(props: MetricOptions.Builder.() -> Unit): Metric =
      metricJvmMemoryPressure(MetricOptions(props))

  /**
   * Metric for KMS key errors.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricKmsKeyError(): Metric =
      unwrap(this).metricKMSKeyError().let(Metric::wrap)

  /**
   * Metric for KMS key errors.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricKmsKeyError(props: MetricOptions): Metric =
      unwrap(this).metricKMSKeyError(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for KMS key errors.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("309d28dee34b268d496bc1e8ba269d5bff9ec10e9e17132d9a884e208a805741")
  public override fun metricKmsKeyError(props: MetricOptions.Builder.() -> Unit): Metric =
      metricKmsKeyError(MetricOptions(props))

  /**
   * Metric for KMS key being inaccessible.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricKmsKeyInaccessible(): Metric =
      unwrap(this).metricKMSKeyInaccessible().let(Metric::wrap)

  /**
   * Metric for KMS key being inaccessible.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricKmsKeyInaccessible(props: MetricOptions): Metric =
      unwrap(this).metricKMSKeyInaccessible(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for KMS key being inaccessible.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bfca9e4cdc1ad37f6d57f9fdeb4258e1c6235ab92ed8224c8ee4cda359baaad6")
  public override fun metricKmsKeyInaccessible(props: MetricOptions.Builder.() -> Unit): Metric =
      metricKmsKeyInaccessible(MetricOptions(props))

  /**
   * Metric for master CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricMasterCpuUtilization(): Metric =
      unwrap(this).metricMasterCPUUtilization().let(Metric::wrap)

  /**
   * Metric for master CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricMasterCpuUtilization(props: MetricOptions): Metric =
      unwrap(this).metricMasterCPUUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for master CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8a46b211229de3f431630b8ea4f99843647a1cab494f599c79138732a397c709")
  public override fun metricMasterCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricMasterCpuUtilization(MetricOptions(props))

  /**
   * Metric for master JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricMasterJvmMemoryPressure(): Metric =
      unwrap(this).metricMasterJVMMemoryPressure().let(Metric::wrap)

  /**
   * Metric for master JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricMasterJvmMemoryPressure(props: MetricOptions): Metric =
      unwrap(this).metricMasterJVMMemoryPressure(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for master JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fbcf8e4882306bcb2bed673a80ed7a54a16cc27adfc1a7fe173fbb566b335350")
  public override fun metricMasterJvmMemoryPressure(props: MetricOptions.Builder.() -> Unit): Metric
      = metricMasterJvmMemoryPressure(MetricOptions(props))

  /**
   * Metric for the number of nodes.
   *
   * Default: minimum over 1 hour
   *
   * @param props
   */
  public override fun metricNodes(): Metric = unwrap(this).metricNodes().let(Metric::wrap)

  /**
   * Metric for the number of nodes.
   *
   * Default: minimum over 1 hour
   *
   * @param props
   */
  public override fun metricNodes(props: MetricOptions): Metric =
      unwrap(this).metricNodes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the number of nodes.
   *
   * Default: minimum over 1 hour
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("355f82e0d8db21f2bb54b9766182780100c904a3efcf3167fc2c3468c208268b")
  public override fun metricNodes(props: MetricOptions.Builder.() -> Unit): Metric =
      metricNodes(MetricOptions(props))

  /**
   * Metric for search latency.
   *
   * Default: p99 over 5 minutes
   *
   * @param props
   */
  public override fun metricSearchLatency(): Metric =
      unwrap(this).metricSearchLatency().let(Metric::wrap)

  /**
   * Metric for search latency.
   *
   * Default: p99 over 5 minutes
   *
   * @param props
   */
  public override fun metricSearchLatency(props: MetricOptions): Metric =
      unwrap(this).metricSearchLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for search latency.
   *
   * Default: p99 over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b37148931823e387018afa8190e3e362020aa1dc4211a32e63ee13acb1e89fd6")
  public override fun metricSearchLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSearchLatency(MetricOptions(props))

  /**
   * Metric for number of searchable documents.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricSearchableDocuments(): Metric =
      unwrap(this).metricSearchableDocuments().let(Metric::wrap)

  /**
   * Metric for number of searchable documents.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public override fun metricSearchableDocuments(props: MetricOptions): Metric =
      unwrap(this).metricSearchableDocuments(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for number of searchable documents.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("92e1cde4c44cd4a6f76bd4af6b9e03846698bfe485a039b042b4989c8258df65")
  public override fun metricSearchableDocuments(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSearchableDocuments(MetricOptions(props))

  /**
   * Log group that slow indices are logged to.
   */
  public open fun slowIndexLogGroup(): ILogGroup? =
      unwrap(this).getSlowIndexLogGroup()?.let(ILogGroup::wrap)

  /**
   * Log group that slow searches are logged to.
   */
  public open fun slowSearchLogGroup(): ILogGroup? =
      unwrap(this).getSlowSearchLogGroup()?.let(ILogGroup::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.opensearchservice.Domain].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Domain access policies.
     *
     * Default: - No access policies.
     *
     * @param accessPolicies Domain access policies. 
     */
    public fun accessPolicies(accessPolicies: List<PolicyStatement>)

    /**
     * Domain access policies.
     *
     * Default: - No access policies.
     *
     * @param accessPolicies Domain access policies. 
     */
    public fun accessPolicies(vararg accessPolicies: PolicyStatement)

    /**
     * Additional options to specify for the Amazon OpenSearch Service domain.
     *
     * Default: - no advanced options are specified
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
     * @param advancedOptions Additional options to specify for the Amazon OpenSearch Service
     * domain. 
     */
    public fun advancedOptions(advancedOptions: Map<String, String>)

    /**
     * The hour in UTC during which the service takes an automated daily snapshot of the indices in
     * the Amazon OpenSearch Service domain.
     *
     * Only applies for Elasticsearch versions
     * below 5.3.
     *
     * Default: - Hourly automated snapshots not used
     *
     * @param automatedSnapshotStartHour The hour in UTC during which the service takes an automated
     * daily snapshot of the indices in the Amazon OpenSearch Service domain. 
     */
    public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number)

    /**
     * The cluster capacity configuration for the Amazon OpenSearch Service domain.
     *
     * Default: - 1 r5.large.search data node; no dedicated master nodes.
     *
     * @param capacity The cluster capacity configuration for the Amazon OpenSearch Service domain. 
     */
    public fun capacity(capacity: CapacityConfig)

    /**
     * The cluster capacity configuration for the Amazon OpenSearch Service domain.
     *
     * Default: - 1 r5.large.search data node; no dedicated master nodes.
     *
     * @param capacity The cluster capacity configuration for the Amazon OpenSearch Service domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb8d74c2a2359f1247467c1c9f3c3b8807038d8d29874d5b8a5226c798f5ecb4")
    public fun capacity(capacity: CapacityConfig.Builder.() -> Unit)

    /**
     * Configures Amazon OpenSearch Service to use Amazon Cognito authentication for OpenSearch
     * Dashboards.
     *
     * Default: - Cognito not used for authentication to OpenSearch Dashboards.
     *
     * @param cognitoDashboardsAuth Configures Amazon OpenSearch Service to use Amazon Cognito
     * authentication for OpenSearch Dashboards. 
     */
    public fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions)

    /**
     * Configures Amazon OpenSearch Service to use Amazon Cognito authentication for OpenSearch
     * Dashboards.
     *
     * Default: - Cognito not used for authentication to OpenSearch Dashboards.
     *
     * @param cognitoDashboardsAuth Configures Amazon OpenSearch Service to use Amazon Cognito
     * authentication for OpenSearch Dashboards. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b40b88bb2b5642cedd586a2f5164921ad12a322b47aeee942696cfd6a12c386c")
    public fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions.Builder.() -> Unit)

    /**
     * Whether to enable or disable cold storage on the domain.
     *
     * You must enable UltraWarm storage to enable cold storage.
     *
     * Default: - undefined
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cold-storage.html)
     * @param coldStorageEnabled Whether to enable or disable cold storage on the domain. 
     */
    public fun coldStorageEnabled(coldStorageEnabled: Boolean)

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
    public fun customEndpoint(customEndpoint: CustomEndpointOptions)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11b448e2542eb89487142f42a1c4ed9ecbbe3c485df90f9d6065c04682326f0d")
    public fun customEndpoint(customEndpoint: CustomEndpointOptions.Builder.() -> Unit)

    /**
     * Enforces a particular physical domain name.
     *
     * Default: - A name will be auto-generated.
     *
     * @param domainName Enforces a particular physical domain name. 
     */
    public fun domainName(domainName: String)

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the Amazon OpenSearch Service domain.
     *
     * Default: - 10 GiB General Purpose (SSD) volumes per node.
     *
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     * attached to data nodes in the Amazon OpenSearch Service domain. 
     */
    public fun ebs(ebs: EbsOptions)

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the Amazon OpenSearch Service domain.
     *
     * Default: - 10 GiB General Purpose (SSD) volumes per node.
     *
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     * attached to data nodes in the Amazon OpenSearch Service domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4e1783c9850be27b4f132cfae032260bbf496dcb0262bc181aea33aba8ffaee")
    public fun ebs(ebs: EbsOptions.Builder.() -> Unit)

    /**
     * Specifies whether automatic service software updates are enabled for the domain.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/it_it/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-softwareupdateoptions.html)
     * @param enableAutoSoftwareUpdate Specifies whether automatic service software updates are
     * enabled for the domain. 
     */
    public fun enableAutoSoftwareUpdate(enableAutoSoftwareUpdate: Boolean)

    /**
     * To upgrade an Amazon OpenSearch Service domain to a new version, rather than replacing the
     * entire domain resource, use the EnableVersionUpgrade update policy.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
     * @param enableVersionUpgrade To upgrade an Amazon OpenSearch Service domain to a new version,
     * rather than replacing the entire domain resource, use the EnableVersionUpgrade update policy. 
     */
    public fun enableVersionUpgrade(enableVersionUpgrade: Boolean)

    /**
     * Encryption at rest options for the cluster.
     *
     * Default: - No encryption at rest
     *
     * @param encryptionAtRest Encryption at rest options for the cluster. 
     */
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions)

    /**
     * Encryption at rest options for the cluster.
     *
     * Default: - No encryption at rest
     *
     * @param encryptionAtRest Encryption at rest options for the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9feb8a42d3d892f21ac29c9c1694e2318675187876431d4b36dc0e195a051192")
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions.Builder.() -> Unit)

    /**
     * True to require that all traffic to the domain arrive over HTTPS.
     *
     * Default: - false
     *
     * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS. 
     */
    public fun enforceHttps(enforceHttps: Boolean)

    /**
     * Specifies options for fine-grained access control.
     *
     * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later. Enabling
     * fine-grained access control
     * also requires encryption of data at rest and node-to-node encryption, along with
     * enforced HTTPS.
     *
     * Default: - fine-grained access control is disabled
     *
     * @param fineGrainedAccessControl Specifies options for fine-grained access control. 
     */
    public fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions)

    /**
     * Specifies options for fine-grained access control.
     *
     * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later. Enabling
     * fine-grained access control
     * also requires encryption of data at rest and node-to-node encryption, along with
     * enforced HTTPS.
     *
     * Default: - fine-grained access control is disabled
     *
     * @param fineGrainedAccessControl Specifies options for fine-grained access control. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("722a86d44552c2afeb3222fc9be0fa31a231bf68b4389fb93795473dcee7a8de")
    public
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit)

    /**
     * Specify either dual stack or IPv4 as your IP address type.
     *
     * Dual stack allows you to share domain resources across IPv4 and IPv6 address types, and is
     * the recommended option.
     *
     * If you set your IP address type to dual stack, you can't change your address type later.
     *
     * Default: - IpAddressType.IPV4
     *
     * @param ipAddressType Specify either dual stack or IPv4 as your IP address type. 
     */
    public fun ipAddressType(ipAddressType: IpAddressType)

    /**
     * Configuration log publishing configuration options.
     *
     * Default: - No logs are published
     *
     * @param logging Configuration log publishing configuration options. 
     */
    public fun logging(logging: LoggingOptions)

    /**
     * Configuration log publishing configuration options.
     *
     * Default: - No logs are published
     *
     * @param logging Configuration log publishing configuration options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73acb45b2bb00b33f8c25bd9f52372ccb5eed12bd27b98bb5aac56ece854dc14")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

    /**
     * Specify true to enable node to node encryption.
     *
     * Requires Elasticsearch version 6.0 or later or OpenSearch version 1.0 or later.
     *
     * Default: - Node to node encryption is not enabled.
     *
     * @param nodeToNodeEncryption Specify true to enable node to node encryption. 
     */
    public fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean)

    /**
     * Options for enabling a domain's off-peak window, during which OpenSearch Service can perform
     * mandatory configuration changes on the domain.
     *
     * Off-peak windows were introduced on February 16, 2023.
     * All domains created before this date have the off-peak window disabled by default.
     * You must manually enable and configure the off-peak window for these domains.
     * All domains created after this date will have the off-peak window enabled by default.
     * You can't disable the off-peak window for a domain after it's enabled.
     *
     * Default: - Disabled for domains created before February 16, 2023. Enabled for domains created
     * after. Enabled if `offPeakWindowStart` is set.
     *
     * [Documentation](https://docs.aws.amazon.com/it_it/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-offpeakwindow.html)
     * @param offPeakWindowEnabled Options for enabling a domain's off-peak window, during which
     * OpenSearch Service can perform mandatory configuration changes on the domain. 
     */
    public fun offPeakWindowEnabled(offPeakWindowEnabled: Boolean)

    /**
     * Start time for the off-peak window, in Coordinated Universal Time (UTC).
     *
     * The window length will always be 10 hours, so you can't specify an end time.
     * For example, if you specify 11:00 P.M. UTC as a start time, the end time will automatically
     * be set to 9:00 A.M.
     *
     * Default: - 10:00 P.M. local time
     *
     * @param offPeakWindowStart Start time for the off-peak window, in Coordinated Universal Time
     * (UTC). 
     */
    public fun offPeakWindowStart(offPeakWindowStart: WindowStartTime)

    /**
     * Start time for the off-peak window, in Coordinated Universal Time (UTC).
     *
     * The window length will always be 10 hours, so you can't specify an end time.
     * For example, if you specify 11:00 P.M. UTC as a start time, the end time will automatically
     * be set to 9:00 A.M.
     *
     * Default: - 10:00 P.M. local time
     *
     * @param offPeakWindowStart Start time for the off-peak window, in Coordinated Universal Time
     * (UTC). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2dfbed53a14ef4561fd1f46cf5d9bec3bb82d355a2bc031fcaa68494bd36aa2b")
    public fun offPeakWindowStart(offPeakWindowStart: WindowStartTime.Builder.() -> Unit)

    /**
     * Policy to apply when the domain is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy Policy to apply when the domain is removed from the stack. 
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy)

    /**
     * The list of security groups that are associated with the VPC endpoints for the domain.
     *
     * Only used if `vpc` is specified.
     *
     * Default: - One new security group is created.
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     * for the domain. 
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * The list of security groups that are associated with the VPC endpoints for the domain.
     *
     * Only used if `vpc` is specified.
     *
     * Default: - One new security group is created.
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     * for the domain. 
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * Specify whether to create a CloudWatch Logs resource policy or not.
     *
     * When logging is enabled for the domain, a CloudWatch Logs resource policy is created by
     * default.
     * However, CloudWatch Logs supports only 10 resource policies per region.
     * If you enable logging for several domains, it may hit the quota and cause an error.
     * By setting this property to true, creating a resource policy is suppressed, allowing you to
     * avoid this problem.
     *
     * If you set this option to true, you must create a resource policy before deployment.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createdomain-configure-slow-logs.html)
     * @param suppressLogsResourcePolicy Specify whether to create a CloudWatch Logs resource policy
     * or not. 
     */
    public fun suppressLogsResourcePolicy(suppressLogsResourcePolicy: Boolean)

    /**
     * The minimum TLS version required for traffic to the domain.
     *
     * Default: - TLSSecurityPolicy.TLS_1_0
     *
     * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain. 
     */
    public fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy)

    /**
     * Configures the domain so that unsigned basic auth is enabled.
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
     * @param useUnsignedBasicAuth Configures the domain so that unsigned basic auth is enabled. 
     */
    public fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean)

    /**
     * The Elasticsearch/OpenSearch version that your domain will leverage.
     *
     * @param version The Elasticsearch/OpenSearch version that your domain will leverage. 
     */
    public fun version(version: EngineVersion)

    /**
     * Place the domain inside this VPC.
     *
     * Default: - Domain is not placed in a VPC.
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)
     * @param vpc Place the domain inside this VPC. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * The specific vpc subnets the domain will be placed in.
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
     * @param vpcSubnets The specific vpc subnets the domain will be placed in. 
     */
    public fun vpcSubnets(vpcSubnets: List<SubnetSelection>)

    /**
     * The specific vpc subnets the domain will be placed in.
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
     * @param vpcSubnets The specific vpc subnets the domain will be placed in. 
     */
    public fun vpcSubnets(vararg vpcSubnets: SubnetSelection)

    /**
     * The cluster zone awareness configuration for the Amazon OpenSearch Service domain.
     *
     * Default: - no zone awareness (1 AZ)
     *
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon OpenSearch
     * Service domain. 
     */
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig)

    /**
     * The cluster zone awareness configuration for the Amazon OpenSearch Service domain.
     *
     * Default: - no zone awareness (1 AZ)
     *
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon OpenSearch
     * Service domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93f7b70cd62c8b07dd4f4a432b1ea42e91d0b0858acd791223dd843a01403432")
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.Domain.Builder =
        software.amazon.awscdk.services.opensearchservice.Domain.Builder.create(scope, id)

    /**
     * Domain access policies.
     *
     * Default: - No access policies.
     *
     * @param accessPolicies Domain access policies. 
     */
    override fun accessPolicies(accessPolicies: List<PolicyStatement>) {
      cdkBuilder.accessPolicies(accessPolicies.map(PolicyStatement::unwrap))
    }

    /**
     * Domain access policies.
     *
     * Default: - No access policies.
     *
     * @param accessPolicies Domain access policies. 
     */
    override fun accessPolicies(vararg accessPolicies: PolicyStatement): Unit =
        accessPolicies(accessPolicies.toList())

    /**
     * Additional options to specify for the Amazon OpenSearch Service domain.
     *
     * Default: - no advanced options are specified
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options)
     * @param advancedOptions Additional options to specify for the Amazon OpenSearch Service
     * domain. 
     */
    override fun advancedOptions(advancedOptions: Map<String, String>) {
      cdkBuilder.advancedOptions(advancedOptions)
    }

    /**
     * The hour in UTC during which the service takes an automated daily snapshot of the indices in
     * the Amazon OpenSearch Service domain.
     *
     * Only applies for Elasticsearch versions
     * below 5.3.
     *
     * Default: - Hourly automated snapshots not used
     *
     * @param automatedSnapshotStartHour The hour in UTC during which the service takes an automated
     * daily snapshot of the indices in the Amazon OpenSearch Service domain. 
     */
    override fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
      cdkBuilder.automatedSnapshotStartHour(automatedSnapshotStartHour)
    }

    /**
     * The cluster capacity configuration for the Amazon OpenSearch Service domain.
     *
     * Default: - 1 r5.large.search data node; no dedicated master nodes.
     *
     * @param capacity The cluster capacity configuration for the Amazon OpenSearch Service domain. 
     */
    override fun capacity(capacity: CapacityConfig) {
      cdkBuilder.capacity(capacity.let(CapacityConfig::unwrap))
    }

    /**
     * The cluster capacity configuration for the Amazon OpenSearch Service domain.
     *
     * Default: - 1 r5.large.search data node; no dedicated master nodes.
     *
     * @param capacity The cluster capacity configuration for the Amazon OpenSearch Service domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb8d74c2a2359f1247467c1c9f3c3b8807038d8d29874d5b8a5226c798f5ecb4")
    override fun capacity(capacity: CapacityConfig.Builder.() -> Unit): Unit =
        capacity(CapacityConfig(capacity))

    /**
     * Configures Amazon OpenSearch Service to use Amazon Cognito authentication for OpenSearch
     * Dashboards.
     *
     * Default: - Cognito not used for authentication to OpenSearch Dashboards.
     *
     * @param cognitoDashboardsAuth Configures Amazon OpenSearch Service to use Amazon Cognito
     * authentication for OpenSearch Dashboards. 
     */
    override fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions) {
      cdkBuilder.cognitoDashboardsAuth(cognitoDashboardsAuth.let(CognitoOptions::unwrap))
    }

    /**
     * Configures Amazon OpenSearch Service to use Amazon Cognito authentication for OpenSearch
     * Dashboards.
     *
     * Default: - Cognito not used for authentication to OpenSearch Dashboards.
     *
     * @param cognitoDashboardsAuth Configures Amazon OpenSearch Service to use Amazon Cognito
     * authentication for OpenSearch Dashboards. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b40b88bb2b5642cedd586a2f5164921ad12a322b47aeee942696cfd6a12c386c")
    override fun cognitoDashboardsAuth(cognitoDashboardsAuth: CognitoOptions.Builder.() -> Unit):
        Unit = cognitoDashboardsAuth(CognitoOptions(cognitoDashboardsAuth))

    /**
     * Whether to enable or disable cold storage on the domain.
     *
     * You must enable UltraWarm storage to enable cold storage.
     *
     * Default: - undefined
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cold-storage.html)
     * @param coldStorageEnabled Whether to enable or disable cold storage on the domain. 
     */
    override fun coldStorageEnabled(coldStorageEnabled: Boolean) {
      cdkBuilder.coldStorageEnabled(coldStorageEnabled)
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
    override fun customEndpoint(customEndpoint: CustomEndpointOptions) {
      cdkBuilder.customEndpoint(customEndpoint.let(CustomEndpointOptions::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11b448e2542eb89487142f42a1c4ed9ecbbe3c485df90f9d6065c04682326f0d")
    override fun customEndpoint(customEndpoint: CustomEndpointOptions.Builder.() -> Unit): Unit =
        customEndpoint(CustomEndpointOptions(customEndpoint))

    /**
     * Enforces a particular physical domain name.
     *
     * Default: - A name will be auto-generated.
     *
     * @param domainName Enforces a particular physical domain name. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the Amazon OpenSearch Service domain.
     *
     * Default: - 10 GiB General Purpose (SSD) volumes per node.
     *
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     * attached to data nodes in the Amazon OpenSearch Service domain. 
     */
    override fun ebs(ebs: EbsOptions) {
      cdkBuilder.ebs(ebs.let(EbsOptions::unwrap))
    }

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to
     * data nodes in the Amazon OpenSearch Service domain.
     *
     * Default: - 10 GiB General Purpose (SSD) volumes per node.
     *
     * @param ebs The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are
     * attached to data nodes in the Amazon OpenSearch Service domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4e1783c9850be27b4f132cfae032260bbf496dcb0262bc181aea33aba8ffaee")
    override fun ebs(ebs: EbsOptions.Builder.() -> Unit): Unit = ebs(EbsOptions(ebs))

    /**
     * Specifies whether automatic service software updates are enabled for the domain.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/it_it/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-softwareupdateoptions.html)
     * @param enableAutoSoftwareUpdate Specifies whether automatic service software updates are
     * enabled for the domain. 
     */
    override fun enableAutoSoftwareUpdate(enableAutoSoftwareUpdate: Boolean) {
      cdkBuilder.enableAutoSoftwareUpdate(enableAutoSoftwareUpdate)
    }

    /**
     * To upgrade an Amazon OpenSearch Service domain to a new version, rather than replacing the
     * entire domain resource, use the EnableVersionUpgrade update policy.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-upgradeopensearchdomain)
     * @param enableVersionUpgrade To upgrade an Amazon OpenSearch Service domain to a new version,
     * rather than replacing the entire domain resource, use the EnableVersionUpgrade update policy. 
     */
    override fun enableVersionUpgrade(enableVersionUpgrade: Boolean) {
      cdkBuilder.enableVersionUpgrade(enableVersionUpgrade)
    }

    /**
     * Encryption at rest options for the cluster.
     *
     * Default: - No encryption at rest
     *
     * @param encryptionAtRest Encryption at rest options for the cluster. 
     */
    override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions) {
      cdkBuilder.encryptionAtRest(encryptionAtRest.let(EncryptionAtRestOptions::unwrap))
    }

    /**
     * Encryption at rest options for the cluster.
     *
     * Default: - No encryption at rest
     *
     * @param encryptionAtRest Encryption at rest options for the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9feb8a42d3d892f21ac29c9c1694e2318675187876431d4b36dc0e195a051192")
    override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions.Builder.() -> Unit):
        Unit = encryptionAtRest(EncryptionAtRestOptions(encryptionAtRest))

    /**
     * True to require that all traffic to the domain arrive over HTTPS.
     *
     * Default: - false
     *
     * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS. 
     */
    override fun enforceHttps(enforceHttps: Boolean) {
      cdkBuilder.enforceHttps(enforceHttps)
    }

    /**
     * Specifies options for fine-grained access control.
     *
     * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later. Enabling
     * fine-grained access control
     * also requires encryption of data at rest and node-to-node encryption, along with
     * enforced HTTPS.
     *
     * Default: - fine-grained access control is disabled
     *
     * @param fineGrainedAccessControl Specifies options for fine-grained access control. 
     */
    override fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions) {
      cdkBuilder.fineGrainedAccessControl(fineGrainedAccessControl.let(AdvancedSecurityOptions::unwrap))
    }

    /**
     * Specifies options for fine-grained access control.
     *
     * Requires Elasticsearch version 6.7 or later or OpenSearch version 1.0 or later. Enabling
     * fine-grained access control
     * also requires encryption of data at rest and node-to-node encryption, along with
     * enforced HTTPS.
     *
     * Default: - fine-grained access control is disabled
     *
     * @param fineGrainedAccessControl Specifies options for fine-grained access control. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("722a86d44552c2afeb3222fc9be0fa31a231bf68b4389fb93795473dcee7a8de")
    override
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit):
        Unit = fineGrainedAccessControl(AdvancedSecurityOptions(fineGrainedAccessControl))

    /**
     * Specify either dual stack or IPv4 as your IP address type.
     *
     * Dual stack allows you to share domain resources across IPv4 and IPv6 address types, and is
     * the recommended option.
     *
     * If you set your IP address type to dual stack, you can't change your address type later.
     *
     * Default: - IpAddressType.IPV4
     *
     * @param ipAddressType Specify either dual stack or IPv4 as your IP address type. 
     */
    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType::unwrap))
    }

    /**
     * Configuration log publishing configuration options.
     *
     * Default: - No logs are published
     *
     * @param logging Configuration log publishing configuration options. 
     */
    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
    }

    /**
     * Configuration log publishing configuration options.
     *
     * Default: - No logs are published
     *
     * @param logging Configuration log publishing configuration options. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("73acb45b2bb00b33f8c25bd9f52372ccb5eed12bd27b98bb5aac56ece854dc14")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

    /**
     * Specify true to enable node to node encryption.
     *
     * Requires Elasticsearch version 6.0 or later or OpenSearch version 1.0 or later.
     *
     * Default: - Node to node encryption is not enabled.
     *
     * @param nodeToNodeEncryption Specify true to enable node to node encryption. 
     */
    override fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean) {
      cdkBuilder.nodeToNodeEncryption(nodeToNodeEncryption)
    }

    /**
     * Options for enabling a domain's off-peak window, during which OpenSearch Service can perform
     * mandatory configuration changes on the domain.
     *
     * Off-peak windows were introduced on February 16, 2023.
     * All domains created before this date have the off-peak window disabled by default.
     * You must manually enable and configure the off-peak window for these domains.
     * All domains created after this date will have the off-peak window enabled by default.
     * You can't disable the off-peak window for a domain after it's enabled.
     *
     * Default: - Disabled for domains created before February 16, 2023. Enabled for domains created
     * after. Enabled if `offPeakWindowStart` is set.
     *
     * [Documentation](https://docs.aws.amazon.com/it_it/AWSCloudFormation/latest/UserGuide/aws-properties-opensearchservice-domain-offpeakwindow.html)
     * @param offPeakWindowEnabled Options for enabling a domain's off-peak window, during which
     * OpenSearch Service can perform mandatory configuration changes on the domain. 
     */
    override fun offPeakWindowEnabled(offPeakWindowEnabled: Boolean) {
      cdkBuilder.offPeakWindowEnabled(offPeakWindowEnabled)
    }

    /**
     * Start time for the off-peak window, in Coordinated Universal Time (UTC).
     *
     * The window length will always be 10 hours, so you can't specify an end time.
     * For example, if you specify 11:00 P.M. UTC as a start time, the end time will automatically
     * be set to 9:00 A.M.
     *
     * Default: - 10:00 P.M. local time
     *
     * @param offPeakWindowStart Start time for the off-peak window, in Coordinated Universal Time
     * (UTC). 
     */
    override fun offPeakWindowStart(offPeakWindowStart: WindowStartTime) {
      cdkBuilder.offPeakWindowStart(offPeakWindowStart.let(WindowStartTime::unwrap))
    }

    /**
     * Start time for the off-peak window, in Coordinated Universal Time (UTC).
     *
     * The window length will always be 10 hours, so you can't specify an end time.
     * For example, if you specify 11:00 P.M. UTC as a start time, the end time will automatically
     * be set to 9:00 A.M.
     *
     * Default: - 10:00 P.M. local time
     *
     * @param offPeakWindowStart Start time for the off-peak window, in Coordinated Universal Time
     * (UTC). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2dfbed53a14ef4561fd1f46cf5d9bec3bb82d355a2bc031fcaa68494bd36aa2b")
    override fun offPeakWindowStart(offPeakWindowStart: WindowStartTime.Builder.() -> Unit): Unit =
        offPeakWindowStart(WindowStartTime(offPeakWindowStart))

    /**
     * Policy to apply when the domain is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy Policy to apply when the domain is removed from the stack. 
     */
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    /**
     * The list of security groups that are associated with the VPC endpoints for the domain.
     *
     * Only used if `vpc` is specified.
     *
     * Default: - One new security group is created.
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     * for the domain. 
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * The list of security groups that are associated with the VPC endpoints for the domain.
     *
     * Only used if `vpc` is specified.
     *
     * Default: - One new security group is created.
     *
     * [Documentation](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
     * @param securityGroups The list of security groups that are associated with the VPC endpoints
     * for the domain. 
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * Specify whether to create a CloudWatch Logs resource policy or not.
     *
     * When logging is enabled for the domain, a CloudWatch Logs resource policy is created by
     * default.
     * However, CloudWatch Logs supports only 10 resource policies per region.
     * If you enable logging for several domains, it may hit the quota and cause an error.
     * By setting this property to true, creating a resource policy is suppressed, allowing you to
     * avoid this problem.
     *
     * If you set this option to true, you must create a resource policy before deployment.
     *
     * Default: - false
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createdomain-configure-slow-logs.html)
     * @param suppressLogsResourcePolicy Specify whether to create a CloudWatch Logs resource policy
     * or not. 
     */
    override fun suppressLogsResourcePolicy(suppressLogsResourcePolicy: Boolean) {
      cdkBuilder.suppressLogsResourcePolicy(suppressLogsResourcePolicy)
    }

    /**
     * The minimum TLS version required for traffic to the domain.
     *
     * Default: - TLSSecurityPolicy.TLS_1_0
     *
     * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain. 
     */
    override fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy) {
      cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy.let(TLSSecurityPolicy::unwrap))
    }

    /**
     * Configures the domain so that unsigned basic auth is enabled.
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
     * @param useUnsignedBasicAuth Configures the domain so that unsigned basic auth is enabled. 
     */
    override fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean) {
      cdkBuilder.useUnsignedBasicAuth(useUnsignedBasicAuth)
    }

    /**
     * The Elasticsearch/OpenSearch version that your domain will leverage.
     *
     * @param version The Elasticsearch/OpenSearch version that your domain will leverage. 
     */
    override fun version(version: EngineVersion) {
      cdkBuilder.version(version.let(EngineVersion::unwrap))
    }

    /**
     * Place the domain inside this VPC.
     *
     * Default: - Domain is not placed in a VPC.
     *
     * [Documentation](https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html)
     * @param vpc Place the domain inside this VPC. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * The specific vpc subnets the domain will be placed in.
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
     * @param vpcSubnets The specific vpc subnets the domain will be placed in. 
     */
    override fun vpcSubnets(vpcSubnets: List<SubnetSelection>) {
      cdkBuilder.vpcSubnets(vpcSubnets.map(SubnetSelection::unwrap))
    }

    /**
     * The specific vpc subnets the domain will be placed in.
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
     * @param vpcSubnets The specific vpc subnets the domain will be placed in. 
     */
    override fun vpcSubnets(vararg vpcSubnets: SubnetSelection): Unit =
        vpcSubnets(vpcSubnets.toList())

    /**
     * The cluster zone awareness configuration for the Amazon OpenSearch Service domain.
     *
     * Default: - no zone awareness (1 AZ)
     *
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon OpenSearch
     * Service domain. 
     */
    override fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig) {
      cdkBuilder.zoneAwareness(zoneAwareness.let(ZoneAwarenessConfig::unwrap))
    }

    /**
     * The cluster zone awareness configuration for the Amazon OpenSearch Service domain.
     *
     * Default: - no zone awareness (1 AZ)
     *
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon OpenSearch
     * Service domain. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("93f7b70cd62c8b07dd4f4a432b1ea42e91d0b0858acd791223dd843a01403432")
    override fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig.Builder.() -> Unit): Unit =
        zoneAwareness(ZoneAwarenessConfig(zoneAwareness))

    public fun build(): software.amazon.awscdk.services.opensearchservice.Domain =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromDomainAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DomainAttributes,
    ): IDomain =
        software.amazon.awscdk.services.opensearchservice.Domain.fromDomainAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(DomainAttributes::unwrap)).let(IDomain::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d069b497ff5e35048a465bc998136432cf9e92a7a0499ec774570c4479b322c")
    public fun fromDomainAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: DomainAttributes.Builder.() -> Unit,
    ): IDomain = fromDomainAttributes(scope, id, DomainAttributes(attrs))

    public fun fromDomainEndpoint(
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
        wrapped.cdkObject as software.amazon.awscdk.services.opensearchservice.Domain
  }
}
