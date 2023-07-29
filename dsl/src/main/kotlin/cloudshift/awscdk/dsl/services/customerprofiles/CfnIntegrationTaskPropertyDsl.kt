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

package cloudshift.awscdk.dsl.services.customerprofiles

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnIntegration

/**
 * The `Task` property type specifies the class for modeling different type of tasks.
 *
 * Task implementation varies based on the TaskType.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * TaskProperty taskProperty = TaskProperty.builder()
 * .sourceFields(List.of("sourceFields"))
 * .taskType("taskType")
 * // the properties below are optional
 * .connectorOperator(ConnectorOperatorProperty.builder()
 * .marketo("marketo")
 * .s3("s3")
 * .salesforce("salesforce")
 * .serviceNow("serviceNow")
 * .zendesk("zendesk")
 * .build())
 * .destinationField("destinationField")
 * .taskProperties(List.of(TaskPropertiesMapProperty.builder()
 * .operatorPropertyKey("operatorPropertyKey")
 * .property("property")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-integration-task.html)
 */
@CdkDslMarker
public class CfnIntegrationTaskPropertyDsl {
    private val cdkBuilder: CfnIntegration.TaskProperty.Builder =
        CfnIntegration.TaskProperty.builder()

    private val _sourceFields: MutableList<String> = mutableListOf()

    private val _taskProperties: MutableList<Any> = mutableListOf()

    /** @param connectorOperator The operation to be performed on the provided source fields. */
    public fun connectorOperator(connectorOperator: IResolvable) {
        cdkBuilder.connectorOperator(connectorOperator)
    }

    /** @param connectorOperator The operation to be performed on the provided source fields. */
    public fun connectorOperator(connectorOperator: CfnIntegration.ConnectorOperatorProperty) {
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
     * @param taskProperties A map used to store task-related information. The service looks for
     *   particular information based on the TaskType.
     */
    public fun taskProperties(vararg taskProperties: Any) {
        _taskProperties.addAll(listOf(*taskProperties))
    }

    /**
     * @param taskProperties A map used to store task-related information. The service looks for
     *   particular information based on the TaskType.
     */
    public fun taskProperties(taskProperties: Collection<Any>) {
        _taskProperties.addAll(taskProperties)
    }

    /**
     * @param taskProperties A map used to store task-related information. The service looks for
     *   particular information based on the TaskType.
     */
    public fun taskProperties(taskProperties: IResolvable) {
        cdkBuilder.taskProperties(taskProperties)
    }

    /**
     * @param taskType Specifies the particular task implementation that Amazon AppFlow performs.
     */
    public fun taskType(taskType: String) {
        cdkBuilder.taskType(taskType)
    }

    public fun build(): CfnIntegration.TaskProperty {
        if (_sourceFields.isNotEmpty()) cdkBuilder.sourceFields(_sourceFields)
        if (_taskProperties.isNotEmpty()) cdkBuilder.taskProperties(_taskProperties)
        return cdkBuilder.build()
    }
}
