@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement as CloudshiftdevAwscdkServicesIamPolicyStatement
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.amazon.awscdk.services.iam.PolicyStatement as AmazonAwscdkServicesIamPolicyStatement
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * (deprecated) Provides an Elasticsearch domain.
 *
 * Example:
 *
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
public open class Domain(
  cdkObject: software.amazon.awscdk.services.elasticsearch.Domain,
) : Resource(cdkObject), IDomain, IConnectable {
  @Deprecated(message = "deprecated in CDK")
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DomainProps,
  ) :
      this(software.amazon.awscdk.services.elasticsearch.Domain(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(DomainProps::unwrap))
  )

  @Deprecated(message = "deprecated in CDK")
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: DomainProps.Builder.() -> Unit,
  ) : this(scope, id, DomainProps(props)
  )

  /**
   * (deprecated) Add policy statements to the domain access policy.
   *
   * @deprecated use opensearchservice module instead
   * @param accessPolicyStatements 
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun addAccessPolicies(vararg
      accessPolicyStatements: CloudshiftdevAwscdkServicesIamPolicyStatement) {
    unwrap(this).addAccessPolicies(*accessPolicyStatements.map{CdkObjectWrappers.unwrap(it) as
        AmazonAwscdkServicesIamPolicyStatement}.toTypedArray())
  }

  /**
   * (deprecated) Add policy statements to the domain access policy.
   *
   * @deprecated use opensearchservice module instead
   * @param accessPolicyStatements 
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6e90405b47e9f3a2cae6574b6735d0a2154075d115d5b9b89af33d54588dd0dd")
  public open
      fun addAccessPolicies(accessPolicyStatements: CloudshiftdevAwscdkServicesIamPolicyStatement.Builder.() -> Unit):
      Unit =
      addAccessPolicies(CloudshiftdevAwscdkServicesIamPolicyStatement(accessPolicyStatements))

  /**
   * (deprecated) Log group that application logs are logged to.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun appLogGroup(): ILogGroup? = unwrap(this).getAppLogGroup()?.let(ILogGroup::wrap)

  /**
   * (deprecated) Log group that audit logs are logged to.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun auditLogGroup(): ILogGroup? =
      unwrap(this).getAuditLogGroup()?.let(ILogGroup::wrap)

  /**
   * (deprecated) Manages network connections to the domain.
   *
   * This will throw an error in case the domain
   * is not placed inside a VPC.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * (deprecated) Arn of the Elasticsearch domain.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun domainArn(): String = unwrap(this).getDomainArn()

  /**
   * (deprecated) Endpoint of the Elasticsearch domain.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun domainEndpoint(): String = unwrap(this).getDomainEndpoint()

  /**
   * (deprecated) Domain name of the Elasticsearch domain.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun domainName(): String = unwrap(this).getDomainName()

  /**
   * (deprecated) Grant read permissions for an index in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param index The index to grant permissions for. 
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun grantIndexRead(index: String, identity: IGrantable): Grant =
      unwrap(this).grantIndexRead(index, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * (deprecated) Grant read/write permissions for an index in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param index The index to grant permissions for. 
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun grantIndexReadWrite(index: String, identity: IGrantable): Grant =
      unwrap(this).grantIndexReadWrite(index, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * (deprecated) Grant write permissions for an index in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param index The index to grant permissions for. 
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun grantIndexWrite(index: String, identity: IGrantable): Grant =
      unwrap(this).grantIndexWrite(index, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * (deprecated) Grant read permissions for a specific path in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param path The path to grant permissions for. 
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun grantPathRead(path: String, identity: IGrantable): Grant =
      unwrap(this).grantPathRead(path, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * (deprecated) Grant read/write permissions for a specific path in this domain to an IAM
   * principal (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param path The path to grant permissions for. 
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun grantPathReadWrite(path: String, identity: IGrantable): Grant =
      unwrap(this).grantPathReadWrite(path, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * (deprecated) Grant write permissions for a specific path in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param path The path to grant permissions for. 
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun grantPathWrite(path: String, identity: IGrantable): Grant =
      unwrap(this).grantPathWrite(path, identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * (deprecated) Grant read permissions for this domain and its contents to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun grantRead(identity: IGrantable): Grant =
      unwrap(this).grantRead(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * (deprecated) Grant read/write permissions for this domain and its contents to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun grantReadWrite(identity: IGrantable): Grant =
      unwrap(this).grantReadWrite(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * (deprecated) Grant write permissions for this domain and its contents to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun grantWrite(identity: IGrantable): Grant =
      unwrap(this).grantWrite(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * (deprecated) Master user password if fine grained access control is configured.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun masterUserPassword(): SecretValue? =
      unwrap(this).getMasterUserPassword()?.let(SecretValue::wrap)

  /**
   * (deprecated) Return the given named metric for this Domain.
   *
   * @deprecated use opensearchservice module instead
   * @param metricName 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * (deprecated) Return the given named metric for this Domain.
   *
   * @deprecated use opensearchservice module instead
   * @param metricName 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Return the given named metric for this Domain.
   *
   * @deprecated use opensearchservice module instead
   * @param metricName 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * (deprecated) Metric for automated snapshot failures.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricAutomatedSnapshotFailure(): Metric =
      unwrap(this).metricAutomatedSnapshotFailure().let(Metric::wrap)

  /**
   * (deprecated) Metric for automated snapshot failures.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricAutomatedSnapshotFailure(props: MetricOptions): Metric =
      unwrap(this).metricAutomatedSnapshotFailure(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for automated snapshot failures.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9f702cdc4e375e8b739cdce26ff5c0a5606646a98edb39614863885f1182c7f")
  public override fun metricAutomatedSnapshotFailure(props: MetricOptions.Builder.() -> Unit):
      Metric = metricAutomatedSnapshotFailure(MetricOptions(props))

  /**
   * (deprecated) Metric for the cluster blocking index writes.
   *
   * Default: maximum over 1 minute
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricClusterIndexWritesBlocked(): Metric =
      unwrap(this).metricClusterIndexWritesBlocked().let(Metric::wrap)

  /**
   * (deprecated) Metric for the cluster blocking index writes.
   *
   * Default: maximum over 1 minute
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricClusterIndexWritesBlocked(props: MetricOptions): Metric =
      unwrap(this).metricClusterIndexWritesBlocked(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for the cluster blocking index writes.
   *
   * Default: maximum over 1 minute
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("016b489514978517ae80814c783dc254d3f821a64ba427a0725fa9ed3e854018")
  public override fun metricClusterIndexWritesBlocked(props: MetricOptions.Builder.() -> Unit):
      Metric = metricClusterIndexWritesBlocked(MetricOptions(props))

  /**
   * (deprecated) Metric for the time the cluster status is red.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricClusterStatusRed(): Metric =
      unwrap(this).metricClusterStatusRed().let(Metric::wrap)

  /**
   * (deprecated) Metric for the time the cluster status is red.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricClusterStatusRed(props: MetricOptions): Metric =
      unwrap(this).metricClusterStatusRed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for the time the cluster status is red.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e0926b5a2e18fffe32b1ec2076e81bbcc7d98107a425301c58fbc9d2905a860")
  public override fun metricClusterStatusRed(props: MetricOptions.Builder.() -> Unit): Metric =
      metricClusterStatusRed(MetricOptions(props))

  /**
   * (deprecated) Metric for the time the cluster status is yellow.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricClusterStatusYellow(): Metric =
      unwrap(this).metricClusterStatusYellow().let(Metric::wrap)

  /**
   * (deprecated) Metric for the time the cluster status is yellow.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricClusterStatusYellow(props: MetricOptions): Metric =
      unwrap(this).metricClusterStatusYellow(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for the time the cluster status is yellow.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1ef39420c98f9d4cfefd45b8c2db0c21ea1a1e68a7c9b723df1412af465bda2f")
  public override fun metricClusterStatusYellow(props: MetricOptions.Builder.() -> Unit): Metric =
      metricClusterStatusYellow(MetricOptions(props))

  /**
   * (deprecated) Metric for CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricCpuUtilization(): Metric =
      unwrap(this).metricCPUUtilization().let(Metric::wrap)

  /**
   * (deprecated) Metric for CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricCpuUtilization(props: MetricOptions): Metric =
      unwrap(this).metricCPUUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
  public override fun metricCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCpuUtilization(MetricOptions(props))

  /**
   * (deprecated) Metric for the storage space of nodes in the cluster.
   *
   * Default: minimum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricFreeStorageSpace(): Metric =
      unwrap(this).metricFreeStorageSpace().let(Metric::wrap)

  /**
   * (deprecated) Metric for the storage space of nodes in the cluster.
   *
   * Default: minimum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricFreeStorageSpace(props: MetricOptions): Metric =
      unwrap(this).metricFreeStorageSpace(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for the storage space of nodes in the cluster.
   *
   * Default: minimum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("368af7ac3be4f10e672f08286b7e70f8633b6e9198d1685bfedc9108b3414e62")
  public override fun metricFreeStorageSpace(props: MetricOptions.Builder.() -> Unit): Metric =
      metricFreeStorageSpace(MetricOptions(props))

  /**
   * (deprecated) Metric for indexing latency.
   *
   * Default: p99 over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricIndexingLatency(): Metric =
      unwrap(this).metricIndexingLatency().let(Metric::wrap)

  /**
   * (deprecated) Metric for indexing latency.
   *
   * Default: p99 over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricIndexingLatency(props: MetricOptions): Metric =
      unwrap(this).metricIndexingLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for indexing latency.
   *
   * Default: p99 over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("07b87f2aa9d61ee51a0627ce9ffe82c5e5f6e38fef54d0ff7ab95be9c0731c15")
  public override fun metricIndexingLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIndexingLatency(MetricOptions(props))

  /**
   * (deprecated) Metric for JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricJvmMemoryPressure(): Metric =
      unwrap(this).metricJVMMemoryPressure().let(Metric::wrap)

  /**
   * (deprecated) Metric for JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricJvmMemoryPressure(props: MetricOptions): Metric =
      unwrap(this).metricJVMMemoryPressure(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("283ffec8edbd9b28227078700405c8b7b7fe0f6bf433f6323ba9205b4c8a528f")
  public override fun metricJvmMemoryPressure(props: MetricOptions.Builder.() -> Unit): Metric =
      metricJvmMemoryPressure(MetricOptions(props))

  /**
   * (deprecated) Metric for KMS key errors.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricKmsKeyError(): Metric =
      unwrap(this).metricKMSKeyError().let(Metric::wrap)

  /**
   * (deprecated) Metric for KMS key errors.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricKmsKeyError(props: MetricOptions): Metric =
      unwrap(this).metricKMSKeyError(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for KMS key errors.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("309d28dee34b268d496bc1e8ba269d5bff9ec10e9e17132d9a884e208a805741")
  public override fun metricKmsKeyError(props: MetricOptions.Builder.() -> Unit): Metric =
      metricKmsKeyError(MetricOptions(props))

  /**
   * (deprecated) Metric for KMS key being inaccessible.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricKmsKeyInaccessible(): Metric =
      unwrap(this).metricKMSKeyInaccessible().let(Metric::wrap)

  /**
   * (deprecated) Metric for KMS key being inaccessible.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricKmsKeyInaccessible(props: MetricOptions): Metric =
      unwrap(this).metricKMSKeyInaccessible(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for KMS key being inaccessible.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bfca9e4cdc1ad37f6d57f9fdeb4258e1c6235ab92ed8224c8ee4cda359baaad6")
  public override fun metricKmsKeyInaccessible(props: MetricOptions.Builder.() -> Unit): Metric =
      metricKmsKeyInaccessible(MetricOptions(props))

  /**
   * (deprecated) Metric for master CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricMasterCpuUtilization(): Metric =
      unwrap(this).metricMasterCPUUtilization().let(Metric::wrap)

  /**
   * (deprecated) Metric for master CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricMasterCpuUtilization(props: MetricOptions): Metric =
      unwrap(this).metricMasterCPUUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for master CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8a46b211229de3f431630b8ea4f99843647a1cab494f599c79138732a397c709")
  public override fun metricMasterCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricMasterCpuUtilization(MetricOptions(props))

  /**
   * (deprecated) Metric for master JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricMasterJvmMemoryPressure(): Metric =
      unwrap(this).metricMasterJVMMemoryPressure().let(Metric::wrap)

  /**
   * (deprecated) Metric for master JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricMasterJvmMemoryPressure(props: MetricOptions): Metric =
      unwrap(this).metricMasterJVMMemoryPressure(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for master JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fbcf8e4882306bcb2bed673a80ed7a54a16cc27adfc1a7fe173fbb566b335350")
  public override fun metricMasterJvmMemoryPressure(props: MetricOptions.Builder.() -> Unit): Metric
      = metricMasterJvmMemoryPressure(MetricOptions(props))

  /**
   * (deprecated) Metric for the number of nodes.
   *
   * Default: minimum over 1 hour
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricNodes(): Metric = unwrap(this).metricNodes().let(Metric::wrap)

  /**
   * (deprecated) Metric for the number of nodes.
   *
   * Default: minimum over 1 hour
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricNodes(props: MetricOptions): Metric =
      unwrap(this).metricNodes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for the number of nodes.
   *
   * Default: minimum over 1 hour
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("355f82e0d8db21f2bb54b9766182780100c904a3efcf3167fc2c3468c208268b")
  public override fun metricNodes(props: MetricOptions.Builder.() -> Unit): Metric =
      metricNodes(MetricOptions(props))

  /**
   * (deprecated) Metric for search latency.
   *
   * Default: p99 over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricSearchLatency(): Metric =
      unwrap(this).metricSearchLatency().let(Metric::wrap)

  /**
   * (deprecated) Metric for search latency.
   *
   * Default: p99 over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricSearchLatency(props: MetricOptions): Metric =
      unwrap(this).metricSearchLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for search latency.
   *
   * Default: p99 over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b37148931823e387018afa8190e3e362020aa1dc4211a32e63ee13acb1e89fd6")
  public override fun metricSearchLatency(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSearchLatency(MetricOptions(props))

  /**
   * (deprecated) Metric for number of searchable documents.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricSearchableDocuments(): Metric =
      unwrap(this).metricSearchableDocuments().let(Metric::wrap)

  /**
   * (deprecated) Metric for number of searchable documents.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricSearchableDocuments(props: MetricOptions): Metric =
      unwrap(this).metricSearchableDocuments(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for number of searchable documents.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("92e1cde4c44cd4a6f76bd4af6b9e03846698bfe485a039b042b4989c8258df65")
  public override fun metricSearchableDocuments(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSearchableDocuments(MetricOptions(props))

  /**
   * (deprecated) Log group that slow indices are logged to.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun slowIndexLogGroup(): ILogGroup? =
      unwrap(this).getSlowIndexLogGroup()?.let(ILogGroup::wrap)

  /**
   * (deprecated) Log group that slow searches are logged to.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun slowSearchLogGroup(): ILogGroup? =
      unwrap(this).getSlowSearchLogGroup()?.let(ILogGroup::wrap)

  /**
   * (deprecated) A fluent builder for [io.cloudshiftdev.awscdk.services.elasticsearch.Domain].
   */
  @CdkDslMarker
  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    /**
     * (deprecated) Domain Access policies.
     *
     * Default: - No access policies.
     *
     * @deprecated use opensearchservice module instead
     * @param accessPolicies Domain Access policies. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun accessPolicies(accessPolicies: List<CloudshiftdevAwscdkServicesIamPolicyStatement>)

    /**
     * (deprecated) Domain Access policies.
     *
     * Default: - No access policies.
     *
     * @deprecated use opensearchservice module instead
     * @param accessPolicies Domain Access policies. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun accessPolicies(vararg accessPolicies: CloudshiftdevAwscdkServicesIamPolicyStatement)

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
    public fun advancedOptions(advancedOptions: Map<String, String>)

    /**
     * (deprecated) The hour in UTC during which the service takes an automated daily snapshot of
     * the indices in the Amazon ES domain.
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
    public fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number)

    /**
     * (deprecated) The cluster capacity configuration for the Amazon ES domain.
     *
     * Default: - 1 r5.large.elasticsearch data node; no dedicated master nodes.
     *
     * @deprecated use opensearchservice module instead
     * @param capacity The cluster capacity configuration for the Amazon ES domain. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun capacity(capacity: CapacityConfig)

    /**
     * (deprecated) The cluster capacity configuration for the Amazon ES domain.
     *
     * Default: - 1 r5.large.elasticsearch data node; no dedicated master nodes.
     *
     * @deprecated use opensearchservice module instead
     * @param capacity The cluster capacity configuration for the Amazon ES domain. 
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59e14073a9006bd9aeaad8d2850cb89744b0e955f399e88ba1685cdabccaeb27")
    public fun capacity(capacity: CapacityConfig.Builder.() -> Unit)

    /**
     * (deprecated) Configures Amazon ES to use Amazon Cognito authentication for Kibana.
     *
     * Default: - Cognito not used for authentication to Kibana.
     *
     * @deprecated use opensearchservice module instead
     * @param cognitoKibanaAuth Configures Amazon ES to use Amazon Cognito authentication for
     * Kibana. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions)

    /**
     * (deprecated) Configures Amazon ES to use Amazon Cognito authentication for Kibana.
     *
     * Default: - Cognito not used for authentication to Kibana.
     *
     * @deprecated use opensearchservice module instead
     * @param cognitoKibanaAuth Configures Amazon ES to use Amazon Cognito authentication for
     * Kibana. 
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e77ba00188f502ac0b1fec3045bd60bb5eaab1729f7f472ad993b3931ae38621")
    public fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions.Builder.() -> Unit)

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
    public fun customEndpoint(customEndpoint: CustomEndpointOptions)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af3ea43edd5d3febe54a5bf205984de0f18909bbb989205ddb8fb384748a2113")
    public fun customEndpoint(customEndpoint: CustomEndpointOptions.Builder.() -> Unit)

    /**
     * (deprecated) Enforces a particular physical domain name.
     *
     * Default: - A name will be auto-generated.
     *
     * @deprecated use opensearchservice module instead
     * @param domainName Enforces a particular physical domain name. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun domainName(domainName: String)

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
    public fun ebs(ebs: EbsOptions)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11bec5fa51edd86c9862938613dd971392f6f600b8a5c2a986e7cb5d23e72ffb")
    public fun ebs(ebs: EbsOptions.Builder.() -> Unit)

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
    public fun enableVersionUpgrade(enableVersionUpgrade: Boolean)

    /**
     * (deprecated) Encryption at rest options for the cluster.
     *
     * Default: - No encryption at rest
     *
     * @deprecated use opensearchservice module instead
     * @param encryptionAtRest Encryption at rest options for the cluster. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions)

    /**
     * (deprecated) Encryption at rest options for the cluster.
     *
     * Default: - No encryption at rest
     *
     * @deprecated use opensearchservice module instead
     * @param encryptionAtRest Encryption at rest options for the cluster. 
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39c79da56d51b0b0f8496ec80f422777fedcd43ef0d858a7d96a93e534e39d07")
    public fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions.Builder.() -> Unit)

    /**
     * (deprecated) True to require that all traffic to the domain arrive over HTTPS.
     *
     * Default: - false
     *
     * @deprecated use opensearchservice module instead
     * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun enforceHttps(enforceHttps: Boolean)

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
    public fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec0fdf74bda530bf2ff94955382fba11c1d03ef9a750aa65318408b998fb9a1e")
    public
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit)

    /**
     * (deprecated) Configuration log publishing configuration options.
     *
     * Default: - No logs are published
     *
     * @deprecated use opensearchservice module instead
     * @param logging Configuration log publishing configuration options. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun logging(logging: LoggingOptions)

    /**
     * (deprecated) Configuration log publishing configuration options.
     *
     * Default: - No logs are published
     *
     * @deprecated use opensearchservice module instead
     * @param logging Configuration log publishing configuration options. 
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec98f1e9b529d8be1920cc8aa6cbbf7f15a8f26cf1c85a68ab20898f4afe5300")
    public fun logging(logging: LoggingOptions.Builder.() -> Unit)

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
    public fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean)

    /**
     * (deprecated) Policy to apply when the domain is removed from the stack.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @deprecated use opensearchservice module instead
     * @param removalPolicy Policy to apply when the domain is removed from the stack. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun removalPolicy(removalPolicy: RemovalPolicy)

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
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

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
    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    /**
     * (deprecated) The minimum TLS version required for traffic to the domain.
     *
     * Default: - TLSSecurityPolicy.TLS_1_0
     *
     * @deprecated use opensearchservice module instead
     * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy)

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
    public fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean)

    /**
     * (deprecated) The Elasticsearch version that your domain will leverage.
     *
     * @deprecated use opensearchservice module instead
     * @param version The Elasticsearch version that your domain will leverage. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun version(version: ElasticsearchVersion)

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
    public fun vpc(vpc: IVpc)

    /**
     * (deprecated) The specific vpc subnets the domain will be placed in.
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
     * @deprecated use opensearchservice module instead
     * @param vpcSubnets The specific vpc subnets the domain will be placed in. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun vpcSubnets(vpcSubnets: List<SubnetSelection>)

    /**
     * (deprecated) The specific vpc subnets the domain will be placed in.
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
     * @deprecated use opensearchservice module instead
     * @param vpcSubnets The specific vpc subnets the domain will be placed in. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun vpcSubnets(vararg vpcSubnets: SubnetSelection)

    /**
     * (deprecated) The cluster zone awareness configuration for the Amazon ES domain.
     *
     * Default: - no zone awareness (1 AZ)
     *
     * @deprecated use opensearchservice module instead
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon ES domain. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig)

    /**
     * (deprecated) The cluster zone awareness configuration for the Amazon ES domain.
     *
     * Default: - no zone awareness (1 AZ)
     *
     * @deprecated use opensearchservice module instead
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon ES domain. 
     */
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

    /**
     * (deprecated) Domain Access policies.
     *
     * Default: - No access policies.
     *
     * @deprecated use opensearchservice module instead
     * @param accessPolicies Domain Access policies. 
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun accessPolicies(accessPolicies: List<CloudshiftdevAwscdkServicesIamPolicyStatement>) {
      cdkBuilder.accessPolicies(accessPolicies.map(CloudshiftdevAwscdkServicesIamPolicyStatement::unwrap))
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
    override fun accessPolicies(vararg
        accessPolicies: CloudshiftdevAwscdkServicesIamPolicyStatement): Unit =
        accessPolicies(accessPolicies.toList())

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
    override fun advancedOptions(advancedOptions: Map<String, String>) {
      cdkBuilder.advancedOptions(advancedOptions)
    }

    /**
     * (deprecated) The hour in UTC during which the service takes an automated daily snapshot of
     * the indices in the Amazon ES domain.
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
    override fun automatedSnapshotStartHour(automatedSnapshotStartHour: Number) {
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
    override fun capacity(capacity: CapacityConfig) {
      cdkBuilder.capacity(capacity.let(CapacityConfig::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("59e14073a9006bd9aeaad8d2850cb89744b0e955f399e88ba1685cdabccaeb27")
    override fun capacity(capacity: CapacityConfig.Builder.() -> Unit): Unit =
        capacity(CapacityConfig(capacity))

    /**
     * (deprecated) Configures Amazon ES to use Amazon Cognito authentication for Kibana.
     *
     * Default: - Cognito not used for authentication to Kibana.
     *
     * @deprecated use opensearchservice module instead
     * @param cognitoKibanaAuth Configures Amazon ES to use Amazon Cognito authentication for
     * Kibana. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions) {
      cdkBuilder.cognitoKibanaAuth(cognitoKibanaAuth.let(CognitoOptions::unwrap))
    }

    /**
     * (deprecated) Configures Amazon ES to use Amazon Cognito authentication for Kibana.
     *
     * Default: - Cognito not used for authentication to Kibana.
     *
     * @deprecated use opensearchservice module instead
     * @param cognitoKibanaAuth Configures Amazon ES to use Amazon Cognito authentication for
     * Kibana. 
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e77ba00188f502ac0b1fec3045bd60bb5eaab1729f7f472ad993b3931ae38621")
    override fun cognitoKibanaAuth(cognitoKibanaAuth: CognitoOptions.Builder.() -> Unit): Unit =
        cognitoKibanaAuth(CognitoOptions(cognitoKibanaAuth))

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
    override fun customEndpoint(customEndpoint: CustomEndpointOptions) {
      cdkBuilder.customEndpoint(customEndpoint.let(CustomEndpointOptions::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af3ea43edd5d3febe54a5bf205984de0f18909bbb989205ddb8fb384748a2113")
    override fun customEndpoint(customEndpoint: CustomEndpointOptions.Builder.() -> Unit): Unit =
        customEndpoint(CustomEndpointOptions(customEndpoint))

    /**
     * (deprecated) Enforces a particular physical domain name.
     *
     * Default: - A name will be auto-generated.
     *
     * @deprecated use opensearchservice module instead
     * @param domainName Enforces a particular physical domain name. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun domainName(domainName: String) {
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
    override fun ebs(ebs: EbsOptions) {
      cdkBuilder.ebs(ebs.let(EbsOptions::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11bec5fa51edd86c9862938613dd971392f6f600b8a5c2a986e7cb5d23e72ffb")
    override fun ebs(ebs: EbsOptions.Builder.() -> Unit): Unit = ebs(EbsOptions(ebs))

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
    override fun enableVersionUpgrade(enableVersionUpgrade: Boolean) {
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
    override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions) {
      cdkBuilder.encryptionAtRest(encryptionAtRest.let(EncryptionAtRestOptions::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39c79da56d51b0b0f8496ec80f422777fedcd43ef0d858a7d96a93e534e39d07")
    override fun encryptionAtRest(encryptionAtRest: EncryptionAtRestOptions.Builder.() -> Unit):
        Unit = encryptionAtRest(EncryptionAtRestOptions(encryptionAtRest))

    /**
     * (deprecated) True to require that all traffic to the domain arrive over HTTPS.
     *
     * Default: - false
     *
     * @deprecated use opensearchservice module instead
     * @param enforceHttps True to require that all traffic to the domain arrive over HTTPS. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun enforceHttps(enforceHttps: Boolean) {
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
    override fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions) {
      cdkBuilder.fineGrainedAccessControl(fineGrainedAccessControl.let(AdvancedSecurityOptions::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec0fdf74bda530bf2ff94955382fba11c1d03ef9a750aa65318408b998fb9a1e")
    override
        fun fineGrainedAccessControl(fineGrainedAccessControl: AdvancedSecurityOptions.Builder.() -> Unit):
        Unit = fineGrainedAccessControl(AdvancedSecurityOptions(fineGrainedAccessControl))

    /**
     * (deprecated) Configuration log publishing configuration options.
     *
     * Default: - No logs are published
     *
     * @deprecated use opensearchservice module instead
     * @param logging Configuration log publishing configuration options. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun logging(logging: LoggingOptions) {
      cdkBuilder.logging(logging.let(LoggingOptions::unwrap))
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec98f1e9b529d8be1920cc8aa6cbbf7f15a8f26cf1c85a68ab20898f4afe5300")
    override fun logging(logging: LoggingOptions.Builder.() -> Unit): Unit =
        logging(LoggingOptions(logging))

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
    override fun nodeToNodeEncryption(nodeToNodeEncryption: Boolean) {
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
    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
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
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
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
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    /**
     * (deprecated) The minimum TLS version required for traffic to the domain.
     *
     * Default: - TLSSecurityPolicy.TLS_1_0
     *
     * @deprecated use opensearchservice module instead
     * @param tlsSecurityPolicy The minimum TLS version required for traffic to the domain. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun tlsSecurityPolicy(tlsSecurityPolicy: TLSSecurityPolicy) {
      cdkBuilder.tlsSecurityPolicy(tlsSecurityPolicy.let(TLSSecurityPolicy::unwrap))
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
    override fun useUnsignedBasicAuth(useUnsignedBasicAuth: Boolean) {
      cdkBuilder.useUnsignedBasicAuth(useUnsignedBasicAuth)
    }

    /**
     * (deprecated) The Elasticsearch version that your domain will leverage.
     *
     * @deprecated use opensearchservice module instead
     * @param version The Elasticsearch version that your domain will leverage. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun version(version: ElasticsearchVersion) {
      cdkBuilder.version(version.let(ElasticsearchVersion::unwrap))
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
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * (deprecated) The specific vpc subnets the domain will be placed in.
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
     * @deprecated use opensearchservice module instead
     * @param vpcSubnets The specific vpc subnets the domain will be placed in. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun vpcSubnets(vpcSubnets: List<SubnetSelection>) {
      cdkBuilder.vpcSubnets(vpcSubnets.map(SubnetSelection::unwrap))
    }

    /**
     * (deprecated) The specific vpc subnets the domain will be placed in.
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
     * @deprecated use opensearchservice module instead
     * @param vpcSubnets The specific vpc subnets the domain will be placed in. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun vpcSubnets(vararg vpcSubnets: SubnetSelection): Unit =
        vpcSubnets(vpcSubnets.toList())

    /**
     * (deprecated) The cluster zone awareness configuration for the Amazon ES domain.
     *
     * Default: - no zone awareness (1 AZ)
     *
     * @deprecated use opensearchservice module instead
     * @param zoneAwareness The cluster zone awareness configuration for the Amazon ES domain. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun zoneAwareness(zoneAwareness: ZoneAwarenessConfig) {
      cdkBuilder.zoneAwareness(zoneAwareness.let(ZoneAwarenessConfig::unwrap))
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
        wrapped.cdkObject as software.amazon.awscdk.services.elasticsearch.Domain
  }
}
