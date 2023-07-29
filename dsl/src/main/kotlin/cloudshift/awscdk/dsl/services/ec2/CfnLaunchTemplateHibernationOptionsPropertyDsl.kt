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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * Specifies whether your instance is configured for hibernation.
 *
 * This parameter is valid only if the instance meets the
 * [hibernation prerequisites](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html#hibernating-prerequisites)
 * . For more information, see
 * [Hibernate Your Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Hibernate.html) in
 * the *Amazon EC2 User Guide* .
 *
 * `HibernationOptions` is a property of
 * [AWS::EC2::LaunchTemplate LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * HibernationOptionsProperty hibernationOptionsProperty = HibernationOptionsProperty.builder()
 * .configured(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-hibernationoptions.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateHibernationOptionsPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.HibernationOptionsProperty.Builder =
        CfnLaunchTemplate.HibernationOptionsProperty.builder()

    /**
     * @param configured If you set this parameter to `true` , the instance is enabled for
     *   hibernation. Default: `false`
     */
    public fun configured(configured: Boolean) {
        cdkBuilder.configured(configured)
    }

    /**
     * @param configured If you set this parameter to `true` , the instance is enabled for
     *   hibernation. Default: `false`
     */
    public fun configured(configured: IResolvable) {
        cdkBuilder.configured(configured)
    }

    public fun build(): CfnLaunchTemplate.HibernationOptionsProperty = cdkBuilder.build()
}
