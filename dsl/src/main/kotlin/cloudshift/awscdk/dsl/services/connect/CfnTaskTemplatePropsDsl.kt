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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnTaskTemplateProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTaskTemplatePropsDsl {
    private val cdkBuilder: CfnTaskTemplateProps.Builder = CfnTaskTemplateProps.builder()

    private val _defaults: MutableList<Any> = mutableListOf()

    private val _fields: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun clientToken(clientToken: String) {
        cdkBuilder.clientToken(clientToken)
    }

    public fun constraints(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.constraints(builder.map)
    }

    public fun constraints(constraints: Any) {
        cdkBuilder.constraints(constraints)
    }

    public fun contactFlowArn(contactFlowArn: String) {
        cdkBuilder.contactFlowArn(contactFlowArn)
    }

    public fun defaults(vararg defaults: Any) {
        _defaults.addAll(listOf(*defaults))
    }

    public fun defaults(defaults: Collection<Any>) {
        _defaults.addAll(defaults)
    }

    public fun defaults(defaults: IResolvable) {
        cdkBuilder.defaults(defaults)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun fields(vararg fields: Any) {
        _fields.addAll(listOf(*fields))
    }

    public fun fields(fields: Collection<Any>) {
        _fields.addAll(fields)
    }

    public fun fields(fields: IResolvable) {
        cdkBuilder.fields(fields)
    }

    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnTaskTemplateProps {
        if (_defaults.isNotEmpty()) cdkBuilder.defaults(_defaults)
        if (_fields.isNotEmpty()) cdkBuilder.fields(_fields)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
