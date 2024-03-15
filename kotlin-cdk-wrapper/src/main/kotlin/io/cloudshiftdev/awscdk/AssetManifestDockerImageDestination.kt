@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AssetManifestDockerImageDestination {
  public fun dockerTagPrefix(): String? = unwrap(this).getDockerTagPrefix()

  public fun repositoryName(): String

  public fun role(): RoleOptions? = unwrap(this).getRole()?.let(RoleOptions::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun dockerTagPrefix(dockerTagPrefix: String)

    public fun repositoryName(repositoryName: String)

    public fun role(role: RoleOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c32ffdcef68fcb237656f9331eb4cb99a77ef1c4a5dc2f539dcdf98dc41b840")
    public fun role(role: RoleOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.AssetManifestDockerImageDestination.Builder =
        software.amazon.awscdk.AssetManifestDockerImageDestination.builder()

    override fun dockerTagPrefix(dockerTagPrefix: String) {
      cdkBuilder.dockerTagPrefix(dockerTagPrefix)
    }

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    override fun role(role: RoleOptions) {
      cdkBuilder.role(role.let(RoleOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c32ffdcef68fcb237656f9331eb4cb99a77ef1c4a5dc2f539dcdf98dc41b840")
    override fun role(role: RoleOptions.Builder.() -> Unit): Unit = role(RoleOptions(role))

    public fun build(): software.amazon.awscdk.AssetManifestDockerImageDestination =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.AssetManifestDockerImageDestination,
  ) : CdkObject(cdkObject), AssetManifestDockerImageDestination {
    override fun dockerTagPrefix(): String? = unwrap(this).getDockerTagPrefix()

    override fun repositoryName(): String = unwrap(this).getRepositoryName()

    override fun role(): RoleOptions? = unwrap(this).getRole()?.let(RoleOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        AssetManifestDockerImageDestination {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.AssetManifestDockerImageDestination):
        AssetManifestDockerImageDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetManifestDockerImageDestination):
        software.amazon.awscdk.AssetManifestDockerImageDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.AssetManifestDockerImageDestination
  }
}
