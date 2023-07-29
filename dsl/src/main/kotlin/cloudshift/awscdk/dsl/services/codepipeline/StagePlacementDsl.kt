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
import software.amazon.awscdk.services.codepipeline.IStage
import software.amazon.awscdk.services.codepipeline.StagePlacement

/**
 * Allows you to control where to place a new Stage when it's added to the Pipeline.
 *
 * Note that you can provide only one of the below properties - specifying more than one will result
 * in a validation error.
 *
 * Example:
 * ```
 * // Insert a new Stage at an arbitrary point
 * Pipeline pipeline;
 * IStage anotherStage;
 * IStage yetAnotherStage;
 * IStage someStage = pipeline.addStage(StageOptions.builder()
 * .stageName("SomeStage")
 * .placement(StagePlacement.builder()
 * // note: you can only specify one of the below properties
 * .rightBefore(anotherStage)
 * .justAfter(yetAnotherStage)
 * .build())
 * .build());
 * ```
 *
 * [Documentation]( #justAfter)
 */
@CdkDslMarker
public class StagePlacementDsl {
    private val cdkBuilder: StagePlacement.Builder = StagePlacement.builder()

    /**
     * @param justAfter Inserts the new Stage as a child of the given Stage (changing its current
     *   child Stage, if it had one).
     */
    public fun justAfter(justAfter: IStage) {
        cdkBuilder.justAfter(justAfter)
    }

    /**
     * @param rightBefore Inserts the new Stage as a parent of the given Stage (changing its current
     *   parent Stage, if it had one).
     */
    public fun rightBefore(rightBefore: IStage) {
        cdkBuilder.rightBefore(rightBefore)
    }

    public fun build(): StagePlacement = cdkBuilder.build()
}
