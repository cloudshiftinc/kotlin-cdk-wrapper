@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securityhub

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Returns details about the service resource in your account.
 *
 * This API is in private preview and subject to change.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securityhub.*;
 * CfnHubV2 cfnHubV2 = CfnHubV2.Builder.create(this, "MyCfnHubV2")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hubv2.html)
 */
public open class CfnHubV2(
  cdkObject: software.amazon.awscdk.services.securityhub.CfnHubV2,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.securityhub.CfnHubV2(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHubV2Props,
  ) :
      this(software.amazon.awscdk.services.securityhub.CfnHubV2(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnHubV2Props.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnHubV2Props.Builder.() -> Unit,
  ) : this(scope, id, CfnHubV2Props(props)
  )

  /**
   * The ARN of the service resource.
   */
  public open fun attrHubV2Arn(): String = unwrap(this).getAttrHubV2Arn()

  /**
   * The date and time when the service was enabled in the account.
   */
  public open fun attrSubscribedAt(): String = unwrap(this).getAttrSubscribedAt()

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
   * The tags to add to the hub V2 resource when you enable Security Hub.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The tags to add to the hub V2 resource when you enable Security Hub.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.securityhub.CfnHubV2].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The tags to add to the hub V2 resource when you enable Security Hub.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hubv2.html#cfn-securityhub-hubv2-tags)
     * @param tags The tags to add to the hub V2 resource when you enable Security Hub. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.securityhub.CfnHubV2.Builder =
        software.amazon.awscdk.services.securityhub.CfnHubV2.Builder.create(scope, id)

    /**
     * The tags to add to the hub V2 resource when you enable Security Hub.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hubv2.html#cfn-securityhub-hubv2-tags)
     * @param tags The tags to add to the hub V2 resource when you enable Security Hub. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.securityhub.CfnHubV2 = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.securityhub.CfnHubV2.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnHubV2 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnHubV2(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.securityhub.CfnHubV2): CfnHubV2 =
        CfnHubV2(cdkObject)

    internal fun unwrap(wrapped: CfnHubV2): software.amazon.awscdk.services.securityhub.CfnHubV2 =
        wrapped.cdkObject as software.amazon.awscdk.services.securityhub.CfnHubV2
  }
}
