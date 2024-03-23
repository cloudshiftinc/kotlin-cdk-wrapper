@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit

/**
 * Logging configuration for AppSync.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * LogConfig logConfig = LogConfig.builder()
 * .retention(RetentionDays.ONE_WEEK)
 * .build();
 * GraphqlApi.Builder.create(this, "api")
 * .authorizationConfig(AuthorizationConfig.builder().build())
 * .name("myApi")
 * .definition(Definition.fromFile(join(__dirname, "myApi.graphql")))
 * .logConfig(logConfig)
 * .build();
 * ```
 */
public interface LogConfig {
  /**
   * exclude verbose content.
   *
   * Default: false
   */
  public fun excludeVerboseContent(): Any? = unwrap(this).getExcludeVerboseContent()

  /**
   * log level for fields.
   *
   * Default: - Use AppSync default
   */
  public fun fieldLogLevel(): FieldLogLevel? =
      unwrap(this).getFieldLogLevel()?.let(FieldLogLevel::wrap)

  /**
   * The number of days log events are kept in CloudWatch Logs.
   *
   * By default AppSync keeps the logs infinitely. When updating this property,
   * unsetting it doesn't remove the log retention policy.
   * To remove the retention policy, set the value to `INFINITE`
   *
   * Default: RetentionDays.INFINITE
   */
  public fun retention(): RetentionDays? = unwrap(this).getRetention()?.let(RetentionDays::wrap)

  /**
   * The role for CloudWatch Logs.
   *
   * Default: - None
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [LogConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param excludeVerboseContent exclude verbose content.
     */
    public fun excludeVerboseContent(excludeVerboseContent: Boolean)

    /**
     * @param excludeVerboseContent exclude verbose content.
     */
    public fun excludeVerboseContent(excludeVerboseContent: IResolvable)

    /**
     * @param fieldLogLevel log level for fields.
     */
    public fun fieldLogLevel(fieldLogLevel: FieldLogLevel)

    /**
     * @param retention The number of days log events are kept in CloudWatch Logs.
     * By default AppSync keeps the logs infinitely. When updating this property,
     * unsetting it doesn't remove the log retention policy.
     * To remove the retention policy, set the value to `INFINITE`
     */
    public fun retention(retention: RetentionDays)

    /**
     * @param role The role for CloudWatch Logs.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.LogConfig.Builder =
        software.amazon.awscdk.services.appsync.LogConfig.builder()

    /**
     * @param excludeVerboseContent exclude verbose content.
     */
    override fun excludeVerboseContent(excludeVerboseContent: Boolean) {
      cdkBuilder.excludeVerboseContent(excludeVerboseContent)
    }

    /**
     * @param excludeVerboseContent exclude verbose content.
     */
    override fun excludeVerboseContent(excludeVerboseContent: IResolvable) {
      cdkBuilder.excludeVerboseContent(excludeVerboseContent.let(IResolvable::unwrap))
    }

    /**
     * @param fieldLogLevel log level for fields.
     */
    override fun fieldLogLevel(fieldLogLevel: FieldLogLevel) {
      cdkBuilder.fieldLogLevel(fieldLogLevel.let(FieldLogLevel::unwrap))
    }

    /**
     * @param retention The number of days log events are kept in CloudWatch Logs.
     * By default AppSync keeps the logs infinitely. When updating this property,
     * unsetting it doesn't remove the log retention policy.
     * To remove the retention policy, set the value to `INFINITE`
     */
    override fun retention(retention: RetentionDays) {
      cdkBuilder.retention(retention.let(RetentionDays::unwrap))
    }

    /**
     * @param role The role for CloudWatch Logs.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.LogConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.LogConfig,
  ) : CdkObject(cdkObject), LogConfig {
    /**
     * exclude verbose content.
     *
     * Default: false
     */
    override fun excludeVerboseContent(): Any? = unwrap(this).getExcludeVerboseContent()

    /**
     * log level for fields.
     *
     * Default: - Use AppSync default
     */
    override fun fieldLogLevel(): FieldLogLevel? =
        unwrap(this).getFieldLogLevel()?.let(FieldLogLevel::wrap)

    /**
     * The number of days log events are kept in CloudWatch Logs.
     *
     * By default AppSync keeps the logs infinitely. When updating this property,
     * unsetting it doesn't remove the log retention policy.
     * To remove the retention policy, set the value to `INFINITE`
     *
     * Default: RetentionDays.INFINITE
     */
    override fun retention(): RetentionDays? = unwrap(this).getRetention()?.let(RetentionDays::wrap)

    /**
     * The role for CloudWatch Logs.
     *
     * Default: - None
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.LogConfig): LogConfig =
        CdkObjectWrappers.wrap(cdkObject) as? LogConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogConfig): software.amazon.awscdk.services.appsync.LogConfig =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.LogConfig
  }
}
