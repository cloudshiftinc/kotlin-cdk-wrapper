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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.IPublicKey
import software.amazon.awscdk.services.cloudfront.KeyGroup
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class KeyGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: KeyGroup.Builder = KeyGroup.Builder.create(scope, id)

    private val _items: MutableList<IPublicKey> = mutableListOf()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun items(vararg items: IPublicKey) {
        _items.addAll(listOf(*items))
    }

    public fun items(items: Collection<IPublicKey>) {
        _items.addAll(items)
    }

    public fun keyGroupName(keyGroupName: String) {
        cdkBuilder.keyGroupName(keyGroupName)
    }

    public fun build(): KeyGroup {
        if (_items.isNotEmpty()) cdkBuilder.items(_items)
        return cdkBuilder.build()
    }
}
