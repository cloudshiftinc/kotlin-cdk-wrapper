package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.Number
import kotlin.String

public interface IPlacementGroup : IResource {
  public fun partitions(): Number? = unwrap(this).getPartitions()

  public fun placementGroupName(): String

  public fun spreadLevel(): PlacementGroupSpreadLevel? =
      unwrap(this).getSpreadLevel()?.let(PlacementGroupSpreadLevel::wrap)

  public fun strategy(): PlacementGroupStrategy? =
      unwrap(this).getStrategy()?.let(PlacementGroupStrategy::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IPlacementGroup,
  ) : IPlacementGroup {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun partitions(): Number? = unwrap(this).getPartitions()

    public override fun placementGroupName(): String = unwrap(this).getPlacementGroupName()

    public override fun spreadLevel(): PlacementGroupSpreadLevel? =
        unwrap(this).getSpreadLevel()?.let(PlacementGroupSpreadLevel::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun strategy(): PlacementGroupStrategy? =
        unwrap(this).getStrategy()?.let(PlacementGroupStrategy::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IPlacementGroup):
        IPlacementGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPlacementGroup):
        software.amazon.awscdk.services.ec2.IPlacementGroup = (wrapped as Wrapper).cdkObject
  }
}
