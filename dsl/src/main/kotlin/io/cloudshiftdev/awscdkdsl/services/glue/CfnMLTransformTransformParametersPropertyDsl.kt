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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnMLTransform

/**
 * The algorithm-specific parameters that are associated with the machine learning transform.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * TransformParametersProperty transformParametersProperty = TransformParametersProperty.builder()
 * .transformType("transformType")
 * // the properties below are optional
 * .findMatchesParameters(FindMatchesParametersProperty.builder()
 * .primaryKeyColumnName("primaryKeyColumnName")
 * // the properties below are optional
 * .accuracyCostTradeoff(123)
 * .enforceProvidedLabels(false)
 * .precisionRecallTradeoff(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-transformparameters.html)
 */
@CdkDslMarker
public class CfnMLTransformTransformParametersPropertyDsl {
    private val cdkBuilder: CfnMLTransform.TransformParametersProperty.Builder =
        CfnMLTransform.TransformParametersProperty.builder()

    /** @param findMatchesParameters The parameters for the find matches algorithm. */
    public fun findMatchesParameters(findMatchesParameters: IResolvable) {
        cdkBuilder.findMatchesParameters(findMatchesParameters)
    }

    /** @param findMatchesParameters The parameters for the find matches algorithm. */
    public fun findMatchesParameters(
        findMatchesParameters: CfnMLTransform.FindMatchesParametersProperty
    ) {
        cdkBuilder.findMatchesParameters(findMatchesParameters)
    }

    /**
     * @param transformType The type of machine learning transform. `FIND_MATCHES` is the only
     *   option.
     *
     * For information about the types of machine learning transforms, see
     * [Creating Machine Learning Transforms](https://docs.aws.amazon.com/glue/latest/dg/add-job-machine-learning-transform.html)
     * .
     */
    public fun transformType(transformType: String) {
        cdkBuilder.transformType(transformType)
    }

    public fun build(): CfnMLTransform.TransformParametersProperty = cdkBuilder.build()
}
