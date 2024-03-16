@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dax

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnParameterGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.dax.*;
 * Object parameterNameValues;
 * CfnParameterGroupProps cfnParameterGroupProps = CfnParameterGroupProps.builder()
 * .description("description")
 * .parameterGroupName("parameterGroupName")
 * .parameterNameValues(parameterNameValues)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html)
 */
public interface CfnParameterGroupProps {
  /**
   * A description of the parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parametergroupname)
   */
  public fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

  /**
   * An array of name-value pairs for the parameters in the group.
   *
   * Each element in the array represents a single parameter.
   *
   *
   * `record-ttl-millis` and `query-ttl-millis` are the only supported parameter names. For more
   * details, see [Configuring TTL
   * Settings](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.cluster-management.html#DAX.cluster-management.custom-settings.ttl)
   * .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parameternamevalues)
   */
  public fun parameterNameValues(): Any? = unwrap(this).getParameterNameValues()

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
     * @param parameterGroupName The name of the parameter group.
     */
    public fun parameterGroupName(parameterGroupName: String)

    /**
     * @param parameterNameValues An array of name-value pairs for the parameters in the group.
     * Each element in the array represents a single parameter.
     *
     *
     * `record-ttl-millis` and `query-ttl-millis` are the only supported parameter names. For more
     * details, see [Configuring TTL
     * Settings](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.cluster-management.html#DAX.cluster-management.custom-settings.ttl)
     * .
     */
    public fun parameterNameValues(parameterNameValues: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dax.CfnParameterGroupProps.Builder =
        software.amazon.awscdk.services.dax.CfnParameterGroupProps.builder()

    /**
     * @param description A description of the parameter group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param parameterGroupName The name of the parameter group.
     */
    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    /**
     * @param parameterNameValues An array of name-value pairs for the parameters in the group.
     * Each element in the array represents a single parameter.
     *
     *
     * `record-ttl-millis` and `query-ttl-millis` are the only supported parameter names. For more
     * details, see [Configuring TTL
     * Settings](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.cluster-management.html#DAX.cluster-management.custom-settings.ttl)
     * .
     */
    override fun parameterNameValues(parameterNameValues: Any) {
      cdkBuilder.parameterNameValues(parameterNameValues)
    }

    public fun build(): software.amazon.awscdk.services.dax.CfnParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dax.CfnParameterGroupProps,
  ) : CdkObject(cdkObject), CfnParameterGroupProps {
    /**
     * A description of the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parametergroupname)
     */
    override fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

    /**
     * An array of name-value pairs for the parameters in the group.
     *
     * Each element in the array represents a single parameter.
     *
     *
     * `record-ttl-millis` and `query-ttl-millis` are the only supported parameter names. For more
     * details, see [Configuring TTL
     * Settings](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/DAX.cluster-management.html#DAX.cluster-management.custom-settings.ttl)
     * .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dax-parametergroup.html#cfn-dax-parametergroup-parameternamevalues)
     */
    override fun parameterNameValues(): Any? = unwrap(this).getParameterNameValues()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dax.CfnParameterGroupProps):
        CfnParameterGroupProps = CdkObjectWrappers.wrap(cdkObject) as CfnParameterGroupProps

    internal fun unwrap(wrapped: CfnParameterGroupProps):
        software.amazon.awscdk.services.dax.CfnParameterGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.dax.CfnParameterGroupProps
  }
}
