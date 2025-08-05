@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * An AppSync datasource backed by EventBridge.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.events.*;
 * EventApi api = EventApi.Builder.create(this, "EventApiEventBridge")
 * .apiName("EventBridgeEventApi")
 * .build();
 * EventBus eventBus = new EventBus(this, "test-bus");
 * AppSyncEventBridgeDataSource dataSource = api.addEventBridgeDataSource("eventbridgeds",
 * eventBus);
 * ```
 */
public open class AppSyncEventBridgeDataSource(
  cdkObject: software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSource,
) : AppSyncBackedDataSource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AppSyncEventBridgeDataSourceProps,
  ) :
      this(software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(AppSyncEventBridgeDataSourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: AppSyncEventBridgeDataSourceProps.Builder.() -> Unit,
  ) : this(scope, id, AppSyncEventBridgeDataSourceProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.AppSyncEventBridgeDataSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IApi)

    /**
     * The description of the data source.
     *
     * Default: - None
     *
     * @param description The description of the data source. 
     */
    public fun description(description: String)

    /**
     * The EventBridge EventBus.
     *
     * @param eventBus The EventBridge EventBus. 
     */
    public fun eventBus(eventBus: IEventBus)

    /**
     * The name of the data source.
     *
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    public fun name(name: String)

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     *
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source. 
     */
    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSource.Builder =
        software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSource.Builder.create(scope,
        id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IApi) {
      cdkBuilder.api(api.let(IApi.Companion::unwrap))
    }

    /**
     * The description of the data source.
     *
     * Default: - None
     *
     * @param description The description of the data source. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The EventBridge EventBus.
     *
     * @param eventBus The EventBridge EventBus. 
     */
    override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus.Companion::unwrap))
    }

    /**
     * The name of the data source.
     *
     * The only allowed pattern is: {[_A-Za-z][_0-9A-Za-z]*}.
     * Any invalid characters will be automatically removed.
     *
     * Default: - id of data source
     *
     * @param name The name of the data source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The IAM service role to be assumed by AppSync to interact with the data source.
     *
     * Default: -  Create a new role
     *
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     * source. 
     */
    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSource =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AppSyncEventBridgeDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AppSyncEventBridgeDataSource(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSource):
        AppSyncEventBridgeDataSource = AppSyncEventBridgeDataSource(cdkObject)

    internal fun unwrap(wrapped: AppSyncEventBridgeDataSource):
        software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSource = wrapped.cdkObject as
        software.amazon.awscdk.services.appsync.AppSyncEventBridgeDataSource
  }
}
