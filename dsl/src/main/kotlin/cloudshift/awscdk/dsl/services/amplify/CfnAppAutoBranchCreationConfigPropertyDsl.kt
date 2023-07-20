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

package cloudshift.awscdk.dsl.services.amplify

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplify.CfnApp
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAppAutoBranchCreationConfigPropertyDsl {
    private val cdkBuilder: CfnApp.AutoBranchCreationConfigProperty.Builder =
        CfnApp.AutoBranchCreationConfigProperty.builder()

    private val _autoBranchCreationPatterns: MutableList<String> = mutableListOf()

    private val _environmentVariables: MutableList<Any> = mutableListOf()

    public fun autoBranchCreationPatterns(vararg autoBranchCreationPatterns: String) {
        _autoBranchCreationPatterns.addAll(listOf(*autoBranchCreationPatterns))
    }

    public fun autoBranchCreationPatterns(autoBranchCreationPatterns: Collection<String>) {
        _autoBranchCreationPatterns.addAll(autoBranchCreationPatterns)
    }

    public fun basicAuthConfig(basicAuthConfig: IResolvable) {
        cdkBuilder.basicAuthConfig(basicAuthConfig)
    }

    public fun basicAuthConfig(basicAuthConfig: CfnApp.BasicAuthConfigProperty) {
        cdkBuilder.basicAuthConfig(basicAuthConfig)
    }

    public fun buildSpec(buildSpec: String) {
        cdkBuilder.buildSpec(buildSpec)
    }

    public fun enableAutoBranchCreation(enableAutoBranchCreation: Boolean) {
        cdkBuilder.enableAutoBranchCreation(enableAutoBranchCreation)
    }

    public fun enableAutoBranchCreation(enableAutoBranchCreation: IResolvable) {
        cdkBuilder.enableAutoBranchCreation(enableAutoBranchCreation)
    }

    public fun enableAutoBuild(enableAutoBuild: Boolean) {
        cdkBuilder.enableAutoBuild(enableAutoBuild)
    }

    public fun enableAutoBuild(enableAutoBuild: IResolvable) {
        cdkBuilder.enableAutoBuild(enableAutoBuild)
    }

    public fun enablePerformanceMode(enablePerformanceMode: Boolean) {
        cdkBuilder.enablePerformanceMode(enablePerformanceMode)
    }

    public fun enablePerformanceMode(enablePerformanceMode: IResolvable) {
        cdkBuilder.enablePerformanceMode(enablePerformanceMode)
    }

    public fun enablePullRequestPreview(enablePullRequestPreview: Boolean) {
        cdkBuilder.enablePullRequestPreview(enablePullRequestPreview)
    }

    public fun enablePullRequestPreview(enablePullRequestPreview: IResolvable) {
        cdkBuilder.enablePullRequestPreview(enablePullRequestPreview)
    }

    public fun environmentVariables(vararg environmentVariables: Any) {
        _environmentVariables.addAll(listOf(*environmentVariables))
    }

    public fun environmentVariables(environmentVariables: Collection<Any>) {
        _environmentVariables.addAll(environmentVariables)
    }

    public fun environmentVariables(environmentVariables: IResolvable) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    public fun framework(framework: String) {
        cdkBuilder.framework(framework)
    }

    public fun pullRequestEnvironmentName(pullRequestEnvironmentName: String) {
        cdkBuilder.pullRequestEnvironmentName(pullRequestEnvironmentName)
    }

    public fun stage(stage: String) {
        cdkBuilder.stage(stage)
    }

    public fun build(): CfnApp.AutoBranchCreationConfigProperty {
        if (_autoBranchCreationPatterns.isNotEmpty()) {
            cdkBuilder.autoBranchCreationPatterns(_autoBranchCreationPatterns)
        }
        if (_environmentVariables.isNotEmpty()) cdkBuilder.environmentVariables(_environmentVariables)
        return cdkBuilder.build()
    }
}
