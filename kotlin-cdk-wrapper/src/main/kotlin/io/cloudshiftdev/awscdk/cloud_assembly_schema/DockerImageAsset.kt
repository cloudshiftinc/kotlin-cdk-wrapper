@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * A file asset.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Object assumeRoleAdditionalOptions;
 * DockerImageAsset dockerImageAsset = DockerImageAsset.builder()
 * .destinations(Map.of(
 * "destinationsKey", DockerImageDestination.builder()
 * .imageTag("imageTag")
 * .repositoryName("repositoryName")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .region("region")
 * .build()))
 * .source(DockerImageSource.builder()
 * .cacheDisabled(false)
 * .cacheFrom(List.of(DockerCacheOption.builder()
 * .type("type")
 * // the properties below are optional
 * .params(Map.of(
 * "paramsKey", "params"))
 * .build()))
 * .cacheTo(DockerCacheOption.builder()
 * .type("type")
 * // the properties below are optional
 * .params(Map.of(
 * "paramsKey", "params"))
 * .build())
 * .directory("directory")
 * .dockerBuildArgs(Map.of(
 * "dockerBuildArgsKey", "dockerBuildArgs"))
 * .dockerBuildSecrets(Map.of(
 * "dockerBuildSecretsKey", "dockerBuildSecrets"))
 * .dockerBuildSsh("dockerBuildSsh")
 * .dockerBuildTarget("dockerBuildTarget")
 * .dockerFile("dockerFile")
 * .dockerOutputs(List.of("dockerOutputs"))
 * .executable(List.of("executable"))
 * .networkMode("networkMode")
 * .platform("platform")
 * .build())
 * // the properties below are optional
 * .displayName("displayName")
 * .build();
 * ```
 */
public interface DockerImageAsset {
  /**
   * Destinations for this container asset.
   */
  public fun destinations(): Map<String, DockerImageDestination>

  /**
   * A display name for this asset.
   *
   * Default: - The identifier will be used as the display name
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * Source description for container assets.
   */
  public fun source(): DockerImageSource

  /**
   * A builder for [DockerImageAsset]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinations Destinations for this container asset. 
     */
    public fun destinations(destinations: Map<String, DockerImageDestination>)

    /**
     * @param displayName A display name for this asset.
     */
    public fun displayName(displayName: String)

    /**
     * @param source Source description for container assets. 
     */
    public fun source(source: DockerImageSource)

    /**
     * @param source Source description for container assets. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10f859ead4d7b4650a33bce64644ba1f256468bf653cebd80eb451cdc738a4ae")
    public fun source(source: DockerImageSource.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.DockerImageAsset.Builder =
        software.amazon.awscdk.cloud_assembly_schema.DockerImageAsset.builder()

    /**
     * @param destinations Destinations for this container asset. 
     */
    override fun destinations(destinations: Map<String, DockerImageDestination>) {
      cdkBuilder.destinations(destinations.mapValues{DockerImageDestination.unwrap(it.value)})
    }

    /**
     * @param displayName A display name for this asset.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param source Source description for container assets. 
     */
    override fun source(source: DockerImageSource) {
      cdkBuilder.source(source.let(DockerImageSource.Companion::unwrap))
    }

    /**
     * @param source Source description for container assets. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10f859ead4d7b4650a33bce64644ba1f256468bf653cebd80eb451cdc738a4ae")
    override fun source(source: DockerImageSource.Builder.() -> Unit): Unit =
        source(DockerImageSource(source))

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.DockerImageAsset =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.DockerImageAsset,
  ) : CdkObject(cdkObject),
      DockerImageAsset {
    /**
     * Destinations for this container asset.
     */
    override fun destinations(): Map<String, DockerImageDestination> =
        unwrap(this).getDestinations().mapValues{DockerImageDestination.wrap(it.value)}

    /**
     * A display name for this asset.
     *
     * Default: - The identifier will be used as the display name
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * Source description for container assets.
     */
    override fun source(): DockerImageSource = unwrap(this).getSource().let(DockerImageSource::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageAsset {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.DockerImageAsset):
        DockerImageAsset = CdkObjectWrappers.wrap(cdkObject) as? DockerImageAsset ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageAsset):
        software.amazon.awscdk.cloud_assembly_schema.DockerImageAsset = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.DockerImageAsset
  }
}
