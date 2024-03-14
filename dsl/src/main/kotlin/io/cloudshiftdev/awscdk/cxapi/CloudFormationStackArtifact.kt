package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloudassembly.schema.ArtifactType
import io.cloudshiftdev.awscdk.cloudassembly.schema.AssetManifestProperties
import io.cloudshiftdev.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties
import io.cloudshiftdev.awscdk.cloudassembly.schema.BootstrapRole
import io.cloudshiftdev.awscdk.cloudassembly.schema.MetadataEntry
import io.cloudshiftdev.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties
import io.cloudshiftdev.awscdk.cloudassembly.schema.TreeArtifactProperties
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public open class CloudFormationStackArtifact internal constructor(
  private val cdkObject: software.amazon.awscdk.cxapi.CloudFormationStackArtifact,
) : CloudArtifact(cdkObject) {
  public open fun assets(): List<Any> = unwrap(this).getAssets()

  public open fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

  public open fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

  public open fun bootstrapStackVersionSsmParameter(): String? =
      unwrap(this).getBootstrapStackVersionSsmParameter()

  public open fun cloudFormationExecutionRoleArn(): String? =
      unwrap(this).getCloudFormationExecutionRoleArn()

  public open fun displayName(): String = unwrap(this).getDisplayName()

  public open fun environment(): Environment = unwrap(this).getEnvironment().let(Environment::wrap)

  public open fun lookupRole(): BootstrapRole? =
      unwrap(this).getLookupRole()?.let(BootstrapRole::wrap)

  public open fun originalName(): String = unwrap(this).getOriginalName()

  public open fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  public open fun requiresBootstrapStackVersion(): Number? =
      unwrap(this).getRequiresBootstrapStackVersion()

  public open fun stackName(): String = unwrap(this).getStackName()

  public open fun stackTemplateAssetObjectUrl(): String? =
      unwrap(this).getStackTemplateAssetObjectUrl()

  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public open fun template(): Any = unwrap(this).getTemplate()

  public open fun templateFile(): String = unwrap(this).getTemplateFile()

  public open fun templateFullPath(): String = unwrap(this).getTemplateFullPath()

  public open fun terminationProtection(): Boolean? = unwrap(this).getTerminationProtection()

  public open fun validateOnSynth(): Boolean? = unwrap(this).getValidateOnSynth()

  public interface Builder {
    public fun dependencies(dependencies: List<String>)

    public fun dependencies(vararg dependencies: String)

    public fun displayName(displayName: String)

    public fun environment(environment: String)

    public fun metadata(metadata: Map<String, List<MetadataEntry>>)

    public fun properties(properties: AwsCloudFormationStackProperties)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92c205a9470ccdebd826cf4b31ac7003bef204a014ac9f284ba9ba1b499921e7")
    public fun properties(properties: AwsCloudFormationStackProperties.Builder.() -> Unit)

    public fun properties(properties: AssetManifestProperties)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dd6900b1f22ad585674a846e06f59419a9c370083cc0665c9791f83cad33009")
    public fun properties(properties: AssetManifestProperties.Builder.() -> Unit)

    public fun properties(properties: TreeArtifactProperties)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c66db8a93c609f04a50a253bb6a43f9131a9bb64ae18a714133ee19623bf2d9")
    public fun properties(properties: TreeArtifactProperties.Builder.() -> Unit)

    public fun properties(properties: NestedCloudAssemblyProperties)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89ceb4e9acb0af4e90262523f7c7c05de15be68a16458b25e519add9141b9d88")
    public fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit)

    public fun type(type: ArtifactType)
  }

  private class BuilderImpl(
    assembly: software.amazon.awscdk.cxapi.CloudAssembly,
    artifactId: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.CloudFormationStackArtifact.Builder =
        software.amazon.awscdk.cxapi.CloudFormationStackArtifact.Builder.create(assembly,
        artifactId)

    override fun dependencies(dependencies: List<String>) {
      cdkBuilder.dependencies(dependencies)
    }

    override fun dependencies(vararg dependencies: String): Unit =
        dependencies(dependencies.toList())

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun environment(environment: String) {
      cdkBuilder.environment(environment)
    }

    override fun metadata(metadata: Map<String, List<MetadataEntry>>) {
      cdkBuilder.metadata(metadata.mapValues{it.value.map(MetadataEntry::unwrap) })
    }

    override fun properties(properties: AwsCloudFormationStackProperties) {
      cdkBuilder.properties(properties.let(AwsCloudFormationStackProperties::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92c205a9470ccdebd826cf4b31ac7003bef204a014ac9f284ba9ba1b499921e7")
    override fun properties(properties: AwsCloudFormationStackProperties.Builder.() -> Unit): Unit =
        properties(AwsCloudFormationStackProperties(properties))

    override fun properties(properties: AssetManifestProperties) {
      cdkBuilder.properties(properties.let(AssetManifestProperties::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3dd6900b1f22ad585674a846e06f59419a9c370083cc0665c9791f83cad33009")
    override fun properties(properties: AssetManifestProperties.Builder.() -> Unit): Unit =
        properties(AssetManifestProperties(properties))

    override fun properties(properties: TreeArtifactProperties) {
      cdkBuilder.properties(properties.let(TreeArtifactProperties::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c66db8a93c609f04a50a253bb6a43f9131a9bb64ae18a714133ee19623bf2d9")
    override fun properties(properties: TreeArtifactProperties.Builder.() -> Unit): Unit =
        properties(TreeArtifactProperties(properties))

    override fun properties(properties: NestedCloudAssemblyProperties) {
      cdkBuilder.properties(properties.let(NestedCloudAssemblyProperties::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("89ceb4e9acb0af4e90262523f7c7c05de15be68a16458b25e519add9141b9d88")
    override fun properties(properties: NestedCloudAssemblyProperties.Builder.() -> Unit): Unit =
        properties(NestedCloudAssemblyProperties(properties))

    override fun type(type: ArtifactType) {
      cdkBuilder.type(type.let(ArtifactType::unwrap))
    }

    public fun build(): software.amazon.awscdk.cxapi.CloudFormationStackArtifact =
        cdkBuilder.build()
  }

  public companion object {
    public open fun isCloudFormationStackArtifact(art: Any): Boolean =
        software.amazon.awscdk.cxapi.CloudFormationStackArtifact.isCloudFormationStackArtifact(art)

    public operator fun invoke(
      assembly: CloudAssembly,
      artifactId: String,
      block: Builder.() -> Unit = {},
    ): CloudFormationStackArtifact {
      val builderImpl = BuilderImpl(CloudAssembly.unwrap(assembly), artifactId)
      return CloudFormationStackArtifact(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.CloudFormationStackArtifact):
        CloudFormationStackArtifact = CloudFormationStackArtifact(cdkObject)

    internal fun unwrap(wrapped: CloudFormationStackArtifact):
        software.amazon.awscdk.cxapi.CloudFormationStackArtifact = wrapped.cdkObject
  }
}
