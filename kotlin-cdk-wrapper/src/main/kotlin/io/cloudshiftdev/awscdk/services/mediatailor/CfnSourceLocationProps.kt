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
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSourceLocation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediatailor.*;
 * CfnSourceLocationProps cfnSourceLocationProps = CfnSourceLocationProps.builder()
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
public interface CfnSourceLocationProps {
  /**
   * The access configuration for the source location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-accessconfiguration)
   */
  public fun accessConfiguration(): Any? = unwrap(this).getAccessConfiguration()

  /**
   * The default segment delivery configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration)
   */
  public fun defaultSegmentDeliveryConfiguration(): Any? =
      unwrap(this).getDefaultSegmentDeliveryConfiguration()

  /**
   * The HTTP configuration for the source location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-httpconfiguration)
   */
  public fun httpConfiguration(): Any

  /**
   * The segment delivery configurations for the source location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfigurations)
   */
  public fun segmentDeliveryConfigurations(): Any? = unwrap(this).getSegmentDeliveryConfigurations()

  /**
   * The name of the source location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-sourcelocationname)
   */
  public fun sourceLocationName(): String

  /**
   * The tags assigned to the source location.
   *
   * Tags are key-value pairs that you can associate with Amazon resources to help with
   * organization, access control, and cost tracking. For more information, see [Tagging AWS Elemental
   * MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSourceLocationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessConfiguration The access configuration for the source location.
     */
    public fun accessConfiguration(accessConfiguration: IResolvable)

    /**
     * @param accessConfiguration The access configuration for the source location.
     */
    public
        fun accessConfiguration(accessConfiguration: CfnSourceLocation.AccessConfigurationProperty)

