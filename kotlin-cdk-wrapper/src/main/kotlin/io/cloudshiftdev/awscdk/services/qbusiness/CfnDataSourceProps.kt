@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDataSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * Object configuration;
 * CfnDataSourceProps cfnDataSourceProps = CfnDataSourceProps.builder()
 * .applicationId("applicationId")
 * .configuration(configuration)
 * .displayName("displayName")
 * .indexId("indexId")
 * // the properties below are optional
 * .description("description")
 * .documentEnrichmentConfiguration(DocumentEnrichmentConfigurationProperty.builder()
 * .inlineConfigurations(List.of(InlineDocumentEnrichmentConfigurationProperty.builder()
 * .condition(DocumentAttributeConditionProperty.builder()
 * .key("key")
 * .operator("operator")
 * // the properties below are optional
 * .value(DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build())
 * .build())
 * .documentContentOperator("documentContentOperator")
 * .target(DocumentAttributeTargetProperty.builder()
 * .key("key")
 * // the properties below are optional
 * .attributeValueOperator("attributeValueOperator")
 * .value(DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build())
 * .build())
 * .build()))
 * .postExtractionHookConfiguration(HookConfigurationProperty.builder()
 * .invocationCondition(DocumentAttributeConditionProperty.builder()
 * .key("key")
 * .operator("operator")
 * // the properties below are optional
 * .value(DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build())
 * .build())
 * .lambdaArn("lambdaArn")
 * .roleArn("roleArn")
 * .s3BucketName("s3BucketName")
 * .build())
 * .preExtractionHookConfiguration(HookConfigurationProperty.builder()
 * .invocationCondition(DocumentAttributeConditionProperty.builder()
 * .key("key")
 * .operator("operator")
 * // the properties below are optional
 * .value(DocumentAttributeValueProperty.builder()
 * .dateValue("dateValue")
 * .longValue(123)
 * .stringListValue(List.of("stringListValue"))
 * .stringValue("stringValue")
 * .build())
 * .build())
 * .lambdaArn("lambdaArn")
 * .roleArn("roleArn")
 * .s3BucketName("s3BucketName")
 * .build())
 * .build())
 * .roleArn("roleArn")
 * .syncSchedule("syncSchedule")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcConfiguration(DataSourceVpcConfigurationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html)
 */
public interface CfnDataSourceProps {
  /**
   * The identifier of the Amazon Q Business application the data source will be attached to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-applicationid)
   */
  public fun applicationId(): String

  /**
   * Use this property to specify a JSON or YAML schema with configuration properties specific to
   * your data source connector to connect your data source repository to Amazon Q Business .
   *
   * You must use the JSON or YAML schema provided by Amazon Q .
   *
   * The following links have the configuration properties and schemas for AWS CloudFormation for
   * the following connectors:
   *
   * * [Amazon Simple Storage
   * Service](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/s3-cfn.html)
   * * [Amazon Q Web
   * Crawler](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/web-crawler-cfn.html)
   *
   * Similarly, you can find configuration templates and properties for your specific data source
   * using the following steps:
   *
   * * Navigate to the [Supported
   * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connectors-list.html) page
   * in the Amazon Q Business User Guide, and select the data source connector of your choice.
   * * Then, from that specific data source connector's page, choose the topic containing *Using AWS
   * CloudFormation* to find the schemas for your data source connector, including configuration
   * parameter descriptions and examples.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-configuration)
   */
  public fun configuration(): Any

  /**
   * A description for the data source connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the Amazon Q Business data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-displayname)
   */
  public fun displayName(): String

  /**
   * Provides the configuration information for altering document metadata and content during the
   * document ingestion process.
   *
   * For more information, see [Custom document
   * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-documentenrichmentconfiguration)
   */
  public fun documentEnrichmentConfiguration(): Any? =
      unwrap(this).getDocumentEnrichmentConfiguration()

  /**
   * The identifier of the index the data source is attached to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-indexid)
   */
  public fun indexId(): String

