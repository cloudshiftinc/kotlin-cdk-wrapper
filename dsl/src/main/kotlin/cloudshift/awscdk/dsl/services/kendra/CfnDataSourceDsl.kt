@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource
import software.constructs.Construct

@CdkDslMarker
public class CfnDataSourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDataSource.Builder = CfnDataSource.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Configuration information for altering document metadata and content during the document
   * ingestion process.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration)
   * @param customDocumentEnrichmentConfiguration Configuration information for altering document
   * metadata and content during the document ingestion process. 
   */
  public
      fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: IResolvable) {
    cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration)
  }

  /**
   * Configuration information for altering document metadata and content during the document
   * ingestion process.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration)
   * @param customDocumentEnrichmentConfiguration Configuration information for altering document
   * metadata and content during the document ingestion process. 
   */
  public
      fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty) {
    cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration)
  }

  /**
   * Configuration information for an Amazon Kendra data source.
   *
   * The contents of the configuration depend on the type of data source. You can only specify one
   * type of data source in the configuration.
   *
   * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM` .
   *
   * The `Configuration` parameter is required for all other data sources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-datasourceconfiguration)
   * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source. 
   */
  public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
    cdkBuilder.dataSourceConfiguration(dataSourceConfiguration)
  }

  /**
   * Configuration information for an Amazon Kendra data source.
   *
   * The contents of the configuration depend on the type of data source. You can only specify one
   * type of data source in the configuration.
   *
   * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM` .
   *
   * The `Configuration` parameter is required for all other data sources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-datasourceconfiguration)
   * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source. 
   */
  public
      fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty) {
    cdkBuilder.dataSourceConfiguration(dataSourceConfiguration)
  }

  /**
   * A description for the data source connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-description)
   * @param description A description for the data source connector. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The identifier of the index you want to use with the data source connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-indexid)
   * @param indexId The identifier of the index you want to use with the data source connector. 
   */
  public fun indexId(indexId: String) {
    cdkBuilder.indexId(indexId)
  }

  /**
   * The name of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-name)
   * @param name The name of the data source. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The Amazon Resource Name (ARN) of a role with permission to access the data source.
   *
   * You can't specify the `RoleArn` parameter when the `Type` parameter is set to `CUSTOM` .
   *
   * The `RoleArn` parameter is required for all other data sources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-rolearn)
   * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the data
   * source. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * Sets the frequency that Amazon Kendra checks the documents in your data source and updates the
   * index.
   *
   * If you don't set a schedule, Amazon Kendra doesn't periodically update the index.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-schedule)
   * @param schedule Sets the frequency that Amazon Kendra checks the documents in your data source
   * and updates the index. 
   */
  public fun schedule(schedule: String) {
    cdkBuilder.schedule(schedule)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The type of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-type)
   * @param type The type of the data source. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDataSource {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
