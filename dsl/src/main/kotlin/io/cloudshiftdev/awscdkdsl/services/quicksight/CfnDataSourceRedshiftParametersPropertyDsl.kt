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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSource

/**
 * The parameters for Amazon Redshift.
 *
 * The `ClusterId` field can be blank if `Host` and `Port` are both set. The `Host` and `Port`
 * fields can be blank if the `ClusterId` field is set.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * RedshiftParametersProperty redshiftParametersProperty = RedshiftParametersProperty.builder()
 * .database("database")
 * // the properties below are optional
 * .clusterId("clusterId")
 * .host("host")
 * .port(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-datasource-redshiftparameters.html)
 */
@CdkDslMarker
public class CfnDataSourceRedshiftParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.RedshiftParametersProperty.Builder =
        CfnDataSource.RedshiftParametersProperty.builder()

    /**
     * @param clusterId Cluster ID. This field can be blank if the `Host` and `Port` are provided.
     */
    public fun clusterId(clusterId: String) {
        cdkBuilder.clusterId(clusterId)
    }

    /** @param database Database. */
    public fun database(database: String) {
        cdkBuilder.database(database)
    }

    /** @param host Host. This field can be blank if `ClusterId` is provided. */
    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    /** @param port Port. This field can be blank if the `ClusterId` is provided. */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDataSource.RedshiftParametersProperty = cdkBuilder.build()
}
