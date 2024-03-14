package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IDomain : IResource {
  public fun domainArn(): String

  public fun domainEndpoint(): String

  public fun domainId(): String

  public fun domainName(): String

  public fun grantIndexRead(arg0: String, arg1: IGrantable): Grant

  public fun grantIndexReadWrite(arg0: String, arg1: IGrantable): Grant

  public fun grantIndexWrite(arg0: String, arg1: IGrantable): Grant

  public fun grantPathRead(arg0: String, arg1: IGrantable): Grant

  public fun grantPathReadWrite(arg0: String, arg1: IGrantable): Grant

  public fun grantPathWrite(arg0: String, arg1: IGrantable): Grant

  public fun grantRead(arg0: IGrantable): Grant

  public fun grantReadWrite(arg0: IGrantable): Grant

  public fun grantWrite(arg0: IGrantable): Grant

  public fun metric(arg0: String): Metric

  public fun metric(arg0: String, arg1: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun metricAutomatedSnapshotFailure(): Metric

  public fun metricAutomatedSnapshotFailure(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9f702cdc4e375e8b739cdce26ff5c0a5606646a98edb39614863885f1182c7f")
  public fun metricAutomatedSnapshotFailure(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricClusterIndexWritesBlocked(): Metric

  public fun metricClusterIndexWritesBlocked(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("016b489514978517ae80814c783dc254d3f821a64ba427a0725fa9ed3e854018")
  public fun metricClusterIndexWritesBlocked(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricClusterStatusRed(): Metric

  public fun metricClusterStatusRed(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e0926b5a2e18fffe32b1ec2076e81bbcc7d98107a425301c58fbc9d2905a860")
  public fun metricClusterStatusRed(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricClusterStatusYellow(): Metric

  public fun metricClusterStatusYellow(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1ef39420c98f9d4cfefd45b8c2db0c21ea1a1e68a7c9b723df1412af465bda2f")
  public fun metricClusterStatusYellow(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricCpuUtilization(): Metric

  public fun metricCpuUtilization(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
  public fun metricCpuUtilization(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricFreeStorageSpace(): Metric

  public fun metricFreeStorageSpace(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("368af7ac3be4f10e672f08286b7e70f8633b6e9198d1685bfedc9108b3414e62")
  public fun metricFreeStorageSpace(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricIndexingLatency(): Metric

  public fun metricIndexingLatency(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("07b87f2aa9d61ee51a0627ce9ffe82c5e5f6e38fef54d0ff7ab95be9c0731c15")
  public fun metricIndexingLatency(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricJvmMemoryPressure(): Metric

  public fun metricJvmMemoryPressure(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("283ffec8edbd9b28227078700405c8b7b7fe0f6bf433f6323ba9205b4c8a528f")
  public fun metricJvmMemoryPressure(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricKmsKeyError(): Metric

  public fun metricKmsKeyError(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("309d28dee34b268d496bc1e8ba269d5bff9ec10e9e17132d9a884e208a805741")
  public fun metricKmsKeyError(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricKmsKeyInaccessible(): Metric

  public fun metricKmsKeyInaccessible(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bfca9e4cdc1ad37f6d57f9fdeb4258e1c6235ab92ed8224c8ee4cda359baaad6")
  public fun metricKmsKeyInaccessible(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricMasterCpuUtilization(): Metric

  public fun metricMasterCpuUtilization(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8a46b211229de3f431630b8ea4f99843647a1cab494f599c79138732a397c709")
  public fun metricMasterCpuUtilization(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricMasterJvmMemoryPressure(): Metric

  public fun metricMasterJvmMemoryPressure(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fbcf8e4882306bcb2bed673a80ed7a54a16cc27adfc1a7fe173fbb566b335350")
  public fun metricMasterJvmMemoryPressure(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricNodes(): Metric

  public fun metricNodes(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("355f82e0d8db21f2bb54b9766182780100c904a3efcf3167fc2c3468c208268b")
  public fun metricNodes(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricSearchLatency(): Metric

  public fun metricSearchLatency(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b37148931823e387018afa8190e3e362020aa1dc4211a32e63ee13acb1e89fd6")
  public fun metricSearchLatency(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricSearchableDocuments(): Metric

  public fun metricSearchableDocuments(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("92e1cde4c44cd4a6f76bd4af6b9e03846698bfe485a039b042b4989c8258df65")
  public fun metricSearchableDocuments(arg0: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.opensearchservice.IDomain,
  ) : IDomain {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun domainArn(): String = unwrap(this).getDomainArn()

    override fun domainEndpoint(): String = unwrap(this).getDomainEndpoint()

    override fun domainId(): String = unwrap(this).getDomainId()

    override fun domainName(): String = unwrap(this).getDomainName()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantIndexRead(arg0: String, arg1: IGrantable): Grant =
        unwrap(this).grantIndexRead(arg0, arg1.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantIndexReadWrite(arg0: String, arg1: IGrantable): Grant =
        unwrap(this).grantIndexReadWrite(arg0, arg1.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantIndexWrite(arg0: String, arg1: IGrantable): Grant =
        unwrap(this).grantIndexWrite(arg0, arg1.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantPathRead(arg0: String, arg1: IGrantable): Grant =
        unwrap(this).grantPathRead(arg0, arg1.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantPathReadWrite(arg0: String, arg1: IGrantable): Grant =
        unwrap(this).grantPathReadWrite(arg0, arg1.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantPathWrite(arg0: String, arg1: IGrantable): Grant =
        unwrap(this).grantPathWrite(arg0, arg1.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantRead(arg0: IGrantable): Grant =
        unwrap(this).grantRead(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantReadWrite(arg0: IGrantable): Grant =
        unwrap(this).grantReadWrite(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantWrite(arg0: IGrantable): Grant =
        unwrap(this).grantWrite(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun metric(arg0: String): Metric = unwrap(this).metric(arg0).let(Metric::wrap)

    override fun metric(arg0: String, arg1: MetricOptions): Metric = unwrap(this).metric(arg0,
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric = metric(arg0,
        MetricOptions(arg1))

    override fun metricAutomatedSnapshotFailure(): Metric =
        unwrap(this).metricAutomatedSnapshotFailure().let(Metric::wrap)

    override fun metricAutomatedSnapshotFailure(arg0: MetricOptions): Metric =
        unwrap(this).metricAutomatedSnapshotFailure(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9f702cdc4e375e8b739cdce26ff5c0a5606646a98edb39614863885f1182c7f")
    override fun metricAutomatedSnapshotFailure(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricAutomatedSnapshotFailure(MetricOptions(arg0))

    override fun metricClusterIndexWritesBlocked(): Metric =
        unwrap(this).metricClusterIndexWritesBlocked().let(Metric::wrap)

    override fun metricClusterIndexWritesBlocked(arg0: MetricOptions): Metric =
        unwrap(this).metricClusterIndexWritesBlocked(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("016b489514978517ae80814c783dc254d3f821a64ba427a0725fa9ed3e854018")
    override fun metricClusterIndexWritesBlocked(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricClusterIndexWritesBlocked(MetricOptions(arg0))

    override fun metricClusterStatusRed(): Metric =
        unwrap(this).metricClusterStatusRed().let(Metric::wrap)

    override fun metricClusterStatusRed(arg0: MetricOptions): Metric =
        unwrap(this).metricClusterStatusRed(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e0926b5a2e18fffe32b1ec2076e81bbcc7d98107a425301c58fbc9d2905a860")
    override fun metricClusterStatusRed(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricClusterStatusRed(MetricOptions(arg0))

    override fun metricClusterStatusYellow(): Metric =
        unwrap(this).metricClusterStatusYellow().let(Metric::wrap)

    override fun metricClusterStatusYellow(arg0: MetricOptions): Metric =
        unwrap(this).metricClusterStatusYellow(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ef39420c98f9d4cfefd45b8c2db0c21ea1a1e68a7c9b723df1412af465bda2f")
    override fun metricClusterStatusYellow(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricClusterStatusYellow(MetricOptions(arg0))

    override fun metricCpuUtilization(): Metric =
        unwrap(this).metricCPUUtilization().let(Metric::wrap)

    override fun metricCpuUtilization(arg0: MetricOptions): Metric =
        unwrap(this).metricCPUUtilization(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
    override fun metricCpuUtilization(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricCpuUtilization(MetricOptions(arg0))

    override fun metricFreeStorageSpace(): Metric =
        unwrap(this).metricFreeStorageSpace().let(Metric::wrap)

    override fun metricFreeStorageSpace(arg0: MetricOptions): Metric =
        unwrap(this).metricFreeStorageSpace(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("368af7ac3be4f10e672f08286b7e70f8633b6e9198d1685bfedc9108b3414e62")
    override fun metricFreeStorageSpace(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricFreeStorageSpace(MetricOptions(arg0))

    override fun metricIndexingLatency(): Metric =
        unwrap(this).metricIndexingLatency().let(Metric::wrap)

    override fun metricIndexingLatency(arg0: MetricOptions): Metric =
        unwrap(this).metricIndexingLatency(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07b87f2aa9d61ee51a0627ce9ffe82c5e5f6e38fef54d0ff7ab95be9c0731c15")
    override fun metricIndexingLatency(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricIndexingLatency(MetricOptions(arg0))

    override fun metricJvmMemoryPressure(): Metric =
        unwrap(this).metricJVMMemoryPressure().let(Metric::wrap)

    override fun metricJvmMemoryPressure(arg0: MetricOptions): Metric =
        unwrap(this).metricJVMMemoryPressure(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("283ffec8edbd9b28227078700405c8b7b7fe0f6bf433f6323ba9205b4c8a528f")
    override fun metricJvmMemoryPressure(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricJvmMemoryPressure(MetricOptions(arg0))

    override fun metricKmsKeyError(): Metric = unwrap(this).metricKMSKeyError().let(Metric::wrap)

    override fun metricKmsKeyError(arg0: MetricOptions): Metric =
        unwrap(this).metricKMSKeyError(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("309d28dee34b268d496bc1e8ba269d5bff9ec10e9e17132d9a884e208a805741")
    override fun metricKmsKeyError(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricKmsKeyError(MetricOptions(arg0))

    override fun metricKmsKeyInaccessible(): Metric =
        unwrap(this).metricKMSKeyInaccessible().let(Metric::wrap)

    override fun metricKmsKeyInaccessible(arg0: MetricOptions): Metric =
        unwrap(this).metricKMSKeyInaccessible(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfca9e4cdc1ad37f6d57f9fdeb4258e1c6235ab92ed8224c8ee4cda359baaad6")
    override fun metricKmsKeyInaccessible(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricKmsKeyInaccessible(MetricOptions(arg0))

    override fun metricMasterCpuUtilization(): Metric =
        unwrap(this).metricMasterCPUUtilization().let(Metric::wrap)

    override fun metricMasterCpuUtilization(arg0: MetricOptions): Metric =
        unwrap(this).metricMasterCPUUtilization(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a46b211229de3f431630b8ea4f99843647a1cab494f599c79138732a397c709")
    override fun metricMasterCpuUtilization(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricMasterCpuUtilization(MetricOptions(arg0))

    override fun metricMasterJvmMemoryPressure(): Metric =
        unwrap(this).metricMasterJVMMemoryPressure().let(Metric::wrap)

    override fun metricMasterJvmMemoryPressure(arg0: MetricOptions): Metric =
        unwrap(this).metricMasterJVMMemoryPressure(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fbcf8e4882306bcb2bed673a80ed7a54a16cc27adfc1a7fe173fbb566b335350")
    override fun metricMasterJvmMemoryPressure(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricMasterJvmMemoryPressure(MetricOptions(arg0))

    override fun metricNodes(): Metric = unwrap(this).metricNodes().let(Metric::wrap)

    override fun metricNodes(arg0: MetricOptions): Metric =
        unwrap(this).metricNodes(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("355f82e0d8db21f2bb54b9766182780100c904a3efcf3167fc2c3468c208268b")
    override fun metricNodes(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricNodes(MetricOptions(arg0))

    override fun metricSearchLatency(): Metric =
        unwrap(this).metricSearchLatency().let(Metric::wrap)

    override fun metricSearchLatency(arg0: MetricOptions): Metric =
        unwrap(this).metricSearchLatency(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b37148931823e387018afa8190e3e362020aa1dc4211a32e63ee13acb1e89fd6")
    override fun metricSearchLatency(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricSearchLatency(MetricOptions(arg0))

    override fun metricSearchableDocuments(): Metric =
        unwrap(this).metricSearchableDocuments().let(Metric::wrap)

    override fun metricSearchableDocuments(arg0: MetricOptions): Metric =
        unwrap(this).metricSearchableDocuments(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92e1cde4c44cd4a6f76bd4af6b9e03846698bfe485a039b042b4989c8258df65")
    override fun metricSearchableDocuments(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricSearchableDocuments(MetricOptions(arg0))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.IDomain): IDomain
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDomain): software.amazon.awscdk.services.opensearchservice.IDomain
        = (wrapped as Wrapper).cdkObject
  }
}
