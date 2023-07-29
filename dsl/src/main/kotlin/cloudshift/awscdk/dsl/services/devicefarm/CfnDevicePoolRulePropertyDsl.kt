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

package cloudshift.awscdk.dsl.services.devicefarm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.devicefarm.CfnDevicePool

/**
 * Represents a condition for a device pool.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devicefarm.*;
 * RuleProperty ruleProperty = RuleProperty.builder()
 * .attribute("attribute")
 * .operator("operator")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-devicepool-rule.html)
 */
@CdkDslMarker
public class CfnDevicePoolRulePropertyDsl {
    private val cdkBuilder: CfnDevicePool.RuleProperty.Builder =
        CfnDevicePool.RuleProperty.builder()

    /**
     * @param attribute The rule's stringified attribute. For example, specify the value as
     *   `"\"abc\""` . The supported operators for each attribute are provided in the following
     *   list.
     * * **APPIUM_VERSION** - The Appium version for the test.
     *
     * Supported operators: `CONTAINS`
     * * **ARN** - The Amazon Resource Name (ARN) of the device (for example,
     *   `arn:aws:devicefarm:us-west-2::device:12345Example` .
     *
     * Supported operators: `EQUALS` , `IN` , `NOT_IN`
     * * **AVAILABILITY** - The current availability of the device. Valid values are AVAILABLE,
     *   HIGHLY_AVAILABLE, BUSY, or TEMPORARY_NOT_AVAILABLE.
     *
     * Supported operators: `EQUALS`
     * * **FLEET_TYPE** - The fleet type. Valid values are PUBLIC or PRIVATE.
     *
     * Supported operators: `EQUALS`
     * * **FORM_FACTOR** - The device form factor. Valid values are PHONE or TABLET.
     *
     * Supported operators: `EQUALS` , `IN` , `NOT_IN`
     * * **INSTANCE_ARN** - The Amazon Resource Name (ARN) of the device instance.
     *
     * Supported operators: `IN` , `NOT_IN`
     * * **INSTANCE_LABELS** - The label of the device instance.
     *
     * Supported operators: `CONTAINS`
     * * **MANUFACTURER** - The device manufacturer (for example, Apple).
     *
     * Supported operators: `EQUALS` , `IN` , `NOT_IN`
     * * **MODEL** - The device model, such as Apple iPad Air 2 or Google Pixel.
     *
     * Supported operators: `CONTAINS` , `EQUALS` , `IN` , `NOT_IN`
     * * **OS_VERSION** - The operating system version (for example, 10.3.2).
     *
     * Supported operators: `EQUALS` , `GREATER_THAN` , `GREATER_THAN_OR_EQUALS` , `IN` ,
     * `LESS_THAN` , `LESS_THAN_OR_EQUALS` , `NOT_IN`
     * * **PLATFORM** - The device platform. Valid values are ANDROID or IOS.
     *
     * Supported operators: `EQUALS` , `IN` , `NOT_IN`
     * * **REMOTE_ACCESS_ENABLED** - Whether the device is enabled for remote access. Valid values
     *   are TRUE or FALSE.
     *
     * Supported operators: `EQUALS`
     * * **REMOTE_DEBUG_ENABLED** - Whether the device is enabled for remote debugging. Valid values
     *   are TRUE or FALSE.
     *
     * Supported operators: `EQUALS`
     *
     * Because remote debugging is
     * [no longer supported](https://docs.aws.amazon.com/devicefarm/latest/developerguide/history.html)
     * , this filter is ignored.
     */
    public fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
    }

    /**
     * @param operator Specifies how Device Farm compares the rule's attribute to the value. For the
     *   operators that are supported by each attribute, see the attribute descriptions.
     */
    public fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
    }

    /** @param value The rule's value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDevicePool.RuleProperty = cdkBuilder.build()
}
