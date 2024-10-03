@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.neptune

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDBClusterParameterGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.neptune.*;
 * Object parameters;
 * CfnDBClusterParameterGroupProps cfnDBClusterParameterGroupProps =
 * CfnDBClusterParameterGroupProps.builder()
 * .description("description")
 * .family("family")
 * .parameters(parameters)
 * // the properties below are optional
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html)
 */
public interface CfnDBClusterParameterGroupProps {
  /**
   * Provides the customer-specified description for this DB cluster parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-description)
   */
  public fun description(): String

  /**
   * Must be `neptune1` for engine versions prior to
   * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html) , or
   * `neptune1.2` for engine version `1.2.0.0` and higher.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-family)
   */
  public fun family(): String

  /**
   * Provides the name of the DB cluster parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The parameters to set for this DB cluster parameter group.
   *
   * The parameters are expressed as a JSON object consisting of key-value pairs.
   *
   * If you update the parameters, some interruption may occur depending on which parameters you
   * update.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-parameters)
   */
  public fun parameters(): Any

  /**
   * The tags that you want to attach to this parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDBClusterParameterGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description Provides the customer-specified description for this DB cluster parameter
     * group. 
     */
    public fun description(description: String)

    /**
     * @param family Must be `neptune1` for engine versions prior to
     * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html) ,
     * or `neptune1.2` for engine version `1.2.0.0` and higher. 
     */
    public fun family(family: String)

    /**
     * @param name Provides the name of the DB cluster parameter group.
     */
    public fun name(name: String)

    /**
     * @param parameters The parameters to set for this DB cluster parameter group. 
     * The parameters are expressed as a JSON object consisting of key-value pairs.
     *
     * If you update the parameters, some interruption may occur depending on which parameters you
     * update.
     */
    public fun parameters(parameters: Any)

    /**
     * @param tags The tags that you want to attach to this parameter group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags that you want to attach to this parameter group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps.Builder =
        software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps.builder()

    /**
     * @param description Provides the customer-specified description for this DB cluster parameter
     * group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param family Must be `neptune1` for engine versions prior to
     * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html) ,
     * or `neptune1.2` for engine version `1.2.0.0` and higher. 
     */
    override fun family(family: String) {
      cdkBuilder.family(family)
    }

    /**
     * @param name Provides the name of the DB cluster parameter group.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parameters The parameters to set for this DB cluster parameter group. 
     * The parameters are expressed as a JSON object consisting of key-value pairs.
     *
     * If you update the parameters, some interruption may occur depending on which parameters you
     * update.
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param tags The tags that you want to attach to this parameter group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags that you want to attach to this parameter group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps,
  ) : CdkObject(cdkObject),
      CfnDBClusterParameterGroupProps {
    /**
     * Provides the customer-specified description for this DB cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * Must be `neptune1` for engine versions prior to
     * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html) ,
     * or `neptune1.2` for engine version `1.2.0.0` and higher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-family)
     */
    override fun family(): String = unwrap(this).getFamily()

    /**
     * Provides the name of the DB cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The parameters to set for this DB cluster parameter group.
     *
     * The parameters are expressed as a JSON object consisting of key-value pairs.
     *
     * If you update the parameters, some interruption may occur depending on which parameters you
     * update.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-parameters)
     */
    override fun parameters(): Any = unwrap(this).getParameters()

    /**
     * The tags that you want to attach to this parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbclusterparametergroup.html#cfn-neptune-dbclusterparametergroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBClusterParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps):
        CfnDBClusterParameterGroupProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnDBClusterParameterGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBClusterParameterGroupProps):
        software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.neptune.CfnDBClusterParameterGroupProps
  }
}
