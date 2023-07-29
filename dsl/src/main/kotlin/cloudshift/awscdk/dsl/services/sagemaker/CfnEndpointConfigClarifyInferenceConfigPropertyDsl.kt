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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ClarifyInferenceConfigProperty clarifyInferenceConfigProperty =
 * ClarifyInferenceConfigProperty.builder()
 * .contentTemplate("contentTemplate")
 * .featureHeaders(List.of("featureHeaders"))
 * .featuresAttribute("featuresAttribute")
 * .featureTypes(List.of("featureTypes"))
 * .labelAttribute("labelAttribute")
 * .labelHeaders(List.of("labelHeaders"))
 * .labelIndex(123)
 * .maxPayloadInMb(123)
 * .maxRecordCount(123)
 * .probabilityAttribute("probabilityAttribute")
 * .probabilityIndex(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifyinferenceconfig.html)
 */
@CdkDslMarker
public class CfnEndpointConfigClarifyInferenceConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.ClarifyInferenceConfigProperty.Builder =
        CfnEndpointConfig.ClarifyInferenceConfigProperty.builder()

    private val _featureHeaders: MutableList<String> = mutableListOf()

    private val _featureTypes: MutableList<String> = mutableListOf()

    private val _labelHeaders: MutableList<String> = mutableListOf()

    /** @param contentTemplate the value to be set. */
    public fun contentTemplate(contentTemplate: String) {
        cdkBuilder.contentTemplate(contentTemplate)
    }

    /** @param featureHeaders the value to be set. */
    public fun featureHeaders(vararg featureHeaders: String) {
        _featureHeaders.addAll(listOf(*featureHeaders))
    }

    /** @param featureHeaders the value to be set. */
    public fun featureHeaders(featureHeaders: Collection<String>) {
        _featureHeaders.addAll(featureHeaders)
    }

    /** @param featureTypes the value to be set. */
    public fun featureTypes(vararg featureTypes: String) {
        _featureTypes.addAll(listOf(*featureTypes))
    }

    /** @param featureTypes the value to be set. */
    public fun featureTypes(featureTypes: Collection<String>) {
        _featureTypes.addAll(featureTypes)
    }

    /** @param featuresAttribute the value to be set. */
    public fun featuresAttribute(featuresAttribute: String) {
        cdkBuilder.featuresAttribute(featuresAttribute)
    }

    /** @param labelAttribute the value to be set. */
    public fun labelAttribute(labelAttribute: String) {
        cdkBuilder.labelAttribute(labelAttribute)
    }

    /** @param labelHeaders the value to be set. */
    public fun labelHeaders(vararg labelHeaders: String) {
        _labelHeaders.addAll(listOf(*labelHeaders))
    }

    /** @param labelHeaders the value to be set. */
    public fun labelHeaders(labelHeaders: Collection<String>) {
        _labelHeaders.addAll(labelHeaders)
    }

    /** @param labelIndex the value to be set. */
    public fun labelIndex(labelIndex: Number) {
        cdkBuilder.labelIndex(labelIndex)
    }

    /** @param maxPayloadInMb the value to be set. */
    public fun maxPayloadInMb(maxPayloadInMb: Number) {
        cdkBuilder.maxPayloadInMb(maxPayloadInMb)
    }

    /** @param maxRecordCount the value to be set. */
    public fun maxRecordCount(maxRecordCount: Number) {
        cdkBuilder.maxRecordCount(maxRecordCount)
    }

    /** @param probabilityAttribute the value to be set. */
    public fun probabilityAttribute(probabilityAttribute: String) {
        cdkBuilder.probabilityAttribute(probabilityAttribute)
    }

    /** @param probabilityIndex the value to be set. */
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
