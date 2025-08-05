@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Attributes for Event API imports.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * EventApiAttributes eventApiAttributes = EventApiAttributes.builder()
 * .apiId("apiId")
 * .httpDns("httpDns")
 * .realtimeDns("realtimeDns")
 * // the properties below are optional
 * .apiArn("apiArn")
 * .apiName("apiName")
 * .authProviderTypes(List.of(AppSyncAuthorizationType.API_KEY))
 * .build();
 * ```
 */
public interface EventApiAttributes {
  /**
   * the ARN of the Event API.
   *
   * Default: - constructed arn
   */
  public fun apiArn(): String? = unwrap(this).getApiArn()

  /**
   * an unique AWS AppSync Event API identifier i.e. 'lxz775lwdrgcndgz3nurvac7oa'.
   */
  public fun apiId(): String

  /**
   * the name of the Event API.
   *
   * Default: - not needed to import API
   */
  public fun apiName(): String? = unwrap(this).getApiName()

  /**
   * The Authorization Types for this Event Api.
   *
   * Default: - none, required to construct event rules from imported APIs
   */
  public fun authProviderTypes(): List<AppSyncAuthorizationType> =
      unwrap(this).getAuthProviderTypes()?.map(AppSyncAuthorizationType::wrap) ?: emptyList()

  /**
   * the domain name of the Api's HTTP endpoint.
   */
  public fun httpDns(): String

  /**
   * the domain name of the Api's real-time endpoint.
   */
  public fun realtimeDns(): String

  /**
   * A builder for [EventApiAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiArn the ARN of the Event API.
     */
    public fun apiArn(apiArn: String)

    /**
     * @param apiId an unique AWS AppSync Event API identifier i.e. 'lxz775lwdrgcndgz3nurvac7oa'. 
     */
    public fun apiId(apiId: String)

    /**
     * @param apiName the name of the Event API.
     */
    public fun apiName(apiName: String)

    /**
     * @param authProviderTypes The Authorization Types for this Event Api.
     */
    public fun authProviderTypes(authProviderTypes: List<AppSyncAuthorizationType>)

    /**
     * @param authProviderTypes The Authorization Types for this Event Api.
     */
    public fun authProviderTypes(vararg authProviderTypes: AppSyncAuthorizationType)

    /**
     * @param httpDns the domain name of the Api's HTTP endpoint. 
     */
    public fun httpDns(httpDns: String)

    /**
     * @param realtimeDns the domain name of the Api's real-time endpoint. 
     */
    public fun realtimeDns(realtimeDns: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.EventApiAttributes.Builder =
        software.amazon.awscdk.services.appsync.EventApiAttributes.builder()

    /**
     * @param apiArn the ARN of the Event API.
     */
    override fun apiArn(apiArn: String) {
      cdkBuilder.apiArn(apiArn)
    }

    /**
     * @param apiId an unique AWS AppSync Event API identifier i.e. 'lxz775lwdrgcndgz3nurvac7oa'. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param apiName the name of the Event API.
     */
    override fun apiName(apiName: String) {
      cdkBuilder.apiName(apiName)
    }

    /**
     * @param authProviderTypes The Authorization Types for this Event Api.
     */
    override fun authProviderTypes(authProviderTypes: List<AppSyncAuthorizationType>) {
      cdkBuilder.authProviderTypes(authProviderTypes.map(AppSyncAuthorizationType.Companion::unwrap))
    }

    /**
     * @param authProviderTypes The Authorization Types for this Event Api.
     */
    override fun authProviderTypes(vararg authProviderTypes: AppSyncAuthorizationType): Unit =
        authProviderTypes(authProviderTypes.toList())

    /**
     * @param httpDns the domain name of the Api's HTTP endpoint. 
     */
    override fun httpDns(httpDns: String) {
      cdkBuilder.httpDns(httpDns)
    }

    /**
     * @param realtimeDns the domain name of the Api's real-time endpoint. 
     */
    override fun realtimeDns(realtimeDns: String) {
      cdkBuilder.realtimeDns(realtimeDns)
    }

    public fun build(): software.amazon.awscdk.services.appsync.EventApiAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.EventApiAttributes,
  ) : CdkObject(cdkObject),
      EventApiAttributes {
    /**
     * the ARN of the Event API.
     *
     * Default: - constructed arn
     */
    override fun apiArn(): String? = unwrap(this).getApiArn()

    /**
     * an unique AWS AppSync Event API identifier i.e. 'lxz775lwdrgcndgz3nurvac7oa'.
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * the name of the Event API.
     *
     * Default: - not needed to import API
     */
    override fun apiName(): String? = unwrap(this).getApiName()

    /**
     * The Authorization Types for this Event Api.
     *
     * Default: - none, required to construct event rules from imported APIs
     */
    override fun authProviderTypes(): List<AppSyncAuthorizationType> =
        unwrap(this).getAuthProviderTypes()?.map(AppSyncAuthorizationType::wrap) ?: emptyList()

    /**
     * the domain name of the Api's HTTP endpoint.
     */
    override fun httpDns(): String = unwrap(this).getHttpDns()

    /**
     * the domain name of the Api's real-time endpoint.
     */
    override fun realtimeDns(): String = unwrap(this).getRealtimeDns()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventApiAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.EventApiAttributes):
        EventApiAttributes = CdkObjectWrappers.wrap(cdkObject) as? EventApiAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventApiAttributes):
        software.amazon.awscdk.services.appsync.EventApiAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.EventApiAttributes
  }
}
