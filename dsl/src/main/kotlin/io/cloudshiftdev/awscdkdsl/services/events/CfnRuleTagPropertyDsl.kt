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
import software.amazon.awscdk.services.events.CfnRule

/**
 * A key-value pair associated with an ECS Target of an EventBridge rule.
 *
 * The tag will be propagated to ECS by EventBridge when starting an ECS task based on a matched
 * event.
 *
 * Currently, tags are only available when using ECS with EventBridge .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * TagProperty tagProperty = TagProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-tag.html)
 */
@CdkDslMarker
public class CfnRuleTagPropertyDsl {
    private val cdkBuilder: CfnRule.TagProperty.Builder = CfnRule.TagProperty.builder()

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

    public fun build(): CfnRule.TagProperty = cdkBuilder.build()
}
