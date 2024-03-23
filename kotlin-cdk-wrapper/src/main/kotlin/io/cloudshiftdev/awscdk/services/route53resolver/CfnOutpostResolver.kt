@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53resolver

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a Amazon Route 53 Resolver on an Outpost.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53resolver.*;
 * CfnOutpostResolver cfnOutpostResolver = CfnOutpostResolver.Builder.create(this,
 * "MyCfnOutpostResolver")
 * .name("name")
 * .outpostArn("outpostArn")
 * .preferredInstanceType("preferredInstanceType")
 * // the properties below are optional
 * .instanceCount(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html)
 */
public open class CfnOutpostResolver(
  cdkObject: software.amazon.awscdk.services.route53resolver.CfnOutpostResolver,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOutpostResolverProps,
  ) :
      this(software.amazon.awscdk.services.route53resolver.CfnOutpostResolver(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnOutpostResolverProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOutpostResolverProps.Builder.() -> Unit,
  ) : this(scope, id, CfnOutpostResolverProps(props)
  )

  /**
   * The ARN (Amazon Resource Name) for the Resolver on an Outpost.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time that the Outpost Resolver was created, in Unix time format and Coordinated
   * Universal Time (UTC).
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * A unique string that identifies the request that created the Resolver endpoint.
   *
   * The `CreatorRequestId` allows failed requests to be retried without the risk of running the
   * operation twice.
   */
  public open fun attrCreatorRequestId(): String = unwrap(this).getAttrCreatorRequestId()

  /**
   * The ID of the Resolver on Outpost.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The date and time that the Outpost Resolver was modified, in Unix time format and Coordinated
   * Universal Time (UTC).
   */
  public open fun attrModificationTime(): String = unwrap(this).getAttrModificationTime()

  /**
   * Status of the Resolver.
   *
   * Valid Values: CREATING | OPERATIONAL | UPDATING | DELETING | ACTION_NEEDED | FAILED_CREATION |
   * FAILED_DELETION.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * A detailed description of the Resolver.
   */
  public open fun attrStatusMessage(): String = unwrap(this).getAttrStatusMessage()

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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Amazon EC2 instance count for the Resolver on the Outpost.
   */
  public open fun instanceCount(): Number? = unwrap(this).getInstanceCount()

  /**
   * Amazon EC2 instance count for the Resolver on the Outpost.
   */
  public open fun instanceCount(`value`: Number) {
    unwrap(this).setInstanceCount(`value`)
  }

  /**
   * Name of the Resolver.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Name of the Resolver.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ARN (Amazon Resource Name) for the Outpost.
   */
  public open fun outpostArn(): String = unwrap(this).getOutpostArn()

  /**
   * The ARN (Amazon Resource Name) for the Outpost.
   */
  public open fun outpostArn(`value`: String) {
    unwrap(this).setOutpostArn(`value`)
  }

  /**
   * The Amazon EC2 instance type.
   */
  public open fun preferredInstanceType(): String = unwrap(this).getPreferredInstanceType()

  /**
   * The Amazon EC2 instance type.
   */
  public open fun preferredInstanceType(`value`: String) {
    unwrap(this).setPreferredInstanceType(`value`)
  }

  /**
   * A key value pair that helps you identify a Route 53 Resolver .
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A key value pair that helps you identify a Route 53 Resolver .
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * A key value pair that helps you identify a Route 53 Resolver .
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53resolver.CfnOutpostResolver].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Amazon EC2 instance count for the Resolver on the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-instancecount)
     * @param instanceCount Amazon EC2 instance count for the Resolver on the Outpost. 
     */
    public fun instanceCount(instanceCount: Number)

    /**
     * Name of the Resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-name)
     * @param name Name of the Resolver. 
     */
    public fun name(name: String)

    /**
     * The ARN (Amazon Resource Name) for the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-outpostarn)
     * @param outpostArn The ARN (Amazon Resource Name) for the Outpost. 
     */
    public fun outpostArn(outpostArn: String)

    /**
     * The Amazon EC2 instance type.
     *
     * If you specify this, you must also specify a value for the `OutpostArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-preferredinstancetype)
     * @param preferredInstanceType The Amazon EC2 instance type. 
     */
    public fun preferredInstanceType(preferredInstanceType: String)

    /**
     * A key value pair that helps you identify a Route 53 Resolver .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-tags)
     * @param tags A key value pair that helps you identify a Route 53 Resolver . 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A key value pair that helps you identify a Route 53 Resolver .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-tags)
     * @param tags A key value pair that helps you identify a Route 53 Resolver . 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolver.Builder =
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolver.Builder.create(scope, id)

    /**
     * Amazon EC2 instance count for the Resolver on the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-instancecount)
     * @param instanceCount Amazon EC2 instance count for the Resolver on the Outpost. 
     */
    override fun instanceCount(instanceCount: Number) {
      cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * Name of the Resolver.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-name)
     * @param name Name of the Resolver. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ARN (Amazon Resource Name) for the Outpost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-outpostarn)
     * @param outpostArn The ARN (Amazon Resource Name) for the Outpost. 
     */
    override fun outpostArn(outpostArn: String) {
      cdkBuilder.outpostArn(outpostArn)
    }

    /**
     * The Amazon EC2 instance type.
     *
     * If you specify this, you must also specify a value for the `OutpostArn` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-preferredinstancetype)
     * @param preferredInstanceType The Amazon EC2 instance type. 
     */
    override fun preferredInstanceType(preferredInstanceType: String) {
      cdkBuilder.preferredInstanceType(preferredInstanceType)
    }

    /**
     * A key value pair that helps you identify a Route 53 Resolver .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-tags)
     * @param tags A key value pair that helps you identify a Route 53 Resolver . 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A key value pair that helps you identify a Route 53 Resolver .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-outpostresolver.html#cfn-route53resolver-outpostresolver-tags)
     * @param tags A key value pair that helps you identify a Route 53 Resolver . 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53resolver.CfnOutpostResolver =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolver.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOutpostResolver {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOutpostResolver(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53resolver.CfnOutpostResolver):
        CfnOutpostResolver = CfnOutpostResolver(cdkObject)

    internal fun unwrap(wrapped: CfnOutpostResolver):
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolver = wrapped.cdkObject as
        software.amazon.awscdk.services.route53resolver.CfnOutpostResolver
  }
}