  /**
   * The Amazon Resource Name (ARN) of an IAM role with permission to access the data source and
   * required resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * Sets the frequency for Amazon Q Business to check the documents in your data source repository
   * and update your index.
   *
   * If you don't set a schedule, Amazon Q Business won't periodically update the index.
   *
   * Specify a `cron-` format schedule string or an empty string to indicate that the index is
   * updated on demand. You can't specify the `Schedule` parameter when the `Type` parameter is set to
   * `CUSTOM` . If you do, you receive a `ValidationException` exception.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-syncschedule)
   */
  public fun syncSchedule(): String? = unwrap(this).getSyncSchedule()

  /**
   * A list of key-value pairs that identify or categorize the data source connector.
   *
   * You can also use tags to help control access to the data source connector. Tag keys and values
   * can consist of Unicode letters, digits, white space, and any of the following symbols: _ . : /
   * = + -
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data
   * source.
   *
   * For more information, see [Using Amazon VPC with Amazon Q Business
   * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connector-vpc.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-vpcconfiguration)
   */
  public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

  /**
   * A builder for [CfnDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The identifier of the Amazon Q Business application the data source will
     * be attached to. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param configuration Use this property to specify a JSON or YAML schema with configuration
     * properties specific to your data source connector to connect your data source repository to
     * Amazon Q Business . 
     * You must use the JSON or YAML schema provided by Amazon Q .
     *
     * The following links have the configuration properties and schemas for AWS CloudFormation for
     * the following connectors:
     *
     * * [Amazon Simple Storage
     * Service](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/s3-cfn.html)
     * * [Amazon Q Web
     * Crawler](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/web-crawler-cfn.html)
     *
     * Similarly, you can find configuration templates and properties for your specific data source
     * using the following steps:
     *
     * * Navigate to the [Supported
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connectors-list.html)
     * page in the Amazon Q Business User Guide, and select the data source connector of your choice.
     * * Then, from that specific data source connector's page, choose the topic containing *Using
     * AWS CloudFormation* to find the schemas for your data source connector, including configuration
     * parameter descriptions and examples.
     */
    public fun configuration(configuration: Any)

    /**
     * @param description A description for the data source connector.
     */
    public fun description(description: String)

    /**
     * @param displayName The name of the Amazon Q Business data source. 
     */
    public fun displayName(displayName: String)

    /**
     * @param documentEnrichmentConfiguration Provides the configuration information for altering
     * document metadata and content during the document ingestion process.
     * For more information, see [Custom document
     * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
     * .
     */
    public fun documentEnrichmentConfiguration(documentEnrichmentConfiguration: IResolvable)

    /**
     * @param documentEnrichmentConfiguration Provides the configuration information for altering
     * document metadata and content during the document ingestion process.
     * For more information, see [Custom document
     * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
     * .
     */
    public
        fun documentEnrichmentConfiguration(documentEnrichmentConfiguration: CfnDataSource.DocumentEnrichmentConfigurationProperty)

