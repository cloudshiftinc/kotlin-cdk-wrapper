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

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponentProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStudioComponentPropsDsl {
    private val cdkBuilder: CfnStudioComponentProps.Builder = CfnStudioComponentProps.builder()

    private val _ec2SecurityGroupIds: MutableList<String> = mutableListOf()

    private val _initializationScripts: MutableList<Any> = mutableListOf()

    private val _scriptParameters: MutableList<Any> = mutableListOf()

    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    public fun configuration(configuration: CfnStudioComponent.StudioComponentConfigurationProperty) {
        cdkBuilder.configuration(configuration)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun ec2SecurityGroupIds(vararg ec2SecurityGroupIds: String) {
        _ec2SecurityGroupIds.addAll(listOf(*ec2SecurityGroupIds))
    }

    public fun ec2SecurityGroupIds(ec2SecurityGroupIds: Collection<String>) {
        _ec2SecurityGroupIds.addAll(ec2SecurityGroupIds)
    }

    public fun initializationScripts(vararg initializationScripts: Any) {
        _initializationScripts.addAll(listOf(*initializationScripts))
    }

    public fun initializationScripts(initializationScripts: Collection<Any>) {
        _initializationScripts.addAll(initializationScripts)
    }

    public fun initializationScripts(initializationScripts: IResolvable) {
        cdkBuilder.initializationScripts(initializationScripts)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun runtimeRoleArn(runtimeRoleArn: String) {
        cdkBuilder.runtimeRoleArn(runtimeRoleArn)
    }

    public fun scriptParameters(vararg scriptParameters: Any) {
        _scriptParameters.addAll(listOf(*scriptParameters))
    }

    public fun scriptParameters(scriptParameters: Collection<Any>) {
        _scriptParameters.addAll(scriptParameters)
    }

    public fun scriptParameters(scriptParameters: IResolvable) {
        cdkBuilder.scriptParameters(scriptParameters)
    }

    public fun secureInitializationRoleArn(secureInitializationRoleArn: String) {
        cdkBuilder.secureInitializationRoleArn(secureInitializationRoleArn)
    }

    public fun studioId(studioId: String) {
        cdkBuilder.studioId(studioId)
    }

    public fun subtype(subtype: String) {
        cdkBuilder.subtype(subtype)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnStudioComponentProps {
        if (_ec2SecurityGroupIds.isNotEmpty()) cdkBuilder.ec2SecurityGroupIds(_ec2SecurityGroupIds)
        if (_initializationScripts.isNotEmpty()) cdkBuilder.initializationScripts(_initializationScripts)
        if (_scriptParameters.isNotEmpty()) cdkBuilder.scriptParameters(_scriptParameters)
        return cdkBuilder.build()
    }
}
