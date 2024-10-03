@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.msk.*;
 * CfnVpcConnection cfnVpcConnection = CfnVpcConnection.Builder.create(this, "MyCfnVpcConnection")
 * .authentication("authentication")
 * .clientSubnets(List.of("clientSubnets"))
 * .securityGroups(List.of("securityGroups"))
 * .targetClusterArn("targetClusterArn")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html)
 */
public open class CfnVpcConnection(
  cdkObject: software.amazon.awscdk.services.msk.CfnVpcConnection,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVpcConnectionProps,
  ) :
      this(software.amazon.awscdk.services.msk.CfnVpcConnection(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVpcConnectionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVpcConnectionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVpcConnectionProps(props)
  )

  /**
   * The ARN of the VPC connection.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The type of private link authentication.
   */
  public open fun authentication(): String = unwrap(this).getAuthentication()

  /**
   * The type of private link authentication.
   */
  public open fun authentication(`value`: String) {
    unwrap(this).setAuthentication(`value`)
  }

  /**
   *
   */
  public open fun clientSubnets(): List<String> = unwrap(this).getClientSubnets()

  /**
   *
   */
  public open fun clientSubnets(`value`: List<String>) {
    unwrap(this).setClientSubnets(`value`)
  }

  /**
   *
   */
  public open fun clientSubnets(vararg `value`: String): Unit = clientSubnets(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   *
   */
  public open fun securityGroups(): List<String> = unwrap(this).getSecurityGroups()

  /**
   *
   */
  public open fun securityGroups(`value`: List<String>) {
    unwrap(this).setSecurityGroups(`value`)
  }

  /**
   *
   */
  public open fun securityGroups(vararg `value`: String): Unit = securityGroups(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A key-value pair to associate with a resource.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * A key-value pair to associate with a resource.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the target cluster.
   */
  public open fun targetClusterArn(): String = unwrap(this).getTargetClusterArn()

  /**
   * The Amazon Resource Name (ARN) of the target cluster.
   */
  public open fun targetClusterArn(`value`: String) {
    unwrap(this).setTargetClusterArn(`value`)
  }

  /**
   *
   */
  public open fun vpcId(): String = unwrap(this).getVpcId()

  /**
   *
   */
  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.msk.CfnVpcConnection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The type of private link authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-authentication)
     * @param authentication The type of private link authentication. 
     */
    public fun authentication(authentication: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-clientsubnets)
     * @param clientSubnets 
     */
    public fun clientSubnets(clientSubnets: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-clientsubnets)
     * @param clientSubnets 
     */
    public fun clientSubnets(vararg clientSubnets: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-securitygroups)
     * @param securityGroups 
     */
    public fun securityGroups(securityGroups: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-securitygroups)
     * @param securityGroups 
     */
    public fun securityGroups(vararg securityGroups: String)

    /**
     * A key-value pair to associate with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-tags)
     * @param tags A key-value pair to associate with a resource. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The Amazon Resource Name (ARN) of the target cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-targetclusterarn)
     * @param targetClusterArn The Amazon Resource Name (ARN) of the target cluster. 
     */
    public fun targetClusterArn(targetClusterArn: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-vpcid)
     * @param vpcId 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnVpcConnection.Builder =
        software.amazon.awscdk.services.msk.CfnVpcConnection.Builder.create(scope, id)

    /**
     * The type of private link authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-authentication)
     * @param authentication The type of private link authentication. 
     */
    override fun authentication(authentication: String) {
      cdkBuilder.authentication(authentication)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-clientsubnets)
     * @param clientSubnets 
     */
    override fun clientSubnets(clientSubnets: List<String>) {
      cdkBuilder.clientSubnets(clientSubnets)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-clientsubnets)
     * @param clientSubnets 
     */
    override fun clientSubnets(vararg clientSubnets: String): Unit =
        clientSubnets(clientSubnets.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-securitygroups)
     * @param securityGroups 
     */
    override fun securityGroups(securityGroups: List<String>) {
      cdkBuilder.securityGroups(securityGroups)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-securitygroups)
     * @param securityGroups 
     */
    override fun securityGroups(vararg securityGroups: String): Unit =
        securityGroups(securityGroups.toList())

    /**
     * A key-value pair to associate with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-tags)
     * @param tags A key-value pair to associate with a resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The Amazon Resource Name (ARN) of the target cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-targetclusterarn)
     * @param targetClusterArn The Amazon Resource Name (ARN) of the target cluster. 
     */
    override fun targetClusterArn(targetClusterArn: String) {
      cdkBuilder.targetClusterArn(targetClusterArn)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-vpcconnection.html#cfn-msk-vpcconnection-vpcid)
     * @param vpcId 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnVpcConnection = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.msk.CfnVpcConnection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVpcConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVpcConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnVpcConnection):
        CfnVpcConnection = CfnVpcConnection(cdkObject)

    internal fun unwrap(wrapped: CfnVpcConnection):
        software.amazon.awscdk.services.msk.CfnVpcConnection = wrapped.cdkObject as
        software.amazon.awscdk.services.msk.CfnVpcConnection
  }
}
