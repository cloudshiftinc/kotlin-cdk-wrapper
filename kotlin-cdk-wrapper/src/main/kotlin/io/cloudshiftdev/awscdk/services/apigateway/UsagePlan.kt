@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Example:
 *
 * ```
 * LambdaIntegration integration;
 * RestApi api = new RestApi(this, "hello-api");
 * Resource v1 = api.root.addResource("v1");
 * Resource echo = v1.addResource("echo");
 * Method echoMethod = echo.addMethod("GET", integration,
 * MethodOptions.builder().apiKeyRequired(true).build());
 * UsagePlan plan = api.addUsagePlan("UsagePlan", UsagePlanProps.builder()
 * .name("Easy")
 * .throttle(ThrottleSettings.builder()
 * .rateLimit(10)
 * .burstLimit(2)
 * .build())
 * .build());
 * IApiKey key = api.addApiKey("ApiKey");
 * plan.addApiKey(key);
 * ```
 */
public open class UsagePlan(
  cdkObject: software.amazon.awscdk.services.apigateway.UsagePlan,
) : Resource(cdkObject),
    IUsagePlan {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.apigateway.UsagePlan(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UsagePlanProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.UsagePlan(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(UsagePlanProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UsagePlanProps.Builder.() -> Unit,
  ) : this(scope, id, UsagePlanProps(props)
  )

  /**
   * Adds an ApiKey.
   *
   * @param apiKey the api key to associate with this usage plan. 
   * @param options options that control the behaviour of this method.
   */
  public override fun addApiKey(apiKey: IApiKey) {
    unwrap(this).addApiKey(apiKey.let(IApiKey.Companion::unwrap))
  }

  /**
   * Adds an ApiKey.
   *
   * @param apiKey the api key to associate with this usage plan. 
   * @param options options that control the behaviour of this method.
   */
  public override fun addApiKey(apiKey: IApiKey, options: AddApiKeyOptions) {
    unwrap(this).addApiKey(apiKey.let(IApiKey.Companion::unwrap),
        options.let(AddApiKeyOptions.Companion::unwrap))
  }

  /**
   * Adds an ApiKey.
   *
   * @param apiKey the api key to associate with this usage plan. 
   * @param options options that control the behaviour of this method.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4f5ef86a87be3209ae0cbdb48ee812520d7927d679407f259483e5c3856b59ac")
  public override fun addApiKey(apiKey: IApiKey, options: AddApiKeyOptions.Builder.() -> Unit): Unit
      = addApiKey(apiKey, AddApiKeyOptions(options))

  /**
   * Adds an apiStage.
   *
   * @param apiStage 
   */
  public open fun addApiStage(apiStage: UsagePlanPerApiStage) {
    unwrap(this).addApiStage(apiStage.let(UsagePlanPerApiStage.Companion::unwrap))
  }

  /**
   * Adds an apiStage.
   *
   * @param apiStage 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0a7754d760ff4571903b19d230e81b9024e4d98bb2380f3259d59bcba435ba8f")
  public open fun addApiStage(apiStage: UsagePlanPerApiStage.Builder.() -> Unit): Unit =
      addApiStage(UsagePlanPerApiStage(apiStage))

  /**
   * Id of the usage plan.
   */
  public override fun usagePlanId(): String = unwrap(this).getUsagePlanId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.UsagePlan].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * API Stages to be associated with the usage plan.
     *
     * Default: none
     *
     * @param apiStages API Stages to be associated with the usage plan. 
     */
    public fun apiStages(apiStages: List<UsagePlanPerApiStage>)

    /**
     * API Stages to be associated with the usage plan.
     *
     * Default: none
     *
     * @param apiStages API Stages to be associated with the usage plan. 
     */
    public fun apiStages(vararg apiStages: UsagePlanPerApiStage)

    /**
     * Represents usage plan purpose.
     *
     * Default: none
     *
     * @param description Represents usage plan purpose. 
     */
    public fun description(description: String)

    /**
     * Name for this usage plan.
     *
     * Default: none
     *
     * @param name Name for this usage plan. 
     */
    public fun name(name: String)

    /**
     * Number of requests clients can make in a given time period.
     *
     * Default: none
     *
     * @param quota Number of requests clients can make in a given time period. 
     */
    public fun quota(quota: QuotaSettings)

    /**
     * Number of requests clients can make in a given time period.
     *
     * Default: none
     *
     * @param quota Number of requests clients can make in a given time period. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be3dddaab8cb54bd4f648fc607743b3d7ac24dbbdb19d14d809341832e821313")
    public fun quota(quota: QuotaSettings.Builder.() -> Unit)

    /**
     * Overall throttle settings for the API.
     *
     * Default: none
     *
     * @param throttle Overall throttle settings for the API. 
     */
    public fun throttle(throttle: ThrottleSettings)

    /**
     * Overall throttle settings for the API.
     *
     * Default: none
     *
     * @param throttle Overall throttle settings for the API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1b8b5c0eb07927357fc4949f0c320f751c1e9d5ee18a74234d2530f2c6758ea")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.UsagePlan.Builder =
        software.amazon.awscdk.services.apigateway.UsagePlan.Builder.create(scope, id)

    /**
     * API Stages to be associated with the usage plan.
     *
     * Default: none
     *
     * @param apiStages API Stages to be associated with the usage plan. 
     */
    override fun apiStages(apiStages: List<UsagePlanPerApiStage>) {
      cdkBuilder.apiStages(apiStages.map(UsagePlanPerApiStage.Companion::unwrap))
    }

    /**
     * API Stages to be associated with the usage plan.
     *
     * Default: none
     *
     * @param apiStages API Stages to be associated with the usage plan. 
     */
    override fun apiStages(vararg apiStages: UsagePlanPerApiStage): Unit =
        apiStages(apiStages.toList())

    /**
     * Represents usage plan purpose.
     *
     * Default: none
     *
     * @param description Represents usage plan purpose. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Name for this usage plan.
     *
     * Default: none
     *
     * @param name Name for this usage plan. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Number of requests clients can make in a given time period.
     *
     * Default: none
     *
     * @param quota Number of requests clients can make in a given time period. 
     */
    override fun quota(quota: QuotaSettings) {
      cdkBuilder.quota(quota.let(QuotaSettings.Companion::unwrap))
    }

    /**
     * Number of requests clients can make in a given time period.
     *
     * Default: none
     *
     * @param quota Number of requests clients can make in a given time period. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("be3dddaab8cb54bd4f648fc607743b3d7ac24dbbdb19d14d809341832e821313")
    override fun quota(quota: QuotaSettings.Builder.() -> Unit): Unit = quota(QuotaSettings(quota))

    /**
     * Overall throttle settings for the API.
     *
     * Default: none
     *
     * @param throttle Overall throttle settings for the API. 
     */
    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings.Companion::unwrap))
    }

    /**
     * Overall throttle settings for the API.
     *
     * Default: none
     *
     * @param throttle Overall throttle settings for the API. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1b8b5c0eb07927357fc4949f0c320f751c1e9d5ee18a74234d2530f2c6758ea")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigateway.UsagePlan = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.apigateway.UsagePlan.PROPERTY_INJECTION_ID

    public fun fromUsagePlanId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      usagePlanId: String,
    ): IUsagePlan =
        software.amazon.awscdk.services.apigateway.UsagePlan.fromUsagePlanId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, usagePlanId).let(IUsagePlan::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UsagePlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UsagePlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.UsagePlan): UsagePlan =
        UsagePlan(cdkObject)

    internal fun unwrap(wrapped: UsagePlan): software.amazon.awscdk.services.apigateway.UsagePlan =
        wrapped.cdkObject as software.amazon.awscdk.services.apigateway.UsagePlan
  }
}
