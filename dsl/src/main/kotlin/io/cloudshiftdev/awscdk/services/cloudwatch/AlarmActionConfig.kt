package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface AlarmActionConfig {
  /**
   * Return the ARN that should be used for a CloudWatch Alarm action.
   */
  public fun alarmActionArn(): String

  /**
   * A builder for [AlarmActionConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alarmActionArn Return the ARN that should be used for a CloudWatch Alarm action. 
     */
    public fun alarmActionArn(alarmActionArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.AlarmActionConfig.Builder =
        software.amazon.awscdk.services.cloudwatch.AlarmActionConfig.builder()

    /**
     * @param alarmActionArn Return the ARN that should be used for a CloudWatch Alarm action. 
     */
    override fun alarmActionArn(alarmActionArn: String) {
      cdkBuilder.alarmActionArn(alarmActionArn)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.AlarmActionConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmActionConfig,
  ) : CdkObject(cdkObject), AlarmActionConfig {
    /**
     * Return the ARN that should be used for a CloudWatch Alarm action.
     */
    override fun alarmActionArn(): String = unwrap(this).getAlarmActionArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlarmActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmActionConfig):
        AlarmActionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlarmActionConfig):
        software.amazon.awscdk.services.cloudwatch.AlarmActionConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.AlarmActionConfig
  }
}
