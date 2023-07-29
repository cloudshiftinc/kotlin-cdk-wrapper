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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.CfnEventBusPolicy

/**
 * A JSON string which you can use to limit the event bus permissions you are granting to only
 * accounts that fulfill the condition.
 *
 * Currently, the only supported condition is membership in a certain AWS organization. The string
 * must contain `Type` , `Key` , and `Value` fields. The `Value` field specifies the ID of the AWS
 * organization. Following is an example value for `Condition` :
 *
 * `'{"Type" : "StringEquals", "Key": "aws:PrincipalOrgID", "Value": "o-1234567890"}'`
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * ConditionProperty conditionProperty = ConditionProperty.builder()
 * .key("key")
 * .type("type")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-eventbuspolicy-condition.html)
 */
@CdkDslMarker
public class CfnEventBusPolicyConditionPropertyDsl {
    private val cdkBuilder: CfnEventBusPolicy.ConditionProperty.Builder =
        CfnEventBusPolicy.ConditionProperty.builder()

    /**
     * @param key Specifies the key for the condition. Currently the only supported key is
     *   `aws:PrincipalOrgID` .
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param type Specifies the type of condition. Currently the only supported value is
     *   `StringEquals` .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param value Specifies the value for the key. Currently, this must be the ID of the
     *   organization.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnEventBusPolicy.ConditionProperty = cdkBuilder.build()
}
