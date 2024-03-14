package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EmrModifyInstanceGroupByName internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName,
) : TaskStateBase(cdkObject) {
  public interface Builder {
    public fun clusterId(clusterId: String) {
    }

    public fun comment(comment: String) {
    }

    public fun credentials(credentials: Credentials) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfbee46ace2525224ff6b87b3375e67519b270da22f21efdc9dd942cd5da366b")
    public fun credentials(credentials: Credentials.Builder.() -> Unit) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration) {
    }

    public fun heartbeatTimeout(heartbeatTimeout: Timeout) {
    }

    public fun inputPath(inputPath: String) {
    }

    public fun instanceGroup(instanceGroup: InstanceGroupModifyConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fceae4fc76c5e4ed9b22504e0ba1b604ff9cb480409b45cf2ab8a161d5853bc")
    public fun instanceGroup(instanceGroup: InstanceGroupModifyConfigProperty.Builder.() -> Unit) {
    }

    public fun instanceGroupName(instanceGroupName: String) {
    }

    public fun integrationPattern(integrationPattern: IntegrationPattern) {
    }

    public fun outputPath(outputPath: String) {
    }

    public fun resultPath(resultPath: String) {
    }

    public fun resultSelector(resultSelector: Map<String, Any>) {
    }

    public fun stateName(stateName: String) {
    }

    public fun taskTimeout(taskTimeout: Timeout) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.Builder.create(scope,
        id)

    public override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    public override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfbee46ace2525224ff6b87b3375e67519b270da22f21efdc9dd942cd5da366b")
    public override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    @Deprecated(message = "deprecated in CDK")
    public override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    public override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    public override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    public override fun instanceGroup(instanceGroup: InstanceGroupModifyConfigProperty) {
      cdkBuilder.instanceGroup(instanceGroup.let(InstanceGroupModifyConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fceae4fc76c5e4ed9b22504e0ba1b604ff9cb480409b45cf2ab8a161d5853bc")
    public override
        fun instanceGroup(instanceGroup: InstanceGroupModifyConfigProperty.Builder.() -> Unit): Unit
        = instanceGroup(InstanceGroupModifyConfigProperty(instanceGroup))

    public override fun instanceGroupName(instanceGroupName: String) {
      cdkBuilder.instanceGroupName(instanceGroupName)
    }

    public override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    public override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    public override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    public override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    public override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    public override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EmrModifyInstanceGroupByName {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EmrModifyInstanceGroupByName(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName):
        EmrModifyInstanceGroupByName = EmrModifyInstanceGroupByName(cdkObject)

    internal fun unwrap(wrapped: EmrModifyInstanceGroupByName):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName =
        wrapped.cdkObject
  }

  public interface InstanceResizePolicyProperty {
    public fun instanceTerminationTimeout(): Duration? =
        unwrap(this).getInstanceTerminationTimeout()?.let(Duration::wrap)

    public fun instancesToProtect(): List<String> = unwrap(this).getInstancesToProtect() ?:
        emptyList()

    public fun instancesToTerminate(): List<String> = unwrap(this).getInstancesToTerminate() ?:
        emptyList()

    public interface Builder {
      public fun instanceTerminationTimeout(instanceTerminationTimeout: Duration) {
      }

      public fun instancesToProtect(instancesToProtect: List<String>) {
      }

      public fun instancesToTerminate(instancesToTerminate: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty.builder()

      public override fun instanceTerminationTimeout(instanceTerminationTimeout: Duration) {
        cdkBuilder.instanceTerminationTimeout(instanceTerminationTimeout.let(Duration::unwrap))
      }

      public override fun instancesToProtect(instancesToProtect: List<String>) {
        cdkBuilder.instancesToProtect(instancesToProtect)
      }

      public override fun instancesToTerminate(instancesToTerminate: List<String>) {
        cdkBuilder.instancesToTerminate(instancesToTerminate)
      }

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty,
    ) : InstanceResizePolicyProperty {
      public override fun instanceTerminationTimeout(): Duration? =
          unwrap(this).getInstanceTerminationTimeout()?.let(Duration::wrap)

      public override fun instancesToProtect(): List<String> = unwrap(this).getInstancesToProtect()
          ?: emptyList()

      public override fun instancesToTerminate(): List<String> =
          unwrap(this).getInstancesToTerminate() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceResizePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty):
          InstanceResizePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceResizePolicyProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ShrinkPolicyProperty {
    public fun decommissionTimeout(): Duration? =
        unwrap(this).getDecommissionTimeout()?.let(Duration::wrap)

    public fun instanceResizePolicy(): InstanceResizePolicyProperty? =
        unwrap(this).getInstanceResizePolicy()?.let(InstanceResizePolicyProperty::wrap)

    public interface Builder {
      public fun decommissionTimeout(decommissionTimeout: Duration) {
      }

      public fun instanceResizePolicy(instanceResizePolicy: InstanceResizePolicyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56d4576baf2f9bf78146137f7d858182ed08b35c01a56f19d4d822f3f246353b")
      public
          fun instanceResizePolicy(instanceResizePolicy: InstanceResizePolicyProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty.builder()

      public override fun decommissionTimeout(decommissionTimeout: Duration) {
        cdkBuilder.decommissionTimeout(decommissionTimeout.let(Duration::unwrap))
      }

      public override fun instanceResizePolicy(instanceResizePolicy: InstanceResizePolicyProperty) {
        cdkBuilder.instanceResizePolicy(instanceResizePolicy.let(InstanceResizePolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56d4576baf2f9bf78146137f7d858182ed08b35c01a56f19d4d822f3f246353b")
      public override
          fun instanceResizePolicy(instanceResizePolicy: InstanceResizePolicyProperty.Builder.() -> Unit):
          Unit = instanceResizePolicy(InstanceResizePolicyProperty(instanceResizePolicy))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty,
    ) : ShrinkPolicyProperty {
      public override fun decommissionTimeout(): Duration? =
          unwrap(this).getDecommissionTimeout()?.let(Duration::wrap)

      public override fun instanceResizePolicy(): InstanceResizePolicyProperty? =
          unwrap(this).getInstanceResizePolicy()?.let(InstanceResizePolicyProperty::wrap)
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ShrinkPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty):
          ShrinkPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShrinkPolicyProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InstanceGroupModifyConfigProperty {
    public fun configurations(): List<EmrCreateCluster.ConfigurationProperty> =
        unwrap(this).getConfigurations()?.map(EmrCreateCluster.ConfigurationProperty::wrap) ?:
        emptyList()

    public fun ec2InstanceIdsToTerminate(): List<String> =
        unwrap(this).getEC2InstanceIdsToTerminate() ?: emptyList()

    public fun instanceCount(): Number? = unwrap(this).getInstanceCount()

    public fun shrinkPolicy(): ShrinkPolicyProperty? =
        unwrap(this).getShrinkPolicy()?.let(ShrinkPolicyProperty::wrap)

    public interface Builder {
      public fun configurations(configurations: List<EmrCreateCluster.ConfigurationProperty>) {
      }

      public fun eC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate: List<String>) {
      }

      public fun instanceCount(instanceCount: Number) {
      }

      public fun shrinkPolicy(shrinkPolicy: ShrinkPolicyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("780915b8831837b2846bf69d48cc0a5e6f8bfaa375d231e50add83eedad1c123")
      public fun shrinkPolicy(shrinkPolicy: ShrinkPolicyProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty.builder()

      public override
          fun configurations(configurations: List<EmrCreateCluster.ConfigurationProperty>) {
        cdkBuilder.configurations(configurations.map(EmrCreateCluster.ConfigurationProperty::unwrap))
      }

      public override fun eC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate: List<String>) {
        cdkBuilder.eC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate)
      }

      public override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      public override fun shrinkPolicy(shrinkPolicy: ShrinkPolicyProperty) {
        cdkBuilder.shrinkPolicy(shrinkPolicy.let(ShrinkPolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("780915b8831837b2846bf69d48cc0a5e6f8bfaa375d231e50add83eedad1c123")
      public override fun shrinkPolicy(shrinkPolicy: ShrinkPolicyProperty.Builder.() -> Unit): Unit
          = shrinkPolicy(ShrinkPolicyProperty(shrinkPolicy))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty,
    ) : InstanceGroupModifyConfigProperty {
      public override fun configurations(): List<EmrCreateCluster.ConfigurationProperty> =
          unwrap(this).getConfigurations()?.map(EmrCreateCluster.ConfigurationProperty::wrap) ?:
          emptyList()

      public override fun ec2InstanceIdsToTerminate(): List<String> =
          unwrap(this).getEC2InstanceIdsToTerminate() ?: emptyList()

      public override fun instanceCount(): Number? = unwrap(this).getInstanceCount()

      public override fun shrinkPolicy(): ShrinkPolicyProperty? =
          unwrap(this).getShrinkPolicy()?.let(ShrinkPolicyProperty::wrap)
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceGroupModifyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty):
          InstanceGroupModifyConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceGroupModifyConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
