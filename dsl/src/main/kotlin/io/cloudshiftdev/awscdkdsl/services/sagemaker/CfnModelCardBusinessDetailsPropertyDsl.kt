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
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * Information about how the model supports business goals.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * BusinessDetailsProperty businessDetailsProperty = BusinessDetailsProperty.builder()
 * .businessProblem("businessProblem")
 * .businessStakeholders("businessStakeholders")
 * .lineOfBusiness("lineOfBusiness")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-businessdetails.html)
 */
@CdkDslMarker
public class CfnModelCardBusinessDetailsPropertyDsl {
    private val cdkBuilder: CfnModelCard.BusinessDetailsProperty.Builder =
        CfnModelCard.BusinessDetailsProperty.builder()

    /** @param businessProblem The specific business problem that the model is trying to solve. */
    public fun businessProblem(businessProblem: String) {
        cdkBuilder.businessProblem(businessProblem)
    }

    /** @param businessStakeholders The relevant stakeholders for the model. */
    public fun businessStakeholders(businessStakeholders: String) {
        cdkBuilder.businessStakeholders(businessStakeholders)
    }

    /** @param lineOfBusiness The broader business need that the model is serving. */
    public fun lineOfBusiness(lineOfBusiness: String) {
        cdkBuilder.lineOfBusiness(lineOfBusiness)
    }

    public fun build(): CfnModelCard.BusinessDetailsProperty = cdkBuilder.build()
}
