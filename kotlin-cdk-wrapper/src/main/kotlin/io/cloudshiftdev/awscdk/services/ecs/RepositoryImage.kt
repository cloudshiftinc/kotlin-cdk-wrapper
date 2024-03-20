@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit

/**
 * An image hosted in a public or private repository.
 *
 * For images hosted in Amazon ECR, see
 * [EcrImage](https://docs.aws.amazon.com/AmazonECR/latest/userguide/images.html).
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.assets.*;
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * DockerImageAsset dockerImageAsset;
 * ContainerImage repositoryImage = RepositoryImage.fromDockerImageAsset(dockerImageAsset);
 * ```
 */
public open class RepositoryImage internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.RepositoryImage,
) : ContainerImage(cdkObject) {
  public constructor(imageName: String) :
      this(software.amazon.awscdk.services.ecs.RepositoryImage(imageName)
  )

  public constructor(imageName: String, props: RepositoryImageProps) :
      this(software.amazon.awscdk.services.ecs.RepositoryImage(imageName,
      props.let(RepositoryImageProps::unwrap))
  )

  public constructor(imageName: String, props: RepositoryImageProps.Builder.() -> Unit) :
      this(imageName, RepositoryImageProps(props)
  )

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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.RepositoryImage].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The secret to expose to the container that contains the credentials for the image repository.
     *
     * The supported value is the full ARN of an AWS Secrets Manager secret.
     *
     * @param credentials The secret to expose to the container that contains the credentials for
     * the image repository. 
     */
    public fun credentials(credentials: ISecret)
  }

  private class BuilderImpl(
    imageName: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.RepositoryImage.Builder =
        software.amazon.awscdk.services.ecs.RepositoryImage.Builder.create(imageName)

    /**
     * The secret to expose to the container that contains the credentials for the image repository.
     *
     * The supported value is the full ARN of an AWS Secrets Manager secret.
     *
     * @param credentials The secret to expose to the container that contains the credentials for
     * the image repository. 
     */
    override fun credentials(credentials: ISecret) {
      cdkBuilder.credentials(credentials.let(ISecret::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.RepositoryImage = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(imageName: String, block: Builder.() -> Unit = {}): RepositoryImage {
      val builderImpl = BuilderImpl(imageName)
      return RepositoryImage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.RepositoryImage):
        RepositoryImage = RepositoryImage(cdkObject)

    internal fun unwrap(wrapped: RepositoryImage):
        software.amazon.awscdk.services.ecs.RepositoryImage = wrapped.cdkObject
  }
}
