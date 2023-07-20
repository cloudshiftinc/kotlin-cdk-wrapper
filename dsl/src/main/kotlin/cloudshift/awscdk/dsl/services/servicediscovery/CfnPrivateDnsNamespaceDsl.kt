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
import software.amazon.awscdk.services.servicediscovery.CfnPrivateDnsNamespace
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPrivateDnsNamespaceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPrivateDnsNamespace.Builder =
        CfnPrivateDnsNamespace.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties)
    }

    public fun properties(properties: CfnPrivateDnsNamespace.PropertiesProperty) {
        cdkBuilder.properties(properties)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun vpc(vpc: String) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): CfnPrivateDnsNamespace {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
