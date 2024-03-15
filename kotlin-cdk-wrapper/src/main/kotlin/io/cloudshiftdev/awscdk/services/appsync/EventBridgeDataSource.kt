@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EventBridgeDataSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.EventBridgeDataSource,
) : BackedDataSource(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun api(api: IGraphqlApi)

    public fun description(description: String)

    public fun eventBus(eventBus: IEventBus)

    public fun name(name: String)

    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.EventBridgeDataSource.Builder =
        software.amazon.awscdk.services.appsync.EventBridgeDataSource.Builder.create(scope, id)

    override fun api(api: IGraphqlApi) {
      cdkBuilder.api(api.let(IGraphqlApi::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun eventBus(eventBus: IEventBus) {
      cdkBuilder.eventBus(eventBus.let(IEventBus::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun serviceRole(serviceRole: IRole) {
      cdkBuilder.serviceRole(serviceRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.EventBridgeDataSource =
        cdkBuilder.build()
  }

  public companion object {
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
