package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloudassembly.schema.ArtifactType
import io.cloudshiftdev.awscdk.cloudassembly.schema.AssetManifestProperties
import io.cloudshiftdev.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties
import io.cloudshiftdev.awscdk.cloudassembly.schema.MetadataEntry
import io.cloudshiftdev.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties
import io.cloudshiftdev.awscdk.cloudassembly.schema.TreeArtifactProperties
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class NestedCloudAssemblyArtifact internal constructor(
  private val cdkObject: software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact,
) : CloudArtifact(cdkObject) {
  /**
   * The relative directory name of the asset manifest.
   */
  public open fun directoryName(): String = unwrap(this).getDirectoryName()

  /**
   * Display name.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * Full path to the nested assembly directory.
   */
  public open fun fullPath(): String = unwrap(this).getFullPath()

  /**
   * The nested Assembly.
   */
  public open fun nestedAssembly(): CloudAssembly =
      unwrap(this).getNestedAssembly().let(CloudAssembly::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.cxapi.NestedCloudAssemblyArtifact].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * IDs of artifacts that must be deployed before this artifact.
     *
     * Default: - no dependencies.
     *
     * @param dependencies IDs of artifacts that must be deployed before this artifact. 
     */
    public fun dependencies(dependencies: List<String>)

    /**
     * IDs of artifacts that must be deployed before this artifact.
     *
     * Default: - no dependencies.
     *
     * @param dependencies IDs of artifacts that must be deployed before this artifact. 
     */
    public fun dependencies(vararg dependencies: String)

    /**
     * A string that represents this artifact.
     *
     * Should only be used in user interfaces.
     *
     * Default: - no display name
     *
     * @param displayName A string that represents this artifact. 
     */
    public fun displayName(displayName: String)

    /**
     * The environment into which this artifact is deployed.
     *
     * Default: - no envrionment.
     *
     * @param environment The environment into which this artifact is deployed. 
     */
    public fun environment(environment: String)

    /**
     * Associated metadata.
     *
     * Default: - no metadata.
     *
     * @param metadata Associated metadata. 
     */
    public fun metadata(metadata: Map<String, List<MetadataEntry>>)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    public fun properties(properties: AwsCloudFormationStackProperties)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96bcbb184e451768106b6f3257a88b7eed0ad2c6d69a847c891ae86e79c2caaa")
    public fun properties(properties: AwsCloudFormationStackProperties.Builder.() -> Unit)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    public fun properties(properties: AssetManifestProperties)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d7709add77d497c9f5df7a50657dab1044e1eda730957b04d51c8933216402f")
    public fun properties(properties: AssetManifestProperties.Builder.() -> Unit)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    public fun properties(properties: TreeArtifactProperties)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2c4121c265fcedd8998f80de849166240f9d87a48132c18e05e23693421244a")
    public fun properties(properties: TreeArtifactProperties.Builder.() -> Unit)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    public fun properties(properties: NestedCloudAssemblyProperties)

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("819747833b8339b5bc1d2c29e7c27851a4cf6462a17bb23412f9234bb42e411f")
    public fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit)

    /**
     * The type of artifact.
     *
     * @param type The type of artifact. 
     */
    public fun type(type: ArtifactType)
  }

  private class BuilderImpl(
    assembly: software.amazon.awscdk.cxapi.CloudAssembly,
    name: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact.Builder =
        software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact.Builder.create(assembly, name)

    /**
     * IDs of artifacts that must be deployed before this artifact.
     *
     * Default: - no dependencies.
     *
     * @param dependencies IDs of artifacts that must be deployed before this artifact. 
     */
    override fun dependencies(dependencies: List<String>) {
      cdkBuilder.dependencies(dependencies)
    }

    /**
     * IDs of artifacts that must be deployed before this artifact.
     *
     * Default: - no dependencies.
     *
     * @param dependencies IDs of artifacts that must be deployed before this artifact. 
     */
    override fun dependencies(vararg dependencies: String): Unit =
        dependencies(dependencies.toList())

    /**
     * A string that represents this artifact.
     *
     * Should only be used in user interfaces.
     *
     * Default: - no display name
     *
     * @param displayName A string that represents this artifact. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The environment into which this artifact is deployed.
     *
     * Default: - no envrionment.
     *
     * @param environment The environment into which this artifact is deployed. 
     */
    override fun environment(environment: String) {
      cdkBuilder.environment(environment)
    }

    /**
     * Associated metadata.
     *
     * Default: - no metadata.
     *
     * @param metadata Associated metadata. 
     */
    override fun metadata(metadata: Map<String, List<MetadataEntry>>) {
      cdkBuilder.metadata(metadata.mapValues{it.value.map(MetadataEntry::unwrap) })
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    override fun properties(properties: AwsCloudFormationStackProperties) {
      cdkBuilder.properties(properties.let(AwsCloudFormationStackProperties::unwrap))
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96bcbb184e451768106b6f3257a88b7eed0ad2c6d69a847c891ae86e79c2caaa")
    override fun properties(properties: AwsCloudFormationStackProperties.Builder.() -> Unit): Unit =
        properties(AwsCloudFormationStackProperties(properties))

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    override fun properties(properties: AssetManifestProperties) {
      cdkBuilder.properties(properties.let(AssetManifestProperties::unwrap))
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d7709add77d497c9f5df7a50657dab1044e1eda730957b04d51c8933216402f")
    override fun properties(properties: AssetManifestProperties.Builder.() -> Unit): Unit =
        properties(AssetManifestProperties(properties))

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    override fun properties(properties: TreeArtifactProperties) {
      cdkBuilder.properties(properties.let(TreeArtifactProperties::unwrap))
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d2c4121c265fcedd8998f80de849166240f9d87a48132c18e05e23693421244a")
    override fun properties(properties: TreeArtifactProperties.Builder.() -> Unit): Unit =
        properties(TreeArtifactProperties(properties))

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    override fun properties(properties: NestedCloudAssemblyProperties) {
      cdkBuilder.properties(properties.let(NestedCloudAssemblyProperties::unwrap))
    }

    /**
     * The set of properties for this artifact (depends on type).
     *
     * Default: - no properties.
     *
     * @param properties The set of properties for this artifact (depends on type). 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("819747833b8339b5bc1d2c29e7c27851a4cf6462a17bb23412f9234bb42e411f")
    override fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit): Unit =
        properties(NestedCloudAssemblyProperties(properties))

    /**
     * The type of artifact.
     *
     * @param type The type of artifact. 
     */
    override fun type(type: ArtifactType) {
      cdkBuilder.type(type.let(ArtifactType::unwrap))
    }

    public fun build(): software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact =
        cdkBuilder.build()
  }

  public companion object {
    public fun isNestedCloudAssemblyArtifact(art: Any): Boolean =
        software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact.isNestedCloudAssemblyArtifact(art)

    public operator fun invoke(
      assembly: CloudAssembly,
      name: String,
      block: Builder.() -> Unit = {},
    ): NestedCloudAssemblyArtifact {
      val builderImpl = BuilderImpl(CloudAssembly.unwrap(assembly), name)
      return NestedCloudAssemblyArtifact(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact):
        NestedCloudAssemblyArtifact = NestedCloudAssemblyArtifact(cdkObject)

    internal fun unwrap(wrapped: NestedCloudAssemblyArtifact):
        software.amazon.awscdk.cxapi.NestedCloudAssemblyArtifact = wrapped.cdkObject
  }
}
