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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnSpace
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnSpaceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSpace.Builder = CfnSpace.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun domainId(domainId: String) {
        cdkBuilder.domainId(domainId)
    }

    public fun spaceName(spaceName: String) {
        cdkBuilder.spaceName(spaceName)
    }

    public fun spaceSettings(spaceSettings: IResolvable) {
        cdkBuilder.spaceSettings(spaceSettings)
    }

    public fun spaceSettings(spaceSettings: CfnSpace.SpaceSettingsProperty) {
        cdkBuilder.spaceSettings(spaceSettings)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSpace {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
