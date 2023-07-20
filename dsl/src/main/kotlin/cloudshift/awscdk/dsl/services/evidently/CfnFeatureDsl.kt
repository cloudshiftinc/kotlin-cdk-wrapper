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

package cloudshift.awscdk.dsl.services.evidently

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.evidently.CfnFeature
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFeatureDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFeature.Builder = CfnFeature.Builder.create(scope, id)

    private val _entityOverrides: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _variations: MutableList<Any> = mutableListOf()

    public fun defaultVariation(defaultVariation: String) {
        cdkBuilder.defaultVariation(defaultVariation)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun entityOverrides(vararg entityOverrides: Any) {
        _entityOverrides.addAll(listOf(*entityOverrides))
    }

    public fun entityOverrides(entityOverrides: Collection<Any>) {
        _entityOverrides.addAll(entityOverrides)
    }

    public fun entityOverrides(entityOverrides: IResolvable) {
        cdkBuilder.entityOverrides(entityOverrides)
    }

    public fun evaluationStrategy(evaluationStrategy: String) {
        cdkBuilder.evaluationStrategy(evaluationStrategy)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun project(project: String) {
        cdkBuilder.project(project)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun variations(vararg variations: Any) {
        _variations.addAll(listOf(*variations))
    }

    public fun variations(variations: Collection<Any>) {
        _variations.addAll(variations)
    }

    public fun variations(variations: IResolvable) {
        cdkBuilder.variations(variations)
    }

    public fun build(): CfnFeature {
        if (_entityOverrides.isNotEmpty()) cdkBuilder.entityOverrides(_entityOverrides)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_variations.isNotEmpty()) cdkBuilder.variations(_variations)
        return cdkBuilder.build()
    }
}
