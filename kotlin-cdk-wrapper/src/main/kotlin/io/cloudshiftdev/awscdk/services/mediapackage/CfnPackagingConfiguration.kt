@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a packaging configuration in a packaging group.
 *
 * The packaging configuration represents a single delivery point for an asset. It determines the
 * format and setting for the egressing content. Specify only one package format per configuration,
 * such as `HlsPackage` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediapackage.*;
 * CfnPackagingConfiguration cfnPackagingConfiguration =
 * CfnPackagingConfiguration.Builder.create(this, "MyCfnPackagingConfiguration")
 * .id("id")
 * .packagingGroupId("packagingGroupId")
 * // the properties below are optional
 * .cmafPackage(CmafPackageProperty.builder()
 * .hlsManifests(List.of(HlsManifestProperty.builder()
 * .adMarkers("adMarkers")
 * .includeIframeOnlyStream(false)
 * .manifestName("manifestName")
 * .programDateTimeIntervalSeconds(123)
 * .repeatExtXKey(false)
 * .streamSelection(StreamSelectionProperty.builder()
 * .maxVideoBitsPerSecond(123)
 * .minVideoBitsPerSecond(123)
 * .streamOrder("streamOrder")
 * .build())
 * .build()))
 * // the properties below are optional
 * .encryption(CmafEncryptionProperty.builder()
 * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
 * .roleArn("roleArn")
 * .systemIds(List.of("systemIds"))
 * .url("url")
 * // the properties below are optional
 * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build())
 * .build())
 * .build())
 * .includeEncoderConfigurationInSegments(false)
 * .segmentDurationSeconds(123)
 * .build())
 * .dashPackage(DashPackageProperty.builder()
 * .dashManifests(List.of(DashManifestProperty.builder()
 * .manifestLayout("manifestLayout")
 * .manifestName("manifestName")
 * .minBufferTimeSeconds(123)
 * .profile("profile")
 * .scteMarkersSource("scteMarkersSource")
 * .streamSelection(StreamSelectionProperty.builder()
 * .maxVideoBitsPerSecond(123)
 * .minVideoBitsPerSecond(123)
 * .streamOrder("streamOrder")
 * .build())
 * .build()))
 * // the properties below are optional
 * .encryption(DashEncryptionProperty.builder()
 * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
 * .roleArn("roleArn")
 * .systemIds(List.of("systemIds"))
 * .url("url")
 * // the properties below are optional
 * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build())
 * .build())
 * .build())
 * .includeEncoderConfigurationInSegments(false)
 * .includeIframeOnlyStream(false)
 * .periodTriggers(List.of("periodTriggers"))
 * .segmentDurationSeconds(123)
 * .segmentTemplateFormat("segmentTemplateFormat")
 * .build())
 * .hlsPackage(HlsPackageProperty.builder()
 * .hlsManifests(List.of(HlsManifestProperty.builder()
 * .adMarkers("adMarkers")
 * .includeIframeOnlyStream(false)
 * .manifestName("manifestName")
 * .programDateTimeIntervalSeconds(123)
 * .repeatExtXKey(false)
 * .streamSelection(StreamSelectionProperty.builder()
 * .maxVideoBitsPerSecond(123)
 * .minVideoBitsPerSecond(123)
 * .streamOrder("streamOrder")
 * .build())
 * .build()))
 * // the properties below are optional
 * .encryption(HlsEncryptionProperty.builder()
 * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
 * .roleArn("roleArn")
 * .systemIds(List.of("systemIds"))
 * .url("url")
 * // the properties below are optional
 * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build())
 * .build())
 * // the properties below are optional
 * .constantInitializationVector("constantInitializationVector")
 * .encryptionMethod("encryptionMethod")
 * .build())
 * .includeDvbSubtitles(false)
 * .segmentDurationSeconds(123)
 * .useAudioRenditionGroup(false)
 * .build())
 * .mssPackage(MssPackageProperty.builder()
 * .mssManifests(List.of(MssManifestProperty.builder()
 * .manifestName("manifestName")
 * .streamSelection(StreamSelectionProperty.builder()
 * .maxVideoBitsPerSecond(123)
 * .minVideoBitsPerSecond(123)
 * .streamOrder("streamOrder")
 * .build())
 * .build()))
 * // the properties below are optional
 * .encryption(MssEncryptionProperty.builder()
 * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
 * .roleArn("roleArn")
 * .systemIds(List.of("systemIds"))
 * .url("url")
 * // the properties below are optional
 * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build())
 * .build())
 * .build())
 * .segmentDurationSeconds(123)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html)
 */
