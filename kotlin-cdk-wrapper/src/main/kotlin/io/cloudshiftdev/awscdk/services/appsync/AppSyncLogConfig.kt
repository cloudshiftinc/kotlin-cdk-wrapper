@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import kotlin.Boolean
import kotlin.Unit

/**
 * Logging configuration for AppSync.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * AppSyncAuthProvider apiKeyProvider = AppSyncAuthProvider.builder()
 * .authorizationType(AppSyncAuthorizationType.API_KEY)
 * .build();
 * EventApi api = EventApi.Builder.create(this, "api")
 * .apiName("Api")
 * .ownerContact("OwnerContact")
 * .authorizationConfig(EventApiAuthConfig.builder()
 * .authProviders(List.of(apiKeyProvider))
 * .connectionAuthModeTypes(List.of(AppSyncAuthorizationType.API_KEY))
 * .defaultPublishAuthModeTypes(List.of(AppSyncAuthorizationType.API_KEY))
 * .defaultSubscribeAuthModeTypes(List.of(AppSyncAuthorizationType.API_KEY))
 * .build())
 * .logConfig(AppSyncLogConfig.builder()
 * .fieldLogLevel(AppSyncFieldLogLevel.INFO)
 * .retention(RetentionDays.ONE_WEEK)
 * .build())
 * .build();
 * api.addChannelNamespace("default");
 * ```
 */
public interface AppSyncLogConfig {
  /**
   * exclude verbose content.
   *
   * Default: false
   */
  public fun excludeVerboseContent(): Boolean? = unwrap(this).getExcludeVerboseContent()

  /**
   * log level for fields.
   *
   * Default: - Use AppSync default
   */
  public fun fieldLogLevel(): AppSyncFieldLogLevel? =
      unwrap(this).getFieldLogLevel()?.let(AppSyncFieldLogLevel::wrap)

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
   * A builder for [AppSyncLogConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param excludeVerboseContent exclude verbose content.
     */
    public fun excludeVerboseContent(excludeVerboseContent: Boolean)

    /**
     * @param fieldLogLevel log level for fields.
     */
    public fun fieldLogLevel(fieldLogLevel: AppSyncFieldLogLevel)

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
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AppSyncLogConfig.Builder =
        software.amazon.awscdk.services.appsync.AppSyncLogConfig.builder()

    /**
     * @param excludeVerboseContent exclude verbose content.
     */
    override fun excludeVerboseContent(excludeVerboseContent: Boolean) {
      cdkBuilder.excludeVerboseContent(excludeVerboseContent)
    }

    /**
     * @param fieldLogLevel log level for fields.
     */
    override fun fieldLogLevel(fieldLogLevel: AppSyncFieldLogLevel) {
      cdkBuilder.fieldLogLevel(fieldLogLevel.let(AppSyncFieldLogLevel.Companion::unwrap))
    }

    /**
     * @param retention The number of days log events are kept in CloudWatch Logs.
     * By default AppSync keeps the logs infinitely. When updating this property,
     * unsetting it doesn't remove the log retention policy.
     * To remove the retention policy, set the value to `INFINITE`
     */
    override fun retention(retention: RetentionDays) {
      cdkBuilder.retention(retention.let(RetentionDays.Companion::unwrap))
    }

    /**
     * @param role The role for CloudWatch Logs.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncLogConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.AppSyncLogConfig,
  ) : CdkObject(cdkObject),
      AppSyncLogConfig {
    /**
     * exclude verbose content.
     *
     * Default: false
     */
    override fun excludeVerboseContent(): Boolean? = unwrap(this).getExcludeVerboseContent()

    /**
     * log level for fields.
     *
     * Default: - Use AppSync default
     */
    override fun fieldLogLevel(): AppSyncFieldLogLevel? =
        unwrap(this).getFieldLogLevel()?.let(AppSyncFieldLogLevel::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncLogConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncLogConfig):
        AppSyncLogConfig = CdkObjectWrappers.wrap(cdkObject) as? AppSyncLogConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppSyncLogConfig):
        software.amazon.awscdk.services.appsync.AppSyncLogConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.AppSyncLogConfig
  }
}
