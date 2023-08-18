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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * The `ulimit` settings to pass to the container.
 *
 * This object isn't applicable to jobs that are running on Fargate resources.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * UlimitProperty ulimitProperty = UlimitProperty.builder()
 * .hardLimit(123)
 * .name("name")
 * .softLimit(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-ulimit.html)
 */
@CdkDslMarker
public class CfnJobDefinitionUlimitPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.UlimitProperty.Builder =
        CfnJobDefinition.UlimitProperty.builder()

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

    public fun build(): CfnJobDefinition.UlimitProperty = cdkBuilder.build()
}
