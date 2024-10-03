@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSnapshot`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fsx.*;
 * CfnSnapshotProps cfnSnapshotProps = CfnSnapshotProps.builder()
 * .name("name")
 * .volumeId("volumeId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html)
 */
public interface CfnSnapshotProps {
  /**
   * The name of the snapshot.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html#cfn-fsx-snapshot-name)
   */
  public fun name(): String

  /**
   * A list of `Tag` values, with a maximum of 50 elements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html#cfn-fsx-snapshot-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the volume that the snapshot is of.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html#cfn-fsx-snapshot-volumeid)
   */
  public fun volumeId(): String

  /**
   * A builder for [CfnSnapshotProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the snapshot. 
     */
    public fun name(name: String)

    /**
     * @param tags A list of `Tag` values, with a maximum of 50 elements.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of `Tag` values, with a maximum of 50 elements.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param volumeId The ID of the volume that the snapshot is of. 
     */
    public fun volumeId(volumeId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fsx.CfnSnapshotProps.Builder =
        software.amazon.awscdk.services.fsx.CfnSnapshotProps.builder()

    /**
     * @param name The name of the snapshot. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A list of `Tag` values, with a maximum of 50 elements.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of `Tag` values, with a maximum of 50 elements.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param volumeId The ID of the volume that the snapshot is of. 
     */
    override fun volumeId(volumeId: String) {
      cdkBuilder.volumeId(volumeId)
    }

    public fun build(): software.amazon.awscdk.services.fsx.CfnSnapshotProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.fsx.CfnSnapshotProps,
  ) : CdkObject(cdkObject),
      CfnSnapshotProps {
    /**
     * The name of the snapshot.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html#cfn-fsx-snapshot-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A list of `Tag` values, with a maximum of 50 elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html#cfn-fsx-snapshot-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the volume that the snapshot is of.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-snapshot.html#cfn-fsx-snapshot-volumeid)
     */
    override fun volumeId(): String = unwrap(this).getVolumeId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSnapshotProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnSnapshotProps):
        CfnSnapshotProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSnapshotProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSnapshotProps):
        software.amazon.awscdk.services.fsx.CfnSnapshotProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.fsx.CfnSnapshotProps
  }
}
