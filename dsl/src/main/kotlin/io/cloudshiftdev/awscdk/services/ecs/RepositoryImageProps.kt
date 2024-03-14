package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Unit

public interface RepositoryImageProps {
  public fun credentials(): ISecret? = unwrap(this).getCredentials()?.let(ISecret::wrap)

  public interface Builder {
    public fun credentials(credentials: ISecret)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.RepositoryImageProps.Builder =
        software.amazon.awscdk.services.ecs.RepositoryImageProps.builder()

    override fun credentials(credentials: ISecret) {
      cdkBuilder.credentials(credentials.let(ISecret::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.RepositoryImageProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.RepositoryImageProps,
  ) : RepositoryImageProps {
    override fun credentials(): ISecret? = unwrap(this).getCredentials()?.let(ISecret::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RepositoryImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.RepositoryImageProps):
        RepositoryImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RepositoryImageProps):
        software.amazon.awscdk.services.ecs.RepositoryImageProps = (wrapped as Wrapper).cdkObject
  }
}
