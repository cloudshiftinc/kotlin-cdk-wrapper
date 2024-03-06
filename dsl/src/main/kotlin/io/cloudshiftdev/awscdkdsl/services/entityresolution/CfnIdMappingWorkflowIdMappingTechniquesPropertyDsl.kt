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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow

/**
 * An object which defines the ID mapping techniques and provider configurations.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.entityresolution.*;
 * IdMappingTechniquesProperty idMappingTechniquesProperty = IdMappingTechniquesProperty.builder()
 * .idMappingType("idMappingType")
 * .providerProperties(ProviderPropertiesProperty.builder()
 * .providerServiceArn("providerServiceArn")
 * // the properties below are optional
 * .intermediateSourceConfiguration(IntermediateSourceConfigurationProperty.builder()
 * .intermediateS3Path("intermediateS3Path")
 * .build())
 * .providerConfiguration(Map.of(
 * "providerConfigurationKey", "providerConfiguration"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingtechniques.html)
 */
@CdkDslMarker
public class CfnIdMappingWorkflowIdMappingTechniquesPropertyDsl {
    private val cdkBuilder: CfnIdMappingWorkflow.IdMappingTechniquesProperty.Builder =
        CfnIdMappingWorkflow.IdMappingTechniquesProperty.builder()

    /** @param idMappingType The type of ID mapping. */
    public fun idMappingType(idMappingType: String) {
        cdkBuilder.idMappingType(idMappingType)
    }

    /**
     * @param providerProperties An object which defines any additional configurations required by
     *   the provider service.
     */
    public fun providerProperties(providerProperties: IResolvable) {
        cdkBuilder.providerProperties(providerProperties)
    }

    /**
     * @param providerProperties An object which defines any additional configurations required by
     *   the provider service.
     */
    public fun providerProperties(
        providerProperties: CfnIdMappingWorkflow.ProviderPropertiesProperty
    ) {
        cdkBuilder.providerProperties(providerProperties)
    }

    public fun build(): CfnIdMappingWorkflow.IdMappingTechniquesProperty = cdkBuilder.build()
}
