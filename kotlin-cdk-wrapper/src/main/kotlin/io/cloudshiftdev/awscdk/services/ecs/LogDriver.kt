@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The base class for log drivers.
 *
 * Example:
 *
 * ```
 * // Create a Task Definition for the container to start
 * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
 * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("example-image"))
 * .memoryLimitMiB(256)
 * .logging(LogDrivers.awsLogs(AwsLogDriverProps.builder()
 * .streamPrefix("EventDemo")
 * .mode(AwsLogDriverMode.NON_BLOCKING)
 * .maxBufferSize(Size.mebibytes(25))
 * .build()))
 * .build());
 * ```
 */
public abstract class LogDriver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.LogDriver,
) : CdkObject(cdkObject) {
  /**
   * Called when the log driver is configured on a container.
   *
   * @param scope 
   * @param containerDefinition 
   */
  public open fun bind(scope: Construct, containerDefinition: ContainerDefinition): LogDriverConfig
      = unwrap(this).bind(scope.let(Construct::unwrap),
      containerDefinition.let(ContainerDefinition::unwrap)).let(LogDriverConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.LogDriver,
  ) : LogDriver(cdkObject)

  public companion object {
    public fun awsLogs(props: AwsLogDriverProps): LogDriver =
        software.amazon.awscdk.services.ecs.LogDriver.awsLogs(props.let(AwsLogDriverProps::unwrap)).let(LogDriver::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2d0d9a506ce9f0fb5ba45e5e4ad84bbef85836d2019566b9bd522ad46b3e85e")
    public fun awsLogs(props: AwsLogDriverProps.Builder.() -> Unit): LogDriver =
        awsLogs(AwsLogDriverProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.LogDriver): LogDriver =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogDriver): software.amazon.awscdk.services.ecs.LogDriver =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.LogDriver
  }
}
