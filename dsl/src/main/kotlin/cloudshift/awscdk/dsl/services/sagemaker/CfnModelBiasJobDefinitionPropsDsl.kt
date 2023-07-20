@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinitionProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnModelBiasJobDefinitionPropsDsl {
    private val cdkBuilder: CfnModelBiasJobDefinitionProps.Builder =
        CfnModelBiasJobDefinitionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
    }

    public fun jobDefinitionName(jobDefinitionName: String) {
        cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    public fun jobResources(jobResources: IResolvable) {
        cdkBuilder.jobResources(jobResources)
    }

    public fun jobResources(jobResources: CfnModelBiasJobDefinition.MonitoringResourcesProperty) {
        cdkBuilder.jobResources(jobResources)
    }

    public fun modelBiasAppSpecification(modelBiasAppSpecification: IResolvable) {
        cdkBuilder.modelBiasAppSpecification(modelBiasAppSpecification)
    }

    public fun modelBiasAppSpecification(modelBiasAppSpecification: CfnModelBiasJobDefinition.ModelBiasAppSpecificationProperty) {
        cdkBuilder.modelBiasAppSpecification(modelBiasAppSpecification)
    }

    public fun modelBiasBaselineConfig(modelBiasBaselineConfig: IResolvable) {
        cdkBuilder.modelBiasBaselineConfig(modelBiasBaselineConfig)
    }

    public fun modelBiasBaselineConfig(modelBiasBaselineConfig: CfnModelBiasJobDefinition.ModelBiasBaselineConfigProperty) {
        cdkBuilder.modelBiasBaselineConfig(modelBiasBaselineConfig)
    }

    public fun modelBiasJobInput(modelBiasJobInput: IResolvable) {
        cdkBuilder.modelBiasJobInput(modelBiasJobInput)
    }

    public fun modelBiasJobInput(modelBiasJobInput: CfnModelBiasJobDefinition.ModelBiasJobInputProperty) {
        cdkBuilder.modelBiasJobInput(modelBiasJobInput)
    }

    public fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: IResolvable) {
        cdkBuilder.modelBiasJobOutputConfig(modelBiasJobOutputConfig)
    }

    public fun modelBiasJobOutputConfig(modelBiasJobOutputConfig: CfnModelBiasJobDefinition.MonitoringOutputConfigProperty) {
        cdkBuilder.modelBiasJobOutputConfig(modelBiasJobOutputConfig)
    }

    public fun networkConfig(networkConfig: IResolvable) {
        cdkBuilder.networkConfig(networkConfig)
    }

    public fun networkConfig(networkConfig: CfnModelBiasJobDefinition.NetworkConfigProperty) {
        cdkBuilder.networkConfig(networkConfig)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun stoppingCondition(stoppingCondition: IResolvable) {
        cdkBuilder.stoppingCondition(stoppingCondition)
    }

    public fun stoppingCondition(stoppingCondition: CfnModelBiasJobDefinition.StoppingConditionProperty) {
        cdkBuilder.stoppingCondition(stoppingCondition)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnModelBiasJobDefinitionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
