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

package cloudshift.awscdk.dsl.services.iotfleethub

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotfleethub.CfnApplication
import software.amazon.awscdk.services.iotfleethub.CfnApplicationProps
import software.constructs.Construct

public object iotfleethub {
    /**
     * Represents a Fleet Hub for AWS IoT Device Management web application.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleethub.*;
     * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
     * .applicationName("applicationName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .applicationDescription("applicationDescription")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html)
     */
    public inline fun cfnApplication(
        scope: Construct,
        id: String,
        block: CfnApplicationDsl.() -> Unit = {},
    ): CfnApplication {
        val builder = CfnApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplication`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.iotfleethub.*;
     * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
     * .applicationName("applicationName")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .applicationDescription("applicationDescription")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleethub-application.html)
     */
    public inline fun cfnApplicationProps(
        block: CfnApplicationPropsDsl.() -> Unit = {}
    ): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
