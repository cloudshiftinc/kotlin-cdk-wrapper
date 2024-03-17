@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit

/**
 * Example:
 *
 * ```
 * // later:
 * PipelineProject project;
 * Artifact sourceOutput = new Artifact();
 * CodeBuildAction buildAction = CodeBuildAction.Builder.create()
 * .actionName("Build1")
 * .input(sourceOutput)
 * .project(PipelineProject.Builder.create(this, "Project")
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2",
 * "env", Map.of(
 * "exported-variables", List.of("MY_VAR")),
 * "phases", Map.of(
 * "build", Map.of(
 * "commands", "export MY_VAR=\"some value\"")))))
 * .build())
 * .variablesNamespace("MyNamespace")
 * .build();
 * CodeBuildAction.Builder.create()
 * .actionName("CodeBuild")
 * .project(project)
 * .input(sourceOutput)
 * .environmentVariables(Map.of(
 * "MyVar", BuildEnvironmentVariable.builder()
 * .value(buildAction.variable("MY_VAR"))
 * .build()))
 * .build();
 * ```
 */
public interface BuildEnvironmentVariable {
  /**
   * The type of environment variable.
   *
   * Default: PlainText
   */
  public fun type(): BuildEnvironmentVariableType? =
      unwrap(this).getType()?.let(BuildEnvironmentVariableType::wrap)

  /**
   * The value of the environment variable.
   *
   * For plain-text variables (the default), this is the literal value of variable.
   * For SSM parameter variables, pass the name of the parameter here (`parameterName` property of
   * `IParameter`).
   * For SecretsManager variables secrets, pass either the secret name (`secretName` property of
   * `ISecret`)
   * or the secret ARN (`secretArn` property of `ISecret`) here,
   * along with optional SecretsManager qualifiers separated by ':', like the JSON key, or the
   * version or stage
   * (see
   * https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec.env.secrets-manager
   * for details).
   */
  public fun `value`(): Any

  /**
   * A builder for [BuildEnvironmentVariable]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param type The type of environment variable.
     */
    public fun type(type: BuildEnvironmentVariableType)

    /**
     * @param value The value of the environment variable. 
     * For plain-text variables (the default), this is the literal value of variable.
     * For SSM parameter variables, pass the name of the parameter here (`parameterName` property of
     * `IParameter`).
     * For SecretsManager variables secrets, pass either the secret name (`secretName` property of
     * `ISecret`)
     * or the secret ARN (`secretArn` property of `ISecret`) here,
     * along with optional SecretsManager qualifiers separated by ':', like the JSON key, or the
     * version or stage
     * (see
     * https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec.env.secrets-manager
     * for details).
     */
    public fun `value`(`value`: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable.Builder =
        software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable.builder()

    /**
     * @param type The type of environment variable.
     */
    override fun type(type: BuildEnvironmentVariableType) {
      cdkBuilder.type(type.let(BuildEnvironmentVariableType::unwrap))
    }

    /**
     * @param value The value of the environment variable. 
     * For plain-text variables (the default), this is the literal value of variable.
     * For SSM parameter variables, pass the name of the parameter here (`parameterName` property of
     * `IParameter`).
     * For SecretsManager variables secrets, pass either the secret name (`secretName` property of
     * `ISecret`)
     * or the secret ARN (`secretArn` property of `ISecret`) here,
     * along with optional SecretsManager qualifiers separated by ':', like the JSON key, or the
     * version or stage
     * (see
     * https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec.env.secrets-manager
     * for details).
     */
    override fun `value`(`value`: Any) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable,
  ) : CdkObject(cdkObject), BuildEnvironmentVariable {
    /**
     * The type of environment variable.
     *
     * Default: PlainText
     */
    override fun type(): BuildEnvironmentVariableType? =
        unwrap(this).getType()?.let(BuildEnvironmentVariableType::wrap)

    /**
     * The value of the environment variable.
     *
     * For plain-text variables (the default), this is the literal value of variable.
     * For SSM parameter variables, pass the name of the parameter here (`parameterName` property of
     * `IParameter`).
     * For SecretsManager variables secrets, pass either the secret name (`secretName` property of
     * `ISecret`)
     * or the secret ARN (`secretArn` property of `ISecret`) here,
     * along with optional SecretsManager qualifiers separated by ':', like the JSON key, or the
     * version or stage
     * (see
     * https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec.env.secrets-manager
     * for details).
     */
    override fun `value`(): Any = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BuildEnvironmentVariable {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable):
        BuildEnvironmentVariable = CdkObjectWrappers.wrap(cdkObject) as? BuildEnvironmentVariable ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BuildEnvironmentVariable):
        software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable
  }
}
