@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.aps

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A scraper is a fully-managed agentless collector that discovers and pulls metrics automatically.
 *
 * A scraper pulls metrics from Prometheus-compatible sources within an Amazon EKS cluster, and
 * sends them to your Amazon Managed Service for Prometheus workspace. Scrapers are flexible. You can
 * configure the scraper to control what metrics are collected, the frequency of collection, what
 * transformations are applied to the metrics, and more.
 *
 * An IAM role will be created for you that Amazon Managed Service for Prometheus uses to access the
 * metrics in your cluster. You must configure this role with a policy that allows it to scrape metrics
 * from your cluster. For more information, see [Configuring your Amazon EKS
 * cluster](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-collector-how-to.html#AMP-collector-eks-setup)
 * in the *Amazon Managed Service for Prometheus User Guide* .
 *
 * The `scrapeConfiguration` parameter contains the YAML configuration for the scraper.
 *
 *
 * For more information about collectors, including what metrics are collected, and how to configure
 * the scraper, see [Using an AWS managed
 * collector](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-collector-how-to.html) in the
 * *Amazon Managed Service for Prometheus User Guide* .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.aps.*;
 * CfnScraper cfnScraper = CfnScraper.Builder.create(this, "MyCfnScraper")
 * .destination(DestinationProperty.builder()
 * .ampConfiguration(AmpConfigurationProperty.builder()
 * .workspaceArn("workspaceArn")
 * .build())
 * .build())
 * .scrapeConfiguration(ScrapeConfigurationProperty.builder()
 * .configurationBlob("configurationBlob")
 * .build())
 * .source(SourceProperty.builder()
 * .eksConfiguration(EksConfigurationProperty.builder()
 * .clusterArn("clusterArn")
 * .subnetIds(List.of("subnetIds"))
 * // the properties below are optional
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build())
 * .build())
 * // the properties below are optional
 * .alias("alias")
 * .roleConfiguration(RoleConfigurationProperty.builder()
 * .sourceRoleArn("sourceRoleArn")
 * .targetRoleArn("targetRoleArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html)
 */
public open class CfnScraper(
  cdkObject: software.amazon.awscdk.services.aps.CfnScraper,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnScraperProps,
  ) :
      this(software.amazon.awscdk.services.aps.CfnScraper(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnScraperProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnScraperProps.Builder.() -> Unit,
  ) : this(scope, id, CfnScraperProps(props)
  )

  /**
   * An optional user-assigned scraper alias.
   */
  public open fun alias(): String? = unwrap(this).getAlias()

  /**
   * An optional user-assigned scraper alias.
   */
  public open fun alias(`value`: String) {
    unwrap(this).setAlias(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the scraper.
   *
   * For example,
   * `arn:aws:aps:&lt;region&gt;:123456798012:scraper/s-example1-1234-abcd-5678-ef9012abcd34` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the scraper to
   * discover and collect metrics on your behalf.
   *
   * For example, `arn:aws:iam::123456789012:role/service-role/AmazonGrafanaServiceRole-12example` .
   */
  public open fun attrRoleArn(): String = unwrap(this).getAttrRoleArn()

  /**
   * The ID of the scraper.
   *
   * For example, `s-example1-1234-abcd-5678-ef9012abcd34` .
   */
  public open fun attrScraperId(): String = unwrap(this).getAttrScraperId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
   */
  public open fun destination(): Any = unwrap(this).getDestination()

  /**
   * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
   */
  public open fun destination(`value`: IResolvable) {
    unwrap(this).setDestination(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
   */
  public open fun destination(`value`: DestinationProperty) {
    unwrap(this).setDestination(`value`.let(DestinationProperty.Companion::unwrap))
  }

  /**
   * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("67efaa25fee918a606db2ac1356ad3c0c25d76f88bf76ad4f2cb1640bca9bfab")
  public open fun destination(`value`: DestinationProperty.Builder.() -> Unit): Unit =
      destination(DestinationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The role configuration in an Amazon Managed Service for Prometheus scraper.
   */
  public open fun roleConfiguration(): Any? = unwrap(this).getRoleConfiguration()

  /**
   * The role configuration in an Amazon Managed Service for Prometheus scraper.
   */
  public open fun roleConfiguration(`value`: IResolvable) {
    unwrap(this).setRoleConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The role configuration in an Amazon Managed Service for Prometheus scraper.
   */
  public open fun roleConfiguration(`value`: RoleConfigurationProperty) {
    unwrap(this).setRoleConfiguration(`value`.let(RoleConfigurationProperty.Companion::unwrap))
  }

  /**
   * The role configuration in an Amazon Managed Service for Prometheus scraper.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("58e890cf4696f71748826e2afe5c8e7d9f13ab4317b511ae80dbe8712300abb7")
  public open fun roleConfiguration(`value`: RoleConfigurationProperty.Builder.() -> Unit): Unit =
      roleConfiguration(RoleConfigurationProperty(`value`))

  /**
   * The configuration in use by the scraper.
   */
  public open fun scrapeConfiguration(): Any = unwrap(this).getScrapeConfiguration()

  /**
   * The configuration in use by the scraper.
   */
  public open fun scrapeConfiguration(`value`: IResolvable) {
    unwrap(this).setScrapeConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration in use by the scraper.
   */
  public open fun scrapeConfiguration(`value`: ScrapeConfigurationProperty) {
    unwrap(this).setScrapeConfiguration(`value`.let(ScrapeConfigurationProperty.Companion::unwrap))
  }

  /**
   * The configuration in use by the scraper.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6f4f1ba522d60f9542f751be4ae132cebf3168afc65876cfa329012c67217ef5")
  public open fun scrapeConfiguration(`value`: ScrapeConfigurationProperty.Builder.() -> Unit): Unit
      = scrapeConfiguration(ScrapeConfigurationProperty(`value`))

  /**
   * The Amazon EKS cluster from which the scraper collects metrics.
   */
  public open fun source(): Any = unwrap(this).getSource()

  /**
   * The Amazon EKS cluster from which the scraper collects metrics.
   */
  public open fun source(`value`: IResolvable) {
    unwrap(this).setSource(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The Amazon EKS cluster from which the scraper collects metrics.
   */
  public open fun source(`value`: SourceProperty) {
    unwrap(this).setSource(`value`.let(SourceProperty.Companion::unwrap))
  }

  /**
   * The Amazon EKS cluster from which the scraper collects metrics.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c5f5e26f5d394dc83ebc745c4eb0e95962042a26afce330b6886006aa03a7940")
  public open fun source(`value`: SourceProperty.Builder.() -> Unit): Unit =
      source(SourceProperty(`value`))

  /**
   * (Optional) The list of tag keys and values associated with the scraper.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * (Optional) The list of tag keys and values associated with the scraper.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * (Optional) The list of tag keys and values associated with the scraper.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.aps.CfnScraper].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional user-assigned scraper alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-alias)
     * @param alias An optional user-assigned scraper alias. 
     */
    public fun alias(alias: String)

    /**
     * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-destination)
     * @param destination The Amazon Managed Service for Prometheus workspace the scraper sends
     * metrics to. 
     */
    public fun destination(destination: IResolvable)

    /**
     * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-destination)
     * @param destination The Amazon Managed Service for Prometheus workspace the scraper sends
     * metrics to. 
     */
    public fun destination(destination: DestinationProperty)

    /**
     * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-destination)
     * @param destination The Amazon Managed Service for Prometheus workspace the scraper sends
     * metrics to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2278d04adcb3a7675f040f9dc1d8bd8f7fe3680ea2624286e6beaee9715ce67")
    public fun destination(destination: DestinationProperty.Builder.() -> Unit)

    /**
     * The role configuration in an Amazon Managed Service for Prometheus scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-roleconfiguration)
     * @param roleConfiguration The role configuration in an Amazon Managed Service for Prometheus
     * scraper. 
     */
    public fun roleConfiguration(roleConfiguration: IResolvable)

    /**
     * The role configuration in an Amazon Managed Service for Prometheus scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-roleconfiguration)
     * @param roleConfiguration The role configuration in an Amazon Managed Service for Prometheus
     * scraper. 
     */
    public fun roleConfiguration(roleConfiguration: RoleConfigurationProperty)

    /**
     * The role configuration in an Amazon Managed Service for Prometheus scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-roleconfiguration)
     * @param roleConfiguration The role configuration in an Amazon Managed Service for Prometheus
     * scraper. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("840829ec18a6bb285cf211406f0dae5698c892fd8b434c8109839b51d0cabbb5")
    public fun roleConfiguration(roleConfiguration: RoleConfigurationProperty.Builder.() -> Unit)

    /**
     * The configuration in use by the scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-scrapeconfiguration)
     * @param scrapeConfiguration The configuration in use by the scraper. 
     */
    public fun scrapeConfiguration(scrapeConfiguration: IResolvable)

    /**
     * The configuration in use by the scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-scrapeconfiguration)
     * @param scrapeConfiguration The configuration in use by the scraper. 
     */
    public fun scrapeConfiguration(scrapeConfiguration: ScrapeConfigurationProperty)

    /**
     * The configuration in use by the scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-scrapeconfiguration)
     * @param scrapeConfiguration The configuration in use by the scraper. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b05368caa68886614fee18f6288e18cc52297d77acf5a0db2b1d3ad62d974a5c")
    public
        fun scrapeConfiguration(scrapeConfiguration: ScrapeConfigurationProperty.Builder.() -> Unit)

    /**
     * The Amazon EKS cluster from which the scraper collects metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-source)
     * @param source The Amazon EKS cluster from which the scraper collects metrics. 
     */
    public fun source(source: IResolvable)

    /**
     * The Amazon EKS cluster from which the scraper collects metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-source)
     * @param source The Amazon EKS cluster from which the scraper collects metrics. 
     */
    public fun source(source: SourceProperty)

    /**
     * The Amazon EKS cluster from which the scraper collects metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-source)
     * @param source The Amazon EKS cluster from which the scraper collects metrics. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f95dc2bab1abee487827fecf63738d7ad31090ddabe0bfaba3b10b646314a9e")
    public fun source(source: SourceProperty.Builder.() -> Unit)

    /**
     * (Optional) The list of tag keys and values associated with the scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-tags)
     * @param tags (Optional) The list of tag keys and values associated with the scraper. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * (Optional) The list of tag keys and values associated with the scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-tags)
     * @param tags (Optional) The list of tag keys and values associated with the scraper. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.aps.CfnScraper.Builder =
        software.amazon.awscdk.services.aps.CfnScraper.Builder.create(scope, id)

    /**
     * An optional user-assigned scraper alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-alias)
     * @param alias An optional user-assigned scraper alias. 
     */
    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    /**
     * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-destination)
     * @param destination The Amazon Managed Service for Prometheus workspace the scraper sends
     * metrics to. 
     */
    override fun destination(destination: IResolvable) {
      cdkBuilder.destination(destination.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-destination)
     * @param destination The Amazon Managed Service for Prometheus workspace the scraper sends
     * metrics to. 
     */
    override fun destination(destination: DestinationProperty) {
      cdkBuilder.destination(destination.let(DestinationProperty.Companion::unwrap))
    }

    /**
     * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-destination)
     * @param destination The Amazon Managed Service for Prometheus workspace the scraper sends
     * metrics to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2278d04adcb3a7675f040f9dc1d8bd8f7fe3680ea2624286e6beaee9715ce67")
    override fun destination(destination: DestinationProperty.Builder.() -> Unit): Unit =
        destination(DestinationProperty(destination))

    /**
     * The role configuration in an Amazon Managed Service for Prometheus scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-roleconfiguration)
     * @param roleConfiguration The role configuration in an Amazon Managed Service for Prometheus
     * scraper. 
     */
    override fun roleConfiguration(roleConfiguration: IResolvable) {
      cdkBuilder.roleConfiguration(roleConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The role configuration in an Amazon Managed Service for Prometheus scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-roleconfiguration)
     * @param roleConfiguration The role configuration in an Amazon Managed Service for Prometheus
     * scraper. 
     */
    override fun roleConfiguration(roleConfiguration: RoleConfigurationProperty) {
      cdkBuilder.roleConfiguration(roleConfiguration.let(RoleConfigurationProperty.Companion::unwrap))
    }

    /**
     * The role configuration in an Amazon Managed Service for Prometheus scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-roleconfiguration)
     * @param roleConfiguration The role configuration in an Amazon Managed Service for Prometheus
     * scraper. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("840829ec18a6bb285cf211406f0dae5698c892fd8b434c8109839b51d0cabbb5")
    override fun roleConfiguration(roleConfiguration: RoleConfigurationProperty.Builder.() -> Unit):
        Unit = roleConfiguration(RoleConfigurationProperty(roleConfiguration))

    /**
     * The configuration in use by the scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-scrapeconfiguration)
     * @param scrapeConfiguration The configuration in use by the scraper. 
     */
    override fun scrapeConfiguration(scrapeConfiguration: IResolvable) {
      cdkBuilder.scrapeConfiguration(scrapeConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration in use by the scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-scrapeconfiguration)
     * @param scrapeConfiguration The configuration in use by the scraper. 
     */
    override fun scrapeConfiguration(scrapeConfiguration: ScrapeConfigurationProperty) {
      cdkBuilder.scrapeConfiguration(scrapeConfiguration.let(ScrapeConfigurationProperty.Companion::unwrap))
    }

    /**
     * The configuration in use by the scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-scrapeconfiguration)
     * @param scrapeConfiguration The configuration in use by the scraper. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b05368caa68886614fee18f6288e18cc52297d77acf5a0db2b1d3ad62d974a5c")
    override
        fun scrapeConfiguration(scrapeConfiguration: ScrapeConfigurationProperty.Builder.() -> Unit):
        Unit = scrapeConfiguration(ScrapeConfigurationProperty(scrapeConfiguration))

    /**
     * The Amazon EKS cluster from which the scraper collects metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-source)
     * @param source The Amazon EKS cluster from which the scraper collects metrics. 
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Amazon EKS cluster from which the scraper collects metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-source)
     * @param source The Amazon EKS cluster from which the scraper collects metrics. 
     */
    override fun source(source: SourceProperty) {
      cdkBuilder.source(source.let(SourceProperty.Companion::unwrap))
    }

    /**
     * The Amazon EKS cluster from which the scraper collects metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-source)
     * @param source The Amazon EKS cluster from which the scraper collects metrics. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f95dc2bab1abee487827fecf63738d7ad31090ddabe0bfaba3b10b646314a9e")
    override fun source(source: SourceProperty.Builder.() -> Unit): Unit =
        source(SourceProperty(source))

    /**
     * (Optional) The list of tag keys and values associated with the scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-tags)
     * @param tags (Optional) The list of tag keys and values associated with the scraper. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * (Optional) The list of tag keys and values associated with the scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-tags)
     * @param tags (Optional) The list of tag keys and values associated with the scraper. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.aps.CfnScraper = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.aps.CfnScraper.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScraper {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScraper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnScraper): CfnScraper =
        CfnScraper(cdkObject)

    internal fun unwrap(wrapped: CfnScraper): software.amazon.awscdk.services.aps.CfnScraper =
        wrapped.cdkObject as software.amazon.awscdk.services.aps.CfnScraper
  }

  /**
   * The `AmpConfiguration` structure defines the Amazon Managed Service for Prometheus instance a
   * scraper should send metrics to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aps.*;
   * AmpConfigurationProperty ampConfigurationProperty = AmpConfigurationProperty.builder()
   * .workspaceArn("workspaceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-ampconfiguration.html)
   */
  public interface AmpConfigurationProperty {
    /**
     * ARN of the Amazon Managed Service for Prometheus workspace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-ampconfiguration.html#cfn-aps-scraper-ampconfiguration-workspacearn)
     */
    public fun workspaceArn(): String

    /**
     * A builder for [AmpConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param workspaceArn ARN of the Amazon Managed Service for Prometheus workspace. 
       */
      public fun workspaceArn(workspaceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aps.CfnScraper.AmpConfigurationProperty.Builder =
          software.amazon.awscdk.services.aps.CfnScraper.AmpConfigurationProperty.builder()

      /**
       * @param workspaceArn ARN of the Amazon Managed Service for Prometheus workspace. 
       */
      override fun workspaceArn(workspaceArn: String) {
        cdkBuilder.workspaceArn(workspaceArn)
      }

      public fun build(): software.amazon.awscdk.services.aps.CfnScraper.AmpConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aps.CfnScraper.AmpConfigurationProperty,
    ) : CdkObject(cdkObject),
        AmpConfigurationProperty {
      /**
       * ARN of the Amazon Managed Service for Prometheus workspace.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-ampconfiguration.html#cfn-aps-scraper-ampconfiguration-workspacearn)
       */
      override fun workspaceArn(): String = unwrap(this).getWorkspaceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AmpConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnScraper.AmpConfigurationProperty):
          AmpConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? AmpConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmpConfigurationProperty):
          software.amazon.awscdk.services.aps.CfnScraper.AmpConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.aps.CfnScraper.AmpConfigurationProperty
    }
  }

  /**
   * Where to send the metrics from a scraper.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aps.*;
   * DestinationProperty destinationProperty = DestinationProperty.builder()
   * .ampConfiguration(AmpConfigurationProperty.builder()
   * .workspaceArn("workspaceArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-destination.html)
   */
  public interface DestinationProperty {
    /**
     * The Amazon Managed Service for Prometheus workspace to send metrics to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-destination.html#cfn-aps-scraper-destination-ampconfiguration)
     */
    public fun ampConfiguration(): Any

    /**
     * A builder for [DestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ampConfiguration The Amazon Managed Service for Prometheus workspace to send metrics
       * to. 
       */
      public fun ampConfiguration(ampConfiguration: IResolvable)

      /**
       * @param ampConfiguration The Amazon Managed Service for Prometheus workspace to send metrics
       * to. 
       */
      public fun ampConfiguration(ampConfiguration: AmpConfigurationProperty)

      /**
       * @param ampConfiguration The Amazon Managed Service for Prometheus workspace to send metrics
       * to. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8521dd71d600d12c5d1eed2973180b6062c12e2510e98e75860e2217962ad5f9")
      public fun ampConfiguration(ampConfiguration: AmpConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aps.CfnScraper.DestinationProperty.Builder =
          software.amazon.awscdk.services.aps.CfnScraper.DestinationProperty.builder()

      /**
       * @param ampConfiguration The Amazon Managed Service for Prometheus workspace to send metrics
       * to. 
       */
      override fun ampConfiguration(ampConfiguration: IResolvable) {
        cdkBuilder.ampConfiguration(ampConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ampConfiguration The Amazon Managed Service for Prometheus workspace to send metrics
       * to. 
       */
      override fun ampConfiguration(ampConfiguration: AmpConfigurationProperty) {
        cdkBuilder.ampConfiguration(ampConfiguration.let(AmpConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param ampConfiguration The Amazon Managed Service for Prometheus workspace to send metrics
       * to. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8521dd71d600d12c5d1eed2973180b6062c12e2510e98e75860e2217962ad5f9")
      override fun ampConfiguration(ampConfiguration: AmpConfigurationProperty.Builder.() -> Unit):
          Unit = ampConfiguration(AmpConfigurationProperty(ampConfiguration))

      public fun build(): software.amazon.awscdk.services.aps.CfnScraper.DestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aps.CfnScraper.DestinationProperty,
    ) : CdkObject(cdkObject),
        DestinationProperty {
      /**
       * The Amazon Managed Service for Prometheus workspace to send metrics to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-destination.html#cfn-aps-scraper-destination-ampconfiguration)
       */
      override fun ampConfiguration(): Any = unwrap(this).getAmpConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnScraper.DestinationProperty):
          DestinationProperty = CdkObjectWrappers.wrap(cdkObject) as? DestinationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationProperty):
          software.amazon.awscdk.services.aps.CfnScraper.DestinationProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.aps.CfnScraper.DestinationProperty
    }
  }

  /**
   * The `EksConfiguration` structure describes the connection to the Amazon EKS cluster from which
   * a scraper collects metrics.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aps.*;
   * EksConfigurationProperty eksConfigurationProperty = EksConfigurationProperty.builder()
   * .clusterArn("clusterArn")
   * .subnetIds(List.of("subnetIds"))
   * // the properties below are optional
   * .securityGroupIds(List.of("securityGroupIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-eksconfiguration.html)
   */
  public interface EksConfigurationProperty {
    /**
     * ARN of the Amazon EKS cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-eksconfiguration.html#cfn-aps-scraper-eksconfiguration-clusterarn)
     */
    public fun clusterArn(): String

    /**
     * A list of the security group IDs for the Amazon EKS cluster VPC configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-eksconfiguration.html#cfn-aps-scraper-eksconfiguration-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * A list of subnet IDs for the Amazon EKS cluster VPC configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-eksconfiguration.html#cfn-aps-scraper-eksconfiguration-subnetids)
     */
    public fun subnetIds(): List<String>

    /**
     * A builder for [EksConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clusterArn ARN of the Amazon EKS cluster. 
       */
      public fun clusterArn(clusterArn: String)

      /**
       * @param securityGroupIds A list of the security group IDs for the Amazon EKS cluster VPC
       * configuration.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds A list of the security group IDs for the Amazon EKS cluster VPC
       * configuration.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds A list of subnet IDs for the Amazon EKS cluster VPC configuration. 
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds A list of subnet IDs for the Amazon EKS cluster VPC configuration. 
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aps.CfnScraper.EksConfigurationProperty.Builder =
          software.amazon.awscdk.services.aps.CfnScraper.EksConfigurationProperty.builder()

      /**
       * @param clusterArn ARN of the Amazon EKS cluster. 
       */
      override fun clusterArn(clusterArn: String) {
        cdkBuilder.clusterArn(clusterArn)
      }

      /**
       * @param securityGroupIds A list of the security group IDs for the Amazon EKS cluster VPC
       * configuration.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds A list of the security group IDs for the Amazon EKS cluster VPC
       * configuration.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds A list of subnet IDs for the Amazon EKS cluster VPC configuration. 
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds A list of subnet IDs for the Amazon EKS cluster VPC configuration. 
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build(): software.amazon.awscdk.services.aps.CfnScraper.EksConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aps.CfnScraper.EksConfigurationProperty,
    ) : CdkObject(cdkObject),
        EksConfigurationProperty {
      /**
       * ARN of the Amazon EKS cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-eksconfiguration.html#cfn-aps-scraper-eksconfiguration-clusterarn)
       */
      override fun clusterArn(): String = unwrap(this).getClusterArn()

      /**
       * A list of the security group IDs for the Amazon EKS cluster VPC configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-eksconfiguration.html#cfn-aps-scraper-eksconfiguration-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * A list of subnet IDs for the Amazon EKS cluster VPC configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-eksconfiguration.html#cfn-aps-scraper-eksconfiguration-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EksConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnScraper.EksConfigurationProperty):
          EksConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as? EksConfigurationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EksConfigurationProperty):
          software.amazon.awscdk.services.aps.CfnScraper.EksConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.aps.CfnScraper.EksConfigurationProperty
    }
  }

  /**
   * The role configuration in an Amazon Managed Service for Prometheus scraper.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aps.*;
   * RoleConfigurationProperty roleConfigurationProperty = RoleConfigurationProperty.builder()
   * .sourceRoleArn("sourceRoleArn")
   * .targetRoleArn("targetRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-roleconfiguration.html)
   */
  public interface RoleConfigurationProperty {
    /**
     * The ARN of the source role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-roleconfiguration.html#cfn-aps-scraper-roleconfiguration-sourcerolearn)
     */
    public fun sourceRoleArn(): String? = unwrap(this).getSourceRoleArn()

    /**
     * The ARN of the target role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-roleconfiguration.html#cfn-aps-scraper-roleconfiguration-targetrolearn)
     */
    public fun targetRoleArn(): String? = unwrap(this).getTargetRoleArn()

    /**
     * A builder for [RoleConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceRoleArn The ARN of the source role.
       */
      public fun sourceRoleArn(sourceRoleArn: String)

      /**
       * @param targetRoleArn The ARN of the target role.
       */
      public fun targetRoleArn(targetRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aps.CfnScraper.RoleConfigurationProperty.Builder =
          software.amazon.awscdk.services.aps.CfnScraper.RoleConfigurationProperty.builder()

      /**
       * @param sourceRoleArn The ARN of the source role.
       */
      override fun sourceRoleArn(sourceRoleArn: String) {
        cdkBuilder.sourceRoleArn(sourceRoleArn)
      }

      /**
       * @param targetRoleArn The ARN of the target role.
       */
      override fun targetRoleArn(targetRoleArn: String) {
        cdkBuilder.targetRoleArn(targetRoleArn)
      }

      public fun build(): software.amazon.awscdk.services.aps.CfnScraper.RoleConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aps.CfnScraper.RoleConfigurationProperty,
    ) : CdkObject(cdkObject),
        RoleConfigurationProperty {
      /**
       * The ARN of the source role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-roleconfiguration.html#cfn-aps-scraper-roleconfiguration-sourcerolearn)
       */
      override fun sourceRoleArn(): String? = unwrap(this).getSourceRoleArn()

      /**
       * The ARN of the target role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-roleconfiguration.html#cfn-aps-scraper-roleconfiguration-targetrolearn)
       */
      override fun targetRoleArn(): String? = unwrap(this).getTargetRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RoleConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnScraper.RoleConfigurationProperty):
          RoleConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RoleConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoleConfigurationProperty):
          software.amazon.awscdk.services.aps.CfnScraper.RoleConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.aps.CfnScraper.RoleConfigurationProperty
    }
  }

  /**
   * A scrape configuration for a scraper, base 64 encoded.
   *
   * For more information, see [Scraper
   * configuration](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-collector-how-to.html#AMP-collector-configuration)
   * in the *Amazon Managed Service for Prometheus User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aps.*;
   * ScrapeConfigurationProperty scrapeConfigurationProperty = ScrapeConfigurationProperty.builder()
   * .configurationBlob("configurationBlob")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-scrapeconfiguration.html)
   */
  public interface ScrapeConfigurationProperty {
    /**
     * The base 64 encoded scrape configuration file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-scrapeconfiguration.html#cfn-aps-scraper-scrapeconfiguration-configurationblob)
     */
    public fun configurationBlob(): String

    /**
     * A builder for [ScrapeConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param configurationBlob The base 64 encoded scrape configuration file. 
       */
      public fun configurationBlob(configurationBlob: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.aps.CfnScraper.ScrapeConfigurationProperty.Builder =
          software.amazon.awscdk.services.aps.CfnScraper.ScrapeConfigurationProperty.builder()

      /**
       * @param configurationBlob The base 64 encoded scrape configuration file. 
       */
      override fun configurationBlob(configurationBlob: String) {
        cdkBuilder.configurationBlob(configurationBlob)
      }

      public fun build(): software.amazon.awscdk.services.aps.CfnScraper.ScrapeConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aps.CfnScraper.ScrapeConfigurationProperty,
    ) : CdkObject(cdkObject),
        ScrapeConfigurationProperty {
      /**
       * The base 64 encoded scrape configuration file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-scrapeconfiguration.html#cfn-aps-scraper-scrapeconfiguration-configurationblob)
       */
      override fun configurationBlob(): String = unwrap(this).getConfigurationBlob()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScrapeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnScraper.ScrapeConfigurationProperty):
          ScrapeConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ScrapeConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScrapeConfigurationProperty):
          software.amazon.awscdk.services.aps.CfnScraper.ScrapeConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.aps.CfnScraper.ScrapeConfigurationProperty
    }
  }

  /**
   * The source of collected metrics for a scraper.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.aps.*;
   * SourceProperty sourceProperty = SourceProperty.builder()
   * .eksConfiguration(EksConfigurationProperty.builder()
   * .clusterArn("clusterArn")
   * .subnetIds(List.of("subnetIds"))
   * // the properties below are optional
   * .securityGroupIds(List.of("securityGroupIds"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-source.html)
   */
  public interface SourceProperty {
    /**
     * The Amazon EKS cluster from which a scraper collects metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-source.html#cfn-aps-scraper-source-eksconfiguration)
     */
    public fun eksConfiguration(): Any

    /**
     * A builder for [SourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param eksConfiguration The Amazon EKS cluster from which a scraper collects metrics. 
       */
      public fun eksConfiguration(eksConfiguration: IResolvable)

      /**
       * @param eksConfiguration The Amazon EKS cluster from which a scraper collects metrics. 
       */
      public fun eksConfiguration(eksConfiguration: EksConfigurationProperty)

      /**
       * @param eksConfiguration The Amazon EKS cluster from which a scraper collects metrics. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2011a2ad9af37e3ab44c7c44b1bfcafbba3ca6a1bb9d2c36f2b8383a47d16477")
      public fun eksConfiguration(eksConfiguration: EksConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.aps.CfnScraper.SourceProperty.Builder
          = software.amazon.awscdk.services.aps.CfnScraper.SourceProperty.builder()

      /**
       * @param eksConfiguration The Amazon EKS cluster from which a scraper collects metrics. 
       */
      override fun eksConfiguration(eksConfiguration: IResolvable) {
        cdkBuilder.eksConfiguration(eksConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param eksConfiguration The Amazon EKS cluster from which a scraper collects metrics. 
       */
      override fun eksConfiguration(eksConfiguration: EksConfigurationProperty) {
        cdkBuilder.eksConfiguration(eksConfiguration.let(EksConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param eksConfiguration The Amazon EKS cluster from which a scraper collects metrics. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2011a2ad9af37e3ab44c7c44b1bfcafbba3ca6a1bb9d2c36f2b8383a47d16477")
      override fun eksConfiguration(eksConfiguration: EksConfigurationProperty.Builder.() -> Unit):
          Unit = eksConfiguration(EksConfigurationProperty(eksConfiguration))

      public fun build(): software.amazon.awscdk.services.aps.CfnScraper.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.aps.CfnScraper.SourceProperty,
    ) : CdkObject(cdkObject),
        SourceProperty {
      /**
       * The Amazon EKS cluster from which a scraper collects metrics.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-aps-scraper-source.html#cfn-aps-scraper-source-eksconfiguration)
       */
      override fun eksConfiguration(): Any = unwrap(this).getEksConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnScraper.SourceProperty):
          SourceProperty = CdkObjectWrappers.wrap(cdkObject) as? SourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.aps.CfnScraper.SourceProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.aps.CfnScraper.SourceProperty
    }
  }
}
