@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpointemail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDedicatedIpPool`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpointemail.*;
 * CfnDedicatedIpPoolProps cfnDedicatedIpPoolProps = CfnDedicatedIpPoolProps.builder()
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
public interface CfnDedicatedIpPoolProps {
  /**
   * The name of the dedicated IP pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html#cfn-pinpointemail-dedicatedippool-poolname)
   */
  public fun poolName(): String? = unwrap(this).getPoolName()

  /**
   * An object that defines the tags (keys and values) that you want to associate with the dedicated
   * IP pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html#cfn-pinpointemail-dedicatedippool-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDedicatedIpPoolProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param poolName The name of the dedicated IP pool.
     */
    public fun poolName(poolName: String)

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the dedicated IP pool.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the dedicated IP pool.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps.Builder =
        software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps.builder()

    /**
     * @param poolName The name of the dedicated IP pool.
     */
    override fun poolName(poolName: String) {
      cdkBuilder.poolName(poolName)
    }

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the dedicated IP pool.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An object that defines the tags (keys and values) that you want to associate with
     * the dedicated IP pool.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps,
  ) : CdkObject(cdkObject), CfnDedicatedIpPoolProps {
    /**
     * The name of the dedicated IP pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html#cfn-pinpointemail-dedicatedippool-poolname)
     */
    override fun poolName(): String? = unwrap(this).getPoolName()

    /**
     * An object that defines the tags (keys and values) that you want to associate with the
     * dedicated IP pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpointemail-dedicatedippool.html#cfn-pinpointemail-dedicatedippool-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDedicatedIpPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps):
        CfnDedicatedIpPoolProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDedicatedIpPoolProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDedicatedIpPoolProps):
        software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps
  }
}
