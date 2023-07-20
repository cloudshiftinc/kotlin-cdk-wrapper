@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControl
import software.amazon.awscdk.services.cloudfront.CfnOriginAccessControlProps

@CdkDslMarker
public class CfnOriginAccessControlPropsDsl {
    private val cdkBuilder: CfnOriginAccessControlProps.Builder =
        CfnOriginAccessControlProps.builder()

    public fun originAccessControlConfig(originAccessControlConfig: IResolvable) {
        cdkBuilder.originAccessControlConfig(originAccessControlConfig)
    }

    public fun originAccessControlConfig(originAccessControlConfig: CfnOriginAccessControl.OriginAccessControlConfigProperty) {
        cdkBuilder.originAccessControlConfig(originAccessControlConfig)
    }

    public fun build(): CfnOriginAccessControlProps = cdkBuilder.build()
}
