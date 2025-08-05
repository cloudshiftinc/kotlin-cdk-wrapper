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
 * IApi api;
 * EventBus eventBus;
 * Role role;
 * AppSyncEventBridgeDataSourceProps appSyncEventBridgeDataSourceProps =
 * AppSyncEventBridgeDataSourceProps.builder()
 * .api(api)
 * .eventBus(eventBus)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .serviceRole(role)
 * .build();
 * ```
 */
public interface AppSyncEventBridgeDataSourceProps : AppSyncBackedDataSourceProps {
  /**
   * The EventBridge EventBus.
   */
  public fun eventBus(): IEventBus

  /**
   * A builder for [AppSyncEventBridgeDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IApi)

    /**
     * @param description The description of the data source.
     */
    public fun description(description: String)

    /**
     * @param eventBus The EventBridge EventBus. 
     */
    public fun eventBus(eventBus: IEventBus)

    /**
     * @param name The name of the data source.
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
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
        software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSourceProps.builder()

    /**
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IApi) {
      cdkBuilder.api(api.let(IApi.Companion::unwrap))
    }

    /**
     * @param description The description of the data source.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eventBus The EventBridge EventBus. 
     */
    override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus.Companion::unwrap))
    }

    /**
     * @param name The name of the data source.
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source.
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSourceProps,
  ) : CdkObject(cdkObject),
      AppSyncEventBridgeDataSourceProps {
    /**
     * The API to attach this data source to.
     */
    override fun api(): IApi = unwrap(this).getApi().let(IApi::wrap)

    /**
     * The description of the data source.
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
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
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
    public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncEventBridgeDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSourceProps):
        AppSyncEventBridgeDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as?
        AppSyncEventBridgeDataSourceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppSyncEventBridgeDataSourceProps):
        software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSourceProps
  }
}
