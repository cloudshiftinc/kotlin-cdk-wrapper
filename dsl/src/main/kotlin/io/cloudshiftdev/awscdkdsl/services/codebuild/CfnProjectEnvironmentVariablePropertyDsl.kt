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
import software.amazon.awscdk.services.codebuild.CfnProject

/**
 * `EnvironmentVariable` is a property of the
 * [AWS CodeBuild Project Environment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environment.html)
 * property type that specifies the name and value of an environment variable for an AWS CodeBuild
 * project environment. When you use the environment to run a build, these variables are available
 * for your builds to use. `EnvironmentVariable` contains a list of `EnvironmentVariable` property
 * types.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * EnvironmentVariableProperty environmentVariableProperty = EnvironmentVariableProperty.builder()
 * .name("name")
 * .value("value")
 * // the properties below are optional
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-environmentvariable.html)
 */
@CdkDslMarker
public class CfnProjectEnvironmentVariablePropertyDsl {
    private val cdkBuilder: CfnProject.EnvironmentVariableProperty.Builder =
        CfnProject.EnvironmentVariableProperty.builder()

    /** @param name The name or key of the environment variable. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param type The type of environment variable. Valid values include:.
     * * `PARAMETER_STORE` : An environment variable stored in Systems Manager Parameter Store. For
     *   environment variables of this type, specify the name of the parameter as the `value` of the
     *   EnvironmentVariable. The parameter value will be substituted for the name at runtime. You
     *   can also define Parameter Store environment variables in the buildspec. To learn how to do
     *   so, see
     *   [env/parameter-store](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec.env.parameter-store)
     *   in the *AWS CodeBuild User Guide* .
     * * `PLAINTEXT` : An environment variable in plain text format. This is the default value.
     * * `SECRETS_MANAGER` : An environment variable stored in AWS Secrets Manager . For environment
     *   variables of this type, specify the name of the secret as the `value` of the
     *   EnvironmentVariable. The secret value will be substituted for the name at runtime. You can
     *   also define AWS Secrets Manager environment variables in the buildspec. To learn how to do
     *   so, see
     *   [env/secrets-manager](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec.env.secrets-manager)
     *   in the *AWS CodeBuild User Guide* .
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param value The value of the environment variable.
     *
     * We strongly discourage the use of `PLAINTEXT` environment variables to store sensitive
     * values, especially AWS secret key IDs. `PLAINTEXT` environment variables can be displayed in
     * plain text using the AWS CodeBuild console and the AWS CLI . For sensitive values, we
     * recommend you use an environment variable of type `PARAMETER_STORE` or `SECRETS_MANAGER` .
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnProject.EnvironmentVariableProperty = cdkBuilder.build()
}
