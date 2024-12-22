@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
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
 * .sharingConfig(SharingConfigProperty.builder()
 * .enabled(false)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html)
 */
public open class CfnServiceNetwork(
  cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetwork,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.vpclattice.CfnServiceNetwork(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServiceNetworkProps,
  ) :
      this(software.amazon.awscdk.services.vpclattice.CfnServiceNetwork(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnServiceNetworkProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnServiceNetworkProps.Builder.() -> Unit,
  ) : this(scope, id, CfnServiceNetworkProps(props)
  )

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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
   *
   */
  public open fun sharingConfig(): Any? = unwrap(this).getSharingConfig()

  /**
   *
   */
  public open fun sharingConfig(`value`: IResolvable) {
    unwrap(this).setSharingConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun sharingConfig(`value`: SharingConfigProperty) {
    unwrap(this).setSharingConfig(`value`.let(SharingConfigProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("74345cb30e4856d6f6b732e7122310fbe8f24f8243814618cdc689bd86ae1d61")
  public open fun sharingConfig(`value`: SharingConfigProperty.Builder.() -> Unit): Unit =
      sharingConfig(SharingConfigProperty(`value`))

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
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-sharingconfig)
     * @param sharingConfig 
     */
    public fun sharingConfig(sharingConfig: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-sharingconfig)
     * @param sharingConfig 
     */
    public fun sharingConfig(sharingConfig: SharingConfigProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-sharingconfig)
     * @param sharingConfig 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eeb6c7e9643d32040942dfc3640d1ad3035f1177cd77e90c70c8cdecb99f650e")
    public fun sharingConfig(sharingConfig: SharingConfigProperty.Builder.() -> Unit)

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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-sharingconfig)
     * @param sharingConfig 
     */
    override fun sharingConfig(sharingConfig: IResolvable) {
      cdkBuilder.sharingConfig(sharingConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-sharingconfig)
     * @param sharingConfig 
     */
    override fun sharingConfig(sharingConfig: SharingConfigProperty) {
      cdkBuilder.sharingConfig(sharingConfig.let(SharingConfigProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-sharingconfig)
     * @param sharingConfig 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eeb6c7e9643d32040942dfc3640d1ad3035f1177cd77e90c70c8cdecb99f650e")
    override fun sharingConfig(sharingConfig: SharingConfigProperty.Builder.() -> Unit): Unit =
        sharingConfig(SharingConfigProperty(sharingConfig))

    /**
     * The tags for the service network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-servicenetwork.html#cfn-vpclattice-servicenetwork-tags)
     * @param tags The tags for the service network. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
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
        software.amazon.awscdk.services.vpclattice.CfnServiceNetwork = wrapped.cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnServiceNetwork
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * SharingConfigProperty sharingConfigProperty = SharingConfigProperty.builder()
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-servicenetwork-sharingconfig.html)
   */
  public interface SharingConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-servicenetwork-sharingconfig.html#cfn-vpclattice-servicenetwork-sharingconfig-enabled)
     */
    public fun enabled(): Any

    /**
     * A builder for [SharingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled the value to be set. 
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnServiceNetwork.SharingConfigProperty.Builder
          =
          software.amazon.awscdk.services.vpclattice.CfnServiceNetwork.SharingConfigProperty.builder()

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled the value to be set. 
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnServiceNetwork.SharingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetwork.SharingConfigProperty,
    ) : CdkObject(cdkObject),
        SharingConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-servicenetwork-sharingconfig.html#cfn-vpclattice-servicenetwork-sharingconfig-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SharingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnServiceNetwork.SharingConfigProperty):
          SharingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? SharingConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SharingConfigProperty):
          software.amazon.awscdk.services.vpclattice.CfnServiceNetwork.SharingConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnServiceNetwork.SharingConfigProperty
    }
  }
}
