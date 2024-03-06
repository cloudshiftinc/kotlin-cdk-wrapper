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

package io.cloudshiftdev.awscdkdsl.services.entityresolution

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow

/**
 * An object containing the `providerServiceARN` , `intermediateSourceConfiguration` , and
 * `providerConfiguration` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.entityresolution.*;
 * ProviderPropertiesProperty providerPropertiesProperty = ProviderPropertiesProperty.builder()
 * .providerServiceArn("providerServiceArn")
 * // the properties below are optional
 * .intermediateSourceConfiguration(IntermediateSourceConfigurationProperty.builder()
 * .intermediateS3Path("intermediateS3Path")
 * .build())
 * .providerConfiguration(Map.of(
 * "providerConfigurationKey", "providerConfiguration"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-providerproperties.html)
 */
@CdkDslMarker
public class CfnIdMappingWorkflowProviderPropertiesPropertyDsl {
    private val cdkBuilder: CfnIdMappingWorkflow.ProviderPropertiesProperty.Builder =
        CfnIdMappingWorkflow.ProviderPropertiesProperty.builder()

    /**
     * @param intermediateSourceConfiguration The Amazon S3 location that temporarily stores your
     *   data while it processes. Your information won't be saved permanently.
     */
    public fun intermediateSourceConfiguration(intermediateSourceConfiguration: IResolvable) {
        cdkBuilder.intermediateSourceConfiguration(intermediateSourceConfiguration)
    }

    /**
     * @param intermediateSourceConfiguration The Amazon S3 location that temporarily stores your
     *   data while it processes. Your information won't be saved permanently.
     */
    public fun intermediateSourceConfiguration(
        intermediateSourceConfiguration:
            CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty
    ) {
        cdkBuilder.intermediateSourceConfiguration(intermediateSourceConfiguration)
    }

    /**
     * @param providerConfiguration The required configuration fields to use with the provider
     *   service.
     */
    public fun providerConfiguration(providerConfiguration: Map<String, String>) {
        cdkBuilder.providerConfiguration(providerConfiguration)
    }

    /**
     * @param providerConfiguration The required configuration fields to use with the provider
     *   service.
     */
    public fun providerConfiguration(providerConfiguration: IResolvable) {
        cdkBuilder.providerConfiguration(providerConfiguration)
    }

    /** @param providerServiceArn The ARN of the provider service. */
    public fun providerServiceArn(providerServiceArn: String) {
        cdkBuilder.providerServiceArn(providerServiceArn)
    }

    public fun build(): CfnIdMappingWorkflow.ProviderPropertiesProperty = cdkBuilder.build()
}
