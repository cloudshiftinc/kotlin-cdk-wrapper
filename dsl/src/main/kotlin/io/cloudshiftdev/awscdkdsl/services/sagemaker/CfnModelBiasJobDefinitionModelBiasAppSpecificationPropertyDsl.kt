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
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition

/**
 * Docker container image configuration object for the model bias job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelBiasAppSpecificationProperty modelBiasAppSpecificationProperty =
 * ModelBiasAppSpecificationProperty.builder()
 * .configUri("configUri")
 * .imageUri("imageUri")
 * // the properties below are optional
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelbiasjobdefinition-modelbiasappspecification.html)
 */
@CdkDslMarker
public class CfnModelBiasJobDefinitionModelBiasAppSpecificationPropertyDsl {
    private val cdkBuilder: CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.Builder =
        CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty.builder()

    /**
     * @param configUri JSON formatted S3 file that defines bias parameters. For more information on
     *   this JSON configuration file, see
     *   [Configure bias parameters](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-config-json-monitor-bias-parameters.html)
     *   .
     */
    public fun configUri(configUri: String) {
        cdkBuilder.configUri(configUri)
    }

    /** @param environment Sets the environment variables in the Docker container. */
    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    /** @param environment Sets the environment variables in the Docker container. */
    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    /** @param imageUri The container image to be run by the model bias job. */
    public fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
    }

    public fun build(): CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty =
        cdkBuilder.build()
}
