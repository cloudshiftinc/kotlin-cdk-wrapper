@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The configuration for creating a container image.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * ContainerImageConfig containerImageConfig = ContainerImageConfig.builder()
 * .imageName("imageName")
 * // the properties below are optional
 * .repositoryCredentials(RepositoryCredentialsProperty.builder()
 * .credentialsParameter("credentialsParameter")
 * .build())
 * .build();
 * ```
 */
public interface ContainerImageConfig {
  /**
   * Specifies the name of the container image.
   */
  public fun imageName(): String

  /**
   * Specifies the credentials used to access the image repository.
   */
  public fun repositoryCredentials(): CfnTaskDefinition.RepositoryCredentialsProperty? =
      unwrap(this).getRepositoryCredentials()?.let(CfnTaskDefinition.RepositoryCredentialsProperty::wrap)

  /**
   * A builder for [ContainerImageConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param imageName Specifies the name of the container image. 
     */
    public fun imageName(imageName: String)

    /**
     * @param repositoryCredentials Specifies the credentials used to access the image repository.
     */
    public
        fun repositoryCredentials(repositoryCredentials: CfnTaskDefinition.RepositoryCredentialsProperty)

    /**
     * @param repositoryCredentials Specifies the credentials used to access the image repository.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("704681dd811a822b2e0438e0f17288bbcba9e6e94dc71bd6d03cc13fa5434d08")
    public
        fun repositoryCredentials(repositoryCredentials: CfnTaskDefinition.RepositoryCredentialsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ContainerImageConfig.Builder =
        software.amazon.awscdk.services.ecs.ContainerImageConfig.builder()

    /**
     * @param imageName Specifies the name of the container image. 
     */
    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

    /**
     * @param repositoryCredentials Specifies the credentials used to access the image repository.
     */
    override
        fun repositoryCredentials(repositoryCredentials: CfnTaskDefinition.RepositoryCredentialsProperty) {
      cdkBuilder.repositoryCredentials(repositoryCredentials.let(CfnTaskDefinition.RepositoryCredentialsProperty.Companion::unwrap))
    }

    /**
     * @param repositoryCredentials Specifies the credentials used to access the image repository.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("704681dd811a822b2e0438e0f17288bbcba9e6e94dc71bd6d03cc13fa5434d08")
    override
        fun repositoryCredentials(repositoryCredentials: CfnTaskDefinition.RepositoryCredentialsProperty.Builder.() -> Unit):
        Unit =
        repositoryCredentials(CfnTaskDefinition.RepositoryCredentialsProperty(repositoryCredentials))

    public fun build(): software.amazon.awscdk.services.ecs.ContainerImageConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.ContainerImageConfig,
  ) : CdkObject(cdkObject),
      ContainerImageConfig {
    /**
     * Specifies the name of the container image.
     */
    override fun imageName(): String = unwrap(this).getImageName()

    /**
     * Specifies the credentials used to access the image repository.
     */
    override fun repositoryCredentials(): CfnTaskDefinition.RepositoryCredentialsProperty? =
        unwrap(this).getRepositoryCredentials()?.let(CfnTaskDefinition.RepositoryCredentialsProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerImageConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ContainerImageConfig):
        ContainerImageConfig = CdkObjectWrappers.wrap(cdkObject) as? ContainerImageConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerImageConfig):
        software.amazon.awscdk.services.ecs.ContainerImageConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.ContainerImageConfig
  }
}
