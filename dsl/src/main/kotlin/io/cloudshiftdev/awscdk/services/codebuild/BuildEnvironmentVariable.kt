package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Unit

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
        BuildEnvironmentVariable = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BuildEnvironmentVariable):
        software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable
  }
}
