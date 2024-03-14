package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnClusterParameterGroupProps {
  /**
   * The description of the parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-description)
   */
  public fun description(): String

  /**
   * The name of the cluster parameter group family that this cluster parameter group is compatible
   * with.
   *
   * You can create a custom parameter group and then associate your cluster with it. For more
   * information, see [Amazon Redshift parameter
   * groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parametergroupfamily)
   */
  public fun parameterGroupFamily(): String

  /**
   * The name of the cluster parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parametergroupname)
   */
  public fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

  /**
   * An array of parameters to be modified. A maximum of 20 parameters can be modified in a single
   * request.
   *
   * For each parameter to be modified, you must supply at least the parameter name and parameter
   * value; other name-value pairs of the parameter are optional.
   *
   * For the workload management (WLM) configuration, you must supply all the name-value pairs in
   * the wlm_json_configuration parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parameters)
   */
  public fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * The list of tags for the cluster parameter group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnClusterParameterGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the parameter group. 
     */
    public fun description(description: String)

    /**
     * @param parameterGroupFamily The name of the cluster parameter group family that this cluster
     * parameter group is compatible with. 
     * You can create a custom parameter group and then associate your cluster with it. For more
     * information, see [Amazon Redshift parameter
     * groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html) .
     */
    public fun parameterGroupFamily(parameterGroupFamily: String)

    /**
     * @param parameterGroupName The name of the cluster parameter group.
     */
    public fun parameterGroupName(parameterGroupName: String)

    /**
     * @param parameters An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request.
     * For each parameter to be modified, you must supply at least the parameter name and parameter
     * value; other name-value pairs of the parameter are optional.
     *
     * For the workload management (WLM) configuration, you must supply all the name-value pairs in
     * the wlm_json_configuration parameter.
     */
    public fun parameters(parameters: IResolvable)

    /**
     * @param parameters An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request.
     * For each parameter to be modified, you must supply at least the parameter name and parameter
     * value; other name-value pairs of the parameter are optional.
     *
     * For the workload management (WLM) configuration, you must supply all the name-value pairs in
     * the wlm_json_configuration parameter.
     */
    public fun parameters(parameters: List<Any>)

    /**
     * @param parameters An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request.
     * For each parameter to be modified, you must supply at least the parameter name and parameter
     * value; other name-value pairs of the parameter are optional.
     *
     * For the workload management (WLM) configuration, you must supply all the name-value pairs in
     * the wlm_json_configuration parameter.
     */
    public fun parameters(vararg parameters: Any)

    /**
     * @param tags The list of tags for the cluster parameter group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The list of tags for the cluster parameter group.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps.Builder =
        software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps.builder()

    /**
     * @param description The description of the parameter group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param parameterGroupFamily The name of the cluster parameter group family that this cluster
     * parameter group is compatible with. 
     * You can create a custom parameter group and then associate your cluster with it. For more
     * information, see [Amazon Redshift parameter
     * groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html) .
     */
    override fun parameterGroupFamily(parameterGroupFamily: String) {
      cdkBuilder.parameterGroupFamily(parameterGroupFamily)
    }

    /**
     * @param parameterGroupName The name of the cluster parameter group.
     */
    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    /**
     * @param parameters An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request.
     * For each parameter to be modified, you must supply at least the parameter name and parameter
     * value; other name-value pairs of the parameter are optional.
     *
     * For the workload management (WLM) configuration, you must supply all the name-value pairs in
     * the wlm_json_configuration parameter.
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    /**
     * @param parameters An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request.
     * For each parameter to be modified, you must supply at least the parameter name and parameter
     * value; other name-value pairs of the parameter are optional.
     *
     * For the workload management (WLM) configuration, you must supply all the name-value pairs in
     * the wlm_json_configuration parameter.
     */
    override fun parameters(parameters: List<Any>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param parameters An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request.
     * For each parameter to be modified, you must supply at least the parameter name and parameter
     * value; other name-value pairs of the parameter are optional.
     *
     * For the workload management (WLM) configuration, you must supply all the name-value pairs in
     * the wlm_json_configuration parameter.
     */
    override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

    /**
     * @param tags The list of tags for the cluster parameter group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The list of tags for the cluster parameter group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps,
  ) : CdkObject(cdkObject), CfnClusterParameterGroupProps {
    /**
     * The description of the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * The name of the cluster parameter group family that this cluster parameter group is
     * compatible with.
     *
     * You can create a custom parameter group and then associate your cluster with it. For more
     * information, see [Amazon Redshift parameter
     * groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parametergroupfamily)
     */
    override fun parameterGroupFamily(): String = unwrap(this).getParameterGroupFamily()

    /**
     * The name of the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parametergroupname)
     */
    override fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

    /**
     * An array of parameters to be modified. A maximum of 20 parameters can be modified in a single
     * request.
     *
     * For each parameter to be modified, you must supply at least the parameter name and parameter
     * value; other name-value pairs of the parameter are optional.
     *
     * For the workload management (WLM) configuration, you must supply all the name-value pairs in
     * the wlm_json_configuration parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parameters)
     */
    override fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * The list of tags for the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterParameterGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps):
        CfnClusterParameterGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterParameterGroupProps):
        software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps
  }
}
