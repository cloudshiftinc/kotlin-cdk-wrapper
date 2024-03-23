@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoveryreadiness

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
 * Creates a readiness check in Amazon Route 53 Application Recovery Controller.
 *
 * A readiness check continually monitors a resource set in your application, such as a set of
 * Amazon Aurora instances, that Route 53 ARC is auditing recovery readiness for. The audits run once
 * every minute on every resource that's associated with a readiness check.
 *
 * Every resource type has a set of rules associated with it that Route 53 ARC uses to audit
 * resources for readiness. For more information, see [Readiness rules
 * descriptions](https://docs.aws.amazon.com/r53recovery/latest/dg/recovery-readiness.rules-resources.html)
 * in the Amazon Route 53 Application Recovery Controller Developer Guide.
 *
 * Route 53 ARC Readiness supports us-east-1 and us-west-2 AWS Regions only.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53recoveryreadiness.*;
 * CfnReadinessCheck cfnReadinessCheck = CfnReadinessCheck.Builder.create(this,
 * "MyCfnReadinessCheck")
 * .readinessCheckName("readinessCheckName")
 * .resourceSetName("resourceSetName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html)
 */
public open class CfnReadinessCheck(
  cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReadinessCheckProps,
  ) :
      this(software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnReadinessCheckProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnReadinessCheckProps.Builder.() -> Unit,
  ) : this(scope, id, CfnReadinessCheckProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the readiness check.
   */
  public open fun attrReadinessCheckArn(): String = unwrap(this).getAttrReadinessCheckArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the readiness check to create.
   */
  public open fun readinessCheckName(): String? = unwrap(this).getReadinessCheckName()

  /**
   * The name of the readiness check to create.
   */
  public open fun readinessCheckName(`value`: String) {
    unwrap(this).setReadinessCheckName(`value`)
  }

  /**
   * The name of the resource set to check.
   */
  public open fun resourceSetName(): String? = unwrap(this).getResourceSetName()

  /**
   * The name of the resource set to check.
   */
  public open fun resourceSetName(`value`: String) {
    unwrap(this).setResourceSetName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A collection of tags associated with a resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.route53recoveryreadiness.CfnReadinessCheck].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the readiness check to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-readinesscheckname)
     * @param readinessCheckName The name of the readiness check to create. 
     */
    public fun readinessCheckName(readinessCheckName: String)

    /**
     * The name of the resource set to check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-resourcesetname)
     * @param resourceSetName The name of the resource set to check. 
     */
    public fun resourceSetName(resourceSetName: String)

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck.Builder =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck.Builder.create(scope,
        id)

    /**
     * The name of the readiness check to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-readinesscheckname)
     * @param readinessCheckName The name of the readiness check to create. 
     */
    override fun readinessCheckName(readinessCheckName: String) {
      cdkBuilder.readinessCheckName(readinessCheckName)
    }

    /**
     * The name of the resource set to check.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-resourcesetname)
     * @param resourceSetName The name of the resource set to check. 
     */
    override fun resourceSetName(resourceSetName: String) {
      cdkBuilder.resourceSetName(resourceSetName)
    }

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A collection of tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-readinesscheck.html#cfn-route53recoveryreadiness-readinesscheck-tags)
     * @param tags A collection of tags associated with a resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReadinessCheck {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReadinessCheck(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck):
        CfnReadinessCheck = CfnReadinessCheck(cdkObject)

    internal fun unwrap(wrapped: CfnReadinessCheck):
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck =
        wrapped.cdkObject as
        software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck
  }
}
