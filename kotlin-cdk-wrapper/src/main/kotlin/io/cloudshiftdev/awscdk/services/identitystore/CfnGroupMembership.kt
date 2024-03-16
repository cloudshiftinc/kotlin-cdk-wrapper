@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.identitystore

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Contains the identifiers for a group, a group member, and a `GroupMembership` object in the
 * identity store.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.identitystore.*;
 * CfnGroupMembership cfnGroupMembership = CfnGroupMembership.Builder.create(this,
 * "MyCfnGroupMembership")
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
public open class CfnGroupMembership internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.identitystore.CfnGroupMembership,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The identifier for a `GroupMembership` in the identity store.
   */
  public open fun attrMembershipId(): String = unwrap(this).getAttrMembershipId()

  /**
   * The unique identifier for a group in the identity store.
   */
  public open fun groupId(): String = unwrap(this).getGroupId()

  /**
   * The unique identifier for a group in the identity store.
   */
  public open fun groupId(`value`: String) {
    unwrap(this).setGroupId(`value`)
  }

  /**
   * The globally unique identifier for the identity store.
   */
  public open fun identityStoreId(): String = unwrap(this).getIdentityStoreId()

  /**
   * The globally unique identifier for the identity store.
   */
  public open fun identityStoreId(`value`: String) {
    unwrap(this).setIdentityStoreId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * An object containing the identifier of a group member.
   */
  public open fun memberId(): Any = unwrap(this).getMemberId()

  /**
   * An object containing the identifier of a group member.
   */
  public open fun memberId(`value`: IResolvable) {
    unwrap(this).setMemberId(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object containing the identifier of a group member.
   */
  public open fun memberId(`value`: MemberIdProperty) {
    unwrap(this).setMemberId(`value`.let(MemberIdProperty::unwrap))
  }

  /**
   * An object containing the identifier of a group member.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9295de6d7392ce0c25ee4e715578e5d6cad70f2217ae5f003959a0b5879c05bf")
  public open fun memberId(`value`: MemberIdProperty.Builder.() -> Unit): Unit =
      memberId(MemberIdProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.identitystore.CfnGroupMembership].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier for a group in the identity store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-groupid)
     * @param groupId The unique identifier for a group in the identity store. 
     */
    public fun groupId(groupId: String)

    /**
     * The globally unique identifier for the identity store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-identitystoreid)
     * @param identityStoreId The globally unique identifier for the identity store. 
     */
    public fun identityStoreId(identityStoreId: String)

    /**
     * An object containing the identifier of a group member.
     *
     * Setting `MemberId` 's `UserId` field to a specific User's ID indicates we should consider
     * that User as a group member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-memberid)
     * @param memberId An object containing the identifier of a group member. 
     */
    public fun memberId(memberId: IResolvable)

    /**
     * An object containing the identifier of a group member.
     *
     * Setting `MemberId` 's `UserId` field to a specific User's ID indicates we should consider
     * that User as a group member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-memberid)
     * @param memberId An object containing the identifier of a group member. 
     */
    public fun memberId(memberId: MemberIdProperty)

    /**
     * An object containing the identifier of a group member.
     *
     * Setting `MemberId` 's `UserId` field to a specific User's ID indicates we should consider
     * that User as a group member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-memberid)
     * @param memberId An object containing the identifier of a group member. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a29122fdd8b767b4763624504215576f8c19359375d7c72b5b0b8a8eab753572")
    public fun memberId(memberId: MemberIdProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.identitystore.CfnGroupMembership.Builder
        = software.amazon.awscdk.services.identitystore.CfnGroupMembership.Builder.create(scope, id)

    /**
     * The unique identifier for a group in the identity store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-groupid)
     * @param groupId The unique identifier for a group in the identity store. 
     */
    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    /**
     * The globally unique identifier for the identity store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-identitystoreid)
     * @param identityStoreId The globally unique identifier for the identity store. 
     */
    override fun identityStoreId(identityStoreId: String) {
      cdkBuilder.identityStoreId(identityStoreId)
    }

    /**
     * An object containing the identifier of a group member.
     *
     * Setting `MemberId` 's `UserId` field to a specific User's ID indicates we should consider
     * that User as a group member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-memberid)
     * @param memberId An object containing the identifier of a group member. 
     */
    override fun memberId(memberId: IResolvable) {
      cdkBuilder.memberId(memberId.let(IResolvable::unwrap))
    }

    /**
     * An object containing the identifier of a group member.
     *
     * Setting `MemberId` 's `UserId` field to a specific User's ID indicates we should consider
     * that User as a group member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-memberid)
     * @param memberId An object containing the identifier of a group member. 
     */
    override fun memberId(memberId: MemberIdProperty) {
      cdkBuilder.memberId(memberId.let(MemberIdProperty::unwrap))
    }

    /**
     * An object containing the identifier of a group member.
     *
     * Setting `MemberId` 's `UserId` field to a specific User's ID indicates we should consider
     * that User as a group member.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-identitystore-groupmembership.html#cfn-identitystore-groupmembership-memberid)
     * @param memberId An object containing the identifier of a group member. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a29122fdd8b767b4763624504215576f8c19359375d7c72b5b0b8a8eab753572")
    override fun memberId(memberId: MemberIdProperty.Builder.() -> Unit): Unit =
        memberId(MemberIdProperty(memberId))

    public fun build(): software.amazon.awscdk.services.identitystore.CfnGroupMembership =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.identitystore.CfnGroupMembership.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroupMembership {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroupMembership(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.identitystore.CfnGroupMembership):
        CfnGroupMembership = CfnGroupMembership(cdkObject)

    internal fun unwrap(wrapped: CfnGroupMembership):
        software.amazon.awscdk.services.identitystore.CfnGroupMembership = wrapped.cdkObject
  }

  /**
   * An object that contains the identifier of a group member.
   *
   * Setting the `UserID` field to the specific identifier for a user indicates that the user is a
   * member of the group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.identitystore.*;
   * MemberIdProperty memberIdProperty = MemberIdProperty.builder()
   * .userId("userId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-identitystore-groupmembership-memberid.html)
   */
  public interface MemberIdProperty {
    /**
     * The identifier for a user in the identity store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-identitystore-groupmembership-memberid.html#cfn-identitystore-groupmembership-memberid-userid)
     */
    public fun userId(): String

    /**
     * A builder for [MemberIdProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param userId The identifier for a user in the identity store. 
       */
      public fun userId(userId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.identitystore.CfnGroupMembership.MemberIdProperty.Builder
          =
          software.amazon.awscdk.services.identitystore.CfnGroupMembership.MemberIdProperty.builder()

      /**
       * @param userId The identifier for a user in the identity store. 
       */
      override fun userId(userId: String) {
        cdkBuilder.userId(userId)
      }

      public fun build():
          software.amazon.awscdk.services.identitystore.CfnGroupMembership.MemberIdProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.identitystore.CfnGroupMembership.MemberIdProperty,
    ) : CdkObject(cdkObject), MemberIdProperty {
      /**
       * The identifier for a user in the identity store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-identitystore-groupmembership-memberid.html#cfn-identitystore-groupmembership-memberid-userid)
       */
      override fun userId(): String = unwrap(this).getUserId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MemberIdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.identitystore.CfnGroupMembership.MemberIdProperty):
          MemberIdProperty = CdkObjectWrappers.wrap(cdkObject) as MemberIdProperty

      internal fun unwrap(wrapped: MemberIdProperty):
          software.amazon.awscdk.services.identitystore.CfnGroupMembership.MemberIdProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.identitystore.CfnGroupMembership.MemberIdProperty
    }
  }
}
