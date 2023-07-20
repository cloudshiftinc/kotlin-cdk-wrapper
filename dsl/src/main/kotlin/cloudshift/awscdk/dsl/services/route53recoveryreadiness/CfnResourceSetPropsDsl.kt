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

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSetProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnResourceSetPropsDsl {
    private val cdkBuilder: CfnResourceSetProps.Builder = CfnResourceSetProps.builder()

    private val _resources: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun resourceSetName(resourceSetName: String) {
        cdkBuilder.resourceSetName(resourceSetName)
    }

    public fun resourceSetType(resourceSetType: String) {
        cdkBuilder.resourceSetType(resourceSetType)
    }

    public fun resources(vararg resources: Any) {
        _resources.addAll(listOf(*resources))
    }

    public fun resources(resources: Collection<Any>) {
        _resources.addAll(resources)
    }

    public fun resources(resources: IResolvable) {
        cdkBuilder.resources(resources)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnResourceSetProps {
        if (_resources.isNotEmpty()) cdkBuilder.resources(_resources)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