    /**
     * @param accessConfiguration The access configuration for the source location.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f74dd3aefa72403ebb375768787b7f59169e8e401a466a018570f298fc8a31bf")
    public
        fun accessConfiguration(accessConfiguration: CfnSourceLocation.AccessConfigurationProperty.Builder.() -> Unit)

    /**
     * @param defaultSegmentDeliveryConfiguration The default segment delivery configuration.
     */
    public fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: IResolvable)

    /**
     * @param defaultSegmentDeliveryConfiguration The default segment delivery configuration.
     */
    public
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty)

    /**
     * @param defaultSegmentDeliveryConfiguration The default segment delivery configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e5c48c040286e9f3d71d7ba2fdecde94f836eb08446f0550fc3b05c11e63404")
    public
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty.Builder.() -> Unit)

    /**
     * @param httpConfiguration The HTTP configuration for the source location. 
     */
    public fun httpConfiguration(httpConfiguration: IResolvable)

    /**
     * @param httpConfiguration The HTTP configuration for the source location. 
     */
    public fun httpConfiguration(httpConfiguration: CfnSourceLocation.HttpConfigurationProperty)

    /**
     * @param httpConfiguration The HTTP configuration for the source location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba396087f294b8df731e69300da8ff2e34439ccc24936086a3d503218fda5c1d")
    public
        fun httpConfiguration(httpConfiguration: CfnSourceLocation.HttpConfigurationProperty.Builder.() -> Unit)

    /**
     * @param segmentDeliveryConfigurations The segment delivery configurations for the source
     * location.
     */
    public fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: IResolvable)

    /**
     * @param segmentDeliveryConfigurations The segment delivery configurations for the source
     * location.
     */
    public fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: List<Any>)

    /**
     * @param segmentDeliveryConfigurations The segment delivery configurations for the source
     * location.
     */
    public fun segmentDeliveryConfigurations(vararg segmentDeliveryConfigurations: Any)

    /**
     * @param sourceLocationName The name of the source location. 
     */
    public fun sourceLocationName(sourceLocationName: String)

    /**
     * @param tags The tags assigned to the source location.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags assigned to the source location.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps.Builder =
        software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps.builder()

    /**
     * @param accessConfiguration The access configuration for the source location.
     */
    override fun accessConfiguration(accessConfiguration: IResolvable) {
      cdkBuilder.accessConfiguration(accessConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param accessConfiguration The access configuration for the source location.
     */
    override
        fun accessConfiguration(accessConfiguration: CfnSourceLocation.AccessConfigurationProperty) {
      cdkBuilder.accessConfiguration(accessConfiguration.let(CfnSourceLocation.AccessConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param accessConfiguration The access configuration for the source location.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f74dd3aefa72403ebb375768787b7f59169e8e401a466a018570f298fc8a31bf")
    override
        fun accessConfiguration(accessConfiguration: CfnSourceLocation.AccessConfigurationProperty.Builder.() -> Unit):
        Unit =
        accessConfiguration(CfnSourceLocation.AccessConfigurationProperty(accessConfiguration))

    /**
     * @param defaultSegmentDeliveryConfiguration The default segment delivery configuration.
     */
    override
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: IResolvable) {
      cdkBuilder.defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param defaultSegmentDeliveryConfiguration The default segment delivery configuration.
     */
    override
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty) {
      cdkBuilder.defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration.let(CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param defaultSegmentDeliveryConfiguration The default segment delivery configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e5c48c040286e9f3d71d7ba2fdecde94f836eb08446f0550fc3b05c11e63404")
    override
        fun defaultSegmentDeliveryConfiguration(defaultSegmentDeliveryConfiguration: CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty.Builder.() -> Unit):
        Unit =
        defaultSegmentDeliveryConfiguration(CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty(defaultSegmentDeliveryConfiguration))

    /**
     * @param httpConfiguration The HTTP configuration for the source location. 
     */
    override fun httpConfiguration(httpConfiguration: IResolvable) {
      cdkBuilder.httpConfiguration(httpConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param httpConfiguration The HTTP configuration for the source location. 
     */
    override fun httpConfiguration(httpConfiguration: CfnSourceLocation.HttpConfigurationProperty) {
      cdkBuilder.httpConfiguration(httpConfiguration.let(CfnSourceLocation.HttpConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param httpConfiguration The HTTP configuration for the source location. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba396087f294b8df731e69300da8ff2e34439ccc24936086a3d503218fda5c1d")
    override
        fun httpConfiguration(httpConfiguration: CfnSourceLocation.HttpConfigurationProperty.Builder.() -> Unit):
        Unit = httpConfiguration(CfnSourceLocation.HttpConfigurationProperty(httpConfiguration))

    /**
     * @param segmentDeliveryConfigurations The segment delivery configurations for the source
     * location.
     */
    override fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: IResolvable) {
      cdkBuilder.segmentDeliveryConfigurations(segmentDeliveryConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param segmentDeliveryConfigurations The segment delivery configurations for the source
     * location.
     */
    override fun segmentDeliveryConfigurations(segmentDeliveryConfigurations: List<Any>) {
      cdkBuilder.segmentDeliveryConfigurations(segmentDeliveryConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param segmentDeliveryConfigurations The segment delivery configurations for the source
     * location.
     */
    override fun segmentDeliveryConfigurations(vararg segmentDeliveryConfigurations: Any): Unit =
        segmentDeliveryConfigurations(segmentDeliveryConfigurations.toList())

    /**
     * @param sourceLocationName The name of the source location. 
     */
    override fun sourceLocationName(sourceLocationName: String) {
      cdkBuilder.sourceLocationName(sourceLocationName)
    }

    /**
     * @param tags The tags assigned to the source location.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags assigned to the source location.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps,
  ) : CdkObject(cdkObject),
      CfnSourceLocationProps {
    /**
     * The access configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-accessconfiguration)
     */
    override fun accessConfiguration(): Any? = unwrap(this).getAccessConfiguration()

    /**
     * The default segment delivery configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration)
     */
    override fun defaultSegmentDeliveryConfiguration(): Any? =
        unwrap(this).getDefaultSegmentDeliveryConfiguration()

    /**
     * The HTTP configuration for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-httpconfiguration)
     */
    override fun httpConfiguration(): Any = unwrap(this).getHttpConfiguration()

    /**
     * The segment delivery configurations for the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-segmentdeliveryconfigurations)
     */
    override fun segmentDeliveryConfigurations(): Any? =
        unwrap(this).getSegmentDeliveryConfigurations()

    /**
     * The name of the source location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-sourcelocationname)
     */
    override fun sourceLocationName(): String = unwrap(this).getSourceLocationName()

    /**
     * The tags assigned to the source location.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html#cfn-mediatailor-sourcelocation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSourceLocationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps):
        CfnSourceLocationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSourceLocationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSourceLocationProps):
        software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps
  }
}
