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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iot.CfnDimension
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDimensionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDimension.Builder = CfnDimension.Builder.create(scope, id)

    private val _stringValues: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun stringValues(vararg stringValues: String) {
        _stringValues.addAll(listOf(*stringValues))
    }

    public fun stringValues(stringValues: Collection<String>) {
        _stringValues.addAll(stringValues)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDimension {
        if (_stringValues.isNotEmpty()) cdkBuilder.stringValues(_stringValues)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
