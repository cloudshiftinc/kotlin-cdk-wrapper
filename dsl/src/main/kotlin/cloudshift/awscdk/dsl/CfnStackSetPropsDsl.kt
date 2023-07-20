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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.CfnStackSet
import software.amazon.awscdk.CfnStackSetProps
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStackSetPropsDsl {
    private val cdkBuilder: CfnStackSetProps.Builder = CfnStackSetProps.builder()

    private val _capabilities: MutableList<String> = mutableListOf()

    private val _parameters: MutableList<Any> = mutableListOf()

    private val _stackInstancesGroup: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun administrationRoleArn(administrationRoleArn: String) {
        cdkBuilder.administrationRoleArn(administrationRoleArn)
    }

    public fun autoDeployment(autoDeployment: CfnStackSet.AutoDeploymentProperty) {
        cdkBuilder.autoDeployment(autoDeployment)
    }

    public fun autoDeployment(autoDeployment: IResolvable) {
        cdkBuilder.autoDeployment(autoDeployment)
    }

    public fun callAs(callAs: String) {
        cdkBuilder.callAs(callAs)
    }

    public fun capabilities(vararg capabilities: String) {
        _capabilities.addAll(listOf(*capabilities))
    }

    public fun capabilities(capabilities: Collection<String>) {
        _capabilities.addAll(capabilities)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun executionRoleName(executionRoleName: String) {
        cdkBuilder.executionRoleName(executionRoleName)
    }

    public fun managedExecution(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.managedExecution(builder.map)
    }

    public fun managedExecution(managedExecution: Any) {
        cdkBuilder.managedExecution(managedExecution)
    }

    public fun operationPreferences(operationPreferences: CfnStackSet.OperationPreferencesProperty) {
        cdkBuilder.operationPreferences(operationPreferences)
    }

    public fun operationPreferences(operationPreferences: IResolvable) {
        cdkBuilder.operationPreferences(operationPreferences)
    }

    public fun parameters(vararg parameters: Any) {
        _parameters.addAll(listOf(*parameters))
    }

    public fun parameters(parameters: Collection<Any>) {
        _parameters.addAll(parameters)
    }

    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    public fun permissionModel(permissionModel: String) {
        cdkBuilder.permissionModel(permissionModel)
    }

    public fun stackInstancesGroup(vararg stackInstancesGroup: Any) {
        _stackInstancesGroup.addAll(listOf(*stackInstancesGroup))
    }

    public fun stackInstancesGroup(stackInstancesGroup: Collection<Any>) {
        _stackInstancesGroup.addAll(stackInstancesGroup)
    }

    public fun stackInstancesGroup(stackInstancesGroup: IResolvable) {
        cdkBuilder.stackInstancesGroup(stackInstancesGroup)
    }

    public fun stackSetName(stackSetName: String) {
        cdkBuilder.stackSetName(stackSetName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun templateBody(templateBody: String) {
        cdkBuilder.templateBody(templateBody)
    }

    public fun templateUrl(templateUrl: String) {
        cdkBuilder.templateUrl(templateUrl)
    }

    public fun build(): CfnStackSetProps {
        if (_capabilities.isNotEmpty()) cdkBuilder.capabilities(_capabilities)
        if (_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
        if (_stackInstancesGroup.isNotEmpty()) cdkBuilder.stackInstancesGroup(_stackInstancesGroup)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
