@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

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
 * Creates an Add On instance for the subscription indicated in the request.
 *
 * The resulting Amazon Resource Name (ARN) can be used in a conditional statement for a rule set or
 * traffic policy.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnMailManagerAddonInstance cfnMailManagerAddonInstance =
 * CfnMailManagerAddonInstance.Builder.create(this, "MyCfnMailManagerAddonInstance")
 * .addonSubscriptionId("addonSubscriptionId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddoninstance.html)
 */
public open class CfnMailManagerAddonInstance(
  cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerAddonInstance,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMailManagerAddonInstanceProps,
  ) :
      this(software.amazon.awscdk.services.ses.CfnMailManagerAddonInstance(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMailManagerAddonInstanceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMailManagerAddonInstanceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMailManagerAddonInstanceProps(props)
  )

  /**
   * The subscription ID for the instance.
   */
  public open fun addonSubscriptionId(): String = unwrap(this).getAddonSubscriptionId()

  /**
   * The subscription ID for the instance.
   */
  public open fun addonSubscriptionId(`value`: String) {
    unwrap(this).setAddonSubscriptionId(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the Add On instance.
   */
  public open fun attrAddonInstanceArn(): String = unwrap(this).getAttrAddonInstanceArn()

  /**
   * The unique ID of the Add On instance.
   */
  public open fun attrAddonInstanceId(): String = unwrap(this).getAttrAddonInstanceId()

  /**
   * The name of the Add On for the instance.
   */
  public open fun attrAddonName(): String = unwrap(this).getAttrAddonName()

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
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnMailManagerAddonInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The subscription ID for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddoninstance.html#cfn-ses-mailmanageraddoninstance-addonsubscriptionid)
     * @param addonSubscriptionId The subscription ID for the instance. 
     */
    public fun addonSubscriptionId(addonSubscriptionId: String)

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddoninstance.html#cfn-ses-mailmanageraddoninstance-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddoninstance.html#cfn-ses-mailmanageraddoninstance-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnMailManagerAddonInstance.Builder
        = software.amazon.awscdk.services.ses.CfnMailManagerAddonInstance.Builder.create(scope, id)

    /**
     * The subscription ID for the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddoninstance.html#cfn-ses-mailmanageraddoninstance-addonsubscriptionid)
     * @param addonSubscriptionId The subscription ID for the instance. 
     */
    override fun addonSubscriptionId(addonSubscriptionId: String) {
      cdkBuilder.addonSubscriptionId(addonSubscriptionId)
    }

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddoninstance.html#cfn-ses-mailmanageraddoninstance-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanageraddoninstance.html#cfn-ses-mailmanageraddoninstance-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerAddonInstance =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnMailManagerAddonInstance.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMailManagerAddonInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMailManagerAddonInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerAddonInstance):
        CfnMailManagerAddonInstance = CfnMailManagerAddonInstance(cdkObject)

    internal fun unwrap(wrapped: CfnMailManagerAddonInstance):
        software.amazon.awscdk.services.ses.CfnMailManagerAddonInstance = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.CfnMailManagerAddonInstance
  }
}
