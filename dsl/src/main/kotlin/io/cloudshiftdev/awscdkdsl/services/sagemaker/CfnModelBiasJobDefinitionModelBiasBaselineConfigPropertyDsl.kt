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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

/**
 * The configuration for a baseline model bias job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelBiasBaselineConfigProperty modelBiasBaselineConfigProperty =
 * ModelBiasBaselineConfigProperty.builder()
 * .baseliningJobName("baseliningJobName")
 * .constraintsResource(ConstraintsResourceProperty.builder()
 * .s3Uri("s3Uri")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasbaselineconfig.html)
 */
@CdkDslMarker
public class CfnModelBiasJobDefinitionModelBiasBaselineConfigPropertyDsl {
    private val cdkBuilder: CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty.Builder =
        CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty.builder()

    /** @param baseliningJobName The name of the baseline model bias job. */
    public fun baseliningJobName(baseliningJobName: String) {
        cdkBuilder.baseliningJobName(baseliningJobName)
    }

    /** @param constraintsResource The constraints resource for a monitoring job. */
    public fun constraintsResource(constraintsResource: IResolvable) {
        cdkBuilder.constraintsResource(constraintsResource)
    }

    /** @param constraintsResource The constraints resource for a monitoring job. */
    public fun constraintsResource(
        constraintsResource: CfnModelBiasJobDefinition.ConstraintsResourceProperty
    ) {
        cdkBuilder.constraintsResource(constraintsResource)
    }

    public fun build(): CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty =
        cdkBuilder.build()
}
