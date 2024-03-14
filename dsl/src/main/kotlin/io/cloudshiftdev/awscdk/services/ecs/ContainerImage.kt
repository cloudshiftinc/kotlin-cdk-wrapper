package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.ecr.IRepository
import io.cloudshiftdev.awscdk.services.ecr.assets.DockerImageAsset
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class ContainerImage internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.ContainerImage,
) {
  public open fun bind(arg0: Construct, arg1: ContainerDefinition): ContainerImageConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap),
      arg1.let(ContainerDefinition::unwrap)).let(ContainerImageConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.ContainerImage,
  ) : ContainerImage(cdkObject)

  public companion object {
    public open fun fromAsset(directory: String): AssetImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromAsset(directory).let(AssetImage::wrap)

    public open fun fromAsset(directory: String, props: AssetImageProps): AssetImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromAsset(directory,
        props.let(AssetImageProps::unwrap)).let(AssetImage::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("079bd47206f00ba5df71024a9ccc19749b364c49826c602f2e09d28ba45b86f4")
    public open fun fromAsset(directory: String, props: AssetImageProps.Builder.() -> Unit):
        AssetImage = fromAsset(directory, AssetImageProps(props))

    public open fun fromDockerImageAsset(asset: DockerImageAsset): ContainerImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromDockerImageAsset(asset.let(DockerImageAsset::unwrap)).let(ContainerImage::wrap)

    public open fun fromEcrRepository(repository: IRepository): EcrImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromEcrRepository(repository.let(IRepository::unwrap)).let(EcrImage::wrap)

    public open fun fromEcrRepository(repository: IRepository, tag: String): EcrImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromEcrRepository(repository.let(IRepository::unwrap),
        tag).let(EcrImage::wrap)

    public open fun fromRegistry(name: String): RepositoryImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromRegistry(name).let(RepositoryImage::wrap)

    public open fun fromRegistry(name: String, props: RepositoryImageProps): RepositoryImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromRegistry(name,
        props.let(RepositoryImageProps::unwrap)).let(RepositoryImage::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60234a1c1e29f6a957bb3e79efb0c46aace8158ca4dad387364294ac0404dd93")
    public open fun fromRegistry(name: String, props: RepositoryImageProps.Builder.() -> Unit):
        RepositoryImage = fromRegistry(name, RepositoryImageProps(props))

    public open fun fromTarball(tarballFile: String): ContainerImage =
        software.amazon.awscdk.services.ecs.ContainerImage.fromTarball(tarballFile).let(ContainerImage::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ContainerImage): ContainerImage
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerImage): software.amazon.awscdk.services.ecs.ContainerImage
        = (wrapped as Wrapper).cdkObject
  }
}
