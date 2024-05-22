@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * An image from an Amazon ECR repository.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.assets.*;
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * DockerImageAsset dockerImageAsset;
 * ContainerImage ecrImage = EcrImage.fromDockerImageAsset(dockerImageAsset);
 * ```
 */
public open class EcrImage(
  cdkObject: software.amazon.awscdk.services.ecs.EcrImage,
) : ContainerImage(cdkObject) {
  public constructor(repository: IRepository, tagOrDigest: String) :
      this(software.amazon.awscdk.services.ecs.EcrImage(repository.let(IRepository.Companion::unwrap),
      tagOrDigest)
  )

  /**
   * Called when the image is used by a ContainerDefinition.
   *
   * @param _scope 
   * @param containerDefinition 
   */
  public override fun bind(scope: Construct, containerDefinition: ContainerDefinition):
      ContainerImageConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      containerDefinition.let(ContainerDefinition.Companion::unwrap)).let(ContainerImageConfig::wrap)

  /**
   * The image name. Images in Amazon ECR repositories can be specified by either using the full
   * registry/repository:tag or registry/repository&#64;digest.
   *
   * For example, 012345678910.dkr.ecr.<region-name>.amazonaws.com/<repository-name>:latest or
   * 012345678910.dkr.ecr.<region-name>.amazonaws.com/<repository-name>&#64;sha256:94afd1f2e64d908bc90dbca0035a5b567EXAMPLE.
   */
  public open fun imageName(): String = unwrap(this).getImageName()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EcrImage): EcrImage =
        EcrImage(cdkObject)

    internal fun unwrap(wrapped: EcrImage): software.amazon.awscdk.services.ecs.EcrImage =
        wrapped.cdkObject as software.amazon.awscdk.services.ecs.EcrImage
  }
}
