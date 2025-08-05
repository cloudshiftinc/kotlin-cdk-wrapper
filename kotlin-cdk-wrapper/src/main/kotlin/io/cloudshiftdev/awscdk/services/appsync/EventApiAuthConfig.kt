@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Authorization configuration for the Event API.
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
public interface EventApiAuthConfig {
  /**
   * Auth providers for use in connection, publish, and subscribe operations.
   *
   * Default: - API Key authorization
   */
  public fun authProviders(): List<AppSyncAuthProvider> =
      unwrap(this).getAuthProviders()?.map(AppSyncAuthProvider::wrap) ?: emptyList()

  /**
   * Connection auth modes.
   *
   * Default: - API Key authorization
   */
  public fun connectionAuthModeTypes(): List<AppSyncAuthorizationType> =
      unwrap(this).getConnectionAuthModeTypes()?.map(AppSyncAuthorizationType::wrap) ?: emptyList()

  /**
   * Default publish auth modes.
   *
   * Default: - API Key authorization
   */
  public fun defaultPublishAuthModeTypes(): List<AppSyncAuthorizationType> =
      unwrap(this).getDefaultPublishAuthModeTypes()?.map(AppSyncAuthorizationType::wrap) ?:
      emptyList()

  /**
   * Default subscribe auth modes.
   *
   * Default: - API Key authorization
   */
  public fun defaultSubscribeAuthModeTypes(): List<AppSyncAuthorizationType> =
      unwrap(this).getDefaultSubscribeAuthModeTypes()?.map(AppSyncAuthorizationType::wrap) ?:
      emptyList()

  /**
   * A builder for [EventApiAuthConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authProviders Auth providers for use in connection, publish, and subscribe operations.
     */
    public fun authProviders(authProviders: List<AppSyncAuthProvider>)

    /**
     * @param authProviders Auth providers for use in connection, publish, and subscribe operations.
     */
    public fun authProviders(vararg authProviders: AppSyncAuthProvider)

    /**
     * @param connectionAuthModeTypes Connection auth modes.
     */
    public fun connectionAuthModeTypes(connectionAuthModeTypes: List<AppSyncAuthorizationType>)

    /**
     * @param connectionAuthModeTypes Connection auth modes.
     */
    public fun connectionAuthModeTypes(vararg connectionAuthModeTypes: AppSyncAuthorizationType)

    /**
     * @param defaultPublishAuthModeTypes Default publish auth modes.
     */
    public
        fun defaultPublishAuthModeTypes(defaultPublishAuthModeTypes: List<AppSyncAuthorizationType>)

    /**
     * @param defaultPublishAuthModeTypes Default publish auth modes.
     */
    public fun defaultPublishAuthModeTypes(vararg
        defaultPublishAuthModeTypes: AppSyncAuthorizationType)

    /**
     * @param defaultSubscribeAuthModeTypes Default subscribe auth modes.
     */
    public
        fun defaultSubscribeAuthModeTypes(defaultSubscribeAuthModeTypes: List<AppSyncAuthorizationType>)

