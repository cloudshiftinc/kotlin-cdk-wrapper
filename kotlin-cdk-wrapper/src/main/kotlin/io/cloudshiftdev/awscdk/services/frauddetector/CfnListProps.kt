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
 * Properties for defining a `CfnList`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.frauddetector.*;
 * CfnListProps cfnListProps = CfnListProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .elements(List.of("elements"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .variableType("variableType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-list.html)
 */
public interface CfnListProps {
  /**
   * The description of the list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-list.html#cfn-frauddetector-list-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The elements in the list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-list.html#cfn-frauddetector-list-elements)
   */
  public fun elements(): List<String> = unwrap(this).getElements() ?: emptyList()

  /**
   * The name of the list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-list.html#cfn-frauddetector-list-name)
   */
  public fun name(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-list.html#cfn-frauddetector-list-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The variable type of the list.
   *
   * For more information, see [Variable
   * types](https://docs.aws.amazon.com/frauddetector/latest/ug/variables.html#variable-types)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-list.html#cfn-frauddetector-list-variabletype)
   */
  public fun variableType(): String? = unwrap(this).getVariableType()

  /**
   * A builder for [CfnListProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the list.
     */
    public fun description(description: String)

    /**
     * @param elements The elements in the list.
     */
    public fun elements(elements: List<String>)

    /**
     * @param elements The elements in the list.
     */
    public fun elements(vararg elements: String)

    /**
     * @param name The name of the list. 
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param variableType The variable type of the list.
     * For more information, see [Variable
     * types](https://docs.aws.amazon.com/frauddetector/latest/ug/variables.html#variable-types)
     */
    public fun variableType(variableType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnListProps.Builder =
        software.amazon.awscdk.services.frauddetector.CfnListProps.builder()

    /**
     * @param description The description of the list.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param elements The elements in the list.
     */
    override fun elements(elements: List<String>) {
      cdkBuilder.elements(elements)
    }

    /**
     * @param elements The elements in the list.
     */
    override fun elements(vararg elements: String): Unit = elements(elements.toList())

    /**
     * @param name The name of the list. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param variableType The variable type of the list.
     * For more information, see [Variable
     * types](https://docs.aws.amazon.com/frauddetector/latest/ug/variables.html#variable-types)
     */
    override fun variableType(variableType: String) {
      cdkBuilder.variableType(variableType)
    }

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnListProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.frauddetector.CfnListProps,
  ) : CdkObject(cdkObject),
      CfnListProps {
    /**
     * The description of the list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-list.html#cfn-frauddetector-list-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The elements in the list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-list.html#cfn-frauddetector-list-elements)
     */
    override fun elements(): List<String> = unwrap(this).getElements() ?: emptyList()

    /**
     * The name of the list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-list.html#cfn-frauddetector-list-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-list.html#cfn-frauddetector-list-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The variable type of the list.
     *
     * For more information, see [Variable
     * types](https://docs.aws.amazon.com/frauddetector/latest/ug/variables.html#variable-types)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-list.html#cfn-frauddetector-list-variabletype)
     */
    override fun variableType(): String? = unwrap(this).getVariableType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnListProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnListProps):
        CfnListProps = CdkObjectWrappers.wrap(cdkObject) as? CfnListProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnListProps):
        software.amazon.awscdk.services.frauddetector.CfnListProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.frauddetector.CfnListProps
  }
}
