package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit

public open class RepositoryImage internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.RepositoryImage,
) : ContainerImage(cdkObject) {
  public override fun bind(scope: Construct, containerDefinition: ContainerDefinition):
      ContainerImageConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      containerDefinition.let(ContainerDefinition::unwrap)).let(ContainerImageConfig::wrap)

  public interface Builder {
    public fun credentials(credentials: ISecret) {
    }
  }

  private class BuilderImpl(
    imageName: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.RepositoryImage.Builder =
        software.amazon.awscdk.services.ecs.RepositoryImage.Builder.create(imageName)

    public override fun credentials(credentials: ISecret) {
      cdkBuilder.credentials(credentials.let(ISecret::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.RepositoryImage = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
