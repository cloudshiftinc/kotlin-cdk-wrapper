package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CredentialSpecConfig {
  /**
   * Location of the CredSpec file.
   */
  public fun location(): String

  /**
   * Prefix used for the CredSpec string.
   */
  public fun typePrefix(): String

  /**
   * A builder for [CredentialSpecConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param location Location of the CredSpec file. 
     */
    public fun location(location: String)

    /**
     * @param typePrefix Prefix used for the CredSpec string. 
     */
    public fun typePrefix(typePrefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CredentialSpecConfig.Builder =
        software.amazon.awscdk.services.ecs.CredentialSpecConfig.builder()

    /**
     * @param location Location of the CredSpec file. 
     */
    override fun location(location: String) {
      cdkBuilder.location(location)
    }

    /**
     * @param typePrefix Prefix used for the CredSpec string. 
     */
    override fun typePrefix(typePrefix: String) {
      cdkBuilder.typePrefix(typePrefix)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CredentialSpecConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.CredentialSpecConfig,
  ) : CredentialSpecConfig {
    /**
     * Location of the CredSpec file.
     */
    override fun location(): String = unwrap(this).getLocation()

    /**
     * Prefix used for the CredSpec string.
     */
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
