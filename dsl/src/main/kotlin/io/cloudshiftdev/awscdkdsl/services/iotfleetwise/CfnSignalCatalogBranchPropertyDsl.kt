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

package io.cloudshiftdev.awscdkdsl.services.iotfleetwise

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog

/**
 * A group of signals that are defined in a hierarchical structure.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * BranchProperty branchProperty = BranchProperty.builder()
 * .fullyQualifiedName("fullyQualifiedName")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-signalcatalog-branch.html)
 */
@CdkDslMarker
public class CfnSignalCatalogBranchPropertyDsl {
    private val cdkBuilder: CfnSignalCatalog.BranchProperty.Builder =
        CfnSignalCatalog.BranchProperty.builder()

    /** @param description (Optional) A brief description of the branch. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param fullyQualifiedName The fully qualified name of the branch. For example, the fully
     *   qualified name of a branch might be `Vehicle.Body.Engine` .
     */
    public fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
    }

    public fun build(): CfnSignalCatalog.BranchProperty = cdkBuilder.build()
}
