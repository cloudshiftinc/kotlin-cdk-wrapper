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

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnService
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnServiceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnService.Builder = CfnService.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun dnsConfig(dnsConfig: IResolvable) {
        cdkBuilder.dnsConfig(dnsConfig)
    }

    public fun dnsConfig(dnsConfig: CfnService.DnsConfigProperty) {
        cdkBuilder.dnsConfig(dnsConfig)
    }

    public fun healthCheckConfig(healthCheckConfig: IResolvable) {
        cdkBuilder.healthCheckConfig(healthCheckConfig)
    }

    public fun healthCheckConfig(healthCheckConfig: CfnService.HealthCheckConfigProperty) {
        cdkBuilder.healthCheckConfig(healthCheckConfig)
    }

    public fun healthCheckCustomConfig(healthCheckCustomConfig: IResolvable) {
        cdkBuilder.healthCheckCustomConfig(healthCheckCustomConfig)
    }

    public fun healthCheckCustomConfig(healthCheckCustomConfig: CfnService.HealthCheckCustomConfigProperty) {
        cdkBuilder.healthCheckCustomConfig(healthCheckCustomConfig)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun namespaceId(namespaceId: String) {
        cdkBuilder.namespaceId(namespaceId)
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

    public fun build(): CfnService {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
