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

package io.cloudshiftdev.awscdkdsl.services.ssmcontacts

import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnRotation

/** Information about the rule that specifies when shift team members rotate. */
public inline fun CfnRotation.setRecurrence(
    block: CfnRotationRecurrenceSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRotationRecurrenceSettingsPropertyDsl()
    builder.apply(block)
    return setRecurrence(builder.build())
}
