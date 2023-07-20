@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceConfluenceConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.ConfluenceConfigurationProperty.Builder =
      CfnDataSource.ConfluenceConfigurationProperty.builder()

  private val _exclusionPatterns: MutableList<String> = mutableListOf()

  private val _inclusionPatterns: MutableList<String> = mutableListOf()

  public fun attachmentConfiguration(attachmentConfiguration: IResolvable) {
    cdkBuilder.attachmentConfiguration(attachmentConfiguration)
  }

  public
      fun attachmentConfiguration(attachmentConfiguration: CfnDataSource.ConfluenceAttachmentConfigurationProperty) {
    cdkBuilder.attachmentConfiguration(attachmentConfiguration)
  }

  public fun blogConfiguration(blogConfiguration: IResolvable) {
    cdkBuilder.blogConfiguration(blogConfiguration)
  }

  public
      fun blogConfiguration(blogConfiguration: CfnDataSource.ConfluenceBlogConfigurationProperty) {
    cdkBuilder.blogConfiguration(blogConfiguration)
  }

  public fun exclusionPatterns(vararg exclusionPatterns: String) {
    _exclusionPatterns.addAll(listOf(*exclusionPatterns))
  }

  public fun exclusionPatterns(exclusionPatterns: Collection<String>) {
    _exclusionPatterns.addAll(exclusionPatterns)
  }

  public fun inclusionPatterns(vararg inclusionPatterns: String) {
    _inclusionPatterns.addAll(listOf(*inclusionPatterns))
  }

  public fun inclusionPatterns(inclusionPatterns: Collection<String>) {
    _inclusionPatterns.addAll(inclusionPatterns)
  }

  public fun pageConfiguration(pageConfiguration: IResolvable) {
    cdkBuilder.pageConfiguration(pageConfiguration)
  }

  public
      fun pageConfiguration(pageConfiguration: CfnDataSource.ConfluencePageConfigurationProperty) {
    cdkBuilder.pageConfiguration(pageConfiguration)
  }

  public fun secretArn(secretArn: String) {
    cdkBuilder.secretArn(secretArn)
  }

  public fun serverUrl(serverUrl: String) {
    cdkBuilder.serverUrl(serverUrl)
  }

  public fun spaceConfiguration(spaceConfiguration: IResolvable) {
    cdkBuilder.spaceConfiguration(spaceConfiguration)
  }

  public
      fun spaceConfiguration(spaceConfiguration: CfnDataSource.ConfluenceSpaceConfigurationProperty) {
    cdkBuilder.spaceConfiguration(spaceConfiguration)
  }

  public fun version(version: String) {
    cdkBuilder.version(version)
  }

  public fun vpcConfiguration(vpcConfiguration: IResolvable) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun vpcConfiguration(vpcConfiguration: CfnDataSource.DataSourceVpcConfigurationProperty) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun build(): CfnDataSource.ConfluenceConfigurationProperty {
    if(_exclusionPatterns.isNotEmpty()) cdkBuilder.exclusionPatterns(_exclusionPatterns)
    if(_inclusionPatterns.isNotEmpty()) cdkBuilder.inclusionPatterns(_inclusionPatterns)
    return cdkBuilder.build()
  }
}
