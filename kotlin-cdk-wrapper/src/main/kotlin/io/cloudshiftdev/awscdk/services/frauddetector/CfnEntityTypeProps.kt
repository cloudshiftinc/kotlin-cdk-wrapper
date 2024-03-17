@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.frauddetector

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnEntityType`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.frauddetector.*;
 * CfnEntityTypeProps cfnEntityTypeProps = CfnEntityTypeProps.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-entitytype.html)
 */
public interface CfnEntityTypeProps {
  /**
   * The entity type description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-entitytype.html#cfn-frauddetector-entitytype-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The entity type name.
   *
   * Pattern: `^[0-9a-z_-]+$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-entitytype.html#cfn-frauddetector-entitytype-name)
   */
  public fun name(): String

  /**
   * A key and value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-entitytype.html#cfn-frauddetector-entitytype-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEntityTypeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The entity type description.
     */
    public fun description(description: String)

    /**
     * @param name The entity type name. 
     * Pattern: `^[0-9a-z_-]+$`
     */
    public fun name(name: String)

    /**
     * @param tags A key and value pair.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A key and value pair.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnEntityTypeProps.Builder
        = software.amazon.awscdk.services.frauddetector.CfnEntityTypeProps.builder()

    /**
     * @param description The entity type description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The entity type name. 
     * Pattern: `^[0-9a-z_-]+$`
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A key and value pair.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A key and value pair.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnEntityTypeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.frauddetector.CfnEntityTypeProps,
  ) : CdkObject(cdkObject), CfnEntityTypeProps {
    /**
     * The entity type description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-entitytype.html#cfn-frauddetector-entitytype-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The entity type name.
     *
     * Pattern: `^[0-9a-z_-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-entitytype.html#cfn-frauddetector-entitytype-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A key and value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-entitytype.html#cfn-frauddetector-entitytype-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEntityTypeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnEntityTypeProps):
        CfnEntityTypeProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEntityTypeProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEntityTypeProps):
        software.amazon.awscdk.services.frauddetector.CfnEntityTypeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.frauddetector.CfnEntityTypeProps
  }
}
