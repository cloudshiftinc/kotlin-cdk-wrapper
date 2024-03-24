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
 * Properties for defining a `CfnLiveSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediatailor.*;
 * CfnLiveSourceProps cfnLiveSourceProps = CfnLiveSourceProps.builder()
 * .httpPackageConfigurations(List.of(HttpPackageConfigurationProperty.builder()
 * .path("path")
 * .sourceGroup("sourceGroup")
 * .type("type")
 * .build()))
 * .liveSourceName("liveSourceName")
 * .sourceLocationName("sourceLocationName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html)
 */
public interface CfnLiveSourceProps {
  /**
   * The HTTP package configurations for the live source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html#cfn-mediatailor-livesource-httppackageconfigurations)
   */
  public fun httpPackageConfigurations(): Any

  /**
   * The name that's used to refer to a live source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html#cfn-mediatailor-livesource-livesourcename)
   */
  public fun liveSourceName(): String

  /**
   * The name of the source location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html#cfn-mediatailor-livesource-sourcelocationname)
   */
  public fun sourceLocationName(): String

  /**
   * The tags assigned to the live source.
   *
   * Tags are key-value pairs that you can associate with Amazon resources to help with
   * organization, access control, and cost tracking. For more information, see [Tagging AWS Elemental
   * MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html#cfn-mediatailor-livesource-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLiveSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param httpPackageConfigurations The HTTP package configurations for the live source. 
     */
    public fun httpPackageConfigurations(httpPackageConfigurations: IResolvable)

    /**
     * @param httpPackageConfigurations The HTTP package configurations for the live source. 
     */
    public fun httpPackageConfigurations(httpPackageConfigurations: List<Any>)

    /**
     * @param httpPackageConfigurations The HTTP package configurations for the live source. 
     */
    public fun httpPackageConfigurations(vararg httpPackageConfigurations: Any)

    /**
     * @param liveSourceName The name that's used to refer to a live source. 
     */
    public fun liveSourceName(liveSourceName: String)

    /**
     * @param sourceLocationName The name of the source location. 
     */
    public fun sourceLocationName(sourceLocationName: String)

    /**
     * @param tags The tags assigned to the live source.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags assigned to the live source.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps.Builder =
        software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps.builder()

    /**
     * @param httpPackageConfigurations The HTTP package configurations for the live source. 
     */
    override fun httpPackageConfigurations(httpPackageConfigurations: IResolvable) {
      cdkBuilder.httpPackageConfigurations(httpPackageConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param httpPackageConfigurations The HTTP package configurations for the live source. 
     */
    override fun httpPackageConfigurations(httpPackageConfigurations: List<Any>) {
      cdkBuilder.httpPackageConfigurations(httpPackageConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param httpPackageConfigurations The HTTP package configurations for the live source. 
     */
    override fun httpPackageConfigurations(vararg httpPackageConfigurations: Any): Unit =
        httpPackageConfigurations(httpPackageConfigurations.toList())

    /**
     * @param liveSourceName The name that's used to refer to a live source. 
     */
    override fun liveSourceName(liveSourceName: String) {
      cdkBuilder.liveSourceName(liveSourceName)
    }

    /**
     * @param sourceLocationName The name of the source location. 
     */
    override fun sourceLocationName(sourceLocationName: String) {
      cdkBuilder.sourceLocationName(sourceLocationName)
    }

    /**
     * @param tags The tags assigned to the live source.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags assigned to the live source.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps,
  ) : CdkObject(cdkObject), CfnLiveSourceProps {
    /**
     * The HTTP package configurations for the live source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html#cfn-mediatailor-livesource-httppackageconfigurations)
     */
    override fun httpPackageConfigurations(): Any = unwrap(this).getHttpPackageConfigurations()

    /**
     * The name that's used to refer to a live source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html#cfn-mediatailor-livesource-livesourcename)
     */
    override fun liveSourceName(): String = unwrap(this).getLiveSourceName()

    /**
     * The name of the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html#cfn-mediatailor-livesource-sourcelocationname)
     */
    override fun sourceLocationName(): String = unwrap(this).getSourceLocationName()

    /**
     * The tags assigned to the live source.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html#cfn-mediatailor-livesource-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLiveSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps):
        CfnLiveSourceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLiveSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLiveSourceProps):
        software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps
  }
}
