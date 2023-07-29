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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.TreeArtifactProperties

/**
 * Artifact properties for the Construct Tree Artifact.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cloudassembly.schema.*;
 * TreeArtifactProperties treeArtifactProperties = TreeArtifactProperties.builder()
 * .file("file")
 * .build();
 * ```
 */
@CdkDslMarker
public class TreeArtifactPropertiesDsl {
    private val cdkBuilder: TreeArtifactProperties.Builder = TreeArtifactProperties.builder()

    /** @param file Filename of the tree artifact. */
    public fun `file`(`file`: String) {
        cdkBuilder.`file`(`file`)
    }

    public fun build(): TreeArtifactProperties = cdkBuilder.build()
}
