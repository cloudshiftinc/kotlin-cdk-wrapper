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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datazone.CfnDataSource

/**
 * The details of the Amazon Redshift storage as part of the configuration of an Amazon Redshift
 * data source run.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * RedshiftStorageProperty redshiftStorageProperty = RedshiftStorageProperty.builder()
 * .redshiftClusterSource(RedshiftClusterStorageProperty.builder()
 * .clusterName("clusterName")
 * .build())
 * .redshiftServerlessSource(RedshiftServerlessStorageProperty.builder()
 * .workgroupName("workgroupName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftstorage.html)
 */
@CdkDslMarker
public class CfnDataSourceRedshiftStoragePropertyDsl {
    private val cdkBuilder: CfnDataSource.RedshiftStorageProperty.Builder =
        CfnDataSource.RedshiftStorageProperty.builder()

    /** @param redshiftClusterSource The details of the Amazon Redshift cluster source. */
    public fun redshiftClusterSource(redshiftClusterSource: IResolvable) {
        cdkBuilder.redshiftClusterSource(redshiftClusterSource)
    }

    /** @param redshiftClusterSource The details of the Amazon Redshift cluster source. */
    public fun redshiftClusterSource(
        redshiftClusterSource: CfnDataSource.RedshiftClusterStorageProperty
    ) {
        cdkBuilder.redshiftClusterSource(redshiftClusterSource)
    }

    /**
     * @param redshiftServerlessSource The details of the Amazon Redshift Serverless workgroup
     *   source.
     */
    public fun redshiftServerlessSource(redshiftServerlessSource: IResolvable) {
        cdkBuilder.redshiftServerlessSource(redshiftServerlessSource)
    }

    /**
     * @param redshiftServerlessSource The details of the Amazon Redshift Serverless workgroup
     *   source.
     */
    public fun redshiftServerlessSource(
        redshiftServerlessSource: CfnDataSource.RedshiftServerlessStorageProperty
    ) {
        cdkBuilder.redshiftServerlessSource(redshiftServerlessSource)
    }

    public fun build(): CfnDataSource.RedshiftStorageProperty = cdkBuilder.build()
}
