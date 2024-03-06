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

package io.cloudshiftdev.awscdkdsl.services.dlm

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
 * *[Custom snapshot and AMI policies only]* Specifies a cross-Region copy rule for a snapshot and
 * AMI policies.
 *
 * To specify a cross-Region copy action for event-based polices, use
 * [CrossRegionCopyAction](https://docs.aws.amazon.com/dlm/latest/APIReference/API_CrossRegionCopyAction.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * CrossRegionCopyRuleProperty crossRegionCopyRuleProperty = CrossRegionCopyRuleProperty.builder()
 * .encrypted(false)
 * // the properties below are optional
 * .cmkArn("cmkArn")
 * .copyTags(false)
 * .deprecateRule(CrossRegionCopyDeprecateRuleProperty.builder()
 * .interval(123)
 * .intervalUnit("intervalUnit")
 * .build())
 * .retainRule(CrossRegionCopyRetainRuleProperty.builder()
 * .interval(123)
 * .intervalUnit("intervalUnit")
 * .build())
 * .target("target")
 * .targetRegion("targetRegion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyrule.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyCrossRegionCopyRulePropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.CrossRegionCopyRuleProperty.Builder =
        CfnLifecyclePolicy.CrossRegionCopyRuleProperty.builder()

    /**
     * @param cmkArn The Amazon Resource Name (ARN) of the AWS KMS key to use for EBS encryption. If
     *   this parameter is not specified, the default KMS key for the account is used.
     */
    public fun cmkArn(cmkArn: String) {
        cdkBuilder.cmkArn(cmkArn)
    }

    /**
     * @param copyTags Indicates whether to copy all user-defined tags from the source snapshot or
     *   AMI to the cross-Region copy.
     */
    public fun copyTags(copyTags: Boolean) {
        cdkBuilder.copyTags(copyTags)
    }

    /**
     * @param copyTags Indicates whether to copy all user-defined tags from the source snapshot or
     *   AMI to the cross-Region copy.
     */
    public fun copyTags(copyTags: IResolvable) {
        cdkBuilder.copyTags(copyTags)
    }

    /**
     * @param deprecateRule *[Custom AMI policies only]* The AMI deprecation rule for cross-Region
     *   AMI copies created by the rule.
     */
    public fun deprecateRule(deprecateRule: IResolvable) {
        cdkBuilder.deprecateRule(deprecateRule)
    }

    /**
     * @param deprecateRule *[Custom AMI policies only]* The AMI deprecation rule for cross-Region
     *   AMI copies created by the rule.
     */
    public fun deprecateRule(
        deprecateRule: CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty
    ) {
        cdkBuilder.deprecateRule(deprecateRule)
    }

    /**
     * @param encrypted To encrypt a copy of an unencrypted snapshot if encryption by default is not
     *   enabled, enable encryption using this parameter. Copies of encrypted snapshots are
     *   encrypted, even if this parameter is false or if encryption by default is not enabled.
     */
    public fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param encrypted To encrypt a copy of an unencrypted snapshot if encryption by default is not
     *   enabled, enable encryption using this parameter. Copies of encrypted snapshots are
     *   encrypted, even if this parameter is false or if encryption by default is not enabled.
     */
    public fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted)
    }

    /**
     * @param retainRule The retention rule that indicates how long the cross-Region snapshot or AMI
     *   copies are to be retained in the destination Region.
     */
    public fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule)
    }

    /**
     * @param retainRule The retention rule that indicates how long the cross-Region snapshot or AMI
     *   copies are to be retained in the destination Region.
     */
    public fun retainRule(retainRule: CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty) {
        cdkBuilder.retainRule(retainRule)
    }

    /**
     * @param target Use this parameter for snapshot policies only. For AMI policies, use
     *   *TargetRegion* instead. *[Custom snapshot policies only]* The target Region or the Amazon
     *   Resource Name (ARN) of the target Outpost for the snapshot copies.
     */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    /**
     * @param targetRegion Use this parameter for AMI policies only. For snapshot policies, use
     *   *Target* instead. For snapshot policies created before the *Target* parameter was
     *   introduced, this parameter indicates the target Region for snapshot copies.
     *
     * *[Custom AMI policies only]* The target Region or the Amazon Resource Name (ARN) of the
     * target Outpost for the snapshot copies.
     */
    public fun targetRegion(targetRegion: String) {
        cdkBuilder.targetRegion(targetRegion)
    }

    public fun build(): CfnLifecyclePolicy.CrossRegionCopyRuleProperty = cdkBuilder.build()
}
