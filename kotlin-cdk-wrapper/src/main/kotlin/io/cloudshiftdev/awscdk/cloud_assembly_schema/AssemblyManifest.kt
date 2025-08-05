@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloud_assembly_schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * A manifest which describes the cloud assembly.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cloud_assembly_schema.*;
 * Object assumeRoleAdditionalOptions;
 * AssemblyManifest assemblyManifest = AssemblyManifest.builder()
 * .version("version")
 * // the properties below are optional
 * .artifacts(Map.of(
 * "artifactsKey", ArtifactManifest.builder()
 * .type(ArtifactType.NONE)
 * // the properties below are optional
 * .dependencies(List.of("dependencies"))
 * .displayName("displayName")
 * .environment("environment")
 * .metadata(Map.of(
 * "metadataKey", List.of(MetadataEntry.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .trace(List.of("trace"))
 * .build())))
 * .properties(AwsCloudFormationStackProperties.builder()
 * .templateFile("templateFile")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .assumeRoleArn("assumeRoleArn")
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
 * .cloudFormationExecutionRoleArn("cloudFormationExecutionRoleArn")
 * .lookupRole(BootstrapRole.builder()
 * .arn("arn")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .assumeRoleExternalId("assumeRoleExternalId")
 * .bootstrapStackVersionSsmParameter("bootstrapStackVersionSsmParameter")
 * .requiresBootstrapStackVersion(123)
 * .build())
 * .notificationArns(List.of("notificationArns"))
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .requiresBootstrapStackVersion(123)
 * .stackName("stackName")
 * .stackTemplateAssetObjectUrl("stackTemplateAssetObjectUrl")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .terminationProtection(false)
 * .validateOnSynth(false)
 * .build())
 * .build()))
 * .minimumCliVersion("minimumCliVersion")
 * .missing(List.of(MissingContext.builder()
 * .key("key")
 * .props(AmiContextQuery.builder()
 * .account("account")
 * .filters(Map.of(
 * "filtersKey", List.of("filters")))
 * .region("region")
 * // the properties below are optional
 * .assumeRoleAdditionalOptions(Map.of(
 * "assumeRoleAdditionalOptionsKey", assumeRoleAdditionalOptions))
 * .lookupRoleArn("lookupRoleArn")
 * .lookupRoleExternalId("lookupRoleExternalId")
 * .owners(List.of("owners"))
 * .build())
 * .provider(ContextProvider.AMI_PROVIDER)
 * .build()))
 * .runtime(RuntimeInfo.builder()
 * .libraries(Map.of(
 * "librariesKey", "libraries"))
 * .build())
 * .build();
 * ```
 */
public interface AssemblyManifest {
  /**
   * The set of artifacts in this assembly.
   *
   * Default: - no artifacts.
   */
  public fun artifacts(): Map<String, ArtifactManifest> =
      unwrap(this).getArtifacts()?.mapValues{ArtifactManifest.wrap(it.value)} ?: emptyMap()

  /**
   * Required CLI version, if available.
   *
   * If the manifest producer knows, it can put the minimum version of the CLI
   * here that supports reading this assembly.
   *
   * If set, it can be used to show a more informative error message to users.
   *
   * Default: - Minimum CLI version unknown
   */
  public fun minimumCliVersion(): String? = unwrap(this).getMinimumCliVersion()

  /**
   * Missing context information.
   *
   * If this field has values, it means that the
   * cloud assembly is not complete and should not be deployed.
   *
   * Default: - no missing context.
   */
  public fun missing(): List<MissingContext> = unwrap(this).getMissing()?.map(MissingContext::wrap)
      ?: emptyList()

  /**
   * Runtime information.
   *
   * Default: - no info.
   */
  public fun runtime(): RuntimeInfo? = unwrap(this).getRuntime()?.let(RuntimeInfo::wrap)

  /**
   * Protocol version.
   */
  public fun version(): String

  /**
   * A builder for [AssemblyManifest]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param artifacts The set of artifacts in this assembly.
     */
    public fun artifacts(artifacts: Map<String, ArtifactManifest>)

    /**
     * @param minimumCliVersion Required CLI version, if available.
     * If the manifest producer knows, it can put the minimum version of the CLI
     * here that supports reading this assembly.
     *
     * If set, it can be used to show a more informative error message to users.
     */
    public fun minimumCliVersion(minimumCliVersion: String)

    /**
     * @param missing Missing context information.
     * If this field has values, it means that the
     * cloud assembly is not complete and should not be deployed.
     */
    public fun missing(missing: List<MissingContext>)

    /**
     * @param missing Missing context information.
     * If this field has values, it means that the
     * cloud assembly is not complete and should not be deployed.
     */
    public fun missing(vararg missing: MissingContext)

    /**
     * @param runtime Runtime information.
     */
    public fun runtime(runtime: RuntimeInfo)

    /**
     * @param runtime Runtime information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d50491dab12b1f59b1208b1aa58ca639effa8ffa8264e5abb9b21de5b822db59")
    public fun runtime(runtime: RuntimeInfo.Builder.() -> Unit)

    /**
     * @param version Protocol version. 
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloud_assembly_schema.AssemblyManifest.Builder =
        software.amazon.awscdk.cloud_assembly_schema.AssemblyManifest.builder()

    /**
     * @param artifacts The set of artifacts in this assembly.
     */
    override fun artifacts(artifacts: Map<String, ArtifactManifest>) {
      cdkBuilder.artifacts(artifacts.mapValues{ArtifactManifest.unwrap(it.value)})
    }

    /**
     * @param minimumCliVersion Required CLI version, if available.
     * If the manifest producer knows, it can put the minimum version of the CLI
     * here that supports reading this assembly.
     *
     * If set, it can be used to show a more informative error message to users.
     */
    override fun minimumCliVersion(minimumCliVersion: String) {
      cdkBuilder.minimumCliVersion(minimumCliVersion)
    }

    /**
     * @param missing Missing context information.
     * If this field has values, it means that the
     * cloud assembly is not complete and should not be deployed.
     */
    override fun missing(missing: List<MissingContext>) {
      cdkBuilder.missing(missing.map(MissingContext.Companion::unwrap))
    }

    /**
     * @param missing Missing context information.
     * If this field has values, it means that the
     * cloud assembly is not complete and should not be deployed.
     */
    override fun missing(vararg missing: MissingContext): Unit = missing(missing.toList())

    /**
     * @param runtime Runtime information.
     */
    override fun runtime(runtime: RuntimeInfo) {
      cdkBuilder.runtime(runtime.let(RuntimeInfo.Companion::unwrap))
    }

    /**
     * @param runtime Runtime information.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d50491dab12b1f59b1208b1aa58ca639effa8ffa8264e5abb9b21de5b822db59")
    override fun runtime(runtime: RuntimeInfo.Builder.() -> Unit): Unit =
        runtime(RuntimeInfo(runtime))

    /**
     * @param version Protocol version. 
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.cloud_assembly_schema.AssemblyManifest =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloud_assembly_schema.AssemblyManifest,
  ) : CdkObject(cdkObject),
      AssemblyManifest {
    /**
     * The set of artifacts in this assembly.
     *
     * Default: - no artifacts.
     */
    override fun artifacts(): Map<String, ArtifactManifest> =
        unwrap(this).getArtifacts()?.mapValues{ArtifactManifest.wrap(it.value)} ?: emptyMap()

    /**
     * Required CLI version, if available.
     *
     * If the manifest producer knows, it can put the minimum version of the CLI
     * here that supports reading this assembly.
     *
     * If set, it can be used to show a more informative error message to users.
     *
     * Default: - Minimum CLI version unknown
     */
    override fun minimumCliVersion(): String? = unwrap(this).getMinimumCliVersion()

    /**
     * Missing context information.
     *
     * If this field has values, it means that the
     * cloud assembly is not complete and should not be deployed.
     *
     * Default: - no missing context.
     */
    override fun missing(): List<MissingContext> =
        unwrap(this).getMissing()?.map(MissingContext::wrap) ?: emptyList()

    /**
     * Runtime information.
     *
     * Default: - no info.
     */
    override fun runtime(): RuntimeInfo? = unwrap(this).getRuntime()?.let(RuntimeInfo::wrap)

    /**
     * Protocol version.
     */
    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AssemblyManifest {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloud_assembly_schema.AssemblyManifest):
        AssemblyManifest = CdkObjectWrappers.wrap(cdkObject) as? AssemblyManifest ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AssemblyManifest):
        software.amazon.awscdk.cloud_assembly_schema.AssemblyManifest = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloud_assembly_schema.AssemblyManifest
  }
}
