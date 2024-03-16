@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediatailor

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
 * A source location is a container for sources.
 *
 * For more information about source locations, see [Working with source
 * locations](https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html)
 * in the *MediaTailor User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediatailor.*;
 * CfnSourceLocation cfnSourceLocation = CfnSourceLocation.Builder.create(this,
 * "MyCfnSourceLocation")
 * .httpConfiguration(HttpConfigurationProperty.builder()
 * .baseUrl("baseUrl")
 * .build())
 * .sourceLocationName("sourceLocationName")
 * // the properties below are optional
 * .accessConfiguration(AccessConfigurationProperty.builder()
 * .accessType("accessType")
 * .secretsManagerAccessTokenConfiguration(SecretsManagerAccessTokenConfigurationProperty.builder()
 * .headerName("headerName")
 * .secretArn("secretArn")
 * .secretStringKey("secretStringKey")
 * .build())
 * .build())
 * .defaultSegmentDeliveryConfiguration(DefaultSegmentDeliveryConfigurationProperty.builder()
 * .baseUrl("baseUrl")
 * .build())
 * .segmentDeliveryConfigurations(List.of(SegmentDeliveryConfigurationProperty.builder()
 * .baseUrl("baseUrl")
 * .name("name")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html)
 */
public open class CfnSourceLocation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocation,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The access configuration for the source location.
   */
  public open fun accessConfiguration(): Any? = unwrap(this).getAccessConfiguration()

  /**
   * The access configuration for the source location.
   */
  public open fun accessConfiguration(`value`: IResolvable) {
    unwrap(this).setAccessConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The access configuration for the source location.
   */
  public open fun accessConfiguration(`value`: AccessConfigurationProperty) {
    unwrap(this).setAccessConfiguration(`value`.let(AccessConfigurationProperty::unwrap))
  }

  /**
   * The access configuration for the source location.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b77590368850047370ce0d6b74641c3c2ef23070a36a47cb813ce2f48ab30f79")
  public open fun accessConfiguration(`value`: AccessConfigurationProperty.Builder.() -> Unit): Unit
      = accessConfiguration(AccessConfigurationProperty(`value`))

  /**
   * The ARN of the source location.</p>.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The default segment delivery configuration.
   */
  public open fun defaultSegmentDeliveryConfiguration(): Any? =
      unwrap(this).getDefaultSegmentDeliveryConfiguration()

  /**
   * The default segment delivery configuration.
   */
  public open fun defaultSegmentDeliveryConfiguration(`value`: IResolvable) {
    unwrap(this).setDefaultSegmentDeliveryConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The default segment delivery configuration.
   */
  public open
      fun defaultSegmentDeliveryConfiguration(`value`: DefaultSegmentDeliveryConfigurationProperty) {
    unwrap(this).setDefaultSegmentDeliveryConfiguration(`value`.let(DefaultSegmentDeliveryConfigurationProperty::unwrap))
  }

  /**
   * The default segment delivery configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("346c7fe35845444126117fe3f3bbeb954f86ea0d31398d0267ed8efc9baeb5b7")
  public open
      fun defaultSegmentDeliveryConfiguration(`value`: DefaultSegmentDeliveryConfigurationProperty.Builder.() -> Unit):
      Unit =
      defaultSegmentDeliveryConfiguration(DefaultSegmentDeliveryConfigurationProperty(`value`))

  /**
   * The HTTP configuration for the source location.
   */
  public open fun httpConfiguration(): Any = unwrap(this).getHttpConfiguration()

  /**
   * The HTTP configuration for the source location.
   */
  public open fun httpConfiguration(`value`: IResolvable) {
    unwrap(this).setHttpConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The HTTP configuration for the source location.
   */
  public open fun httpConfiguration(`value`: HttpConfigurationProperty) {
    unwrap(this).setHttpConfiguration(`value`.let(HttpConfigurationProperty::unwrap))
  }

  /**
   * The HTTP configuration for the source location.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e20c6f5c5c82b207ae5616d96f686e3a08218d9d773abdb3ec4741a36cc5eebf")
  public open fun httpConfiguration(`value`: HttpConfigurationProperty.Builder.() -> Unit): Unit =
      httpConfiguration(HttpConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The segment delivery configurations for the source location.
   */
  public open fun segmentDeliveryConfigurations(): Any? =
      unwrap(this).getSegmentDeliveryConfigurations()

  /**
   * The segment delivery configurations for the source location.
   */
  public open fun segmentDeliveryConfigurations(`value`: IResolvable) {
    unwrap(this).setSegmentDeliveryConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * The segment delivery configurations for the source location.
   */
  public open fun segmentDeliveryConfigurations(`value`: List<Any>) {
    unwrap(this).setSegmentDeliveryConfigurations(`value`)
  }

  /**
   * The segment delivery configurations for the source location.
   */
  public open fun segmentDeliveryConfigurations(vararg `value`: Any): Unit =
      segmentDeliveryConfigurations(`value`.toList())

  /**
   * The name of the source location.
   */
  public open fun sourceLocationName(): String = unwrap(this).getSourceLocationName()

  /**
   * The name of the source location.
   */
  public open fun sourceLocationName(`value`: String) {
    unwrap(this).setSourceLocationName(`value`)
  }

  /**
   * The tags assigned to the source location.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags assigned to the source location.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags assigned to the source location.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediatailor.CfnSourceLocation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The access configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-accessconfiguration)
     * @param accessConfiguration The access configuration for the source location. 
     */
    public fun accessConfiguration(accessConfiguration: IResolvable)

    /**
     * The access configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-accessconfiguration)
     * @param accessConfiguration The access configuration for the source location. 
     */
    public fun accessConfiguration(accessConfiguration: AccessConfigurationProperty)

    /**
     * The access configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-accessconfiguration)
     * @param accessConfiguration The access configuration for the source location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7a88d145bc10a5f5f2f903b775091902ea3ff0a961a7aeeb328bd12627aed70")
    public
        fun accessConfiguration(accessConfiguration: AccessConfigurationProperty.Builder.() -> Unit)

    /**
     * The default segment delivery configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration)
     * @param defaultSegmentDeliveryConfiguration The default segment delivery configuration. 
     */
    public fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: IResolvable)

    /**
     * The default segment delivery configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration)
     * @param defaultSegmentDeliveryConfiguration The default segment delivery configuration. 
     */
    public
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: DefaultSegmentDeliveryConfigurationProperty)

    /**
     * The default segment delivery configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration)
     * @param defaultSegmentDeliveryConfiguration The default segment delivery configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b2bfcbc2ff29a32e75ed5a5d10e2ac67ca558e25a14e61ffbb2f99463b1ca7f")
    public
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: DefaultSegmentDeliveryConfigurationProperty.Builder.() -> Unit)

    /**
     * The HTTP configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-httpconfiguration)
     * @param httpConfiguration The HTTP configuration for the source location. 
     */
    public fun httpConfiguration(httpConfiguration: IResolvable)

    /**
     * The HTTP configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-httpconfiguration)
     * @param httpConfiguration The HTTP configuration for the source location. 
     */
    public fun httpConfiguration(httpConfiguration: HttpConfigurationProperty)

    /**
     * The HTTP configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-httpconfiguration)
     * @param httpConfiguration The HTTP configuration for the source location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("411543ce488bbe8334be375cc6ac845d6e4a00b8a51c9bdfa215efd6da46bc51")
    public fun httpConfiguration(httpConfiguration: HttpConfigurationProperty.Builder.() -> Unit)

    /**
     * The segment delivery configurations for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfigurations)
     * @param segmentDeliveryConfigurations The segment delivery configurations for the source
     * location. 
     */
    public fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: IResolvable)

    /**
     * The segment delivery configurations for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfigurations)
     * @param segmentDeliveryConfigurations The segment delivery configurations for the source
     * location. 
     */
    public fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: List<Any>)

    /**
     * The segment delivery configurations for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfigurations)
     * @param segmentDeliveryConfigurations The segment delivery configurations for the source
     * location. 
     */
    public fun segmentDeliveryConfigurations(vararg segmentDeliveryConfigurations: Any)

    /**
     * The name of the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-sourcelocationname)
     * @param sourceLocationName The name of the source location. 
     */
    public fun sourceLocationName(sourceLocationName: String)

    /**
     * The tags assigned to the source location.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-tags)
     * @param tags The tags assigned to the source location. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags assigned to the source location.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-tags)
     * @param tags The tags assigned to the source location. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediatailor.CfnSourceLocation.Builder =
        software.amazon.awscdk.services.mediatailor.CfnSourceLocation.Builder.create(scope, id)

    /**
     * The access configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-accessconfiguration)
     * @param accessConfiguration The access configuration for the source location. 
     */
    override fun accessConfiguration(accessConfiguration: IResolvable) {
      cdkBuilder.accessConfiguration(accessConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The access configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-accessconfiguration)
     * @param accessConfiguration The access configuration for the source location. 
     */
    override fun accessConfiguration(accessConfiguration: AccessConfigurationProperty) {
      cdkBuilder.accessConfiguration(accessConfiguration.let(AccessConfigurationProperty::unwrap))
    }

    /**
     * The access configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-accessconfiguration)
     * @param accessConfiguration The access configuration for the source location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7a88d145bc10a5f5f2f903b775091902ea3ff0a961a7aeeb328bd12627aed70")
    override
        fun accessConfiguration(accessConfiguration: AccessConfigurationProperty.Builder.() -> Unit):
        Unit = accessConfiguration(AccessConfigurationProperty(accessConfiguration))

    /**
     * The default segment delivery configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration)
     * @param defaultSegmentDeliveryConfiguration The default segment delivery configuration. 
     */
    override
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: IResolvable) {
      cdkBuilder.defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The default segment delivery configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration)
     * @param defaultSegmentDeliveryConfiguration The default segment delivery configuration. 
     */
    override
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: DefaultSegmentDeliveryConfigurationProperty) {
      cdkBuilder.defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration.let(DefaultSegmentDeliveryConfigurationProperty::unwrap))
    }

    /**
     * The default segment delivery configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration)
     * @param defaultSegmentDeliveryConfiguration The default segment delivery configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b2bfcbc2ff29a32e75ed5a5d10e2ac67ca558e25a14e61ffbb2f99463b1ca7f")
    override
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: DefaultSegmentDeliveryConfigurationProperty.Builder.() -> Unit):
        Unit =
        defaultSegmentDeliveryConfiguration(DefaultSegmentDeliveryConfigurationProperty(defaultSegmentDeliveryConfiguration))

    /**
     * The HTTP configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-httpconfiguration)
     * @param httpConfiguration The HTTP configuration for the source location. 
     */
    override fun httpConfiguration(httpConfiguration: IResolvable) {
      cdkBuilder.httpConfiguration(httpConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The HTTP configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-httpconfiguration)
     * @param httpConfiguration The HTTP configuration for the source location. 
     */
    override fun httpConfiguration(httpConfiguration: HttpConfigurationProperty) {
      cdkBuilder.httpConfiguration(httpConfiguration.let(HttpConfigurationProperty::unwrap))
    }

    /**
     * The HTTP configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-httpconfiguration)
     * @param httpConfiguration The HTTP configuration for the source location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("411543ce488bbe8334be375cc6ac845d6e4a00b8a51c9bdfa215efd6da46bc51")
    override fun httpConfiguration(httpConfiguration: HttpConfigurationProperty.Builder.() -> Unit):
        Unit = httpConfiguration(HttpConfigurationProperty(httpConfiguration))

    /**
     * The segment delivery configurations for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfigurations)
     * @param segmentDeliveryConfigurations The segment delivery configurations for the source
     * location. 
     */
    override fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: IResolvable) {
      cdkBuilder.segmentDeliveryConfigurations(segmentDeliveryConfigurations.let(IResolvable::unwrap))
    }

    /**
     * The segment delivery configurations for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfigurations)
     * @param segmentDeliveryConfigurations The segment delivery configurations for the source
     * location. 
     */
    override fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: List<Any>) {
      cdkBuilder.segmentDeliveryConfigurations(segmentDeliveryConfigurations)
    }

    /**
     * The segment delivery configurations for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfigurations)
     * @param segmentDeliveryConfigurations The segment delivery configurations for the source
     * location. 
     */
    override fun segmentDeliveryConfigurations(vararg segmentDeliveryConfigurations: Any): Unit =
        segmentDeliveryConfigurations(segmentDeliveryConfigurations.toList())

    /**
     * The name of the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-sourcelocationname)
     * @param sourceLocationName The name of the source location. 
     */
    override fun sourceLocationName(sourceLocationName: String) {
      cdkBuilder.sourceLocationName(sourceLocationName)
    }

    /**
     * The tags assigned to the source location.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-tags)
     * @param tags The tags assigned to the source location. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags assigned to the source location.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-tags)
     * @param tags The tags assigned to the source location. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnSourceLocation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediatailor.CfnSourceLocation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSourceLocation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSourceLocation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocation):
        CfnSourceLocation = CfnSourceLocation(cdkObject)

    internal fun unwrap(wrapped: CfnSourceLocation):
        software.amazon.awscdk.services.mediatailor.CfnSourceLocation = wrapped.cdkObject
  }

  /**
   * The optional configuration for a server that serves segments.
   *
   * Use this if you want the segment delivery server to be different from the source location
   * server. For example, you can configure your source location server to be an origination server,
   * such as MediaPackage, and the segment delivery server to be a content delivery network (CDN), such
   * as CloudFront. If you don't specify a segment delivery server, then the source location server is
   * used.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediatailor.*;
   * DefaultSegmentDeliveryConfigurationProperty defaultSegmentDeliveryConfigurationProperty =
   * DefaultSegmentDeliveryConfigurationProperty.builder()
   * .baseUrl("baseUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration.html)
   */
  public interface DefaultSegmentDeliveryConfigurationProperty {
    /**
     * The hostname of the server that will be used to serve segments.
     *
     * This string must include the protocol, such as *https:// * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration.html#cfn-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration-baseurl)
     */
    public fun baseUrl(): String? = unwrap(this).getBaseUrl()

    /**
     * A builder for [DefaultSegmentDeliveryConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param baseUrl The hostname of the server that will be used to serve segments.
       * This string must include the protocol, such as *https:// * .
       */
      public fun baseUrl(baseUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty.builder()

      /**
       * @param baseUrl The hostname of the server that will be used to serve segments.
       * This string must include the protocol, such as *https:// * .
       */
      override fun baseUrl(baseUrl: String) {
        cdkBuilder.baseUrl(baseUrl)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty,
    ) : CdkObject(cdkObject), DefaultSegmentDeliveryConfigurationProperty {
      /**
       * The hostname of the server that will be used to serve segments.
       *
       * This string must include the protocol, such as *https:// * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration.html#cfn-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration-baseurl)
       */
      override fun baseUrl(): String? = unwrap(this).getBaseUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DefaultSegmentDeliveryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty):
          DefaultSegmentDeliveryConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          DefaultSegmentDeliveryConfigurationProperty

      internal fun unwrap(wrapped: DefaultSegmentDeliveryConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty
    }
  }

  /**
   * The segment delivery configuration settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediatailor.*;
   * SegmentDeliveryConfigurationProperty segmentDeliveryConfigurationProperty =
   * SegmentDeliveryConfigurationProperty.builder()
   * .baseUrl("baseUrl")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-segmentdeliveryconfiguration.html)
   */
  public interface SegmentDeliveryConfigurationProperty {
    /**
     * The base URL of the host or path of the segment delivery server that you're using to serve
     * segments.
     *
     * This is typically a content delivery network (CDN). The URL can be absolute or relative. To
     * use an absolute URL include the protocol, such as `https://example.com/some/path` . To use a
     * relative URL specify the relative path, such as `/some/path*` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-segmentdeliveryconfiguration.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfiguration-baseurl)
     */
    public fun baseUrl(): String? = unwrap(this).getBaseUrl()

    /**
     * A unique identifier used to distinguish between multiple segment delivery configurations in a
     * source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-segmentdeliveryconfiguration.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfiguration-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [SegmentDeliveryConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param baseUrl The base URL of the host or path of the segment delivery server that you're
       * using to serve segments.
       * This is typically a content delivery network (CDN). The URL can be absolute or relative. To
       * use an absolute URL include the protocol, such as `https://example.com/some/path` . To use a
       * relative URL specify the relative path, such as `/some/path*` .
       */
      public fun baseUrl(baseUrl: String)

      /**
       * @param name A unique identifier used to distinguish between multiple segment delivery
       * configurations in a source location.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SegmentDeliveryConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SegmentDeliveryConfigurationProperty.builder()

      /**
       * @param baseUrl The base URL of the host or path of the segment delivery server that you're
       * using to serve segments.
       * This is typically a content delivery network (CDN). The URL can be absolute or relative. To
       * use an absolute URL include the protocol, such as `https://example.com/some/path` . To use a
       * relative URL specify the relative path, such as `/some/path*` .
       */
      override fun baseUrl(baseUrl: String) {
        cdkBuilder.baseUrl(baseUrl)
      }

      /**
       * @param name A unique identifier used to distinguish between multiple segment delivery
       * configurations in a source location.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SegmentDeliveryConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SegmentDeliveryConfigurationProperty,
    ) : CdkObject(cdkObject), SegmentDeliveryConfigurationProperty {
      /**
       * The base URL of the host or path of the segment delivery server that you're using to serve
       * segments.
       *
       * This is typically a content delivery network (CDN). The URL can be absolute or relative. To
       * use an absolute URL include the protocol, such as `https://example.com/some/path` . To use a
       * relative URL specify the relative path, such as `/some/path*` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-segmentdeliveryconfiguration.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfiguration-baseurl)
       */
      override fun baseUrl(): String? = unwrap(this).getBaseUrl()

      /**
       * A unique identifier used to distinguish between multiple segment delivery configurations in
       * a source location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-segmentdeliveryconfiguration.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfiguration-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SegmentDeliveryConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SegmentDeliveryConfigurationProperty):
          SegmentDeliveryConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          SegmentDeliveryConfigurationProperty

      internal fun unwrap(wrapped: SegmentDeliveryConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SegmentDeliveryConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SegmentDeliveryConfigurationProperty
    }
  }

  /**
   * AWS Secrets Manager access token configuration parameters.
   *
   * For information about Secrets Manager access token authentication, see [Working with AWS
   * Secrets Manager access token
   * authentication](https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-access-configuration-access-token.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediatailor.*;
   * SecretsManagerAccessTokenConfigurationProperty secretsManagerAccessTokenConfigurationProperty =
   * SecretsManagerAccessTokenConfigurationProperty.builder()
   * .headerName("headerName")
   * .secretArn("secretArn")
   * .secretStringKey("secretStringKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-secretsmanageraccesstokenconfiguration.html)
   */
  public interface SecretsManagerAccessTokenConfigurationProperty {
    /**
     * The name of the HTTP header used to supply the access token in requests to the source
     * location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-secretsmanageraccesstokenconfiguration.html#cfn-mediatailor-sourcelocation-secretsmanageraccesstokenconfiguration-headername)
     */
    public fun headerName(): String? = unwrap(this).getHeaderName()

    /**
     * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the access
     * token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-secretsmanageraccesstokenconfiguration.html#cfn-mediatailor-sourcelocation-secretsmanageraccesstokenconfiguration-secretarn)
     */
    public fun secretArn(): String? = unwrap(this).getSecretArn()

    /**
     * The AWS Secrets Manager
     * [SecretString](https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html#SecretsManager-CreateSecret-request-SecretString.html)
     * key associated with the access token. MediaTailor uses the key to look up SecretString key and
     * value pair containing the access token.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-secretsmanageraccesstokenconfiguration.html#cfn-mediatailor-sourcelocation-secretsmanageraccesstokenconfiguration-secretstringkey)
     */
    public fun secretStringKey(): String? = unwrap(this).getSecretStringKey()

    /**
     * A builder for [SecretsManagerAccessTokenConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param headerName The name of the HTTP header used to supply the access token in requests
       * to the source location.
       */
      public fun headerName(headerName: String)

      /**
       * @param secretArn The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that
       * contains the access token.
       */
      public fun secretArn(secretArn: String)

      /**
       * @param secretStringKey The AWS Secrets Manager
       * [SecretString](https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html#SecretsManager-CreateSecret-request-SecretString.html)
       * key associated with the access token. MediaTailor uses the key to look up SecretString key and
       * value pair containing the access token.
       */
      public fun secretStringKey(secretStringKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty.builder()

      /**
       * @param headerName The name of the HTTP header used to supply the access token in requests
       * to the source location.
       */
      override fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
      }

      /**
       * @param secretArn The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that
       * contains the access token.
       */
      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      /**
       * @param secretStringKey The AWS Secrets Manager
       * [SecretString](https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html#SecretsManager-CreateSecret-request-SecretString.html)
       * key associated with the access token. MediaTailor uses the key to look up SecretString key and
       * value pair containing the access token.
       */
      override fun secretStringKey(secretStringKey: String) {
        cdkBuilder.secretStringKey(secretStringKey)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty,
    ) : CdkObject(cdkObject), SecretsManagerAccessTokenConfigurationProperty {
      /**
       * The name of the HTTP header used to supply the access token in requests to the source
       * location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-secretsmanageraccesstokenconfiguration.html#cfn-mediatailor-sourcelocation-secretsmanageraccesstokenconfiguration-headername)
       */
      override fun headerName(): String? = unwrap(this).getHeaderName()

      /**
       * The Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the access
       * token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-secretsmanageraccesstokenconfiguration.html#cfn-mediatailor-sourcelocation-secretsmanageraccesstokenconfiguration-secretarn)
       */
      override fun secretArn(): String? = unwrap(this).getSecretArn()

      /**
       * The AWS Secrets Manager
       * [SecretString](https://docs.aws.amazon.com/secretsmanager/latest/apireference/API_CreateSecret.html#SecretsManager-CreateSecret-request-SecretString.html)
       * key associated with the access token. MediaTailor uses the key to look up SecretString key and
       * value pair containing the access token.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-secretsmanageraccesstokenconfiguration.html#cfn-mediatailor-sourcelocation-secretsmanageraccesstokenconfiguration-secretstringkey)
       */
      override fun secretStringKey(): String? = unwrap(this).getSecretStringKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SecretsManagerAccessTokenConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty):
          SecretsManagerAccessTokenConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          SecretsManagerAccessTokenConfigurationProperty

      internal fun unwrap(wrapped: SecretsManagerAccessTokenConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty
    }
  }

  /**
   * The HTTP configuration for the source location.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediatailor.*;
   * HttpConfigurationProperty httpConfigurationProperty = HttpConfigurationProperty.builder()
   * .baseUrl("baseUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-httpconfiguration.html)
   */
  public interface HttpConfigurationProperty {
    /**
     * The base URL for the source location host server.
     *
     * This string must include the protocol, such as *https:// * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-httpconfiguration.html#cfn-mediatailor-sourcelocation-httpconfiguration-baseurl)
     */
    public fun baseUrl(): String

    /**
     * A builder for [HttpConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param baseUrl The base URL for the source location host server. 
       * This string must include the protocol, such as *https:// * .
       */
      public fun baseUrl(baseUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.HttpConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.HttpConfigurationProperty.builder()

      /**
       * @param baseUrl The base URL for the source location host server. 
       * This string must include the protocol, such as *https:// * .
       */
      override fun baseUrl(baseUrl: String) {
        cdkBuilder.baseUrl(baseUrl)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.HttpConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.HttpConfigurationProperty,
    ) : CdkObject(cdkObject), HttpConfigurationProperty {
      /**
       * The base URL for the source location host server.
       *
       * This string must include the protocol, such as *https:// * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-httpconfiguration.html#cfn-mediatailor-sourcelocation-httpconfiguration-baseurl)
       */
      override fun baseUrl(): String = unwrap(this).getBaseUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocation.HttpConfigurationProperty):
          HttpConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as HttpConfigurationProperty

      internal fun unwrap(wrapped: HttpConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.HttpConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.HttpConfigurationProperty
    }
  }

  /**
   * Access configuration parameters.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediatailor.*;
   * AccessConfigurationProperty accessConfigurationProperty = AccessConfigurationProperty.builder()
   * .accessType("accessType")
   * .secretsManagerAccessTokenConfiguration(SecretsManagerAccessTokenConfigurationProperty.builder()
   * .headerName("headerName")
   * .secretArn("secretArn")
   * .secretStringKey("secretStringKey")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-accessconfiguration.html)
   */
  public interface AccessConfigurationProperty {
    /**
     * The type of authentication used to access content from `HttpConfiguration::BaseUrl` on your
     * source location. Accepted value: `S3_SIGV4` .
     *
     * `S3_SIGV4` - AWS Signature Version 4 authentication for Amazon S3 hosted virtual-style
     * access. If your source location base URL is an Amazon S3 bucket, MediaTailor can use AWS
     * Signature Version 4 (SigV4) authentication to access the bucket where your source content is
     * stored. Your MediaTailor source location baseURL must follow the S3 virtual hosted-style request
     * URL format. For example, https://bucket-name.s3.Region.amazonaws.com/key-name.
     *
     * Before you can use `S3_SIGV4` , you must meet these requirements:
     *
     * • You must allow MediaTailor to access your S3 bucket by granting mediatailor.amazonaws.com
     * principal access in IAM. For information about configuring access in IAM, see Access management
     * in the IAM User Guide.
     *
     * • The mediatailor.amazonaws.com service principal must have permissions to read all top level
     * manifests referenced by the VodSource packaging configurations.
     *
     * • The caller of the API must have s3:GetObject IAM permissions to read all top level
     * manifests referenced by your MediaTailor VodSource packaging configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-accessconfiguration.html#cfn-mediatailor-sourcelocation-accessconfiguration-accesstype)
     */
    public fun accessType(): String? = unwrap(this).getAccessType()

    /**
     * AWS Secrets Manager access token configuration parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-accessconfiguration.html#cfn-mediatailor-sourcelocation-accessconfiguration-secretsmanageraccesstokenconfiguration)
     */
    public fun secretsManagerAccessTokenConfiguration(): Any? =
        unwrap(this).getSecretsManagerAccessTokenConfiguration()

    /**
     * A builder for [AccessConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessType The type of authentication used to access content from
       * `HttpConfiguration::BaseUrl` on your source location. Accepted value: `S3_SIGV4` .
       * `S3_SIGV4` - AWS Signature Version 4 authentication for Amazon S3 hosted virtual-style
       * access. If your source location base URL is an Amazon S3 bucket, MediaTailor can use AWS
       * Signature Version 4 (SigV4) authentication to access the bucket where your source content is
       * stored. Your MediaTailor source location baseURL must follow the S3 virtual hosted-style
       * request URL format. For example, https://bucket-name.s3.Region.amazonaws.com/key-name.
       *
       * Before you can use `S3_SIGV4` , you must meet these requirements:
       *
       * • You must allow MediaTailor to access your S3 bucket by granting mediatailor.amazonaws.com
       * principal access in IAM. For information about configuring access in IAM, see Access
       * management in the IAM User Guide.
       *
       * • The mediatailor.amazonaws.com service principal must have permissions to read all top
       * level manifests referenced by the VodSource packaging configurations.
       *
       * • The caller of the API must have s3:GetObject IAM permissions to read all top level
       * manifests referenced by your MediaTailor VodSource packaging configurations.
       */
      public fun accessType(accessType: String)

      /**
       * @param secretsManagerAccessTokenConfiguration AWS Secrets Manager access token
       * configuration parameters.
       */
      public
          fun secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration: IResolvable)

      /**
       * @param secretsManagerAccessTokenConfiguration AWS Secrets Manager access token
       * configuration parameters.
       */
      public
          fun secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration: SecretsManagerAccessTokenConfigurationProperty)

      /**
       * @param secretsManagerAccessTokenConfiguration AWS Secrets Manager access token
       * configuration parameters.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1866a09a4118eb44d3a715ed2465a6ded5a1a5722f6b6958bdb47e09f0dfe2bf")
      public
          fun secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration: SecretsManagerAccessTokenConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.AccessConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.AccessConfigurationProperty.builder()

      /**
       * @param accessType The type of authentication used to access content from
       * `HttpConfiguration::BaseUrl` on your source location. Accepted value: `S3_SIGV4` .
       * `S3_SIGV4` - AWS Signature Version 4 authentication for Amazon S3 hosted virtual-style
       * access. If your source location base URL is an Amazon S3 bucket, MediaTailor can use AWS
       * Signature Version 4 (SigV4) authentication to access the bucket where your source content is
       * stored. Your MediaTailor source location baseURL must follow the S3 virtual hosted-style
       * request URL format. For example, https://bucket-name.s3.Region.amazonaws.com/key-name.
       *
       * Before you can use `S3_SIGV4` , you must meet these requirements:
       *
       * • You must allow MediaTailor to access your S3 bucket by granting mediatailor.amazonaws.com
       * principal access in IAM. For information about configuring access in IAM, see Access
       * management in the IAM User Guide.
       *
       * • The mediatailor.amazonaws.com service principal must have permissions to read all top
       * level manifests referenced by the VodSource packaging configurations.
       *
       * • The caller of the API must have s3:GetObject IAM permissions to read all top level
       * manifests referenced by your MediaTailor VodSource packaging configurations.
       */
      override fun accessType(accessType: String) {
        cdkBuilder.accessType(accessType)
      }

      /**
       * @param secretsManagerAccessTokenConfiguration AWS Secrets Manager access token
       * configuration parameters.
       */
      override
          fun secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration: IResolvable) {
        cdkBuilder.secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param secretsManagerAccessTokenConfiguration AWS Secrets Manager access token
       * configuration parameters.
       */
      override
          fun secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration: SecretsManagerAccessTokenConfigurationProperty) {
        cdkBuilder.secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration.let(SecretsManagerAccessTokenConfigurationProperty::unwrap))
      }

      /**
       * @param secretsManagerAccessTokenConfiguration AWS Secrets Manager access token
       * configuration parameters.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1866a09a4118eb44d3a715ed2465a6ded5a1a5722f6b6958bdb47e09f0dfe2bf")
      override
          fun secretsManagerAccessTokenConfiguration(secretsManagerAccessTokenConfiguration: SecretsManagerAccessTokenConfigurationProperty.Builder.() -> Unit):
          Unit =
          secretsManagerAccessTokenConfiguration(SecretsManagerAccessTokenConfigurationProperty(secretsManagerAccessTokenConfiguration))

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.AccessConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.AccessConfigurationProperty,
    ) : CdkObject(cdkObject), AccessConfigurationProperty {
      /**
       * The type of authentication used to access content from `HttpConfiguration::BaseUrl` on your
       * source location. Accepted value: `S3_SIGV4` .
       *
       * `S3_SIGV4` - AWS Signature Version 4 authentication for Amazon S3 hosted virtual-style
       * access. If your source location base URL is an Amazon S3 bucket, MediaTailor can use AWS
       * Signature Version 4 (SigV4) authentication to access the bucket where your source content is
       * stored. Your MediaTailor source location baseURL must follow the S3 virtual hosted-style
       * request URL format. For example, https://bucket-name.s3.Region.amazonaws.com/key-name.
       *
       * Before you can use `S3_SIGV4` , you must meet these requirements:
       *
       * • You must allow MediaTailor to access your S3 bucket by granting mediatailor.amazonaws.com
       * principal access in IAM. For information about configuring access in IAM, see Access
       * management in the IAM User Guide.
       *
       * • The mediatailor.amazonaws.com service principal must have permissions to read all top
       * level manifests referenced by the VodSource packaging configurations.
       *
       * • The caller of the API must have s3:GetObject IAM permissions to read all top level
       * manifests referenced by your MediaTailor VodSource packaging configurations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-accessconfiguration.html#cfn-mediatailor-sourcelocation-accessconfiguration-accesstype)
       */
      override fun accessType(): String? = unwrap(this).getAccessType()

      /**
       * AWS Secrets Manager access token configuration parameters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-accessconfiguration.html#cfn-mediatailor-sourcelocation-accessconfiguration-secretsmanageraccesstokenconfiguration)
       */
      override fun secretsManagerAccessTokenConfiguration(): Any? =
          unwrap(this).getSecretsManagerAccessTokenConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocation.AccessConfigurationProperty):
          AccessConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as
          AccessConfigurationProperty

      internal fun unwrap(wrapped: AccessConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.AccessConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnSourceLocation.AccessConfigurationProperty
    }
  }
}
