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

package io.cloudshiftdev.awscdkdsl.services.kendra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information to an
 * [Amazon Kendra supported database](https://docs.aws.amazon.com/kendra/latest/dg/data-source-database.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * DatabaseConfigurationProperty databaseConfigurationProperty =
 * DatabaseConfigurationProperty.builder()
 * .columnConfiguration(ColumnConfigurationProperty.builder()
 * .changeDetectingColumns(List.of("changeDetectingColumns"))
 * .documentDataColumnName("documentDataColumnName")
 * .documentIdColumnName("documentIdColumnName")
 * // the properties below are optional
 * .documentTitleColumnName("documentTitleColumnName")
 * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .build())
 * .connectionConfiguration(ConnectionConfigurationProperty.builder()
 * .databaseHost("databaseHost")
 * .databaseName("databaseName")
 * .databasePort(123)
 * .secretArn("secretArn")
 * .tableName("tableName")
 * .build())
 * .databaseEngineType("databaseEngineType")
 * // the properties below are optional
 * .aclConfiguration(AclConfigurationProperty.builder()
 * .allowedGroupsColumnName("allowedGroupsColumnName")
 * .build())
 * .sqlConfiguration(SqlConfigurationProperty.builder()
 * .queryIdentifiersEnclosingOption("queryIdentifiersEnclosingOption")
 * .build())
 * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-databaseconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceDatabaseConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.DatabaseConfigurationProperty.Builder =
        CfnDataSource.DatabaseConfigurationProperty.builder()

    /**
     * @param aclConfiguration Information about the database column that provides information for
     *   user context filtering.
     */
    public fun aclConfiguration(aclConfiguration: IResolvable) {
        cdkBuilder.aclConfiguration(aclConfiguration)
    }

    /**
     * @param aclConfiguration Information about the database column that provides information for
     *   user context filtering.
     */
    public fun aclConfiguration(aclConfiguration: CfnDataSource.AclConfigurationProperty) {
        cdkBuilder.aclConfiguration(aclConfiguration)
    }

    /**
     * @param columnConfiguration Information about where the index should get the document
     *   information from the database.
     */
    public fun columnConfiguration(columnConfiguration: IResolvable) {
        cdkBuilder.columnConfiguration(columnConfiguration)
    }

    /**
     * @param columnConfiguration Information about where the index should get the document
     *   information from the database.
     */
    public fun columnConfiguration(columnConfiguration: CfnDataSource.ColumnConfigurationProperty) {
        cdkBuilder.columnConfiguration(columnConfiguration)
    }

    /**
     * @param connectionConfiguration Configuration information that's required to connect to a
     *   database.
     */
    public fun connectionConfiguration(connectionConfiguration: IResolvable) {
        cdkBuilder.connectionConfiguration(connectionConfiguration)
    }

    /**
     * @param connectionConfiguration Configuration information that's required to connect to a
     *   database.
     */
    public fun connectionConfiguration(
        connectionConfiguration: CfnDataSource.ConnectionConfigurationProperty
    ) {
        cdkBuilder.connectionConfiguration(connectionConfiguration)
    }

    /** @param databaseEngineType The type of database engine that runs the database. */
    public fun databaseEngineType(databaseEngineType: String) {
        cdkBuilder.databaseEngineType(databaseEngineType)
    }

    /**
     * @param sqlConfiguration Provides information about how Amazon Kendra uses quote marks around
     *   SQL identifiers when querying a database data source.
     */
    public fun sqlConfiguration(sqlConfiguration: IResolvable) {
        cdkBuilder.sqlConfiguration(sqlConfiguration)
    }

    /**
     * @param sqlConfiguration Provides information about how Amazon Kendra uses quote marks around
     *   SQL identifiers when querying a database data source.
     */
    public fun sqlConfiguration(sqlConfiguration: CfnDataSource.SqlConfigurationProperty) {
        cdkBuilder.sqlConfiguration(sqlConfiguration)
    }

    /** @param vpcConfiguration Provides information for connecting to an Amazon VPC. */
    public fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    /** @param vpcConfiguration Provides information for connecting to an Amazon VPC. */
    public fun vpcConfiguration(
        vpcConfiguration: CfnDataSource.DataSourceVpcConfigurationProperty
    ) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    public fun build(): CfnDataSource.DatabaseConfigurationProperty = cdkBuilder.build()
}
