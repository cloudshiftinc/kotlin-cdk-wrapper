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

package io.cloudshiftdev.awscdkdsl.services.networkfirewall

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

/**
 * TCP flags and masks to inspect packets for. This is used in the `RuleGroup.MatchAttributes`
 * specification.
 *
 * For example:
 *
 * `"TCPFlags": [ { "Flags": [ "ECE", "SYN" ], "Masks": [ "SYN", "ECE" ] } ]`
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * TCPFlagFieldProperty tCPFlagFieldProperty = TCPFlagFieldProperty.builder()
 * .flags(List.of("flags"))
 * // the properties below are optional
 * .masks(List.of("masks"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-tcpflagfield.html)
 */
@CdkDslMarker
public class CfnRuleGroupTCPFlagFieldPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.TCPFlagFieldProperty.Builder =
        CfnRuleGroup.TCPFlagFieldProperty.builder()

    private val _flags: MutableList<String> = mutableListOf()

    private val _masks: MutableList<String> = mutableListOf()

    /**
     * @param flags Used in conjunction with the `Masks` setting to define the flags that must be
     *   set and flags that must not be set in order for the packet to match. This setting can only
     *   specify values that are also specified in the `Masks` setting.
     *
     * For the flags that are specified in the masks setting, the following must be true for the
     * packet to match:
     * * The ones that are set in this flags setting must be set in the packet.
     * * The ones that are not set in this flags setting must also not be set in the packet.
     */
    public fun flags(vararg flags: String) {
        _flags.addAll(listOf(*flags))
    }

    /**
     * @param flags Used in conjunction with the `Masks` setting to define the flags that must be
     *   set and flags that must not be set in order for the packet to match. This setting can only
     *   specify values that are also specified in the `Masks` setting.
     *
     * For the flags that are specified in the masks setting, the following must be true for the
     * packet to match:
     * * The ones that are set in this flags setting must be set in the packet.
     * * The ones that are not set in this flags setting must also not be set in the packet.
     */
    public fun flags(flags: Collection<String>) {
        _flags.addAll(flags)
    }

    /**
     * @param masks The set of flags to consider in the inspection. To inspect all flags in the
     *   valid values list, leave this with no setting.
     */
    public fun masks(vararg masks: String) {
        _masks.addAll(listOf(*masks))
    }

    /**
     * @param masks The set of flags to consider in the inspection. To inspect all flags in the
     *   valid values list, leave this with no setting.
     */
    public fun masks(masks: Collection<String>) {
        _masks.addAll(masks)
    }

    public fun build(): CfnRuleGroup.TCPFlagFieldProperty {
        if (_flags.isNotEmpty()) cdkBuilder.flags(_flags)
        if (_masks.isNotEmpty()) cdkBuilder.masks(_masks)
        return cdkBuilder.build()
    }
}
