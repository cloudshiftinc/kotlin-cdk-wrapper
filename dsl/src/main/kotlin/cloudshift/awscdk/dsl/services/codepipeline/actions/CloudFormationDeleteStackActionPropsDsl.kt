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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.CfnCapabilities
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.ArtifactPath
import software.amazon.awscdk.services.codepipeline.actions.CloudFormationDeleteStackActionProps
import software.amazon.awscdk.services.iam.IRole
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CloudFormationDeleteStackActionPropsDsl {
    private val cdkBuilder: CloudFormationDeleteStackActionProps.Builder =
        CloudFormationDeleteStackActionProps.builder()

    private val _cfnCapabilities: MutableList<CfnCapabilities> = mutableListOf()

    private val _extraInputs: MutableList<Artifact> = mutableListOf()

    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun adminPermissions(adminPermissions: Boolean) {
        cdkBuilder.adminPermissions(adminPermissions)
    }

    public fun cfnCapabilities(vararg cfnCapabilities: CfnCapabilities) {
        _cfnCapabilities.addAll(listOf(*cfnCapabilities))
    }

    public fun cfnCapabilities(cfnCapabilities: Collection<CfnCapabilities>) {
        _cfnCapabilities.addAll(cfnCapabilities)
    }

    public fun deploymentRole(deploymentRole: IRole) {
        cdkBuilder.deploymentRole(deploymentRole)
    }

    public fun extraInputs(vararg extraInputs: Artifact) {
        _extraInputs.addAll(listOf(*extraInputs))
    }

    public fun extraInputs(extraInputs: Collection<Artifact>) {
        _extraInputs.addAll(extraInputs)
    }

    public fun output(output: Artifact) {
        cdkBuilder.output(output)
    }

    public fun outputFileName(outputFileName: String) {
        cdkBuilder.outputFileName(outputFileName)
    }

    public fun parameterOverrides(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parameterOverrides(builder.map)
    }

    public fun parameterOverrides(parameterOverrides: Map<String, Any>) {
        cdkBuilder.parameterOverrides(parameterOverrides)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    public fun templateConfiguration(templateConfiguration: ArtifactPath) {
        cdkBuilder.templateConfiguration(templateConfiguration)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): CloudFormationDeleteStackActionProps {
        if (_cfnCapabilities.isNotEmpty()) cdkBuilder.cfnCapabilities(_cfnCapabilities)
        if (_extraInputs.isNotEmpty()) cdkBuilder.extraInputs(_extraInputs)
        return cdkBuilder.build()
    }
}
