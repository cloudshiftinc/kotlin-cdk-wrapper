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

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.transfer.CfnProfile
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnProfile.Builder = CfnProfile.Builder.create(scope, id)

    private val _certificateIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun as2Id(as2Id: String) {
        cdkBuilder.as2Id(as2Id)
    }

    public fun certificateIds(vararg certificateIds: String) {
        _certificateIds.addAll(listOf(*certificateIds))
    }

    public fun certificateIds(certificateIds: Collection<String>) {
        _certificateIds.addAll(certificateIds)
    }

    public fun profileType(profileType: String) {
        cdkBuilder.profileType(profileType)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnProfile {
        if (_certificateIds.isNotEmpty()) cdkBuilder.certificateIds(_certificateIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
