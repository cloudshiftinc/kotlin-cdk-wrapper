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

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.backup.CfnFramework
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFrameworkControlScopePropertyDsl {
    private val cdkBuilder: CfnFramework.ControlScopeProperty.Builder =
        CfnFramework.ControlScopeProperty.builder()

    private val _complianceResourceIds: MutableList<String> = mutableListOf()

    private val _complianceResourceTypes: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun complianceResourceIds(vararg complianceResourceIds: String) {
        _complianceResourceIds.addAll(listOf(*complianceResourceIds))
    }

    public fun complianceResourceIds(complianceResourceIds: Collection<String>) {
        _complianceResourceIds.addAll(complianceResourceIds)
    }

    public fun complianceResourceTypes(vararg complianceResourceTypes: String) {
        _complianceResourceTypes.addAll(listOf(*complianceResourceTypes))
    }

    public fun complianceResourceTypes(complianceResourceTypes: Collection<String>) {
        _complianceResourceTypes.addAll(complianceResourceTypes)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFramework.ControlScopeProperty {
        if (_complianceResourceIds.isNotEmpty()) cdkBuilder.complianceResourceIds(_complianceResourceIds)
        if (_complianceResourceTypes.isNotEmpty()) {
            cdkBuilder.complianceResourceTypes(_complianceResourceTypes)
        }
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