    /**
     * @param documentEnrichmentConfiguration Provides the configuration information for altering
     * document metadata and content during the document ingestion process.
     * For more information, see [Custom document
     * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c5541a14db9a3008c2683e26d3627fb9ffcadd30de9b5b3c5b78824fa815839")
    public
        fun documentEnrichmentConfiguration(documentEnrichmentConfiguration: CfnDataSource.DocumentEnrichmentConfigurationProperty.Builder.() -> Unit)

    /**
     * @param indexId The identifier of the index the data source is attached to. 
     */
    public fun indexId(indexId: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role with permission to access the
     * data source and required resources.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param syncSchedule Sets the frequency for Amazon Q Business to check the documents in your
     * data source repository and update your index.
     * If you don't set a schedule, Amazon Q Business won't periodically update the index.
     *
     * Specify a `cron-` format schedule string or an empty string to indicate that the index is
     * updated on demand. You can't specify the `Schedule` parameter when the `Type` parameter is set
     * to `CUSTOM` . If you do, you receive a `ValidationException` exception.
     */
    public fun syncSchedule(syncSchedule: String)

    /**
     * @param tags A list of key-value pairs that identify or categorize the data source connector.
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs that identify or categorize the data source connector.
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcConfiguration Configuration information for an Amazon VPC (Virtual Private Cloud)
     * to connect to your data source.
     * For more information, see [Using Amazon VPC with Amazon Q Business
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connector-vpc.html) .
     */
    public fun vpcConfiguration(vpcConfiguration: IResolvable)

    /**
     * @param vpcConfiguration Configuration information for an Amazon VPC (Virtual Private Cloud)
     * to connect to your data source.
     * For more information, see [Using Amazon VPC with Amazon Q Business
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connector-vpc.html) .
     */
    public fun vpcConfiguration(vpcConfiguration: CfnDataSource.DataSourceVpcConfigurationProperty)

    /**
     * @param vpcConfiguration Configuration information for an Amazon VPC (Virtual Private Cloud)
     * to connect to your data source.
     * For more information, see [Using Amazon VPC with Amazon Q Business
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connector-vpc.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9ba23994f5e2719357cd44b65919097b0f3cd22446351aab04f7e7cdf372750")
    public
        fun vpcConfiguration(vpcConfiguration: CfnDataSource.DataSourceVpcConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnDataSourceProps.Builder =
        software.amazon.awscdk.services.qbusiness.CfnDataSourceProps.builder()

    /**
     * @param applicationId The identifier of the Amazon Q Business application the data source will
     * be attached to. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param configuration Use this property to specify a JSON or YAML schema with configuration
     * properties specific to your data source connector to connect your data source repository to
     * Amazon Q Business . 
     * You must use the JSON or YAML schema provided by Amazon Q .
     *
     * The following links have the configuration properties and schemas for AWS CloudFormation for
     * the following connectors:
     *
     * * [Amazon Simple Storage
     * Service](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/s3-cfn.html)
     * * [Amazon Q Web
     * Crawler](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/web-crawler-cfn.html)
     *
     * Similarly, you can find configuration templates and properties for your specific data source
     * using the following steps:
     *
     * * Navigate to the [Supported
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connectors-list.html)
     * page in the Amazon Q Business User Guide, and select the data source connector of your choice.
     * * Then, from that specific data source connector's page, choose the topic containing *Using
     * AWS CloudFormation* to find the schemas for your data source connector, including configuration
     * parameter descriptions and examples.
     */
    override fun configuration(configuration: Any) {
      cdkBuilder.configuration(configuration)
    }

    /**
     * @param description A description for the data source connector.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param displayName The name of the Amazon Q Business data source. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param documentEnrichmentConfiguration Provides the configuration information for altering
     * document metadata and content during the document ingestion process.
     * For more information, see [Custom document
     * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
     * .
     */
    override fun documentEnrichmentConfiguration(documentEnrichmentConfiguration: IResolvable) {
      cdkBuilder.documentEnrichmentConfiguration(documentEnrichmentConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param documentEnrichmentConfiguration Provides the configuration information for altering
     * document metadata and content during the document ingestion process.
     * For more information, see [Custom document
     * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
     * .
     */
    override
        fun documentEnrichmentConfiguration(documentEnrichmentConfiguration: CfnDataSource.DocumentEnrichmentConfigurationProperty) {
      cdkBuilder.documentEnrichmentConfiguration(documentEnrichmentConfiguration.let(CfnDataSource.DocumentEnrichmentConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param documentEnrichmentConfiguration Provides the configuration information for altering
     * document metadata and content during the document ingestion process.
     * For more information, see [Custom document
     * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c5541a14db9a3008c2683e26d3627fb9ffcadd30de9b5b3c5b78824fa815839")
    override
        fun documentEnrichmentConfiguration(documentEnrichmentConfiguration: CfnDataSource.DocumentEnrichmentConfigurationProperty.Builder.() -> Unit):
        Unit =
        documentEnrichmentConfiguration(CfnDataSource.DocumentEnrichmentConfigurationProperty(documentEnrichmentConfiguration))

    /**
     * @param indexId The identifier of the index the data source is attached to. 
     */
    override fun indexId(indexId: String) {
      cdkBuilder.indexId(indexId)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role with permission to access the
     * data source and required resources.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param syncSchedule Sets the frequency for Amazon Q Business to check the documents in your
     * data source repository and update your index.
     * If you don't set a schedule, Amazon Q Business won't periodically update the index.
     *
     * Specify a `cron-` format schedule string or an empty string to indicate that the index is
     * updated on demand. You can't specify the `Schedule` parameter when the `Type` parameter is set
     * to `CUSTOM` . If you do, you receive a `ValidationException` exception.
     */
    override fun syncSchedule(syncSchedule: String) {
      cdkBuilder.syncSchedule(syncSchedule)
    }

    /**
     * @param tags A list of key-value pairs that identify or categorize the data source connector.
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of key-value pairs that identify or categorize the data source connector.
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcConfiguration Configuration information for an Amazon VPC (Virtual Private Cloud)
     * to connect to your data source.
     * For more information, see [Using Amazon VPC with Amazon Q Business
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connector-vpc.html) .
     */
    override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcConfiguration Configuration information for an Amazon VPC (Virtual Private Cloud)
     * to connect to your data source.
     * For more information, see [Using Amazon VPC with Amazon Q Business
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connector-vpc.html) .
     */
    override
        fun vpcConfiguration(vpcConfiguration: CfnDataSource.DataSourceVpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(CfnDataSource.DataSourceVpcConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param vpcConfiguration Configuration information for an Amazon VPC (Virtual Private Cloud)
     * to connect to your data source.
     * For more information, see [Using Amazon VPC with Amazon Q Business
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connector-vpc.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9ba23994f5e2719357cd44b65919097b0f3cd22446351aab04f7e7cdf372750")
    override
        fun vpcConfiguration(vpcConfiguration: CfnDataSource.DataSourceVpcConfigurationProperty.Builder.() -> Unit):
        Unit = vpcConfiguration(CfnDataSource.DataSourceVpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSourceProps,
  ) : CdkObject(cdkObject),
      CfnDataSourceProps {
    /**
     * The identifier of the Amazon Q Business application the data source will be attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * Use this property to specify a JSON or YAML schema with configuration properties specific to
     * your data source connector to connect your data source repository to Amazon Q Business .
     *
     * You must use the JSON or YAML schema provided by Amazon Q .
     *
     * The following links have the configuration properties and schemas for AWS CloudFormation for
     * the following connectors:
     *
     * * [Amazon Simple Storage
     * Service](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/s3-cfn.html)
     * * [Amazon Q Web
     * Crawler](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/web-crawler-cfn.html)
     *
     * Similarly, you can find configuration templates and properties for your specific data source
     * using the following steps:
     *
     * * Navigate to the [Supported
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connectors-list.html)
     * page in the Amazon Q Business User Guide, and select the data source connector of your choice.
     * * Then, from that specific data source connector's page, choose the topic containing *Using
     * AWS CloudFormation* to find the schemas for your data source connector, including configuration
     * parameter descriptions and examples.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-configuration)
     */
    override fun configuration(): Any = unwrap(this).getConfiguration()

    /**
     * A description for the data source connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the Amazon Q Business data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * Provides the configuration information for altering document metadata and content during the
     * document ingestion process.
     *
     * For more information, see [Custom document
     * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-documentenrichmentconfiguration)
     */
    override fun documentEnrichmentConfiguration(): Any? =
        unwrap(this).getDocumentEnrichmentConfiguration()

    /**
     * The identifier of the index the data source is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-indexid)
     */
    override fun indexId(): String = unwrap(this).getIndexId()

    /**
     * The Amazon Resource Name (ARN) of an IAM role with permission to access the data source and
     * required resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * Sets the frequency for Amazon Q Business to check the documents in your data source
     * repository and update your index.
     *
     * If you don't set a schedule, Amazon Q Business won't periodically update the index.
     *
     * Specify a `cron-` format schedule string or an empty string to indicate that the index is
     * updated on demand. You can't specify the `Schedule` parameter when the `Type` parameter is set
     * to `CUSTOM` . If you do, you receive a `ValidationException` exception.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-syncschedule)
     */
    override fun syncSchedule(): String? = unwrap(this).getSyncSchedule()

    /**
     * A list of key-value pairs that identify or categorize the data source connector.
     *
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data
     * source.
     *
     * For more information, see [Using Amazon VPC with Amazon Q Business
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connector-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-vpcconfiguration)
     */
    override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSourceProps):
        CfnDataSourceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDataSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataSourceProps):
        software.amazon.awscdk.services.qbusiness.CfnDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.qbusiness.CfnDataSourceProps
  }
}
