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

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnEventBus

/**
 * A key-value pair associated with an AWS resource.
 *
 * In EventBridge, rules and event buses support tagging.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * TagEntryProperty tagEntryProperty = TagEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbus-tagentry.html)
 */
@CdkDslMarker
public class CfnEventBusTagEntryPropertyDsl {
    private val cdkBuilder: CfnEventBus.TagEntryProperty.Builder =
        CfnEventBus.TagEntryProperty.builder()

    /**
     * @param key A string you can use to assign a value. The combination of tag keys and values can
     *   help you organize and categorize your resources.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The value for the specified tag key. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnEventBus.TagEntryProperty = cdkBuilder.build()
}
