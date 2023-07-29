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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information to connect to Microsoft SharePoint as your data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * SharePointConfigurationProperty sharePointConfigurationProperty =
 * SharePointConfigurationProperty.builder()
 * .secretArn("secretArn")
 * .sharePointVersion("sharePointVersion")
 * .urls(List.of("urls"))
 * // the properties below are optional
 * .crawlAttachments(false)
 * .disableLocalGroups(false)
 * .documentTitleFieldName("documentTitleFieldName")
 * .exclusionPatterns(List.of("exclusionPatterns"))
 * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .inclusionPatterns(List.of("inclusionPatterns"))
 * .sslCertificateS3Path(S3PathProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * .useChangeLog(false)
 * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-sharepointconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceSharePointConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.SharePointConfigurationProperty.Builder =
        CfnDataSource.SharePointConfigurationProperty.builder()

    private val _exclusionPatterns: MutableList<String> = mutableListOf()

    private val _fieldMappings: MutableList<Any> = mutableListOf()

    private val _inclusionPatterns: MutableList<String> = mutableListOf()

    private val _urls: MutableList<String> = mutableListOf()

    /** @param crawlAttachments `TRUE` to index document attachments. */
    public fun crawlAttachments(crawlAttachments: Boolean) {
        cdkBuilder.crawlAttachments(crawlAttachments)
    }

    /** @param crawlAttachments `TRUE` to index document attachments. */
    public fun crawlAttachments(crawlAttachments: IResolvable) {
        cdkBuilder.crawlAttachments(crawlAttachments)
    }

    /** @param disableLocalGroups `TRUE` to disable local groups information. */
    public fun disableLocalGroups(disableLocalGroups: Boolean) {
        cdkBuilder.disableLocalGroups(disableLocalGroups)
    }

    /** @param disableLocalGroups `TRUE` to disable local groups information. */
    public fun disableLocalGroups(disableLocalGroups: IResolvable) {
        cdkBuilder.disableLocalGroups(disableLocalGroups)
    }

    /**
     * @param documentTitleFieldName The Microsoft SharePoint attribute field that contains the
     *   title of the document.
     */
    public fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
    }

    /**
     * @param exclusionPatterns A list of regular expression patterns. Documents that match the
     *   patterns are excluded from the index. Documents that don't match the patterns are included
     *   in the index. If a document matches both an exclusion pattern and an inclusion pattern, the
     *   document is not included in the index.
     *
     * The regex is applied to the display URL of the SharePoint document.
     */
    public fun exclusionPatterns(vararg exclusionPatterns: String) {
        _exclusionPatterns.addAll(listOf(*exclusionPatterns))
    }

    /**
     * @param exclusionPatterns A list of regular expression patterns. Documents that match the
     *   patterns are excluded from the index. Documents that don't match the patterns are included
     *   in the index. If a document matches both an exclusion pattern and an inclusion pattern, the
     *   document is not included in the index.
     *
     * The regex is applied to the display URL of the SharePoint document.
     */
    public fun exclusionPatterns(exclusionPatterns: Collection<String>) {
        _exclusionPatterns.addAll(exclusionPatterns)
    }

    /**
     * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Microsoft
     *   SharePoint attributes or fields to Amazon Kendra index fields. You must first create the
     *   index fields using the
     *   [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation
     *   before you map SharePoint attributes. For more information, see
     *   [Mapping Data Source Fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   .
     */
    public fun fieldMappings(vararg fieldMappings: Any) {
        _fieldMappings.addAll(listOf(*fieldMappings))
    }

    /**
     * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Microsoft
     *   SharePoint attributes or fields to Amazon Kendra index fields. You must first create the
     *   index fields using the
     *   [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation
     *   before you map SharePoint attributes. For more information, see
     *   [Mapping Data Source Fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   .
     */
    public fun fieldMappings(fieldMappings: Collection<Any>) {
        _fieldMappings.addAll(fieldMappings)
    }

    /**
     * @param fieldMappings A list of `DataSourceToIndexFieldMapping` objects that map Microsoft
     *   SharePoint attributes or fields to Amazon Kendra index fields. You must first create the
     *   index fields using the
     *   [UpdateIndex](https://docs.aws.amazon.com/kendra/latest/dg/API_UpdateIndex.html) operation
     *   before you map SharePoint attributes. For more information, see
     *   [Mapping Data Source Fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   .
     */
    public fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings)
    }

    /**
     * @param inclusionPatterns A list of regular expression patterns to include certain documents
     *   in your SharePoint. Documents that match the patterns are included in the index. Documents
     *   that don't match the patterns are excluded from the index. If a document matches both an
     *   inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     *   isn't included in the index.
     *
     * The regex applies to the display URL of the SharePoint document.
     */
    public fun inclusionPatterns(vararg inclusionPatterns: String) {
        _inclusionPatterns.addAll(listOf(*inclusionPatterns))
    }

    /**
     * @param inclusionPatterns A list of regular expression patterns to include certain documents
     *   in your SharePoint. Documents that match the patterns are included in the index. Documents
     *   that don't match the patterns are excluded from the index. If a document matches both an
     *   inclusion and exclusion pattern, the exclusion pattern takes precedence and the document
     *   isn't included in the index.
     *
     * The regex applies to the display URL of the SharePoint document.
     */
    public fun inclusionPatterns(inclusionPatterns: Collection<String>) {
        _inclusionPatterns.addAll(inclusionPatterns)
    }

    /**
     * @param secretArn The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
     *   contains the user name and password required to connect to the SharePoint instance. For
     *   more information, see
     *   [Microsoft SharePoint](https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html)
     *   .
     */
    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    /** @param sharePointVersion The version of Microsoft SharePoint that you use. */
    public fun sharePointVersion(sharePointVersion: String) {
        cdkBuilder.sharePointVersion(sharePointVersion)
    }

    /**
     * @param sslCertificateS3Path Information required to find a specific file in an Amazon S3
     *   bucket.
     */
    public fun sslCertificateS3Path(sslCertificateS3Path: IResolvable) {
        cdkBuilder.sslCertificateS3Path(sslCertificateS3Path)
    }

    /**
     * @param sslCertificateS3Path Information required to find a specific file in an Amazon S3
     *   bucket.
     */
    public fun sslCertificateS3Path(sslCertificateS3Path: CfnDataSource.S3PathProperty) {
        cdkBuilder.sslCertificateS3Path(sslCertificateS3Path)
    }

    /** @param urls The Microsoft SharePoint site URLs for the documents you want to index. */
    public fun urls(vararg urls: String) {
        _urls.addAll(listOf(*urls))
    }

    /** @param urls The Microsoft SharePoint site URLs for the documents you want to index. */
    public fun urls(urls: Collection<String>) {
        _urls.addAll(urls)
    }

    /**
     * @param useChangeLog `TRUE` to use the SharePoint change log to determine which documents
     *   require updating in the index. Depending on the change log's size, it may take longer for
     *   Amazon Kendra to use the change log than to scan all of your documents in SharePoint.
     */
    public fun useChangeLog(useChangeLog: Boolean) {
        cdkBuilder.useChangeLog(useChangeLog)
    }

    /**
     * @param useChangeLog `TRUE` to use the SharePoint change log to determine which documents
     *   require updating in the index. Depending on the change log's size, it may take longer for
     *   Amazon Kendra to use the change log than to scan all of your documents in SharePoint.
     */
    public fun useChangeLog(useChangeLog: IResolvable) {
        cdkBuilder.useChangeLog(useChangeLog)
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

    public fun build(): CfnDataSource.SharePointConfigurationProperty {
        if (_exclusionPatterns.isNotEmpty()) cdkBuilder.exclusionPatterns(_exclusionPatterns)
        if (_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
        if (_inclusionPatterns.isNotEmpty()) cdkBuilder.inclusionPatterns(_inclusionPatterns)
        if (_urls.isNotEmpty()) cdkBuilder.urls(_urls)
        return cdkBuilder.build()
    }
}
