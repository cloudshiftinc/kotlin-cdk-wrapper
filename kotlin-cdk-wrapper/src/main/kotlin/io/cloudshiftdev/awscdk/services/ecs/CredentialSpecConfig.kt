@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Configuration for a credential specification (CredSpec) used for a ECS container.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * CredentialSpecConfig credentialSpecConfig = CredentialSpecConfig.builder()
 * .location("location")
 * .typePrefix("typePrefix")
 * .build();
 * ```
 */
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

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.CredentialSpecConfig,
  ) : CdkObject(cdkObject),
      CredentialSpecConfig {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): CredentialSpecConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CredentialSpecConfig):
        CredentialSpecConfig = CdkObjectWrappers.wrap(cdkObject) as? CredentialSpecConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CredentialSpecConfig):
        software.amazon.awscdk.services.ecs.CredentialSpecConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.CredentialSpecConfig
  }
}
