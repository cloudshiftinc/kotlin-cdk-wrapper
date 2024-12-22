@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.refactorspaces

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
 * Creates an AWS Migration Hub Refactor Spaces environment.
 *
 * The caller owns the environment resource, and all Refactor Spaces applications, services, and
 * routes created within the environment. They are referred to as the *environment owner* . The
 * environment owner has cross-account visibility and control of Refactor Spaces resources that are
 * added to the environment by other accounts that the environment is shared with.
 *
 * When creating an environment with a
 * [CreateEnvironment:NetworkFabricType](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/APIReference/API_CreateEnvironment.html#migrationhubrefactorspaces-CreateEnvironment-request-NetworkFabricType)
 * of `TRANSIT_GATEWAY` , Refactor Spaces provisions a transit gateway to enable services in VPCs to
 * communicate directly across accounts. If
 * [CreateEnvironment:NetworkFabricType](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/APIReference/API_CreateEnvironment.html#migrationhubrefactorspaces-CreateEnvironment-request-NetworkFabricType)
 * is `NONE` , Refactor Spaces does not create a transit gateway and you must use your network
 * infrastructure to route traffic to services with private URL endpoints.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.refactorspaces.*;
 * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
 * .description("description")
 * .name("name")
 * .networkFabricType("networkFabricType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html)
 */
public open class CfnEnvironment(
  cdkObject: software.amazon.awscdk.services.refactorspaces.CfnEnvironment,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.refactorspaces.CfnEnvironment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentProps,
  ) :
      this(software.amazon.awscdk.services.refactorspaces.CfnEnvironment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEnvironmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEnvironmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEnvironmentProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the environment.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The unique identifier of the environment.
   */
  public open fun attrEnvironmentIdentifier(): String = unwrap(this).getAttrEnvironmentIdentifier()

  /**
   * The ID of the AWS Transit Gateway set up by the environment.
   */
  public open fun attrTransitGatewayId(): String = unwrap(this).getAttrTransitGatewayId()

  /**
   * A description of the environment.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the environment.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The name of the environment.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the environment.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The network fabric type of the environment.
   */
  public open fun networkFabricType(): String? = unwrap(this).getNetworkFabricType()

  /**
   * The network fabric type of the environment.
   */
  public open fun networkFabricType(`value`: String) {
    unwrap(this).setNetworkFabricType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags assigned to the environment.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags assigned to the environment.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags assigned to the environment.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.refactorspaces.CfnEnvironment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-description)
     * @param description A description of the environment. 
     */
    public fun description(description: String)

    /**
     * The name of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-name)
     * @param name The name of the environment. 
     */
    public fun name(name: String)

    /**
     * The network fabric type of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-networkfabrictype)
     * @param networkFabricType The network fabric type of the environment. 
     */
    public fun networkFabricType(networkFabricType: String)

    /**
     * The tags assigned to the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-tags)
     * @param tags The tags assigned to the environment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags assigned to the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-tags)
     * @param tags The tags assigned to the environment. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.refactorspaces.CfnEnvironment.Builder =
        software.amazon.awscdk.services.refactorspaces.CfnEnvironment.Builder.create(scope, id)

    /**
     * A description of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-description)
     * @param description A description of the environment. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-name)
     * @param name The name of the environment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The network fabric type of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-networkfabrictype)
     * @param networkFabricType The network fabric type of the environment. 
     */
    override fun networkFabricType(networkFabricType: String) {
      cdkBuilder.networkFabricType(networkFabricType)
    }

    /**
     * The tags assigned to the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-tags)
     * @param tags The tags assigned to the environment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags assigned to the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-tags)
     * @param tags The tags assigned to the environment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.refactorspaces.CfnEnvironment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.refactorspaces.CfnEnvironment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnEnvironment):
        CfnEnvironment = CfnEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironment):
        software.amazon.awscdk.services.refactorspaces.CfnEnvironment = wrapped.cdkObject as
        software.amazon.awscdk.services.refactorspaces.CfnEnvironment
  }
}
