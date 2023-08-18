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

package io.cloudshiftdev.awscdkdsl.services.waf

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnWebACL
import software.amazon.awscdk.services.waf.CfnWebACLProps

/**
 * Properties for defining a `CfnWebACL`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.*;
 * CfnWebACLProps cfnWebACLProps = CfnWebACLProps.builder()
 * .defaultAction(WafActionProperty.builder()
 * .type("type")
 * .build())
 * .metricName("metricName")
 * .name("name")
 * // the properties below are optional
 * .rules(List.of(ActivatedRuleProperty.builder()
 * .priority(123)
 * .ruleId("ruleId")
 * // the properties below are optional
 * .action(WafActionProperty.builder()
 * .type("type")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-webacl.html)
 */
@CdkDslMarker
public class CfnWebACLPropsDsl {
    private val cdkBuilder: CfnWebACLProps.Builder = CfnWebACLProps.builder()

    private val _rules: MutableList<Any> = mutableListOf()

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     *   match. The action is specified by the `WafAction` object.
     */
    public fun defaultAction(defaultAction: IResolvable) {
        cdkBuilder.defaultAction(defaultAction)
    }

    /**
     * @param defaultAction The action to perform if none of the `Rules` contained in the `WebACL`
     *   match. The action is specified by the `WafAction` object.
     */
    public fun defaultAction(defaultAction: CfnWebACL.WafActionProperty) {
        cdkBuilder.defaultAction(defaultAction)
    }

    /**
     * @param metricName The name of the metrics for this `WebACL` . The name can contain only
     *   alphanumeric characters (A-Z, a-z, 0-9), with maximum length 128 and minimum length one. It
     *   can't contain whitespace or metric names reserved for AWS WAF , including "All" and
     *   "Default_Action." You can't change `MetricName` after you create the `WebACL` .
     */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /**
     * @param name A friendly name or description of the `WebACL` . You can't change the name of a
     *   `WebACL` after you create it.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     *   of the `Rule` , and the ID of the `Rule` .
     */
    public fun rules(vararg rules: Any) {
        _rules.addAll(listOf(*rules))
    }

    /**
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     *   of the `Rule` , and the ID of the `Rule` .
     */
    public fun rules(rules: Collection<Any>) {
        _rules.addAll(rules)
    }

    /**
     * @param rules An array that contains the action for each `Rule` in a `WebACL` , the priority
     *   of the `Rule` , and the ID of the `Rule` .
     */
    public fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules)
    }

    public fun build(): CfnWebACLProps {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        return cdkBuilder.build()
    }
}
