package io.cloudshiftdev.awscdk.services.ecs

import kotlin.String
import kotlin.Unit

public interface CredentialSpecConfig {
  public fun location(): String

  public fun typePrefix(): String

  public interface Builder {
    public fun location(location: String)

    public fun typePrefix(typePrefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CredentialSpecConfig.Builder =
        software.amazon.awscdk.services.ecs.CredentialSpecConfig.builder()

    override fun location(location: String) {
      cdkBuilder.location(location)
    }

    override fun typePrefix(typePrefix: String) {
      cdkBuilder.typePrefix(typePrefix)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CredentialSpecConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.CredentialSpecConfig,
  ) : CredentialSpecConfig {
    override fun location(): String = unwrap(this).getLocation()

    override fun typePrefix(): String = unwrap(this).getTypePrefix()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CredentialSpecConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CredentialSpecConfig):
        CredentialSpecConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CredentialSpecConfig):
        software.amazon.awscdk.services.ecs.CredentialSpecConfig = (wrapped as Wrapper).cdkObject
  }
}
