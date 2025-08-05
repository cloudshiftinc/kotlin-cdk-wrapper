@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.aps

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
 * Properties for defining a `CfnScraper`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.aps.*;
 * CfnScraperProps cfnScraperProps = CfnScraperProps.builder()
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
public interface CfnScraperProps {
  /**
   * An optional user-assigned scraper alias.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-alias)
   */
  public fun alias(): String? = unwrap(this).getAlias()

  /**
   * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-destination)
   */
  public fun destination(): Any

  /**
   * The role configuration in an Amazon Managed Service for Prometheus scraper.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-roleconfiguration)
   */
  public fun roleConfiguration(): Any? = unwrap(this).getRoleConfiguration()

  /**
   * The configuration in use by the scraper.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-scrapeconfiguration)
   */
  public fun scrapeConfiguration(): Any

  /**
   * The Amazon EKS cluster from which the scraper collects metrics.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-source)
   */
  public fun source(): Any

  /**
   * (Optional) The list of tag keys and values associated with the scraper.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnScraperProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param alias An optional user-assigned scraper alias.
     */
    public fun alias(alias: String)

    /**
     * @param destination The Amazon Managed Service for Prometheus workspace the scraper sends
     * metrics to. 
     */
    public fun destination(destination: IResolvable)

    /**
     * @param destination The Amazon Managed Service for Prometheus workspace the scraper sends
     * metrics to. 
     */
    public fun destination(destination: CfnScraper.DestinationProperty)

    /**
     * @param destination The Amazon Managed Service for Prometheus workspace the scraper sends
     * metrics to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fa6226dd6dcfea8ed204788e8684ad5b5135fc30eacc7a0fb41949ca96f1b25")
    public fun destination(destination: CfnScraper.DestinationProperty.Builder.() -> Unit)

    /**
     * @param roleConfiguration The role configuration in an Amazon Managed Service for Prometheus
     * scraper.
     */
    public fun roleConfiguration(roleConfiguration: IResolvable)

    /**
     * @param roleConfiguration The role configuration in an Amazon Managed Service for Prometheus
     * scraper.
     */
    public fun roleConfiguration(roleConfiguration: CfnScraper.RoleConfigurationProperty)

    /**
     * @param roleConfiguration The role configuration in an Amazon Managed Service for Prometheus
     * scraper.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b47b889931f97362c6c983f5c0b3e26470413dd60b45a8176df019943969125")
    public
        fun roleConfiguration(roleConfiguration: CfnScraper.RoleConfigurationProperty.Builder.() -> Unit)

    /**
     * @param scrapeConfiguration The configuration in use by the scraper. 
     */
    public fun scrapeConfiguration(scrapeConfiguration: IResolvable)

    /**
     * @param scrapeConfiguration The configuration in use by the scraper. 
     */
    public fun scrapeConfiguration(scrapeConfiguration: CfnScraper.ScrapeConfigurationProperty)

    /**
     * @param scrapeConfiguration The configuration in use by the scraper. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5189bbc51104f47b648aca6da837a2cec14146e578b0f62df7cf40ee7644e68")
    public
        fun scrapeConfiguration(scrapeConfiguration: CfnScraper.ScrapeConfigurationProperty.Builder.() -> Unit)

    /**
     * @param source The Amazon EKS cluster from which the scraper collects metrics. 
     */
    public fun source(source: IResolvable)

    /**
     * @param source The Amazon EKS cluster from which the scraper collects metrics. 
     */
    public fun source(source: CfnScraper.SourceProperty)

    /**
     * @param source The Amazon EKS cluster from which the scraper collects metrics. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e945f2cfb23e4bb2d6ebd85ce9bd650efe7ae354a8bdb70dd5ad33f22fc6aed9")
    public fun source(source: CfnScraper.SourceProperty.Builder.() -> Unit)

    /**
     * @param tags (Optional) The list of tag keys and values associated with the scraper.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags (Optional) The list of tag keys and values associated with the scraper.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.aps.CfnScraperProps.Builder =
        software.amazon.awscdk.services.aps.CfnScraperProps.builder()

    /**
     * @param alias An optional user-assigned scraper alias.
     */
    override fun alias(alias: String) {
      cdkBuilder.alias(alias)
    }

