@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a cross-account attachment in AWS Global Accelerator .
 *
 * You create a cross-account attachment to specify the *principals* who have permission to work
 * with *resources* in accelerators in their own account. You specify, in the same attachment, the
 * resources that are shared.
 *
 * A principal can be an AWS account number or the Amazon Resource Name (ARN) for an accelerator.
 * For account numbers that are listed as principals, to work with a resource listed in the attachment,
 * you must sign in to an account specified as a principal. Then, you can work with resources that are
 * listed, with any of your accelerators. If an accelerator ARN is listed in the cross-account
 * attachment as a principal, anyone with permission to make updates to the accelerator can work with
 * resources that are listed in the attachment.
 *
 * Specify each principal and resource separately. To specify two CIDR address pools, list them
 * individually under `Resources` , and so on. For a command line operation, for example, you might use
 * a statement like the following:
 *
 * `"Resources": [{"Cidr": "169.254.60.0/24"},{"Cidr": "169.254.59.0/24"}]`
 *
 * For more information, see [Working with cross-account attachments and resources in AWS Global
 * Accelerator](https://docs.aws.amazon.com/global-accelerator/latest/dg/cross-account-resources.html)
 * in the *AWS Global Accelerator Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
 * CfnCrossAccountAttachment cfnCrossAccountAttachment =
 * CfnCrossAccountAttachment.Builder.create(this, "MyCfnCrossAccountAttachment")
 * .name("name")
 * // the properties below are optional
 * .principals(List.of("principals"))
 * .resources(List.of(ResourceProperty.builder()
 * .cidr("cidr")
 * .endpointId("endpointId")
 * .region("region")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html)
 */
public open class CfnCrossAccountAttachment(
  cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCrossAccountAttachmentProps,
  ) :
      this(software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnCrossAccountAttachmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnCrossAccountAttachmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnCrossAccountAttachmentProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the cross-account attachment.
   */
  public open fun attrAttachmentArn(): String = unwrap(this).getAttrAttachmentArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the cross-account attachment.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the cross-account attachment.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The principals included in the cross-account attachment.
   */
  public open fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

  /**
   * The principals included in the cross-account attachment.
   */
  public open fun principals(`value`: List<String>) {
    unwrap(this).setPrincipals(`value`)
  }

  /**
   * The principals included in the cross-account attachment.
   */
  public open fun principals(vararg `value`: String): Unit = principals(`value`.toList())

  /**
   * The resources included in the cross-account attachment.
   */
  public open fun resources(): Any? = unwrap(this).getResources()

  /**
   * The resources included in the cross-account attachment.
   */
  public open fun resources(`value`: IResolvable) {
    unwrap(this).setResources(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The resources included in the cross-account attachment.
   */
  public open fun resources(`value`: List<Any>) {
    unwrap(this).setResources(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The resources included in the cross-account attachment.
   */
  public open fun resources(vararg `value`: Any): Unit = resources(`value`.toList())

  /**
   * Add tags for a cross-account attachment.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Add tags for a cross-account attachment.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Add tags for a cross-account attachment.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.globalaccelerator.CfnCrossAccountAttachment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the cross-account attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-name)
     * @param name The name of the cross-account attachment. 
     */
    public fun name(name: String)

    /**
     * The principals included in the cross-account attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-principals)
     * @param principals The principals included in the cross-account attachment. 
     */
    public fun principals(principals: List<String>)

    /**
     * The principals included in the cross-account attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-principals)
     * @param principals The principals included in the cross-account attachment. 
     */
    public fun principals(vararg principals: String)

    /**
     * The resources included in the cross-account attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-resources)
     * @param resources The resources included in the cross-account attachment. 
     */
    public fun resources(resources: IResolvable)

    /**
     * The resources included in the cross-account attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-resources)
     * @param resources The resources included in the cross-account attachment. 
     */
    public fun resources(resources: List<Any>)

    /**
     * The resources included in the cross-account attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-resources)
     * @param resources The resources included in the cross-account attachment. 
     */
    public fun resources(vararg resources: Any)

    /**
     * Add tags for a cross-account attachment.
     *
     * For more information, see [Tagging in AWS Global
     * Accelerator](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-tags)
     * @param tags Add tags for a cross-account attachment. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Add tags for a cross-account attachment.
     *
     * For more information, see [Tagging in AWS Global
     * Accelerator](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-tags)
     * @param tags Add tags for a cross-account attachment. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment.Builder =
        software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment.Builder.create(scope,
        id)

    /**
     * The name of the cross-account attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-name)
     * @param name The name of the cross-account attachment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The principals included in the cross-account attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-principals)
     * @param principals The principals included in the cross-account attachment. 
     */
    override fun principals(principals: List<String>) {
      cdkBuilder.principals(principals)
    }

    /**
     * The principals included in the cross-account attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-principals)
     * @param principals The principals included in the cross-account attachment. 
     */
    override fun principals(vararg principals: String): Unit = principals(principals.toList())

    /**
     * The resources included in the cross-account attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-resources)
     * @param resources The resources included in the cross-account attachment. 
     */
    override fun resources(resources: IResolvable) {
      cdkBuilder.resources(resources.let(IResolvable.Companion::unwrap))
    }

    /**
     * The resources included in the cross-account attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-resources)
     * @param resources The resources included in the cross-account attachment. 
     */
    override fun resources(resources: List<Any>) {
      cdkBuilder.resources(resources.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The resources included in the cross-account attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-resources)
     * @param resources The resources included in the cross-account attachment. 
     */
    override fun resources(vararg resources: Any): Unit = resources(resources.toList())

    /**
     * Add tags for a cross-account attachment.
     *
     * For more information, see [Tagging in AWS Global
     * Accelerator](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-tags)
     * @param tags Add tags for a cross-account attachment. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Add tags for a cross-account attachment.
     *
     * For more information, see [Tagging in AWS Global
     * Accelerator](https://docs.aws.amazon.com/global-accelerator/latest/dg/tagging-in-global-accelerator.html)
     * in the *AWS Global Accelerator Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-globalaccelerator-crossaccountattachment.html#cfn-globalaccelerator-crossaccountattachment-tags)
     * @param tags Add tags for a cross-account attachment. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCrossAccountAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCrossAccountAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment):
        CfnCrossAccountAttachment = CfnCrossAccountAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnCrossAccountAttachment):
        software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment =
        wrapped.cdkObject as
        software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment
  }

  /**
   * A resource is one of the following: the ARN for an AWS resource that is supported by AWS Global
   * Accelerator to be added as an endpoint, or a CIDR range that specifies a bring your own IP (BYOIP)
   * address pool.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
   * ResourceProperty resourceProperty = ResourceProperty.builder()
   * .cidr("cidr")
   * .endpointId("endpointId")
   * .region("region")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-crossaccountattachment-resource.html)
   */
  public interface ResourceProperty {
    /**
     * An IP address range, in CIDR format, that is specified as resource.
     *
     * The address must be provisioned and advertised in AWS Global Accelerator by following the
     * bring your own IP address (BYOIP) process for Global Accelerator
     *
     * For more information, see [Bring your own IP addresses
     * (BYOIP)](https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html) in the AWS
     * Global Accelerator Developer Guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-crossaccountattachment-resource.html#cfn-globalaccelerator-crossaccountattachment-resource-cidr)
     */
    public fun cidr(): String? = unwrap(this).getCidr()

    /**
     * The endpoint ID for the endpoint that is specified as a AWS resource.
     *
     * An endpoint ID for the cross-account feature is the ARN of an AWS resource, such as a Network
     * Load Balancer, that Global Accelerator supports as an endpoint for an accelerator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-crossaccountattachment-resource.html#cfn-globalaccelerator-crossaccountattachment-resource-endpointid)
     */
    public fun endpointId(): String? = unwrap(this).getEndpointId()

    /**
     * The AWS Region where a shared endpoint resource is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-crossaccountattachment-resource.html#cfn-globalaccelerator-crossaccountattachment-resource-region)
     */
    public fun region(): String? = unwrap(this).getRegion()

    /**
     * A builder for [ResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidr An IP address range, in CIDR format, that is specified as resource.
       * The address must be provisioned and advertised in AWS Global Accelerator by following the
       * bring your own IP address (BYOIP) process for Global Accelerator
       *
       * For more information, see [Bring your own IP addresses
       * (BYOIP)](https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html) in the AWS
       * Global Accelerator Developer Guide.
       */
      public fun cidr(cidr: String)

      /**
       * @param endpointId The endpoint ID for the endpoint that is specified as a AWS resource.
       * An endpoint ID for the cross-account feature is the ARN of an AWS resource, such as a
       * Network Load Balancer, that Global Accelerator supports as an endpoint for an accelerator.
       */
      public fun endpointId(endpointId: String)

      /**
       * @param region The AWS Region where a shared endpoint resource is located.
       */
      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment.ResourceProperty.Builder
          =
          software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment.ResourceProperty.builder()

      /**
       * @param cidr An IP address range, in CIDR format, that is specified as resource.
       * The address must be provisioned and advertised in AWS Global Accelerator by following the
       * bring your own IP address (BYOIP) process for Global Accelerator
       *
       * For more information, see [Bring your own IP addresses
       * (BYOIP)](https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html) in the AWS
       * Global Accelerator Developer Guide.
       */
      override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      /**
       * @param endpointId The endpoint ID for the endpoint that is specified as a AWS resource.
       * An endpoint ID for the cross-account feature is the ARN of an AWS resource, such as a
       * Network Load Balancer, that Global Accelerator supports as an endpoint for an accelerator.
       */
      override fun endpointId(endpointId: String) {
        cdkBuilder.endpointId(endpointId)
      }

      /**
       * @param region The AWS Region where a shared endpoint resource is located.
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment.ResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment.ResourceProperty,
    ) : CdkObject(cdkObject),
        ResourceProperty {
      /**
       * An IP address range, in CIDR format, that is specified as resource.
       *
       * The address must be provisioned and advertised in AWS Global Accelerator by following the
       * bring your own IP address (BYOIP) process for Global Accelerator
       *
       * For more information, see [Bring your own IP addresses
       * (BYOIP)](https://docs.aws.amazon.com/global-accelerator/latest/dg/using-byoip.html) in the AWS
       * Global Accelerator Developer Guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-crossaccountattachment-resource.html#cfn-globalaccelerator-crossaccountattachment-resource-cidr)
       */
      override fun cidr(): String? = unwrap(this).getCidr()

      /**
       * The endpoint ID for the endpoint that is specified as a AWS resource.
       *
       * An endpoint ID for the cross-account feature is the ARN of an AWS resource, such as a
       * Network Load Balancer, that Global Accelerator supports as an endpoint for an accelerator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-crossaccountattachment-resource.html#cfn-globalaccelerator-crossaccountattachment-resource-endpointid)
       */
      override fun endpointId(): String? = unwrap(this).getEndpointId()

      /**
       * The AWS Region where a shared endpoint resource is located.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-globalaccelerator-crossaccountattachment-resource.html#cfn-globalaccelerator-crossaccountattachment-resource-region)
       */
      override fun region(): String? = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment.ResourceProperty):
          ResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceProperty):
          software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment.ResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.globalaccelerator.CfnCrossAccountAttachment.ResourceProperty
    }
  }
}
