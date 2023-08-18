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
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * EmptyDirProperty emptyDirProperty = EmptyDirProperty.builder()
 * .medium("medium")
 * .sizeLimit("sizeLimit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-emptydir.html)
 */
@CdkDslMarker
public class CfnJobDefinitionEmptyDirPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.EmptyDirProperty.Builder =
        CfnJobDefinition.EmptyDirProperty.builder()

    /** @param medium the value to be set. */
    public fun medium(medium: String) {
        cdkBuilder.medium(medium)
    }

    /** @param sizeLimit the value to be set. */
    public fun sizeLimit(sizeLimit: String) {
        cdkBuilder.sizeLimit(sizeLimit)
    }

    public fun build(): CfnJobDefinition.EmptyDirProperty = cdkBuilder.build()
}
