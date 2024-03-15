@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

public enum class ContainerDependencyCondition(
  private val cdkObject: software.amazon.awscdk.services.ecs.ContainerDependencyCondition,
) {
  START(software.amazon.awscdk.services.ecs.ContainerDependencyCondition.START),
  COMPLETE(software.amazon.awscdk.services.ecs.ContainerDependencyCondition.COMPLETE),
  SUCCESS(software.amazon.awscdk.services.ecs.ContainerDependencyCondition.SUCCESS),
  HEALTHY(software.amazon.awscdk.services.ecs.ContainerDependencyCondition.HEALTHY),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ContainerDependencyCondition):
        ContainerDependencyCondition = when (cdkObject) {
      software.amazon.awscdk.services.ecs.ContainerDependencyCondition.START ->
          ContainerDependencyCondition.START
      software.amazon.awscdk.services.ecs.ContainerDependencyCondition.COMPLETE ->
          ContainerDependencyCondition.COMPLETE
      software.amazon.awscdk.services.ecs.ContainerDependencyCondition.SUCCESS ->
          ContainerDependencyCondition.SUCCESS
      software.amazon.awscdk.services.ecs.ContainerDependencyCondition.HEALTHY ->
          ContainerDependencyCondition.HEALTHY
    }

    internal fun unwrap(wrapped: ContainerDependencyCondition):
        software.amazon.awscdk.services.ecs.ContainerDependencyCondition = wrapped.cdkObject
  }
}
