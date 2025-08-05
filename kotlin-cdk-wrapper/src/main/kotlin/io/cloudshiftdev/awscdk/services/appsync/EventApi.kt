@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AppSync Event API.
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
public open class EventApi(
  cdkObject: software.amazon.awscdk.services.appsync.EventApi,
) : EventApiBase(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EventApiProps,
  ) :
      this(software.amazon.awscdk.services.appsync.EventApi(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(EventApiProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EventApiProps.Builder.() -> Unit,
  ) : this(scope, id, EventApiProps(props)
  )

  /**
   * the ARN of the API.
   */
  public override fun apiArn(): String = unwrap(this).getApiArn()

  /**
   * an unique AWS AppSync Event API identifier i.e. 'lxz775lwdrgcndgz3nurvac7oa'.
   */
  public override fun apiId(): String = unwrap(this).getApiId()

  /**
   * The configured API keys, if present.
   *
   * The key of this object is an apiKey name (apiKeyConfig.name) if specified, `Default` otherwise.
   *
   * Default: - no api key
   */
  public open fun apiKeys(): Map<String, CfnApiKey> =
      unwrap(this).getApiKeys().mapValues{CfnApiKey.wrap(it.value)}

  /**
   * The AppSyncDomainName of the associated custom domain.
   */
  public open fun appSyncDomainName(): String = unwrap(this).getAppSyncDomainName()

  /**
   * The Authorization Types for this Event Api.
   */
  public override fun authProviderTypes(): List<AppSyncAuthorizationType> =
      unwrap(this).getAuthProviderTypes().map(AppSyncAuthorizationType::wrap)

  /**
   * The connection auth modes for this Event Api.
   */
  public open fun connectionModeTypes(): List<AppSyncAuthorizationType> =
      unwrap(this).getConnectionModeTypes().map(AppSyncAuthorizationType::wrap)

  /**
   * The HTTP Endpoint of the associated custom domain.
   */
  public open fun customHttpEndpoint(): String = unwrap(this).getCustomHttpEndpoint()

  /**
   * The Realtime Endpoint of the associated custom domain.
   */
  public open fun customRealtimeEndpoint(): String = unwrap(this).getCustomRealtimeEndpoint()

  /**
   * The default publish auth modes for this Event Api.
   */
  public open fun defaultPublishModeTypes(): List<AppSyncAuthorizationType> =
      unwrap(this).getDefaultPublishModeTypes().map(AppSyncAuthorizationType::wrap)

  /**
   * The default subscribe auth modes for this Event Api.
   */
  public open fun defaultSubscribeModeTypes(): List<AppSyncAuthorizationType> =
      unwrap(this).getDefaultSubscribeModeTypes().map(AppSyncAuthorizationType::wrap)

  /**
   * the domain name of the Api's HTTP endpoint.
   */
  public override fun httpDns(): String = unwrap(this).getHttpDns()

  /**
   * the CloudWatch Log Group for this API.
   */
  public open fun logGroup(): ILogGroup = unwrap(this).getLogGroup().let(ILogGroup::wrap)

  /**
   * the domain name of the Api's real-time endpoint.
   */
  public override fun realtimeDns(): String = unwrap(this).getRealtimeDns()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.EventApi].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * the name of the Event API.
     *
     * @param apiName the name of the Event API. 
     */
    public fun apiName(apiName: String)

    /**
     * Optional authorization configuration.
     *
     * Default: - API Key authorization
     *
     * @param authorizationConfig Optional authorization configuration. 
     */
    public fun authorizationConfig(authorizationConfig: EventApiAuthConfig)

    /**
     * Optional authorization configuration.
     *
     * Default: - API Key authorization
     *
     * @param authorizationConfig Optional authorization configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39e0eeec28ba170213f6df0f1a884fb35d9b42111116fcb67136732b39ae2db7")
    public fun authorizationConfig(authorizationConfig: EventApiAuthConfig.Builder.() -> Unit)

    /**
     * The domain name configuration for the Event API.
     *
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     *
     * Default: - no domain name
     *
     * @param domainName The domain name configuration for the Event API. 
     */
    public fun domainName(domainName: AppSyncDomainOptions)

    /**
     * The domain name configuration for the Event API.
     *
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     *
     * Default: - no domain name
     *
     * @param domainName The domain name configuration for the Event API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8d6878a1381648dbf4ec0b5b7a32598b2ae7cf01536d1d7ecd25c53dc93fdfe")
    public fun domainName(domainName: AppSyncDomainOptions.Builder.() -> Unit)

    /**
     * Logging configuration for this api.
     *
     * Default: - None
     *
     * @param logConfig Logging configuration for this api. 
     */
    public fun logConfig(logConfig: AppSyncLogConfig)

    /**
     * Logging configuration for this api.
     *
     * Default: - None
     *
     * @param logConfig Logging configuration for this api. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cea223fb0e28f29a64900b2a40df745e35ad965c7a5fce06c80e07db1eaa467e")
    public fun logConfig(logConfig: AppSyncLogConfig.Builder.() -> Unit)

    /**
     * The owner contact information for an API resource.
     *
     * This field accepts any string input with a length of 0 - 256 characters.
     *
     * Default: - No owner contact.
     *
     * @param ownerContact The owner contact information for an API resource. 
     */
    public fun ownerContact(ownerContact: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.EventApi.Builder =
        software.amazon.awscdk.services.appsync.EventApi.Builder.create(scope, id)

    /**
     * the name of the Event API.
     *
     * @param apiName the name of the Event API. 
     */
    override fun apiName(apiName: String) {
      cdkBuilder.apiName(apiName)
    }

    /**
     * Optional authorization configuration.
     *
     * Default: - API Key authorization
     *
     * @param authorizationConfig Optional authorization configuration. 
     */
    override fun authorizationConfig(authorizationConfig: EventApiAuthConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(EventApiAuthConfig.Companion::unwrap))
    }

    /**
     * Optional authorization configuration.
     *
     * Default: - API Key authorization
     *
     * @param authorizationConfig Optional authorization configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("39e0eeec28ba170213f6df0f1a884fb35d9b42111116fcb67136732b39ae2db7")
    override fun authorizationConfig(authorizationConfig: EventApiAuthConfig.Builder.() -> Unit):
        Unit = authorizationConfig(EventApiAuthConfig(authorizationConfig))

    /**
     * The domain name configuration for the Event API.
     *
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     *
     * Default: - no domain name
     *
     * @param domainName The domain name configuration for the Event API. 
     */
    override fun domainName(domainName: AppSyncDomainOptions) {
      cdkBuilder.domainName(domainName.let(AppSyncDomainOptions.Companion::unwrap))
    }

    /**
     * The domain name configuration for the Event API.
     *
     * The Route 53 hosted zone and CName DNS record must be configured in addition to this setting
     * to
     * enable custom domain URL
     *
     * Default: - no domain name
     *
     * @param domainName The domain name configuration for the Event API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e8d6878a1381648dbf4ec0b5b7a32598b2ae7cf01536d1d7ecd25c53dc93fdfe")
    override fun domainName(domainName: AppSyncDomainOptions.Builder.() -> Unit): Unit =
        domainName(AppSyncDomainOptions(domainName))

    /**
     * Logging configuration for this api.
     *
     * Default: - None
     *
     * @param logConfig Logging configuration for this api. 
     */
    override fun logConfig(logConfig: AppSyncLogConfig) {
      cdkBuilder.logConfig(logConfig.let(AppSyncLogConfig.Companion::unwrap))
    }

    /**
     * Logging configuration for this api.
     *
     * Default: - None
     *
     * @param logConfig Logging configuration for this api. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cea223fb0e28f29a64900b2a40df745e35ad965c7a5fce06c80e07db1eaa467e")
    override fun logConfig(logConfig: AppSyncLogConfig.Builder.() -> Unit): Unit =
        logConfig(AppSyncLogConfig(logConfig))

    /**
     * The owner contact information for an API resource.
     *
     * This field accepts any string input with a length of 0 - 256 characters.
     *
     * Default: - No owner contact.
     *
     * @param ownerContact The owner contact information for an API resource. 
     */
    override fun ownerContact(ownerContact: String) {
      cdkBuilder.ownerContact(ownerContact)
    }

    public fun build(): software.amazon.awscdk.services.appsync.EventApi = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.appsync.EventApi.PROPERTY_INJECTION_ID

    public fun fromEventApiAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: EventApiAttributes,
    ): IEventApi =
        software.amazon.awscdk.services.appsync.EventApi.fromEventApiAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(EventApiAttributes.Companion::unwrap)).let(IEventApi::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84912d46c7d3d0a8626d995d7b8ac0be7ef340d9dd29a31852394ffc2143af81")
    public fun fromEventApiAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: EventApiAttributes.Builder.() -> Unit,
    ): IEventApi = fromEventApiAttributes(scope, id, EventApiAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EventApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EventApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.EventApi): EventApi =
        EventApi(cdkObject)

    internal fun unwrap(wrapped: EventApi): software.amazon.awscdk.services.appsync.EventApi =
        wrapped.cdkObject as software.amazon.awscdk.services.appsync.EventApi
  }
}
