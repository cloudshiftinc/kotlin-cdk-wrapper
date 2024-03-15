@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IPlacementGroup,
  ) : CdkObject(cdkObject), IPlacementGroup {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun partitions(): Number? = unwrap(this).getPartitions()

    override fun placementGroupName(): String = unwrap(this).getPlacementGroupName()

    override fun spreadLevel(): PlacementGroupSpreadLevel? =
        unwrap(this).getSpreadLevel()?.let(PlacementGroupSpreadLevel::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun strategy(): PlacementGroupStrategy? =
        unwrap(this).getStrategy()?.let(PlacementGroupStrategy::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IPlacementGroup):
        IPlacementGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPlacementGroup):
        software.amazon.awscdk.services.ec2.IPlacementGroup = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.IPlacementGroup
  }
}
