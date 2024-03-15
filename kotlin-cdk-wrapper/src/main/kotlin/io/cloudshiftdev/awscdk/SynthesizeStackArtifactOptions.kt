@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.cloudassembly.schema.BootstrapRole
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface SynthesizeStackArtifactOptions {
  public fun additionalDependencies(): List<String> = unwrap(this).getAdditionalDependencies() ?:
      emptyList()

  public fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

  public fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

  public fun bootstrapStackVersionSsmParameter(): String? =
      unwrap(this).getBootstrapStackVersionSsmParameter()

  public fun cloudFormationExecutionRoleArn(): String? =
      unwrap(this).getCloudFormationExecutionRoleArn()

  public fun lookupRole(): BootstrapRole? = unwrap(this).getLookupRole()?.let(BootstrapRole::wrap)

  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  public fun requiresBootstrapStackVersion(): Number? =
      unwrap(this).getRequiresBootstrapStackVersion()

  public fun stackTemplateAssetObjectUrl(): String? = unwrap(this).getStackTemplateAssetObjectUrl()

  @CdkDslMarker
  public interface Builder {
    public fun additionalDependencies(additionalDependencies: List<String>)

    public fun additionalDependencies(vararg additionalDependencies: String)

    public fun assumeRoleArn(assumeRoleArn: String)

    public fun assumeRoleExternalId(assumeRoleExternalId: String)

    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String)

    public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String)

    public fun lookupRole(lookupRole: BootstrapRole)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("667efbdaa99a63c73ad9441bf91996ead6c776da81567e995faf159be4f41f99")
    public fun lookupRole(lookupRole: BootstrapRole.Builder.() -> Unit)

    public fun parameters(parameters: Map<String, String>)

    public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number)

    public fun stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.SynthesizeStackArtifactOptions.Builder =
        software.amazon.awscdk.SynthesizeStackArtifactOptions.builder()

    override fun additionalDependencies(additionalDependencies: List<String>) {
      cdkBuilder.additionalDependencies(additionalDependencies)
    }

    override fun additionalDependencies(vararg additionalDependencies: String): Unit =
        additionalDependencies(additionalDependencies.toList())

    override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    override fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
      cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    override fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
      cdkBuilder.cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn)
    }

    override fun lookupRole(lookupRole: BootstrapRole) {
      cdkBuilder.lookupRole(lookupRole.let(BootstrapRole::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("667efbdaa99a63c73ad9441bf91996ead6c776da81567e995faf159be4f41f99")
    override fun lookupRole(lookupRole: BootstrapRole.Builder.() -> Unit): Unit =
        lookupRole(BootstrapRole(lookupRole))

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
      cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
    }

    override fun stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl: String) {
      cdkBuilder.stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl)
    }

    public fun build(): software.amazon.awscdk.SynthesizeStackArtifactOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.SynthesizeStackArtifactOptions,
  ) : CdkObject(cdkObject), SynthesizeStackArtifactOptions {
    override fun additionalDependencies(): List<String> = unwrap(this).getAdditionalDependencies()
        ?: emptyList()

    override fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

    override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

    override fun bootstrapStackVersionSsmParameter(): String? =
        unwrap(this).getBootstrapStackVersionSsmParameter()

    override fun cloudFormationExecutionRoleArn(): String? =
        unwrap(this).getCloudFormationExecutionRoleArn()

    override fun lookupRole(): BootstrapRole? =
        unwrap(this).getLookupRole()?.let(BootstrapRole::wrap)

    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    override fun requiresBootstrapStackVersion(): Number? =
        unwrap(this).getRequiresBootstrapStackVersion()

    override fun stackTemplateAssetObjectUrl(): String? =
        unwrap(this).getStackTemplateAssetObjectUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SynthesizeStackArtifactOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.SynthesizeStackArtifactOptions):
        SynthesizeStackArtifactOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SynthesizeStackArtifactOptions):
        software.amazon.awscdk.SynthesizeStackArtifactOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.SynthesizeStackArtifactOptions
  }
}
