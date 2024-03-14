package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnClusterParameterGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.redshift.CfnClusterParameterGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The description of the parameter group.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * The description of the parameter group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the cluster parameter group family that this cluster parameter group is compatible
   * with.
   */
  public open fun parameterGroupFamily(): String = unwrap(this).getParameterGroupFamily()

  /**
   * The name of the cluster parameter group family that this cluster parameter group is compatible
   * with.
   */
  public open fun parameterGroupFamily(`value`: String) {
    unwrap(this).setParameterGroupFamily(`value`)
  }

  /**
   * The name of the cluster parameter group.
   */
  public open fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

  /**
   * The name of the cluster parameter group.
   */
  public open fun parameterGroupName(`value`: String) {
    unwrap(this).setParameterGroupName(`value`)
  }

  /**
   * An array of parameters to be modified.
   *
   * A maximum of 20 parameters can be modified in a single request.
   */
  public open fun parameters(): Any? = unwrap(this).getParameters()

  /**
   * An array of parameters to be modified.
   *
   * A maximum of 20 parameters can be modified in a single request.
   */
  public open fun parameters(`value`: IResolvable) {
    unwrap(this).setParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of parameters to be modified.
   *
   * A maximum of 20 parameters can be modified in a single request.
   */
  public open fun parameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setParameters(__idx_ac66f0)
  }

  /**
   * An array of parameters to be modified.
   *
   * A maximum of 20 parameters can be modified in a single request.
   */
  public open fun parameters(vararg __idx_ac66f0: Any): Unit = parameters(__idx_ac66f0.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The list of tags for the cluster parameter group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The list of tags for the cluster parameter group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The list of tags for the cluster parameter group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.redshift.CfnClusterParameterGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-description)
     * @param description The description of the parameter group. 
     */
    public fun description(description: String)

    /**
     * The name of the cluster parameter group family that this cluster parameter group is
     * compatible with.
     *
     * You can create a custom parameter group and then associate your cluster with it. For more
     * information, see [Amazon Redshift parameter
     * groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parametergroupfamily)
     * @param parameterGroupFamily The name of the cluster parameter group family that this cluster
     * parameter group is compatible with. 
     */
    public fun parameterGroupFamily(parameterGroupFamily: String)

    /**
     * The name of the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parametergroupname)
     * @param parameterGroupName The name of the cluster parameter group. 
     */
    public fun parameterGroupName(parameterGroupName: String)

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
     * @param parameters An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request. 
     */
    public fun parameters(parameters: IResolvable)

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
     * @param parameters An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request. 
     */
    public fun parameters(parameters: List<Any>)

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
     * @param parameters An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request. 
     */
    public fun parameters(vararg parameters: Any)

    /**
     * The list of tags for the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-tags)
     * @param tags The list of tags for the cluster parameter group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The list of tags for the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-tags)
     * @param tags The list of tags for the cluster parameter group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.Builder =
        software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.Builder.create(scope, id)

    /**
     * The description of the parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-description)
     * @param description The description of the parameter group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the cluster parameter group family that this cluster parameter group is
     * compatible with.
     *
     * You can create a custom parameter group and then associate your cluster with it. For more
     * information, see [Amazon Redshift parameter
     * groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parametergroupfamily)
     * @param parameterGroupFamily The name of the cluster parameter group family that this cluster
     * parameter group is compatible with. 
     */
    override fun parameterGroupFamily(parameterGroupFamily: String) {
      cdkBuilder.parameterGroupFamily(parameterGroupFamily)
    }

    /**
     * The name of the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-parametergroupname)
     * @param parameterGroupName The name of the cluster parameter group. 
     */
    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

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
     * @param parameters An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request. 
     */
    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

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
     * @param parameters An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request. 
     */
    override fun parameters(parameters: List<Any>) {
      cdkBuilder.parameters(parameters)
    }

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
     * @param parameters An array of parameters to be modified. A maximum of 20 parameters can be
     * modified in a single request. 
     */
    override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

    /**
     * The list of tags for the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-tags)
     * @param tags The list of tags for the cluster parameter group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The list of tags for the cluster parameter group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html#cfn-redshift-clusterparametergroup-tags)
     * @param tags The list of tags for the cluster parameter group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.redshift.CfnClusterParameterGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClusterParameterGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClusterParameterGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnClusterParameterGroup):
        CfnClusterParameterGroup = CfnClusterParameterGroup(cdkObject)

    internal fun unwrap(wrapped: CfnClusterParameterGroup):
        software.amazon.awscdk.services.redshift.CfnClusterParameterGroup = wrapped.cdkObject
  }

  public interface ParameterProperty {
    /**
     * The name of the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-clusterparametergroup-parameter.html#cfn-redshift-clusterparametergroup-parameter-parametername)
     */
    public fun parameterName(): String

    /**
     * The value of the parameter.
     *
     * If `ParameterName` is `wlm_json_configuration` , then the maximum size of `ParameterValue` is
     * 8000 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-clusterparametergroup-parameter.html#cfn-redshift-clusterparametergroup-parameter-parametervalue)
     */
    public fun parameterValue(): String

    /**
     * A builder for [ParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameterName The name of the parameter. 
       */
      public fun parameterName(parameterName: String)

      /**
       * @param parameterValue The value of the parameter. 
       * If `ParameterName` is `wlm_json_configuration` , then the maximum size of `ParameterValue`
       * is 8000 characters.
       */
      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty.Builder
          =
          software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty.builder()

      /**
       * @param parameterName The name of the parameter. 
       */
      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      /**
       * @param parameterValue The value of the parameter. 
       * If `ParameterName` is `wlm_json_configuration` , then the maximum size of `ParameterValue`
       * is 8000 characters.
       */
      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build():
          software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty,
    ) : ParameterProperty {
      /**
       * The name of the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-clusterparametergroup-parameter.html#cfn-redshift-clusterparametergroup-parameter-parametername)
       */
      override fun parameterName(): String = unwrap(this).getParameterName()

      /**
       * The value of the parameter.
       *
       * If `ParameterName` is `wlm_json_configuration` , then the maximum size of `ParameterValue`
       * is 8000 characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-clusterparametergroup-parameter.html#cfn-redshift-clusterparametergroup-parameter-parametervalue)
       */
      override fun parameterValue(): String = unwrap(this).getParameterValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty):
          ParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterProperty):
          software.amazon.awscdk.services.redshift.CfnClusterParameterGroup.ParameterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
