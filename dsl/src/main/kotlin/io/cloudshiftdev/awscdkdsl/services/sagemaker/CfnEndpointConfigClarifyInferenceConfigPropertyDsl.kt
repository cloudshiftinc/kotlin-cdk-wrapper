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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * The inference configuration parameter for the model container.
 *
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

    /**
     * @param contentTemplate A template string used to format a JSON record into an acceptable
     *   model container input. For example, a `ContentTemplate` string `'{"myfeatures":$features}'`
     *   will format a list of features `[1,2,3]` into the record string `'{"myfeatures":[1,2,3]}'`
     *   . Required only when the model container input is in JSON Lines format.
     */
    public fun contentTemplate(contentTemplate: String) {
        cdkBuilder.contentTemplate(contentTemplate)
    }

    /**
     * @param featureHeaders The names of the features. If provided, these are included in the
     *   endpoint response payload to help readability of the `InvokeEndpoint` output. See the
     *   [Response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
     *   section under *Invoke the endpoint* in the Developer Guide for more information.
     */
    public fun featureHeaders(vararg featureHeaders: String) {
        _featureHeaders.addAll(listOf(*featureHeaders))
    }

    /**
     * @param featureHeaders The names of the features. If provided, these are included in the
     *   endpoint response payload to help readability of the `InvokeEndpoint` output. See the
     *   [Response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
     *   section under *Invoke the endpoint* in the Developer Guide for more information.
     */
    public fun featureHeaders(featureHeaders: Collection<String>) {
        _featureHeaders.addAll(featureHeaders)
    }

    /**
     * @param featureTypes A list of data types of the features (optional). Applicable only to NLP
     *   explainability. If provided, `FeatureTypes` must have at least one `'text'` string (for
     *   example, `['text']` ). If `FeatureTypes` is not provided, the explainer infers the feature
     *   types based on the baseline data. The feature types are included in the endpoint response
     *   payload. For additional information see the
     *   [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
     *   section under *Invoke the endpoint* in the Developer Guide for more information.
     */
    public fun featureTypes(vararg featureTypes: String) {
        _featureTypes.addAll(listOf(*featureTypes))
    }

    /**
     * @param featureTypes A list of data types of the features (optional). Applicable only to NLP
     *   explainability. If provided, `FeatureTypes` must have at least one `'text'` string (for
     *   example, `['text']` ). If `FeatureTypes` is not provided, the explainer infers the feature
     *   types based on the baseline data. The feature types are included in the endpoint response
     *   payload. For additional information see the
     *   [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
     *   section under *Invoke the endpoint* in the Developer Guide for more information.
     */
    public fun featureTypes(featureTypes: Collection<String>) {
        _featureTypes.addAll(featureTypes)
    }

    /**
     * @param featuresAttribute Provides the JMESPath expression to extract the features from a
     *   model container input in JSON Lines format. For example, if `FeaturesAttribute` is the
     *   JMESPath expression `'myfeatures'` , it extracts a list of features `[1,2,3]` from request
     *   data `'{"myfeatures":[1,2,3]}'` .
     */
    public fun featuresAttribute(featuresAttribute: String) {
        cdkBuilder.featuresAttribute(featuresAttribute)
    }

    /**
     * @param labelAttribute A JMESPath expression used to locate the list of label headers in the
     *   model container output. *Example* : If the model container output of a batch request is
     *   `'{"labels":["cat","dog","fish"],"probability":[0.6,0.3,0.1]}'` , then set `LabelAttribute`
     *   to `'labels'` to extract the list of label headers `["cat","dog","fish"]`
     */
    public fun labelAttribute(labelAttribute: String) {
        cdkBuilder.labelAttribute(labelAttribute)
    }

    /**
     * @param labelHeaders For multiclass classification problems, the label headers are the names
     *   of the classes. Otherwise, the label header is the name of the predicted label. These are
     *   used to help readability for the output of the `InvokeEndpoint` API. See the
     *   [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
     *   section under *Invoke the endpoint* in the Developer Guide for more information. If there
     *   are no label headers in the model container output, provide them manually using this
     *   parameter.
     */
    public fun labelHeaders(vararg labelHeaders: String) {
        _labelHeaders.addAll(listOf(*labelHeaders))
    }

    /**
     * @param labelHeaders For multiclass classification problems, the label headers are the names
     *   of the classes. Otherwise, the label header is the name of the predicted label. These are
     *   used to help readability for the output of the `InvokeEndpoint` API. See the
     *   [response](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-invoke-endpoint.html#clarify-online-explainability-response)
     *   section under *Invoke the endpoint* in the Developer Guide for more information. If there
     *   are no label headers in the model container output, provide them manually using this
     *   parameter.
     */
    public fun labelHeaders(labelHeaders: Collection<String>) {
        _labelHeaders.addAll(labelHeaders)
    }

    /**
     * @param labelIndex A zero-based index used to extract a label header or list of label headers
     *   from model container output in CSV format. *Example for a multiclass model:* If the model
     *   container output consists of label headers followed by probabilities:
     *   `'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'` , set `LabelIndex` to `0` to select the
     *   label headers `['cat','dog','fish']` .
     */
    public fun labelIndex(labelIndex: Number) {
        cdkBuilder.labelIndex(labelIndex)
    }

    /**
     * @param maxPayloadInMb The maximum payload size (MB) allowed of a request from the explainer
     *   to the model container. Defaults to `6` MB.
     */
    public fun maxPayloadInMb(maxPayloadInMb: Number) {
        cdkBuilder.maxPayloadInMb(maxPayloadInMb)
    }

    /**
     * @param maxRecordCount The maximum number of records in a request that the model container can
     *   process when querying the model container for the predictions of a
     *   [synthetic dataset](https://docs.aws.amazon.com/sagemaker/latest/dg/clarify-online-explainability-create-endpoint.html#clarify-online-explainability-create-endpoint-synthetic)
     *   . A record is a unit of input data that inference can be made on, for example, a single
     *   line in CSV data. If `MaxRecordCount` is `1` , the model container expects one record per
     *   request. A value of 2 or greater means that the model expects batch requests, which can
     *   reduce overhead and speed up the inferencing process. If this parameter is not provided,
     *   the explainer will tune the record count per request according to the model container's
     *   capacity at runtime.
     */
    public fun maxRecordCount(maxRecordCount: Number) {
        cdkBuilder.maxRecordCount(maxRecordCount)
    }

    /**
     * @param probabilityAttribute A JMESPath expression used to extract the probability (or score)
     *   from the model container output if the model container is in JSON Lines format. *Example* :
     *   If the model container output of a single request is
     *   `'{"predicted_label":1,"probability":0.6}'` , then set `ProbabilityAttribute` to
     *   `'probability'` .
     */
    public fun probabilityAttribute(probabilityAttribute: String) {
        cdkBuilder.probabilityAttribute(probabilityAttribute)
    }

    /**
     * @param probabilityIndex A zero-based index used to extract a probability value (score) or
     *   list from model container output in CSV format. If this value is not provided, the entire
     *   model container output will be treated as a probability value (score) or list.
     *
     * *Example for a single class model:* If the model container output consists of a
     * string-formatted prediction label followed by its probability: `'1,0.6'` , set
     * `ProbabilityIndex` to `1` to select the probability value `0.6` .
     *
     * *Example for a multiclass model:* If the model container output consists of a
     * string-formatted prediction label followed by its probability:
     * `'"[\'cat\',\'dog\',\'fish\']","[0.1,0.6,0.3]"'` , set `ProbabilityIndex` to `1` to select
     * the probability values `[0.1,0.6,0.3]` .
     */
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
