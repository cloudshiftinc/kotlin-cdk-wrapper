package io.cloudshiftdev.awscdk.services.kendra

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun customDocumentEnrichmentConfiguration(): Any? =
      unwrap(this).getCustomDocumentEnrichmentConfiguration()

  public open fun customDocumentEnrichmentConfiguration(`value`: IResolvable) {
    unwrap(this).setCustomDocumentEnrichmentConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun customDocumentEnrichmentConfiguration(`value`: CustomDocumentEnrichmentConfigurationProperty) {
    unwrap(this).setCustomDocumentEnrichmentConfiguration(`value`.let(CustomDocumentEnrichmentConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a4ca08a04153bd5a6977617c222c40b1c90c209434779da80b97206cef6b0bd3")
  public open
      fun customDocumentEnrichmentConfiguration(`value`: CustomDocumentEnrichmentConfigurationProperty.Builder.() -> Unit):
      Unit =
      customDocumentEnrichmentConfiguration(CustomDocumentEnrichmentConfigurationProperty(`value`))

  public open fun dataSourceConfiguration(): Any? = unwrap(this).getDataSourceConfiguration()

  public open fun dataSourceConfiguration(`value`: IResolvable) {
    unwrap(this).setDataSourceConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun dataSourceConfiguration(`value`: DataSourceConfigurationProperty) {
    unwrap(this).setDataSourceConfiguration(`value`.let(DataSourceConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e25b7ed5f0c2564b4215fca214d2846aa61a129e90a366c97a90dfab9cb81eca")
  public open
      fun dataSourceConfiguration(`value`: DataSourceConfigurationProperty.Builder.() -> Unit): Unit
      = dataSourceConfiguration(DataSourceConfigurationProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun indexId(): String = unwrap(this).getIndexId()

  public open fun indexId(`value`: String) {
    unwrap(this).setIndexId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun languageCode(): String? = unwrap(this).getLanguageCode()

  public open fun languageCode(`value`: String) {
    unwrap(this).setLanguageCode(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun schedule(): String? = unwrap(this).getSchedule()

  public open fun schedule(`value`: String) {
    unwrap(this).setSchedule(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public interface Builder {
    public
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: IResolvable)

    public
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CustomDocumentEnrichmentConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09a24b55237400780b4036c110934fe50e5d4eee1f31ff47c56735f466c92960")
    public
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CustomDocumentEnrichmentConfigurationProperty.Builder.() -> Unit)

    public fun dataSourceConfiguration(dataSourceConfiguration: IResolvable)

    public fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feac19ef158c17713136dc6e927a341682e4c0881325337d9e9743c12659145f")
    public
        fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun indexId(indexId: String)

    public fun languageCode(languageCode: String)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun schedule(schedule: String)

    public fun tags(tags: List<CfnTag>)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnDataSource.Builder =
        software.amazon.awscdk.services.kendra.CfnDataSource.Builder.create(scope, id)

    override
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: IResolvable) {
      cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration.let(IResolvable::unwrap))
    }

    override
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CustomDocumentEnrichmentConfigurationProperty) {
      cdkBuilder.customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration.let(CustomDocumentEnrichmentConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09a24b55237400780b4036c110934fe50e5d4eee1f31ff47c56735f466c92960")
    override
        fun customDocumentEnrichmentConfiguration(customDocumentEnrichmentConfiguration: CustomDocumentEnrichmentConfigurationProperty.Builder.() -> Unit):
        Unit =
        customDocumentEnrichmentConfiguration(CustomDocumentEnrichmentConfigurationProperty(customDocumentEnrichmentConfiguration))

    override fun dataSourceConfiguration(dataSourceConfiguration: IResolvable) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(IResolvable::unwrap))
    }

    override fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty) {
      cdkBuilder.dataSourceConfiguration(dataSourceConfiguration.let(DataSourceConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feac19ef158c17713136dc6e927a341682e4c0881325337d9e9743c12659145f")
    override
        fun dataSourceConfiguration(dataSourceConfiguration: DataSourceConfigurationProperty.Builder.() -> Unit):
        Unit = dataSourceConfiguration(DataSourceConfigurationProperty(dataSourceConfiguration))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun indexId(indexId: String) {
      cdkBuilder.indexId(indexId)
    }

    override fun languageCode(languageCode: String) {
      cdkBuilder.languageCode(languageCode)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun schedule(schedule: String) {
      cdkBuilder.schedule(schedule)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.kendra.CfnDataSource = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource):
        CfnDataSource = CfnDataSource(cdkObject)

    internal fun unwrap(wrapped: CfnDataSource):
        software.amazon.awscdk.services.kendra.CfnDataSource = wrapped.cdkObject
  }

  public interface DataSourceVpcConfigurationProperty {
    public fun securityGroupIds(): List<String>

    public fun subnetIds(): List<String>

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun subnetIds(subnetIds: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty,
    ) : DataSourceVpcConfigurationProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataSourceVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty):
          DataSourceVpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceVpcConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceVpcConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SharePointConfigurationProperty {
    public fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

    public fun disableLocalGroups(): Any? = unwrap(this).getDisableLocalGroups()

    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    public fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
        emptyList()

    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    public fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
        emptyList()

    public fun secretArn(): String

    public fun sharePointVersion(): String

    public fun sslCertificateS3Path(): Any? = unwrap(this).getSslCertificateS3Path()

    public fun urls(): List<String>

    public fun useChangeLog(): Any? = unwrap(this).getUseChangeLog()

    public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

    public interface Builder {
      public fun crawlAttachments(crawlAttachments: Boolean)

      public fun crawlAttachments(crawlAttachments: IResolvable)

      public fun disableLocalGroups(disableLocalGroups: Boolean)

      public fun disableLocalGroups(disableLocalGroups: IResolvable)

      public fun documentTitleFieldName(documentTitleFieldName: String)

      public fun exclusionPatterns(exclusionPatterns: List<String>)

      public fun fieldMappings(fieldMappings: IResolvable)

      public fun fieldMappings(fieldMappings: List<Any>)

      public fun inclusionPatterns(inclusionPatterns: List<String>)

      public fun secretArn(secretArn: String)

      public fun sharePointVersion(sharePointVersion: String)

      public fun sslCertificateS3Path(sslCertificateS3Path: IResolvable)

      public fun sslCertificateS3Path(sslCertificateS3Path: S3PathProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2127e493613bd538dabcc5b42d3edd169d9f2c98a2067b34e2faeb5848504144")
      public fun sslCertificateS3Path(sslCertificateS3Path: S3PathProperty.Builder.() -> Unit)

      public fun urls(urls: List<String>)

      public fun useChangeLog(useChangeLog: Boolean)

      public fun useChangeLog(useChangeLog: IResolvable)

      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      public fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b23baf699d4733b7ee2ece45ce9c72df4129e855c5c040cbeaa1a3d84f649f1f")
      public
          fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty.builder()

      override fun crawlAttachments(crawlAttachments: Boolean) {
        cdkBuilder.crawlAttachments(crawlAttachments)
      }

      override fun crawlAttachments(crawlAttachments: IResolvable) {
        cdkBuilder.crawlAttachments(crawlAttachments.let(IResolvable::unwrap))
      }

      override fun disableLocalGroups(disableLocalGroups: Boolean) {
        cdkBuilder.disableLocalGroups(disableLocalGroups)
      }

      override fun disableLocalGroups(disableLocalGroups: IResolvable) {
        cdkBuilder.disableLocalGroups(disableLocalGroups.let(IResolvable::unwrap))
      }

      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      override fun exclusionPatterns(exclusionPatterns: List<String>) {
        cdkBuilder.exclusionPatterns(exclusionPatterns)
      }

      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      override fun inclusionPatterns(inclusionPatterns: List<String>) {
        cdkBuilder.inclusionPatterns(inclusionPatterns)
      }

      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      override fun sharePointVersion(sharePointVersion: String) {
        cdkBuilder.sharePointVersion(sharePointVersion)
      }

      override fun sslCertificateS3Path(sslCertificateS3Path: IResolvable) {
        cdkBuilder.sslCertificateS3Path(sslCertificateS3Path.let(IResolvable::unwrap))
      }

      override fun sslCertificateS3Path(sslCertificateS3Path: S3PathProperty) {
        cdkBuilder.sslCertificateS3Path(sslCertificateS3Path.let(S3PathProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2127e493613bd538dabcc5b42d3edd169d9f2c98a2067b34e2faeb5848504144")
      override fun sslCertificateS3Path(sslCertificateS3Path: S3PathProperty.Builder.() -> Unit):
          Unit = sslCertificateS3Path(S3PathProperty(sslCertificateS3Path))

      override fun urls(urls: List<String>) {
        cdkBuilder.urls(urls)
      }

      override fun useChangeLog(useChangeLog: Boolean) {
        cdkBuilder.useChangeLog(useChangeLog)
      }

      override fun useChangeLog(useChangeLog: IResolvable) {
        cdkBuilder.useChangeLog(useChangeLog.let(IResolvable::unwrap))
      }

      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      override fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(DataSourceVpcConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b23baf699d4733b7ee2ece45ce9c72df4129e855c5c040cbeaa1a3d84f649f1f")
      override
          fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(DataSourceVpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty,
    ) : SharePointConfigurationProperty {
      override fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

      override fun disableLocalGroups(): Any? = unwrap(this).getDisableLocalGroups()

      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      override fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
          emptyList()

      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      override fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
          emptyList()

      override fun secretArn(): String = unwrap(this).getSecretArn()

      override fun sharePointVersion(): String = unwrap(this).getSharePointVersion()

      override fun sslCertificateS3Path(): Any? = unwrap(this).getSslCertificateS3Path()

      override fun urls(): List<String> = unwrap(this).getUrls() ?: emptyList()

      override fun useChangeLog(): Any? = unwrap(this).getUseChangeLog()

      override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SharePointConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty):
          SharePointConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SharePointConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SharePointConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface WebCrawlerConfigurationProperty {
    public fun authenticationConfiguration(): Any? = unwrap(this).getAuthenticationConfiguration()

    public fun crawlDepth(): Number? = unwrap(this).getCrawlDepth()

    public fun maxContentSizePerPageInMegaBytes(): Number? =
        unwrap(this).getMaxContentSizePerPageInMegaBytes()

    public fun maxLinksPerPage(): Number? = unwrap(this).getMaxLinksPerPage()

    public fun maxUrlsPerMinuteCrawlRate(): Number? = unwrap(this).getMaxUrlsPerMinuteCrawlRate()

    public fun proxyConfiguration(): Any? = unwrap(this).getProxyConfiguration()

    public fun urlExclusionPatterns(): List<String> = unwrap(this).getUrlExclusionPatterns() ?:
        emptyList()

    public fun urlInclusionPatterns(): List<String> = unwrap(this).getUrlInclusionPatterns() ?:
        emptyList()

    public fun urls(): Any

    public interface Builder {
      public fun authenticationConfiguration(authenticationConfiguration: IResolvable)

      public
          fun authenticationConfiguration(authenticationConfiguration: WebCrawlerAuthenticationConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9375cd609ac8ce64ac0fc38e414d174cee4fda680c1fbc196c808540d4bcb44")
      public
          fun authenticationConfiguration(authenticationConfiguration: WebCrawlerAuthenticationConfigurationProperty.Builder.() -> Unit)

      public fun crawlDepth(crawlDepth: Number)

      public fun maxContentSizePerPageInMegaBytes(maxContentSizePerPageInMegaBytes: Number)

      public fun maxLinksPerPage(maxLinksPerPage: Number)

      public fun maxUrlsPerMinuteCrawlRate(maxUrlsPerMinuteCrawlRate: Number)

      public fun proxyConfiguration(proxyConfiguration: IResolvable)

      public fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ce8baf561a2460e7a66d6a6a4fd470f85e30b1d5ffb8009028dcff89fc3f74e")
      public
          fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty.Builder.() -> Unit)

      public fun urlExclusionPatterns(urlExclusionPatterns: List<String>)

      public fun urlInclusionPatterns(urlInclusionPatterns: List<String>)

      public fun urls(urls: IResolvable)

      public fun urls(urls: WebCrawlerUrlsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89c4546fdcecabe3d16ebadb3808f7692f825e5692f249b5b0d55db6cf17fd68")
      public fun urls(urls: WebCrawlerUrlsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty.builder()

      override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable::unwrap))
      }

      override
          fun authenticationConfiguration(authenticationConfiguration: WebCrawlerAuthenticationConfigurationProperty) {
        cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(WebCrawlerAuthenticationConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d9375cd609ac8ce64ac0fc38e414d174cee4fda680c1fbc196c808540d4bcb44")
      override
          fun authenticationConfiguration(authenticationConfiguration: WebCrawlerAuthenticationConfigurationProperty.Builder.() -> Unit):
          Unit =
          authenticationConfiguration(WebCrawlerAuthenticationConfigurationProperty(authenticationConfiguration))

      override fun crawlDepth(crawlDepth: Number) {
        cdkBuilder.crawlDepth(crawlDepth)
      }

      override fun maxContentSizePerPageInMegaBytes(maxContentSizePerPageInMegaBytes: Number) {
        cdkBuilder.maxContentSizePerPageInMegaBytes(maxContentSizePerPageInMegaBytes)
      }

      override fun maxLinksPerPage(maxLinksPerPage: Number) {
        cdkBuilder.maxLinksPerPage(maxLinksPerPage)
      }

      override fun maxUrlsPerMinuteCrawlRate(maxUrlsPerMinuteCrawlRate: Number) {
        cdkBuilder.maxUrlsPerMinuteCrawlRate(maxUrlsPerMinuteCrawlRate)
      }

      override fun proxyConfiguration(proxyConfiguration: IResolvable) {
        cdkBuilder.proxyConfiguration(proxyConfiguration.let(IResolvable::unwrap))
      }

      override fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty) {
        cdkBuilder.proxyConfiguration(proxyConfiguration.let(ProxyConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ce8baf561a2460e7a66d6a6a4fd470f85e30b1d5ffb8009028dcff89fc3f74e")
      override
          fun proxyConfiguration(proxyConfiguration: ProxyConfigurationProperty.Builder.() -> Unit):
          Unit = proxyConfiguration(ProxyConfigurationProperty(proxyConfiguration))

      override fun urlExclusionPatterns(urlExclusionPatterns: List<String>) {
        cdkBuilder.urlExclusionPatterns(urlExclusionPatterns)
      }

      override fun urlInclusionPatterns(urlInclusionPatterns: List<String>) {
        cdkBuilder.urlInclusionPatterns(urlInclusionPatterns)
      }

      override fun urls(urls: IResolvable) {
        cdkBuilder.urls(urls.let(IResolvable::unwrap))
      }

      override fun urls(urls: WebCrawlerUrlsProperty) {
        cdkBuilder.urls(urls.let(WebCrawlerUrlsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("89c4546fdcecabe3d16ebadb3808f7692f825e5692f249b5b0d55db6cf17fd68")
      override fun urls(urls: WebCrawlerUrlsProperty.Builder.() -> Unit): Unit =
          urls(WebCrawlerUrlsProperty(urls))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty,
    ) : WebCrawlerConfigurationProperty {
      override fun authenticationConfiguration(): Any? =
          unwrap(this).getAuthenticationConfiguration()

      override fun crawlDepth(): Number? = unwrap(this).getCrawlDepth()

      override fun maxContentSizePerPageInMegaBytes(): Number? =
          unwrap(this).getMaxContentSizePerPageInMegaBytes()

      override fun maxLinksPerPage(): Number? = unwrap(this).getMaxLinksPerPage()

      override fun maxUrlsPerMinuteCrawlRate(): Number? =
          unwrap(this).getMaxUrlsPerMinuteCrawlRate()

      override fun proxyConfiguration(): Any? = unwrap(this).getProxyConfiguration()

      override fun urlExclusionPatterns(): List<String> = unwrap(this).getUrlExclusionPatterns() ?:
          emptyList()

      override fun urlInclusionPatterns(): List<String> = unwrap(this).getUrlInclusionPatterns() ?:
          emptyList()

      override fun urls(): Any = unwrap(this).getUrls()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WebCrawlerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty):
          WebCrawlerConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebCrawlerConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DocumentAttributeConditionProperty {
    public fun conditionDocumentAttributeKey(): String

    public fun conditionOnValue(): Any? = unwrap(this).getConditionOnValue()

    public fun `operator`(): String

    public interface Builder {
      public fun conditionDocumentAttributeKey(conditionDocumentAttributeKey: String)

      public fun conditionOnValue(conditionOnValue: IResolvable)

      public fun conditionOnValue(conditionOnValue: DocumentAttributeValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("285b669c46af63d22de26994b154bd53be93f4c75d0166c78845717e213f8bad")
      public
          fun conditionOnValue(conditionOnValue: DocumentAttributeValueProperty.Builder.() -> Unit)

      public fun `operator`(`operator`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeConditionProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeConditionProperty.builder()

      override fun conditionDocumentAttributeKey(conditionDocumentAttributeKey: String) {
        cdkBuilder.conditionDocumentAttributeKey(conditionDocumentAttributeKey)
      }

      override fun conditionOnValue(conditionOnValue: IResolvable) {
        cdkBuilder.conditionOnValue(conditionOnValue.let(IResolvable::unwrap))
      }

      override fun conditionOnValue(conditionOnValue: DocumentAttributeValueProperty) {
        cdkBuilder.conditionOnValue(conditionOnValue.let(DocumentAttributeValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("285b669c46af63d22de26994b154bd53be93f4c75d0166c78845717e213f8bad")
      override
          fun conditionOnValue(conditionOnValue: DocumentAttributeValueProperty.Builder.() -> Unit):
          Unit = conditionOnValue(DocumentAttributeValueProperty(conditionOnValue))

      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeConditionProperty,
    ) : DocumentAttributeConditionProperty {
      override fun conditionDocumentAttributeKey(): String =
          unwrap(this).getConditionDocumentAttributeKey()

      override fun conditionOnValue(): Any? = unwrap(this).getConditionOnValue()

      override fun `operator`(): String = unwrap(this).getOperator()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentAttributeConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeConditionProperty):
          DocumentAttributeConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentAttributeConditionProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeConditionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConfluencePageConfigurationProperty {
    public fun pageFieldMappings(): Any? = unwrap(this).getPageFieldMappings()

    public interface Builder {
      public fun pageFieldMappings(pageFieldMappings: IResolvable)

      public fun pageFieldMappings(pageFieldMappings: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty.builder()

      override fun pageFieldMappings(pageFieldMappings: IResolvable) {
        cdkBuilder.pageFieldMappings(pageFieldMappings.let(IResolvable::unwrap))
      }

      override fun pageFieldMappings(pageFieldMappings: List<Any>) {
        cdkBuilder.pageFieldMappings(pageFieldMappings)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty,
    ) : ConfluencePageConfigurationProperty {
      override fun pageFieldMappings(): Any? = unwrap(this).getPageFieldMappings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluencePageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty):
          ConfluencePageConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluencePageConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConfluenceSpaceConfigurationProperty {
    public fun crawlArchivedSpaces(): Any? = unwrap(this).getCrawlArchivedSpaces()

    public fun crawlPersonalSpaces(): Any? = unwrap(this).getCrawlPersonalSpaces()

    public fun excludeSpaces(): List<String> = unwrap(this).getExcludeSpaces() ?: emptyList()

    public fun includeSpaces(): List<String> = unwrap(this).getIncludeSpaces() ?: emptyList()

    public fun spaceFieldMappings(): Any? = unwrap(this).getSpaceFieldMappings()

    public interface Builder {
      public fun crawlArchivedSpaces(crawlArchivedSpaces: Boolean)

      public fun crawlArchivedSpaces(crawlArchivedSpaces: IResolvable)

      public fun crawlPersonalSpaces(crawlPersonalSpaces: Boolean)

      public fun crawlPersonalSpaces(crawlPersonalSpaces: IResolvable)

      public fun excludeSpaces(excludeSpaces: List<String>)

      public fun includeSpaces(includeSpaces: List<String>)

      public fun spaceFieldMappings(spaceFieldMappings: IResolvable)

      public fun spaceFieldMappings(spaceFieldMappings: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty.builder()

      override fun crawlArchivedSpaces(crawlArchivedSpaces: Boolean) {
        cdkBuilder.crawlArchivedSpaces(crawlArchivedSpaces)
      }

      override fun crawlArchivedSpaces(crawlArchivedSpaces: IResolvable) {
        cdkBuilder.crawlArchivedSpaces(crawlArchivedSpaces.let(IResolvable::unwrap))
      }

      override fun crawlPersonalSpaces(crawlPersonalSpaces: Boolean) {
        cdkBuilder.crawlPersonalSpaces(crawlPersonalSpaces)
      }

      override fun crawlPersonalSpaces(crawlPersonalSpaces: IResolvable) {
        cdkBuilder.crawlPersonalSpaces(crawlPersonalSpaces.let(IResolvable::unwrap))
      }

      override fun excludeSpaces(excludeSpaces: List<String>) {
        cdkBuilder.excludeSpaces(excludeSpaces)
      }

      override fun includeSpaces(includeSpaces: List<String>) {
        cdkBuilder.includeSpaces(includeSpaces)
      }

      override fun spaceFieldMappings(spaceFieldMappings: IResolvable) {
        cdkBuilder.spaceFieldMappings(spaceFieldMappings.let(IResolvable::unwrap))
      }

      override fun spaceFieldMappings(spaceFieldMappings: List<Any>) {
        cdkBuilder.spaceFieldMappings(spaceFieldMappings)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty,
    ) : ConfluenceSpaceConfigurationProperty {
      override fun crawlArchivedSpaces(): Any? = unwrap(this).getCrawlArchivedSpaces()

      override fun crawlPersonalSpaces(): Any? = unwrap(this).getCrawlPersonalSpaces()

      override fun excludeSpaces(): List<String> = unwrap(this).getExcludeSpaces() ?: emptyList()

      override fun includeSpaces(): List<String> = unwrap(this).getIncludeSpaces() ?: emptyList()

      override fun spaceFieldMappings(): Any? = unwrap(this).getSpaceFieldMappings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluenceSpaceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty):
          ConfluenceSpaceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceSpaceConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ServiceNowConfigurationProperty {
    public fun authenticationType(): String? = unwrap(this).getAuthenticationType()

    public fun hostUrl(): String

    public fun knowledgeArticleConfiguration(): Any? =
        unwrap(this).getKnowledgeArticleConfiguration()

    public fun secretArn(): String

    public fun serviceCatalogConfiguration(): Any? = unwrap(this).getServiceCatalogConfiguration()

    public fun serviceNowBuildVersion(): String

    public interface Builder {
      public fun authenticationType(authenticationType: String)

      public fun hostUrl(hostUrl: String)

      public fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: IResolvable)

      public
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: ServiceNowKnowledgeArticleConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7dff183ee3b02978e1302255425930d8fea7d80745b0c3f3c3b26f43dd458b7f")
      public
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: ServiceNowKnowledgeArticleConfigurationProperty.Builder.() -> Unit)

      public fun secretArn(secretArn: String)

      public fun serviceCatalogConfiguration(serviceCatalogConfiguration: IResolvable)

      public
          fun serviceCatalogConfiguration(serviceCatalogConfiguration: ServiceNowServiceCatalogConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2279aa4b9e87d489a0b396992572b5ff2ec71a23436393be77757e9500ca350f")
      public
          fun serviceCatalogConfiguration(serviceCatalogConfiguration: ServiceNowServiceCatalogConfigurationProperty.Builder.() -> Unit)

      public fun serviceNowBuildVersion(serviceNowBuildVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty.builder()

      override fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
      }

      override fun hostUrl(hostUrl: String) {
        cdkBuilder.hostUrl(hostUrl)
      }

      override fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: IResolvable) {
        cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration.let(IResolvable::unwrap))
      }

      override
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: ServiceNowKnowledgeArticleConfigurationProperty) {
        cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration.let(ServiceNowKnowledgeArticleConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7dff183ee3b02978e1302255425930d8fea7d80745b0c3f3c3b26f43dd458b7f")
      override
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: ServiceNowKnowledgeArticleConfigurationProperty.Builder.() -> Unit):
          Unit =
          knowledgeArticleConfiguration(ServiceNowKnowledgeArticleConfigurationProperty(knowledgeArticleConfiguration))

      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      override fun serviceCatalogConfiguration(serviceCatalogConfiguration: IResolvable) {
        cdkBuilder.serviceCatalogConfiguration(serviceCatalogConfiguration.let(IResolvable::unwrap))
      }

      override
          fun serviceCatalogConfiguration(serviceCatalogConfiguration: ServiceNowServiceCatalogConfigurationProperty) {
        cdkBuilder.serviceCatalogConfiguration(serviceCatalogConfiguration.let(ServiceNowServiceCatalogConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2279aa4b9e87d489a0b396992572b5ff2ec71a23436393be77757e9500ca350f")
      override
          fun serviceCatalogConfiguration(serviceCatalogConfiguration: ServiceNowServiceCatalogConfigurationProperty.Builder.() -> Unit):
          Unit =
          serviceCatalogConfiguration(ServiceNowServiceCatalogConfigurationProperty(serviceCatalogConfiguration))

      override fun serviceNowBuildVersion(serviceNowBuildVersion: String) {
        cdkBuilder.serviceNowBuildVersion(serviceNowBuildVersion)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty,
    ) : ServiceNowConfigurationProperty {
      override fun authenticationType(): String? = unwrap(this).getAuthenticationType()

      override fun hostUrl(): String = unwrap(this).getHostUrl()

      override fun knowledgeArticleConfiguration(): Any? =
          unwrap(this).getKnowledgeArticleConfiguration()

      override fun secretArn(): String = unwrap(this).getSecretArn()

      override fun serviceCatalogConfiguration(): Any? =
          unwrap(this).getServiceCatalogConfiguration()

      override fun serviceNowBuildVersion(): String = unwrap(this).getServiceNowBuildVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ServiceNowConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty):
          ServiceNowConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceNowConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface WebCrawlerAuthenticationConfigurationProperty {
    public fun basicAuthentication(): Any? = unwrap(this).getBasicAuthentication()

    public interface Builder {
      public fun basicAuthentication(basicAuthentication: IResolvable)

      public fun basicAuthentication(basicAuthentication: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty.builder()

      override fun basicAuthentication(basicAuthentication: IResolvable) {
        cdkBuilder.basicAuthentication(basicAuthentication.let(IResolvable::unwrap))
      }

      override fun basicAuthentication(basicAuthentication: List<Any>) {
        cdkBuilder.basicAuthentication(basicAuthentication)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty,
    ) : WebCrawlerAuthenticationConfigurationProperty {
      override fun basicAuthentication(): Any? = unwrap(this).getBasicAuthentication()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          WebCrawlerAuthenticationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty):
          WebCrawlerAuthenticationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebCrawlerAuthenticationConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerAuthenticationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DocumentAttributeTargetProperty {
    public fun targetDocumentAttributeKey(): String

    public fun targetDocumentAttributeValue(): Any? = unwrap(this).getTargetDocumentAttributeValue()

    public fun targetDocumentAttributeValueDeletion(): Any? =
        unwrap(this).getTargetDocumentAttributeValueDeletion()

    public interface Builder {
      public fun targetDocumentAttributeKey(targetDocumentAttributeKey: String)

      public fun targetDocumentAttributeValue(targetDocumentAttributeValue: IResolvable)

      public
          fun targetDocumentAttributeValue(targetDocumentAttributeValue: DocumentAttributeValueProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("774f20a498c29bf09d11321926ba0c355f86d6248d70891bb628bc865d6fb5d2")
      public
          fun targetDocumentAttributeValue(targetDocumentAttributeValue: DocumentAttributeValueProperty.Builder.() -> Unit)

      public fun targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion: Boolean)

      public
          fun targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeTargetProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeTargetProperty.builder()

      override fun targetDocumentAttributeKey(targetDocumentAttributeKey: String) {
        cdkBuilder.targetDocumentAttributeKey(targetDocumentAttributeKey)
      }

      override fun targetDocumentAttributeValue(targetDocumentAttributeValue: IResolvable) {
        cdkBuilder.targetDocumentAttributeValue(targetDocumentAttributeValue.let(IResolvable::unwrap))
      }

      override
          fun targetDocumentAttributeValue(targetDocumentAttributeValue: DocumentAttributeValueProperty) {
        cdkBuilder.targetDocumentAttributeValue(targetDocumentAttributeValue.let(DocumentAttributeValueProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("774f20a498c29bf09d11321926ba0c355f86d6248d70891bb628bc865d6fb5d2")
      override
          fun targetDocumentAttributeValue(targetDocumentAttributeValue: DocumentAttributeValueProperty.Builder.() -> Unit):
          Unit =
          targetDocumentAttributeValue(DocumentAttributeValueProperty(targetDocumentAttributeValue))

      override
          fun targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion: Boolean) {
        cdkBuilder.targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion)
      }

      override
          fun targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion: IResolvable) {
        cdkBuilder.targetDocumentAttributeValueDeletion(targetDocumentAttributeValueDeletion.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeTargetProperty,
    ) : DocumentAttributeTargetProperty {
      override fun targetDocumentAttributeKey(): String =
          unwrap(this).getTargetDocumentAttributeKey()

      override fun targetDocumentAttributeValue(): Any? =
          unwrap(this).getTargetDocumentAttributeValue()

      override fun targetDocumentAttributeValueDeletion(): Any? =
          unwrap(this).getTargetDocumentAttributeValueDeletion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentAttributeTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeTargetProperty):
          DocumentAttributeTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentAttributeTargetProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeTargetProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SalesforceKnowledgeArticleConfigurationProperty {
    public fun customKnowledgeArticleTypeConfigurations(): Any? =
        unwrap(this).getCustomKnowledgeArticleTypeConfigurations()

    public fun includedStates(): List<String>

    public fun standardKnowledgeArticleTypeConfiguration(): Any? =
        unwrap(this).getStandardKnowledgeArticleTypeConfiguration()

    public interface Builder {
      public
          fun customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations: IResolvable)

      public
          fun customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations: List<Any>)

      public fun includedStates(includedStates: List<String>)

      public
          fun standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration: IResolvable)

      public
          fun standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration: SalesforceStandardKnowledgeArticleTypeConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46ca786b35ab5c6f82a4b8e6b9acd488d12446293d97a931e164dbb8f825d79c")
      public
          fun standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration: SalesforceStandardKnowledgeArticleTypeConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty.builder()

      override
          fun customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations: IResolvable) {
        cdkBuilder.customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations.let(IResolvable::unwrap))
      }

      override
          fun customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations: List<Any>) {
        cdkBuilder.customKnowledgeArticleTypeConfigurations(customKnowledgeArticleTypeConfigurations)
      }

      override fun includedStates(includedStates: List<String>) {
        cdkBuilder.includedStates(includedStates)
      }

      override
          fun standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration: IResolvable) {
        cdkBuilder.standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration.let(IResolvable::unwrap))
      }

      override
          fun standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration: SalesforceStandardKnowledgeArticleTypeConfigurationProperty) {
        cdkBuilder.standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration.let(SalesforceStandardKnowledgeArticleTypeConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("46ca786b35ab5c6f82a4b8e6b9acd488d12446293d97a931e164dbb8f825d79c")
      override
          fun standardKnowledgeArticleTypeConfiguration(standardKnowledgeArticleTypeConfiguration: SalesforceStandardKnowledgeArticleTypeConfigurationProperty.Builder.() -> Unit):
          Unit =
          standardKnowledgeArticleTypeConfiguration(SalesforceStandardKnowledgeArticleTypeConfigurationProperty(standardKnowledgeArticleTypeConfiguration))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty,
    ) : SalesforceKnowledgeArticleConfigurationProperty {
      override fun customKnowledgeArticleTypeConfigurations(): Any? =
          unwrap(this).getCustomKnowledgeArticleTypeConfigurations()

      override fun includedStates(): List<String> = unwrap(this).getIncludedStates() ?: emptyList()

      override fun standardKnowledgeArticleTypeConfiguration(): Any? =
          unwrap(this).getStandardKnowledgeArticleTypeConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceKnowledgeArticleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty):
          SalesforceKnowledgeArticleConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceKnowledgeArticleConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceKnowledgeArticleConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TemplateConfigurationProperty {
    public fun template(): String

    public interface Builder {
      public fun template(template: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.TemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.TemplateConfigurationProperty.builder()

      override fun template(template: String) {
        cdkBuilder.template(template)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.TemplateConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.TemplateConfigurationProperty,
    ) : TemplateConfigurationProperty {
      override fun template(): String = unwrap(this).getTemplate()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.TemplateConfigurationProperty):
          TemplateConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TemplateConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.TemplateConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface HookConfigurationProperty {
    public fun invocationCondition(): Any? = unwrap(this).getInvocationCondition()

    public fun lambdaArn(): String

    public fun s3Bucket(): String

    public interface Builder {
      public fun invocationCondition(invocationCondition: IResolvable)

      public fun invocationCondition(invocationCondition: DocumentAttributeConditionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82d73a148b5aa5a0fd24a5f19521070ac2298b04b99e5383a60507c731d552fa")
      public
          fun invocationCondition(invocationCondition: DocumentAttributeConditionProperty.Builder.() -> Unit)

      public fun lambdaArn(lambdaArn: String)

      public fun s3Bucket(s3Bucket: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.HookConfigurationProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.HookConfigurationProperty.builder()

      override fun invocationCondition(invocationCondition: IResolvable) {
        cdkBuilder.invocationCondition(invocationCondition.let(IResolvable::unwrap))
      }

      override fun invocationCondition(invocationCondition: DocumentAttributeConditionProperty) {
        cdkBuilder.invocationCondition(invocationCondition.let(DocumentAttributeConditionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82d73a148b5aa5a0fd24a5f19521070ac2298b04b99e5383a60507c731d552fa")
      override
          fun invocationCondition(invocationCondition: DocumentAttributeConditionProperty.Builder.() -> Unit):
          Unit = invocationCondition(DocumentAttributeConditionProperty(invocationCondition))

      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.HookConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.HookConfigurationProperty,
    ) : HookConfigurationProperty {
      override fun invocationCondition(): Any? = unwrap(this).getInvocationCondition()

      override fun lambdaArn(): String = unwrap(this).getLambdaArn()

      override fun s3Bucket(): String = unwrap(this).getS3Bucket()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HookConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.HookConfigurationProperty):
          HookConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HookConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.HookConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface SalesforceCustomKnowledgeArticleTypeConfigurationProperty {
    public fun documentDataFieldName(): String

    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    public fun name(): String

    public interface Builder {
      public fun documentDataFieldName(documentDataFieldName: String)

      public fun documentTitleFieldName(documentTitleFieldName: String)

      public fun fieldMappings(fieldMappings: IResolvable)

      public fun fieldMappings(fieldMappings: List<Any>)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty.builder()

      override fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
      }

      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty,
    ) : SalesforceCustomKnowledgeArticleTypeConfigurationProperty {
      override fun documentDataFieldName(): String = unwrap(this).getDocumentDataFieldName()

      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceCustomKnowledgeArticleTypeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty):
          SalesforceCustomKnowledgeArticleTypeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceCustomKnowledgeArticleTypeConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConfluenceConfigurationProperty {
    public fun attachmentConfiguration(): Any? = unwrap(this).getAttachmentConfiguration()

    public fun blogConfiguration(): Any? = unwrap(this).getBlogConfiguration()

    public fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
        emptyList()

    public fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
        emptyList()

    public fun pageConfiguration(): Any? = unwrap(this).getPageConfiguration()

    public fun secretArn(): String

    public fun serverUrl(): String

    public fun spaceConfiguration(): Any? = unwrap(this).getSpaceConfiguration()

    public fun version(): String

    public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

    public interface Builder {
      public fun attachmentConfiguration(attachmentConfiguration: IResolvable)

      public
          fun attachmentConfiguration(attachmentConfiguration: ConfluenceAttachmentConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a93229e94c0a713647b91082f0d2734f6345754816985c19812aa93675a8ca4d")
      public
          fun attachmentConfiguration(attachmentConfiguration: ConfluenceAttachmentConfigurationProperty.Builder.() -> Unit)

      public fun blogConfiguration(blogConfiguration: IResolvable)

      public fun blogConfiguration(blogConfiguration: ConfluenceBlogConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("070d46cbf6cbda26dc2a798fafa2a64869e56ed765b1f8a3f39062df940a515e")
      public
          fun blogConfiguration(blogConfiguration: ConfluenceBlogConfigurationProperty.Builder.() -> Unit)

      public fun exclusionPatterns(exclusionPatterns: List<String>)

      public fun inclusionPatterns(inclusionPatterns: List<String>)

      public fun pageConfiguration(pageConfiguration: IResolvable)

      public fun pageConfiguration(pageConfiguration: ConfluencePageConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2817f144d572ac768d2a7fb4d11a22d4469a4dded7d9df3a788c1de0ec26a80f")
      public
          fun pageConfiguration(pageConfiguration: ConfluencePageConfigurationProperty.Builder.() -> Unit)

      public fun secretArn(secretArn: String)

      public fun serverUrl(serverUrl: String)

      public fun spaceConfiguration(spaceConfiguration: IResolvable)

      public fun spaceConfiguration(spaceConfiguration: ConfluenceSpaceConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49ba2bbc317db4f0cde9cb944797b99a0adcfebdaa1d5d8ec4748dca0830b906")
      public
          fun spaceConfiguration(spaceConfiguration: ConfluenceSpaceConfigurationProperty.Builder.() -> Unit)

      public fun version(version: String)

      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      public fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e3a149baf8e9e42acaf53635797748128816d30d56df2db6343cc8981ce503b")
      public
          fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty.builder()

      override fun attachmentConfiguration(attachmentConfiguration: IResolvable) {
        cdkBuilder.attachmentConfiguration(attachmentConfiguration.let(IResolvable::unwrap))
      }

      override
          fun attachmentConfiguration(attachmentConfiguration: ConfluenceAttachmentConfigurationProperty) {
        cdkBuilder.attachmentConfiguration(attachmentConfiguration.let(ConfluenceAttachmentConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a93229e94c0a713647b91082f0d2734f6345754816985c19812aa93675a8ca4d")
      override
          fun attachmentConfiguration(attachmentConfiguration: ConfluenceAttachmentConfigurationProperty.Builder.() -> Unit):
          Unit =
          attachmentConfiguration(ConfluenceAttachmentConfigurationProperty(attachmentConfiguration))

      override fun blogConfiguration(blogConfiguration: IResolvable) {
        cdkBuilder.blogConfiguration(blogConfiguration.let(IResolvable::unwrap))
      }

      override fun blogConfiguration(blogConfiguration: ConfluenceBlogConfigurationProperty) {
        cdkBuilder.blogConfiguration(blogConfiguration.let(ConfluenceBlogConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("070d46cbf6cbda26dc2a798fafa2a64869e56ed765b1f8a3f39062df940a515e")
      override
          fun blogConfiguration(blogConfiguration: ConfluenceBlogConfigurationProperty.Builder.() -> Unit):
          Unit = blogConfiguration(ConfluenceBlogConfigurationProperty(blogConfiguration))

      override fun exclusionPatterns(exclusionPatterns: List<String>) {
        cdkBuilder.exclusionPatterns(exclusionPatterns)
      }

      override fun inclusionPatterns(inclusionPatterns: List<String>) {
        cdkBuilder.inclusionPatterns(inclusionPatterns)
      }

      override fun pageConfiguration(pageConfiguration: IResolvable) {
        cdkBuilder.pageConfiguration(pageConfiguration.let(IResolvable::unwrap))
      }

      override fun pageConfiguration(pageConfiguration: ConfluencePageConfigurationProperty) {
        cdkBuilder.pageConfiguration(pageConfiguration.let(ConfluencePageConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2817f144d572ac768d2a7fb4d11a22d4469a4dded7d9df3a788c1de0ec26a80f")
      override
          fun pageConfiguration(pageConfiguration: ConfluencePageConfigurationProperty.Builder.() -> Unit):
          Unit = pageConfiguration(ConfluencePageConfigurationProperty(pageConfiguration))

      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      override fun serverUrl(serverUrl: String) {
        cdkBuilder.serverUrl(serverUrl)
      }

      override fun spaceConfiguration(spaceConfiguration: IResolvable) {
        cdkBuilder.spaceConfiguration(spaceConfiguration.let(IResolvable::unwrap))
      }

      override fun spaceConfiguration(spaceConfiguration: ConfluenceSpaceConfigurationProperty) {
        cdkBuilder.spaceConfiguration(spaceConfiguration.let(ConfluenceSpaceConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49ba2bbc317db4f0cde9cb944797b99a0adcfebdaa1d5d8ec4748dca0830b906")
      override
          fun spaceConfiguration(spaceConfiguration: ConfluenceSpaceConfigurationProperty.Builder.() -> Unit):
          Unit = spaceConfiguration(ConfluenceSpaceConfigurationProperty(spaceConfiguration))

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      override fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(DataSourceVpcConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e3a149baf8e9e42acaf53635797748128816d30d56df2db6343cc8981ce503b")
      override
          fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(DataSourceVpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty,
    ) : ConfluenceConfigurationProperty {
      override fun attachmentConfiguration(): Any? = unwrap(this).getAttachmentConfiguration()

      override fun blogConfiguration(): Any? = unwrap(this).getBlogConfiguration()

      override fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
          emptyList()

      override fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
          emptyList()

      override fun pageConfiguration(): Any? = unwrap(this).getPageConfiguration()

      override fun secretArn(): String = unwrap(this).getSecretArn()

      override fun serverUrl(): String = unwrap(this).getServerUrl()

      override fun spaceConfiguration(): Any? = unwrap(this).getSpaceConfiguration()

      override fun version(): String = unwrap(this).getVersion()

      override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConfluenceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty):
          ConfluenceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SalesforceStandardKnowledgeArticleTypeConfigurationProperty {
    public fun documentDataFieldName(): String

    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    public interface Builder {
      public fun documentDataFieldName(documentDataFieldName: String)

      public fun documentTitleFieldName(documentTitleFieldName: String)

      public fun fieldMappings(fieldMappings: IResolvable)

      public fun fieldMappings(fieldMappings: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty.builder()

      override fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
      }

      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty,
    ) : SalesforceStandardKnowledgeArticleTypeConfigurationProperty {
      override fun documentDataFieldName(): String = unwrap(this).getDocumentDataFieldName()

      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceStandardKnowledgeArticleTypeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty):
          SalesforceStandardKnowledgeArticleTypeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceStandardKnowledgeArticleTypeConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataSourceToIndexFieldMappingProperty {
    public fun dataSourceFieldName(): String

    public fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

    public fun indexFieldName(): String

    public interface Builder {
      public fun dataSourceFieldName(dataSourceFieldName: String)

      public fun dateFieldFormat(dateFieldFormat: String)

      public fun indexFieldName(indexFieldName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceToIndexFieldMappingProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceToIndexFieldMappingProperty.builder()

      override fun dataSourceFieldName(dataSourceFieldName: String) {
        cdkBuilder.dataSourceFieldName(dataSourceFieldName)
      }

      override fun dateFieldFormat(dateFieldFormat: String) {
        cdkBuilder.dateFieldFormat(dateFieldFormat)
      }

      override fun indexFieldName(indexFieldName: String) {
        cdkBuilder.indexFieldName(indexFieldName)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceToIndexFieldMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceToIndexFieldMappingProperty,
    ) : DataSourceToIndexFieldMappingProperty {
      override fun dataSourceFieldName(): String = unwrap(this).getDataSourceFieldName()

      override fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

      override fun indexFieldName(): String = unwrap(this).getIndexFieldName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataSourceToIndexFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceToIndexFieldMappingProperty):
          DataSourceToIndexFieldMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceToIndexFieldMappingProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceToIndexFieldMappingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DocumentAttributeValueProperty {
    public fun dateValue(): String? = unwrap(this).getDateValue()

    public fun longValue(): Number? = unwrap(this).getLongValue()

    public fun stringListValue(): List<String> = unwrap(this).getStringListValue() ?: emptyList()

    public fun stringValue(): String? = unwrap(this).getStringValue()

    public interface Builder {
      public fun dateValue(dateValue: String)

      public fun longValue(longValue: Number)

      public fun stringListValue(stringListValue: List<String>)

      public fun stringValue(stringValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeValueProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeValueProperty.builder()

      override fun dateValue(dateValue: String) {
        cdkBuilder.dateValue(dateValue)
      }

      override fun longValue(longValue: Number) {
        cdkBuilder.longValue(longValue)
      }

      override fun stringListValue(stringListValue: List<String>) {
        cdkBuilder.stringListValue(stringListValue)
      }

      override fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeValueProperty,
    ) : DocumentAttributeValueProperty {
      override fun dateValue(): String? = unwrap(this).getDateValue()

      override fun longValue(): Number? = unwrap(this).getLongValue()

      override fun stringListValue(): List<String> = unwrap(this).getStringListValue() ?:
          emptyList()

      override fun stringValue(): String? = unwrap(this).getStringValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentAttributeValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeValueProperty):
          DocumentAttributeValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentAttributeValueProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentAttributeValueProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OneDriveConfigurationProperty {
    public fun disableLocalGroups(): Any? = unwrap(this).getDisableLocalGroups()

    public fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
        emptyList()

    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    public fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
        emptyList()

    public fun oneDriveUsers(): Any

    public fun secretArn(): String

    public fun tenantDomain(): String

    public interface Builder {
      public fun disableLocalGroups(disableLocalGroups: Boolean)

      public fun disableLocalGroups(disableLocalGroups: IResolvable)

      public fun exclusionPatterns(exclusionPatterns: List<String>)

      public fun fieldMappings(fieldMappings: IResolvable)

      public fun fieldMappings(fieldMappings: List<Any>)

      public fun inclusionPatterns(inclusionPatterns: List<String>)

      public fun oneDriveUsers(oneDriveUsers: IResolvable)

      public fun oneDriveUsers(oneDriveUsers: OneDriveUsersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("832281f44d77ef71aa969c9a77c034c404ef104bce394194024f7c50f951f426")
      public fun oneDriveUsers(oneDriveUsers: OneDriveUsersProperty.Builder.() -> Unit)

      public fun secretArn(secretArn: String)

      public fun tenantDomain(tenantDomain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty.builder()

      override fun disableLocalGroups(disableLocalGroups: Boolean) {
        cdkBuilder.disableLocalGroups(disableLocalGroups)
      }

      override fun disableLocalGroups(disableLocalGroups: IResolvable) {
        cdkBuilder.disableLocalGroups(disableLocalGroups.let(IResolvable::unwrap))
      }

      override fun exclusionPatterns(exclusionPatterns: List<String>) {
        cdkBuilder.exclusionPatterns(exclusionPatterns)
      }

      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      override fun inclusionPatterns(inclusionPatterns: List<String>) {
        cdkBuilder.inclusionPatterns(inclusionPatterns)
      }

      override fun oneDriveUsers(oneDriveUsers: IResolvable) {
        cdkBuilder.oneDriveUsers(oneDriveUsers.let(IResolvable::unwrap))
      }

      override fun oneDriveUsers(oneDriveUsers: OneDriveUsersProperty) {
        cdkBuilder.oneDriveUsers(oneDriveUsers.let(OneDriveUsersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("832281f44d77ef71aa969c9a77c034c404ef104bce394194024f7c50f951f426")
      override fun oneDriveUsers(oneDriveUsers: OneDriveUsersProperty.Builder.() -> Unit): Unit =
          oneDriveUsers(OneDriveUsersProperty(oneDriveUsers))

      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      override fun tenantDomain(tenantDomain: String) {
        cdkBuilder.tenantDomain(tenantDomain)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty,
    ) : OneDriveConfigurationProperty {
      override fun disableLocalGroups(): Any? = unwrap(this).getDisableLocalGroups()

      override fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
          emptyList()

      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      override fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
          emptyList()

      override fun oneDriveUsers(): Any = unwrap(this).getOneDriveUsers()

      override fun secretArn(): String = unwrap(this).getSecretArn()

      override fun tenantDomain(): String = unwrap(this).getTenantDomain()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OneDriveConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty):
          OneDriveConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OneDriveConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OneDriveUsersProperty {
    public fun oneDriveUserList(): List<String> = unwrap(this).getOneDriveUserList() ?: emptyList()

    public fun oneDriveUserS3Path(): Any? = unwrap(this).getOneDriveUserS3Path()

    public interface Builder {
      public fun oneDriveUserList(oneDriveUserList: List<String>)

      public fun oneDriveUserS3Path(oneDriveUserS3Path: IResolvable)

      public fun oneDriveUserS3Path(oneDriveUserS3Path: S3PathProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0519f8aec787b99317fd3af06d3c129b2799c34b41915b30d58c5df23c3e66a")
      public fun oneDriveUserS3Path(oneDriveUserS3Path: S3PathProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty.builder()

      override fun oneDriveUserList(oneDriveUserList: List<String>) {
        cdkBuilder.oneDriveUserList(oneDriveUserList)
      }

      override fun oneDriveUserS3Path(oneDriveUserS3Path: IResolvable) {
        cdkBuilder.oneDriveUserS3Path(oneDriveUserS3Path.let(IResolvable::unwrap))
      }

      override fun oneDriveUserS3Path(oneDriveUserS3Path: S3PathProperty) {
        cdkBuilder.oneDriveUserS3Path(oneDriveUserS3Path.let(S3PathProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0519f8aec787b99317fd3af06d3c129b2799c34b41915b30d58c5df23c3e66a")
      override fun oneDriveUserS3Path(oneDriveUserS3Path: S3PathProperty.Builder.() -> Unit): Unit =
          oneDriveUserS3Path(S3PathProperty(oneDriveUserS3Path))

      public fun build(): software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty,
    ) : OneDriveUsersProperty {
      override fun oneDriveUserList(): List<String> = unwrap(this).getOneDriveUserList() ?:
          emptyList()

      override fun oneDriveUserS3Path(): Any? = unwrap(this).getOneDriveUserS3Path()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OneDriveUsersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty):
          OneDriveUsersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OneDriveUsersProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CustomDocumentEnrichmentConfigurationProperty {
    public fun inlineConfigurations(): Any? = unwrap(this).getInlineConfigurations()

    public fun postExtractionHookConfiguration(): Any? =
        unwrap(this).getPostExtractionHookConfiguration()

    public fun preExtractionHookConfiguration(): Any? =
        unwrap(this).getPreExtractionHookConfiguration()

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public interface Builder {
      public fun inlineConfigurations(inlineConfigurations: IResolvable)

      public fun inlineConfigurations(inlineConfigurations: List<Any>)

      public fun postExtractionHookConfiguration(postExtractionHookConfiguration: IResolvable)

      public
          fun postExtractionHookConfiguration(postExtractionHookConfiguration: HookConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("661bdfab95b4c4f7dc5bd929d1c69b1f860934f458a303688be5f26bf90003e8")
      public
          fun postExtractionHookConfiguration(postExtractionHookConfiguration: HookConfigurationProperty.Builder.() -> Unit)

      public fun preExtractionHookConfiguration(preExtractionHookConfiguration: IResolvable)

      public
          fun preExtractionHookConfiguration(preExtractionHookConfiguration: HookConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be71f589c859a4ce488fbe4bdf449b4b6cddb9162e4362bebbdd5298d572769d")
      public
          fun preExtractionHookConfiguration(preExtractionHookConfiguration: HookConfigurationProperty.Builder.() -> Unit)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.CustomDocumentEnrichmentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.CustomDocumentEnrichmentConfigurationProperty.builder()

      override fun inlineConfigurations(inlineConfigurations: IResolvable) {
        cdkBuilder.inlineConfigurations(inlineConfigurations.let(IResolvable::unwrap))
      }

      override fun inlineConfigurations(inlineConfigurations: List<Any>) {
        cdkBuilder.inlineConfigurations(inlineConfigurations)
      }

      override fun postExtractionHookConfiguration(postExtractionHookConfiguration: IResolvable) {
        cdkBuilder.postExtractionHookConfiguration(postExtractionHookConfiguration.let(IResolvable::unwrap))
      }

      override
          fun postExtractionHookConfiguration(postExtractionHookConfiguration: HookConfigurationProperty) {
        cdkBuilder.postExtractionHookConfiguration(postExtractionHookConfiguration.let(HookConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("661bdfab95b4c4f7dc5bd929d1c69b1f860934f458a303688be5f26bf90003e8")
      override
          fun postExtractionHookConfiguration(postExtractionHookConfiguration: HookConfigurationProperty.Builder.() -> Unit):
          Unit =
          postExtractionHookConfiguration(HookConfigurationProperty(postExtractionHookConfiguration))

      override fun preExtractionHookConfiguration(preExtractionHookConfiguration: IResolvable) {
        cdkBuilder.preExtractionHookConfiguration(preExtractionHookConfiguration.let(IResolvable::unwrap))
      }

      override
          fun preExtractionHookConfiguration(preExtractionHookConfiguration: HookConfigurationProperty) {
        cdkBuilder.preExtractionHookConfiguration(preExtractionHookConfiguration.let(HookConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("be71f589c859a4ce488fbe4bdf449b4b6cddb9162e4362bebbdd5298d572769d")
      override
          fun preExtractionHookConfiguration(preExtractionHookConfiguration: HookConfigurationProperty.Builder.() -> Unit):
          Unit =
          preExtractionHookConfiguration(HookConfigurationProperty(preExtractionHookConfiguration))

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.CustomDocumentEnrichmentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.CustomDocumentEnrichmentConfigurationProperty,
    ) : CustomDocumentEnrichmentConfigurationProperty {
      override fun inlineConfigurations(): Any? = unwrap(this).getInlineConfigurations()

      override fun postExtractionHookConfiguration(): Any? =
          unwrap(this).getPostExtractionHookConfiguration()

      override fun preExtractionHookConfiguration(): Any? =
          unwrap(this).getPreExtractionHookConfiguration()

      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomDocumentEnrichmentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.CustomDocumentEnrichmentConfigurationProperty):
          CustomDocumentEnrichmentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomDocumentEnrichmentConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.CustomDocumentEnrichmentConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SalesforceChatterFeedConfigurationProperty {
    public fun documentDataFieldName(): String

    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    public fun includeFilterTypes(): List<String> = unwrap(this).getIncludeFilterTypes() ?:
        emptyList()

    public interface Builder {
      public fun documentDataFieldName(documentDataFieldName: String)

      public fun documentTitleFieldName(documentTitleFieldName: String)

      public fun fieldMappings(fieldMappings: IResolvable)

      public fun fieldMappings(fieldMappings: List<Any>)

      public fun includeFilterTypes(includeFilterTypes: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty.builder()

      override fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
      }

      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      override fun includeFilterTypes(includeFilterTypes: List<String>) {
        cdkBuilder.includeFilterTypes(includeFilterTypes)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty,
    ) : SalesforceChatterFeedConfigurationProperty {
      override fun documentDataFieldName(): String = unwrap(this).getDocumentDataFieldName()

      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      override fun includeFilterTypes(): List<String> = unwrap(this).getIncludeFilterTypes() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceChatterFeedConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty):
          SalesforceChatterFeedConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceChatterFeedConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceChatterFeedConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ServiceNowServiceCatalogConfigurationProperty {
    public fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

    public fun documentDataFieldName(): String

    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    public fun excludeAttachmentFilePatterns(): List<String> =
        unwrap(this).getExcludeAttachmentFilePatterns() ?: emptyList()

    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    public fun includeAttachmentFilePatterns(): List<String> =
        unwrap(this).getIncludeAttachmentFilePatterns() ?: emptyList()

    public interface Builder {
      public fun crawlAttachments(crawlAttachments: Boolean)

      public fun crawlAttachments(crawlAttachments: IResolvable)

      public fun documentDataFieldName(documentDataFieldName: String)

      public fun documentTitleFieldName(documentTitleFieldName: String)

      public fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: List<String>)

      public fun fieldMappings(fieldMappings: IResolvable)

      public fun fieldMappings(fieldMappings: List<Any>)

      public fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty.builder()

      override fun crawlAttachments(crawlAttachments: Boolean) {
        cdkBuilder.crawlAttachments(crawlAttachments)
      }

      override fun crawlAttachments(crawlAttachments: IResolvable) {
        cdkBuilder.crawlAttachments(crawlAttachments.let(IResolvable::unwrap))
      }

      override fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
      }

      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      override fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: List<String>) {
        cdkBuilder.excludeAttachmentFilePatterns(excludeAttachmentFilePatterns)
      }

      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      override fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: List<String>) {
        cdkBuilder.includeAttachmentFilePatterns(includeAttachmentFilePatterns)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty,
    ) : ServiceNowServiceCatalogConfigurationProperty {
      override fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

      override fun documentDataFieldName(): String = unwrap(this).getDocumentDataFieldName()

      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      override fun excludeAttachmentFilePatterns(): List<String> =
          unwrap(this).getExcludeAttachmentFilePatterns() ?: emptyList()

      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      override fun includeAttachmentFilePatterns(): List<String> =
          unwrap(this).getIncludeAttachmentFilePatterns() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceNowServiceCatalogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty):
          ServiceNowServiceCatalogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceNowServiceCatalogConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowServiceCatalogConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DocumentsMetadataConfigurationProperty {
    public fun s3Prefix(): String? = unwrap(this).getS3Prefix()

    public interface Builder {
      public fun s3Prefix(s3Prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty.builder()

      override fun s3Prefix(s3Prefix: String) {
        cdkBuilder.s3Prefix(s3Prefix)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty,
    ) : DocumentsMetadataConfigurationProperty {
      override fun s3Prefix(): String? = unwrap(this).getS3Prefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentsMetadataConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty):
          DocumentsMetadataConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentsMetadataConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DocumentsMetadataConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataSourceConfigurationProperty {
    public fun confluenceConfiguration(): Any? = unwrap(this).getConfluenceConfiguration()

    public fun databaseConfiguration(): Any? = unwrap(this).getDatabaseConfiguration()

    public fun googleDriveConfiguration(): Any? = unwrap(this).getGoogleDriveConfiguration()

    public fun oneDriveConfiguration(): Any? = unwrap(this).getOneDriveConfiguration()

    public fun s3Configuration(): Any? = unwrap(this).getS3Configuration()

    public fun salesforceConfiguration(): Any? = unwrap(this).getSalesforceConfiguration()

    public fun serviceNowConfiguration(): Any? = unwrap(this).getServiceNowConfiguration()

    public fun sharePointConfiguration(): Any? = unwrap(this).getSharePointConfiguration()

    public fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

    public fun webCrawlerConfiguration(): Any? = unwrap(this).getWebCrawlerConfiguration()

    public fun workDocsConfiguration(): Any? = unwrap(this).getWorkDocsConfiguration()

    public interface Builder {
      public fun confluenceConfiguration(confluenceConfiguration: IResolvable)

      public fun confluenceConfiguration(confluenceConfiguration: ConfluenceConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74a304598badf31a242e6c219d463310ff0402d1ba504e05151fd9cd5e8a00fe")
      public
          fun confluenceConfiguration(confluenceConfiguration: ConfluenceConfigurationProperty.Builder.() -> Unit)

      public fun databaseConfiguration(databaseConfiguration: IResolvable)

      public fun databaseConfiguration(databaseConfiguration: DatabaseConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e7bc2443f8f4a793561df05be393d6f8db933294ac12f96e1513bfe364e0b5f")
      public
          fun databaseConfiguration(databaseConfiguration: DatabaseConfigurationProperty.Builder.() -> Unit)

      public fun googleDriveConfiguration(googleDriveConfiguration: IResolvable)

      public
          fun googleDriveConfiguration(googleDriveConfiguration: GoogleDriveConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("07e628e0081db648e12f378eaf2c8281429fa94cf03828149f039ebfad0ef9a5")
      public
          fun googleDriveConfiguration(googleDriveConfiguration: GoogleDriveConfigurationProperty.Builder.() -> Unit)

      public fun oneDriveConfiguration(oneDriveConfiguration: IResolvable)

      public fun oneDriveConfiguration(oneDriveConfiguration: OneDriveConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61abe0808a502e3528ac6cac5bcef15cb4e47fccda7c506d23eb6557936b8b52")
      public
          fun oneDriveConfiguration(oneDriveConfiguration: OneDriveConfigurationProperty.Builder.() -> Unit)

      public fun s3Configuration(s3Configuration: IResolvable)

      public fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d80e7f32b0239da0e288cfb5e46c690fb93a60eabfaa4d3a0c88fc8a498c82b2")
      public
          fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty.Builder.() -> Unit)

      public fun salesforceConfiguration(salesforceConfiguration: IResolvable)

      public fun salesforceConfiguration(salesforceConfiguration: SalesforceConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69fda77f8ee5736ab588d12e3ae1a53741e45921c8c36c01c831fd588bba4cc5")
      public
          fun salesforceConfiguration(salesforceConfiguration: SalesforceConfigurationProperty.Builder.() -> Unit)

      public fun serviceNowConfiguration(serviceNowConfiguration: IResolvable)

      public fun serviceNowConfiguration(serviceNowConfiguration: ServiceNowConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da8e0f0b2d4dd7ffce7fca5554d53ae3b646ca01891b474180434900a91bee6c")
      public
          fun serviceNowConfiguration(serviceNowConfiguration: ServiceNowConfigurationProperty.Builder.() -> Unit)

      public fun sharePointConfiguration(sharePointConfiguration: IResolvable)

      public fun sharePointConfiguration(sharePointConfiguration: SharePointConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37d9fd47feaec1504f846956b823b88829564367e5619a776ee765b16e562757")
      public
          fun sharePointConfiguration(sharePointConfiguration: SharePointConfigurationProperty.Builder.() -> Unit)

      public fun templateConfiguration(templateConfiguration: IResolvable)

      public fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("761ddab5ea2fb8114d8e3a3aad1ad2a6b467ea256238d87e7c81bae2db508d34")
      public
          fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty.Builder.() -> Unit)

      public fun webCrawlerConfiguration(webCrawlerConfiguration: IResolvable)

      public fun webCrawlerConfiguration(webCrawlerConfiguration: WebCrawlerConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("438d237d9d26bf2eeea70a2713abe3dd404fa9d182ff774239a1b8cd85ec7548")
      public
          fun webCrawlerConfiguration(webCrawlerConfiguration: WebCrawlerConfigurationProperty.Builder.() -> Unit)

      public fun workDocsConfiguration(workDocsConfiguration: IResolvable)

      public fun workDocsConfiguration(workDocsConfiguration: WorkDocsConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6b0e34b2f6369dcf764dff33a0dfa88bfc8ef9f7cdc214f6022f8a5c620580f")
      public
          fun workDocsConfiguration(workDocsConfiguration: WorkDocsConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty.builder()

      override fun confluenceConfiguration(confluenceConfiguration: IResolvable) {
        cdkBuilder.confluenceConfiguration(confluenceConfiguration.let(IResolvable::unwrap))
      }

      override
          fun confluenceConfiguration(confluenceConfiguration: ConfluenceConfigurationProperty) {
        cdkBuilder.confluenceConfiguration(confluenceConfiguration.let(ConfluenceConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("74a304598badf31a242e6c219d463310ff0402d1ba504e05151fd9cd5e8a00fe")
      override
          fun confluenceConfiguration(confluenceConfiguration: ConfluenceConfigurationProperty.Builder.() -> Unit):
          Unit = confluenceConfiguration(ConfluenceConfigurationProperty(confluenceConfiguration))

      override fun databaseConfiguration(databaseConfiguration: IResolvable) {
        cdkBuilder.databaseConfiguration(databaseConfiguration.let(IResolvable::unwrap))
      }

      override fun databaseConfiguration(databaseConfiguration: DatabaseConfigurationProperty) {
        cdkBuilder.databaseConfiguration(databaseConfiguration.let(DatabaseConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e7bc2443f8f4a793561df05be393d6f8db933294ac12f96e1513bfe364e0b5f")
      override
          fun databaseConfiguration(databaseConfiguration: DatabaseConfigurationProperty.Builder.() -> Unit):
          Unit = databaseConfiguration(DatabaseConfigurationProperty(databaseConfiguration))

      override fun googleDriveConfiguration(googleDriveConfiguration: IResolvable) {
        cdkBuilder.googleDriveConfiguration(googleDriveConfiguration.let(IResolvable::unwrap))
      }

      override
          fun googleDriveConfiguration(googleDriveConfiguration: GoogleDriveConfigurationProperty) {
        cdkBuilder.googleDriveConfiguration(googleDriveConfiguration.let(GoogleDriveConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("07e628e0081db648e12f378eaf2c8281429fa94cf03828149f039ebfad0ef9a5")
      override
          fun googleDriveConfiguration(googleDriveConfiguration: GoogleDriveConfigurationProperty.Builder.() -> Unit):
          Unit =
          googleDriveConfiguration(GoogleDriveConfigurationProperty(googleDriveConfiguration))

      override fun oneDriveConfiguration(oneDriveConfiguration: IResolvable) {
        cdkBuilder.oneDriveConfiguration(oneDriveConfiguration.let(IResolvable::unwrap))
      }

      override fun oneDriveConfiguration(oneDriveConfiguration: OneDriveConfigurationProperty) {
        cdkBuilder.oneDriveConfiguration(oneDriveConfiguration.let(OneDriveConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("61abe0808a502e3528ac6cac5bcef15cb4e47fccda7c506d23eb6557936b8b52")
      override
          fun oneDriveConfiguration(oneDriveConfiguration: OneDriveConfigurationProperty.Builder.() -> Unit):
          Unit = oneDriveConfiguration(OneDriveConfigurationProperty(oneDriveConfiguration))

      override fun s3Configuration(s3Configuration: IResolvable) {
        cdkBuilder.s3Configuration(s3Configuration.let(IResolvable::unwrap))
      }

      override fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty) {
        cdkBuilder.s3Configuration(s3Configuration.let(S3DataSourceConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d80e7f32b0239da0e288cfb5e46c690fb93a60eabfaa4d3a0c88fc8a498c82b2")
      override
          fun s3Configuration(s3Configuration: S3DataSourceConfigurationProperty.Builder.() -> Unit):
          Unit = s3Configuration(S3DataSourceConfigurationProperty(s3Configuration))

      override fun salesforceConfiguration(salesforceConfiguration: IResolvable) {
        cdkBuilder.salesforceConfiguration(salesforceConfiguration.let(IResolvable::unwrap))
      }

      override
          fun salesforceConfiguration(salesforceConfiguration: SalesforceConfigurationProperty) {
        cdkBuilder.salesforceConfiguration(salesforceConfiguration.let(SalesforceConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("69fda77f8ee5736ab588d12e3ae1a53741e45921c8c36c01c831fd588bba4cc5")
      override
          fun salesforceConfiguration(salesforceConfiguration: SalesforceConfigurationProperty.Builder.() -> Unit):
          Unit = salesforceConfiguration(SalesforceConfigurationProperty(salesforceConfiguration))

      override fun serviceNowConfiguration(serviceNowConfiguration: IResolvable) {
        cdkBuilder.serviceNowConfiguration(serviceNowConfiguration.let(IResolvable::unwrap))
      }

      override
          fun serviceNowConfiguration(serviceNowConfiguration: ServiceNowConfigurationProperty) {
        cdkBuilder.serviceNowConfiguration(serviceNowConfiguration.let(ServiceNowConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da8e0f0b2d4dd7ffce7fca5554d53ae3b646ca01891b474180434900a91bee6c")
      override
          fun serviceNowConfiguration(serviceNowConfiguration: ServiceNowConfigurationProperty.Builder.() -> Unit):
          Unit = serviceNowConfiguration(ServiceNowConfigurationProperty(serviceNowConfiguration))

      override fun sharePointConfiguration(sharePointConfiguration: IResolvable) {
        cdkBuilder.sharePointConfiguration(sharePointConfiguration.let(IResolvable::unwrap))
      }

      override
          fun sharePointConfiguration(sharePointConfiguration: SharePointConfigurationProperty) {
        cdkBuilder.sharePointConfiguration(sharePointConfiguration.let(SharePointConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37d9fd47feaec1504f846956b823b88829564367e5619a776ee765b16e562757")
      override
          fun sharePointConfiguration(sharePointConfiguration: SharePointConfigurationProperty.Builder.() -> Unit):
          Unit = sharePointConfiguration(SharePointConfigurationProperty(sharePointConfiguration))

      override fun templateConfiguration(templateConfiguration: IResolvable) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(IResolvable::unwrap))
      }

      override fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty) {
        cdkBuilder.templateConfiguration(templateConfiguration.let(TemplateConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("761ddab5ea2fb8114d8e3a3aad1ad2a6b467ea256238d87e7c81bae2db508d34")
      override
          fun templateConfiguration(templateConfiguration: TemplateConfigurationProperty.Builder.() -> Unit):
          Unit = templateConfiguration(TemplateConfigurationProperty(templateConfiguration))

      override fun webCrawlerConfiguration(webCrawlerConfiguration: IResolvable) {
        cdkBuilder.webCrawlerConfiguration(webCrawlerConfiguration.let(IResolvable::unwrap))
      }

      override
          fun webCrawlerConfiguration(webCrawlerConfiguration: WebCrawlerConfigurationProperty) {
        cdkBuilder.webCrawlerConfiguration(webCrawlerConfiguration.let(WebCrawlerConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("438d237d9d26bf2eeea70a2713abe3dd404fa9d182ff774239a1b8cd85ec7548")
      override
          fun webCrawlerConfiguration(webCrawlerConfiguration: WebCrawlerConfigurationProperty.Builder.() -> Unit):
          Unit = webCrawlerConfiguration(WebCrawlerConfigurationProperty(webCrawlerConfiguration))

      override fun workDocsConfiguration(workDocsConfiguration: IResolvable) {
        cdkBuilder.workDocsConfiguration(workDocsConfiguration.let(IResolvable::unwrap))
      }

      override fun workDocsConfiguration(workDocsConfiguration: WorkDocsConfigurationProperty) {
        cdkBuilder.workDocsConfiguration(workDocsConfiguration.let(WorkDocsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f6b0e34b2f6369dcf764dff33a0dfa88bfc8ef9f7cdc214f6022f8a5c620580f")
      override
          fun workDocsConfiguration(workDocsConfiguration: WorkDocsConfigurationProperty.Builder.() -> Unit):
          Unit = workDocsConfiguration(WorkDocsConfigurationProperty(workDocsConfiguration))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty,
    ) : DataSourceConfigurationProperty {
      override fun confluenceConfiguration(): Any? = unwrap(this).getConfluenceConfiguration()

      override fun databaseConfiguration(): Any? = unwrap(this).getDatabaseConfiguration()

      override fun googleDriveConfiguration(): Any? = unwrap(this).getGoogleDriveConfiguration()

      override fun oneDriveConfiguration(): Any? = unwrap(this).getOneDriveConfiguration()

      override fun s3Configuration(): Any? = unwrap(this).getS3Configuration()

      override fun salesforceConfiguration(): Any? = unwrap(this).getSalesforceConfiguration()

      override fun serviceNowConfiguration(): Any? = unwrap(this).getServiceNowConfiguration()

      override fun sharePointConfiguration(): Any? = unwrap(this).getSharePointConfiguration()

      override fun templateConfiguration(): Any? = unwrap(this).getTemplateConfiguration()

      override fun webCrawlerConfiguration(): Any? = unwrap(this).getWebCrawlerConfiguration()

      override fun workDocsConfiguration(): Any? = unwrap(this).getWorkDocsConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty):
          DataSourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SalesforceStandardObjectConfigurationProperty {
    public fun documentDataFieldName(): String

    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    public fun name(): String

    public interface Builder {
      public fun documentDataFieldName(documentDataFieldName: String)

      public fun documentTitleFieldName(documentTitleFieldName: String)

      public fun fieldMappings(fieldMappings: IResolvable)

      public fun fieldMappings(fieldMappings: List<Any>)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty.builder()

      override fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
      }

      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty,
    ) : SalesforceStandardObjectConfigurationProperty {
      override fun documentDataFieldName(): String = unwrap(this).getDocumentDataFieldName()

      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceStandardObjectConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty):
          SalesforceStandardObjectConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceStandardObjectConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface WebCrawlerSiteMapsConfigurationProperty {
    public fun siteMaps(): List<String>

    public interface Builder {
      public fun siteMaps(siteMaps: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty.builder()

      override fun siteMaps(siteMaps: List<String>) {
        cdkBuilder.siteMaps(siteMaps)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty,
    ) : WebCrawlerSiteMapsConfigurationProperty {
      override fun siteMaps(): List<String> = unwrap(this).getSiteMaps() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          WebCrawlerSiteMapsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty):
          WebCrawlerSiteMapsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebCrawlerSiteMapsConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSiteMapsConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConnectionConfigurationProperty {
    public fun databaseHost(): String

    public fun databaseName(): String

    public fun databasePort(): Number

    public fun secretArn(): String

    public fun tableName(): String

    public interface Builder {
      public fun databaseHost(databaseHost: String)

      public fun databaseName(databaseName: String)

      public fun databasePort(databasePort: Number)

      public fun secretArn(secretArn: String)

      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty.builder()

      override fun databaseHost(databaseHost: String) {
        cdkBuilder.databaseHost(databaseHost)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun databasePort(databasePort: Number) {
        cdkBuilder.databasePort(databasePort)
      }

      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty,
    ) : ConnectionConfigurationProperty {
      override fun databaseHost(): String = unwrap(this).getDatabaseHost()

      override fun databaseName(): String = unwrap(this).getDatabaseName()

      override fun databasePort(): Number = unwrap(this).getDatabasePort()

      override fun secretArn(): String = unwrap(this).getSecretArn()

      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty):
          ConnectionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConnectionConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface WorkDocsConfigurationProperty {
    public fun crawlComments(): Any? = unwrap(this).getCrawlComments()

    public fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
        emptyList()

    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    public fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
        emptyList()

    public fun organizationId(): String

    public fun useChangeLog(): Any? = unwrap(this).getUseChangeLog()

    public interface Builder {
      public fun crawlComments(crawlComments: Boolean)

      public fun crawlComments(crawlComments: IResolvable)

      public fun exclusionPatterns(exclusionPatterns: List<String>)

      public fun fieldMappings(fieldMappings: IResolvable)

      public fun fieldMappings(fieldMappings: List<Any>)

      public fun inclusionPatterns(inclusionPatterns: List<String>)

      public fun organizationId(organizationId: String)

      public fun useChangeLog(useChangeLog: Boolean)

      public fun useChangeLog(useChangeLog: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty.builder()

      override fun crawlComments(crawlComments: Boolean) {
        cdkBuilder.crawlComments(crawlComments)
      }

      override fun crawlComments(crawlComments: IResolvable) {
        cdkBuilder.crawlComments(crawlComments.let(IResolvable::unwrap))
      }

      override fun exclusionPatterns(exclusionPatterns: List<String>) {
        cdkBuilder.exclusionPatterns(exclusionPatterns)
      }

      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      override fun inclusionPatterns(inclusionPatterns: List<String>) {
        cdkBuilder.inclusionPatterns(inclusionPatterns)
      }

      override fun organizationId(organizationId: String) {
        cdkBuilder.organizationId(organizationId)
      }

      override fun useChangeLog(useChangeLog: Boolean) {
        cdkBuilder.useChangeLog(useChangeLog)
      }

      override fun useChangeLog(useChangeLog: IResolvable) {
        cdkBuilder.useChangeLog(useChangeLog.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty,
    ) : WorkDocsConfigurationProperty {
      override fun crawlComments(): Any? = unwrap(this).getCrawlComments()

      override fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
          emptyList()

      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      override fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
          emptyList()

      override fun organizationId(): String = unwrap(this).getOrganizationId()

      override fun useChangeLog(): Any? = unwrap(this).getUseChangeLog()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WorkDocsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty):
          WorkDocsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkDocsConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.WorkDocsConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SalesforceConfigurationProperty {
    public fun chatterFeedConfiguration(): Any? = unwrap(this).getChatterFeedConfiguration()

    public fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

    public fun excludeAttachmentFilePatterns(): List<String> =
        unwrap(this).getExcludeAttachmentFilePatterns() ?: emptyList()

    public fun includeAttachmentFilePatterns(): List<String> =
        unwrap(this).getIncludeAttachmentFilePatterns() ?: emptyList()

    public fun knowledgeArticleConfiguration(): Any? =
        unwrap(this).getKnowledgeArticleConfiguration()

    public fun secretArn(): String

    public fun serverUrl(): String

    public fun standardObjectAttachmentConfiguration(): Any? =
        unwrap(this).getStandardObjectAttachmentConfiguration()

    public fun standardObjectConfigurations(): Any? = unwrap(this).getStandardObjectConfigurations()

    public interface Builder {
      public fun chatterFeedConfiguration(chatterFeedConfiguration: IResolvable)

      public
          fun chatterFeedConfiguration(chatterFeedConfiguration: SalesforceChatterFeedConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("68ea8e49d52c80abe84b7b1e8979979927fc2fa72e7d99362d95420fbe6ffc58")
      public
          fun chatterFeedConfiguration(chatterFeedConfiguration: SalesforceChatterFeedConfigurationProperty.Builder.() -> Unit)

      public fun crawlAttachments(crawlAttachments: Boolean)

      public fun crawlAttachments(crawlAttachments: IResolvable)

      public fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: List<String>)

      public fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: List<String>)

      public fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: IResolvable)

      public
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: SalesforceKnowledgeArticleConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("717fdd3835d3fadefd0088da282d3e63c6bf72afe900df51cf6b1bc4cdb7f04b")
      public
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: SalesforceKnowledgeArticleConfigurationProperty.Builder.() -> Unit)

      public fun secretArn(secretArn: String)

      public fun serverUrl(serverUrl: String)

      public
          fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: IResolvable)

      public
          fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: SalesforceStandardObjectAttachmentConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b89b446b1576b097cd3c009ab9272752ffdc64b2efffdacd5430f35518bce67d")
      public
          fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: SalesforceStandardObjectAttachmentConfigurationProperty.Builder.() -> Unit)

      public fun standardObjectConfigurations(standardObjectConfigurations: IResolvable)

      public fun standardObjectConfigurations(standardObjectConfigurations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty.builder()

      override fun chatterFeedConfiguration(chatterFeedConfiguration: IResolvable) {
        cdkBuilder.chatterFeedConfiguration(chatterFeedConfiguration.let(IResolvable::unwrap))
      }

      override
          fun chatterFeedConfiguration(chatterFeedConfiguration: SalesforceChatterFeedConfigurationProperty) {
        cdkBuilder.chatterFeedConfiguration(chatterFeedConfiguration.let(SalesforceChatterFeedConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("68ea8e49d52c80abe84b7b1e8979979927fc2fa72e7d99362d95420fbe6ffc58")
      override
          fun chatterFeedConfiguration(chatterFeedConfiguration: SalesforceChatterFeedConfigurationProperty.Builder.() -> Unit):
          Unit =
          chatterFeedConfiguration(SalesforceChatterFeedConfigurationProperty(chatterFeedConfiguration))

      override fun crawlAttachments(crawlAttachments: Boolean) {
        cdkBuilder.crawlAttachments(crawlAttachments)
      }

      override fun crawlAttachments(crawlAttachments: IResolvable) {
        cdkBuilder.crawlAttachments(crawlAttachments.let(IResolvable::unwrap))
      }

      override fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: List<String>) {
        cdkBuilder.excludeAttachmentFilePatterns(excludeAttachmentFilePatterns)
      }

      override fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: List<String>) {
        cdkBuilder.includeAttachmentFilePatterns(includeAttachmentFilePatterns)
      }

      override fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: IResolvable) {
        cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration.let(IResolvable::unwrap))
      }

      override
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: SalesforceKnowledgeArticleConfigurationProperty) {
        cdkBuilder.knowledgeArticleConfiguration(knowledgeArticleConfiguration.let(SalesforceKnowledgeArticleConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("717fdd3835d3fadefd0088da282d3e63c6bf72afe900df51cf6b1bc4cdb7f04b")
      override
          fun knowledgeArticleConfiguration(knowledgeArticleConfiguration: SalesforceKnowledgeArticleConfigurationProperty.Builder.() -> Unit):
          Unit =
          knowledgeArticleConfiguration(SalesforceKnowledgeArticleConfigurationProperty(knowledgeArticleConfiguration))

      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      override fun serverUrl(serverUrl: String) {
        cdkBuilder.serverUrl(serverUrl)
      }

      override
          fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: IResolvable) {
        cdkBuilder.standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration.let(IResolvable::unwrap))
      }

      override
          fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: SalesforceStandardObjectAttachmentConfigurationProperty) {
        cdkBuilder.standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration.let(SalesforceStandardObjectAttachmentConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b89b446b1576b097cd3c009ab9272752ffdc64b2efffdacd5430f35518bce67d")
      override
          fun standardObjectAttachmentConfiguration(standardObjectAttachmentConfiguration: SalesforceStandardObjectAttachmentConfigurationProperty.Builder.() -> Unit):
          Unit =
          standardObjectAttachmentConfiguration(SalesforceStandardObjectAttachmentConfigurationProperty(standardObjectAttachmentConfiguration))

      override fun standardObjectConfigurations(standardObjectConfigurations: IResolvable) {
        cdkBuilder.standardObjectConfigurations(standardObjectConfigurations.let(IResolvable::unwrap))
      }

      override fun standardObjectConfigurations(standardObjectConfigurations: List<Any>) {
        cdkBuilder.standardObjectConfigurations(standardObjectConfigurations)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty,
    ) : SalesforceConfigurationProperty {
      override fun chatterFeedConfiguration(): Any? = unwrap(this).getChatterFeedConfiguration()

      override fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

      override fun excludeAttachmentFilePatterns(): List<String> =
          unwrap(this).getExcludeAttachmentFilePatterns() ?: emptyList()

      override fun includeAttachmentFilePatterns(): List<String> =
          unwrap(this).getIncludeAttachmentFilePatterns() ?: emptyList()

      override fun knowledgeArticleConfiguration(): Any? =
          unwrap(this).getKnowledgeArticleConfiguration()

      override fun secretArn(): String = unwrap(this).getSecretArn()

      override fun serverUrl(): String = unwrap(this).getServerUrl()

      override fun standardObjectAttachmentConfiguration(): Any? =
          unwrap(this).getStandardObjectAttachmentConfiguration()

      override fun standardObjectConfigurations(): Any? =
          unwrap(this).getStandardObjectConfigurations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SalesforceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty):
          SalesforceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AclConfigurationProperty {
    public fun allowedGroupsColumnName(): String

    public interface Builder {
      public fun allowedGroupsColumnName(allowedGroupsColumnName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty.builder()

      override fun allowedGroupsColumnName(allowedGroupsColumnName: String) {
        cdkBuilder.allowedGroupsColumnName(allowedGroupsColumnName)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty,
    ) : AclConfigurationProperty {
      override fun allowedGroupsColumnName(): String = unwrap(this).getAllowedGroupsColumnName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AclConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty):
          AclConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AclConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.AclConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ConfluencePageToIndexFieldMappingProperty {
    public fun dataSourceFieldName(): String

    public fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

    public fun indexFieldName(): String

    public interface Builder {
      public fun dataSourceFieldName(dataSourceFieldName: String)

      public fun dateFieldFormat(dateFieldFormat: String)

      public fun indexFieldName(indexFieldName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageToIndexFieldMappingProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageToIndexFieldMappingProperty.builder()

      override fun dataSourceFieldName(dataSourceFieldName: String) {
        cdkBuilder.dataSourceFieldName(dataSourceFieldName)
      }

      override fun dateFieldFormat(dateFieldFormat: String) {
        cdkBuilder.dateFieldFormat(dateFieldFormat)
      }

      override fun indexFieldName(indexFieldName: String) {
        cdkBuilder.indexFieldName(indexFieldName)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageToIndexFieldMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageToIndexFieldMappingProperty,
    ) : ConfluencePageToIndexFieldMappingProperty {
      override fun dataSourceFieldName(): String = unwrap(this).getDataSourceFieldName()

      override fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

      override fun indexFieldName(): String = unwrap(this).getIndexFieldName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluencePageToIndexFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageToIndexFieldMappingProperty):
          ConfluencePageToIndexFieldMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluencePageToIndexFieldMappingProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluencePageToIndexFieldMappingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface WebCrawlerSeedUrlConfigurationProperty {
    public fun seedUrls(): List<String>

    public fun webCrawlerMode(): String? = unwrap(this).getWebCrawlerMode()

    public interface Builder {
      public fun seedUrls(seedUrls: List<String>)

      public fun webCrawlerMode(webCrawlerMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty.builder()

      override fun seedUrls(seedUrls: List<String>) {
        cdkBuilder.seedUrls(seedUrls)
      }

      override fun webCrawlerMode(webCrawlerMode: String) {
        cdkBuilder.webCrawlerMode(webCrawlerMode)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty,
    ) : WebCrawlerSeedUrlConfigurationProperty {
      override fun seedUrls(): List<String> = unwrap(this).getSeedUrls() ?: emptyList()

      override fun webCrawlerMode(): String? = unwrap(this).getWebCrawlerMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          WebCrawlerSeedUrlConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty):
          WebCrawlerSeedUrlConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebCrawlerSeedUrlConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerSeedUrlConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface SalesforceStandardObjectAttachmentConfigurationProperty {
    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    public interface Builder {
      public fun documentTitleFieldName(documentTitleFieldName: String)

      public fun fieldMappings(fieldMappings: IResolvable)

      public fun fieldMappings(fieldMappings: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty.builder()

      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty,
    ) : SalesforceStandardObjectAttachmentConfigurationProperty {
      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          SalesforceStandardObjectAttachmentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty):
          SalesforceStandardObjectAttachmentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SalesforceStandardObjectAttachmentConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DatabaseConfigurationProperty {
    public fun aclConfiguration(): Any? = unwrap(this).getAclConfiguration()

    public fun columnConfiguration(): Any

    public fun connectionConfiguration(): Any

    public fun databaseEngineType(): String

    public fun sqlConfiguration(): Any? = unwrap(this).getSqlConfiguration()

    public fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

    public interface Builder {
      public fun aclConfiguration(aclConfiguration: IResolvable)

      public fun aclConfiguration(aclConfiguration: AclConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("597613032f6a5e3b1dd51dc5e4ba5e6d511c7123be64f71e0cfea153ec734aed")
      public fun aclConfiguration(aclConfiguration: AclConfigurationProperty.Builder.() -> Unit)

      public fun columnConfiguration(columnConfiguration: IResolvable)

      public fun columnConfiguration(columnConfiguration: ColumnConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a79a843cb7aacc95d6e019f396615a8d3d00ba8c21f1c7a257b5fe7605aae5c")
      public
          fun columnConfiguration(columnConfiguration: ColumnConfigurationProperty.Builder.() -> Unit)

      public fun connectionConfiguration(connectionConfiguration: IResolvable)

      public fun connectionConfiguration(connectionConfiguration: ConnectionConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60e1f87ea045ceafcb905310214daf8007a3f4b75ee1c76c57a32db72c8f4878")
      public
          fun connectionConfiguration(connectionConfiguration: ConnectionConfigurationProperty.Builder.() -> Unit)

      public fun databaseEngineType(databaseEngineType: String)

      public fun sqlConfiguration(sqlConfiguration: IResolvable)

      public fun sqlConfiguration(sqlConfiguration: SqlConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd8d5b1c3c5fa7772f6a9977bc8090bae223df6e6bdfb5f24b4f7f9fe096df57")
      public fun sqlConfiguration(sqlConfiguration: SqlConfigurationProperty.Builder.() -> Unit)

      public fun vpcConfiguration(vpcConfiguration: IResolvable)

      public fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a60c2e6e79c6a1516849eac70a6882a6dc4bbf1121378a9818225c243aadbe73")
      public
          fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty.builder()

      override fun aclConfiguration(aclConfiguration: IResolvable) {
        cdkBuilder.aclConfiguration(aclConfiguration.let(IResolvable::unwrap))
      }

      override fun aclConfiguration(aclConfiguration: AclConfigurationProperty) {
        cdkBuilder.aclConfiguration(aclConfiguration.let(AclConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("597613032f6a5e3b1dd51dc5e4ba5e6d511c7123be64f71e0cfea153ec734aed")
      override fun aclConfiguration(aclConfiguration: AclConfigurationProperty.Builder.() -> Unit):
          Unit = aclConfiguration(AclConfigurationProperty(aclConfiguration))

      override fun columnConfiguration(columnConfiguration: IResolvable) {
        cdkBuilder.columnConfiguration(columnConfiguration.let(IResolvable::unwrap))
      }

      override fun columnConfiguration(columnConfiguration: ColumnConfigurationProperty) {
        cdkBuilder.columnConfiguration(columnConfiguration.let(ColumnConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2a79a843cb7aacc95d6e019f396615a8d3d00ba8c21f1c7a257b5fe7605aae5c")
      override
          fun columnConfiguration(columnConfiguration: ColumnConfigurationProperty.Builder.() -> Unit):
          Unit = columnConfiguration(ColumnConfigurationProperty(columnConfiguration))

      override fun connectionConfiguration(connectionConfiguration: IResolvable) {
        cdkBuilder.connectionConfiguration(connectionConfiguration.let(IResolvable::unwrap))
      }

      override
          fun connectionConfiguration(connectionConfiguration: ConnectionConfigurationProperty) {
        cdkBuilder.connectionConfiguration(connectionConfiguration.let(ConnectionConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("60e1f87ea045ceafcb905310214daf8007a3f4b75ee1c76c57a32db72c8f4878")
      override
          fun connectionConfiguration(connectionConfiguration: ConnectionConfigurationProperty.Builder.() -> Unit):
          Unit = connectionConfiguration(ConnectionConfigurationProperty(connectionConfiguration))

      override fun databaseEngineType(databaseEngineType: String) {
        cdkBuilder.databaseEngineType(databaseEngineType)
      }

      override fun sqlConfiguration(sqlConfiguration: IResolvable) {
        cdkBuilder.sqlConfiguration(sqlConfiguration.let(IResolvable::unwrap))
      }

      override fun sqlConfiguration(sqlConfiguration: SqlConfigurationProperty) {
        cdkBuilder.sqlConfiguration(sqlConfiguration.let(SqlConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd8d5b1c3c5fa7772f6a9977bc8090bae223df6e6bdfb5f24b4f7f9fe096df57")
      override fun sqlConfiguration(sqlConfiguration: SqlConfigurationProperty.Builder.() -> Unit):
          Unit = sqlConfiguration(SqlConfigurationProperty(sqlConfiguration))

      override fun vpcConfiguration(vpcConfiguration: IResolvable) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
      }

      override fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty) {
        cdkBuilder.vpcConfiguration(vpcConfiguration.let(DataSourceVpcConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a60c2e6e79c6a1516849eac70a6882a6dc4bbf1121378a9818225c243aadbe73")
      override
          fun vpcConfiguration(vpcConfiguration: DataSourceVpcConfigurationProperty.Builder.() -> Unit):
          Unit = vpcConfiguration(DataSourceVpcConfigurationProperty(vpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty,
    ) : DatabaseConfigurationProperty {
      override fun aclConfiguration(): Any? = unwrap(this).getAclConfiguration()

      override fun columnConfiguration(): Any = unwrap(this).getColumnConfiguration()

      override fun connectionConfiguration(): Any = unwrap(this).getConnectionConfiguration()

      override fun databaseEngineType(): String = unwrap(this).getDatabaseEngineType()

      override fun sqlConfiguration(): Any? = unwrap(this).getSqlConfiguration()

      override fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty):
          DatabaseConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.DatabaseConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface WebCrawlerBasicAuthenticationProperty {
    public fun credentials(): String

    public fun host(): String

    public fun port(): Number

    public interface Builder {
      public fun credentials(credentials: String)

      public fun host(host: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty.builder()

      override fun credentials(credentials: String) {
        cdkBuilder.credentials(credentials)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty,
    ) : WebCrawlerBasicAuthenticationProperty {
      override fun credentials(): String = unwrap(this).getCredentials()

      override fun host(): String = unwrap(this).getHost()

      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          WebCrawlerBasicAuthenticationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty):
          WebCrawlerBasicAuthenticationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebCrawlerBasicAuthenticationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerBasicAuthenticationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface WebCrawlerUrlsProperty {
    public fun seedUrlConfiguration(): Any? = unwrap(this).getSeedUrlConfiguration()

    public fun siteMapsConfiguration(): Any? = unwrap(this).getSiteMapsConfiguration()

    public interface Builder {
      public fun seedUrlConfiguration(seedUrlConfiguration: IResolvable)

      public fun seedUrlConfiguration(seedUrlConfiguration: WebCrawlerSeedUrlConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82f98e3cc6b19884926eac964217023af22b275e09e65fa53d053724d4d2b6bd")
      public
          fun seedUrlConfiguration(seedUrlConfiguration: WebCrawlerSeedUrlConfigurationProperty.Builder.() -> Unit)

      public fun siteMapsConfiguration(siteMapsConfiguration: IResolvable)

      public
          fun siteMapsConfiguration(siteMapsConfiguration: WebCrawlerSiteMapsConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42270145f287d26bf5765aa46ea377506996d9f8ff2928c03856ac644e6facd4")
      public
          fun siteMapsConfiguration(siteMapsConfiguration: WebCrawlerSiteMapsConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty.builder()

      override fun seedUrlConfiguration(seedUrlConfiguration: IResolvable) {
        cdkBuilder.seedUrlConfiguration(seedUrlConfiguration.let(IResolvable::unwrap))
      }

      override
          fun seedUrlConfiguration(seedUrlConfiguration: WebCrawlerSeedUrlConfigurationProperty) {
        cdkBuilder.seedUrlConfiguration(seedUrlConfiguration.let(WebCrawlerSeedUrlConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("82f98e3cc6b19884926eac964217023af22b275e09e65fa53d053724d4d2b6bd")
      override
          fun seedUrlConfiguration(seedUrlConfiguration: WebCrawlerSeedUrlConfigurationProperty.Builder.() -> Unit):
          Unit = seedUrlConfiguration(WebCrawlerSeedUrlConfigurationProperty(seedUrlConfiguration))

      override fun siteMapsConfiguration(siteMapsConfiguration: IResolvable) {
        cdkBuilder.siteMapsConfiguration(siteMapsConfiguration.let(IResolvable::unwrap))
      }

      override
          fun siteMapsConfiguration(siteMapsConfiguration: WebCrawlerSiteMapsConfigurationProperty) {
        cdkBuilder.siteMapsConfiguration(siteMapsConfiguration.let(WebCrawlerSiteMapsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("42270145f287d26bf5765aa46ea377506996d9f8ff2928c03856ac644e6facd4")
      override
          fun siteMapsConfiguration(siteMapsConfiguration: WebCrawlerSiteMapsConfigurationProperty.Builder.() -> Unit):
          Unit =
          siteMapsConfiguration(WebCrawlerSiteMapsConfigurationProperty(siteMapsConfiguration))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty,
    ) : WebCrawlerUrlsProperty {
      override fun seedUrlConfiguration(): Any? = unwrap(this).getSeedUrlConfiguration()

      override fun siteMapsConfiguration(): Any? = unwrap(this).getSiteMapsConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WebCrawlerUrlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty):
          WebCrawlerUrlsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WebCrawlerUrlsProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.WebCrawlerUrlsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ConfluenceBlogConfigurationProperty {
    public fun blogFieldMappings(): Any? = unwrap(this).getBlogFieldMappings()

    public interface Builder {
      public fun blogFieldMappings(blogFieldMappings: IResolvable)

      public fun blogFieldMappings(blogFieldMappings: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty.builder()

      override fun blogFieldMappings(blogFieldMappings: IResolvable) {
        cdkBuilder.blogFieldMappings(blogFieldMappings.let(IResolvable::unwrap))
      }

      override fun blogFieldMappings(blogFieldMappings: List<Any>) {
        cdkBuilder.blogFieldMappings(blogFieldMappings)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty,
    ) : ConfluenceBlogConfigurationProperty {
      override fun blogFieldMappings(): Any? = unwrap(this).getBlogFieldMappings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluenceBlogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty):
          ConfluenceBlogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceBlogConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SqlConfigurationProperty {
    public fun queryIdentifiersEnclosingOption(): String? =
        unwrap(this).getQueryIdentifiersEnclosingOption()

    public interface Builder {
      public fun queryIdentifiersEnclosingOption(queryIdentifiersEnclosingOption: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty.builder()

      override fun queryIdentifiersEnclosingOption(queryIdentifiersEnclosingOption: String) {
        cdkBuilder.queryIdentifiersEnclosingOption(queryIdentifiersEnclosingOption)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty,
    ) : SqlConfigurationProperty {
      override fun queryIdentifiersEnclosingOption(): String? =
          unwrap(this).getQueryIdentifiersEnclosingOption()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SqlConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty):
          SqlConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqlConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.SqlConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface S3PathProperty {
    public fun bucket(): String

    public fun key(): String

    public interface Builder {
      public fun bucket(bucket: String)

      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build(): software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty,
    ) : S3PathProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun key(): String = unwrap(this).getKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3PathProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty):
          S3PathProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3PathProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.S3PathProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ConfluenceSpaceToIndexFieldMappingProperty {
    public fun dataSourceFieldName(): String

    public fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

    public fun indexFieldName(): String

    public interface Builder {
      public fun dataSourceFieldName(dataSourceFieldName: String)

      public fun dateFieldFormat(dateFieldFormat: String)

      public fun indexFieldName(indexFieldName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty.builder()

      override fun dataSourceFieldName(dataSourceFieldName: String) {
        cdkBuilder.dataSourceFieldName(dataSourceFieldName)
      }

      override fun dateFieldFormat(dateFieldFormat: String) {
        cdkBuilder.dateFieldFormat(dateFieldFormat)
      }

      override fun indexFieldName(indexFieldName: String) {
        cdkBuilder.indexFieldName(indexFieldName)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty,
    ) : ConfluenceSpaceToIndexFieldMappingProperty {
      override fun dataSourceFieldName(): String = unwrap(this).getDataSourceFieldName()

      override fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

      override fun indexFieldName(): String = unwrap(this).getIndexFieldName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluenceSpaceToIndexFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty):
          ConfluenceSpaceToIndexFieldMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceSpaceToIndexFieldMappingProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConfluenceBlogToIndexFieldMappingProperty {
    public fun dataSourceFieldName(): String

    public fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

    public fun indexFieldName(): String

    public interface Builder {
      public fun dataSourceFieldName(dataSourceFieldName: String)

      public fun dateFieldFormat(dateFieldFormat: String)

      public fun indexFieldName(indexFieldName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty.builder()

      override fun dataSourceFieldName(dataSourceFieldName: String) {
        cdkBuilder.dataSourceFieldName(dataSourceFieldName)
      }

      override fun dateFieldFormat(dateFieldFormat: String) {
        cdkBuilder.dateFieldFormat(dateFieldFormat)
      }

      override fun indexFieldName(indexFieldName: String) {
        cdkBuilder.indexFieldName(indexFieldName)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty,
    ) : ConfluenceBlogToIndexFieldMappingProperty {
      override fun dataSourceFieldName(): String = unwrap(this).getDataSourceFieldName()

      override fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

      override fun indexFieldName(): String = unwrap(this).getIndexFieldName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluenceBlogToIndexFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty):
          ConfluenceBlogToIndexFieldMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceBlogToIndexFieldMappingProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceBlogToIndexFieldMappingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ProxyConfigurationProperty {
    public fun credentials(): String? = unwrap(this).getCredentials()

    public fun host(): String

    public fun port(): Number

    public interface Builder {
      public fun credentials(credentials: String)

      public fun host(host: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty.builder()

      override fun credentials(credentials: String) {
        cdkBuilder.credentials(credentials)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty,
    ) : ProxyConfigurationProperty {
      override fun credentials(): String? = unwrap(this).getCredentials()

      override fun host(): String = unwrap(this).getHost()

      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProxyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty):
          ProxyConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProxyConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ProxyConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AccessControlListConfigurationProperty {
    public fun keyPath(): String? = unwrap(this).getKeyPath()

    public interface Builder {
      public fun keyPath(keyPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty.builder()

      override fun keyPath(keyPath: String) {
        cdkBuilder.keyPath(keyPath)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty,
    ) : AccessControlListConfigurationProperty {
      override fun keyPath(): String? = unwrap(this).getKeyPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AccessControlListConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty):
          AccessControlListConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessControlListConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.AccessControlListConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConfluenceAttachmentToIndexFieldMappingProperty {
    public fun dataSourceFieldName(): String

    public fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

    public fun indexFieldName(): String

    public interface Builder {
      public fun dataSourceFieldName(dataSourceFieldName: String)

      public fun dateFieldFormat(dateFieldFormat: String)

      public fun indexFieldName(indexFieldName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty.builder()

      override fun dataSourceFieldName(dataSourceFieldName: String) {
        cdkBuilder.dataSourceFieldName(dataSourceFieldName)
      }

      override fun dateFieldFormat(dateFieldFormat: String) {
        cdkBuilder.dateFieldFormat(dateFieldFormat)
      }

      override fun indexFieldName(indexFieldName: String) {
        cdkBuilder.indexFieldName(indexFieldName)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty,
    ) : ConfluenceAttachmentToIndexFieldMappingProperty {
      override fun dataSourceFieldName(): String = unwrap(this).getDataSourceFieldName()

      override fun dateFieldFormat(): String? = unwrap(this).getDateFieldFormat()

      override fun indexFieldName(): String = unwrap(this).getIndexFieldName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluenceAttachmentToIndexFieldMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty):
          ConfluenceAttachmentToIndexFieldMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceAttachmentToIndexFieldMappingProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentToIndexFieldMappingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConfluenceAttachmentConfigurationProperty {
    public fun attachmentFieldMappings(): Any? = unwrap(this).getAttachmentFieldMappings()

    public fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

    public interface Builder {
      public fun attachmentFieldMappings(attachmentFieldMappings: IResolvable)

      public fun attachmentFieldMappings(attachmentFieldMappings: List<Any>)

      public fun crawlAttachments(crawlAttachments: Boolean)

      public fun crawlAttachments(crawlAttachments: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty.builder()

      override fun attachmentFieldMappings(attachmentFieldMappings: IResolvable) {
        cdkBuilder.attachmentFieldMappings(attachmentFieldMappings.let(IResolvable::unwrap))
      }

      override fun attachmentFieldMappings(attachmentFieldMappings: List<Any>) {
        cdkBuilder.attachmentFieldMappings(attachmentFieldMappings)
      }

      override fun crawlAttachments(crawlAttachments: Boolean) {
        cdkBuilder.crawlAttachments(crawlAttachments)
      }

      override fun crawlAttachments(crawlAttachments: IResolvable) {
        cdkBuilder.crawlAttachments(crawlAttachments.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty,
    ) : ConfluenceAttachmentConfigurationProperty {
      override fun attachmentFieldMappings(): Any? = unwrap(this).getAttachmentFieldMappings()

      override fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConfluenceAttachmentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty):
          ConfluenceAttachmentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfluenceAttachmentConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ConfluenceAttachmentConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface InlineCustomDocumentEnrichmentConfigurationProperty {
    public fun condition(): Any? = unwrap(this).getCondition()

    public fun documentContentDeletion(): Any? = unwrap(this).getDocumentContentDeletion()

    public fun target(): Any? = unwrap(this).getTarget()

    public interface Builder {
      public fun condition(condition: IResolvable)

      public fun condition(condition: DocumentAttributeConditionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("372eb10ee98294f51fc68306591bc84442eccbfa064b67783a71dda041a0902a")
      public fun condition(condition: DocumentAttributeConditionProperty.Builder.() -> Unit)

      public fun documentContentDeletion(documentContentDeletion: Boolean)

      public fun documentContentDeletion(documentContentDeletion: IResolvable)

      public fun target(target: IResolvable)

      public fun target(target: DocumentAttributeTargetProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1ba879dc4c824e5d2166f0aa9878e17fb1bcac8b563f403834655e16a2bef59")
      public fun target(target: DocumentAttributeTargetProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty.builder()

      override fun condition(condition: IResolvable) {
        cdkBuilder.condition(condition.let(IResolvable::unwrap))
      }

      override fun condition(condition: DocumentAttributeConditionProperty) {
        cdkBuilder.condition(condition.let(DocumentAttributeConditionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("372eb10ee98294f51fc68306591bc84442eccbfa064b67783a71dda041a0902a")
      override fun condition(condition: DocumentAttributeConditionProperty.Builder.() -> Unit): Unit
          = condition(DocumentAttributeConditionProperty(condition))

      override fun documentContentDeletion(documentContentDeletion: Boolean) {
        cdkBuilder.documentContentDeletion(documentContentDeletion)
      }

      override fun documentContentDeletion(documentContentDeletion: IResolvable) {
        cdkBuilder.documentContentDeletion(documentContentDeletion.let(IResolvable::unwrap))
      }

      override fun target(target: IResolvable) {
        cdkBuilder.target(target.let(IResolvable::unwrap))
      }

      override fun target(target: DocumentAttributeTargetProperty) {
        cdkBuilder.target(target.let(DocumentAttributeTargetProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1ba879dc4c824e5d2166f0aa9878e17fb1bcac8b563f403834655e16a2bef59")
      override fun target(target: DocumentAttributeTargetProperty.Builder.() -> Unit): Unit =
          target(DocumentAttributeTargetProperty(target))

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty,
    ) : InlineCustomDocumentEnrichmentConfigurationProperty {
      override fun condition(): Any? = unwrap(this).getCondition()

      override fun documentContentDeletion(): Any? = unwrap(this).getDocumentContentDeletion()

      override fun target(): Any? = unwrap(this).getTarget()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          InlineCustomDocumentEnrichmentConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty):
          InlineCustomDocumentEnrichmentConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InlineCustomDocumentEnrichmentConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.InlineCustomDocumentEnrichmentConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3DataSourceConfigurationProperty {
    public fun accessControlListConfiguration(): Any? =
        unwrap(this).getAccessControlListConfiguration()

    public fun bucketName(): String

    public fun documentsMetadataConfiguration(): Any? =
        unwrap(this).getDocumentsMetadataConfiguration()

    public fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
        emptyList()

    public fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
        emptyList()

    public fun inclusionPrefixes(): List<String> = unwrap(this).getInclusionPrefixes() ?:
        emptyList()

    public interface Builder {
      public fun accessControlListConfiguration(accessControlListConfiguration: IResolvable)

      public
          fun accessControlListConfiguration(accessControlListConfiguration: AccessControlListConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad7f7d2544abe79db57cd7d122e90ba7101511573636633c85a2332f1c60b76c")
      public
          fun accessControlListConfiguration(accessControlListConfiguration: AccessControlListConfigurationProperty.Builder.() -> Unit)

      public fun bucketName(bucketName: String)

      public fun documentsMetadataConfiguration(documentsMetadataConfiguration: IResolvable)

      public
          fun documentsMetadataConfiguration(documentsMetadataConfiguration: DocumentsMetadataConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e62841f85387b18315a1a2a9c0ddbe5b09a6442ce91b81a01d85c19f2e7d41e2")
      public
          fun documentsMetadataConfiguration(documentsMetadataConfiguration: DocumentsMetadataConfigurationProperty.Builder.() -> Unit)

      public fun exclusionPatterns(exclusionPatterns: List<String>)

      public fun inclusionPatterns(inclusionPatterns: List<String>)

      public fun inclusionPrefixes(inclusionPrefixes: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty.builder()

      override fun accessControlListConfiguration(accessControlListConfiguration: IResolvable) {
        cdkBuilder.accessControlListConfiguration(accessControlListConfiguration.let(IResolvable::unwrap))
      }

      override
          fun accessControlListConfiguration(accessControlListConfiguration: AccessControlListConfigurationProperty) {
        cdkBuilder.accessControlListConfiguration(accessControlListConfiguration.let(AccessControlListConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad7f7d2544abe79db57cd7d122e90ba7101511573636633c85a2332f1c60b76c")
      override
          fun accessControlListConfiguration(accessControlListConfiguration: AccessControlListConfigurationProperty.Builder.() -> Unit):
          Unit =
          accessControlListConfiguration(AccessControlListConfigurationProperty(accessControlListConfiguration))

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun documentsMetadataConfiguration(documentsMetadataConfiguration: IResolvable) {
        cdkBuilder.documentsMetadataConfiguration(documentsMetadataConfiguration.let(IResolvable::unwrap))
      }

      override
          fun documentsMetadataConfiguration(documentsMetadataConfiguration: DocumentsMetadataConfigurationProperty) {
        cdkBuilder.documentsMetadataConfiguration(documentsMetadataConfiguration.let(DocumentsMetadataConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e62841f85387b18315a1a2a9c0ddbe5b09a6442ce91b81a01d85c19f2e7d41e2")
      override
          fun documentsMetadataConfiguration(documentsMetadataConfiguration: DocumentsMetadataConfigurationProperty.Builder.() -> Unit):
          Unit =
          documentsMetadataConfiguration(DocumentsMetadataConfigurationProperty(documentsMetadataConfiguration))

      override fun exclusionPatterns(exclusionPatterns: List<String>) {
        cdkBuilder.exclusionPatterns(exclusionPatterns)
      }

      override fun inclusionPatterns(inclusionPatterns: List<String>) {
        cdkBuilder.inclusionPatterns(inclusionPatterns)
      }

      override fun inclusionPrefixes(inclusionPrefixes: List<String>) {
        cdkBuilder.inclusionPrefixes(inclusionPrefixes)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty,
    ) : S3DataSourceConfigurationProperty {
      override fun accessControlListConfiguration(): Any? =
          unwrap(this).getAccessControlListConfiguration()

      override fun bucketName(): String = unwrap(this).getBucketName()

      override fun documentsMetadataConfiguration(): Any? =
          unwrap(this).getDocumentsMetadataConfiguration()

      override fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
          emptyList()

      override fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
          emptyList()

      override fun inclusionPrefixes(): List<String> = unwrap(this).getInclusionPrefixes() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3DataSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty):
          S3DataSourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DataSourceConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.S3DataSourceConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ColumnConfigurationProperty {
    public fun changeDetectingColumns(): List<String>

    public fun documentDataColumnName(): String

    public fun documentIdColumnName(): String

    public fun documentTitleColumnName(): String? = unwrap(this).getDocumentTitleColumnName()

    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    public interface Builder {
      public fun changeDetectingColumns(changeDetectingColumns: List<String>)

      public fun documentDataColumnName(documentDataColumnName: String)

      public fun documentIdColumnName(documentIdColumnName: String)

      public fun documentTitleColumnName(documentTitleColumnName: String)

      public fun fieldMappings(fieldMappings: IResolvable)

      public fun fieldMappings(fieldMappings: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty.Builder =
          software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty.builder()

      override fun changeDetectingColumns(changeDetectingColumns: List<String>) {
        cdkBuilder.changeDetectingColumns(changeDetectingColumns)
      }

      override fun documentDataColumnName(documentDataColumnName: String) {
        cdkBuilder.documentDataColumnName(documentDataColumnName)
      }

      override fun documentIdColumnName(documentIdColumnName: String) {
        cdkBuilder.documentIdColumnName(documentIdColumnName)
      }

      override fun documentTitleColumnName(documentTitleColumnName: String) {
        cdkBuilder.documentTitleColumnName(documentTitleColumnName)
      }

      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty,
    ) : ColumnConfigurationProperty {
      override fun changeDetectingColumns(): List<String> = unwrap(this).getChangeDetectingColumns()
          ?: emptyList()

      override fun documentDataColumnName(): String = unwrap(this).getDocumentDataColumnName()

      override fun documentIdColumnName(): String = unwrap(this).getDocumentIdColumnName()

      override fun documentTitleColumnName(): String? = unwrap(this).getDocumentTitleColumnName()

      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty):
          ColumnConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ColumnConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ServiceNowKnowledgeArticleConfigurationProperty {
    public fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

    public fun documentDataFieldName(): String

    public fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

    public fun excludeAttachmentFilePatterns(): List<String> =
        unwrap(this).getExcludeAttachmentFilePatterns() ?: emptyList()

    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    public fun filterQuery(): String? = unwrap(this).getFilterQuery()

    public fun includeAttachmentFilePatterns(): List<String> =
        unwrap(this).getIncludeAttachmentFilePatterns() ?: emptyList()

    public interface Builder {
      public fun crawlAttachments(crawlAttachments: Boolean)

      public fun crawlAttachments(crawlAttachments: IResolvable)

      public fun documentDataFieldName(documentDataFieldName: String)

      public fun documentTitleFieldName(documentTitleFieldName: String)

      public fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: List<String>)

      public fun fieldMappings(fieldMappings: IResolvable)

      public fun fieldMappings(fieldMappings: List<Any>)

      public fun filterQuery(filterQuery: String)

      public fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty.builder()

      override fun crawlAttachments(crawlAttachments: Boolean) {
        cdkBuilder.crawlAttachments(crawlAttachments)
      }

      override fun crawlAttachments(crawlAttachments: IResolvable) {
        cdkBuilder.crawlAttachments(crawlAttachments.let(IResolvable::unwrap))
      }

      override fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
      }

      override fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
      }

      override fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: List<String>) {
        cdkBuilder.excludeAttachmentFilePatterns(excludeAttachmentFilePatterns)
      }

      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      override fun filterQuery(filterQuery: String) {
        cdkBuilder.filterQuery(filterQuery)
      }

      override fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: List<String>) {
        cdkBuilder.includeAttachmentFilePatterns(includeAttachmentFilePatterns)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty,
    ) : ServiceNowKnowledgeArticleConfigurationProperty {
      override fun crawlAttachments(): Any? = unwrap(this).getCrawlAttachments()

      override fun documentDataFieldName(): String = unwrap(this).getDocumentDataFieldName()

      override fun documentTitleFieldName(): String? = unwrap(this).getDocumentTitleFieldName()

      override fun excludeAttachmentFilePatterns(): List<String> =
          unwrap(this).getExcludeAttachmentFilePatterns() ?: emptyList()

      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      override fun filterQuery(): String? = unwrap(this).getFilterQuery()

      override fun includeAttachmentFilePatterns(): List<String> =
          unwrap(this).getIncludeAttachmentFilePatterns() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServiceNowKnowledgeArticleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty):
          ServiceNowKnowledgeArticleConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceNowKnowledgeArticleConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface GoogleDriveConfigurationProperty {
    public fun excludeMimeTypes(): List<String> = unwrap(this).getExcludeMimeTypes() ?: emptyList()

    public fun excludeSharedDrives(): List<String> = unwrap(this).getExcludeSharedDrives() ?:
        emptyList()

    public fun excludeUserAccounts(): List<String> = unwrap(this).getExcludeUserAccounts() ?:
        emptyList()

    public fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
        emptyList()

    public fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

    public fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
        emptyList()

    public fun secretArn(): String

    public interface Builder {
      public fun excludeMimeTypes(excludeMimeTypes: List<String>)

      public fun excludeSharedDrives(excludeSharedDrives: List<String>)

      public fun excludeUserAccounts(excludeUserAccounts: List<String>)

      public fun exclusionPatterns(exclusionPatterns: List<String>)

      public fun fieldMappings(fieldMappings: IResolvable)

      public fun fieldMappings(fieldMappings: List<Any>)

      public fun inclusionPatterns(inclusionPatterns: List<String>)

      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty.builder()

      override fun excludeMimeTypes(excludeMimeTypes: List<String>) {
        cdkBuilder.excludeMimeTypes(excludeMimeTypes)
      }

      override fun excludeSharedDrives(excludeSharedDrives: List<String>) {
        cdkBuilder.excludeSharedDrives(excludeSharedDrives)
      }

      override fun excludeUserAccounts(excludeUserAccounts: List<String>) {
        cdkBuilder.excludeUserAccounts(excludeUserAccounts)
      }

      override fun exclusionPatterns(exclusionPatterns: List<String>) {
        cdkBuilder.exclusionPatterns(exclusionPatterns)
      }

      override fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings.let(IResolvable::unwrap))
      }

      override fun fieldMappings(fieldMappings: List<Any>) {
        cdkBuilder.fieldMappings(fieldMappings)
      }

      override fun inclusionPatterns(inclusionPatterns: List<String>) {
        cdkBuilder.inclusionPatterns(inclusionPatterns)
      }

      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build():
          software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty,
    ) : GoogleDriveConfigurationProperty {
      override fun excludeMimeTypes(): List<String> = unwrap(this).getExcludeMimeTypes() ?:
          emptyList()

      override fun excludeSharedDrives(): List<String> = unwrap(this).getExcludeSharedDrives() ?:
          emptyList()

      override fun excludeUserAccounts(): List<String> = unwrap(this).getExcludeUserAccounts() ?:
          emptyList()

      override fun exclusionPatterns(): List<String> = unwrap(this).getExclusionPatterns() ?:
          emptyList()

      override fun fieldMappings(): Any? = unwrap(this).getFieldMappings()

      override fun inclusionPatterns(): List<String> = unwrap(this).getInclusionPatterns() ?:
          emptyList()

      override fun secretArn(): String = unwrap(this).getSecretArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): GoogleDriveConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty):
          GoogleDriveConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GoogleDriveConfigurationProperty):
          software.amazon.awscdk.services.kendra.CfnDataSource.GoogleDriveConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
