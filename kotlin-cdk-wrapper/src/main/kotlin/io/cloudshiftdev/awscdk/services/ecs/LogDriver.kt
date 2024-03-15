@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class LogDriver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.LogDriver,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: Construct, arg1: ContainerDefinition): LogDriverConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap),
      arg1.let(ContainerDefinition::unwrap)).let(LogDriverConfig::wrap)

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
