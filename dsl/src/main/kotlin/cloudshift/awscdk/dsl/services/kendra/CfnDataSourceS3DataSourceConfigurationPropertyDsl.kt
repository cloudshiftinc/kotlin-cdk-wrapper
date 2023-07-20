@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceS3DataSourceConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.S3DataSourceConfigurationProperty.Builder =
      CfnDataSource.S3DataSourceConfigurationProperty.builder()

  private val _exclusionPatterns: MutableList<String> = mutableListOf()

  private val _inclusionPatterns: MutableList<String> = mutableListOf()

  private val _inclusionPrefixes: MutableList<String> = mutableListOf()

  public fun accessControlListConfiguration(accessControlListConfiguration: IResolvable) {
    cdkBuilder.accessControlListConfiguration(accessControlListConfiguration)
  }

  public
      fun accessControlListConfiguration(accessControlListConfiguration: CfnDataSource.AccessControlListConfigurationProperty) {
    cdkBuilder.accessControlListConfiguration(accessControlListConfiguration)
  }

  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  public fun documentsMetadataConfiguration(documentsMetadataConfiguration: IResolvable) {
    cdkBuilder.documentsMetadataConfiguration(documentsMetadataConfiguration)
  }

  public
      fun documentsMetadataConfiguration(documentsMetadataConfiguration: CfnDataSource.DocumentsMetadataConfigurationProperty) {
    cdkBuilder.documentsMetadataConfiguration(documentsMetadataConfiguration)
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

  public fun inclusionPrefixes(vararg inclusionPrefixes: String) {
    _inclusionPrefixes.addAll(listOf(*inclusionPrefixes))
  }

  public fun inclusionPrefixes(inclusionPrefixes: Collection<String>) {
    _inclusionPrefixes.addAll(inclusionPrefixes)
  }

  public fun build(): CfnDataSource.S3DataSourceConfigurationProperty {
    if(_exclusionPatterns.isNotEmpty()) cdkBuilder.exclusionPatterns(_exclusionPatterns)
    if(_inclusionPatterns.isNotEmpty()) cdkBuilder.inclusionPatterns(_inclusionPatterns)
    if(_inclusionPrefixes.isNotEmpty()) cdkBuilder.inclusionPrefixes(_inclusionPrefixes)
    return cdkBuilder.build()
  }
}
