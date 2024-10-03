@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloud_assembly_schema.AssemblyManifest
import io.cloudshiftdev.awscdk.cloud_assembly_schema.LoadManifestOptions
import io.cloudshiftdev.awscdk.cloud_assembly_schema.RuntimeInfo
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Represents a deployable cloud application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * CloudAssembly cloudAssembly = CloudAssembly.Builder.create("directory")
 * .skipEnumCheck(false)
 * .skipVersionCheck(false)
 * .topoSort(false)
 * .build();
 * ```
 */
public open class CloudAssembly(
  cdkObject: software.amazon.awscdk.cxapi.CloudAssembly,
) : CdkObject(cdkObject) {
  public constructor(directory: String) : this(software.amazon.awscdk.cxapi.CloudAssembly(directory)
  )

  public constructor(directory: String, loadOptions: LoadManifestOptions) :
      this(software.amazon.awscdk.cxapi.CloudAssembly(directory,
      loadOptions.let(LoadManifestOptions.Companion::unwrap))
  )

  public constructor(directory: String, loadOptions: LoadManifestOptions.Builder.() -> Unit) :
      this(directory, LoadManifestOptions(loadOptions)
  )

  /**
   * All artifacts included in this assembly.
   */
  public open fun artifacts(): List<CloudArtifact> =
      unwrap(this).getArtifacts().map(CloudArtifact::wrap)

  /**
   * The root directory of the cloud assembly.
   */
  public open fun directory(): String = unwrap(this).getDirectory()

  /**
   * The raw assembly manifest.
   */
  public open fun manifest(): AssemblyManifest =
      unwrap(this).getManifest().let(AssemblyManifest::wrap)

  /**
   * The nested assembly artifacts in this assembly.
   */
  public open fun nestedAssemblies(): List<NestedCloudAssemblyArtifact> =
      unwrap(this).getNestedAssemblies().map(NestedCloudAssemblyArtifact::wrap)

  /**
   * Returns a nested assembly.
   *
   * @param artifactId The artifact ID of the nested assembly. 
   */
  public open fun nestedAssembly(artifactId: String): CloudAssembly =
      unwrap(this).getNestedAssembly(artifactId).let(CloudAssembly::wrap)

  /**
   * Returns a nested assembly artifact.
   *
   * @param artifactId The artifact ID of the nested assembly. 
   */
  public open fun nestedAssemblyArtifact(artifactId: String): NestedCloudAssemblyArtifact =
      unwrap(this).getNestedAssemblyArtifact(artifactId).let(NestedCloudAssemblyArtifact::wrap)

  /**
   * Runtime information such as module versions used to synthesize this assembly.
   */
  public open fun runtime(): RuntimeInfo = unwrap(this).getRuntime().let(RuntimeInfo::wrap)

  /**
   * Returns a CloudFormation stack artifact from this assembly.
   *
   * @return a `CloudFormationStackArtifact` object.
   * @param artifactId the artifact id of the stack (can be obtained through `stack.artifactId`). 
   */
  public open fun stackArtifact(artifactId: String): CloudFormationStackArtifact =
      unwrap(this).getStackArtifact(artifactId).let(CloudFormationStackArtifact::wrap)

  /**
   * Returns a CloudFormation stack artifact from this assembly.
   *
   * Will only search the current assembly.
   *
   * @return a `CloudFormationStackArtifact` object.
   * @param stackName the name of the CloudFormation stack. 
   */
  public open fun stackByName(stackName: String): CloudFormationStackArtifact =
      unwrap(this).getStackByName(stackName).let(CloudFormationStackArtifact::wrap)

  /**
   * @return all the CloudFormation stack artifacts that are included in this assembly.
   */
  public open fun stacks(): List<CloudFormationStackArtifact> =
      unwrap(this).getStacks().map(CloudFormationStackArtifact::wrap)

  /**
   * Returns all the stacks, including the ones in nested assemblies.
   */
  public open fun stacksRecursively(): List<CloudFormationStackArtifact> =
      unwrap(this).getStacksRecursively().map(CloudFormationStackArtifact::wrap)

  /**
   * Returns the tree metadata artifact from this assembly.
   *
   * @return a `TreeCloudArtifact` object if there is one defined in the manifest, `undefined`
   * otherwise.
   */
  public open fun tree(): TreeCloudArtifact? = unwrap(this).tree()?.let(TreeCloudArtifact::wrap)

  /**
   * Attempts to find an artifact with a specific identity.
   *
   * @return A `CloudArtifact` object or `undefined` if the artifact does not exist in this
   * assembly.
   * @param id The artifact ID. 
   */
  public open fun tryGetArtifact(id: String): CloudArtifact? =
      unwrap(this).tryGetArtifact(id)?.let(CloudArtifact::wrap)

  /**
   * The schema version of the assembly manifest.
   */
  public open fun version(): String = unwrap(this).getVersion()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.cxapi.CloudAssembly].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Skip enum checks.
     *
     * This means you may read enum values you don't know about yet. Make sure to always
     * check the values of enums you encounter in the manifest.
     *
     * Default: false
     *
     * @param skipEnumCheck Skip enum checks. 
     */
    public fun skipEnumCheck(skipEnumCheck: Boolean)

    /**
     * Skip the version check.
     *
     * This means you may read a newer cloud assembly than the CX API is designed
     * to support, and your application may not be aware of all features that in use
     * in the Cloud Assembly.
     *
     * Default: false
     *
     * @param skipVersionCheck Skip the version check. 
     */
    public fun skipVersionCheck(skipVersionCheck: Boolean)

    /**
     * Topologically sort all artifacts.
     *
     * This parameter is only respected by the constructor of `CloudAssembly`. The
     * property lives here for backwards compatibility reasons.
     *
     * Default: true
     *
     * @param topoSort Topologically sort all artifacts. 
     */
    public fun topoSort(topoSort: Boolean)
  }

  private class BuilderImpl(
    directory: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.CloudAssembly.Builder =
        software.amazon.awscdk.cxapi.CloudAssembly.Builder.create(directory)

    /**
     * Skip enum checks.
     *
     * This means you may read enum values you don't know about yet. Make sure to always
     * check the values of enums you encounter in the manifest.
     *
     * Default: false
     *
     * @param skipEnumCheck Skip enum checks. 
     */
    override fun skipEnumCheck(skipEnumCheck: Boolean) {
      cdkBuilder.skipEnumCheck(skipEnumCheck)
    }

    /**
     * Skip the version check.
     *
     * This means you may read a newer cloud assembly than the CX API is designed
     * to support, and your application may not be aware of all features that in use
     * in the Cloud Assembly.
     *
     * Default: false
     *
     * @param skipVersionCheck Skip the version check. 
     */
    override fun skipVersionCheck(skipVersionCheck: Boolean) {
      cdkBuilder.skipVersionCheck(skipVersionCheck)
    }

    /**
     * Topologically sort all artifacts.
     *
     * This parameter is only respected by the constructor of `CloudAssembly`. The
     * property lives here for backwards compatibility reasons.
     *
     * Default: true
     *
     * @param topoSort Topologically sort all artifacts. 
     */
    override fun topoSort(topoSort: Boolean) {
      cdkBuilder.topoSort(topoSort)
    }

    public fun build(): software.amazon.awscdk.cxapi.CloudAssembly = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(directory: String, block: Builder.() -> Unit = {}): CloudAssembly {
      val builderImpl = BuilderImpl(directory)
      return CloudAssembly(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.CloudAssembly): CloudAssembly =
        CloudAssembly(cdkObject)

    internal fun unwrap(wrapped: CloudAssembly): software.amazon.awscdk.cxapi.CloudAssembly =
        wrapped.cdkObject as software.amazon.awscdk.cxapi.CloudAssembly
  }
}
