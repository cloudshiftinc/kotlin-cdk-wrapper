package io.cloudshiftdev.awscdk.services.logs

import kotlin.String
import kotlin.Unit

public interface SubscriptionFilterOptions {
  public fun destination(): ILogSubscriptionDestination

  public fun filterName(): String? = unwrap(this).getFilterName()

  public fun filterPattern(): IFilterPattern

  public interface Builder {
    public fun destination(destination: ILogSubscriptionDestination) {
    }

    public fun filterName(filterName: String) {
    }

    public fun filterPattern(filterPattern: IFilterPattern) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.SubscriptionFilterOptions.Builder =
        software.amazon.awscdk.services.logs.SubscriptionFilterOptions.builder()

    public override fun destination(destination: ILogSubscriptionDestination) {
      cdkBuilder.destination(destination.let(ILogSubscriptionDestination::unwrap))
    }

    public override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    public override fun filterPattern(filterPattern: IFilterPattern) {
      cdkBuilder.filterPattern(filterPattern.let(IFilterPattern::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.SubscriptionFilterOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.logs.SubscriptionFilterOptions,
  ) : SubscriptionFilterOptions {
    public override fun destination(): ILogSubscriptionDestination =
        unwrap(this).getDestination().let(ILogSubscriptionDestination::wrap)

    public override fun filterName(): String? = unwrap(this).getFilterName()

    public override fun filterPattern(): IFilterPattern =
        unwrap(this).getFilterPattern().let(IFilterPattern::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SubscriptionFilterOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.SubscriptionFilterOptions):
        SubscriptionFilterOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubscriptionFilterOptions):
        software.amazon.awscdk.services.logs.SubscriptionFilterOptions = (wrapped as
        Wrapper).cdkObject
  }
}
