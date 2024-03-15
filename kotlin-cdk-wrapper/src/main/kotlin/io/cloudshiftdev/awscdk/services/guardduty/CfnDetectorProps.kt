@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.guardduty

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnDetector`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.guardduty.*;
 * CfnDetectorProps cfnDetectorProps = CfnDetectorProps.builder()
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
public interface CfnDetectorProps {
  /**
   * Describes which data sources will be enabled for the detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-datasources)
   */
  public fun dataSources(): Any? = unwrap(this).getDataSources()

  /**
   * Specifies whether the detector is to be enabled on creation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable)
   */
  public fun enable(): Any

  /**
   * A list of features that will be configured for the detector.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-features)
   */
  public fun features(): Any? = unwrap(this).getFeatures()

  /**
   * Specifies how frequently updated findings are exported.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-findingpublishingfrequency)
   */
  public fun findingPublishingFrequency(): String? = unwrap(this).getFindingPublishingFrequency()

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
   */
  public fun tags(): List<CfnDetector.TagItemProperty> =
      unwrap(this).getTags()?.map(CfnDetector.TagItemProperty::wrap) ?: emptyList()

  /**
   * A builder for [CfnDetectorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataSources Describes which data sources will be enabled for the detector.
     */
    public fun dataSources(dataSources: IResolvable)

    /**
     * @param dataSources Describes which data sources will be enabled for the detector.
     */
    public fun dataSources(dataSources: CfnDetector.CFNDataSourceConfigurationsProperty)

    /**
     * @param dataSources Describes which data sources will be enabled for the detector.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ace3003720336dd62e3bf03a63b0cb414964cf4714e30450776737c11434a23")
    public
        fun dataSources(dataSources: CfnDetector.CFNDataSourceConfigurationsProperty.Builder.() -> Unit)

    /**
     * @param enable Specifies whether the detector is to be enabled on creation. 
     */
    public fun enable(enable: Boolean)

    /**
     * @param enable Specifies whether the detector is to be enabled on creation. 
     */
    public fun enable(enable: IResolvable)

    /**
     * @param features A list of features that will be configured for the detector.
     */
    public fun features(features: IResolvable)

    /**
     * @param features A list of features that will be configured for the detector.
     */
    public fun features(features: List<Any>)

    /**
     * @param features A list of features that will be configured for the detector.
     */
    public fun features(vararg features: Any)

    /**
     * @param findingPublishingFrequency Specifies how frequently updated findings are exported.
     */
    public fun findingPublishingFrequency(findingPublishingFrequency: String)

    /**
     * @param tags Specifies tags added to a new detector resource.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Currently, support is available only for creating and deleting a tag. No support exists for
     * updating the tags.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnDetector.TagItemProperty>)

    /**
     * @param tags Specifies tags added to a new detector resource.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Currently, support is available only for creating and deleting a tag. No support exists for
     * updating the tags.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnDetector.TagItemProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnDetectorProps.Builder =
        software.amazon.awscdk.services.guardduty.CfnDetectorProps.builder()

    /**
     * @param dataSources Describes which data sources will be enabled for the detector.
     */
    override fun dataSources(dataSources: IResolvable) {
      cdkBuilder.dataSources(dataSources.let(IResolvable::unwrap))
    }

    /**
     * @param dataSources Describes which data sources will be enabled for the detector.
     */
    override fun dataSources(dataSources: CfnDetector.CFNDataSourceConfigurationsProperty) {
      cdkBuilder.dataSources(dataSources.let(CfnDetector.CFNDataSourceConfigurationsProperty::unwrap))
    }

    /**
     * @param dataSources Describes which data sources will be enabled for the detector.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ace3003720336dd62e3bf03a63b0cb414964cf4714e30450776737c11434a23")
    override
        fun dataSources(dataSources: CfnDetector.CFNDataSourceConfigurationsProperty.Builder.() -> Unit):
        Unit = dataSources(CfnDetector.CFNDataSourceConfigurationsProperty(dataSources))

    /**
     * @param enable Specifies whether the detector is to be enabled on creation. 
     */
    override fun enable(enable: Boolean) {
      cdkBuilder.enable(enable)
    }

    /**
     * @param enable Specifies whether the detector is to be enabled on creation. 
     */
    override fun enable(enable: IResolvable) {
      cdkBuilder.enable(enable.let(IResolvable::unwrap))
    }

    /**
     * @param features A list of features that will be configured for the detector.
     */
    override fun features(features: IResolvable) {
      cdkBuilder.features(features.let(IResolvable::unwrap))
    }

    /**
     * @param features A list of features that will be configured for the detector.
     */
    override fun features(features: List<Any>) {
      cdkBuilder.features(features)
    }

    /**
     * @param features A list of features that will be configured for the detector.
     */
    override fun features(vararg features: Any): Unit = features(features.toList())

    /**
     * @param findingPublishingFrequency Specifies how frequently updated findings are exported.
     */
    override fun findingPublishingFrequency(findingPublishingFrequency: String) {
      cdkBuilder.findingPublishingFrequency(findingPublishingFrequency)
    }

    /**
     * @param tags Specifies tags added to a new detector resource.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Currently, support is available only for creating and deleting a tag. No support exists for
     * updating the tags.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnDetector.TagItemProperty>) {
      cdkBuilder.tags(tags.map(CfnDetector.TagItemProperty::unwrap))
    }

    /**
     * @param tags Specifies tags added to a new detector resource.
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * Currently, support is available only for creating and deleting a tag. No support exists for
     * updating the tags.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnDetector.TagItemProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.guardduty.CfnDetectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.guardduty.CfnDetectorProps,
  ) : CdkObject(cdkObject), CfnDetectorProps {
    /**
     * Describes which data sources will be enabled for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-datasources)
     */
    override fun dataSources(): Any? = unwrap(this).getDataSources()

    /**
     * Specifies whether the detector is to be enabled on creation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-enable)
     */
    override fun enable(): Any = unwrap(this).getEnable()

    /**
     * A list of features that will be configured for the detector.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-features)
     */
    override fun features(): Any? = unwrap(this).getFeatures()

    /**
     * Specifies how frequently updated findings are exported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-detector.html#cfn-guardduty-detector-findingpublishingfrequency)
     */
    override fun findingPublishingFrequency(): String? =
        unwrap(this).getFindingPublishingFrequency()

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
     */
    override fun tags(): List<CfnDetector.TagItemProperty> =
        unwrap(this).getTags()?.map(CfnDetector.TagItemProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDetectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnDetectorProps):
        CfnDetectorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDetectorProps):
        software.amazon.awscdk.services.guardduty.CfnDetectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.guardduty.CfnDetectorProps
  }
}
