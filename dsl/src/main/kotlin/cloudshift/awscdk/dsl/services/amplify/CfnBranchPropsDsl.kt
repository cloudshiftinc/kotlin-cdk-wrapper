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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplify.CfnBranch
import software.amazon.awscdk.services.amplify.CfnBranchProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnBranchPropsDsl {
    private val cdkBuilder: CfnBranchProps.Builder = CfnBranchProps.builder()

    private val _environmentVariables: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun appId(appId: String) {
        cdkBuilder.appId(appId)
    }

    public fun basicAuthConfig(basicAuthConfig: IResolvable) {
        cdkBuilder.basicAuthConfig(basicAuthConfig)
    }

    public fun basicAuthConfig(basicAuthConfig: CfnBranch.BasicAuthConfigProperty) {
        cdkBuilder.basicAuthConfig(basicAuthConfig)
    }

    public fun branchName(branchName: String) {
        cdkBuilder.branchName(branchName)
    }

    public fun buildSpec(buildSpec: String) {
        cdkBuilder.buildSpec(buildSpec)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
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

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnBranchProps {
        if (_environmentVariables.isNotEmpty()) cdkBuilder.environmentVariables(_environmentVariables)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
