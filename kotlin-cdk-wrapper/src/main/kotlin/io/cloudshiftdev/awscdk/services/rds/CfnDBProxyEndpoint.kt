@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::RDS::DBProxyEndpoint` resource creates or updates a DB proxy endpoint.
 *
 * You can use custom proxy endpoints to access a proxy through a different VPC than the proxy's
 * default VPC.
 *
 * For more information about RDS Proxy, see
 * [AWS::RDS::DBProxy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * CfnDBProxyEndpoint cfnDBProxyEndpoint = CfnDBProxyEndpoint.Builder.create(this,
 * "MyCfnDBProxyEndpoint")
 * .dbProxyEndpointName("dbProxyEndpointName")
 * .dbProxyName("dbProxyName")
 * .vpcSubnetIds(List.of("vpcSubnetIds"))
 * // the properties below are optional
 * .tags(List.of(TagFormatProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetRole("targetRole")
 * .vpcSecurityGroupIds(List.of("vpcSecurityGroupIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html)
 */
public open class CfnDBProxyEndpoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) representing the DB proxy endpoint.
   */
  public open fun attrDbProxyEndpointArn(): String = unwrap(this).getAttrDbProxyEndpointArn()

  /**
   * The custom endpoint for the RDS DB instance or Aurora DB cluster.
   */
  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  /**
   * A value that indicates whether this endpoint is the default endpoint for the associated DB
   * proxy.
   *
   * Default DB proxy endpoints always have read/write capability. Other endpoints that you
   * associate with the DB proxy can be either read/write or read-only.
   */
  public open fun attrIsDefault(): IResolvable =
      unwrap(this).getAttrIsDefault().let(IResolvable::wrap)

  /**
   * The VPC ID of the DB proxy endpoint.
   */
  public open fun attrVpcId(): String = unwrap(this).getAttrVpcId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The name of the DB proxy endpoint to create.
   */
  public open fun dbProxyEndpointName(): String = unwrap(this).getDbProxyEndpointName()

  /**
   * The name of the DB proxy endpoint to create.
   */
  public open fun dbProxyEndpointName(`value`: String) {
    unwrap(this).setDbProxyEndpointName(`value`)
  }

  /**
   * The name of the DB proxy associated with the DB proxy endpoint that you create.
   */
  public open fun dbProxyName(): String = unwrap(this).getDbProxyName()

  /**
   * The name of the DB proxy associated with the DB proxy endpoint that you create.
   */
  public open fun dbProxyName(`value`: String) {
    unwrap(this).setDbProxyName(`value`)
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
   * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
   */
  public open fun tags(): List<TagFormatProperty> =
      unwrap(this).getTags()?.map(TagFormatProperty::wrap) ?: emptyList()

  /**
   * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
   */
  public open fun tags(`value`: List<TagFormatProperty>) {
    unwrap(this).setTags(`value`.map(TagFormatProperty::unwrap))
  }

  /**
   * An optional set of key-value pairs to associate arbitrary data of your choosing with the proxy.
   */
  public open fun tags(vararg `value`: TagFormatProperty): Unit = tags(`value`.toList())

  /**
   * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only
   * operations.
   */
  public open fun targetRole(): String? = unwrap(this).getTargetRole()

  /**
   * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only
   * operations.
   */
  public open fun targetRole(`value`: String) {
    unwrap(this).setTargetRole(`value`)
  }

  /**
   * The VPC security group IDs for the DB proxy endpoint that you create.
   */
  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  /**
   * The VPC security group IDs for the DB proxy endpoint that you create.
   */
  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  /**
   * The VPC security group IDs for the DB proxy endpoint that you create.
   */
  public open fun vpcSecurityGroupIds(vararg `value`: String): Unit =
      vpcSecurityGroupIds(`value`.toList())

  /**
   * The VPC subnet IDs for the DB proxy endpoint that you create.
   */
  public open fun vpcSubnetIds(): List<String> = unwrap(this).getVpcSubnetIds()

  /**
   * The VPC subnet IDs for the DB proxy endpoint that you create.
   */
  public open fun vpcSubnetIds(`value`: List<String>) {
    unwrap(this).setVpcSubnetIds(`value`)
  }

  /**
   * The VPC subnet IDs for the DB proxy endpoint that you create.
   */
  public open fun vpcSubnetIds(vararg `value`: String): Unit = vpcSubnetIds(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.rds.CfnDBProxyEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the DB proxy endpoint to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-dbproxyendpointname)
     * @param dbProxyEndpointName The name of the DB proxy endpoint to create. 
     */
    public fun dbProxyEndpointName(dbProxyEndpointName: String)

    /**
     * The name of the DB proxy associated with the DB proxy endpoint that you create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-dbproxyname)
     * @param dbProxyName The name of the DB proxy associated with the DB proxy endpoint that you
     * create. 
     */
    public fun dbProxyName(dbProxyName: String)

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the
     * proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-tags)
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy. 
     */
    public fun tags(tags: List<TagFormatProperty>)

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the
     * proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-tags)
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy. 
     */
    public fun tags(vararg tags: TagFormatProperty)

    /**
     * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only
     * operations.
     *
     * Valid Values: `READ_WRITE | READ_ONLY`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-targetrole)
     * @param targetRole A value that indicates whether the DB proxy endpoint can be used for
     * read/write or read-only operations. 
     */
    public fun targetRole(targetRole: String)

    /**
     * The VPC security group IDs for the DB proxy endpoint that you create.
     *
     * You can specify a different set of security group IDs than for the original DB proxy. The
     * default is the default security group for the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds The VPC security group IDs for the DB proxy endpoint that you
     * create. 
     */
    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    /**
     * The VPC security group IDs for the DB proxy endpoint that you create.
     *
     * You can specify a different set of security group IDs than for the original DB proxy. The
     * default is the default security group for the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds The VPC security group IDs for the DB proxy endpoint that you
     * create. 
     */
    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)

    /**
     * The VPC subnet IDs for the DB proxy endpoint that you create.
     *
     * You can specify a different set of subnet IDs than for the original DB proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsubnetids)
     * @param vpcSubnetIds The VPC subnet IDs for the DB proxy endpoint that you create. 
     */
    public fun vpcSubnetIds(vpcSubnetIds: List<String>)

    /**
     * The VPC subnet IDs for the DB proxy endpoint that you create.
     *
     * You can specify a different set of subnet IDs than for the original DB proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsubnetids)
     * @param vpcSubnetIds The VPC subnet IDs for the DB proxy endpoint that you create. 
     */
    public fun vpcSubnetIds(vararg vpcSubnetIds: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.Builder =
        software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.Builder.create(scope, id)

    /**
     * The name of the DB proxy endpoint to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-dbproxyendpointname)
     * @param dbProxyEndpointName The name of the DB proxy endpoint to create. 
     */
    override fun dbProxyEndpointName(dbProxyEndpointName: String) {
      cdkBuilder.dbProxyEndpointName(dbProxyEndpointName)
    }

    /**
     * The name of the DB proxy associated with the DB proxy endpoint that you create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-dbproxyname)
     * @param dbProxyName The name of the DB proxy associated with the DB proxy endpoint that you
     * create. 
     */
    override fun dbProxyName(dbProxyName: String) {
      cdkBuilder.dbProxyName(dbProxyName)
    }

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the
     * proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-tags)
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy. 
     */
    override fun tags(tags: List<TagFormatProperty>) {
      cdkBuilder.tags(tags.map(TagFormatProperty::unwrap))
    }

    /**
     * An optional set of key-value pairs to associate arbitrary data of your choosing with the
     * proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-tags)
     * @param tags An optional set of key-value pairs to associate arbitrary data of your choosing
     * with the proxy. 
     */
    override fun tags(vararg tags: TagFormatProperty): Unit = tags(tags.toList())

    /**
     * A value that indicates whether the DB proxy endpoint can be used for read/write or read-only
     * operations.
     *
     * Valid Values: `READ_WRITE | READ_ONLY`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-targetrole)
     * @param targetRole A value that indicates whether the DB proxy endpoint can be used for
     * read/write or read-only operations. 
     */
    override fun targetRole(targetRole: String) {
      cdkBuilder.targetRole(targetRole)
    }

    /**
     * The VPC security group IDs for the DB proxy endpoint that you create.
     *
     * You can specify a different set of security group IDs than for the original DB proxy. The
     * default is the default security group for the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds The VPC security group IDs for the DB proxy endpoint that you
     * create. 
     */
    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    /**
     * The VPC security group IDs for the DB proxy endpoint that you create.
     *
     * You can specify a different set of security group IDs than for the original DB proxy. The
     * default is the default security group for the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsecuritygroupids)
     * @param vpcSecurityGroupIds The VPC security group IDs for the DB proxy endpoint that you
     * create. 
     */
    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    /**
     * The VPC subnet IDs for the DB proxy endpoint that you create.
     *
     * You can specify a different set of subnet IDs than for the original DB proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsubnetids)
     * @param vpcSubnetIds The VPC subnet IDs for the DB proxy endpoint that you create. 
     */
    override fun vpcSubnetIds(vpcSubnetIds: List<String>) {
      cdkBuilder.vpcSubnetIds(vpcSubnetIds)
    }

    /**
     * The VPC subnet IDs for the DB proxy endpoint that you create.
     *
     * You can specify a different set of subnet IDs than for the original DB proxy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxyendpoint.html#cfn-rds-dbproxyendpoint-vpcsubnetids)
     * @param vpcSubnetIds The VPC subnet IDs for the DB proxy endpoint that you create. 
     */
    override fun vpcSubnetIds(vararg vpcSubnetIds: String): Unit =
        vpcSubnetIds(vpcSubnetIds.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBProxyEndpoint = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBProxyEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBProxyEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyEndpoint):
        CfnDBProxyEndpoint = CfnDBProxyEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnDBProxyEndpoint):
        software.amazon.awscdk.services.rds.CfnDBProxyEndpoint = wrapped.cdkObject
  }

  /**
   * Metadata assigned to a DB proxy endpoint consisting of a key-value pair.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.rds.*;
   * TagFormatProperty tagFormatProperty = TagFormatProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxyendpoint-tagformat.html)
   */
  public interface TagFormatProperty {
    /**
     * A value is the optional value of the tag.
     *
     * The string value can be 1-256 Unicode characters in length and can't be prefixed with `aws:`
     * . The string can contain only the set of Unicode letters, digits, white-space, '*', '.', '/',
     * '=', '+', '-' (Java regex: "^([\p{L}\p{Z}\p{N}*.:/=+-]*)$").
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxyendpoint-tagformat.html#cfn-rds-dbproxyendpoint-tagformat-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * Metadata assigned to a DB instance consisting of a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxyendpoint-tagformat.html#cfn-rds-dbproxyendpoint-tagformat-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [TagFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key A value is the optional value of the tag.
       * The string value can be 1-256 Unicode characters in length and can't be prefixed with
       * `aws:` . The string can contain only the set of Unicode letters, digits, white-space, '*',
       * '.', '/', '=', '+', '-' (Java regex: "^([\p{L}\p{Z}\p{N}*.:/=+-]*)$").
       */
      public fun key(key: String)

      /**
       * @param value Metadata assigned to a DB instance consisting of a key-value pair.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty.builder()

      /**
       * @param key A value is the optional value of the tag.
       * The string value can be 1-256 Unicode characters in length and can't be prefixed with
       * `aws:` . The string can contain only the set of Unicode letters, digits, white-space, '*',
       * '.', '/', '=', '+', '-' (Java regex: "^([\p{L}\p{Z}\p{N}*.:/=+-]*)$").
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value Metadata assigned to a DB instance consisting of a key-value pair.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty,
    ) : CdkObject(cdkObject), TagFormatProperty {
      /**
       * A value is the optional value of the tag.
       *
       * The string value can be 1-256 Unicode characters in length and can't be prefixed with
       * `aws:` . The string can contain only the set of Unicode letters, digits, white-space, '*',
       * '.', '/', '=', '+', '-' (Java regex: "^([\p{L}\p{Z}\p{N}*.:/=+-]*)$").
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxyendpoint-tagformat.html#cfn-rds-dbproxyendpoint-tagformat-key)
       */
      override fun key(): String? = unwrap(this).getKey()

      /**
       * Metadata assigned to a DB instance consisting of a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxyendpoint-tagformat.html#cfn-rds-dbproxyendpoint-tagformat-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty):
          TagFormatProperty = CdkObjectWrappers.wrap(cdkObject) as? TagFormatProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagFormatProperty):
          software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBProxyEndpoint.TagFormatProperty
    }
  }
}
