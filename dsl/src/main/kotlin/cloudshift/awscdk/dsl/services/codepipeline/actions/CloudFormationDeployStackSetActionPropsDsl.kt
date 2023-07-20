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

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnCapabilities
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeployStackSetActionProps
import software.amazon.awscdk.services.codepipeline.actions.StackInstances
import software.amazon.awscdk.services.codepipeline.actions.StackSetDeploymentModel
import software.amazon.awscdk.services.codepipeline.actions.StackSetParameters
import software.amazon.awscdk.services.codepipeline.actions.StackSetTemplate
import software.amazon.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CloudFormationDeployStackSetActionPropsDsl {
    private val cdkBuilder: CloudFormationDeployStackSetActionProps.Builder =
        CloudFormationDeployStackSetActionProps.builder()

    private val _cfnCapabilities: MutableList<CfnCapabilities> = mutableListOf()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun cfnCapabilities(vararg cfnCapabilities: CfnCapabilities) {
        _cfnCapabilities.addAll(listOf(*cfnCapabilities))
    }

    public fun cfnCapabilities(cfnCapabilities: Collection<CfnCapabilities>) {
        _cfnCapabilities.addAll(cfnCapabilities)
    }

    public fun deploymentModel(deploymentModel: StackSetDeploymentModel) {
        cdkBuilder.deploymentModel(deploymentModel)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun failureTolerancePercentage(failureTolerancePercentage: Number) {
        cdkBuilder.failureTolerancePercentage(failureTolerancePercentage)
    }

    public fun maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage: Number) {
        cdkBuilder.maxAccountConcurrencyPercentage(maxAccountConcurrencyPercentage)
    }

    public fun parameters(parameters: StackSetParameters) {
        cdkBuilder.parameters(parameters)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun stackInstances(stackInstances: StackInstances) {
        cdkBuilder.stackInstances(stackInstances)
    }

    public fun stackSetName(stackSetName: String) {
        cdkBuilder.stackSetName(stackSetName)
    }

    public fun stackSetRegion(stackSetRegion: String) {
        cdkBuilder.stackSetRegion(stackSetRegion)
    }

    public fun template(template: StackSetTemplate) {
        cdkBuilder.template(template)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): CloudFormationDeployStackSetActionProps {
        if (_cfnCapabilities.isNotEmpty()) cdkBuilder.cfnCapabilities(_cfnCapabilities)
        return cdkBuilder.build()
    }
}
