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

package io.cloudshiftdev.awscdkdsl.services.datazone

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datazone.CfnDataSource

/**
 * The details of the Amazon Redshift Serverless workgroup storage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * RedshiftServerlessStorageProperty redshiftServerlessStorageProperty =
 * RedshiftServerlessStorageProperty.builder()
 * .workgroupName("workgroupName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftserverlessstorage.html)
 */
@CdkDslMarker
public class CfnDataSourceRedshiftServerlessStoragePropertyDsl {
    private val cdkBuilder: CfnDataSource.RedshiftServerlessStorageProperty.Builder =
        CfnDataSource.RedshiftServerlessStorageProperty.builder()

    /** @param workgroupName The name of the Amazon Redshift Serverless workgroup. */
    public fun workgroupName(workgroupName: String) {
        cdkBuilder.workgroupName(workgroupName)
    }

    public fun build(): CfnDataSource.RedshiftServerlessStorageProperty = cdkBuilder.build()
}
