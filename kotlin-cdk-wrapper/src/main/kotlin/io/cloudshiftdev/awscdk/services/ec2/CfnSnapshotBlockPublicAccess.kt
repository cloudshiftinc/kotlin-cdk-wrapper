@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies the state of the *block public access for snapshots* setting for the Region.
 *
 * For more information, see [Block public access for
 * snapshots](https://docs.aws.amazon.com/ebs/latest/userguide/block-public-access-snapshots.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnSnapshotBlockPublicAccess cfnSnapshotBlockPublicAccess =
 * CfnSnapshotBlockPublicAccess.Builder.create(this, "MyCfnSnapshotBlockPublicAccess")
 * .state("state")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-snapshotblockpublicaccess.html)
 */
public open class CfnSnapshotBlockPublicAccess(
  cdkObject: software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSnapshotBlockPublicAccessProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnSnapshotBlockPublicAccessProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSnapshotBlockPublicAccessProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSnapshotBlockPublicAccessProps(props)
  )

  /**
   * `Ref` returns the ID of the AWS account.
   */
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The mode in which to enable block public access for snapshots for the Region.
   */
  public open fun state(): String = unwrap(this).getState()

  /**
   * The mode in which to enable block public access for snapshots for the Region.
   */
  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnSnapshotBlockPublicAccess].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param state The mode in which to enable block public access for snapshots for the Region. 
     */
    public fun state(state: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess.Builder
        = software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess.Builder.create(scope, id)

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
     * @param state The mode in which to enable block public access for snapshots for the Region. 
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSnapshotBlockPublicAccess {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSnapshotBlockPublicAccess(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess):
        CfnSnapshotBlockPublicAccess = CfnSnapshotBlockPublicAccess(cdkObject)

    internal fun unwrap(wrapped: CfnSnapshotBlockPublicAccess):
        software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnSnapshotBlockPublicAccess
  }
}
