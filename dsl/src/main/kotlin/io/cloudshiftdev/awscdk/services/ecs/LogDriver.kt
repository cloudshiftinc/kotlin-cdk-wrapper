package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class LogDriver internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.LogDriver,
) {
  public open fun bind(arg0: Construct, arg1: ContainerDefinition): LogDriverConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap),
      arg1.let(ContainerDefinition::unwrap)).let(LogDriverConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.LogDriver,
  ) : LogDriver(cdkObject)

  public companion object {
    public open fun awsLogs(props: AwsLogDriverProps): LogDriver =
        software.amazon.awscdk.services.ecs.LogDriver.awsLogs(props.let(AwsLogDriverProps::unwrap)).let(LogDriver::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2d0d9a506ce9f0fb5ba45e5e4ad84bbef85836d2019566b9bd522ad46b3e85e")
    public open fun awsLogs(props: AwsLogDriverProps.Builder.() -> Unit): LogDriver =
        awsLogs(AwsLogDriverProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.LogDriver): LogDriver =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogDriver): software.amazon.awscdk.services.ecs.LogDriver =
        (wrapped as Wrapper).cdkObject
  }
}
