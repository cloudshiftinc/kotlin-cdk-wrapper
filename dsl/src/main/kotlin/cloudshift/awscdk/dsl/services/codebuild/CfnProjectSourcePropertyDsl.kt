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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnProjectSourcePropertyDsl {
    private val cdkBuilder: CfnProject.SourceProperty.Builder = CfnProject.SourceProperty.builder()

    public fun auth(auth: IResolvable) {
        cdkBuilder.auth(auth)
    }

    public fun auth(auth: CfnProject.SourceAuthProperty) {
        cdkBuilder.auth(auth)
    }

    public fun buildSpec(buildSpec: String) {
        cdkBuilder.buildSpec(buildSpec)
    }

    public fun buildStatusConfig(buildStatusConfig: IResolvable) {
        cdkBuilder.buildStatusConfig(buildStatusConfig)
    }

    public fun buildStatusConfig(buildStatusConfig: CfnProject.BuildStatusConfigProperty) {
        cdkBuilder.buildStatusConfig(buildStatusConfig)
    }

    public fun gitCloneDepth(gitCloneDepth: Number) {
        cdkBuilder.gitCloneDepth(gitCloneDepth)
    }

    public fun gitSubmodulesConfig(gitSubmodulesConfig: IResolvable) {
        cdkBuilder.gitSubmodulesConfig(gitSubmodulesConfig)
    }

    public fun gitSubmodulesConfig(gitSubmodulesConfig: CfnProject.GitSubmodulesConfigProperty) {
        cdkBuilder.gitSubmodulesConfig(gitSubmodulesConfig)
    }

    public fun insecureSsl(insecureSsl: Boolean) {
        cdkBuilder.insecureSsl(insecureSsl)
    }

    public fun insecureSsl(insecureSsl: IResolvable) {
        cdkBuilder.insecureSsl(insecureSsl)
    }

    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    public fun reportBuildStatus(reportBuildStatus: Boolean) {
        cdkBuilder.reportBuildStatus(reportBuildStatus)
    }

    public fun reportBuildStatus(reportBuildStatus: IResolvable) {
        cdkBuilder.reportBuildStatus(reportBuildStatus)
    }

    public fun sourceIdentifier(sourceIdentifier: String) {
        cdkBuilder.sourceIdentifier(sourceIdentifier)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnProject.SourceProperty = cdkBuilder.build()
}
