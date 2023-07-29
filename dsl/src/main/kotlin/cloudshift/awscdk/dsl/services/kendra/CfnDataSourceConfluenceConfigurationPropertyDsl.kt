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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information to connect to Confluence as your data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * ConfluenceConfigurationProperty confluenceConfigurationProperty =
 * ConfluenceConfigurationProperty.builder()
 * .secretArn("secretArn")
 * .serverUrl("serverUrl")
 * .version("version")
 * // the properties below are optional
 * .attachmentConfiguration(ConfluenceAttachmentConfigurationProperty.builder()
 * .attachmentFieldMappings(List.of(ConfluenceAttachmentToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .crawlAttachments(false)
 * .build())
 * .blogConfiguration(ConfluenceBlogConfigurationProperty.builder()
 * .blogFieldMappings(List.of(ConfluenceBlogToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .build())
 * .exclusionPatterns(List.of("exclusionPatterns"))
 * .inclusionPatterns(List.of("inclusionPatterns"))
 * .pageConfiguration(ConfluencePageConfigurationProperty.builder()
 * .pageFieldMappings(List.of(ConfluencePageToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .build())
 * .spaceConfiguration(ConfluenceSpaceConfigurationProperty.builder()
 * .crawlArchivedSpaces(false)
 * .crawlPersonalSpaces(false)
 * .excludeSpaces(List.of("excludeSpaces"))
 * .includeSpaces(List.of("includeSpaces"))
 * .spaceFieldMappings(List.of(ConfluenceSpaceToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .build())
 * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceConfluenceConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.ConfluenceConfigurationProperty.Builder =
        CfnDataSource.ConfluenceConfigurationProperty.builder()

    private val _exclusionPatterns: MutableList<String> = mutableListOf()

    private val _inclusionPatterns: MutableList<String> = mutableListOf()

    /**
     * @param attachmentConfiguration Configuration information for indexing attachments to
     *   Confluence blogs and pages.
     */
    public fun attachmentConfiguration(attachmentConfiguration: IResolvable) {
        cdkBuilder.attachmentConfiguration(attachmentConfiguration)
    }

    /**
     * @param attachmentConfiguration Configuration information for indexing attachments to
     *   Confluence blogs and pages.
     */
    public fun attachmentConfiguration(
        attachmentConfiguration: CfnDataSource.ConfluenceAttachmentConfigurationProperty
    ) {
        cdkBuilder.attachmentConfiguration(attachmentConfiguration)
    }

    /** @param blogConfiguration Configuration information for indexing Confluence blogs. */
    public fun blogConfiguration(blogConfiguration: IResolvable) {
        cdkBuilder.blogConfiguration(blogConfiguration)
    }

    /** @param blogConfiguration Configuration information for indexing Confluence blogs. */
    public fun blogConfiguration(
        blogConfiguration: CfnDataSource.ConfluenceBlogConfigurationProperty
    ) {
        cdkBuilder.blogConfiguration(blogConfiguration)
    }

    /**
     * @param exclusionPatterns A list of regular expression patterns to exclude certain blog posts,
     *   pages, spaces, or attachments in your Confluence. Content that matches the patterns are
     *   excluded from the index. Content that doesn't match the patterns is included in the index.
     *   If content matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *   precedence and the content isn't included in the index.
     */
    public fun exclusionPatterns(vararg exclusionPatterns: String) {
        _exclusionPatterns.addAll(listOf(*exclusionPatterns))
    }

    /**
     * @param exclusionPatterns A list of regular expression patterns to exclude certain blog posts,
     *   pages, spaces, or attachments in your Confluence. Content that matches the patterns are
     *   excluded from the index. Content that doesn't match the patterns is included in the index.
     *   If content matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *   precedence and the content isn't included in the index.
     */
    public fun exclusionPatterns(exclusionPatterns: Collection<String>) {
        _exclusionPatterns.addAll(exclusionPatterns)
    }

    /**
     * @param inclusionPatterns A list of regular expression patterns to include certain blog posts,
     *   pages, spaces, or attachments in your Confluence. Content that matches the patterns are
     *   included in the index. Content that doesn't match the patterns is excluded from the index.
     *   If content matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *   precedence and the content isn't included in the index.
     */
    public fun inclusionPatterns(vararg inclusionPatterns: String) {
        _inclusionPatterns.addAll(listOf(*inclusionPatterns))
    }

    /**
     * @param inclusionPatterns A list of regular expression patterns to include certain blog posts,
     *   pages, spaces, or attachments in your Confluence. Content that matches the patterns are
     *   included in the index. Content that doesn't match the patterns is excluded from the index.
     *   If content matches both an inclusion and exclusion pattern, the exclusion pattern takes
     *   precedence and the content isn't included in the index.
     */
    public fun inclusionPatterns(inclusionPatterns: Collection<String>) {
        _inclusionPatterns.addAll(inclusionPatterns)
    }

    /** @param pageConfiguration Configuration information for indexing Confluence pages. */
    public fun pageConfiguration(pageConfiguration: IResolvable) {
        cdkBuilder.pageConfiguration(pageConfiguration)
    }

    /** @param pageConfiguration Configuration information for indexing Confluence pages. */
    public fun pageConfiguration(
        pageConfiguration: CfnDataSource.ConfluencePageConfigurationProperty
    ) {
        cdkBuilder.pageConfiguration(pageConfiguration)
    }

    /**
     * @param secretArn The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that
     *   contains the user name and password required to connect to the Confluence instance. If you
     *   use Confluence Cloud, you use a generated API token as the password.
     *
     * You can also provide authentication credentials in the form of a personal access token. For
     * more information, see
     * [Using a Confluence data source](https://docs.aws.amazon.com/kendra/latest/dg/data-source-confluence.html)
     * .
     */
    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    /**
     * @param serverUrl The URL of your Confluence instance. Use the full URL of the server. For
     *   example, *https://server.example.com:port/ * . You can also use an IP address, for example,
     *   *https://192.168.1.113/ * .
     */
    public fun serverUrl(serverUrl: String) {
        cdkBuilder.serverUrl(serverUrl)
    }

    /** @param spaceConfiguration Configuration information for indexing Confluence spaces. */
    public fun spaceConfiguration(spaceConfiguration: IResolvable) {
        cdkBuilder.spaceConfiguration(spaceConfiguration)
    }

    /** @param spaceConfiguration Configuration information for indexing Confluence spaces. */
    public fun spaceConfiguration(
        spaceConfiguration: CfnDataSource.ConfluenceSpaceConfigurationProperty
    ) {
        cdkBuilder.spaceConfiguration(spaceConfiguration)
    }

    /** @param version The version or the type of Confluence installation to connect to. */
    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    /**
     * @param vpcConfiguration Configuration information for an Amazon Virtual Private Cloud to
     *   connect to your Confluence. For more information, see
     *   [Configuring a VPC](https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html) .
     */
    public fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    /**
     * @param vpcConfiguration Configuration information for an Amazon Virtual Private Cloud to
     *   connect to your Confluence. For more information, see
     *   [Configuring a VPC](https://docs.aws.amazon.com/kendra/latest/dg/vpc-configuration.html) .
     */
    public fun vpcConfiguration(
        vpcConfiguration: CfnDataSource.DataSourceVpcConfigurationProperty
    ) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    public fun build(): CfnDataSource.ConfluenceConfigurationProperty {
        if (_exclusionPatterns.isNotEmpty()) cdkBuilder.exclusionPatterns(_exclusionPatterns)
        if (_inclusionPatterns.isNotEmpty()) cdkBuilder.inclusionPatterns(_inclusionPatterns)
        return cdkBuilder.build()
    }
}
