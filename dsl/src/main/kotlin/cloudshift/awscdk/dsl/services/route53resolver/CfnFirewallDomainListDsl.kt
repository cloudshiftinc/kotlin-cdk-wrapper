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

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53resolver.CfnFirewallDomainList
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFirewallDomainListDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFirewallDomainList.Builder =
        CfnFirewallDomainList.Builder.create(scope, id)

    private val _domains: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun domainFileUrl(domainFileUrl: String) {
        cdkBuilder.domainFileUrl(domainFileUrl)
    }

    public fun domains(vararg domains: String) {
        _domains.addAll(listOf(*domains))
    }

    public fun domains(domains: Collection<String>) {
        _domains.addAll(domains)
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

    public fun build(): CfnFirewallDomainList {
        if (_domains.isNotEmpty()) cdkBuilder.domains(_domains)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
