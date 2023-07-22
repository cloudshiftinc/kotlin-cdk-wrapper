@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshift.CfnClusterParameterGroupProps

/**
 * Properties for defining a `CfnClusterParameterGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * CfnClusterParameterGroupProps cfnClusterParameterGroupProps =
 * CfnClusterParameterGroupProps.builder()
 * .description("description")
 * .parameterGroupFamily("parameterGroupFamily")
 * // the properties below are optional
 * .parameterGroupName("parameterGroupName")
 * .parameters(List.of(ParameterProperty.builder()
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clusterparametergroup.html)
 */
@CdkDslMarker
public class CfnClusterParameterGroupPropsDsl {
  private val cdkBuilder: CfnClusterParameterGroupProps.Builder =
      CfnClusterParameterGroupProps.builder()

  private val _parameters: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description The description of the parameter group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param parameterGroupFamily The name of the cluster parameter group family that this cluster
   * parameter group is compatible with. 
   * You can create a custom parameter group and then associate your cluster with it. For more
   * information, see [Amazon Redshift parameter
   * groups](https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-parameter-groups.html) .
   */
  public fun parameterGroupFamily(parameterGroupFamily: String) {
    cdkBuilder.parameterGroupFamily(parameterGroupFamily)
  }

  /**
   * @param parameterGroupName The name of the cluster parameter group.
   */
  public fun parameterGroupName(parameterGroupName: String) {
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
  public fun parameters(vararg parameters: Any) {
    _parameters.addAll(listOf(*parameters))
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
  public fun parameters(parameters: Collection<Any>) {
    _parameters.addAll(parameters)
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
  public fun parameters(parameters: IResolvable) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param tags The list of tags for the cluster parameter group.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The list of tags for the cluster parameter group.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnClusterParameterGroupProps {
    if(_parameters.isNotEmpty()) cdkBuilder.parameters(_parameters)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
