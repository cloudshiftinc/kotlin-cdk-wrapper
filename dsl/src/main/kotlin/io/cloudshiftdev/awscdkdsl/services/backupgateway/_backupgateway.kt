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

package io.cloudshiftdev.awscdkdsl.services.backupgateway

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backupgateway.CfnHypervisor
import software.amazon.awscdk.services.backupgateway.CfnHypervisorProps
import software.constructs.Construct

public object backupgateway {
    /**
     * Represents the hypervisor's permissions to which the gateway will connect.
     *
     * A hypervisor is hardware, software, or firmware that creates and manages virtual machines,
     * and allocates resources to them.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backupgateway.*;
     * CfnHypervisor cfnHypervisor = CfnHypervisor.Builder.create(this, "MyCfnHypervisor")
     * .host("host")
     * .kmsKeyArn("kmsKeyArn")
     * .logGroupArn("logGroupArn")
     * .name("name")
     * .password("password")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html)
     */
    public inline fun cfnHypervisor(
        scope: Construct,
        id: String,
        block: CfnHypervisorDsl.() -> Unit = {},
    ): CfnHypervisor {
        val builder = CfnHypervisorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnHypervisor`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.backupgateway.*;
     * CfnHypervisorProps cfnHypervisorProps = CfnHypervisorProps.builder()
     * .host("host")
     * .kmsKeyArn("kmsKeyArn")
     * .logGroupArn("logGroupArn")
     * .name("name")
     * .password("password")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .username("username")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backupgateway-hypervisor.html)
     */
    public inline fun cfnHypervisorProps(
        block: CfnHypervisorPropsDsl.() -> Unit = {}
    ): CfnHypervisorProps {
        val builder = CfnHypervisorPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
