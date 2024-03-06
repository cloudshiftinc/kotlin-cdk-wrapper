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
import software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow

/**
 * An object which defines the `resolutionType` and the `ruleBasedProperties` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.entityresolution.*;
 * ResolutionTechniquesProperty resolutionTechniquesProperty =
 * ResolutionTechniquesProperty.builder()
 * .providerProperties(ProviderPropertiesProperty.builder()
 * .providerServiceArn("providerServiceArn")
 * // the properties below are optional
 * .intermediateSourceConfiguration(IntermediateSourceConfigurationProperty.builder()
 * .intermediateS3Path("intermediateS3Path")
 * .build())
 * .providerConfiguration(Map.of(
 * "providerConfigurationKey", "providerConfiguration"))
 * .build())
 * .resolutionType("resolutionType")
 * .ruleBasedProperties(RuleBasedPropertiesProperty.builder()
 * .attributeMatchingModel("attributeMatchingModel")
 * .rules(List.of(RuleProperty.builder()
 * .matchingKeys(List.of("matchingKeys"))
 * .ruleName("ruleName")
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-resolutiontechniques.html)
 */
@CdkDslMarker
public class CfnMatchingWorkflowResolutionTechniquesPropertyDsl {
    private val cdkBuilder: CfnMatchingWorkflow.ResolutionTechniquesProperty.Builder =
        CfnMatchingWorkflow.ResolutionTechniquesProperty.builder()

    /** @param providerProperties The properties of the provider service. */
    public fun providerProperties(providerProperties: IResolvable) {
        cdkBuilder.providerProperties(providerProperties)
    }

    /** @param providerProperties The properties of the provider service. */
    public fun providerProperties(
        providerProperties: CfnMatchingWorkflow.ProviderPropertiesProperty
    ) {
        cdkBuilder.providerProperties(providerProperties)
    }

    /**
     * @param resolutionType The type of matching. There are two types of matching: `RULE_MATCHING`
     *   and `ML_MATCHING` .
     */
    public fun resolutionType(resolutionType: String) {
        cdkBuilder.resolutionType(resolutionType)
    }

    /**
     * @param ruleBasedProperties An object which defines the list of matching rules to run and has
     *   a field `Rules` , which is a list of rule objects.
     */
    public fun ruleBasedProperties(ruleBasedProperties: IResolvable) {
        cdkBuilder.ruleBasedProperties(ruleBasedProperties)
    }

    /**
     * @param ruleBasedProperties An object which defines the list of matching rules to run and has
     *   a field `Rules` , which is a list of rule objects.
     */
    public fun ruleBasedProperties(
        ruleBasedProperties: CfnMatchingWorkflow.RuleBasedPropertiesProperty
    ) {
        cdkBuilder.ruleBasedProperties(ruleBasedProperties)
    }

    public fun build(): CfnMatchingWorkflow.ResolutionTechniquesProperty = cdkBuilder.build()
}
