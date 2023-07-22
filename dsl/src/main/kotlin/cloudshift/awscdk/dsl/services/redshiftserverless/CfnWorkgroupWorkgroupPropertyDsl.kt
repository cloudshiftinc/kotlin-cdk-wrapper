@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshiftserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup

@CdkDslMarker
public class CfnWorkgroupWorkgroupPropertyDsl {
  private val cdkBuilder: CfnWorkgroup.WorkgroupProperty.Builder =
      CfnWorkgroup.WorkgroupProperty.builder()

  private val _configParameters: MutableList<Any> = mutableListOf()

  private val _securityGroupIds: MutableList<String> = mutableListOf()

  private val _subnetIds: MutableList<String> = mutableListOf()

  /**
   * @param baseCapacity The base data warehouse capacity of the workgroup in Redshift Processing
   * Units (RPUs).
   */
  public fun baseCapacity(baseCapacity: Number) {
    cdkBuilder.baseCapacity(baseCapacity)
  }

  /**
   * @param configParameters An array of parameters to set for advanced control over a database.
   * The options are `auto_mv` , `datestyle` , `enable_case_sensitivity_identifier` ,
   * `enable_user_activity_logging` , `query_group` , , `search_path` , and query monitoring metrics
   * that let you define performance boundaries. For more information about query monitoring rules and
   * available metrics, see [Query monitoring metrics for Amazon Redshift
   * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
   * .
   */
  public fun configParameters(vararg configParameters: Any) {
    _configParameters.addAll(listOf(*configParameters))
  }

  /**
   * @param configParameters An array of parameters to set for advanced control over a database.
   * The options are `auto_mv` , `datestyle` , `enable_case_sensitivity_identifier` ,
   * `enable_user_activity_logging` , `query_group` , , `search_path` , and query monitoring metrics
   * that let you define performance boundaries. For more information about query monitoring rules and
   * available metrics, see [Query monitoring metrics for Amazon Redshift
   * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
   * .
   */
  public fun configParameters(configParameters: Collection<Any>) {
    _configParameters.addAll(configParameters)
  }

  /**
   * @param configParameters An array of parameters to set for advanced control over a database.
   * The options are `auto_mv` , `datestyle` , `enable_case_sensitivity_identifier` ,
   * `enable_user_activity_logging` , `query_group` , , `search_path` , and query monitoring metrics
   * that let you define performance boundaries. For more information about query monitoring rules and
   * available metrics, see [Query monitoring metrics for Amazon Redshift
   * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
   * .
   */
  public fun configParameters(configParameters: IResolvable) {
    cdkBuilder.configParameters(configParameters)
  }

  /**
   * @param creationDate The creation date of the workgroup.
   */
  public fun creationDate(creationDate: String) {
    cdkBuilder.creationDate(creationDate)
  }

  /**
   * @param endpoint The endpoint that is created from the workgroup.
   */
  public fun endpoint(endpoint: IResolvable) {
    cdkBuilder.endpoint(endpoint)
  }

  /**
   * @param endpoint The endpoint that is created from the workgroup.
   */
  public fun endpoint(endpoint: CfnWorkgroup.EndpointProperty) {
    cdkBuilder.endpoint(endpoint)
  }

  /**
   * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual private
   * cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC.
   */
  public fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
    cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
  }

  /**
   * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual private
   * cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC.
   */
  public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
    cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
  }

  /**
   * @param namespaceName The namespace the workgroup is associated with.
   */
  public fun namespaceName(namespaceName: String) {
    cdkBuilder.namespaceName(namespaceName)
  }

  /**
   * @param publiclyAccessible A value that specifies whether the workgroup can be accessible from a
   * public network.
   */
  public fun publiclyAccessible(publiclyAccessible: Boolean) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  /**
   * @param publiclyAccessible A value that specifies whether the workgroup can be accessible from a
   * public network.
   */
  public fun publiclyAccessible(publiclyAccessible: IResolvable) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  /**
   * @param securityGroupIds An array of security group IDs to associate with the workgroup.
   */
  public fun securityGroupIds(vararg securityGroupIds: String) {
    _securityGroupIds.addAll(listOf(*securityGroupIds))
  }

  /**
   * @param securityGroupIds An array of security group IDs to associate with the workgroup.
   */
  public fun securityGroupIds(securityGroupIds: Collection<String>) {
    _securityGroupIds.addAll(securityGroupIds)
  }

  /**
   * @param status The status of the workgroup.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param subnetIds An array of subnet IDs the workgroup is associated with.
   */
  public fun subnetIds(vararg subnetIds: String) {
    _subnetIds.addAll(listOf(*subnetIds))
  }

  /**
   * @param subnetIds An array of subnet IDs the workgroup is associated with.
   */
  public fun subnetIds(subnetIds: Collection<String>) {
    _subnetIds.addAll(subnetIds)
  }

  /**
   * @param workgroupArn The Amazon Resource Name (ARN) that links to the workgroup.
   */
  public fun workgroupArn(workgroupArn: String) {
    cdkBuilder.workgroupArn(workgroupArn)
  }

  /**
   * @param workgroupId The unique identifier of the workgroup.
   */
  public fun workgroupId(workgroupId: String) {
    cdkBuilder.workgroupId(workgroupId)
  }

  /**
   * @param workgroupName The name of the workgroup.
   */
  public fun workgroupName(workgroupName: String) {
    cdkBuilder.workgroupName(workgroupName)
  }

  public fun build(): CfnWorkgroup.WorkgroupProperty {
    if(_configParameters.isNotEmpty()) cdkBuilder.configParameters(_configParameters)
    if(_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
    if(_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
    return cdkBuilder.build()
  }
}
