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
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The VOD source configuration parameters.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediatailor.*;
 * CfnVodSource cfnVodSource = CfnVodSource.Builder.create(this, "MyCfnVodSource")
 * .httpPackageConfigurations(List.of(HttpPackageConfigurationProperty.builder()
 * .path("path")
 * .sourceGroup("sourceGroup")
 * .type("type")
 * .build()))
 * .sourceLocationName("sourceLocationName")
 * .vodSourceName("vodSourceName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html)
 */
public open class CfnVodSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediatailor.CfnVodSource,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The ARN of the VOD source.</p>.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The HTTP package configurations for the VOD source.
   */
  public open fun httpPackageConfigurations(): Any = unwrap(this).getHttpPackageConfigurations()

  /**
   * The HTTP package configurations for the VOD source.
   */
  public open fun httpPackageConfigurations(`value`: IResolvable) {
    unwrap(this).setHttpPackageConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * The HTTP package configurations for the VOD source.
   */
  public open fun httpPackageConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setHttpPackageConfigurations(__idx_ac66f0)
  }

  /**
   * The HTTP package configurations for the VOD source.
   */
  public open fun httpPackageConfigurations(vararg __idx_ac66f0: Any): Unit =
      httpPackageConfigurations(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the source location that the VOD source is associated with.
   */
  public open fun sourceLocationName(): String = unwrap(this).getSourceLocationName()

  /**
   * The name of the source location that the VOD source is associated with.
   */
  public open fun sourceLocationName(`value`: String) {
    unwrap(this).setSourceLocationName(`value`)
  }

  /**
   * The tags assigned to the VOD source.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags assigned to the VOD source.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags assigned to the VOD source.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The name of the VOD source.
   */
  public open fun vodSourceName(): String = unwrap(this).getVodSourceName()

  /**
   * The name of the VOD source.
   */
  public open fun vodSourceName(`value`: String) {
    unwrap(this).setVodSourceName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediatailor.CfnVodSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The HTTP package configurations for the VOD source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-httppackageconfigurations)
     * @param httpPackageConfigurations The HTTP package configurations for the VOD source. 
     */
    public fun httpPackageConfigurations(httpPackageConfigurations: IResolvable)

    /**
     * The HTTP package configurations for the VOD source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-httppackageconfigurations)
     * @param httpPackageConfigurations The HTTP package configurations for the VOD source. 
     */
    public fun httpPackageConfigurations(httpPackageConfigurations: List<Any>)

    /**
     * The HTTP package configurations for the VOD source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-httppackageconfigurations)
     * @param httpPackageConfigurations The HTTP package configurations for the VOD source. 
     */
    public fun httpPackageConfigurations(vararg httpPackageConfigurations: Any)

    /**
     * The name of the source location that the VOD source is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-sourcelocationname)
     * @param sourceLocationName The name of the source location that the VOD source is associated
     * with. 
     */
    public fun sourceLocationName(sourceLocationName: String)

    /**
     * The tags assigned to the VOD source.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-tags)
     * @param tags The tags assigned to the VOD source. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags assigned to the VOD source.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-tags)
     * @param tags The tags assigned to the VOD source. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the VOD source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-vodsourcename)
     * @param vodSourceName The name of the VOD source. 
     */
    public fun vodSourceName(vodSourceName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediatailor.CfnVodSource.Builder =
        software.amazon.awscdk.services.mediatailor.CfnVodSource.Builder.create(scope, id)

    /**
     * The HTTP package configurations for the VOD source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-httppackageconfigurations)
     * @param httpPackageConfigurations The HTTP package configurations for the VOD source. 
     */
    override fun httpPackageConfigurations(httpPackageConfigurations: IResolvable) {
      cdkBuilder.httpPackageConfigurations(httpPackageConfigurations.let(IResolvable::unwrap))
    }

    /**
     * The HTTP package configurations for the VOD source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-httppackageconfigurations)
     * @param httpPackageConfigurations The HTTP package configurations for the VOD source. 
     */
    override fun httpPackageConfigurations(httpPackageConfigurations: List<Any>) {
      cdkBuilder.httpPackageConfigurations(httpPackageConfigurations)
    }

    /**
     * The HTTP package configurations for the VOD source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-httppackageconfigurations)
     * @param httpPackageConfigurations The HTTP package configurations for the VOD source. 
     */
    override fun httpPackageConfigurations(vararg httpPackageConfigurations: Any): Unit =
        httpPackageConfigurations(httpPackageConfigurations.toList())

    /**
     * The name of the source location that the VOD source is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-sourcelocationname)
     * @param sourceLocationName The name of the source location that the VOD source is associated
     * with. 
     */
    override fun sourceLocationName(sourceLocationName: String) {
      cdkBuilder.sourceLocationName(sourceLocationName)
    }

    /**
     * The tags assigned to the VOD source.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-tags)
     * @param tags The tags assigned to the VOD source. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags assigned to the VOD source.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-tags)
     * @param tags The tags assigned to the VOD source. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the VOD source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-vodsourcename)
     * @param vodSourceName The name of the VOD source. 
     */
    override fun vodSourceName(vodSourceName: String) {
      cdkBuilder.vodSourceName(vodSourceName)
    }

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnVodSource =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediatailor.CfnVodSource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVodSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVodSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnVodSource):
        CfnVodSource = CfnVodSource(cdkObject)

    internal fun unwrap(wrapped: CfnVodSource):
        software.amazon.awscdk.services.mediatailor.CfnVodSource = wrapped.cdkObject
  }

  /**
   * The HTTP package configuration properties for the requested VOD source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediatailor.*;
   * HttpPackageConfigurationProperty httpPackageConfigurationProperty =
   * HttpPackageConfigurationProperty.builder()
   * .path("path")
   * .sourceGroup("sourceGroup")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-vodsource-httppackageconfiguration.html)
   */
  public interface HttpPackageConfigurationProperty {
    /**
     * The relative path to the URL for this VOD source.
     *
     * This is combined with `SourceLocation::HttpConfiguration::BaseUrl` to form a valid URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-vodsource-httppackageconfiguration.html#cfn-mediatailor-vodsource-httppackageconfiguration-path)
     */
    public fun path(): String

    /**
     * The name of the source group.
     *
     * This has to match one of the `Channel::Outputs::SourceGroup` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-vodsource-httppackageconfiguration.html#cfn-mediatailor-vodsource-httppackageconfiguration-sourcegroup)
     */
    public fun sourceGroup(): String

    /**
     * The streaming protocol for this package configuration.
     *
     * Supported values are `HLS` and `DASH` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-vodsource-httppackageconfiguration.html#cfn-mediatailor-vodsource-httppackageconfiguration-type)
     */
    public fun type(): String

    /**
     * A builder for [HttpPackageConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param path The relative path to the URL for this VOD source. 
       * This is combined with `SourceLocation::HttpConfiguration::BaseUrl` to form a valid URL.
       */
      public fun path(path: String)

      /**
       * @param sourceGroup The name of the source group. 
       * This has to match one of the `Channel::Outputs::SourceGroup` .
       */
      public fun sourceGroup(sourceGroup: String)

      /**
       * @param type The streaming protocol for this package configuration. 
       * Supported values are `HLS` and `DASH` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnVodSource.HttpPackageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnVodSource.HttpPackageConfigurationProperty.builder()

      /**
       * @param path The relative path to the URL for this VOD source. 
       * This is combined with `SourceLocation::HttpConfiguration::BaseUrl` to form a valid URL.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      /**
       * @param sourceGroup The name of the source group. 
       * This has to match one of the `Channel::Outputs::SourceGroup` .
       */
      override fun sourceGroup(sourceGroup: String) {
        cdkBuilder.sourceGroup(sourceGroup)
      }

      /**
       * @param type The streaming protocol for this package configuration. 
       * Supported values are `HLS` and `DASH` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnVodSource.HttpPackageConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnVodSource.HttpPackageConfigurationProperty,
    ) : CdkObject(cdkObject), HttpPackageConfigurationProperty {
      /**
       * The relative path to the URL for this VOD source.
       *
       * This is combined with `SourceLocation::HttpConfiguration::BaseUrl` to form a valid URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-vodsource-httppackageconfiguration.html#cfn-mediatailor-vodsource-httppackageconfiguration-path)
       */
      override fun path(): String = unwrap(this).getPath()

      /**
       * The name of the source group.
       *
       * This has to match one of the `Channel::Outputs::SourceGroup` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-vodsource-httppackageconfiguration.html#cfn-mediatailor-vodsource-httppackageconfiguration-sourcegroup)
       */
      override fun sourceGroup(): String = unwrap(this).getSourceGroup()

      /**
       * The streaming protocol for this package configuration.
       *
       * Supported values are `HLS` and `DASH` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-vodsource-httppackageconfiguration.html#cfn-mediatailor-vodsource-httppackageconfiguration-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpPackageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnVodSource.HttpPackageConfigurationProperty):
          HttpPackageConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpPackageConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnVodSource.HttpPackageConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnVodSource.HttpPackageConfigurationProperty
    }
  }
}
