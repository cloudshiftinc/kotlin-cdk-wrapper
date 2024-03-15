@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFunctionProps {
  public fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

  public fun code(): Any

  public fun codeSigningConfigArn(): String? = unwrap(this).getCodeSigningConfigArn()

  public fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

  public fun description(): String? = unwrap(this).getDescription()

  public fun environment(): Any? = unwrap(this).getEnvironment()

  public fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

  public fun fileSystemConfigs(): Any? = unwrap(this).getFileSystemConfigs()

  public fun functionName(): String? = unwrap(this).getFunctionName()

  public fun handler(): String? = unwrap(this).getHandler()

  public fun imageConfig(): Any? = unwrap(this).getImageConfig()

  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public fun layers(): List<String> = unwrap(this).getLayers() ?: emptyList()

  public fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

  public fun memorySize(): Number? = unwrap(this).getMemorySize()

  public fun packageType(): String? = unwrap(this).getPackageType()

  public fun reservedConcurrentExecutions(): Number? =
      unwrap(this).getReservedConcurrentExecutions()

  public fun role(): String

  public fun runtime(): String? = unwrap(this).getRuntime()

  public fun runtimeManagementConfig(): Any? = unwrap(this).getRuntimeManagementConfig()

  public fun snapStart(): Any? = unwrap(this).getSnapStart()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun timeout(): Number? = unwrap(this).getTimeout()

  public fun tracingConfig(): Any? = unwrap(this).getTracingConfig()

  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  @CdkDslMarker
  public interface Builder {
    public fun architectures(architectures: List<String>)

    public fun architectures(vararg architectures: String)

    public fun code(code: IResolvable)

    public fun code(code: CfnFunction.CodeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c52ce7080f82852b50c083937168f8621fc464d4066a012690476c2b249079b")
    public fun code(code: CfnFunction.CodeProperty.Builder.() -> Unit)

    public fun codeSigningConfigArn(codeSigningConfigArn: String)

    public fun deadLetterConfig(deadLetterConfig: IResolvable)

    public fun deadLetterConfig(deadLetterConfig: CfnFunction.DeadLetterConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d4f1762c765af746c14b00547fb2ca15aa43dcee751128bbc9b947042c57747")
    public
        fun deadLetterConfig(deadLetterConfig: CfnFunction.DeadLetterConfigProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun environment(environment: IResolvable)

    public fun environment(environment: CfnFunction.EnvironmentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b3a85e88e7a4197ee6e1cdb4110e15edcd07a668fdb27de3fb181d90d98778e")
    public fun environment(environment: CfnFunction.EnvironmentProperty.Builder.() -> Unit)

    public fun ephemeralStorage(ephemeralStorage: IResolvable)

    public fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e474b10e7ad2e75ec5c28030ceb31899ff7f3339e5c4508d94dbc7fb3efb260")
    public
        fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty.Builder.() -> Unit)

    public fun fileSystemConfigs(fileSystemConfigs: IResolvable)

    public fun fileSystemConfigs(fileSystemConfigs: List<Any>)

    public fun fileSystemConfigs(vararg fileSystemConfigs: Any)

    public fun functionName(functionName: String)

    public fun handler(handler: String)

    public fun imageConfig(imageConfig: IResolvable)

    public fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1997324bc2087618fc0e50de6b9eed554e767b3bbda6d845bbee3db1be1277e6")
    public fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty.Builder.() -> Unit)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun layers(layers: List<String>)

    public fun layers(vararg layers: String)

    public fun loggingConfig(loggingConfig: IResolvable)

    public fun loggingConfig(loggingConfig: CfnFunction.LoggingConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec44b63b2176f8c25e5e01fcf663beca7e89dabaed7dd493d681fa5644914e19")
    public fun loggingConfig(loggingConfig: CfnFunction.LoggingConfigProperty.Builder.() -> Unit)

    public fun memorySize(memorySize: Number)

    public fun packageType(packageType: String)

    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number)

    public fun role(role: String)

    public fun runtime(runtime: String)

    public fun runtimeManagementConfig(runtimeManagementConfig: IResolvable)

    public
        fun runtimeManagementConfig(runtimeManagementConfig: CfnFunction.RuntimeManagementConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee237fa0a46e8520d21d94c5b1083490aad6f8069ebae77e7cc99088187b3da4")
    public
        fun runtimeManagementConfig(runtimeManagementConfig: CfnFunction.RuntimeManagementConfigProperty.Builder.() -> Unit)

    public fun snapStart(snapStart: IResolvable)

    public fun snapStart(snapStart: CfnFunction.SnapStartProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3c406d178cea826eb1e4103e92ba770b5f74b157127cf053b280c97a7ef5cbc")
    public fun snapStart(snapStart: CfnFunction.SnapStartProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeout(timeout: Number)

    public fun tracingConfig(tracingConfig: IResolvable)

    public fun tracingConfig(tracingConfig: CfnFunction.TracingConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1617c559ff9d0a323cae6bd48c5daadfd680645588ee9571a1adb94b84a4ce89")
    public fun tracingConfig(tracingConfig: CfnFunction.TracingConfigProperty.Builder.() -> Unit)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac174c422fe09fe59e61bc17b79df1128fc471b376ea523d527a49b2d14fb1fc")
    public fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnFunctionProps.Builder =
        software.amazon.awscdk.services.lambda.CfnFunctionProps.builder()

    override fun architectures(architectures: List<String>) {
      cdkBuilder.architectures(architectures)
    }

    override fun architectures(vararg architectures: String): Unit =
        architectures(architectures.toList())

    override fun code(code: IResolvable) {
      cdkBuilder.code(code.let(IResolvable::unwrap))
    }

    override fun code(code: CfnFunction.CodeProperty) {
      cdkBuilder.code(code.let(CfnFunction.CodeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c52ce7080f82852b50c083937168f8621fc464d4066a012690476c2b249079b")
    override fun code(code: CfnFunction.CodeProperty.Builder.() -> Unit): Unit =
        code(CfnFunction.CodeProperty(code))

    override fun codeSigningConfigArn(codeSigningConfigArn: String) {
      cdkBuilder.codeSigningConfigArn(codeSigningConfigArn)
    }

    override fun deadLetterConfig(deadLetterConfig: IResolvable) {
      cdkBuilder.deadLetterConfig(deadLetterConfig.let(IResolvable::unwrap))
    }

    override fun deadLetterConfig(deadLetterConfig: CfnFunction.DeadLetterConfigProperty) {
      cdkBuilder.deadLetterConfig(deadLetterConfig.let(CfnFunction.DeadLetterConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d4f1762c765af746c14b00547fb2ca15aa43dcee751128bbc9b947042c57747")
    override
        fun deadLetterConfig(deadLetterConfig: CfnFunction.DeadLetterConfigProperty.Builder.() -> Unit):
        Unit = deadLetterConfig(CfnFunction.DeadLetterConfigProperty(deadLetterConfig))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun environment(environment: IResolvable) {
      cdkBuilder.environment(environment.let(IResolvable::unwrap))
    }

    override fun environment(environment: CfnFunction.EnvironmentProperty) {
      cdkBuilder.environment(environment.let(CfnFunction.EnvironmentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b3a85e88e7a4197ee6e1cdb4110e15edcd07a668fdb27de3fb181d90d98778e")
    override fun environment(environment: CfnFunction.EnvironmentProperty.Builder.() -> Unit): Unit
        = environment(CfnFunction.EnvironmentProperty(environment))

    override fun ephemeralStorage(ephemeralStorage: IResolvable) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(IResolvable::unwrap))
    }

    override fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty) {
      cdkBuilder.ephemeralStorage(ephemeralStorage.let(CfnFunction.EphemeralStorageProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e474b10e7ad2e75ec5c28030ceb31899ff7f3339e5c4508d94dbc7fb3efb260")
    override
        fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty.Builder.() -> Unit):
        Unit = ephemeralStorage(CfnFunction.EphemeralStorageProperty(ephemeralStorage))

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
    @JvmName("1997324bc2087618fc0e50de6b9eed554e767b3bbda6d845bbee3db1be1277e6")
    override fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty.Builder.() -> Unit): Unit
        = imageConfig(CfnFunction.ImageConfigProperty(imageConfig))

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun layers(layers: List<String>) {
      cdkBuilder.layers(layers)
    }

    override fun layers(vararg layers: String): Unit = layers(layers.toList())

    override fun loggingConfig(loggingConfig: IResolvable) {
      cdkBuilder.loggingConfig(loggingConfig.let(IResolvable::unwrap))
    }

    override fun loggingConfig(loggingConfig: CfnFunction.LoggingConfigProperty) {
      cdkBuilder.loggingConfig(loggingConfig.let(CfnFunction.LoggingConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec44b63b2176f8c25e5e01fcf663beca7e89dabaed7dd493d681fa5644914e19")
    override fun loggingConfig(loggingConfig: CfnFunction.LoggingConfigProperty.Builder.() -> Unit):
        Unit = loggingConfig(CfnFunction.LoggingConfigProperty(loggingConfig))

    override fun memorySize(memorySize: Number) {
      cdkBuilder.memorySize(memorySize)
    }

    override fun packageType(packageType: String) {
      cdkBuilder.packageType(packageType)
    }

    override fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
      cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    override fun runtime(runtime: String) {
      cdkBuilder.runtime(runtime)
    }

    override fun runtimeManagementConfig(runtimeManagementConfig: IResolvable) {
      cdkBuilder.runtimeManagementConfig(runtimeManagementConfig.let(IResolvable::unwrap))
    }

    override
        fun runtimeManagementConfig(runtimeManagementConfig: CfnFunction.RuntimeManagementConfigProperty) {
      cdkBuilder.runtimeManagementConfig(runtimeManagementConfig.let(CfnFunction.RuntimeManagementConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee237fa0a46e8520d21d94c5b1083490aad6f8069ebae77e7cc99088187b3da4")
    override
        fun runtimeManagementConfig(runtimeManagementConfig: CfnFunction.RuntimeManagementConfigProperty.Builder.() -> Unit):
        Unit =
        runtimeManagementConfig(CfnFunction.RuntimeManagementConfigProperty(runtimeManagementConfig))

    override fun snapStart(snapStart: IResolvable) {
      cdkBuilder.snapStart(snapStart.let(IResolvable::unwrap))
    }

    override fun snapStart(snapStart: CfnFunction.SnapStartProperty) {
      cdkBuilder.snapStart(snapStart.let(CfnFunction.SnapStartProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3c406d178cea826eb1e4103e92ba770b5f74b157127cf053b280c97a7ef5cbc")
    override fun snapStart(snapStart: CfnFunction.SnapStartProperty.Builder.() -> Unit): Unit =
        snapStart(CfnFunction.SnapStartProperty(snapStart))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    override fun tracingConfig(tracingConfig: IResolvable) {
      cdkBuilder.tracingConfig(tracingConfig.let(IResolvable::unwrap))
    }

    override fun tracingConfig(tracingConfig: CfnFunction.TracingConfigProperty) {
      cdkBuilder.tracingConfig(tracingConfig.let(CfnFunction.TracingConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1617c559ff9d0a323cae6bd48c5daadfd680645588ee9571a1adb94b84a4ce89")
    override fun tracingConfig(tracingConfig: CfnFunction.TracingConfigProperty.Builder.() -> Unit):
        Unit = tracingConfig(CfnFunction.TracingConfigProperty(tracingConfig))

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnFunction.VpcConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac174c422fe09fe59e61bc17b79df1128fc471b376ea523d527a49b2d14fb1fc")
    override fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnFunction.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.lambda.CfnFunctionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CfnFunctionProps,
  ) : CdkObject(cdkObject), CfnFunctionProps {
    override fun architectures(): List<String> = unwrap(this).getArchitectures() ?: emptyList()

    override fun code(): Any = unwrap(this).getCode()

    override fun codeSigningConfigArn(): String? = unwrap(this).getCodeSigningConfigArn()

    override fun deadLetterConfig(): Any? = unwrap(this).getDeadLetterConfig()

    override fun description(): String? = unwrap(this).getDescription()

    override fun environment(): Any? = unwrap(this).getEnvironment()

    override fun ephemeralStorage(): Any? = unwrap(this).getEphemeralStorage()

    override fun fileSystemConfigs(): Any? = unwrap(this).getFileSystemConfigs()

    override fun functionName(): String? = unwrap(this).getFunctionName()

    override fun handler(): String? = unwrap(this).getHandler()

    override fun imageConfig(): Any? = unwrap(this).getImageConfig()

    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    override fun layers(): List<String> = unwrap(this).getLayers() ?: emptyList()

    override fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

    override fun memorySize(): Number? = unwrap(this).getMemorySize()

    override fun packageType(): String? = unwrap(this).getPackageType()

    override fun reservedConcurrentExecutions(): Number? =
        unwrap(this).getReservedConcurrentExecutions()

    override fun role(): String = unwrap(this).getRole()

    override fun runtime(): String? = unwrap(this).getRuntime()

    override fun runtimeManagementConfig(): Any? = unwrap(this).getRuntimeManagementConfig()

    override fun snapStart(): Any? = unwrap(this).getSnapStart()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun timeout(): Number? = unwrap(this).getTimeout()

    override fun tracingConfig(): Any? = unwrap(this).getTracingConfig()

    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFunctionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnFunctionProps):
        CfnFunctionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionProps):
        software.amazon.awscdk.services.lambda.CfnFunctionProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.CfnFunctionProps
  }
}
