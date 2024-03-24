@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshiftserverless

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The collection of compute resources in Amazon Redshift Serverless.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.redshiftserverless.*;
 * CfnWorkgroup cfnWorkgroup = CfnWorkgroup.Builder.create(this, "MyCfnWorkgroup")
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
public open class CfnWorkgroup(
  cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkgroupProps,
  ) :
      this(software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnWorkgroupProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkgroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWorkgroupProps(props)
  )

  /**
   *
   */
  public open fun attrWorkgroup(): IResolvable =
      unwrap(this).getAttrWorkgroup().let(IResolvable::wrap)

  /**
   * The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
   */
  public open fun attrWorkgroupBaseCapacity(): Number = unwrap(this).getAttrWorkgroupBaseCapacity()

  /**
   *
   */
  public open fun attrWorkgroupConfigParameters(): IResolvable =
      unwrap(this).getAttrWorkgroupConfigParameters().let(IResolvable::wrap)

  /**
   * The creation date of the workgroup.
   */
  public open fun attrWorkgroupCreationDate(): String = unwrap(this).getAttrWorkgroupCreationDate()

  /**
   *
   */
  public open fun attrWorkgroupEndpoint(): IResolvable =
      unwrap(this).getAttrWorkgroupEndpoint().let(IResolvable::wrap)

  /**
   * The DNS address of the VPC endpoint.
   */
  public open fun attrWorkgroupEndpointAddress(): String =
      unwrap(this).getAttrWorkgroupEndpointAddress()

  /**
   * The custom port to use when connecting to a workgroup.
   *
   * Valid port ranges are 5431-5455 and 8191-8215. The default is 5439.
   */
  public open fun attrWorkgroupEndpointPort(): Number = unwrap(this).getAttrWorkgroupEndpointPort()

  /**
   *
   */
  public open fun attrWorkgroupEndpointVpcEndpoints(): IResolvable =
      unwrap(this).getAttrWorkgroupEndpointVpcEndpoints().let(IResolvable::wrap)

  /**
   * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing, which
   * forces Amazon Redshift Serverless to route traffic through your VPC.
   */
  public open fun attrWorkgroupEnhancedVpcRouting(): IResolvable =
      unwrap(this).getAttrWorkgroupEnhancedVpcRouting().let(IResolvable::wrap)

  /**
   * The maximum data-warehouse capacity Amazon Redshift Serverless uses to serve queries.
   *
   * The max capacity is specified in RPUs.
   */
  public open fun attrWorkgroupMaxCapacity(): Number = unwrap(this).getAttrWorkgroupMaxCapacity()

  /**
   * The namespace the workgroup is associated with.
   */
  public open fun attrWorkgroupNamespaceName(): String =
      unwrap(this).getAttrWorkgroupNamespaceName()

  /**
   * A value that specifies whether the workgroup can be accessible from a public network.
   */
  public open fun attrWorkgroupPubliclyAccessible(): IResolvable =
      unwrap(this).getAttrWorkgroupPubliclyAccessible().let(IResolvable::wrap)

  /**
   * An array of security group IDs to associate with the workgroup.
   */
  public open fun attrWorkgroupSecurityGroupIds(): List<String> =
      unwrap(this).getAttrWorkgroupSecurityGroupIds()

  /**
   * The status of the workgroup.
   */
  public open fun attrWorkgroupStatus(): String = unwrap(this).getAttrWorkgroupStatus()

  /**
   * An array of subnet IDs the workgroup is associated with.
   */
  public open fun attrWorkgroupSubnetIds(): List<String> = unwrap(this).getAttrWorkgroupSubnetIds()

  /**
   * The Amazon Resource Name (ARN) that links to the workgroup.
   */
  public open fun attrWorkgroupWorkgroupArn(): String = unwrap(this).getAttrWorkgroupWorkgroupArn()

  /**
   * The unique identifier of the workgroup.
   */
  public open fun attrWorkgroupWorkgroupId(): String = unwrap(this).getAttrWorkgroupWorkgroupId()

  /**
   * The name of the workgroup.
   */
  public open fun attrWorkgroupWorkgroupName(): String =
      unwrap(this).getAttrWorkgroupWorkgroupName()

  /**
   * The base compute capacity of the workgroup in Redshift Processing Units (RPUs).
   */
  public open fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

  /**
   * The base compute capacity of the workgroup in Redshift Processing Units (RPUs).
   */
  public open fun baseCapacity(`value`: Number) {
    unwrap(this).setBaseCapacity(`value`)
  }

  /**
   * A list of parameters to set for finer control over a database.
   */
  public open fun configParameters(): Any? = unwrap(this).getConfigParameters()

  /**
   * A list of parameters to set for finer control over a database.
   */
  public open fun configParameters(`value`: IResolvable) {
    unwrap(this).setConfigParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of parameters to set for finer control over a database.
   */
  public open fun configParameters(`value`: List<Any>) {
    unwrap(this).setConfigParameters(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of parameters to set for finer control over a database.
   */
  public open fun configParameters(vararg `value`: Any): Unit = configParameters(`value`.toList())

  /**
   * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing, which
   * forces Amazon Redshift Serverless to route traffic through your VPC.
   */
  public open fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

  /**
   * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing, which
   * forces Amazon Redshift Serverless to route traffic through your VPC.
   */
  public open fun enhancedVpcRouting(`value`: Boolean) {
    unwrap(this).setEnhancedVpcRouting(`value`)
  }

  /**
   * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing, which
   * forces Amazon Redshift Serverless to route traffic through your VPC.
   */
  public open fun enhancedVpcRouting(`value`: IResolvable) {
    unwrap(this).setEnhancedVpcRouting(`value`.let(IResolvable::unwrap))
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
   * The maximum data-warehouse capacity Amazon Redshift Serverless uses to serve queries.
   */
  public open fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  /**
   * The maximum data-warehouse capacity Amazon Redshift Serverless uses to serve queries.
   */
  public open fun maxCapacity(`value`: Number) {
    unwrap(this).setMaxCapacity(`value`)
  }

  /**
   * The namespace the workgroup is associated with.
   */
  public open fun namespaceName(): String? = unwrap(this).getNamespaceName()

  /**
   * The namespace the workgroup is associated with.
   */
  public open fun namespaceName(`value`: String) {
    unwrap(this).setNamespaceName(`value`)
  }

  /**
   * The custom port to use when connecting to a workgroup.
   */
  public open fun port(): Number? = unwrap(this).getPort()

  /**
   * The custom port to use when connecting to a workgroup.
   */
  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  /**
   * A value that specifies whether the workgroup can be accessible from a public network.
   */
  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * A value that specifies whether the workgroup can be accessible from a public network.
   */
  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  /**
   * A value that specifies whether the workgroup can be accessible from a public network.
   */
  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of security group IDs to associate with the workgroup.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * A list of security group IDs to associate with the workgroup.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * A list of security group IDs to associate with the workgroup.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * A list of subnet IDs the workgroup is associated with.
   */
  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  /**
   * A list of subnet IDs the workgroup is associated with.
   */
  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  /**
   * A list of subnet IDs the workgroup is associated with.
   */
  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The map of the key-value pairs used to tag the workgroup.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The map of the key-value pairs used to tag the workgroup.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The map of the key-value pairs used to tag the workgroup.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The name of the workgroup.
   */
  public open fun workgroupName(): String = unwrap(this).getWorkgroupName()

  /**
   * The name of the workgroup.
   */
  public open fun workgroupName(`value`: String) {
    unwrap(this).setWorkgroupName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.redshiftserverless.CfnWorkgroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The base compute capacity of the workgroup in Redshift Processing Units (RPUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-basecapacity)
     * @param baseCapacity The base compute capacity of the workgroup in Redshift Processing Units
     * (RPUs). 
     */
    public fun baseCapacity(baseCapacity: Number)

    /**
     * A list of parameters to set for finer control over a database.
     *
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , `max_query_execution_time` , and `require_ssl` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-configparameters)
     * @param configParameters A list of parameters to set for finer control over a database. 
     */
    public fun configParameters(configParameters: IResolvable)

    /**
     * A list of parameters to set for finer control over a database.
     *
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , `max_query_execution_time` , and `require_ssl` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-configparameters)
     * @param configParameters A list of parameters to set for finer control over a database. 
     */
    public fun configParameters(configParameters: List<Any>)

    /**
     * A list of parameters to set for finer control over a database.
     *
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , `max_query_execution_time` , and `require_ssl` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-configparameters)
     * @param configParameters A list of parameters to set for finer control over a database. 
     */
    public fun configParameters(vararg configParameters: Any)

    /**
     * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing,
     * which forces Amazon Redshift Serverless to route traffic through your VPC.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-enhancedvpcrouting)
     * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual private
     * cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC. 
     */
    public fun enhancedVpcRouting(enhancedVpcRouting: Boolean)

    /**
     * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing,
     * which forces Amazon Redshift Serverless to route traffic through your VPC.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-enhancedvpcrouting)
     * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual private
     * cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC. 
     */
    public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable)

    /**
     * The maximum data-warehouse capacity Amazon Redshift Serverless uses to serve queries.
     *
     * The max capacity is specified in RPUs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-maxcapacity)
     * @param maxCapacity The maximum data-warehouse capacity Amazon Redshift Serverless uses to
     * serve queries. 
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * The namespace the workgroup is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-namespacename)
     * @param namespaceName The namespace the workgroup is associated with. 
     */
    public fun namespaceName(namespaceName: String)

    /**
     * The custom port to use when connecting to a workgroup.
     *
     * Valid port ranges are 5431-5455 and 8191-8215. The default is 5439.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-port)
     * @param port The custom port to use when connecting to a workgroup. 
     */
    public fun port(port: Number)

    /**
     * A value that specifies whether the workgroup can be accessible from a public network.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-publiclyaccessible)
     * @param publiclyAccessible A value that specifies whether the workgroup can be accessible from
     * a public network. 
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * A value that specifies whether the workgroup can be accessible from a public network.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-publiclyaccessible)
     * @param publiclyAccessible A value that specifies whether the workgroup can be accessible from
     * a public network. 
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * A list of security group IDs to associate with the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-securitygroupids)
     * @param securityGroupIds A list of security group IDs to associate with the workgroup. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * A list of security group IDs to associate with the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-securitygroupids)
     * @param securityGroupIds A list of security group IDs to associate with the workgroup. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * A list of subnet IDs the workgroup is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-subnetids)
     * @param subnetIds A list of subnet IDs the workgroup is associated with. 
     */
    public fun subnetIds(subnetIds: List<String>)

    /**
     * A list of subnet IDs the workgroup is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-subnetids)
     * @param subnetIds A list of subnet IDs the workgroup is associated with. 
     */
    public fun subnetIds(vararg subnetIds: String)

    /**
     * The map of the key-value pairs used to tag the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-tags)
     * @param tags The map of the key-value pairs used to tag the workgroup. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The map of the key-value pairs used to tag the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-tags)
     * @param tags The map of the key-value pairs used to tag the workgroup. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-workgroupname)
     * @param workgroupName The name of the workgroup. 
     */
    public fun workgroupName(workgroupName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.Builder
        = software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.Builder.create(scope, id)

    /**
     * The base compute capacity of the workgroup in Redshift Processing Units (RPUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-basecapacity)
     * @param baseCapacity The base compute capacity of the workgroup in Redshift Processing Units
     * (RPUs). 
     */
    override fun baseCapacity(baseCapacity: Number) {
      cdkBuilder.baseCapacity(baseCapacity)
    }

    /**
     * A list of parameters to set for finer control over a database.
     *
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , `max_query_execution_time` , and `require_ssl` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-configparameters)
     * @param configParameters A list of parameters to set for finer control over a database. 
     */
    override fun configParameters(configParameters: IResolvable) {
      cdkBuilder.configParameters(configParameters.let(IResolvable::unwrap))
    }

    /**
     * A list of parameters to set for finer control over a database.
     *
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , `max_query_execution_time` , and `require_ssl` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-configparameters)
     * @param configParameters A list of parameters to set for finer control over a database. 
     */
    override fun configParameters(configParameters: List<Any>) {
      cdkBuilder.configParameters(configParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of parameters to set for finer control over a database.
     *
     * Available options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
     * `search_path` , `max_query_execution_time` , and `require_ssl` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-configparameters)
     * @param configParameters A list of parameters to set for finer control over a database. 
     */
    override fun configParameters(vararg configParameters: Any): Unit =
        configParameters(configParameters.toList())

    /**
     * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing,
     * which forces Amazon Redshift Serverless to route traffic through your VPC.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-enhancedvpcrouting)
     * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual private
     * cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC. 
     */
    override fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    /**
     * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing,
     * which forces Amazon Redshift Serverless to route traffic through your VPC.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-enhancedvpcrouting)
     * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual private
     * cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through your VPC. 
     */
    override fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting.let(IResolvable::unwrap))
    }

    /**
     * The maximum data-warehouse capacity Amazon Redshift Serverless uses to serve queries.
     *
     * The max capacity is specified in RPUs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-maxcapacity)
     * @param maxCapacity The maximum data-warehouse capacity Amazon Redshift Serverless uses to
     * serve queries. 
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * The namespace the workgroup is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-namespacename)
     * @param namespaceName The namespace the workgroup is associated with. 
     */
    override fun namespaceName(namespaceName: String) {
      cdkBuilder.namespaceName(namespaceName)
    }

    /**
     * The custom port to use when connecting to a workgroup.
     *
     * Valid port ranges are 5431-5455 and 8191-8215. The default is 5439.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-port)
     * @param port The custom port to use when connecting to a workgroup. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * A value that specifies whether the workgroup can be accessible from a public network.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-publiclyaccessible)
     * @param publiclyAccessible A value that specifies whether the workgroup can be accessible from
     * a public network. 
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * A value that specifies whether the workgroup can be accessible from a public network.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-publiclyaccessible)
     * @param publiclyAccessible A value that specifies whether the workgroup can be accessible from
     * a public network. 
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    /**
     * A list of security group IDs to associate with the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-securitygroupids)
     * @param securityGroupIds A list of security group IDs to associate with the workgroup. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * A list of security group IDs to associate with the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-securitygroupids)
     * @param securityGroupIds A list of security group IDs to associate with the workgroup. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * A list of subnet IDs the workgroup is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-subnetids)
     * @param subnetIds A list of subnet IDs the workgroup is associated with. 
     */
    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    /**
     * A list of subnet IDs the workgroup is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-subnetids)
     * @param subnetIds A list of subnet IDs the workgroup is associated with. 
     */
    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    /**
     * The map of the key-value pairs used to tag the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-tags)
     * @param tags The map of the key-value pairs used to tag the workgroup. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The map of the key-value pairs used to tag the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-tags)
     * @param tags The map of the key-value pairs used to tag the workgroup. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshiftserverless-workgroup.html#cfn-redshiftserverless-workgroup-workgroupname)
     * @param workgroupName The name of the workgroup. 
     */
    override fun workgroupName(workgroupName: String) {
      cdkBuilder.workgroupName(workgroupName)
    }

    public fun build(): software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkgroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkgroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup):
        CfnWorkgroup = CfnWorkgroup(cdkObject)

    internal fun unwrap(wrapped: CfnWorkgroup):
        software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup = wrapped.cdkObject as
        software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup
  }

  /**
   * A array of parameters to set for more control over a serverless database.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.redshiftserverless.*;
   * ConfigParameterProperty configParameterProperty = ConfigParameterProperty.builder()
   * .parameterKey("parameterKey")
   * .parameterValue("parameterValue")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-configparameter.html)
   */
  public interface ConfigParameterProperty {
    /**
     * The key of the parameter.
     *
     * The options are `datestyle` , `enable_user_activity_logging` , `query_group` , `search_path`
     * , `max_query_execution_time` , and `require_ssl` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-configparameter.html#cfn-redshiftserverless-workgroup-configparameter-parameterkey)
     */
    public fun parameterKey(): String? = unwrap(this).getParameterKey()

    /**
     * The value of the parameter to set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-configparameter.html#cfn-redshiftserverless-workgroup-configparameter-parametervalue)
     */
    public fun parameterValue(): String? = unwrap(this).getParameterValue()

    /**
     * A builder for [ConfigParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param parameterKey The key of the parameter.
       * The options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
       * `search_path` , `max_query_execution_time` , and `require_ssl` .
       */
      public fun parameterKey(parameterKey: String)

      /**
       * @param parameterValue The value of the parameter to set.
       */
      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.ConfigParameterProperty.Builder
          =
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.ConfigParameterProperty.builder()

      /**
       * @param parameterKey The key of the parameter.
       * The options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
       * `search_path` , `max_query_execution_time` , and `require_ssl` .
       */
      override fun parameterKey(parameterKey: String) {
        cdkBuilder.parameterKey(parameterKey)
      }

      /**
       * @param parameterValue The value of the parameter to set.
       */
      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build():
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.ConfigParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.ConfigParameterProperty,
    ) : CdkObject(cdkObject), ConfigParameterProperty {
      /**
       * The key of the parameter.
       *
       * The options are `datestyle` , `enable_user_activity_logging` , `query_group` ,
       * `search_path` , `max_query_execution_time` , and `require_ssl` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-configparameter.html#cfn-redshiftserverless-workgroup-configparameter-parameterkey)
       */
      override fun parameterKey(): String? = unwrap(this).getParameterKey()

      /**
       * The value of the parameter to set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-configparameter.html#cfn-redshiftserverless-workgroup-configparameter-parametervalue)
       */
      override fun parameterValue(): String? = unwrap(this).getParameterValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.ConfigParameterProperty):
          ConfigParameterProperty = CdkObjectWrappers.wrap(cdkObject) as? ConfigParameterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigParameterProperty):
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.ConfigParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.ConfigParameterProperty
    }
  }

  /**
   * The VPC endpoint object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.redshiftserverless.*;
   * EndpointProperty endpointProperty = EndpointProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-endpoint.html)
   */
  public interface EndpointProperty {
    /**
     * The DNS address of the VPC endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-endpoint.html#cfn-redshiftserverless-workgroup-endpoint-address)
     */
    public fun address(): String? = unwrap(this).getAddress()

    /**
     * The port that Amazon Redshift Serverless listens on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-endpoint.html#cfn-redshiftserverless-workgroup-endpoint-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * An array of `VpcEndpoint` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-endpoint.html#cfn-redshiftserverless-workgroup-endpoint-vpcendpoints)
     */
    public fun vpcEndpoints(): Any? = unwrap(this).getVpcEndpoints()

    /**
     * A builder for [EndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param address The DNS address of the VPC endpoint.
       */
      public fun address(address: String)

      /**
       * @param port The port that Amazon Redshift Serverless listens on.
       */
      public fun port(port: Number)

      /**
       * @param vpcEndpoints An array of `VpcEndpoint` objects.
       */
      public fun vpcEndpoints(vpcEndpoints: IResolvable)

      /**
       * @param vpcEndpoints An array of `VpcEndpoint` objects.
       */
      public fun vpcEndpoints(vpcEndpoints: List<Any>)

      /**
       * @param vpcEndpoints An array of `VpcEndpoint` objects.
       */
      public fun vpcEndpoints(vararg vpcEndpoints: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.EndpointProperty.Builder =
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.EndpointProperty.builder()

      /**
       * @param address The DNS address of the VPC endpoint.
       */
      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      /**
       * @param port The port that Amazon Redshift Serverless listens on.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param vpcEndpoints An array of `VpcEndpoint` objects.
       */
      override fun vpcEndpoints(vpcEndpoints: IResolvable) {
        cdkBuilder.vpcEndpoints(vpcEndpoints.let(IResolvable::unwrap))
      }

      /**
       * @param vpcEndpoints An array of `VpcEndpoint` objects.
       */
      override fun vpcEndpoints(vpcEndpoints: List<Any>) {
        cdkBuilder.vpcEndpoints(vpcEndpoints.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param vpcEndpoints An array of `VpcEndpoint` objects.
       */
      override fun vpcEndpoints(vararg vpcEndpoints: Any): Unit =
          vpcEndpoints(vpcEndpoints.toList())

      public fun build():
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.EndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.EndpointProperty,
    ) : CdkObject(cdkObject), EndpointProperty {
      /**
       * The DNS address of the VPC endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-endpoint.html#cfn-redshiftserverless-workgroup-endpoint-address)
       */
      override fun address(): String? = unwrap(this).getAddress()

      /**
       * The port that Amazon Redshift Serverless listens on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-endpoint.html#cfn-redshiftserverless-workgroup-endpoint-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * An array of `VpcEndpoint` objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-endpoint.html#cfn-redshiftserverless-workgroup-endpoint-vpcendpoints)
       */
      override fun vpcEndpoints(): Any? = unwrap(this).getVpcEndpoints()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.EndpointProperty):
          EndpointProperty = CdkObjectWrappers.wrap(cdkObject) as? EndpointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointProperty):
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.EndpointProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.EndpointProperty
    }
  }

  /**
   * Contains information about a network interface in an Amazon Redshift Serverless managed VPC
   * endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.redshiftserverless.*;
   * NetworkInterfaceProperty networkInterfaceProperty = NetworkInterfaceProperty.builder()
   * .availabilityZone("availabilityZone")
   * .networkInterfaceId("networkInterfaceId")
   * .privateIpAddress("privateIpAddress")
   * .subnetId("subnetId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-networkinterface.html)
   */
  public interface NetworkInterfaceProperty {
    /**
     * The availability Zone.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-networkinterface.html#cfn-redshiftserverless-workgroup-networkinterface-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The unique identifier of the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-networkinterface.html#cfn-redshiftserverless-workgroup-networkinterface-networkinterfaceid)
     */
    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    /**
     * The IPv4 address of the network interface within the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-networkinterface.html#cfn-redshiftserverless-workgroup-networkinterface-privateipaddress)
     */
    public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    /**
     * The unique identifier of the subnet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-networkinterface.html#cfn-redshiftserverless-workgroup-networkinterface-subnetid)
     */
    public fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * A builder for [NetworkInterfaceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The availability Zone.
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param networkInterfaceId The unique identifier of the network interface.
       */
      public fun networkInterfaceId(networkInterfaceId: String)

      /**
       * @param privateIpAddress The IPv4 address of the network interface within the subnet.
       */
      public fun privateIpAddress(privateIpAddress: String)

      /**
       * @param subnetId The unique identifier of the subnet.
       */
      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.NetworkInterfaceProperty.Builder
          =
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.NetworkInterfaceProperty.builder()

      /**
       * @param availabilityZone The availability Zone.
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param networkInterfaceId The unique identifier of the network interface.
       */
      override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      /**
       * @param privateIpAddress The IPv4 address of the network interface within the subnet.
       */
      override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      /**
       * @param subnetId The unique identifier of the subnet.
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.NetworkInterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.NetworkInterfaceProperty,
    ) : CdkObject(cdkObject), NetworkInterfaceProperty {
      /**
       * The availability Zone.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-networkinterface.html#cfn-redshiftserverless-workgroup-networkinterface-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * The unique identifier of the network interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-networkinterface.html#cfn-redshiftserverless-workgroup-networkinterface-networkinterfaceid)
       */
      override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      /**
       * The IPv4 address of the network interface within the subnet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-networkinterface.html#cfn-redshiftserverless-workgroup-networkinterface-privateipaddress)
       */
      override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

      /**
       * The unique identifier of the subnet.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-networkinterface.html#cfn-redshiftserverless-workgroup-networkinterface-subnetid)
       */
      override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.NetworkInterfaceProperty):
          NetworkInterfaceProperty = CdkObjectWrappers.wrap(cdkObject) as? NetworkInterfaceProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceProperty):
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.NetworkInterfaceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.NetworkInterfaceProperty
    }
  }

  /**
   * The connection endpoint for connecting to Amazon Redshift Serverless through the proxy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.redshiftserverless.*;
   * VpcEndpointProperty vpcEndpointProperty = VpcEndpointProperty.builder()
   * .networkInterfaces(List.of(NetworkInterfaceProperty.builder()
   * .availabilityZone("availabilityZone")
   * .networkInterfaceId("networkInterfaceId")
   * .privateIpAddress("privateIpAddress")
   * .subnetId("subnetId")
   * .build()))
   * .vpcEndpointId("vpcEndpointId")
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-vpcendpoint.html)
   */
  public interface VpcEndpointProperty {
    /**
     * One or more network interfaces of the endpoint.
     *
     * Also known as an interface endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-vpcendpoint.html#cfn-redshiftserverless-workgroup-vpcendpoint-networkinterfaces)
     */
    public fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

    /**
     * The connection endpoint ID for connecting to Amazon Redshift Serverless.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-vpcendpoint.html#cfn-redshiftserverless-workgroup-vpcendpoint-vpcendpointid)
     */
    public fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

    /**
     * The VPC identifier that the endpoint is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-vpcendpoint.html#cfn-redshiftserverless-workgroup-vpcendpoint-vpcid)
     */
    public fun vpcId(): String? = unwrap(this).getVpcId()

    /**
     * A builder for [VpcEndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param networkInterfaces One or more network interfaces of the endpoint.
       * Also known as an interface endpoint.
       */
      public fun networkInterfaces(networkInterfaces: IResolvable)

      /**
       * @param networkInterfaces One or more network interfaces of the endpoint.
       * Also known as an interface endpoint.
       */
      public fun networkInterfaces(networkInterfaces: List<Any>)

      /**
       * @param networkInterfaces One or more network interfaces of the endpoint.
       * Also known as an interface endpoint.
       */
      public fun networkInterfaces(vararg networkInterfaces: Any)

      /**
       * @param vpcEndpointId The connection endpoint ID for connecting to Amazon Redshift
       * Serverless.
       */
      public fun vpcEndpointId(vpcEndpointId: String)

      /**
       * @param vpcId The VPC identifier that the endpoint is associated with.
       */
      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.VpcEndpointProperty.Builder
          =
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.VpcEndpointProperty.builder()

      /**
       * @param networkInterfaces One or more network interfaces of the endpoint.
       * Also known as an interface endpoint.
       */
      override fun networkInterfaces(networkInterfaces: IResolvable) {
        cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable::unwrap))
      }

      /**
       * @param networkInterfaces One or more network interfaces of the endpoint.
       * Also known as an interface endpoint.
       */
      override fun networkInterfaces(networkInterfaces: List<Any>) {
        cdkBuilder.networkInterfaces(networkInterfaces.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkInterfaces One or more network interfaces of the endpoint.
       * Also known as an interface endpoint.
       */
      override fun networkInterfaces(vararg networkInterfaces: Any): Unit =
          networkInterfaces(networkInterfaces.toList())

      /**
       * @param vpcEndpointId The connection endpoint ID for connecting to Amazon Redshift
       * Serverless.
       */
      override fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
      }

      /**
       * @param vpcId The VPC identifier that the endpoint is associated with.
       */
      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build():
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.VpcEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.VpcEndpointProperty,
    ) : CdkObject(cdkObject), VpcEndpointProperty {
      /**
       * One or more network interfaces of the endpoint.
       *
       * Also known as an interface endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-vpcendpoint.html#cfn-redshiftserverless-workgroup-vpcendpoint-networkinterfaces)
       */
      override fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

      /**
       * The connection endpoint ID for connecting to Amazon Redshift Serverless.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-vpcendpoint.html#cfn-redshiftserverless-workgroup-vpcendpoint-vpcendpointid)
       */
      override fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

      /**
       * The VPC identifier that the endpoint is associated with.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-vpcendpoint.html#cfn-redshiftserverless-workgroup-vpcendpoint-vpcid)
       */
      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.VpcEndpointProperty):
          VpcEndpointProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcEndpointProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcEndpointProperty):
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.VpcEndpointProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.VpcEndpointProperty
    }
  }

  /**
   * The collection of computing resources from which an endpoint is created.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.redshiftserverless.*;
   * WorkgroupProperty workgroupProperty = WorkgroupProperty.builder()
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
   * .publiclyAccessible(false)
   * .securityGroupIds(List.of("securityGroupIds"))
   * .status("status")
   * .subnetIds(List.of("subnetIds"))
   * .workgroupArn("workgroupArn")
   * .workgroupId("workgroupId")
   * .workgroupName("workgroupName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html)
   */
  public interface WorkgroupProperty {
    /**
     * The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-basecapacity)
     */
    public fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

    /**
     * An array of parameters to set for advanced control over a database.
     *
     * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
     * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , and query
     * monitoring metrics that let you define performance boundaries. For more information about query
     * monitoring rules and available metrics, see [Query monitoring metrics for Amazon Redshift
     * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-configparameters)
     */
    public fun configParameters(): Any? = unwrap(this).getConfigParameters()

    /**
     * The creation date of the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-creationdate)
     */
    public fun creationDate(): String? = unwrap(this).getCreationDate()

    /**
     * The endpoint that is created from the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-endpoint)
     */
    public fun endpoint(): Any? = unwrap(this).getEndpoint()

    /**
     * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing,
     * which forces Amazon Redshift Serverless to route traffic through your VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-enhancedvpcrouting)
     */
    public fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

    /**
     * The maximum data-warehouse capacity Amazon Redshift Serverless uses to serve queries.
     *
     * The max capacity is specified in RPUs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-maxcapacity)
     */
    public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    /**
     * The namespace the workgroup is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-namespacename)
     */
    public fun namespaceName(): String? = unwrap(this).getNamespaceName()

    /**
     * A value that specifies whether the workgroup can be accessible from a public network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-publiclyaccessible)
     */
    public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    /**
     * An array of security group IDs to associate with the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * The status of the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-status)
     */
    public fun status(): String? = unwrap(this).getStatus()

    /**
     * An array of subnet IDs the workgroup is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-subnetids)
     */
    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) that links to the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-workgrouparn)
     */
    public fun workgroupArn(): String? = unwrap(this).getWorkgroupArn()

    /**
     * The unique identifier of the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-workgroupid)
     */
    public fun workgroupId(): String? = unwrap(this).getWorkgroupId()

    /**
     * The name of the workgroup.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-workgroupname)
     */
    public fun workgroupName(): String? = unwrap(this).getWorkgroupName()

    /**
     * A builder for [WorkgroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param baseCapacity The base data warehouse capacity of the workgroup in Redshift
       * Processing Units (RPUs).
       */
      public fun baseCapacity(baseCapacity: Number)

      /**
       * @param configParameters An array of parameters to set for advanced control over a database.
       * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
       * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , and query
       * monitoring metrics that let you define performance boundaries. For more information about
       * query monitoring rules and available metrics, see [Query monitoring metrics for Amazon
       * Redshift
       * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
       * .
       */
      public fun configParameters(configParameters: IResolvable)

      /**
       * @param configParameters An array of parameters to set for advanced control over a database.
       * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
       * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , and query
       * monitoring metrics that let you define performance boundaries. For more information about
       * query monitoring rules and available metrics, see [Query monitoring metrics for Amazon
       * Redshift
       * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
       * .
       */
      public fun configParameters(configParameters: List<Any>)

      /**
       * @param configParameters An array of parameters to set for advanced control over a database.
       * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
       * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , and query
       * monitoring metrics that let you define performance boundaries. For more information about
       * query monitoring rules and available metrics, see [Query monitoring metrics for Amazon
       * Redshift
       * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
       * .
       */
      public fun configParameters(vararg configParameters: Any)

      /**
       * @param creationDate The creation date of the workgroup.
       */
      public fun creationDate(creationDate: String)

      /**
       * @param endpoint The endpoint that is created from the workgroup.
       */
      public fun endpoint(endpoint: IResolvable)

      /**
       * @param endpoint The endpoint that is created from the workgroup.
       */
      public fun endpoint(endpoint: EndpointProperty)

      /**
       * @param endpoint The endpoint that is created from the workgroup.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e3a0436ce967cae2579973bb1658315839784ca8a1fc6e5283acc57981b310e")
      public fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit)

      /**
       * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual
       * private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through
       * your VPC.
       */
      public fun enhancedVpcRouting(enhancedVpcRouting: Boolean)

      /**
       * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual
       * private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through
       * your VPC.
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
       * @param publiclyAccessible A value that specifies whether the workgroup can be accessible
       * from a public network.
       */
      public fun publiclyAccessible(publiclyAccessible: Boolean)

      /**
       * @param publiclyAccessible A value that specifies whether the workgroup can be accessible
       * from a public network.
       */
      public fun publiclyAccessible(publiclyAccessible: IResolvable)

      /**
       * @param securityGroupIds An array of security group IDs to associate with the workgroup.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds An array of security group IDs to associate with the workgroup.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param status The status of the workgroup.
       */
      public fun status(status: String)

      /**
       * @param subnetIds An array of subnet IDs the workgroup is associated with.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds An array of subnet IDs the workgroup is associated with.
       */
      public fun subnetIds(vararg subnetIds: String)

      /**
       * @param workgroupArn The Amazon Resource Name (ARN) that links to the workgroup.
       */
      public fun workgroupArn(workgroupArn: String)

      /**
       * @param workgroupId The unique identifier of the workgroup.
       */
      public fun workgroupId(workgroupId: String)

      /**
       * @param workgroupName The name of the workgroup.
       */
      public fun workgroupName(workgroupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.WorkgroupProperty.Builder
          =
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.WorkgroupProperty.builder()

      /**
       * @param baseCapacity The base data warehouse capacity of the workgroup in Redshift
       * Processing Units (RPUs).
       */
      override fun baseCapacity(baseCapacity: Number) {
        cdkBuilder.baseCapacity(baseCapacity)
      }

      /**
       * @param configParameters An array of parameters to set for advanced control over a database.
       * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
       * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , and query
       * monitoring metrics that let you define performance boundaries. For more information about
       * query monitoring rules and available metrics, see [Query monitoring metrics for Amazon
       * Redshift
       * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
       * .
       */
      override fun configParameters(configParameters: IResolvable) {
        cdkBuilder.configParameters(configParameters.let(IResolvable::unwrap))
      }

      /**
       * @param configParameters An array of parameters to set for advanced control over a database.
       * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
       * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , and query
       * monitoring metrics that let you define performance boundaries. For more information about
       * query monitoring rules and available metrics, see [Query monitoring metrics for Amazon
       * Redshift
       * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
       * .
       */
      override fun configParameters(configParameters: List<Any>) {
        cdkBuilder.configParameters(configParameters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param configParameters An array of parameters to set for advanced control over a database.
       * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
       * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , and query
       * monitoring metrics that let you define performance boundaries. For more information about
       * query monitoring rules and available metrics, see [Query monitoring metrics for Amazon
       * Redshift
       * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
       * .
       */
      override fun configParameters(vararg configParameters: Any): Unit =
          configParameters(configParameters.toList())

      /**
       * @param creationDate The creation date of the workgroup.
       */
      override fun creationDate(creationDate: String) {
        cdkBuilder.creationDate(creationDate)
      }

      /**
       * @param endpoint The endpoint that is created from the workgroup.
       */
      override fun endpoint(endpoint: IResolvable) {
        cdkBuilder.endpoint(endpoint.let(IResolvable::unwrap))
      }

      /**
       * @param endpoint The endpoint that is created from the workgroup.
       */
      override fun endpoint(endpoint: EndpointProperty) {
        cdkBuilder.endpoint(endpoint.let(EndpointProperty::unwrap))
      }

      /**
       * @param endpoint The endpoint that is created from the workgroup.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e3a0436ce967cae2579973bb1658315839784ca8a1fc6e5283acc57981b310e")
      override fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit): Unit =
          endpoint(EndpointProperty(endpoint))

      /**
       * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual
       * private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through
       * your VPC.
       */
      override fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
        cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
      }

      /**
       * @param enhancedVpcRouting The value that specifies whether to enable enhanced virtual
       * private cloud (VPC) routing, which forces Amazon Redshift Serverless to route traffic through
       * your VPC.
       */
      override fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
        cdkBuilder.enhancedVpcRouting(enhancedVpcRouting.let(IResolvable::unwrap))
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
       * @param publiclyAccessible A value that specifies whether the workgroup can be accessible
       * from a public network.
       */
      override fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
      }

      /**
       * @param publiclyAccessible A value that specifies whether the workgroup can be accessible
       * from a public network.
       */
      override fun publiclyAccessible(publiclyAccessible: IResolvable) {
        cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
      }

      /**
       * @param securityGroupIds An array of security group IDs to associate with the workgroup.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds An array of security group IDs to associate with the workgroup.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param status The status of the workgroup.
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param subnetIds An array of subnet IDs the workgroup is associated with.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds An array of subnet IDs the workgroup is associated with.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      /**
       * @param workgroupArn The Amazon Resource Name (ARN) that links to the workgroup.
       */
      override fun workgroupArn(workgroupArn: String) {
        cdkBuilder.workgroupArn(workgroupArn)
      }

      /**
       * @param workgroupId The unique identifier of the workgroup.
       */
      override fun workgroupId(workgroupId: String) {
        cdkBuilder.workgroupId(workgroupId)
      }

      /**
       * @param workgroupName The name of the workgroup.
       */
      override fun workgroupName(workgroupName: String) {
        cdkBuilder.workgroupName(workgroupName)
      }

      public fun build():
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.WorkgroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.WorkgroupProperty,
    ) : CdkObject(cdkObject), WorkgroupProperty {
      /**
       * The base data warehouse capacity of the workgroup in Redshift Processing Units (RPUs).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-basecapacity)
       */
      override fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

      /**
       * An array of parameters to set for advanced control over a database.
       *
       * The options are `auto_mv` , `datestyle` , `enable_case_sensitive_identifier` ,
       * `enable_user_activity_logging` , `query_group` , `search_path` , `require_ssl` , and query
       * monitoring metrics that let you define performance boundaries. For more information about
       * query monitoring rules and available metrics, see [Query monitoring metrics for Amazon
       * Redshift
       * Serverless](https://docs.aws.amazon.com/redshift/latest/dg/cm-c-wlm-query-monitoring-rules.html#cm-c-wlm-query-monitoring-metrics-serverless)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-configparameters)
       */
      override fun configParameters(): Any? = unwrap(this).getConfigParameters()

      /**
       * The creation date of the workgroup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-creationdate)
       */
      override fun creationDate(): String? = unwrap(this).getCreationDate()

      /**
       * The endpoint that is created from the workgroup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-endpoint)
       */
      override fun endpoint(): Any? = unwrap(this).getEndpoint()

      /**
       * The value that specifies whether to enable enhanced virtual private cloud (VPC) routing,
       * which forces Amazon Redshift Serverless to route traffic through your VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-enhancedvpcrouting)
       */
      override fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

      /**
       * The maximum data-warehouse capacity Amazon Redshift Serverless uses to serve queries.
       *
       * The max capacity is specified in RPUs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-maxcapacity)
       */
      override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

      /**
       * The namespace the workgroup is associated with.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-namespacename)
       */
      override fun namespaceName(): String? = unwrap(this).getNamespaceName()

      /**
       * A value that specifies whether the workgroup can be accessible from a public network.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-publiclyaccessible)
       */
      override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

      /**
       * An array of security group IDs to associate with the workgroup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * The status of the workgroup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-status)
       */
      override fun status(): String? = unwrap(this).getStatus()

      /**
       * An array of subnet IDs the workgroup is associated with.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

      /**
       * The Amazon Resource Name (ARN) that links to the workgroup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-workgrouparn)
       */
      override fun workgroupArn(): String? = unwrap(this).getWorkgroupArn()

      /**
       * The unique identifier of the workgroup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-workgroupid)
       */
      override fun workgroupId(): String? = unwrap(this).getWorkgroupId()

      /**
       * The name of the workgroup.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshiftserverless-workgroup-workgroup.html#cfn-redshiftserverless-workgroup-workgroup-workgroupname)
       */
      override fun workgroupName(): String? = unwrap(this).getWorkgroupName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkgroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.WorkgroupProperty):
          WorkgroupProperty = CdkObjectWrappers.wrap(cdkObject) as? WorkgroupProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkgroupProperty):
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.WorkgroupProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.WorkgroupProperty
    }
  }
}
