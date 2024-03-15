@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface PlacementGroupProps {
  public fun partitions(): Number? = unwrap(this).getPartitions()

  public fun placementGroupName(): String? = unwrap(this).getPlacementGroupName()

  public fun spreadLevel(): PlacementGroupSpreadLevel? =
      unwrap(this).getSpreadLevel()?.let(PlacementGroupSpreadLevel::wrap)

  public fun strategy(): PlacementGroupStrategy? =
      unwrap(this).getStrategy()?.let(PlacementGroupStrategy::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun partitions(partitions: Number)

    public fun placementGroupName(placementGroupName: String)

    public fun spreadLevel(spreadLevel: PlacementGroupSpreadLevel)

    public fun strategy(strategy: PlacementGroupStrategy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PlacementGroupProps.Builder =
        software.amazon.awscdk.services.ec2.PlacementGroupProps.builder()

    override fun partitions(partitions: Number) {
      cdkBuilder.partitions(partitions)
    }

    override fun placementGroupName(placementGroupName: String) {
      cdkBuilder.placementGroupName(placementGroupName)
    }

    override fun spreadLevel(spreadLevel: PlacementGroupSpreadLevel) {
      cdkBuilder.spreadLevel(spreadLevel.let(PlacementGroupSpreadLevel::unwrap))
    }

    override fun strategy(strategy: PlacementGroupStrategy) {
      cdkBuilder.strategy(strategy.let(PlacementGroupStrategy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.PlacementGroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.PlacementGroupProps,
  ) : CdkObject(cdkObject), PlacementGroupProps {
    override fun partitions(): Number? = unwrap(this).getPartitions()

    override fun placementGroupName(): String? = unwrap(this).getPlacementGroupName()

    override fun spreadLevel(): PlacementGroupSpreadLevel? =
        unwrap(this).getSpreadLevel()?.let(PlacementGroupSpreadLevel::wrap)

    override fun strategy(): PlacementGroupStrategy? =
        unwrap(this).getStrategy()?.let(PlacementGroupStrategy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PlacementGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PlacementGroupProps):
        PlacementGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PlacementGroupProps):
        software.amazon.awscdk.services.ec2.PlacementGroupProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.PlacementGroupProps
  }
}
