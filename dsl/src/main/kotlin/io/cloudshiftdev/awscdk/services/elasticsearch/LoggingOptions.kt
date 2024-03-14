package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Unit

public interface LoggingOptions {
  @Deprecated(message = "deprecated in CDK")
  public fun appLogEnabled(): Boolean? = unwrap(this).getAppLogEnabled()

  @Deprecated(message = "deprecated in CDK")
  public fun appLogGroup(): ILogGroup? = unwrap(this).getAppLogGroup()?.let(ILogGroup::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun auditLogEnabled(): Boolean? = unwrap(this).getAuditLogEnabled()

  @Deprecated(message = "deprecated in CDK")
  public fun auditLogGroup(): ILogGroup? = unwrap(this).getAuditLogGroup()?.let(ILogGroup::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun slowIndexLogEnabled(): Boolean? = unwrap(this).getSlowIndexLogEnabled()

  @Deprecated(message = "deprecated in CDK")
  public fun slowIndexLogGroup(): ILogGroup? =
      unwrap(this).getSlowIndexLogGroup()?.let(ILogGroup::wrap)

  @Deprecated(message = "deprecated in CDK")
  public fun slowSearchLogEnabled(): Boolean? = unwrap(this).getSlowSearchLogEnabled()

  @Deprecated(message = "deprecated in CDK")
  public fun slowSearchLogGroup(): ILogGroup? =
      unwrap(this).getSlowSearchLogGroup()?.let(ILogGroup::wrap)

  @Deprecated(message = "deprecated in CDK")
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun appLogEnabled(appLogEnabled: Boolean) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun appLogGroup(appLogGroup: ILogGroup) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun auditLogEnabled(auditLogEnabled: Boolean) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun auditLogGroup(auditLogGroup: ILogGroup) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun slowIndexLogEnabled(slowIndexLogEnabled: Boolean) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun slowIndexLogGroup(slowIndexLogGroup: ILogGroup) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun slowSearchLogEnabled(slowSearchLogEnabled: Boolean) {
    }

    @Deprecated(message = "deprecated in CDK")
    public fun slowSearchLogGroup(slowSearchLogGroup: ILogGroup) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticsearch.LoggingOptions.Builder =
        software.amazon.awscdk.services.elasticsearch.LoggingOptions.builder()

    @Deprecated(message = "deprecated in CDK")
    public override fun appLogEnabled(appLogEnabled: Boolean) {
      cdkBuilder.appLogEnabled(appLogEnabled)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun appLogGroup(appLogGroup: ILogGroup) {
      cdkBuilder.appLogGroup(appLogGroup.let(ILogGroup::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun auditLogEnabled(auditLogEnabled: Boolean) {
      cdkBuilder.auditLogEnabled(auditLogEnabled)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun auditLogGroup(auditLogGroup: ILogGroup) {
      cdkBuilder.auditLogGroup(auditLogGroup.let(ILogGroup::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun slowIndexLogEnabled(slowIndexLogEnabled: Boolean) {
      cdkBuilder.slowIndexLogEnabled(slowIndexLogEnabled)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun slowIndexLogGroup(slowIndexLogGroup: ILogGroup) {
      cdkBuilder.slowIndexLogGroup(slowIndexLogGroup.let(ILogGroup::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun slowSearchLogEnabled(slowSearchLogEnabled: Boolean) {
      cdkBuilder.slowSearchLogEnabled(slowSearchLogEnabled)
    }

    @Deprecated(message = "deprecated in CDK")
    public override fun slowSearchLogGroup(slowSearchLogGroup: ILogGroup) {
      cdkBuilder.slowSearchLogGroup(slowSearchLogGroup.let(ILogGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticsearch.LoggingOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticsearch.LoggingOptions,
  ) : LoggingOptions {
    @Deprecated(message = "deprecated in CDK")
    public override fun appLogEnabled(): Boolean? = unwrap(this).getAppLogEnabled()

    @Deprecated(message = "deprecated in CDK")
    public override fun appLogGroup(): ILogGroup? =
        unwrap(this).getAppLogGroup()?.let(ILogGroup::wrap)

    @Deprecated(message = "deprecated in CDK")
    public override fun auditLogEnabled(): Boolean? = unwrap(this).getAuditLogEnabled()

    @Deprecated(message = "deprecated in CDK")
    public override fun auditLogGroup(): ILogGroup? =
        unwrap(this).getAuditLogGroup()?.let(ILogGroup::wrap)

    @Deprecated(message = "deprecated in CDK")
    public override fun slowIndexLogEnabled(): Boolean? = unwrap(this).getSlowIndexLogEnabled()

    @Deprecated(message = "deprecated in CDK")
    public override fun slowIndexLogGroup(): ILogGroup? =
        unwrap(this).getSlowIndexLogGroup()?.let(ILogGroup::wrap)

    @Deprecated(message = "deprecated in CDK")
    public override fun slowSearchLogEnabled(): Boolean? = unwrap(this).getSlowSearchLogEnabled()

    @Deprecated(message = "deprecated in CDK")
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

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.LoggingOptions):
        LoggingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoggingOptions):
        software.amazon.awscdk.services.elasticsearch.LoggingOptions = (wrapped as
        Wrapper).cdkObject
  }
}
