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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup

/**
 * Configures the `ReferenceSets` for a stateful rule group.
 *
 * For more information, see the
 * [Using IP set references in Suricata compatible rule groups](https://docs.aws.amazon.com/network-firewall/latest/developerguide/rule-groups-ip-set-references.html)
 * in the *Network Firewall User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * ReferenceSetsProperty referenceSetsProperty = ReferenceSetsProperty.builder()
 * .ipSetReferences(Map.of(
 * "ipSetReferencesKey", Map.of(
 * "referenceArn", "referenceArn")))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-referencesets.html)
 */
@CdkDslMarker
public class CfnRuleGroupReferenceSetsPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.ReferenceSetsProperty.Builder =
        CfnRuleGroup.ReferenceSetsProperty.builder()

    /** @param ipSetReferences The IP set references to use in the stateful rule group. */
    public fun ipSetReferences(ipSetReferences: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(ipSetReferences)
        cdkBuilder.ipSetReferences(builder.map)
    }

    /** @param ipSetReferences The IP set references to use in the stateful rule group. */
    public fun ipSetReferences(ipSetReferences: Map<String, Any>) {
        cdkBuilder.ipSetReferences(ipSetReferences)
    }

    /** @param ipSetReferences The IP set references to use in the stateful rule group. */
    public fun ipSetReferences(ipSetReferences: IResolvable) {
        cdkBuilder.ipSetReferences(ipSetReferences)
    }

    public fun build(): CfnRuleGroup.ReferenceSetsProperty = cdkBuilder.build()
}
