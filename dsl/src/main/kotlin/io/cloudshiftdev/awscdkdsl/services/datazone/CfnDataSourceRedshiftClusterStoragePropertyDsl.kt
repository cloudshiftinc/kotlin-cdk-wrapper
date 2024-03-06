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
 * The details of the Amazon Redshift cluster storage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * RedshiftClusterStorageProperty redshiftClusterStorageProperty =
 * RedshiftClusterStorageProperty.builder()
 * .clusterName("clusterName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftclusterstorage.html)
 */
@CdkDslMarker
public class CfnDataSourceRedshiftClusterStoragePropertyDsl {
    private val cdkBuilder: CfnDataSource.RedshiftClusterStorageProperty.Builder =
        CfnDataSource.RedshiftClusterStorageProperty.builder()

    /** @param clusterName The name of an Amazon Redshift cluster. */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    public fun build(): CfnDataSource.RedshiftClusterStorageProperty = cdkBuilder.build()
}
