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

package cloudshift.awscdk.dsl.services.xray

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnSamplingRule

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.xray.*;
 * SamplingRuleRecordProperty samplingRuleRecordProperty = SamplingRuleRecordProperty.builder()
 * .createdAt("createdAt")
 * .modifiedAt("modifiedAt")
 * .samplingRule(SamplingRuleProperty.builder()
 * .fixedRate(123)
 * .host("host")
 * .httpMethod("httpMethod")
 * .priority(123)
 * .reservoirSize(123)
 * .resourceArn("resourceArn")
 * .serviceName("serviceName")
 * .serviceType("serviceType")
 * .urlPath("urlPath")
 * // the properties below are optional
 * .attributes(Map.of(
 * "attributesKey", "attributes"))
 * .ruleArn("ruleArn")
 * .ruleName("ruleName")
 * .version(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-xray-samplingrule-samplingrulerecord.html)
 */
@CdkDslMarker
public class CfnSamplingRuleSamplingRuleRecordPropertyDsl {
    private val cdkBuilder: CfnSamplingRule.SamplingRuleRecordProperty.Builder =
        CfnSamplingRule.SamplingRuleRecordProperty.builder()

    /** @param createdAt When the rule was created, in Unix time seconds. */
    public fun createdAt(createdAt: String) {
        cdkBuilder.createdAt(createdAt)
    }

    /** @param modifiedAt When the rule was modified, in Unix time seconds. */
    public fun modifiedAt(modifiedAt: String) {
        cdkBuilder.modifiedAt(modifiedAt)
    }

    /** @param samplingRule the value to be set. */
    public fun samplingRule(samplingRule: IResolvable) {
        cdkBuilder.samplingRule(samplingRule)
    }

    /** @param samplingRule the value to be set. */
    public fun samplingRule(samplingRule: CfnSamplingRule.SamplingRuleProperty) {
        cdkBuilder.samplingRule(samplingRule)
    }

    public fun build(): CfnSamplingRule.SamplingRuleRecordProperty = cdkBuilder.build()
}
