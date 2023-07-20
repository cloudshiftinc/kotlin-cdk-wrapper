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
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataSourceSharePointConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.SharePointConfigurationProperty.Builder =
        CfnDataSource.SharePointConfigurationProperty.builder()

    private val _exclusionPatterns: MutableList<String> = mutableListOf()

    private val _fieldMappings: MutableList<Any> = mutableListOf()

    private val _inclusionPatterns: MutableList<String> = mutableListOf()

    private val _urls: MutableList<String> = mutableListOf()

    public fun crawlAttachments(crawlAttachments: Boolean) {
        cdkBuilder.crawlAttachments(crawlAttachments)
    }

    public fun crawlAttachments(crawlAttachments: IResolvable) {
        cdkBuilder.crawlAttachments(crawlAttachments)
    }

    public fun disableLocalGroups(disableLocalGroups: Boolean) {
        cdkBuilder.disableLocalGroups(disableLocalGroups)
    }

    public fun disableLocalGroups(disableLocalGroups: IResolvable) {
        cdkBuilder.disableLocalGroups(disableLocalGroups)
    }

    public fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
    }

    public fun exclusionPatterns(vararg exclusionPatterns: String) {
        _exclusionPatterns.addAll(listOf(*exclusionPatterns))
    }

    public fun exclusionPatterns(exclusionPatterns: Collection<String>) {
        _exclusionPatterns.addAll(exclusionPatterns)
    }

    public fun fieldMappings(vararg fieldMappings: Any) {
        _fieldMappings.addAll(listOf(*fieldMappings))
    }

    public fun fieldMappings(fieldMappings: Collection<Any>) {
        _fieldMappings.addAll(fieldMappings)
    }

    public fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings)
    }

    public fun inclusionPatterns(vararg inclusionPatterns: String) {
        _inclusionPatterns.addAll(listOf(*inclusionPatterns))
    }

    public fun inclusionPatterns(inclusionPatterns: Collection<String>) {
        _inclusionPatterns.addAll(inclusionPatterns)
    }

    public fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
    }

    public fun sharePointVersion(sharePointVersion: String) {
        cdkBuilder.sharePointVersion(sharePointVersion)
    }

    public fun sslCertificateS3Path(sslCertificateS3Path: IResolvable) {
        cdkBuilder.sslCertificateS3Path(sslCertificateS3Path)
    }

    public fun sslCertificateS3Path(sslCertificateS3Path: CfnDataSource.S3PathProperty) {
        cdkBuilder.sslCertificateS3Path(sslCertificateS3Path)
    }

    public fun urls(vararg urls: String) {
        _urls.addAll(listOf(*urls))
    }

    public fun urls(urls: Collection<String>) {
        _urls.addAll(urls)
    }

    public fun useChangeLog(useChangeLog: Boolean) {
        cdkBuilder.useChangeLog(useChangeLog)
    }

    public fun useChangeLog(useChangeLog: IResolvable) {
        cdkBuilder.useChangeLog(useChangeLog)
    }

    public fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration)
    }

    public fun vpcConfiguration(vpcConfiguration: CfnDataSource.DataSourceVpcConfigurationProperty) {
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
