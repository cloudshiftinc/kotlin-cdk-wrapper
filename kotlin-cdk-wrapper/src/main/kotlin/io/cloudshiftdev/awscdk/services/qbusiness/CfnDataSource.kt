@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a data source connector for an Amazon Q Business application.
 *
 * `CreateDataSource` is a synchronous operation. The operation returns 200 if the data source was
 * successfully created. Otherwise, an exception is raised.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * Object configuration;
 * CfnDataSource cfnDataSource = CfnDataSource.Builder.create(this, "MyCfnDataSource")
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
 * .mediaExtractionConfiguration(MediaExtractionConfigurationProperty.builder()
 * .audioExtractionConfiguration(AudioExtractionConfigurationProperty.builder()
 * .audioExtractionStatus("audioExtractionStatus")
 * .build())
 * .imageExtractionConfiguration(ImageExtractionConfigurationProperty.builder()
 * .imageExtractionStatus("imageExtractionStatus")
 * .build())
 * .videoExtractionConfiguration(VideoExtractionConfigurationProperty.builder()
 * .videoExtractionStatus("videoExtractionStatus")
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
public open class CfnDataSource(
  cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataSourceProps,
  ) :
      this(software.amazon.awscdk.services.qbusiness.CfnDataSource(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDataSourceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDataSourceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDataSourceProps(props)
  )

  /**
   * The identifier of the Amazon Q Business application the data source will be attached to.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The identifier of the Amazon Q Business application the data source will be attached to.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * The Unix timestamp when the Amazon Q Business data source was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon Resource Name (ARN) of a data source in an Amazon Q Business application.
   */
  public open fun attrDataSourceArn(): String = unwrap(this).getAttrDataSourceArn()

  /**
   * The identifier of the Amazon Q Business data source.
   */
  public open fun attrDataSourceId(): String = unwrap(this).getAttrDataSourceId()

  /**
   * The status of the Amazon Q Business data source.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The type of the Amazon Q Business data source.
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   * The Unix timestamp when the Amazon Q Business data source was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Use this property to specify a JSON or YAML schema with configuration properties specific to
   * your data source connector to connect your data source repository to Amazon Q Business .
   */
  public open fun configuration(): Any = unwrap(this).getConfiguration()

  /**
   * Use this property to specify a JSON or YAML schema with configuration properties specific to
   * your data source connector to connect your data source repository to Amazon Q Business .
   */
  public open fun configuration(`value`: Any) {
    unwrap(this).setConfiguration(`value`)
  }

  /**
   * A description for the data source connector.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the data source connector.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name of the Amazon Q Business data source.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * The name of the Amazon Q Business data source.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * Provides the configuration information for altering document metadata and content during the
   * document ingestion process.
   */
  public open fun documentEnrichmentConfiguration(): Any? =
      unwrap(this).getDocumentEnrichmentConfiguration()

  /**
   * Provides the configuration information for altering document metadata and content during the
   * document ingestion process.
   */
  public open fun documentEnrichmentConfiguration(`value`: IResolvable) {
    unwrap(this).setDocumentEnrichmentConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Provides the configuration information for altering document metadata and content during the
   * document ingestion process.
   */
  public open
      fun documentEnrichmentConfiguration(`value`: DocumentEnrichmentConfigurationProperty) {
    unwrap(this).setDocumentEnrichmentConfiguration(`value`.let(DocumentEnrichmentConfigurationProperty.Companion::unwrap))
  }

  /**
   * Provides the configuration information for altering document metadata and content during the
   * document ingestion process.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ef9d86bcefeecb14dc7166a20854235ee6135320be1c51e16dec6a3cbccfd26e")
  public open
      fun documentEnrichmentConfiguration(`value`: DocumentEnrichmentConfigurationProperty.Builder.() -> Unit):
      Unit = documentEnrichmentConfiguration(DocumentEnrichmentConfigurationProperty(`value`))

  /**
   * The identifier of the index the data source is attached to.
   */
  public open fun indexId(): String = unwrap(this).getIndexId()

  /**
   * The identifier of the index the data source is attached to.
   */
  public open fun indexId(`value`: String) {
    unwrap(this).setIndexId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The configuration for extracting information from media in documents.
   */
  public open fun mediaExtractionConfiguration(): Any? =
      unwrap(this).getMediaExtractionConfiguration()

  /**
   * The configuration for extracting information from media in documents.
   */
  public open fun mediaExtractionConfiguration(`value`: IResolvable) {
    unwrap(this).setMediaExtractionConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration for extracting information from media in documents.
   */
  public open fun mediaExtractionConfiguration(`value`: MediaExtractionConfigurationProperty) {
    unwrap(this).setMediaExtractionConfiguration(`value`.let(MediaExtractionConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration for extracting information from media in documents.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("db6ff4af79c179ead6a681a2d85c486708bfd0b3c627d46804a7f8892f501ec4")
  public open
      fun mediaExtractionConfiguration(`value`: MediaExtractionConfigurationProperty.Builder.() -> Unit):
      Unit = mediaExtractionConfiguration(MediaExtractionConfigurationProperty(`value`))

  /**
   * The Amazon Resource Name (ARN) of an IAM role with permission to access the data source and
   * required resources.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of an IAM role with permission to access the data source and
   * required resources.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Sets the frequency for Amazon Q Business to check the documents in your data source repository
   * and update your index.
   */
  public open fun syncSchedule(): String? = unwrap(this).getSyncSchedule()

  /**
   * Sets the frequency for Amazon Q Business to check the documents in your data source repository
   * and update your index.
   */
  public open fun syncSchedule(`value`: String) {
    unwrap(this).setSyncSchedule(`value`)
  }

  /**
   * A list of key-value pairs that identify or categorize the data source connector.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of key-value pairs that identify or categorize the data source connector.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of key-value pairs that identify or categorize the data source connector.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data
   * source.
   */
  public open fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

  /**
   * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data
   * source.
   */
  public open fun vpcConfiguration(`value`: IResolvable) {
    unwrap(this).setVpcConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data
   * source.
   */
  public open fun vpcConfiguration(`value`: DataSourceVpcConfigurationProperty) {
    unwrap(this).setVpcConfiguration(`value`.let(DataSourceVpcConfigurationProperty.Companion::unwrap))
  }

  /**
   * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data
   * source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6d72be28332741604810b52b6c958365435a3b8f1dce0dac7f4fd0aaf2bdec5a")
  public open fun vpcConfiguration(`value`: DataSourceVpcConfigurationProperty.Builder.() -> Unit):
      Unit = vpcConfiguration(DataSourceVpcConfigurationProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.qbusiness.CfnDataSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the Amazon Q Business application the data source will be attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-applicationid)
     * @param applicationId The identifier of the Amazon Q Business application the data source will
     * be attached to. 
     */
    public fun applicationId(applicationId: String)

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
     * @param configuration Use this property to specify a JSON or YAML schema with configuration
     * properties specific to your data source connector to connect your data source repository to
     * Amazon Q Business . 
     */
    public fun configuration(configuration: Any)

    /**
     * A description for the data source connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-description)
     * @param description A description for the data source connector. 
     */
    public fun description(description: String)

    /**
     * The name of the Amazon Q Business data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-displayname)
     * @param displayName The name of the Amazon Q Business data source. 
     */
    public fun displayName(displayName: String)

    /**
     * Provides the configuration information for altering document metadata and content during the
     * document ingestion process.
     *
     * For more information, see [Custom document
     * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-documentenrichmentconfiguration)
     * @param documentEnrichmentConfiguration Provides the configuration information for altering
     * document metadata and content during the document ingestion process. 
     */
    public fun documentEnrichmentConfiguration(documentEnrichmentConfiguration: IResolvable)

    /**
     * Provides the configuration information for altering document metadata and content during the
     * document ingestion process.
     *
     * For more information, see [Custom document
     * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-documentenrichmentconfiguration)
     * @param documentEnrichmentConfiguration Provides the configuration information for altering
     * document metadata and content during the document ingestion process. 
     */
    public
        fun documentEnrichmentConfiguration(documentEnrichmentConfiguration: DocumentEnrichmentConfigurationProperty)

    /**
     * Provides the configuration information for altering document metadata and content during the
     * document ingestion process.
     *
     * For more information, see [Custom document
     * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-documentenrichmentconfiguration)
     * @param documentEnrichmentConfiguration Provides the configuration information for altering
     * document metadata and content during the document ingestion process. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e82403469cd87311f8ffd5ba6d8042aea7ced7bde7c9d4d8c2875d34b320ff25")
    public
        fun documentEnrichmentConfiguration(documentEnrichmentConfiguration: DocumentEnrichmentConfigurationProperty.Builder.() -> Unit)

    /**
     * The identifier of the index the data source is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-indexid)
     * @param indexId The identifier of the index the data source is attached to. 
     */
    public fun indexId(indexId: String)

    /**
     * The configuration for extracting information from media in documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-mediaextractionconfiguration)
     * @param mediaExtractionConfiguration The configuration for extracting information from media
     * in documents. 
     */
    public fun mediaExtractionConfiguration(mediaExtractionConfiguration: IResolvable)

    /**
     * The configuration for extracting information from media in documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-mediaextractionconfiguration)
     * @param mediaExtractionConfiguration The configuration for extracting information from media
     * in documents. 
     */
    public
        fun mediaExtractionConfiguration(mediaExtractionConfiguration: MediaExtractionConfigurationProperty)

    /**
     * The configuration for extracting information from media in documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-mediaextractionconfiguration)
     * @param mediaExtractionConfiguration The configuration for extracting information from media
     * in documents. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adc100552d422aacc658e91e2258a06e0cc228af87cac8daa5105047e02a1aca")
    public
        fun mediaExtractionConfiguration(mediaExtractionConfiguration: MediaExtractionConfigurationProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of an IAM role with permission to access the data source and
     * required resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role with permission to access the
     * data source and required resources. 
     */
    public fun roleArn(roleArn: String)

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
     * @param syncSchedule Sets the frequency for Amazon Q Business to check the documents in your
     * data source repository and update your index. 
     */
    public fun syncSchedule(syncSchedule: String)

    /**
     * A list of key-value pairs that identify or categorize the data source connector.
     *
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-tags)
     * @param tags A list of key-value pairs that identify or categorize the data source connector. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs that identify or categorize the data source connector.
     *
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-tags)
     * @param tags A list of key-value pairs that identify or categorize the data source connector. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data
     * source.
     *
     * For more information, see [Using Amazon VPC with Amazon Q Business
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connector-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-vpcconfiguration)
     * @param vpcConfiguration Configuration information for an Amazon VPC (Virtual Private Cloud)
     * to connect to your data source. 
     */
    public fun vpcConfiguration(vpcConfiguration: IResolvable)

    /**
     * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data
     * source.
     *
     * For more information, see [Using Amazon VPC with Amazon Q Business
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connector-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-vpcconfiguration)
     * @param vpcConfiguration Configuration information for an Amazon VPC (Virtual Private Cloud)
     * to connect to your data source. 
     */
    public fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty)

    /**
     * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data
     * source.
     *
     * For more information, see [Using Amazon VPC with Amazon Q Business
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connector-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-vpcconfiguration)
     * @param vpcConfiguration Configuration information for an Amazon VPC (Virtual Private Cloud)
     * to connect to your data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6aeb0d4de6d73f135c89cdbdc2bbbfa88c1dc31c10f7876e48a530c6c580acb6")
    public
        fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnDataSource.Builder =
        software.amazon.awscdk.services.qbusiness.CfnDataSource.Builder.create(scope, id)

    /**
     * The identifier of the Amazon Q Business application the data source will be attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-applicationid)
     * @param applicationId The identifier of the Amazon Q Business application the data source will
     * be attached to. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

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
     * @param configuration Use this property to specify a JSON or YAML schema with configuration
     * properties specific to your data source connector to connect your data source repository to
     * Amazon Q Business . 
     */
    override fun configuration(configuration: Any) {
      cdkBuilder.configuration(configuration)
    }

    /**
     * A description for the data source connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-description)
     * @param description A description for the data source connector. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the Amazon Q Business data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-displayname)
     * @param displayName The name of the Amazon Q Business data source. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * Provides the configuration information for altering document metadata and content during the
     * document ingestion process.
     *
     * For more information, see [Custom document
     * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-documentenrichmentconfiguration)
     * @param documentEnrichmentConfiguration Provides the configuration information for altering
     * document metadata and content during the document ingestion process. 
     */
    override fun documentEnrichmentConfiguration(documentEnrichmentConfiguration: IResolvable) {
      cdkBuilder.documentEnrichmentConfiguration(documentEnrichmentConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Provides the configuration information for altering document metadata and content during the
     * document ingestion process.
     *
     * For more information, see [Custom document
     * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-documentenrichmentconfiguration)
     * @param documentEnrichmentConfiguration Provides the configuration information for altering
     * document metadata and content during the document ingestion process. 
     */
    override
        fun documentEnrichmentConfiguration(documentEnrichmentConfiguration: DocumentEnrichmentConfigurationProperty) {
      cdkBuilder.documentEnrichmentConfiguration(documentEnrichmentConfiguration.let(DocumentEnrichmentConfigurationProperty.Companion::unwrap))
    }

    /**
     * Provides the configuration information for altering document metadata and content during the
     * document ingestion process.
     *
     * For more information, see [Custom document
     * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-documentenrichmentconfiguration)
     * @param documentEnrichmentConfiguration Provides the configuration information for altering
     * document metadata and content during the document ingestion process. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e82403469cd87311f8ffd5ba6d8042aea7ced7bde7c9d4d8c2875d34b320ff25")
    override
        fun documentEnrichmentConfiguration(documentEnrichmentConfiguration: DocumentEnrichmentConfigurationProperty.Builder.() -> Unit):
        Unit =
        documentEnrichmentConfiguration(DocumentEnrichmentConfigurationProperty(documentEnrichmentConfiguration))

    /**
     * The identifier of the index the data source is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-indexid)
     * @param indexId The identifier of the index the data source is attached to. 
     */
    override fun indexId(indexId: String) {
      cdkBuilder.indexId(indexId)
    }

    /**
     * The configuration for extracting information from media in documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-mediaextractionconfiguration)
     * @param mediaExtractionConfiguration The configuration for extracting information from media
     * in documents. 
     */
    override fun mediaExtractionConfiguration(mediaExtractionConfiguration: IResolvable) {
      cdkBuilder.mediaExtractionConfiguration(mediaExtractionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration for extracting information from media in documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-mediaextractionconfiguration)
     * @param mediaExtractionConfiguration The configuration for extracting information from media
     * in documents. 
     */
    override
        fun mediaExtractionConfiguration(mediaExtractionConfiguration: MediaExtractionConfigurationProperty) {
      cdkBuilder.mediaExtractionConfiguration(mediaExtractionConfiguration.let(MediaExtractionConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration for extracting information from media in documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-mediaextractionconfiguration)
     * @param mediaExtractionConfiguration The configuration for extracting information from media
     * in documents. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adc100552d422aacc658e91e2258a06e0cc228af87cac8daa5105047e02a1aca")
    override
        fun mediaExtractionConfiguration(mediaExtractionConfiguration: MediaExtractionConfigurationProperty.Builder.() -> Unit):
        Unit =
        mediaExtractionConfiguration(MediaExtractionConfigurationProperty(mediaExtractionConfiguration))

    /**
     * The Amazon Resource Name (ARN) of an IAM role with permission to access the data source and
     * required resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role with permission to access the
     * data source and required resources. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

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
     * @param syncSchedule Sets the frequency for Amazon Q Business to check the documents in your
     * data source repository and update your index. 
     */
    override fun syncSchedule(syncSchedule: String) {
      cdkBuilder.syncSchedule(syncSchedule)
    }

    /**
     * A list of key-value pairs that identify or categorize the data source connector.
     *
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-tags)
     * @param tags A list of key-value pairs that identify or categorize the data source connector. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of key-value pairs that identify or categorize the data source connector.
     *
     * You can also use tags to help control access to the data source connector. Tag keys and
     * values can consist of Unicode letters, digits, white space, and any of the following symbols: _
     * . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-tags)
     * @param tags A list of key-value pairs that identify or categorize the data source connector. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data
     * source.
     *
     * For more information, see [Using Amazon VPC with Amazon Q Business
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connector-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-vpcconfiguration)
     * @param vpcConfiguration Configuration information for an Amazon VPC (Virtual Private Cloud)
     * to connect to your data source. 
     */
    override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data
     * source.
     *
     * For more information, see [Using Amazon VPC with Amazon Q Business
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connector-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-vpcconfiguration)
     * @param vpcConfiguration Configuration information for an Amazon VPC (Virtual Private Cloud)
     * to connect to your data source. 
     */
    override fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(DataSourceVpcConfigurationProperty.Companion::unwrap))
    }

    /**
     * Configuration information for an Amazon VPC (Virtual Private Cloud) to connect to your data
     * source.
     *
     * For more information, see [Using Amazon VPC with Amazon Q Business
     * connectors](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/connector-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-datasource.html#cfn-qbusiness-datasource-vpcconfiguration)
     * @param vpcConfiguration Configuration information for an Amazon VPC (Virtual Private Cloud)
     * to connect to your data source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6aeb0d4de6d73f135c89cdbdc2bbbfa88c1dc31c10f7876e48a530c6c580acb6")
    override
        fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty.Builder.() -> Unit):
        Unit = vpcConfiguration(DataSourceVpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnDataSource = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.qbusiness.CfnDataSource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource):
        CfnDataSource = CfnDataSource(cdkObject)

    internal fun unwrap(wrapped: CfnDataSource):
        software.amazon.awscdk.services.qbusiness.CfnDataSource = wrapped.cdkObject as
        software.amazon.awscdk.services.qbusiness.CfnDataSource
  }

  /**
   * Configuration settings for audio content extraction and processing.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * AudioExtractionConfigurationProperty audioExtractionConfigurationProperty =
   * AudioExtractionConfigurationProperty.builder()
   * .audioExtractionStatus("audioExtractionStatus")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-audioextractionconfiguration.html)
   */
  public interface AudioExtractionConfigurationProperty {
    /**
     * The status of audio extraction (ENABLED or DISABLED) for processing audio content from files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-audioextractionconfiguration.html#cfn-qbusiness-datasource-audioextractionconfiguration-audioextractionstatus)
     */
    public fun audioExtractionStatus(): String

    /**
     * A builder for [AudioExtractionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param audioExtractionStatus The status of audio extraction (ENABLED or DISABLED) for
       * processing audio content from files. 
       */
      public fun audioExtractionStatus(audioExtractionStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataSource.AudioExtractionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataSource.AudioExtractionConfigurationProperty.builder()

      /**
       * @param audioExtractionStatus The status of audio extraction (ENABLED or DISABLED) for
       * processing audio content from files. 
       */
      override fun audioExtractionStatus(audioExtractionStatus: String) {
        cdkBuilder.audioExtractionStatus(audioExtractionStatus)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataSource.AudioExtractionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.AudioExtractionConfigurationProperty,
    ) : CdkObject(cdkObject),
        AudioExtractionConfigurationProperty {
      /**
       * The status of audio extraction (ENABLED or DISABLED) for processing audio content from
       * files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-audioextractionconfiguration.html#cfn-qbusiness-datasource-audioextractionconfiguration-audioextractionstatus)
       */
      override fun audioExtractionStatus(): String = unwrap(this).getAudioExtractionStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AudioExtractionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.AudioExtractionConfigurationProperty):
          AudioExtractionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AudioExtractionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AudioExtractionConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataSource.AudioExtractionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataSource.AudioExtractionConfigurationProperty
    }
  }

  /**
   * Provides configuration information needed to connect to an Amazon VPC (Virtual Private Cloud).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * DataSourceVpcConfigurationProperty dataSourceVpcConfigurationProperty =
   * DataSourceVpcConfigurationProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-datasourcevpcconfiguration.html)
   */
  public interface DataSourceVpcConfigurationProperty {
    /**
     * A list of identifiers of security groups within your Amazon VPC.
     *
     * The security groups should enable Amazon Q Business to connect to the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-datasourcevpcconfiguration.html#cfn-qbusiness-datasource-datasourcevpcconfiguration-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * A list of identifiers for subnets within your Amazon VPC.
     *
     * The subnets should be able to connect to each other in the VPC, and they should have outgoing
     * access to the Internet through a NAT device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-datasourcevpcconfiguration.html#cfn-qbusiness-datasource-datasourcevpcconfiguration-subnetids)
     */
    public fun subnetIds(): List<String>

    /**
     * A builder for [DataSourceVpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds A list of identifiers of security groups within your Amazon VPC. 
       * The security groups should enable Amazon Q Business to connect to the data source.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds A list of identifiers of security groups within your Amazon VPC. 
       * The security groups should enable Amazon Q Business to connect to the data source.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds A list of identifiers for subnets within your Amazon VPC. 
       * The subnets should be able to connect to each other in the VPC, and they should have
       * outgoing access to the Internet through a NAT device.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds A list of identifiers for subnets within your Amazon VPC. 
       * The subnets should be able to connect to each other in the VPC, and they should have
       * outgoing access to the Internet through a NAT device.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DataSourceVpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DataSourceVpcConfigurationProperty.builder()

      /**
       * @param securityGroupIds A list of identifiers of security groups within your Amazon VPC. 
       * The security groups should enable Amazon Q Business to connect to the data source.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds A list of identifiers of security groups within your Amazon VPC. 
       * The security groups should enable Amazon Q Business to connect to the data source.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds A list of identifiers for subnets within your Amazon VPC. 
       * The subnets should be able to connect to each other in the VPC, and they should have
       * outgoing access to the Internet through a NAT device.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds A list of identifiers for subnets within your Amazon VPC. 
       * The subnets should be able to connect to each other in the VPC, and they should have
       * outgoing access to the Internet through a NAT device.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DataSourceVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.DataSourceVpcConfigurationProperty,
    ) : CdkObject(cdkObject),
        DataSourceVpcConfigurationProperty {
      /**
       * A list of identifiers of security groups within your Amazon VPC.
       *
       * The security groups should enable Amazon Q Business to connect to the data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-datasourcevpcconfiguration.html#cfn-qbusiness-datasource-datasourcevpcconfiguration-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * A list of identifiers for subnets within your Amazon VPC.
       *
       * The subnets should be able to connect to each other in the VPC, and they should have
       * outgoing access to the Internet through a NAT device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-datasourcevpcconfiguration.html#cfn-qbusiness-datasource-datasourcevpcconfiguration-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataSourceVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.DataSourceVpcConfigurationProperty):
          DataSourceVpcConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataSourceVpcConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceVpcConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DataSourceVpcConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DataSourceVpcConfigurationProperty
    }
  }

  /**
   * The condition used for the target document attribute or metadata field when ingesting documents
   * into Amazon Q Business.
   *
   * You use this with
   * [`DocumentAttributeTarget`](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeTarget.html)
   * to apply the condition.
   *
   * For example, you can create the 'Department' target field and have it prefill department names
   * associated with the documents based on information in the 'Source_URI' field. Set the condition
   * that if the 'Source_URI' field contains 'financial' in its URI value, then prefill the target
   * field 'Department' with the target value 'Finance' for the document.
   *
   * Amazon Q Business can't create a target field if it has not already been created as an index
   * field. After you create your index field, you can create a document metadata field using
   * `DocumentAttributeTarget` . Amazon Q Business then will map your newly created metadata field to
   * your index field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * DocumentAttributeConditionProperty documentAttributeConditionProperty =
   * DocumentAttributeConditionProperty.builder()
   * .key("key")
   * .operator("operator")
   * // the properties below are optional
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributecondition.html)
   */
  public interface DocumentAttributeConditionProperty {
    /**
     * The identifier of the document attribute used for the condition.
     *
     * For example, 'Source_URI' could be an identifier for the attribute or metadata field that
     * contains source URIs associated with the documents.
     *
     * Amazon Q Business currently doesn't support `_document_body` as an attribute key used for the
     * condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributecondition.html#cfn-qbusiness-datasource-documentattributecondition-key)
     */
    public fun key(): String

    /**
     * The identifier of the document attribute used for the condition.
     *
     * For example, 'Source_URI' could be an identifier for the attribute or metadata field that
     * contains source URIs associated with the documents.
     *
     * Amazon Q Business currently does not support `_document_body` as an attribute key used for
     * the condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributecondition.html#cfn-qbusiness-datasource-documentattributecondition-operator)
     */
    public fun `operator`(): String

    /**
     * The value of a document attribute.
     *
     * You can only provide one value for a document attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributecondition.html#cfn-qbusiness-datasource-documentattributecondition-value)
     */
    public fun `value`(): Any? = unwrap(this).getValue()

    /**
     * A builder for [DocumentAttributeConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The identifier of the document attribute used for the condition. 
       * For example, 'Source_URI' could be an identifier for the attribute or metadata field that
       * contains source URIs associated with the documents.
       *
       * Amazon Q Business currently doesn't support `_document_body` as an attribute key used for
       * the condition.
       */
      public fun key(key: String)

      /**
       * @param operator The identifier of the document attribute used for the condition. 
       * For example, 'Source_URI' could be an identifier for the attribute or metadata field that
       * contains source URIs associated with the documents.
       *
       * Amazon Q Business currently does not support `_document_body` as an attribute key used for
       * the condition.
       */
      public fun `operator`(`operator`: String)

      /**
       * @param value The value of a document attribute.
       * You can only provide one value for a document attribute.
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The value of a document attribute.
       * You can only provide one value for a document attribute.
       */
      public fun `value`(`value`: DocumentAttributeValueProperty)

      /**
       * @param value The value of a document attribute.
       * You can only provide one value for a document attribute.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd570863727f33c25ccd2e6581b16b5e5f6d443afca8619d53d0114a851b8c86")
      public fun `value`(`value`: DocumentAttributeValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeConditionProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeConditionProperty.builder()

      /**
       * @param key The identifier of the document attribute used for the condition. 
       * For example, 'Source_URI' could be an identifier for the attribute or metadata field that
       * contains source URIs associated with the documents.
       *
       * Amazon Q Business currently doesn't support `_document_body` as an attribute key used for
       * the condition.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param operator The identifier of the document attribute used for the condition. 
       * For example, 'Source_URI' could be an identifier for the attribute or metadata field that
       * contains source URIs associated with the documents.
       *
       * Amazon Q Business currently does not support `_document_body` as an attribute key used for
       * the condition.
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param value The value of a document attribute.
       * You can only provide one value for a document attribute.
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param value The value of a document attribute.
       * You can only provide one value for a document attribute.
       */
      override fun `value`(`value`: DocumentAttributeValueProperty) {
        cdkBuilder.`value`(`value`.let(DocumentAttributeValueProperty.Companion::unwrap))
      }

      /**
       * @param value The value of a document attribute.
       * You can only provide one value for a document attribute.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fd570863727f33c25ccd2e6581b16b5e5f6d443afca8619d53d0114a851b8c86")
      override fun `value`(`value`: DocumentAttributeValueProperty.Builder.() -> Unit): Unit =
          `value`(DocumentAttributeValueProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeConditionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeConditionProperty,
    ) : CdkObject(cdkObject),
        DocumentAttributeConditionProperty {
      /**
       * The identifier of the document attribute used for the condition.
       *
       * For example, 'Source_URI' could be an identifier for the attribute or metadata field that
       * contains source URIs associated with the documents.
       *
       * Amazon Q Business currently doesn't support `_document_body` as an attribute key used for
       * the condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributecondition.html#cfn-qbusiness-datasource-documentattributecondition-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The identifier of the document attribute used for the condition.
       *
       * For example, 'Source_URI' could be an identifier for the attribute or metadata field that
       * contains source URIs associated with the documents.
       *
       * Amazon Q Business currently does not support `_document_body` as an attribute key used for
       * the condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributecondition.html#cfn-qbusiness-datasource-documentattributecondition-operator)
       */
      override fun `operator`(): String = unwrap(this).getOperator()

      /**
       * The value of a document attribute.
       *
       * You can only provide one value for a document attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributecondition.html#cfn-qbusiness-datasource-documentattributecondition-value)
       */
      override fun `value`(): Any? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentAttributeConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeConditionProperty):
          DocumentAttributeConditionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentAttributeConditionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentAttributeConditionProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeConditionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeConditionProperty
    }
  }

  /**
   * The target document attribute or metadata field you want to alter when ingesting documents into
   * Amazon Q Business.
   *
   * For example, you can delete all customer identification numbers associated with the documents,
   * stored in the document metadata field called 'Customer_ID' by setting the target key as
   * 'Customer_ID' and the deletion flag to `TRUE` . This removes all customer ID values in the field
   * 'Customer_ID'. This would scrub personally identifiable information from each document's metadata.
   *
   * Amazon Q Business can't create a target field if it has not already been created as an index
   * field. After you create your index field, you can create a document metadata field using
   * [`DocumentAttributeTarget`](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeTarget.html)
   * . Amazon Q Business will then map your newly created document attribute to your index field.
   *
   * You can also use this with
   * [`DocumentAttributeCondition`](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_DocumentAttributeCondition.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * DocumentAttributeTargetProperty documentAttributeTargetProperty =
   * DocumentAttributeTargetProperty.builder()
   * .key("key")
   * // the properties below are optional
   * .attributeValueOperator("attributeValueOperator")
   * .value(DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributetarget.html)
   */
  public interface DocumentAttributeTargetProperty {
    /**
     * `TRUE` to delete the existing target value for your specified target attribute key.
     *
     * You cannot create a target value and set this to `TRUE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributetarget.html#cfn-qbusiness-datasource-documentattributetarget-attributevalueoperator)
     */
    public fun attributeValueOperator(): String? = unwrap(this).getAttributeValueOperator()

    /**
     * The identifier of the target document attribute or metadata field.
     *
     * For example, 'Department' could be an identifier for the target attribute or metadata field
     * that includes the department names associated with the documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributetarget.html#cfn-qbusiness-datasource-documentattributetarget-key)
     */
    public fun key(): String

    /**
     * The value of a document attribute.
     *
     * You can only provide one value for a document attribute.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributetarget.html#cfn-qbusiness-datasource-documentattributetarget-value)
     */
    public fun `value`(): Any? = unwrap(this).getValue()

    /**
     * A builder for [DocumentAttributeTargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeValueOperator `TRUE` to delete the existing target value for your specified
       * target attribute key.
       * You cannot create a target value and set this to `TRUE` .
       */
      public fun attributeValueOperator(attributeValueOperator: String)

      /**
       * @param key The identifier of the target document attribute or metadata field. 
       * For example, 'Department' could be an identifier for the target attribute or metadata field
       * that includes the department names associated with the documents.
       */
      public fun key(key: String)

      /**
       * @param value The value of a document attribute.
       * You can only provide one value for a document attribute.
       */
      public fun `value`(`value`: IResolvable)

      /**
       * @param value The value of a document attribute.
       * You can only provide one value for a document attribute.
       */
      public fun `value`(`value`: DocumentAttributeValueProperty)

      /**
       * @param value The value of a document attribute.
       * You can only provide one value for a document attribute.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("860ab58d023d28630a55e31c799f50ced774b0c77e3d35c6523871711806f419")
      public fun `value`(`value`: DocumentAttributeValueProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeTargetProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeTargetProperty.builder()

      /**
       * @param attributeValueOperator `TRUE` to delete the existing target value for your specified
       * target attribute key.
       * You cannot create a target value and set this to `TRUE` .
       */
      override fun attributeValueOperator(attributeValueOperator: String) {
        cdkBuilder.attributeValueOperator(attributeValueOperator)
      }

      /**
       * @param key The identifier of the target document attribute or metadata field. 
       * For example, 'Department' could be an identifier for the target attribute or metadata field
       * that includes the department names associated with the documents.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value of a document attribute.
       * You can only provide one value for a document attribute.
       */
      override fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param value The value of a document attribute.
       * You can only provide one value for a document attribute.
       */
      override fun `value`(`value`: DocumentAttributeValueProperty) {
        cdkBuilder.`value`(`value`.let(DocumentAttributeValueProperty.Companion::unwrap))
      }

      /**
       * @param value The value of a document attribute.
       * You can only provide one value for a document attribute.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("860ab58d023d28630a55e31c799f50ced774b0c77e3d35c6523871711806f419")
      override fun `value`(`value`: DocumentAttributeValueProperty.Builder.() -> Unit): Unit =
          `value`(DocumentAttributeValueProperty(`value`))

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeTargetProperty,
    ) : CdkObject(cdkObject),
        DocumentAttributeTargetProperty {
      /**
       * `TRUE` to delete the existing target value for your specified target attribute key.
       *
       * You cannot create a target value and set this to `TRUE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributetarget.html#cfn-qbusiness-datasource-documentattributetarget-attributevalueoperator)
       */
      override fun attributeValueOperator(): String? = unwrap(this).getAttributeValueOperator()

      /**
       * The identifier of the target document attribute or metadata field.
       *
       * For example, 'Department' could be an identifier for the target attribute or metadata field
       * that includes the department names associated with the documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributetarget.html#cfn-qbusiness-datasource-documentattributetarget-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value of a document attribute.
       *
       * You can only provide one value for a document attribute.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributetarget.html#cfn-qbusiness-datasource-documentattributetarget-value)
       */
      override fun `value`(): Any? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentAttributeTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeTargetProperty):
          DocumentAttributeTargetProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentAttributeTargetProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentAttributeTargetProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeTargetProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeTargetProperty
    }
  }

  /**
   * The value of a document attribute.
   *
   * You can only provide one value for a document attribute.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * DocumentAttributeValueProperty documentAttributeValueProperty =
   * DocumentAttributeValueProperty.builder()
   * .dateValue("dateValue")
   * .longValue(123)
   * .stringListValue(List.of("stringListValue"))
   * .stringValue("stringValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributevalue.html)
   */
  public interface DocumentAttributeValueProperty {
    /**
     * A date expressed as an ISO 8601 string.
     *
     * It's important for the time zone to be included in the ISO 8601 date-time format. For
     * example, 2012-03-25T12:30:10+01:00 is the ISO 8601 date-time format for March 25th 2012 at
     * 12:30PM (plus 10 seconds) in Central European Time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributevalue.html#cfn-qbusiness-datasource-documentattributevalue-datevalue)
     */
    public fun dateValue(): String? = unwrap(this).getDateValue()

    /**
     * A long integer value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributevalue.html#cfn-qbusiness-datasource-documentattributevalue-longvalue)
     */
    public fun longValue(): Number? = unwrap(this).getLongValue()

    /**
     * A list of strings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributevalue.html#cfn-qbusiness-datasource-documentattributevalue-stringlistvalue)
     */
    public fun stringListValue(): List<String> = unwrap(this).getStringListValue() ?: emptyList()

    /**
     * A string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributevalue.html#cfn-qbusiness-datasource-documentattributevalue-stringvalue)
     */
    public fun stringValue(): String? = unwrap(this).getStringValue()

    /**
     * A builder for [DocumentAttributeValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dateValue A date expressed as an ISO 8601 string.
       * It's important for the time zone to be included in the ISO 8601 date-time format. For
       * example, 2012-03-25T12:30:10+01:00 is the ISO 8601 date-time format for March 25th 2012 at
       * 12:30PM (plus 10 seconds) in Central European Time.
       */
      public fun dateValue(dateValue: String)

      /**
       * @param longValue A long integer value.
       */
      public fun longValue(longValue: Number)

      /**
       * @param stringListValue A list of strings.
       */
      public fun stringListValue(stringListValue: List<String>)

      /**
       * @param stringListValue A list of strings.
       */
      public fun stringListValue(vararg stringListValue: String)

      /**
       * @param stringValue A string.
       */
      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeValueProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeValueProperty.builder()

      /**
       * @param dateValue A date expressed as an ISO 8601 string.
       * It's important for the time zone to be included in the ISO 8601 date-time format. For
       * example, 2012-03-25T12:30:10+01:00 is the ISO 8601 date-time format for March 25th 2012 at
       * 12:30PM (plus 10 seconds) in Central European Time.
       */
      override fun dateValue(dateValue: String) {
        cdkBuilder.dateValue(dateValue)
      }

      /**
       * @param longValue A long integer value.
       */
      override fun longValue(longValue: Number) {
        cdkBuilder.longValue(longValue)
      }

      /**
       * @param stringListValue A list of strings.
       */
      override fun stringListValue(stringListValue: List<String>) {
        cdkBuilder.stringListValue(stringListValue)
      }

      /**
       * @param stringListValue A list of strings.
       */
      override fun stringListValue(vararg stringListValue: String): Unit =
          stringListValue(stringListValue.toList())

      /**
       * @param stringValue A string.
       */
      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeValueProperty,
    ) : CdkObject(cdkObject),
        DocumentAttributeValueProperty {
      /**
       * A date expressed as an ISO 8601 string.
       *
       * It's important for the time zone to be included in the ISO 8601 date-time format. For
       * example, 2012-03-25T12:30:10+01:00 is the ISO 8601 date-time format for March 25th 2012 at
       * 12:30PM (plus 10 seconds) in Central European Time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributevalue.html#cfn-qbusiness-datasource-documentattributevalue-datevalue)
       */
      override fun dateValue(): String? = unwrap(this).getDateValue()

      /**
       * A long integer value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributevalue.html#cfn-qbusiness-datasource-documentattributevalue-longvalue)
       */
      override fun longValue(): Number? = unwrap(this).getLongValue()

      /**
       * A list of strings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributevalue.html#cfn-qbusiness-datasource-documentattributevalue-stringlistvalue)
       */
      override fun stringListValue(): List<String> = unwrap(this).getStringListValue() ?:
          emptyList()

      /**
       * A string.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentattributevalue.html#cfn-qbusiness-datasource-documentattributevalue-stringvalue)
       */
      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentAttributeValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeValueProperty):
          DocumentAttributeValueProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentAttributeValueProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentAttributeValueProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeValueProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentAttributeValueProperty
    }
  }

  /**
   * Provides the configuration information for altering document metadata and content during the
   * document ingestion process.
   *
   * For more information, see [Custom document
   * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * DocumentEnrichmentConfigurationProperty documentEnrichmentConfigurationProperty =
   * DocumentEnrichmentConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentenrichmentconfiguration.html)
   */
  public interface DocumentEnrichmentConfigurationProperty {
    /**
     * Configuration information to alter document attributes or metadata fields and content when
     * ingesting documents into Amazon Q Business.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentenrichmentconfiguration.html#cfn-qbusiness-datasource-documentenrichmentconfiguration-inlineconfigurations)
     */
    public fun inlineConfigurations(): Any? = unwrap(this).getInlineConfigurations()

    /**
     * Configuration information for invoking a Lambda function in AWS Lambda on the structured
     * documents with their metadata and text extracted.
     *
     * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
     * document metadata and content. For more information, see [Using Lambda
     * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentenrichmentconfiguration.html#cfn-qbusiness-datasource-documentenrichmentconfiguration-postextractionhookconfiguration)
     */
    public fun postExtractionHookConfiguration(): Any? =
        unwrap(this).getPostExtractionHookConfiguration()

    /**
     * Configuration information for invoking a Lambda function in AWS Lambda on the original or raw
     * documents before extracting their metadata and text.
     *
     * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
     * document metadata and content. For more information, see [Using Lambda
     * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentenrichmentconfiguration.html#cfn-qbusiness-datasource-documentenrichmentconfiguration-preextractionhookconfiguration)
     */
    public fun preExtractionHookConfiguration(): Any? =
        unwrap(this).getPreExtractionHookConfiguration()

    /**
     * A builder for [DocumentEnrichmentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inlineConfigurations Configuration information to alter document attributes or
       * metadata fields and content when ingesting documents into Amazon Q Business.
       */
      public fun inlineConfigurations(inlineConfigurations: IResolvable)

      /**
       * @param inlineConfigurations Configuration information to alter document attributes or
       * metadata fields and content when ingesting documents into Amazon Q Business.
       */
      public fun inlineConfigurations(inlineConfigurations: List<Any>)

      /**
       * @param inlineConfigurations Configuration information to alter document attributes or
       * metadata fields and content when ingesting documents into Amazon Q Business.
       */
      public fun inlineConfigurations(vararg inlineConfigurations: Any)

      /**
       * @param postExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the structured documents with their metadata and text extracted.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Using Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
       * .
       */
      public fun postExtractionHookConfiguration(postExtractionHookConfiguration: IResolvable)

      /**
       * @param postExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the structured documents with their metadata and text extracted.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Using Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
       * .
       */
      public
          fun postExtractionHookConfiguration(postExtractionHookConfiguration: HookConfigurationProperty)

      /**
       * @param postExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the structured documents with their metadata and text extracted.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Using Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a56177861fe31bded14425bd45ff5cab1c543141834392097fa213ef78385ac")
      public
          fun postExtractionHookConfiguration(postExtractionHookConfiguration: HookConfigurationProperty.Builder.() -> Unit)

      /**
       * @param preExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the original or raw documents before extracting their metadata and
       * text.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Using Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
       * .
       */
      public fun preExtractionHookConfiguration(preExtractionHookConfiguration: IResolvable)

      /**
       * @param preExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the original or raw documents before extracting their metadata and
       * text.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Using Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
       * .
       */
      public
          fun preExtractionHookConfiguration(preExtractionHookConfiguration: HookConfigurationProperty)

      /**
       * @param preExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the original or raw documents before extracting their metadata and
       * text.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Using Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48b90bf5d854f36f6d5f6a8c10ba02850073cc16ad3df1422a94b5da8d267bce")
      public
          fun preExtractionHookConfiguration(preExtractionHookConfiguration: HookConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentEnrichmentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentEnrichmentConfigurationProperty.builder()

      /**
       * @param inlineConfigurations Configuration information to alter document attributes or
       * metadata fields and content when ingesting documents into Amazon Q Business.
       */
      override fun inlineConfigurations(inlineConfigurations: IResolvable) {
        cdkBuilder.inlineConfigurations(inlineConfigurations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param inlineConfigurations Configuration information to alter document attributes or
       * metadata fields and content when ingesting documents into Amazon Q Business.
       */
      override fun inlineConfigurations(inlineConfigurations: List<Any>) {
        cdkBuilder.inlineConfigurations(inlineConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param inlineConfigurations Configuration information to alter document attributes or
       * metadata fields and content when ingesting documents into Amazon Q Business.
       */
      override fun inlineConfigurations(vararg inlineConfigurations: Any): Unit =
          inlineConfigurations(inlineConfigurations.toList())

      /**
       * @param postExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the structured documents with their metadata and text extracted.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Using Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
       * .
       */
      override fun postExtractionHookConfiguration(postExtractionHookConfiguration: IResolvable) {
        cdkBuilder.postExtractionHookConfiguration(postExtractionHookConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param postExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the structured documents with their metadata and text extracted.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Using Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
       * .
       */
      override
          fun postExtractionHookConfiguration(postExtractionHookConfiguration: HookConfigurationProperty) {
        cdkBuilder.postExtractionHookConfiguration(postExtractionHookConfiguration.let(HookConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param postExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the structured documents with their metadata and text extracted.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Using Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7a56177861fe31bded14425bd45ff5cab1c543141834392097fa213ef78385ac")
      override
          fun postExtractionHookConfiguration(postExtractionHookConfiguration: HookConfigurationProperty.Builder.() -> Unit):
          Unit =
          postExtractionHookConfiguration(HookConfigurationProperty(postExtractionHookConfiguration))

      /**
       * @param preExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the original or raw documents before extracting their metadata and
       * text.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Using Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
       * .
       */
      override fun preExtractionHookConfiguration(preExtractionHookConfiguration: IResolvable) {
        cdkBuilder.preExtractionHookConfiguration(preExtractionHookConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param preExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the original or raw documents before extracting their metadata and
       * text.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Using Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
       * .
       */
      override
          fun preExtractionHookConfiguration(preExtractionHookConfiguration: HookConfigurationProperty) {
        cdkBuilder.preExtractionHookConfiguration(preExtractionHookConfiguration.let(HookConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param preExtractionHookConfiguration Configuration information for invoking a Lambda
       * function in AWS Lambda on the original or raw documents before extracting their metadata and
       * text.
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Using Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48b90bf5d854f36f6d5f6a8c10ba02850073cc16ad3df1422a94b5da8d267bce")
      override
          fun preExtractionHookConfiguration(preExtractionHookConfiguration: HookConfigurationProperty.Builder.() -> Unit):
          Unit =
          preExtractionHookConfiguration(HookConfigurationProperty(preExtractionHookConfiguration))

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentEnrichmentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentEnrichmentConfigurationProperty,
    ) : CdkObject(cdkObject),
        DocumentEnrichmentConfigurationProperty {
      /**
       * Configuration information to alter document attributes or metadata fields and content when
       * ingesting documents into Amazon Q Business.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentenrichmentconfiguration.html#cfn-qbusiness-datasource-documentenrichmentconfiguration-inlineconfigurations)
       */
      override fun inlineConfigurations(): Any? = unwrap(this).getInlineConfigurations()

      /**
       * Configuration information for invoking a Lambda function in AWS Lambda on the structured
       * documents with their metadata and text extracted.
       *
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Using Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentenrichmentconfiguration.html#cfn-qbusiness-datasource-documentenrichmentconfiguration-postextractionhookconfiguration)
       */
      override fun postExtractionHookConfiguration(): Any? =
          unwrap(this).getPostExtractionHookConfiguration()

      /**
       * Configuration information for invoking a Lambda function in AWS Lambda on the original or
       * raw documents before extracting their metadata and text.
       *
       * You can use a Lambda function to apply advanced logic for creating, modifying, or deleting
       * document metadata and content. For more information, see [Using Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-documentenrichmentconfiguration.html#cfn-qbusiness-datasource-documentenrichmentconfiguration-preextractionhookconfiguration)
       */
      override fun preExtractionHookConfiguration(): Any? =
          unwrap(this).getPreExtractionHookConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentEnrichmentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentEnrichmentConfigurationProperty):
          DocumentEnrichmentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentEnrichmentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentEnrichmentConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentEnrichmentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataSource.DocumentEnrichmentConfigurationProperty
    }
  }

  /**
   * Provides the configuration information for invoking a Lambda function in AWS Lambda to alter
   * document metadata and content when ingesting documents into Amazon Q Business.
   *
   * You can configure your Lambda function using the `PreExtractionHookConfiguration` parameter if
   * you want to apply advanced alterations on the original or raw documents.
   *
   * If you want to apply advanced alterations on the Amazon Q Business structured documents, you
   * must configure your Lambda function using `PostExtractionHookConfiguration` .
   *
   * You can only invoke one Lambda function. However, this function can invoke other functions it
   * requires.
   *
   * For more information, see [Custom document
   * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * HookConfigurationProperty hookConfigurationProperty = HookConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-hookconfiguration.html)
   */
  public interface HookConfigurationProperty {
    /**
     * The condition used for when a Lambda function should be invoked.
     *
     * For example, you can specify a condition that if there are empty date-time values, then
     * Amazon Q Business should invoke a function that inserts the current date-time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-hookconfiguration.html#cfn-qbusiness-datasource-hookconfiguration-invocationcondition)
     */
    public fun invocationCondition(): Any? = unwrap(this).getInvocationCondition()

    /**
     * The Amazon Resource Name (ARN) of the Lambda function during ingestion.
     *
     * For more information, see [Using Lambda functions for Amazon Q Business document
     * enrichment](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/cde-lambda-operations.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-hookconfiguration.html#cfn-qbusiness-datasource-hookconfiguration-lambdaarn)
     */
    public fun lambdaArn(): String? = unwrap(this).getLambdaArn()

    /**
     * The Amazon Resource Name (ARN) of a role with permission to run
     * `PreExtractionHookConfiguration` and `PostExtractionHookConfiguration` for altering document
     * metadata and content during the document ingestion process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-hookconfiguration.html#cfn-qbusiness-datasource-hookconfiguration-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * Stores the original, raw documents or the structured, parsed documents before and after
     * altering them.
     *
     * For more information, see [Data contracts for Lambda
     * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html#cde-lambda-operations-data-contracts)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-hookconfiguration.html#cfn-qbusiness-datasource-hookconfiguration-s3bucketname)
     */
    public fun s3BucketName(): String? = unwrap(this).getS3BucketName()

    /**
     * A builder for [HookConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param invocationCondition The condition used for when a Lambda function should be invoked.
       * For example, you can specify a condition that if there are empty date-time values, then
       * Amazon Q Business should invoke a function that inserts the current date-time.
       */
      public fun invocationCondition(invocationCondition: IResolvable)

      /**
       * @param invocationCondition The condition used for when a Lambda function should be invoked.
       * For example, you can specify a condition that if there are empty date-time values, then
       * Amazon Q Business should invoke a function that inserts the current date-time.
       */
      public fun invocationCondition(invocationCondition: DocumentAttributeConditionProperty)

      /**
       * @param invocationCondition The condition used for when a Lambda function should be invoked.
       * For example, you can specify a condition that if there are empty date-time values, then
       * Amazon Q Business should invoke a function that inserts the current date-time.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d76fc7ccd2eb2040e12cdbb3dda61e2181a39254a477add35b56053c21851168")
      public
          fun invocationCondition(invocationCondition: DocumentAttributeConditionProperty.Builder.() -> Unit)

      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of the Lambda function during ingestion.
       * For more information, see [Using Lambda functions for Amazon Q Business document
       * enrichment](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/cde-lambda-operations.html)
       * .
       */
      public fun lambdaArn(lambdaArn: String)

      /**
       * @param roleArn The Amazon Resource Name (ARN) of a role with permission to run
       * `PreExtractionHookConfiguration` and `PostExtractionHookConfiguration` for altering document
       * metadata and content during the document ingestion process.
       */
      public fun roleArn(roleArn: String)

      /**
       * @param s3BucketName Stores the original, raw documents or the structured, parsed documents
       * before and after altering them.
       * For more information, see [Data contracts for Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html#cde-lambda-operations-data-contracts)
       * .
       */
      public fun s3BucketName(s3BucketName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataSource.HookConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataSource.HookConfigurationProperty.builder()

      /**
       * @param invocationCondition The condition used for when a Lambda function should be invoked.
       * For example, you can specify a condition that if there are empty date-time values, then
       * Amazon Q Business should invoke a function that inserts the current date-time.
       */
      override fun invocationCondition(invocationCondition: IResolvable) {
        cdkBuilder.invocationCondition(invocationCondition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param invocationCondition The condition used for when a Lambda function should be invoked.
       * For example, you can specify a condition that if there are empty date-time values, then
       * Amazon Q Business should invoke a function that inserts the current date-time.
       */
      override fun invocationCondition(invocationCondition: DocumentAttributeConditionProperty) {
        cdkBuilder.invocationCondition(invocationCondition.let(DocumentAttributeConditionProperty.Companion::unwrap))
      }

      /**
       * @param invocationCondition The condition used for when a Lambda function should be invoked.
       * For example, you can specify a condition that if there are empty date-time values, then
       * Amazon Q Business should invoke a function that inserts the current date-time.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d76fc7ccd2eb2040e12cdbb3dda61e2181a39254a477add35b56053c21851168")
      override
          fun invocationCondition(invocationCondition: DocumentAttributeConditionProperty.Builder.() -> Unit):
          Unit = invocationCondition(DocumentAttributeConditionProperty(invocationCondition))

      /**
       * @param lambdaArn The Amazon Resource Name (ARN) of the Lambda function during ingestion.
       * For more information, see [Using Lambda functions for Amazon Q Business document
       * enrichment](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/cde-lambda-operations.html)
       * .
       */
      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      /**
       * @param roleArn The Amazon Resource Name (ARN) of a role with permission to run
       * `PreExtractionHookConfiguration` and `PostExtractionHookConfiguration` for altering document
       * metadata and content during the document ingestion process.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param s3BucketName Stores the original, raw documents or the structured, parsed documents
       * before and after altering them.
       * For more information, see [Data contracts for Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html#cde-lambda-operations-data-contracts)
       * .
       */
      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataSource.HookConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.HookConfigurationProperty,
    ) : CdkObject(cdkObject),
        HookConfigurationProperty {
      /**
       * The condition used for when a Lambda function should be invoked.
       *
       * For example, you can specify a condition that if there are empty date-time values, then
       * Amazon Q Business should invoke a function that inserts the current date-time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-hookconfiguration.html#cfn-qbusiness-datasource-hookconfiguration-invocationcondition)
       */
      override fun invocationCondition(): Any? = unwrap(this).getInvocationCondition()

      /**
       * The Amazon Resource Name (ARN) of the Lambda function during ingestion.
       *
       * For more information, see [Using Lambda functions for Amazon Q Business document
       * enrichment](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/cde-lambda-operations.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-hookconfiguration.html#cfn-qbusiness-datasource-hookconfiguration-lambdaarn)
       */
      override fun lambdaArn(): String? = unwrap(this).getLambdaArn()

      /**
       * The Amazon Resource Name (ARN) of a role with permission to run
       * `PreExtractionHookConfiguration` and `PostExtractionHookConfiguration` for altering document
       * metadata and content during the document ingestion process.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-hookconfiguration.html#cfn-qbusiness-datasource-hookconfiguration-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      /**
       * Stores the original, raw documents or the structured, parsed documents before and after
       * altering them.
       *
       * For more information, see [Data contracts for Lambda
       * functions](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/cde-lambda-operations.html#cde-lambda-operations-data-contracts)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-hookconfiguration.html#cfn-qbusiness-datasource-hookconfiguration-s3bucketname)
       */
      override fun s3BucketName(): String? = unwrap(this).getS3BucketName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HookConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.HookConfigurationProperty):
          HookConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HookConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HookConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataSource.HookConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataSource.HookConfigurationProperty
    }
  }

  /**
   * The configuration for extracting semantic meaning from images in documents.
   *
   * For more information, see [Extracting semantic meaning from images and
   * visuals](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/extracting-meaning-from-images.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * ImageExtractionConfigurationProperty imageExtractionConfigurationProperty =
   * ImageExtractionConfigurationProperty.builder()
   * .imageExtractionStatus("imageExtractionStatus")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-imageextractionconfiguration.html)
   */
  public interface ImageExtractionConfigurationProperty {
    /**
     * Specify whether to extract semantic meaning from images and visuals from documents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-imageextractionconfiguration.html#cfn-qbusiness-datasource-imageextractionconfiguration-imageextractionstatus)
     */
    public fun imageExtractionStatus(): String

    /**
     * A builder for [ImageExtractionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param imageExtractionStatus Specify whether to extract semantic meaning from images and
       * visuals from documents. 
       */
      public fun imageExtractionStatus(imageExtractionStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataSource.ImageExtractionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataSource.ImageExtractionConfigurationProperty.builder()

      /**
       * @param imageExtractionStatus Specify whether to extract semantic meaning from images and
       * visuals from documents. 
       */
      override fun imageExtractionStatus(imageExtractionStatus: String) {
        cdkBuilder.imageExtractionStatus(imageExtractionStatus)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataSource.ImageExtractionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.ImageExtractionConfigurationProperty,
    ) : CdkObject(cdkObject),
        ImageExtractionConfigurationProperty {
      /**
       * Specify whether to extract semantic meaning from images and visuals from documents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-imageextractionconfiguration.html#cfn-qbusiness-datasource-imageextractionconfiguration-imageextractionstatus)
       */
      override fun imageExtractionStatus(): String = unwrap(this).getImageExtractionStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ImageExtractionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.ImageExtractionConfigurationProperty):
          ImageExtractionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ImageExtractionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ImageExtractionConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataSource.ImageExtractionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataSource.ImageExtractionConfigurationProperty
    }
  }

  /**
   * Provides the configuration information for applying basic logic to alter document metadata and
   * content when ingesting documents into Amazon Q Business.
   *
   * To apply advanced logic, to go beyond what you can do with basic logic, see
   * [`HookConfiguration`](https://docs.aws.amazon.com/amazonq/latest/api-reference/API_HookConfiguration.html)
   * .
   *
   * For more information, see [Custom document
   * enrichment](https://docs.aws.amazon.com/amazonq/latest/business-use-dg/custom-document-enrichment.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * InlineDocumentEnrichmentConfigurationProperty inlineDocumentEnrichmentConfigurationProperty =
   * InlineDocumentEnrichmentConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-inlinedocumentenrichmentconfiguration.html)
   */
  public interface InlineDocumentEnrichmentConfigurationProperty {
    /**
     * Configuration of the condition used for the target document attribute or metadata field when
     * ingesting documents into Amazon Q Business .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-inlinedocumentenrichmentconfiguration.html#cfn-qbusiness-datasource-inlinedocumentenrichmentconfiguration-condition)
     */
    public fun condition(): Any? = unwrap(this).getCondition()

    /**
     * `TRUE` to delete content if the condition used for the target attribute is met.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-inlinedocumentenrichmentconfiguration.html#cfn-qbusiness-datasource-inlinedocumentenrichmentconfiguration-documentcontentoperator)
     */
    public fun documentContentOperator(): String? = unwrap(this).getDocumentContentOperator()

    /**
     * Configuration of the target document attribute or metadata field when ingesting documents
     * into Amazon Q Business .
     *
     * You can also include a value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-inlinedocumentenrichmentconfiguration.html#cfn-qbusiness-datasource-inlinedocumentenrichmentconfiguration-target)
     */
    public fun target(): Any? = unwrap(this).getTarget()

    /**
     * A builder for [InlineDocumentEnrichmentConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param condition Configuration of the condition used for the target document attribute or
       * metadata field when ingesting documents into Amazon Q Business .
       */
      public fun condition(condition: IResolvable)

      /**
       * @param condition Configuration of the condition used for the target document attribute or
       * metadata field when ingesting documents into Amazon Q Business .
       */
      public fun condition(condition: DocumentAttributeConditionProperty)

      /**
       * @param condition Configuration of the condition used for the target document attribute or
       * metadata field when ingesting documents into Amazon Q Business .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa343d7cbca951d98ebc09f394b82206dd7128d4a32fcb6fc6f18b648c451c92")
      public fun condition(condition: DocumentAttributeConditionProperty.Builder.() -> Unit)

      /**
       * @param documentContentOperator `TRUE` to delete content if the condition used for the
       * target attribute is met.
       */
      public fun documentContentOperator(documentContentOperator: String)

      /**
       * @param target Configuration of the target document attribute or metadata field when
       * ingesting documents into Amazon Q Business .
       * You can also include a value.
       */
      public fun target(target: IResolvable)

      /**
       * @param target Configuration of the target document attribute or metadata field when
       * ingesting documents into Amazon Q Business .
       * You can also include a value.
       */
      public fun target(target: DocumentAttributeTargetProperty)

      /**
       * @param target Configuration of the target document attribute or metadata field when
       * ingesting documents into Amazon Q Business .
       * You can also include a value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec6385c66ca952ec4cd1243ee350ad39a00db92cddf41fa77d24371dd43ce4dd")
      public fun target(target: DocumentAttributeTargetProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataSource.InlineDocumentEnrichmentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataSource.InlineDocumentEnrichmentConfigurationProperty.builder()

      /**
       * @param condition Configuration of the condition used for the target document attribute or
       * metadata field when ingesting documents into Amazon Q Business .
       */
      override fun condition(condition: IResolvable) {
        cdkBuilder.condition(condition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param condition Configuration of the condition used for the target document attribute or
       * metadata field when ingesting documents into Amazon Q Business .
       */
      override fun condition(condition: DocumentAttributeConditionProperty) {
        cdkBuilder.condition(condition.let(DocumentAttributeConditionProperty.Companion::unwrap))
      }

      /**
       * @param condition Configuration of the condition used for the target document attribute or
       * metadata field when ingesting documents into Amazon Q Business .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fa343d7cbca951d98ebc09f394b82206dd7128d4a32fcb6fc6f18b648c451c92")
      override fun condition(condition: DocumentAttributeConditionProperty.Builder.() -> Unit): Unit
          = condition(DocumentAttributeConditionProperty(condition))

      /**
       * @param documentContentOperator `TRUE` to delete content if the condition used for the
       * target attribute is met.
       */
      override fun documentContentOperator(documentContentOperator: String) {
        cdkBuilder.documentContentOperator(documentContentOperator)
      }

      /**
       * @param target Configuration of the target document attribute or metadata field when
       * ingesting documents into Amazon Q Business .
       * You can also include a value.
       */
      override fun target(target: IResolvable) {
        cdkBuilder.target(target.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param target Configuration of the target document attribute or metadata field when
       * ingesting documents into Amazon Q Business .
       * You can also include a value.
       */
      override fun target(target: DocumentAttributeTargetProperty) {
        cdkBuilder.target(target.let(DocumentAttributeTargetProperty.Companion::unwrap))
      }

      /**
       * @param target Configuration of the target document attribute or metadata field when
       * ingesting documents into Amazon Q Business .
       * You can also include a value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ec6385c66ca952ec4cd1243ee350ad39a00db92cddf41fa77d24371dd43ce4dd")
      override fun target(target: DocumentAttributeTargetProperty.Builder.() -> Unit): Unit =
          target(DocumentAttributeTargetProperty(target))

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataSource.InlineDocumentEnrichmentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.InlineDocumentEnrichmentConfigurationProperty,
    ) : CdkObject(cdkObject),
        InlineDocumentEnrichmentConfigurationProperty {
      /**
       * Configuration of the condition used for the target document attribute or metadata field
       * when ingesting documents into Amazon Q Business .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-inlinedocumentenrichmentconfiguration.html#cfn-qbusiness-datasource-inlinedocumentenrichmentconfiguration-condition)
       */
      override fun condition(): Any? = unwrap(this).getCondition()

      /**
       * `TRUE` to delete content if the condition used for the target attribute is met.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-inlinedocumentenrichmentconfiguration.html#cfn-qbusiness-datasource-inlinedocumentenrichmentconfiguration-documentcontentoperator)
       */
      override fun documentContentOperator(): String? = unwrap(this).getDocumentContentOperator()

      /**
       * Configuration of the target document attribute or metadata field when ingesting documents
       * into Amazon Q Business .
       *
       * You can also include a value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-inlinedocumentenrichmentconfiguration.html#cfn-qbusiness-datasource-inlinedocumentenrichmentconfiguration-target)
       */
      override fun target(): Any? = unwrap(this).getTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InlineDocumentEnrichmentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.InlineDocumentEnrichmentConfigurationProperty):
          InlineDocumentEnrichmentConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InlineDocumentEnrichmentConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InlineDocumentEnrichmentConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataSource.InlineDocumentEnrichmentConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataSource.InlineDocumentEnrichmentConfigurationProperty
    }
  }

  /**
   * The configuration for extracting information from media in documents.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * MediaExtractionConfigurationProperty mediaExtractionConfigurationProperty =
   * MediaExtractionConfigurationProperty.builder()
   * .audioExtractionConfiguration(AudioExtractionConfigurationProperty.builder()
   * .audioExtractionStatus("audioExtractionStatus")
   * .build())
   * .imageExtractionConfiguration(ImageExtractionConfigurationProperty.builder()
   * .imageExtractionStatus("imageExtractionStatus")
   * .build())
   * .videoExtractionConfiguration(VideoExtractionConfigurationProperty.builder()
   * .videoExtractionStatus("videoExtractionStatus")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-mediaextractionconfiguration.html)
   */
  public interface MediaExtractionConfigurationProperty {
    /**
     * Configuration settings for extracting and processing audio content from media files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-mediaextractionconfiguration.html#cfn-qbusiness-datasource-mediaextractionconfiguration-audioextractionconfiguration)
     */
    public fun audioExtractionConfiguration(): Any? = unwrap(this).getAudioExtractionConfiguration()

    /**
     * The configuration for extracting semantic meaning from images in documents.
     *
     * For more information, see [Extracting semantic meaning from images and
     * visuals](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/extracting-meaning-from-images.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-mediaextractionconfiguration.html#cfn-qbusiness-datasource-mediaextractionconfiguration-imageextractionconfiguration)
     */
    public fun imageExtractionConfiguration(): Any? = unwrap(this).getImageExtractionConfiguration()

    /**
     * Configuration settings for extracting and processing video content from media files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-mediaextractionconfiguration.html#cfn-qbusiness-datasource-mediaextractionconfiguration-videoextractionconfiguration)
     */
    public fun videoExtractionConfiguration(): Any? = unwrap(this).getVideoExtractionConfiguration()

    /**
     * A builder for [MediaExtractionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param audioExtractionConfiguration Configuration settings for extracting and processing
       * audio content from media files.
       */
      public fun audioExtractionConfiguration(audioExtractionConfiguration: IResolvable)

      /**
       * @param audioExtractionConfiguration Configuration settings for extracting and processing
       * audio content from media files.
       */
      public
          fun audioExtractionConfiguration(audioExtractionConfiguration: AudioExtractionConfigurationProperty)

      /**
       * @param audioExtractionConfiguration Configuration settings for extracting and processing
       * audio content from media files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc018733725a05f09b5952e3e5f4e086de00c9dcf7457fc218cc668e49f82418")
      public
          fun audioExtractionConfiguration(audioExtractionConfiguration: AudioExtractionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param imageExtractionConfiguration The configuration for extracting semantic meaning from
       * images in documents.
       * For more information, see [Extracting semantic meaning from images and
       * visuals](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/extracting-meaning-from-images.html)
       * .
       */
      public fun imageExtractionConfiguration(imageExtractionConfiguration: IResolvable)

      /**
       * @param imageExtractionConfiguration The configuration for extracting semantic meaning from
       * images in documents.
       * For more information, see [Extracting semantic meaning from images and
       * visuals](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/extracting-meaning-from-images.html)
       * .
       */
      public
          fun imageExtractionConfiguration(imageExtractionConfiguration: ImageExtractionConfigurationProperty)

      /**
       * @param imageExtractionConfiguration The configuration for extracting semantic meaning from
       * images in documents.
       * For more information, see [Extracting semantic meaning from images and
       * visuals](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/extracting-meaning-from-images.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("850cfd3d96a11ea9bb009694417ad9b935a2008dc544c22b77abe5b6b58cb0b8")
      public
          fun imageExtractionConfiguration(imageExtractionConfiguration: ImageExtractionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param videoExtractionConfiguration Configuration settings for extracting and processing
       * video content from media files.
       */
      public fun videoExtractionConfiguration(videoExtractionConfiguration: IResolvable)

      /**
       * @param videoExtractionConfiguration Configuration settings for extracting and processing
       * video content from media files.
       */
      public
          fun videoExtractionConfiguration(videoExtractionConfiguration: VideoExtractionConfigurationProperty)

      /**
       * @param videoExtractionConfiguration Configuration settings for extracting and processing
       * video content from media files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88516075712e00f717497000ad72ef6cf859e0560175c1b37ca6a7b6260cae0d")
      public
          fun videoExtractionConfiguration(videoExtractionConfiguration: VideoExtractionConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataSource.MediaExtractionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataSource.MediaExtractionConfigurationProperty.builder()

      /**
       * @param audioExtractionConfiguration Configuration settings for extracting and processing
       * audio content from media files.
       */
      override fun audioExtractionConfiguration(audioExtractionConfiguration: IResolvable) {
        cdkBuilder.audioExtractionConfiguration(audioExtractionConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param audioExtractionConfiguration Configuration settings for extracting and processing
       * audio content from media files.
       */
      override
          fun audioExtractionConfiguration(audioExtractionConfiguration: AudioExtractionConfigurationProperty) {
        cdkBuilder.audioExtractionConfiguration(audioExtractionConfiguration.let(AudioExtractionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param audioExtractionConfiguration Configuration settings for extracting and processing
       * audio content from media files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc018733725a05f09b5952e3e5f4e086de00c9dcf7457fc218cc668e49f82418")
      override
          fun audioExtractionConfiguration(audioExtractionConfiguration: AudioExtractionConfigurationProperty.Builder.() -> Unit):
          Unit =
          audioExtractionConfiguration(AudioExtractionConfigurationProperty(audioExtractionConfiguration))

      /**
       * @param imageExtractionConfiguration The configuration for extracting semantic meaning from
       * images in documents.
       * For more information, see [Extracting semantic meaning from images and
       * visuals](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/extracting-meaning-from-images.html)
       * .
       */
      override fun imageExtractionConfiguration(imageExtractionConfiguration: IResolvable) {
        cdkBuilder.imageExtractionConfiguration(imageExtractionConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param imageExtractionConfiguration The configuration for extracting semantic meaning from
       * images in documents.
       * For more information, see [Extracting semantic meaning from images and
       * visuals](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/extracting-meaning-from-images.html)
       * .
       */
      override
          fun imageExtractionConfiguration(imageExtractionConfiguration: ImageExtractionConfigurationProperty) {
        cdkBuilder.imageExtractionConfiguration(imageExtractionConfiguration.let(ImageExtractionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param imageExtractionConfiguration The configuration for extracting semantic meaning from
       * images in documents.
       * For more information, see [Extracting semantic meaning from images and
       * visuals](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/extracting-meaning-from-images.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("850cfd3d96a11ea9bb009694417ad9b935a2008dc544c22b77abe5b6b58cb0b8")
      override
          fun imageExtractionConfiguration(imageExtractionConfiguration: ImageExtractionConfigurationProperty.Builder.() -> Unit):
          Unit =
          imageExtractionConfiguration(ImageExtractionConfigurationProperty(imageExtractionConfiguration))

      /**
       * @param videoExtractionConfiguration Configuration settings for extracting and processing
       * video content from media files.
       */
      override fun videoExtractionConfiguration(videoExtractionConfiguration: IResolvable) {
        cdkBuilder.videoExtractionConfiguration(videoExtractionConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param videoExtractionConfiguration Configuration settings for extracting and processing
       * video content from media files.
       */
      override
          fun videoExtractionConfiguration(videoExtractionConfiguration: VideoExtractionConfigurationProperty) {
        cdkBuilder.videoExtractionConfiguration(videoExtractionConfiguration.let(VideoExtractionConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param videoExtractionConfiguration Configuration settings for extracting and processing
       * video content from media files.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88516075712e00f717497000ad72ef6cf859e0560175c1b37ca6a7b6260cae0d")
      override
          fun videoExtractionConfiguration(videoExtractionConfiguration: VideoExtractionConfigurationProperty.Builder.() -> Unit):
          Unit =
          videoExtractionConfiguration(VideoExtractionConfigurationProperty(videoExtractionConfiguration))

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataSource.MediaExtractionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.MediaExtractionConfigurationProperty,
    ) : CdkObject(cdkObject),
        MediaExtractionConfigurationProperty {
      /**
       * Configuration settings for extracting and processing audio content from media files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-mediaextractionconfiguration.html#cfn-qbusiness-datasource-mediaextractionconfiguration-audioextractionconfiguration)
       */
      override fun audioExtractionConfiguration(): Any? =
          unwrap(this).getAudioExtractionConfiguration()

      /**
       * The configuration for extracting semantic meaning from images in documents.
       *
       * For more information, see [Extracting semantic meaning from images and
       * visuals](https://docs.aws.amazon.com/amazonq/latest/qbusiness-ug/extracting-meaning-from-images.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-mediaextractionconfiguration.html#cfn-qbusiness-datasource-mediaextractionconfiguration-imageextractionconfiguration)
       */
      override fun imageExtractionConfiguration(): Any? =
          unwrap(this).getImageExtractionConfiguration()

      /**
       * Configuration settings for extracting and processing video content from media files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-mediaextractionconfiguration.html#cfn-qbusiness-datasource-mediaextractionconfiguration-videoextractionconfiguration)
       */
      override fun videoExtractionConfiguration(): Any? =
          unwrap(this).getVideoExtractionConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MediaExtractionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.MediaExtractionConfigurationProperty):
          MediaExtractionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MediaExtractionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MediaExtractionConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataSource.MediaExtractionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataSource.MediaExtractionConfigurationProperty
    }
  }

  /**
   * Configuration settings for video content extraction and processing.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * VideoExtractionConfigurationProperty videoExtractionConfigurationProperty =
   * VideoExtractionConfigurationProperty.builder()
   * .videoExtractionStatus("videoExtractionStatus")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-videoextractionconfiguration.html)
   */
  public interface VideoExtractionConfigurationProperty {
    /**
     * The status of video extraction (ENABLED or DISABLED) for processing video content from files.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-videoextractionconfiguration.html#cfn-qbusiness-datasource-videoextractionconfiguration-videoextractionstatus)
     */
    public fun videoExtractionStatus(): String

    /**
     * A builder for [VideoExtractionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param videoExtractionStatus The status of video extraction (ENABLED or DISABLED) for
       * processing video content from files. 
       */
      public fun videoExtractionStatus(videoExtractionStatus: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnDataSource.VideoExtractionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnDataSource.VideoExtractionConfigurationProperty.builder()

      /**
       * @param videoExtractionStatus The status of video extraction (ENABLED or DISABLED) for
       * processing video content from files. 
       */
      override fun videoExtractionStatus(videoExtractionStatus: String) {
        cdkBuilder.videoExtractionStatus(videoExtractionStatus)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnDataSource.VideoExtractionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.VideoExtractionConfigurationProperty,
    ) : CdkObject(cdkObject),
        VideoExtractionConfigurationProperty {
      /**
       * The status of video extraction (ENABLED or DISABLED) for processing video content from
       * files.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-datasource-videoextractionconfiguration.html#cfn-qbusiness-datasource-videoextractionconfiguration-videoextractionstatus)
       */
      override fun videoExtractionStatus(): String = unwrap(this).getVideoExtractionStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          VideoExtractionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnDataSource.VideoExtractionConfigurationProperty):
          VideoExtractionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          VideoExtractionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: VideoExtractionConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnDataSource.VideoExtractionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnDataSource.VideoExtractionConfigurationProperty
    }
  }
}
