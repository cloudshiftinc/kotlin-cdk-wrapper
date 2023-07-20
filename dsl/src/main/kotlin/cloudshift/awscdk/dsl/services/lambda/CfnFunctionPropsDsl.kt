@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnFunction
import software.amazon.awscdk.services.lambda.CfnFunctionProps
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFunctionPropsDsl {
    private val cdkBuilder: CfnFunctionProps.Builder = CfnFunctionProps.builder()

    private val _architectures: MutableList<String> = mutableListOf()

    private val _fileSystemConfigs: MutableList<Any> = mutableListOf()

    private val _layers: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun architectures(vararg architectures: String) {
        _architectures.addAll(listOf(*architectures))
    }

    public fun architectures(architectures: Collection<String>) {
        _architectures.addAll(architectures)
    }

    public fun code(code: IResolvable) {
        cdkBuilder.code(code)
    }

    public fun code(code: CfnFunction.CodeProperty) {
        cdkBuilder.code(code)
    }

    public fun codeSigningConfigArn(codeSigningConfigArn: String) {
        cdkBuilder.codeSigningConfigArn(codeSigningConfigArn)
    }

    public fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig)
    }

    public fun deadLetterConfig(deadLetterConfig: CfnFunction.DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    public fun environment(environment: CfnFunction.EnvironmentProperty) {
        cdkBuilder.environment(environment)
    }

    public fun ephemeralStorage(ephemeralStorage: IResolvable) {
        cdkBuilder.ephemeralStorage(ephemeralStorage)
    }

    public fun ephemeralStorage(ephemeralStorage: CfnFunction.EphemeralStorageProperty) {
        cdkBuilder.ephemeralStorage(ephemeralStorage)
    }

    public fun fileSystemConfigs(vararg fileSystemConfigs: Any) {
        _fileSystemConfigs.addAll(listOf(*fileSystemConfigs))
    }

    public fun fileSystemConfigs(fileSystemConfigs: Collection<Any>) {
        _fileSystemConfigs.addAll(fileSystemConfigs)
    }

    public fun fileSystemConfigs(fileSystemConfigs: IResolvable) {
        cdkBuilder.fileSystemConfigs(fileSystemConfigs)
    }

    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    public fun handler(handler: String) {
        cdkBuilder.handler(handler)
    }

    public fun imageConfig(imageConfig: IResolvable) {
        cdkBuilder.imageConfig(imageConfig)
    }

    public fun imageConfig(imageConfig: CfnFunction.ImageConfigProperty) {
        cdkBuilder.imageConfig(imageConfig)
    }

    public fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    public fun layers(vararg layers: String) {
        _layers.addAll(listOf(*layers))
    }

    public fun layers(layers: Collection<String>) {
        _layers.addAll(layers)
    }

    public fun memorySize(memorySize: Number) {
        cdkBuilder.memorySize(memorySize)
    }

    public fun packageType(packageType: String) {
        cdkBuilder.packageType(packageType)
    }

    public fun reservedConcurrentExecutions(reservedConcurrentExecutions: Number) {
        cdkBuilder.reservedConcurrentExecutions(reservedConcurrentExecutions)
    }

    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    public fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
    }

    public fun runtimeManagementConfig(runtimeManagementConfig: IResolvable) {
        cdkBuilder.runtimeManagementConfig(runtimeManagementConfig)
    }

    public fun runtimeManagementConfig(runtimeManagementConfig: CfnFunction.RuntimeManagementConfigProperty) {
        cdkBuilder.runtimeManagementConfig(runtimeManagementConfig)
    }

    public fun snapStart(snapStart: IResolvable) {
        cdkBuilder.snapStart(snapStart)
    }

    public fun snapStart(snapStart: CfnFunction.SnapStartProperty) {
        cdkBuilder.snapStart(snapStart)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
    }

    public fun tracingConfig(tracingConfig: IResolvable) {
        cdkBuilder.tracingConfig(tracingConfig)
    }

    public fun tracingConfig(tracingConfig: CfnFunction.TracingConfigProperty) {
        cdkBuilder.tracingConfig(tracingConfig)
    }

    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun vpcConfig(vpcConfig: CfnFunction.VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnFunctionProps {
        if (_architectures.isNotEmpty()) cdkBuilder.architectures(_architectures)
        if (_fileSystemConfigs.isNotEmpty()) cdkBuilder.fileSystemConfigs(_fileSystemConfigs)
        if (_layers.isNotEmpty()) cdkBuilder.layers(_layers)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
