@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceDataSourceConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.DataSourceConfigurationProperty.Builder =
        CfnDataSource.DataSourceConfigurationProperty.builder()

    public fun confluenceConfiguration(confluenceConfiguration: IResolvable) {
        cdkBuilder.confluenceConfiguration(confluenceConfiguration)
    }

    public fun confluenceConfiguration(confluenceConfiguration: CfnDataSource.ConfluenceConfigurationProperty) {
        cdkBuilder.confluenceConfiguration(confluenceConfiguration)
    }

    public fun databaseConfiguration(databaseConfiguration: IResolvable) {
        cdkBuilder.databaseConfiguration(databaseConfiguration)
    }

    public fun databaseConfiguration(databaseConfiguration: CfnDataSource.DatabaseConfigurationProperty) {
        cdkBuilder.databaseConfiguration(databaseConfiguration)
    }

    public fun googleDriveConfiguration(googleDriveConfiguration: IResolvable) {
        cdkBuilder.googleDriveConfiguration(googleDriveConfiguration)
    }

    public fun googleDriveConfiguration(googleDriveConfiguration: CfnDataSource.GoogleDriveConfigurationProperty) {
        cdkBuilder.googleDriveConfiguration(googleDriveConfiguration)
    }

    public fun oneDriveConfiguration(oneDriveConfiguration: IResolvable) {
        cdkBuilder.oneDriveConfiguration(oneDriveConfiguration)
    }

    public fun oneDriveConfiguration(oneDriveConfiguration: CfnDataSource.OneDriveConfigurationProperty) {
        cdkBuilder.oneDriveConfiguration(oneDriveConfiguration)
    }

    public fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    public fun s3Configuration(s3Configuration: CfnDataSource.S3DataSourceConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration)
    }

    public fun salesforceConfiguration(salesforceConfiguration: IResolvable) {
        cdkBuilder.salesforceConfiguration(salesforceConfiguration)
    }

    public fun salesforceConfiguration(salesforceConfiguration: CfnDataSource.SalesforceConfigurationProperty) {
        cdkBuilder.salesforceConfiguration(salesforceConfiguration)
    }

    public fun serviceNowConfiguration(serviceNowConfiguration: IResolvable) {
        cdkBuilder.serviceNowConfiguration(serviceNowConfiguration)
    }

    public fun serviceNowConfiguration(serviceNowConfiguration: CfnDataSource.ServiceNowConfigurationProperty) {
        cdkBuilder.serviceNowConfiguration(serviceNowConfiguration)
    }

    public fun sharePointConfiguration(sharePointConfiguration: IResolvable) {
        cdkBuilder.sharePointConfiguration(sharePointConfiguration)
    }

    public fun sharePointConfiguration(sharePointConfiguration: CfnDataSource.SharePointConfigurationProperty) {
        cdkBuilder.sharePointConfiguration(sharePointConfiguration)
    }

    public fun webCrawlerConfiguration(webCrawlerConfiguration: IResolvable) {
        cdkBuilder.webCrawlerConfiguration(webCrawlerConfiguration)
    }

    public fun webCrawlerConfiguration(webCrawlerConfiguration: CfnDataSource.WebCrawlerConfigurationProperty) {
        cdkBuilder.webCrawlerConfiguration(webCrawlerConfiguration)
    }

    public fun workDocsConfiguration(workDocsConfiguration: IResolvable) {
        cdkBuilder.workDocsConfiguration(workDocsConfiguration)
    }

    public fun workDocsConfiguration(workDocsConfiguration: CfnDataSource.WorkDocsConfigurationProperty) {
        cdkBuilder.workDocsConfiguration(workDocsConfiguration)
    }

    public fun build(): CfnDataSource.DataSourceConfigurationProperty = cdkBuilder.build()
}
