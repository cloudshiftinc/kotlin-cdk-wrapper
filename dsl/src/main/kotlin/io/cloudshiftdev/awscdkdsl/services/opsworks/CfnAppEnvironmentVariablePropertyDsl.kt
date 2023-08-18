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

package io.cloudshiftdev.awscdkdsl.services.opsworks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnApp

/**
 * Represents an app's environment variable.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * EnvironmentVariableProperty environmentVariableProperty = EnvironmentVariableProperty.builder()
 * .key("key")
 * .value("value")
 * // the properties below are optional
 * .secure(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-app-environmentvariable.html)
 */
@CdkDslMarker
public class CfnAppEnvironmentVariablePropertyDsl {
    private val cdkBuilder: CfnApp.EnvironmentVariableProperty.Builder =
        CfnApp.EnvironmentVariableProperty.builder()

    /**
     * @param key (Required) The environment variable's name, which can consist of up to 64
     *   characters and must be specified. The name can contain upper- and lowercase letters,
     *   numbers, and underscores (_), but it must start with a letter or underscore.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param secure (Optional) Whether the variable's value is returned by the
     *   [DescribeApps](https://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeApps)
     *   action. To hide an environment variable's value, set `Secure` to `true` . `DescribeApps`
     *   returns `*****FILTERED*****` instead of the actual value. The default value for `Secure` is
     *   `false` .
     */
    public fun secure(secure: Boolean) {
        cdkBuilder.secure(secure)
    }

    /**
     * @param secure (Optional) Whether the variable's value is returned by the
     *   [DescribeApps](https://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeApps)
     *   action. To hide an environment variable's value, set `Secure` to `true` . `DescribeApps`
     *   returns `*****FILTERED*****` instead of the actual value. The default value for `Secure` is
     *   `false` .
     */
    public fun secure(secure: IResolvable) {
        cdkBuilder.secure(secure)
    }

    /**
     * @param value (Optional) The environment variable's value, which can be left empty. If you
     *   specify a value, it can contain up to 256 characters, which must all be printable.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnApp.EnvironmentVariableProperty = cdkBuilder.build()
}
