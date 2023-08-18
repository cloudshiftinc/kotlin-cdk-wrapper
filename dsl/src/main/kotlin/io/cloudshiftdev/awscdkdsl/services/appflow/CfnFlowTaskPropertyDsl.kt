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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * A class for modeling different type of tasks.
 *
 * Task implementation varies based on the `TaskType` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * TaskProperty taskProperty = TaskProperty.builder()
 * .sourceFields(List.of("sourceFields"))
 * .taskType("taskType")
 * // the properties below are optional
 * .connectorOperator(ConnectorOperatorProperty.builder()
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
 * .build())
 * .destinationField("destinationField")
 * .taskProperties(List.of(TaskPropertiesObjectProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-task.html)
 */
@CdkDslMarker
public class CfnFlowTaskPropertyDsl {
    private val cdkBuilder: CfnFlow.TaskProperty.Builder = CfnFlow.TaskProperty.builder()

    private val _sourceFields: MutableList<String> = mutableListOf()

    private val _taskProperties: MutableList<Any> = mutableListOf()

    /** @param connectorOperator The operation to be performed on the provided source fields. */
    public fun connectorOperator(connectorOperator: IResolvable) {
        cdkBuilder.connectorOperator(connectorOperator)
    }

    /** @param connectorOperator The operation to be performed on the provided source fields. */
    public fun connectorOperator(connectorOperator: CfnFlow.ConnectorOperatorProperty) {
        cdkBuilder.connectorOperator(connectorOperator)
    }

    /**
     * @param destinationField A field in a destination connector, or a field value against which
     *   Amazon AppFlow validates a source field.
     */
    public fun destinationField(destinationField: String) {
        cdkBuilder.destinationField(destinationField)
    }

    /** @param sourceFields The source fields to which a particular task is applied. */
    public fun sourceFields(vararg sourceFields: String) {
        _sourceFields.addAll(listOf(*sourceFields))
    }

    /** @param sourceFields The source fields to which a particular task is applied. */
    public fun sourceFields(sourceFields: Collection<String>) {
        _sourceFields.addAll(sourceFields)
    }

    /**
     * @param taskProperties A map used to store task-related information. The execution service
     *   looks for particular information based on the `TaskType` .
     */
    public fun taskProperties(vararg taskProperties: Any) {
        _taskProperties.addAll(listOf(*taskProperties))
    }

    /**
     * @param taskProperties A map used to store task-related information. The execution service
     *   looks for particular information based on the `TaskType` .
     */
    public fun taskProperties(taskProperties: Collection<Any>) {
        _taskProperties.addAll(taskProperties)
    }

    /**
     * @param taskProperties A map used to store task-related information. The execution service
     *   looks for particular information based on the `TaskType` .
     */
    public fun taskProperties(taskProperties: IResolvable) {
        cdkBuilder.taskProperties(taskProperties)
    }

    /**
     * @param taskType Specifies the particular task implementation that Amazon AppFlow performs.
     *   *Allowed values* : `Arithmetic` | `Filter` | `Map` | `Map_all` | `Mask` | `Merge` |
     *   `Truncate` | `Validate`
     */
    public fun taskType(taskType: String) {
        cdkBuilder.taskType(taskType)
    }

    public fun build(): CfnFlow.TaskProperty {
        if (_sourceFields.isNotEmpty()) cdkBuilder.sourceFields(_sourceFields)
        if (_taskProperties.isNotEmpty()) cdkBuilder.taskProperties(_taskProperties)
        return cdkBuilder.build()
    }
}
