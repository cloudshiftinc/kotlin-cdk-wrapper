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

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnComponentTypeDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnComponentType.Builder = CfnComponentType.Builder.create(scope, id)

    private val _extendsFrom: MutableList<String> = mutableListOf()

    public fun componentTypeId(componentTypeId: String) {
        cdkBuilder.componentTypeId(componentTypeId)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun extendsFrom(vararg extendsFrom: String) {
        _extendsFrom.addAll(listOf(*extendsFrom))
    }

    public fun extendsFrom(extendsFrom: Collection<String>) {
        _extendsFrom.addAll(extendsFrom)
    }

    public fun functions(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.functions(builder.map)
    }

    public fun functions(functions: Map<String, Any>) {
        cdkBuilder.functions(functions)
    }

    public fun functions(functions: IResolvable) {
        cdkBuilder.functions(functions)
    }

    public fun isSingleton(isSingleton: Boolean) {
        cdkBuilder.isSingleton(isSingleton)
    }

    public fun isSingleton(isSingleton: IResolvable) {
        cdkBuilder.isSingleton(isSingleton)
    }

    public fun propertyDefinitions(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.propertyDefinitions(builder.map)
    }

    public fun propertyDefinitions(propertyDefinitions: Map<String, Any>) {
        cdkBuilder.propertyDefinitions(propertyDefinitions)
    }

    public fun propertyDefinitions(propertyDefinitions: IResolvable) {
        cdkBuilder.propertyDefinitions(propertyDefinitions)
    }

    public fun propertyGroups(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.propertyGroups(builder.map)
    }

    public fun propertyGroups(propertyGroups: Map<String, Any>) {
        cdkBuilder.propertyGroups(propertyGroups)
    }

    public fun propertyGroups(propertyGroups: IResolvable) {
        cdkBuilder.propertyGroups(propertyGroups)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun workspaceId(workspaceId: String) {
        cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): CfnComponentType {
        if (_extendsFrom.isNotEmpty()) cdkBuilder.extendsFrom(_extendsFrom)
        return cdkBuilder.build()
    }
}
