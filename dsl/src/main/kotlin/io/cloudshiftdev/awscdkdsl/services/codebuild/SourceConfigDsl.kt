@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.codebuild

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject
import software.amazon.awscdk.services.codebuild.SourceConfig

/**
 * The type returned from `ISource#bind`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * SourceConfig sourceConfig = SourceConfig.builder()
 * .sourceProperty(SourceProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .auth(SourceAuthProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .resource("resource")
 * .build())
 * .buildSpec("buildSpec")
 * .buildStatusConfig(BuildStatusConfigProperty.builder()
 * .context("context")
 * .targetUrl("targetUrl")
 * .build())
 * .gitCloneDepth(123)
 * .gitSubmodulesConfig(GitSubmodulesConfigProperty.builder()
 * .fetchSubmodules(false)
 * .build())
 * .insecureSsl(false)
 * .location("location")
 * .reportBuildStatus(false)
 * .sourceIdentifier("sourceIdentifier")
 * .build())
 * // the properties below are optional
 * .buildTriggers(ProjectTriggersProperty.builder()
 * .buildType("buildType")
 * .filterGroups(List.of(List.of(WebhookFilterProperty.builder()
 * .pattern("pattern")
 * .type("type")
 * // the properties below are optional
 * .excludeMatchedPattern(false)
 * .build())))
 * .webhook(false)
 * .build())
 * .sourceVersion("sourceVersion")
 * .build();
 * ```
 */
@CdkDslMarker
public class SourceConfigDsl {
    private val cdkBuilder: SourceConfig.Builder = SourceConfig.builder()

    /** @param buildTriggers the value to be set. */
    public fun buildTriggers(buildTriggers: CfnProjectProjectTriggersPropertyDsl.() -> Unit = {}) {
        val builder = CfnProjectProjectTriggersPropertyDsl()
        builder.apply(buildTriggers)
        cdkBuilder.buildTriggers(builder.build())
    }

    /** @param buildTriggers the value to be set. */
    public fun buildTriggers(buildTriggers: CfnProject.ProjectTriggersProperty) {
        cdkBuilder.buildTriggers(buildTriggers)
    }

    /** @param sourceProperty the value to be set. */
    public fun sourceProperty(sourceProperty: CfnProjectSourcePropertyDsl.() -> Unit = {}) {
        val builder = CfnProjectSourcePropertyDsl()
        builder.apply(sourceProperty)
        cdkBuilder.sourceProperty(builder.build())
    }

    /** @param sourceProperty the value to be set. */
    public fun sourceProperty(sourceProperty: CfnProject.SourceProperty) {
        cdkBuilder.sourceProperty(sourceProperty)
    }

    /** @param sourceVersion `AWS::CodeBuild::Project.SourceVersion`. */
    public fun sourceVersion(sourceVersion: String) {
        cdkBuilder.sourceVersion(sourceVersion)
    }

    public fun build(): SourceConfig = cdkBuilder.build()
}
