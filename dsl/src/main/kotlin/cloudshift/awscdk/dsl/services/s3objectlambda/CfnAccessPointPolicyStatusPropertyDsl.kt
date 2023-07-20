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

package cloudshift.awscdk.dsl.services.s3objectlambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint
import kotlin.Boolean

@CdkDslMarker
public class CfnAccessPointPolicyStatusPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.PolicyStatusProperty.Builder =
        CfnAccessPoint.PolicyStatusProperty.builder()

    public fun isPublic(isPublic: Boolean) {
        cdkBuilder.isPublic(isPublic)
    }

    public fun isPublic(isPublic: IResolvable) {
        cdkBuilder.isPublic(isPublic)
    }

    public fun build(): CfnAccessPoint.PolicyStatusProperty = cdkBuilder.build()
}
