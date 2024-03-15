@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a service network.
 *
 * A service network is a logical boundary for a collection of services. You can associate services
 * and VPCs with a service network.
 *
 * For more information, see [Service
 * networks](https://docs.aws.amazon.com/vpc-lattice/latest/ug/service-networks.html) in the *Amazon
 * VPC Lattice User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnServiceNetwork cfnServiceNetwork = CfnServiceNetwork.Builder.create(this,
 * "MyCfnServiceNetwork")
 * .authType("authType")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html)
 */
public open class CfnServiceNetwork internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetwork,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the service network.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time that the service network was created, specified in ISO-8601 format.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The ID of the service network.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The date and time of the last update, specified in ISO-8601 format.
   */
  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  /**
   * The type of IAM policy.
   */
  public open fun authType(): String? = unwrap(this).getAuthType()

  /**
   * The type of IAM policy.
   */
  public open fun authType(`value`: String) {
    unwrap(this).setAuthType(`value`)
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
   * The name of the service network.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the service network.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the service network.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the service network.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the service network.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.vpclattice.CfnServiceNetwork].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The type of IAM policy.
     *
     * * `NONE` : The resource does not use an IAM policy. This is the default.
     * * `AWS_IAM` : The resource uses an IAM policy. When this type is used, auth is enabled and an
     * auth policy is required.
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-authtype)
     * @param authType The type of IAM policy. 
     */
    public fun authType(authType: String)

    /**
     * The name of the service network.
     *
     * The name must be unique to the account. The valid characters are a-z, 0-9, and hyphens (-).
     * You can't use a hyphen as the first or last character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-name)
     * @param name The name of the service network. 
     */
    public fun name(name: String)

    /**
     * The tags for the service network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-tags)
     * @param tags The tags for the service network. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the service network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-tags)
     * @param tags The tags for the service network. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnServiceNetwork.Builder =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetwork.Builder.create(scope, id)

    /**
     * The type of IAM policy.
     *
     * * `NONE` : The resource does not use an IAM policy. This is the default.
     * * `AWS_IAM` : The resource uses an IAM policy. When this type is used, auth is enabled and an
     * auth policy is required.
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-authtype)
     * @param authType The type of IAM policy. 
     */
    override fun authType(authType: String) {
      cdkBuilder.authType(authType)
    }

    /**
     * The name of the service network.
     *
     * The name must be unique to the account. The valid characters are a-z, 0-9, and hyphens (-).
     * You can't use a hyphen as the first or last character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-name)
     * @param name The name of the service network. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags for the service network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-tags)
     * @param tags The tags for the service network. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the service network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-tags)
     * @param tags The tags for the service network. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnServiceNetwork =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.vpclattice.CfnServiceNetwork.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceNetwork {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceNetwork(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetwork):
        CfnServiceNetwork = CfnServiceNetwork(cdkObject)

    internal fun unwrap(wrapped: CfnServiceNetwork):
        software.amazon.awscdk.services.vpclattice.CfnServiceNetwork = wrapped.cdkObject
  }
}
