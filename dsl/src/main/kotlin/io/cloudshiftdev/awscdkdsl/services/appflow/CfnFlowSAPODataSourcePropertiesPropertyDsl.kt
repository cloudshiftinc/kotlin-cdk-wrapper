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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * The properties that are applied when using SAPOData as a flow source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * SAPODataSourcePropertiesProperty sAPODataSourcePropertiesProperty =
 * SAPODataSourcePropertiesProperty.builder()
 * .objectPath("objectPath")
 * // the properties below are optional
 * .paginationConfig(SAPODataPaginationConfigProperty.builder()
 * .maxPageSize(123)
 * .build())
 * .parallelismConfig(SAPODataParallelismConfigProperty.builder()
 * .maxParallelism(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-sapodatasourceproperties.html)
 */
@CdkDslMarker
public class CfnFlowSAPODataSourcePropertiesPropertyDsl {
    private val cdkBuilder: CfnFlow.SAPODataSourcePropertiesProperty.Builder =
        CfnFlow.SAPODataSourcePropertiesProperty.builder()

    /** @param objectPath The object path specified in the SAPOData flow source. */
    public fun objectPath(objectPath: String) {
        cdkBuilder.objectPath(objectPath)
    }

    /** @param paginationConfig SAP Source connector page size. */
    public fun paginationConfig(paginationConfig: IResolvable) {
        cdkBuilder.paginationConfig(paginationConfig)
    }

    /** @param paginationConfig SAP Source connector page size. */
    public fun paginationConfig(paginationConfig: CfnFlow.SAPODataPaginationConfigProperty) {
        cdkBuilder.paginationConfig(paginationConfig)
    }

    /** @param parallelismConfig SAP Source connector parallelism factor. */
    public fun parallelismConfig(parallelismConfig: IResolvable) {
        cdkBuilder.parallelismConfig(parallelismConfig)
    }

    /** @param parallelismConfig SAP Source connector parallelism factor. */
    public fun parallelismConfig(parallelismConfig: CfnFlow.SAPODataParallelismConfigProperty) {
        cdkBuilder.parallelismConfig(parallelismConfig)
    }

    public fun build(): CfnFlow.SAPODataSourcePropertiesProperty = cdkBuilder.build()
}
