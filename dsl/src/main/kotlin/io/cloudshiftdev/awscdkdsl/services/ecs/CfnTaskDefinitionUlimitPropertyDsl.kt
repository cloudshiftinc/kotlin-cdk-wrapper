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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * The `ulimit` settings to pass to the container.
 *
 * Amazon ECS tasks hosted on AWS Fargate use the default resource limit values set by the operating
 * system with the exception of the `nofile` resource limit parameter which AWS Fargate overrides.
 * The `nofile` resource limit sets a restriction on the number of open files that a container can
 * use. The default `nofile` soft limit is `1024` and the default hard limit is `4096` .
 *
 * You can specify the `ulimit` settings for a container in a task definition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * UlimitProperty ulimitProperty = UlimitProperty.builder()
 * .hardLimit(123)
 * .name("name")
 * .softLimit(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-ulimit.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionUlimitPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.UlimitProperty.Builder =
        CfnTaskDefinition.UlimitProperty.builder()

    /** @param hardLimit The hard limit for the `ulimit` type. */
    public fun hardLimit(hardLimit: Number) {
        cdkBuilder.hardLimit(hardLimit)
    }

    /** @param name The `type` of the `ulimit` . */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param softLimit The soft limit for the `ulimit` type. */
    public fun softLimit(softLimit: Number) {
        cdkBuilder.softLimit(softLimit)
    }

    public fun build(): CfnTaskDefinition.UlimitProperty = cdkBuilder.build()
}
