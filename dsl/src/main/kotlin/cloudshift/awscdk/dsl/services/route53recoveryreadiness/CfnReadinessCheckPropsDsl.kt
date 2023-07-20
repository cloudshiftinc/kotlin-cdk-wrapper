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
import software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnReadinessCheckPropsDsl {
    private val cdkBuilder: CfnReadinessCheckProps.Builder = CfnReadinessCheckProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun readinessCheckName(readinessCheckName: String) {
        cdkBuilder.readinessCheckName(readinessCheckName)
    }

    public fun resourceSetName(resourceSetName: String) {
        cdkBuilder.resourceSetName(resourceSetName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnReadinessCheckProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
