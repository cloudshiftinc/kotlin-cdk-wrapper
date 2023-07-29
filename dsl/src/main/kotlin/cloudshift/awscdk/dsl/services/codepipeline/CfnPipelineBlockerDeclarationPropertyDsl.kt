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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codepipeline.CfnPipeline

/**
 * Reserved for future use.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * BlockerDeclarationProperty blockerDeclarationProperty = BlockerDeclarationProperty.builder()
 * .name("name")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-blockerdeclaration.html)
 */
@CdkDslMarker
public class CfnPipelineBlockerDeclarationPropertyDsl {
    private val cdkBuilder: CfnPipeline.BlockerDeclarationProperty.Builder =
        CfnPipeline.BlockerDeclarationProperty.builder()

    /** @param name Reserved for future use. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param type Reserved for future use. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnPipeline.BlockerDeclarationProperty = cdkBuilder.build()
}
