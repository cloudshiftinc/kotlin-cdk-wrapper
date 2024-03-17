@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.memorydb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnParameterGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.memorydb.*;
 * Object parameters;
 * CfnParameterGroupProps cfnParameterGroupProps = CfnParameterGroupProps.builder()
 * .family("family")
 * .parameterGroupName("parameterGroupName")
 * // the properties below are optional
 * .description("description")
 * .parameters(parameters)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html)
 */
public interface CfnParameterGroupProps {
  /**
   * A description of the parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the parameter group family that this parameter group is compatible with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-family)
   */
  public fun family(): String

  /**
   * The name of the parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-parametergroupname)
   */
  public fun parameterGroupName(): String

  /**
   * Returns the detailed parameter list for the parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnParameterGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the parameter group.
     */
    public fun description(description: String)

    /**
     * @param family The name of the parameter group family that this parameter group is compatible
     * with. 
     */
    public fun family(family: String)

    /**
     * @param parameterGroupName The name of the parameter group. 
     */
    public fun parameterGroupName(parameterGroupName: String)

    /**
     * @param parameters Returns the detailed parameter list for the parameter group.
     */
    public fun parameters(parameters: Any)

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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnParameterGroupProps.Builder
        = software.amazon.awscdk.services.memorydb.CfnParameterGroupProps.builder()

    /**
     * @param description A description of the parameter group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param family The name of the parameter group family that this parameter group is compatible
     * with. 
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * @param parameterGroupName The name of the parameter group. 
     */
    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    /**
     * @param parameters Returns the detailed parameter list for the parameter group.
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.memorydb.CfnParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.memorydb.CfnParameterGroupProps,
  ) : CdkObject(cdkObject), CfnParameterGroupProps {
    /**
     * A description of the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the parameter group family that this parameter group is compatible with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-family)
     */
    override fun family(): String = unwrap(this).getFamily()

    /**
     * The name of the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-parametergroupname)
     */
    override fun parameterGroupName(): String = unwrap(this).getParameterGroupName()

    /**
     * Returns the detailed parameter list for the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-parametergroup.html#cfn-memorydb-parametergroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnParameterGroupProps):
        CfnParameterGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnParameterGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnParameterGroupProps):
        software.amazon.awscdk.services.memorydb.CfnParameterGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.memorydb.CfnParameterGroupProps
  }
}
