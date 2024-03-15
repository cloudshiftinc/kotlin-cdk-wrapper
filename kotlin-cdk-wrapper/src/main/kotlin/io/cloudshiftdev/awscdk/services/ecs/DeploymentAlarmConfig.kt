@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface DeploymentAlarmConfig : DeploymentAlarmOptions {
  public fun alarmNames(): List<String>

  @CdkDslMarker
  public interface Builder {
    public fun alarmNames(alarmNames: List<String>)

    public fun alarmNames(vararg alarmNames: String)

    public fun behavior(behavior: AlarmBehavior)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.DeploymentAlarmConfig.Builder =
        software.amazon.awscdk.services.ecs.DeploymentAlarmConfig.builder()

    override fun alarmNames(alarmNames: List<String>) {
      cdkBuilder.alarmNames(alarmNames)
    }

    override fun alarmNames(vararg alarmNames: String): Unit = alarmNames(alarmNames.toList())

    override fun behavior(behavior: AlarmBehavior) {
      cdkBuilder.behavior(behavior.let(AlarmBehavior::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.DeploymentAlarmConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.DeploymentAlarmConfig,
  ) : CdkObject(cdkObject), DeploymentAlarmConfig {
    override fun alarmNames(): List<String> = unwrap(this).getAlarmNames()

    override fun behavior(): AlarmBehavior? = unwrap(this).getBehavior()?.let(AlarmBehavior::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentAlarmConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.DeploymentAlarmConfig):
        DeploymentAlarmConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DeploymentAlarmConfig):
        software.amazon.awscdk.services.ecs.DeploymentAlarmConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.DeploymentAlarmConfig
  }
}
