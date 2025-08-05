@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.identitystore

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnGroupMembership`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.identitystore.*;
 * CfnGroupMembershipProps cfnGroupMembershipProps = CfnGroupMembershipProps.builder()
 * .groupId("groupId")
 * .identityStoreId("identityStoreId")
 * .memberId(MemberIdProperty.builder()
 * .userId("userId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html)
 */
public interface CfnGroupMembershipProps {
  /**
   * The identifier for a group in the identity store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-groupid)
   */
  public fun groupId(): String

  /**
   * The globally unique identifier for the identity store.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-identitystoreid)
   */
  public fun identityStoreId(): String

  /**
   * An object containing the identifier of a group member.
   *
   * Setting the `MemberId` 's `UserId` field to a specific User's ID indicates that user is a
   * member of the group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-memberid)
   */
  public fun memberId(): Any

  /**
   * A builder for [CfnGroupMembershipProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param groupId The identifier for a group in the identity store. 
     */
    public fun groupId(groupId: String)

    /**
     * @param identityStoreId The globally unique identifier for the identity store. 
     */
    public fun identityStoreId(identityStoreId: String)

    /**
     * @param memberId An object containing the identifier of a group member. 
     * Setting the `MemberId` 's `UserId` field to a specific User's ID indicates that user is a
     * member of the group.
     */
    public fun memberId(memberId: IResolvable)

    /**
     * @param memberId An object containing the identifier of a group member. 
     * Setting the `MemberId` 's `UserId` field to a specific User's ID indicates that user is a
     * member of the group.
     */
    public fun memberId(memberId: CfnGroupMembership.MemberIdProperty)

    /**
     * @param memberId An object containing the identifier of a group member. 
     * Setting the `MemberId` 's `UserId` field to a specific User's ID indicates that user is a
     * member of the group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa3e7416f49dd106ef3a316c7088dc5389fea36b39fe7170fef8f8f5c32d2000")
    public fun memberId(memberId: CfnGroupMembership.MemberIdProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps.Builder =
        software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps.builder()

    /**
     * @param groupId The identifier for a group in the identity store. 
     */
    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    /**
     * @param identityStoreId The globally unique identifier for the identity store. 
     */
    override fun identityStoreId(identityStoreId: String) {
      cdkBuilder.identityStoreId(identityStoreId)
    }

    /**
     * @param memberId An object containing the identifier of a group member. 
     * Setting the `MemberId` 's `UserId` field to a specific User's ID indicates that user is a
     * member of the group.
     */
    override fun memberId(memberId: IResolvable) {
      cdkBuilder.memberId(memberId.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param memberId An object containing the identifier of a group member. 
     * Setting the `MemberId` 's `UserId` field to a specific User's ID indicates that user is a
     * member of the group.
     */
    override fun memberId(memberId: CfnGroupMembership.MemberIdProperty) {
      cdkBuilder.memberId(memberId.let(CfnGroupMembership.MemberIdProperty.Companion::unwrap))
    }

    /**
     * @param memberId An object containing the identifier of a group member. 
     * Setting the `MemberId` 's `UserId` field to a specific User's ID indicates that user is a
     * member of the group.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa3e7416f49dd106ef3a316c7088dc5389fea36b39fe7170fef8f8f5c32d2000")
    override fun memberId(memberId: CfnGroupMembership.MemberIdProperty.Builder.() -> Unit): Unit =
        memberId(CfnGroupMembership.MemberIdProperty(memberId))

    public fun build(): software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps,
  ) : CdkObject(cdkObject),
      CfnGroupMembershipProps {
    /**
     * The identifier for a group in the identity store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-groupid)
     */
    override fun groupId(): String = unwrap(this).getGroupId()

    /**
     * The globally unique identifier for the identity store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-identitystoreid)
     */
    override fun identityStoreId(): String = unwrap(this).getIdentityStoreId()

    /**
     * An object containing the identifier of a group member.
     *
     * Setting the `MemberId` 's `UserId` field to a specific User's ID indicates that user is a
     * member of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-memberid)
     */
    override fun memberId(): Any = unwrap(this).getMemberId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupMembershipProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps):
        CfnGroupMembershipProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGroupMembershipProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupMembershipProps):
        software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps
  }
}
