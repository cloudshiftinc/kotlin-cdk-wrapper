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

package cloudshift.awscdk.dsl.services.codeartifact

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.codeartifact.CfnDomain
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDomainDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDomain.Builder = CfnDomain.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun encryptionKey(encryptionKey: String) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun permissionsPolicyDocument(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.permissionsPolicyDocument(builder.map)
    }

    public fun permissionsPolicyDocument(permissionsPolicyDocument: Any) {
        cdkBuilder.permissionsPolicyDocument(permissionsPolicyDocument)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDomain {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
