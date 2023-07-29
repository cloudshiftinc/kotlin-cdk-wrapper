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

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.securityhub.CfnStandard

/**
 * Provides details about an individual security control.
 *
 * For a list of Security Hub controls, see
 * [Security Hub controls reference](https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-controls-reference.html)
 * in the *AWS Security Hub User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.securityhub.*;
 * StandardsControlProperty standardsControlProperty = StandardsControlProperty.builder()
 * .standardsControlArn("standardsControlArn")
 * // the properties below are optional
 * .reason("reason")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-securityhub-standard-standardscontrol.html)
 */
@CdkDslMarker
public class CfnStandardStandardsControlPropertyDsl {
    private val cdkBuilder: CfnStandard.StandardsControlProperty.Builder =
        CfnStandard.StandardsControlProperty.builder()

    /**
     * @param reason A user-defined reason for changing a control's enablement status in a specified
     *   standard. If you are disabling a control, then this property is required.
     */
    public fun reason(reason: String) {
        cdkBuilder.reason(reason)
    }

    /** @param standardsControlArn The Amazon Resource Name (ARN) of the control. */
    public fun standardsControlArn(standardsControlArn: String) {
        cdkBuilder.standardsControlArn(standardsControlArn)
    }

    public fun build(): CfnStandard.StandardsControlProperty = cdkBuilder.build()
}
