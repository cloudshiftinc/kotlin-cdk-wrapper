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

package io.cloudshiftdev.awscdkdsl.services.amplify

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amplify.CfnBranch

/**
 * The EnvironmentVariable property type sets environment variables for a specific branch.
 *
 * Environment variables are key-value pairs that are available at build time.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplify.*;
 * EnvironmentVariableProperty environmentVariableProperty = EnvironmentVariableProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-environmentvariable.html)
 */
@CdkDslMarker
public class CfnBranchEnvironmentVariablePropertyDsl {
    private val cdkBuilder: CfnBranch.EnvironmentVariableProperty.Builder =
        CfnBranch.EnvironmentVariableProperty.builder()

    /**
     * @param name The environment variable name. *Length Constraints:* Maximum length of 255.
     *
     * *Pattern:* (?s).*
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param value The environment variable value. *Length Constraints:* Maximum length of 5500.
     *
     * *Pattern:* (?s).*
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnBranch.EnvironmentVariableProperty = cdkBuilder.build()
}
