@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAsset
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Constructs for types of container images.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * Cluster cluster = Cluster.Builder.create(this, "FargateCPCluster")
 * .vpc(vpc)
 * .enableFargateCapacityProviders(true)
 * .build();
 * FargateTaskDefinition taskDefinition = new FargateTaskDefinition(this, "TaskDef");
 * taskDefinition.addContainer("web", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .build());
 * FargateService.Builder.create(this, "FargateService")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .minHealthyPercent(100)
 * .capacityProviderStrategies(List.of(CapacityProviderStrategy.builder()
 * .capacityProvider("FARGATE_SPOT")
 * .weight(2)
 * .build(), CapacityProviderStrategy.builder()
 * .capacityProvider("FARGATE")
 * .weight(1)
 * .build()))
 * .build();
 * ```
 */
public abstract class ContainerImage(
  cdkObject: software.amazon.awscdk.services.ecs.ContainerImage,
) : CdkObject(cdkObject) {
  /**
   * Called when the image is used by a ContainerDefinition.
   *
   * @param scope 
   * @param containerDefinition 
   */
  public open fun bind(scope: Construct, containerDefinition: ContainerDefinition):
      ContainerImageConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      containerDefinition.let(ContainerDefinition.Companion::unwrap)).let(ContainerImageConfig::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.ContainerImage,
  ) : ContainerImage(cdkObject)

  public companion object {
    public fun fromAsset(directory: String): AssetImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromAsset(directory).let(AssetImage::wrap)

    public fun fromAsset(directory: String, props: AssetImageProps): AssetImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromAsset(directory,
        props.let(AssetImageProps.Companion::unwrap)).let(AssetImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("079bd47206f00ba5df71024a9ccc19749b364c49826c602f2e09d28ba45b86f4")
    public fun fromAsset(directory: String, props: AssetImageProps.Builder.() -> Unit): AssetImage =
        fromAsset(directory, AssetImageProps(props))

    public fun fromDockerImageAsset(asset: DockerImageAsset): ContainerImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromDockerImageAsset(asset.let(DockerImageAsset.Companion::unwrap)).let(ContainerImage::wrap)

    public fun fromEcrRepository(repository: IRepository): EcrImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromEcrRepository(repository.let(IRepository.Companion::unwrap)).let(EcrImage::wrap)

    public fun fromEcrRepository(repository: IRepository, tag: String): EcrImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromEcrRepository(repository.let(IRepository.Companion::unwrap),
        tag).let(EcrImage::wrap)

    public fun fromRegistry(name: String): RepositoryImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromRegistry(name).let(RepositoryImage::wrap)

    public fun fromRegistry(name: String, props: RepositoryImageProps): RepositoryImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromRegistry(name,
        props.let(RepositoryImageProps.Companion::unwrap)).let(RepositoryImage::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60234a1c1e29f6a957bb3e79efb0c46aace8158ca4dad387364294ac0404dd93")
    public fun fromRegistry(name: String, props: RepositoryImageProps.Builder.() -> Unit):
        RepositoryImage = fromRegistry(name, RepositoryImageProps(props))

    public fun fromTarball(tarballFile: String): ContainerImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromTarball(tarballFile).let(ContainerImage::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ContainerImage): ContainerImage
        = CdkObjectWrappers.wrap(cdkObject) as? ContainerImage ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerImage): software.amazon.awscdk.services.ecs.ContainerImage
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ContainerImage
  }
}
