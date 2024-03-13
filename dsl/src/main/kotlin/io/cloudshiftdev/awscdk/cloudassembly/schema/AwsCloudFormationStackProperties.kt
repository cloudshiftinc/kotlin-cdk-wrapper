package io.cloudshiftdev.awscdk.cloudassembly.schema

import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface AwsCloudFormationStackProperties {
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

  public fun stackName(): String? = unwrap(this).getStackName()

  public fun stackTemplateAssetObjectUrl(): String? = unwrap(this).getStackTemplateAssetObjectUrl()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun templateFile(): String

  public fun terminationProtection(): Boolean? = unwrap(this).getTerminationProtection()

  public fun validateOnSynth(): Boolean? = unwrap(this).getValidateOnSynth()

  public interface Builder {
    public fun assumeRoleArn(assumeRoleArn: String) {
    }

    public fun assumeRoleExternalId(assumeRoleExternalId: String) {
    }

    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
    }

    public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
    }

    public fun lookupRole(lookupRole: BootstrapRole) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66cdfd634382a91730ba398609c925c72c2a679ff6839ff6fe17d526b3ed399a")
    public fun lookupRole(lookupRole: BootstrapRole.Builder.() -> Unit) {
    }

    public fun parameters(parameters: Map<String, String>) {
    }

    public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
    }

    public fun stackName(stackName: String) {
    }

    public fun stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl: String) {
    }

    public fun tags(tags: Map<String, String>) {
    }

    public fun templateFile(templateFile: String) {
    }

    public fun terminationProtection(terminationProtection: Boolean) {
    }

    public fun validateOnSynth(validateOnSynth: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties.Builder =
        software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties.builder()

    public override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    public override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    public override
        fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String) {
      cdkBuilder.bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter)
    }

    public override fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String) {
      cdkBuilder.cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn)
    }

    public override fun lookupRole(lookupRole: BootstrapRole) {
      cdkBuilder.lookupRole(lookupRole.let(BootstrapRole::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66cdfd634382a91730ba398609c925c72c2a679ff6839ff6fe17d526b3ed399a")
    public override fun lookupRole(lookupRole: BootstrapRole.Builder.() -> Unit): Unit =
        lookupRole(BootstrapRole(lookupRole))

    public override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    public override fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
      cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
    }

    public override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    public override fun stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl: String) {
      cdkBuilder.stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public override fun templateFile(templateFile: String) {
      cdkBuilder.templateFile(templateFile)
    }

    public override fun terminationProtection(terminationProtection: Boolean) {
      cdkBuilder.terminationProtection(terminationProtection)
    }

    public override fun validateOnSynth(validateOnSynth: Boolean) {
      cdkBuilder.validateOnSynth(validateOnSynth)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties,
  ) : AwsCloudFormationStackProperties {
    public override fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

    public override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

    public override fun bootstrapStackVersionSsmParameter(): String? =
        unwrap(this).getBootstrapStackVersionSsmParameter()

    public override fun cloudFormationExecutionRoleArn(): String? =
        unwrap(this).getCloudFormationExecutionRoleArn()

    public override fun lookupRole(): BootstrapRole? =
        unwrap(this).getLookupRole()?.let(BootstrapRole::wrap)

    public override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?:
        emptyMap()

    public override fun requiresBootstrapStackVersion(): Number? =
        unwrap(this).getRequiresBootstrapStackVersion()

    public override fun stackName(): String? = unwrap(this).getStackName()

    public override fun stackTemplateAssetObjectUrl(): String? =
        unwrap(this).getStackTemplateAssetObjectUrl()

    public override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    public override fun templateFile(): String = unwrap(this).getTemplateFile()

    public override fun terminationProtection(): Boolean? = unwrap(this).getTerminationProtection()

    public override fun validateOnSynth(): Boolean? = unwrap(this).getValidateOnSynth()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AwsCloudFormationStackProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties):
        AwsCloudFormationStackProperties = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsCloudFormationStackProperties):
        software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties = (wrapped as
        Wrapper).cdkObject
  }
}
