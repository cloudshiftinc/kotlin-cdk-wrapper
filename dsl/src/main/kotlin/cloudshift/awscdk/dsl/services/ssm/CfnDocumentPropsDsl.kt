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

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnDocumentProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDocumentPropsDsl {
    private val cdkBuilder: CfnDocumentProps.Builder = CfnDocumentProps.builder()

    private val _attachments: MutableList<Any> = mutableListOf()

    private val _requires: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun attachments(vararg attachments: Any) {
        _attachments.addAll(listOf(*attachments))
    }

    public fun attachments(attachments: Collection<Any>) {
        _attachments.addAll(attachments)
    }

    public fun attachments(attachments: IResolvable) {
        cdkBuilder.attachments(attachments)
    }

    public fun content(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.content(builder.map)
    }

    public fun content(content: Any) {
        cdkBuilder.content(content)
    }

    public fun documentFormat(documentFormat: String) {
        cdkBuilder.documentFormat(documentFormat)
    }

    public fun documentType(documentType: String) {
        cdkBuilder.documentType(documentType)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun requires(vararg requires: Any) {
        _requires.addAll(listOf(*requires))
    }

    public fun requires(requires: Collection<Any>) {
        _requires.addAll(requires)
    }

    public fun requires(requires: IResolvable) {
        cdkBuilder.requires(requires)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun targetType(targetType: String) {
        cdkBuilder.targetType(targetType)
    }

    public fun updateMethod(updateMethod: String) {
        cdkBuilder.updateMethod(updateMethod)
    }

    public fun versionName(versionName: String) {
        cdkBuilder.versionName(versionName)
    }

    public fun build(): CfnDocumentProps {
        if (_attachments.isNotEmpty()) cdkBuilder.attachments(_attachments)
        if (_requires.isNotEmpty()) cdkBuilder.requires(_requires)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
