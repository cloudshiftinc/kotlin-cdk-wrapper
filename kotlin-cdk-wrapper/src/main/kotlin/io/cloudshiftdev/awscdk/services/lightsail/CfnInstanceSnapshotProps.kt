@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnInstanceSnapshot`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
 * CfnInstanceSnapshotProps cfnInstanceSnapshotProps = CfnInstanceSnapshotProps.builder()
 * .instanceName("instanceName")
 * .instanceSnapshotName("instanceSnapshotName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html)
 */
public interface CfnInstanceSnapshotProps {
  /**
   * The name the user gave the instance ( `Amazon_Linux_2023-1` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html#cfn-lightsail-instancesnapshot-instancename)
   */
  public fun instanceName(): String

  /**
   * The name of the snapshot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html#cfn-lightsail-instancesnapshot-instancesnapshotname)
   */
  public fun instanceSnapshotName(): String

  /**
   * The tag keys and optional values for the resource.
   *
   * For more information about tags in Lightsail, see the [Amazon Lightsail Developer
   * Guide](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-tags) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html#cfn-lightsail-instancesnapshot-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnInstanceSnapshotProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceName The name the user gave the instance ( `Amazon_Linux_2023-1` ). 
     */
    public fun instanceName(instanceName: String)

    /**
     * @param instanceSnapshotName The name of the snapshot. 
     */
    public fun instanceSnapshotName(instanceSnapshotName: String)

    /**
     * @param tags The tag keys and optional values for the resource.
     * For more information about tags in Lightsail, see the [Amazon Lightsail Developer
     * Guide](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-tags) .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tag keys and optional values for the resource.
     * For more information about tags in Lightsail, see the [Amazon Lightsail Developer
     * Guide](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-tags) .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lightsail.CfnInstanceSnapshotProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnInstanceSnapshotProps.builder()

    /**
     * @param instanceName The name the user gave the instance ( `Amazon_Linux_2023-1` ). 
     */
    override fun instanceName(instanceName: String) {
      cdkBuilder.instanceName(instanceName)
    }

    /**
     * @param instanceSnapshotName The name of the snapshot. 
     */
    override fun instanceSnapshotName(instanceSnapshotName: String) {
      cdkBuilder.instanceSnapshotName(instanceSnapshotName)
    }

    /**
     * @param tags The tag keys and optional values for the resource.
     * For more information about tags in Lightsail, see the [Amazon Lightsail Developer
     * Guide](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-tags) .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tag keys and optional values for the resource.
     * For more information about tags in Lightsail, see the [Amazon Lightsail Developer
     * Guide](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-tags) .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnInstanceSnapshotProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lightsail.CfnInstanceSnapshotProps,
  ) : CdkObject(cdkObject),
      CfnInstanceSnapshotProps {
    /**
     * The name the user gave the instance ( `Amazon_Linux_2023-1` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html#cfn-lightsail-instancesnapshot-instancename)
     */
    override fun instanceName(): String = unwrap(this).getInstanceName()

    /**
     * The name of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html#cfn-lightsail-instancesnapshot-instancesnapshotname)
     */
    override fun instanceSnapshotName(): String = unwrap(this).getInstanceSnapshotName()

    /**
     * The tag keys and optional values for the resource.
     *
     * For more information about tags in Lightsail, see the [Amazon Lightsail Developer
     * Guide](https://docs.aws.amazon.com/lightsail/latest/userguide/amazon-lightsail-tags) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-instancesnapshot.html#cfn-lightsail-instancesnapshot-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceSnapshotProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnInstanceSnapshotProps):
        CfnInstanceSnapshotProps = CdkObjectWrappers.wrap(cdkObject) as? CfnInstanceSnapshotProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceSnapshotProps):
        software.amazon.awscdk.services.lightsail.CfnInstanceSnapshotProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lightsail.CfnInstanceSnapshotProps
  }
}
