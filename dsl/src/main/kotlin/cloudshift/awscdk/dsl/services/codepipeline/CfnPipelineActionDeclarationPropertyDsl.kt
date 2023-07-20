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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnPipeline
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPipelineActionDeclarationPropertyDsl {
    private val cdkBuilder: CfnPipeline.ActionDeclarationProperty.Builder =
        CfnPipeline.ActionDeclarationProperty.builder()

    private val _inputArtifacts: MutableList<Any> = mutableListOf()

    private val _outputArtifacts: MutableList<Any> = mutableListOf()

    public fun actionTypeId(actionTypeId: IResolvable) {
        cdkBuilder.actionTypeId(actionTypeId)
    }

    public fun actionTypeId(actionTypeId: CfnPipeline.ActionTypeIdProperty) {
        cdkBuilder.actionTypeId(actionTypeId)
    }

    public fun configuration(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.configuration(builder.map)
    }

    public fun configuration(configuration: Any) {
        cdkBuilder.configuration(configuration)
    }

    public fun inputArtifacts(vararg inputArtifacts: Any) {
        _inputArtifacts.addAll(listOf(*inputArtifacts))
    }

    public fun inputArtifacts(inputArtifacts: Collection<Any>) {
        _inputArtifacts.addAll(inputArtifacts)
    }

    public fun inputArtifacts(inputArtifacts: IResolvable) {
        cdkBuilder.inputArtifacts(inputArtifacts)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun outputArtifacts(vararg outputArtifacts: Any) {
        _outputArtifacts.addAll(listOf(*outputArtifacts))
    }

    public fun outputArtifacts(outputArtifacts: Collection<Any>) {
        _outputArtifacts.addAll(outputArtifacts)
    }

    public fun outputArtifacts(outputArtifacts: IResolvable) {
        cdkBuilder.outputArtifacts(outputArtifacts)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun build(): CfnPipeline.ActionDeclarationProperty {
        if (_inputArtifacts.isNotEmpty()) cdkBuilder.inputArtifacts(_inputArtifacts)
        if (_outputArtifacts.isNotEmpty()) cdkBuilder.outputArtifacts(_outputArtifacts)
        return cdkBuilder.build()
    }
}
