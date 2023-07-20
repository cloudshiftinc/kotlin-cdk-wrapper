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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnObjectTypeProps
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnObjectTypePropsDsl {
    private val cdkBuilder: CfnObjectTypeProps.Builder = CfnObjectTypeProps.builder()

    private val _fields: MutableList<Any> = mutableListOf()

    private val _keys: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun allowProfileCreation(allowProfileCreation: Boolean) {
        cdkBuilder.allowProfileCreation(allowProfileCreation)
    }

    public fun allowProfileCreation(allowProfileCreation: IResolvable) {
        cdkBuilder.allowProfileCreation(allowProfileCreation)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun encryptionKey(encryptionKey: String) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun expirationDays(expirationDays: Number) {
        cdkBuilder.expirationDays(expirationDays)
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

    public fun keys(vararg keys: Any) {
        _keys.addAll(listOf(*keys))
    }

    public fun keys(keys: Collection<Any>) {
        _keys.addAll(keys)
    }

    public fun keys(keys: IResolvable) {
        cdkBuilder.keys(keys)
    }

    public fun objectTypeName(objectTypeName: String) {
        cdkBuilder.objectTypeName(objectTypeName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun templateId(templateId: String) {
        cdkBuilder.templateId(templateId)
    }

    public fun build(): CfnObjectTypeProps {
        if (_fields.isNotEmpty()) cdkBuilder.fields(_fields)
        if (_keys.isNotEmpty()) cdkBuilder.keys(_keys)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
