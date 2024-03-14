package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.constructs.Construct
import kotlin.String

public open class TagParameterContainerImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.TagParameterContainerImage,
) : ContainerImage(cdkObject) {
  /**
   * Called when the image is used by a ContainerDefinition.
   *
   * @param scope 
   * @param containerDefinition 
   */
  public override fun bind(scope: Construct, containerDefinition: ContainerDefinition):
      ContainerImageConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      containerDefinition.let(ContainerDefinition::unwrap)).let(ContainerImageConfig::wrap)

  /**
   * Returns the name of the CloudFormation Parameter that represents the tag of the image in the
   * ECR repository.
   */
  public open fun tagParameterName(): String = unwrap(this).getTagParameterName()

  /**
   * Returns the value of the CloudFormation Parameter that represents the tag of the image in the
   * ECR repository.
   */
  public open fun tagParameterValue(): String = unwrap(this).getTagParameterValue()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.TagParameterContainerImage):
        TagParameterContainerImage = TagParameterContainerImage(cdkObject)

    internal fun unwrap(wrapped: TagParameterContainerImage):
        software.amazon.awscdk.services.ecs.TagParameterContainerImage = wrapped.cdkObject
  }
}
