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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseProps
import software.amazon.awscdk.services.ec2.UserData
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class AmazonLinuxImageSsmParameterBasePropsDsl {
    private val cdkBuilder: AmazonLinuxImageSsmParameterBaseProps.Builder =
        AmazonLinuxImageSsmParameterBaseProps.builder()

    public fun cachedInContext(cachedInContext: Boolean) {
        cdkBuilder.cachedInContext(cachedInContext)
    }

    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): AmazonLinuxImageSsmParameterBaseProps = cdkBuilder.build()
}
