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

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.synthetics.CfnGroupProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnGroupPropsDsl {
    private val cdkBuilder: CfnGroupProps.Builder = CfnGroupProps.builder()

    private val _resourceArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun resourceArns(vararg resourceArns: String) {
        _resourceArns.addAll(listOf(*resourceArns))
    }

    public fun resourceArns(resourceArns: Collection<String>) {
        _resourceArns.addAll(resourceArns)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnGroupProps {
        if (_resourceArns.isNotEmpty()) cdkBuilder.resourceArns(_resourceArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
