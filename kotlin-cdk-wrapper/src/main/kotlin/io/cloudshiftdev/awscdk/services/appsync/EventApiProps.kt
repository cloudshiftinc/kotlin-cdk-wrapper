@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for an AppSync Event API.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Function handler;
 * AppSyncAuthProvider iamProvider = AppSyncAuthProvider.builder()
 * .authorizationType(AppSyncAuthorizationType.IAM)
 * .build();
 * AppSyncAuthProvider apiKeyProvider = AppSyncAuthProvider.builder()
 * .authorizationType(AppSyncAuthorizationType.API_KEY)
 * .build();
 * / * API with IAM and API Key providers.
 * * Connection, default publish and default subscribe
 * * can be done with either IAM and API Key.
 * *&#47;
 * EventApi api = EventApi.Builder.create(this, "api")
 * .apiName("api")
 * .authorizationConfig(EventApiAuthConfig.builder()
 * // set auth providers
 * .authProviders(List.of(iamProvider, apiKeyProvider))
 * .build())
 * .build();
 * api.addChannelNamespace("default");
 * ```
 */
public interface EventApiProps {
  /**
   * the name of the Event API.
   */
  public fun apiName(): String

  /**
   * Optional authorization configuration.
   *
   * Default: - API Key authorization
   */
  public fun authorizationConfig(): EventApiAuthConfig? =
      unwrap(this).getAuthorizationConfig()?.let(EventApiAuthConfig::wrap)

  /**
   * The domain name configuration for the Event API.
   *
   * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting to
   * enable custom domain URL
   *
   * Default: - no domain name
   */
  public fun domainName(): AppSyncDomainOptions? =
      unwrap(this).getDomainName()?.let(AppSyncDomainOptions::wrap)

  /**
   * Logging configuration for this api.
   *
   * Default: - None
   */
  public fun logConfig(): AppSyncLogConfig? =
      unwrap(this).getLogConfig()?.let(AppSyncLogConfig::wrap)

  /**
   * The owner contact information for an API resource.
   *
   * This field accepts any string input with a length of 0 - 256 characters.
   *
   * Default: - No owner contact.
   */
  public fun ownerContact(): String? = unwrap(this).getOwnerContact()

  /**
   * A builder for [EventApiProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiName the name of the Event API. 
     */
    public fun apiName(apiName: String)

    /**
     * @param authorizationConfig Optional authorization configuration.
     */
    public fun authorizationConfig(authorizationConfig: EventApiAuthConfig)

    /**
     * @param authorizationConfig Optional authorization configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7bd0eec1074bf99592c70d16e4ab463b95e6446bb0b1ca652b261f04584fdbb")
    public fun authorizationConfig(authorizationConfig: EventApiAuthConfig.Builder.() -> Unit)

    /**
     * @param domainName The domain name configuration for the Event API.
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     */
    public fun domainName(domainName: AppSyncDomainOptions)

    /**
     * @param domainName The domain name configuration for the Event API.
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed9f0b784e627db222881505a2ce9705b443a295c9f990f1364d03a7e173502f")
    public fun domainName(domainName: AppSyncDomainOptions.Builder.() -> Unit)

    /**
     * @param logConfig Logging configuration for this api.
     */
    public fun logConfig(logConfig: AppSyncLogConfig)

    /**
     * @param logConfig Logging configuration for this api.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24c4687d811e3f7c04a2c465b43f00856cd46d29beddd35fd0a01f5d0dc77318")
    public fun logConfig(logConfig: AppSyncLogConfig.Builder.() -> Unit)

    /**
     * @param ownerContact The owner contact information for an API resource.
     * This field accepts any string input with a length of 0 - 256 characters.
     */
    public fun ownerContact(ownerContact: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.EventApiProps.Builder =
        software.amazon.awscdk.services.appsync.EventApiProps.builder()

    /**
     * @param apiName the name of the Event API. 
     */
    override fun apiName(apiName: String) {
      cdkBuilder.apiName(apiName)
    }

    /**
     * @param authorizationConfig Optional authorization configuration.
     */
    override fun authorizationConfig(authorizationConfig: EventApiAuthConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(EventApiAuthConfig.Companion::unwrap))
    }

    /**
     * @param authorizationConfig Optional authorization configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b7bd0eec1074bf99592c70d16e4ab463b95e6446bb0b1ca652b261f04584fdbb")
    override fun authorizationConfig(authorizationConfig: EventApiAuthConfig.Builder.() -> Unit):
        Unit = authorizationConfig(EventApiAuthConfig(authorizationConfig))

    /**
     * @param domainName The domain name configuration for the Event API.
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     */
    override fun domainName(domainName: AppSyncDomainOptions) {
      cdkBuilder.domainName(domainName.let(AppSyncDomainOptions.Companion::unwrap))
    }

    /**
     * @param domainName The domain name configuration for the Event API.
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ed9f0b784e627db222881505a2ce9705b443a295c9f990f1364d03a7e173502f")
    override fun domainName(domainName: AppSyncDomainOptions.Builder.() -> Unit): Unit =
        domainName(AppSyncDomainOptions(domainName))

    /**
     * @param logConfig Logging configuration for this api.
     */
    override fun logConfig(logConfig: AppSyncLogConfig) {
      cdkBuilder.logConfig(logConfig.let(AppSyncLogConfig.Companion::unwrap))
    }

    /**
     * @param logConfig Logging configuration for this api.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24c4687d811e3f7c04a2c465b43f00856cd46d29beddd35fd0a01f5d0dc77318")
    override fun logConfig(logConfig: AppSyncLogConfig.Builder.() -> Unit): Unit =
        logConfig(AppSyncLogConfig(logConfig))

    /**
     * @param ownerContact The owner contact information for an API resource.
     * This field accepts any string input with a length of 0 - 256 characters.
     */
    override fun ownerContact(ownerContact: String) {
      cdkBuilder.ownerContact(ownerContact)
    }

    public fun build(): software.amazon.awscdk.services.appsync.EventApiProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.EventApiProps,
  ) : CdkObject(cdkObject),
      EventApiProps {
    /**
     * the name of the Event API.
     */
    override fun apiName(): String = unwrap(this).getApiName()

    /**
     * Optional authorization configuration.
     *
     * Default: - API Key authorization
     */
    override fun authorizationConfig(): EventApiAuthConfig? =
        unwrap(this).getAuthorizationConfig()?.let(EventApiAuthConfig::wrap)

    /**
     * The domain name configuration for the Event API.
     *
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     *
     * Default: - no domain name
     */
    override fun domainName(): AppSyncDomainOptions? =
        unwrap(this).getDomainName()?.let(AppSyncDomainOptions::wrap)

    /**
     * Logging configuration for this api.
     *
     * Default: - None
     */
    override fun logConfig(): AppSyncLogConfig? =
        unwrap(this).getLogConfig()?.let(AppSyncLogConfig::wrap)

    /**
     * The owner contact information for an API resource.
     *
     * This field accepts any string input with a length of 0 - 256 characters.
     *
     * Default: - No owner contact.
     */
    override fun ownerContact(): String? = unwrap(this).getOwnerContact()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.EventApiProps):
        EventApiProps = CdkObjectWrappers.wrap(cdkObject) as? EventApiProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventApiProps):
        software.amazon.awscdk.services.appsync.EventApiProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.EventApiProps
  }
}
