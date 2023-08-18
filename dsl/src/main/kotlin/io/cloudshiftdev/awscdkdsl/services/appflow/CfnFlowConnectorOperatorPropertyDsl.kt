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

package io.cloudshiftdev.awscdkdsl.services.appflow

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The operation to be performed on the provided source fields.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * ConnectorOperatorProperty connectorOperatorProperty = ConnectorOperatorProperty.builder()
 * .amplitude("amplitude")
 * .customConnector("customConnector")
 * .datadog("datadog")
 * .dynatrace("dynatrace")
 * .googleAnalytics("googleAnalytics")
 * .inforNexus("inforNexus")
 * .marketo("marketo")
 * .pardot("pardot")
 * .s3("s3")
 * .salesforce("salesforce")
 * .sapoData("sapoData")
 * .serviceNow("serviceNow")
 * .singular("singular")
 * .slack("slack")
 * .trendmicro("trendmicro")
 * .veeva("veeva")
 * .zendesk("zendesk")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-connectoroperator.html)
 */
@CdkDslMarker
public class CfnFlowConnectorOperatorPropertyDsl {
    private val cdkBuilder: CfnFlow.ConnectorOperatorProperty.Builder =
        CfnFlow.ConnectorOperatorProperty.builder()

    /** @param amplitude The operation to be performed on the provided Amplitude source fields. */
    public fun amplitude(amplitude: String) {
        cdkBuilder.amplitude(amplitude)
    }

    /** @param customConnector Operators supported by the custom connector. */
    public fun customConnector(customConnector: String) {
        cdkBuilder.customConnector(customConnector)
    }

    /** @param datadog The operation to be performed on the provided Datadog source fields. */
    public fun datadog(datadog: String) {
        cdkBuilder.datadog(datadog)
    }

    /** @param dynatrace The operation to be performed on the provided Dynatrace source fields. */
    public fun dynatrace(dynatrace: String) {
        cdkBuilder.dynatrace(dynatrace)
    }

    /**
     * @param googleAnalytics The operation to be performed on the provided Google Analytics source
     *   fields.
     */
    public fun googleAnalytics(googleAnalytics: String) {
        cdkBuilder.googleAnalytics(googleAnalytics)
    }

    /**
     * @param inforNexus The operation to be performed on the provided Infor Nexus source fields.
     */
    public fun inforNexus(inforNexus: String) {
        cdkBuilder.inforNexus(inforNexus)
    }

    /** @param marketo The operation to be performed on the provided Marketo source fields. */
    public fun marketo(marketo: String) {
        cdkBuilder.marketo(marketo)
    }

    /** @param pardot the value to be set. */
    public fun pardot(pardot: String) {
        cdkBuilder.pardot(pardot)
    }

    /** @param s3 The operation to be performed on the provided Amazon S3 source fields. */
    public fun s3(s3: String) {
        cdkBuilder.s3(s3)
    }

    /** @param salesforce The operation to be performed on the provided Salesforce source fields. */
    public fun salesforce(salesforce: String) {
        cdkBuilder.salesforce(salesforce)
    }

    /** @param sapoData The operation to be performed on the provided SAPOData source fields. */
    public fun sapoData(sapoData: String) {
        cdkBuilder.sapoData(sapoData)
    }

    /** @param serviceNow The operation to be performed on the provided ServiceNow source fields. */
    public fun serviceNow(serviceNow: String) {
        cdkBuilder.serviceNow(serviceNow)
    }

    /** @param singular The operation to be performed on the provided Singular source fields. */
    public fun singular(singular: String) {
        cdkBuilder.singular(singular)
    }

    /** @param slack The operation to be performed on the provided Slack source fields. */
    public fun slack(slack: String) {
        cdkBuilder.slack(slack)
    }

    /**
     * @param trendmicro The operation to be performed on the provided Trend Micro source fields.
     */
    public fun trendmicro(trendmicro: String) {
        cdkBuilder.trendmicro(trendmicro)
    }

    /** @param veeva The operation to be performed on the provided Veeva source fields. */
    public fun veeva(veeva: String) {
        cdkBuilder.veeva(veeva)
    }

    /** @param zendesk The operation to be performed on the provided Zendesk source fields. */
    public fun zendesk(zendesk: String) {
        cdkBuilder.zendesk(zendesk)
    }

    public fun build(): CfnFlow.ConnectorOperatorProperty = cdkBuilder.build()
}
