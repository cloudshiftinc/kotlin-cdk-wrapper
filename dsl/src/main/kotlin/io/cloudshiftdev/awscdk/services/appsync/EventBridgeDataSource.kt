package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EventBridgeDataSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.EventBridgeDataSource,
) : BackedDataSource(cdkObject) {
  public interface Builder {
    public fun api(api: IGraphqlApi) {
    }

    public fun description(description: String) {
    }

    public fun eventBus(eventBus: IEventBus) {
    }

    public fun name(name: String) {
    }

    public fun serviceRole(serviceRole: IRole) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.EventBridgeDataSource.Builder =
        software.amazon.awscdk.services.appsync.EventBridgeDataSource.Builder.create(scope, id)

    public override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus::unwrap))
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun serviceRole(serviceRole: IRole) {
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
