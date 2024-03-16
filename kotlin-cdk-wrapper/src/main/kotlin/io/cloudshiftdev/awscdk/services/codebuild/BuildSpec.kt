@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

/**
 * BuildSpec for CodeBuild projects.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * Project codebuildProject = Project.Builder.create(this, "Project")
 * .projectName("MyTestProject")
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2",
 * "phases", Map.of(
 * "build", Map.of(
 * "commands", List.of("echo \"Hello, CodeBuild!\""))))))
 * .build();
 * CodeBuildStartBuild task = CodeBuildStartBuild.Builder.create(this, "Task")
 * .project(codebuildProject)
 * .integrationPattern(IntegrationPattern.RUN_JOB)
 * .environmentVariablesOverride(Map.of(
 * "ZONE", BuildEnvironmentVariable.builder()
 * .type(BuildEnvironmentVariableType.PLAINTEXT)
 * .value(JsonPath.stringAt("$.envVariables.zone"))
 * .build()))
 * .build();
 * ```
 */
public abstract class BuildSpec internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.BuildSpec,
) : CdkObject(cdkObject) {
  /**
   * Whether the buildspec is directly available or deferred until build-time.
   */
  public open fun isImmediate(): Boolean = unwrap(this).getIsImmediate()

  /**
   * Render the represented BuildSpec.
   *
   * @param scope
   */
  public open fun toBuildSpec(): String = unwrap(this).toBuildSpec()

  /**
   * Render the represented BuildSpec.
   *
   * @param scope
   */
  public open fun toBuildSpec(scope: Construct): String =
      unwrap(this).toBuildSpec(scope.let(Construct::unwrap))

  public companion object {
    public fun fromAsset(path: String): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromAsset(path).let(BuildSpec::wrap)

    public fun fromObject(`value`: Map<String, Any>): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromObject(`value`).let(BuildSpec::wrap)

    public fun fromObjectToYaml(`value`: Map<String, Any>): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromObjectToYaml(`value`).let(BuildSpec::wrap)

    public fun fromSourceFilename(filename: String): BuildSpec =
        software.amazon.awscdk.services.codebuild.BuildSpec.fromSourceFilename(filename).let(BuildSpec::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BuildSpec): BuildSpec =
        CdkObjectWrappers.wrap(cdkObject) as BuildSpec

    internal fun unwrap(wrapped: BuildSpec): software.amazon.awscdk.services.codebuild.BuildSpec =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.BuildSpec
  }
}
