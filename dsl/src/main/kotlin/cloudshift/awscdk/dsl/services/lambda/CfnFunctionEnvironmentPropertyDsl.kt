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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnFunction

/**
 * A function's environment variable settings.
 *
 * You can use environment variables to adjust your function's behavior without updating code. An
 * environment variable is a pair of strings that are stored in a function's version-specific
 * configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * EnvironmentProperty environmentProperty = EnvironmentProperty.builder()
 * .variables(Map.of(
 * "variablesKey", "variables"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-environment.html)
 */
@CdkDslMarker
public class CfnFunctionEnvironmentPropertyDsl {
    private val cdkBuilder: CfnFunction.EnvironmentProperty.Builder =
        CfnFunction.EnvironmentProperty.builder()

    /**
     * @param variables Environment variable key-value pairs. For more information, see
     *   [Using Lambda environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html)
     *   .
     */
    public fun variables(variables: Map<String, String>) {
        cdkBuilder.variables(variables)
    }

    /**
     * @param variables Environment variable key-value pairs. For more information, see
     *   [Using Lambda environment variables](https://docs.aws.amazon.com/lambda/latest/dg/configuration-envvars.html)
     *   .
     */
    public fun variables(variables: IResolvable) {
        cdkBuilder.variables(variables)
    }

    public fun build(): CfnFunction.EnvironmentProperty = cdkBuilder.build()
}
