@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.identitystore

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnGroupMembershipProps {
  public fun groupId(): String

  public fun identityStoreId(): String

  public fun memberId(): Any

  @CdkDslMarker
  public interface Builder {
    public fun groupId(groupId: String)

    public fun identityStoreId(identityStoreId: String)

    public fun memberId(memberId: IResolvable)

    public fun memberId(memberId: CfnGroupMembership.MemberIdProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa3e7416f49dd106ef3a316c7088dc5389fea36b39fe7170fef8f8f5c32d2000")
    public fun memberId(memberId: CfnGroupMembership.MemberIdProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps.Builder =
        software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps.builder()

    override fun groupId(groupId: String) {
      cdkBuilder.groupId(groupId)
    }

    override fun identityStoreId(identityStoreId: String) {
      cdkBuilder.identityStoreId(identityStoreId)
    }

    override fun memberId(memberId: IResolvable) {
      cdkBuilder.memberId(memberId.let(IResolvable::unwrap))
    }

    override fun memberId(memberId: CfnGroupMembership.MemberIdProperty) {
      cdkBuilder.memberId(memberId.let(CfnGroupMembership.MemberIdProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa3e7416f49dd106ef3a316c7088dc5389fea36b39fe7170fef8f8f5c32d2000")
    override fun memberId(memberId: CfnGroupMembership.MemberIdProperty.Builder.() -> Unit): Unit =
        memberId(CfnGroupMembership.MemberIdProperty(memberId))

    public fun build(): software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps,
  ) : CdkObject(cdkObject), CfnGroupMembershipProps {
    override fun groupId(): String = unwrap(this).getGroupId()

    override fun identityStoreId(): String = unwrap(this).getIdentityStoreId()

    override fun memberId(): Any = unwrap(this).getMemberId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGroupMembershipProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps):
        CfnGroupMembershipProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGroupMembershipProps):
        software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps
  }
}
