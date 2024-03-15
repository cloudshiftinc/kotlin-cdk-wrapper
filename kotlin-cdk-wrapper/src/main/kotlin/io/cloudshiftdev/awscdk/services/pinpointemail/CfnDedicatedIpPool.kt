@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpointemail

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
 * A request to create a new dedicated IP pool.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpointemail.*;
 * CfnDedicatedIpPool cfnDedicatedIpPool = CfnDedicatedIpPool.Builder.create(this,
 * "MyCfnDedicatedIpPool")
 * .poolName("poolName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html)
 */
public open class CfnDedicatedIpPool internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

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
   * The name of the dedicated IP pool.
   */
  public open fun poolName(): String? = unwrap(this).getPoolName()

  /**
   * The name of the dedicated IP pool.
   */
  public open fun poolName(`value`: String) {
    unwrap(this).setPoolName(`value`)
  }

  /**
   * An object that defines the tags (keys and values) that you want to associate with the dedicated
   * IP pool.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An object that defines the tags (keys and values) that you want to associate with the dedicated
   * IP pool.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * An object that defines the tags (keys and values) that you want to associate with the dedicated
   * IP pool.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pinpointemail.CfnDedicatedIpPool].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the dedicated IP pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html#cfn-pinpointemail-dedicatedippool-poolname)
     * @param poolName The name of the dedicated IP pool. 
     */
    public fun poolName(poolName: String)

    /**
     * An object that defines the tags (keys and values) that you want to associate with the
     * dedicated IP pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html#cfn-pinpointemail-dedicatedippool-tags)
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the dedicated IP pool. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An object that defines the tags (keys and values) that you want to associate with the
     * dedicated IP pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html#cfn-pinpointemail-dedicatedippool-tags)
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the dedicated IP pool. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool.Builder
        = software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool.Builder.create(scope, id)

    /**
     * The name of the dedicated IP pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html#cfn-pinpointemail-dedicatedippool-poolname)
     * @param poolName The name of the dedicated IP pool. 
     */
    override fun poolName(poolName: String) {
      cdkBuilder.poolName(poolName)
    }

    /**
     * An object that defines the tags (keys and values) that you want to associate with the
     * dedicated IP pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html#cfn-pinpointemail-dedicatedippool-tags)
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the dedicated IP pool. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An object that defines the tags (keys and values) that you want to associate with the
     * dedicated IP pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html#cfn-pinpointemail-dedicatedippool-tags)
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the dedicated IP pool. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDedicatedIpPool {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDedicatedIpPool(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool):
        CfnDedicatedIpPool = CfnDedicatedIpPool(cdkObject)

    internal fun unwrap(wrapped: CfnDedicatedIpPool):
        software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool = wrapped.cdkObject
  }
}
