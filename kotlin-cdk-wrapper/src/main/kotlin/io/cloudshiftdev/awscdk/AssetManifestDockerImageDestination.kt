@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The destination for a docker image asset, when it is given to the AssetManifestBuilder.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * Object assumeRoleAdditionalOptions;
 * AssetManifestDockerImageDestination assetManifestDockerImageDestination =
 * AssetManifestDockerImageDestination.builder()
 * .repositoryName("repositoryName")
 * // the properties below are optional
 * .dockerTagPrefix("dockerTagPrefix")
 * .role(RoleOptions.builder()
 * .assumeRoleArn("assumeRoleArn")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .build())
 * .build();
 * ```
 */
public interface AssetManifestDockerImageDestination {
  /**
   * Prefix to add to the asset hash to make the Docker image tag.
   *
   * Default: ''
   */
  public fun dockerTagPrefix(): String? = unwrap(this).getDockerTagPrefix()

  /**
   * Repository name where the docker image asset should be written.
   */
  public fun repositoryName(): String

  /**
   * Role to use to perform the upload.
   *
   * Default: - No role
   */
  public fun role(): RoleOptions? = unwrap(this).getRole()?.let(RoleOptions::wrap)

  /**
   * A builder for [AssetManifestDockerImageDestination]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dockerTagPrefix Prefix to add to the asset hash to make the Docker image tag.
     */
    public fun dockerTagPrefix(dockerTagPrefix: String)

    /**
     * @param repositoryName Repository name where the docker image asset should be written. 
     */
    public fun repositoryName(repositoryName: String)

    /**
     * @param role Role to use to perform the upload.
     */
    public fun role(role: RoleOptions)

    /**
     * @param role Role to use to perform the upload.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c32ffdcef68fcb237656f9331eb4cb99a77ef1c4a5dc2f539dcdf98dc41b840")
    public fun role(role: RoleOptions.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.AssetManifestDockerImageDestination.Builder =
        software.amazon.awscdk.AssetManifestDockerImageDestination.builder()

    /**
     * @param dockerTagPrefix Prefix to add to the asset hash to make the Docker image tag.
     */
    override fun dockerTagPrefix(dockerTagPrefix: String) {
      cdkBuilder.dockerTagPrefix(dockerTagPrefix)
    }

    /**
     * @param repositoryName Repository name where the docker image asset should be written. 
     */
    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * @param role Role to use to perform the upload.
     */
    override fun role(role: RoleOptions) {
      cdkBuilder.role(role.let(RoleOptions.Companion::unwrap))
    }

    /**
     * @param role Role to use to perform the upload.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8c32ffdcef68fcb237656f9331eb4cb99a77ef1c4a5dc2f539dcdf98dc41b840")
    override fun role(role: RoleOptions.Builder.() -> Unit): Unit = role(RoleOptions(role))

    public fun build(): software.amazon.awscdk.AssetManifestDockerImageDestination =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.AssetManifestDockerImageDestination,
  ) : CdkObject(cdkObject),
      AssetManifestDockerImageDestination {
    /**
     * Prefix to add to the asset hash to make the Docker image tag.
     *
     * Default: ''
     */
    override fun dockerTagPrefix(): String? = unwrap(this).getDockerTagPrefix()

    /**
     * Repository name where the docker image asset should be written.
     */
    override fun repositoryName(): String = unwrap(this).getRepositoryName()

    /**
     * Role to use to perform the upload.
     *
     * Default: - No role
     */
    override fun role(): RoleOptions? = unwrap(this).getRole()?.let(RoleOptions::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        AssetManifestDockerImageDestination {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.AssetManifestDockerImageDestination):
        AssetManifestDockerImageDestination = CdkObjectWrappers.wrap(cdkObject) as?
        AssetManifestDockerImageDestination ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssetManifestDockerImageDestination):
        software.amazon.awscdk.AssetManifestDockerImageDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.AssetManifestDockerImageDestination
  }
}
