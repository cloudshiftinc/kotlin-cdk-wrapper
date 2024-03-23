@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::GuardDuty::Detector` resource specifies a new GuardDuty detector.
 *
 * A detector is an object that represents the GuardDuty service. A detector is required for
 * GuardDuty to become operational.
 *
 * Make sure you use either `DataSources` or `Features` in a one request, and not both.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.guardduty.*;
 * CfnDetector cfnDetector = CfnDetector.Builder.create(this, "MyCfnDetector")
 * .enable(false)
 * // the properties below are optional
 * .dataSources(CFNDataSourceConfigurationsProperty.builder()
 * .kubernetes(CFNKubernetesConfigurationProperty.builder()
 * .auditLogs(CFNKubernetesAuditLogsConfigurationProperty.builder()
 * .enable(false)
 * .build())
 * .build())
 * .malwareProtection(CFNMalwareProtectionConfigurationProperty.builder()
 * .scanEc2InstanceWithFindings(CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()
 * .ebsVolumes(false)
 * .build())
 * .build())
 * .s3Logs(CFNS3LogsConfigurationProperty.builder()
 * .enable(false)
 * .build())
 * .build())
 * .features(List.of(CFNFeatureConfigurationProperty.builder()
 * .name("name")
 * .status("status")
 * // the properties below are optional
 * .additionalConfiguration(List.of(CFNFeatureAdditionalConfigurationProperty.builder()
 * .name("name")
 * .status("status")
 * .build()))
 * .build()))
 * .findingPublishingFrequency("findingPublishingFrequency")
 * .tags(List.of(TagItemProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html)
 */
public open class CfnDetector internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDetectorProps,
  ) :
      this(software.amazon.awscdk.services.guardduty.CfnDetector(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDetectorProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDetectorProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDetectorProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Describes which data sources will be enabled for the detector.
   */
  public open fun dataSources(): Any? = unwrap(this).getDataSources()

  /**
   * Describes which data sources will be enabled for the detector.
   */
  public open fun dataSources(`value`: IResolvable) {
    unwrap(this).setDataSources(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes which data sources will be enabled for the detector.
   */
  public open fun dataSources(`value`: CFNDataSourceConfigurationsProperty) {
    unwrap(this).setDataSources(`value`.let(CFNDataSourceConfigurationsProperty::unwrap))
  }

  /**
   * Describes which data sources will be enabled for the detector.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("be9e86ad5386be027b3227e094662ddd4d1acbfa1767cd75833e0f2379799b35")
  public open fun dataSources(`value`: CFNDataSourceConfigurationsProperty.Builder.() -> Unit): Unit
      = dataSources(CFNDataSourceConfigurationsProperty(`value`))

  /**
   * Specifies whether the detector is to be enabled on creation.
   */
  public open fun enable(): Any = unwrap(this).getEnable()

  /**
   * Specifies whether the detector is to be enabled on creation.
   */
  public open fun enable(`value`: Boolean) {
    unwrap(this).setEnable(`value`)
  }

  /**
   * Specifies whether the detector is to be enabled on creation.
   */
  public open fun enable(`value`: IResolvable) {
    unwrap(this).setEnable(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of features that will be configured for the detector.
   */
  public open fun features(): Any? = unwrap(this).getFeatures()

  /**
   * A list of features that will be configured for the detector.
   */
  public open fun features(`value`: IResolvable) {
    unwrap(this).setFeatures(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of features that will be configured for the detector.
   */
  public open fun features(`value`: List<Any>) {
    unwrap(this).setFeatures(`value`)
  }

  /**
   * A list of features that will be configured for the detector.
   */
  public open fun features(vararg `value`: Any): Unit = features(`value`.toList())

  /**
   * Specifies how frequently updated findings are exported.
   */
  public open fun findingPublishingFrequency(): String? =
      unwrap(this).getFindingPublishingFrequency()

  /**
   * Specifies how frequently updated findings are exported.
   */
  public open fun findingPublishingFrequency(`value`: String) {
    unwrap(this).setFindingPublishingFrequency(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies tags added to a new detector resource.
   */
  public open fun tagsRaw(): List<TagItemProperty> =
      unwrap(this).getTagsRaw()?.map(TagItemProperty::wrap) ?: emptyList()

  /**
   * Specifies tags added to a new detector resource.
   */
  public open fun tagsRaw(`value`: List<TagItemProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagItemProperty::unwrap))
  }

  /**
   * Specifies tags added to a new detector resource.
   */
  public open fun tagsRaw(vararg `value`: TagItemProperty): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.guardduty.CfnDetector].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Describes which data sources will be enabled for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-datasources)
     * @param dataSources Describes which data sources will be enabled for the detector. 
     */
    public fun dataSources(dataSources: IResolvable)

    /**
     * Describes which data sources will be enabled for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-datasources)
     * @param dataSources Describes which data sources will be enabled for the detector. 
     */
    public fun dataSources(dataSources: CFNDataSourceConfigurationsProperty)

    /**
     * Describes which data sources will be enabled for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-datasources)
     * @param dataSources Describes which data sources will be enabled for the detector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12f3111304e64b8670160f76d2eb3865a3499096f6aab5133b06c3b39dec7d4d")
    public fun dataSources(dataSources: CFNDataSourceConfigurationsProperty.Builder.() -> Unit)

    /**
     * Specifies whether the detector is to be enabled on creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable)
     * @param enable Specifies whether the detector is to be enabled on creation. 
     */
    public fun enable(enable: Boolean)

    /**
     * Specifies whether the detector is to be enabled on creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable)
     * @param enable Specifies whether the detector is to be enabled on creation. 
     */
    public fun enable(enable: IResolvable)

    /**
     * A list of features that will be configured for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-features)
     * @param features A list of features that will be configured for the detector. 
     */
    public fun features(features: IResolvable)

    /**
     * A list of features that will be configured for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-features)
     * @param features A list of features that will be configured for the detector. 
     */
    public fun features(features: List<Any>)

    /**
     * A list of features that will be configured for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-features)
     * @param features A list of features that will be configured for the detector. 
     */
    public fun features(vararg features: Any)

    /**
     * Specifies how frequently updated findings are exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-findingpublishingfrequency)
     * @param findingPublishingFrequency Specifies how frequently updated findings are exported. 
     */
    public fun findingPublishingFrequency(findingPublishingFrequency: String)

    /**
     * Specifies tags added to a new detector resource.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Currently, support is available only for creating and deleting a tag. No support exists for
     * updating the tags.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-tags)
     * @param tags Specifies tags added to a new detector resource. 
     */
    public fun tags(tags: List<TagItemProperty>)

    /**
     * Specifies tags added to a new detector resource.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Currently, support is available only for creating and deleting a tag. No support exists for
     * updating the tags.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-tags)
     * @param tags Specifies tags added to a new detector resource. 
     */
    public fun tags(vararg tags: TagItemProperty)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnDetector.Builder =
        software.amazon.awscdk.services.guardduty.CfnDetector.Builder.create(scope, id)

    /**
     * Describes which data sources will be enabled for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-datasources)
     * @param dataSources Describes which data sources will be enabled for the detector. 
     */
    override fun dataSources(dataSources: IResolvable) {
      cdkBuilder.dataSources(dataSources.let(IResolvable::unwrap))
    }

    /**
     * Describes which data sources will be enabled for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-datasources)
     * @param dataSources Describes which data sources will be enabled for the detector. 
     */
    override fun dataSources(dataSources: CFNDataSourceConfigurationsProperty) {
      cdkBuilder.dataSources(dataSources.let(CFNDataSourceConfigurationsProperty::unwrap))
    }

    /**
     * Describes which data sources will be enabled for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-datasources)
     * @param dataSources Describes which data sources will be enabled for the detector. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12f3111304e64b8670160f76d2eb3865a3499096f6aab5133b06c3b39dec7d4d")
    override fun dataSources(dataSources: CFNDataSourceConfigurationsProperty.Builder.() -> Unit):
        Unit = dataSources(CFNDataSourceConfigurationsProperty(dataSources))

    /**
     * Specifies whether the detector is to be enabled on creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable)
     * @param enable Specifies whether the detector is to be enabled on creation. 
     */
    override fun enable(enable: Boolean) {
      cdkBuilder.enable(enable)
    }

    /**
     * Specifies whether the detector is to be enabled on creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable)
     * @param enable Specifies whether the detector is to be enabled on creation. 
     */
    override fun enable(enable: IResolvable) {
      cdkBuilder.enable(enable.let(IResolvable::unwrap))
    }

    /**
     * A list of features that will be configured for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-features)
     * @param features A list of features that will be configured for the detector. 
     */
    override fun features(features: IResolvable) {
      cdkBuilder.features(features.let(IResolvable::unwrap))
    }

    /**
     * A list of features that will be configured for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-features)
     * @param features A list of features that will be configured for the detector. 
     */
    override fun features(features: List<Any>) {
      cdkBuilder.features(features)
    }

    /**
     * A list of features that will be configured for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-features)
     * @param features A list of features that will be configured for the detector. 
     */
    override fun features(vararg features: Any): Unit = features(features.toList())

    /**
     * Specifies how frequently updated findings are exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-findingpublishingfrequency)
     * @param findingPublishingFrequency Specifies how frequently updated findings are exported. 
     */
    override fun findingPublishingFrequency(findingPublishingFrequency: String) {
      cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
    }

    /**
     * Specifies tags added to a new detector resource.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Currently, support is available only for creating and deleting a tag. No support exists for
     * updating the tags.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-tags)
     * @param tags Specifies tags added to a new detector resource. 
     */
    override fun tags(tags: List<TagItemProperty>) {
      cdkBuilder.tags(tags.map(TagItemProperty::unwrap))
    }

    /**
     * Specifies tags added to a new detector resource.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Currently, support is available only for creating and deleting a tag. No support exists for
     * updating the tags.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-tags)
     * @param tags Specifies tags added to a new detector resource. 
     */
    override fun tags(vararg tags: TagItemProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.guardduty.CfnDetector = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.guardduty.CfnDetector.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDetector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDetector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector): CfnDetector
        = CfnDetector(cdkObject)

    internal fun unwrap(wrapped: CfnDetector): software.amazon.awscdk.services.guardduty.CfnDetector
        = wrapped.cdkObject
  }

  /**
   * Describes whether S3 data event logs, Kubernetes audit logs, or Malware Protection will be
   * enabled as a data source when the detector is created.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.guardduty.*;
   * CFNDataSourceConfigurationsProperty cFNDataSourceConfigurationsProperty =
   * CFNDataSourceConfigurationsProperty.builder()
   * .kubernetes(CFNKubernetesConfigurationProperty.builder()
   * .auditLogs(CFNKubernetesAuditLogsConfigurationProperty.builder()
   * .enable(false)
   * .build())
   * .build())
   * .malwareProtection(CFNMalwareProtectionConfigurationProperty.builder()
   * .scanEc2InstanceWithFindings(CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()
   * .ebsVolumes(false)
   * .build())
   * .build())
   * .s3Logs(CFNS3LogsConfigurationProperty.builder()
   * .enable(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfndatasourceconfigurations.html)
   */
  public interface CFNDataSourceConfigurationsProperty {
    /**
     * Describes which Kubernetes data sources are enabled for a detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfndatasourceconfigurations.html#cfn-guardduty-detector-cfndatasourceconfigurations-kubernetes)
     */
    public fun kubernetes(): Any? = unwrap(this).getKubernetes()

    /**
     * Describes whether Malware Protection will be enabled as a data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfndatasourceconfigurations.html#cfn-guardduty-detector-cfndatasourceconfigurations-malwareprotection)
     */
    public fun malwareProtection(): Any? = unwrap(this).getMalwareProtection()

    /**
     * Describes whether S3 data event logs are enabled as a data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfndatasourceconfigurations.html#cfn-guardduty-detector-cfndatasourceconfigurations-s3logs)
     */
    public fun s3Logs(): Any? = unwrap(this).getS3Logs()

    /**
     * A builder for [CFNDataSourceConfigurationsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kubernetes Describes which Kubernetes data sources are enabled for a detector.
       */
      public fun kubernetes(kubernetes: IResolvable)

      /**
       * @param kubernetes Describes which Kubernetes data sources are enabled for a detector.
       */
      public fun kubernetes(kubernetes: CFNKubernetesConfigurationProperty)

      /**
       * @param kubernetes Describes which Kubernetes data sources are enabled for a detector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da89073ca4a8da88eea36dbf6050555252d6cc3186da82a4552bb6b1a2baeca2")
      public fun kubernetes(kubernetes: CFNKubernetesConfigurationProperty.Builder.() -> Unit)

      /**
       * @param malwareProtection Describes whether Malware Protection will be enabled as a data
       * source.
       */
      public fun malwareProtection(malwareProtection: IResolvable)

      /**
       * @param malwareProtection Describes whether Malware Protection will be enabled as a data
       * source.
       */
      public fun malwareProtection(malwareProtection: CFNMalwareProtectionConfigurationProperty)

      /**
       * @param malwareProtection Describes whether Malware Protection will be enabled as a data
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3effefbc4c0cc2723d3da80754a6a847ac438126eec9abed90532060d6d7936")
      public
          fun malwareProtection(malwareProtection: CFNMalwareProtectionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param s3Logs Describes whether S3 data event logs are enabled as a data source.
       */
      public fun s3Logs(s3Logs: IResolvable)

      /**
       * @param s3Logs Describes whether S3 data event logs are enabled as a data source.
       */
      public fun s3Logs(s3Logs: CFNS3LogsConfigurationProperty)

      /**
       * @param s3Logs Describes whether S3 data event logs are enabled as a data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("711f6f15565c642dd31247863071fda2b82b1efbeadca4038b6baf110ab42212")
      public fun s3Logs(s3Logs: CFNS3LogsConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty.builder()

      /**
       * @param kubernetes Describes which Kubernetes data sources are enabled for a detector.
       */
      override fun kubernetes(kubernetes: IResolvable) {
        cdkBuilder.kubernetes(kubernetes.let(IResolvable::unwrap))
      }

      /**
       * @param kubernetes Describes which Kubernetes data sources are enabled for a detector.
       */
      override fun kubernetes(kubernetes: CFNKubernetesConfigurationProperty) {
        cdkBuilder.kubernetes(kubernetes.let(CFNKubernetesConfigurationProperty::unwrap))
      }

      /**
       * @param kubernetes Describes which Kubernetes data sources are enabled for a detector.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da89073ca4a8da88eea36dbf6050555252d6cc3186da82a4552bb6b1a2baeca2")
      override fun kubernetes(kubernetes: CFNKubernetesConfigurationProperty.Builder.() -> Unit):
          Unit = kubernetes(CFNKubernetesConfigurationProperty(kubernetes))

      /**
       * @param malwareProtection Describes whether Malware Protection will be enabled as a data
       * source.
       */
      override fun malwareProtection(malwareProtection: IResolvable) {
        cdkBuilder.malwareProtection(malwareProtection.let(IResolvable::unwrap))
      }

      /**
       * @param malwareProtection Describes whether Malware Protection will be enabled as a data
       * source.
       */
      override fun malwareProtection(malwareProtection: CFNMalwareProtectionConfigurationProperty) {
        cdkBuilder.malwareProtection(malwareProtection.let(CFNMalwareProtectionConfigurationProperty::unwrap))
      }

      /**
       * @param malwareProtection Describes whether Malware Protection will be enabled as a data
       * source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e3effefbc4c0cc2723d3da80754a6a847ac438126eec9abed90532060d6d7936")
      override
          fun malwareProtection(malwareProtection: CFNMalwareProtectionConfigurationProperty.Builder.() -> Unit):
          Unit = malwareProtection(CFNMalwareProtectionConfigurationProperty(malwareProtection))

      /**
       * @param s3Logs Describes whether S3 data event logs are enabled as a data source.
       */
      override fun s3Logs(s3Logs: IResolvable) {
        cdkBuilder.s3Logs(s3Logs.let(IResolvable::unwrap))
      }

      /**
       * @param s3Logs Describes whether S3 data event logs are enabled as a data source.
       */
      override fun s3Logs(s3Logs: CFNS3LogsConfigurationProperty) {
        cdkBuilder.s3Logs(s3Logs.let(CFNS3LogsConfigurationProperty::unwrap))
      }

      /**
       * @param s3Logs Describes whether S3 data event logs are enabled as a data source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("711f6f15565c642dd31247863071fda2b82b1efbeadca4038b6baf110ab42212")
      override fun s3Logs(s3Logs: CFNS3LogsConfigurationProperty.Builder.() -> Unit): Unit =
          s3Logs(CFNS3LogsConfigurationProperty(s3Logs))

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty,
    ) : CdkObject(cdkObject), CFNDataSourceConfigurationsProperty {
      /**
       * Describes which Kubernetes data sources are enabled for a detector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfndatasourceconfigurations.html#cfn-guardduty-detector-cfndatasourceconfigurations-kubernetes)
       */
      override fun kubernetes(): Any? = unwrap(this).getKubernetes()

      /**
       * Describes whether Malware Protection will be enabled as a data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfndatasourceconfigurations.html#cfn-guardduty-detector-cfndatasourceconfigurations-malwareprotection)
       */
      override fun malwareProtection(): Any? = unwrap(this).getMalwareProtection()

      /**
       * Describes whether S3 data event logs are enabled as a data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfndatasourceconfigurations.html#cfn-guardduty-detector-cfndatasourceconfigurations-s3logs)
       */
      override fun s3Logs(): Any? = unwrap(this).getS3Logs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CFNDataSourceConfigurationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty):
          CFNDataSourceConfigurationsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CFNDataSourceConfigurationsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNDataSourceConfigurationsProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNDataSourceConfigurationsProperty
    }
  }

  /**
   * Information about the additional configuration of a feature in your account.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.guardduty.*;
   * CFNFeatureAdditionalConfigurationProperty cFNFeatureAdditionalConfigurationProperty =
   * CFNFeatureAdditionalConfigurationProperty.builder()
   * .name("name")
   * .status("status")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureadditionalconfiguration.html)
   */
  public interface CFNFeatureAdditionalConfigurationProperty {
    /**
     * Name of the additional configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureadditionalconfiguration.html#cfn-guardduty-detector-cfnfeatureadditionalconfiguration-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * Status of the additional configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureadditionalconfiguration.html#cfn-guardduty-detector-cfnfeatureadditionalconfiguration-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * A builder for [CFNFeatureAdditionalConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name Name of the additional configuration.
       */
      public fun name(name: String)

      /**
       * @param status Status of the additional configuration.
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty.builder()

      /**
       * @param name Name of the additional configuration.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param status Status of the additional configuration.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty,
    ) : CdkObject(cdkObject), CFNFeatureAdditionalConfigurationProperty {
      /**
       * Name of the additional configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureadditionalconfiguration.html#cfn-guardduty-detector-cfnfeatureadditionalconfiguration-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * Status of the additional configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureadditionalconfiguration.html#cfn-guardduty-detector-cfnfeatureadditionalconfiguration-status)
       */
      override fun status(): String? = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CFNFeatureAdditionalConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty):
          CFNFeatureAdditionalConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CFNFeatureAdditionalConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNFeatureAdditionalConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureAdditionalConfigurationProperty
    }
  }

  /**
   * Information about the configuration of a feature in your account.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.guardduty.*;
   * CFNFeatureConfigurationProperty cFNFeatureConfigurationProperty =
   * CFNFeatureConfigurationProperty.builder()
   * .name("name")
   * .status("status")
   * // the properties below are optional
   * .additionalConfiguration(List.of(CFNFeatureAdditionalConfigurationProperty.builder()
   * .name("name")
   * .status("status")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureconfiguration.html)
   */
  public interface CFNFeatureConfigurationProperty {
    /**
     * Information about the additional configuration of a feature in your account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureconfiguration.html#cfn-guardduty-detector-cfnfeatureconfiguration-additionalconfiguration)
     */
    public fun additionalConfiguration(): Any? = unwrap(this).getAdditionalConfiguration()

    /**
     * Name of the feature.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureconfiguration.html#cfn-guardduty-detector-cfnfeatureconfiguration-name)
     */
    public fun name(): String

    /**
     * Status of the feature configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureconfiguration.html#cfn-guardduty-detector-cfnfeatureconfiguration-status)
     */
    public fun status(): String

    /**
     * A builder for [CFNFeatureConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalConfiguration Information about the additional configuration of a feature
       * in your account.
       */
      public fun additionalConfiguration(additionalConfiguration: IResolvable)

      /**
       * @param additionalConfiguration Information about the additional configuration of a feature
       * in your account.
       */
      public fun additionalConfiguration(additionalConfiguration: List<Any>)

      /**
       * @param additionalConfiguration Information about the additional configuration of a feature
       * in your account.
       */
      public fun additionalConfiguration(vararg additionalConfiguration: Any)

      /**
       * @param name Name of the feature. 
       */
      public fun name(name: String)

      /**
       * @param status Status of the feature configuration. 
       */
      public fun status(status: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty.builder()

      /**
       * @param additionalConfiguration Information about the additional configuration of a feature
       * in your account.
       */
      override fun additionalConfiguration(additionalConfiguration: IResolvable) {
        cdkBuilder.additionalConfiguration(additionalConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param additionalConfiguration Information about the additional configuration of a feature
       * in your account.
       */
      override fun additionalConfiguration(additionalConfiguration: List<Any>) {
        cdkBuilder.additionalConfiguration(additionalConfiguration)
      }

      /**
       * @param additionalConfiguration Information about the additional configuration of a feature
       * in your account.
       */
      override fun additionalConfiguration(vararg additionalConfiguration: Any): Unit =
          additionalConfiguration(additionalConfiguration.toList())

      /**
       * @param name Name of the feature. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param status Status of the feature configuration. 
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty,
    ) : CdkObject(cdkObject), CFNFeatureConfigurationProperty {
      /**
       * Information about the additional configuration of a feature in your account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureconfiguration.html#cfn-guardduty-detector-cfnfeatureconfiguration-additionalconfiguration)
       */
      override fun additionalConfiguration(): Any? = unwrap(this).getAdditionalConfiguration()

      /**
       * Name of the feature.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureconfiguration.html#cfn-guardduty-detector-cfnfeatureconfiguration-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Status of the feature configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnfeatureconfiguration.html#cfn-guardduty-detector-cfnfeatureconfiguration-status)
       */
      override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CFNFeatureConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty):
          CFNFeatureConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CFNFeatureConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNFeatureConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNFeatureConfigurationProperty
    }
  }

  /**
   * Describes which optional data sources are enabled for a detector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.guardduty.*;
   * CFNKubernetesAuditLogsConfigurationProperty cFNKubernetesAuditLogsConfigurationProperty =
   * CFNKubernetesAuditLogsConfigurationProperty.builder()
   * .enable(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnkubernetesauditlogsconfiguration.html)
   */
  public interface CFNKubernetesAuditLogsConfigurationProperty {
    /**
     * Describes whether Kubernetes audit logs are enabled as a data source for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnkubernetesauditlogsconfiguration.html#cfn-guardduty-detector-cfnkubernetesauditlogsconfiguration-enable)
     */
    public fun enable(): Any

    /**
     * A builder for [CFNKubernetesAuditLogsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enable Describes whether Kubernetes audit logs are enabled as a data source for the
       * detector. 
       */
      public fun enable(enable: Boolean)

      /**
       * @param enable Describes whether Kubernetes audit logs are enabled as a data source for the
       * detector. 
       */
      public fun enable(enable: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty.builder()

      /**
       * @param enable Describes whether Kubernetes audit logs are enabled as a data source for the
       * detector. 
       */
      override fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
      }

      /**
       * @param enable Describes whether Kubernetes audit logs are enabled as a data source for the
       * detector. 
       */
      override fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty,
    ) : CdkObject(cdkObject), CFNKubernetesAuditLogsConfigurationProperty {
      /**
       * Describes whether Kubernetes audit logs are enabled as a data source for the detector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnkubernetesauditlogsconfiguration.html#cfn-guardduty-detector-cfnkubernetesauditlogsconfiguration-enable)
       */
      override fun enable(): Any = unwrap(this).getEnable()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CFNKubernetesAuditLogsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty):
          CFNKubernetesAuditLogsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CFNKubernetesAuditLogsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNKubernetesAuditLogsConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesAuditLogsConfigurationProperty
    }
  }

  /**
   * Describes which Kubernetes protection data sources are enabled for the detector.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.guardduty.*;
   * CFNKubernetesConfigurationProperty cFNKubernetesConfigurationProperty =
   * CFNKubernetesConfigurationProperty.builder()
   * .auditLogs(CFNKubernetesAuditLogsConfigurationProperty.builder()
   * .enable(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnkubernetesconfiguration.html)
   */
  public interface CFNKubernetesConfigurationProperty {
    /**
     * Describes whether Kubernetes audit logs are enabled as a data source for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnkubernetesconfiguration.html#cfn-guardduty-detector-cfnkubernetesconfiguration-auditlogs)
     */
    public fun auditLogs(): Any

    /**
     * A builder for [CFNKubernetesConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param auditLogs Describes whether Kubernetes audit logs are enabled as a data source for
       * the detector. 
       */
      public fun auditLogs(auditLogs: IResolvable)

      /**
       * @param auditLogs Describes whether Kubernetes audit logs are enabled as a data source for
       * the detector. 
       */
      public fun auditLogs(auditLogs: CFNKubernetesAuditLogsConfigurationProperty)

      /**
       * @param auditLogs Describes whether Kubernetes audit logs are enabled as a data source for
       * the detector. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("738bdb5e869b53db911111402c113994a8d258edeea2fe650a66f07da18fedde")
      public
          fun auditLogs(auditLogs: CFNKubernetesAuditLogsConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty.builder()

      /**
       * @param auditLogs Describes whether Kubernetes audit logs are enabled as a data source for
       * the detector. 
       */
      override fun auditLogs(auditLogs: IResolvable) {
        cdkBuilder.auditLogs(auditLogs.let(IResolvable::unwrap))
      }

      /**
       * @param auditLogs Describes whether Kubernetes audit logs are enabled as a data source for
       * the detector. 
       */
      override fun auditLogs(auditLogs: CFNKubernetesAuditLogsConfigurationProperty) {
        cdkBuilder.auditLogs(auditLogs.let(CFNKubernetesAuditLogsConfigurationProperty::unwrap))
      }

      /**
       * @param auditLogs Describes whether Kubernetes audit logs are enabled as a data source for
       * the detector. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("738bdb5e869b53db911111402c113994a8d258edeea2fe650a66f07da18fedde")
      override
          fun auditLogs(auditLogs: CFNKubernetesAuditLogsConfigurationProperty.Builder.() -> Unit):
          Unit = auditLogs(CFNKubernetesAuditLogsConfigurationProperty(auditLogs))

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty,
    ) : CdkObject(cdkObject), CFNKubernetesConfigurationProperty {
      /**
       * Describes whether Kubernetes audit logs are enabled as a data source for the detector.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnkubernetesconfiguration.html#cfn-guardduty-detector-cfnkubernetesconfiguration-auditlogs)
       */
      override fun auditLogs(): Any = unwrap(this).getAuditLogs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CFNKubernetesConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty):
          CFNKubernetesConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CFNKubernetesConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNKubernetesConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNKubernetesConfigurationProperty
    }
  }

  /**
   * Describes whether Malware Protection will be enabled as a data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.guardduty.*;
   * CFNMalwareProtectionConfigurationProperty cFNMalwareProtectionConfigurationProperty =
   * CFNMalwareProtectionConfigurationProperty.builder()
   * .scanEc2InstanceWithFindings(CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()
   * .ebsVolumes(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnmalwareprotectionconfiguration.html)
   */
  public interface CFNMalwareProtectionConfigurationProperty {
    /**
     * Describes the configuration of Malware Protection for EC2 instances with findings.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnmalwareprotectionconfiguration.html#cfn-guardduty-detector-cfnmalwareprotectionconfiguration-scanec2instancewithfindings)
     */
    public fun scanEc2InstanceWithFindings(): Any? = unwrap(this).getScanEc2InstanceWithFindings()

    /**
     * A builder for [CFNMalwareProtectionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param scanEc2InstanceWithFindings Describes the configuration of Malware Protection for
       * EC2 instances with findings.
       */
      public fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: IResolvable)

      /**
       * @param scanEc2InstanceWithFindings Describes the configuration of Malware Protection for
       * EC2 instances with findings.
       */
      public
          fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: CFNScanEc2InstanceWithFindingsConfigurationProperty)

      /**
       * @param scanEc2InstanceWithFindings Describes the configuration of Malware Protection for
       * EC2 instances with findings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9afee8570cec8991e5a18f46e0d0e2cdb58c8a0d9e80e067afc42c9b29d028ed")
      public
          fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: CFNScanEc2InstanceWithFindingsConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty.builder()

      /**
       * @param scanEc2InstanceWithFindings Describes the configuration of Malware Protection for
       * EC2 instances with findings.
       */
      override fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: IResolvable) {
        cdkBuilder.scanEc2InstanceWithFindings(scanEc2InstanceWithFindings.let(IResolvable::unwrap))
      }

      /**
       * @param scanEc2InstanceWithFindings Describes the configuration of Malware Protection for
       * EC2 instances with findings.
       */
      override
          fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: CFNScanEc2InstanceWithFindingsConfigurationProperty) {
        cdkBuilder.scanEc2InstanceWithFindings(scanEc2InstanceWithFindings.let(CFNScanEc2InstanceWithFindingsConfigurationProperty::unwrap))
      }

      /**
       * @param scanEc2InstanceWithFindings Describes the configuration of Malware Protection for
       * EC2 instances with findings.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9afee8570cec8991e5a18f46e0d0e2cdb58c8a0d9e80e067afc42c9b29d028ed")
      override
          fun scanEc2InstanceWithFindings(scanEc2InstanceWithFindings: CFNScanEc2InstanceWithFindingsConfigurationProperty.Builder.() -> Unit):
          Unit =
          scanEc2InstanceWithFindings(CFNScanEc2InstanceWithFindingsConfigurationProperty(scanEc2InstanceWithFindings))

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty,
    ) : CdkObject(cdkObject), CFNMalwareProtectionConfigurationProperty {
      /**
       * Describes the configuration of Malware Protection for EC2 instances with findings.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnmalwareprotectionconfiguration.html#cfn-guardduty-detector-cfnmalwareprotectionconfiguration-scanec2instancewithfindings)
       */
      override fun scanEc2InstanceWithFindings(): Any? =
          unwrap(this).getScanEc2InstanceWithFindings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CFNMalwareProtectionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty):
          CFNMalwareProtectionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CFNMalwareProtectionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNMalwareProtectionConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNMalwareProtectionConfigurationProperty
    }
  }

  /**
   * Describes whether S3 data event logs will be enabled as a data source when the detector is
   * created.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.guardduty.*;
   * CFNS3LogsConfigurationProperty cFNS3LogsConfigurationProperty =
   * CFNS3LogsConfigurationProperty.builder()
   * .enable(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfns3logsconfiguration.html)
   */
  public interface CFNS3LogsConfigurationProperty {
    /**
     * The status of S3 data event logs as a data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfns3logsconfiguration.html#cfn-guardduty-detector-cfns3logsconfiguration-enable)
     */
    public fun enable(): Any

    /**
     * A builder for [CFNS3LogsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enable The status of S3 data event logs as a data source. 
       */
      public fun enable(enable: Boolean)

      /**
       * @param enable The status of S3 data event logs as a data source. 
       */
      public fun enable(enable: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty.builder()

      /**
       * @param enable The status of S3 data event logs as a data source. 
       */
      override fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
      }

      /**
       * @param enable The status of S3 data event logs as a data source. 
       */
      override fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty,
    ) : CdkObject(cdkObject), CFNS3LogsConfigurationProperty {
      /**
       * The status of S3 data event logs as a data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfns3logsconfiguration.html#cfn-guardduty-detector-cfns3logsconfiguration-enable)
       */
      override fun enable(): Any = unwrap(this).getEnable()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CFNS3LogsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty):
          CFNS3LogsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CFNS3LogsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNS3LogsConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNS3LogsConfigurationProperty
    }
  }

  /**
   * Describes whether Malware Protection for EC2 instances with findings will be enabled as a data
   * source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.guardduty.*;
   * CFNScanEc2InstanceWithFindingsConfigurationProperty
   * cFNScanEc2InstanceWithFindingsConfigurationProperty =
   * CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()
   * .ebsVolumes(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnscanec2instancewithfindingsconfiguration.html)
   */
  public interface CFNScanEc2InstanceWithFindingsConfigurationProperty {
    /**
     * Describes the configuration for scanning EBS volumes as data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnscanec2instancewithfindingsconfiguration.html#cfn-guardduty-detector-cfnscanec2instancewithfindingsconfiguration-ebsvolumes)
     */
    public fun ebsVolumes(): Any? = unwrap(this).getEbsVolumes()

    /**
     * A builder for [CFNScanEc2InstanceWithFindingsConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ebsVolumes Describes the configuration for scanning EBS volumes as data source.
       */
      public fun ebsVolumes(ebsVolumes: Boolean)

      /**
       * @param ebsVolumes Describes the configuration for scanning EBS volumes as data source.
       */
      public fun ebsVolumes(ebsVolumes: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty.builder()

      /**
       * @param ebsVolumes Describes the configuration for scanning EBS volumes as data source.
       */
      override fun ebsVolumes(ebsVolumes: Boolean) {
        cdkBuilder.ebsVolumes(ebsVolumes)
      }

      /**
       * @param ebsVolumes Describes the configuration for scanning EBS volumes as data source.
       */
      override fun ebsVolumes(ebsVolumes: IResolvable) {
        cdkBuilder.ebsVolumes(ebsVolumes.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty,
    ) : CdkObject(cdkObject), CFNScanEc2InstanceWithFindingsConfigurationProperty {
      /**
       * Describes the configuration for scanning EBS volumes as data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-cfnscanec2instancewithfindingsconfiguration.html#cfn-guardduty-detector-cfnscanec2instancewithfindingsconfiguration-ebsvolumes)
       */
      override fun ebsVolumes(): Any? = unwrap(this).getEbsVolumes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CFNScanEc2InstanceWithFindingsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty):
          CFNScanEc2InstanceWithFindingsConfigurationProperty = CdkObjectWrappers.wrap(cdkObject)
          as? CFNScanEc2InstanceWithFindingsConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CFNScanEc2InstanceWithFindingsConfigurationProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.CFNScanEc2InstanceWithFindingsConfigurationProperty
    }
  }

  /**
   * Describes a tag.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.guardduty.*;
   * TagItemProperty tagItemProperty = TagItemProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-tagitem.html)
   */
  public interface TagItemProperty {
    /**
     * The tag value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-tagitem.html#cfn-guardduty-detector-tagitem-key)
     */
    public fun key(): String

    /**
     * The tag key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-tagitem.html#cfn-guardduty-detector-tagitem-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TagItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The tag value. 
       */
      public fun key(key: String)

      /**
       * @param value The tag key. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty.Builder =
          software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty.builder()

      /**
       * @param key The tag value. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The tag key. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty,
    ) : CdkObject(cdkObject), TagItemProperty {
      /**
       * The tag value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-tagitem.html#cfn-guardduty-detector-tagitem-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The tag key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-detector-tagitem.html#cfn-guardduty-detector-tagitem-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty):
          TagItemProperty = CdkObjectWrappers.wrap(cdkObject) as? TagItemProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagItemProperty):
          software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.guardduty.CfnDetector.TagItemProperty
    }
  }
}
