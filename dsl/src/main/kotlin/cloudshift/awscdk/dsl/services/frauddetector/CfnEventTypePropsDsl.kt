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

package cloudshift.awscdk.dsl.services.frauddetector

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.frauddetector.CfnEventTypeProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEventTypePropsDsl {
    private val cdkBuilder: CfnEventTypeProps.Builder = CfnEventTypeProps.builder()

    private val _entityTypes: MutableList<Any> = mutableListOf()

    private val _eventVariables: MutableList<Any> = mutableListOf()

    private val _labels: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun entityTypes(vararg entityTypes: Any) {
        _entityTypes.addAll(listOf(*entityTypes))
    }

    public fun entityTypes(entityTypes: Collection<Any>) {
        _entityTypes.addAll(entityTypes)
    }

    public fun entityTypes(entityTypes: IResolvable) {
        cdkBuilder.entityTypes(entityTypes)
    }

    public fun eventVariables(vararg eventVariables: Any) {
        _eventVariables.addAll(listOf(*eventVariables))
    }

    public fun eventVariables(eventVariables: Collection<Any>) {
        _eventVariables.addAll(eventVariables)
    }

    public fun eventVariables(eventVariables: IResolvable) {
        cdkBuilder.eventVariables(eventVariables)
    }

    public fun labels(vararg labels: Any) {
        _labels.addAll(listOf(*labels))
    }

    public fun labels(labels: Collection<Any>) {
        _labels.addAll(labels)
    }

    public fun labels(labels: IResolvable) {
        cdkBuilder.labels(labels)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEventTypeProps {
        if (_entityTypes.isNotEmpty()) cdkBuilder.entityTypes(_entityTypes)
        if (_eventVariables.isNotEmpty()) cdkBuilder.eventVariables(_eventVariables)
        if (_labels.isNotEmpty()) cdkBuilder.labels(_labels)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
