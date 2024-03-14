package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFunction internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sam.CfnFunction,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

  public open fun architectures(`value`: List<String>) {
    unwrap(this).setArchitectures(`value`)
  }

  public open fun assumeRolePolicyDocument(): Any? = unwrap(this).getAssumeRolePolicyDocument()

  public open fun assumeRolePolicyDocument(`value`: Any) {
    unwrap(this).setAssumeRolePolicyDocument(`value`)
  }

  public open fun autoPublishAlias(): String? = unwrap(this).getAutoPublishAlias()

  public open fun autoPublishAlias(`value`: String) {
    unwrap(this).setAutoPublishAlias(`value`)
  }

  public open fun autoPublishCodeSha256(): String? = unwrap(this).getAutoPublishCodeSha256()

  public open fun autoPublishCodeSha256(`value`: String) {
    unwrap(this).setAutoPublishCodeSha256(`value`)
  }

  public open fun codeSigningConfigArn(): String? = unwrap(this).getCodeSigningConfigArn()

  public open fun codeSigningConfigArn(`value`: String) {
    unwrap(this).setCodeSigningConfigArn(`value`)
  }

  public open fun codeUri(): Any? = unwrap(this).getCodeUri()

  public open fun codeUri(`value`: String) {
    unwrap(this).setCodeUri(`value`)
  }

  public open fun codeUri(`value`: IResolvable) {
    unwrap(this).setCodeUri(`value`.let(IResolvable::unwrap))
  }

  public open fun codeUri(`value`: S3LocationProperty) {
    unwrap(this).setCodeUri(`value`.let(S3LocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0683f6d8fd732d59d21e4c10b810c50d159271f16599387be88954015ea63c75")
  public open fun codeUri(`value`: S3LocationProperty.Builder.() -> Unit): Unit =
      codeUri(S3LocationProperty(`value`))

  public open fun deadLetterQueue(): Any? = unwrap(this).getDeadLetterQueue()

  public open fun deadLetterQueue(`value`: IResolvable) {
    unwrap(this).setDeadLetterQueue(`value`.let(IResolvable::unwrap))
  }

  public open fun deadLetterQueue(`value`: DeadLetterQueueProperty) {
    unwrap(this).setDeadLetterQueue(`value`.let(DeadLetterQueueProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("802d999666b699da2b274eb7fb76602491a473e4b46ea8e281bea9211374eead")
  public open fun deadLetterQueue(`value`: DeadLetterQueueProperty.Builder.() -> Unit): Unit =
      deadLetterQueue(DeadLetterQueueProperty(`value`))

  public open fun deploymentPreference(): Any? = unwrap(this).getDeploymentPreference()

  public open fun deploymentPreference(`value`: IResolvable) {
    unwrap(this).setDeploymentPreference(`value`.let(IResolvable::unwrap))
  }

  public open fun deploymentPreference(`value`: DeploymentPreferenceProperty) {
    unwrap(this).setDeploymentPreference(`value`.let(DeploymentPreferenceProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a65b670971e344005d08ac13683c00f526825956712a7989ea9fa0933d8fccfc")
  public open fun deploymentPreference(`value`: DeploymentPreferenceProperty.Builder.() -> Unit):
      Unit = deploymentPreference(DeploymentPreferenceProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun environment(): Any? = unwrap(this).getEnvironment()

  public open fun environment(`value`: IResolvable) {
    unwrap(this).setEnvironment(`value`.let(IResolvable::unwrap))
  }

  public open fun environment(`value`: FunctionEnvironmentProperty) {
    unwrap(this).setEnvironment(`value`.let(FunctionEnvironmentProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a87a85695306b2e0f444b19b059b250babeec08b3612f994c37d3df3f9c9755")
  public open fun environment(`value`: FunctionEnvironmentProperty.Builder.() -> Unit): Unit =
      environment(FunctionEnvironmentProperty(`value`))

  public open fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

  public open fun ephemeralStorage(`value`: IResolvable) {
    unwrap(this).setEphemeralStorage(`value`.let(IResolvable::unwrap))
  }

  public open fun ephemeralStorage(`value`: EphemeralStorageProperty) {
    unwrap(this).setEphemeralStorage(`value`.let(EphemeralStorageProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f1e52d0582ee5cffc84ff9f32e3e3a53aaf32b548298660474716d364aa993cf")
  public open fun ephemeralStorage(`value`: EphemeralStorageProperty.Builder.() -> Unit): Unit =
      ephemeralStorage(EphemeralStorageProperty(`value`))

  public open fun eventInvokeConfig(): Any? = unwrap(this).getEventInvokeConfig()

  public open fun eventInvokeConfig(`value`: IResolvable) {
    unwrap(this).setEventInvokeConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun eventInvokeConfig(`value`: EventInvokeConfigProperty) {
    unwrap(this).setEventInvokeConfig(`value`.let(EventInvokeConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f2f997bd7eb2f13acc408f94155ed1770bf8b1ef62732a9cf16d942856dc5683")
  public open fun eventInvokeConfig(`value`: EventInvokeConfigProperty.Builder.() -> Unit): Unit =
      eventInvokeConfig(EventInvokeConfigProperty(`value`))

  public open fun events(): Any? = unwrap(this).getEvents()

  public open fun events(`value`: IResolvable) {
    unwrap(this).setEvents(`value`.let(IResolvable::unwrap))
  }

  public open fun events(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setEvents(__item_ac66f0)
  }

  public open fun fileSystemConfigs(): Any? = unwrap(this).getFileSystemConfigs()

  public open fun fileSystemConfigs(`value`: IResolvable) {
    unwrap(this).setFileSystemConfigs(`value`.let(IResolvable::unwrap))
  }

  public open fun fileSystemConfigs(__idx_ac66f0: List<Any>) {
    unwrap(this).setFileSystemConfigs(__idx_ac66f0)
  }

  public open fun functionName(): String? = unwrap(this).getFunctionName()

  public open fun functionName(`value`: String) {
    unwrap(this).setFunctionName(`value`)
  }

  public open fun functionUrlConfig(): Any? = unwrap(this).getFunctionUrlConfig()

  public open fun functionUrlConfig(`value`: IResolvable) {
    unwrap(this).setFunctionUrlConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun functionUrlConfig(`value`: FunctionUrlConfigProperty) {
    unwrap(this).setFunctionUrlConfig(`value`.let(FunctionUrlConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8877167acf34796909a0c3f74d0400cadb61462ff93e4dc0d980e3a22f2b10d")
  public open fun functionUrlConfig(`value`: FunctionUrlConfigProperty.Builder.() -> Unit): Unit =
      functionUrlConfig(FunctionUrlConfigProperty(`value`))

  public open fun handler(): String? = unwrap(this).getHandler()

  public open fun handler(`value`: String) {
    unwrap(this).setHandler(`value`)
  }

  public open fun imageConfig(): Any? = unwrap(this).getImageConfig()

  public open fun imageConfig(`value`: IResolvable) {
    unwrap(this).setImageConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun imageConfig(`value`: ImageConfigProperty) {
    unwrap(this).setImageConfig(`value`.let(ImageConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("715ab2f07be6af322afae70e32fc6a6b0591b0afa604039144a9fad0453fa317")
  public open fun imageConfig(`value`: ImageConfigProperty.Builder.() -> Unit): Unit =
      imageConfig(ImageConfigProperty(`value`))

  public open fun imageUri(): String? = unwrap(this).getImageUri()

  public open fun imageUri(`value`: String) {
    unwrap(this).setImageUri(`value`)
  }

  public open fun inlineCode(): String? = unwrap(this).getInlineCode()

  public open fun inlineCode(`value`: String) {
    unwrap(this).setInlineCode(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  public open fun layers(): List<String> = unwrap(this).getLayers() ?: emptyList()

  public open fun layers(`value`: List<String>) {
    unwrap(this).setLayers(`value`)
  }

  public open fun memorySize(): Number? = unwrap(this).getMemorySize()

  public open fun memorySize(`value`: Number) {
    unwrap(this).setMemorySize(`value`)
  }

  public open fun packageType(): String? = unwrap(this).getPackageType()

  public open fun packageType(`value`: String) {
    unwrap(this).setPackageType(`value`)
  }

  public open fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

  public open fun permissionsBoundary(`value`: String) {
    unwrap(this).setPermissionsBoundary(`value`)
  }

  public open fun policies(): Any? = unwrap(this).getPolicies()

  public open fun policies(`value`: String) {
    unwrap(this).setPolicies(`value`)
  }

  public open fun policies(`value`: IResolvable) {
    unwrap(this).setPolicies(`value`.let(IResolvable::unwrap))
  }

  public open fun policies(`value`: IAMPolicyDocumentProperty) {
    unwrap(this).setPolicies(`value`.let(IAMPolicyDocumentProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7384f0fdee3126b9bb6d9844b4782614cc04a9e5538100547085b826a3b25d90")
  public open fun policies(`value`: IAMPolicyDocumentProperty.Builder.() -> Unit): Unit =
      policies(IAMPolicyDocumentProperty(`value`))

  public open fun policies(__idx_ac66f0: List<Any>) {
    unwrap(this).setPolicies(__idx_ac66f0)
  }

  public open fun provisionedConcurrencyConfig(): Any? =
      unwrap(this).getProvisionedConcurrencyConfig()

  public open fun provisionedConcurrencyConfig(`value`: IResolvable) {
    unwrap(this).setProvisionedConcurrencyConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun provisionedConcurrencyConfig(`value`: ProvisionedConcurrencyConfigProperty) {
    unwrap(this).setProvisionedConcurrencyConfig(`value`.let(ProvisionedConcurrencyConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d8a3e662e6f38c49718ce0185ec66035f2582e492736f4df761c48afbe7037f3")
  public open
      fun provisionedConcurrencyConfig(`value`: ProvisionedConcurrencyConfigProperty.Builder.() -> Unit):
      Unit = provisionedConcurrencyConfig(ProvisionedConcurrencyConfigProperty(`value`))

  public open fun reservedConcurrentExecutions(): Number? =
      unwrap(this).getReservedConcurrentExecutions()

  public open fun reservedConcurrentExecutions(`value`: Number) {
    unwrap(this).setReservedConcurrentExecutions(`value`)
  }

  public open fun role(): String? = unwrap(this).getRole()

  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  public open fun runtime(): String? = unwrap(this).getRuntime()

  public open fun runtime(`value`: String) {
    unwrap(this).setRuntime(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun timeout(): Number? = unwrap(this).getTimeout()

  public open fun timeout(`value`: Number) {
    unwrap(this).setTimeout(`value`)
  }

  public open fun tracing(): String? = unwrap(this).getTracing()

  public open fun tracing(`value`: String) {
    unwrap(this).setTracing(`value`)
  }

  public open fun versionDescription(): String? = unwrap(this).getVersionDescription()

  public open fun versionDescription(`value`: String) {
    unwrap(this).setVersionDescription(`value`)
  }

  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b100794bd221908a25f839dbd0e4383741fb0ccc87f5a05364f50b3e477f52f4")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  public interface Builder {
    public fun architectures(architectures: List<String>) {
    }

    public fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any) {
    }

    public fun autoPublishAlias(autoPublishAlias: String) {
    }

    public fun autoPublishCodeSha256(autoPublishCodeSha256: String) {
    }

    public fun codeSigningConfigArn(codeSigningConfigArn: String) {
    }

    public fun codeUri(codeUri: String) {
    }

    public fun codeUri(codeUri: IResolvable) {
    }

    public fun codeUri(codeUri: S3LocationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4871239b60311b46074f506627f0ac7733fbe2168d2d7063fd8558b02724347f")
    public fun codeUri(codeUri: S3LocationProperty.Builder.() -> Unit) {
    }

    public fun deadLetterQueue(deadLetterQueue: IResolvable) {
    }

    public fun deadLetterQueue(deadLetterQueue: DeadLetterQueueProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a22499d0d5d300fe602ce133ac5a91aa241c16c9393e4a226f9d9ba2e4179a3")
    public fun deadLetterQueue(deadLetterQueue: DeadLetterQueueProperty.Builder.() -> Unit) {
    }

    public fun deploymentPreference(deploymentPreference: IResolvable) {
    }

    public fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46d0d192264a9c529481aa082ec6a85dca8a2248318ea57e00256ff2a42c9c5d")
    public
        fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun environment(environment: IResolvable) {
    }

    public fun environment(environment: FunctionEnvironmentProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2303472727077542dfb82404d318ee81127aa74ec08e765b55d1e53fde3aa4d9")
    public fun environment(environment: FunctionEnvironmentProperty.Builder.() -> Unit) {
    }

    public fun ephemeralStorage(ephemeralStorage: IResolvable) {
    }

    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d867867365018acc988f24271bbaa19b578a32c1d73cc95e8e30f6ed14e2d5a")
    public fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit) {
    }

    public fun eventInvokeConfig(eventInvokeConfig: IResolvable) {
    }

    public fun eventInvokeConfig(eventInvokeConfig: EventInvokeConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3821cfcfd762505325ced6e903526368e05159f2232d3d4f76cef82b5c71687e")
    public fun eventInvokeConfig(eventInvokeConfig: EventInvokeConfigProperty.Builder.() -> Unit) {
    }

    public fun events(events: IResolvable) {
    }

    public fun events(events: Map<String, Any>) {
    }

    public fun fileSystemConfigs(fileSystemConfigs: IResolvable) {
    }

    public fun fileSystemConfigs(fileSystemConfigs: List<Any>) {
    }

    public fun functionName(functionName: String) {
    }

    public fun functionUrlConfig(functionUrlConfig: IResolvable) {
    }

    public fun functionUrlConfig(functionUrlConfig: FunctionUrlConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84eb96603668413b2ee852af53152e3e21d22bd84c425e7922b7a5a10bba1fe8")
    public fun functionUrlConfig(functionUrlConfig: FunctionUrlConfigProperty.Builder.() -> Unit) {
    }

    public fun handler(handler: String) {
    }

    public fun imageConfig(imageConfig: IResolvable) {
    }

    public fun imageConfig(imageConfig: ImageConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a956703e7a6a8c061d23987cc189d76597162df71eaa5d28e273a600a26ccd4")
    public fun imageConfig(imageConfig: ImageConfigProperty.Builder.() -> Unit) {
    }

    public fun imageUri(imageUri: String) {
    }

    public fun inlineCode(inlineCode: String) {
    }

    public fun kmsKeyArn(kmsKeyArn: String) {
    }

    public fun layers(layers: List<String>) {
    }

    public fun memorySize(memorySize: Number) {
    }

    public fun packageType(packageType: String) {
    }

    public fun permissionsBoundary(permissionsBoundary: String) {
    }

    public fun policies(policies: String) {
    }

    public fun policies(policies: IResolvable) {
    }

    public fun policies(policies: IAMPolicyDocumentProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3c25e87554f5348a424767353218f56f8a5a5f39790b1b8db3d6785fb2822ae")
    public fun policies(policies: IAMPolicyDocumentProperty.Builder.() -> Unit) {
    }

    public fun policies(policies: List<Any>) {
    }

    public fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
    }

    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2eedfbfb9f63db904e70149a8c7fd30ac7e186193749c033e78fd91377cebb00")
    public
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigProperty.Builder.() -> Unit) {
    }

    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
    }

    public fun role(role: String) {
    }

    public fun runtime(runtime: String) {
    }

    public fun tags(tags: Map<String, String>) {
    }

    public fun timeout(timeout: Number) {
    }

    public fun tracing(tracing: String) {
    }

    public fun versionDescription(versionDescription: String) {
    }

    public fun vpcConfig(vpcConfig: IResolvable) {
    }

    public fun vpcConfig(vpcConfig: VpcConfigProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cae21c65a58a9ee7ff7c9656e045e22b4e7c871d606049fc3cc9ba222097da8")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnFunction.Builder =
        software.amazon.awscdk.services.sam.CfnFunction.Builder.create(scope, id)

    public override fun architectures(architectures: List<String>) {
      cdkBuilder.architectures(architectures)
    }

    public override fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any) {
      cdkBuilder.assumeRolePolicyDocument(assumeRolePolicyDocument)
    }

    public override fun autoPublishAlias(autoPublishAlias: String) {
      cdkBuilder.autoPublishAlias(autoPublishAlias)
    }

    public override fun autoPublishCodeSha256(autoPublishCodeSha256: String) {
      cdkBuilder.autoPublishCodeSha256(autoPublishCodeSha256)
    }

    public override fun codeSigningConfigArn(codeSigningConfigArn: String) {
      cdkBuilder.codeSigningConfigArn(codeSigningConfigArn)
    }

    public override fun codeUri(codeUri: String) {
      cdkBuilder.codeUri(codeUri)
    }

    public override fun codeUri(codeUri: IResolvable) {
      cdkBuilder.codeUri(codeUri.let(IResolvable::unwrap))
    }

    public override fun codeUri(codeUri: S3LocationProperty) {
      cdkBuilder.codeUri(codeUri.let(S3LocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4871239b60311b46074f506627f0ac7733fbe2168d2d7063fd8558b02724347f")
    public override fun codeUri(codeUri: S3LocationProperty.Builder.() -> Unit): Unit =
        codeUri(S3LocationProperty(codeUri))

    public override fun deadLetterQueue(deadLetterQueue: IResolvable) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IResolvable::unwrap))
    }

    public override fun deadLetterQueue(deadLetterQueue: DeadLetterQueueProperty) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(DeadLetterQueueProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a22499d0d5d300fe602ce133ac5a91aa241c16c9393e4a226f9d9ba2e4179a3")
    public override
        fun deadLetterQueue(deadLetterQueue: DeadLetterQueueProperty.Builder.() -> Unit): Unit =
        deadLetterQueue(DeadLetterQueueProperty(deadLetterQueue))

    public override fun deploymentPreference(deploymentPreference: IResolvable) {
      cdkBuilder.deploymentPreference(deploymentPreference.let(IResolvable::unwrap))
    }

    public override fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty) {
      cdkBuilder.deploymentPreference(deploymentPreference.let(DeploymentPreferenceProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46d0d192264a9c529481aa082ec6a85dca8a2248318ea57e00256ff2a42c9c5d")
    public override
        fun deploymentPreference(deploymentPreference: DeploymentPreferenceProperty.Builder.() -> Unit):
        Unit = deploymentPreference(DeploymentPreferenceProperty(deploymentPreference))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun environment(environment: IResolvable) {
      cdkBuilder.environment(environment.let(IResolvable::unwrap))
    }

    public override fun environment(environment: FunctionEnvironmentProperty) {
      cdkBuilder.environment(environment.let(FunctionEnvironmentProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2303472727077542dfb82404d318ee81127aa74ec08e765b55d1e53fde3aa4d9")
    public override fun environment(environment: FunctionEnvironmentProperty.Builder.() -> Unit):
        Unit = environment(FunctionEnvironmentProperty(environment))

    public override fun ephemeralStorage(ephemeralStorage: IResolvable) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
    }

    public override fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(EphemeralStorageProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5d867867365018acc988f24271bbaa19b578a32c1d73cc95e8e30f6ed14e2d5a")
    public override
        fun ephemeralStorage(ephemeralStorage: EphemeralStorageProperty.Builder.() -> Unit): Unit =
        ephemeralStorage(EphemeralStorageProperty(ephemeralStorage))

    public override fun eventInvokeConfig(eventInvokeConfig: IResolvable) {
      cdkBuilder.eventInvokeConfig(eventInvokeConfig.let(IResolvable::unwrap))
    }

    public override fun eventInvokeConfig(eventInvokeConfig: EventInvokeConfigProperty) {
      cdkBuilder.eventInvokeConfig(eventInvokeConfig.let(EventInvokeConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3821cfcfd762505325ced6e903526368e05159f2232d3d4f76cef82b5c71687e")
    public override
        fun eventInvokeConfig(eventInvokeConfig: EventInvokeConfigProperty.Builder.() -> Unit): Unit
        = eventInvokeConfig(EventInvokeConfigProperty(eventInvokeConfig))

    public override fun events(events: IResolvable) {
      cdkBuilder.events(events.let(IResolvable::unwrap))
    }

    public override fun events(events: Map<String, Any>) {
      cdkBuilder.events(events)
    }

    public override fun fileSystemConfigs(fileSystemConfigs: IResolvable) {
      cdkBuilder.fileSystemConfigs(fileSystemConfigs.let(IResolvable::unwrap))
    }

    public override fun fileSystemConfigs(fileSystemConfigs: List<Any>) {
      cdkBuilder.fileSystemConfigs(fileSystemConfigs)
    }

    public override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    public override fun functionUrlConfig(functionUrlConfig: IResolvable) {
      cdkBuilder.functionUrlConfig(functionUrlConfig.let(IResolvable::unwrap))
    }

    public override fun functionUrlConfig(functionUrlConfig: FunctionUrlConfigProperty) {
      cdkBuilder.functionUrlConfig(functionUrlConfig.let(FunctionUrlConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("84eb96603668413b2ee852af53152e3e21d22bd84c425e7922b7a5a10bba1fe8")
    public override
        fun functionUrlConfig(functionUrlConfig: FunctionUrlConfigProperty.Builder.() -> Unit): Unit
        = functionUrlConfig(FunctionUrlConfigProperty(functionUrlConfig))

    public override fun handler(handler: String) {
      cdkBuilder.handler(handler)
    }

    public override fun imageConfig(imageConfig: IResolvable) {
      cdkBuilder.imageConfig(imageConfig.let(IResolvable::unwrap))
    }

    public override fun imageConfig(imageConfig: ImageConfigProperty) {
      cdkBuilder.imageConfig(imageConfig.let(ImageConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a956703e7a6a8c061d23987cc189d76597162df71eaa5d28e273a600a26ccd4")
    public override fun imageConfig(imageConfig: ImageConfigProperty.Builder.() -> Unit): Unit =
        imageConfig(ImageConfigProperty(imageConfig))

    public override fun imageUri(imageUri: String) {
      cdkBuilder.imageUri(imageUri)
    }

    public override fun inlineCode(inlineCode: String) {
      cdkBuilder.inlineCode(inlineCode)
    }

    public override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public override fun layers(layers: List<String>) {
      cdkBuilder.layers(layers)
    }

    public override fun memorySize(memorySize: Number) {
      cdkBuilder.memorySize(memorySize)
    }

    public override fun packageType(packageType: String) {
      cdkBuilder.packageType(packageType)
    }

    public override fun permissionsBoundary(permissionsBoundary: String) {
      cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    public override fun policies(policies: String) {
      cdkBuilder.policies(policies)
    }

    public override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    public override fun policies(policies: IAMPolicyDocumentProperty) {
      cdkBuilder.policies(policies.let(IAMPolicyDocumentProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e3c25e87554f5348a424767353218f56f8a5a5f39790b1b8db3d6785fb2822ae")
    public override fun policies(policies: IAMPolicyDocumentProperty.Builder.() -> Unit): Unit =
        policies(IAMPolicyDocumentProperty(policies))

    public override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    public override fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: IResolvable) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(IResolvable::unwrap))
    }

    public override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigProperty) {
      cdkBuilder.provisionedConcurrencyConfig(provisionedConcurrencyConfig.let(ProvisionedConcurrencyConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2eedfbfb9f63db904e70149a8c7fd30ac7e186193749c033e78fd91377cebb00")
    public override
        fun provisionedConcurrencyConfig(provisionedConcurrencyConfig: ProvisionedConcurrencyConfigProperty.Builder.() -> Unit):
        Unit =
        provisionedConcurrencyConfig(ProvisionedConcurrencyConfigProperty(provisionedConcurrencyConfig))

    public override fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
      cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    public override fun role(role: String) {
      cdkBuilder.role(role)
    }

    public override fun runtime(runtime: String) {
      cdkBuilder.runtime(runtime)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    public override fun tracing(tracing: String) {
      cdkBuilder.tracing(tracing)
    }

    public override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    public override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    public override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cae21c65a58a9ee7ff7c9656e045e22b4e7c871d606049fc3cc9ba222097da8")
    public override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.sam.CfnFunction = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFunction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFunction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction): CfnFunction =
        CfnFunction(cdkObject)

    internal fun unwrap(wrapped: CfnFunction): software.amazon.awscdk.services.sam.CfnFunction =
        wrapped.cdkObject
  }

  public interface S3KeyFilterProperty {
    public fun rules(): Any

    public interface Builder {
      public fun rules(rules: IResolvable) {
      }

      public fun rules(rules: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty.builder()

      public override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      public override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty,
    ) : S3KeyFilterProperty {
      public override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3KeyFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty):
          S3KeyFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3KeyFilterProperty):
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AlexaSkillEventProperty {
    public fun skillId(): String

    public interface Builder {
      public fun skillId(skillId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty.builder()

      public override fun skillId(skillId: String) {
        cdkBuilder.skillId(skillId)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty,
    ) : AlexaSkillEventProperty {
      public override fun skillId(): String = unwrap(this).getSkillId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AlexaSkillEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty):
          AlexaSkillEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AlexaSkillEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.AlexaSkillEventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RouteSettingsProperty {
    public fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

    public fun detailedMetricsEnabled(): Any? = unwrap(this).getDetailedMetricsEnabled()

    public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    public fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    public fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

    public interface Builder {
      public fun dataTraceEnabled(dataTraceEnabled: Boolean) {
      }

      public fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
      }

      public fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean) {
      }

      public fun detailedMetricsEnabled(detailedMetricsEnabled: IResolvable) {
      }

      public fun loggingLevel(loggingLevel: String) {
      }

      public fun throttlingBurstLimit(throttlingBurstLimit: Number) {
      }

      public fun throttlingRateLimit(throttlingRateLimit: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.RouteSettingsProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.RouteSettingsProperty.builder()

      public override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled)
      }

      public override fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled.let(IResolvable::unwrap))
      }

      public override fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean) {
        cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled)
      }

      public override fun detailedMetricsEnabled(detailedMetricsEnabled: IResolvable) {
        cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled.let(IResolvable::unwrap))
      }

      public override fun loggingLevel(loggingLevel: String) {
        cdkBuilder.loggingLevel(loggingLevel)
      }

      public override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
        cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
      }

      public override fun throttlingRateLimit(throttlingRateLimit: Number) {
        cdkBuilder.throttlingRateLimit(throttlingRateLimit)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.RouteSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.RouteSettingsProperty,
    ) : RouteSettingsProperty {
      public override fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

      public override fun detailedMetricsEnabled(): Any? = unwrap(this).getDetailedMetricsEnabled()

      public override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

      public override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

      public override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RouteSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.RouteSettingsProperty):
          RouteSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RouteSettingsProperty):
          software.amazon.awscdk.services.sam.CfnFunction.RouteSettingsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VpcConfigProperty {
    public fun securityGroupIds(): List<String>

    public fun subnetIds(): List<String>

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>) {
      }

      public fun subnetIds(subnetIds: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty.builder()

      public override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      public override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty,
    ) : VpcConfigProperty {
      public override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      public override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.VpcConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FunctionSAMPTProperty {
    public fun functionName(): String

    public interface Builder {
      public fun functionName(functionName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty.builder()

      public override fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty,
    ) : FunctionSAMPTProperty {
      public override fun functionName(): String = unwrap(this).getFunctionName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty):
          FunctionSAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DeploymentPreferenceProperty {
    public fun alarms(): List<String> = unwrap(this).getAlarms() ?: emptyList()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun hooks(): Any? = unwrap(this).getHooks()

    public fun role(): String? = unwrap(this).getRole()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun alarms(alarms: List<String>) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun hooks(hooks: IResolvable) {
      }

      public fun hooks(hooks: HooksProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fc0537ee41f9f3a667818f4fc6b33c1a2b84bd73a3fd37afe20f77762896adf")
      public fun hooks(hooks: HooksProperty.Builder.() -> Unit) {
      }

      public fun role(role: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty.builder()

      public override fun alarms(alarms: List<String>) {
        cdkBuilder.alarms(alarms)
      }

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun hooks(hooks: IResolvable) {
        cdkBuilder.hooks(hooks.let(IResolvable::unwrap))
      }

      public override fun hooks(hooks: HooksProperty) {
        cdkBuilder.hooks(hooks.let(HooksProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3fc0537ee41f9f3a667818f4fc6b33c1a2b84bd73a3fd37afe20f77762896adf")
      public override fun hooks(hooks: HooksProperty.Builder.() -> Unit): Unit =
          hooks(HooksProperty(hooks))

      public override fun role(role: String) {
        cdkBuilder.role(role)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty,
    ) : DeploymentPreferenceProperty {
      public override fun alarms(): List<String> = unwrap(this).getAlarms() ?: emptyList()

      public override fun enabled(): Any? = unwrap(this).getEnabled()

      public override fun hooks(): Any? = unwrap(this).getHooks()

      public override fun role(): String? = unwrap(this).getRole()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentPreferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty):
          DeploymentPreferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeploymentPreferenceProperty):
          software.amazon.awscdk.services.sam.CfnFunction.DeploymentPreferenceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface QueueSAMPTProperty {
    public fun queueName(): String

    public interface Builder {
      public fun queueName(queueName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty.builder()

      public override fun queueName(queueName: String) {
        cdkBuilder.queueName(queueName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty,
    ) : QueueSAMPTProperty {
      public override fun queueName(): String = unwrap(this).getQueueName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): QueueSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty):
          QueueSAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueueSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IdentitySAMPTProperty {
    public fun identityName(): String

    public interface Builder {
      public fun identityName(identityName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty.builder()

      public override fun identityName(identityName: String) {
        cdkBuilder.identityName(identityName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty,
    ) : IdentitySAMPTProperty {
      public override fun identityName(): String = unwrap(this).getIdentityName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IdentitySAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty):
          IdentitySAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdentitySAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DomainSAMPTProperty {
    public fun domainName(): String

    public interface Builder {
      public fun domainName(domainName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty.builder()

      public override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty,
    ) : DomainSAMPTProperty {
      public override fun domainName(): String = unwrap(this).getDomainName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DomainSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty):
          DomainSAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IAMPolicyDocumentProperty {
    public fun statement(): Any

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun statement(statement: Any) {
      }

      public fun version(version: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.IAMPolicyDocumentProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.IAMPolicyDocumentProperty.builder()

      public override fun statement(statement: Any) {
        cdkBuilder.statement(statement)
      }

      public override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.IAMPolicyDocumentProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.IAMPolicyDocumentProperty,
    ) : IAMPolicyDocumentProperty {
      public override fun statement(): Any = unwrap(this).getStatement()

      public override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IAMPolicyDocumentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.IAMPolicyDocumentProperty):
          IAMPolicyDocumentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IAMPolicyDocumentProperty):
          software.amazon.awscdk.services.sam.CfnFunction.IAMPolicyDocumentProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3NotificationFilterProperty {
    public fun s3Key(): Any

    public interface Builder {
      public fun s3Key(s3Key: IResolvable) {
      }

      public fun s3Key(s3Key: S3KeyFilterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83604b89d8c3db43eebe5c4bdaca486d63b7df57626bba66afb71001f4505f66")
      public fun s3Key(s3Key: S3KeyFilterProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty.builder()

      public override fun s3Key(s3Key: IResolvable) {
        cdkBuilder.s3Key(s3Key.let(IResolvable::unwrap))
      }

      public override fun s3Key(s3Key: S3KeyFilterProperty) {
        cdkBuilder.s3Key(s3Key.let(S3KeyFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("83604b89d8c3db43eebe5c4bdaca486d63b7df57626bba66afb71001f4505f66")
      public override fun s3Key(s3Key: S3KeyFilterProperty.Builder.() -> Unit): Unit =
          s3Key(S3KeyFilterProperty(s3Key))

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty,
    ) : S3NotificationFilterProperty {
      public override fun s3Key(): Any = unwrap(this).getS3Key()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3NotificationFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty):
          S3NotificationFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3NotificationFilterProperty):
          software.amazon.awscdk.services.sam.CfnFunction.S3NotificationFilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LogGroupSAMPTProperty {
    public fun logGroupName(): String

    public interface Builder {
      public fun logGroupName(logGroupName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty.builder()

      public override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty,
    ) : LogGroupSAMPTProperty {
      public override fun logGroupName(): String = unwrap(this).getLogGroupName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogGroupSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty):
          LogGroupSAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogGroupSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DeadLetterQueueProperty {
    public fun targetArn(): String

    public fun type(): String

    public interface Builder {
      public fun targetArn(targetArn: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty.builder()

      public override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty,
    ) : DeadLetterQueueProperty {
      public override fun targetArn(): String = unwrap(this).getTargetArn()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeadLetterQueueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty):
          DeadLetterQueueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeadLetterQueueProperty):
          software.amazon.awscdk.services.sam.CfnFunction.DeadLetterQueueProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CorsConfigurationProperty {
    public fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

    public fun allowHeaders(): String? = unwrap(this).getAllowHeaders()

    public fun allowMethods(): String? = unwrap(this).getAllowMethods()

    public fun allowOrigin(): String

    public fun maxAge(): String? = unwrap(this).getMaxAge()

    public interface Builder {
      public fun allowCredentials(allowCredentials: Boolean) {
      }

      public fun allowCredentials(allowCredentials: IResolvable) {
      }

      public fun allowHeaders(allowHeaders: String) {
      }

      public fun allowMethods(allowMethods: String) {
      }

      public fun allowOrigin(allowOrigin: String) {
      }

      public fun maxAge(maxAge: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.CorsConfigurationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.CorsConfigurationProperty.builder()

      public override fun allowCredentials(allowCredentials: Boolean) {
        cdkBuilder.allowCredentials(allowCredentials)
      }

      public override fun allowCredentials(allowCredentials: IResolvable) {
        cdkBuilder.allowCredentials(allowCredentials.let(IResolvable::unwrap))
      }

      public override fun allowHeaders(allowHeaders: String) {
        cdkBuilder.allowHeaders(allowHeaders)
      }

      public override fun allowMethods(allowMethods: String) {
        cdkBuilder.allowMethods(allowMethods)
      }

      public override fun allowOrigin(allowOrigin: String) {
        cdkBuilder.allowOrigin(allowOrigin)
      }

      public override fun maxAge(maxAge: String) {
        cdkBuilder.maxAge(maxAge)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.CorsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.CorsConfigurationProperty,
    ) : CorsConfigurationProperty {
      public override fun allowCredentials(): Any? = unwrap(this).getAllowCredentials()

      public override fun allowHeaders(): String? = unwrap(this).getAllowHeaders()

      public override fun allowMethods(): String? = unwrap(this).getAllowMethods()

      public override fun allowOrigin(): String = unwrap(this).getAllowOrigin()

      public override fun maxAge(): String? = unwrap(this).getMaxAge()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CorsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.CorsConfigurationProperty):
          CorsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CorsConfigurationProperty):
          software.amazon.awscdk.services.sam.CfnFunction.CorsConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DestinationConfigProperty {
    public fun onFailure(): Any

    public interface Builder {
      public fun onFailure(onFailure: IResolvable) {
      }

      public fun onFailure(onFailure: DestinationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e3e496c57c72b0b152178f134f6b93c1761e61cdb20b9785675b0699fdaf5db")
      public fun onFailure(onFailure: DestinationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty.builder()

      public override fun onFailure(onFailure: IResolvable) {
        cdkBuilder.onFailure(onFailure.let(IResolvable::unwrap))
      }

      public override fun onFailure(onFailure: DestinationProperty) {
        cdkBuilder.onFailure(onFailure.let(DestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e3e496c57c72b0b152178f134f6b93c1761e61cdb20b9785675b0699fdaf5db")
      public override fun onFailure(onFailure: DestinationProperty.Builder.() -> Unit): Unit =
          onFailure(DestinationProperty(onFailure))

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty,
    ) : DestinationConfigProperty {
      public override fun onFailure(): Any = unwrap(this).getOnFailure()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty):
          DestinationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.DestinationConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CloudWatchLogsEventProperty {
    public fun filterPattern(): String

    public fun logGroupName(): String

    public interface Builder {
      public fun filterPattern(filterPattern: String) {
      }

      public fun logGroupName(logGroupName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty.builder()

      public override fun filterPattern(filterPattern: String) {
        cdkBuilder.filterPattern(filterPattern)
      }

      public override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty,
    ) : CloudWatchLogsEventProperty {
      public override fun filterPattern(): String = unwrap(this).getFilterPattern()

      public override fun logGroupName(): String = unwrap(this).getLogGroupName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchLogsEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty):
          CloudWatchLogsEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchLogsEventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ProvisionedConcurrencyConfigProperty {
    public fun provisionedConcurrentExecutions(): String

    public interface Builder {
      public fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty.Builder
          =
          software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty.builder()

      public override fun provisionedConcurrentExecutions(provisionedConcurrentExecutions: String) {
        cdkBuilder.provisionedConcurrentExecutions(provisionedConcurrentExecutions)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty,
    ) : ProvisionedConcurrencyConfigProperty {
      public override fun provisionedConcurrentExecutions(): String =
          unwrap(this).getProvisionedConcurrentExecutions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProvisionedConcurrencyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty):
          ProvisionedConcurrencyConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedConcurrencyConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.ProvisionedConcurrencyConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EventSourceProperty {
    public fun properties(): Any

    public fun type(): String

    public interface Builder {
      public fun properties(properties: IResolvable) {
      }

      public fun properties(properties: AlexaSkillEventProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e4341459b5285be4edc292fdf5e0a9835d2bbbde1d4e6cb6c2e2c58b1da79e8")
      public fun properties(properties: AlexaSkillEventProperty.Builder.() -> Unit) {
      }

      public fun properties(properties: ApiEventProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c85197a7edf593969c1761053510c4190a15f2263ef87e60f5b7e3abe34b6e79")
      public fun properties(properties: ApiEventProperty.Builder.() -> Unit) {
      }

      public fun properties(properties: CloudWatchEventEventProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78914787b575883a35149d4bc48479c888ac685bc7372819586ca69f5f65ef1c")
      public fun properties(properties: CloudWatchEventEventProperty.Builder.() -> Unit) {
      }

      public fun properties(properties: CloudWatchLogsEventProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a460abbc4b08de60a9fc8f775db50083dd38c0577e5b4dc0e4eee4997d5af7a1")
      public fun properties(properties: CloudWatchLogsEventProperty.Builder.() -> Unit) {
      }

      public fun properties(properties: CognitoEventProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d399853612ecfb2d22734b5c2ee3da39994f600a74b3cd34841ff2c72560bb9")
      public fun properties(properties: CognitoEventProperty.Builder.() -> Unit) {
      }

      public fun properties(properties: DynamoDBEventProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea2544eb37312570c071a182ec455d362eb5ee60e3e0fcf8a974a8ccd0e4fc96")
      public fun properties(properties: DynamoDBEventProperty.Builder.() -> Unit) {
      }

      public fun properties(properties: EventBridgeRuleEventProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd2be02483c2feb079e3dec9d5ef9ab12ec0b60f1eda4a2d19cbc34ebf0f9fd4")
      public fun properties(properties: EventBridgeRuleEventProperty.Builder.() -> Unit) {
      }

      public fun properties(properties: HttpApiEventProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("227b555231f7875a6a5338b4730418eeaaa47ca6f8a6ab86bbd8d9e1cff39f96")
      public fun properties(properties: HttpApiEventProperty.Builder.() -> Unit) {
      }

      public fun properties(properties: IoTRuleEventProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf0b11a26432d20648e1f20fa3d3904e695d11b89cfdf608211253a4b9e22e7f")
      public fun properties(properties: IoTRuleEventProperty.Builder.() -> Unit) {
      }

      public fun properties(properties: KinesisEventProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("875e9cf818eb6593851d6c00e003c6ecfccb1567c7c0af0ae03b664a7c1d2d87")
      public fun properties(properties: KinesisEventProperty.Builder.() -> Unit) {
      }

      public fun properties(properties: S3EventProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebb29ec4b27921024830e47d56c34a44fab5136dc71469b6ed5dff61c308172c")
      public fun properties(properties: S3EventProperty.Builder.() -> Unit) {
      }

      public fun properties(properties: ScheduleEventProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebc79f595a2d2da930c7895e7658457142118a75ea069df1b70d72bf63005a72")
      public fun properties(properties: ScheduleEventProperty.Builder.() -> Unit) {
      }

      public fun properties(properties: SNSEventProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c6289b442457421ec8d22b57ab38e25d36634a6ca1e53946463b9add9c5b7620")
      public fun properties(properties: SNSEventProperty.Builder.() -> Unit) {
      }

      public fun properties(properties: SQSEventProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccc89d1369e3cc95f6a011c7f055135827c4fd3fdf5b6fe0f99160270fd831bc")
      public fun properties(properties: SQSEventProperty.Builder.() -> Unit) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty.builder()

      public override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable::unwrap))
      }

      public override fun properties(properties: AlexaSkillEventProperty) {
        cdkBuilder.properties(properties.let(AlexaSkillEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e4341459b5285be4edc292fdf5e0a9835d2bbbde1d4e6cb6c2e2c58b1da79e8")
      public override fun properties(properties: AlexaSkillEventProperty.Builder.() -> Unit): Unit =
          properties(AlexaSkillEventProperty(properties))

      public override fun properties(properties: ApiEventProperty) {
        cdkBuilder.properties(properties.let(ApiEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c85197a7edf593969c1761053510c4190a15f2263ef87e60f5b7e3abe34b6e79")
      public override fun properties(properties: ApiEventProperty.Builder.() -> Unit): Unit =
          properties(ApiEventProperty(properties))

      public override fun properties(properties: CloudWatchEventEventProperty) {
        cdkBuilder.properties(properties.let(CloudWatchEventEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("78914787b575883a35149d4bc48479c888ac685bc7372819586ca69f5f65ef1c")
      public override fun properties(properties: CloudWatchEventEventProperty.Builder.() -> Unit):
          Unit = properties(CloudWatchEventEventProperty(properties))

      public override fun properties(properties: CloudWatchLogsEventProperty) {
        cdkBuilder.properties(properties.let(CloudWatchLogsEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a460abbc4b08de60a9fc8f775db50083dd38c0577e5b4dc0e4eee4997d5af7a1")
      public override fun properties(properties: CloudWatchLogsEventProperty.Builder.() -> Unit):
          Unit = properties(CloudWatchLogsEventProperty(properties))

      public override fun properties(properties: CognitoEventProperty) {
        cdkBuilder.properties(properties.let(CognitoEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0d399853612ecfb2d22734b5c2ee3da39994f600a74b3cd34841ff2c72560bb9")
      public override fun properties(properties: CognitoEventProperty.Builder.() -> Unit): Unit =
          properties(CognitoEventProperty(properties))

      public override fun properties(properties: DynamoDBEventProperty) {
        cdkBuilder.properties(properties.let(DynamoDBEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ea2544eb37312570c071a182ec455d362eb5ee60e3e0fcf8a974a8ccd0e4fc96")
      public override fun properties(properties: DynamoDBEventProperty.Builder.() -> Unit): Unit =
          properties(DynamoDBEventProperty(properties))

      public override fun properties(properties: EventBridgeRuleEventProperty) {
        cdkBuilder.properties(properties.let(EventBridgeRuleEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd2be02483c2feb079e3dec9d5ef9ab12ec0b60f1eda4a2d19cbc34ebf0f9fd4")
      public override fun properties(properties: EventBridgeRuleEventProperty.Builder.() -> Unit):
          Unit = properties(EventBridgeRuleEventProperty(properties))

      public override fun properties(properties: HttpApiEventProperty) {
        cdkBuilder.properties(properties.let(HttpApiEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("227b555231f7875a6a5338b4730418eeaaa47ca6f8a6ab86bbd8d9e1cff39f96")
      public override fun properties(properties: HttpApiEventProperty.Builder.() -> Unit): Unit =
          properties(HttpApiEventProperty(properties))

      public override fun properties(properties: IoTRuleEventProperty) {
        cdkBuilder.properties(properties.let(IoTRuleEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bf0b11a26432d20648e1f20fa3d3904e695d11b89cfdf608211253a4b9e22e7f")
      public override fun properties(properties: IoTRuleEventProperty.Builder.() -> Unit): Unit =
          properties(IoTRuleEventProperty(properties))

      public override fun properties(properties: KinesisEventProperty) {
        cdkBuilder.properties(properties.let(KinesisEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("875e9cf818eb6593851d6c00e003c6ecfccb1567c7c0af0ae03b664a7c1d2d87")
      public override fun properties(properties: KinesisEventProperty.Builder.() -> Unit): Unit =
          properties(KinesisEventProperty(properties))

      public override fun properties(properties: S3EventProperty) {
        cdkBuilder.properties(properties.let(S3EventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebb29ec4b27921024830e47d56c34a44fab5136dc71469b6ed5dff61c308172c")
      public override fun properties(properties: S3EventProperty.Builder.() -> Unit): Unit =
          properties(S3EventProperty(properties))

      public override fun properties(properties: ScheduleEventProperty) {
        cdkBuilder.properties(properties.let(ScheduleEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebc79f595a2d2da930c7895e7658457142118a75ea069df1b70d72bf63005a72")
      public override fun properties(properties: ScheduleEventProperty.Builder.() -> Unit): Unit =
          properties(ScheduleEventProperty(properties))

      public override fun properties(properties: SNSEventProperty) {
        cdkBuilder.properties(properties.let(SNSEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c6289b442457421ec8d22b57ab38e25d36634a6ca1e53946463b9add9c5b7620")
      public override fun properties(properties: SNSEventProperty.Builder.() -> Unit): Unit =
          properties(SNSEventProperty(properties))

      public override fun properties(properties: SQSEventProperty) {
        cdkBuilder.properties(properties.let(SQSEventProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ccc89d1369e3cc95f6a011c7f055135827c4fd3fdf5b6fe0f99160270fd831bc")
      public override fun properties(properties: SQSEventProperty.Builder.() -> Unit): Unit =
          properties(SQSEventProperty(properties))

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty,
    ) : EventSourceProperty {
      public override fun properties(): Any = unwrap(this).getProperties()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty):
          EventSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventSourceProperty):
          software.amazon.awscdk.services.sam.CfnFunction.EventSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EmptySAMPTProperty {
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty.builder()

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty,
    ) : EmptySAMPTProperty

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EmptySAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty):
          EmptySAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EmptySAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SNSEventProperty {
    public fun topic(): String

    public interface Builder {
      public fun topic(topic: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty.builder()

      public override fun topic(topic: String) {
        cdkBuilder.topic(topic)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty,
    ) : SNSEventProperty {
      public override fun topic(): String = unwrap(this).getTopic()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SNSEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty):
          SNSEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SNSEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.SNSEventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ScheduleEventProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun input(): String? = unwrap(this).getInput()

    public fun name(): String? = unwrap(this).getName()

    public fun schedule(): String

    public interface Builder {
      public fun description(description: String) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun input(input: String) {
      }

      public fun name(name: String) {
      }

      public fun schedule(schedule: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty.builder()

      public override fun description(description: String) {
        cdkBuilder.description(description)
      }

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun input(input: String) {
        cdkBuilder.input(input)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty,
    ) : ScheduleEventProperty {
      public override fun description(): String? = unwrap(this).getDescription()

      public override fun enabled(): Any? = unwrap(this).getEnabled()

      public override fun input(): String? = unwrap(this).getInput()

      public override fun name(): String? = unwrap(this).getName()

      public override fun schedule(): String = unwrap(this).getSchedule()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty):
          ScheduleEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.ScheduleEventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CognitoEventProperty {
    public fun trigger(): String

    public fun userPool(): String

    public interface Builder {
      public fun trigger(trigger: String) {
      }

      public fun userPool(userPool: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.CognitoEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.CognitoEventProperty.builder()

      public override fun trigger(trigger: String) {
        cdkBuilder.trigger(trigger)
      }

      public override fun userPool(userPool: String) {
        cdkBuilder.userPool(userPool)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.CognitoEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.CognitoEventProperty,
    ) : CognitoEventProperty {
      public override fun trigger(): String = unwrap(this).getTrigger()

      public override fun userPool(): String = unwrap(this).getUserPool()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CognitoEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.CognitoEventProperty):
          CognitoEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CognitoEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.CognitoEventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface KeySAMPTProperty {
    public fun keyId(): String

    public interface Builder {
      public fun keyId(keyId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty.builder()

      public override fun keyId(keyId: String) {
        cdkBuilder.keyId(keyId)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty,
    ) : KeySAMPTProperty {
      public override fun keyId(): String = unwrap(this).getKeyId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeySAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty):
          KeySAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeySAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StateMachineSAMPTProperty {
    public fun stateMachineName(): String

    public interface Builder {
      public fun stateMachineName(stateMachineName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty.builder()

      public override fun stateMachineName(stateMachineName: String) {
        cdkBuilder.stateMachineName(stateMachineName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty,
    ) : StateMachineSAMPTProperty {
      public override fun stateMachineName(): String = unwrap(this).getStateMachineName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StateMachineSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty):
          StateMachineSAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StateMachineSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ParameterNameSAMPTProperty {
    public fun parameterName(): String

    public interface Builder {
      public fun parameterName(parameterName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.ParameterNameSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.ParameterNameSAMPTProperty.builder()

      public override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.ParameterNameSAMPTProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.ParameterNameSAMPTProperty,
    ) : ParameterNameSAMPTProperty {
      public override fun parameterName(): String = unwrap(this).getParameterName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterNameSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ParameterNameSAMPTProperty):
          ParameterNameSAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterNameSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.ParameterNameSAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HttpApiEventProperty {
    public fun apiId(): String? = unwrap(this).getApiId()

    public fun auth(): Any? = unwrap(this).getAuth()

    public fun method(): String? = unwrap(this).getMethod()

    public fun path(): String? = unwrap(this).getPath()

    public fun payloadFormatVersion(): String? = unwrap(this).getPayloadFormatVersion()

    public fun routeSettings(): Any? = unwrap(this).getRouteSettings()

    public fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()

    public interface Builder {
      public fun apiId(apiId: String) {
      }

      public fun auth(auth: IResolvable) {
      }

      public fun auth(auth: HttpApiFunctionAuthProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7880c1c59451ea9b0cf00daab4573f9bbadaadcde367c1eb49eda06887c992bf")
      public fun auth(auth: HttpApiFunctionAuthProperty.Builder.() -> Unit) {
      }

      public fun method(method: String) {
      }

      public fun path(path: String) {
      }

      public fun payloadFormatVersion(payloadFormatVersion: String) {
      }

      public fun routeSettings(routeSettings: IResolvable) {
      }

      public fun routeSettings(routeSettings: RouteSettingsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c12331917e0d3c3c11aaf58c0847e612ed26fe70577b1af8ec4cb4117f4ea95")
      public fun routeSettings(routeSettings: RouteSettingsProperty.Builder.() -> Unit) {
      }

      public fun timeoutInMillis(timeoutInMillis: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiEventProperty.builder()

      public override fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
      }

      public override fun auth(auth: IResolvable) {
        cdkBuilder.auth(auth.let(IResolvable::unwrap))
      }

      public override fun auth(auth: HttpApiFunctionAuthProperty) {
        cdkBuilder.auth(auth.let(HttpApiFunctionAuthProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7880c1c59451ea9b0cf00daab4573f9bbadaadcde367c1eb49eda06887c992bf")
      public override fun auth(auth: HttpApiFunctionAuthProperty.Builder.() -> Unit): Unit =
          auth(HttpApiFunctionAuthProperty(auth))

      public override fun method(method: String) {
        cdkBuilder.method(method)
      }

      public override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public override fun payloadFormatVersion(payloadFormatVersion: String) {
        cdkBuilder.payloadFormatVersion(payloadFormatVersion)
      }

      public override fun routeSettings(routeSettings: IResolvable) {
        cdkBuilder.routeSettings(routeSettings.let(IResolvable::unwrap))
      }

      public override fun routeSettings(routeSettings: RouteSettingsProperty) {
        cdkBuilder.routeSettings(routeSettings.let(RouteSettingsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c12331917e0d3c3c11aaf58c0847e612ed26fe70577b1af8ec4cb4117f4ea95")
      public override fun routeSettings(routeSettings: RouteSettingsProperty.Builder.() -> Unit):
          Unit = routeSettings(RouteSettingsProperty(routeSettings))

      public override fun timeoutInMillis(timeoutInMillis: Number) {
        cdkBuilder.timeoutInMillis(timeoutInMillis)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.HttpApiEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.HttpApiEventProperty,
    ) : HttpApiEventProperty {
      public override fun apiId(): String? = unwrap(this).getApiId()

      public override fun auth(): Any? = unwrap(this).getAuth()

      public override fun method(): String? = unwrap(this).getMethod()

      public override fun path(): String? = unwrap(this).getPath()

      public override fun payloadFormatVersion(): String? = unwrap(this).getPayloadFormatVersion()

      public override fun routeSettings(): Any? = unwrap(this).getRouteSettings()

      public override fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpApiEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.HttpApiEventProperty):
          HttpApiEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpApiEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiEventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface KinesisEventProperty {
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun functionResponseTypes(): List<String> = unwrap(this).getFunctionResponseTypes() ?:
        emptyList()

    public fun startingPosition(): String

    public fun stream(): String

    public interface Builder {
      public fun batchSize(batchSize: Number) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun functionResponseTypes(functionResponseTypes: List<String>) {
      }

      public fun startingPosition(startingPosition: String) {
      }

      public fun stream(stream: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty.builder()

      public override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun functionResponseTypes(functionResponseTypes: List<String>) {
        cdkBuilder.functionResponseTypes(functionResponseTypes)
      }

      public override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      public override fun stream(stream: String) {
        cdkBuilder.stream(stream)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty,
    ) : KinesisEventProperty {
      public override fun batchSize(): Number? = unwrap(this).getBatchSize()

      public override fun enabled(): Any? = unwrap(this).getEnabled()

      public override fun functionResponseTypes(): List<String> =
          unwrap(this).getFunctionResponseTypes() ?: emptyList()

      public override fun startingPosition(): String = unwrap(this).getStartingPosition()

      public override fun stream(): String = unwrap(this).getStream()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KinesisEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty):
          KinesisEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.KinesisEventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HooksProperty {
    public fun postTraffic(): String? = unwrap(this).getPostTraffic()

    public fun preTraffic(): String? = unwrap(this).getPreTraffic()

    public interface Builder {
      public fun postTraffic(postTraffic: String) {
      }

      public fun preTraffic(preTraffic: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.sam.CfnFunction.HooksProperty.Builder
          = software.amazon.awscdk.services.sam.CfnFunction.HooksProperty.builder()

      public override fun postTraffic(postTraffic: String) {
        cdkBuilder.postTraffic(postTraffic)
      }

      public override fun preTraffic(preTraffic: String) {
        cdkBuilder.preTraffic(preTraffic)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.HooksProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.HooksProperty,
    ) : HooksProperty {
      public override fun postTraffic(): String? = unwrap(this).getPostTraffic()

      public override fun preTraffic(): String? = unwrap(this).getPreTraffic()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HooksProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.HooksProperty):
          HooksProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HooksProperty):
          software.amazon.awscdk.services.sam.CfnFunction.HooksProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SAMPolicyTemplateProperty {
    public fun amiDescribePolicy(): Any? = unwrap(this).getAmiDescribePolicy()

    public fun awsSecretsManagerGetSecretValuePolicy(): Any? =
        unwrap(this).getAwsSecretsManagerGetSecretValuePolicy()

    public fun cloudFormationDescribeStacksPolicy(): Any? =
        unwrap(this).getCloudFormationDescribeStacksPolicy()

    public fun cloudWatchPutMetricPolicy(): Any? = unwrap(this).getCloudWatchPutMetricPolicy()

    public fun dynamoDbCrudPolicy(): Any? = unwrap(this).getDynamoDbCrudPolicy()

    public fun dynamoDbReadPolicy(): Any? = unwrap(this).getDynamoDbReadPolicy()

    public fun dynamoDbStreamReadPolicy(): Any? = unwrap(this).getDynamoDbStreamReadPolicy()

    public fun dynamoDbWritePolicy(): Any? = unwrap(this).getDynamoDbWritePolicy()

    public fun ec2DescribePolicy(): Any? = unwrap(this).getEc2DescribePolicy()

    public fun elasticsearchHttpPostPolicy(): Any? = unwrap(this).getElasticsearchHttpPostPolicy()

    public fun filterLogEventsPolicy(): Any? = unwrap(this).getFilterLogEventsPolicy()

    public fun kinesisCrudPolicy(): Any? = unwrap(this).getKinesisCrudPolicy()

    public fun kinesisStreamReadPolicy(): Any? = unwrap(this).getKinesisStreamReadPolicy()

    public fun kmsDecryptPolicy(): Any? = unwrap(this).getKmsDecryptPolicy()

    public fun lambdaInvokePolicy(): Any? = unwrap(this).getLambdaInvokePolicy()

    public fun rekognitionDetectOnlyPolicy(): Any? = unwrap(this).getRekognitionDetectOnlyPolicy()

    public fun rekognitionLabelsPolicy(): Any? = unwrap(this).getRekognitionLabelsPolicy()

    public fun rekognitionNoDataAccessPolicy(): Any? =
        unwrap(this).getRekognitionNoDataAccessPolicy()

    public fun rekognitionReadPolicy(): Any? = unwrap(this).getRekognitionReadPolicy()

    public fun rekognitionWriteOnlyAccessPolicy(): Any? =
        unwrap(this).getRekognitionWriteOnlyAccessPolicy()

    public fun s3CrudPolicy(): Any? = unwrap(this).getS3CrudPolicy()

    public fun s3ReadPolicy(): Any? = unwrap(this).getS3ReadPolicy()

    public fun s3WritePolicy(): Any? = unwrap(this).getS3WritePolicy()

    public fun sesBulkTemplatedCrudPolicy(): Any? = unwrap(this).getSesBulkTemplatedCrudPolicy()

    public fun sesCrudPolicy(): Any? = unwrap(this).getSesCrudPolicy()

    public fun sesEmailTemplateCrudPolicy(): Any? = unwrap(this).getSesEmailTemplateCrudPolicy()

    public fun sesSendBouncePolicy(): Any? = unwrap(this).getSesSendBouncePolicy()

    public fun snsCrudPolicy(): Any? = unwrap(this).getSnsCrudPolicy()

    public fun snsPublishMessagePolicy(): Any? = unwrap(this).getSnsPublishMessagePolicy()

    public fun sqsPollerPolicy(): Any? = unwrap(this).getSqsPollerPolicy()

    public fun sqsSendMessagePolicy(): Any? = unwrap(this).getSqsSendMessagePolicy()

    public fun ssmParameterReadPolicy(): Any? = unwrap(this).getSsmParameterReadPolicy()

    public fun stepFunctionsExecutionPolicy(): Any? = unwrap(this).getStepFunctionsExecutionPolicy()

    public fun vpcAccessPolicy(): Any? = unwrap(this).getVpcAccessPolicy()

    public interface Builder {
      public fun amiDescribePolicy(amiDescribePolicy: IResolvable) {
      }

      public fun amiDescribePolicy(amiDescribePolicy: EmptySAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ffbd4cd9871a2be4e64ab12e63267fa255c166e0b0d6ef43ecc8cbe033bad09")
      public fun amiDescribePolicy(amiDescribePolicy: EmptySAMPTProperty.Builder.() -> Unit) {
      }

      public
          fun awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy: IResolvable) {
      }

      public
          fun awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy: SecretArnSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a2345d8393a346bbb89efc5395a05f6fe82c03921eaf01f9d006067d67affbe")
      public
          fun awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy: SecretArnSAMPTProperty.Builder.() -> Unit) {
      }

      public
          fun cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy: IResolvable) {
      }

      public
          fun cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy: EmptySAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57b3f53bf1c96447254b75f60d11f92e106e000ca0cacd02c1e0a9d4f88e99a8")
      public
          fun cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy: EmptySAMPTProperty.Builder.() -> Unit) {
      }

      public fun cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy: IResolvable) {
      }

      public fun cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy: EmptySAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9509da69caaf16883156121d17c04d7a05b63271a89a81c0cc4ba271be1c2c98")
      public
          fun cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy: EmptySAMPTProperty.Builder.() -> Unit) {
      }

      public fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: IResolvable) {
      }

      public fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: TableSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("935113a164f96629c0c70d4723120e6b862e21b36e8250e787beac4a4fed1d66")
      public fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: TableSAMPTProperty.Builder.() -> Unit) {
      }

      public fun dynamoDbReadPolicy(dynamoDbReadPolicy: IResolvable) {
      }

      public fun dynamoDbReadPolicy(dynamoDbReadPolicy: TableSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df795775dcd23f51c2eb78dea9cb327e0597c5493449edba8fe0fee8d2ac2f6c")
      public fun dynamoDbReadPolicy(dynamoDbReadPolicy: TableSAMPTProperty.Builder.() -> Unit) {
      }

      public fun dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy: IResolvable) {
      }

      public fun dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy: TableStreamSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1d54a973657e8451185f807dd630704511afacab8b2bb1b4152eb47dcd38ab4")
      public
          fun dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy: TableStreamSAMPTProperty.Builder.() -> Unit) {
      }

      public fun dynamoDbWritePolicy(dynamoDbWritePolicy: IResolvable) {
      }

      public fun dynamoDbWritePolicy(dynamoDbWritePolicy: TableSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eac4f77957069da0c1d7201b01975d528d40209d8ec22ee408099551bbb26235")
      public fun dynamoDbWritePolicy(dynamoDbWritePolicy: TableSAMPTProperty.Builder.() -> Unit) {
      }

      public fun ec2DescribePolicy(ec2DescribePolicy: IResolvable) {
      }

      public fun ec2DescribePolicy(ec2DescribePolicy: EmptySAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3358ae2a6b4a141aadf79d37e9687c3ecb3dff683100b85b1fe87d041b849249")
      public fun ec2DescribePolicy(ec2DescribePolicy: EmptySAMPTProperty.Builder.() -> Unit) {
      }

      public fun elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy: IResolvable) {
      }

      public fun elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy: DomainSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d85413000df607b8481ea8f950f3190dd708f838ccf849964969a6ffdfc3b3a")
      public
          fun elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy: DomainSAMPTProperty.Builder.() -> Unit) {
      }

      public fun filterLogEventsPolicy(filterLogEventsPolicy: IResolvable) {
      }

      public fun filterLogEventsPolicy(filterLogEventsPolicy: LogGroupSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b037880f8ddba38d13afb75f8992889a5dc271580beda09b797f881a7b168ecb")
      public
          fun filterLogEventsPolicy(filterLogEventsPolicy: LogGroupSAMPTProperty.Builder.() -> Unit) {
      }

      public fun kinesisCrudPolicy(kinesisCrudPolicy: IResolvable) {
      }

      public fun kinesisCrudPolicy(kinesisCrudPolicy: StreamSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8eb2a5ca2130fbb3f6a2e49cecef8a2bb4dca12059bf88b8ae43d7e4fbac3658")
      public fun kinesisCrudPolicy(kinesisCrudPolicy: StreamSAMPTProperty.Builder.() -> Unit) {
      }

      public fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: IResolvable) {
      }

      public fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: StreamSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("978ef2b190e14336006a6f3967e5b88ea48a5ba0f1f65acc399d581b76eb8542")
      public
          fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: StreamSAMPTProperty.Builder.() -> Unit) {
      }

      public fun kmsDecryptPolicy(kmsDecryptPolicy: IResolvable) {
      }

      public fun kmsDecryptPolicy(kmsDecryptPolicy: KeySAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7168eccd84da56f444b947c5e61df8d009f286e3dfeb6639ec02e18448b0062b")
      public fun kmsDecryptPolicy(kmsDecryptPolicy: KeySAMPTProperty.Builder.() -> Unit) {
      }

      public fun lambdaInvokePolicy(lambdaInvokePolicy: IResolvable) {
      }

      public fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70b8621f04d22d6fb0e05b959568232c57dc4031b9d573f85cf08b14099a96b9")
      public fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty.Builder.() -> Unit) {
      }

      public fun rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy: IResolvable) {
      }

      public fun rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy: EmptySAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6afc4b90e6f9b0d3aea86275e2dbdb3b4b413749de97821f3a281f60a9913e35")
      public
          fun rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy: EmptySAMPTProperty.Builder.() -> Unit) {
      }

      public fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: IResolvable) {
      }

      public fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: EmptySAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00868a429833f1f938aecab92ea63af6c38b398667dfc9e694dc40bee5036e5b")
      public
          fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: EmptySAMPTProperty.Builder.() -> Unit) {
      }

      public fun rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy: IResolvable) {
      }

      public
          fun rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy: CollectionSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82d63909262dc296dc91d922790da301248e7ef6a77b9cab6447cedc6a512f7e")
      public
          fun rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy: CollectionSAMPTProperty.Builder.() -> Unit) {
      }

      public fun rekognitionReadPolicy(rekognitionReadPolicy: IResolvable) {
      }

      public fun rekognitionReadPolicy(rekognitionReadPolicy: CollectionSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76955e3338f2d42c224a77804af6c2279ff219c8e3284b60e4b44dbc05e3c493")
      public
          fun rekognitionReadPolicy(rekognitionReadPolicy: CollectionSAMPTProperty.Builder.() -> Unit) {
      }

      public fun rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy: IResolvable) {
      }

      public
          fun rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy: CollectionSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2dcf824084a195755b530bad0e13ac7ebd83c47a4f7456dbcb1b3726c0abc52b")
      public
          fun rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy: CollectionSAMPTProperty.Builder.() -> Unit) {
      }

      public fun s3CrudPolicy(s3CrudPolicy: IResolvable) {
      }

      public fun s3CrudPolicy(s3CrudPolicy: BucketSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1a0aa5c24326aaa2f99289e200cc39d7c3b4711841dee43e06705ed9577a97c")
      public fun s3CrudPolicy(s3CrudPolicy: BucketSAMPTProperty.Builder.() -> Unit) {
      }

      public fun s3ReadPolicy(s3ReadPolicy: IResolvable) {
      }

      public fun s3ReadPolicy(s3ReadPolicy: BucketSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a30954145aa23934ced20050b142a673ffdecb35052905f4af3e824ba34ecf5")
      public fun s3ReadPolicy(s3ReadPolicy: BucketSAMPTProperty.Builder.() -> Unit) {
      }

      public fun s3WritePolicy(s3WritePolicy: IResolvable) {
      }

      public fun s3WritePolicy(s3WritePolicy: BucketSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56ad47ffacff3038b135034d03ac92e054cd8c281fcf23a0ec23ceaebe9ccab9")
      public fun s3WritePolicy(s3WritePolicy: BucketSAMPTProperty.Builder.() -> Unit) {
      }

      public fun sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy: IResolvable) {
      }

      public fun sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy: IdentitySAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94372465dc46ef31785a5c03336ac051177bd3f352e650439143d72233a164d5")
      public
          fun sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy: IdentitySAMPTProperty.Builder.() -> Unit) {
      }

      public fun sesCrudPolicy(sesCrudPolicy: IResolvable) {
      }

      public fun sesCrudPolicy(sesCrudPolicy: IdentitySAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44a25b433cf529a3f59b068141b038b318af9e4b8765e69d3bd049f5eda4bcef")
      public fun sesCrudPolicy(sesCrudPolicy: IdentitySAMPTProperty.Builder.() -> Unit) {
      }

      public fun sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy: IResolvable) {
      }

      public fun sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy: EmptySAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc0dada99f25e7bcf2339fb0e751e1ad935c49179d4f5bde8500ab67e85ad0ce")
      public
          fun sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy: EmptySAMPTProperty.Builder.() -> Unit) {
      }

      public fun sesSendBouncePolicy(sesSendBouncePolicy: IResolvable) {
      }

      public fun sesSendBouncePolicy(sesSendBouncePolicy: IdentitySAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ae1e7a4c749d08f5b447e467c03f1402fb93d49c00957bee69bd2cd34d38ac3")
      public
          fun sesSendBouncePolicy(sesSendBouncePolicy: IdentitySAMPTProperty.Builder.() -> Unit) {
      }

      public fun snsCrudPolicy(snsCrudPolicy: IResolvable) {
      }

      public fun snsCrudPolicy(snsCrudPolicy: TopicSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c4057c5b0bbab9c1b2ccf03b0d391e72a82373ba995e1c10dd672ca0f9c366e")
      public fun snsCrudPolicy(snsCrudPolicy: TopicSAMPTProperty.Builder.() -> Unit) {
      }

      public fun snsPublishMessagePolicy(snsPublishMessagePolicy: IResolvable) {
      }

      public fun snsPublishMessagePolicy(snsPublishMessagePolicy: TopicSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc55e7590d9b94a5f8c4a2388d03cc95ca0ebed643e7fa78210e83a8e246d861")
      public
          fun snsPublishMessagePolicy(snsPublishMessagePolicy: TopicSAMPTProperty.Builder.() -> Unit) {
      }

      public fun sqsPollerPolicy(sqsPollerPolicy: IResolvable) {
      }

      public fun sqsPollerPolicy(sqsPollerPolicy: QueueSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7101881b6cbe7ba1feac75c8fbcfd98bebf10bcdc75fbfeff55c0e14d906c982")
      public fun sqsPollerPolicy(sqsPollerPolicy: QueueSAMPTProperty.Builder.() -> Unit) {
      }

      public fun sqsSendMessagePolicy(sqsSendMessagePolicy: IResolvable) {
      }

      public fun sqsSendMessagePolicy(sqsSendMessagePolicy: QueueSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ca4acba6248c758a73866e26d1d6a6b6cdf0020ccb8a9a054bd80eb091dd59e")
      public fun sqsSendMessagePolicy(sqsSendMessagePolicy: QueueSAMPTProperty.Builder.() -> Unit) {
      }

      public fun ssmParameterReadPolicy(ssmParameterReadPolicy: IResolvable) {
      }

      public fun ssmParameterReadPolicy(ssmParameterReadPolicy: ParameterNameSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("231e5ee73bf5944498d6179f6c96904f366b79450c2f757006426f67daee329e")
      public
          fun ssmParameterReadPolicy(ssmParameterReadPolicy: ParameterNameSAMPTProperty.Builder.() -> Unit) {
      }

      public fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: IResolvable) {
      }

      public
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2c83d3f69a6c1351125785327861aae48077103d1ee36317d2ce12718746ecb")
      public
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty.Builder.() -> Unit) {
      }

      public fun vpcAccessPolicy(vpcAccessPolicy: IResolvable) {
      }

      public fun vpcAccessPolicy(vpcAccessPolicy: EmptySAMPTProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0617476e5af158f7e65497f2b8d8d8b420129b399f349dc1b88376d3ceb8b976")
      public fun vpcAccessPolicy(vpcAccessPolicy: EmptySAMPTProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.SAMPolicyTemplateProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.SAMPolicyTemplateProperty.builder()

      public override fun amiDescribePolicy(amiDescribePolicy: IResolvable) {
        cdkBuilder.amiDescribePolicy(amiDescribePolicy.let(IResolvable::unwrap))
      }

      public override fun amiDescribePolicy(amiDescribePolicy: EmptySAMPTProperty) {
        cdkBuilder.amiDescribePolicy(amiDescribePolicy.let(EmptySAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ffbd4cd9871a2be4e64ab12e63267fa255c166e0b0d6ef43ecc8cbe033bad09")
      public override
          fun amiDescribePolicy(amiDescribePolicy: EmptySAMPTProperty.Builder.() -> Unit): Unit =
          amiDescribePolicy(EmptySAMPTProperty(amiDescribePolicy))

      public override
          fun awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy: IResolvable) {
        cdkBuilder.awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy.let(IResolvable::unwrap))
      }

      public override
          fun awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy: SecretArnSAMPTProperty) {
        cdkBuilder.awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy.let(SecretArnSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a2345d8393a346bbb89efc5395a05f6fe82c03921eaf01f9d006067d67affbe")
      public override
          fun awsSecretsManagerGetSecretValuePolicy(awsSecretsManagerGetSecretValuePolicy: SecretArnSAMPTProperty.Builder.() -> Unit):
          Unit =
          awsSecretsManagerGetSecretValuePolicy(SecretArnSAMPTProperty(awsSecretsManagerGetSecretValuePolicy))

      public override
          fun cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy: IResolvable) {
        cdkBuilder.cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy.let(IResolvable::unwrap))
      }

      public override
          fun cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy: EmptySAMPTProperty) {
        cdkBuilder.cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy.let(EmptySAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("57b3f53bf1c96447254b75f60d11f92e106e000ca0cacd02c1e0a9d4f88e99a8")
      public override
          fun cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy: EmptySAMPTProperty.Builder.() -> Unit):
          Unit =
          cloudFormationDescribeStacksPolicy(EmptySAMPTProperty(cloudFormationDescribeStacksPolicy))

      public override fun cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy: IResolvable) {
        cdkBuilder.cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy.let(IResolvable::unwrap))
      }

      public override fun cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy: EmptySAMPTProperty) {
        cdkBuilder.cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy.let(EmptySAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9509da69caaf16883156121d17c04d7a05b63271a89a81c0cc4ba271be1c2c98")
      public override
          fun cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy: EmptySAMPTProperty.Builder.() -> Unit):
          Unit = cloudWatchPutMetricPolicy(EmptySAMPTProperty(cloudWatchPutMetricPolicy))

      public override fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: IResolvable) {
        cdkBuilder.dynamoDbCrudPolicy(dynamoDbCrudPolicy.let(IResolvable::unwrap))
      }

      public override fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: TableSAMPTProperty) {
        cdkBuilder.dynamoDbCrudPolicy(dynamoDbCrudPolicy.let(TableSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("935113a164f96629c0c70d4723120e6b862e21b36e8250e787beac4a4fed1d66")
      public override
          fun dynamoDbCrudPolicy(dynamoDbCrudPolicy: TableSAMPTProperty.Builder.() -> Unit): Unit =
          dynamoDbCrudPolicy(TableSAMPTProperty(dynamoDbCrudPolicy))

      public override fun dynamoDbReadPolicy(dynamoDbReadPolicy: IResolvable) {
        cdkBuilder.dynamoDbReadPolicy(dynamoDbReadPolicy.let(IResolvable::unwrap))
      }

      public override fun dynamoDbReadPolicy(dynamoDbReadPolicy: TableSAMPTProperty) {
        cdkBuilder.dynamoDbReadPolicy(dynamoDbReadPolicy.let(TableSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("df795775dcd23f51c2eb78dea9cb327e0597c5493449edba8fe0fee8d2ac2f6c")
      public override
          fun dynamoDbReadPolicy(dynamoDbReadPolicy: TableSAMPTProperty.Builder.() -> Unit): Unit =
          dynamoDbReadPolicy(TableSAMPTProperty(dynamoDbReadPolicy))

      public override fun dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy: IResolvable) {
        cdkBuilder.dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy.let(IResolvable::unwrap))
      }

      public override
          fun dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy: TableStreamSAMPTProperty) {
        cdkBuilder.dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy.let(TableStreamSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e1d54a973657e8451185f807dd630704511afacab8b2bb1b4152eb47dcd38ab4")
      public override
          fun dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy: TableStreamSAMPTProperty.Builder.() -> Unit):
          Unit = dynamoDbStreamReadPolicy(TableStreamSAMPTProperty(dynamoDbStreamReadPolicy))

      public override fun dynamoDbWritePolicy(dynamoDbWritePolicy: IResolvable) {
        cdkBuilder.dynamoDbWritePolicy(dynamoDbWritePolicy.let(IResolvable::unwrap))
      }

      public override fun dynamoDbWritePolicy(dynamoDbWritePolicy: TableSAMPTProperty) {
        cdkBuilder.dynamoDbWritePolicy(dynamoDbWritePolicy.let(TableSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eac4f77957069da0c1d7201b01975d528d40209d8ec22ee408099551bbb26235")
      public override
          fun dynamoDbWritePolicy(dynamoDbWritePolicy: TableSAMPTProperty.Builder.() -> Unit): Unit
          = dynamoDbWritePolicy(TableSAMPTProperty(dynamoDbWritePolicy))

      public override fun ec2DescribePolicy(ec2DescribePolicy: IResolvable) {
        cdkBuilder.ec2DescribePolicy(ec2DescribePolicy.let(IResolvable::unwrap))
      }

      public override fun ec2DescribePolicy(ec2DescribePolicy: EmptySAMPTProperty) {
        cdkBuilder.ec2DescribePolicy(ec2DescribePolicy.let(EmptySAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3358ae2a6b4a141aadf79d37e9687c3ecb3dff683100b85b1fe87d041b849249")
      public override
          fun ec2DescribePolicy(ec2DescribePolicy: EmptySAMPTProperty.Builder.() -> Unit): Unit =
          ec2DescribePolicy(EmptySAMPTProperty(ec2DescribePolicy))

      public override fun elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy: IResolvable) {
        cdkBuilder.elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy.let(IResolvable::unwrap))
      }

      public override
          fun elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy: DomainSAMPTProperty) {
        cdkBuilder.elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy.let(DomainSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d85413000df607b8481ea8f950f3190dd708f838ccf849964969a6ffdfc3b3a")
      public override
          fun elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy: DomainSAMPTProperty.Builder.() -> Unit):
          Unit = elasticsearchHttpPostPolicy(DomainSAMPTProperty(elasticsearchHttpPostPolicy))

      public override fun filterLogEventsPolicy(filterLogEventsPolicy: IResolvable) {
        cdkBuilder.filterLogEventsPolicy(filterLogEventsPolicy.let(IResolvable::unwrap))
      }

      public override fun filterLogEventsPolicy(filterLogEventsPolicy: LogGroupSAMPTProperty) {
        cdkBuilder.filterLogEventsPolicy(filterLogEventsPolicy.let(LogGroupSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b037880f8ddba38d13afb75f8992889a5dc271580beda09b797f881a7b168ecb")
      public override
          fun filterLogEventsPolicy(filterLogEventsPolicy: LogGroupSAMPTProperty.Builder.() -> Unit):
          Unit = filterLogEventsPolicy(LogGroupSAMPTProperty(filterLogEventsPolicy))

      public override fun kinesisCrudPolicy(kinesisCrudPolicy: IResolvable) {
        cdkBuilder.kinesisCrudPolicy(kinesisCrudPolicy.let(IResolvable::unwrap))
      }

      public override fun kinesisCrudPolicy(kinesisCrudPolicy: StreamSAMPTProperty) {
        cdkBuilder.kinesisCrudPolicy(kinesisCrudPolicy.let(StreamSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8eb2a5ca2130fbb3f6a2e49cecef8a2bb4dca12059bf88b8ae43d7e4fbac3658")
      public override
          fun kinesisCrudPolicy(kinesisCrudPolicy: StreamSAMPTProperty.Builder.() -> Unit): Unit =
          kinesisCrudPolicy(StreamSAMPTProperty(kinesisCrudPolicy))

      public override fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: IResolvable) {
        cdkBuilder.kinesisStreamReadPolicy(kinesisStreamReadPolicy.let(IResolvable::unwrap))
      }

      public override fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: StreamSAMPTProperty) {
        cdkBuilder.kinesisStreamReadPolicy(kinesisStreamReadPolicy.let(StreamSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("978ef2b190e14336006a6f3967e5b88ea48a5ba0f1f65acc399d581b76eb8542")
      public override
          fun kinesisStreamReadPolicy(kinesisStreamReadPolicy: StreamSAMPTProperty.Builder.() -> Unit):
          Unit = kinesisStreamReadPolicy(StreamSAMPTProperty(kinesisStreamReadPolicy))

      public override fun kmsDecryptPolicy(kmsDecryptPolicy: IResolvable) {
        cdkBuilder.kmsDecryptPolicy(kmsDecryptPolicy.let(IResolvable::unwrap))
      }

      public override fun kmsDecryptPolicy(kmsDecryptPolicy: KeySAMPTProperty) {
        cdkBuilder.kmsDecryptPolicy(kmsDecryptPolicy.let(KeySAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7168eccd84da56f444b947c5e61df8d009f286e3dfeb6639ec02e18448b0062b")
      public override fun kmsDecryptPolicy(kmsDecryptPolicy: KeySAMPTProperty.Builder.() -> Unit):
          Unit = kmsDecryptPolicy(KeySAMPTProperty(kmsDecryptPolicy))

      public override fun lambdaInvokePolicy(lambdaInvokePolicy: IResolvable) {
        cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy.let(IResolvable::unwrap))
      }

      public override fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty) {
        cdkBuilder.lambdaInvokePolicy(lambdaInvokePolicy.let(FunctionSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("70b8621f04d22d6fb0e05b959568232c57dc4031b9d573f85cf08b14099a96b9")
      public override
          fun lambdaInvokePolicy(lambdaInvokePolicy: FunctionSAMPTProperty.Builder.() -> Unit): Unit
          = lambdaInvokePolicy(FunctionSAMPTProperty(lambdaInvokePolicy))

      public override fun rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy: IResolvable) {
        cdkBuilder.rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy.let(IResolvable::unwrap))
      }

      public override
          fun rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy: EmptySAMPTProperty) {
        cdkBuilder.rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy.let(EmptySAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6afc4b90e6f9b0d3aea86275e2dbdb3b4b413749de97821f3a281f60a9913e35")
      public override
          fun rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy: EmptySAMPTProperty.Builder.() -> Unit):
          Unit = rekognitionDetectOnlyPolicy(EmptySAMPTProperty(rekognitionDetectOnlyPolicy))

      public override fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: IResolvable) {
        cdkBuilder.rekognitionLabelsPolicy(rekognitionLabelsPolicy.let(IResolvable::unwrap))
      }

      public override fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: EmptySAMPTProperty) {
        cdkBuilder.rekognitionLabelsPolicy(rekognitionLabelsPolicy.let(EmptySAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00868a429833f1f938aecab92ea63af6c38b398667dfc9e694dc40bee5036e5b")
      public override
          fun rekognitionLabelsPolicy(rekognitionLabelsPolicy: EmptySAMPTProperty.Builder.() -> Unit):
          Unit = rekognitionLabelsPolicy(EmptySAMPTProperty(rekognitionLabelsPolicy))

      public override
          fun rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy: IResolvable) {
        cdkBuilder.rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy.let(IResolvable::unwrap))
      }

      public override
          fun rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy: CollectionSAMPTProperty) {
        cdkBuilder.rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy.let(CollectionSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82d63909262dc296dc91d922790da301248e7ef6a77b9cab6447cedc6a512f7e")
      public override
          fun rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy: CollectionSAMPTProperty.Builder.() -> Unit):
          Unit =
          rekognitionNoDataAccessPolicy(CollectionSAMPTProperty(rekognitionNoDataAccessPolicy))

      public override fun rekognitionReadPolicy(rekognitionReadPolicy: IResolvable) {
        cdkBuilder.rekognitionReadPolicy(rekognitionReadPolicy.let(IResolvable::unwrap))
      }

      public override fun rekognitionReadPolicy(rekognitionReadPolicy: CollectionSAMPTProperty) {
        cdkBuilder.rekognitionReadPolicy(rekognitionReadPolicy.let(CollectionSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("76955e3338f2d42c224a77804af6c2279ff219c8e3284b60e4b44dbc05e3c493")
      public override
          fun rekognitionReadPolicy(rekognitionReadPolicy: CollectionSAMPTProperty.Builder.() -> Unit):
          Unit = rekognitionReadPolicy(CollectionSAMPTProperty(rekognitionReadPolicy))

      public override
          fun rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy: IResolvable) {
        cdkBuilder.rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy.let(IResolvable::unwrap))
      }

      public override
          fun rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy: CollectionSAMPTProperty) {
        cdkBuilder.rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy.let(CollectionSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2dcf824084a195755b530bad0e13ac7ebd83c47a4f7456dbcb1b3726c0abc52b")
      public override
          fun rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy: CollectionSAMPTProperty.Builder.() -> Unit):
          Unit =
          rekognitionWriteOnlyAccessPolicy(CollectionSAMPTProperty(rekognitionWriteOnlyAccessPolicy))

      public override fun s3CrudPolicy(s3CrudPolicy: IResolvable) {
        cdkBuilder.s3CrudPolicy(s3CrudPolicy.let(IResolvable::unwrap))
      }

      public override fun s3CrudPolicy(s3CrudPolicy: BucketSAMPTProperty) {
        cdkBuilder.s3CrudPolicy(s3CrudPolicy.let(BucketSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1a0aa5c24326aaa2f99289e200cc39d7c3b4711841dee43e06705ed9577a97c")
      public override fun s3CrudPolicy(s3CrudPolicy: BucketSAMPTProperty.Builder.() -> Unit): Unit =
          s3CrudPolicy(BucketSAMPTProperty(s3CrudPolicy))

      public override fun s3ReadPolicy(s3ReadPolicy: IResolvable) {
        cdkBuilder.s3ReadPolicy(s3ReadPolicy.let(IResolvable::unwrap))
      }

      public override fun s3ReadPolicy(s3ReadPolicy: BucketSAMPTProperty) {
        cdkBuilder.s3ReadPolicy(s3ReadPolicy.let(BucketSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a30954145aa23934ced20050b142a673ffdecb35052905f4af3e824ba34ecf5")
      public override fun s3ReadPolicy(s3ReadPolicy: BucketSAMPTProperty.Builder.() -> Unit): Unit =
          s3ReadPolicy(BucketSAMPTProperty(s3ReadPolicy))

      public override fun s3WritePolicy(s3WritePolicy: IResolvable) {
        cdkBuilder.s3WritePolicy(s3WritePolicy.let(IResolvable::unwrap))
      }

      public override fun s3WritePolicy(s3WritePolicy: BucketSAMPTProperty) {
        cdkBuilder.s3WritePolicy(s3WritePolicy.let(BucketSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56ad47ffacff3038b135034d03ac92e054cd8c281fcf23a0ec23ceaebe9ccab9")
      public override fun s3WritePolicy(s3WritePolicy: BucketSAMPTProperty.Builder.() -> Unit): Unit
          = s3WritePolicy(BucketSAMPTProperty(s3WritePolicy))

      public override fun sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy: IResolvable) {
        cdkBuilder.sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy.let(IResolvable::unwrap))
      }

      public override
          fun sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy: IdentitySAMPTProperty) {
        cdkBuilder.sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy.let(IdentitySAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("94372465dc46ef31785a5c03336ac051177bd3f352e650439143d72233a164d5")
      public override
          fun sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy: IdentitySAMPTProperty.Builder.() -> Unit):
          Unit = sesBulkTemplatedCrudPolicy(IdentitySAMPTProperty(sesBulkTemplatedCrudPolicy))

      public override fun sesCrudPolicy(sesCrudPolicy: IResolvable) {
        cdkBuilder.sesCrudPolicy(sesCrudPolicy.let(IResolvable::unwrap))
      }

      public override fun sesCrudPolicy(sesCrudPolicy: IdentitySAMPTProperty) {
        cdkBuilder.sesCrudPolicy(sesCrudPolicy.let(IdentitySAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44a25b433cf529a3f59b068141b038b318af9e4b8765e69d3bd049f5eda4bcef")
      public override fun sesCrudPolicy(sesCrudPolicy: IdentitySAMPTProperty.Builder.() -> Unit):
          Unit = sesCrudPolicy(IdentitySAMPTProperty(sesCrudPolicy))

      public override fun sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy: IResolvable) {
        cdkBuilder.sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy.let(IResolvable::unwrap))
      }

      public override
          fun sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy: EmptySAMPTProperty) {
        cdkBuilder.sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy.let(EmptySAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc0dada99f25e7bcf2339fb0e751e1ad935c49179d4f5bde8500ab67e85ad0ce")
      public override
          fun sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy: EmptySAMPTProperty.Builder.() -> Unit):
          Unit = sesEmailTemplateCrudPolicy(EmptySAMPTProperty(sesEmailTemplateCrudPolicy))

      public override fun sesSendBouncePolicy(sesSendBouncePolicy: IResolvable) {
        cdkBuilder.sesSendBouncePolicy(sesSendBouncePolicy.let(IResolvable::unwrap))
      }

      public override fun sesSendBouncePolicy(sesSendBouncePolicy: IdentitySAMPTProperty) {
        cdkBuilder.sesSendBouncePolicy(sesSendBouncePolicy.let(IdentitySAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7ae1e7a4c749d08f5b447e467c03f1402fb93d49c00957bee69bd2cd34d38ac3")
      public override
          fun sesSendBouncePolicy(sesSendBouncePolicy: IdentitySAMPTProperty.Builder.() -> Unit):
          Unit = sesSendBouncePolicy(IdentitySAMPTProperty(sesSendBouncePolicy))

      public override fun snsCrudPolicy(snsCrudPolicy: IResolvable) {
        cdkBuilder.snsCrudPolicy(snsCrudPolicy.let(IResolvable::unwrap))
      }

      public override fun snsCrudPolicy(snsCrudPolicy: TopicSAMPTProperty) {
        cdkBuilder.snsCrudPolicy(snsCrudPolicy.let(TopicSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c4057c5b0bbab9c1b2ccf03b0d391e72a82373ba995e1c10dd672ca0f9c366e")
      public override fun snsCrudPolicy(snsCrudPolicy: TopicSAMPTProperty.Builder.() -> Unit): Unit
          = snsCrudPolicy(TopicSAMPTProperty(snsCrudPolicy))

      public override fun snsPublishMessagePolicy(snsPublishMessagePolicy: IResolvable) {
        cdkBuilder.snsPublishMessagePolicy(snsPublishMessagePolicy.let(IResolvable::unwrap))
      }

      public override fun snsPublishMessagePolicy(snsPublishMessagePolicy: TopicSAMPTProperty) {
        cdkBuilder.snsPublishMessagePolicy(snsPublishMessagePolicy.let(TopicSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc55e7590d9b94a5f8c4a2388d03cc95ca0ebed643e7fa78210e83a8e246d861")
      public override
          fun snsPublishMessagePolicy(snsPublishMessagePolicy: TopicSAMPTProperty.Builder.() -> Unit):
          Unit = snsPublishMessagePolicy(TopicSAMPTProperty(snsPublishMessagePolicy))

      public override fun sqsPollerPolicy(sqsPollerPolicy: IResolvable) {
        cdkBuilder.sqsPollerPolicy(sqsPollerPolicy.let(IResolvable::unwrap))
      }

      public override fun sqsPollerPolicy(sqsPollerPolicy: QueueSAMPTProperty) {
        cdkBuilder.sqsPollerPolicy(sqsPollerPolicy.let(QueueSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7101881b6cbe7ba1feac75c8fbcfd98bebf10bcdc75fbfeff55c0e14d906c982")
      public override fun sqsPollerPolicy(sqsPollerPolicy: QueueSAMPTProperty.Builder.() -> Unit):
          Unit = sqsPollerPolicy(QueueSAMPTProperty(sqsPollerPolicy))

      public override fun sqsSendMessagePolicy(sqsSendMessagePolicy: IResolvable) {
        cdkBuilder.sqsSendMessagePolicy(sqsSendMessagePolicy.let(IResolvable::unwrap))
      }

      public override fun sqsSendMessagePolicy(sqsSendMessagePolicy: QueueSAMPTProperty) {
        cdkBuilder.sqsSendMessagePolicy(sqsSendMessagePolicy.let(QueueSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ca4acba6248c758a73866e26d1d6a6b6cdf0020ccb8a9a054bd80eb091dd59e")
      public override
          fun sqsSendMessagePolicy(sqsSendMessagePolicy: QueueSAMPTProperty.Builder.() -> Unit):
          Unit = sqsSendMessagePolicy(QueueSAMPTProperty(sqsSendMessagePolicy))

      public override fun ssmParameterReadPolicy(ssmParameterReadPolicy: IResolvable) {
        cdkBuilder.ssmParameterReadPolicy(ssmParameterReadPolicy.let(IResolvable::unwrap))
      }

      public override
          fun ssmParameterReadPolicy(ssmParameterReadPolicy: ParameterNameSAMPTProperty) {
        cdkBuilder.ssmParameterReadPolicy(ssmParameterReadPolicy.let(ParameterNameSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("231e5ee73bf5944498d6179f6c96904f366b79450c2f757006426f67daee329e")
      public override
          fun ssmParameterReadPolicy(ssmParameterReadPolicy: ParameterNameSAMPTProperty.Builder.() -> Unit):
          Unit = ssmParameterReadPolicy(ParameterNameSAMPTProperty(ssmParameterReadPolicy))

      public override fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: IResolvable) {
        cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy.let(IResolvable::unwrap))
      }

      public override
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty) {
        cdkBuilder.stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy.let(StateMachineSAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2c83d3f69a6c1351125785327861aae48077103d1ee36317d2ce12718746ecb")
      public override
          fun stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy: StateMachineSAMPTProperty.Builder.() -> Unit):
          Unit =
          stepFunctionsExecutionPolicy(StateMachineSAMPTProperty(stepFunctionsExecutionPolicy))

      public override fun vpcAccessPolicy(vpcAccessPolicy: IResolvable) {
        cdkBuilder.vpcAccessPolicy(vpcAccessPolicy.let(IResolvable::unwrap))
      }

      public override fun vpcAccessPolicy(vpcAccessPolicy: EmptySAMPTProperty) {
        cdkBuilder.vpcAccessPolicy(vpcAccessPolicy.let(EmptySAMPTProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0617476e5af158f7e65497f2b8d8d8b420129b399f349dc1b88376d3ceb8b976")
      public override fun vpcAccessPolicy(vpcAccessPolicy: EmptySAMPTProperty.Builder.() -> Unit):
          Unit = vpcAccessPolicy(EmptySAMPTProperty(vpcAccessPolicy))

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.SAMPolicyTemplateProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.SAMPolicyTemplateProperty,
    ) : SAMPolicyTemplateProperty {
      public override fun amiDescribePolicy(): Any? = unwrap(this).getAmiDescribePolicy()

      public override fun awsSecretsManagerGetSecretValuePolicy(): Any? =
          unwrap(this).getAwsSecretsManagerGetSecretValuePolicy()

      public override fun cloudFormationDescribeStacksPolicy(): Any? =
          unwrap(this).getCloudFormationDescribeStacksPolicy()

      public override fun cloudWatchPutMetricPolicy(): Any? =
          unwrap(this).getCloudWatchPutMetricPolicy()

      public override fun dynamoDbCrudPolicy(): Any? = unwrap(this).getDynamoDbCrudPolicy()

      public override fun dynamoDbReadPolicy(): Any? = unwrap(this).getDynamoDbReadPolicy()

      public override fun dynamoDbStreamReadPolicy(): Any? =
          unwrap(this).getDynamoDbStreamReadPolicy()

      public override fun dynamoDbWritePolicy(): Any? = unwrap(this).getDynamoDbWritePolicy()

      public override fun ec2DescribePolicy(): Any? = unwrap(this).getEc2DescribePolicy()

      public override fun elasticsearchHttpPostPolicy(): Any? =
          unwrap(this).getElasticsearchHttpPostPolicy()

      public override fun filterLogEventsPolicy(): Any? = unwrap(this).getFilterLogEventsPolicy()

      public override fun kinesisCrudPolicy(): Any? = unwrap(this).getKinesisCrudPolicy()

      public override fun kinesisStreamReadPolicy(): Any? =
          unwrap(this).getKinesisStreamReadPolicy()

      public override fun kmsDecryptPolicy(): Any? = unwrap(this).getKmsDecryptPolicy()

      public override fun lambdaInvokePolicy(): Any? = unwrap(this).getLambdaInvokePolicy()

      public override fun rekognitionDetectOnlyPolicy(): Any? =
          unwrap(this).getRekognitionDetectOnlyPolicy()

      public override fun rekognitionLabelsPolicy(): Any? =
          unwrap(this).getRekognitionLabelsPolicy()

      public override fun rekognitionNoDataAccessPolicy(): Any? =
          unwrap(this).getRekognitionNoDataAccessPolicy()

      public override fun rekognitionReadPolicy(): Any? = unwrap(this).getRekognitionReadPolicy()

      public override fun rekognitionWriteOnlyAccessPolicy(): Any? =
          unwrap(this).getRekognitionWriteOnlyAccessPolicy()

      public override fun s3CrudPolicy(): Any? = unwrap(this).getS3CrudPolicy()

      public override fun s3ReadPolicy(): Any? = unwrap(this).getS3ReadPolicy()

      public override fun s3WritePolicy(): Any? = unwrap(this).getS3WritePolicy()

      public override fun sesBulkTemplatedCrudPolicy(): Any? =
          unwrap(this).getSesBulkTemplatedCrudPolicy()

      public override fun sesCrudPolicy(): Any? = unwrap(this).getSesCrudPolicy()

      public override fun sesEmailTemplateCrudPolicy(): Any? =
          unwrap(this).getSesEmailTemplateCrudPolicy()

      public override fun sesSendBouncePolicy(): Any? = unwrap(this).getSesSendBouncePolicy()

      public override fun snsCrudPolicy(): Any? = unwrap(this).getSnsCrudPolicy()

      public override fun snsPublishMessagePolicy(): Any? =
          unwrap(this).getSnsPublishMessagePolicy()

      public override fun sqsPollerPolicy(): Any? = unwrap(this).getSqsPollerPolicy()

      public override fun sqsSendMessagePolicy(): Any? = unwrap(this).getSqsSendMessagePolicy()

      public override fun ssmParameterReadPolicy(): Any? = unwrap(this).getSsmParameterReadPolicy()

      public override fun stepFunctionsExecutionPolicy(): Any? =
          unwrap(this).getStepFunctionsExecutionPolicy()

      public override fun vpcAccessPolicy(): Any? = unwrap(this).getVpcAccessPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SAMPolicyTemplateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.SAMPolicyTemplateProperty):
          SAMPolicyTemplateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SAMPolicyTemplateProperty):
          software.amazon.awscdk.services.sam.CfnFunction.SAMPolicyTemplateProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HttpApiFunctionAuthProperty {
    public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

    public fun authorizer(): String? = unwrap(this).getAuthorizer()

    public interface Builder {
      public fun authorizationScopes(authorizationScopes: List<String>) {
      }

      public fun authorizer(authorizer: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiFunctionAuthProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiFunctionAuthProperty.builder()

      public override fun authorizationScopes(authorizationScopes: List<String>) {
        cdkBuilder.authorizationScopes(authorizationScopes)
      }

      public override fun authorizer(authorizer: String) {
        cdkBuilder.authorizer(authorizer)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiFunctionAuthProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiFunctionAuthProperty,
    ) : HttpApiFunctionAuthProperty {
      public override fun authorizationScopes(): List<String> =
          unwrap(this).getAuthorizationScopes() ?: emptyList()

      public override fun authorizer(): String? = unwrap(this).getAuthorizer()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HttpApiFunctionAuthProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.HttpApiFunctionAuthProperty):
          HttpApiFunctionAuthProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpApiFunctionAuthProperty):
          software.amazon.awscdk.services.sam.CfnFunction.HttpApiFunctionAuthProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CollectionSAMPTProperty {
    public fun collectionId(): String

    public interface Builder {
      public fun collectionId(collectionId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty.builder()

      public override fun collectionId(collectionId: String) {
        cdkBuilder.collectionId(collectionId)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty,
    ) : CollectionSAMPTProperty {
      public override fun collectionId(): String = unwrap(this).getCollectionId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CollectionSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty):
          CollectionSAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CollectionSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface BucketSAMPTProperty {
    public fun bucketName(): String

    public interface Builder {
      public fun bucketName(bucketName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty.builder()

      public override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty,
    ) : BucketSAMPTProperty {
      public override fun bucketName(): String = unwrap(this).getBucketName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BucketSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty):
          BucketSAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BucketSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AuthProperty {
    public fun apiKeyRequired(): Any? = unwrap(this).getApiKeyRequired()

    public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

    public fun authorizer(): String? = unwrap(this).getAuthorizer()

    public fun resourcePolicy(): Any? = unwrap(this).getResourcePolicy()

    public interface Builder {
      public fun apiKeyRequired(apiKeyRequired: Boolean) {
      }

      public fun apiKeyRequired(apiKeyRequired: IResolvable) {
      }

      public fun authorizationScopes(authorizationScopes: List<String>) {
      }

      public fun authorizer(authorizer: String) {
      }

      public fun resourcePolicy(resourcePolicy: IResolvable) {
      }

      public fun resourcePolicy(resourcePolicy: AuthResourcePolicyProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9529cdb1fed6991be410cd02514de78b43eac83f9f8a181328666094daef357")
      public fun resourcePolicy(resourcePolicy: AuthResourcePolicyProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.sam.CfnFunction.AuthProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.AuthProperty.builder()

      public override fun apiKeyRequired(apiKeyRequired: Boolean) {
        cdkBuilder.apiKeyRequired(apiKeyRequired)
      }

      public override fun apiKeyRequired(apiKeyRequired: IResolvable) {
        cdkBuilder.apiKeyRequired(apiKeyRequired.let(IResolvable::unwrap))
      }

      public override fun authorizationScopes(authorizationScopes: List<String>) {
        cdkBuilder.authorizationScopes(authorizationScopes)
      }

      public override fun authorizer(authorizer: String) {
        cdkBuilder.authorizer(authorizer)
      }

      public override fun resourcePolicy(resourcePolicy: IResolvable) {
        cdkBuilder.resourcePolicy(resourcePolicy.let(IResolvable::unwrap))
      }

      public override fun resourcePolicy(resourcePolicy: AuthResourcePolicyProperty) {
        cdkBuilder.resourcePolicy(resourcePolicy.let(AuthResourcePolicyProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9529cdb1fed6991be410cd02514de78b43eac83f9f8a181328666094daef357")
      public override
          fun resourcePolicy(resourcePolicy: AuthResourcePolicyProperty.Builder.() -> Unit): Unit =
          resourcePolicy(AuthResourcePolicyProperty(resourcePolicy))

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.AuthProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.AuthProperty,
    ) : AuthProperty {
      public override fun apiKeyRequired(): Any? = unwrap(this).getApiKeyRequired()

      public override fun authorizationScopes(): List<String> =
          unwrap(this).getAuthorizationScopes() ?: emptyList()

      public override fun authorizer(): String? = unwrap(this).getAuthorizer()

      public override fun resourcePolicy(): Any? = unwrap(this).getResourcePolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuthProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.AuthProperty):
          AuthProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthProperty):
          software.amazon.awscdk.services.sam.CfnFunction.AuthProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SQSEventProperty {
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun queue(): String

    public interface Builder {
      public fun batchSize(batchSize: Number) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun queue(queue: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty.builder()

      public override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun queue(queue: String) {
        cdkBuilder.queue(queue)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty,
    ) : SQSEventProperty {
      public override fun batchSize(): Number? = unwrap(this).getBatchSize()

      public override fun enabled(): Any? = unwrap(this).getEnabled()

      public override fun queue(): String = unwrap(this).getQueue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SQSEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty):
          SQSEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SQSEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.SQSEventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EphemeralStorageProperty {
    public fun size(): Number

    public interface Builder {
      public fun size(size: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.EphemeralStorageProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.EphemeralStorageProperty.builder()

      public override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.EphemeralStorageProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.EphemeralStorageProperty,
    ) : EphemeralStorageProperty {
      public override fun size(): Number = unwrap(this).getSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EphemeralStorageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EphemeralStorageProperty):
          EphemeralStorageProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EphemeralStorageProperty):
          software.amazon.awscdk.services.sam.CfnFunction.EphemeralStorageProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3KeyFilterRuleProperty {
    public fun name(): String

    public fun `value`(): String

    public interface Builder {
      public fun name(name: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterRuleProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterRuleProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterRuleProperty,
    ) : S3KeyFilterRuleProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3KeyFilterRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterRuleProperty):
          S3KeyFilterRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3KeyFilterRuleProperty):
          software.amazon.awscdk.services.sam.CfnFunction.S3KeyFilterRuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IoTRuleEventProperty {
    public fun awsIotSqlVersion(): String? = unwrap(this).getAwsIotSqlVersion()

    public fun sql(): String

    public interface Builder {
      public fun awsIotSqlVersion(awsIotSqlVersion: String) {
      }

      public fun sql(sql: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty.builder()

      public override fun awsIotSqlVersion(awsIotSqlVersion: String) {
        cdkBuilder.awsIotSqlVersion(awsIotSqlVersion)
      }

      public override fun sql(sql: String) {
        cdkBuilder.sql(sql)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty,
    ) : IoTRuleEventProperty {
      public override fun awsIotSqlVersion(): String? = unwrap(this).getAwsIotSqlVersion()

      public override fun sql(): String = unwrap(this).getSql()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IoTRuleEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty):
          IoTRuleEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IoTRuleEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.IoTRuleEventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EventInvokeDestinationConfigProperty {
    public fun onFailure(): Any

    public fun onSuccess(): Any

    public interface Builder {
      public fun onFailure(onFailure: IResolvable) {
      }

      public fun onFailure(onFailure: DestinationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a9d13c329da9f88dd72665dc6318be4fedea1db0205e930e98a0c5148e68d6f")
      public fun onFailure(onFailure: DestinationProperty.Builder.() -> Unit) {
      }

      public fun onSuccess(onSuccess: IResolvable) {
      }

      public fun onSuccess(onSuccess: DestinationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2bc0ff153db19c5fb4d4bbabb8ee31c99d5f4945eeecddfa3c418aabafcd5c19")
      public fun onSuccess(onSuccess: DestinationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty.Builder
          =
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty.builder()

      public override fun onFailure(onFailure: IResolvable) {
        cdkBuilder.onFailure(onFailure.let(IResolvable::unwrap))
      }

      public override fun onFailure(onFailure: DestinationProperty) {
        cdkBuilder.onFailure(onFailure.let(DestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8a9d13c329da9f88dd72665dc6318be4fedea1db0205e930e98a0c5148e68d6f")
      public override fun onFailure(onFailure: DestinationProperty.Builder.() -> Unit): Unit =
          onFailure(DestinationProperty(onFailure))

      public override fun onSuccess(onSuccess: IResolvable) {
        cdkBuilder.onSuccess(onSuccess.let(IResolvable::unwrap))
      }

      public override fun onSuccess(onSuccess: DestinationProperty) {
        cdkBuilder.onSuccess(onSuccess.let(DestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2bc0ff153db19c5fb4d4bbabb8ee31c99d5f4945eeecddfa3c418aabafcd5c19")
      public override fun onSuccess(onSuccess: DestinationProperty.Builder.() -> Unit): Unit =
          onSuccess(DestinationProperty(onSuccess))

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty,
    ) : EventInvokeDestinationConfigProperty {
      public override fun onFailure(): Any = unwrap(this).getOnFailure()

      public override fun onSuccess(): Any = unwrap(this).getOnSuccess()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EventInvokeDestinationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty):
          EventInvokeDestinationConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventInvokeDestinationConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeDestinationConfigProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RequestModelProperty {
    public fun model(): String

    public fun required(): Any? = unwrap(this).getRequired()

    public fun validateBody(): Any? = unwrap(this).getValidateBody()

    public fun validateParameters(): Any? = unwrap(this).getValidateParameters()

    public interface Builder {
      public fun model(model: String) {
      }

      public fun required(required: Boolean) {
      }

      public fun required(required: IResolvable) {
      }

      public fun validateBody(validateBody: Boolean) {
      }

      public fun validateBody(validateBody: IResolvable) {
      }

      public fun validateParameters(validateParameters: Boolean) {
      }

      public fun validateParameters(validateParameters: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.RequestModelProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.RequestModelProperty.builder()

      public override fun model(model: String) {
        cdkBuilder.model(model)
      }

      public override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      public override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable::unwrap))
      }

      public override fun validateBody(validateBody: Boolean) {
        cdkBuilder.validateBody(validateBody)
      }

      public override fun validateBody(validateBody: IResolvable) {
        cdkBuilder.validateBody(validateBody.let(IResolvable::unwrap))
      }

      public override fun validateParameters(validateParameters: Boolean) {
        cdkBuilder.validateParameters(validateParameters)
      }

      public override fun validateParameters(validateParameters: IResolvable) {
        cdkBuilder.validateParameters(validateParameters.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.RequestModelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.RequestModelProperty,
    ) : RequestModelProperty {
      public override fun model(): String = unwrap(this).getModel()

      public override fun required(): Any? = unwrap(this).getRequired()

      public override fun validateBody(): Any? = unwrap(this).getValidateBody()

      public override fun validateParameters(): Any? = unwrap(this).getValidateParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RequestModelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.RequestModelProperty):
          RequestModelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequestModelProperty):
          software.amazon.awscdk.services.sam.CfnFunction.RequestModelProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SecretArnSAMPTProperty {
    public fun secretArn(): String

    public interface Builder {
      public fun secretArn(secretArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.SecretArnSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.SecretArnSAMPTProperty.builder()

      public override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.SecretArnSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.SecretArnSAMPTProperty,
    ) : SecretArnSAMPTProperty {
      public override fun secretArn(): String = unwrap(this).getSecretArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SecretArnSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.SecretArnSAMPTProperty):
          SecretArnSAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretArnSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.SecretArnSAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RequestParameterProperty {
    public fun caching(): Any? = unwrap(this).getCaching()

    public fun required(): Any? = unwrap(this).getRequired()

    public interface Builder {
      public fun caching(caching: Boolean) {
      }

      public fun caching(caching: IResolvable) {
      }

      public fun required(required: Boolean) {
      }

      public fun required(required: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.RequestParameterProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.RequestParameterProperty.builder()

      public override fun caching(caching: Boolean) {
        cdkBuilder.caching(caching)
      }

      public override fun caching(caching: IResolvable) {
        cdkBuilder.caching(caching.let(IResolvable::unwrap))
      }

      public override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      public override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.RequestParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.RequestParameterProperty,
    ) : RequestParameterProperty {
      public override fun caching(): Any? = unwrap(this).getCaching()

      public override fun required(): Any? = unwrap(this).getRequired()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RequestParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.RequestParameterProperty):
          RequestParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RequestParameterProperty):
          software.amazon.awscdk.services.sam.CfnFunction.RequestParameterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FunctionEnvironmentProperty {
    public fun variables(): Any

    public interface Builder {
      public fun variables(variables: IResolvable) {
      }

      public fun variables(variables: Map<String, String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty.builder()

      public override fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables.let(IResolvable::unwrap))
      }

      public override fun variables(variables: Map<String, String>) {
        cdkBuilder.variables(variables)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty,
    ) : FunctionEnvironmentProperty {
      public override fun variables(): Any = unwrap(this).getVariables()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionEnvironmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty):
          FunctionEnvironmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionEnvironmentProperty):
          software.amazon.awscdk.services.sam.CfnFunction.FunctionEnvironmentProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TopicSAMPTProperty {
    public fun topicName(): String

    public interface Builder {
      public fun topicName(topicName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty.builder()

      public override fun topicName(topicName: String) {
        cdkBuilder.topicName(topicName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty,
    ) : TopicSAMPTProperty {
      public override fun topicName(): String = unwrap(this).getTopicName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TopicSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty):
          TopicSAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3EventProperty {
    public fun bucket(): String

    public fun events(): String

    public fun filter(): Any? = unwrap(this).getFilter()

    public interface Builder {
      public fun bucket(bucket: String) {
      }

      public fun events(events: String) {
      }

      public fun filter(filter: IResolvable) {
      }

      public fun filter(filter: S3NotificationFilterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("316f1c535f3337dcd9b307d8d134a3cd7e3727f8d5e1766c5a9a619ef796156d")
      public fun filter(filter: S3NotificationFilterProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty.builder()

      public override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      public override fun events(events: String) {
        cdkBuilder.events(events)
      }

      public override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      public override fun filter(filter: S3NotificationFilterProperty) {
        cdkBuilder.filter(filter.let(S3NotificationFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("316f1c535f3337dcd9b307d8d134a3cd7e3727f8d5e1766c5a9a619ef796156d")
      public override fun filter(filter: S3NotificationFilterProperty.Builder.() -> Unit): Unit =
          filter(S3NotificationFilterProperty(filter))

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty,
    ) : S3EventProperty {
      public override fun bucket(): String = unwrap(this).getBucket()

      public override fun events(): String = unwrap(this).getEvents()

      public override fun filter(): Any? = unwrap(this).getFilter()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3EventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty):
          S3EventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3EventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.S3EventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DynamoDBEventProperty {
    public fun batchSize(): Number? = unwrap(this).getBatchSize()

    public fun bisectBatchOnFunctionError(): Any? = unwrap(this).getBisectBatchOnFunctionError()

    public fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

    public fun enabled(): Any? = unwrap(this).getEnabled()

    public fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    public fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

    public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    public fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

    public fun startingPosition(): String

    public fun stream(): String

    public interface Builder {
      public fun batchSize(batchSize: Number) {
      }

      public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean) {
      }

      public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable) {
      }

      public fun destinationConfig(destinationConfig: IResolvable) {
      }

      public fun destinationConfig(destinationConfig: DestinationConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd610d4ec286a5d97e944a76a30a2a842fafee8146a6190f9fce1fc989ef56bd")
      public
          fun destinationConfig(destinationConfig: DestinationConfigProperty.Builder.() -> Unit) {
      }

      public fun enabled(enabled: Boolean) {
      }

      public fun enabled(enabled: IResolvable) {
      }

      public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
      }

      public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
      }

      public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
      }

      public fun parallelizationFactor(parallelizationFactor: Number) {
      }

      public fun startingPosition(startingPosition: String) {
      }

      public fun stream(stream: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty.builder()

      public override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      public override fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean) {
        cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
      }

      public override fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable) {
        cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError.let(IResolvable::unwrap))
      }

      public override fun destinationConfig(destinationConfig: IResolvable) {
        cdkBuilder.destinationConfig(destinationConfig.let(IResolvable::unwrap))
      }

      public override fun destinationConfig(destinationConfig: DestinationConfigProperty) {
        cdkBuilder.destinationConfig(destinationConfig.let(DestinationConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd610d4ec286a5d97e944a76a30a2a842fafee8146a6190f9fce1fc989ef56bd")
      public override
          fun destinationConfig(destinationConfig: DestinationConfigProperty.Builder.() -> Unit):
          Unit = destinationConfig(DestinationConfigProperty(destinationConfig))

      public override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      public override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
      }

      public override fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
        cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
      }

      public override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
      }

      public override fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
      }

      public override fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
      }

      public override fun stream(stream: String) {
        cdkBuilder.stream(stream)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty,
    ) : DynamoDBEventProperty {
      public override fun batchSize(): Number? = unwrap(this).getBatchSize()

      public override fun bisectBatchOnFunctionError(): Any? =
          unwrap(this).getBisectBatchOnFunctionError()

      public override fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

      public override fun enabled(): Any? = unwrap(this).getEnabled()

      public override fun maximumBatchingWindowInSeconds(): Number? =
          unwrap(this).getMaximumBatchingWindowInSeconds()

      public override fun maximumRecordAgeInSeconds(): Number? =
          unwrap(this).getMaximumRecordAgeInSeconds()

      public override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

      public override fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

      public override fun startingPosition(): String = unwrap(this).getStartingPosition()

      public override fun stream(): String = unwrap(this).getStream()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty):
          DynamoDBEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.DynamoDBEventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AuthResourcePolicyProperty {
    public fun awsAccountBlacklist(): List<String> = unwrap(this).getAwsAccountBlacklist() ?:
        emptyList()

    public fun awsAccountWhitelist(): List<String> = unwrap(this).getAwsAccountWhitelist() ?:
        emptyList()

    public fun customStatements(): Any? = unwrap(this).getCustomStatements()

    public fun intrinsicVpcBlacklist(): List<String> = unwrap(this).getIntrinsicVpcBlacklist() ?:
        emptyList()

    public fun intrinsicVpcWhitelist(): List<String> = unwrap(this).getIntrinsicVpcWhitelist() ?:
        emptyList()

    public fun intrinsicVpceBlacklist(): List<String> = unwrap(this).getIntrinsicVpceBlacklist() ?:
        emptyList()

    public fun intrinsicVpceWhitelist(): List<String> = unwrap(this).getIntrinsicVpceWhitelist() ?:
        emptyList()

    public fun ipRangeBlacklist(): List<String> = unwrap(this).getIpRangeBlacklist() ?: emptyList()

    public fun ipRangeWhitelist(): List<String> = unwrap(this).getIpRangeWhitelist() ?: emptyList()

    public fun sourceVpcBlacklist(): List<String> = unwrap(this).getSourceVpcBlacklist() ?:
        emptyList()

    public fun sourceVpcWhitelist(): List<String> = unwrap(this).getSourceVpcWhitelist() ?:
        emptyList()

    public interface Builder {
      public fun awsAccountBlacklist(awsAccountBlacklist: List<String>) {
      }

      public fun awsAccountWhitelist(awsAccountWhitelist: List<String>) {
      }

      public fun customStatements(customStatements: List<Any>) {
      }

      public fun customStatements(customStatements: IResolvable) {
      }

      public fun intrinsicVpcBlacklist(intrinsicVpcBlacklist: List<String>) {
      }

      public fun intrinsicVpcWhitelist(intrinsicVpcWhitelist: List<String>) {
      }

      public fun intrinsicVpceBlacklist(intrinsicVpceBlacklist: List<String>) {
      }

      public fun intrinsicVpceWhitelist(intrinsicVpceWhitelist: List<String>) {
      }

      public fun ipRangeBlacklist(ipRangeBlacklist: List<String>) {
      }

      public fun ipRangeWhitelist(ipRangeWhitelist: List<String>) {
      }

      public fun sourceVpcBlacklist(sourceVpcBlacklist: List<String>) {
      }

      public fun sourceVpcWhitelist(sourceVpcWhitelist: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty.builder()

      public override fun awsAccountBlacklist(awsAccountBlacklist: List<String>) {
        cdkBuilder.awsAccountBlacklist(awsAccountBlacklist)
      }

      public override fun awsAccountWhitelist(awsAccountWhitelist: List<String>) {
        cdkBuilder.awsAccountWhitelist(awsAccountWhitelist)
      }

      public override fun customStatements(customStatements: List<Any>) {
        cdkBuilder.customStatements(customStatements)
      }

      public override fun customStatements(customStatements: IResolvable) {
        cdkBuilder.customStatements(customStatements.let(IResolvable::unwrap))
      }

      public override fun intrinsicVpcBlacklist(intrinsicVpcBlacklist: List<String>) {
        cdkBuilder.intrinsicVpcBlacklist(intrinsicVpcBlacklist)
      }

      public override fun intrinsicVpcWhitelist(intrinsicVpcWhitelist: List<String>) {
        cdkBuilder.intrinsicVpcWhitelist(intrinsicVpcWhitelist)
      }

      public override fun intrinsicVpceBlacklist(intrinsicVpceBlacklist: List<String>) {
        cdkBuilder.intrinsicVpceBlacklist(intrinsicVpceBlacklist)
      }

      public override fun intrinsicVpceWhitelist(intrinsicVpceWhitelist: List<String>) {
        cdkBuilder.intrinsicVpceWhitelist(intrinsicVpceWhitelist)
      }

      public override fun ipRangeBlacklist(ipRangeBlacklist: List<String>) {
        cdkBuilder.ipRangeBlacklist(ipRangeBlacklist)
      }

      public override fun ipRangeWhitelist(ipRangeWhitelist: List<String>) {
        cdkBuilder.ipRangeWhitelist(ipRangeWhitelist)
      }

      public override fun sourceVpcBlacklist(sourceVpcBlacklist: List<String>) {
        cdkBuilder.sourceVpcBlacklist(sourceVpcBlacklist)
      }

      public override fun sourceVpcWhitelist(sourceVpcWhitelist: List<String>) {
        cdkBuilder.sourceVpcWhitelist(sourceVpcWhitelist)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty,
    ) : AuthResourcePolicyProperty {
      public override fun awsAccountBlacklist(): List<String> =
          unwrap(this).getAwsAccountBlacklist() ?: emptyList()

      public override fun awsAccountWhitelist(): List<String> =
          unwrap(this).getAwsAccountWhitelist() ?: emptyList()

      public override fun customStatements(): Any? = unwrap(this).getCustomStatements()

      public override fun intrinsicVpcBlacklist(): List<String> =
          unwrap(this).getIntrinsicVpcBlacklist() ?: emptyList()

      public override fun intrinsicVpcWhitelist(): List<String> =
          unwrap(this).getIntrinsicVpcWhitelist() ?: emptyList()

      public override fun intrinsicVpceBlacklist(): List<String> =
          unwrap(this).getIntrinsicVpceBlacklist() ?: emptyList()

      public override fun intrinsicVpceWhitelist(): List<String> =
          unwrap(this).getIntrinsicVpceWhitelist() ?: emptyList()

      public override fun ipRangeBlacklist(): List<String> = unwrap(this).getIpRangeBlacklist() ?:
          emptyList()

      public override fun ipRangeWhitelist(): List<String> = unwrap(this).getIpRangeWhitelist() ?:
          emptyList()

      public override fun sourceVpcBlacklist(): List<String> = unwrap(this).getSourceVpcBlacklist()
          ?: emptyList()

      public override fun sourceVpcWhitelist(): List<String> = unwrap(this).getSourceVpcWhitelist()
          ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuthResourcePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty):
          AuthResourcePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthResourcePolicyProperty):
          software.amazon.awscdk.services.sam.CfnFunction.AuthResourcePolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EventBridgeRuleEventProperty {
    public fun eventBusName(): String? = unwrap(this).getEventBusName()

    public fun input(): String? = unwrap(this).getInput()

    public fun inputPath(): String? = unwrap(this).getInputPath()

    public fun pattern(): Any

    public interface Builder {
      public fun eventBusName(eventBusName: String) {
      }

      public fun input(input: String) {
      }

      public fun inputPath(inputPath: String) {
      }

      public fun pattern(pattern: Any) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty.builder()

      public override fun eventBusName(eventBusName: String) {
        cdkBuilder.eventBusName(eventBusName)
      }

      public override fun input(input: String) {
        cdkBuilder.input(input)
      }

      public override fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
      }

      public override fun pattern(pattern: Any) {
        cdkBuilder.pattern(pattern)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty,
    ) : EventBridgeRuleEventProperty {
      public override fun eventBusName(): String? = unwrap(this).getEventBusName()

      public override fun input(): String? = unwrap(this).getInput()

      public override fun inputPath(): String? = unwrap(this).getInputPath()

      public override fun pattern(): Any = unwrap(this).getPattern()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventBridgeRuleEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty):
          EventBridgeRuleEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBridgeRuleEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.EventBridgeRuleEventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3LocationProperty {
    public fun bucket(): String

    public fun key(): String

    public fun version(): Number? = unwrap(this).getVersion()

    public interface Builder {
      public fun bucket(bucket: String) {
      }

      public fun key(key: String) {
      }

      public fun version(version: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty.builder()

      public override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      public override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public override fun version(version: Number) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty,
    ) : S3LocationProperty {
      public override fun bucket(): String = unwrap(this).getBucket()

      public override fun key(): String = unwrap(this).getKey()

      public override fun version(): Number? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.sam.CfnFunction.S3LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TableSAMPTProperty {
    public fun tableName(): String

    public interface Builder {
      public fun tableName(tableName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty.builder()

      public override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty,
    ) : TableSAMPTProperty {
      public override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TableSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty):
          TableSAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StreamSAMPTProperty {
    public fun streamName(): String

    public interface Builder {
      public fun streamName(streamName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty.builder()

      public override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty,
    ) : StreamSAMPTProperty {
      public override fun streamName(): String = unwrap(this).getStreamName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StreamSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty):
          StreamSAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FunctionUrlConfigProperty {
    public fun authType(): String

    public fun cors(): Any? = unwrap(this).getCors()

    public fun invokeMode(): String? = unwrap(this).getInvokeMode()

    public interface Builder {
      public fun authType(authType: String) {
      }

      public fun cors(cors: String) {
      }

      public fun cors(cors: IResolvable) {
      }

      public fun cors(cors: CorsConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d30674ec45e53ed15b1981ab571102ac0f917e5c3cec461a38762d52f98534ca")
      public fun cors(cors: CorsConfigurationProperty.Builder.() -> Unit) {
      }

      public fun invokeMode(invokeMode: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.FunctionUrlConfigProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.FunctionUrlConfigProperty.builder()

      public override fun authType(authType: String) {
        cdkBuilder.authType(authType)
      }

      public override fun cors(cors: String) {
        cdkBuilder.cors(cors)
      }

      public override fun cors(cors: IResolvable) {
        cdkBuilder.cors(cors.let(IResolvable::unwrap))
      }

      public override fun cors(cors: CorsConfigurationProperty) {
        cdkBuilder.cors(cors.let(CorsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d30674ec45e53ed15b1981ab571102ac0f917e5c3cec461a38762d52f98534ca")
      public override fun cors(cors: CorsConfigurationProperty.Builder.() -> Unit): Unit =
          cors(CorsConfigurationProperty(cors))

      public override fun invokeMode(invokeMode: String) {
        cdkBuilder.invokeMode(invokeMode)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.FunctionUrlConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.FunctionUrlConfigProperty,
    ) : FunctionUrlConfigProperty {
      public override fun authType(): String = unwrap(this).getAuthType()

      public override fun cors(): Any? = unwrap(this).getCors()

      public override fun invokeMode(): String? = unwrap(this).getInvokeMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionUrlConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.FunctionUrlConfigProperty):
          FunctionUrlConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionUrlConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.FunctionUrlConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ImageConfigProperty {
    public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    public fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

    public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

    public interface Builder {
      public fun command(command: List<String>) {
      }

      public fun entryPoint(entryPoint: List<String>) {
      }

      public fun workingDirectory(workingDirectory: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty.builder()

      public override fun command(command: List<String>) {
        cdkBuilder.command(command)
      }

      public override fun entryPoint(entryPoint: List<String>) {
        cdkBuilder.entryPoint(entryPoint)
      }

      public override fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty,
    ) : ImageConfigProperty {
      public override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

      public override fun entryPoint(): List<String> = unwrap(this).getEntryPoint() ?: emptyList()

      public override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ImageConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty):
          ImageConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.ImageConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DestinationProperty {
    public fun destination(): String

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun destination(destination: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty.builder()

      public override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty,
    ) : DestinationProperty {
      public override fun destination(): String = unwrap(this).getDestination()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty):
          DestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationProperty):
          software.amazon.awscdk.services.sam.CfnFunction.DestinationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CloudWatchEventEventProperty {
    public fun input(): String? = unwrap(this).getInput()

    public fun inputPath(): String? = unwrap(this).getInputPath()

    public fun pattern(): Any

    public interface Builder {
      public fun input(input: String) {
      }

      public fun inputPath(inputPath: String) {
      }

      public fun pattern(pattern: Any) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty.builder()

      public override fun input(input: String) {
        cdkBuilder.input(input)
      }

      public override fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
      }

      public override fun pattern(pattern: Any) {
        cdkBuilder.pattern(pattern)
      }

      public fun build():
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty,
    ) : CloudWatchEventEventProperty {
      public override fun input(): String? = unwrap(this).getInput()

      public override fun inputPath(): String? = unwrap(this).getInputPath()

      public override fun pattern(): Any = unwrap(this).getPattern()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CloudWatchEventEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty):
          CloudWatchEventEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchEventEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.CloudWatchEventEventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FileSystemConfigProperty {
    public fun arn(): String? = unwrap(this).getArn()

    public fun localMountPath(): String? = unwrap(this).getLocalMountPath()

    public interface Builder {
      public fun arn(arn: String) {
      }

      public fun localMountPath(localMountPath: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.FileSystemConfigProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.FileSystemConfigProperty.builder()

      public override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public override fun localMountPath(localMountPath: String) {
        cdkBuilder.localMountPath(localMountPath)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.FileSystemConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.FileSystemConfigProperty,
    ) : FileSystemConfigProperty {
      public override fun arn(): String? = unwrap(this).getArn()

      public override fun localMountPath(): String? = unwrap(this).getLocalMountPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FileSystemConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.FileSystemConfigProperty):
          FileSystemConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileSystemConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.FileSystemConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ApiEventProperty {
    public fun auth(): Any? = unwrap(this).getAuth()

    public fun method(): String

    public fun path(): String

    public fun requestModel(): Any? = unwrap(this).getRequestModel()

    public fun requestParameters(): Any? = unwrap(this).getRequestParameters()

    public fun restApiId(): String? = unwrap(this).getRestApiId()

    public interface Builder {
      public fun auth(auth: IResolvable) {
      }

      public fun auth(auth: AuthProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("589a0e2ee65f9fb0a050563bd1dcbbd68692bf4d0c4e884d6d65cc546d27d8d2")
      public fun auth(auth: AuthProperty.Builder.() -> Unit) {
      }

      public fun method(method: String) {
      }

      public fun path(path: String) {
      }

      public fun requestModel(requestModel: IResolvable) {
      }

      public fun requestModel(requestModel: RequestModelProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e619423cfa57e3e91d2a78d27f5572978ed94902f4098b693b00608cd894ad6")
      public fun requestModel(requestModel: RequestModelProperty.Builder.() -> Unit) {
      }

      public fun requestParameters(requestParameters: IResolvable) {
      }

      public fun requestParameters(requestParameters: List<Any>) {
      }

      public fun restApiId(restApiId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty.builder()

      public override fun auth(auth: IResolvable) {
        cdkBuilder.auth(auth.let(IResolvable::unwrap))
      }

      public override fun auth(auth: AuthProperty) {
        cdkBuilder.auth(auth.let(AuthProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("589a0e2ee65f9fb0a050563bd1dcbbd68692bf4d0c4e884d6d65cc546d27d8d2")
      public override fun auth(auth: AuthProperty.Builder.() -> Unit): Unit =
          auth(AuthProperty(auth))

      public override fun method(method: String) {
        cdkBuilder.method(method)
      }

      public override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public override fun requestModel(requestModel: IResolvable) {
        cdkBuilder.requestModel(requestModel.let(IResolvable::unwrap))
      }

      public override fun requestModel(requestModel: RequestModelProperty) {
        cdkBuilder.requestModel(requestModel.let(RequestModelProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e619423cfa57e3e91d2a78d27f5572978ed94902f4098b693b00608cd894ad6")
      public override fun requestModel(requestModel: RequestModelProperty.Builder.() -> Unit): Unit
          = requestModel(RequestModelProperty(requestModel))

      public override fun requestParameters(requestParameters: IResolvable) {
        cdkBuilder.requestParameters(requestParameters.let(IResolvable::unwrap))
      }

      public override fun requestParameters(requestParameters: List<Any>) {
        cdkBuilder.requestParameters(requestParameters)
      }

      public override fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty,
    ) : ApiEventProperty {
      public override fun auth(): Any? = unwrap(this).getAuth()

      public override fun method(): String = unwrap(this).getMethod()

      public override fun path(): String = unwrap(this).getPath()

      public override fun requestModel(): Any? = unwrap(this).getRequestModel()

      public override fun requestParameters(): Any? = unwrap(this).getRequestParameters()

      public override fun restApiId(): String? = unwrap(this).getRestApiId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ApiEventProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty):
          ApiEventProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApiEventProperty):
          software.amazon.awscdk.services.sam.CfnFunction.ApiEventProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TableStreamSAMPTProperty {
    public fun streamName(): String

    public fun tableName(): String

    public interface Builder {
      public fun streamName(streamName: String) {
      }

      public fun tableName(tableName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty.builder()

      public override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      public override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty,
    ) : TableStreamSAMPTProperty {
      public override fun streamName(): String = unwrap(this).getStreamName()

      public override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TableStreamSAMPTProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty):
          TableStreamSAMPTProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableStreamSAMPTProperty):
          software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EventInvokeConfigProperty {
    public fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

    public fun maximumEventAgeInSeconds(): Number? = unwrap(this).getMaximumEventAgeInSeconds()

    public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    public interface Builder {
      public fun destinationConfig(destinationConfig: IResolvable) {
      }

      public fun destinationConfig(destinationConfig: EventInvokeDestinationConfigProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69af1f321f9864f4c1998824f84744ef5d25848eacf880f28156352c8caffe12")
      public
          fun destinationConfig(destinationConfig: EventInvokeDestinationConfigProperty.Builder.() -> Unit) {
      }

      public fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
      }

      public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty.Builder =
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty.builder()

      public override fun destinationConfig(destinationConfig: IResolvable) {
        cdkBuilder.destinationConfig(destinationConfig.let(IResolvable::unwrap))
      }

      public override
          fun destinationConfig(destinationConfig: EventInvokeDestinationConfigProperty) {
        cdkBuilder.destinationConfig(destinationConfig.let(EventInvokeDestinationConfigProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69af1f321f9864f4c1998824f84744ef5d25848eacf880f28156352c8caffe12")
      public override
          fun destinationConfig(destinationConfig: EventInvokeDestinationConfigProperty.Builder.() -> Unit):
          Unit = destinationConfig(EventInvokeDestinationConfigProperty(destinationConfig))

      public override fun maximumEventAgeInSeconds(maximumEventAgeInSeconds: Number) {
        cdkBuilder.maximumEventAgeInSeconds(maximumEventAgeInSeconds)
      }

      public override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
      }

      public fun build(): software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty,
    ) : EventInvokeConfigProperty {
      public override fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

      public override fun maximumEventAgeInSeconds(): Number? =
          unwrap(this).getMaximumEventAgeInSeconds()

      public override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventInvokeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty):
          EventInvokeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventInvokeConfigProperty):
          software.amazon.awscdk.services.sam.CfnFunction.EventInvokeConfigProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
