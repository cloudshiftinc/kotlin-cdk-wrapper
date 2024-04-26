@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kafkaconnect

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
 * Properties for defining a `CfnCustomPlugin`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kafkaconnect.*;
 * CfnCustomPluginProps cfnCustomPluginProps = CfnCustomPluginProps.builder()
 * .contentType("contentType")
 * .location(CustomPluginLocationProperty.builder()
 * .s3Location(S3LocationProperty.builder()
 * .bucketArn("bucketArn")
 * .fileKey("fileKey")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .build())
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html)
 */
public interface CfnCustomPluginProps {
  /**
   * The format of the plugin file.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-contenttype)
   */
  public fun contentType(): String

  /**
   * The description of the custom plugin.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Information about the location of the custom plugin.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-location)
   */
  public fun location(): Any

  /**
   * The name of the custom plugin.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-name)
   */
  public fun name(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnCustomPluginProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contentType The format of the plugin file. 
     */
    public fun contentType(contentType: String)

    /**
     * @param description The description of the custom plugin.
     */
    public fun description(description: String)

    /**
     * @param location Information about the location of the custom plugin. 
     */
    public fun location(location: IResolvable)

    /**
     * @param location Information about the location of the custom plugin. 
     */
    public fun location(location: CfnCustomPlugin.CustomPluginLocationProperty)

    /**
     * @param location Information about the location of the custom plugin. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f987cbcc34e5cdbe403b944c32efdc58a60053f9e0f6b350b51e1373d99a2af")
    public fun location(location: CfnCustomPlugin.CustomPluginLocationProperty.Builder.() -> Unit)

    /**
     * @param name The name of the custom plugin. 
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kafkaconnect.CfnCustomPluginProps.Builder =
        software.amazon.awscdk.services.kafkaconnect.CfnCustomPluginProps.builder()

    /**
     * @param contentType The format of the plugin file. 
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * @param description The description of the custom plugin.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param location Information about the location of the custom plugin. 
     */
    override fun location(location: IResolvable) {
      cdkBuilder.location(location.let(IResolvable::unwrap))
    }

    /**
     * @param location Information about the location of the custom plugin. 
     */
    override fun location(location: CfnCustomPlugin.CustomPluginLocationProperty) {
      cdkBuilder.location(location.let(CfnCustomPlugin.CustomPluginLocationProperty::unwrap))
    }

    /**
     * @param location Information about the location of the custom plugin. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f987cbcc34e5cdbe403b944c32efdc58a60053f9e0f6b350b51e1373d99a2af")
    override
        fun location(location: CfnCustomPlugin.CustomPluginLocationProperty.Builder.() -> Unit):
        Unit = location(CfnCustomPlugin.CustomPluginLocationProperty(location))

    /**
     * @param name The name of the custom plugin. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kafkaconnect.CfnCustomPluginProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnCustomPluginProps,
  ) : CdkObject(cdkObject), CfnCustomPluginProps {
    /**
     * The format of the plugin file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-contenttype)
     */
    override fun contentType(): String = unwrap(this).getContentType()

    /**
     * The description of the custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Information about the location of the custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-location)
     */
    override fun location(): Any = unwrap(this).getLocation()

    /**
     * The name of the custom plugin.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kafkaconnect-customplugin.html#cfn-kafkaconnect-customplugin-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomPluginProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kafkaconnect.CfnCustomPluginProps):
        CfnCustomPluginProps = CdkObjectWrappers.wrap(cdkObject) as? CfnCustomPluginProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomPluginProps):
        software.amazon.awscdk.services.kafkaconnect.CfnCustomPluginProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kafkaconnect.CfnCustomPluginProps
  }
}
