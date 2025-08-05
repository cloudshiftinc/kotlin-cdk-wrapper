@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Authorization configuration for the Channel Namespace.
 *
 * Example:
 *
 * ```
 * EventApi api;
 * ChannelNamespace.Builder.create(this, "Namespace")
 * .api(api)
 * .authorizationConfig(NamespaceAuthConfig.builder()
 * // Override publishing authorization to API Key
 * .publishAuthModeTypes(List.of(AppSyncAuthorizationType.API_KEY))
 * // Override subscribing authorization to Lambda
 * .subscribeAuthModeTypes(List.of(AppSyncAuthorizationType.LAMBDA))
 * .build())
 * .build();
 * ```
 */
public interface NamespaceAuthConfig {
  /**
   * The publish auth modes for this Event Api.
   *
   * Default: - API Key authorization
   */
  public fun publishAuthModeTypes(): List<AppSyncAuthorizationType> =
      unwrap(this).getPublishAuthModeTypes()?.map(AppSyncAuthorizationType::wrap) ?: emptyList()

  /**
   * The subscribe auth modes for this Event Api.
   *
   * Default: - API Key authorization
   */
  public fun subscribeAuthModeTypes(): List<AppSyncAuthorizationType> =
      unwrap(this).getSubscribeAuthModeTypes()?.map(AppSyncAuthorizationType::wrap) ?: emptyList()

  /**
   * A builder for [NamespaceAuthConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param publishAuthModeTypes The publish auth modes for this Event Api.
     */
    public fun publishAuthModeTypes(publishAuthModeTypes: List<AppSyncAuthorizationType>)

    /**
     * @param publishAuthModeTypes The publish auth modes for this Event Api.
     */
    public fun publishAuthModeTypes(vararg publishAuthModeTypes: AppSyncAuthorizationType)

    /**
     * @param subscribeAuthModeTypes The subscribe auth modes for this Event Api.
     */
    public fun subscribeAuthModeTypes(subscribeAuthModeTypes: List<AppSyncAuthorizationType>)

    /**
     * @param subscribeAuthModeTypes The subscribe auth modes for this Event Api.
     */
    public fun subscribeAuthModeTypes(vararg subscribeAuthModeTypes: AppSyncAuthorizationType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.NamespaceAuthConfig.Builder =
        software.amazon.awscdk.services.appsync.NamespaceAuthConfig.builder()

    /**
     * @param publishAuthModeTypes The publish auth modes for this Event Api.
     */
    override fun publishAuthModeTypes(publishAuthModeTypes: List<AppSyncAuthorizationType>) {
      cdkBuilder.publishAuthModeTypes(publishAuthModeTypes.map(AppSyncAuthorizationType.Companion::unwrap))
    }

    /**
     * @param publishAuthModeTypes The publish auth modes for this Event Api.
     */
    override fun publishAuthModeTypes(vararg publishAuthModeTypes: AppSyncAuthorizationType): Unit =
        publishAuthModeTypes(publishAuthModeTypes.toList())

    /**
     * @param subscribeAuthModeTypes The subscribe auth modes for this Event Api.
     */
    override fun subscribeAuthModeTypes(subscribeAuthModeTypes: List<AppSyncAuthorizationType>) {
      cdkBuilder.subscribeAuthModeTypes(subscribeAuthModeTypes.map(AppSyncAuthorizationType.Companion::unwrap))
    }

    /**
     * @param subscribeAuthModeTypes The subscribe auth modes for this Event Api.
     */
    override fun subscribeAuthModeTypes(vararg subscribeAuthModeTypes: AppSyncAuthorizationType):
        Unit = subscribeAuthModeTypes(subscribeAuthModeTypes.toList())

    public fun build(): software.amazon.awscdk.services.appsync.NamespaceAuthConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.NamespaceAuthConfig,
  ) : CdkObject(cdkObject),
      NamespaceAuthConfig {
    /**
     * The publish auth modes for this Event Api.
     *
     * Default: - API Key authorization
     */
    override fun publishAuthModeTypes(): List<AppSyncAuthorizationType> =
        unwrap(this).getPublishAuthModeTypes()?.map(AppSyncAuthorizationType::wrap) ?: emptyList()

    /**
     * The subscribe auth modes for this Event Api.
     *
     * Default: - API Key authorization
     */
    override fun subscribeAuthModeTypes(): List<AppSyncAuthorizationType> =
        unwrap(this).getSubscribeAuthModeTypes()?.map(AppSyncAuthorizationType::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NamespaceAuthConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.NamespaceAuthConfig):
        NamespaceAuthConfig = CdkObjectWrappers.wrap(cdkObject) as? NamespaceAuthConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: NamespaceAuthConfig):
        software.amazon.awscdk.services.appsync.NamespaceAuthConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.NamespaceAuthConfig
  }
}
