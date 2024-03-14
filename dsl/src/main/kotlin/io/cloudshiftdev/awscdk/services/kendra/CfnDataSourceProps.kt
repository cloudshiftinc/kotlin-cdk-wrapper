package io.cloudshiftdev.awscdk.services.kendra

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDataSourceProps {
  /**
   * Configuration information for altering document metadata and content during the document
   * ingestion process.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration)
   */
  public fun customDocumentEnrichmentConfiguration(): Any? =
      unwrap(this).getCustomDocumentEnrichmentConfiguration()

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
   */
  public fun dataSourceConfiguration(): Any? = unwrap(this).getDataSourceConfiguration()

  /**
   * A description for the data source connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The identifier of the index you want to use with the data source connector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-indexid)
   */
  public fun indexId(): String

  /**
   * The code for a language.
   *
   * This shows a supported language for all documents in the data source. English is supported by
   * default. For more information on supported languages, including their codes, see [Adding documents
   * in languages other than
   * English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-languagecode)
   */
  public fun languageCode(): String? = unwrap(this).getLanguageCode()

  /**
   * The name of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-name)
   */
  public fun name(): String

  /**
   * The Amazon Resource Name (ARN) of a role with permission to access the data source.
   *
   * You can't specify the `RoleArn` parameter when the `Type` parameter is set to `CUSTOM` .
   *
   * The `RoleArn` parameter is required for all other data sources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * Sets the frequency that Amazon Kendra checks the documents in your data source and updates the
   * index.
   *
   * If you don't set a schedule, Amazon Kendra doesn't periodically update the index.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-schedule)
   */
  public fun schedule(): String? = unwrap(this).getSchedule()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of the data source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnDataSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process.
     */
    public
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: IResolvable)

    /**
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process.
     */
    public
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty)

    /**
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9eda522c9f39dac439b0a9f4f1e2aadb01ae59be55d8b470f9ca4563b44c90ce")
    public
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty.Builder.() -> Unit)

    /**
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source.
     * The contents of the configuration depend on the type of data source. You can only specify one
     * type of data source in the configuration.
     *
     * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM`
     * .
     *
     * The `Configuration` parameter is required for all other data sources.
     */
    public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable)

    /**
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source.
     * The contents of the configuration depend on the type of data source. You can only specify one
     * type of data source in the configuration.
     *
     * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM`
     * .
     *
     * The `Configuration` parameter is required for all other data sources.
     */
    public
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty)

    /**
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source.
     * The contents of the configuration depend on the type of data source. You can only specify one
     * type of data source in the configuration.
     *
     * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM`
     * .
     *
     * The `Configuration` parameter is required for all other data sources.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec157f003c905715a686cc1bdfdfb78d9e147be840e23eb7b6b3cd78b8bb88e6")
    public
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty.Builder.() -> Unit)

    /**
     * @param description A description for the data source connector.
     */
    public fun description(description: String)

    /**
     * @param indexId The identifier of the index you want to use with the data source connector. 
     */
    public fun indexId(indexId: String)

    /**
     * @param languageCode The code for a language.
     * This shows a supported language for all documents in the data source. English is supported by
     * default. For more information on supported languages, including their codes, see [Adding
     * documents in languages other than
     * English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html) .
     */
    public fun languageCode(languageCode: String)

    /**
     * @param name The name of the data source. 
     */
    public fun name(name: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the data
     * source.
     * You can't specify the `RoleArn` parameter when the `Type` parameter is set to `CUSTOM` .
     *
     * The `RoleArn` parameter is required for all other data sources.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param schedule Sets the frequency that Amazon Kendra checks the documents in your data
     * source and updates the index.
     * If you don't set a schedule, Amazon Kendra doesn't periodically update the index.
     */
    public fun schedule(schedule: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The type of the data source. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnDataSourceProps.Builder =
        software.amazon.awscdk.services.kendra.CfnDataSourceProps.builder()

    /**
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process.
     */
    override
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: IResolvable) {
      cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process.
     */
    override
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty) {
      cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration.let(CfnDataSource.CustomDocumentEnrichmentConfigurationProperty::unwrap))
    }

    /**
     * @param customDocumentEnrichmentConfiguration Configuration information for altering document
     * metadata and content during the document ingestion process.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9eda522c9f39dac439b0a9f4f1e2aadb01ae59be55d8b470f9ca4563b44c90ce")
    override
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CfnDataSource.CustomDocumentEnrichmentConfigurationProperty.Builder.() -> Unit):
        Unit =
        customDocumentEnrichmentConfiguration(CfnDataSource.CustomDocumentEnrichmentConfigurationProperty(customDocumentEnrichmentConfiguration))

    /**
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source.
     * The contents of the configuration depend on the type of data source. You can only specify one
     * type of data source in the configuration.
     *
     * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM`
     * .
     *
     * The `Configuration` parameter is required for all other data sources.
     */
    override fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source.
     * The contents of the configuration depend on the type of data source. You can only specify one
     * type of data source in the configuration.
     *
     * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM`
     * .
     *
     * The `Configuration` parameter is required for all other data sources.
     */
    override
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(CfnDataSource.DataSourceConfigurationProperty::unwrap))
    }

    /**
     * @param dataSourceConfiguration Configuration information for an Amazon Kendra data source.
     * The contents of the configuration depend on the type of data source. You can only specify one
     * type of data source in the configuration.
     *
     * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM`
     * .
     *
     * The `Configuration` parameter is required for all other data sources.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec157f003c905715a686cc1bdfdfb78d9e147be840e23eb7b6b3cd78b8bb88e6")
    override
        fun dataSourceConfiguration(dataSourceConfiguration: CfnDataSource.DataSourceConfigurationProperty.Builder.() -> Unit):
        Unit =
        dataSourceConfiguration(CfnDataSource.DataSourceConfigurationProperty(dataSourceConfiguration))

    /**
     * @param description A description for the data source connector.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param indexId The identifier of the index you want to use with the data source connector. 
     */
    override fun indexId(indexId: String) {
      cdkBuilder.indexId(indexId)
    }

    /**
     * @param languageCode The code for a language.
     * This shows a supported language for all documents in the data source. English is supported by
     * default. For more information on supported languages, including their codes, see [Adding
     * documents in languages other than
     * English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html) .
     */
    override fun languageCode(languageCode: String) {
      cdkBuilder.languageCode(languageCode)
    }

    /**
     * @param name The name of the data source. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of a role with permission to access the data
     * source.
     * You can't specify the `RoleArn` parameter when the `Type` parameter is set to `CUSTOM` .
     *
     * The `RoleArn` parameter is required for all other data sources.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param schedule Sets the frequency that Amazon Kendra checks the documents in your data
     * source and updates the index.
     * If you don't set a schedule, Amazon Kendra doesn't periodically update the index.
     */
    override fun schedule(schedule: String) {
      cdkBuilder.schedule(schedule)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The type of the data source. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.kendra.CfnDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kendra.CfnDataSourceProps,
  ) : CdkObject(cdkObject), CfnDataSourceProps {
    /**
     * Configuration information for altering document metadata and content during the document
     * ingestion process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-customdocumentenrichmentconfiguration)
     */
    override fun customDocumentEnrichmentConfiguration(): Any? =
        unwrap(this).getCustomDocumentEnrichmentConfiguration()

    /**
     * Configuration information for an Amazon Kendra data source.
     *
     * The contents of the configuration depend on the type of data source. You can only specify one
     * type of data source in the configuration.
     *
     * You can't specify the `Configuration` parameter when the `Type` parameter is set to `CUSTOM`
     * .
     *
     * The `Configuration` parameter is required for all other data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-datasourceconfiguration)
     */
    override fun dataSourceConfiguration(): Any? = unwrap(this).getDataSourceConfiguration()

    /**
     * A description for the data source connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The identifier of the index you want to use with the data source connector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-indexid)
     */
    override fun indexId(): String = unwrap(this).getIndexId()

    /**
     * The code for a language.
     *
     * This shows a supported language for all documents in the data source. English is supported by
     * default. For more information on supported languages, including their codes, see [Adding
     * documents in languages other than
     * English](https://docs.aws.amazon.com/kendra/latest/dg/in-adding-languages.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-languagecode)
     */
    override fun languageCode(): String? = unwrap(this).getLanguageCode()

    /**
     * The name of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) of a role with permission to access the data source.
     *
     * You can't specify the `RoleArn` parameter when the `Type` parameter is set to `CUSTOM` .
     *
     * The `RoleArn` parameter is required for all other data sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * Sets the frequency that Amazon Kendra checks the documents in your data source and updates
     * the index.
     *
     * If you don't set a schedule, Amazon Kendra doesn't periodically update the index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-schedule)
     */
    override fun schedule(): String? = unwrap(this).getSchedule()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of the data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kendra-datasource.html#cfn-kendra-datasource-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSourceProps):
        CfnDataSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataSourceProps):
        software.amazon.awscdk.services.kendra.CfnDataSourceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.kendra.CfnDataSourceProps
  }
}
