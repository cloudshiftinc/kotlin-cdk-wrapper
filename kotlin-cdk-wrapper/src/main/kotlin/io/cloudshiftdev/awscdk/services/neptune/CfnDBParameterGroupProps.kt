@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.neptune

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDBParameterGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.neptune.*;
 * Object parameters;
 * CfnDBParameterGroupProps cfnDBParameterGroupProps = CfnDBParameterGroupProps.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html)
 */
public interface CfnDBParameterGroupProps {
  /**
   * Provides the customer-specified description for this DB parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-description)
   */
  public fun description(): String

  /**
   * Must be `neptune1` for engine versions prior to
   * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html) , or
   * `neptune1.2` for engine version `1.2.0.0` and higher.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-family)
   */
  public fun family(): String

  /**
   * Provides the name of the DB parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The parameters to set for this DB parameter group.
   *
   * The parameters are expressed as a JSON object consisting of key-value pairs.
   *
   * Changes to dynamic parameters are applied immediately. During an update, if you have static
   * parameters (whether they were changed or not), it triggers AWS CloudFormation to reboot the
   * associated DB instance without failover.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-parameters)
   */
  public fun parameters(): Any

  /**
   * The tags that you want to attach to this parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDBParameterGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description Provides the customer-specified description for this DB parameter group. 
     */
    public fun description(description: String)

    /**
     * @param family Must be `neptune1` for engine versions prior to
     * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html) ,
     * or `neptune1.2` for engine version `1.2.0.0` and higher. 
     */
    public fun family(family: String)

    /**
     * @param name Provides the name of the DB parameter group.
     */
    public fun name(name: String)

    /**
     * @param parameters The parameters to set for this DB parameter group. 
     * The parameters are expressed as a JSON object consisting of key-value pairs.
     *
     * Changes to dynamic parameters are applied immediately. During an update, if you have static
     * parameters (whether they were changed or not), it triggers AWS CloudFormation to reboot the
     * associated DB instance without failover.
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
    private val cdkBuilder: software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps.Builder
        = software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps.builder()

    /**
     * @param description Provides the customer-specified description for this DB parameter group. 
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
     * @param name Provides the name of the DB parameter group.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parameters The parameters to set for this DB parameter group. 
     * The parameters are expressed as a JSON object consisting of key-value pairs.
     *
     * Changes to dynamic parameters are applied immediately. During an update, if you have static
     * parameters (whether they were changed or not), it triggers AWS CloudFormation to reboot the
     * associated DB instance without failover.
     */
    override fun parameters(parameters: Any) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param tags The tags that you want to attach to this parameter group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags that you want to attach to this parameter group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps,
  ) : CdkObject(cdkObject), CfnDBParameterGroupProps {
    /**
     * Provides the customer-specified description for this DB parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * Must be `neptune1` for engine versions prior to
     * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html) ,
     * or `neptune1.2` for engine version `1.2.0.0` and higher.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-family)
     */
    override fun family(): String = unwrap(this).getFamily()

    /**
     * Provides the name of the DB parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The parameters to set for this DB parameter group.
     *
     * The parameters are expressed as a JSON object consisting of key-value pairs.
     *
     * Changes to dynamic parameters are applied immediately. During an update, if you have static
     * parameters (whether they were changed or not), it triggers AWS CloudFormation to reboot the
     * associated DB instance without failover.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-parameters)
     */
    override fun parameters(): Any = unwrap(this).getParameters()

    /**
     * The tags that you want to attach to this parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbparametergroup.html#cfn-neptune-dbparametergroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDBParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps):
        CfnDBParameterGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDBParameterGroupProps):
        software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps
  }
}
