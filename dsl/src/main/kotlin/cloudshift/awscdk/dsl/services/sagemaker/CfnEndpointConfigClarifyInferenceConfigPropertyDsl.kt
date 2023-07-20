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
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEndpointConfigClarifyInferenceConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.ClarifyInferenceConfigProperty.Builder =
        CfnEndpointConfig.ClarifyInferenceConfigProperty.builder()

    private val _featureHeaders: MutableList<String> = mutableListOf()

    private val _featureTypes: MutableList<String> = mutableListOf()

    private val _labelHeaders: MutableList<String> = mutableListOf()

    public fun contentTemplate(contentTemplate: String) {
        cdkBuilder.contentTemplate(contentTemplate)
    }

    public fun featureHeaders(vararg featureHeaders: String) {
        _featureHeaders.addAll(listOf(*featureHeaders))
    }

    public fun featureHeaders(featureHeaders: Collection<String>) {
        _featureHeaders.addAll(featureHeaders)
    }

    public fun featureTypes(vararg featureTypes: String) {
        _featureTypes.addAll(listOf(*featureTypes))
    }

    public fun featureTypes(featureTypes: Collection<String>) {
        _featureTypes.addAll(featureTypes)
    }

    public fun featuresAttribute(featuresAttribute: String) {
        cdkBuilder.featuresAttribute(featuresAttribute)
    }

    public fun labelAttribute(labelAttribute: String) {
        cdkBuilder.labelAttribute(labelAttribute)
    }

    public fun labelHeaders(vararg labelHeaders: String) {
        _labelHeaders.addAll(listOf(*labelHeaders))
    }

    public fun labelHeaders(labelHeaders: Collection<String>) {
        _labelHeaders.addAll(labelHeaders)
    }

    public fun labelIndex(labelIndex: Number) {
        cdkBuilder.labelIndex(labelIndex)
    }

    public fun maxPayloadInMb(maxPayloadInMb: Number) {
        cdkBuilder.maxPayloadInMb(maxPayloadInMb)
    }

    public fun maxRecordCount(maxRecordCount: Number) {
        cdkBuilder.maxRecordCount(maxRecordCount)
    }

    public fun probabilityAttribute(probabilityAttribute: String) {
        cdkBuilder.probabilityAttribute(probabilityAttribute)
    }

    public fun probabilityIndex(probabilityIndex: Number) {
        cdkBuilder.probabilityIndex(probabilityIndex)
    }

    public fun build(): CfnEndpointConfig.ClarifyInferenceConfigProperty {
        if (_featureHeaders.isNotEmpty()) cdkBuilder.featureHeaders(_featureHeaders)
        if (_featureTypes.isNotEmpty()) cdkBuilder.featureTypes(_featureTypes)
        if (_labelHeaders.isNotEmpty()) cdkBuilder.labelHeaders(_labelHeaders)
        return cdkBuilder.build()
    }
}
