@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface SubscriptionFilterProps : SubscriptionFilterOptions {
  public fun logGroup(): ILogGroup

  @CdkDslMarker
  public interface Builder {
    public fun destination(destination: ILogSubscriptionDestination)

    public fun filterName(filterName: String)

    public fun filterPattern(filterPattern: IFilterPattern)

    public fun logGroup(logGroup: ILogGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.SubscriptionFilterProps.Builder =
        software.amazon.awscdk.services.logs.SubscriptionFilterProps.builder()

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

    public fun build(): software.amazon.awscdk.services.logs.SubscriptionFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.SubscriptionFilterProps,
  ) : CdkObject(cdkObject), SubscriptionFilterProps {
    override fun destination(): ILogSubscriptionDestination =
        unwrap(this).getDestination().let(ILogSubscriptionDestination::wrap)

    override fun filterName(): String? = unwrap(this).getFilterName()

    override fun filterPattern(): IFilterPattern =
        unwrap(this).getFilterPattern().let(IFilterPattern::wrap)

    override fun logGroup(): ILogGroup = unwrap(this).getLogGroup().let(ILogGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SubscriptionFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.SubscriptionFilterProps):
        SubscriptionFilterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubscriptionFilterProps):
        software.amazon.awscdk.services.logs.SubscriptionFilterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.SubscriptionFilterProps
  }
}
