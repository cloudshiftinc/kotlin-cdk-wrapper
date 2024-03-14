package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.s3.Location
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface EnvironmentFileConfig {
  public fun fileType(): EnvironmentFileType

  public fun s3Location(): Location

  public interface Builder {
    public fun fileType(fileType: EnvironmentFileType) {
    }

    public fun s3Location(s3Location: Location) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17deb9224b1df8a8edb2295024ecf99e0645213f9656d16be844db7b415dda7d")
    public fun s3Location(s3Location: Location.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.EnvironmentFileConfig.Builder =
        software.amazon.awscdk.services.ecs.EnvironmentFileConfig.builder()

    public override fun fileType(fileType: EnvironmentFileType) {
      cdkBuilder.fileType(fileType.let(EnvironmentFileType::unwrap))
    }

    public override fun s3Location(s3Location: Location) {
      cdkBuilder.s3Location(s3Location.let(Location::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("17deb9224b1df8a8edb2295024ecf99e0645213f9656d16be844db7b415dda7d")
    public override fun s3Location(s3Location: Location.Builder.() -> Unit): Unit =
        s3Location(Location(s3Location))

    public fun build(): software.amazon.awscdk.services.ecs.EnvironmentFileConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.EnvironmentFileConfig,
  ) : EnvironmentFileConfig {
    public override fun fileType(): EnvironmentFileType =
        unwrap(this).getFileType().let(EnvironmentFileType::wrap)

    public override fun s3Location(): Location = unwrap(this).getS3Location().let(Location::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentFileConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EnvironmentFileConfig):
        EnvironmentFileConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentFileConfig):
        software.amazon.awscdk.services.ecs.EnvironmentFileConfig = (wrapped as Wrapper).cdkObject
  }
}
