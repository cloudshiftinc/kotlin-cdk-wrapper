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
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnOriginAccessControlDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnOriginAccessControl.Builder =
        CfnOriginAccessControl.Builder.create(scope, id)

    public fun originAccessControlConfig(originAccessControlConfig: IResolvable) {
        cdkBuilder.originAccessControlConfig(originAccessControlConfig)
    }

    public fun originAccessControlConfig(originAccessControlConfig: CfnOriginAccessControl.OriginAccessControlConfigProperty) {
        cdkBuilder.originAccessControlConfig(originAccessControlConfig)
    }

    public fun build(): CfnOriginAccessControl = cdkBuilder.build()
}
