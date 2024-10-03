@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface AwsCloudFormationStackProperties {
  public fun assumeRoleAdditionalOptions(): Map<String, Any> =
      unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

  public fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

  public fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

  public fun bootstrapStackVersionSsmParameter(): String? =
      unwrap(this).getBootstrapStackVersionSsmParameter()

  public fun cloudFormationExecutionRoleArn(): String? =
      unwrap(this).getCloudFormationExecutionRoleArn()

  public fun lookupRole(): BootstrapRole? = unwrap(this).getLookupRole()?.let(BootstrapRole::wrap)

  public fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?: emptyList()

  public fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

  public fun requiresBootstrapStackVersion(): Number? =
      unwrap(this).getRequiresBootstrapStackVersion()

  public fun stackName(): String? = unwrap(this).getStackName()

  public fun stackTemplateAssetObjectUrl(): String? = unwrap(this).getStackTemplateAssetObjectUrl()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun templateFile(): String

  public fun terminationProtection(): Boolean? = unwrap(this).getTerminationProtection()

  public fun validateOnSynth(): Boolean? = unwrap(this).getValidateOnSynth()

  @CdkDslMarker
  public interface Builder {
    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    public fun assumeRoleArn(assumeRoleArn: String)

    public fun assumeRoleExternalId(assumeRoleExternalId: String)

    public fun bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter: String)

    public fun cloudFormationExecutionRoleArn(cloudFormationExecutionRoleArn: String)

    public fun lookupRole(lookupRole: BootstrapRole)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66cdfd634382a91730ba398609c925c72c2a679ff6839ff6fe17d526b3ed399a")
    public fun lookupRole(lookupRole: BootstrapRole.Builder.() -> Unit)

    public fun notificationArns(notificationArns: List<String>)

    public fun notificationArns(vararg notificationArns: String)

    public fun parameters(parameters: Map<String, String>)

    public fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number)

    public fun stackName(stackName: String)

    public fun stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl: String)

    public fun tags(tags: Map<String, String>)

    public fun templateFile(templateFile: String)

    public fun terminationProtection(terminationProtection: Boolean)

    public fun validateOnSynth(validateOnSynth: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties.Builder =
        software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties.builder()

    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

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
      cdkBuilder.lookupRole(lookupRole.let(BootstrapRole.Companion::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66cdfd634382a91730ba398609c925c72c2a679ff6839ff6fe17d526b3ed399a")
    override fun lookupRole(lookupRole: BootstrapRole.Builder.() -> Unit): Unit =
        lookupRole(BootstrapRole(lookupRole))

    override fun notificationArns(notificationArns: List<String>) {
      cdkBuilder.notificationArns(notificationArns)
    }

    override fun notificationArns(vararg notificationArns: String): Unit =
        notificationArns(notificationArns.toList())

    override fun parameters(parameters: Map<String, String>) {
      cdkBuilder.parameters(parameters)
    }

    override fun requiresBootstrapStackVersion(requiresBootstrapStackVersion: Number) {
      cdkBuilder.requiresBootstrapStackVersion(requiresBootstrapStackVersion)
    }

    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    override fun stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl: String) {
      cdkBuilder.stackTemplateAssetObjectUrl(stackTemplateAssetObjectUrl)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun templateFile(templateFile: String) {
      cdkBuilder.templateFile(templateFile)
    }

    override fun terminationProtection(terminationProtection: Boolean) {
      cdkBuilder.terminationProtection(terminationProtection)
    }

    override fun validateOnSynth(validateOnSynth: Boolean) {
      cdkBuilder.validateOnSynth(validateOnSynth)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties,
  ) : CdkObject(cdkObject),
      AwsCloudFormationStackProperties {
    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    override fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

    override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

    override fun bootstrapStackVersionSsmParameter(): String? =
        unwrap(this).getBootstrapStackVersionSsmParameter()

    override fun cloudFormationExecutionRoleArn(): String? =
        unwrap(this).getCloudFormationExecutionRoleArn()

    override fun lookupRole(): BootstrapRole? =
        unwrap(this).getLookupRole()?.let(BootstrapRole::wrap)

    override fun notificationArns(): List<String> = unwrap(this).getNotificationArns() ?:
        emptyList()

    override fun parameters(): Map<String, String> = unwrap(this).getParameters() ?: emptyMap()

    override fun requiresBootstrapStackVersion(): Number? =
        unwrap(this).getRequiresBootstrapStackVersion()

    override fun stackName(): String? = unwrap(this).getStackName()

    override fun stackTemplateAssetObjectUrl(): String? =
        unwrap(this).getStackTemplateAssetObjectUrl()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun templateFile(): String = unwrap(this).getTemplateFile()

    override fun terminationProtection(): Boolean? = unwrap(this).getTerminationProtection()

    override fun validateOnSynth(): Boolean? = unwrap(this).getValidateOnSynth()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsCloudFormationStackProperties {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties):
        AwsCloudFormationStackProperties = CdkObjectWrappers.wrap(cdkObject) as?
        AwsCloudFormationStackProperties ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsCloudFormationStackProperties):
        software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.cloudassembly.schema.AwsCloudFormationStackProperties
  }
}
