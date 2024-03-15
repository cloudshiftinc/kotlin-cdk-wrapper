@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ContainerImageConfig {
  public fun imageName(): String

  public fun repositoryCredentials(): CfnTaskDefinition.RepositoryCredentialsProperty? =
      unwrap(this).getRepositoryCredentials()?.let(CfnTaskDefinition.RepositoryCredentialsProperty::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun imageName(imageName: String)

    public
        fun repositoryCredentials(repositoryCredentials: CfnTaskDefinition.RepositoryCredentialsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("704681dd811a822b2e0438e0f17288bbcba9e6e94dc71bd6d03cc13fa5434d08")
    public
        fun repositoryCredentials(repositoryCredentials: CfnTaskDefinition.RepositoryCredentialsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ContainerImageConfig.Builder =
        software.amazon.awscdk.services.ecs.ContainerImageConfig.builder()

    override fun imageName(imageName: String) {
      cdkBuilder.imageName(imageName)
    }

    override
        fun repositoryCredentials(repositoryCredentials: CfnTaskDefinition.RepositoryCredentialsProperty) {
      cdkBuilder.repositoryCredentials(repositoryCredentials.let(CfnTaskDefinition.RepositoryCredentialsProperty::unwrap))
    }

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
    override val cdkObject: software.amazon.awscdk.services.ecs.ContainerImageConfig,
  ) : CdkObject(cdkObject), ContainerImageConfig {
    override fun imageName(): String = unwrap(this).getImageName()

    override fun repositoryCredentials(): CfnTaskDefinition.RepositoryCredentialsProperty? =
        unwrap(this).getRepositoryCredentials()?.let(CfnTaskDefinition.RepositoryCredentialsProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ContainerImageConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ContainerImageConfig):
        ContainerImageConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ContainerImageConfig):
        software.amazon.awscdk.services.ecs.ContainerImageConfig = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.ContainerImageConfig
  }
}
