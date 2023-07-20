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

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnContainerRecipeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnContainerRecipe.Builder = CfnContainerRecipe.Builder.create(scope, id)

    private val _components: MutableList<Any> = mutableListOf()

    public fun components(vararg components: Any) {
        _components.addAll(listOf(*components))
    }

    public fun components(components: Collection<Any>) {
        _components.addAll(components)
    }

    public fun components(components: IResolvable) {
        cdkBuilder.components(components)
    }

    public fun containerType(containerType: String) {
        cdkBuilder.containerType(containerType)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun dockerfileTemplateData(dockerfileTemplateData: String) {
        cdkBuilder.dockerfileTemplateData(dockerfileTemplateData)
    }

    public fun dockerfileTemplateUri(dockerfileTemplateUri: String) {
        cdkBuilder.dockerfileTemplateUri(dockerfileTemplateUri)
    }

    public fun imageOsVersionOverride(imageOsVersionOverride: String) {
        cdkBuilder.imageOsVersionOverride(imageOsVersionOverride)
    }

    public fun instanceConfiguration(instanceConfiguration: IResolvable) {
        cdkBuilder.instanceConfiguration(instanceConfiguration)
    }

    public fun instanceConfiguration(instanceConfiguration: CfnContainerRecipe.InstanceConfigurationProperty) {
        cdkBuilder.instanceConfiguration(instanceConfiguration)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun parentImage(parentImage: String) {
        cdkBuilder.parentImage(parentImage)
    }

    public fun platformOverride(platformOverride: String) {
        cdkBuilder.platformOverride(platformOverride)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun targetRepository(targetRepository: IResolvable) {
        cdkBuilder.targetRepository(targetRepository)
    }

    public fun targetRepository(targetRepository: CfnContainerRecipe.TargetContainerRepositoryProperty) {
        cdkBuilder.targetRepository(targetRepository)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): CfnContainerRecipe {
        if (_components.isNotEmpty()) cdkBuilder.components(_components)
        return cdkBuilder.build()
    }
}
