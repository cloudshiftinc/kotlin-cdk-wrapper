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

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.amazonmq.CfnBroker
import kotlin.String

@CdkDslMarker
public class CfnBrokerTagsEntryPropertyDsl {
    private val cdkBuilder: CfnBroker.TagsEntryProperty.Builder =
        CfnBroker.TagsEntryProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnBroker.TagsEntryProperty = cdkBuilder.build()
}
