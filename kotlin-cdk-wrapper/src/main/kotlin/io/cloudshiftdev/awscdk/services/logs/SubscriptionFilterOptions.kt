@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface SubscriptionFilterOptions {
  public fun destination(): ILogSubscriptionDestination

  public fun filterName(): String? = unwrap(this).getFilterName()

  public fun filterPattern(): IFilterPattern

  @CdkDslMarker
  public interface Builder {
    public fun destination(destination: ILogSubscriptionDestination)

    public fun filterName(filterName: String)

    public fun filterPattern(filterPattern: IFilterPattern)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.SubscriptionFilterOptions.Builder =
        software.amazon.awscdk.services.logs.SubscriptionFilterOptions.builder()

    override fun destination(destination: ILogSubscriptionDestination) {
      cdkBuilder.destination(destination.let(ILogSubscriptionDestination::unwrap))
    }

    override fun filterName(filterName: String) {
      cdkBuilder.filterName(filterName)
    }

    override fun filterPattern(filterPattern: IFilterPattern) {
      cdkBuilder.filterPattern(filterPattern.let(IFilterPattern::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.SubscriptionFilterOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.SubscriptionFilterOptions,
  ) : CdkObject(cdkObject), SubscriptionFilterOptions {
    override fun destination(): ILogSubscriptionDestination =
        unwrap(this).getDestination().let(ILogSubscriptionDestination::wrap)

    override fun filterName(): String? = unwrap(this).getFilterName()

    override fun filterPattern(): IFilterPattern =
        unwrap(this).getFilterPattern().let(IFilterPattern::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SubscriptionFilterOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.SubscriptionFilterOptions):
        SubscriptionFilterOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubscriptionFilterOptions):
        software.amazon.awscdk.services.logs.SubscriptionFilterOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.SubscriptionFilterOptions
  }
}