    /**
     * @param defaultSubscribeAuthModeTypes Default subscribe auth modes.
     */
    public fun defaultSubscribeAuthModeTypes(vararg
        defaultSubscribeAuthModeTypes: AppSyncAuthorizationType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.EventApiAuthConfig.Builder =
        software.amazon.awscdk.services.appsync.EventApiAuthConfig.builder()

    /**
     * @param authProviders Auth providers for use in connection, publish, and subscribe operations.
     */
    override fun authProviders(authProviders: List<AppSyncAuthProvider>) {
      cdkBuilder.authProviders(authProviders.map(AppSyncAuthProvider.Companion::unwrap))
    }

    /**
     * @param authProviders Auth providers for use in connection, publish, and subscribe operations.
     */
    override fun authProviders(vararg authProviders: AppSyncAuthProvider): Unit =
        authProviders(authProviders.toList())

    /**
     * @param connectionAuthModeTypes Connection auth modes.
     */
    override fun connectionAuthModeTypes(connectionAuthModeTypes: List<AppSyncAuthorizationType>) {
      cdkBuilder.connectionAuthModeTypes(connectionAuthModeTypes.map(AppSyncAuthorizationType.Companion::unwrap))
    }

    /**
     * @param connectionAuthModeTypes Connection auth modes.
     */
    override fun connectionAuthModeTypes(vararg connectionAuthModeTypes: AppSyncAuthorizationType):
        Unit = connectionAuthModeTypes(connectionAuthModeTypes.toList())

    /**
     * @param defaultPublishAuthModeTypes Default publish auth modes.
     */
    override
        fun defaultPublishAuthModeTypes(defaultPublishAuthModeTypes: List<AppSyncAuthorizationType>) {
      cdkBuilder.defaultPublishAuthModeTypes(defaultPublishAuthModeTypes.map(AppSyncAuthorizationType.Companion::unwrap))
    }

    /**
     * @param defaultPublishAuthModeTypes Default publish auth modes.
     */
    override fun defaultPublishAuthModeTypes(vararg
        defaultPublishAuthModeTypes: AppSyncAuthorizationType): Unit =
        defaultPublishAuthModeTypes(defaultPublishAuthModeTypes.toList())

    /**
     * @param defaultSubscribeAuthModeTypes Default subscribe auth modes.
     */
    override
        fun defaultSubscribeAuthModeTypes(defaultSubscribeAuthModeTypes: List<AppSyncAuthorizationType>) {
      cdkBuilder.defaultSubscribeAuthModeTypes(defaultSubscribeAuthModeTypes.map(AppSyncAuthorizationType.Companion::unwrap))
    }

    /**
     * @param defaultSubscribeAuthModeTypes Default subscribe auth modes.
     */
    override fun defaultSubscribeAuthModeTypes(vararg
        defaultSubscribeAuthModeTypes: AppSyncAuthorizationType): Unit =
        defaultSubscribeAuthModeTypes(defaultSubscribeAuthModeTypes.toList())

    public fun build(): software.amazon.awscdk.services.appsync.EventApiAuthConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.EventApiAuthConfig,
  ) : CdkObject(cdkObject),
      EventApiAuthConfig {
    /**
     * Auth providers for use in connection, publish, and subscribe operations.
     *
     * Default: - API Key authorization
     */
    override fun authProviders(): List<AppSyncAuthProvider> =
        unwrap(this).getAuthProviders()?.map(AppSyncAuthProvider::wrap) ?: emptyList()

    /**
     * Connection auth modes.
     *
     * Default: - API Key authorization
     */
    override fun connectionAuthModeTypes(): List<AppSyncAuthorizationType> =
        unwrap(this).getConnectionAuthModeTypes()?.map(AppSyncAuthorizationType::wrap) ?:
        emptyList()

    /**
     * Default publish auth modes.
     *
     * Default: - API Key authorization
     */
    override fun defaultPublishAuthModeTypes(): List<AppSyncAuthorizationType> =
        unwrap(this).getDefaultPublishAuthModeTypes()?.map(AppSyncAuthorizationType::wrap) ?:
        emptyList()

    /**
     * Default subscribe auth modes.
     *
     * Default: - API Key authorization
     */
    override fun defaultSubscribeAuthModeTypes(): List<AppSyncAuthorizationType> =
        unwrap(this).getDefaultSubscribeAuthModeTypes()?.map(AppSyncAuthorizationType::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventApiAuthConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.EventApiAuthConfig):
        EventApiAuthConfig = CdkObjectWrappers.wrap(cdkObject) as? EventApiAuthConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventApiAuthConfig):
        software.amazon.awscdk.services.appsync.EventApiAuthConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.EventApiAuthConfig
  }
}
