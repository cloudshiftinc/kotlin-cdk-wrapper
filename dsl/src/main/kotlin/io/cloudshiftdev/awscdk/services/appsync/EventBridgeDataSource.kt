package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EventBridgeDataSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.EventBridgeDataSource,
) : BackedDataSource(cdkObject) {
  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.EventBridgeDataSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    public fun api(api: IGraphqlApi)

    /**
     * the description of the data source.
     *
     * Default: - None
     *
     * @param description the description of the data source. 
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
    private val cdkBuilder: software.amazon.awscdk.services.appsync.EventBridgeDataSource.Builder =
        software.amazon.awscdk.services.appsync.EventBridgeDataSource.Builder.create(scope, id)

    /**
     * The API to attach this data source to.
     *
     * @param api The API to attach this data source to. 
     */
    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    /**
     * the description of the data source.
     *
     * Default: - None
     *
     * @param description the description of the data source. 
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
      cdkBuilder.eventBus(eventBus.let(IEventBus::unwrap))
    }

    /**
     * The name of the data source.
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
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.EventBridgeDataSource =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EventBridgeDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EventBridgeDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.EventBridgeDataSource):
        EventBridgeDataSource = EventBridgeDataSource(cdkObject)

    internal fun unwrap(wrapped: EventBridgeDataSource):
        software.amazon.awscdk.services.appsync.EventBridgeDataSource = wrapped.cdkObject
  }
}
