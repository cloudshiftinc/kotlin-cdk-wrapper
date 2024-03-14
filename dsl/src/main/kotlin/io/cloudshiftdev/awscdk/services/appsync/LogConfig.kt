package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit

public interface LogConfig {
  public fun excludeVerboseContent(): Any? = unwrap(this).getExcludeVerboseContent()

  public fun fieldLogLevel(): FieldLogLevel? =
      unwrap(this).getFieldLogLevel()?.let(FieldLogLevel::wrap)

  public fun retention(): RetentionDays? = unwrap(this).getRetention()?.let(RetentionDays::wrap)

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public interface Builder {
    public fun excludeVerboseContent(excludeVerboseContent: Boolean) {
    }

    public fun excludeVerboseContent(excludeVerboseContent: IResolvable) {
    }

    public fun fieldLogLevel(fieldLogLevel: FieldLogLevel) {
    }

    public fun retention(retention: RetentionDays) {
    }

    public fun role(role: IRole) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.LogConfig.Builder =
        software.amazon.awscdk.services.appsync.LogConfig.builder()

    public override fun excludeVerboseContent(excludeVerboseContent: Boolean) {
      cdkBuilder.excludeVerboseContent(excludeVerboseContent)
    }

    public override fun excludeVerboseContent(excludeVerboseContent: IResolvable) {
      cdkBuilder.excludeVerboseContent(excludeVerboseContent.let(IResolvable::unwrap))
    }

    public override fun fieldLogLevel(fieldLogLevel: FieldLogLevel) {
      cdkBuilder.fieldLogLevel(fieldLogLevel.let(FieldLogLevel::unwrap))
    }

    public override fun retention(retention: RetentionDays) {
      cdkBuilder.retention(retention.let(RetentionDays::unwrap))
    }

    public override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.LogConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.LogConfig,
  ) : LogConfig {
    public override fun excludeVerboseContent(): Any? = unwrap(this).getExcludeVerboseContent()

    public override fun fieldLogLevel(): FieldLogLevel? =
        unwrap(this).getFieldLogLevel()?.let(FieldLogLevel::wrap)

    public override fun retention(): RetentionDays? =
        unwrap(this).getRetention()?.let(RetentionDays::wrap)

    public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LogConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.LogConfig): LogConfig =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogConfig): software.amazon.awscdk.services.appsync.LogConfig =
        (wrapped as Wrapper).cdkObject
  }
}
