@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnFunctionProps {
  public fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

  public fun assumeRolePolicyDocument(): Any? = unwrap(this).getAssumeRolePolicyDocument()

  public fun autoPublishAlias(): String? = unwrap(this).getAutoPublishAlias()

  public fun autoPublishCodeSha256(): String? = unwrap(this).getAutoPublishCodeSha256()

  public fun codeSigningConfigArn(): String? = unwrap(this).getCodeSigningConfigArn()

  public fun codeUri(): Any? = unwrap(this).getCodeUri()

  public fun deadLetterQueue(): Any? = unwrap(this).getDeadLetterQueue()

  public fun deploymentPreference(): Any? = unwrap(this).getDeploymentPreference()

  public fun description(): String? = unwrap(this).getDescription()

  public fun environment(): Any? = unwrap(this).getEnvironment()

  public fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

  public fun eventInvokeConfig(): Any? = unwrap(this).getEventInvokeConfig()

  public fun events(): Any? = unwrap(this).getEvents()

  public fun fileSystemConfigs(): Any? = unwrap(this).getFileSystemConfigs()

  public fun functionName(): String? = unwrap(this).getFunctionName()

  public fun functionUrlConfig(): Any? = unwrap(this).getFunctionUrlConfig()

  public fun handler(): String? = unwrap(this).getHandler()

  public fun imageConfig(): Any? = unwrap(this).getImageConfig()

  public fun imageUri(): String? = unwrap(this).getImageUri()

  public fun inlineCode(): String? = unwrap(this).getInlineCode()

  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public fun layers(): List<String> = unwrap(this).getLayers() ?: emptyList()

  public fun memorySize(): Number? = unwrap(this).getMemorySize()

  public fun packageType(): String? = unwrap(this).getPackageType()

  public fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

  public fun policies(): Any? = unwrap(this).getPolicies()

  public fun provisionedConcurrencyConfig(): Any? = unwrap(this).getProvisionedConcurrencyConfig()

  public fun reservedConcurrentExecutions(): Number? =
      unwrap(this).getReservedConcurrentExecutions()

  public fun role(): String? = unwrap(this).getRole()

  public fun runtime(): String? = unwrap(this).getRuntime()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun timeout(): Number? = unwrap(this).getTimeout()

  public fun tracing(): String? = unwrap(this).getTracing()

  public fun versionDescription(): String? = unwrap(this).getVersionDescription()

  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  @CdkDslMarker
  public interface Builder {
    public fun architectures(architectures: List<String>)

    public fun architectures(vararg architectures: String)

    public fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any)

    public fun autoPublishAlias(autoPublishAlias: String)

    public fun autoPublishCodeSha256(autoPublishCodeSha256: String)

    public fun codeSigningConfigArn(codeSigningConfigArn: String)

    public fun codeUri(codeUri: String)

    public fun codeUri(codeUri: IResolvable)

    public fun codeUri(codeUri: CfnFunction.S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("294ebaee736feaf44051334bbc57ae839cac56bdf9eccfa2a4ff5af612ac9920")
    public fun codeUri(codeUri: CfnFunction.S3LocationProperty.Builder.() -> Unit)

    public fun deadLetterQueue(deadLetterQueue: IResolvable)

    public fun deadLetterQueue(deadLetterQueue: CfnFunction.DeadLetterQueueProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3d14bd50d18de42012e92a0f284c7d53ea53a15c76945a69e4eea5d4fb687d7")
    public
        fun deadLetterQueue(deadLetterQueue: CfnFunction.DeadLetterQueueProperty.Builder.() -> Unit)

    public fun deploymentPreference(deploymentPreference: IResolvable)

    public fun deploymentPreference(deploymentPreference: CfnFunction.DeploymentPreferenceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5642600f88e14f064f41c069596ee5918418e7912a7e93e2a5271a539d03f156")
    public
        fun deploymentPreference(deploymentPreference: CfnFunction.DeploymentPreferenceProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun environment(environment: IResolvable)

    public fun environment(environment: CfnFunction.FunctionEnvironmentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1153b61be94ec1b717c07c54d40366a9b233f429b7e4c32262039ef6a7d9e536")
    public fun environment(environment: CfnFunction.FunctionEnvironmentProperty.Builder.() -> Unit)

    public fun ephemeralStorage(ephemeralStorage: IResolvable)

    public fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5965124cde2e56d7430f8dc489b13a35ef4c3f727f4d376c2fb71de0005a118c")
    public
        fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty.Builder.() -> Unit)

    public fun eventInvokeConfig(eventInvokeConfig: IResolvable)

    public fun eventInvokeConfig(eventInvokeConfig: CfnFunction.EventInvokeConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67b17410917bed0924700926badc7040dce0635b4f8e8835275a585e15d6b985")
    public
        fun eventInvokeConfig(eventInvokeConfig: CfnFunction.EventInvokeConfigProperty.Builder.() -> Unit)

    public fun events(events: IResolvable)

    public fun events(events: Map<String, Any>)

    public fun fileSystemConfigs(fileSystemConfigs: IResolvable)

    public fun fileSystemConfigs(fileSystemConfigs: List<Any>)

    public fun fileSystemConfigs(vararg fileSystemConfigs: Any)

    public fun functionName(functionName: String)

    public fun functionUrlConfig(functionUrlConfig: IResolvable)

    public fun functionUrlConfig(functionUrlConfig: CfnFunction.FunctionUrlConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74bf88d89227913cfde005806270c9dac6fe075c3cc9b926895aaf05e33d176f")
    public
        fun functionUrlConfig(functionUrlConfig: CfnFunction.FunctionUrlConfigProperty.Builder.() -> Unit)

    public fun handler(handler: String)

    public fun imageConfig(imageConfig: IResolvable)

    public fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7869f213627b20449370946c690e74ba2f83aac3f5f056ed06f198b7c40b60ee")
    public fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty.Builder.() -> Unit)

    public fun imageUri(imageUri: String)

    public fun inlineCode(inlineCode: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun layers(layers: List<String>)

    public fun layers(vararg layers: String)

    public fun memorySize(memorySize: Number)

    public fun packageType(packageType: String)

    public fun permissionsBoundary(permissionsBoundary: String)

    public fun policies(policies: String)

    public fun policies(policies: IResolvable)

    public fun policies(policies: CfnFunction.IAMPolicyDocumentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bc3e27934df64cb11a6c8f83c994cb7f58256691518990bb7e14a35353d3648")
    public fun policies(policies: CfnFunction.IAMPolicyDocumentProperty.Builder.() -> Unit)

    public fun policies(policies: List<Any>)

    public fun policies(vararg policies: Any)

    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable)

    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnFunction.ProvisionedConcurrencyConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14bb1c0e7c2014ebe881010ea350b4a4672ea2d724f67b2142b79628c04b5ed4")
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnFunction.ProvisionedConcurrencyConfigProperty.Builder.() -> Unit)

    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number)

    public fun role(role: String)

    public fun runtime(runtime: String)

    public fun tags(tags: Map<String, String>)

    public fun timeout(timeout: Number)

    public fun tracing(tracing: String)

    public fun versionDescription(versionDescription: String)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b009c7c368211318a9d8ad5e5e4f1ec709b666865b571e926d000052c619083")
    public fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnFunctionProps.Builder =
        software.amazon.awscdk.services.sam.CfnFunctionProps.builder()

    override fun architectures(architectures: List<String>) {
      cdkBuilder.architectures(architectures)
    }

    override fun architectures(vararg architectures: String): Unit =
        architectures(architectures.toList())

    override fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any) {
      cdkBuilder.assumeRolePolicyDocument(assumeRolePolicyDocument)
    }

    override fun autoPublishAlias(autoPublishAlias: String) {
      cdkBuilder.autoPublishAlias(autoPublishAlias)
    }

    override fun autoPublishCodeSha256(autoPublishCodeSha256: String) {
      cdkBuilder.autoPublishCodeSha256(autoPublishCodeSha256)
    }

    override fun codeSigningConfigArn(codeSigningConfigArn: String) {
      cdkBuilder.codeSigningConfigArn(codeSigningConfigArn)
    }

    override fun codeUri(codeUri: String) {
      cdkBuilder.codeUri(codeUri)
    }

    override fun codeUri(codeUri: IResolvable) {
      cdkBuilder.codeUri(codeUri.let(IResolvable::unwrap))
    }

    override fun codeUri(codeUri: CfnFunction.S3LocationProperty) {
      cdkBuilder.codeUri(codeUri.let(CfnFunction.S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("294ebaee736feaf44051334bbc57ae839cac56bdf9eccfa2a4ff5af612ac9920")
    override fun codeUri(codeUri: CfnFunction.S3LocationProperty.Builder.() -> Unit): Unit =
        codeUri(CfnFunction.S3LocationProperty(codeUri))

    override fun deadLetterQueue(deadLetterQueue: IResolvable) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IResolvable::unwrap))
    }

    override fun deadLetterQueue(deadLetterQueue: CfnFunction.DeadLetterQueueProperty) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(CfnFunction.DeadLetterQueueProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3d14bd50d18de42012e92a0f284c7d53ea53a15c76945a69e4eea5d4fb687d7")
    override
        fun deadLetterQueue(deadLetterQueue: CfnFunction.DeadLetterQueueProperty.Builder.() -> Unit):
        Unit = deadLetterQueue(CfnFunction.DeadLetterQueueProperty(deadLetterQueue))

    override fun deploymentPreference(deploymentPreference: IResolvable) {
      cdkBuilder.deploymentPreference(deploymentPreference.let(IResolvable::unwrap))
    }

    override
        fun deploymentPreference(deploymentPreference: CfnFunction.DeploymentPreferenceProperty) {
      cdkBuilder.deploymentPreference(deploymentPreference.let(CfnFunction.DeploymentPreferenceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5642600f88e14f064f41c069596ee5918418e7912a7e93e2a5271a539d03f156")
    override
        fun deploymentPreference(deploymentPreference: CfnFunction.DeploymentPreferenceProperty.Builder.() -> Unit):
        Unit = deploymentPreference(CfnFunction.DeploymentPreferenceProperty(deploymentPreference))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun environment(environment: IResolvable) {
      cdkBuilder.environment(environment.let(IResolvable::unwrap))
    }

    override fun environment(environment: CfnFunction.FunctionEnvironmentProperty) {
      cdkBuilder.environment(environment.let(CfnFunction.FunctionEnvironmentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1153b61be94ec1b717c07c54d40366a9b233f429b7e4c32262039ef6a7d9e536")
    override
        fun environment(environment: CfnFunction.FunctionEnvironmentProperty.Builder.() -> Unit):
        Unit = environment(CfnFunction.FunctionEnvironmentProperty(environment))

    override fun ephemeralStorage(ephemeralStorage: IResolvable) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
    }

    override fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(CfnFunction.EphemeralStorageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5965124cde2e56d7430f8dc489b13a35ef4c3f727f4d376c2fb71de0005a118c")
    override
        fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty.Builder.() -> Unit):
        Unit = ephemeralStorage(CfnFunction.EphemeralStorageProperty(ephemeralStorage))

    override fun eventInvokeConfig(eventInvokeConfig: IResolvable) {
      cdkBuilder.eventInvokeConfig(eventInvokeConfig.let(IResolvable::unwrap))
    }

    override fun eventInvokeConfig(eventInvokeConfig: CfnFunction.EventInvokeConfigProperty) {
      cdkBuilder.eventInvokeConfig(eventInvokeConfig.let(CfnFunction.EventInvokeConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67b17410917bed0924700926badc7040dce0635b4f8e8835275a585e15d6b985")
    override
        fun eventInvokeConfig(eventInvokeConfig: CfnFunction.EventInvokeConfigProperty.Builder.() -> Unit):
        Unit = eventInvokeConfig(CfnFunction.EventInvokeConfigProperty(eventInvokeConfig))

    override fun events(events: IResolvable) {
      cdkBuilder.events(events.let(IResolvable::unwrap))
    }

    override fun events(events: Map<String, Any>) {
      cdkBuilder.events(events)
    }

    override fun fileSystemConfigs(fileSystemConfigs: IResolvable) {
      cdkBuilder.fileSystemConfigs(fileSystemConfigs.let(IResolvable::unwrap))
    }

    override fun fileSystemConfigs(fileSystemConfigs: List<Any>) {
      cdkBuilder.fileSystemConfigs(fileSystemConfigs)
    }

    override fun fileSystemConfigs(vararg fileSystemConfigs: Any): Unit =
        fileSystemConfigs(fileSystemConfigs.toList())

    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    override fun functionUrlConfig(functionUrlConfig: IResolvable) {
      cdkBuilder.functionUrlConfig(functionUrlConfig.let(IResolvable::unwrap))
    }

    override fun functionUrlConfig(functionUrlConfig: CfnFunction.FunctionUrlConfigProperty) {
      cdkBuilder.functionUrlConfig(functionUrlConfig.let(CfnFunction.FunctionUrlConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("74bf88d89227913cfde005806270c9dac6fe075c3cc9b926895aaf05e33d176f")
    override
        fun functionUrlConfig(functionUrlConfig: CfnFunction.FunctionUrlConfigProperty.Builder.() -> Unit):
        Unit = functionUrlConfig(CfnFunction.FunctionUrlConfigProperty(functionUrlConfig))

    override fun handler(handler: String) {
      cdkBuilder.handler(handler)
    }

    override fun imageConfig(imageConfig: IResolvable) {
      cdkBuilder.imageConfig(imageConfig.let(IResolvable::unwrap))
    }

    override fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty) {
      cdkBuilder.imageConfig(imageConfig.let(CfnFunction.ImageConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7869f213627b20449370946c690e74ba2f83aac3f5f056ed06f198b7c40b60ee")
    override fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty.Builder.() -> Unit): Unit
        = imageConfig(CfnFunction.ImageConfigProperty(imageConfig))

    override fun imageUri(imageUri: String) {
      cdkBuilder.imageUri(imageUri)
    }

    override fun inlineCode(inlineCode: String) {
      cdkBuilder.inlineCode(inlineCode)
    }

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun layers(layers: List<String>) {
      cdkBuilder.layers(layers)
    }

    override fun layers(vararg layers: String): Unit = layers(layers.toList())

    override fun memorySize(memorySize: Number) {
      cdkBuilder.memorySize(memorySize)
    }

    override fun packageType(packageType: String) {
      cdkBuilder.packageType(packageType)
    }

    override fun permissionsBoundary(permissionsBoundary: String) {
      cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    override fun policies(policies: String) {
      cdkBuilder.policies(policies)
    }

    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    override fun policies(policies: CfnFunction.IAMPolicyDocumentProperty) {
      cdkBuilder.policies(policies.let(CfnFunction.IAMPolicyDocumentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bc3e27934df64cb11a6c8f83c994cb7f58256691518990bb7e14a35353d3648")
    override fun policies(policies: CfnFunction.IAMPolicyDocumentProperty.Builder.() -> Unit): Unit
        = policies(CfnFunction.IAMPolicyDocumentProperty(policies))

    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    override fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(IResolvable::unwrap))
    }

    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnFunction.ProvisionedConcurrencyConfigProperty) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(CfnFunction.ProvisionedConcurrencyConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("14bb1c0e7c2014ebe881010ea350b4a4672ea2d724f67b2142b79628c04b5ed4")
    override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: CfnFunction.ProvisionedConcurrencyConfigProperty.Builder.() -> Unit):
        Unit =
        provisionedConcurrencyConfig(CfnFunction.ProvisionedConcurrencyConfigProperty(provisionedConcurrencyConfig))

    override fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
      cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    override fun runtime(runtime: String) {
      cdkBuilder.runtime(runtime)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    override fun tracing(tracing: String) {
      cdkBuilder.tracing(tracing)
    }

    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnFunction.VpcConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5b009c7c368211318a9d8ad5e5e4f1ec709b666865b571e926d000052c619083")
    override fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnFunction.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.sam.CfnFunctionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sam.CfnFunctionProps,
  ) : CdkObject(cdkObject), CfnFunctionProps {
    override fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

    override fun assumeRolePolicyDocument(): Any? = unwrap(this).getAssumeRolePolicyDocument()

    override fun autoPublishAlias(): String? = unwrap(this).getAutoPublishAlias()

    override fun autoPublishCodeSha256(): String? = unwrap(this).getAutoPublishCodeSha256()

    override fun codeSigningConfigArn(): String? = unwrap(this).getCodeSigningConfigArn()

    override fun codeUri(): Any? = unwrap(this).getCodeUri()

    override fun deadLetterQueue(): Any? = unwrap(this).getDeadLetterQueue()

    override fun deploymentPreference(): Any? = unwrap(this).getDeploymentPreference()

    override fun description(): String? = unwrap(this).getDescription()

    override fun environment(): Any? = unwrap(this).getEnvironment()

    override fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

    override fun eventInvokeConfig(): Any? = unwrap(this).getEventInvokeConfig()

    override fun events(): Any? = unwrap(this).getEvents()

    override fun fileSystemConfigs(): Any? = unwrap(this).getFileSystemConfigs()

    override fun functionName(): String? = unwrap(this).getFunctionName()

    override fun functionUrlConfig(): Any? = unwrap(this).getFunctionUrlConfig()

    override fun handler(): String? = unwrap(this).getHandler()

    override fun imageConfig(): Any? = unwrap(this).getImageConfig()

    override fun imageUri(): String? = unwrap(this).getImageUri()

    override fun inlineCode(): String? = unwrap(this).getInlineCode()

    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    override fun layers(): List<String> = unwrap(this).getLayers() ?: emptyList()

    override fun memorySize(): Number? = unwrap(this).getMemorySize()

    override fun packageType(): String? = unwrap(this).getPackageType()

    override fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

    override fun policies(): Any? = unwrap(this).getPolicies()

    override fun provisionedConcurrencyConfig(): Any? =
        unwrap(this).getProvisionedConcurrencyConfig()

    override fun reservedConcurrentExecutions(): Number? =
        unwrap(this).getReservedConcurrentExecutions()

    override fun role(): String? = unwrap(this).getRole()

    override fun runtime(): String? = unwrap(this).getRuntime()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    override fun timeout(): Number? = unwrap(this).getTimeout()

    override fun tracing(): String? = unwrap(this).getTracing()

    override fun versionDescription(): String? = unwrap(this).getVersionDescription()

    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFunctionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunctionProps):
        CfnFunctionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionProps):
        software.amazon.awscdk.services.sam.CfnFunctionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sam.CfnFunctionProps
  }
}
