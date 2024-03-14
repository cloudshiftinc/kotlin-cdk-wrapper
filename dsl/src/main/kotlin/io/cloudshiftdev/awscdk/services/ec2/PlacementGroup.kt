package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class PlacementGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.PlacementGroup,
) : Resource(cdkObject), IPlacementGroup {
  public override fun partitions(): Number? = unwrap(this).getPartitions()

  public override fun placementGroupName(): String = unwrap(this).getPlacementGroupName()

  public override fun spreadLevel(): PlacementGroupSpreadLevel? =
      unwrap(this).getSpreadLevel()?.let(PlacementGroupSpreadLevel::wrap)

  public override fun strategy(): PlacementGroupStrategy? =
      unwrap(this).getStrategy()?.let(PlacementGroupStrategy::wrap)

  public interface Builder {
    public fun partitions(partitions: Number) {
    }

    public fun placementGroupName(placementGroupName: String) {
    }

    public fun spreadLevel(spreadLevel: PlacementGroupSpreadLevel) {
    }

    public fun strategy(strategy: PlacementGroupStrategy) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PlacementGroup.Builder =
        software.amazon.awscdk.services.ec2.PlacementGroup.Builder.create(scope, id)

    public override fun partitions(partitions: Number) {
      cdkBuilder.partitions(partitions)
    }

    public override fun placementGroupName(placementGroupName: String) {
      cdkBuilder.placementGroupName(placementGroupName)
    }

    public override fun spreadLevel(spreadLevel: PlacementGroupSpreadLevel) {
      cdkBuilder.spreadLevel(spreadLevel.let(PlacementGroupSpreadLevel::unwrap))
    }

    public override fun strategy(strategy: PlacementGroupStrategy) {
      cdkBuilder.strategy(strategy.let(PlacementGroupStrategy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.PlacementGroup = cdkBuilder.build()
  }

  public companion object {
    public open fun fromPlacementGroupName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      placementGroupName: String,
    ): IPlacementGroup =
        software.amazon.awscdk.services.ec2.PlacementGroup.fromPlacementGroupName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, placementGroupName).let(IPlacementGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PlacementGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PlacementGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PlacementGroup): PlacementGroup
        = PlacementGroup(cdkObject)

    internal fun unwrap(wrapped: PlacementGroup): software.amazon.awscdk.services.ec2.PlacementGroup
        = wrapped.cdkObject
  }
}
