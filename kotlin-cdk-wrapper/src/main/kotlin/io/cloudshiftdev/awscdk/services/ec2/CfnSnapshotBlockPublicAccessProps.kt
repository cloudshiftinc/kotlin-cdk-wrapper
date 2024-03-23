@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSnapshotBlockPublicAccess`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnSnapshotBlockPublicAccessProps cfnSnapshotBlockPublicAccessProps =
 * CfnSnapshotBlockPublicAccessProps.builder()
 * .state("state")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-snapshotblockpublicaccess.html)
 */
public interface CfnSnapshotBlockPublicAccessProps {
  /**
   * The mode in which to enable block public access for snapshots for the Region.
   *
   * Specify one of the following values:
   *
   * * `block-all-sharing` - Prevents all public sharing of snapshots in the Region. Users in the
   * account will no longer be able to request new public sharing. Additionally, snapshots that are
   * already publicly shared are treated as private and they are no longer publicly available.
   *
   *
   * If you enable block public access for snapshots in `block-all-sharing` mode, it does not change
   * the permissions for snapshots that are already publicly shared. Instead, it prevents these
   * snapshots from be publicly visible and publicly accessible. Therefore, the attributes for these
   * snapshots still indicate that they are publicly shared, even though they are not publicly
   * available.
   *
   *
   * * `block-new-sharing` - Prevents only new public sharing of snapshots in the Region. Users in
   * the account will no longer be able to request new public sharing. However, snapshots that are
   * already publicly shared, remain publicly available.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-snapshotblockpublicaccess.html#cfn-ec2-snapshotblockpublicaccess-state)
   */
  public fun state(): String

  /**
   * A builder for [CfnSnapshotBlockPublicAccessProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param state The mode in which to enable block public access for snapshots for the Region. 
     * Specify one of the following values:
     *
     * * `block-all-sharing` - Prevents all public sharing of snapshots in the Region. Users in the
     * account will no longer be able to request new public sharing. Additionally, snapshots that are
     * already publicly shared are treated as private and they are no longer publicly available.
     *
     *
     * If you enable block public access for snapshots in `block-all-sharing` mode, it does not
     * change the permissions for snapshots that are already publicly shared. Instead, it prevents
     * these snapshots from be publicly visible and publicly accessible. Therefore, the attributes for
     * these snapshots still indicate that they are publicly shared, even though they are not publicly
     * available.
     *
     *
     * * `block-new-sharing` - Prevents only new public sharing of snapshots in the Region. Users in
     * the account will no longer be able to request new public sharing. However, snapshots that are
     * already publicly shared, remain publicly available.
     */
    public fun state(state: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps.Builder =
        software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps.builder()

    /**
     * @param state The mode in which to enable block public access for snapshots for the Region. 
     * Specify one of the following values:
     *
     * * `block-all-sharing` - Prevents all public sharing of snapshots in the Region. Users in the
     * account will no longer be able to request new public sharing. Additionally, snapshots that are
     * already publicly shared are treated as private and they are no longer publicly available.
     *
     *
     * If you enable block public access for snapshots in `block-all-sharing` mode, it does not
     * change the permissions for snapshots that are already publicly shared. Instead, it prevents
     * these snapshots from be publicly visible and publicly accessible. Therefore, the attributes for
     * these snapshots still indicate that they are publicly shared, even though they are not publicly
     * available.
     *
     *
     * * `block-new-sharing` - Prevents only new public sharing of snapshots in the Region. Users in
     * the account will no longer be able to request new public sharing. However, snapshots that are
     * already publicly shared, remain publicly available.
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps,
  ) : CdkObject(cdkObject), CfnSnapshotBlockPublicAccessProps {
    /**
     * The mode in which to enable block public access for snapshots for the Region.
     *
     * Specify one of the following values:
     *
     * * `block-all-sharing` - Prevents all public sharing of snapshots in the Region. Users in the
     * account will no longer be able to request new public sharing. Additionally, snapshots that are
     * already publicly shared are treated as private and they are no longer publicly available.
     *
     *
     * If you enable block public access for snapshots in `block-all-sharing` mode, it does not
     * change the permissions for snapshots that are already publicly shared. Instead, it prevents
     * these snapshots from be publicly visible and publicly accessible. Therefore, the attributes for
     * these snapshots still indicate that they are publicly shared, even though they are not publicly
     * available.
     *
     *
     * * `block-new-sharing` - Prevents only new public sharing of snapshots in the Region. Users in
     * the account will no longer be able to request new public sharing. However, snapshots that are
     * already publicly shared, remain publicly available.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-snapshotblockpublicaccess.html#cfn-ec2-snapshotblockpublicaccess-state)
     */
    override fun state(): String = unwrap(this).getState()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSnapshotBlockPublicAccessProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps):
        CfnSnapshotBlockPublicAccessProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSnapshotBlockPublicAccessProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSnapshotBlockPublicAccessProps):
        software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccessProps
  }
}
