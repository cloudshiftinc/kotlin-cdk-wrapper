@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * Properties for an AppSync EventBridge datasource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * import io.cloudshiftdev.awscdk.services.events.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * EventBus eventBus;
 * GraphqlApi graphqlApi;
 * Role role;
 * EventBridgeDataSourceProps eventBridgeDataSourceProps = EventBridgeDataSourceProps.builder()
 * .api(graphqlApi)
 * .eventBus(eventBus)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .serviceRole(role)
 * .build();
 * ```
 */
public interface EventBridgeDataSourceProps : BackedDataSourceProps {
  /**
   * The EventBridge EventBus.
   */
  public fun eventBus(): IEventBus

  /**
   * A builder for [EventBridgeDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * @param description the description of the data source.
     */
    public fun description(description: String)

    /**
     * @param eventBus The EventBridge EventBus. 
     */
    public fun eventBus(eventBus: IEventBus)

    /**
     * @param name The name of the data source.
     */
    public fun name(name: String)

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source.
     */
    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps.builder()

    /**
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    /**
     * @param description the description of the data source.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eventBus The EventBridge EventBus. 
     */
    override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus::unwrap))
    }

    /**
     * @param name The name of the data source.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source.
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps,
  ) : CdkObject(cdkObject), EventBridgeDataSourceProps {
    /**
     * The API to attach this data source to.
     */
    override fun api(): IGraphqlApi = unwrap(this).getApi().let(IGraphqlApi::wrap)

    /**
     * the description of the data source.
     *
     * Default: - None
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The EventBridge EventBus.
     */
    override fun eventBus(): IEventBus = unwrap(this).getEventBus().let(IEventBus::wrap)

    /**
     * The name of the data source.
     *
     * Default: - id of data source
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     */
    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps):
        EventBridgeDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as?
        EventBridgeDataSourceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBridgeDataSourceProps):
        software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps
  }
}
