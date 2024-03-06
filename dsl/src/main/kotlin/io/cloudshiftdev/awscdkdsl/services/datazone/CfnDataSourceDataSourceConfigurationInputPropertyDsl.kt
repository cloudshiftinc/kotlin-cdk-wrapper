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
 * The configuration of the data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * DataSourceConfigurationInputProperty dataSourceConfigurationInputProperty =
 * DataSourceConfigurationInputProperty.builder()
 * .glueRunConfiguration(GlueRunConfigurationInputProperty.builder()
 * .relationalFilterConfigurations(List.of(RelationalFilterConfigurationProperty.builder()
 * .databaseName("databaseName")
 * // the properties below are optional
 * .filterExpressions(List.of(FilterExpressionProperty.builder()
 * .expression("expression")
 * .type("type")
 * .build()))
 * .schemaName("schemaName")
 * .build()))
 * // the properties below are optional
 * .dataAccessRole("dataAccessRole")
 * .build())
 * .redshiftRunConfiguration(RedshiftRunConfigurationInputProperty.builder()
 * .redshiftCredentialConfiguration(RedshiftCredentialConfigurationProperty.builder()
 * .secretManagerArn("secretManagerArn")
 * .build())
 * .redshiftStorage(RedshiftStorageProperty.builder()
 * .redshiftClusterSource(RedshiftClusterStorageProperty.builder()
 * .clusterName("clusterName")
 * .build())
 * .redshiftServerlessSource(RedshiftServerlessStorageProperty.builder()
 * .workgroupName("workgroupName")
 * .build())
 * .build())
 * .relationalFilterConfigurations(List.of(RelationalFilterConfigurationProperty.builder()
 * .databaseName("databaseName")
 * // the properties below are optional
 * .filterExpressions(List.of(FilterExpressionProperty.builder()
 * .expression("expression")
 * .type("type")
 * .build()))
 * .schemaName("schemaName")
 * .build()))
 * // the properties below are optional
 * .dataAccessRole("dataAccessRole")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-datasourceconfigurationinput.html)
 */
@CdkDslMarker
public class CfnDataSourceDataSourceConfigurationInputPropertyDsl {
    private val cdkBuilder: CfnDataSource.DataSourceConfigurationInputProperty.Builder =
        CfnDataSource.DataSourceConfigurationInputProperty.builder()

    /** @param glueRunConfiguration The configuration of the AWS Glue data source. */
    public fun glueRunConfiguration(glueRunConfiguration: IResolvable) {
        cdkBuilder.glueRunConfiguration(glueRunConfiguration)
    }

    /** @param glueRunConfiguration The configuration of the AWS Glue data source. */
    public fun glueRunConfiguration(
        glueRunConfiguration: CfnDataSource.GlueRunConfigurationInputProperty
    ) {
        cdkBuilder.glueRunConfiguration(glueRunConfiguration)
    }

    /** @param redshiftRunConfiguration The configuration of the Amazon Redshift data source. */
    public fun redshiftRunConfiguration(redshiftRunConfiguration: IResolvable) {
        cdkBuilder.redshiftRunConfiguration(redshiftRunConfiguration)
    }

    /** @param redshiftRunConfiguration The configuration of the Amazon Redshift data source. */
    public fun redshiftRunConfiguration(
        redshiftRunConfiguration: CfnDataSource.RedshiftRunConfigurationInputProperty
    ) {
        cdkBuilder.redshiftRunConfiguration(redshiftRunConfiguration)
    }

    public fun build(): CfnDataSource.DataSourceConfigurationInputProperty = cdkBuilder.build()
}
