@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.constructs.Construct
import kotlin.String

public open class TagParameterContainerImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.TagParameterContainerImage,
) : ContainerImage(cdkObject) {
  public override fun bind(scope: Construct, containerDefinition: ContainerDefinition):
      ContainerImageConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      containerDefinition.let(ContainerDefinition::unwrap)).let(ContainerImageConfig::wrap)

  public open fun tagParameterName(): String = unwrap(this).getTagParameterName()

  public open fun tagParameterValue(): String = unwrap(this).getTagParameterValue()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.TagParameterContainerImage):
        TagParameterContainerImage = TagParameterContainerImage(cdkObject)

    internal fun unwrap(wrapped: TagParameterContainerImage):
        software.amazon.awscdk.services.ecs.TagParameterContainerImage = wrapped.cdkObject
  }
}