public open class CfnPackagingConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) for the packaging configuration.
   *
   * You can get this from the response to any request to the packaging configuration.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Parameters for CMAF packaging.
   */
  public open fun cmafPackage(): Any? = unwrap(this).getCmafPackage()

  /**
   * Parameters for CMAF packaging.
   */
  public open fun cmafPackage(`value`: IResolvable) {
    unwrap(this).setCmafPackage(`value`.let(IResolvable::unwrap))
  }

  /**
   * Parameters for CMAF packaging.
   */
  public open fun cmafPackage(`value`: CmafPackageProperty) {
    unwrap(this).setCmafPackage(`value`.let(CmafPackageProperty::unwrap))
  }

  /**
   * Parameters for CMAF packaging.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ea99f10745e5a2cb252cbbdee4b5981038ca897b34ec35595faccaf06feeeb97")
  public open fun cmafPackage(`value`: CmafPackageProperty.Builder.() -> Unit): Unit =
      cmafPackage(CmafPackageProperty(`value`))

  /**
   * Parameters for DASH-ISO packaging.
   */
  public open fun dashPackage(): Any? = unwrap(this).getDashPackage()

  /**
   * Parameters for DASH-ISO packaging.
   */
  public open fun dashPackage(`value`: IResolvable) {
    unwrap(this).setDashPackage(`value`.let(IResolvable::unwrap))
  }

  /**
   * Parameters for DASH-ISO packaging.
   */
  public open fun dashPackage(`value`: DashPackageProperty) {
    unwrap(this).setDashPackage(`value`.let(DashPackageProperty::unwrap))
  }

  /**
   * Parameters for DASH-ISO packaging.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("97c16662ef4e97d77d1cab89ef3a9e766f4a86928df255a068f0af226980657c")
  public open fun dashPackage(`value`: DashPackageProperty.Builder.() -> Unit): Unit =
      dashPackage(DashPackageProperty(`value`))

  /**
   * Parameters for Apple HLS packaging.
   */
  public open fun hlsPackage(): Any? = unwrap(this).getHlsPackage()

  /**
   * Parameters for Apple HLS packaging.
   */
  public open fun hlsPackage(`value`: IResolvable) {
    unwrap(this).setHlsPackage(`value`.let(IResolvable::unwrap))
  }

  /**
   * Parameters for Apple HLS packaging.
   */
  public open fun hlsPackage(`value`: HlsPackageProperty) {
    unwrap(this).setHlsPackage(`value`.let(HlsPackageProperty::unwrap))
  }

  /**
   * Parameters for Apple HLS packaging.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2b2142ecd34cbcd02f1fb8c64d1e1409a2590aa0db0c49ad65333ee8adacc98f")
  public open fun hlsPackage(`value`: HlsPackageProperty.Builder.() -> Unit): Unit =
      hlsPackage(HlsPackageProperty(`value`))

  /**
   * Unique identifier that you assign to the packaging configuration.
   */
  public open fun id(): String = unwrap(this).getId()

  /**
   * Unique identifier that you assign to the packaging configuration.
   */
  public open fun id(`value`: String) {
    unwrap(this).setId(`value`)
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
   * Parameters for Microsoft Smooth Streaming packaging.
   */
  public open fun mssPackage(): Any? = unwrap(this).getMssPackage()

  /**
   * Parameters for Microsoft Smooth Streaming packaging.
   */
  public open fun mssPackage(`value`: IResolvable) {
    unwrap(this).setMssPackage(`value`.let(IResolvable::unwrap))
  }

  /**
   * Parameters for Microsoft Smooth Streaming packaging.
   */
  public open fun mssPackage(`value`: MssPackageProperty) {
    unwrap(this).setMssPackage(`value`.let(MssPackageProperty::unwrap))
  }

  /**
   * Parameters for Microsoft Smooth Streaming packaging.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8d8ed7006e0485bd77316fa9c5c0865c98a67ebdf9526ce86360c7b006dc2816")
  public open fun mssPackage(`value`: MssPackageProperty.Builder.() -> Unit): Unit =
      mssPackage(MssPackageProperty(`value`))

  /**
   * The ID of the packaging group associated with this packaging configuration.
   */
  public open fun packagingGroupId(): String = unwrap(this).getPackagingGroupId()

  /**
   * The ID of the packaging group associated with this packaging configuration.
   */
  public open fun packagingGroupId(`value`: String) {
    unwrap(this).setPackagingGroupId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to assign to the packaging configuration.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to assign to the packaging configuration.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to assign to the packaging configuration.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediapackage.CfnPackagingConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Parameters for CMAF packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-cmafpackage)
     * @param cmafPackage Parameters for CMAF packaging. 
     */
    public fun cmafPackage(cmafPackage: IResolvable)

    /**
     * Parameters for CMAF packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-cmafpackage)
     * @param cmafPackage Parameters for CMAF packaging. 
     */
    public fun cmafPackage(cmafPackage: CmafPackageProperty)

    /**
     * Parameters for CMAF packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-cmafpackage)
     * @param cmafPackage Parameters for CMAF packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a97cc455baf43ff04dc19998d4e476be0fff980eaab7fb2fd85efb4cfaf52582")
    public fun cmafPackage(cmafPackage: CmafPackageProperty.Builder.() -> Unit)

    /**
     * Parameters for DASH-ISO packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-dashpackage)
     * @param dashPackage Parameters for DASH-ISO packaging. 
     */
    public fun dashPackage(dashPackage: IResolvable)

    /**
     * Parameters for DASH-ISO packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-dashpackage)
     * @param dashPackage Parameters for DASH-ISO packaging. 
     */
    public fun dashPackage(dashPackage: DashPackageProperty)

    /**
     * Parameters for DASH-ISO packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-dashpackage)
     * @param dashPackage Parameters for DASH-ISO packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1713f82d9228e01b345734359e6afd5da9e43efc394939f4e9c7e4a56e05fb4a")
    public fun dashPackage(dashPackage: DashPackageProperty.Builder.() -> Unit)

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-hlspackage)
     * @param hlsPackage Parameters for Apple HLS packaging. 
     */
    public fun hlsPackage(hlsPackage: IResolvable)

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-hlspackage)
     * @param hlsPackage Parameters for Apple HLS packaging. 
     */
    public fun hlsPackage(hlsPackage: HlsPackageProperty)

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-hlspackage)
     * @param hlsPackage Parameters for Apple HLS packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5da5e4c726eafbd8439914dcc7a947902d5d23fddf04d55c893228117c224c93")
    public fun hlsPackage(hlsPackage: HlsPackageProperty.Builder.() -> Unit)

    /**
     * Unique identifier that you assign to the packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-id)
     * @param id Unique identifier that you assign to the packaging configuration. 
     */
    public fun id(id: String)

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-msspackage)
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
     */
    public fun mssPackage(mssPackage: IResolvable)

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-msspackage)
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
     */
    public fun mssPackage(mssPackage: MssPackageProperty)

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-msspackage)
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bb4218bdb2427217c3aa1741d7196dde0040c95b44ba4a92a8311fa7077e176")
    public fun mssPackage(mssPackage: MssPackageProperty.Builder.() -> Unit)

    /**
     * The ID of the packaging group associated with this packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-packaginggroupid)
     * @param packagingGroupId The ID of the packaging group associated with this packaging
     * configuration. 
     */
    public fun packagingGroupId(packagingGroupId: String)

    /**
     * The tags to assign to the packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-tags)
     * @param tags The tags to assign to the packaging configuration. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to assign to the packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-tags)
     * @param tags The tags to assign to the packaging configuration. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.Builder =
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.Builder.create(scope,
        id)

    /**
     * Parameters for CMAF packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-cmafpackage)
     * @param cmafPackage Parameters for CMAF packaging. 
     */
    override fun cmafPackage(cmafPackage: IResolvable) {
      cdkBuilder.cmafPackage(cmafPackage.let(IResolvable::unwrap))
    }

    /**
     * Parameters for CMAF packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-cmafpackage)
     * @param cmafPackage Parameters for CMAF packaging. 
     */
    override fun cmafPackage(cmafPackage: CmafPackageProperty) {
      cdkBuilder.cmafPackage(cmafPackage.let(CmafPackageProperty::unwrap))
    }

    /**
     * Parameters for CMAF packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-cmafpackage)
     * @param cmafPackage Parameters for CMAF packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a97cc455baf43ff04dc19998d4e476be0fff980eaab7fb2fd85efb4cfaf52582")
    override fun cmafPackage(cmafPackage: CmafPackageProperty.Builder.() -> Unit): Unit =
        cmafPackage(CmafPackageProperty(cmafPackage))

    /**
     * Parameters for DASH-ISO packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-dashpackage)
     * @param dashPackage Parameters for DASH-ISO packaging. 
     */
    override fun dashPackage(dashPackage: IResolvable) {
      cdkBuilder.dashPackage(dashPackage.let(IResolvable::unwrap))
    }

    /**
     * Parameters for DASH-ISO packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-dashpackage)
     * @param dashPackage Parameters for DASH-ISO packaging. 
     */
    override fun dashPackage(dashPackage: DashPackageProperty) {
      cdkBuilder.dashPackage(dashPackage.let(DashPackageProperty::unwrap))
    }

    /**
     * Parameters for DASH-ISO packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-dashpackage)
     * @param dashPackage Parameters for DASH-ISO packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1713f82d9228e01b345734359e6afd5da9e43efc394939f4e9c7e4a56e05fb4a")
    override fun dashPackage(dashPackage: DashPackageProperty.Builder.() -> Unit): Unit =
        dashPackage(DashPackageProperty(dashPackage))

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-hlspackage)
     * @param hlsPackage Parameters for Apple HLS packaging. 
     */
    override fun hlsPackage(hlsPackage: IResolvable) {
      cdkBuilder.hlsPackage(hlsPackage.let(IResolvable::unwrap))
    }

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-hlspackage)
     * @param hlsPackage Parameters for Apple HLS packaging. 
     */
    override fun hlsPackage(hlsPackage: HlsPackageProperty) {
      cdkBuilder.hlsPackage(hlsPackage.let(HlsPackageProperty::unwrap))
    }

    /**
     * Parameters for Apple HLS packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-hlspackage)
     * @param hlsPackage Parameters for Apple HLS packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5da5e4c726eafbd8439914dcc7a947902d5d23fddf04d55c893228117c224c93")
    override fun hlsPackage(hlsPackage: HlsPackageProperty.Builder.() -> Unit): Unit =
        hlsPackage(HlsPackageProperty(hlsPackage))

    /**
     * Unique identifier that you assign to the packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-id)
     * @param id Unique identifier that you assign to the packaging configuration. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-msspackage)
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
     */
    override fun mssPackage(mssPackage: IResolvable) {
      cdkBuilder.mssPackage(mssPackage.let(IResolvable::unwrap))
    }

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-msspackage)
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
     */
    override fun mssPackage(mssPackage: MssPackageProperty) {
      cdkBuilder.mssPackage(mssPackage.let(MssPackageProperty::unwrap))
    }

    /**
     * Parameters for Microsoft Smooth Streaming packaging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-msspackage)
     * @param mssPackage Parameters for Microsoft Smooth Streaming packaging. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4bb4218bdb2427217c3aa1741d7196dde0040c95b44ba4a92a8311fa7077e176")
    override fun mssPackage(mssPackage: MssPackageProperty.Builder.() -> Unit): Unit =
        mssPackage(MssPackageProperty(mssPackage))

    /**
     * The ID of the packaging group associated with this packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-packaginggroupid)
     * @param packagingGroupId The ID of the packaging group associated with this packaging
     * configuration. 
     */
    override fun packagingGroupId(packagingGroupId: String) {
      cdkBuilder.packagingGroupId(packagingGroupId)
    }

    /**
     * The tags to assign to the packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-tags)
     * @param tags The tags to assign to the packaging configuration. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to assign to the packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-packagingconfiguration.html#cfn-mediapackage-packagingconfiguration-tags)
     * @param tags The tags to assign to the packaging configuration. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPackagingConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPackagingConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration):
        CfnPackagingConfiguration = CfnPackagingConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnPackagingConfiguration):
        software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration = wrapped.cdkObject
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * CmafEncryptionProperty cmafEncryptionProperty = CmafEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-cmafencryption.html)
   */
  public interface CmafEncryptionProperty {
    /**
     * Parameters for the SPEKE key provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-cmafencryption.html#cfn-mediapackage-packagingconfiguration-cmafencryption-spekekeyprovider)
     */
    public fun spekeKeyProvider(): Any

    /**
     * A builder for [CmafEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8db7b287f4d869addecc5e4d6a4491c12bb49517926b9591b5d8dcadc6b57b77")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty.builder()

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8db7b287f4d869addecc5e4d6a4491c12bb49517926b9591b5d8dcadc6b57b77")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty,
    ) : CdkObject(cdkObject), CmafEncryptionProperty {
      /**
       * Parameters for the SPEKE key provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-cmafencryption.html#cfn-mediapackage-packagingconfiguration-cmafencryption-spekekeyprovider)
       */
      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CmafEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty):
          CmafEncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as? CmafEncryptionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CmafEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafEncryptionProperty
    }
  }

  /**
   * Parameters for a packaging configuration that uses Dynamic Adaptive Streaming over HTTP (DASH)
   * packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * DashPackageProperty dashPackageProperty = DashPackageProperty.builder()
   * .dashManifests(List.of(DashManifestProperty.builder()
   * .manifestLayout("manifestLayout")
   * .manifestName("manifestName")
   * .minBufferTimeSeconds(123)
   * .profile("profile")
   * .scteMarkersSource("scteMarkersSource")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(DashEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build())
   * .includeEncoderConfigurationInSegments(false)
   * .includeIframeOnlyStream(false)
   * .periodTriggers(List.of("periodTriggers"))
   * .segmentDurationSeconds(123)
   * .segmentTemplateFormat("segmentTemplateFormat")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html)
   */
  public interface DashPackageProperty {
    /**
     * A list of DASH manifest configurations that are available from this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html#cfn-mediapackage-packagingconfiguration-dashpackage-dashmanifests)
     */
    public fun dashManifests(): Any

    /**
     * Parameters for encrypting content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html#cfn-mediapackage-packagingconfiguration-dashpackage-encryption)
     */
    public fun encryption(): Any? = unwrap(this).getEncryption()

    /**
     * When includeEncoderConfigurationInSegments is set to true, AWS Elemental MediaPackage places
     * your encoder's Sequence Parameter Set (SPS), Picture Parameter Set (PPS), and Video Parameter
     * Set (VPS) metadata in every video segment instead of in the init fragment.
     *
     * This lets you use different SPS/PPS/VPS settings for your assets during content playback.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html#cfn-mediapackage-packagingconfiguration-dashpackage-includeencoderconfigurationinsegments)
     */
    public fun includeEncoderConfigurationInSegments(): Any? =
        unwrap(this).getIncludeEncoderConfigurationInSegments()

    /**
     * This applies only to stream sets with a single video track.
     *
     * When true, the stream set includes an additional I-frame trick-play only stream, along with
     * the other tracks. If false, this extra stream is not included.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html#cfn-mediapackage-packagingconfiguration-dashpackage-includeiframeonlystream)
     */
    public fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

    /**
     * Controls whether AWS Elemental MediaPackage produces single-period or multi-period DASH
     * manifests.
     *
     * For more information about periods, see [Multi-period DASH in AWS Elemental
     * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/multi-period.html) .
     *
     * Valid values:
     *
     * * `ADS` - AWS Elemental MediaPackage will produce multi-period DASH manifests. Periods are
     * created based on the SCTE-35 ad markers present in the input manifest.
     * * *No value* - AWS Elemental MediaPackage will produce single-period DASH manifests. This is
     * the default setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html#cfn-mediapackage-packagingconfiguration-dashpackage-periodtriggers)
     */
    public fun periodTriggers(): List<String> = unwrap(this).getPeriodTriggers() ?: emptyList()

    /**
     * Duration (in seconds) of each fragment.
     *
     * Actual fragments are rounded to the nearest multiple of the source segment duration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html#cfn-mediapackage-packagingconfiguration-dashpackage-segmentdurationseconds)
     */
    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    /**
     * Determines the type of SegmentTemplate included in the Media Presentation Description (MPD).
     *
     * When set to `NUMBER_WITH_TIMELINE` , a full timeline is presented in each SegmentTemplate,
     * with $Number$ media URLs. When set to `TIME_WITH_TIMELINE` , a full timeline is presented in
     * each SegmentTemplate, with $Time$ media URLs. When set to `NUMBER_WITH_DURATION` , only a
     * duration is included in each SegmentTemplate, with $Number$ media URLs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html#cfn-mediapackage-packagingconfiguration-dashpackage-segmenttemplateformat)
     */
    public fun segmentTemplateFormat(): String? = unwrap(this).getSegmentTemplateFormat()

    /**
     * A builder for [DashPackageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dashManifests A list of DASH manifest configurations that are available from this
       * endpoint. 
       */
      public fun dashManifests(dashManifests: IResolvable)

      /**
       * @param dashManifests A list of DASH manifest configurations that are available from this
       * endpoint. 
       */
      public fun dashManifests(dashManifests: List<Any>)

      /**
       * @param dashManifests A list of DASH manifest configurations that are available from this
       * endpoint. 
       */
      public fun dashManifests(vararg dashManifests: Any)

      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: IResolvable)

      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: DashEncryptionProperty)

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43eca2a40ade88bfc21a51032b082851928c61bb9e40ee06701f24ba5fadd9a9")
      public fun encryption(encryption: DashEncryptionProperty.Builder.() -> Unit)

      /**
       * @param includeEncoderConfigurationInSegments When includeEncoderConfigurationInSegments is
       * set to true, AWS Elemental MediaPackage places your encoder's Sequence Parameter Set (SPS),
       * Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment
       * instead of in the init fragment.
       * This lets you use different SPS/PPS/VPS settings for your assets during content playback.
       */
      public
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: Boolean)

      /**
       * @param includeEncoderConfigurationInSegments When includeEncoderConfigurationInSegments is
       * set to true, AWS Elemental MediaPackage places your encoder's Sequence Parameter Set (SPS),
       * Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment
       * instead of in the init fragment.
       * This lets you use different SPS/PPS/VPS settings for your assets during content playback.
       */
      public
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: IResolvable)

      /**
       * @param includeIframeOnlyStream This applies only to stream sets with a single video track.
       * When true, the stream set includes an additional I-frame trick-play only stream, along with
       * the other tracks. If false, this extra stream is not included.
       */
      public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean)

      /**
       * @param includeIframeOnlyStream This applies only to stream sets with a single video track.
       * When true, the stream set includes an additional I-frame trick-play only stream, along with
       * the other tracks. If false, this extra stream is not included.
       */
      public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable)

      /**
       * @param periodTriggers Controls whether AWS Elemental MediaPackage produces single-period or
       * multi-period DASH manifests.
       * For more information about periods, see [Multi-period DASH in AWS Elemental
       * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/multi-period.html) .
       *
       * Valid values:
       *
       * * `ADS` - AWS Elemental MediaPackage will produce multi-period DASH manifests. Periods are
       * created based on the SCTE-35 ad markers present in the input manifest.
       * * *No value* - AWS Elemental MediaPackage will produce single-period DASH manifests. This
       * is the default setting.
       */
      public fun periodTriggers(periodTriggers: List<String>)

      /**
       * @param periodTriggers Controls whether AWS Elemental MediaPackage produces single-period or
       * multi-period DASH manifests.
       * For more information about periods, see [Multi-period DASH in AWS Elemental
       * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/multi-period.html) .
       *
       * Valid values:
       *
       * * `ADS` - AWS Elemental MediaPackage will produce multi-period DASH manifests. Periods are
       * created based on the SCTE-35 ad markers present in the input manifest.
       * * *No value* - AWS Elemental MediaPackage will produce single-period DASH manifests. This
       * is the default setting.
       */
      public fun periodTriggers(vararg periodTriggers: String)

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each fragment.
       * Actual fragments are rounded to the nearest multiple of the source segment duration.
       */
      public fun segmentDurationSeconds(segmentDurationSeconds: Number)

      /**
       * @param segmentTemplateFormat Determines the type of SegmentTemplate included in the Media
       * Presentation Description (MPD).
       * When set to `NUMBER_WITH_TIMELINE` , a full timeline is presented in each SegmentTemplate,
       * with $Number$ media URLs. When set to `TIME_WITH_TIMELINE` , a full timeline is presented in
       * each SegmentTemplate, with $Time$ media URLs. When set to `NUMBER_WITH_DURATION` , only a
       * duration is included in each SegmentTemplate, with $Number$ media URLs.
       */
      public fun segmentTemplateFormat(segmentTemplateFormat: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty.builder()

      /**
       * @param dashManifests A list of DASH manifest configurations that are available from this
       * endpoint. 
       */
      override fun dashManifests(dashManifests: IResolvable) {
        cdkBuilder.dashManifests(dashManifests.let(IResolvable::unwrap))
      }

      /**
       * @param dashManifests A list of DASH manifest configurations that are available from this
       * endpoint. 
       */
      override fun dashManifests(dashManifests: List<Any>) {
        cdkBuilder.dashManifests(dashManifests)
      }

      /**
       * @param dashManifests A list of DASH manifest configurations that are available from this
       * endpoint. 
       */
      override fun dashManifests(vararg dashManifests: Any): Unit =
          dashManifests(dashManifests.toList())

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: DashEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(DashEncryptionProperty::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43eca2a40ade88bfc21a51032b082851928c61bb9e40ee06701f24ba5fadd9a9")
      override fun encryption(encryption: DashEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(DashEncryptionProperty(encryption))

      /**
       * @param includeEncoderConfigurationInSegments When includeEncoderConfigurationInSegments is
       * set to true, AWS Elemental MediaPackage places your encoder's Sequence Parameter Set (SPS),
       * Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment
       * instead of in the init fragment.
       * This lets you use different SPS/PPS/VPS settings for your assets during content playback.
       */
      override
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: Boolean) {
        cdkBuilder.includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments)
      }

      /**
       * @param includeEncoderConfigurationInSegments When includeEncoderConfigurationInSegments is
       * set to true, AWS Elemental MediaPackage places your encoder's Sequence Parameter Set (SPS),
       * Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment
       * instead of in the init fragment.
       * This lets you use different SPS/PPS/VPS settings for your assets during content playback.
       */
      override
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: IResolvable) {
        cdkBuilder.includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments.let(IResolvable::unwrap))
      }

      /**
       * @param includeIframeOnlyStream This applies only to stream sets with a single video track.
       * When true, the stream set includes an additional I-frame trick-play only stream, along with
       * the other tracks. If false, this extra stream is not included.
       */
      override fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
      }

      /**
       * @param includeIframeOnlyStream This applies only to stream sets with a single video track.
       * When true, the stream set includes an additional I-frame trick-play only stream, along with
       * the other tracks. If false, this extra stream is not included.
       */
      override fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream.let(IResolvable::unwrap))
      }

      /**
       * @param periodTriggers Controls whether AWS Elemental MediaPackage produces single-period or
       * multi-period DASH manifests.
       * For more information about periods, see [Multi-period DASH in AWS Elemental
       * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/multi-period.html) .
       *
       * Valid values:
       *
       * * `ADS` - AWS Elemental MediaPackage will produce multi-period DASH manifests. Periods are
       * created based on the SCTE-35 ad markers present in the input manifest.
       * * *No value* - AWS Elemental MediaPackage will produce single-period DASH manifests. This
       * is the default setting.
       */
      override fun periodTriggers(periodTriggers: List<String>) {
        cdkBuilder.periodTriggers(periodTriggers)
      }

      /**
       * @param periodTriggers Controls whether AWS Elemental MediaPackage produces single-period or
       * multi-period DASH manifests.
       * For more information about periods, see [Multi-period DASH in AWS Elemental
       * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/multi-period.html) .
       *
       * Valid values:
       *
       * * `ADS` - AWS Elemental MediaPackage will produce multi-period DASH manifests. Periods are
       * created based on the SCTE-35 ad markers present in the input manifest.
       * * *No value* - AWS Elemental MediaPackage will produce single-period DASH manifests. This
       * is the default setting.
       */
      override fun periodTriggers(vararg periodTriggers: String): Unit =
          periodTriggers(periodTriggers.toList())

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each fragment.
       * Actual fragments are rounded to the nearest multiple of the source segment duration.
       */
      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      /**
       * @param segmentTemplateFormat Determines the type of SegmentTemplate included in the Media
       * Presentation Description (MPD).
       * When set to `NUMBER_WITH_TIMELINE` , a full timeline is presented in each SegmentTemplate,
       * with $Number$ media URLs. When set to `TIME_WITH_TIMELINE` , a full timeline is presented in
       * each SegmentTemplate, with $Time$ media URLs. When set to `NUMBER_WITH_DURATION` , only a
       * duration is included in each SegmentTemplate, with $Number$ media URLs.
       */
      override fun segmentTemplateFormat(segmentTemplateFormat: String) {
        cdkBuilder.segmentTemplateFormat(segmentTemplateFormat)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty,
    ) : CdkObject(cdkObject), DashPackageProperty {
      /**
       * A list of DASH manifest configurations that are available from this endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html#cfn-mediapackage-packagingconfiguration-dashpackage-dashmanifests)
       */
      override fun dashManifests(): Any = unwrap(this).getDashManifests()

      /**
       * Parameters for encrypting content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html#cfn-mediapackage-packagingconfiguration-dashpackage-encryption)
       */
      override fun encryption(): Any? = unwrap(this).getEncryption()

      /**
       * When includeEncoderConfigurationInSegments is set to true, AWS Elemental MediaPackage
       * places your encoder's Sequence Parameter Set (SPS), Picture Parameter Set (PPS), and Video
       * Parameter Set (VPS) metadata in every video segment instead of in the init fragment.
       *
       * This lets you use different SPS/PPS/VPS settings for your assets during content playback.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html#cfn-mediapackage-packagingconfiguration-dashpackage-includeencoderconfigurationinsegments)
       */
      override fun includeEncoderConfigurationInSegments(): Any? =
          unwrap(this).getIncludeEncoderConfigurationInSegments()

      /**
       * This applies only to stream sets with a single video track.
       *
       * When true, the stream set includes an additional I-frame trick-play only stream, along with
       * the other tracks. If false, this extra stream is not included.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html#cfn-mediapackage-packagingconfiguration-dashpackage-includeiframeonlystream)
       */
      override fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

      /**
       * Controls whether AWS Elemental MediaPackage produces single-period or multi-period DASH
       * manifests.
       *
       * For more information about periods, see [Multi-period DASH in AWS Elemental
       * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/multi-period.html) .
       *
       * Valid values:
       *
       * * `ADS` - AWS Elemental MediaPackage will produce multi-period DASH manifests. Periods are
       * created based on the SCTE-35 ad markers present in the input manifest.
       * * *No value* - AWS Elemental MediaPackage will produce single-period DASH manifests. This
       * is the default setting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html#cfn-mediapackage-packagingconfiguration-dashpackage-periodtriggers)
       */
      override fun periodTriggers(): List<String> = unwrap(this).getPeriodTriggers() ?: emptyList()

      /**
       * Duration (in seconds) of each fragment.
       *
       * Actual fragments are rounded to the nearest multiple of the source segment duration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html#cfn-mediapackage-packagingconfiguration-dashpackage-segmentdurationseconds)
       */
      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

      /**
       * Determines the type of SegmentTemplate included in the Media Presentation Description
       * (MPD).
       *
       * When set to `NUMBER_WITH_TIMELINE` , a full timeline is presented in each SegmentTemplate,
       * with $Number$ media URLs. When set to `TIME_WITH_TIMELINE` , a full timeline is presented in
       * each SegmentTemplate, with $Time$ media URLs. When set to `NUMBER_WITH_DURATION` , only a
       * duration is included in each SegmentTemplate, with $Number$ media URLs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html#cfn-mediapackage-packagingconfiguration-dashpackage-segmenttemplateformat)
       */
      override fun segmentTemplateFormat(): String? = unwrap(this).getSegmentTemplateFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DashPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty):
          DashPackageProperty = CdkObjectWrappers.wrap(cdkObject) as? DashPackageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashPackageProperty
    }
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * DashEncryptionProperty dashEncryptionProperty = DashEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashencryption.html)
   */
  public interface DashEncryptionProperty {
    /**
     * Parameters for the SPEKE key provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashencryption.html#cfn-mediapackage-packagingconfiguration-dashencryption-spekekeyprovider)
     */
    public fun spekeKeyProvider(): Any

    /**
     * A builder for [DashEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f71acb67a6c390974394d1529efac75681df0fbc7765e981bf292f492ab6527a")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashEncryptionProperty.builder()

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f71acb67a6c390974394d1529efac75681df0fbc7765e981bf292f492ab6527a")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashEncryptionProperty,
    ) : CdkObject(cdkObject), DashEncryptionProperty {
      /**
       * Parameters for the SPEKE key provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashencryption.html#cfn-mediapackage-packagingconfiguration-dashencryption-spekekeyprovider)
       */
      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DashEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashEncryptionProperty):
          DashEncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as? DashEncryptionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashEncryptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashEncryptionProperty
    }
  }

  /**
   * Limitations for outputs from the endpoint, based on the video bitrate.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * StreamSelectionProperty streamSelectionProperty = StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-streamselection.html)
   */
  public interface StreamSelectionProperty {
    /**
     * The upper limit of the bitrates that this endpoint serves.
     *
     * If the video track exceeds this threshold, then AWS Elemental MediaPackage excludes it from
     * output. If you don't specify a value, it defaults to 2147483647 bits per second.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-streamselection.html#cfn-mediapackage-packagingconfiguration-streamselection-maxvideobitspersecond)
     */
    public fun maxVideoBitsPerSecond(): Number? = unwrap(this).getMaxVideoBitsPerSecond()

    /**
     * The lower limit of the bitrates that this endpoint serves.
     *
     * If the video track is below this threshold, then AWS Elemental MediaPackage excludes it from
     * output. If you don't specify a value, it defaults to 0 bits per second.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-streamselection.html#cfn-mediapackage-packagingconfiguration-streamselection-minvideobitspersecond)
     */
    public fun minVideoBitsPerSecond(): Number? = unwrap(this).getMinVideoBitsPerSecond()

    /**
     * Order in which the different video bitrates are presented to the player.
     *
     * Valid values: `ORIGINAL` , `VIDEO_BITRATE_ASCENDING` , `VIDEO_BITRATE_DESCENDING` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-streamselection.html#cfn-mediapackage-packagingconfiguration-streamselection-streamorder)
     */
    public fun streamOrder(): String? = unwrap(this).getStreamOrder()

    /**
     * A builder for [StreamSelectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxVideoBitsPerSecond The upper limit of the bitrates that this endpoint serves.
       * If the video track exceeds this threshold, then AWS Elemental MediaPackage excludes it from
       * output. If you don't specify a value, it defaults to 2147483647 bits per second.
       */
      public fun maxVideoBitsPerSecond(maxVideoBitsPerSecond: Number)

      /**
       * @param minVideoBitsPerSecond The lower limit of the bitrates that this endpoint serves.
       * If the video track is below this threshold, then AWS Elemental MediaPackage excludes it
       * from output. If you don't specify a value, it defaults to 0 bits per second.
       */
      public fun minVideoBitsPerSecond(minVideoBitsPerSecond: Number)

      /**
       * @param streamOrder Order in which the different video bitrates are presented to the player.
       * Valid values: `ORIGINAL` , `VIDEO_BITRATE_ASCENDING` , `VIDEO_BITRATE_DESCENDING` .
       */
      public fun streamOrder(streamOrder: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty.builder()

      /**
       * @param maxVideoBitsPerSecond The upper limit of the bitrates that this endpoint serves.
       * If the video track exceeds this threshold, then AWS Elemental MediaPackage excludes it from
       * output. If you don't specify a value, it defaults to 2147483647 bits per second.
       */
      override fun maxVideoBitsPerSecond(maxVideoBitsPerSecond: Number) {
        cdkBuilder.maxVideoBitsPerSecond(maxVideoBitsPerSecond)
      }

      /**
       * @param minVideoBitsPerSecond The lower limit of the bitrates that this endpoint serves.
       * If the video track is below this threshold, then AWS Elemental MediaPackage excludes it
       * from output. If you don't specify a value, it defaults to 0 bits per second.
       */
      override fun minVideoBitsPerSecond(minVideoBitsPerSecond: Number) {
        cdkBuilder.minVideoBitsPerSecond(minVideoBitsPerSecond)
      }

      /**
       * @param streamOrder Order in which the different video bitrates are presented to the player.
       * Valid values: `ORIGINAL` , `VIDEO_BITRATE_ASCENDING` , `VIDEO_BITRATE_DESCENDING` .
       */
      override fun streamOrder(streamOrder: String) {
        cdkBuilder.streamOrder(streamOrder)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty,
    ) : CdkObject(cdkObject), StreamSelectionProperty {
      /**
       * The upper limit of the bitrates that this endpoint serves.
       *
       * If the video track exceeds this threshold, then AWS Elemental MediaPackage excludes it from
       * output. If you don't specify a value, it defaults to 2147483647 bits per second.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-streamselection.html#cfn-mediapackage-packagingconfiguration-streamselection-maxvideobitspersecond)
       */
      override fun maxVideoBitsPerSecond(): Number? = unwrap(this).getMaxVideoBitsPerSecond()

      /**
       * The lower limit of the bitrates that this endpoint serves.
       *
       * If the video track is below this threshold, then AWS Elemental MediaPackage excludes it
       * from output. If you don't specify a value, it defaults to 0 bits per second.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-streamselection.html#cfn-mediapackage-packagingconfiguration-streamselection-minvideobitspersecond)
       */
      override fun minVideoBitsPerSecond(): Number? = unwrap(this).getMinVideoBitsPerSecond()

      /**
       * Order in which the different video bitrates are presented to the player.
       *
       * Valid values: `ORIGINAL` , `VIDEO_BITRATE_ASCENDING` , `VIDEO_BITRATE_DESCENDING` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-streamselection.html#cfn-mediapackage-packagingconfiguration-streamselection-streamorder)
       */
      override fun streamOrder(): String? = unwrap(this).getStreamOrder()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StreamSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty):
          StreamSelectionProperty = CdkObjectWrappers.wrap(cdkObject) as? StreamSelectionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StreamSelectionProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.StreamSelectionProperty
    }
  }

  /**
   * Parameters for a packaging configuration that uses Microsoft Smooth Streaming (MSS) packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * MssPackageProperty mssPackageProperty = MssPackageProperty.builder()
   * .mssManifests(List.of(MssManifestProperty.builder()
   * .manifestName("manifestName")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(MssEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build())
   * .segmentDurationSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-msspackage.html)
   */
  public interface MssPackageProperty {
    /**
     * Parameters for encrypting content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-msspackage.html#cfn-mediapackage-packagingconfiguration-msspackage-encryption)
     */
    public fun encryption(): Any? = unwrap(this).getEncryption()

    /**
     * A list of Microsoft Smooth manifest configurations that are available from this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-msspackage.html#cfn-mediapackage-packagingconfiguration-msspackage-mssmanifests)
     */
    public fun mssManifests(): Any

    /**
     * Duration (in seconds) of each fragment.
     *
     * Actual fragments are rounded to the nearest multiple of the source fragment duration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-msspackage.html#cfn-mediapackage-packagingconfiguration-msspackage-segmentdurationseconds)
     */
    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    /**
     * A builder for [MssPackageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: IResolvable)

      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: MssEncryptionProperty)

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f9e6b37a79b75f097ddcc69264afb4d7fb123925c41020613b92e5ced4a3406")
      public fun encryption(encryption: MssEncryptionProperty.Builder.() -> Unit)

      /**
       * @param mssManifests A list of Microsoft Smooth manifest configurations that are available
       * from this endpoint. 
       */
      public fun mssManifests(mssManifests: IResolvable)

      /**
       * @param mssManifests A list of Microsoft Smooth manifest configurations that are available
       * from this endpoint. 
       */
      public fun mssManifests(mssManifests: List<Any>)

      /**
       * @param mssManifests A list of Microsoft Smooth manifest configurations that are available
       * from this endpoint. 
       */
      public fun mssManifests(vararg mssManifests: Any)

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each fragment.
       * Actual fragments are rounded to the nearest multiple of the source fragment duration.
       */
      public fun segmentDurationSeconds(segmentDurationSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty.builder()

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: MssEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(MssEncryptionProperty::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5f9e6b37a79b75f097ddcc69264afb4d7fb123925c41020613b92e5ced4a3406")
      override fun encryption(encryption: MssEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(MssEncryptionProperty(encryption))

      /**
       * @param mssManifests A list of Microsoft Smooth manifest configurations that are available
       * from this endpoint. 
       */
      override fun mssManifests(mssManifests: IResolvable) {
        cdkBuilder.mssManifests(mssManifests.let(IResolvable::unwrap))
      }

      /**
       * @param mssManifests A list of Microsoft Smooth manifest configurations that are available
       * from this endpoint. 
       */
      override fun mssManifests(mssManifests: List<Any>) {
        cdkBuilder.mssManifests(mssManifests)
      }

      /**
       * @param mssManifests A list of Microsoft Smooth manifest configurations that are available
       * from this endpoint. 
       */
      override fun mssManifests(vararg mssManifests: Any): Unit =
          mssManifests(mssManifests.toList())

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each fragment.
       * Actual fragments are rounded to the nearest multiple of the source fragment duration.
       */
      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty,
    ) : CdkObject(cdkObject), MssPackageProperty {
      /**
       * Parameters for encrypting content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-msspackage.html#cfn-mediapackage-packagingconfiguration-msspackage-encryption)
       */
      override fun encryption(): Any? = unwrap(this).getEncryption()

      /**
       * A list of Microsoft Smooth manifest configurations that are available from this endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-msspackage.html#cfn-mediapackage-packagingconfiguration-msspackage-mssmanifests)
       */
      override fun mssManifests(): Any = unwrap(this).getMssManifests()

      /**
       * Duration (in seconds) of each fragment.
       *
       * Actual fragments are rounded to the nearest multiple of the source fragment duration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-msspackage.html#cfn-mediapackage-packagingconfiguration-msspackage-segmentdurationseconds)
       */
      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MssPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty):
          MssPackageProperty = CdkObjectWrappers.wrap(cdkObject) as? MssPackageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MssPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssPackageProperty
    }
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * HlsEncryptionProperty hlsEncryptionProperty = HlsEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .constantInitializationVector("constantInitializationVector")
   * .encryptionMethod("encryptionMethod")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsencryption.html)
   */
  public interface HlsEncryptionProperty {
    /**
     * A 128-bit, 16-byte hex value represented by a 32-character string, used with the key for
     * encrypting blocks.
     *
     * If you don't specify a constant initialization vector (IV), AWS Elemental MediaPackage
     * periodically rotates the IV.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsencryption.html#cfn-mediapackage-packagingconfiguration-hlsencryption-constantinitializationvector)
     */
    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    /**
     * HLS encryption type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsencryption.html#cfn-mediapackage-packagingconfiguration-hlsencryption-encryptionmethod)
     */
    public fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

    /**
     * Parameters for the SPEKE key provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsencryption.html#cfn-mediapackage-packagingconfiguration-hlsencryption-spekekeyprovider)
     */
    public fun spekeKeyProvider(): Any

    /**
     * A builder for [HlsEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a
       * 32-character string, used with the key for encrypting blocks.
       * If you don't specify a constant initialization vector (IV), AWS Elemental MediaPackage
       * periodically rotates the IV.
       */
      public fun constantInitializationVector(constantInitializationVector: String)

      /**
       * @param encryptionMethod HLS encryption type.
       */
      public fun encryptionMethod(encryptionMethod: String)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d99db2d7e210d25c3acbbe7a79f2f0b396bb312141d40882d12cf86670e468ac")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty.builder()

      /**
       * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a
       * 32-character string, used with the key for encrypting blocks.
       * If you don't specify a constant initialization vector (IV), AWS Elemental MediaPackage
       * periodically rotates the IV.
       */
      override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      /**
       * @param encryptionMethod HLS encryption type.
       */
      override fun encryptionMethod(encryptionMethod: String) {
        cdkBuilder.encryptionMethod(encryptionMethod)
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d99db2d7e210d25c3acbbe7a79f2f0b396bb312141d40882d12cf86670e468ac")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty,
    ) : CdkObject(cdkObject), HlsEncryptionProperty {
      /**
       * A 128-bit, 16-byte hex value represented by a 32-character string, used with the key for
       * encrypting blocks.
       *
       * If you don't specify a constant initialization vector (IV), AWS Elemental MediaPackage
       * periodically rotates the IV.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsencryption.html#cfn-mediapackage-packagingconfiguration-hlsencryption-constantinitializationvector)
       */
      override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      /**
       * HLS encryption type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsencryption.html#cfn-mediapackage-packagingconfiguration-hlsencryption-encryptionmethod)
       */
      override fun encryptionMethod(): String? = unwrap(this).getEncryptionMethod()

      /**
       * Parameters for the SPEKE key provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsencryption.html#cfn-mediapackage-packagingconfiguration-hlsencryption-spekekeyprovider)
       */
      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty):
          HlsEncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as? HlsEncryptionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsEncryptionProperty
    }
  }

  /**
   * Parameters for an HLS manifest.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * HlsManifestProperty hlsManifestProperty = HlsManifestProperty.builder()
   * .adMarkers("adMarkers")
   * .includeIframeOnlyStream(false)
   * .manifestName("manifestName")
   * .programDateTimeIntervalSeconds(123)
   * .repeatExtXKey(false)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsmanifest.html)
   */
  public interface HlsManifestProperty {
    /**
     * This setting controls ad markers in the packaged content.
     *
     * Valid values:
     *
     * * `NONE` - Omits all SCTE-35 ad markers from the output.
     * * `PASSTHROUGH` - Creates a copy in the output of the SCTE-35 ad markers (comments) taken
     * directly from the input manifest.
     * * `SCTE35_ENHANCED` - Generates ad markers and blackout tags in the output based on the
     * SCTE-35 messages from the input manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsmanifest.html#cfn-mediapackage-packagingconfiguration-hlsmanifest-admarkers)
     */
    public fun adMarkers(): String? = unwrap(this).getAdMarkers()

    /**
     * Applies to stream sets with a single video track only.
     *
     * When enabled, the output includes an additional I-frame only stream, along with the other
     * tracks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsmanifest.html#cfn-mediapackage-packagingconfiguration-hlsmanifest-includeiframeonlystream)
     */
    public fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

    /**
     * A short string that's appended to the end of the endpoint URL to create a unique path to this
     * packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsmanifest.html#cfn-mediapackage-packagingconfiguration-hlsmanifest-manifestname)
     */
    public fun manifestName(): String? = unwrap(this).getManifestName()

    /**
     * Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output manifest at the interval that you
     * specify.
     *
     * Additionally, ID3Timed metadata messages are generated every 5 seconds starting when the
     * content was ingested.
     *
     * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed
     * through to the HLS output.
     *
     * Omit this attribute or enter `0` to indicate that the `EXT-X-PROGRAM-DATE-TIME` tags are not
     * included in the manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsmanifest.html#cfn-mediapackage-packagingconfiguration-hlsmanifest-programdatetimeintervalseconds)
     */
    public fun programDateTimeIntervalSeconds(): Number? =
        unwrap(this).getProgramDateTimeIntervalSeconds()

    /**
     * Repeat the `EXT-X-KEY` directive for every media segment.
     *
     * This might result in an increase in client requests to the DRM server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsmanifest.html#cfn-mediapackage-packagingconfiguration-hlsmanifest-repeatextxkey)
     */
    public fun repeatExtXKey(): Any? = unwrap(this).getRepeatExtXKey()

    /**
     * Video bitrate limitations for outputs from this packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsmanifest.html#cfn-mediapackage-packagingconfiguration-hlsmanifest-streamselection)
     */
    public fun streamSelection(): Any? = unwrap(this).getStreamSelection()

    /**
     * A builder for [HlsManifestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adMarkers This setting controls ad markers in the packaged content.
       * Valid values:
       *
       * * `NONE` - Omits all SCTE-35 ad markers from the output.
       * * `PASSTHROUGH` - Creates a copy in the output of the SCTE-35 ad markers (comments) taken
       * directly from the input manifest.
       * * `SCTE35_ENHANCED` - Generates ad markers and blackout tags in the output based on the
       * SCTE-35 messages from the input manifest.
       */
      public fun adMarkers(adMarkers: String)

      /**
       * @param includeIframeOnlyStream Applies to stream sets with a single video track only.
       * When enabled, the output includes an additional I-frame only stream, along with the other
       * tracks.
       */
      public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean)

      /**
       * @param includeIframeOnlyStream Applies to stream sets with a single video track only.
       * When enabled, the output includes an additional I-frame only stream, along with the other
       * tracks.
       */
      public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable)

      /**
       * @param manifestName A short string that's appended to the end of the endpoint URL to create
       * a unique path to this packaging configuration.
       */
      public fun manifestName(manifestName: String)

      /**
       * @param programDateTimeIntervalSeconds Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output
       * manifest at the interval that you specify.
       * Additionally, ID3Timed metadata messages are generated every 5 seconds starting when the
       * content was ingested.
       *
       * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed
       * through to the HLS output.
       *
       * Omit this attribute or enter `0` to indicate that the `EXT-X-PROGRAM-DATE-TIME` tags are
       * not included in the manifest.
       */
      public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number)

      /**
       * @param repeatExtXKey Repeat the `EXT-X-KEY` directive for every media segment.
       * This might result in an increase in client requests to the DRM server.
       */
      public fun repeatExtXKey(repeatExtXKey: Boolean)

      /**
       * @param repeatExtXKey Repeat the `EXT-X-KEY` directive for every media segment.
       * This might result in an increase in client requests to the DRM server.
       */
      public fun repeatExtXKey(repeatExtXKey: IResolvable)

      /**
       * @param streamSelection Video bitrate limitations for outputs from this packaging
       * configuration.
       */
      public fun streamSelection(streamSelection: IResolvable)

      /**
       * @param streamSelection Video bitrate limitations for outputs from this packaging
       * configuration.
       */
      public fun streamSelection(streamSelection: StreamSelectionProperty)

      /**
       * @param streamSelection Video bitrate limitations for outputs from this packaging
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5423d98286d792acaf6af6c310486c0d09986786ce611d9d72b1ccff1af2a3a")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsManifestProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsManifestProperty.builder()

      /**
       * @param adMarkers This setting controls ad markers in the packaged content.
       * Valid values:
       *
       * * `NONE` - Omits all SCTE-35 ad markers from the output.
       * * `PASSTHROUGH` - Creates a copy in the output of the SCTE-35 ad markers (comments) taken
       * directly from the input manifest.
       * * `SCTE35_ENHANCED` - Generates ad markers and blackout tags in the output based on the
       * SCTE-35 messages from the input manifest.
       */
      override fun adMarkers(adMarkers: String) {
        cdkBuilder.adMarkers(adMarkers)
      }

      /**
       * @param includeIframeOnlyStream Applies to stream sets with a single video track only.
       * When enabled, the output includes an additional I-frame only stream, along with the other
       * tracks.
       */
      override fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
      }

      /**
       * @param includeIframeOnlyStream Applies to stream sets with a single video track only.
       * When enabled, the output includes an additional I-frame only stream, along with the other
       * tracks.
       */
      override fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream.let(IResolvable::unwrap))
      }

      /**
       * @param manifestName A short string that's appended to the end of the endpoint URL to create
       * a unique path to this packaging configuration.
       */
      override fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
      }

      /**
       * @param programDateTimeIntervalSeconds Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output
       * manifest at the interval that you specify.
       * Additionally, ID3Timed metadata messages are generated every 5 seconds starting when the
       * content was ingested.
       *
       * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed
       * through to the HLS output.
       *
       * Omit this attribute or enter `0` to indicate that the `EXT-X-PROGRAM-DATE-TIME` tags are
       * not included in the manifest.
       */
      override fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
      }

      /**
       * @param repeatExtXKey Repeat the `EXT-X-KEY` directive for every media segment.
       * This might result in an increase in client requests to the DRM server.
       */
      override fun repeatExtXKey(repeatExtXKey: Boolean) {
        cdkBuilder.repeatExtXKey(repeatExtXKey)
      }

      /**
       * @param repeatExtXKey Repeat the `EXT-X-KEY` directive for every media segment.
       * This might result in an increase in client requests to the DRM server.
       */
      override fun repeatExtXKey(repeatExtXKey: IResolvable) {
        cdkBuilder.repeatExtXKey(repeatExtXKey.let(IResolvable::unwrap))
      }

      /**
       * @param streamSelection Video bitrate limitations for outputs from this packaging
       * configuration.
       */
      override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      /**
       * @param streamSelection Video bitrate limitations for outputs from this packaging
       * configuration.
       */
      override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      /**
       * @param streamSelection Video bitrate limitations for outputs from this packaging
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f5423d98286d792acaf6af6c310486c0d09986786ce611d9d72b1ccff1af2a3a")
      override fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit):
          Unit = streamSelection(StreamSelectionProperty(streamSelection))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsManifestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsManifestProperty,
    ) : CdkObject(cdkObject), HlsManifestProperty {
      /**
       * This setting controls ad markers in the packaged content.
       *
       * Valid values:
       *
       * * `NONE` - Omits all SCTE-35 ad markers from the output.
       * * `PASSTHROUGH` - Creates a copy in the output of the SCTE-35 ad markers (comments) taken
       * directly from the input manifest.
       * * `SCTE35_ENHANCED` - Generates ad markers and blackout tags in the output based on the
       * SCTE-35 messages from the input manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsmanifest.html#cfn-mediapackage-packagingconfiguration-hlsmanifest-admarkers)
       */
      override fun adMarkers(): String? = unwrap(this).getAdMarkers()

      /**
       * Applies to stream sets with a single video track only.
       *
       * When enabled, the output includes an additional I-frame only stream, along with the other
       * tracks.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsmanifest.html#cfn-mediapackage-packagingconfiguration-hlsmanifest-includeiframeonlystream)
       */
      override fun includeIframeOnlyStream(): Any? = unwrap(this).getIncludeIframeOnlyStream()

      /**
       * A short string that's appended to the end of the endpoint URL to create a unique path to
       * this packaging configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsmanifest.html#cfn-mediapackage-packagingconfiguration-hlsmanifest-manifestname)
       */
      override fun manifestName(): String? = unwrap(this).getManifestName()

      /**
       * Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output manifest at the interval that you
       * specify.
       *
       * Additionally, ID3Timed metadata messages are generated every 5 seconds starting when the
       * content was ingested.
       *
       * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed
       * through to the HLS output.
       *
       * Omit this attribute or enter `0` to indicate that the `EXT-X-PROGRAM-DATE-TIME` tags are
       * not included in the manifest.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsmanifest.html#cfn-mediapackage-packagingconfiguration-hlsmanifest-programdatetimeintervalseconds)
       */
      override fun programDateTimeIntervalSeconds(): Number? =
          unwrap(this).getProgramDateTimeIntervalSeconds()

      /**
       * Repeat the `EXT-X-KEY` directive for every media segment.
       *
       * This might result in an increase in client requests to the DRM server.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsmanifest.html#cfn-mediapackage-packagingconfiguration-hlsmanifest-repeatextxkey)
       */
      override fun repeatExtXKey(): Any? = unwrap(this).getRepeatExtXKey()

      /**
       * Video bitrate limitations for outputs from this packaging configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlsmanifest.html#cfn-mediapackage-packagingconfiguration-hlsmanifest-streamselection)
       */
      override fun streamSelection(): Any? = unwrap(this).getStreamSelection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsManifestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsManifestProperty):
          HlsManifestProperty = CdkObjectWrappers.wrap(cdkObject) as? HlsManifestProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsManifestProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsManifestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsManifestProperty
    }
  }

  /**
   * Parameters for a DASH manifest.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * DashManifestProperty dashManifestProperty = DashManifestProperty.builder()
   * .manifestLayout("manifestLayout")
   * .manifestName("manifestName")
   * .minBufferTimeSeconds(123)
   * .profile("profile")
   * .scteMarkersSource("scteMarkersSource")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashmanifest.html)
   */
  public interface DashManifestProperty {
    /**
     * Determines the position of some tags in the Media Presentation Description (MPD).
     *
     * When set to `FULL` , elements like `SegmentTemplate` and `ContentProtection` are included in
     * each `Representation` . When set to `COMPACT` , duplicate elements are combined and presented at
     * the AdaptationSet level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashmanifest.html#cfn-mediapackage-packagingconfiguration-dashmanifest-manifestlayout)
     */
    public fun manifestLayout(): String? = unwrap(this).getManifestLayout()

    /**
     * A short string that's appended to the end of the endpoint URL to create a unique path to this
     * packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashmanifest.html#cfn-mediapackage-packagingconfiguration-dashmanifest-manifestname)
     */
    public fun manifestName(): String? = unwrap(this).getManifestName()

    /**
     * Minimum amount of content (measured in seconds) that a player must keep available in the
     * buffer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashmanifest.html#cfn-mediapackage-packagingconfiguration-dashmanifest-minbuffertimeseconds)
     */
    public fun minBufferTimeSeconds(): Number? = unwrap(this).getMinBufferTimeSeconds()

    /**
     * The DASH profile type.
     *
     * When set to `HBBTV_1_5` , the content is compliant with HbbTV 1.5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashmanifest.html#cfn-mediapackage-packagingconfiguration-dashmanifest-profile)
     */
    public fun profile(): String? = unwrap(this).getProfile()

    /**
     * The source of scte markers used.
     *
     * Value description:
     *
     * * `SEGMENTS` - The scte markers are sourced from the segments of the ingested content.
     * * `MANIFEST` - the scte markers are sourced from the manifest of the ingested content. The
     * MANIFEST value is compatible with source HLS playlists using the SCTE-35 Enhanced syntax (
     * `EXT-OATCLS-SCTE35` tags). SCTE-35 Elemental and SCTE-35 Daterange syntaxes are not supported
     * with this option.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashmanifest.html#cfn-mediapackage-packagingconfiguration-dashmanifest-sctemarkerssource)
     */
    public fun scteMarkersSource(): String? = unwrap(this).getScteMarkersSource()

    /**
     * Limitations for outputs from the endpoint, based on the video bitrate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashmanifest.html#cfn-mediapackage-packagingconfiguration-dashmanifest-streamselection)
     */
    public fun streamSelection(): Any? = unwrap(this).getStreamSelection()

    /**
     * A builder for [DashManifestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param manifestLayout Determines the position of some tags in the Media Presentation
       * Description (MPD).
       * When set to `FULL` , elements like `SegmentTemplate` and `ContentProtection` are included
       * in each `Representation` . When set to `COMPACT` , duplicate elements are combined and
       * presented at the AdaptationSet level.
       */
      public fun manifestLayout(manifestLayout: String)

      /**
       * @param manifestName A short string that's appended to the end of the endpoint URL to create
       * a unique path to this packaging configuration.
       */
      public fun manifestName(manifestName: String)

      /**
       * @param minBufferTimeSeconds Minimum amount of content (measured in seconds) that a player
       * must keep available in the buffer.
       */
      public fun minBufferTimeSeconds(minBufferTimeSeconds: Number)

      /**
       * @param profile The DASH profile type.
       * When set to `HBBTV_1_5` , the content is compliant with HbbTV 1.5.
       */
      public fun profile(profile: String)

      /**
       * @param scteMarkersSource The source of scte markers used.
       * Value description:
       *
       * * `SEGMENTS` - The scte markers are sourced from the segments of the ingested content.
       * * `MANIFEST` - the scte markers are sourced from the manifest of the ingested content. The
       * MANIFEST value is compatible with source HLS playlists using the SCTE-35 Enhanced syntax (
       * `EXT-OATCLS-SCTE35` tags). SCTE-35 Elemental and SCTE-35 Daterange syntaxes are not supported
       * with this option.
       */
      public fun scteMarkersSource(scteMarkersSource: String)

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      public fun streamSelection(streamSelection: IResolvable)

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      public fun streamSelection(streamSelection: StreamSelectionProperty)

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88f80b902f77cd6785cc6082f0110d0d285608901dedbd1cc0b33e23ca7c8f0f")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashManifestProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashManifestProperty.builder()

      /**
       * @param manifestLayout Determines the position of some tags in the Media Presentation
       * Description (MPD).
       * When set to `FULL` , elements like `SegmentTemplate` and `ContentProtection` are included
       * in each `Representation` . When set to `COMPACT` , duplicate elements are combined and
       * presented at the AdaptationSet level.
       */
      override fun manifestLayout(manifestLayout: String) {
        cdkBuilder.manifestLayout(manifestLayout)
      }

      /**
       * @param manifestName A short string that's appended to the end of the endpoint URL to create
       * a unique path to this packaging configuration.
       */
      override fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
      }

      /**
       * @param minBufferTimeSeconds Minimum amount of content (measured in seconds) that a player
       * must keep available in the buffer.
       */
      override fun minBufferTimeSeconds(minBufferTimeSeconds: Number) {
        cdkBuilder.minBufferTimeSeconds(minBufferTimeSeconds)
      }

      /**
       * @param profile The DASH profile type.
       * When set to `HBBTV_1_5` , the content is compliant with HbbTV 1.5.
       */
      override fun profile(profile: String) {
        cdkBuilder.profile(profile)
      }

      /**
       * @param scteMarkersSource The source of scte markers used.
       * Value description:
       *
       * * `SEGMENTS` - The scte markers are sourced from the segments of the ingested content.
       * * `MANIFEST` - the scte markers are sourced from the manifest of the ingested content. The
       * MANIFEST value is compatible with source HLS playlists using the SCTE-35 Enhanced syntax (
       * `EXT-OATCLS-SCTE35` tags). SCTE-35 Elemental and SCTE-35 Daterange syntaxes are not supported
       * with this option.
       */
      override fun scteMarkersSource(scteMarkersSource: String) {
        cdkBuilder.scteMarkersSource(scteMarkersSource)
      }

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      /**
       * @param streamSelection Limitations for outputs from the endpoint, based on the video
       * bitrate.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88f80b902f77cd6785cc6082f0110d0d285608901dedbd1cc0b33e23ca7c8f0f")
      override fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit):
          Unit = streamSelection(StreamSelectionProperty(streamSelection))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashManifestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashManifestProperty,
    ) : CdkObject(cdkObject), DashManifestProperty {
      /**
       * Determines the position of some tags in the Media Presentation Description (MPD).
       *
       * When set to `FULL` , elements like `SegmentTemplate` and `ContentProtection` are included
       * in each `Representation` . When set to `COMPACT` , duplicate elements are combined and
       * presented at the AdaptationSet level.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashmanifest.html#cfn-mediapackage-packagingconfiguration-dashmanifest-manifestlayout)
       */
      override fun manifestLayout(): String? = unwrap(this).getManifestLayout()

      /**
       * A short string that's appended to the end of the endpoint URL to create a unique path to
       * this packaging configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashmanifest.html#cfn-mediapackage-packagingconfiguration-dashmanifest-manifestname)
       */
      override fun manifestName(): String? = unwrap(this).getManifestName()

      /**
       * Minimum amount of content (measured in seconds) that a player must keep available in the
       * buffer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashmanifest.html#cfn-mediapackage-packagingconfiguration-dashmanifest-minbuffertimeseconds)
       */
      override fun minBufferTimeSeconds(): Number? = unwrap(this).getMinBufferTimeSeconds()

      /**
       * The DASH profile type.
       *
       * When set to `HBBTV_1_5` , the content is compliant with HbbTV 1.5.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashmanifest.html#cfn-mediapackage-packagingconfiguration-dashmanifest-profile)
       */
      override fun profile(): String? = unwrap(this).getProfile()

      /**
       * The source of scte markers used.
       *
       * Value description:
       *
       * * `SEGMENTS` - The scte markers are sourced from the segments of the ingested content.
       * * `MANIFEST` - the scte markers are sourced from the manifest of the ingested content. The
       * MANIFEST value is compatible with source HLS playlists using the SCTE-35 Enhanced syntax (
       * `EXT-OATCLS-SCTE35` tags). SCTE-35 Elemental and SCTE-35 Daterange syntaxes are not supported
       * with this option.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashmanifest.html#cfn-mediapackage-packagingconfiguration-dashmanifest-sctemarkerssource)
       */
      override fun scteMarkersSource(): String? = unwrap(this).getScteMarkersSource()

      /**
       * Limitations for outputs from the endpoint, based on the video bitrate.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashmanifest.html#cfn-mediapackage-packagingconfiguration-dashmanifest-streamselection)
       */
      override fun streamSelection(): Any? = unwrap(this).getStreamSelection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DashManifestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashManifestProperty):
          DashManifestProperty = CdkObjectWrappers.wrap(cdkObject) as? DashManifestProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashManifestProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashManifestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.DashManifestProperty
    }
  }

  /**
   * A configuration for accessing an external Secure Packager and Encoder Key Exchange (SPEKE)
   * service that provides encryption keys.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * SpekeKeyProviderProperty spekeKeyProviderProperty = SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-spekekeyprovider.html)
   */
  public interface SpekeKeyProviderProperty {
    /**
     * Use `encryptionContractConfiguration` to configure one or more content encryption keys for
     * your endpoints that use SPEKE Version 2.0. The encryption contract defines which content keys
     * are used to encrypt the audio and video tracks in your stream. To configure the encryption
     * contract, specify which audio and video encryption presets to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-spekekeyprovider.html#cfn-mediapackage-packagingconfiguration-spekekeyprovider-encryptioncontractconfiguration)
     */
    public fun encryptionContractConfiguration(): Any? =
        unwrap(this).getEncryptionContractConfiguration()

    /**
     * The ARN for the IAM role that's granted by the key provider to provide access to the key
     * provider API.
     *
     * Valid format: arn:aws:iam::{accountID}:role/{name}
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-spekekeyprovider.html#cfn-mediapackage-packagingconfiguration-spekekeyprovider-rolearn)
     */
    public fun roleArn(): String

    /**
     * List of unique identifiers for the DRM systems to use, as defined in the CPIX specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-spekekeyprovider.html#cfn-mediapackage-packagingconfiguration-spekekeyprovider-systemids)
     */
    public fun systemIds(): List<String>

    /**
     * URL for the key provider's key retrieval API endpoint.
     *
     * Must start with https://.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-spekekeyprovider.html#cfn-mediapackage-packagingconfiguration-spekekeyprovider-url)
     */
    public fun url(): String

    /**
     * A builder for [SpekeKeyProviderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryptionContractConfiguration Use `encryptionContractConfiguration` to configure
       * one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
       * encryption contract defines which content keys are used to encrypt the audio and video tracks
       * in your stream. To configure the encryption contract, specify which audio and video encryption
       * presets to use.
       */
      public fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable)

      /**
       * @param encryptionContractConfiguration Use `encryptionContractConfiguration` to configure
       * one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
       * encryption contract defines which content keys are used to encrypt the audio and video tracks
       * in your stream. To configure the encryption contract, specify which audio and video encryption
       * presets to use.
       */
      public
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty)

      /**
       * @param encryptionContractConfiguration Use `encryptionContractConfiguration` to configure
       * one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
       * encryption contract defines which content keys are used to encrypt the audio and video tracks
       * in your stream. To configure the encryption contract, specify which audio and video encryption
       * presets to use.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1cece6a6287095e5b7116dfc977999366ec718dc409e810d2572e22ade2d54f8")
      public
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty.Builder.() -> Unit)

      /**
       * @param roleArn The ARN for the IAM role that's granted by the key provider to provide
       * access to the key provider API. 
       * Valid format: arn:aws:iam::{accountID}:role/{name}
       */
      public fun roleArn(roleArn: String)

      /**
       * @param systemIds List of unique identifiers for the DRM systems to use, as defined in the
       * CPIX specification. 
       */
      public fun systemIds(systemIds: List<String>)

      /**
       * @param systemIds List of unique identifiers for the DRM systems to use, as defined in the
       * CPIX specification. 
       */
      public fun systemIds(vararg systemIds: String)

      /**
       * @param url URL for the key provider's key retrieval API endpoint. 
       * Must start with https://.
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty.builder()

      /**
       * @param encryptionContractConfiguration Use `encryptionContractConfiguration` to configure
       * one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
       * encryption contract defines which content keys are used to encrypt the audio and video tracks
       * in your stream. To configure the encryption contract, specify which audio and video encryption
       * presets to use.
       */
      override fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionContractConfiguration Use `encryptionContractConfiguration` to configure
       * one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
       * encryption contract defines which content keys are used to encrypt the audio and video tracks
       * in your stream. To configure the encryption contract, specify which audio and video encryption
       * presets to use.
       */
      override
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(EncryptionContractConfigurationProperty::unwrap))
      }

      /**
       * @param encryptionContractConfiguration Use `encryptionContractConfiguration` to configure
       * one or more content encryption keys for your endpoints that use SPEKE Version 2.0. The
       * encryption contract defines which content keys are used to encrypt the audio and video tracks
       * in your stream. To configure the encryption contract, specify which audio and video encryption
       * presets to use.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1cece6a6287095e5b7116dfc977999366ec718dc409e810d2572e22ade2d54f8")
      override
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty.Builder.() -> Unit):
          Unit =
          encryptionContractConfiguration(EncryptionContractConfigurationProperty(encryptionContractConfiguration))

      /**
       * @param roleArn The ARN for the IAM role that's granted by the key provider to provide
       * access to the key provider API. 
       * Valid format: arn:aws:iam::{accountID}:role/{name}
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param systemIds List of unique identifiers for the DRM systems to use, as defined in the
       * CPIX specification. 
       */
      override fun systemIds(systemIds: List<String>) {
        cdkBuilder.systemIds(systemIds)
      }

      /**
       * @param systemIds List of unique identifiers for the DRM systems to use, as defined in the
       * CPIX specification. 
       */
      override fun systemIds(vararg systemIds: String): Unit = systemIds(systemIds.toList())

      /**
       * @param url URL for the key provider's key retrieval API endpoint. 
       * Must start with https://.
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty,
    ) : CdkObject(cdkObject), SpekeKeyProviderProperty {
      /**
       * Use `encryptionContractConfiguration` to configure one or more content encryption keys for
       * your endpoints that use SPEKE Version 2.0. The encryption contract defines which content keys
       * are used to encrypt the audio and video tracks in your stream. To configure the encryption
       * contract, specify which audio and video encryption presets to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-spekekeyprovider.html#cfn-mediapackage-packagingconfiguration-spekekeyprovider-encryptioncontractconfiguration)
       */
      override fun encryptionContractConfiguration(): Any? =
          unwrap(this).getEncryptionContractConfiguration()

      /**
       * The ARN for the IAM role that's granted by the key provider to provide access to the key
       * provider API.
       *
       * Valid format: arn:aws:iam::{accountID}:role/{name}
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-spekekeyprovider.html#cfn-mediapackage-packagingconfiguration-spekekeyprovider-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * List of unique identifiers for the DRM systems to use, as defined in the CPIX
       * specification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-spekekeyprovider.html#cfn-mediapackage-packagingconfiguration-spekekeyprovider-systemids)
       */
      override fun systemIds(): List<String> = unwrap(this).getSystemIds()

      /**
       * URL for the key provider's key retrieval API endpoint.
       *
       * Must start with https://.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-spekekeyprovider.html#cfn-mediapackage-packagingconfiguration-spekekeyprovider-url)
       */
      override fun url(): String = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpekeKeyProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty):
          SpekeKeyProviderProperty = CdkObjectWrappers.wrap(cdkObject) as? SpekeKeyProviderProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpekeKeyProviderProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.SpekeKeyProviderProperty
    }
  }

  /**
   * Use `encryptionContractConfiguration` to configure one or more content encryption keys for your
   * endpoints that use SPEKE Version 2.0. The encryption contract defines the content keys used to
   * encrypt the audio and video tracks in your stream. To configure the encryption contract, specify
   * which audio and video encryption presets to use. For more information about these presets, see
   * [SPEKE Version 2.0
   * Presets](https://docs.aws.amazon.com/mediapackage/latest/ug/drm-content-speke-v2-presets.html) .
   *
   * Note the following considerations when using `encryptionContractConfiguration` :
   *
   * * You can use `encryptionContractConfiguration` for DASH endpoints that use SPEKE Version 2.0.
   * SPEKE Version 2.0 relies on the CPIX Version 2.3 specification.
   * * You cannot combine an `UNENCRYPTED` preset with `UNENCRYPTED` or `SHARED` presets across
   * `presetSpeke20Audio` and `presetSpeke20Video` .
   * * When you use a `SHARED` preset, you must use it for both `presetSpeke20Audio` and
   * `presetSpeke20Video` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * EncryptionContractConfigurationProperty encryptionContractConfigurationProperty =
   * EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-encryptioncontractconfiguration.html)
   */
  public interface EncryptionContractConfigurationProperty {
    /**
     * A collection of audio encryption presets.
     *
     * Value description:
     *
     * * `PRESET-AUDIO-1` - Use one content key to encrypt all of the audio tracks in your stream.
     * * `PRESET-AUDIO-2` - Use one content key to encrypt all of the stereo audio tracks and one
     * content key to encrypt all of the multichannel audio tracks.
     * * `PRESET-AUDIO-3` - Use one content key to encrypt all of the stereo audio tracks, one
     * content key to encrypt all of the multichannel audio tracks with 3 to 6 channels, and one
     * content key to encrypt all of the multichannel audio tracks with more than 6 channels.
     * * `SHARED` - Use the same content key for all of the audio and video tracks in your stream.
     * * `UNENCRYPTED` - Don't encrypt any of the audio tracks in your stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-encryptioncontractconfiguration.html#cfn-mediapackage-packagingconfiguration-encryptioncontractconfiguration-presetspeke20audio)
     */
    public fun presetSpeke20Audio(): String

    /**
     * A collection of video encryption presets.
     *
     * Value description:
     *
     * * `PRESET-VIDEO-1` - Use one content key to encrypt all of the video tracks in your stream.
     * * `PRESET-VIDEO-2` - Use one content key to encrypt all of the SD video tracks and one
     * content key for all HD and higher resolutions video tracks.
     * * `PRESET-VIDEO-3` - Use one content key to encrypt all of the SD video tracks, one content
     * key for HD video tracks and one content key for all UHD video tracks.
     * * `PRESET-VIDEO-4` - Use one content key to encrypt all of the SD video tracks, one content
     * key for HD video tracks, one content key for all UHD1 video tracks and one content key for all
     * UHD2 video tracks.
     * * `PRESET-VIDEO-5` - Use one content key to encrypt all of the SD video tracks, one content
     * key for HD1 video tracks, one content key for HD2 video tracks, one content key for all UHD1
     * video tracks and one content key for all UHD2 video tracks.
     * * `PRESET-VIDEO-6` - Use one content key to encrypt all of the SD video tracks, one content
     * key for HD1 video tracks, one content key for HD2 video tracks and one content key for all UHD
     * video tracks.
     * * `PRESET-VIDEO-7` - Use one content key to encrypt all of the SD+HD1 video tracks, one
     * content key for HD2 video tracks and one content key for all UHD video tracks.
     * * `PRESET-VIDEO-8` - Use one content key to encrypt all of the SD+HD1 video tracks, one
     * content key for HD2 video tracks, one content key for all UHD1 video tracks and one content key
     * for all UHD2 video tracks.
     * * `SHARED` - Use the same content key for all of the video and audio tracks in your stream.
     * * `UNENCRYPTED` - Don't encrypt any of the video tracks in your stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-encryptioncontractconfiguration.html#cfn-mediapackage-packagingconfiguration-encryptioncontractconfiguration-presetspeke20video)
     */
    public fun presetSpeke20Video(): String

    /**
     * A builder for [EncryptionContractConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param presetSpeke20Audio A collection of audio encryption presets. 
       * Value description:
       *
       * * `PRESET-AUDIO-1` - Use one content key to encrypt all of the audio tracks in your stream.
       * * `PRESET-AUDIO-2` - Use one content key to encrypt all of the stereo audio tracks and one
       * content key to encrypt all of the multichannel audio tracks.
       * * `PRESET-AUDIO-3` - Use one content key to encrypt all of the stereo audio tracks, one
       * content key to encrypt all of the multichannel audio tracks with 3 to 6 channels, and one
       * content key to encrypt all of the multichannel audio tracks with more than 6 channels.
       * * `SHARED` - Use the same content key for all of the audio and video tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the audio tracks in your stream.
       */
      public fun presetSpeke20Audio(presetSpeke20Audio: String)

      /**
       * @param presetSpeke20Video A collection of video encryption presets. 
       * Value description:
       *
       * * `PRESET-VIDEO-1` - Use one content key to encrypt all of the video tracks in your stream.
       * * `PRESET-VIDEO-2` - Use one content key to encrypt all of the SD video tracks and one
       * content key for all HD and higher resolutions video tracks.
       * * `PRESET-VIDEO-3` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-4` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks, one content key for all UHD1 video tracks and one content key for all
       * UHD2 video tracks.
       * * `PRESET-VIDEO-5` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks, one content key for all UHD1
       * video tracks and one content key for all UHD2 video tracks.
       * * `PRESET-VIDEO-6` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks and one content key for all UHD
       * video tracks.
       * * `PRESET-VIDEO-7` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-8` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks, one content key for all UHD1 video tracks and one content
       * key for all UHD2 video tracks.
       * * `SHARED` - Use the same content key for all of the video and audio tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the video tracks in your stream.
       */
      public fun presetSpeke20Video(presetSpeke20Video: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.EncryptionContractConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.EncryptionContractConfigurationProperty.builder()

      /**
       * @param presetSpeke20Audio A collection of audio encryption presets. 
       * Value description:
       *
       * * `PRESET-AUDIO-1` - Use one content key to encrypt all of the audio tracks in your stream.
       * * `PRESET-AUDIO-2` - Use one content key to encrypt all of the stereo audio tracks and one
       * content key to encrypt all of the multichannel audio tracks.
       * * `PRESET-AUDIO-3` - Use one content key to encrypt all of the stereo audio tracks, one
       * content key to encrypt all of the multichannel audio tracks with 3 to 6 channels, and one
       * content key to encrypt all of the multichannel audio tracks with more than 6 channels.
       * * `SHARED` - Use the same content key for all of the audio and video tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the audio tracks in your stream.
       */
      override fun presetSpeke20Audio(presetSpeke20Audio: String) {
        cdkBuilder.presetSpeke20Audio(presetSpeke20Audio)
      }

      /**
       * @param presetSpeke20Video A collection of video encryption presets. 
       * Value description:
       *
       * * `PRESET-VIDEO-1` - Use one content key to encrypt all of the video tracks in your stream.
       * * `PRESET-VIDEO-2` - Use one content key to encrypt all of the SD video tracks and one
       * content key for all HD and higher resolutions video tracks.
       * * `PRESET-VIDEO-3` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-4` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks, one content key for all UHD1 video tracks and one content key for all
       * UHD2 video tracks.
       * * `PRESET-VIDEO-5` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks, one content key for all UHD1
       * video tracks and one content key for all UHD2 video tracks.
       * * `PRESET-VIDEO-6` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks and one content key for all UHD
       * video tracks.
       * * `PRESET-VIDEO-7` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-8` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks, one content key for all UHD1 video tracks and one content
       * key for all UHD2 video tracks.
       * * `SHARED` - Use the same content key for all of the video and audio tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the video tracks in your stream.
       */
      override fun presetSpeke20Video(presetSpeke20Video: String) {
        cdkBuilder.presetSpeke20Video(presetSpeke20Video)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.EncryptionContractConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.EncryptionContractConfigurationProperty,
    ) : CdkObject(cdkObject), EncryptionContractConfigurationProperty {
      /**
       * A collection of audio encryption presets.
       *
       * Value description:
       *
       * * `PRESET-AUDIO-1` - Use one content key to encrypt all of the audio tracks in your stream.
       * * `PRESET-AUDIO-2` - Use one content key to encrypt all of the stereo audio tracks and one
       * content key to encrypt all of the multichannel audio tracks.
       * * `PRESET-AUDIO-3` - Use one content key to encrypt all of the stereo audio tracks, one
       * content key to encrypt all of the multichannel audio tracks with 3 to 6 channels, and one
       * content key to encrypt all of the multichannel audio tracks with more than 6 channels.
       * * `SHARED` - Use the same content key for all of the audio and video tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the audio tracks in your stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-encryptioncontractconfiguration.html#cfn-mediapackage-packagingconfiguration-encryptioncontractconfiguration-presetspeke20audio)
       */
      override fun presetSpeke20Audio(): String = unwrap(this).getPresetSpeke20Audio()

      /**
       * A collection of video encryption presets.
       *
       * Value description:
       *
       * * `PRESET-VIDEO-1` - Use one content key to encrypt all of the video tracks in your stream.
       * * `PRESET-VIDEO-2` - Use one content key to encrypt all of the SD video tracks and one
       * content key for all HD and higher resolutions video tracks.
       * * `PRESET-VIDEO-3` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-4` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks, one content key for all UHD1 video tracks and one content key for all
       * UHD2 video tracks.
       * * `PRESET-VIDEO-5` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks, one content key for all UHD1
       * video tracks and one content key for all UHD2 video tracks.
       * * `PRESET-VIDEO-6` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks and one content key for all UHD
       * video tracks.
       * * `PRESET-VIDEO-7` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-8` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks, one content key for all UHD1 video tracks and one content
       * key for all UHD2 video tracks.
       * * `SHARED` - Use the same content key for all of the video and audio tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the video tracks in your stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-encryptioncontractconfiguration.html#cfn-mediapackage-packagingconfiguration-encryptioncontractconfiguration-presetspeke20video)
       */
      override fun presetSpeke20Video(): String = unwrap(this).getPresetSpeke20Video()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EncryptionContractConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.EncryptionContractConfigurationProperty):
          EncryptionContractConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionContractConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionContractConfigurationProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.EncryptionContractConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.EncryptionContractConfigurationProperty
    }
  }

  /**
   * Parameters for a packaging configuration that uses HTTP Live Streaming (HLS) packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * HlsPackageProperty hlsPackageProperty = HlsPackageProperty.builder()
   * .hlsManifests(List.of(HlsManifestProperty.builder()
   * .adMarkers("adMarkers")
   * .includeIframeOnlyStream(false)
   * .manifestName("manifestName")
   * .programDateTimeIntervalSeconds(123)
   * .repeatExtXKey(false)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(HlsEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * // the properties below are optional
   * .constantInitializationVector("constantInitializationVector")
   * .encryptionMethod("encryptionMethod")
   * .build())
   * .includeDvbSubtitles(false)
   * .segmentDurationSeconds(123)
   * .useAudioRenditionGroup(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlspackage.html)
   */
  public interface HlsPackageProperty {
    /**
     * Parameters for encrypting content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlspackage.html#cfn-mediapackage-packagingconfiguration-hlspackage-encryption)
     */
    public fun encryption(): Any? = unwrap(this).getEncryption()

    /**
     * A list of HLS manifest configurations that are available from this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlspackage.html#cfn-mediapackage-packagingconfiguration-hlspackage-hlsmanifests)
     */
    public fun hlsManifests(): Any

    /**
     * When enabled, MediaPackage passes through digital video broadcasting (DVB) subtitles into the
     * output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlspackage.html#cfn-mediapackage-packagingconfiguration-hlspackage-includedvbsubtitles)
     */
    public fun includeDvbSubtitles(): Any? = unwrap(this).getIncludeDvbSubtitles()

    /**
     * Duration (in seconds) of each fragment.
     *
     * Actual fragments are rounded to the nearest multiple of the source fragment duration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlspackage.html#cfn-mediapackage-packagingconfiguration-hlspackage-segmentdurationseconds)
     */
    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    /**
     * When true, AWS Elemental MediaPackage bundles all audio tracks in a rendition group.
     *
     * All other tracks in the stream can be used with any audio rendition from the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlspackage.html#cfn-mediapackage-packagingconfiguration-hlspackage-useaudiorenditiongroup)
     */
    public fun useAudioRenditionGroup(): Any? = unwrap(this).getUseAudioRenditionGroup()

    /**
     * A builder for [HlsPackageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: IResolvable)

      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: HlsEncryptionProperty)

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8af0b455d3b7acc944f9336ee53145c04998f1b6a118ef542fc1f7e384f5443")
      public fun encryption(encryption: HlsEncryptionProperty.Builder.() -> Unit)

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint. 
       */
      public fun hlsManifests(hlsManifests: IResolvable)

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint. 
       */
      public fun hlsManifests(hlsManifests: List<Any>)

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint. 
       */
      public fun hlsManifests(vararg hlsManifests: Any)

      /**
       * @param includeDvbSubtitles When enabled, MediaPackage passes through digital video
       * broadcasting (DVB) subtitles into the output.
       */
      public fun includeDvbSubtitles(includeDvbSubtitles: Boolean)

      /**
       * @param includeDvbSubtitles When enabled, MediaPackage passes through digital video
       * broadcasting (DVB) subtitles into the output.
       */
      public fun includeDvbSubtitles(includeDvbSubtitles: IResolvable)

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each fragment.
       * Actual fragments are rounded to the nearest multiple of the source fragment duration.
       */
      public fun segmentDurationSeconds(segmentDurationSeconds: Number)

      /**
       * @param useAudioRenditionGroup When true, AWS Elemental MediaPackage bundles all audio
       * tracks in a rendition group.
       * All other tracks in the stream can be used with any audio rendition from the group.
       */
      public fun useAudioRenditionGroup(useAudioRenditionGroup: Boolean)

      /**
       * @param useAudioRenditionGroup When true, AWS Elemental MediaPackage bundles all audio
       * tracks in a rendition group.
       * All other tracks in the stream can be used with any audio rendition from the group.
       */
      public fun useAudioRenditionGroup(useAudioRenditionGroup: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty.builder()

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: HlsEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(HlsEncryptionProperty::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8af0b455d3b7acc944f9336ee53145c04998f1b6a118ef542fc1f7e384f5443")
      override fun encryption(encryption: HlsEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(HlsEncryptionProperty(encryption))

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint. 
       */
      override fun hlsManifests(hlsManifests: IResolvable) {
        cdkBuilder.hlsManifests(hlsManifests.let(IResolvable::unwrap))
      }

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint. 
       */
      override fun hlsManifests(hlsManifests: List<Any>) {
        cdkBuilder.hlsManifests(hlsManifests)
      }

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint. 
       */
      override fun hlsManifests(vararg hlsManifests: Any): Unit =
          hlsManifests(hlsManifests.toList())

      /**
       * @param includeDvbSubtitles When enabled, MediaPackage passes through digital video
       * broadcasting (DVB) subtitles into the output.
       */
      override fun includeDvbSubtitles(includeDvbSubtitles: Boolean) {
        cdkBuilder.includeDvbSubtitles(includeDvbSubtitles)
      }

      /**
       * @param includeDvbSubtitles When enabled, MediaPackage passes through digital video
       * broadcasting (DVB) subtitles into the output.
       */
      override fun includeDvbSubtitles(includeDvbSubtitles: IResolvable) {
        cdkBuilder.includeDvbSubtitles(includeDvbSubtitles.let(IResolvable::unwrap))
      }

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each fragment.
       * Actual fragments are rounded to the nearest multiple of the source fragment duration.
       */
      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      /**
       * @param useAudioRenditionGroup When true, AWS Elemental MediaPackage bundles all audio
       * tracks in a rendition group.
       * All other tracks in the stream can be used with any audio rendition from the group.
       */
      override fun useAudioRenditionGroup(useAudioRenditionGroup: Boolean) {
        cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup)
      }

      /**
       * @param useAudioRenditionGroup When true, AWS Elemental MediaPackage bundles all audio
       * tracks in a rendition group.
       * All other tracks in the stream can be used with any audio rendition from the group.
       */
      override fun useAudioRenditionGroup(useAudioRenditionGroup: IResolvable) {
        cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty,
    ) : CdkObject(cdkObject), HlsPackageProperty {
      /**
       * Parameters for encrypting content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlspackage.html#cfn-mediapackage-packagingconfiguration-hlspackage-encryption)
       */
      override fun encryption(): Any? = unwrap(this).getEncryption()

      /**
       * A list of HLS manifest configurations that are available from this endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlspackage.html#cfn-mediapackage-packagingconfiguration-hlspackage-hlsmanifests)
       */
      override fun hlsManifests(): Any = unwrap(this).getHlsManifests()

      /**
       * When enabled, MediaPackage passes through digital video broadcasting (DVB) subtitles into
       * the output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlspackage.html#cfn-mediapackage-packagingconfiguration-hlspackage-includedvbsubtitles)
       */
      override fun includeDvbSubtitles(): Any? = unwrap(this).getIncludeDvbSubtitles()

      /**
       * Duration (in seconds) of each fragment.
       *
       * Actual fragments are rounded to the nearest multiple of the source fragment duration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlspackage.html#cfn-mediapackage-packagingconfiguration-hlspackage-segmentdurationseconds)
       */
      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

      /**
       * When true, AWS Elemental MediaPackage bundles all audio tracks in a rendition group.
       *
       * All other tracks in the stream can be used with any audio rendition from the group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlspackage.html#cfn-mediapackage-packagingconfiguration-hlspackage-useaudiorenditiongroup)
       */
      override fun useAudioRenditionGroup(): Any? = unwrap(this).getUseAudioRenditionGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty):
          HlsPackageProperty = CdkObjectWrappers.wrap(cdkObject) as? HlsPackageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.HlsPackageProperty
    }
  }

  /**
   * Parameters for a Microsoft Smooth manifest.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * MssManifestProperty mssManifestProperty = MssManifestProperty.builder()
   * .manifestName("manifestName")
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-mssmanifest.html)
   */
  public interface MssManifestProperty {
    /**
     * A short string that's appended to the end of the endpoint URL to create a unique path to this
     * packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-mssmanifest.html#cfn-mediapackage-packagingconfiguration-mssmanifest-manifestname)
     */
    public fun manifestName(): String? = unwrap(this).getManifestName()

    /**
     * Video bitrate limitations for outputs from this packaging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-mssmanifest.html#cfn-mediapackage-packagingconfiguration-mssmanifest-streamselection)
     */
    public fun streamSelection(): Any? = unwrap(this).getStreamSelection()

    /**
     * A builder for [MssManifestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param manifestName A short string that's appended to the end of the endpoint URL to create
       * a unique path to this packaging configuration.
       */
      public fun manifestName(manifestName: String)

      /**
       * @param streamSelection Video bitrate limitations for outputs from this packaging
       * configuration.
       */
      public fun streamSelection(streamSelection: IResolvable)

      /**
       * @param streamSelection Video bitrate limitations for outputs from this packaging
       * configuration.
       */
      public fun streamSelection(streamSelection: StreamSelectionProperty)

      /**
       * @param streamSelection Video bitrate limitations for outputs from this packaging
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("753f0eb82d5885d5e439e15010c47c7bda667951b874abaf1fec98f40a2c03dc")
      public fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssManifestProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssManifestProperty.builder()

      /**
       * @param manifestName A short string that's appended to the end of the endpoint URL to create
       * a unique path to this packaging configuration.
       */
      override fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
      }

      /**
       * @param streamSelection Video bitrate limitations for outputs from this packaging
       * configuration.
       */
      override fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection.let(IResolvable::unwrap))
      }

      /**
       * @param streamSelection Video bitrate limitations for outputs from this packaging
       * configuration.
       */
      override fun streamSelection(streamSelection: StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection.let(StreamSelectionProperty::unwrap))
      }

      /**
       * @param streamSelection Video bitrate limitations for outputs from this packaging
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("753f0eb82d5885d5e439e15010c47c7bda667951b874abaf1fec98f40a2c03dc")
      override fun streamSelection(streamSelection: StreamSelectionProperty.Builder.() -> Unit):
          Unit = streamSelection(StreamSelectionProperty(streamSelection))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssManifestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssManifestProperty,
    ) : CdkObject(cdkObject), MssManifestProperty {
      /**
       * A short string that's appended to the end of the endpoint URL to create a unique path to
       * this packaging configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-mssmanifest.html#cfn-mediapackage-packagingconfiguration-mssmanifest-manifestname)
       */
      override fun manifestName(): String? = unwrap(this).getManifestName()

      /**
       * Video bitrate limitations for outputs from this packaging configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-mssmanifest.html#cfn-mediapackage-packagingconfiguration-mssmanifest-streamselection)
       */
      override fun streamSelection(): Any? = unwrap(this).getStreamSelection()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MssManifestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssManifestProperty):
          MssManifestProperty = CdkObjectWrappers.wrap(cdkObject) as? MssManifestProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MssManifestProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssManifestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssManifestProperty
    }
  }

  /**
   * Holds encryption information so that access to the content can be controlled by a DRM solution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * MssEncryptionProperty mssEncryptionProperty = MssEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-mssencryption.html)
   */
  public interface MssEncryptionProperty {
    /**
     * Parameters for the SPEKE key provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-mssencryption.html#cfn-mediapackage-packagingconfiguration-mssencryption-spekekeyprovider)
     */
    public fun spekeKeyProvider(): Any

    /**
     * A builder for [MssEncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9eb5bbe084066bbbb590c3d3041bfd5ea1e2d9ba26bd6982a194932eb2024eef")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty.builder()

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      /**
       * @param spekeKeyProvider Parameters for the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9eb5bbe084066bbbb590c3d3041bfd5ea1e2d9ba26bd6982a194932eb2024eef")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty,
    ) : CdkObject(cdkObject), MssEncryptionProperty {
      /**
       * Parameters for the SPEKE key provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-mssencryption.html#cfn-mediapackage-packagingconfiguration-mssencryption-spekekeyprovider)
       */
      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MssEncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty):
          MssEncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as? MssEncryptionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MssEncryptionProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.MssEncryptionProperty
    }
  }

  /**
   * Parameters for a packaging configuration that uses Common Media Application Format (CMAF)
   * packaging.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackage.*;
   * CmafPackageProperty cmafPackageProperty = CmafPackageProperty.builder()
   * .hlsManifests(List.of(HlsManifestProperty.builder()
   * .adMarkers("adMarkers")
   * .includeIframeOnlyStream(false)
   * .manifestName("manifestName")
   * .programDateTimeIntervalSeconds(123)
   * .repeatExtXKey(false)
   * .streamSelection(StreamSelectionProperty.builder()
   * .maxVideoBitsPerSecond(123)
   * .minVideoBitsPerSecond(123)
   * .streamOrder("streamOrder")
   * .build())
   * .build()))
   * // the properties below are optional
   * .encryption(CmafEncryptionProperty.builder()
   * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
   * .roleArn("roleArn")
   * .systemIds(List.of("systemIds"))
   * .url("url")
   * // the properties below are optional
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .build())
   * .build())
   * .includeEncoderConfigurationInSegments(false)
   * .segmentDurationSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-cmafpackage.html)
   */
  public interface CmafPackageProperty {
    /**
     * Parameters for encrypting content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-cmafpackage.html#cfn-mediapackage-packagingconfiguration-cmafpackage-encryption)
     */
    public fun encryption(): Any? = unwrap(this).getEncryption()

    /**
     * A list of HLS manifest configurations that are available from this endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-cmafpackage.html#cfn-mediapackage-packagingconfiguration-cmafpackage-hlsmanifests)
     */
    public fun hlsManifests(): Any

    /**
     * When includeEncoderConfigurationInSegments is set to true, AWS Elemental MediaPackage places
     * your encoder's Sequence Parameter Set (SPS), Picture Parameter Set (PPS), and Video Parameter
     * Set (VPS) metadata in every video segment instead of in the init fragment.
     *
     * This lets you use different SPS/PPS/VPS settings for your assets during content playback.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-cmafpackage.html#cfn-mediapackage-packagingconfiguration-cmafpackage-includeencoderconfigurationinsegments)
     */
    public fun includeEncoderConfigurationInSegments(): Any? =
        unwrap(this).getIncludeEncoderConfigurationInSegments()

    /**
     * Duration (in seconds) of each segment.
     *
     * Actual segments are rounded to the nearest multiple of the source fragment duration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-cmafpackage.html#cfn-mediapackage-packagingconfiguration-cmafpackage-segmentdurationseconds)
     */
    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    /**
     * A builder for [CmafPackageProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: IResolvable)

      /**
       * @param encryption Parameters for encrypting content.
       */
      public fun encryption(encryption: CmafEncryptionProperty)

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25ad786ab44d860064f55c2d4bc77cc4055ca728bfa14b903c798a4b376fe489")
      public fun encryption(encryption: CmafEncryptionProperty.Builder.() -> Unit)

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint. 
       */
      public fun hlsManifests(hlsManifests: IResolvable)

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint. 
       */
      public fun hlsManifests(hlsManifests: List<Any>)

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint. 
       */
      public fun hlsManifests(vararg hlsManifests: Any)

      /**
       * @param includeEncoderConfigurationInSegments When includeEncoderConfigurationInSegments is
       * set to true, AWS Elemental MediaPackage places your encoder's Sequence Parameter Set (SPS),
       * Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment
       * instead of in the init fragment.
       * This lets you use different SPS/PPS/VPS settings for your assets during content playback.
       */
      public
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: Boolean)

      /**
       * @param includeEncoderConfigurationInSegments When includeEncoderConfigurationInSegments is
       * set to true, AWS Elemental MediaPackage places your encoder's Sequence Parameter Set (SPS),
       * Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment
       * instead of in the init fragment.
       * This lets you use different SPS/PPS/VPS settings for your assets during content playback.
       */
      public
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: IResolvable)

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each segment.
       * Actual segments are rounded to the nearest multiple of the source fragment duration.
       */
      public fun segmentDurationSeconds(segmentDurationSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty.Builder
          =
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty.builder()

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      override fun encryption(encryption: CmafEncryptionProperty) {
        cdkBuilder.encryption(encryption.let(CmafEncryptionProperty::unwrap))
      }

      /**
       * @param encryption Parameters for encrypting content.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("25ad786ab44d860064f55c2d4bc77cc4055ca728bfa14b903c798a4b376fe489")
      override fun encryption(encryption: CmafEncryptionProperty.Builder.() -> Unit): Unit =
          encryption(CmafEncryptionProperty(encryption))

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint. 
       */
      override fun hlsManifests(hlsManifests: IResolvable) {
        cdkBuilder.hlsManifests(hlsManifests.let(IResolvable::unwrap))
      }

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint. 
       */
      override fun hlsManifests(hlsManifests: List<Any>) {
        cdkBuilder.hlsManifests(hlsManifests)
      }

      /**
       * @param hlsManifests A list of HLS manifest configurations that are available from this
       * endpoint. 
       */
      override fun hlsManifests(vararg hlsManifests: Any): Unit =
          hlsManifests(hlsManifests.toList())

      /**
       * @param includeEncoderConfigurationInSegments When includeEncoderConfigurationInSegments is
       * set to true, AWS Elemental MediaPackage places your encoder's Sequence Parameter Set (SPS),
       * Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment
       * instead of in the init fragment.
       * This lets you use different SPS/PPS/VPS settings for your assets during content playback.
       */
      override
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: Boolean) {
        cdkBuilder.includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments)
      }

      /**
       * @param includeEncoderConfigurationInSegments When includeEncoderConfigurationInSegments is
       * set to true, AWS Elemental MediaPackage places your encoder's Sequence Parameter Set (SPS),
       * Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment
       * instead of in the init fragment.
       * This lets you use different SPS/PPS/VPS settings for your assets during content playback.
       */
      override
          fun includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments: IResolvable) {
        cdkBuilder.includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments.let(IResolvable::unwrap))
      }

      /**
       * @param segmentDurationSeconds Duration (in seconds) of each segment.
       * Actual segments are rounded to the nearest multiple of the source fragment duration.
       */
      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty,
    ) : CdkObject(cdkObject), CmafPackageProperty {
      /**
       * Parameters for encrypting content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-cmafpackage.html#cfn-mediapackage-packagingconfiguration-cmafpackage-encryption)
       */
      override fun encryption(): Any? = unwrap(this).getEncryption()

      /**
       * A list of HLS manifest configurations that are available from this endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-cmafpackage.html#cfn-mediapackage-packagingconfiguration-cmafpackage-hlsmanifests)
       */
      override fun hlsManifests(): Any = unwrap(this).getHlsManifests()

      /**
       * When includeEncoderConfigurationInSegments is set to true, AWS Elemental MediaPackage
       * places your encoder's Sequence Parameter Set (SPS), Picture Parameter Set (PPS), and Video
       * Parameter Set (VPS) metadata in every video segment instead of in the init fragment.
       *
       * This lets you use different SPS/PPS/VPS settings for your assets during content playback.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-cmafpackage.html#cfn-mediapackage-packagingconfiguration-cmafpackage-includeencoderconfigurationinsegments)
       */
      override fun includeEncoderConfigurationInSegments(): Any? =
          unwrap(this).getIncludeEncoderConfigurationInSegments()

      /**
       * Duration (in seconds) of each segment.
       *
       * Actual segments are rounded to the nearest multiple of the source fragment duration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-cmafpackage.html#cfn-mediapackage-packagingconfiguration-cmafpackage-segmentdurationseconds)
       */
      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CmafPackageProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty):
          CmafPackageProperty = CdkObjectWrappers.wrap(cdkObject) as? CmafPackageProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CmafPackageProperty):
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration.CmafPackageProperty
    }
  }
}