    /**
     * @param destination The Amazon Managed Service for Prometheus workspace the scraper sends
     * metrics to. 
     */
    override fun destination(destination: IResolvable) {
      cdkBuilder.destination(destination.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param destination The Amazon Managed Service for Prometheus workspace the scraper sends
     * metrics to. 
     */
    override fun destination(destination: CfnScraper.DestinationProperty) {
      cdkBuilder.destination(destination.let(CfnScraper.DestinationProperty.Companion::unwrap))
    }

    /**
     * @param destination The Amazon Managed Service for Prometheus workspace the scraper sends
     * metrics to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0fa6226dd6dcfea8ed204788e8684ad5b5135fc30eacc7a0fb41949ca96f1b25")
    override fun destination(destination: CfnScraper.DestinationProperty.Builder.() -> Unit): Unit =
        destination(CfnScraper.DestinationProperty(destination))

    /**
     * @param roleConfiguration The role configuration in an Amazon Managed Service for Prometheus
     * scraper.
     */
    override fun roleConfiguration(roleConfiguration: IResolvable) {
      cdkBuilder.roleConfiguration(roleConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param roleConfiguration The role configuration in an Amazon Managed Service for Prometheus
     * scraper.
     */
    override fun roleConfiguration(roleConfiguration: CfnScraper.RoleConfigurationProperty) {
      cdkBuilder.roleConfiguration(roleConfiguration.let(CfnScraper.RoleConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param roleConfiguration The role configuration in an Amazon Managed Service for Prometheus
     * scraper.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3b47b889931f97362c6c983f5c0b3e26470413dd60b45a8176df019943969125")
    override
        fun roleConfiguration(roleConfiguration: CfnScraper.RoleConfigurationProperty.Builder.() -> Unit):
        Unit = roleConfiguration(CfnScraper.RoleConfigurationProperty(roleConfiguration))

    /**
     * @param scrapeConfiguration The configuration in use by the scraper. 
     */
    override fun scrapeConfiguration(scrapeConfiguration: IResolvable) {
      cdkBuilder.scrapeConfiguration(scrapeConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param scrapeConfiguration The configuration in use by the scraper. 
     */
    override fun scrapeConfiguration(scrapeConfiguration: CfnScraper.ScrapeConfigurationProperty) {
      cdkBuilder.scrapeConfiguration(scrapeConfiguration.let(CfnScraper.ScrapeConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param scrapeConfiguration The configuration in use by the scraper. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5189bbc51104f47b648aca6da837a2cec14146e578b0f62df7cf40ee7644e68")
    override
        fun scrapeConfiguration(scrapeConfiguration: CfnScraper.ScrapeConfigurationProperty.Builder.() -> Unit):
        Unit = scrapeConfiguration(CfnScraper.ScrapeConfigurationProperty(scrapeConfiguration))

    /**
     * @param source The Amazon EKS cluster from which the scraper collects metrics. 
     */
    override fun source(source: IResolvable) {
      cdkBuilder.source(source.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param source The Amazon EKS cluster from which the scraper collects metrics. 
     */
    override fun source(source: CfnScraper.SourceProperty) {
      cdkBuilder.source(source.let(CfnScraper.SourceProperty.Companion::unwrap))
    }

    /**
     * @param source The Amazon EKS cluster from which the scraper collects metrics. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e945f2cfb23e4bb2d6ebd85ce9bd650efe7ae354a8bdb70dd5ad33f22fc6aed9")
    override fun source(source: CfnScraper.SourceProperty.Builder.() -> Unit): Unit =
        source(CfnScraper.SourceProperty(source))

    /**
     * @param tags (Optional) The list of tag keys and values associated with the scraper.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags (Optional) The list of tag keys and values associated with the scraper.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.aps.CfnScraperProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.aps.CfnScraperProps,
  ) : CdkObject(cdkObject),
      CfnScraperProps {
    /**
     * An optional user-assigned scraper alias.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-alias)
     */
    override fun alias(): String? = unwrap(this).getAlias()

    /**
     * The Amazon Managed Service for Prometheus workspace the scraper sends metrics to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-destination)
     */
    override fun destination(): Any = unwrap(this).getDestination()

    /**
     * The role configuration in an Amazon Managed Service for Prometheus scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-roleconfiguration)
     */
    override fun roleConfiguration(): Any? = unwrap(this).getRoleConfiguration()

    /**
     * The configuration in use by the scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-scrapeconfiguration)
     */
    override fun scrapeConfiguration(): Any = unwrap(this).getScrapeConfiguration()

    /**
     * The Amazon EKS cluster from which the scraper collects metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-source)
     */
    override fun source(): Any = unwrap(this).getSource()

    /**
     * (Optional) The list of tag keys and values associated with the scraper.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-scraper.html#cfn-aps-scraper-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScraperProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnScraperProps):
        CfnScraperProps = CdkObjectWrappers.wrap(cdkObject) as? CfnScraperProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScraperProps):
        software.amazon.awscdk.services.aps.CfnScraperProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.aps.CfnScraperProps
  }
}
