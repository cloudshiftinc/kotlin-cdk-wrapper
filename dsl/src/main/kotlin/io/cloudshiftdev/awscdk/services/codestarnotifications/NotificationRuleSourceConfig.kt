package io.cloudshiftdev.awscdk.services.codestarnotifications

import kotlin.String
import kotlin.Unit

public interface NotificationRuleSourceConfig {
  public fun sourceArn(): String

  public interface Builder {
    public fun sourceArn(sourceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig.Builder =
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig.builder()

    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    public fun build():
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig,
  ) : NotificationRuleSourceConfig {
    override fun sourceArn(): String = unwrap(this).getSourceArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NotificationRuleSourceConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig):
        NotificationRuleSourceConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NotificationRuleSourceConfig):
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleSourceConfig =
        (wrapped as Wrapper).cdkObject
  }
}
