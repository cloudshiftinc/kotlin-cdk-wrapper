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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnRecipe

/**
 * Represents a transformation and associated parameters that are used to apply a change to an AWS
 * Glue DataBrew dataset.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * ActionProperty actionProperty = ActionProperty.builder()
 * .operation("operation")
 * // the properties below are optional
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-recipe-action.html)
 */
@CdkDslMarker
public class CfnRecipeActionPropertyDsl {
    private val cdkBuilder: CfnRecipe.ActionProperty.Builder = CfnRecipe.ActionProperty.builder()

    /** @param operation The name of a valid DataBrew transformation to be performed on the data. */
    public fun operation(operation: String) {
        cdkBuilder.operation(operation)
    }

    /** @param parameters Contextual parameters for the transformation. */
    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    /** @param parameters Contextual parameters for the transformation. */
    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    public fun build(): CfnRecipe.ActionProperty = cdkBuilder.build()
}
