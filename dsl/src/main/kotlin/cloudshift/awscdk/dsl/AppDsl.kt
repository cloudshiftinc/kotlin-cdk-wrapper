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
import software.amazon.awscdk.App
import software.amazon.awscdk.IPolicyValidationPluginBeta1
import software.amazon.awscdk.IReusableStackSynthesizer
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class AppDsl {
    private val cdkBuilder: App.Builder = App.Builder.create()

    private val _policyValidationBeta1: MutableList<IPolicyValidationPluginBeta1> = mutableListOf()

    public fun analyticsReporting(analyticsReporting: Boolean) {
        cdkBuilder.analyticsReporting(analyticsReporting)
    }

    public fun autoSynth(autoSynth: Boolean) {
        cdkBuilder.autoSynth(autoSynth)
    }

    public fun context(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.context(builder.map)
    }

    public fun context(context: Map<String, Any>) {
        cdkBuilder.context(context)
    }

    public fun defaultStackSynthesizer(defaultStackSynthesizer: IReusableStackSynthesizer) {
        cdkBuilder.defaultStackSynthesizer(defaultStackSynthesizer)
    }

    public fun outdir(outdir: String) {
        cdkBuilder.outdir(outdir)
    }

    public fun policyValidationBeta1(vararg policyValidationBeta1: IPolicyValidationPluginBeta1) {
        _policyValidationBeta1.addAll(listOf(*policyValidationBeta1))
    }

    public fun policyValidationBeta1(policyValidationBeta1: Collection<IPolicyValidationPluginBeta1>) {
        _policyValidationBeta1.addAll(policyValidationBeta1)
    }

    public fun postCliContext(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.postCliContext(builder.map)
    }

    public fun postCliContext(postCliContext: Map<String, Any>) {
        cdkBuilder.postCliContext(postCliContext)
    }

    public fun stackTraces(stackTraces: Boolean) {
        cdkBuilder.stackTraces(stackTraces)
    }

    public fun treeMetadata(treeMetadata: Boolean) {
        cdkBuilder.treeMetadata(treeMetadata)
    }

    public fun build(): App {
        if (_policyValidationBeta1.isNotEmpty()) cdkBuilder.policyValidationBeta1(_policyValidationBeta1)
        return cdkBuilder.build()
    }
}
