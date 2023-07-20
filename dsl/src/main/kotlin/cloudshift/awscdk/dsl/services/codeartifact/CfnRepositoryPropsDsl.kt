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
import software.amazon.awscdk.services.codeartifact.CfnRepositoryProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRepositoryPropsDsl {
    private val cdkBuilder: CfnRepositoryProps.Builder = CfnRepositoryProps.builder()

    private val _externalConnections: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _upstreams: MutableList<String> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun domainOwner(domainOwner: String) {
        cdkBuilder.domainOwner(domainOwner)
    }

    public fun externalConnections(vararg externalConnections: String) {
        _externalConnections.addAll(listOf(*externalConnections))
    }

    public fun externalConnections(externalConnections: Collection<String>) {
        _externalConnections.addAll(externalConnections)
    }

    public fun permissionsPolicyDocument(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.permissionsPolicyDocument(builder.map)
    }

    public fun permissionsPolicyDocument(permissionsPolicyDocument: Any) {
        cdkBuilder.permissionsPolicyDocument(permissionsPolicyDocument)
    }

    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun upstreams(vararg upstreams: String) {
        _upstreams.addAll(listOf(*upstreams))
    }

    public fun upstreams(upstreams: Collection<String>) {
        _upstreams.addAll(upstreams)
    }

    public fun build(): CfnRepositoryProps {
        if (_externalConnections.isNotEmpty()) cdkBuilder.externalConnections(_externalConnections)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_upstreams.isNotEmpty()) cdkBuilder.upstreams(_upstreams)
        return cdkBuilder.build()
    }
}
