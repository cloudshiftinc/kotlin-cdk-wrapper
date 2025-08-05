@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshiftserverless

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnWorkgroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshiftserverless.*;
 * CfnWorkgroupProps cfnWorkgroupProps = CfnWorkgroupProps.builder()
 * .workgroupName("workgroupName")
 * // the properties below are optional
 * .baseCapacity(123)
 * .configParameters(List.of(ConfigParameterProperty.builder()
 * .parameterKey("parameterKey")
 * .parameterValue("parameterValue")
 * .build()))
 * .enhancedVpcRouting(false)
 * .maxCapacity(123)
 * .namespaceName("namespaceName")
 * .port(123)
 * .pricePerformanceTarget(PerformanceTargetProperty.builder()
 * .level(123)
 * .status("status")
 * .build())
 * .publiclyAccessible(false)
 * .recoveryPointId("recoveryPointId")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .snapshotArn("snapshotArn")
 * .snapshotName("snapshotName")
 * .snapshotOwnerAccount("snapshotOwnerAccount")
 * .subnetIds(List.of("subnetIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .trackName("trackName")
 * .workgroup(WorkgroupProperty.builder()
 * .baseCapacity(123)
 * .configParameters(List.of(ConfigParameterProperty.builder()
 * .parameterKey("parameterKey")
 * .parameterValue("parameterValue")
 * .build()))
 * .creationDate("creationDate")
 * .endpoint(EndpointProperty.builder()
 * .address("address")
 * .port(123)
 * .vpcEndpoints(List.of(VpcEndpointProperty.builder()
 * .networkInterfaces(List.of(NetworkInterfaceProperty.builder()
 * .availabilityZone("availabilityZone")
 * .networkInterfaceId("networkInterfaceId")
 * .privateIpAddress("privateIpAddress")
 * .subnetId("subnetId")
 * .build()))
 * .vpcEndpointId("vpcEndpointId")
 * .vpcId("vpcId")
 * .build()))
 * .build())
 * .enhancedVpcRouting(false)
 * .maxCapacity(123)
 * .namespaceName("namespaceName")
 * .pricePerformanceTarget(PerformanceTargetProperty.builder()
 * .level(123)
 * .status("status")
 * .build())
 * .publiclyAccessible(false)
 * .securityGroupIds(List.of("securityGroupIds"))
 * .status("status")
 * .subnetIds(List.of("subnetIds"))
 * .trackName("trackName")
 * .workgroupArn("workgroupArn")
 * .workgroupId("workgroupId")
 * .workgroupName("workgroupName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html)
 */
public interface CfnWorkgroupProps {
  /**
   * The base compute capacity of the workgroup in Redshift Processing Units (RPUs).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-basecapacity)
   */
  public fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

  /**
   * The key of the parameter.
   *
   * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
   * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , `use_fips_ssl` ,
   * and query monitoring metrics that let you define performance boundaries. For more information
   * about query monitoring rules and available metrics, see [Query monitoring metrics for Amazon
   * Redshift
   * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-configparameters)
   */
  public fun configParameters(): Any? = unwrap(this).getConfigParameters()

  /**
   * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing, which
   * forces Amazon Redshift Serverless to route traffic through your VPC.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-enhancedvpcrouting)
   */
  public fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

  /**
   * The maximum data-warehouse capacity Amazon Redshift Serverless uses to serve queries.
   *
   * The max capacity is specified in RPUs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-maxcapacity)
   */
  public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  /**
   * The namespace the workgroup is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-namespacename)
   */
  public fun namespaceName(): String? = unwrap(this).getNamespaceName()

  /**
   * The custom port to use when connecting to a workgroup.
   *
   * Valid port ranges are 5431-5455 and 8191-8215. The default is 5439.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-port)
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * An object that represents the price performance target settings for the workgroup.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-priceperformancetarget)
   */
  public fun pricePerformanceTarget(): Any? = unwrap(this).getPricePerformanceTarget()

  /**
   * A value that specifies whether the workgroup can be accessible from a public network.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-publiclyaccessible)
   */
  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * The recovery point id to restore from.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-recoverypointid)
   */
  public fun recoveryPointId(): String? = unwrap(this).getRecoveryPointId()

  /**
   * A list of security group IDs to associate with the workgroup.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) of the snapshot to restore from.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-snapshotarn)
   */
  public fun snapshotArn(): String? = unwrap(this).getSnapshotArn()

  /**
   * The snapshot name to restore from.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-snapshotname)
   */
  public fun snapshotName(): String? = unwrap(this).getSnapshotName()

  /**
   * The Amazon Web Services account that owns the snapshot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-snapshotowneraccount)
   */
  public fun snapshotOwnerAccount(): String? = unwrap(this).getSnapshotOwnerAccount()

  /**
   * A list of subnet IDs the workgroup is associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-subnetids)
   */
  public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * The map of the key-value pairs used to tag the workgroup.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An optional parameter for the name of the track for the workgroup.
   *
   * If you don't provide a track name, the workgroup is assigned to the current track.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-trackname)
   */
  public fun trackName(): String? = unwrap(this).getTrackName()

  /**
   * The collection of computing resources from which an endpoint is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-workgroup)
   */
  public fun workgroup(): Any? = unwrap(this).getWorkgroup()

  /**
   * The name of the workgroup.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-workgroupname)
   */
  public fun workgroupName(): String

  /**
   * A builder for [CfnWorkgroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param baseCapacity The base compute capacity of the workgroup in Redshift Processing Units
     * (RPUs).
     */
    public fun baseCapacity(baseCapacity: Number)

    /**
     * @param configParameters The key of the parameter.
     * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
     * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , `use_fips_ssl`
     * , and query monitoring metrics that let you define performance boundaries. For more information
     * about query monitoring rules and available metrics, see [Query monitoring metrics for Amazon
     * Redshift
     * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
     * .
     */
    public fun configParameters(configParameters: IResolvable)

    /**
     * @param configParameters The key of the parameter.
     * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
     * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , `use_fips_ssl`
     * , and query monitoring metrics that let you define performance boundaries. For more information
     * about query monitoring rules and available metrics, see [Query monitoring metrics for Amazon
     * Redshift
     * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
     * .
     */
    public fun configParameters(configParameters: List<Any>)

    /**
     * @param configParameters The key of the parameter.
     * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
     * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , `use_fips_ssl`
     * , and query monitoring metrics that let you define performance boundaries. For more information
     * about query monitoring rules and available metrics, see [Query monitoring metrics for Amazon
     * Redshift
     * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
     * .
     */
    public fun configParameters(vararg configParameters: Any)

    /**
     * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual private
     * cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC.
     */
    public fun enhancedVpcRouting(enhancedVpcRouting: Boolean)

    /**
     * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual private
     * cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC.
     */
    public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable)

    /**
     * @param maxCapacity The maximum data-warehouse capacity Amazon Redshift Serverless uses to
     * serve queries.
     * The max capacity is specified in RPUs.
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * @param namespaceName The namespace the workgroup is associated with.
     */
    public fun namespaceName(namespaceName: String)

    /**
     * @param port The custom port to use when connecting to a workgroup.
     * Valid port ranges are 5431-5455 and 8191-8215. The default is 5439.
     */
    public fun port(port: Number)

    /**
     * @param pricePerformanceTarget An object that represents the price performance target settings
     * for the workgroup.
     */
    public fun pricePerformanceTarget(pricePerformanceTarget: IResolvable)

    /**
     * @param pricePerformanceTarget An object that represents the price performance target settings
     * for the workgroup.
     */
    public
        fun pricePerformanceTarget(pricePerformanceTarget: CfnWorkgroup.PerformanceTargetProperty)

    /**
     * @param pricePerformanceTarget An object that represents the price performance target settings
     * for the workgroup.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d5c42a29dae939c118a2fd3c13215ab0d6c8421b804c31e2c13105882fe9ebb")
    public
        fun pricePerformanceTarget(pricePerformanceTarget: CfnWorkgroup.PerformanceTargetProperty.Builder.() -> Unit)

    /**
     * @param publiclyAccessible A value that specifies whether the workgroup can be accessible from
     * a public network.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * @param publiclyAccessible A value that specifies whether the workgroup can be accessible from
     * a public network.
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * @param recoveryPointId The recovery point id to restore from.
     */
    public fun recoveryPointId(recoveryPointId: String)

    /**
     * @param securityGroupIds A list of security group IDs to associate with the workgroup.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds A list of security group IDs to associate with the workgroup.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param snapshotArn The Amazon Resource Name (ARN) of the snapshot to restore from.
     */
    public fun snapshotArn(snapshotArn: String)

    /**
     * @param snapshotName The snapshot name to restore from.
     */
    public fun snapshotName(snapshotName: String)

    /**
     * @param snapshotOwnerAccount The Amazon Web Services account that owns the snapshot.
     */
    public fun snapshotOwnerAccount(snapshotOwnerAccount: String)

    /**
     * @param subnetIds A list of subnet IDs the workgroup is associated with.
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * @param subnetIds A list of subnet IDs the workgroup is associated with.
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * @param tags The map of the key-value pairs used to tag the workgroup.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The map of the key-value pairs used to tag the workgroup.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param trackName An optional parameter for the name of the track for the workgroup.
     * If you don't provide a track name, the workgroup is assigned to the current track.
     */
    public fun trackName(trackName: String)

    /**
     * @param workgroup The collection of computing resources from which an endpoint is created.
     */
    public fun workgroup(workgroup: IResolvable)

    /**
     * @param workgroup The collection of computing resources from which an endpoint is created.
     */
    public fun workgroup(workgroup: CfnWorkgroup.WorkgroupProperty)

    /**
     * @param workgroup The collection of computing resources from which an endpoint is created.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d89dbdb5074458b2e3050d0c8c3d56f9fb57a4c793dec2ed4afd5949d17fe1f8")
    public fun workgroup(workgroup: CfnWorkgroup.WorkgroupProperty.Builder.() -> Unit)

    /**
     * @param workgroupName The name of the workgroup. 
     */
    public fun workgroupName(workgroupName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps.Builder =
        software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps.builder()

    /**
     * @param baseCapacity The base compute capacity of the workgroup in Redshift Processing Units
     * (RPUs).
     */
    override fun baseCapacity(baseCapacity: Number) {
      cdkBuilder.baseCapacity(baseCapacity)
    }

    /**
     * @param configParameters The key of the parameter.
     * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
     * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , `use_fips_ssl`
     * , and query monitoring metrics that let you define performance boundaries. For more information
     * about query monitoring rules and available metrics, see [Query monitoring metrics for Amazon
     * Redshift
     * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
     * .
     */
    override fun configParameters(configParameters: IResolvable) {
      cdkBuilder.configParameters(configParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param configParameters The key of the parameter.
     * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
     * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , `use_fips_ssl`
     * , and query monitoring metrics that let you define performance boundaries. For more information
     * about query monitoring rules and available metrics, see [Query monitoring metrics for Amazon
     * Redshift
     * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
     * .
     */
    override fun configParameters(configParameters: List<Any>) {
      cdkBuilder.configParameters(configParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param configParameters The key of the parameter.
     * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
     * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , `use_fips_ssl`
     * , and query monitoring metrics that let you define performance boundaries. For more information
     * about query monitoring rules and available metrics, see [Query monitoring metrics for Amazon
     * Redshift
     * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
     * .
     */
    override fun configParameters(vararg configParameters: Any): Unit =
        configParameters(configParameters.toList())

    /**
     * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual private
     * cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC.
     */
    override fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    /**
     * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual private
     * cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC.
     */
    override fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param maxCapacity The maximum data-warehouse capacity Amazon Redshift Serverless uses to
     * serve queries.
     * The max capacity is specified in RPUs.
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param namespaceName The namespace the workgroup is associated with.
     */
    override fun namespaceName(namespaceName: String) {
      cdkBuilder.namespaceName(namespaceName)
    }

    /**
     * @param port The custom port to use when connecting to a workgroup.
     * Valid port ranges are 5431-5455 and 8191-8215. The default is 5439.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param pricePerformanceTarget An object that represents the price performance target settings
     * for the workgroup.
     */
    override fun pricePerformanceTarget(pricePerformanceTarget: IResolvable) {
      cdkBuilder.pricePerformanceTarget(pricePerformanceTarget.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param pricePerformanceTarget An object that represents the price performance target settings
     * for the workgroup.
     */
    override
        fun pricePerformanceTarget(pricePerformanceTarget: CfnWorkgroup.PerformanceTargetProperty) {
      cdkBuilder.pricePerformanceTarget(pricePerformanceTarget.let(CfnWorkgroup.PerformanceTargetProperty.Companion::unwrap))
    }

    /**
     * @param pricePerformanceTarget An object that represents the price performance target settings
     * for the workgroup.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d5c42a29dae939c118a2fd3c13215ab0d6c8421b804c31e2c13105882fe9ebb")
    override
        fun pricePerformanceTarget(pricePerformanceTarget: CfnWorkgroup.PerformanceTargetProperty.Builder.() -> Unit):
        Unit =
        pricePerformanceTarget(CfnWorkgroup.PerformanceTargetProperty(pricePerformanceTarget))

    /**
     * @param publiclyAccessible A value that specifies whether the workgroup can be accessible from
     * a public network.
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param publiclyAccessible A value that specifies whether the workgroup can be accessible from
     * a public network.
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param recoveryPointId The recovery point id to restore from.
     */
    override fun recoveryPointId(recoveryPointId: String) {
      cdkBuilder.recoveryPointId(recoveryPointId)
    }

    /**
     * @param securityGroupIds A list of security group IDs to associate with the workgroup.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds A list of security group IDs to associate with the workgroup.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param snapshotArn The Amazon Resource Name (ARN) of the snapshot to restore from.
     */
    override fun snapshotArn(snapshotArn: String) {
      cdkBuilder.snapshotArn(snapshotArn)
    }

    /**
     * @param snapshotName The snapshot name to restore from.
     */
    override fun snapshotName(snapshotName: String) {
      cdkBuilder.snapshotName(snapshotName)
    }

    /**
     * @param snapshotOwnerAccount The Amazon Web Services account that owns the snapshot.
     */
    override fun snapshotOwnerAccount(snapshotOwnerAccount: String) {
      cdkBuilder.snapshotOwnerAccount(snapshotOwnerAccount)
    }

    /**
     * @param subnetIds A list of subnet IDs the workgroup is associated with.
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * @param subnetIds A list of subnet IDs the workgroup is associated with.
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * @param tags The map of the key-value pairs used to tag the workgroup.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The map of the key-value pairs used to tag the workgroup.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param trackName An optional parameter for the name of the track for the workgroup.
     * If you don't provide a track name, the workgroup is assigned to the current track.
     */
    override fun trackName(trackName: String) {
      cdkBuilder.trackName(trackName)
    }

    /**
     * @param workgroup The collection of computing resources from which an endpoint is created.
     */
    override fun workgroup(workgroup: IResolvable) {
      cdkBuilder.workgroup(workgroup.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param workgroup The collection of computing resources from which an endpoint is created.
     */
    override fun workgroup(workgroup: CfnWorkgroup.WorkgroupProperty) {
      cdkBuilder.workgroup(workgroup.let(CfnWorkgroup.WorkgroupProperty.Companion::unwrap))
    }

    /**
     * @param workgroup The collection of computing resources from which an endpoint is created.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d89dbdb5074458b2e3050d0c8c3d56f9fb57a4c793dec2ed4afd5949d17fe1f8")
    override fun workgroup(workgroup: CfnWorkgroup.WorkgroupProperty.Builder.() -> Unit): Unit =
        workgroup(CfnWorkgroup.WorkgroupProperty(workgroup))

    /**
     * @param workgroupName The name of the workgroup. 
     */
    override fun workgroupName(workgroupName: String) {
      cdkBuilder.workgroupName(workgroupName)
    }

    public fun build(): software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps,
  ) : CdkObject(cdkObject),
      CfnWorkgroupProps {
    /**
     * The base compute capacity of the workgroup in Redshift Processing Units (RPUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-basecapacity)
     */
    override fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

    /**
     * The key of the parameter.
     *
     * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
     * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , `use_fips_ssl`
     * , and query monitoring metrics that let you define performance boundaries. For more information
     * about query monitoring rules and available metrics, see [Query monitoring metrics for Amazon
     * Redshift
     * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-configparameters)
     */
    override fun configParameters(): Any? = unwrap(this).getConfigParameters()

    /**
     * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing,
     * which forces Amazon Redshift Serverless to route traffic through your VPC.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-enhancedvpcrouting)
     */
    override fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

    /**
     * The maximum data-warehouse capacity Amazon Redshift Serverless uses to serve queries.
     *
     * The max capacity is specified in RPUs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-maxcapacity)
     */
    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    /**
     * The namespace the workgroup is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-namespacename)
     */
    override fun namespaceName(): String? = unwrap(this).getNamespaceName()

    /**
     * The custom port to use when connecting to a workgroup.
     *
     * Valid port ranges are 5431-5455 and 8191-8215. The default is 5439.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-port)
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * An object that represents the price performance target settings for the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-priceperformancetarget)
     */
    override fun pricePerformanceTarget(): Any? = unwrap(this).getPricePerformanceTarget()

    /**
     * A value that specifies whether the workgroup can be accessible from a public network.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-publiclyaccessible)
     */
    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    /**
     * The recovery point id to restore from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-recoverypointid)
     */
    override fun recoveryPointId(): String? = unwrap(this).getRecoveryPointId()

    /**
     * A list of security group IDs to associate with the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * The Amazon Resource Name (ARN) of the snapshot to restore from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-snapshotarn)
     */
    override fun snapshotArn(): String? = unwrap(this).getSnapshotArn()

    /**
     * The snapshot name to restore from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-snapshotname)
     */
    override fun snapshotName(): String? = unwrap(this).getSnapshotName()

    /**
     * The Amazon Web Services account that owns the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-snapshotowneraccount)
     */
    override fun snapshotOwnerAccount(): String? = unwrap(this).getSnapshotOwnerAccount()

    /**
     * A list of subnet IDs the workgroup is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-subnetids)
     */
    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * The map of the key-value pairs used to tag the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * An optional parameter for the name of the track for the workgroup.
     *
     * If you don't provide a track name, the workgroup is assigned to the current track.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-trackname)
     */
    override fun trackName(): String? = unwrap(this).getTrackName()

    /**
     * The collection of computing resources from which an endpoint is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-workgroup)
     */
    override fun workgroup(): Any? = unwrap(this).getWorkgroup()

    /**
     * The name of the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-workgroupname)
     */
    override fun workgroupName(): String = unwrap(this).getWorkgroupName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkgroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps):
        CfnWorkgroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWorkgroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkgroupProps):
        software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.redshiftserverless.CfnWorkgroupProps
  }
}
