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
import kotlin.String

@CdkDslMarker
public class CfnServiceCodeRepositoryPropertyDsl {
    private val cdkBuilder: CfnService.CodeRepositoryProperty.Builder =
        CfnService.CodeRepositoryProperty.builder()

    public fun codeConfiguration(codeConfiguration: IResolvable) {
        cdkBuilder.codeConfiguration(codeConfiguration)
    }

    public fun codeConfiguration(codeConfiguration: CfnService.CodeConfigurationProperty) {
        cdkBuilder.codeConfiguration(codeConfiguration)
    }

    public fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
    }

    public fun sourceCodeVersion(sourceCodeVersion: IResolvable) {
        cdkBuilder.sourceCodeVersion(sourceCodeVersion)
    }

    public fun sourceCodeVersion(sourceCodeVersion: CfnService.SourceCodeVersionProperty) {
        cdkBuilder.sourceCodeVersion(sourceCodeVersion)
    }

    public fun build(): CfnService.CodeRepositoryProperty = cdkBuilder.build()
}
