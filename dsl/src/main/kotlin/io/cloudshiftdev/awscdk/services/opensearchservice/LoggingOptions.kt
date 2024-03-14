package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import kotlin.Boolean
import kotlin.Unit

public interface LoggingOptions {
  public fun appLogEnabled(): Boolean? = unwrap(this).getAppLogEnabled()

  public fun appLogGroup(): ILogGroup? = unwrap(this).getAppLogGroup()?.let(ILogGroup::wrap)

  public fun auditLogEnabled(): Boolean? = unwrap(this).getAuditLogEnabled()

  public fun auditLogGroup(): ILogGroup? = unwrap(this).getAuditLogGroup()?.let(ILogGroup::wrap)

  public fun slowIndexLogEnabled(): Boolean? = unwrap(this).getSlowIndexLogEnabled()

  public fun slowIndexLogGroup(): ILogGroup? =
      unwrap(this).getSlowIndexLogGroup()?.let(ILogGroup::wrap)

  public fun slowSearchLogEnabled(): Boolean? = unwrap(this).getSlowSearchLogEnabled()

  public fun slowSearchLogGroup(): ILogGroup? =
      unwrap(this).getSlowSearchLogGroup()?.let(ILogGroup::wrap)

  public interface Builder {
    public fun appLogEnabled(appLogEnabled: Boolean) {
    }

    public fun appLogGroup(appLogGroup: ILogGroup) {
    }

    public fun auditLogEnabled(auditLogEnabled: Boolean) {
    }

    public fun auditLogGroup(auditLogGroup: ILogGroup) {
    }

    public fun slowIndexLogEnabled(slowIndexLogEnabled: Boolean) {
    }

    public fun slowIndexLogGroup(slowIndexLogGroup: ILogGroup) {
    }

    public fun slowSearchLogEnabled(slowSearchLogEnabled: Boolean) {
    }

    public fun slowSearchLogGroup(slowSearchLogGroup: ILogGroup) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opensearchservice.LoggingOptions.Builder
        = software.amazon.awscdk.services.opensearchservice.LoggingOptions.builder()

    public override fun appLogEnabled(appLogEnabled: Boolean) {
      cdkBuilder.appLogEnabled(appLogEnabled)
    }

    public override fun appLogGroup(appLogGroup: ILogGroup) {
      cdkBuilder.appLogGroup(appLogGroup.let(ILogGroup::unwrap))
    }

    public override fun auditLogEnabled(auditLogEnabled: Boolean) {
      cdkBuilder.auditLogEnabled(auditLogEnabled)
    }

    public override fun auditLogGroup(auditLogGroup: ILogGroup) {
      cdkBuilder.auditLogGroup(auditLogGroup.let(ILogGroup::unwrap))
    }

    public override fun slowIndexLogEnabled(slowIndexLogEnabled: Boolean) {
      cdkBuilder.slowIndexLogEnabled(slowIndexLogEnabled)
    }

    public override fun slowIndexLogGroup(slowIndexLogGroup: ILogGroup) {
      cdkBuilder.slowIndexLogGroup(slowIndexLogGroup.let(ILogGroup::unwrap))
    }

    public override fun slowSearchLogEnabled(slowSearchLogEnabled: Boolean) {
      cdkBuilder.slowSearchLogEnabled(slowSearchLogEnabled)
    }

    public override fun slowSearchLogGroup(slowSearchLogGroup: ILogGroup) {
      cdkBuilder.slowSearchLogGroup(slowSearchLogGroup.let(ILogGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.opensearchservice.LoggingOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.opensearchservice.LoggingOptions,
  ) : LoggingOptions {
    public override fun appLogEnabled(): Boolean? = unwrap(this).getAppLogEnabled()

    public override fun appLogGroup(): ILogGroup? =
        unwrap(this).getAppLogGroup()?.let(ILogGroup::wrap)

    public override fun auditLogEnabled(): Boolean? = unwrap(this).getAuditLogEnabled()

    public override fun auditLogGroup(): ILogGroup? =
        unwrap(this).getAuditLogGroup()?.let(ILogGroup::wrap)

    public override fun slowIndexLogEnabled(): Boolean? = unwrap(this).getSlowIndexLogEnabled()

    public override fun slowIndexLogGroup(): ILogGroup? =
        unwrap(this).getSlowIndexLogGroup()?.let(ILogGroup::wrap)

    public override fun slowSearchLogEnabled(): Boolean? = unwrap(this).getSlowSearchLogEnabled()

    public override fun slowSearchLogGroup(): ILogGroup? =
        unwrap(this).getSlowSearchLogGroup()?.let(ILogGroup::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LoggingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.LoggingOptions):
        LoggingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoggingOptions):
        software.amazon.awscdk.services.opensearchservice.LoggingOptions = (wrapped as
        Wrapper).cdkObject
  }
}
