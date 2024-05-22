@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codeconnections

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A resource that is used to connect third-party source providers with services like CodePipeline.
 *
 * Note: A connection created through AWS CloudFormation , the CLI, or the SDK is in `PENDING`
 * status by default. You can make its status `AVAILABLE` by updating the connection in the console.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codeconnections.*;
 * CfnConnection cfnConnection = CfnConnection.Builder.create(this, "MyCfnConnection")
 * .connectionName("connectionName")
 * // the properties below are optional
 * .hostArn("hostArn")
 * .providerType("providerType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeconnections-connection.html)
 */
public open class CfnConnection(
  cdkObject: software.amazon.awscdk.services.codeconnections.CfnConnection,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectionProps,
  ) :
      this(software.amazon.awscdk.services.codeconnections.CfnConnection(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnConnectionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnConnectionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnConnectionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the connection.
   *
   * The ARN is used as the connection reference when the connection is shared between AWS services
   * .
   *
   *
   * The ARN is never reused if the connection is deleted.
   */
  public open fun attrConnectionArn(): String = unwrap(this).getAttrConnectionArn()

  /**
   * The current status of the connection.
   */
  public open fun attrConnectionStatus(): String = unwrap(this).getAttrConnectionStatus()

  /**
   * The identifier of the external provider where your third-party code repository is configured.
   *
   * For Bitbucket, this is the account ID of the owner of the Bitbucket repository.
   */
  public open fun attrOwnerAccountId(): String = unwrap(this).getAttrOwnerAccountId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The name of the connection.
   */
  public open fun connectionName(): String = unwrap(this).getConnectionName()

  /**
   * The name of the connection.
   */
  public open fun connectionName(`value`: String) {
    unwrap(this).setConnectionName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the host associated with the connection.
   */
  public open fun hostArn(): String? = unwrap(this).getHostArn()

  /**
   * The Amazon Resource Name (ARN) of the host associated with the connection.
   */
  public open fun hostArn(`value`: String) {
    unwrap(this).setHostArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the external provider where your third-party code repository is configured.
   */
  public open fun providerType(): String? = unwrap(this).getProviderType()

  /**
   * The name of the external provider where your third-party code repository is configured.
   */
  public open fun providerType(`value`: String) {
    unwrap(this).setProviderType(`value`)
  }

  /**
   * Specifies the tags applied to a connection.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies the tags applied to a connection.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Specifies the tags applied to a connection.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codeconnections.CfnConnection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the connection.
     *
     * Connection names must be unique in an AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeconnections-connection.html#cfn-codeconnections-connection-connectionname)
     * @param connectionName The name of the connection. 
     */
    public fun connectionName(connectionName: String)

    /**
     * The Amazon Resource Name (ARN) of the host associated with the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeconnections-connection.html#cfn-codeconnections-connection-hostarn)
     * @param hostArn The Amazon Resource Name (ARN) of the host associated with the connection. 
     */
    public fun hostArn(hostArn: String)

    /**
     * The name of the external provider where your third-party code repository is configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeconnections-connection.html#cfn-codeconnections-connection-providertype)
     * @param providerType The name of the external provider where your third-party code repository
     * is configured. 
     */
    public fun providerType(providerType: String)

    /**
     * Specifies the tags applied to a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeconnections-connection.html#cfn-codeconnections-connection-tags)
     * @param tags Specifies the tags applied to a connection. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies the tags applied to a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeconnections-connection.html#cfn-codeconnections-connection-tags)
     * @param tags Specifies the tags applied to a connection. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codeconnections.CfnConnection.Builder =
        software.amazon.awscdk.services.codeconnections.CfnConnection.Builder.create(scope, id)

    /**
     * The name of the connection.
     *
     * Connection names must be unique in an AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeconnections-connection.html#cfn-codeconnections-connection-connectionname)
     * @param connectionName The name of the connection. 
     */
    override fun connectionName(connectionName: String) {
      cdkBuilder.connectionName(connectionName)
    }

    /**
     * The Amazon Resource Name (ARN) of the host associated with the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeconnections-connection.html#cfn-codeconnections-connection-hostarn)
     * @param hostArn The Amazon Resource Name (ARN) of the host associated with the connection. 
     */
    override fun hostArn(hostArn: String) {
      cdkBuilder.hostArn(hostArn)
    }

    /**
     * The name of the external provider where your third-party code repository is configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeconnections-connection.html#cfn-codeconnections-connection-providertype)
     * @param providerType The name of the external provider where your third-party code repository
     * is configured. 
     */
    override fun providerType(providerType: String) {
      cdkBuilder.providerType(providerType)
    }

    /**
     * Specifies the tags applied to a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeconnections-connection.html#cfn-codeconnections-connection-tags)
     * @param tags Specifies the tags applied to a connection. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Specifies the tags applied to a connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codeconnections-connection.html#cfn-codeconnections-connection-tags)
     * @param tags Specifies the tags applied to a connection. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codeconnections.CfnConnection =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.codeconnections.CfnConnection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codeconnections.CfnConnection):
        CfnConnection = CfnConnection(cdkObject)

    internal fun unwrap(wrapped: CfnConnection):
        software.amazon.awscdk.services.codeconnections.CfnConnection = wrapped.cdkObject as
        software.amazon.awscdk.services.codeconnections.CfnConnection
  }
}
