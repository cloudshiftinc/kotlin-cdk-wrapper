@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSdiSource`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnSdiSourceProps cfnSdiSourceProps = CfnSdiSourceProps.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .mode("mode")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html)
 */
public interface CfnSdiSourceProps {
  /**
   * The current state of the SdiSource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-mode)
   */
  public fun mode(): String? = unwrap(this).getMode()

  /**
   * The name of the SdiSource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-name)
   */
  public fun name(): String

  /**
   * A collection of key-value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The interface mode of the SdiSource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnSdiSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param mode The current state of the SdiSource.
     */
    public fun mode(mode: String)

    /**
     * @param name The name of the SdiSource. 
     */
    public fun name(name: String)

    /**
     * @param tags A collection of key-value pairs.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A collection of key-value pairs.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param type The interface mode of the SdiSource. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnSdiSourceProps.Builder =
        software.amazon.awscdk.services.medialive.CfnSdiSourceProps.builder()

    /**
     * @param mode The current state of the SdiSource.
     */
    override fun mode(mode: String) {
      cdkBuilder.mode(mode)
    }

    /**
     * @param name The name of the SdiSource. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A collection of key-value pairs.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A collection of key-value pairs.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param type The interface mode of the SdiSource. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.medialive.CfnSdiSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.medialive.CfnSdiSourceProps,
  ) : CdkObject(cdkObject),
      CfnSdiSourceProps {
    /**
     * The current state of the SdiSource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-mode)
     */
    override fun mode(): String? = unwrap(this).getMode()

    /**
     * The name of the SdiSource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A collection of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The interface mode of the SdiSource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-sdisource.html#cfn-medialive-sdisource-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSdiSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnSdiSourceProps):
        CfnSdiSourceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSdiSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSdiSourceProps):
        software.amazon.awscdk.services.medialive.CfnSdiSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.medialive.CfnSdiSourceProps
  }
}
