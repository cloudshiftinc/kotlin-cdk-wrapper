@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface EventBridgeDataSourceProps : BackedDataSourceProps {
  public fun eventBus(): IEventBus

  @CdkDslMarker
  public interface Builder {
    public fun api(api: IGraphqlApi)

    public fun description(description: String)

    public fun eventBus(eventBus: IEventBus)

    public fun name(name: String)

    public fun serviceRole(serviceRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps.Builder =
        software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps.builder()

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

    public fun build(): software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps,
  ) : CdkObject(cdkObject), EventBridgeDataSourceProps {
    override fun api(): IGraphqlApi = unwrap(this).getApi().let(IGraphqlApi::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun eventBus(): IEventBus = unwrap(this).getEventBus().let(IEventBus::wrap)

    override fun name(): String? = unwrap(this).getName()

    override fun serviceRole(): IRole? = unwrap(this).getServiceRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps):
        EventBridgeDataSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBridgeDataSourceProps):
        software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps
  }
}
