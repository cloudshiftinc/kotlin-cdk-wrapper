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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datazone.CfnDataSource

/**
 * The relational filter configurations included in the configuration details of the Amazon Redshift
 * data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datazone.*;
 * RedshiftRunConfigurationInputProperty redshiftRunConfigurationInputProperty =
 * RedshiftRunConfigurationInputProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datazone-datasource-redshiftrunconfigurationinput.html)
 */
@CdkDslMarker
public class CfnDataSourceRedshiftRunConfigurationInputPropertyDsl {
    private val cdkBuilder: CfnDataSource.RedshiftRunConfigurationInputProperty.Builder =
        CfnDataSource.RedshiftRunConfigurationInputProperty.builder()

    private val _relationalFilterConfigurations: MutableList<Any> = mutableListOf()

    /**
     * @param dataAccessRole The data access role included in the configuration details of the
     *   Amazon Redshift data source.
     */
    public fun dataAccessRole(dataAccessRole: String) {
        cdkBuilder.dataAccessRole(dataAccessRole)
    }

    /**
     * @param redshiftCredentialConfiguration The details of the credentials required to access an
     *   Amazon Redshift cluster.
     */
    public fun redshiftCredentialConfiguration(redshiftCredentialConfiguration: IResolvable) {
        cdkBuilder.redshiftCredentialConfiguration(redshiftCredentialConfiguration)
    }

    /**
     * @param redshiftCredentialConfiguration The details of the credentials required to access an
     *   Amazon Redshift cluster.
     */
    public fun redshiftCredentialConfiguration(
        redshiftCredentialConfiguration: CfnDataSource.RedshiftCredentialConfigurationProperty
    ) {
        cdkBuilder.redshiftCredentialConfiguration(redshiftCredentialConfiguration)
    }

    /**
     * @param redshiftStorage The details of the Amazon Redshift storage as part of the
     *   configuration of an Amazon Redshift data source run.
     */
    public fun redshiftStorage(redshiftStorage: IResolvable) {
        cdkBuilder.redshiftStorage(redshiftStorage)
    }

    /**
     * @param redshiftStorage The details of the Amazon Redshift storage as part of the
     *   configuration of an Amazon Redshift data source run.
     */
    public fun redshiftStorage(redshiftStorage: CfnDataSource.RedshiftStorageProperty) {
        cdkBuilder.redshiftStorage(redshiftStorage)
    }

    /**
     * @param relationalFilterConfigurations The relational filter configurations included in the
     *   configuration details of the AWS Glue data source.
     */
    public fun relationalFilterConfigurations(vararg relationalFilterConfigurations: Any) {
        _relationalFilterConfigurations.addAll(listOf(*relationalFilterConfigurations))
    }

    /**
     * @param relationalFilterConfigurations The relational filter configurations included in the
     *   configuration details of the AWS Glue data source.
     */
    public fun relationalFilterConfigurations(relationalFilterConfigurations: Collection<Any>) {
        _relationalFilterConfigurations.addAll(relationalFilterConfigurations)
    }

    /**
     * @param relationalFilterConfigurations The relational filter configurations included in the
     *   configuration details of the AWS Glue data source.
     */
    public fun relationalFilterConfigurations(relationalFilterConfigurations: IResolvable) {
        cdkBuilder.relationalFilterConfigurations(relationalFilterConfigurations)
    }

    public fun build(): CfnDataSource.RedshiftRunConfigurationInputProperty {
        if (_relationalFilterConfigurations.isNotEmpty())
            cdkBuilder.relationalFilterConfigurations(_relationalFilterConfigurations)
        return cdkBuilder.build()
    }
}
