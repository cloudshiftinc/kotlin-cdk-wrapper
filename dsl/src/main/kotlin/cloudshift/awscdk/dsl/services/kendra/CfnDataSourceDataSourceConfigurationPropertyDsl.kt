@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceDataSourceConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.DataSourceConfigurationProperty.Builder =
      CfnDataSource.DataSourceConfigurationProperty.builder()

  /**
   * @param confluenceConfiguration Provides the configuration information to connect to Confluence
   * as your data source.
   */
  public fun confluenceConfiguration(confluenceConfiguration: IResolvable) {
    cdkBuilder.confluenceConfiguration(confluenceConfiguration)
  }

  /**
   * @param confluenceConfiguration Provides the configuration information to connect to Confluence
   * as your data source.
   */
  public
      fun confluenceConfiguration(confluenceConfiguration: CfnDataSource.ConfluenceConfigurationProperty) {
    cdkBuilder.confluenceConfiguration(confluenceConfiguration)
  }

  /**
   * @param databaseConfiguration Provides the configuration information to connect to a database as
   * your data source.
   */
  public fun databaseConfiguration(databaseConfiguration: IResolvable) {
    cdkBuilder.databaseConfiguration(databaseConfiguration)
  }

  /**
   * @param databaseConfiguration Provides the configuration information to connect to a database as
   * your data source.
   */
  public
      fun databaseConfiguration(databaseConfiguration: CfnDataSource.DatabaseConfigurationProperty) {
    cdkBuilder.databaseConfiguration(databaseConfiguration)
  }

  /**
   * @param googleDriveConfiguration Provides the configuration information to connect to Google
   * Drive as your data source.
   */
  public fun googleDriveConfiguration(googleDriveConfiguration: IResolvable) {
    cdkBuilder.googleDriveConfiguration(googleDriveConfiguration)
  }

  /**
   * @param googleDriveConfiguration Provides the configuration information to connect to Google
   * Drive as your data source.
   */
  public
      fun googleDriveConfiguration(googleDriveConfiguration: CfnDataSource.GoogleDriveConfigurationProperty) {
    cdkBuilder.googleDriveConfiguration(googleDriveConfiguration)
  }

  /**
   * @param oneDriveConfiguration Provides the configuration information to connect to Microsoft
   * OneDrive as your data source.
   */
  public fun oneDriveConfiguration(oneDriveConfiguration: IResolvable) {
    cdkBuilder.oneDriveConfiguration(oneDriveConfiguration)
  }

  /**
   * @param oneDriveConfiguration Provides the configuration information to connect to Microsoft
   * OneDrive as your data source.
   */
  public
      fun oneDriveConfiguration(oneDriveConfiguration: CfnDataSource.OneDriveConfigurationProperty) {
    cdkBuilder.oneDriveConfiguration(oneDriveConfiguration)
  }

  /**
   * @param s3Configuration Provides the configuration information to connect to an Amazon S3 bucket
   * as your data source.
   */
  public fun s3Configuration(s3Configuration: IResolvable) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  /**
   * @param s3Configuration Provides the configuration information to connect to an Amazon S3 bucket
   * as your data source.
   */
  public fun s3Configuration(s3Configuration: CfnDataSource.S3DataSourceConfigurationProperty) {
    cdkBuilder.s3Configuration(s3Configuration)
  }

  /**
   * @param salesforceConfiguration Provides the configuration information to connect to Salesforce
   * as your data source.
   */
  public fun salesforceConfiguration(salesforceConfiguration: IResolvable) {
    cdkBuilder.salesforceConfiguration(salesforceConfiguration)
  }

  /**
   * @param salesforceConfiguration Provides the configuration information to connect to Salesforce
   * as your data source.
   */
  public
      fun salesforceConfiguration(salesforceConfiguration: CfnDataSource.SalesforceConfigurationProperty) {
    cdkBuilder.salesforceConfiguration(salesforceConfiguration)
  }

  /**
   * @param serviceNowConfiguration Provides the configuration information to connect to ServiceNow
   * as your data source.
   */
  public fun serviceNowConfiguration(serviceNowConfiguration: IResolvable) {
    cdkBuilder.serviceNowConfiguration(serviceNowConfiguration)
  }

  /**
   * @param serviceNowConfiguration Provides the configuration information to connect to ServiceNow
   * as your data source.
   */
  public
      fun serviceNowConfiguration(serviceNowConfiguration: CfnDataSource.ServiceNowConfigurationProperty) {
    cdkBuilder.serviceNowConfiguration(serviceNowConfiguration)
  }

  /**
   * @param sharePointConfiguration Provides the configuration information to connect to Microsoft
   * SharePoint as your data source.
   */
  public fun sharePointConfiguration(sharePointConfiguration: IResolvable) {
    cdkBuilder.sharePointConfiguration(sharePointConfiguration)
  }

  /**
   * @param sharePointConfiguration Provides the configuration information to connect to Microsoft
   * SharePoint as your data source.
   */
  public
      fun sharePointConfiguration(sharePointConfiguration: CfnDataSource.SharePointConfigurationProperty) {
    cdkBuilder.sharePointConfiguration(sharePointConfiguration)
  }

  /**
   * @param webCrawlerConfiguration Provides the configuration information required for Amazon
   * Kendra Web Crawler.
   */
  public fun webCrawlerConfiguration(webCrawlerConfiguration: IResolvable) {
    cdkBuilder.webCrawlerConfiguration(webCrawlerConfiguration)
  }

  /**
   * @param webCrawlerConfiguration Provides the configuration information required for Amazon
   * Kendra Web Crawler.
   */
  public
      fun webCrawlerConfiguration(webCrawlerConfiguration: CfnDataSource.WebCrawlerConfigurationProperty) {
    cdkBuilder.webCrawlerConfiguration(webCrawlerConfiguration)
  }

  /**
   * @param workDocsConfiguration Provides the configuration information to connect to Amazon
   * WorkDocs as your data source.
   */
  public fun workDocsConfiguration(workDocsConfiguration: IResolvable) {
    cdkBuilder.workDocsConfiguration(workDocsConfiguration)
  }

  /**
   * @param workDocsConfiguration Provides the configuration information to connect to Amazon
   * WorkDocs as your data source.
   */
  public
      fun workDocsConfiguration(workDocsConfiguration: CfnDataSource.WorkDocsConfigurationProperty) {
    cdkBuilder.workDocsConfiguration(workDocsConfiguration)
  }

  public fun build(): CfnDataSource.DataSourceConfigurationProperty = cdkBuilder.build()
}
