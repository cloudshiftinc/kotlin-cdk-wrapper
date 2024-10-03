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
 * .publiclyAccessible(false)
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
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
   * A list of parameters to set for finer control over a database.
   *
   * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
   * `search_path` , `max_query_execution_time` , and `require_ssl` .
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
   * A value that specifies whether the workgroup can be accessible from a public network.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-publiclyaccessible)
   */
  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * A list of security group IDs to associate with the workgroup.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

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
     * @param configParameters A list of parameters to set for finer control over a database.
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , `max_query_execution_time` , and `require_ssl` .
     */
    public fun configParameters(configParameters: IResolvable)

    /**
     * @param configParameters A list of parameters to set for finer control over a database.
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , `max_query_execution_time` , and `require_ssl` .
     */
    public fun configParameters(configParameters: List<Any>)

    /**
     * @param configParameters A list of parameters to set for finer control over a database.
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , `max_query_execution_time` , and `require_ssl` .
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
     * @param securityGroupIds A list of security group IDs to associate with the workgroup.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds A list of security group IDs to associate with the workgroup.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

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
     * @param configParameters A list of parameters to set for finer control over a database.
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , `max_query_execution_time` , and `require_ssl` .
     */
    override fun configParameters(configParameters: IResolvable) {
      cdkBuilder.configParameters(configParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param configParameters A list of parameters to set for finer control over a database.
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , `max_query_execution_time` , and `require_ssl` .
     */
    override fun configParameters(configParameters: List<Any>) {
      cdkBuilder.configParameters(configParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param configParameters A list of parameters to set for finer control over a database.
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , `max_query_execution_time` , and `require_ssl` .
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
     * A list of parameters to set for finer control over a database.
     *
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , `max_query_execution_time` , and `require_ssl` .
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
     * A value that specifies whether the workgroup can be accessible from a public network.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-publiclyaccessible)
     */
    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    /**
     * A list of security group IDs to associate with the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

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
