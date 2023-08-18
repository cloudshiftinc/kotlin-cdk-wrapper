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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when Zendesk is used as a destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * ZendeskDestinationPropertiesProperty zendeskDestinationPropertiesProperty =
 * ZendeskDestinationPropertiesProperty.builder()
 * .object("object")
 * // the properties below are optional
 * .errorHandlingConfig(ErrorHandlingConfigProperty.builder()
 * .bucketName("bucketName")
 * .bucketPrefix("bucketPrefix")
 * .failOnFirstError(false)
 * .build())
 * .idFieldNames(List.of("idFieldNames"))
 * .writeOperationType("writeOperationType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-zendeskdestinationproperties.html)
 */
@CdkDslMarker
public class CfnFlowZendeskDestinationPropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.ZendeskDestinationPropertiesProperty.Builder =
        CfnFlow.ZendeskDestinationPropertiesProperty.builder()

    private val _idFieldNames: MutableList<String> = mutableListOf()

    /**
     * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
     *   when placing data in the destination. For example, this setting would determine if the flow
     *   should fail after one insertion error, or continue and attempt to insert every record
     *   regardless of the initial failure. `ErrorHandlingConfig` is a part of the destination
     *   connector details.
     */
    public fun errorHandlingConfig(errorHandlingConfig: IResolvable) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig)
    }

    /**
     * @param errorHandlingConfig The settings that determine how Amazon AppFlow handles an error
     *   when placing data in the destination. For example, this setting would determine if the flow
     *   should fail after one insertion error, or continue and attempt to insert every record
     *   regardless of the initial failure. `ErrorHandlingConfig` is a part of the destination
     *   connector details.
     */
    public fun errorHandlingConfig(errorHandlingConfig: CfnFlow.ErrorHandlingConfigProperty) {
        cdkBuilder.errorHandlingConfig(errorHandlingConfig)
    }

    /**
     * @param idFieldNames A list of field names that can be used as an ID field when performing a
     *   write operation.
     */
    public fun idFieldNames(vararg idFieldNames: String) {
        _idFieldNames.addAll(listOf(*idFieldNames))
    }

    /**
     * @param idFieldNames A list of field names that can be used as an ID field when performing a
     *   write operation.
     */
    public fun idFieldNames(idFieldNames: Collection<String>) {
        _idFieldNames.addAll(idFieldNames)
    }

    /** @param object The object specified in the Zendesk flow destination. */
    public fun `object`(`object`: String) {
        cdkBuilder.`object`(`object`)
    }

    /**
     * @param writeOperationType The possible write operations in the destination connector. When
     *   this value is not provided, this defaults to the `INSERT` operation.
     */
    public fun writeOperationType(writeOperationType: String) {
        cdkBuilder.writeOperationType(writeOperationType)
    }

    public fun build(): CfnFlow.ZendeskDestinationPropertiesProperty {
        if (_idFieldNames.isNotEmpty()) cdkBuilder.idFieldNames(_idFieldNames)
        return cdkBuilder.build()
    }
}
