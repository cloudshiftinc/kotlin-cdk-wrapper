@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.constructs.Construct
import kotlin.String

public open class EcrImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.EcrImage,
) : ContainerImage(cdkObject) {
  public override fun bind(_scope: Construct, containerDefinition: ContainerDefinition):
      ContainerImageConfig = unwrap(this).bind(_scope.let(Construct::unwrap),
      containerDefinition.let(ContainerDefinition::unwrap)).let(ContainerImageConfig::wrap)

  public open fun imageName(): String = unwrap(this).getImageName()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EcrImage): EcrImage =
        EcrImage(cdkObject)

    internal fun unwrap(wrapped: EcrImage): software.amazon.awscdk.services.ecs.EcrImage =
        wrapped.cdkObject
  }
}
