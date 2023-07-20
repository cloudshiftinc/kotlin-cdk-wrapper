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

package cloudshift.awscdk.dsl.services.kms

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kms.CfnKeyProps
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnKeyPropsDsl {
    private val cdkBuilder: CfnKeyProps.Builder = CfnKeyProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun enableKeyRotation(enableKeyRotation: Boolean) {
        cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    public fun enableKeyRotation(enableKeyRotation: IResolvable) {
        cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun keyPolicy(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.keyPolicy(builder.map)
    }

    public fun keyPolicy(keyPolicy: Any) {
        cdkBuilder.keyPolicy(keyPolicy)
    }

    public fun keySpec(keySpec: String) {
        cdkBuilder.keySpec(keySpec)
    }

    public fun keyUsage(keyUsage: String) {
        cdkBuilder.keyUsage(keyUsage)
    }

    public fun multiRegion(multiRegion: Boolean) {
        cdkBuilder.multiRegion(multiRegion)
    }

    public fun multiRegion(multiRegion: IResolvable) {
        cdkBuilder.multiRegion(multiRegion)
    }

    public fun pendingWindowInDays(pendingWindowInDays: Number) {
        cdkBuilder.pendingWindowInDays(pendingWindowInDays)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnKeyProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
