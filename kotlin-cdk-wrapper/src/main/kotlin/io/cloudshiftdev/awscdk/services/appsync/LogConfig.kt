@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun excludeVerboseContent(excludeVerboseContent: Boolean)

    public fun excludeVerboseContent(excludeVerboseContent: IResolvable)

    public fun fieldLogLevel(fieldLogLevel: FieldLogLevel)

    public fun retention(retention: RetentionDays)

    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.LogConfig.Builder =
        software.amazon.awscdk.services.appsync.LogConfig.builder()

    override fun excludeVerboseContent(excludeVerboseContent: Boolean) {
      cdkBuilder.excludeVerboseContent(excludeVerboseContent)
    }

    override fun excludeVerboseContent(excludeVerboseContent: IResolvable) {
      cdkBuilder.excludeVerboseContent(excludeVerboseContent.let(IResolvable::unwrap))
    }

    override fun fieldLogLevel(fieldLogLevel: FieldLogLevel) {
      cdkBuilder.fieldLogLevel(fieldLogLevel.let(FieldLogLevel::unwrap))
    }

    override fun retention(retention: RetentionDays) {
      cdkBuilder.retention(retention.let(RetentionDays::unwrap))
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.LogConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.LogConfig,
  ) : CdkObject(cdkObject), LogConfig {
    override fun excludeVerboseContent(): Any? = unwrap(this).getExcludeVerboseContent()

    override fun fieldLogLevel(): FieldLogLevel? =
        unwrap(this).getFieldLogLevel()?.let(FieldLogLevel::wrap)

    override fun retention(): RetentionDays? = unwrap(this).getRetention()?.let(RetentionDays::wrap)

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.LogConfig): LogConfig =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogConfig): software.amazon.awscdk.services.appsync.LogConfig =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.LogConfig
  }
}
