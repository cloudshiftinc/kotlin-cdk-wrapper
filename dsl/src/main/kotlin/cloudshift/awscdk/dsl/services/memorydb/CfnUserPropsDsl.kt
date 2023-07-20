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

package cloudshift.awscdk.dsl.services.memorydb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.memorydb.CfnUserProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnUserPropsDsl {
    private val cdkBuilder: CfnUserProps.Builder = CfnUserProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun accessString(accessString: String) {
        cdkBuilder.accessString(accessString)
    }

    public fun authenticationMode(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.authenticationMode(builder.map)
    }

    public fun authenticationMode(authenticationMode: Any) {
        cdkBuilder.authenticationMode(authenticationMode)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun userName(userName: String) {
        cdkBuilder.userName(userName)
    }

    public fun build(): CfnUserProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
