package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.cloudassembly.schema.AssemblyManifest
import io.cloudshiftdev.awscdk.cloudassembly.schema.RuntimeInfo
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class CloudAssembly internal constructor(
  private val cdkObject: software.amazon.awscdk.cxapi.CloudAssembly,
) {
  public open fun artifacts(): List<CloudArtifact> =
      unwrap(this).getArtifacts().map(CloudArtifact::wrap)

  public open fun directory(): String = unwrap(this).getDirectory()

  public open fun manifest(): AssemblyManifest =
      unwrap(this).getManifest().let(AssemblyManifest::wrap)

  public open fun nestedAssemblies(): List<NestedCloudAssemblyArtifact> =
      unwrap(this).getNestedAssemblies().map(NestedCloudAssemblyArtifact::wrap)

  public open fun nestedAssembly(artifactId: String): CloudAssembly =
      unwrap(this).getNestedAssembly(artifactId).let(CloudAssembly::wrap)

  public open fun nestedAssemblyArtifact(artifactId: String): NestedCloudAssemblyArtifact =
      unwrap(this).getNestedAssemblyArtifact(artifactId).let(NestedCloudAssemblyArtifact::wrap)

  public open fun runtime(): RuntimeInfo = unwrap(this).getRuntime().let(RuntimeInfo::wrap)

  public open fun stackArtifact(artifactId: String): CloudFormationStackArtifact =
      unwrap(this).getStackArtifact(artifactId).let(CloudFormationStackArtifact::wrap)

  public open fun stackByName(stackName: String): CloudFormationStackArtifact =
      unwrap(this).getStackByName(stackName).let(CloudFormationStackArtifact::wrap)

  public open fun stacks(): List<CloudFormationStackArtifact> =
      unwrap(this).getStacks().map(CloudFormationStackArtifact::wrap)

  public open fun stacksRecursively(): List<CloudFormationStackArtifact> =
      unwrap(this).getStacksRecursively().map(CloudFormationStackArtifact::wrap)

  public open fun tree(): TreeCloudArtifact? = unwrap(this).tree()?.let(TreeCloudArtifact::wrap)

  public open fun tryGetArtifact(id: String): CloudArtifact? =
      unwrap(this).tryGetArtifact(id)?.let(CloudArtifact::wrap)

  public open fun version(): String = unwrap(this).getVersion()

  public interface Builder {
    public fun skipEnumCheck(skipEnumCheck: Boolean)

    public fun skipVersionCheck(skipVersionCheck: Boolean)

    public fun topoSort(topoSort: Boolean)
  }

  private class BuilderImpl(
    directory: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.CloudAssembly.Builder =
        software.amazon.awscdk.cxapi.CloudAssembly.Builder.create(directory)

    override fun skipEnumCheck(skipEnumCheck: Boolean) {
      cdkBuilder.skipEnumCheck(skipEnumCheck)
    }

    override fun skipVersionCheck(skipVersionCheck: Boolean) {
      cdkBuilder.skipVersionCheck(skipVersionCheck)
    }

    override fun topoSort(topoSort: Boolean) {
      cdkBuilder.topoSort(topoSort)
    }

    public fun build(): software.amazon.awscdk.cxapi.CloudAssembly = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(directory: String, block: Builder.() -> Unit = {}): CloudAssembly {
      val builderImpl = BuilderImpl(directory)
      return CloudAssembly(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.CloudAssembly): CloudAssembly =
        CloudAssembly(cdkObject)

    internal fun unwrap(wrapped: CloudAssembly): software.amazon.awscdk.cxapi.CloudAssembly =
        wrapped.cdkObject
  }
}
