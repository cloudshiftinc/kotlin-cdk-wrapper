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
import software.amazon.awscdk.services.ec2.AmazonLinuxImageSsmParameterBaseOptions
import software.amazon.awscdk.services.ec2.UserData
import kotlin.Boolean

@CdkDslMarker
public class AmazonLinuxImageSsmParameterBaseOptionsDsl {
    private val cdkBuilder: AmazonLinuxImageSsmParameterBaseOptions.Builder =
        AmazonLinuxImageSsmParameterBaseOptions.builder()

    public fun cachedInContext(cachedInContext: Boolean) {
        cdkBuilder.cachedInContext(cachedInContext)
    }

    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): AmazonLinuxImageSsmParameterBaseOptions = cdkBuilder.build()
}
