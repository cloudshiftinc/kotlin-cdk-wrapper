@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBaseProps
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface EmrModifyInstanceGroupByNameProps : TaskStateBaseProps {
  public fun clusterId(): String

  public fun instanceGroup(): EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty

  public fun instanceGroupName(): String

  @CdkDslMarker
  public interface Builder {
    public fun clusterId(clusterId: String)

    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce89af278df724e797c6371858864300e5116783384c133ebbcc9ce913a5f4cf")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public
        fun instanceGroup(instanceGroup: EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b475a2337ebeab6b60ecab1aac061b2963d82b66051e7a0430e722d0509b5305")
    public
        fun instanceGroup(instanceGroup: EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty.Builder.() -> Unit)

    public fun instanceGroupName(instanceGroupName: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun outputPath(outputPath: String)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun stateName(stateName: String)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByNameProps.Builder
        =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByNameProps.builder()

    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce89af278df724e797c6371858864300e5116783384c133ebbcc9ce913a5f4cf")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override
        fun instanceGroup(instanceGroup: EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty) {
      cdkBuilder.instanceGroup(instanceGroup.let(EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b475a2337ebeab6b60ecab1aac061b2963d82b66051e7a0430e722d0509b5305")
    override
        fun instanceGroup(instanceGroup: EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty.Builder.() -> Unit):
        Unit =
        instanceGroup(EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty(instanceGroup))

    override fun instanceGroupName(instanceGroupName: String) {
      cdkBuilder.instanceGroupName(instanceGroupName)
    }

    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByNameProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByNameProps,
  ) : CdkObject(cdkObject), EmrModifyInstanceGroupByNameProps {
    override fun clusterId(): String = unwrap(this).getClusterId()

    override fun comment(): String? = unwrap(this).getComment()

    override fun credentials(): Credentials? = unwrap(this).getCredentials()?.let(Credentials::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(): Duration? = unwrap(this).getHeartbeat()?.let(Duration::wrap)

    override fun heartbeatTimeout(): Timeout? =
        unwrap(this).getHeartbeatTimeout()?.let(Timeout::wrap)

    override fun inputPath(): String? = unwrap(this).getInputPath()

    override fun instanceGroup(): EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty =
        unwrap(this).getInstanceGroup().let(EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty::wrap)

    override fun instanceGroupName(): String = unwrap(this).getInstanceGroupName()

    override fun integrationPattern(): IntegrationPattern? =
        unwrap(this).getIntegrationPattern()?.let(IntegrationPattern::wrap)

    override fun outputPath(): String? = unwrap(this).getOutputPath()

    override fun resultPath(): String? = unwrap(this).getResultPath()

    override fun resultSelector(): Map<String, Any> = unwrap(this).getResultSelector() ?: emptyMap()

    override fun stateName(): String? = unwrap(this).getStateName()

    override fun taskTimeout(): Timeout? = unwrap(this).getTaskTimeout()?.let(Timeout::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EmrModifyInstanceGroupByNameProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByNameProps):
        EmrModifyInstanceGroupByNameProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EmrModifyInstanceGroupByNameProps):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByNameProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByNameProps
  }
}
