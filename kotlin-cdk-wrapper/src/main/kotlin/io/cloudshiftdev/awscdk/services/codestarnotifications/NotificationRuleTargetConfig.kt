@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface NotificationRuleTargetConfig {
  public fun targetAddress(): String

  public fun targetType(): String

  @CdkDslMarker
  public interface Builder {
    public fun targetAddress(targetAddress: String)

    public fun targetType(targetType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig.Builder =
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig.builder()

    override fun targetAddress(targetAddress: String) {
      cdkBuilder.targetAddress(targetAddress)
    }

    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    public fun build():
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig,
  ) : CdkObject(cdkObject), NotificationRuleTargetConfig {
    override fun targetAddress(): String = unwrap(this).getTargetAddress()

    override fun targetType(): String = unwrap(this).getTargetType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NotificationRuleTargetConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig):
        NotificationRuleTargetConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NotificationRuleTargetConfig):
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleTargetConfig
  }
}
