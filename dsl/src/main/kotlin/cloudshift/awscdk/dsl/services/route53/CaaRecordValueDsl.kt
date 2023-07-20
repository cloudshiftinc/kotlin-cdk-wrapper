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

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.route53.CaaRecordValue
import software.amazon.awscdk.services.route53.CaaTag
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CaaRecordValueDsl {
    private val cdkBuilder: CaaRecordValue.Builder = CaaRecordValue.builder()

    public fun flag(flag: Number) {
        cdkBuilder.flag(flag)
    }

    public fun tag(tag: CaaTag) {
        cdkBuilder.tag(tag)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CaaRecordValue = cdkBuilder.build()
}
