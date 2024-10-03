@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eventschemas

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRegistry`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eventschemas.*;
 * CfnRegistryProps cfnRegistryProps = CfnRegistryProps.builder()
 * .description("description")
 * .registryName("registryName")
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registry.html)
 */
public interface CfnRegistryProps {
  /**
   * A description of the registry to be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registry.html#cfn-eventschemas-registry-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the schema registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registry.html#cfn-eventschemas-registry-registryname)
   */
  public fun registryName(): String? = unwrap(this).getRegistryName()

  /**
   * Tags to associate with the registry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registry.html#cfn-eventschemas-registry-tags)
   */
  public fun tags(): List<CfnRegistry.TagsEntryProperty> =
      unwrap(this).getTags()?.map(CfnRegistry.TagsEntryProperty::wrap) ?: emptyList()

  /**
   * A builder for [CfnRegistryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the registry to be created.
     */
    public fun description(description: String)

    /**
     * @param registryName The name of the schema registry.
     */
    public fun registryName(registryName: String)

    /**
     * @param tags Tags to associate with the registry.
     */
    public fun tags(tags: List<CfnRegistry.TagsEntryProperty>)

    /**
     * @param tags Tags to associate with the registry.
     */
    public fun tags(vararg tags: CfnRegistry.TagsEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eventschemas.CfnRegistryProps.Builder =
        software.amazon.awscdk.services.eventschemas.CfnRegistryProps.builder()

    /**
     * @param description A description of the registry to be created.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param registryName The name of the schema registry.
     */
    override fun registryName(registryName: String) {
      cdkBuilder.registryName(registryName)
    }

    /**
     * @param tags Tags to associate with the registry.
     */
    override fun tags(tags: List<CfnRegistry.TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(CfnRegistry.TagsEntryProperty.Companion::unwrap))
    }

    /**
     * @param tags Tags to associate with the registry.
     */
    override fun tags(vararg tags: CfnRegistry.TagsEntryProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.eventschemas.CfnRegistryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eventschemas.CfnRegistryProps,
  ) : CdkObject(cdkObject),
      CfnRegistryProps {
    /**
     * A description of the registry to be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registry.html#cfn-eventschemas-registry-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the schema registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registry.html#cfn-eventschemas-registry-registryname)
     */
    override fun registryName(): String? = unwrap(this).getRegistryName()

    /**
     * Tags to associate with the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-registry.html#cfn-eventschemas-registry-tags)
     */
    override fun tags(): List<CfnRegistry.TagsEntryProperty> =
        unwrap(this).getTags()?.map(CfnRegistry.TagsEntryProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRegistryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eventschemas.CfnRegistryProps):
        CfnRegistryProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRegistryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRegistryProps):
        software.amazon.awscdk.services.eventschemas.CfnRegistryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eventschemas.CfnRegistryProps
  }
}
