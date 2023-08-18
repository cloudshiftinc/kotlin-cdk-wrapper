@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.DkimRecord

/**
 * A DKIM record.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * DkimRecord dkimRecord = DkimRecord.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 */
@CdkDslMarker
public class DkimRecordDsl {
    private val cdkBuilder: DkimRecord.Builder = DkimRecord.builder()

    /** @param name The name of the record. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value The value of the record. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): DkimRecord = cdkBuilder.build()
}
