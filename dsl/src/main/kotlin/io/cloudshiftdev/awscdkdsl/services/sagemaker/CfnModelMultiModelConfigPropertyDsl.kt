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
import software.amazon.awscdk.services.sagemaker.CfnModel

/**
 * Specifies additional configuration for hosting multi-model endpoints.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * MultiModelConfigProperty multiModelConfigProperty = MultiModelConfigProperty.builder()
 * .modelCacheSetting("modelCacheSetting")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-multimodelconfig.html)
 */
@CdkDslMarker
public class CfnModelMultiModelConfigPropertyDsl {
    private val cdkBuilder: CfnModel.MultiModelConfigProperty.Builder =
        CfnModel.MultiModelConfigProperty.builder()

    /**
     * @param modelCacheSetting Whether to cache models for a multi-model endpoint. By default,
     *   multi-model endpoints cache models so that a model does not have to be loaded into memory
     *   each time it is invoked. Some use cases do not benefit from model caching. For example, if
     *   an endpoint hosts a large number of models that are each invoked infrequently, the endpoint
     *   might perform better if you disable model caching. To disable model caching, set the value
     *   of this parameter to Disabled.
     */
    public fun modelCacheSetting(modelCacheSetting: String) {
        cdkBuilder.modelCacheSetting(modelCacheSetting)
    }

    public fun build(): CfnModel.MultiModelConfigProperty = cdkBuilder.build()
}
