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

package cloudshift.awscdk.dsl.services.apprunner

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apprunner.CfnService
import kotlin.Boolean

@CdkDslMarker
public class CfnServiceSourceConfigurationPropertyDsl {
    private val cdkBuilder: CfnService.SourceConfigurationProperty.Builder =
        CfnService.SourceConfigurationProperty.builder()

    public fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    public fun authenticationConfiguration(authenticationConfiguration: CfnService.AuthenticationConfigurationProperty) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration)
    }

    public fun autoDeploymentsEnabled(autoDeploymentsEnabled: Boolean) {
        cdkBuilder.autoDeploymentsEnabled(autoDeploymentsEnabled)
    }

    public fun autoDeploymentsEnabled(autoDeploymentsEnabled: IResolvable) {
        cdkBuilder.autoDeploymentsEnabled(autoDeploymentsEnabled)
    }

    public fun codeRepository(codeRepository: IResolvable) {
        cdkBuilder.codeRepository(codeRepository)
    }

    public fun codeRepository(codeRepository: CfnService.CodeRepositoryProperty) {
        cdkBuilder.codeRepository(codeRepository)
    }

    public fun imageRepository(imageRepository: IResolvable) {
        cdkBuilder.imageRepository(imageRepository)
    }

    public fun imageRepository(imageRepository: CfnService.ImageRepositoryProperty) {
        cdkBuilder.imageRepository(imageRepository)
    }

    public fun build(): CfnService.SourceConfigurationProperty = cdkBuilder.build()
}
