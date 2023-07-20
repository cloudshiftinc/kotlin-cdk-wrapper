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

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnMissionProfile
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnMissionProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMissionProfile.Builder = CfnMissionProfile.Builder.create(scope, id)

    private val _dataflowEdges: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number) {
        cdkBuilder.contactPostPassDurationSeconds(contactPostPassDurationSeconds)
    }

    public fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number) {
        cdkBuilder.contactPrePassDurationSeconds(contactPrePassDurationSeconds)
    }

    public fun dataflowEdges(vararg dataflowEdges: Any) {
        _dataflowEdges.addAll(listOf(*dataflowEdges))
    }

    public fun dataflowEdges(dataflowEdges: Collection<Any>) {
        _dataflowEdges.addAll(dataflowEdges)
    }

    public fun dataflowEdges(dataflowEdges: IResolvable) {
        cdkBuilder.dataflowEdges(dataflowEdges)
    }

    public fun minimumViableContactDurationSeconds(minimumViableContactDurationSeconds: Number) {
        cdkBuilder.minimumViableContactDurationSeconds(minimumViableContactDurationSeconds)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun streamsKmsKey(streamsKmsKey: IResolvable) {
        cdkBuilder.streamsKmsKey(streamsKmsKey)
    }

    public fun streamsKmsKey(streamsKmsKey: CfnMissionProfile.StreamsKmsKeyProperty) {
        cdkBuilder.streamsKmsKey(streamsKmsKey)
    }

    public fun streamsKmsRole(streamsKmsRole: String) {
        cdkBuilder.streamsKmsRole(streamsKmsRole)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun trackingConfigArn(trackingConfigArn: String) {
        cdkBuilder.trackingConfigArn(trackingConfigArn)
    }

    public fun build(): CfnMissionProfile {
        if (_dataflowEdges.isNotEmpty()) cdkBuilder.dataflowEdges(_dataflowEdges)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
