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

package cloudshift.awscdk.dsl.services.dlm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dlm.CfnLifecyclePolicy

/**
 * *[Event-based policies only]* Specifies a cross-Region copy action for event-based policies.
 *
 * To specify a cross-Region copy rule for snapshot and AMI policies, use `CrossRegionCopyRule` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dlm.*;
 * CrossRegionCopyActionProperty crossRegionCopyActionProperty =
 * CrossRegionCopyActionProperty.builder()
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .encrypted(false)
 * // the properties below are optional
 * .cmkArn("cmkArn")
 * .build())
 * .target("target")
 * // the properties below are optional
 * .retainRule(CrossRegionCopyRetainRuleProperty.builder()
 * .interval(123)
 * .intervalUnit("intervalUnit")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyaction.html)
 */
@CdkDslMarker
public class CfnLifecyclePolicyCrossRegionCopyActionPropertyDsl {
    private val cdkBuilder: CfnLifecyclePolicy.CrossRegionCopyActionProperty.Builder =
        CfnLifecyclePolicy.CrossRegionCopyActionProperty.builder()

    /** @param encryptionConfiguration The encryption settings for the copied snapshot. */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    /** @param encryptionConfiguration The encryption settings for the copied snapshot. */
    public fun encryptionConfiguration(
        encryptionConfiguration: CfnLifecyclePolicy.EncryptionConfigurationProperty
    ) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    /**
     * @param retainRule Specifies a retention rule for cross-Region snapshot copies created by
     *   snapshot or event-based policies, or cross-Region AMI copies created by AMI policies. After
     *   the retention period expires, the cross-Region copy is deleted.
     */
    public fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule)
    }

    /**
     * @param retainRule Specifies a retention rule for cross-Region snapshot copies created by
     *   snapshot or event-based policies, or cross-Region AMI copies created by AMI policies. After
     *   the retention period expires, the cross-Region copy is deleted.
     */
    public fun retainRule(retainRule: CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty) {
        cdkBuilder.retainRule(retainRule)
    }

    /** @param target The target Region. */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun build(): CfnLifecyclePolicy.CrossRegionCopyActionProperty = cdkBuilder.build()
}
