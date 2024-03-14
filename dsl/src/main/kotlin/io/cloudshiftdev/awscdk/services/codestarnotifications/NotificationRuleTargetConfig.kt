package io.cloudshiftdev.awscdk.services.codestarnotifications

import kotlin.String
import kotlin.Unit

public interface NotificationRuleTargetConfig {
  public fun targetAddress(): String

  public fun targetType(): String

  public interface Builder {
    public fun targetAddress(targetAddress: String) {
    }

    public fun targetType(targetType: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig.Builder =
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig.builder()

    public override fun targetAddress(targetAddress: String) {
      cdkBuilder.targetAddress(targetAddress)
    }

    public override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    public fun build():
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig,
  ) : NotificationRuleTargetConfig {
    public override fun targetAddress(): String = unwrap(this).getTargetAddress()

    public override fun targetType(): String = unwrap(this).getTargetType()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NotificationRuleTargetConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig):
        NotificationRuleTargetConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NotificationRuleTargetConfig):
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig =
        (wrapped as Wrapper).cdkObject
  }
}
