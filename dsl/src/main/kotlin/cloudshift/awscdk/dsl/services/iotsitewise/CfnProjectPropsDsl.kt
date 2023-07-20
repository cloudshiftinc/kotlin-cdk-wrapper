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

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotsitewise.CfnProjectProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnProjectPropsDsl {
    private val cdkBuilder: CfnProjectProps.Builder = CfnProjectProps.builder()

    private val _assetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun assetIds(vararg assetIds: String) {
        _assetIds.addAll(listOf(*assetIds))
    }

    public fun assetIds(assetIds: Collection<String>) {
        _assetIds.addAll(assetIds)
    }

    public fun portalId(portalId: String) {
        cdkBuilder.portalId(portalId)
    }

    public fun projectDescription(projectDescription: String) {
        cdkBuilder.projectDescription(projectDescription)
    }

    public fun projectName(projectName: String) {
        cdkBuilder.projectName(projectName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnProjectProps {
        if (_assetIds.isNotEmpty()) cdkBuilder.assetIds(_assetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
