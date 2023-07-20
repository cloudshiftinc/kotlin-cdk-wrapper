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
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataQualityJobDefinitionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDataQualityJobDefinition.Builder =
        CfnDataQualityJobDefinition.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun dataQualityAppSpecification(dataQualityAppSpecification: IResolvable) {
        cdkBuilder.dataQualityAppSpecification(dataQualityAppSpecification)
    }

    public fun dataQualityAppSpecification(dataQualityAppSpecification: CfnDataQualityJobDefinition.DataQualityAppSpecificationProperty) {
        cdkBuilder.dataQualityAppSpecification(dataQualityAppSpecification)
    }

    public fun dataQualityBaselineConfig(dataQualityBaselineConfig: IResolvable) {
        cdkBuilder.dataQualityBaselineConfig(dataQualityBaselineConfig)
    }

    public fun dataQualityBaselineConfig(dataQualityBaselineConfig: CfnDataQualityJobDefinition.DataQualityBaselineConfigProperty) {
        cdkBuilder.dataQualityBaselineConfig(dataQualityBaselineConfig)
    }

    public fun dataQualityJobInput(dataQualityJobInput: IResolvable) {
        cdkBuilder.dataQualityJobInput(dataQualityJobInput)
    }

    public fun dataQualityJobInput(dataQualityJobInput: CfnDataQualityJobDefinition.DataQualityJobInputProperty) {
        cdkBuilder.dataQualityJobInput(dataQualityJobInput)
    }

    public fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: IResolvable) {
        cdkBuilder.dataQualityJobOutputConfig(dataQualityJobOutputConfig)
    }

    public fun dataQualityJobOutputConfig(dataQualityJobOutputConfig: CfnDataQualityJobDefinition.MonitoringOutputConfigProperty) {
        cdkBuilder.dataQualityJobOutputConfig(dataQualityJobOutputConfig)
    }

    public fun endpointName(endpointName: String) {
        cdkBuilder.endpointName(endpointName)
    }

    public fun jobDefinitionName(jobDefinitionName: String) {
        cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    public fun jobResources(jobResources: IResolvable) {
        cdkBuilder.jobResources(jobResources)
    }

    public fun jobResources(jobResources: CfnDataQualityJobDefinition.MonitoringResourcesProperty) {
        cdkBuilder.jobResources(jobResources)
    }

    public fun networkConfig(networkConfig: IResolvable) {
        cdkBuilder.networkConfig(networkConfig)
    }

    public fun networkConfig(networkConfig: CfnDataQualityJobDefinition.NetworkConfigProperty) {
        cdkBuilder.networkConfig(networkConfig)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun stoppingCondition(stoppingCondition: IResolvable) {
        cdkBuilder.stoppingCondition(stoppingCondition)
    }

    public fun stoppingCondition(stoppingCondition: CfnDataQualityJobDefinition.StoppingConditionProperty) {
        cdkBuilder.stoppingCondition(stoppingCondition)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDataQualityJobDefinition {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
