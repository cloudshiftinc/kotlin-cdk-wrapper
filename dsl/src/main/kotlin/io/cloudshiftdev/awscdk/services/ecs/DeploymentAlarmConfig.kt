package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface DeploymentAlarmConfig : DeploymentAlarmOptions {
  /**
   * List of alarm names to monitor during deployments.
   */
  public fun alarmNames(): List<String>

  /**
   * A builder for [DeploymentAlarmConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alarmNames List of alarm names to monitor during deployments. 
     */
    public fun alarmNames(alarmNames: List<String>)

    /**
     * @param alarmNames List of alarm names to monitor during deployments. 
     */
    public fun alarmNames(vararg alarmNames: String)

    /**
     * @param behavior Default rollback on alarm.
     */
    public fun behavior(behavior: AlarmBehavior)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.DeploymentAlarmConfig.Builder =
        software.amazon.awscdk.services.ecs.DeploymentAlarmConfig.builder()

    /**
     * @param alarmNames List of alarm names to monitor during deployments. 
     */
    override fun alarmNames(alarmNames: List<String>) {
      cdkBuilder.alarmNames(alarmNames)
    }

    /**
     * @param alarmNames List of alarm names to monitor during deployments. 
     */
    override fun alarmNames(vararg alarmNames: String): Unit = alarmNames(alarmNames.toList())

    /**
     * @param behavior Default rollback on alarm.
     */
    override fun behavior(behavior: AlarmBehavior) {
      cdkBuilder.behavior(behavior.let(AlarmBehavior::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.DeploymentAlarmConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.DeploymentAlarmConfig,
  ) : CdkObject(cdkObject), DeploymentAlarmConfig {
    /**
     * List of alarm names to monitor during deployments.
     */
    override fun alarmNames(): List<String> = unwrap(this).getAlarmNames()

    /**
     * Default rollback on alarm.
     *
     * Default: AlarmBehavior.ROLLBACK_ON_ALARM
     */
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
