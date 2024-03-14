package io.cloudshiftdev.awscdk.services.ecs

import kotlin.String
import kotlin.Unit

public interface Host {
  public fun sourcePath(): String? = unwrap(this).getSourcePath()

  public interface Builder {
    public fun sourcePath(sourcePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Host.Builder =
        software.amazon.awscdk.services.ecs.Host.builder()

    override fun sourcePath(sourcePath: String) {
      cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): software.amazon.awscdk.services.ecs.Host = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.Host,
  ) : Host {
    override fun sourcePath(): String? = unwrap(this).getSourcePath()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Host {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Host): Host =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Host): software.amazon.awscdk.services.ecs.Host = (wrapped as
        Wrapper).cdkObject
  }
}
