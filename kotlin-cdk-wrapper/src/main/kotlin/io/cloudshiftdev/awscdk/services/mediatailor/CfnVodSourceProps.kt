@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediatailor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnVodSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediatailor.*;
 * CfnVodSourceProps cfnVodSourceProps = CfnVodSourceProps.builder()
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
public interface CfnVodSourceProps {
  /**
   * The HTTP package configurations for the VOD source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-httppackageconfigurations)
   */
  public fun httpPackageConfigurations(): Any

  /**
   * The name of the source location that the VOD source is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-sourcelocationname)
   */
  public fun sourceLocationName(): String

  /**
   * The tags assigned to the VOD source.
   *
   * Tags are key-value pairs that you can associate with Amazon resources to help with
   * organization, access control, and cost tracking. For more information, see [Tagging AWS Elemental
   * MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the VOD source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-vodsourcename)
   */
  public fun vodSourceName(): String

  /**
   * A builder for [CfnVodSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param httpPackageConfigurations The HTTP package configurations for the VOD source. 
     */
    public fun httpPackageConfigurations(httpPackageConfigurations: IResolvable)

    /**
     * @param httpPackageConfigurations The HTTP package configurations for the VOD source. 
     */
    public fun httpPackageConfigurations(httpPackageConfigurations: List<Any>)

    /**
     * @param httpPackageConfigurations The HTTP package configurations for the VOD source. 
     */
    public fun httpPackageConfigurations(vararg httpPackageConfigurations: Any)

    /**
     * @param sourceLocationName The name of the source location that the VOD source is associated
     * with. 
     */
    public fun sourceLocationName(sourceLocationName: String)

    /**
     * @param tags The tags assigned to the VOD source.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags assigned to the VOD source.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vodSourceName The name of the VOD source. 
     */
    public fun vodSourceName(vodSourceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediatailor.CfnVodSourceProps.Builder =
        software.amazon.awscdk.services.mediatailor.CfnVodSourceProps.builder()

    /**
     * @param httpPackageConfigurations The HTTP package configurations for the VOD source. 
     */
    override fun httpPackageConfigurations(httpPackageConfigurations: IResolvable) {
      cdkBuilder.httpPackageConfigurations(httpPackageConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param httpPackageConfigurations The HTTP package configurations for the VOD source. 
     */
    override fun httpPackageConfigurations(httpPackageConfigurations: List<Any>) {
      cdkBuilder.httpPackageConfigurations(httpPackageConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param httpPackageConfigurations The HTTP package configurations for the VOD source. 
     */
    override fun httpPackageConfigurations(vararg httpPackageConfigurations: Any): Unit =
        httpPackageConfigurations(httpPackageConfigurations.toList())

    /**
     * @param sourceLocationName The name of the source location that the VOD source is associated
     * with. 
     */
    override fun sourceLocationName(sourceLocationName: String) {
      cdkBuilder.sourceLocationName(sourceLocationName)
    }

    /**
     * @param tags The tags assigned to the VOD source.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags assigned to the VOD source.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vodSourceName The name of the VOD source. 
     */
    override fun vodSourceName(vodSourceName: String) {
      cdkBuilder.vodSourceName(vodSourceName)
    }

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnVodSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediatailor.CfnVodSourceProps,
  ) : CdkObject(cdkObject), CfnVodSourceProps {
    /**
     * The HTTP package configurations for the VOD source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-httppackageconfigurations)
     */
    override fun httpPackageConfigurations(): Any = unwrap(this).getHttpPackageConfigurations()

    /**
     * The name of the source location that the VOD source is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-sourcelocationname)
     */
    override fun sourceLocationName(): String = unwrap(this).getSourceLocationName()

    /**
     * The tags assigned to the VOD source.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the VOD source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html#cfn-mediatailor-vodsource-vodsourcename)
     */
    override fun vodSourceName(): String = unwrap(this).getVodSourceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVodSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnVodSourceProps):
        CfnVodSourceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVodSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVodSourceProps):
        software.amazon.awscdk.services.mediatailor.CfnVodSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediatailor.CfnVodSourceProps
  }
}
