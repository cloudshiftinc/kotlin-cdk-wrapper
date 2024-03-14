package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecretAttachmentTarget
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IDatabaseInstance : IResource, IConnectable, ISecretAttachmentTarget {
  public fun addProxy(arg0: String, arg1: DatabaseProxyOptions): DatabaseProxy

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("88c3f7afe80587682acb73327f437ae531d6b1be89cc947d8c70a770c539b4be")
  public fun addProxy(arg0: String, arg1: DatabaseProxyOptions.Builder.() -> Unit): DatabaseProxy

  public fun dbInstanceEndpointAddress(): String

  public fun dbInstanceEndpointPort(): String

  public fun engine(): IInstanceEngine? = unwrap(this).getEngine()?.let(IInstanceEngine::wrap)

  public fun grantConnect(arg0: IGrantable): Grant

  public fun grantConnect(arg0: IGrantable, arg1: String): Grant

  public fun instanceArn(): String

  public fun instanceEndpoint(): Endpoint

  public fun instanceIdentifier(): String

  public fun instanceResourceId(): String? = unwrap(this).getInstanceResourceId()

  public fun metric(arg0: String): Metric

  public fun metric(arg0: String, arg1: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun metricCpuUtilization(): Metric

  public fun metricCpuUtilization(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
  public fun metricCpuUtilization(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricDatabaseConnections(): Metric

  public fun metricDatabaseConnections(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("da93b368080fddd327564c3f008e4c664a1799b65b054ae9fec1c7433068712b")
  public fun metricDatabaseConnections(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricFreeStorageSpace(): Metric

  public fun metricFreeStorageSpace(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("368af7ac3be4f10e672f08286b7e70f8633b6e9198d1685bfedc9108b3414e62")
  public fun metricFreeStorageSpace(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricFreeableMemory(): Metric

  public fun metricFreeableMemory(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("52581dbf24aa60f3a3d2a22ad5c3a44848ddd52404f8b8dd8e3c0d665b77d5cf")
  public fun metricFreeableMemory(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricReadIops(): Metric

  public fun metricReadIops(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("49526da03d196d2f975a43ba7ac595a380f6b4f4817805d76831acb9d384a0dc")
  public fun metricReadIops(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricWriteIops(): Metric

  public fun metricWriteIops(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c0e40270e6e53bc6598d5ec2710a93c940874139b12355a5e5d9925c9ff439a")
  public fun metricWriteIops(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun onEvent(arg0: String): Rule

  public fun onEvent(arg0: String, arg1: OnEventOptions): Rule

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public fun onEvent(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.IDatabaseInstance,
  ) : IDatabaseInstance {
    public override fun addProxy(arg0: String, arg1: DatabaseProxyOptions): DatabaseProxy =
        unwrap(this).addProxy(arg0, arg1.let(DatabaseProxyOptions::unwrap)).let(DatabaseProxy::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88c3f7afe80587682acb73327f437ae531d6b1be89cc947d8c70a770c539b4be")
    public override fun addProxy(arg0: String, arg1: DatabaseProxyOptions.Builder.() -> Unit):
        DatabaseProxy = addProxy(arg0, DatabaseProxyOptions(arg1))

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
        unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

    public override fun connections(): Connections =
        unwrap(this).getConnections().let(Connections::wrap)

    public override fun dbInstanceEndpointAddress(): String =
        unwrap(this).getDbInstanceEndpointAddress()

    public override fun dbInstanceEndpointPort(): String = unwrap(this).getDbInstanceEndpointPort()

    public override fun engine(): IInstanceEngine? =
        unwrap(this).getEngine()?.let(IInstanceEngine::wrap)

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grantConnect(arg0: IGrantable): Grant =
        unwrap(this).grantConnect(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun grantConnect(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grantConnect(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    public override fun instanceArn(): String = unwrap(this).getInstanceArn()

    public override fun instanceEndpoint(): Endpoint =
        unwrap(this).getInstanceEndpoint().let(Endpoint::wrap)

    public override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

    public override fun instanceResourceId(): String? = unwrap(this).getInstanceResourceId()

    public override fun metric(arg0: String): Metric = unwrap(this).metric(arg0).let(Metric::wrap)

    public override fun metric(arg0: String, arg1: MetricOptions): Metric =
        unwrap(this).metric(arg0, arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    public override fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric =
        metric(arg0, MetricOptions(arg1))

    public override fun metricCpuUtilization(): Metric =
        unwrap(this).metricCPUUtilization().let(Metric::wrap)

    public override fun metricCpuUtilization(arg0: MetricOptions): Metric =
        unwrap(this).metricCPUUtilization(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
    public override fun metricCpuUtilization(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricCpuUtilization(MetricOptions(arg0))

    public override fun metricDatabaseConnections(): Metric =
        unwrap(this).metricDatabaseConnections().let(Metric::wrap)

    public override fun metricDatabaseConnections(arg0: MetricOptions): Metric =
        unwrap(this).metricDatabaseConnections(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da93b368080fddd327564c3f008e4c664a1799b65b054ae9fec1c7433068712b")
    public override fun metricDatabaseConnections(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricDatabaseConnections(MetricOptions(arg0))

    public override fun metricFreeStorageSpace(): Metric =
        unwrap(this).metricFreeStorageSpace().let(Metric::wrap)

    public override fun metricFreeStorageSpace(arg0: MetricOptions): Metric =
        unwrap(this).metricFreeStorageSpace(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("368af7ac3be4f10e672f08286b7e70f8633b6e9198d1685bfedc9108b3414e62")
    public override fun metricFreeStorageSpace(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricFreeStorageSpace(MetricOptions(arg0))

    public override fun metricFreeableMemory(): Metric =
        unwrap(this).metricFreeableMemory().let(Metric::wrap)

    public override fun metricFreeableMemory(arg0: MetricOptions): Metric =
        unwrap(this).metricFreeableMemory(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52581dbf24aa60f3a3d2a22ad5c3a44848ddd52404f8b8dd8e3c0d665b77d5cf")
    public override fun metricFreeableMemory(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricFreeableMemory(MetricOptions(arg0))

    public override fun metricReadIops(): Metric = unwrap(this).metricReadIOPS().let(Metric::wrap)

    public override fun metricReadIops(arg0: MetricOptions): Metric =
        unwrap(this).metricReadIOPS(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("49526da03d196d2f975a43ba7ac595a380f6b4f4817805d76831acb9d384a0dc")
    public override fun metricReadIops(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricReadIops(MetricOptions(arg0))

    public override fun metricWriteIops(): Metric = unwrap(this).metricWriteIOPS().let(Metric::wrap)

    public override fun metricWriteIops(arg0: MetricOptions): Metric =
        unwrap(this).metricWriteIOPS(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c0e40270e6e53bc6598d5ec2710a93c940874139b12355a5e5d9925c9ff439a")
    public override fun metricWriteIops(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricWriteIops(MetricOptions(arg0))

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun onEvent(arg0: String): Rule = unwrap(this).onEvent(arg0).let(Rule::wrap)

    public override fun onEvent(arg0: String, arg1: OnEventOptions): Rule =
        unwrap(this).onEvent(arg0, arg1.let(OnEventOptions::unwrap)).let(Rule::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
    public override fun onEvent(arg0: String, arg1: OnEventOptions.Builder.() -> Unit): Rule =
        onEvent(arg0, OnEventOptions(arg1))

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IDatabaseInstance):
        IDatabaseInstance = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDatabaseInstance):
        software.amazon.awscdk.services.rds.IDatabaseInstance = (wrapped as Wrapper).cdkObject
  }
}
