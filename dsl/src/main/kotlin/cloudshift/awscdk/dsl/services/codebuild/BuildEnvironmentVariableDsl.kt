@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable
import software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType

@CdkDslMarker
public class BuildEnvironmentVariableDsl {
  private val cdkBuilder: BuildEnvironmentVariable.Builder = BuildEnvironmentVariable.builder()

  /**
   * @param type The type of environment variable.
   */
  public fun type(type: BuildEnvironmentVariableType) {
    cdkBuilder.type(type)
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
  public fun `value`(`value`: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(`value`)
    cdkBuilder.`value`(builder.map)
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
  public fun `value`(`value`: Any) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): BuildEnvironmentVariable = cdkBuilder.build()
}
