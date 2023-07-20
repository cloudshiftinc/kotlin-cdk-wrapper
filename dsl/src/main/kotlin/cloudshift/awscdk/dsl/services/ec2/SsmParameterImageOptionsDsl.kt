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
import software.amazon.awscdk.services.ec2.OperatingSystemType
import software.amazon.awscdk.services.ec2.SsmParameterImageOptions
import software.amazon.awscdk.services.ec2.UserData
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class SsmParameterImageOptionsDsl {
    private val cdkBuilder: SsmParameterImageOptions.Builder = SsmParameterImageOptions.builder()

    public fun cachedInContext(cachedInContext: Boolean) {
        cdkBuilder.cachedInContext(cachedInContext)
    }

    public fun os(os: OperatingSystemType) {
        cdkBuilder.os(os)
    }

    public fun parameterVersion(parameterVersion: String) {
        cdkBuilder.parameterVersion(parameterVersion)
    }

    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): SsmParameterImageOptions = cdkBuilder.build()
}
