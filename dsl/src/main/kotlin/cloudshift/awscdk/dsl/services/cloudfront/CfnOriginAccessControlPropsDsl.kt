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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControlProps

/**
 * Properties for defining a `CfnOriginAccessControl`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnOriginAccessControlProps cfnOriginAccessControlProps = CfnOriginAccessControlProps.builder()
 * .originAccessControlConfig(OriginAccessControlConfigProperty.builder()
 * .name("name")
 * .originAccessControlOriginType("originAccessControlOriginType")
 * .signingBehavior("signingBehavior")
 * .signingProtocol("signingProtocol")
 * // the properties below are optional
 * .description("description")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html)
 */
@CdkDslMarker
public class CfnOriginAccessControlPropsDsl {
    private val cdkBuilder: CfnOriginAccessControlProps.Builder =
        CfnOriginAccessControlProps.builder()

    /** @param originAccessControlConfig The origin access control. */
    public fun originAccessControlConfig(originAccessControlConfig: IResolvable) {
        cdkBuilder.originAccessControlConfig(originAccessControlConfig)
    }

    /** @param originAccessControlConfig The origin access control. */
    public fun originAccessControlConfig(
        originAccessControlConfig: CfnOriginAccessControl.OriginAccessControlConfigProperty
    ) {
        cdkBuilder.originAccessControlConfig(originAccessControlConfig)
    }

    public fun build(): CfnOriginAccessControlProps = cdkBuilder.build()
}
