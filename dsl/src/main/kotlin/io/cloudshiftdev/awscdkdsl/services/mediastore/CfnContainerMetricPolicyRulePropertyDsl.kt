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

package io.cloudshiftdev.awscdkdsl.services.mediastore

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediastore.CfnContainer

/**
 * A setting that enables metrics at the object level.
 *
 * Each rule contains an object group and an object group name. If the policy includes the
 * MetricPolicyRules parameter, you must include at least one rule. Each metric policy can include
 * up to five rules by default. You can also
 * [request a quota increase](https://docs.aws.amazon.com/servicequotas/home?region=us-east-1#!/services/mediastore/quotas)
 * to allow up to 300 rules per policy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediastore.*;
 * MetricPolicyRuleProperty metricPolicyRuleProperty = MetricPolicyRuleProperty.builder()
 * .objectGroup("objectGroup")
 * .objectGroupName("objectGroupName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediastore-container-metricpolicyrule.html)
 */
@CdkDslMarker
public class CfnContainerMetricPolicyRulePropertyDsl {
    private val cdkBuilder: CfnContainer.MetricPolicyRuleProperty.Builder =
        CfnContainer.MetricPolicyRuleProperty.builder()

    /**
     * @param objectGroup A path or file name that defines which objects to include in the group.
     *   Wildcards (*) are acceptable.
     */
    public fun objectGroup(objectGroup: String) {
        cdkBuilder.objectGroup(objectGroup)
    }

    /** @param objectGroupName A name that allows you to refer to the object group. */
    public fun objectGroupName(objectGroupName: String) {
        cdkBuilder.objectGroupName(objectGroupName)
    }

    public fun build(): CfnContainer.MetricPolicyRuleProperty = cdkBuilder.build()
}
