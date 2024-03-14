package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SubscriptionFilter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.SubscriptionFilter,
) : Resource(cdkObject) {
  public interface Builder {
    public fun destination(destination: ILogSubscriptionDestination)

    public fun filterName(filterName: String)

    public fun filterPattern(filterPattern: IFilterPattern)

    public fun logGroup(logGroup: ILogGroup)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.SubscriptionFilter.Builder =
        software.amazon.awscdk.services.logs.SubscriptionFilter.Builder.create(scope, id)

    override fun destination(destination: ILogSubscriptionDestination) {
      cdkBuilder.destination(destination.let(ILogSubscriptionDestination::unwrap))
    }

    override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    override fun filterPattern(filterPattern: IFilterPattern) {
      cdkBuilder.filterPattern(filterPattern.let(IFilterPattern::unwrap))
    }

    override fun logGroup(logGroup: ILogGroup) {
      cdkBuilder.logGroup(logGroup.let(ILogGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.SubscriptionFilter = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SubscriptionFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SubscriptionFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.SubscriptionFilter):
        SubscriptionFilter = SubscriptionFilter(cdkObject)

    internal fun unwrap(wrapped: SubscriptionFilter):
        software.amazon.awscdk.services.logs.SubscriptionFilter = wrapped.cdkObject
  }
}
